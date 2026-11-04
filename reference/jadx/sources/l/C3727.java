package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 770B */
/* JADX INFO: loaded from: classes2.dex */
public final class C3727 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C20925[] f12804 = new C20925[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20925[] f12805;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f12806;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20661 f12807;

    public C3727(C20661 c20661, int i, C20925[] c20925Arr) {
        C17359.requireNonNull(c20661, "program");
        this.f12807 = c20661;
        C17359.requireNonNull(c20925Arr, "indexes");
        this.f12805 = c20925Arr;
        if (i < 0 || c20925Arr.length > 16) {
            throw new IllegalArgumentException("Invalid syntax window checkpoint cache");
        }
        long jM47793 = 0;
        long jM47815 = 0;
        for (C20925 c20925 : c20925Arr) {
            C17359.requireNonNull(c20925, "index");
            if (c20925.m47807() != c20661 || c20925.m47798() != i || c20925.m47830() == 0) {
                throw new IllegalArgumentException("Checkpoint cache index identity differs");
            }
            jM47793 += (long) c20925.m47793();
            jM47815 += (long) c20925.m47815();
            if (jM47793 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS || jM47815 > 262144) {
                throw new IllegalArgumentException("Checkpoint cache exceeds state budget");
            }
        }
        this.f12806 = i;
        if (c20925Arr.length != 0) {
            C20925 c20926 = c20925Arr[0];
        } else {
            C20925.m47780(c20661, i, false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3727 m12130(C20661 c20661, int i) {
        return new C3727(c20661, i, f12804);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20925 m12134(C20661 c20661, int i) {
        C17359.requireNonNull(c20661, "expectedProgram");
        C20925 c20925 = null;
        C20661 c20662 = this.f12807;
        if (c20662 != c20661) {
            return null;
        }
        C17359.checkFromToIndex(i, i, this.f12806);
        int i2 = -1;
        int i3 = -1;
        for (C20925 c20926 : this.f12805) {
            int iM47795 = c20926.m47795(c20662, i);
            if (iM47795 >= 0) {
                int iM47812 = c20926.m47812(iM47795);
                int iM47823 = c20926.m47823(iM47795);
                if (iM47812 > i2 || (iM47812 == i2 && iM47823 > i3)) {
                    c20925 = c20926;
                    i3 = iM47823;
                    i2 = iM47812;
                }
            }
        }
        return c20925;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3727 m12136(C20925 c20925) {
        C20925[] c20925Arr;
        long j;
        C20925 c20926 = c20925;
        C20661 c20661M47807 = c20925.m47807();
        C20661 c20661 = this.f12807;
        if (c20661M47807 == c20661) {
            int iM47798 = c20925.m47798();
            int i = this.f12806;
            if (iM47798 == i) {
                if (c20925.m47830() != 0) {
                    C20925[] c20925Arr2 = this.f12805;
                    int i2 = 0;
                    if (c20925Arr2.length <= 0 || c20925Arr2[0] != c20926) {
                        int i3 = 0;
                        while (true) {
                            int i4 = 1;
                            if (i3 < c20925Arr2.length) {
                                C20925 c20927 = c20925Arr2[i3];
                                if (c20927 == c20926 || (m12129(c20927, c20926) && m12129(c20926, c20927))) {
                                    break;
                                }
                                i3++;
                            } else {
                                for (int i5 = 0; i5 < c20925.m47830(); i5++) {
                                    if (c20926.m47831(i5).m31854() == EnumC19544.COMPLETE) {
                                        int iM47812 = c20926.m47812(i5);
                                        int iM47823 = c20926.m47823(i5);
                                        int length = c20925Arr2.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length) {
                                                int iM47793 = c20925.m47793();
                                                int iM47815 = c20925.m47815();
                                                if (iM47793 > 1024 || iM47815 > 262144) {
                                                    throw new IllegalArgumentException("Checkpoint cache update exceeds state budget");
                                                }
                                                int iMin = Math.min(16, c20925Arr2.length + 1);
                                                C20925[] c20925Arr3 = new C20925[iMin];
                                                long j2 = iM47793;
                                                long j3 = iM47815;
                                                c20925Arr3[0] = c20926;
                                                int length2 = c20925Arr2.length;
                                                while (i2 < length2) {
                                                    C20925 c20928 = c20925Arr2[i2];
                                                    if (m12129(c20926, c20928) || i4 == iMin) {
                                                        c20925Arr = c20925Arr2;
                                                        j = j2;
                                                    } else {
                                                        c20925Arr = c20925Arr2;
                                                        long jM47793 = ((long) c20928.m47793()) + j2;
                                                        j = j2;
                                                        long jM47815 = ((long) c20928.m47815()) + j3;
                                                        if (jM47793 <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && jM47815 <= 262144) {
                                                            c20925Arr3[i4] = c20928;
                                                            i4++;
                                                            j3 = jM47815;
                                                            j2 = jM47793;
                                                        }
                                                        i2++;
                                                        c20926 = c20925;
                                                        c20925Arr2 = c20925Arr;
                                                    }
                                                    j2 = j;
                                                    i2++;
                                                    c20926 = c20925;
                                                    c20925Arr2 = c20925Arr;
                                                }
                                                if (i4 != iMin) {
                                                    c20925Arr3 = (C20925[]) Arrays.copyOf(c20925Arr3, i4);
                                                }
                                                return new C3727(c20661, i, c20925Arr3);
                                            }
                                            C20925 c20929 = c20925Arr2[i6];
                                            int iM47795 = c20929.m47795(c20929.m47807(), iM47812);
                                            if (iM47795 >= 0 && c20929.m47812(iM47795) == iM47812 && c20929.m47823(iM47795) >= iM47823) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                }
                            }
                        }
                        if (i3 != 0) {
                            C20925[] c20925Arr4 = (C20925[]) c20925Arr2.clone();
                            C20925 c209210 = c20925Arr4[i3];
                            System.arraycopy(c20925Arr4, 0, c20925Arr4, 1, i3);
                            c20925Arr4[0] = c209210;
                            return new C3727(c20661, i, c20925Arr4);
                        }
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("Checkpoint cache update identity differs");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3727 m12132(C20925 c20925) {
        C17359.requireNonNull(c20925, "used");
        C20661 c20661M47807 = c20925.m47807();
        C20661 c20661 = this.f12807;
        if (c20661M47807 == c20661) {
            int iM47798 = c20925.m47798();
            int i = this.f12806;
            if (iM47798 == i) {
                int i2 = 0;
                while (true) {
                    C20925[] c20925Arr = this.f12805;
                    if (i2 < c20925Arr.length) {
                        if (c20925Arr[i2] == c20925) {
                            if (i2 == 0) {
                                return this;
                            }
                            C20925[] c20925Arr2 = (C20925[]) c20925Arr.clone();
                            C20925 c20926 = c20925Arr2[i2];
                            System.arraycopy(c20925Arr2, 0, c20925Arr2, 1, i2);
                            c20925Arr2[0] = c20926;
                            return new C3727(c20661, i, c20925Arr2);
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
    public static boolean m12129(C20925 c20925, C20925 c20926) {
        for (int i = 0; i < c20926.m47830(); i++) {
            if (c20926.m47831(i).m31854() == EnumC19544.COMPLETE) {
                int iM47812 = c20926.m47812(i);
                int iM47823 = c20926.m47823(i);
                int iM47795 = c20925.m47795(c20925.m47807(), iM47812);
                if (iM47795 < 0 || c20925.m47812(iM47795) != iM47812 || c20925.m47823(iM47795) < iM47823) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20925 m12133(int i) {
        return this.f12805[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20661 m12137() {
        return this.f12807;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m12135() {
        return this.f12806;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12131() {
        return this.f12805.length;
    }
}
