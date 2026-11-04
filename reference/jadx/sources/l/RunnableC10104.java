package l;

/* JADX INFO: renamed from: l.ۢۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10104 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24849 f32367;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f32368;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32369;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21865 f32370;

    public /* synthetic */ RunnableC10104(RunnableC19055 runnableC19055, InterfaceC21865 interfaceC21865, Object obj, C24849 c24849) {
        this.f32368 = runnableC19055;
        this.f32370 = interfaceC21865;
        this.f32369 = obj;
        this.f32367 = c24849;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f32368;
        if (runnable != null) {
            runnable.run();
        }
        final C24849 c24849 = this.f32367;
        final Object obj = this.f32369;
        Runnable runnable2 = new Runnable() { // from class: l.֨ۨ۫
            @Override // java.lang.Runnable
            public final void run() {
                C12168.m30421(c24849, obj);
            }
        };
        ((C20373) this.f32370).getClass();
        C5261.m15835(obj, 120000L, runnable2);
    }
}
