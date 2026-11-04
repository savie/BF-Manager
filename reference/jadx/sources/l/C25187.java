package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V6PG */
/* JADX INFO: loaded from: classes.dex */
public final class C25187 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2066[] f81400;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int[] f81401;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f81402 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11228 f81403;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81404;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81405;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2066[] f81406;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f81407;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f81408;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f81409;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f81410;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f81411;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5049 f81412;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f81413;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f81414;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11228 f81415;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56151(int i) {
        return i == 15 || i == 16 || i == 17;
    }

    public C25187(C11228 c11228, ArrayList arrayList, C5049 c5049, boolean z, int i, C11228 c11229) {
        this.f81415 = c11228;
        this.f81405 = arrayList;
        this.f81412 = c5049;
        this.f81408 = i;
        this.f81414 = z ? "\t" : C24276.m54280(' ', i);
        String str = "\n";
        int iM43742 = C18856.m43742("\n", c11228, 0);
        if (iM43742 > 0 && c11228.charAt(iM43742 - 1) == '\r') {
            str = "\r\n";
        }
        this.f81411 = str;
        this.f81406 = new C2066[arrayList.size()];
        this.f81400 = new C2066[arrayList.size()];
        this.f81407 = new int[arrayList.size()];
        int[] iArr = new int[arrayList.size()];
        this.f81409 = iArr;
        this.f81401 = new int[arrayList.size() * 2];
        this.f81410 = new int[arrayList.size() * 2];
        this.f81403 = c11229;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f81412.m15284();
            C11760 c11760 = (C11760) arrayList.get(i2);
            this.f81400[i2] = (C2066) arrayDeque.peek();
            int i3 = c11760.f38010;
            if (i3 == 12 || i3 == 13 || i3 == 14) {
                C2066 c2066 = new C2066(i2);
                this.f81406[i2] = c2066;
                arrayDeque.push(c2066);
            }
            if (!arrayDeque.isEmpty() && (c11760.f38012 || c11760.f38010 == 105)) {
                ((C2066) arrayDeque.peek()).f6873 = true;
            }
            if (m56151(c11760.f38010)) {
                C2066 c2067 = (C2066) arrayDeque.pop();
                c2067.f6875 = i2;
                if (!arrayDeque.isEmpty()) {
                    C2066 c2068 = (C2066) arrayDeque.peek();
                    c2068.f6873 = c2067.f6873 | c2068.f6873;
                }
            }
        }
        int length = c11228.length();
        int length2 = c11228.length() - 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            while (length2 >= ((C11760) arrayList.get(size)).f38011) {
                if (c11228.charAt(length2) == '\n') {
                    length = length2;
                }
                length2--;
            }
            this.f81407[size] = length;
            iArr[size] = size;
            int i4 = size + 1;
            if (i4 < arrayList.size() && length >= ((C11760) arrayList.get(i4)).f38013 && (!m56149(i4) || m56151(((C11760) arrayList.get(i4)).f38010))) {
                iArr[size] = iArr[i4];
            }
        }
        int[] iArr2 = this.f81401;
        int iCharCount = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            this.f81412.m15284();
            C11760 c11761 = (C11760) this.f81405.get(i7 / 2);
            int i8 = i7 % 2 == 0 ? c11761.f38011 : c11761.f38013;
            while (iCharCount < i8) {
                int iCodePointAt = Character.codePointAt(this.f81415, iCharCount);
                i6 = iCodePointAt == 9 ? i6 + 1 : i6;
                if (iCodePointAt != 13) {
                    i5++;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            iArr2[i7] = i5;
            this.f81410[i7] = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56152(boolean z, boolean z2) {
        ArrayList arrayList;
        C5049 c5049;
        C11228 c11228;
        String string;
        boolean z3;
        CharSequence charSequence;
        C2066 c2066;
        int i;
        boolean z4;
        boolean zM56150;
        int i2;
        String strSubstring;
        ?? r1 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            arrayList = this.f81405;
            int size = arrayList.size();
            c5049 = this.f81412;
            c11228 = this.f81415;
            if (i3 >= size) {
                break;
            }
            c5049.m15284();
            C11760 c11760 = (C11760) arrayList.get(i3);
            C2066[] c2066Arr = this.f81400;
            C2066 c2067 = c2066Arr[i3];
            String strM43743 = C18856.m43743(i4, c11760.f38011, c11228);
            if (!c11760.f38014 && (i3 != 0 || !z)) {
                boolean z5 = i3 == 0 && strM43743.startsWith("\ufeff");
                StringBuilder sb = new StringBuilder();
                sb.append(z5 ? "\ufeff" : "");
                String str = strM43743;
                if (z5) {
                    strSubstring = strM43743.substring(1);
                }
                if (i3 == 0) {
                    str = strSubstring;
                    i2 = 0;
                } else if (c11760.f38009) {
                    str = strSubstring;
                    i2 = 2;
                } else {
                    str = strSubstring;
                    i2 = 1;
                }
                sb.append(C21338.m48564(str, i2, r1, true, new RunnableC9500(c5049)));
                string = sb.toString();
            }
            string = strM43743;
            string = strM43743;
            boolean zM56151 = m56151(c11760.f38010);
            int[] iArr = this.f81407;
            if (c2067 == null || c2067.f6873) {
                arrayList = arrayList;
                z3 = zM56151 ? 1 : 0;
                charSequence = string;
            } else {
                int i5 = c2067.f6876 + (!zM56151 ? 1 : 0);
                int iLastIndexOf = string.lastIndexOf(10);
                String str2 = this.f81414;
                if (iLastIndexOf >= 0) {
                    CharSequence charSequence2 = string.substring(r1, iLastIndexOf + 1) + C24276.m54281(i5, str2);
                    arrayList = arrayList;
                    z3 = zM56151 ? 1 : 0;
                    charSequence = charSequence2;
                } else if (c11760.f38010 == 103 || !m56149(i3)) {
                    arrayList = arrayList;
                    z3 = zM56151 ? 1 : 0;
                    charSequence = string;
                } else {
                    C11760 c11761 = (C11760) arrayList.get(i3 - 1);
                    if (zM56151) {
                        z4 = c2067.f6871;
                    } else {
                        z4 = c2067.f6872 && (i3 == c2067.f6874 + 1 || c11761.f38010 == 20);
                    }
                    if (z4) {
                        arrayList = arrayList;
                        z3 = zM56151 ? 1 : 0;
                    } else {
                        if (zM56151) {
                            arrayList = arrayList;
                            z3 = zM56151 ? 1 : 0;
                        } else {
                            int length = string.length() + this.f81404;
                            int i6 = i3 + 1;
                            int i7 = i3;
                            while (true) {
                                if (i6 < arrayList.size()) {
                                    c5049.m15284();
                                    C11760 c11762 = (C11760) arrayList.get(i6);
                                    C5049 c50410 = c5049;
                                    z3 = zM56151;
                                    if (iArr[i3] >= c11762.f38013 && (c2066Arr[i6] != c2066Arr[i3] || !m56149(i6))) {
                                        arrayList = arrayList;
                                        if (((long) c11762.f38013) - ((long) ((C11760) arrayList.get(i3)).f38011) > ((long) UMErrorCode.E_UM_BE_NOT_MAINPROCESS) * 2) {
                                            zM56150 = false;
                                            break;
                                        }
                                        i7 = i6;
                                        i6++;
                                        c5049 = c50410;
                                        zM56151 = z3 ? 1 : 0;
                                        arrayList = arrayList;
                                    }
                                } else {
                                    z3 = zM56151;
                                }
                                zM56150 = m56150(i3, i7, length);
                                break;
                            }
                            if (!zM56150) {
                            }
                        }
                        charSequence = string;
                    }
                    CharSequence charSequence3 = this.f81411 + C24276.m54281(i5, str2);
                    c2067.f6871 = true;
                    charSequence = charSequence3;
                }
            }
            m56148(charSequence);
            C2066 c2068 = this.f81406[i3];
            if (c2068 != null) {
                c2068.f6873 |= c2067 != null && c2067.f6873;
                c2068.f6876 = this.f81413 / this.f81408;
                c2068.f6872 = !c2068.f6873 && (i = c2068.f6875) > i3 + 1 && iArr[i3] >= ((C11760) arrayList.get(c2068.f6875)).f38013 && !m56150(i3, this.f81409[i], this.f81404);
            }
            m56148(new C18334(c11760.f38011, c11760.f38013, c11228));
            if (z3 && c2067.f6871 && (c2066 = c2066Arr[c2067.f6874]) != null) {
                c2066.f6871 = true;
            }
            i4 = c11760.f38013;
            i3++;
            r1 = 0;
        }
        if (z || z2) {
            m56148(new C18334(i4, c11228.length(), c11228));
            return;
        }
        if (arrayList.isEmpty() && c11228.length() > 0 && c11228.charAt(0) == 65279) {
            m56148("\ufeff");
        }
        String strM43744 = C18856.m43743(i4, c11228.length(), c11228);
        int i8 = !arrayList.isEmpty() ? 1 : 0;
        C17359.requireNonNull(c5049);
        m56148(C21338.m48564(strM43744, i8, false, false, new RunnableC9500(c5049)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m56149(int i) {
        if (i != 0) {
            C2066[] c2066Arr = this.f81400;
            if (c2066Arr[i] != null) {
                ArrayList arrayList = this.f81405;
                C11760 c11760 = (C11760) arrayList.get(i);
                C11760 c11761 = (C11760) arrayList.get(i - 1);
                if (c11760.f38010 != 103 && c11761.f38010 != 103 && c11760.f38010 != 105 && c11761.f38010 != 105) {
                    if (i != c2066Arr[i].f6874 + 1 && !m56151(c11760.f38010) && c11761.f38010 != 20 && !c11760.f38008) {
                        int i2 = c11760.f38010;
                        if (i2 != 101 && i2 != 5 && i2 != 8) {
                            return false;
                        }
                        int i3 = c11761.f38010;
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
    private boolean m56150(int i, int i2, int i3) {
        int i4;
        ArrayList arrayList = this.f81405;
        int iCharCount = ((C11760) arrayList.get(i)).f38011;
        int i5 = ((C11760) arrayList.get(i2)).f38013;
        if (this.f81407[i] >= i5) {
            int i6 = i * 2;
            int[] iArr = this.f81410;
            int i7 = (i2 * 2) + 1;
            if (iArr[i6] == iArr[i7]) {
                long j = i3;
                int[] iArr2 = this.f81401;
                return (j + ((long) iArr2[i7])) - ((long) iArr2[i6]) <= ((long) UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
            }
        }
        while (iCharCount < i5) {
            if ((iCharCount & 1023) == 0) {
                this.f81412.m15284();
            }
            int iCodePointAt = Character.codePointAt(this.f81415, iCharCount);
            if (iCodePointAt == 10) {
                break;
            }
            if (iCodePointAt == 9) {
                int i8 = this.f81408;
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
    private void m56148(CharSequence charSequence) {
        int length = charSequence.length();
        C11228 c11228 = this.f81403;
        if (length > 1048576 - c11228.length()) {
            throw C15489.m37050(EnumC19965.LIMIT, "Formatted source length limit exceeded");
        }
        c11228.append(charSequence);
        int iCharCount = 0;
        while (iCharCount < charSequence.length()) {
            if ((iCharCount & 1023) == 0) {
                this.f81412.m15284();
            }
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int i = 1;
            if (iCodePointAt == 10) {
                this.f81404 = 0;
                this.f81413 = 0;
                this.f81402 = true;
            } else if (iCodePointAt != 13 && iCodePointAt != 65279) {
                int i2 = this.f81404;
                if (iCodePointAt == 9) {
                    int i3 = this.f81408;
                    i = i3 - (i2 % i3);
                }
                int i4 = i2 + i;
                this.f81404 = i4;
                if (this.f81402 && (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 12)) {
                    this.f81413 = i4;
                } else {
                    this.f81402 = false;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
