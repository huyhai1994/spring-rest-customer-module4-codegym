package vn.codegym.service;

import java.util.Optional;
/*TODO: - Tạo interface IGeneralService chứa các phương thức chung của model:*/
public interface IGeneralService<E> {
    Iterable<E> findAll();

    Optional<E> findById(Long id);

    E save(E e);

    void remove(Long id);
}
