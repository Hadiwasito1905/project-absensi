package projectabsensi.absensi.repository.custom;

import org.springframework.stereotype.Repository;
import projectabsensi.absensi.models.entity.Attendance;

import java.util.List;

@Repository
public class AttendanceCustomRepositoryImpl implements AttendanceCustomRepository {

    public List<Attendance> getAllByFilter() {
        // do something custom query
        return null;
    }

}
