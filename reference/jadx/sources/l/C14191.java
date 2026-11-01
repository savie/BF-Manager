package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܳ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14191 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f46545;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14191(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f46545 = c0429;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        C0429 c0429 = this.f46545;
        Object objM1631 = c0429.f1983.m1631(c0429.m2248());
        if ((abstractC23903.mo20276() & 16) == 0) {
            return;
        }
        C6263 c6263 = (C6263) abstractC23903;
        switch (C10663.f36372[c6263.f77449.mo1933().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                m34282(c6263, Integer.class, objM1631);
                break;
            case 6:
                m34282(c6263, Long.class, objM1631);
                break;
            case 7:
                m34282(c6263, Float.class, objM1631);
                break;
            case 8:
                m34282(c6263, Double.class, objM1631);
                break;
            case 9:
                AbstractC16579 abstractC16579 = c6263.f77449;
                if (abstractC16579.f53222 == c0429.f1991.f14220.f53222) {
                    m34282(c6263, String.class, objM1631);
                } else {
                    throw c0429.m2233("bad.constant.value.type", abstractC16579);
                }
                break;
            default:
                return;
        }
        if ((objM1631 instanceof Integer) && !c6263.f77449.mo1933().m17950(((Integer) objM1631).intValue())) {
            throw c0429.m2233("bad.constant.range", objM1631, c6263, c6263.f77449);
        }
        c6263.m17327(objM1631);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34282(AbstractC23903 abstractC23903, Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw this.f46545.m2233("bad.constant.value", obj, abstractC23903, cls.getSimpleName());
        }
    }
}
