package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20083 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C20788[] f65250;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f65251;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C20788[] f65252;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65253 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f65254;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65255;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int[] f65256;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f65257;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C18503 f65258;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21493 f65259;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int[] f65260;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f65261;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f65262;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f65263;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f65264;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18503 f65265;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m45458(int i) {
        return i == 15 || i == 16 || i == 17;
    }

    public C20083(C18503 c18503, ArrayList arrayList, C21493 c21493, boolean z, int i, C18503 c18504) {
        this.f65265 = c18503;
        this.f65255 = arrayList;
        this.f65259 = c21493;
        this.f65261 = i;
        this.f65262 = z ? "\t" : C6851.m18454(' ', i);
        String str = "\n";
        int iM48079 = C21460.m48079("\n", c18503, 0);
        if (iM48079 > 0 && c18503.charAt(iM48079 - 1) == '\r') {
            str = "\r\n";
        }
        this.f65254 = str;
        this.f65250 = new C20788[arrayList.size()];
        this.f65252 = new C20788[arrayList.size()];
        this.f65264 = new int[arrayList.size()];
        int[] iArr = new int[arrayList.size()];
        this.f65260 = iArr;
        this.f65256 = new int[arrayList.size() * 2];
        this.f65263 = new int[arrayList.size() * 2];
        this.f65258 = c18504;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f65259.m48131();
            C15850 c15850 = (C15850) arrayList.get(i2);
            this.f65252[i2] = (C20788) arrayDeque.peek();
            int i3 = c15850.f51311;
            if (i3 == 12 || i3 == 13 || i3 == 14) {
                C20788 c20788 = new C20788(i2);
                this.f65250[i2] = c20788;
                arrayDeque.push(c20788);
            }
            if (!arrayDeque.isEmpty() && (c15850.f51312 || c15850.f51311 == 105)) {
                ((C20788) arrayDeque.peek()).f67614 = true;
            }
            if (m45458(c15850.f51311)) {
                C20788 c20789 = (C20788) arrayDeque.pop();
                c20789.f67613 = i2;
                if (!arrayDeque.isEmpty()) {
                    C20788 c207810 = (C20788) arrayDeque.peek();
                    c207810.f67614 = c20789.f67614 | c207810.f67614;
                }
            }
        }
        int length = c18503.length();
        int length2 = c18503.length() - 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            while (length2 >= ((C15850) arrayList.get(size)).f51309) {
                if (c18503.charAt(length2) == '\n') {
                    length = length2;
                }
                length2--;
            }
            this.f65264[size] = length;
            iArr[size] = size;
            int i4 = size + 1;
            if (i4 < arrayList.size() && length >= ((C15850) arrayList.get(i4)).f51313 && (!m45456(i4) || m45458(((C15850) arrayList.get(i4)).f51311))) {
                iArr[size] = iArr[i4];
            }
        }
        int[] iArr2 = this.f65256;
        int iCharCount = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            this.f65259.m48131();
            C15850 c15851 = (C15850) this.f65255.get(i7 / 2);
            int i8 = i7 % 2 == 0 ? c15851.f51309 : c15851.f51313;
            while (iCharCount < i8) {
                int iCodePointAt = Character.codePointAt(this.f65265, iCharCount);
                i6 = iCodePointAt == 9 ? i6 + 1 : i6;
                if (iCodePointAt != 13) {
                    i5++;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            iArr2[i7] = i5;
            this.f65263[i7] = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45459() {
        boolean z;
        CharSequence charSequence;
        C20788 c20788;
        int i;
        boolean z2;
        boolean zM45457;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f65255;
            int size = arrayList.size();
            C18503 c18503 = this.f65265;
            if (i3 < size) {
                C21493 c21493 = this.f65259;
                c21493.m48131();
                C15850 c15850 = (C15850) arrayList.get(i3);
                C20788[] c20788Arr = this.f65252;
                C20788 c20789 = c20788Arr[i3];
                String strM48081 = C21460.m48081(i4, c15850.f51309, c18503);
                boolean zM45458 = m45458(c15850.f51311);
                int[] iArr = this.f65264;
                if (c20789 == null || c20789.f67614) {
                    c15850 = c15850;
                    c20788Arr = c20788Arr;
                    z = zM45458 ? 1 : 0;
                    c18503 = c18503;
                    charSequence = strM48081;
                } else {
                    int i5 = c20789.f67609 + (!zM45458 ? 1 : 0);
                    int iLastIndexOf = strM48081.lastIndexOf(10);
                    String str = this.f65262;
                    if (iLastIndexOf >= 0) {
                        charSequence = strM48081.substring(i2, iLastIndexOf + 1) + C6851.m18455(i5, str);
                        c15850 = c15850;
                        c20788Arr = c20788Arr;
                        z = zM45458 ? 1 : 0;
                        c18503 = c18503;
                    } else if (c15850.f51311 == 103 || !m45456(i3)) {
                        c15850 = c15850;
                        c20788Arr = c20788Arr;
                        z = zM45458 ? 1 : 0;
                        c18503 = c18503;
                        charSequence = strM48081;
                    } else {
                        C15850 c15851 = (C15850) arrayList.get(i3 - 1);
                        if (zM45458) {
                            z2 = c20789.f67610;
                        } else {
                            z2 = c20789.f67612 && (i3 == c20789.f67611 + 1 || c15851.f51311 == 20);
                        }
                        if (z2) {
                            c15850 = c15850;
                            c20788Arr = c20788Arr;
                            z = zM45458 ? 1 : 0;
                            c18503 = c18503;
                        } else {
                            if (zM45458) {
                                c15850 = c15850;
                                c20788Arr = c20788Arr;
                                z = zM45458 ? 1 : 0;
                                c18503 = c18503;
                            } else {
                                int length = strM48081.length() + this.f65257;
                                int i6 = i3 + 1;
                                int i7 = i3;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        c21493.m48131();
                                        C15850 c15852 = (C15850) arrayList.get(i6);
                                        C21493 c21494 = c21493;
                                        z = zM45458;
                                        if (iArr[i3] >= c15852.f51313 && (c20788Arr[i6] != c20788Arr[i3] || !m45456(i6))) {
                                            c18503 = c18503;
                                            c15850 = c15850;
                                            c20788Arr = c20788Arr;
                                            if (((long) c15852.f51313) - ((long) ((C15850) arrayList.get(i3)).f51309) > ((long) UMErrorCode.E_UM_BE_NOT_MAINPROCESS) * 2) {
                                                zM45457 = false;
                                                break;
                                            }
                                            i7 = i6;
                                            i6++;
                                            c18503 = c18503;
                                            c21493 = c21494;
                                            zM45458 = z ? 1 : 0;
                                            c15850 = c15850;
                                            c20788Arr = c20788Arr;
                                        }
                                    } else {
                                        z = zM45458;
                                    }
                                    zM45457 = m45457(i3, i7, length);
                                    break;
                                }
                                if (!zM45457) {
                                }
                            }
                            charSequence = strM48081;
                        }
                        charSequence = this.f65254 + C6851.m18455(i5, str);
                        c20789.f67610 = true;
                    }
                }
                m45455(charSequence);
                C20788 c207810 = this.f65250[i3];
                if (c207810 != null) {
                    c207810.f67614 |= c20789 != null && c20789.f67614;
                    c207810.f67609 = this.f65251 / this.f65261;
                    c207810.f67612 = !c207810.f67614 && (i = c207810.f67613) > i3 + 1 && iArr[i3] >= ((C15850) arrayList.get(c207810.f67613)).f51313 && !m45457(i3, this.f65260[i], this.f65257);
                }
                m45455(new C17499(c15850.f51309, c15850.f51313, c18503));
                if (z && c20789.f67610 && (c20788 = c20788Arr[c20789.f67611]) != null) {
                    c20788.f67610 = true;
                }
                i4 = c15850.f51313;
                i3++;
                i2 = 0;
            } else {
                m45455(new C17499(i4, c18503.length(), c18503));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m45456(int i) {
        if (i != 0) {
            C20788[] c20788Arr = this.f65252;
            if (c20788Arr[i] != null) {
                ArrayList arrayList = this.f65255;
                C15850 c15850 = (C15850) arrayList.get(i);
                C15850 c15851 = (C15850) arrayList.get(i - 1);
                if (c15850.f51311 != 103 && c15851.f51311 != 103 && c15850.f51311 != 105 && c15851.f51311 != 105) {
                    if (i != c20788Arr[i].f67611 + 1 && !m45458(c15850.f51311) && c15851.f51311 != 20 && !c15850.f51310) {
                        int i2 = c15850.f51311;
                        if (i2 != 101 && i2 != 5 && i2 != 8) {
                            return false;
                        }
                        int i3 = c15851.f51311;
                        if (i3 != 101 && i3 != 5 && i3 != 8) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m45457(int i, int i2, int i3) {
        int i4;
        ArrayList arrayList = this.f65255;
        int iCharCount = ((C15850) arrayList.get(i)).f51309;
        int i5 = ((C15850) arrayList.get(i2)).f51313;
        if (this.f65264[i] >= i5) {
            int i6 = i * 2;
            int[] iArr = this.f65263;
            int i7 = (i2 * 2) + 1;
            if (iArr[i6] == iArr[i7]) {
                long j = i3;
                int[] iArr2 = this.f65256;
                return (j + ((long) iArr2[i7])) - ((long) iArr2[i6]) <= ((long) UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
            }
        }
        while (iCharCount < i5) {
            if ((iCharCount & 1023) == 0) {
                this.f65259.m48131();
            }
            int iCodePointAt = Character.codePointAt(this.f65265, iCharCount);
            if (iCodePointAt == 10) {
                break;
            }
            if (iCodePointAt == 9) {
                int i8 = this.f65261;
                i4 = i8 - (i3 % i8);
            } else {
                i4 = iCodePointAt == 13 ? 0 : 1;
            }
            i3 += i4;
            if (i3 <= 120) {
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45455(CharSequence charSequence) {
        int length = charSequence.length();
        C18503 c18503 = this.f65258;
        if (length > 1048576 - c18503.length()) {
            throw C8794.m22909(EnumC19377.LIMIT, "Formatted source length limit exceeded");
        }
        c18503.append(charSequence);
        int iCharCount = 0;
        while (iCharCount < charSequence.length()) {
            if ((iCharCount & 1023) == 0) {
                this.f65259.m48131();
            }
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int i = 1;
            if (iCodePointAt == 10) {
                this.f65257 = 0;
                this.f65251 = 0;
                this.f65253 = true;
            } else if (iCodePointAt != 13 && iCodePointAt != 65279) {
                int i2 = this.f65257;
                if (iCodePointAt == 9) {
                    int i3 = this.f65261;
                    i = i3 - (i2 % i3);
                }
                int i4 = i2 + i;
                this.f65257 = i4;
                if (this.f65253 && (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 12)) {
                    this.f65251 = i4;
                } else {
                    this.f65253 = false;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
