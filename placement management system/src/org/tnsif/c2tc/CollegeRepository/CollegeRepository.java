package org.tnsif.c2tc.CollegeRepository;

public interface CollegeRepository {

}
package org.tnsif.c2tc.College.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.tnsif.c2tc.College.Repository.springboot.model.College;

@Repository
public interface CollegeRepository extends JpaRepository<College>{
	
}