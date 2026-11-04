package l;

/* JADX INFO: renamed from: l.ۘۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public class C3936 extends AbstractC2335 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f13430;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C12775 f13431;

    @Override // l.AbstractC2335, l.AbstractC11781
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo7873() {
        return true;
    }

    @Override // l.AbstractC2335, l.AbstractC11781
    public final String toString() {
        return this.f7553;
    }

    public C3936(C22010 c22010, C12775 c12775) {
        this(c22010, EnumC13603.f43202, "inapplicable symbol error", c12775);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3936(C22010 c22010, EnumC13603 enumC13603, String str, C12775 c12775) {
        super(c22010, enumC13603, str);
        this.f13430 = c22010;
        this.f13431 = c12775;
    }

    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        C17007 c17007M52133;
        C22010 c22010 = this.f13430;
        C15252 c15252 = c22010.f71026;
        C7312 c7312 = c22010.f71001;
        if (abstractC19728 == c15252.f49822) {
            return null;
        }
        C5558 c5558Mo12637 = mo12637();
        if (c22010.f71024 && (c17007M52133 = C23218.m52133(c22010.f71000, interfaceC5075, c7312.m34514(), enumC22229, (C17007) c5558Mo12637.f19301)) != null) {
            return c17007M52133;
        }
        AbstractC11781 abstractC11781Mo16954 = ((AbstractC11781) c5558Mo12637.f19300).mo16954(abstractC22664, c22010.f71021);
        C19991 c19991 = c22010.f71000;
        C23393 c23393M34514 = c7312.m34514();
        EnumC4960 enumC4960M27726 = C10925.m27726(abstractC11781Mo16954);
        AbstractC19728 abstractC19729 = abstractC11781Mo16954.f38072;
        if (abstractC19729 == c22010.f71026.f49865) {
            abstractC19729 = abstractC11781Mo16954.f38069.f38072;
        }
        return c19991.m45978(enumC22229, c23393M34514, interfaceC5075, "cant.apply.symbol", enumC4960M27726, abstractC19729, c22010.m49759(abstractC11781Mo16954.f38067.mo50621()), c22010.m49759(c14769), C10925.m27726(abstractC11781Mo16954.f38069), abstractC11781Mo16954.f38069.f38067, c5558Mo12637.f19301);
    }

    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo7872(AbstractC19728 abstractC19728, AbstractC22970 abstractC22970) {
        C5558 c5558Mo12637 = mo12637();
        C22010 c22010 = this.f13430;
        C24705 c24705 = c22010.f71021;
        AbstractC22664 abstractC22664 = (c5558Mo12637 != null ? (AbstractC11781) c5558Mo12637.f19300 : c22010.f71034.f48237).f38067;
        c24705.getClass();
        AbstractC22970 abstractC22971 = C24705.m55061(abstractC19728, abstractC22970, abstractC22664).f73596;
        if (c5558Mo12637 != null) {
            C4742 c4742 = c22010.f71004;
            AbstractC11781 abstractC11781 = (AbstractC11781) c5558Mo12637.f19300;
            C17007 c17007 = (C17007) c5558Mo12637.f19301;
            c4742.getClass();
            C14769 c14769Of = C14769.of((Object) c17007);
            while (c14769Of.m35550()) {
                C17007 c17008 = (C17007) c14769Of.f48335;
                c14769Of = c14769Of.f48336;
                String strMo32405 = c17008.mo32405();
                strMo32405.getClass();
                switch (strMo32405) {
                    case "compiler.misc.infer.arg.length.mismatch":
                    case "compiler.misc.missing.ret.val":
                    case "compiler.misc.unexpected.ret.val":
                    case "compiler.misc.arg.length.mismatch":
                        abstractC22971.f38067 = new C13733((C12748) abstractC22971.f38067, abstractC11781);
                        abstractC22971.f38071 |= 1099511627776L;
                        break;
                    default:
                        for (Object obj : c17008.m40085()) {
                            if (obj instanceof C17007) {
                                c14769Of = c14769Of.m35552((C17007) obj);
                            }
                        }
                        break;
                }
            }
        }
        return abstractC22971;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C5558 mo12637() {
        C15012 c15012 = null;
        for (C15012 c15013 : this.f13431.f40880) {
            if (!c15013.m36160()) {
                c15012 = c15013;
            }
        }
        C11972.m30021(c15012);
        return new C5558(c15012.f49048, c15012.f49045);
    }
}
