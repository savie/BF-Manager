package l;

/* JADX INFO: renamed from: l.۠᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8384 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f29116;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f29117;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29118;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f29119;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f29120;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f29121;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f29122;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f29123;

    public C8384(InterfaceC8011 interfaceC8011) {
        this.f29122 = interfaceC8011;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22012() {
        this.f29120 = false;
        this.f29118 = false;
        this.f29117 = false;
        this.f29116 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22014(int i, long j) {
        this.f29116 = i;
        this.f29117 = false;
        this.f29120 = i == 182 || i == 179;
        this.f29118 = i == 182;
        this.f29121 = 0;
        this.f29123 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22013(int i, int i2, byte[] bArr) {
        if (this.f29118) {
            int i3 = this.f29121;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f29117 = ((bArr[i4] & 192) >> 6) == 0;
                this.f29118 = false;
            } else {
                this.f29121 = (i2 - i) + i3;
            }
        }
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22015(long j, int i, boolean z) {
        C2023.m6510(this.f29123 != -9223372036854775807L);
        if (this.f29116 == 182 && z && this.f29120) {
            this.f29122.mo8114(this.f29123, this.f29117 ? 1 : 0, (int) (j - this.f29119), i, null);
        }
        if (this.f29116 != 179) {
            this.f29119 = j;
        }
    }
}
