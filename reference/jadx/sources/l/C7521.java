package l;

import bin.mt.json.JSON;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L79Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7521 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20038(String str) {
        return str.replace("\r\n", "\n").replace('\r', '\n');
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10344 m20039(String str, int i, int i2, int i3, int i4) throws C12731 {
        int i5;
        boolean z;
        boolean z2;
        int i6 = i3;
        C8227[] c8227ArrM20041 = m20041((CharSequence) str);
        int length = c8227ArrM20041.length;
        int iMax = Math.max(0, i);
        if (i2 < 0) {
            throw m20040(i2);
        }
        if (iMax >= length || i6 <= 0 || i4 <= 0) {
            if (i2 != 0) {
                throw m20040(i2);
            }
            return new C10344("", iMax, 0, iMax, 0, 0, length, false, null, null, false);
        }
        if (i2 > c8227ArrM20041[iMax].f28629) {
            throw m20040(i2);
        }
        if (str.length() != 0 || iMax != 0 || i2 != 0) {
            StringBuilder sb = new StringBuilder(Math.min(i4 * 2, 4096));
            int i7 = i2;
            int i8 = iMax;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i8 < length && i9 < i6 && i10 < i4) {
                    C8227 c8227 = c8227ArrM20041[i8];
                    int i11 = c8227.f28629;
                    boolean z3 = c8227.f28631;
                    if (i7 > i11) {
                        throw m20040(i7);
                    }
                    int i12 = i4 - i10;
                    if (i12 > 0) {
                        if (i7 != i11) {
                            int i13 = i11 - i7;
                            int iMin = Math.min(i13, i12);
                            if (iMin > 0) {
                                i5 = i7 + iMin;
                                CharSequence charSequence = c8227.f28632;
                                int i14 = c8227.f28630;
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
            if (i8 >= c8227ArrM20041.length) {
                z2 = false;
            } else {
                C8227 c8228 = c8227ArrM20041[i8];
                if (i5 < c8228.f28629 || c8228.f28631) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return new C10344(sb.toString(), iMax, i2, i8, i5, i9, length, z2, z2 ? Integer.valueOf(i8) : null, z2 ? Integer.valueOf(i5) : null, z);
        }
        return new C10344("", 0, 0, 0, 0, 0, length, false, null, null, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m20040(int i) {
        return C12731.m31626("Invalid lineCharOffset", "lineCharOffset", JSON.value(i), JSON.array(0, Integer.MAX_VALUE), JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20037(int i, int i2, String str) {
        C8227[] c8227ArrM20041 = m20041((CharSequence) str);
        int iMax = Math.max(1, i);
        int iMin = Math.min(i2, c8227ArrM20041.length);
        if (iMax > iMin) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = iMax - 1; i3 < iMin; i3++) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            C8227 c8227 = c8227ArrM20041[i3];
            sb.append(c8227.f28632, c8227.f28630, c8227.f28628);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20036(int i, int i2, CharSequence charSequence) {
        return m20035(i, charSequence.length(), i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20035(int i, int i2, int i3, CharSequence charSequence) {
        int iM20034 = m20034(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        int iM20035 = m20034(Math.max(iM20034, Math.min(i2, charSequence.length())), charSequence);
        if (i3 <= 0 || iM20034 >= iM20035) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(i3 * 2, iM20035 - iM20034));
        for (int i4 = 0; iM20034 < iM20035 && i4 < i3; i4++) {
            int i5 = iM20034 + 1;
            char cCharAt = charSequence.charAt(iM20034);
            sb.append(cCharAt);
            if (!Character.isHighSurrogate(cCharAt) || i5 >= iM20035) {
                iM20034 = i5;
            } else {
                char cCharAt2 = charSequence.charAt(i5);
                if (Character.isLowSurrogate(cCharAt2)) {
                    sb.append(cCharAt2);
                    iM20034 += 2;
                } else {
                    iM20034 = i5;
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m20043(int i, int i2, CharSequence charSequence) {
        int iM20034 = m20034(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        if (i2 < 0) {
            for (int i3 = -i2; iM20034 > 0 && i3 > 0; i3--) {
                int i4 = iM20034 - 1;
                iM20034 = (i4 > 0 && Character.isLowSurrogate(charSequence.charAt(i4)) && Character.isHighSurrogate(charSequence.charAt(iM20034 + (-2)))) ? iM20034 - 2 : i4;
            }
            return iM20034;
        }
        if (i2 > 0) {
            while (iM20034 < charSequence.length() && i2 > 0) {
                int i5 = iM20034 + 1;
                iM20034 = (Character.isHighSurrogate(charSequence.charAt(iM20034)) && i5 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i5))) ? iM20034 + 2 : i5;
                i2--;
            }
        }
        return iM20034;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m20042(int i, CharSequence charSequence) {
        int iM20034 = m20034(Math.max(0, Math.min(i, charSequence.length())), charSequence);
        do {
            iM20034--;
            if (iM20034 < 0) {
                return 0;
            }
        } while (charSequence.charAt(iM20034) != '\n');
        return iM20034 + 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m20044(int i, CharSequence charSequence) {
        for (int iM20034 = m20034(Math.max(0, Math.min(i, charSequence.length())), charSequence); iM20034 < charSequence.length(); iM20034++) {
            if (charSequence.charAt(iM20034) == '\n') {
                return iM20034;
            }
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20034(int i, CharSequence charSequence) {
        if (i > 0 && i < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i))) {
            int i2 = i - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8227[] m20041(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return new C8227[]{new C8227(charSequence, 0, 0, false)};
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == '\n') {
                arrayList.add(new C8227(charSequence, i, i2, true));
                i = i2 + 1;
            }
        }
        if (i < charSequence.length()) {
            arrayList.add(new C8227(charSequence, i, charSequence.length(), false));
        }
        return (C8227[]) arrayList.toArray(new C8227[0]);
    }
}
