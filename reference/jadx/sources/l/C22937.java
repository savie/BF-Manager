package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 49PE */
/* JADX INFO: loaded from: classes.dex */
public final class C22937 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C22937 f74554 = new C22937(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object[] f74555;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74556;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f74557;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74558;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74559;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C22937 m50766() {
        return f74554;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C22937 m50769() {
        return new C22937();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22937 m50767(C22937 c22937, C22937 c22938) {
        int i = c22937.f74556 + c22938.f74556;
        int[] iArrCopyOf = Arrays.copyOf(c22937.f74557, i);
        System.arraycopy(c22938.f74557, 0, iArrCopyOf, c22937.f74556, c22938.f74556);
        Object[] objArrCopyOf = Arrays.copyOf(c22937.f74555, i);
        System.arraycopy(c22938.f74555, 0, objArrCopyOf, c22937.f74556, c22938.f74556);
        return new C22937(i, iArrCopyOf, objArrCopyOf, true);
    }

    public C22937() {
        this(0, new int[8], new Object[8], true);
    }

    public C22937(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f74558 = -1;
        this.f74556 = i;
        this.f74557 = iArr;
        this.f74555 = objArr;
        this.f74559 = z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50775() {
        if (this.f74559) {
            this.f74559 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50771(int i, Object obj) {
        if (!this.f74559) {
            throw new UnsupportedOperationException();
        }
        m50768(this.f74556 + 1);
        int[] iArr = this.f74557;
        int i2 = this.f74556;
        iArr[i2] = i;
        this.f74555[i2] = obj;
        this.f74556 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50773(InterfaceC12976 interfaceC12976) {
        ((C0876) interfaceC12976).getClass();
        if (EnumC0980.ASCENDING == EnumC0980.DESCENDING) {
            int i = this.f74556;
            while (true) {
                i--;
                if (i < 0) {
                    return;
                }
                ((C0876) interfaceC12976).m3534(this.f74557[i] >>> 3, this.f74555[i]);
            }
        } else {
            for (int i2 = 0; i2 < this.f74556; i2++) {
                ((C0876) interfaceC12976).m3534(this.f74557[i2] >>> 3, this.f74555[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50777(InterfaceC12976 interfaceC12976) {
        if (this.f74556 == 0) {
            return;
        }
        C0876 c0876 = (C0876) interfaceC12976;
        c0876.getClass();
        EnumC0980 enumC0980 = EnumC0980.ASCENDING;
        for (int i = 0; i < this.f74556; i++) {
            int i2 = this.f74557[i];
            Object obj = this.f74555[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0876.m3539(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c0876.m3519(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c0876.m3525(i3, (AbstractC23725) obj);
            } else if (i4 == 3) {
                c0876.getClass();
                EnumC0980 enumC0981 = EnumC0980.ASCENDING;
                c0876.m3537(i3);
                ((C22937) obj).m50777(interfaceC12976);
                c0876.m3516(i3);
            } else if (i4 == 5) {
                c0876.m3538(i3, ((Integer) obj).intValue());
            } else {
                throw new RuntimeException(C4529.m12645());
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m50776() {
        int i = this.f74558;
        if (i != -1) {
            return i;
        }
        int iM48968 = 0;
        for (int i2 = 0; i2 < this.f74556; i2++) {
            int i3 = this.f74557[i2] >>> 3;
            AbstractC23725 abstractC23725 = (AbstractC23725) this.f74555[i2];
            iM48968 += AbstractC22044.m48968(3, abstractC23725) + AbstractC22044.m48960(2, i3) + (AbstractC22044.m48973(1) * 2);
        }
        this.f74558 = iM48968;
        return iM48968;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50770() {
        int iM48962;
        int i = this.f74558;
        if (i != -1) {
            return i;
        }
        int iM50770 = 0;
        for (int i2 = 0; i2 < this.f74556; i2++) {
            int i3 = this.f74557[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM48962 = AbstractC22044.m48962(i4, ((Long) this.f74555[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f74555[i2]).getClass();
                iM48962 = AbstractC22044.m48973(i4) + 8;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iM50770 = ((C22937) this.f74555[i2]).m50770() + (AbstractC22044.m48973(i4) * 2) + iM50770;
                } else if (i5 == 5) {
                    ((Integer) this.f74555[i2]).getClass();
                    iM48962 = AbstractC22044.m48965(i4);
                } else {
                    throw new IllegalStateException(C4529.m12645());
                }
            } else {
                iM48962 = AbstractC22044.m48968(i4, (AbstractC23725) this.f74555[i2]);
            }
            iM50770 = iM48962 + iM50770;
        }
        this.f74558 = iM50770;
        return iM50770;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C22937)) {
            return false;
        }
        C22937 c22937 = (C22937) obj;
        int i = this.f74556;
        if (i == c22937.f74556) {
            int[] iArr = this.f74557;
            int[] iArr2 = c22937.f74557;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f74555;
            Object[] objArr2 = c22937.f74555;
            int i3 = this.f74556;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f74556;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f74557;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f74555;
        int i6 = this.f74556;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50772(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f74556; i2++) {
            C21794.m48553(sb, i, String.valueOf(this.f74557[i2] >>> 3), this.f74555[i2]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50768(int i) {
        int[] iArr = this.f74557;
        if (i > iArr.length) {
            int i2 = this.f74556;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f74557 = Arrays.copyOf(iArr, i);
            this.f74555 = Arrays.copyOf(this.f74555, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50774(C22937 c22937) {
        if (c22937.equals(f74554)) {
            return;
        }
        if (!this.f74559) {
            throw new UnsupportedOperationException();
        }
        int i = this.f74556 + c22937.f74556;
        m50768(i);
        System.arraycopy(c22937.f74557, 0, this.f74557, this.f74556, c22937.f74556);
        System.arraycopy(c22937.f74555, 0, this.f74555, this.f74556, c22937.f74556);
        this.f74556 = i;
    }
}
