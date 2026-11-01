package l;

/* JADX INFO: renamed from: l.ۖۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2503 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9914;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9915;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9916;

    public /* synthetic */ RunnableC2503(int i, Object obj, Object obj2) {
        this.f9915 = i;
        this.f9916 = obj;
        this.f9914 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9915) {
            case 0:
                InterfaceC16261 interfaceC16261 = (InterfaceC16261) this.f9916;
                C20494 c20494 = (C20494) this.f9914;
                interfaceC16261.mo15791(c20494.f66457, c20494.f66458);
                interfaceC16261.mo15794();
                break;
            case 1:
                C13710.m33416((C13710) this.f9916, this.f9914);
                break;
            default:
                C16943.m39663((C16943) this.f9916, (AbstractC10444) this.f9914);
                break;
        }
    }
}
