package l;

/* JADX INFO: renamed from: l.᩺۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C24292 extends AbstractC20344 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18565 f78628;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f78629;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24292(C22010 c22010, AbstractC19728 abstractC19728, C10510 c10510, C14769 c14769, C14769 c147610, C18565 c18565) {
        super(c22010, abstractC19728, c10510, c14769, c147610);
        this.f78629 = c22010;
        this.f78628 = c18565;
    }

    @Override // l.AbstractC20344
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC11781 mo11152(C3168 c3168, EnumC20234 enumC20234) {
        AbstractC22664 abstractC22664 = this.f27563;
        enumC20234.m46506();
        return C22010.m49749(this.f78629, this.f78628, c3168, abstractC22664, this.f27559, this.f27561, enumC20234.m46507());
    }

    @Override // l.AbstractC20344, l.AbstractC8410
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo1198(C3168 c3168, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC11781 abstractC11782) {
        if (!abstractC11782.f38066.m33353()) {
            return abstractC11782;
        }
        EnumC13603 enumC13603 = abstractC11782.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43202;
        if (enumC13603 != enumC13604 && enumC13603 != EnumC13603.f43212) {
            return super.mo1198(c3168, interfaceC5075, abstractC11781, abstractC11782);
        }
        if (enumC13603 == enumC13604) {
        }
        C22010 c22010 = this.f78629;
        C6174 c6174 = new C6174(c22010, abstractC11782, c22010.f71022);
        AbstractC22664 abstractC22664 = this.f27563;
        AbstractC19728 abstractC19728 = c22010.f71026.f49865;
        AbstractC11781 abstractC11781M49778 = c22010.m49778((AbstractC11781) c6174, interfaceC5075, (AbstractC11781) abstractC22664.f73596, abstractC22664, abstractC19728, true, this.f27559, this.f27561, (InterfaceC9155) c22010.f71019);
        ((C7768) c3168.f10272).f25570 = c22010.f71022.f40879;
        return abstractC11781M49778;
    }
}
