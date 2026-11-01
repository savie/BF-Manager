package l;

/* JADX INFO: renamed from: l.ۧܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11140 extends C0306 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5870 f37790;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11140(C5870 c5870, C5286 c5286) {
        super(c5286);
        this.f37790 = c5870;
    }

    @Override // l.C0306, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1875(C6966 c6966, Object obj) {
        Void r9 = (Void) obj;
        C6200 c6200 = new C6200(c6966.f23414, c6966.f23413, (AbstractC5930) mo1921(c6966.f23408, r9), m1922(r9, c6966.f23411), c6966);
        c6200.f30189 = c6966.f30189;
        return c6200;
    }

    @Override // l.C0306, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8774 mo1875(C6966 c6966, Object obj) {
        Void r9 = (Void) obj;
        C6200 c6200 = new C6200(c6966.f23414, c6966.f23413, (AbstractC5930) mo1921(c6966.f23408, r9), m1922(r9, c6966.f23411), c6966);
        c6200.f30189 = c6966.f30189;
        return c6200;
    }

    @Override // l.C0306, l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C8378 mo1878(C8378 c8378, Void r10) {
        if (C3128.m9473(c8378)) {
            AbstractC5930 abstractC5930 = (AbstractC5930) mo1921(c8378.f29093, r10);
            C21825 c21825M1922 = m1922(r10, c8378.f29096);
            AbstractC5930 abstractC5931 = (AbstractC5930) mo1921(c8378.f29095, r10);
            C21825 c21825M1923 = m1922(r10, c8378.f29099);
            C5286 c5286 = this.f37790.f20045;
            c5286.f18294 = c8378.f30189;
            return c5286.m14600(abstractC5930, c21825M1922, abstractC5931, c21825M1923, (C8753) null, c8378.f29098 != null || c8378.m22005());
        }
        return super.mo1878(c8378, (Object) r10);
    }
}
