package l;

/* JADX INFO: renamed from: l.᩹ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23245 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f75319;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC3107 f75320;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75321;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16531 f75322;

    public /* synthetic */ RunnableC23245(ServiceC3107 serviceC3107, C16531 c16531, String str, long j) {
        this.f75320 = serviceC3107;
        this.f75322 = c16531;
        this.f75321 = str;
        this.f75319 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceC3107.m10146(this.f75320, this.f75322, this.f75321, this.f75319);
    }
}
