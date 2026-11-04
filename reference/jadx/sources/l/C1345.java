package l;

/* JADX INFO: renamed from: l.֨ᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1345 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f4805;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f4806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f4807;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1345 f4808;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f4809;

    public C1345(C1610 c1610, AbstractC1566 abstractC1566, boolean z) {
        this.f4806 = abstractC1566;
        m4956(c1610, abstractC1566, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1345 m4954(C1610 c1610, String str) {
        return m4955(c1610, AbstractC1566.m5538(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1345 m4955(C1610 c1610, AbstractC1566 abstractC1566) {
        if (abstractC1566 == null) {
            throw new C8597("Null class type");
        }
        if (abstractC1566.m5554()) {
            abstractC1566 = AbstractC1566.f5426;
        } else {
            if (!abstractC1566.mo5543() || abstractC1566.m5569()) {
                throw new C8597("Not class type: " + abstractC1566);
            }
            if (abstractC1566.mo5550()) {
                abstractC1566 = AbstractC1566.m5538(abstractC1566.mo5570());
            }
        }
        C1345 c1345M14831 = c1610.m5678().m14831(abstractC1566);
        if (c1345M14831 != null) {
            return c1345M14831;
        }
        return c1610.m5678().m14830(new C1345(c1610, abstractC1566, c1610.m5681().m17707()));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m4967() {
        if (m4962()) {
            return this.f4808.m4967();
        }
        return m4963();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m4959() {
        C1345 c1345 = this.f4808;
        if (c1345 != null && c1345.m4964()) {
            return m4953(m4967(), this.f4809, this.f4808, true, false);
        }
        return this.f4807;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m4964() {
        C1345 c1345 = this.f4808;
        return c1345 != null && c1345.m4964();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4956(C1610 c1610, AbstractC1566 abstractC1566, boolean z) {
        String str;
        int iLastIndexOf;
        String strMo5570 = abstractC1566.mo5570();
        int iLastIndexOf2 = strMo5570.lastIndexOf(46);
        boolean z2 = true;
        if (iLastIndexOf2 == -1) {
            str = "";
        } else {
            String strSubstring = strMo5570.substring(0, iLastIndexOf2);
            strMo5570 = strMo5570.substring(iLastIndexOf2 + 1);
            str = strSubstring;
        }
        if (!z || (iLastIndexOf = strMo5570.lastIndexOf(36)) <= 0 || iLastIndexOf == strMo5570.length() - 1) {
            z2 = false;
        } else {
            String strSubstring2 = str + '.' + strMo5570.substring(0, iLastIndexOf);
            if (str.isEmpty()) {
                strSubstring2 = strMo5570.substring(0, iLastIndexOf);
            }
            this.f4805 = null;
            this.f4808 = m4954(c1610, strSubstring2);
            strMo5570 = strMo5570.substring(iLastIndexOf + 1);
        }
        if (!z2) {
            this.f4805 = str;
            this.f4808 = null;
        }
        this.f4809 = strMo5570;
        this.f4807 = m4953(this.f4805, strMo5570, this.f4808, false, false);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m4972() {
        return m4953(this.f4805, this.f4809, this.f4808, false, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4953(String str, String str2, C1345 c1345, boolean z, boolean z2) {
        String strM4972;
        if (c1345 == null) {
            return str.isEmpty() ? str2 : C8008.m21875('.', str, str2);
        }
        char c = z2 ? '$' : '.';
        if (z) {
            strM4972 = z2 ? m4953(c1345.m4967(), c1345.f4809, c1345.f4808, true, true) : c1345.m4959();
        } else {
            strM4972 = z2 ? c1345.m4972() : c1345.f4807;
        }
        return C8008.m21875(c, strM4972, str2);
    }

    public final String toString() {
        return this.f4807;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m4957() {
        return this.f4807;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m4965() {
        return this.f4809;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m4971() {
        return this.f4809;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m4963() {
        C1345 c1345 = this.f4808;
        if (c1345 != null) {
            return c1345.m4963();
        }
        String str = this.f4805;
        if (str != null) {
            return str;
        }
        throw new C8597("Package is null for not inner class");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1345 c1345) {
        return this.f4806.mo5570().compareTo(c1345.f4806.mo5570());
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m4966() {
        return this.f4806.mo5570();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m4970() {
        if (this.f4808 == null) {
            return this.f4809;
        }
        return this.f4808.m4970() + '.' + this.f4809;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1345 m4973() {
        return this.f4808;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C1345 m4968() {
        C1345 c1345 = this.f4808;
        if (c1345 == null) {
            return null;
        }
        C1345 c1345M4968 = c1345.m4968();
        return c1345M4968 != null ? c1345M4968 : this.f4808;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m4962() {
        return this.f4808 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4960(C1610 c1610) {
        m4956(c1610, this.f4806, false);
        this.f4808 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4961(C24927 c24927) {
        m4956(c24927.mo8527(), this.f4806, true);
        this.f4808 = c24927.m55571();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4969(C1610 c1610) {
        m4956(c1610, this.f4806, m4962());
    }

    public final AbstractC1566 getType() {
        return this.f4806;
    }

    public final int hashCode() {
        return this.f4806.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1345)) {
            return false;
        }
        return this.f4806.equals(((C1345) obj).f4806);
    }
}
