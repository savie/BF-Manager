package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܰۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final class C14580 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۙۖۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f45942;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f45943;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f45944;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45945;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2648 f45946;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f45947;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45948;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7364 f45949;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f45950;

    static {
        ApplicationC23172.m52091(116);
        f45942 = new short[]{2848, 32072, 32074, 32087, 32082, 32093, 32091, 32076, 32103, 32093, 32064, 32089, 32091, 32076, 32084, 32065, 32103, 32085, 32089, 32076, 32091, 32080, 32093, 32086, 32089, 32090, 32084, 32093, 32103, 32090, 32081, 32086, 32103, 32091, 32087, 32086, 32078, 32093, 32074, 32076};
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public native void mo1136();

    public C14580(C8614 c8614, AbstractC7364 abstractC7364, String str, int i, int i2) {
        this.f45943 = c8614;
        this.f45949 = abstractC7364;
        this.f45950 = str;
        this.f45945 = i;
        this.f45948 = i2;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        if (this.f45949.f24218) {
            this.f45946 = this.f45943.m23169(false, (Runnable) null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, l.۠ۨܳ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.۠᩵ܳ, res.Hex] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ?? r0 = this.f45943;
        if (this.f45948 != r0.f28165) {
            return;
        }
        if (this.f45946 == null && r0.m23193()) {
            r0.f28151 = true;
            return;
        }
        if (this.f45947) {
            AbstractC7364 abstractC7364 = r0.f28157;
            AbstractC7364 abstractC7365 = this.f45949;
            if (abstractC7364 == abstractC7365 && this.f45950.equals(abstractC7365.m20218())) {
                if (this.f45945 == abstractC7365.f24220.decode_J(r0)) {
                    r0.m23127(this.f45944, true);
                    r0.f28159.m12741();
                }
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C2648 c2648 = this.f45946;
        if (c2648 != null) {
            c2648.m8777();
        }
    }
}
