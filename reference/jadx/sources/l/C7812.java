package l;

/* JADX INFO: renamed from: l.۟ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C7812 extends AbstractC1584 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f26026;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f26027;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f26028;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return abstractC22664;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        C18499 c18499 = new C18499();
        boolean z = false;
        for (AbstractC22664 abstractC22664 : c10510.mo9323()) {
            AbstractC22664 abstractC22665 = (AbstractC22664) abstractC22664.mo9324(this, (Object) null);
            if (abstractC22664 != abstractC22665) {
                z = true;
            }
            c18499.m43089(abstractC22665);
        }
        if (!z) {
            return c10510;
        }
        AbstractC22664 abstractC22666 = c10510.f73596.f38067;
        return this.f26027.m55103(abstractC22666, abstractC22666.mo9323(), c18499.m43093());
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        AbstractC22664 abstractC22664 = (AbstractC22664) c10729.f34074.mo9324(this, (Object) null);
        return c10729.f34074 == abstractC22664 ? c10729 : m21283(abstractC22664, c10729.f34072, c10729.f34073);
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1770(C14018 c14018, Object obj) {
        AbstractC22664 abstractC22664M55132;
        C10729 c10729 = c14018.f44410;
        AbstractC22664 abstractC22664 = c10729.f34074;
        if (abstractC22664.mo9325((AbstractC22664) c14018)) {
            abstractC22664M55132 = this.f26027.m55132(abstractC22664);
        } else {
            abstractC22664M55132 = (AbstractC22664) abstractC22664.mo9324(this, (Object) null);
        }
        return m21283((AbstractC22664) abstractC22664M55132.mo9324(this, (Object) null), c10729.f34072, c10729.f34073);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        AbstractC22664 abstractC22664M55132;
        if (!this.f26028) {
            return c17969;
        }
        if (c17969.mo19992().mo9325((AbstractC22664) c17969)) {
            abstractC22664M55132 = this.f26027.m55132(c17969.mo19992());
        } else {
            abstractC22664M55132 = (AbstractC22664) c17969.mo19992().mo9324(this, (Object) null);
        }
        return m21283(abstractC22664M55132, c17969, EnumC18670.EXTENDS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10729 m21283(AbstractC22664 abstractC22664, C17969 c17969, EnumC18670 enumC18670) {
        C24705 c24705 = this.f26027;
        C14764 c14764 = c24705.f79947;
        int i = C3600.f12305[enumC18670.ordinal()];
        boolean z = this.f26026;
        if (i == 1) {
            if (z) {
                return C24705.m55060(c24705, m21284(abstractC22664), c17969);
            }
            return C24705.m55060(c24705, c14764.f48286, c17969);
        }
        if (i == 2) {
            if (z) {
                return C24705.m55080(c24705, c14764.f48241, c17969);
            }
            return C24705.m55080(c24705, m21284(abstractC22664), c17969);
        }
        if (i == 3) {
            return C24705.m55060(c24705, c14764.f48286, c17969);
        }
        C11972.m30024("Invalid bound kind " + enumC18670);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m21284(AbstractC22664 abstractC22664) {
        C14764 c14764 = this.f26027.f79947;
        while (abstractC22664.m51067(EnumC21172.WILDCARD)) {
            C10729 c10729 = (C10729) abstractC22664;
            EnumC18670 enumC18670 = c10729.f34073;
            boolean z = this.f26026;
            if (z) {
                if (enumC18670 == EnumC18670.EXTENDS) {
                    abstractC22664 = c10729.f34074;
                } else {
                    abstractC22664 = null;
                }
            } else if (enumC18670 == EnumC18670.SUPER) {
                abstractC22664 = c10729.f34074;
            } else {
                abstractC22664 = null;
            }
            if (abstractC22664 == null) {
                abstractC22664 = z ? c14764.f48286 : c14764.f48241;
            }
        }
        return abstractC22664;
    }

    public C7812(C24705 c24705, boolean z, boolean z2) {
        this.f26027 = c24705;
        this.f26026 = z;
        this.f26028 = z2;
    }
}
