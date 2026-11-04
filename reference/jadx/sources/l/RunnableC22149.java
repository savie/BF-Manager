package l;

/* JADX INFO: renamed from: l.᩷ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DR */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22149 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10960 f71344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71345;

    public /* synthetic */ RunnableC22149(C10960 c10960, int i) {
        this.f71344 = c10960;
        this.f71345 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10960 c10960 = this.f71344;
        c10960.f34629.f6699.m53210(this.f71345);
        c10960.notifyDataSetChanged();
    }
}
