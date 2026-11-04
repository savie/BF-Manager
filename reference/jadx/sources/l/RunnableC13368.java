package l;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: l.۫᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DO */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC13368 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42609;

    public /* synthetic */ RunnableC13368(int i, Object obj) {
        this.f42608 = i;
        this.f42609 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f42608;
        Object obj = this.f42609;
        switch (i) {
            case 0:
                Application application = (Application) obj;
                try {
                    application.startActivity((Build.VERSION.SDK_INT >= 26 ? new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + application.getPackageName())) : new Intent("android.settings.SECURITY_SETTINGS")).addFlags(268435456));
                } catch (RuntimeException unused) {
                    return;
                }
                break;
            case 1:
                int i2 = ActivityC5440.f18993;
                ((ActivityC5440) obj).m16263(false);
                break;
            case 2:
                C12765.m31624((C12765) obj);
                break;
            case 3:
                DialogInterfaceOnClickListenerC14300.m34709((C13511) obj);
                break;
            default:
                ((C17695) obj).m41439();
                break;
        }
    }
}
