package l;

/* JADX INFO: renamed from: l.֫ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1699 extends AbstractC9901 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f5830;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3168 f5831;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f5832;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1699(C22010 c22010, C3168 c3168, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781) {
        super(c22010, EnumC13603.f43206, abstractC11781, "access error");
        this.f5832 = c22010;
        this.f5831 = c3168;
        this.f5830 = abstractC22664;
    }

    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        AbstractC22664 abstractC22665;
        AbstractC11781 abstractC11782 = this.f31828;
        AbstractC19728 abstractC19729 = abstractC11782.f38072;
        C22010 c22010 = this.f5832;
        C15252 c15252 = c22010.f71026;
        C7312 c7312 = c22010.f71001;
        if (abstractC19729 == c15252.f49865 && abstractC11782.f38069 != abstractC22664.f73596) {
            return new C6810(c22010, EnumC13603.f43216).mo3799(enumC22229, interfaceC5075, abstractC11781, abstractC22664, abstractC19728, c14769, c147610);
        }
        long jMo29591 = abstractC11782.mo29591() & 1;
        C3168 c3168 = this.f5831;
        if (jMo29591 == 0 && (c3168 == null || (abstractC22665 = this.f5830) == null || c22010.m49790(c3168, abstractC22665, false))) {
            if ((abstractC11782.mo29591() & 6) != 0) {
                return c22010.f71000.m45978(enumC22229, c7312.m34514(), interfaceC5075, "report.access", abstractC11782, C2417.m8159(abstractC11782.mo29591() & 6), abstractC11782.m29579());
            }
            return c22010.f71000.m45978(enumC22229, c7312.m34514(), interfaceC5075, "not.def.public.cant.access", abstractC11782, abstractC11782.m29579());
        }
        if (abstractC11782.f38069.f38066 == EnumC13603.f43219) {
            return c22010.f71000.m45978(enumC22229, c7312.m34514(), interfaceC5075, "not.def.access.package.cant.access", abstractC11782, abstractC11782.m29579(), c22010.m49784(c3168, abstractC11782.m29564()));
        }
        if (abstractC11782.m29564() != c22010.f71034.f48284) {
            C2920 c2920 = c3168.f10275.f61859;
            C14106 c14106M29564 = abstractC11782.m29564();
            if (c2920 != c14106M29564.f44618 && !c2920.f9554.containsKey(c14106M29564.f44619)) {
                return c22010.f71000.m45978(enumC22229, c7312.m34514(), interfaceC5075, "not.def.access.class.intf.cant.access.reason", abstractC11782, abstractC11782.m29579(), abstractC11782.m29579().m29564(), c22010.m49784(c3168, abstractC11782.m29564()));
            }
        }
        return c22010.f71000.m45978(enumC22229, c7312.m34514(), interfaceC5075, "not.def.access.class.intf.cant.access", abstractC11782, abstractC11782.m29579());
    }
}
