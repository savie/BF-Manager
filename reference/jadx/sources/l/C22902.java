package l;

import android.view.KeyEvent;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: l.᩸ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22902 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74389;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f74390;

    public /* synthetic */ C22902(KeyEvent.Callback callback, int i) {
        this.f74389 = i;
        this.f74390 = callback;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        int i = this.f74389;
        KeyEvent.Callback callback = this.f74390;
        switch (i) {
            case 0:
                ProgressBar progressBar = (ProgressBar) callback;
                int i2 = ((Boolean) obj).booleanValue() ? 0 : 8;
                if (progressBar.getVisibility() != i2) {
                    progressBar.setVisibility(i2);
                }
                break;
            default:
                ActivityC11563 activityC11563 = (ActivityC11563) callback;
                int i3 = ActivityC11563.f36350;
                if (!((Boolean) obj).booleanValue()) {
                    activityC11563.finish();
                }
                break;
        }
    }
}
