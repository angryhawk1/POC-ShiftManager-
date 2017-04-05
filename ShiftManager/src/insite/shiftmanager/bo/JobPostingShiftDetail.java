package insite.shiftmanager.bo;

import java.util.Date;

import core.bo.Bo;
import core.service.BoUtils;

/**
 * The Shifts actually selected for the Job Posting.
 * 
 * @author ashaikh
 * 
 */
public class JobPostingShiftDetail extends Bo {

    private String jobPostingId;

    public String getJobPostingId() {
        return jobPostingId;
    }

    public void setJobPostingId(String jobPostingId) {
        this.jobPostingId = jobPostingId;
    }

    private JobPosting jobPosting;

    public JobPosting getJobPosting() {
        if (jobPosting == null) {
            jobPosting = BoUtils.getBo(JobPosting.class, jobPostingId);
        }
        return jobPosting;
    }

    public void setJobPosting(JobPosting jobPosting) {
        this.jobPosting = jobPosting;
        this.jobPostingId = BoUtils.getId(jobPosting);
    }

    private String shiftScheduleId;

    public String getShiftScheduleId() {
        return shiftScheduleId;
    }

    public void setShiftScheduleId(String shiftScheduleId) {
        this.shiftScheduleId = shiftScheduleId;
    }

    private ShiftSchedule shiftSchedule;

    public ShiftSchedule getShiftSchedule() {
        if (shiftSchedule == null) {
            shiftSchedule = BoUtils.getBo(ShiftSchedule.class, shiftScheduleId);
        }
        return shiftSchedule;
    }

    public void setShiftSchedule(ShiftSchedule shiftSchedule) {
        this.shiftSchedule = shiftSchedule;
        this.shiftScheduleId = BoUtils.getId(shiftSchedule);
    }

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String startTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    private String endTime;

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    private int shiftCount;

    public int getShiftCount() {
        return shiftCount;
    }

    public void setShiftCount(int shiftCount) {
        this.shiftCount = shiftCount;
    }

}
