package l;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.֨ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8R3 */
/* JADX INFO: loaded from: classes2.dex */
public final class JobServiceC0892 extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iM10881 = new C3714(extras.getInt("requirements")).m10881(this);
        if (iM10881 == 0) {
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            C17983.m41838(this, new Intent(string).setPackage(string2));
            return false;
        }
        C0303.m1848("Requirements not met: " + iM10881);
        jobFinished(jobParameters, true);
        return false;
    }
}
