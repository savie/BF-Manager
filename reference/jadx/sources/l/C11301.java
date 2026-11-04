package l;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f35617;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25012 f35618;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5336[] f35619;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f35620;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f35621;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11228 f35622;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5336[] f35623;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int[] f35624;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f35625;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f35626;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f35627;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35628;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f35629;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CharSequence f35630;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m28561(int i) {
        return i == 31 || i == 48 || i == 46;
    }

    public C11301(CharSequence charSequence, ArrayList arrayList, String str, String str2, int i, C25012 c25012, C11228 c11228) {
        this.f35630 = charSequence;
        this.f35617 = arrayList;
        this.f35626 = str;
        this.f35627 = str2;
        this.f35625 = i;
        this.f35618 = c25012;
        this.f35622 = c11228;
        this.f35623 = new C5336[arrayList.size()];
        this.f35619 = new C5336[arrayList.size()];
        this.f35624 = new int[arrayList.size() + 1];
        this.f35621 = new int[arrayList.size()];
        this.f35629 = new boolean[arrayList.size()];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            c25012.m55844();
            C1607 c1607 = (C1607) arrayList.get(i2);
            int length = c1607.f5527.length();
            int iCharCount = c1607.f5528;
            int i3 = 0;
            while (iCharCount < c1607.f5526) {
                int i4 = i3 + 1;
                if ((i3 & 1023) == 0) {
                    c25012.m55844();
                }
                int iCodePointAt = Character.codePointAt(this.f35630, iCharCount);
                if (iCodePointAt == 13 || iCodePointAt == 10) {
                    this.f35629[i2] = true;
                } else if (iCodePointAt != 65279) {
                    length += iCodePointAt == 9 ? this.f35625 : 1;
                }
                iCharCount += Character.charCount(iCodePointAt);
                i3 = i4;
            }
            int[] iArr = this.f35624;
            int i5 = i2 + 1;
            iArr[i5] = iArr[i2] + length;
            i2 = i5;
        }
        ArrayList arrayList2 = this.f35617;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            this.f35618.m55844();
            C1607 c1608 = (C1607) arrayList2.get(i6);
            this.f35619[i6] = (C5336) arrayDeque.peek();
            if (!arrayDeque.isEmpty()) {
                C5336 c5336 = (C5336) arrayDeque.peek();
                boolean z = c5336.f18761;
                C1607 c1609 = (C1607) this.f35617.get(i6);
                c5336.f18761 = z | (c1609.f5522 || c1609.f5525 >= 0 || this.f35629[i6]);
                ((C5336) arrayDeque.peek()).f18757 |= c1608.f5517;
            }
            int i7 = c1608.f5524;
            if (i7 == 30 || i7 == 47 || i7 == 45) {
                C5336 c5337 = new C5336(i6, c1608.f5519);
                c5337.f18757 = c1608.f5517;
                this.f35623[i6] = c5337;
                arrayDeque.push(c5337);
            } else if (m28561(c1608.f5524)) {
                C5336 c5338 = (C5336) arrayDeque.pop();
                c5338.f18755 = i6;
                if (!arrayDeque.isEmpty()) {
                    ((C5336) arrayDeque.peek()).f18761 |= c5338.f18761;
                    C5336 c5339 = (C5336) arrayDeque.peek();
                    c5339.f18757 = c5338.f18757 | c5339.f18757;
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c25012.m55844();
            this.f35621[size] = size;
            int i8 = size + 1;
            if (i8 < arrayList.size() && !this.f35629[size]) {
                C1607 c16010 = (C1607) this.f35617.get(i8);
                if (!c16010.f5522 && c16010.f5525 < 0 && !m28560(i8)) {
                    int[] iArr2 = this.f35621;
                    iArr2[size] = iArr2[i8];
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:104:0x0201  */
    /* JADX WARN: Code duplicated, block: B:84:0x0192  */
    /* JADX WARN: Code duplicated, block: B:89:0x019c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01de  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28562(boolean z) {
        ArrayList arrayList;
        final C25012 c25012;
        CharSequence charSequence;
        boolean z2;
        int i;
        C5336 c5336;
        ArrayDeque arrayDeque;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            arrayList = this.f35617;
            int size = arrayList.size();
            c25012 = this.f35618;
            charSequence = this.f35630;
            if (i6 >= size) {
                break;
            }
            c25012.m55844();
            C1607 c1607 = (C1607) arrayList.get(i6);
            C5336 c5337 = this.f35619[i6];
            int iMax = Math.max(c5337 == null ? 0 : c5337.f18759, arrayDeque2.isEmpty() ? 0 : ((C12793) arrayDeque2.peek()).f40922);
            int i8 = c1607.f5519 + iMax;
            int i9 = (c1607.f5517 || !c1607.f5518 || m28561(c1607.f5524) || (c5337 != null && c1607.f5519 <= c5337.f18756 + 1)) ? 0 : 1;
            boolean z5 = c5337 != null && c5337.f18760 && (i6 == c5337.f18758 + 1 || m28561(c1607.f5524) || (c1607.f5519 == c5337.f18756 + 1 && ((i5 = ((C1607) arrayList.get(i6 + (-1))).f5524) == 15 || i5 == 1)));
            boolean z6 = c1607.f5517;
            int[] iArr = this.f35624;
            int[] iArr2 = this.f35621;
            if (z6) {
                z2 = false;
            } else {
                if (!z5) {
                    if (m28560(i6)) {
                        if (((iArr[iArr2[i6] + 1] - iArr[i6]) - ((C1607) arrayList.get(i6)).f5527.length()) + c1607.f5527.length() + this.f35628 > 100) {
                        }
                    }
                    z2 = false;
                }
                z2 = true;
            }
            int i10 = c1607.f5525;
            ArrayDeque arrayDeque3 = arrayDeque2;
            String str = this.f35626;
            if (i10 >= 0) {
                String strM43743 = C18856.m43743(i7, c1607.f5525, charSequence);
                if (z && (i6 == 0 || (i6 == 1 && ((C1607) arrayList.get(0)).f5524 == 67))) {
                    i4 = 0;
                } else {
                    if (i6 == 0 || (i6 == 1 && ((C1607) arrayList.get(0)).f5524 == 67)) {
                        i3 = 0;
                    } else {
                        i3 = c1607.f5523 ? 2 : 1;
                    }
                    strM43743 = C21338.m48564(strM43743, i3, true, false, new Runnable() { // from class: l.ܳ֫᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            c25012.m55844();
                        }
                    });
                    i4 = 0;
                }
                m28559(strM43743, i4, strM43743.length());
                i = i8 + i9;
                int i11 = 0;
                while (i11 < i) {
                    c25012.m55844();
                    m28559(str, i4, str.length());
                    i11++;
                    i4 = 0;
                }
            } else {
                arrayList = arrayList;
                charSequence = charSequence;
                if (c1607.f5522 || z2) {
                    int i12 = 0;
                    String str2 = this.f35627;
                    m28559(str2, 0, str2.length());
                    i = i8 + i9;
                    int i13 = 0;
                    while (i13 < i) {
                        c25012.m55844();
                        m28559(str, i12, str.length());
                        i13++;
                        i12 = 0;
                    }
                } else {
                    m28559(c1607.f5527, 0, c1607.f5527.length());
                }
                c5336 = this.f35623[i6];
                if (c5336 != null) {
                    boolean z7 = c5336.f18757;
                    if (c5337 == null && c5337.f18757) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c5336.f18757 = z7 | z3;
                    c5336.f18759 = Math.max(iMax, this.f35620 - c1607.f5519);
                    if (!c5336.f18757 || (i2 = c5336.f18755) <= i6 + 1) {
                        z4 = false;
                    } else {
                        if (!c5336.f18761) {
                            if (((iArr[iArr2[i2] + 1] - iArr[i6]) - ((C1607) arrayList.get(i6)).f5527.length()) + this.f35628 <= 100) {
                                z4 = false;
                            }
                        }
                        z4 = true;
                    }
                    c5336.f18760 = z4;
                }
                if (c1607.f5520 != 0) {
                    arrayDeque = arrayDeque3;
                    arrayDeque.push(new C12793(c1607.f5520, Math.max(iMax, this.f35620 - c1607.f5519)));
                } else {
                    arrayDeque = arrayDeque3;
                }
                m28559(charSequence, c1607.f5528, c1607.f5526);
                if (arrayDeque.isEmpty() && ((C12793) arrayDeque.peek()).f40921 == c1607.f5526) {
                    arrayDeque.pop();
                }
                i7 = c1607.f5526;
                i6++;
                arrayDeque2 = arrayDeque;
            }
            this.f35620 = i;
            c5336 = this.f35623[i6];
            if (c5336 != null) {
                boolean z8 = c5336.f18757;
                if (c5337 == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                c5336.f18757 = z8 | z3;
                c5336.f18759 = Math.max(iMax, this.f35620 - c1607.f5519);
                if (c5336.f18757) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                c5336.f18760 = z4;
            }
            if (c1607.f5520 != 0) {
                arrayDeque = arrayDeque3;
                arrayDeque.push(new C12793(c1607.f5520, Math.max(iMax, this.f35620 - c1607.f5519)));
            } else {
                arrayDeque = arrayDeque3;
            }
            m28559(charSequence, c1607.f5528, c1607.f5526);
            if (arrayDeque.isEmpty()) {
            }
            i7 = c1607.f5526;
            i6++;
            arrayDeque2 = arrayDeque;
        }
        if (z) {
            m28559(charSequence, i7, charSequence.length());
        } else {
            String strM48564 = C21338.m48564(C18856.m43743(i7, charSequence.length(), charSequence), !arrayList.isEmpty() ? 1 : 0, true, false, new Runnable() { // from class: l.ܳ֫᩻
                @Override // java.lang.Runnable
                public final void run() {
                    c25012.m55844();
                }
            });
            m28559(strM48564, 0, strM48564.length());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28560(int i) {
        if (i == 0) {
            return false;
        }
        C1607 c1607 = (C1607) this.f35617.get(i);
        if (c1607.f5517 || c1607.f5522 || m28561(c1607.f5524) || c1607.f5524 == 17) {
            return false;
        }
        C5336 c5336 = this.f35619[i];
        return c1607.f5521 || !(c5336 == null || c5336.f18757 || i != c5336.f18758 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28559(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        C11228 c11228 = this.f35622;
        if (i4 > 1048576 - c11228.length()) {
            throw C16060.m38214(EnumC4590.LIMIT, "Formatted source length limit exceeded");
        }
        c11228.m28292(i, i2, charSequence);
        int i5 = 0;
        while (i < i2) {
            int i6 = i5 + 1;
            if ((i5 & 1023) == 0) {
                this.f35618.m55844();
            }
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (iCodePointAt == 10 || iCodePointAt == 13) {
                this.f35628 = 0;
                this.f35620 = 0;
            } else if (iCodePointAt != 65279) {
                int i7 = this.f35628;
                if (iCodePointAt == 9) {
                    int i8 = this.f35625;
                    i3 = i8 - (i7 % i8);
                } else {
                    i3 = 1;
                }
                this.f35628 = i7 + i3;
            }
            i += Character.charCount(iCodePointAt);
            i5 = i6;
        }
    }
}
