package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49PE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18906 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C18906 f61349 = new C18906(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61350;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f61351;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f61352;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f61353;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] f61354;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C18906 m43884() {
        return f61349;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C18906 m43883() {
        return new C18906();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18906 m43881(C18906 c18906, C18906 c18907) {
        int i = c18906.f61350 + c18907.f61350;
        int[] iArrCopyOf = Arrays.copyOf(c18906.f61352, i);
        System.arraycopy(c18907.f61352, 0, iArrCopyOf, c18906.f61350, c18907.f61350);
        Object[] objArrCopyOf = Arrays.copyOf(c18906.f61354, i);
        System.arraycopy(c18907.f61354, 0, objArrCopyOf, c18906.f61350, c18907.f61350);
        return new C18906(i, iArrCopyOf, objArrCopyOf, true);
    }

    public C18906() {
        this(0, new int[8], new Object[8], true);
    }

    public C18906(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f61351 = -1;
        this.f61350 = i;
        this.f61352 = iArr;
        this.f61354 = objArr;
        this.f61353 = z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43890() {
        if (this.f61353) {
            this.f61353 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43886(int i, Object obj) {
        if (!this.f61353) {
            throw new UnsupportedOperationException();
        }
        m43882(this.f61350 + 1);
        int[] iArr = this.f61352;
        int i2 = this.f61350;
        iArr[i2] = i;
        this.f61354[i2] = obj;
        this.f61350 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43888(InterfaceC18356 interfaceC18356) {
        ((C21560) interfaceC18356).getClass();
        if (EnumC21340.ASCENDING == EnumC21340.DESCENDING) {
            int i = this.f61350;
            while (true) {
                i--;
                if (i < 0) {
                    return;
                }
                ((C21560) interfaceC18356).m49006(this.f61352[i] >>> 3, this.f61354[i]);
            }
        } else {
            for (int i2 = 0; i2 < this.f61350; i2++) {
                ((C21560) interfaceC18356).m49006(this.f61352[i2] >>> 3, this.f61354[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43892(InterfaceC18356 interfaceC18356) {
        if (this.f61350 == 0) {
            return;
        }
        C21560 c21560 = (C21560) interfaceC18356;
        c21560.getClass();
        EnumC21340 enumC21340 = EnumC21340.ASCENDING;
        for (int i = 0; i < this.f61350; i++) {
            int i2 = this.f61352[i];
            Object obj = this.f61354[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c21560.m49020(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c21560.m48994(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c21560.m49000(i3, (AbstractC17084) obj);
            } else if (i4 == 3) {
                c21560.getClass();
                EnumC21340 enumC21341 = EnumC21340.ASCENDING;
                c21560.m49018(i3);
                ((C18906) obj).m43892(interfaceC18356);
                c21560.m48991(i3);
            } else if (i4 == 5) {
                c21560.m49019(i3, ((Integer) obj).intValue());
            } else {
                throw new RuntimeException(C20463.m46968());
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43891() {
        int i = this.f61351;
        if (i != -1) {
            return i;
        }
        int iM35761 = 0;
        for (int i2 = 0; i2 < this.f61350; i2++) {
            int i3 = this.f61352[i2] >>> 3;
            AbstractC17084 abstractC17084 = (AbstractC17084) this.f61354[i2];
            iM35761 += AbstractC14846.m35761(3, abstractC17084) + AbstractC14846.m35764(2, i3) + (AbstractC14846.m35765(1) * 2);
        }
        this.f61351 = iM35761;
        return iM35761;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43885() {
        int iM35773;
        int i = this.f61351;
        if (i != -1) {
            return i;
        }
        int iM43885 = 0;
        for (int i2 = 0; i2 < this.f61350; i2++) {
            int i3 = this.f61352[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM35773 = AbstractC14846.m35773(i4, ((Long) this.f61354[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f61354[i2]).getClass();
                iM35773 = AbstractC14846.m35765(i4) + 8;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iM43885 = ((C18906) this.f61354[i2]).m43885() + (AbstractC14846.m35765(i4) * 2) + iM43885;
                } else if (i5 == 5) {
                    ((Integer) this.f61354[i2]).getClass();
                    iM35773 = AbstractC14846.m35767(i4);
                } else {
                    throw new IllegalStateException(C20463.m46968());
                }
            } else {
                iM35773 = AbstractC14846.m35761(i4, (AbstractC17084) this.f61354[i2]);
            }
            iM43885 = iM35773 + iM43885;
        }
        this.f61351 = iM43885;
        return iM43885;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18906)) {
            return false;
        }
        C18906 c18906 = (C18906) obj;
        int i = this.f61350;
        if (i == c18906.f61350) {
            int[] iArr = this.f61352;
            int[] iArr2 = c18906.f61352;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f61354;
            Object[] objArr2 = c18906.f61354;
            int i3 = this.f61350;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f61350;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f61352;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f61354;
        int i6 = this.f61350;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43887(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f61350; i2++) {
            C0876.m3569(sb, i, String.valueOf(this.f61352[i2] >>> 3), this.f61354[i2]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43882(int i) {
        int[] iArr = this.f61352;
        if (i > iArr.length) {
            int i2 = this.f61350;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f61352 = Arrays.copyOf(iArr, i);
            this.f61354 = Arrays.copyOf(this.f61354, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43889(C18906 c18906) {
        if (c18906.equals(f61349)) {
            return;
        }
        if (!this.f61353) {
            throw new UnsupportedOperationException();
        }
        int i = this.f61350 + c18906.f61350;
        m43882(i);
        System.arraycopy(c18906.f61352, 0, this.f61352, this.f61350, c18906.f61350);
        System.arraycopy(c18906.f61354, 0, this.f61354, this.f61350, c18906.f61350);
        this.f61350 = i;
    }
}
