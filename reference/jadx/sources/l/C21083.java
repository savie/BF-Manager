package l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩷᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21083 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f68669;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f68670;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f68671;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68672;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f68673;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f68674;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f68675;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f68676;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f68677;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f68678;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f68679;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f68680;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f68681;

    public C21083(InterfaceC8011 interfaceC8011) {
        this.f68676 = interfaceC8011;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47493() {
        this.f68675 = false;
        this.f68677 = false;
        this.f68672 = false;
        this.f68674 = false;
        this.f68671 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47494(int i, int i2, long j, long j2, boolean z) {
        this.f68677 = false;
        this.f68672 = false;
        this.f68669 = j2;
        this.f68670 = 0;
        this.f68680 = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f68674 && !this.f68671) {
                if (z) {
                    m47492(i);
                }
                this.f68674 = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                this.f68672 = !this.f68671;
                this.f68671 = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        this.f68673 = z2;
        this.f68675 = z2 || i2 <= 9;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47495(int i, int i2, byte[] bArr) {
        if (this.f68675) {
            int i3 = this.f68670;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f68677 = (bArr[i4] & GCMSIVBlockCipher.MASK) != 0;
                this.f68675 = false;
            } else {
                this.f68670 = (i2 - i) + i3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47496(long j, int i, boolean z) {
        if (this.f68671 && this.f68677) {
            this.f68681 = this.f68673;
            this.f68671 = false;
        } else if (this.f68672 || this.f68677) {
            if (z && this.f68674) {
                m47492(i + ((int) (j - this.f68680)));
            }
            this.f68678 = this.f68680;
            this.f68679 = this.f68669;
            this.f68681 = this.f68673;
            this.f68674 = true;
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
    private void m47492(int i) {
        long j = this.f68679;
        if (j != -9223372036854775807L) {
            long j2 = this.f68680;
            long j3 = this.f68678;
            if (j2 == j3) {
                return;
            }
            boolean z = this.f68681;
            this.f68676.mo8114(j, z ? 1 : 0, (int) (j2 - j3), i, null);
        }
    }
}
