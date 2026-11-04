package l;

/* JADX INFO: renamed from: l.ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19330 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62444;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3518 f62445;

    public /* synthetic */ C19330(InterfaceC3518 interfaceC3518, int i) {
        this.f62444 = i;
        this.f62445 = interfaceC3518;
    }

    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() {
        int i = this.f62444;
        InterfaceC3518 interfaceC3518 = this.f62445;
        switch (i) {
            case 0:
                int i2 = ActivityC5577.f19364;
                ((ActivityC5577) interfaceC3518).reportFullyDrawn();
                return null;
            default:
                return C5010.m15237(interfaceC3518);
        }
    }
}
