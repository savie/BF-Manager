package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3031 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11341;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f11344 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C16956 f11343 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f11342 = null;

    public C3031(int i) {
        this.f11341 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9039(int i, int i2) {
        int[] iArr = this.f11342;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= iArr.length) {
                int i3 = i2 + 1;
                C16956 c16956 = new C16956(i3);
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    c16956.m39747(this.f11343);
                    int[] iArr3 = this.f11342;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f11343 = c16956;
                this.f11342 = iArr2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9045(int i, C16956 c16956) {
        int iM39743 = c16956.m39743();
        m9039(i, iM39743 - 1);
        for (int i2 = 0; i2 < iM39743; i2++) {
            C16251 c16251 = this.f11343.get(i2);
            C16251 c16251M38390 = c16956.get(i2);
            if (c16251M38390 != null && c16251M38390.getType() == C3320.f12286) {
                c16251M38390 = c16251M38390.m38390(C3320.f12289);
            }
            if (c16251 == null) {
                if (c16251M38390 != null) {
                    m9044(i, c16251M38390);
                }
            } else if (c16251M38390 != null) {
                if (!c16251M38390.m38398(c16251)) {
                    m9043(i, EnumC1620.END_SIMPLY, c16251);
                    m9044(i, c16251M38390);
                }
            } else {
                m9043(i, EnumC1620.END_SIMPLY, c16251);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9044(int i, C16251 c16251) {
        C16251 c16252;
        C16251 c16253;
        int iM38400 = c16251.m38400();
        if (c16251.getType() == C3320.f12286) {
            c16251 = c16251.m38390(C3320.f12289);
        }
        m9039(i, iM38400);
        C16251 c16254 = this.f11343.get(iM38400);
        if (c16251.m38398(c16254)) {
            return;
        }
        C16251 c16251M39739 = this.f11343.m39739(c16251);
        if (c16251M39739 != null) {
            m9040(i, EnumC1620.END_MOVED, c16251M39739);
        }
        int i2 = this.f11342[iM38400];
        if (c16254 != null) {
            m9041(i, EnumC1620.END_REPLACED, c16254);
        } else if (i2 >= 0) {
            ArrayList arrayList = this.f11341;
            C9383 c9383 = (C9383) arrayList.get(i2);
            if (c9383.m24065() == i) {
                if (c9383.m24068(c16251)) {
                    arrayList.set(i2, null);
                    this.f11344++;
                    this.f11343.m39746(c16251);
                    this.f11342[iM38400] = -1;
                    return;
                }
                arrayList.set(i2, c9383.m24067(EnumC1620.END_REPLACED));
            }
        }
        if (iM38400 > 0 && (c16253 = this.f11343.get(iM38400 - 1)) != null && c16253.m38393()) {
            m9040(i, EnumC1620.END_CLOBBERED_BY_NEXT, c16253);
        }
        if (c16251.m38393() && (c16252 = this.f11343.get(iM38400 + 1)) != null) {
            m9040(i, EnumC1620.END_CLOBBERED_BY_PREV, c16252);
        }
        m9041(i, EnumC1620.START, c16251);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9043(int i, EnumC1620 enumC1620, C16251 c16251) {
        int iM38400 = c16251.m38400();
        if (c16251.getType() == C3320.f12286) {
            c16251 = c16251.m38390(C3320.f12289);
        }
        m9039(i, iM38400);
        if (this.f11342[iM38400] >= 0) {
            return;
        }
        ArrayList arrayList = this.f11341;
        boolean z = true;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C9383 c9383 = (C9383) arrayList.get(size);
            if (c9383 != null) {
                if (c9383.m24065() != i) {
                    m9041(i, enumC1620, c16251);
                    return;
                } else if (c9383.m24068(c16251)) {
                    break;
                }
            }
            size--;
        }
        this.f11343.m39745(c16251);
        C9383 c9384 = null;
        arrayList.set(size, null);
        this.f11344++;
        int iM38401 = c16251.m38400();
        while (true) {
            size--;
            if (size < 0) {
                z = false;
                break;
            }
            c9384 = (C9383) arrayList.get(size);
            if (c9384 != null && c9384.m24063().m38400() == iM38401) {
                break;
            }
        }
        if (z) {
            this.f11342[iM38401] = size;
            if (c9384.m24065() == i) {
                arrayList.set(size, c9384.m24067(EnumC1620.END_SIMPLY));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9041(int i, EnumC1620 enumC1620, C16251 c16251) {
        int iM38400 = c16251.m38400();
        C9383 c9383 = new C9383(i, enumC1620, c16251);
        ArrayList arrayList = this.f11341;
        arrayList.add(c9383);
        if (enumC1620 == EnumC1620.START) {
            this.f11343.m39746(c16251);
            this.f11342[iM38400] = -1;
        } else {
            this.f11343.m39745(c16251);
            this.f11342[iM38400] = arrayList.size() - 1;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9040(int i, EnumC1620 enumC1620, C16251 c16251) {
        if (enumC1620 == EnumC1620.START) {
            throw new RuntimeException("shouldn't happen");
        }
        int i2 = this.f11342[c16251.m38400()];
        if (i2 >= 0) {
            ArrayList arrayList = this.f11341;
            C9383 c9383 = (C9383) arrayList.get(i2);
            if (c9383.m24065() == i && c9383.m24063().equals(c16251)) {
                arrayList.set(i2, c9383.m24067(enumC1620));
                this.f11343.m39745(c16251);
                return;
            }
        }
        m9043(i, enumC1620, c16251);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4940 m9042() {
        m9039(Integer.MAX_VALUE, 0);
        ArrayList<C9383> arrayList = this.f11341;
        int size = arrayList.size();
        int i = size - this.f11344;
        if (i == 0) {
            return C4940.f17274;
        }
        C9383[] c9383Arr = new C9383[i];
        if (size == i) {
            arrayList.toArray(c9383Arr);
        } else {
            int i2 = 0;
            for (C9383 c9383 : arrayList) {
                if (c9383 != null) {
                    c9383Arr[i2] = c9383;
                    i2++;
                }
            }
        }
        Arrays.sort(c9383Arr);
        C4940 c4940 = new C4940(i);
        for (int i3 = 0; i3 < i; i3++) {
            c4940.m15256(i3, c9383Arr[i3]);
        }
        c4940.mo9637();
        return c4940;
    }
}
