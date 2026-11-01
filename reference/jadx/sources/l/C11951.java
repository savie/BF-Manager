package l;

/* JADX INFO: renamed from: l.ۨ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C11951 extends AbstractC18154 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f40074;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        AbstractC0618 abstractC0618 = c0309.f53222;
        if (abstractC0618 == abstractC23903) {
            return c0309;
        }
        AbstractC16579 abstractC16579 = abstractC23903.f77449;
        C23800 c23800 = this.f40074;
        AbstractC16579 abstractC16579M52423 = c23800.m52423(abstractC0618, abstractC16579);
        if (abstractC16579M52423 != null) {
            C19003 c19003 = new C19003();
            C19003 c19004 = new C19003();
            try {
                c23800.m52387(abstractC16579M52423, c0309, c19003, c19004);
                AbstractC16579 abstractC16579M52371 = c23800.m52371(abstractC23903.f77449, c19003.m43726(), c19004.m43726());
                if (c23800.m52413(abstractC16579M52371, (AbstractC16579) c0309, true)) {
                    C19003 c19005 = new C19003();
                    for (C21825 c21825Mo1943 = abstractC23903.f77449.mo1943(); c21825Mo1943.m48595(); c21825Mo1943 = c21825Mo1943.f70877) {
                        if (abstractC16579M52371.mo1932((AbstractC16579) c21825Mo1943.f70876) && !c0309.mo1932((AbstractC16579) c21825Mo1943.f70876)) {
                            c19005.m43723((AbstractC16579) c21825Mo1943.f70876);
                        }
                    }
                    if (!c19005.m43722()) {
                        return abstractC16579M52371;
                    }
                    if (c0309.mo1936()) {
                        return c23800.m52402(abstractC16579M52371);
                    }
                    C21825 c21825M43726 = c19005.m43726();
                    C19003 c19006 = new C19003();
                    for (C21825 c21825 = c21825M43726; c21825.m48595(); c21825 = c21825.f70877) {
                        C3836 c3836 = c23800.f76937;
                        c19006.m43723(new C0350(c3836.f14275, EnumC15395.UNBOUND, c3836.f14239, (C22929) c21825.f70876));
                    }
                    return c23800.m52371(abstractC16579M52371, c21825M43726, c19006.m43726());
                }
            } catch (C23240 unused) {
                return null;
            }
        }
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4812(C5954 c5954, Object obj) {
        return c5954;
    }

    public C11951(C23800 c23800) {
        this.f40074 = c23800;
    }
}
