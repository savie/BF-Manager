package l;

import bin.mt.json.JSON;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L79Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C1173 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4319(String str) {
        return str.replace("\r\n", "\n").replace('\r', '\n');
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10121 m4320(String str, int i, int i2, int i3, int i4) throws C10186 {
        int i5;
        boolean z;
        boolean z2;
        int i6 = i3;
        C0427[] c0427ArrM4322 = m4322((CharSequence) str);
        int length = c0427ArrM4322.length;
        int iMax = Math.max(0, i);
        if (i2 < 0) {
            throw m4321(i2);
        }
        if (iMax >= length || i6 <= 0 || i4 <= 0) {
            if (i2 != 0) {
                throw m4321(i2);
            }
            return new C10121("", iMax, 0, iMax, 0, 0, length, false, null, null, false);
        }
        if (i2 > c0427ArrM4322[iMax].f1976) {
            throw m4321(i2);
        }
        if (str.length() != 0 || iMax != 0 || i2 != 0) {
            StringBuilder sb = new StringBuilder(Math.min(i4 * 2, 4096));
            int i7 = i2;
            int i8 = iMax;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i8 < length && i9 < i6 && i10 < i4) {
                    C0427 c0427 = c0427ArrM4322[i8];
                    int i11 = c0427.f1976;
                    boolean z3 = c0427.f1977;
                    if (i7 > i11) {
                        throw m4321(i7);
                    }
                    int i12 = i4 - i10;
                    if (i12 > 0) {
                        if (i7 != i11) {
                            int i13 = i11 - i7;
                            int iMin = Math.min(i13, i12);
                            if (iMin > 0) {
                                i5 = i7 + iMin;
                                CharSequence charSequence = c0427.f1979;
                                int i14 = c0427.f1978;
                                sb.append(charSequence, Character.offsetByCodePoints(charSequence, i14, i7), Character.offsetByCodePoints(charSequence, i14, i5));
                                i10 += iMin;
                                i9++;
                                if (iMin < i13) {
                                    z = true;
                                    break;
                                }
                                if (!z3 || i10 >= i4) {
                                    i7 = i5;
                                } else {
                                    sb.append('\n');
                                    i10++;
                                    i8++;
                                    i7 = 0;
                                }
                                i6 = i3;
                            }
                        } else if (z3) {
                            sb.append('\n');
                            i10++;
                            i9++;
                            i8++;
                            i7 = 0;
                        }
                    }
                }
                i5 = i7;
                z = false;
                break;
            }
            if (i8 >= c0427ArrM4322.length) {
                z2 = false;
            } else {
                C0427 c0428 = c0427ArrM4322[i8];
                if (i5 < c0428.f1976 || c0428.f1977) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return new C10121(sb.toString(), iMax, i2, i8, i5, i9, length, z2, z2 ? Integer.valueOf(i8) : null, z2 ? Integer.valueOf(i5) : null, z);
        }
        return new C10121("", 0, 0, 0, 0, 0, length, false, null, null, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m4321(int i) {
        return C10186.m26301("Invalid lineCharOffset", "lineCharOffset", JSON.value(i), JSON.array(0, Integer.MAX_VALUE), JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4318(int i, int i2, String str) {
        C0427[] c0427ArrM4322 = m4322((CharSequence) str);
        int iMax = Math.max(1, i);
        int iMin = Math.min(i2, c0427ArrM4322.length);
        if (iMax > iMin) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = iMax - 1; i3 < iMin; i3++) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            C0427 c0427 = c0427ArrM4322[i3];
            sb.append(c0427.f1979, c0427.f1978, c0427.f1980);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4317(int i, int i2, CharSequence charSequence) {
        return m4316(i, charSequence.length(), i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4316(int i, int i2, int i3, CharSequence charSequence) {
        int iM4315 = m4315(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        int iM4316 = m4315(Math.max(iM4315, Math.min(i2, charSequence.length())), charSequence);
        if (i3 <= 0 || iM4315 >= iM4316) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(i3 * 2, iM4316 - iM4315));
        for (int i4 = 0; iM4315 < iM4316 && i4 < i3; i4++) {
            int i5 = iM4315 + 1;
            char cCharAt = charSequence.charAt(iM4315);
            sb.append(cCharAt);
            if (!Character.isHighSurrogate(cCharAt) || i5 >= iM4316) {
                iM4315 = i5;
            } else {
                char cCharAt2 = charSequence.charAt(i5);
                if (Character.isLowSurrogate(cCharAt2)) {
                    sb.append(cCharAt2);
                    iM4315 += 2;
                } else {
                    iM4315 = i5;
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m4324(int i, int i2, CharSequence charSequence) {
        int iM4315 = m4315(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        if (i2 < 0) {
            for (int i3 = -i2; iM4315 > 0 && i3 > 0; i3--) {
                int i4 = iM4315 - 1;
                iM4315 = (i4 > 0 && Character.isLowSurrogate(charSequence.charAt(i4)) && Character.isHighSurrogate(charSequence.charAt(iM4315 + (-2)))) ? iM4315 - 2 : i4;
            }
            return iM4315;
        }
        if (i2 > 0) {
            while (iM4315 < charSequence.length() && i2 > 0) {
                int i5 = iM4315 + 1;
                iM4315 = (Character.isHighSurrogate(charSequence.charAt(iM4315)) && i5 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i5))) ? iM4315 + 2 : i5;
                i2--;
            }
        }
        return iM4315;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m4323(int i, CharSequence charSequence) {
        int iM4315 = m4315(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        do {
            iM4315--;
            if (iM4315 < 0) {
                return 0;
            }
        } while (charSequence.charAt(iM4315) != '\n');
        return iM4315 + 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m4325(int i, CharSequence charSequence) {
        for (int iM4315 = m4315(Math.max(0, Math.min(i, charSequence.length())), charSequence); iM4315 < charSequence.length(); iM4315++) {
            if (charSequence.charAt(iM4315) == '\n') {
                return iM4315;
            }
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m4315(int i, CharSequence charSequence) {
        if (i > 0 && i < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i))) {
            int i2 = i - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0427[] m4322(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return new C0427[]{new C0427(charSequence, 0, 0, false)};
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == '\n') {
                arrayList.add(new C0427(charSequence, i, i2, true));
                i = i2 + 1;
            }
        }
        if (i < charSequence.length()) {
            arrayList.add(new C0427(charSequence, i, charSequence.length(), false));
        }
        return (C0427[]) arrayList.toArray(new C0427[0]);
    }
}
