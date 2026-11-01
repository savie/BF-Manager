package l;

/* JADX INFO: renamed from: l.ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5611 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7022 f19214;

    public RunnableC5611(C7022 c7022) {
        this.f19214 = c7022;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6129 c6129 = this.f19214.f23605;
        if (c6129 != null) {
            c6129.m17110(true);
            c6129.requestLayout();
        }
    }
}
