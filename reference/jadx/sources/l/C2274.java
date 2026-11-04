package l;

/* JADX INFO: renamed from: l.֫᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4RX */
/* JADX INFO: loaded from: classes2.dex */
public class C2274 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public short[][] f7411;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public short[] f7412;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public short[] f7413;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public short[] f7414;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3454 f7415;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public char[] f7416;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public char[] f7417;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f7418;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short[] f7419;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo7716() {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int mo7718(int i, InterfaceC17189 interfaceC17189) {
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7715(C6003 c6003) {
        short s;
        int iM17440 = c6003.m17440();
        int iMo7718 = 0;
        while (true) {
            try {
                short s2 = this.f7413[iMo7718];
                if (s2 >= 0) {
                    iMo7718 = mo7718(s2, c6003);
                    if (iMo7718 == -1) {
                        m7717(iMo7718, c6003);
                        throw null;
                    }
                    c6003.mo17444();
                } else {
                    short s3 = this.f7412[iMo7718];
                    if (s3 < 1) {
                        char cMo9833 = (char) c6003.mo9833(1);
                        char c = this.f7416[iMo7718];
                        if (cMo9833 >= c && cMo9833 <= this.f7417[iMo7718]) {
                            short s4 = this.f7411[iMo7718][cMo9833 - c];
                            if (s4 >= 0 || (s4 = this.f7419[iMo7718]) >= 0) {
                                c6003.mo17444();
                                iMo7718 = s4;
                            } else {
                                m7717(iMo7718, c6003);
                                throw null;
                            }
                        } else {
                            short s5 = this.f7419[iMo7718];
                            if (s5 < 0) {
                                if (cMo9833 == 65535 && (s = this.f7414[iMo7718]) >= 0) {
                                    short s6 = this.f7412[s];
                                    c6003.f20539 = iM17440;
                                    return s6;
                                }
                                m7717(iMo7718, c6003);
                                throw null;
                            }
                            c6003.mo17444();
                            iMo7718 = s5;
                        }
                    } else {
                        c6003.f20539 = iM17440;
                        return s3;
                    }
                }
            } catch (Throwable th) {
                c6003.f20539 = iM17440;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7717(int i, InterfaceC17189 interfaceC17189) throws C12714 {
        C14951 c14951 = this.f7415.f75050;
        throw new C12714(mo7716(), this.f7418, i, interfaceC17189);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short[] m7713(String str) {
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i += 2) {
            iCharAt += str.charAt(i);
        }
        short[] sArr = new short[iCharAt];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            char cCharAt = str.charAt(i3);
            char cCharAt2 = str.charAt(i3 + 1);
            int i4 = 1;
            while (i4 <= cCharAt) {
                sArr[i2] = (short) cCharAt2;
                i4++;
                i2++;
            }
        }
        return sArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static char[] m7714(String str) {
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i += 2) {
            iCharAt += str.charAt(i);
        }
        char[] cArr = new char[iCharAt];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            char cCharAt = str.charAt(i3);
            char cCharAt2 = str.charAt(i3 + 1);
            int i4 = 1;
            while (i4 <= cCharAt) {
                cArr[i2] = cCharAt2;
                i4++;
                i2++;
            }
        }
        return cArr;
    }
}
