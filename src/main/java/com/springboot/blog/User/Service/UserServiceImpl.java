package com.springboot.blog.User.Service;

import com.springboot.blog.User.Repository.UserRepository;
import com.springboot.blog.User.Vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    private  final static String USER_NOT_FOUND = "user with email %s not found";
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(()->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND, email)));
    }

    @Override
    public String register(UserVO userVO) {
        System.out.println("test입니다.");
        return "is Work";
    }

}
