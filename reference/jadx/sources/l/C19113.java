package l;

/* JADX INFO: renamed from: l.ᩳܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C19113 extends AbstractC8036 implements InterfaceC18560 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC1829 f61853;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23058 f61854;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17836 f61855;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f61856;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14769 f61857;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14106 f61858;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2920 f61859;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC11194 f61860;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C17090 f61861;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C24621 f61862;

    public C19113() {
        throw null;
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo2609(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        return EnumC22621.COMPILATION_UNIT;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C14835 m44238() {
        for (AbstractC8036 abstractC8036 : this.f61857) {
            if (abstractC8036.m21911(EnumC21461.f68532)) {
                return (C14835) abstractC8036;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C10360 m44237() {
        if (this.f61857.isEmpty() || !((AbstractC8036) this.f61857.f48335).m21911(EnumC21461.f68500)) {
            return null;
        }
        return (C10360) this.f61857.f48335;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m44236() {
        C10360 c10360M44237 = m44237();
        if (c10360M44237 != null) {
            return c10360M44237.f32980;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m44239() {
        C18499 c18499 = new C18499();
        for (AbstractC8036 abstractC8036 : this.f61857) {
            if (abstractC8036.m21911(EnumC21461.f68480)) {
                c18499.m43089((C11852) abstractC8036);
            } else if (!abstractC8036.m21911(EnumC21461.f68500) && !abstractC8036.m21911(EnumC21461.f68478)) {
                break;
            }
        }
        return c18499.m43093();
    }

    @Override // l.InterfaceC18560
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC15976 mo43139() {
        return this.f61856;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m44235() {
        C14769 c14769 = this.f61857;
        while (!c14769.isEmpty() && (((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68532) || ((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68500) || ((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68480))) {
            c14769 = c14769.f48336;
        }
        return c14769;
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5882(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68471;
    }
}
