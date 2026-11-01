package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.۬ܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6BE */
/* JADX INFO: loaded from: classes3.dex */
public final class C13236 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f43989;

    public C13236(String str) {
        this.f43989 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32717(AbstractC4062 abstractC4062) {
        char cCharAt;
        String str = this.f43989;
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int iIndexOf = str.indexOf(58, i);
                abstractC4062.mo4457(str.substring(i - 1, iIndexOf));
                int iM32716 = iIndexOf + 1;
                char cCharAt2 = str.charAt(iM32716);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    iM32716 = m32716(str, iM32716, abstractC4062.mo4455());
                }
                while (true) {
                    i = iM32716 + 1;
                    cCharAt = str.charAt(iM32716);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        iM32716 = m32716(str, i, abstractC4062.mo4458());
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i) == '(') {
            int iM32717 = i + 1;
            while (str.charAt(iM32717) != ')') {
                iM32717 = m32716(str, iM32717, abstractC4062.mo4443());
            }
            int iM32718 = m32716(str, iM32717 + 1, abstractC4062.mo4454());
            while (iM32718 < length) {
                iM32718 = m32716(str, iM32718 + 1, abstractC4062.mo4444());
            }
            return;
        }
        int iM32719 = m32716(str, i, abstractC4062.mo4446());
        while (iM32719 < length) {
            iM32719 = m32716(str, iM32719, abstractC4062.mo4450());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32718(AbstractC4062 abstractC4062) {
        m32716(this.f43989, 0, abstractC4062);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m32716(String str, int i, AbstractC4062 abstractC4062) {
        int iM32716 = i + 1;
        char cCharAt = str.charAt(i);
        if (cCharAt != 'F') {
            if (cCharAt == 'L') {
                boolean z = false;
                int i2 = iM32716;
                boolean z2 = false;
                while (true) {
                    int i3 = iM32716 + 1;
                    char cCharAt2 = str.charAt(iM32716);
                    if (cCharAt2 == '.' || cCharAt2 == ';') {
                        if (!z) {
                            String strSubstring = str.substring(i2, iM32716);
                            if (z2) {
                                abstractC4062.mo4453(strSubstring);
                            } else {
                                abstractC4062.mo4449(strSubstring);
                            }
                        }
                        if (cCharAt2 == ';') {
                            abstractC4062.mo4452();
                            return i3;
                        }
                        z = false;
                        z2 = true;
                        iM32716 = i3;
                        i2 = iM32716;
                    } else if (cCharAt2 == '<') {
                        String strSubstring2 = str.substring(i2, iM32716);
                        if (z2) {
                            abstractC4062.mo4453(strSubstring2);
                        } else {
                            abstractC4062.mo4449(strSubstring2);
                        }
                        iM32716 = i3;
                        while (true) {
                            char cCharAt3 = str.charAt(iM32716);
                            if (cCharAt3 == '>') {
                                break;
                            }
                            if (cCharAt3 == '*') {
                                iM32716++;
                                abstractC4062.mo4451();
                            } else if (cCharAt3 == '+' || cCharAt3 == '-') {
                                iM32716 = m32716(str, iM32716 + 1, abstractC4062.mo4456(cCharAt3));
                            } else {
                                iM32716 = m32716(str, iM32716, abstractC4062.mo4456(a.h));
                            }
                        }
                        z = true;
                    } else {
                        iM32716 = i3;
                    }
                }
            } else if (cCharAt != 'V' && cCharAt != 'I' && cCharAt != 'J' && cCharAt != 'S') {
                if (cCharAt == 'T') {
                    int iIndexOf = str.indexOf(59, iM32716);
                    abstractC4062.mo4445(str.substring(iM32716, iIndexOf));
                    return iIndexOf + 1;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        return m32716(str, iM32716, abstractC4062.mo4447());
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        abstractC4062.mo4448(cCharAt);
        return iM32716;
    }
}
