package l;

/* JADX INFO: renamed from: l.۬ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public class C13151 extends AbstractC8856 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6095 f43784;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f43785;

    @Override // l.AbstractC8856, l.AbstractC23903
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo20273() {
        return true;
    }

    @Override // l.AbstractC8856, l.AbstractC23903
    public final String toString() {
        return this.f30402;
    }

    public C13151(C20145 c20145, C6095 c6095) {
        this(c20145, EnumC10477.f35869, "inapplicable symbol error", c6095);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13151(C20145 c20145, EnumC10477 enumC10477, String str, C6095 c6095) {
        super(c20145, enumC10477, str);
        this.f43785 = c20145;
        this.f43784 = c6095;
    }

    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        C11948 c11948M12769;
        C20145 c20145 = this.f43785;
        C23942 c23942 = c20145.f65436;
        C20414 c20414 = c20145.f65441;
        if (abstractC11242 == c23942.f77652) {
            return null;
        }
        C2068 c2068Mo11471 = mo11471();
        if (c20145.f65442 && (c11948M12769 = C4621.m12769(c20145.f65420, interfaceC12260, c20414.m48186(), enumC17198, (C11948) c2068Mo11471.f7665)) != null) {
            return c11948M12769;
        }
        AbstractC23903 abstractC23903Mo17326 = ((AbstractC23903) c2068Mo11471.f7664).mo17326(abstractC16579, c20145.f65444);
        C23549 c23549 = c20145.f65420;
        C22137 c22137M48186 = c20414.m48186();
        EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23903Mo17326);
        AbstractC11242 abstractC11243 = abstractC23903Mo17326.f77453;
        if (abstractC11243 == c20145.f65436.f77632) {
            abstractC11243 = abstractC23903Mo17326.f77448.f77453;
        }
        return c23549.m51912(enumC17198, c22137M48186, interfaceC12260, "cant.apply.symbol", enumC7654M38160, abstractC11243, c20145.m45522(abstractC23903Mo17326.f77449.mo33523()), c20145.m45522(c21825), C16121.m38160(abstractC23903Mo17326.f77448), abstractC23903Mo17326.f77448.f77449, c2068Mo11471.f7665);
    }

    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo22991(AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        C2068 c2068Mo11471 = mo11471();
        C20145 c20145 = this.f43785;
        C23800 c23800 = c20145.f65444;
        AbstractC16579 abstractC16579 = (c2068Mo11471 != null ? (AbstractC23903) c2068Mo11471.f7664 : c20145.f65410.f14276).f77449;
        c23800.getClass();
        AbstractC0618 abstractC0619 = C23800.m52331(abstractC11242, abstractC0618, abstractC16579).f53222;
        if (c2068Mo11471 != null) {
            C7467 c7467 = c20145.f65428;
            AbstractC23903 abstractC23903 = (AbstractC23903) c2068Mo11471.f7664;
            C11948 c11948 = (C11948) c2068Mo11471.f7665;
            c7467.getClass();
            C21825 c21825Of = C21825.of((Object) c11948);
            while (c21825Of.m48595()) {
                C11948 c11949 = (C11948) c21825Of.f70876;
                c21825Of = c21825Of.f70877;
                String strMo29765 = c11949.mo29765();
                strMo29765.getClass();
                switch (strMo29765) {
                    case "compiler.misc.infer.arg.length.mismatch":
                    case "compiler.misc.missing.ret.val":
                    case "compiler.misc.unexpected.ret.val":
                    case "compiler.misc.arg.length.mismatch":
                        abstractC0619.f77449 = new C10290((C5954) abstractC0619.f77449, abstractC23903);
                        abstractC0619.f77447 |= 1099511627776L;
                        break;
                    default:
                        for (Object obj : c11949.m29763()) {
                            if (obj instanceof C11948) {
                                c21825Of = c21825Of.m48597((C11948) obj);
                            }
                        }
                        break;
                }
            }
        }
        return abstractC0619;
    }

    /* JADX INFO: renamed from: ᩶ۙ */
    public C2068 mo11471() {
        C17384 c17384 = null;
        for (C17384 c17385 : this.f43784.f20639) {
            if (!c17385.m40497()) {
                c17384 = c17385;
            }
        }
        C6171.m17171(c17384);
        return new C2068(c17384.f55329, c17384.f55330);
    }
}
