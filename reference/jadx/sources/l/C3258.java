package l;

/* JADX INFO: renamed from: l.ۗ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3258 extends AbstractC15254 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17432 f12112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9610 f12113;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo9739() {
        return 4;
    }

    public C3258(C17432 c17432) {
        if (c17432 == null) {
            throw new NullPointerException("value == null");
        }
        this.f12112 = c17432;
        this.f12113 = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3258) {
            return this.f12112.equals(((C3258) obj).f12112);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12112.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12112.compareTo(((C3258) obj).f12112);
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_STRING_ID_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        if (this.f12113 == null) {
            C16665 c16665M12885 = c4669.m12885();
            C9610 c9610 = new C9610(this.f12112);
            this.f12113 = c9610;
            c16665M12885.m39128((AbstractC12432) c9610);
        }
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        String str;
        int iM30904 = this.f12113.m30904();
        if (c2718.m8288()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m36532());
            sb.append(' ');
            String strMo2376 = this.f12112.mo2376();
            if (strMo2376.length() <= 98) {
                str = "";
            } else {
                strMo2376 = strMo2376.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo2376 + str + '\"');
            c2718.m8283(0, sb.toString());
            c2718.m8283(4, "  string_data_off: ".concat(C22475.m49978(iM30904)));
        }
        c2718.m8289(iM30904);
    }

    public final C17432 getValue() {
        return this.f12112;
    }
}
