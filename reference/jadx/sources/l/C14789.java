package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 770B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14789 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C10743[] f48345 = new C10743[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10743[] f48346;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f48347;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1900 f48348;

    public C14789(C1900 c1900, int i, C10743[] c10743Arr) {
        C13638.requireNonNull(c1900, "program");
        this.f48348 = c1900;
        C13638.requireNonNull(c10743Arr, "indexes");
        this.f48346 = c10743Arr;
        if (i < 0 || c10743Arr.length > 16) {
            throw new IllegalArgumentException("Invalid syntax window checkpoint cache");
        }
        long jM26999 = 0;
        long jM27035 = 0;
        for (C10743 c10743 : c10743Arr) {
            C13638.requireNonNull(c10743, "index");
            if (c10743.m27016() != c1900 || c10743.m27019() != i || c10743.m26994() == 0) {
                throw new IllegalArgumentException("Checkpoint cache index identity differs");
            }
            jM26999 += (long) c10743.m26999();
            jM27035 += (long) c10743.m27035();
            if (jM26999 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS || jM27035 > 262144) {
                throw new IllegalArgumentException("Checkpoint cache exceeds state budget");
            }
        }
        this.f48347 = i;
        if (c10743Arr.length != 0) {
            C10743 c10744 = c10743Arr[0];
        } else {
            C10743.m26983(c1900, i, false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C14789 m35424(C1900 c1900, int i) {
        return new C14789(c1900, i, f48345);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10743 m35427(C1900 c1900, int i) {
        C13638.requireNonNull(c1900, "expectedProgram");
        C10743 c10743 = null;
        C1900 c1901 = this.f48348;
        if (c1901 != c1900) {
            return null;
        }
        C13638.checkFromToIndex(i, i, this.f48347);
        int i2 = -1;
        int i3 = -1;
        for (C10743 c10744 : this.f48346) {
            int iM27001 = c10744.m27001(c1901, i);
            if (iM27001 >= 0) {
                int iM26992 = c10744.m26992(iM27001);
                int iM27005 = c10744.m27005(iM27001);
                if (iM26992 > i2 || (iM26992 == i2 && iM27005 > i3)) {
                    c10743 = c10744;
                    i3 = iM27005;
                    i2 = iM26992;
                }
            }
        }
        return c10743;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14789 m35431(C10743 c10743) {
        C10743[] c10743Arr;
        long j;
        C10743 c10744 = c10743;
        C1900 c1900M27016 = c10743.m27016();
        C1900 c1900 = this.f48348;
        if (c1900M27016 == c1900) {
            int iM27019 = c10743.m27019();
            int i = this.f48347;
            if (iM27019 == i) {
                if (c10743.m26994() != 0) {
                    C10743[] c10743Arr2 = this.f48346;
                    int i2 = 0;
                    if (c10743Arr2.length <= 0 || c10743Arr2[0] != c10744) {
                        int i3 = 0;
                        while (true) {
                            int i4 = 1;
                            if (i3 < c10743Arr2.length) {
                                C10743 c10745 = c10743Arr2[i3];
                                if (c10745 == c10744 || (m35423(c10745, c10744) && m35423(c10744, c10745))) {
                                    break;
                                }
                                i3++;
                            } else {
                                for (int i5 = 0; i5 < c10743.m26994(); i5++) {
                                    if (c10744.m26995(i5).m2689() == EnumC16095.COMPLETE) {
                                        int iM26992 = c10744.m26992(i5);
                                        int iM27005 = c10744.m27005(i5);
                                        int length = c10743Arr2.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length) {
                                                int iM26999 = c10743.m26999();
                                                int iM27035 = c10743.m27035();
                                                if (iM26999 > 1024 || iM27035 > 262144) {
                                                    throw new IllegalArgumentException("Checkpoint cache update exceeds state budget");
                                                }
                                                int iMin = Math.min(16, c10743Arr2.length + 1);
                                                C10743[] c10743Arr3 = new C10743[iMin];
                                                long j2 = iM26999;
                                                long j3 = iM27035;
                                                c10743Arr3[0] = c10744;
                                                int length2 = c10743Arr2.length;
                                                while (i2 < length2) {
                                                    C10743 c10746 = c10743Arr2[i2];
                                                    if (m35423(c10744, c10746) || i4 == iMin) {
                                                        c10743Arr = c10743Arr2;
                                                        j = j2;
                                                    } else {
                                                        c10743Arr = c10743Arr2;
                                                        long jM26999 = ((long) c10746.m26999()) + j2;
                                                        j = j2;
                                                        long jM27035 = ((long) c10746.m27035()) + j3;
                                                        if (jM26999 <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && jM27035 <= 262144) {
                                                            c10743Arr3[i4] = c10746;
                                                            i4++;
                                                            j3 = jM27035;
                                                            j2 = jM26999;
                                                        }
                                                        i2++;
                                                        c10744 = c10743;
                                                        c10743Arr2 = c10743Arr;
                                                    }
                                                    j2 = j;
                                                    i2++;
                                                    c10744 = c10743;
                                                    c10743Arr2 = c10743Arr;
                                                }
                                                if (i4 != iMin) {
                                                    c10743Arr3 = (C10743[]) Arrays.copyOf(c10743Arr3, i4);
                                                }
                                                return new C14789(c1900, i, c10743Arr3);
                                            }
                                            C10743 c10747 = c10743Arr2[i6];
                                            int iM27001 = c10747.m27001(c10747.m27016(), iM26992);
                                            if (iM27001 >= 0 && c10747.m26992(iM27001) == iM26992 && c10747.m27005(iM27001) >= iM27005) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                }
                            }
                        }
                        if (i3 != 0) {
                            C10743[] c10743Arr4 = (C10743[]) c10743Arr2.clone();
                            C10743 c10748 = c10743Arr4[i3];
                            System.arraycopy(c10743Arr4, 0, c10743Arr4, 1, i3);
                            c10743Arr4[0] = c10748;
                            return new C14789(c1900, i, c10743Arr4);
                        }
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("Checkpoint cache update identity differs");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14789 m35428(C10743 c10743) {
        C13638.requireNonNull(c10743, "used");
        C1900 c1900M27016 = c10743.m27016();
        C1900 c1900 = this.f48348;
        if (c1900M27016 == c1900) {
            int iM27019 = c10743.m27019();
            int i = this.f48347;
            if (iM27019 == i) {
                int i2 = 0;
                while (true) {
                    C10743[] c10743Arr = this.f48346;
                    if (i2 < c10743Arr.length) {
                        if (c10743Arr[i2] == c10743) {
                            if (i2 == 0) {
                                return this;
                            }
                            C10743[] c10743Arr2 = (C10743[]) c10743Arr.clone();
                            C10743 c10744 = c10743Arr2[i2];
                            System.arraycopy(c10743Arr2, 0, c10743Arr2, 1, i2);
                            c10743Arr2[0] = c10744;
                            return new C14789(c1900, i, c10743Arr2);
                        }
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Touched checkpoint is not cached");
                    }
                }
            }
        }
        throw new IllegalArgumentException("Touched checkpoint identity differs");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35423(C10743 c10743, C10743 c10744) {
        for (int i = 0; i < c10744.m26994(); i++) {
            if (c10744.m26995(i).m2689() == EnumC16095.COMPLETE) {
                int iM26992 = c10744.m26992(i);
                int iM27005 = c10744.m27005(i);
                int iM27001 = c10743.m27001(c10743.m27016(), iM26992);
                if (iM27001 < 0 || c10743.m26992(iM27001) != iM26992 || c10743.m27005(iM27001) < iM27005) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10743 m35426(int i) {
        return this.f48346[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1900 m35430() {
        return this.f48348;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35429() {
        return this.f48347;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35425() {
        return this.f48346.length;
    }
}
