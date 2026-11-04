package l;

/* JADX INFO: renamed from: l.ۤ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11098 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35002;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f35003;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f35004;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f35005;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f35006;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f35007;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f35008;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35009;

    public C11098(InterfaceC22024 interfaceC22024) {
        this.f35008 = interfaceC22024;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28046() {
        this.f35004 = false;
        this.f35002 = false;
        this.f35009 = false;
        this.f35005 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28048(int i, long j) {
        this.f35005 = i;
        this.f35009 = false;
        this.f35004 = i == 182 || i == 179;
        this.f35002 = i == 182;
        this.f35003 = 0;
        this.f35006 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28047(int i, int i2, byte[] bArr) {
        if (this.f35002) {
            int i3 = this.f35003;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f35009 = ((bArr[i4] & 192) >> 6) == 0;
                this.f35002 = false;
            } else {
                this.f35003 = (i2 - i) + i3;
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
    public final void m28049(long j, int i, boolean z) {
        C20782.m47568(this.f35006 != -9223372036854775807L);
        if (this.f35005 == 182 && z && this.f35004) {
            this.f35008.mo14383(this.f35006, this.f35009 ? 1 : 0, (int) (j - this.f35007), i, null);
        }
        if (this.f35005 != 179) {
            this.f35007 = j;
        }
    }
}
