package l;

/* JADX INFO: renamed from: l.ۛ֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes3.dex */
public final class C6021 implements InterfaceC12789 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17953 f20580;

    public C6021(C17953 c17953) {
        this.f20580 = c17953;
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22024 mo16658(int i, int i2) {
        C17953 c17953 = this.f20580;
        C23921 c23921 = (C23921) c17953.f58811.get(i);
        if (c23921 != null) {
            return c23921;
        }
        if (c17953.f58813) {
            return new C4586();
        }
        C23921 c23922 = new C23921(c17953, c17953.f58802, i);
        c17953.f58811.put(i, c23922);
        return c23922;
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ܳ */
    public final void mo16661() {
        this.f20580.f58813 = true;
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ */
    public final void mo16659(InterfaceC9060 interfaceC9060) {
        this.f20580.f58809 = interfaceC9060;
    }
}
