package l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۚ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8S4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5879 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f20151;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20152;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f20153;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f20154;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f20155;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f20156;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f20157;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f20158;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f20159;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f20160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f20161;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f20162;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f20163;

    public C5879(InterfaceC22024 interfaceC22024) {
        this.f20153 = interfaceC22024;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17105() {
        this.f20154 = false;
        this.f20161 = false;
        this.f20152 = false;
        this.f20155 = false;
        this.f20151 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17106(int i, int i2, long j, long j2, boolean z) {
        this.f20161 = false;
        this.f20152 = false;
        this.f20156 = j2;
        this.f20162 = 0;
        this.f20157 = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f20155 && !this.f20151) {
                if (z) {
                    m17104(i);
                }
                this.f20155 = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                this.f20152 = !this.f20151;
                this.f20151 = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        this.f20160 = z2;
        this.f20154 = z2 || i2 <= 9;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17107(int i, int i2, byte[] bArr) {
        if (this.f20154) {
            int i3 = this.f20162;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f20161 = (bArr[i4] & GCMSIVBlockCipher.MASK) != 0;
                this.f20154 = false;
            } else {
                this.f20162 = (i2 - i) + i3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17108(long j, int i, boolean z) {
        if (this.f20151 && this.f20161) {
            this.f20163 = this.f20160;
            this.f20151 = false;
        } else if (this.f20152 || this.f20161) {
            if (z && this.f20155) {
                m17104(i + ((int) (j - this.f20157)));
            }
            this.f20158 = this.f20157;
            this.f20159 = this.f20156;
            this.f20163 = this.f20160;
            this.f20155 = true;
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
    private void m17104(int i) {
        long j = this.f20159;
        if (j != -9223372036854775807L) {
            long j2 = this.f20157;
            long j3 = this.f20158;
            if (j2 == j3) {
                return;
            }
            boolean z = this.f20163;
            this.f20153.mo14383(j, z ? 1 : 0, (int) (j2 - j3), i, null);
        }
    }
}
