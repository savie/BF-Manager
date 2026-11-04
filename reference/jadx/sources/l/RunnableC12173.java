package l;

import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۨۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12173 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39150;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39151;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f39152;

    public /* synthetic */ RunnableC12173(KeyEvent.Callback callback, int i, int i2) {
        this.f39150 = i2;
        this.f39152 = callback;
        this.f39151 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39150) {
            case 0:
                ((C23740) this.f39152).setItemChecked(this.f39151, true);
                break;
            default:
                ViewOnClickListenerC7793.m21196((ViewOnClickListenerC7793) this.f39152, this.f39151);
                break;
        }
    }
}
