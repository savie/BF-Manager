package l;

import android.app.PendingIntent;
import android.content.pm.PackageInstaller;

/* JADX INFO: renamed from: l.֨ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1009 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4693;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4695;

    public /* synthetic */ RunnableC1009(int i, Object obj, Object obj2) {
        this.f4694 = i;
        this.f4695 = obj;
        this.f4693 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4694) {
            case 0:
                ((PackageInstaller.Session) this.f4695).commit(((PendingIntent) this.f4693).getIntentSender());
                break;
            case 1:
                ((C14063) this.f4695).m34022((String) this.f4693);
                break;
            default:
                C15601.m37260((C15601) this.f4695, (String) this.f4693);
                break;
        }
    }
}
