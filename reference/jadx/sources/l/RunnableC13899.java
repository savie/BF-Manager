package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.۬ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC13899 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44076;

    public /* synthetic */ RunnableC13899(int i, Object obj) {
        this.f44075 = i;
        this.f44076 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44075) {
            case 0:
                ((InterfaceC14075) this.f44076).cancel();
                break;
            default:
                ((TextView) this.f44076).setVisibility(4);
                break;
        }
    }
}
