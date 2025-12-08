package br.ufsc.ToDo.List.repository;

import br.ufsc.ToDo.List.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
