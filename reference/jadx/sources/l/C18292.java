package l;

/* JADX INFO: renamed from: l.ᩳ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C18292 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C8042 f58349;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f58350;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f58351;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23232 f58352;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15471 f58353;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f58354;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f58355;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2063 f58356;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public FutureC12075 f58357;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final RunnableC8769 f58358;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6111 f58359;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f58360;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6919 f58361;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f58362;

    /* JADX WARN: Type inference failed for: r2v5, types: [l.ܶ᩷ۖ] */
    public C18292(C20409 c20409, C2063 c2063) {
        this.f58360 = c20409;
        C6111 c6111 = c20409.f66125;
        this.f58359 = c6111;
        C6919 c6919 = c20409.f16887;
        this.f58361 = c6919;
        this.f58354 = c20409.m13346().f53983.mo33986();
        this.f58355 = new FutureC12075();
        this.f58358 = new RunnableC8769(1, this);
        this.f58353 = new InterfaceC10597() { // from class: l.ܶ᩷ۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                this.f50405.m42501();
            }
        };
        this.f58356 = c2063;
        InterfaceC2916 interfaceC2916M17000 = null;
        if (c20409.f66148 == null && c20409.f66124 == null && ((c6919 == null || !c6919.m18540()) && c6111 != null)) {
            interfaceC2916M17000 = c6111.m17000();
        }
        this.f58351 = interfaceC2916M17000;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42501() {
        if (this.f58362 || this.f58355.isDone()) {
            return;
        }
        this.f58362 = true;
        C16737.m39273(new RunnableC5529(1, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42500(Throwable th) {
        FutureC12075 futureC12075 = this.f58355;
        if (futureC12075.isDone()) {
            return;
        }
        m42499();
        futureC12075.m30021(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42499() {
        FutureC12075 futureC12075 = this.f58357;
        if (futureC12075 != null) {
            futureC12075.cancel(false);
        }
        FutureC12075 futureC12076 = this.f58350;
        if (futureC12076 != null) {
            futureC12076.cancel(false);
        }
        C6111 c6111 = this.f58359;
        if (c6111 != null) {
            c6111.m16991(this.f58358);
        }
        C6919 c6919 = this.f58361;
        if (c6919 != null) {
            c6919.m18566(this.f58353);
        }
        C20409 c20409 = this.f58360;
        if (c20409.f66137 == this) {
            c20409.f66137 = null;
        }
    }
}
