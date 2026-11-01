package l;

/* JADX INFO: renamed from: l.ۛۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4RX */
/* JADX INFO: loaded from: classes2.dex */
public class C5774 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9770 f19610;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public short[] f19611;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public short[][] f19612;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public short[] f19613;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public char[] f19614;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public short[] f19615;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public short[] f19616;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19617;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f19618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo15905() {
        throw null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int mo15907(int i, InterfaceC14242 interfaceC14242) {
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15904(C17063 c17063) {
        short s;
        int iM39845 = c17063.m39845();
        int iMo15907 = 0;
        while (true) {
            try {
                short s2 = this.f19616[iMo15907];
                if (s2 >= 0) {
                    iMo15907 = mo15907(s2, c17063);
                    if (iMo15907 == -1) {
                        m15906(iMo15907, c17063);
                        throw null;
                    }
                    c17063.mo34375();
                } else {
                    short s3 = this.f19613[iMo15907];
                    if (s3 < 1) {
                        char cMo21038 = (char) c17063.mo21038(1);
                        char c = this.f19618[iMo15907];
                        if (cMo21038 >= c && cMo21038 <= this.f19614[iMo15907]) {
                            short s4 = this.f19612[iMo15907][cMo21038 - c];
                            if (s4 >= 0 || (s4 = this.f19611[iMo15907]) >= 0) {
                                c17063.mo34375();
                                iMo15907 = s4;
                            } else {
                                m15906(iMo15907, c17063);
                                throw null;
                            }
                        } else {
                            short s5 = this.f19611[iMo15907];
                            if (s5 < 0) {
                                if (cMo21038 == 65535 && (s = this.f19615[iMo15907]) >= 0) {
                                    short s6 = this.f19613[s];
                                    c17063.f54477 = iM39845;
                                    return s6;
                                }
                                m15906(iMo15907, c17063);
                                throw null;
                            }
                            c17063.mo34375();
                            iMo15907 = s5;
                        }
                    } else {
                        c17063.f54477 = iM39845;
                        return s3;
                    }
                }
            } catch (Throwable th) {
                c17063.f54477 = iM39845;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15906(int i, InterfaceC14242 interfaceC14242) throws C11502 {
        C0917 c0917 = this.f19610.f63756;
        throw new C11502(mo15905(), this.f19617, i, interfaceC14242);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short[] m15902(String str) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static char[] m15903(String str) {
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
