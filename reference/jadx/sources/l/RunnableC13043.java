package l;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;

/* JADX INFO: renamed from: l.۬ۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13043 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43489;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43490;

    public /* synthetic */ RunnableC13043(int i, Object obj) {
        this.f43489 = i;
        this.f43490 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43489) {
            case 0:
                ((C20409) this.f43490).m46096();
                return;
            case 1:
                C11779.m29416((C11779) this.f43490);
                return;
            case 2:
                ((ServiceC12465) this.f43490).m30954();
                return;
            case 3:
                ((Button) this.f43490).setEnabled(true);
                return;
            default:
                Context context = (Context) this.f43490;
                Intent intent = new Intent();
                intent.setClassName("com.android.settings", "com.android.settings.Settings$OverlaySettingsActivity");
                intent.setFlags(268435456);
                if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
                    context.startActivity(intent);
                    return;
                }
                intent.setClassName("com.qihoo360.mobilesafe", "com.qihoo360.mobilesafe.ui.index.AppEnterActivity");
                if (context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
                    throw new RuntimeException("intent is not available!");
                }
                context.startActivity(intent);
                return;
        }
    }
}
