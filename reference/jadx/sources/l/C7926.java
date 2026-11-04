package l;

/* JADX INFO: renamed from: l.۟ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C7926 extends AbstractC19969 implements InterfaceC21544 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4395 f26341;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14769 f26342;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14769 f26343;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14769 f26344;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C24550 f26345;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC19728 f26346;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14769 f26347;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f26348;

    public C7926() {
        throw null;
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo1505(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        long j = this.f26341.f15825;
        if ((8192 & j) != 0) {
            return EnumC22621.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC22621.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC22621.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC22621.RECORD;
        }
        return EnumC22621.CLASS;
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5858(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68501;
    }
}
