package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ᩳ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes5.dex */
public final class C19379 implements InterfaceC12294 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1480 f62612;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0560 f62613;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20871 f62614;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24975 f62615;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BitSet f62616;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44824(C24975 c24975, C1480 c1480, C20871 c20871, C0560 c0560, BitSet bitSet) {
        this.f62615 = c24975;
        this.f62612 = c1480;
        this.f62614 = c20871;
        this.f62613 = c0560;
        this.f62616 = bitSet;
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
    @Override // l.InterfaceC12294
    /* JADX INFO: renamed from: ۙ */
    public final void mo30685(int i) throws C10186 {
        C24975 c24975 = this.f62615;
        C1480 c1480 = this.f62612;
        C20871 c20871 = this.f62614;
        C0560 c0560 = this.f62613;
        BitSet bitSet = this.f62616;
        if (bitSet == null || !bitSet.get(i)) {
            int i2 = c1480.f5147;
            c0560.m2567();
            c24975.m55786(i, c0560, false);
            c20871.m47699(c0560.m2566(), new C10428(c1480));
            if (bitSet == null || c1480.f5147 != i2) {
                return;
            }
            bitSet.set(i);
        }
    }
}
