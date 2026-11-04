package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ᩳۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6BE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18767 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f60954;

    public C18767(String str) {
        this.f60954 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43562(AbstractC9816 abstractC9816) {
        char cCharAt;
        String str = this.f60954;
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int iIndexOf = str.indexOf(58, i);
                abstractC9816.mo3549(str.substring(i - 1, iIndexOf));
                int iM43561 = iIndexOf + 1;
                char cCharAt2 = str.charAt(iM43561);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    iM43561 = m43561(str, iM43561, abstractC9816.mo3547(), 256);
                }
                while (true) {
                    i = iM43561 + 1;
                    cCharAt = str.charAt(iM43561);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        iM43561 = m43561(str, i, abstractC9816.mo3545(), 256);
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i) == '(') {
            int iM43562 = i + 1;
            while (str.charAt(iM43562) != ')') {
                iM43562 = m43561(str, iM43562, abstractC9816.mo3544(), 256);
            }
            int iM43563 = m43561(str, iM43562 + 1, abstractC9816.mo3540(), 256);
            while (iM43563 < length) {
                iM43563 = m43561(str, iM43563 + 1, abstractC9816.mo3550(), 256);
            }
            return;
        }
        int iM43564 = m43561(str, i, abstractC9816.mo3536(), 256);
        while (iM43564 < length) {
            iM43564 = m43561(str, iM43564, abstractC9816.mo3546(), 256);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43563(AbstractC9816 abstractC9816) {
        m43561(this.f60954, 0, abstractC9816, 256);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43561(String str, int i, AbstractC9816 abstractC9816, int i2) {
        int iM43561;
        char cCharAt;
        if (i2 == 0) {
            throw new C22497("Too many nested type arguments");
        }
        while (true) {
            iM43561 = i + 1;
            cCharAt = str.charAt(i);
            if (cCharAt == 'F') {
                break;
            }
            if (cCharAt == 'L') {
                boolean z = false;
                int i3 = iM43561;
                boolean z2 = false;
                while (true) {
                    int i4 = iM43561 + 1;
                    char cCharAt2 = str.charAt(iM43561);
                    if (cCharAt2 == '.' || cCharAt2 == ';') {
                        if (!z) {
                            String strSubstring = str.substring(i3, iM43561);
                            if (z2) {
                                abstractC9816.mo3542(strSubstring);
                            } else {
                                abstractC9816.mo3539(strSubstring);
                            }
                        }
                        if (cCharAt2 == ';') {
                            abstractC9816.mo3541();
                            return i4;
                        }
                        z = false;
                        z2 = true;
                        iM43561 = i4;
                        i3 = iM43561;
                    } else if (cCharAt2 == '<') {
                        String strSubstring2 = str.substring(i3, iM43561);
                        if (z2) {
                            abstractC9816.mo3542(strSubstring2);
                        } else {
                            abstractC9816.mo3539(strSubstring2);
                        }
                        iM43561 = i4;
                        while (true) {
                            char cCharAt3 = str.charAt(iM43561);
                            if (cCharAt3 == '>') {
                                break;
                            }
                            if (cCharAt3 == '*') {
                                iM43561++;
                                abstractC9816.mo3543();
                            } else if (cCharAt3 == '+' || cCharAt3 == '-') {
                                iM43561 = m43561(str, iM43561 + 1, abstractC9816.mo3548(cCharAt3), i2 - 1);
                            } else {
                                iM43561 = m43561(str, iM43561, abstractC9816.mo3548(a.h), i2 - 1);
                            }
                        }
                        z = true;
                    } else {
                        iM43561 = i4;
                    }
                }
            } else {
                if (cCharAt == 'V' || cCharAt == 'I' || cCharAt == 'J' || cCharAt == 'S') {
                    break;
                }
                if (cCharAt == 'T') {
                    int iIndexOf = str.indexOf(59, iM43561);
                    abstractC9816.mo3551(str.substring(iM43561, iIndexOf));
                    return iIndexOf + 1;
                }
                if (cCharAt == 'Z') {
                    break;
                }
                if (cCharAt == '[') {
                    abstractC9816 = abstractC9816.mo3537();
                    i = iM43561;
                } else {
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
        abstractC9816.mo3538(cCharAt);
        return iM43561;
    }
}
