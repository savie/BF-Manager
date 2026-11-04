package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17350 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f56461;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56463;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f56462 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f56464 = new int[8];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m40733(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            return;
        }
        int iM40737 = m40737(i);
        int iM40738 = m40737(i2 - 1);
        int i5 = (iM40738 - iM40737) + 1;
        C24810[] c24810Arr = new C24810[i5];
        int i6 = iM40737;
        while (true) {
            if (i6 > iM40738) {
                break;
            }
            int iM40730 = m40730(i6);
            c24810Arr[i6 - iM40737] = new C24810((C1689) this.f56462.get(i6), Math.max(0, i - iM40730), Math.min(((C1689) this.f56462.get(i6)).f5804, i2 - iM40730));
            i6++;
        }
        C16604 c16604 = new C16604(this, c24810Arr, iM40737);
        c16604.m39288(i, i3);
        for (int i7 = 0; i7 < i5; i7++) {
            c24810Arr[i7].m55332();
        }
        c16604.f53707 = true;
        c16604.m39288(i, i3);
        for (i4 = 0; i4 < i5; i4++) {
            C24810 c24810 = c24810Arr[i4];
            C1689 c1689 = c24810.f80280;
            char[] cArr = c24810.f80281;
            c1689.f5802 = cArr == null ? null : c24810.f80278;
            c1689.f5803 = cArr;
        }
    }

    public final int size() {
        return this.f56463;
    }

    public final boolean isEmpty() {
        return this.f56463 == 0;
    }

    public final void clear() {
        this.f56462.clear();
        this.f56464 = new int[8];
        this.f56463 = 0;
        this.f56461++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40744(AbstractC13753 abstractC13753, InterfaceC9629 interfaceC9629, C6909 c6909, int i) {
        C15508 c15508Mo15350 = interfaceC9629.mo15350();
        try {
            clear();
            C18096 c18096M19181 = c6909.m19181();
            int i2 = 0;
            for (int i3 = 0; i3 < c6909.size(); i3++) {
                C14366 c14366M42205 = c18096M19181.m42205(i3);
                if (c14366M42205.f45296 == i2) {
                    add(C12875.m31911(abstractC13753, c15508Mo15350, c14366M42205.f45295, i));
                    i2++;
                }
            }
            m40746();
            c15508Mo15350.close();
        } catch (Throwable th) {
            try {
                c15508Mo15350.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void add(int i) {
        if (this.f56463 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Too many indent lines");
        }
        ArrayList arrayList = this.f56462;
        C1689 c1689 = arrayList.isEmpty() ? null : (C1689) j$$ExternalSyntheticOutline0.m(arrayList, 1);
        if (c1689 == null || c1689.f5804 == 1024) {
            c1689 = new C1689(8);
            arrayList.add(c1689);
            m40736();
        }
        int i2 = c1689.f5804;
        int[] iArr = c1689.f5801;
        if (i2 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.min(1024, iArr.length * 2));
            c1689.f5801 = iArrCopyOf;
            int[] iArr2 = c1689.f5802;
            if (iArr2 != null) {
                c1689.f5802 = Arrays.copyOf(iArr2, iArrCopyOf.length + 1);
            }
        }
        int[] iArr3 = c1689.f5801;
        int i3 = c1689.f5804;
        int i4 = i3 + 1;
        c1689.f5804 = i4;
        iArr3[i3] = i;
        int[] iArr4 = c1689.f5802;
        if (iArr4 != null) {
            iArr4[i4] = iArr4[i3];
        }
        int[] iArr5 = this.f56464;
        int size = arrayList.size() - 1;
        int i5 = this.f56463 + 1;
        this.f56463 = i5;
        iArr5[size] = i5;
        this.f56461++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40743(int i, AbstractC13753 abstractC13753, C15508 c15508, int i2, int i3) {
        int iM40737 = m40737(i);
        ((C1689) this.f56462.get(iM40737)).f5801[i - m40730(iM40737)] = C12875.m31911(abstractC13753, c15508, i2, i3);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40748(int i, int i2) {
        C17359.checkFromToIndex(i, i, this.f56463);
        if (i2 < 0 || ((long) this.f56463) + ((long) i2) > 2147483647L) {
            throw new IllegalArgumentException("Invalid indent line count");
        }
        if (i2 == 0) {
            return;
        }
        int iM40740 = m40740(i);
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(1024, i2);
            C1689 c1689 = new C1689(iMin);
            c1689.f5804 = iMin;
            arrayList.add(c1689);
            i2 -= iMin;
        }
        this.f56462.addAll(iM40740, arrayList);
        m40741();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40742(int i, int i2) {
        C17359.checkFromToIndex(i, i2, this.f56463);
        if (i == i2) {
            return;
        }
        this.f56462.subList(m40740(i), m40740(i2)).clear();
        m40741();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40745(C17350 c17350, int i, int i2) {
        if (c17350 == this) {
            throw new IllegalArgumentException("Cannot append indent lines from self");
        }
        C17359.checkFromToIndex(i, i2, c17350.f56463);
        if ((((long) this.f56463) + ((long) i2)) - ((long) i) > 2147483647L) {
            throw new IllegalArgumentException("Too many indent lines");
        }
        while (i < i2) {
            int iM40737 = c17350.m40737(i);
            int iM40730 = c17350.m40730(iM40737);
            C1689 c1689 = (C1689) c17350.f56462.get(iM40737);
            int iMin = Math.min(i2, c1689.f5804 + iM40730);
            C1689 c1689M6045 = c1689.m6045(i - iM40730, iMin - iM40730);
            ArrayList arrayList = this.f56462;
            int size = arrayList.size() - 1;
            if (size >= 0 && ((C1689) arrayList.get(size)).f5804 + c1689M6045.f5804 <= 1024) {
                arrayList.set(size, C1689.m6043((C1689) arrayList.get(size), c1689M6045));
            } else {
                arrayList.add(c1689M6045);
                m40736();
            }
            this.f56463 += c1689M6045.f5804;
            this.f56464[arrayList.size() - 1] = this.f56463;
            this.f56461++;
            i = iMin;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m40740(int i) {
        int i2 = this.f56463;
        ArrayList arrayList = this.f56462;
        if (i == i2) {
            return arrayList.size();
        }
        int iM40737 = m40737(i);
        int iM40730 = i - m40730(iM40737);
        if (iM40730 == 0) {
            return iM40737;
        }
        C1689 c1689 = (C1689) arrayList.get(iM40737);
        arrayList.set(iM40737, c1689.m6045(0, iM40730));
        int i3 = iM40737 + 1;
        arrayList.add(i3, c1689.m6045(iM40730, c1689.f5804));
        m40735();
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m40741() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f56462;
            if (i < arrayList.size()) {
                C1689 c1689 = (C1689) arrayList.get(i);
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (((C1689) arrayList.get(i3)).f5804 + c1689.f5804 <= 1024) {
                        arrayList.set(i3, C1689.m6043((C1689) arrayList.get(i3), c1689));
                    } else {
                        arrayList.set(i2, c1689);
                        i2++;
                    }
                } else {
                    arrayList.set(i2, c1689);
                    i2++;
                }
                i++;
            } else {
                arrayList.subList(i2, arrayList.size()).clear();
                m40735();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m40736() {
        int length = this.f56464.length;
        ArrayList arrayList = this.f56462;
        if (length < arrayList.size()) {
            this.f56464 = Arrays.copyOf(this.f56464, Math.max(arrayList.size(), this.f56464.length * 2));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m40735() {
        m40736();
        int i = 0;
        this.f56463 = 0;
        while (true) {
            ArrayList arrayList = this.f56462;
            if (i >= arrayList.size()) {
                this.f56461++;
                return;
            }
            int[] iArr = this.f56464;
            int i2 = this.f56463 + ((C1689) arrayList.get(i)).f5804;
            this.f56463 = i2;
            iArr[i] = i2;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m40730(int i) {
        if (i == 0) {
            return 0;
        }
        return this.f56464[i - 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int m40737(int i) {
        C17359.checkIndex(i, this.f56463);
        int iBinarySearch = Arrays.binarySearch(this.f56464, 0, this.f56462.size(), i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11383 m40747() {
        return new C11383(this);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40749(int i, int i2) {
        C11383 c11383 = new C11383(this);
        if (i > 0) {
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                c11383.m28730(i);
                if (c11383.m28729() == 0 && c11383.m28727() != 0) {
                    break;
                }
            }
        } else {
            i = 0;
        }
        int i3 = this.f56463;
        if (i2 < i3) {
            i3 = i2 + 1;
            while (i3 < this.f56463) {
                c11383.m28730(i3);
                if (c11383.m28729() == 0 && c11383.m28727() != 0) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        m40733(i, i3, i3 < this.f56463 ? i3 + 1 : i3);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5418(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40746() {
        int i = this.f56463;
        m40733(0, i, i);
    }
}
