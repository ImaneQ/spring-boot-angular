package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import tech.getarrays.employeemanager.model.*;

import java.util.*;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
