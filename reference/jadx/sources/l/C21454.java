package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.᩶ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: DBK8 */
/* JADX INFO: loaded from: classes.dex */
public final class C21454 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13667 f68438;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f68439;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68440;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m48809(int i, boolean z) {
        return (z ? 1L : 0L) | (((long) i) << 1);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48810(C24132 c24132, C13667 c13667) {
        C21454 c21454 = new C21454(c13667, c24132.m54021());
        c24132.m53904(new C14740(0));
        c24132.m53899(c21454);
    }

    public C21454(C13667 c13667, InterfaceC19106 interfaceC19106) {
        this.f68438 = c13667;
        boolean zM48811 = m48811(interfaceC19106);
        this.f68439 = zM48811;
        c13667.m33446(zM48811);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean zM48811;
        if (i <= this.f68440 && (zM48811 = m48811(charSequence)) != this.f68439) {
            this.f68439 = zM48811;
            this.f68438.m33446(zM48811);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48811(CharSequence charSequence) {
        long jM48809;
        int i;
        int iM48808;
        int length = charSequence.length();
        int iM48809 = 0;
        while (true) {
            if (iM48809 < length) {
                int i2 = iM48809 + 1;
                if (charSequence.charAt(iM48809) != '<') {
                    iM48809 = i2;
                } else {
                    if (i2 == length) {
                        jM48809 = m48809(length, false);
                        break;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (cCharAt != '?') {
                        if (cCharAt != '!') {
                            boolean z = true;
                            int i3 = i2;
                            int i4 = i3;
                            char cCharAt2 = cCharAt;
                            while (i3 < length) {
                                cCharAt2 = i3 == i2 ? cCharAt : charSequence.charAt(i3);
                                if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '$' || cCharAt2 == '_' || cCharAt2 == '-' || cCharAt2 == ':' || cCharAt2 == '.' || cCharAt2 >= 183))) {
                                    break;
                                }
                                if (cCharAt2 == ':') {
                                    i4 = i3 + 1;
                                    z = true;
                                } else {
                                    int i5 = i3 - i4;
                                    if (i5 >= 6 || cCharAt2 != "vector".charAt(i5)) {
                                        z = false;
                                    }
                                }
                                i3++;
                            }
                            if (i3 == length) {
                                jM48809 = m48809(length, false);
                                break;
                            }
                            jM48809 = m48809(i3, z && i3 - i4 == 6 && (cCharAt2 <= ' ' || cCharAt2 == '/' || cCharAt2 == '>'));
                            break;
                        }
                        int i6 = iM48809 + 2;
                        if (m48812("--", charSequence, i6)) {
                            iM48809 = m48808("-->", charSequence, iM48809 + 4);
                        } else if (m48812("[CDATA[", charSequence, i6)) {
                            iM48809 = m48808("]]>", charSequence, iM48809 + 9);
                        } else {
                            if (!m48812("DOCTYPE", charSequence, i6)) {
                                jM48809 = m48809(length, false);
                                break;
                            }
                            int i7 = iM48809 + 9;
                            char c = 0;
                            int i8 = 0;
                            while (true) {
                                i = -1;
                                if (i7 >= charSequence.length()) {
                                    break;
                                }
                                char cCharAt3 = charSequence.charAt(i7);
                                if (c != 0) {
                                    if (cCharAt3 == c) {
                                        c = 0;
                                    }
                                } else if (cCharAt3 == '\'' || cCharAt3 == '\"') {
                                    c = cCharAt3;
                                } else if (cCharAt3 == '<' && m48812("<!--", charSequence, i7)) {
                                    iM48808 = m48808("-->", charSequence, i7 + 4);
                                    if (iM48808 < 0) {
                                        break;
                                    }
                                    i7 = iM48808 - 1;
                                } else if (cCharAt3 == '<' && m48812("<?", charSequence, i7)) {
                                    iM48808 = m48808("?>", charSequence, i7 + 2);
                                    if (iM48808 < 0) {
                                        break;
                                    }
                                    i7 = iM48808 - 1;
                                } else if (cCharAt3 == '[') {
                                    i8++;
                                } else if (cCharAt3 == ']' && i8 > 0) {
                                    i8--;
                                } else if (cCharAt3 == '>' && i8 == 0) {
                                    i = i7 + 1;
                                    break;
                                }
                                i7++;
                            }
                            iM48809 = i;
                        }
                    } else {
                        iM48809 = m48808("?>", charSequence, iM48809 + 2);
                    }
                    if (iM48809 < 0) {
                        jM48809 = m48809(length, false);
                        break;
                    }
                }
            } else {
                jM48809 = m48809(length, false);
                break;
            }
        }
        this.f68440 = (int) (jM48809 >>> 1);
        return (jM48809 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m48812(String str, CharSequence charSequence, int i) {
        if (charSequence.length() - i >= str.length()) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (charSequence.charAt(i + i2) == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48808(String str, CharSequence charSequence, int i) {
        int length = charSequence.length() - str.length();
        while (i <= length) {
            if (m48812(str, charSequence, i)) {
                return str.length() + i;
            }
            i++;
        }
        return -1;
    }
}
