package l;

import android.app.PendingIntent;
import android.content.pm.PackageInstaller;

/* JADX INFO: renamed from: l.֡ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0241 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1507;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1508;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1509;

    public /* synthetic */ RunnableC0241(int i, Object obj, Object obj2) {
        this.f1507 = i;
        this.f1509 = obj;
        this.f1508 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1507) {
            case 0:
                ((PackageInstaller.Session) this.f1509).commit(((PendingIntent) this.f1508).getIntentSender());
                break;
            default:
                ((C13903) this.f1509).m33867((String) this.f1508);
                break;
        }
    }
}
