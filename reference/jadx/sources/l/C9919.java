package l;

/* JADX INFO: renamed from: l.ۢۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 86J8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9919 extends C25153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5949 f31849;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence f31850;

    public C9919(CharSequence charSequence) {
        this.f31850 = charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    @Override // l.InterfaceC2032
    /* JADX INFO: renamed from: ۙ */
    public final void mo2202(AbstractC9488 abstractC9488, Object obj, int i, int i2, String str, C10234 c10234) {
        int iM25739;
        if (this.f31849 == null) {
            boolean z = obj instanceof InterfaceC8743;
            CharSequence charSequence = this.f31850;
            if (z) {
                InterfaceC8743 interfaceC8743 = (InterfaceC8743) obj;
                if (interfaceC8743.mo23442() >= 0) {
                    iM25739 = interfaceC8743.mo23442();
                } else {
                    iM25739 = m25739(charSequence, i, i2, false);
                }
            } else {
                iM25739 = m25739(charSequence, i, i2, false);
            }
            this.f31849 = m25740(str, charSequence, iM25739);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25743(int i, String str) {
        if (this.f31849 == null) {
            this.f31849 = m25740(str, this.f31850, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25741(int i, int i2, CharSequence charSequence) {
        if (i2 > i && charSequence.charAt(i2) == charSequence.charAt(i)) {
            int i3 = 0;
            for (int i4 = i2 - 1; i4 > i && charSequence.charAt(i4) == '\\'; i4--) {
                i3++;
            }
            if ((i3 & 1) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25742() {
        this.f31849 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25744() {
        C5949 c5949 = this.f31849;
        if (c5949 != null) {
            throw c5949;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25739(CharSequence charSequence, int i, int i2, boolean z) {
        int i3 = 0;
        while (i3 < charSequence.length() && i > 1) {
            if ((i3 & 1023) == 0) {
                C18870.m43769();
            }
            int i4 = i3 + 1;
            if (charSequence.charAt(i3) == '\n') {
                i--;
            }
            i3 = i4;
        }
        while (i3 < charSequence.length()) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            if ((i3 & 1023) == 0) {
                C18870.m43769();
            }
            int i6 = i3 + 1;
            i3 = (z && Character.isHighSurrogate(charSequence.charAt(i3)) && i6 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i6))) ? i3 + 2 : i6;
            i2 = i5;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5949 m25740(String str, CharSequence charSequence, int i) {
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < i && i2 < charSequence.length()) {
            if ((i2 & 1023) == 0) {
                C18870.m43769();
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '\r') {
                int i5 = i2 + 1;
                if (i5 < i && charSequence.charAt(i5) == '\n') {
                    i2 = i5;
                }
            } else {
                if (cCharAt != '\n') {
                    i4++;
                }
                i2++;
            }
            i3++;
            i4 = 1;
            i2++;
        }
        return new C5949(i3, i4, str);
    }
}
