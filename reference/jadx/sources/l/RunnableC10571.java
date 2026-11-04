package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10571 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33586;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33587;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33588;

    public /* synthetic */ RunnableC10571(int i, Object obj, Object obj2) {
        this.f33586 = i;
        this.f33588 = obj;
        this.f33587 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33586) {
            case 0:
                ((TextView) this.f33588).setText((String) this.f33587);
                break;
            case 1:
                C22713.m51205((C22713) this.f33588, (Exception) this.f33587);
                break;
            default:
                C23582.m52785((C23582) this.f33588, (InterfaceC19106) this.f33587);
                break;
        }
    }
}
