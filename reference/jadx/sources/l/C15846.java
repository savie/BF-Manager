package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15846 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f51283;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51285;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51284 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f51286 = new int[8];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m37696(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            return;
        }
        int iM37699 = m37699(i);
        int iM376910 = m37699(i2 - 1);
        int i5 = (iM376910 - iM37699) + 1;
        C7378[] c7378Arr = new C7378[i5];
        int i6 = iM37699;
        while (true) {
            if (i6 > iM376910) {
                break;
            }
            int iM37693 = m37693(i6);
            c7378Arr[i6 - iM37699] = new C7378((C8790) this.f51284.get(i6), Math.max(0, i - iM37693), Math.min(((C8790) this.f51284.get(i6)).f30212, i2 - iM37693));
            i6++;
        }
        C20784 c20784 = new C20784(this, c7378Arr, iM37699);
        c20784.m46773(i, i3);
        for (int i7 = 0; i7 < i5; i7++) {
            c7378Arr[i7].m19643();
        }
        c20784.f67591 = true;
        c20784.m46773(i, i3);
        for (i4 = 0; i4 < i5; i4++) {
            C7378 c7378 = c7378Arr[i4];
            C8790 c8790 = c7378.f24471;
            char[] cArr = c7378.f24473;
            c8790.f30214 = cArr == null ? null : c7378.f24472;
            c8790.f30215 = cArr;
        }
    }

    public final int size() {
        return this.f51283;
    }

    public final boolean isEmpty() {
        return this.f51283 == 0;
    }

    public final void clear() {
        this.f51284.clear();
        this.f51286 = new int[8];
        this.f51283 = 0;
        this.f51285++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37706(AbstractC12359 abstractC12359, InterfaceC0507 interfaceC0507, C3662 c3662, int i) {
        C3329 c3329Mo2399 = interfaceC0507.mo2399();
        try {
            clear();
            C9496 c9496M10817 = c3662.m10817();
            int i2 = 0;
            for (int i3 = 0; i3 < c3662.size(); i3++) {
                C14435 c14435M24325 = c9496M10817.m24325(i3);
                if (c14435M24325.f47319 == i2) {
                    add(C8084.m21291(abstractC12359, c3329Mo2399, c14435M24325.f47316, i));
                    i2++;
                }
            }
            m37708();
            c3329Mo2399.close();
        } catch (Throwable th) {
            try {
                c3329Mo2399.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void add(int i) {
        if (this.f51283 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Too many indent lines");
        }
        ArrayList arrayList = this.f51284;
        C8790 c8790 = arrayList.isEmpty() ? null : (C8790) C19084.m43861(arrayList, 1);
        if (c8790 == null || c8790.f30212 == 1024) {
            c8790 = new C8790(8);
            arrayList.add(c8790);
            m37697();
        }
        int i2 = c8790.f30212;
        int[] iArr = c8790.f30213;
        if (i2 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.min(1024, iArr.length * 2));
            c8790.f30213 = iArrCopyOf;
            int[] iArr2 = c8790.f30214;
            if (iArr2 != null) {
                c8790.f30214 = Arrays.copyOf(iArr2, iArrCopyOf.length + 1);
            }
        }
        int[] iArr3 = c8790.f30213;
        int i3 = c8790.f30212;
        int i4 = i3 + 1;
        c8790.f30212 = i4;
        iArr3[i3] = i;
        int[] iArr4 = c8790.f30214;
        if (iArr4 != null) {
            iArr4[i4] = iArr4[i3];
        }
        int[] iArr5 = this.f51286;
        int size = arrayList.size() - 1;
        int i5 = this.f51283 + 1;
        this.f51283 = i5;
        iArr5[size] = i5;
        this.f51285++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37705(int i, AbstractC12359 abstractC12359, C3329 c3329, int i2, int i3) {
        int iM37699 = m37699(i);
        ((C8790) this.f51284.get(iM37699)).f30213[i - m37693(iM37699)] = C8084.m21291(abstractC12359, c3329, i2, i3);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37710(int i, int i2) {
        C13638.checkFromToIndex(i, i, this.f51283);
        if (i2 < 0 || ((long) this.f51283) + ((long) i2) > 2147483647L) {
            throw new IllegalArgumentException("Invalid indent line count");
        }
        if (i2 == 0) {
            return;
        }
        int iM37691 = m37691(i);
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(1024, i2);
            C8790 c8790 = new C8790(iMin);
            c8790.f30212 = iMin;
            arrayList.add(c8790);
            i2 -= iMin;
        }
        this.f51284.addAll(iM37691, arrayList);
        m37692();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37704(int i, int i2) {
        C13638.checkFromToIndex(i, i2, this.f51283);
        if (i == i2) {
            return;
        }
        this.f51284.subList(m37691(i), m37691(i2)).clear();
        m37692();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37707(C15846 c15846, int i, int i2) {
        if (c15846 == this) {
            throw new IllegalArgumentException("Cannot append indent lines from self");
        }
        C13638.checkFromToIndex(i, i2, c15846.f51283);
        if ((((long) this.f51283) + ((long) i2)) - ((long) i) > 2147483647L) {
            throw new IllegalArgumentException("Too many indent lines");
        }
        while (i < i2) {
            int iM37699 = c15846.m37699(i);
            int iM37693 = c15846.m37693(iM37699);
            C8790 c8790 = (C8790) c15846.f51284.get(iM37699);
            int iMin = Math.min(i2, c8790.f30212 + iM37693);
            C8790 c8790M22866 = c8790.m22866(i - iM37693, iMin - iM37693);
            ArrayList arrayList = this.f51284;
            int size = arrayList.size() - 1;
            if (size >= 0 && ((C8790) arrayList.get(size)).f30212 + c8790M22866.f30212 <= 1024) {
                arrayList.set(size, C8790.m22864((C8790) arrayList.get(size), c8790M22866));
            } else {
                arrayList.add(c8790M22866);
                m37697();
            }
            this.f51283 += c8790M22866.f30212;
            this.f51286[arrayList.size() - 1] = this.f51283;
            this.f51285++;
            i = iMin;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m37691(int i) {
        int i2 = this.f51283;
        ArrayList arrayList = this.f51284;
        if (i == i2) {
            return arrayList.size();
        }
        int iM37699 = m37699(i);
        int iM37693 = i - m37693(iM37699);
        if (iM37693 == 0) {
            return iM37699;
        }
        C8790 c8790 = (C8790) arrayList.get(iM37699);
        arrayList.set(iM37699, c8790.m22866(0, iM37693));
        int i3 = iM37699 + 1;
        arrayList.add(i3, c8790.m22866(iM37693, c8790.f30212));
        m37702();
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m37692() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f51284;
            if (i < arrayList.size()) {
                C8790 c8790 = (C8790) arrayList.get(i);
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (((C8790) arrayList.get(i3)).f30212 + c8790.f30212 <= 1024) {
                        arrayList.set(i3, C8790.m22864((C8790) arrayList.get(i3), c8790));
                    } else {
                        arrayList.set(i2, c8790);
                        i2++;
                    }
                } else {
                    arrayList.set(i2, c8790);
                    i2++;
                }
                i++;
            } else {
                arrayList.subList(i2, arrayList.size()).clear();
                m37702();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m37697() {
        int length = this.f51286.length;
        ArrayList arrayList = this.f51284;
        if (length < arrayList.size()) {
            this.f51286 = Arrays.copyOf(this.f51286, Math.max(arrayList.size(), this.f51286.length * 2));
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m37702() {
        m37697();
        int i = 0;
        this.f51283 = 0;
        while (true) {
            ArrayList arrayList = this.f51284;
            if (i >= arrayList.size()) {
                this.f51285++;
                return;
            }
            int[] iArr = this.f51286;
            int i2 = this.f51283 + ((C8790) arrayList.get(i)).f30212;
            this.f51283 = i2;
            iArr[i] = i2;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m37693(int i) {
        if (i == 0) {
            return 0;
        }
        return this.f51286[i - 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m37699(int i) {
        C13638.checkIndex(i, this.f51283);
        int iBinarySearch = Arrays.binarySearch(this.f51286, 0, this.f51284.size(), i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m37703(int i, int i2) {
        C10201 c10201 = new C10201(this);
        if (i > 0) {
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                c10201.m25993(i);
                if (c10201.m25992() == 0 && c10201.m25990() != 0) {
                    break;
                }
            }
        } else {
            i = 0;
        }
        int i3 = this.f51283;
        if (i2 < i3) {
            i3 = i2 + 1;
            while (i3 < this.f51283) {
                c10201.m25993(i3);
                if (c10201.m25992() == 0 && c10201.m25990() != 0) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        m37696(i, i3, i3 < this.f51283 ? i3 + 1 : i3);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10201 m37709() {
        return new C10201(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C19373(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37708() {
        int i = this.f51283;
        m37696(0, i, i);
    }
}
