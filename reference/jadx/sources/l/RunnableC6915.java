package l;

import android.content.Context;
import android.content.Intent;
import bin.mt.plugin.api.ui.dialog.DualProgressDialog;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۜۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6915 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22913;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22914;

    public /* synthetic */ RunnableC6915(int i, Object obj) {
        this.f22913 = i;
        this.f22914 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22913) {
            case 0:
                ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673 = (ViewOnLayoutChangeListenerC6673) this.f22914;
                viewOnLayoutChangeListenerC6673.f22254.m39629(49, viewOnLayoutChangeListenerC6673.f22255.getHeight() - viewOnLayoutChangeListenerC6673.m40418(R.id.MT_Protector).getHeight(), true);
                return;
            case 1:
                try {
                    ((InputStream) this.f22914).close();
                    return;
                } catch (IOException | RuntimeException unused) {
                    return;
                }
            case 2:
                C21425.m48738((C21425) this.f22914);
                return;
            case 3:
                C1507.m5362(((C18815) this.f22914).f61139);
                return;
            case 4:
                ((DualProgressDialog) this.f22914).lambda$dismiss$3();
                return;
            case 5:
                DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) this.f22914;
                if (dialogInterfaceC8327.m22434()) {
                    dialogInterfaceC8327.dismiss();
                    return;
                }
                return;
            case 6:
                Context context = (Context) this.f22914;
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
            default:
                ((TextInputLayout) this.f22914).lambda$onGlobalLayout$1();
                return;
        }
    }
}
