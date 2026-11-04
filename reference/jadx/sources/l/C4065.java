package l;

/* JADX INFO: renamed from: l.ۘۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4IRZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4065 extends C21219 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f13878;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public EnumC22294 f13879;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC15251 f13880;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21965 f13881;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13882;

    @Override // l.C21219, l.AbstractC15251
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final int mo13126() {
        return 0;
    }

    @Override // l.C21219, l.AbstractC15251
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16481 mo13131() {
        return null;
    }

    @Override // l.C21219, l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C4065 c4065 = new C4065(mo18926(), m48374(), m44039());
        m44033(c4065);
        c4065.f13881 = this.f13881;
        c4065.f13879 = this.f13879;
        c4065.f13880 = this.f13880;
        c4065.f13878 = this.f13878;
        c4065.f13882 = this.f13882;
        return c4065;
    }

    @Override // l.C21219, l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if (!(c18959 instanceof C4065) || !super.mo4075(c18959)) {
            return false;
        }
        C4065 c4065 = (C4065) c18959;
        return this.f13879 == c4065.f13879 && this.f13881.equals(c4065.f13881) && this.f13880.mo4075(c4065.f13880) && this.f13878 == c4065.f13878 && this.f13882 == c4065.f13882;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final C21965 m13127() {
        return this.f13881;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13123(C21965 c21965) {
        this.f13881 = c21965;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC22294 m13120() {
        return this.f13879;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13124(EnumC22294 enumC22294) {
        this.f13879 = enumC22294;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C18959 m13130() {
        return this.f13880;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13122(AbstractC15251 abstractC15251) {
        this.f13880 = abstractC15251;
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13129() {
        return this.f13878;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final void m13128() {
        this.f13878 = true;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13121() {
        return this.f13882;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13125(boolean z) {
        this.f13882 = z;
    }

    @Override // l.C21219, l.C18959
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8314.m22396(this.f61471));
        sb.append(": INVOKE_CUSTOM ");
        if (m44027() != null) {
            sb.append(m44027());
            sb.append(" = ");
        }
        m44015(sb);
        m44030(sb);
        sb.append("\n handle type: ");
        sb.append(this.f13879);
        sb.append("\n lambda: ");
        sb.append(this.f13881);
        sb.append("\n call insn: ");
        sb.append(this.f13880);
        return sb.toString();
    }
}
