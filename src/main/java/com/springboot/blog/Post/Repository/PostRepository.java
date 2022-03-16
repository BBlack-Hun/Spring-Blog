package com.springboot.blog.Post.Repository;

import com.springboot.blog.Post.VO.ParamVO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class PostRepository implements PostRepositoryImpl{
    @Override
    public <S extends ParamVO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ParamVO> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ParamVO> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<ParamVO> findAll() {
        return null;
    }

    @Override
    public Iterable<ParamVO> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(ParamVO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends ParamVO> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ParamVO> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ParamVO> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ParamVO> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends ParamVO> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends ParamVO> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ParamVO> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ParamVO> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ParamVO> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ParamVO> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ParamVO> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ParamVO, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
