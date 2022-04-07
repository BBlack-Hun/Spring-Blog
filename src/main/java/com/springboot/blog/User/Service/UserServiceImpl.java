package com.springboot.blog.User.Service;

import com.springboot.blog.User.Repository.TokenRepository;
import com.springboot.blog.User.Repository.UserRepository;
import com.springboot.blog.User.Vo.UserTokenVO;
import com.springboot.blog.User.Vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService, Predicate<String> {

    private final static String USER_NOT_FOUND = "user with email %s not found";
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND, email)));
    }

    @Override
    public String signUpUser(UserVO userVO) {
        boolean userExists = userRepository
                .findByEmail(userVO.getEmail())
                .isPresent();

        if (userExists) {
            throw new IllegalStateException("email already taken");
        }

        String encodePassword = bCryptPasswordEncoder
                .encode(userVO.getPassword());


        userVO.setPassword(encodePassword);

        userRepository.save(userVO);

        String token = UUID.randomUUID().toString();
        UserTokenVO userTokenVO = new UserTokenVO(
                token,
                userVO
        );

        saveToken(userTokenVO);

        // TODO: SEND EMAIL

        return token;
    }

    @Override
    public boolean test(String s) {
        // TODO: Regex to validate email
        return true;
    }

    @Override
    public String register(UserVO userVO) {
        return "is Work";
    }

    @Override
    public void saveToken(UserTokenVO userTokenVO) {
        tokenRepository.save(userTokenVO);
    }

    @Override
    public Optional<UserTokenVO> getToken(String token) {

        return tokenRepository.findByToken(token);
    }

    @Override
    public int setConfirmedAt(String token) {
        return tokenRepository.updateConfirmedAt(
                token, LocalDateTime.now()
        );
    }


}
