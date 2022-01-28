package projectabsensi.absensi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projectabsensi.absensi.models.entity.Attendance;
import projectabsensi.absensi.repository.custom.AttendanceCustomRepository;

import java.util.Date;
import java.util.List;

@Repository
public interface AttendanceRepos extends CrudRepository<Attendance, Long>, AttendanceCustomRepository {

//    List<Attendance> findByDate(Date date);
}
