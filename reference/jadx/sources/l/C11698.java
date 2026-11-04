package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۧܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11698 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f37862;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11698(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f37862 = c11172;
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
    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        C11172 c11172 = this.f37862;
        Object objM50343 = c11172.f35205.m50343(c11172.m28138());
        if ((abstractC11781.mo29591() & 16) == 0) {
            return;
        }
        C5816 c5816 = (C5816) abstractC11781;
        switch (C5733.f19742[c5816.f38067.mo9097().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                m29370(c5816, Integer.class, objM50343);
                break;
            case 6:
                m29370(c5816, Long.class, objM50343);
                break;
            case 7:
                m29370(c5816, Float.class, objM50343);
                break;
            case 8:
                m29370(c5816, Double.class, objM50343);
                break;
            case 9:
                AbstractC22664 abstractC22664 = c5816.f38067;
                if (abstractC22664.f73596 == c11172.f35200.f48282.f73596) {
                    m29370(c5816, String.class, objM50343);
                } else {
                    throw c11172.m28121("bad.constant.value.type", abstractC22664);
                }
                break;
            default:
                return;
        }
        if ((objM50343 instanceof Integer) && !c5816.f38067.mo9097().m48307(((Integer) objM50343).intValue())) {
            throw c11172.m28121("bad.constant.range", objM50343, c5816, c5816.f38067);
        }
        c5816.m16955(objM50343);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29370(AbstractC11781 abstractC11781, Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw this.f37862.m28121("bad.constant.value", obj, abstractC11781, cls.getSimpleName());
        }
    }
}
