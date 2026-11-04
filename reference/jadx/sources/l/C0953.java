package l;

/* JADX INFO: renamed from: l.֨ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0953 extends AbstractC9901 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f3494;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3168 f3495;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f3496;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0953(C22010 c22010, C3168 c3168, boolean z, AbstractC11781 abstractC11781) {
        super(c22010, EnumC13603.f43206, abstractC11781, "invisible class error");
        this.f3496 = c22010;
        this.f3495 = c3168;
        this.f3494 = z;
        this.f38072 = abstractC11781.f38072;
    }

    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        EnumC13603 enumC13603;
        C22010 c22010 = this.f3496;
        C7312 c7312 = c22010.f71001;
        if (this.f3494) {
            return null;
        }
        AbstractC11781 abstractC11782 = this.f31828;
        EnumC13603 enumC13604 = abstractC11782.f38066;
        EnumC13603 enumC13605 = EnumC13603.f43219;
        C3168 c3168 = this.f3495;
        if (enumC13604 == enumC13605) {
            return c22010.f71000.m45978(enumC22229, c7312.m34514(), interfaceC5075, "package.not.visible", abstractC11782, c22010.m49784(c3168, abstractC11782.m29564()));
        }
        C17007 c17007M49784 = c22010.m49784(c3168, abstractC11782.m29564());
        if (interfaceC5075.mo7192() != null) {
            AbstractC8036 abstractC8036Mo7192 = interfaceC5075.mo7192();
            AbstractC11781 abstractC11783 = abstractC11782;
            while (true) {
                EnumC13603 enumC13606 = abstractC11783.f38066;
                enumC13603 = EnumC13603.f43219;
                if (enumC13606 == enumC13603 || !abstractC8036Mo7192.m21911(EnumC21461.f68485)) {
                    break;
                }
                abstractC11783 = abstractC11783.f38069;
                abstractC8036Mo7192 = ((C23041) abstractC8036Mo7192).f74776;
            }
            if (abstractC11783.f38066 == enumC13603) {
                abstractC8036Mo7192.getClass();
                return c22010.f71000.m45978(enumC22229, c7312.m34514(), abstractC8036Mo7192, "package.not.visible", abstractC11783, c17007M49784);
            }
        }
        return c22010.f71000.m45978(enumC22229, c7312.m34514(), interfaceC5075, "not.def.access.package.cant.access", abstractC11782, abstractC11782.m29564(), c17007M49784);
    }
}
