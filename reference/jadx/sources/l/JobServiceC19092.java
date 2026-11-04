package l;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.ᩳ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8R3 */
/* JADX INFO: loaded from: classes4.dex */
public final class JobServiceC19092 extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iM4393 = new C1193(extras.getInt("requirements")).m4393(this);
        if (iM4393 == 0) {
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            C7116.m19485(this, new Intent(string).setPackage(string2));
            return false;
        }
        C1896.m6517("Requirements not met: " + iM4393);
        jobFinished(jobParameters, true);
        return false;
    }
}
