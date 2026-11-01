package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۘۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3734 implements InterfaceC3572 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BitSet f13558;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22786 f13559;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13614 f13560;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2093 f13561;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17684 f13562;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10940(C17684 c17684, C22786 c22786, C13614 c13614, C2093 c2093, BitSet bitSet) {
        this.f13562 = c17684;
        this.f13559 = c22786;
        this.f13560 = c13614;
        this.f13561 = c2093;
        this.f13558 = bitSet;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.InterfaceC3572
    /* JADX INFO: renamed from: ۙ */
    public final void mo10558(int i) throws C12731 {
        C17684 c17684 = this.f13562;
        C22786 c22786 = this.f13559;
        C13614 c13614 = this.f13560;
        C2093 c2093 = this.f13561;
        BitSet bitSet = this.f13558;
        if (bitSet == null || !bitSet.get(i)) {
            int i2 = c22786.f74171;
            c2093.m6636();
            c17684.m41171(i, c2093, false);
            c13614.m33296(c2093.m6635(), new C6557(c22786));
            if (bitSet == null || c22786.f74171 != i2) {
                return;
            }
            bitSet.set(i);
        }
    }
}
