package l;

/* JADX INFO: renamed from: l.ۧۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70C */
/* JADX INFO: loaded from: classes3.dex */
public final class C10743 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C5803 f36625;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f36627;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0571[] f36628;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f36629;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f36630;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f36631;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f36632;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f36633;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1900 f36634;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f36635;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f36636;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f36637;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5803 f36638;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f36624 = new int[0];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C0571[] f36626 = new C0571[0];

    static {
        int[] iArr = new int[0];
        f36625 = new C5803(0, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, null, iArr, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public C10743(C1900 c1900, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, C0571[] c0571Arr, C5803 c5803, boolean z) {
        int i3;
        int i4;
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        int length = iArr.length;
        if (i2 < 0 || i2 > length || iArr2.length != length || iArr3.length != length || iArr4.length != length || c0571Arr.length != length) {
            throw new IllegalArgumentException("Checkpoint columns have different sizes");
        }
        C13638.requireNonNull(c1900, "program");
        this.f36634 = c1900;
        this.f36636 = i;
        this.f36631 = i2;
        this.f36627 = iArr;
        this.f36637 = iArr2;
        this.f36633 = iArr3;
        this.f36632 = iArr4;
        this.f36635 = iArr5;
        this.f36630 = iArr6;
        this.f36628 = c0571Arr;
        C13638.requireNonNull(c5803, "states");
        int i5 = c5803.f19698;
        this.f36638 = c5803;
        this.f36629 = z;
        if (i5 != 0 && c5803.m15972() != c1900.m6203()) {
            throw new IllegalArgumentException("Checkpoint end-proof sidecar differs from program");
        }
        if (i5 != 0 && c5803.m15971() != c1900.m6206()) {
            throw new IllegalArgumentException("Checkpoint embedded sidecar differs from program");
        }
        boolean z2 = (iArr5 == null && iArr6 == null) ? false : true;
        if ((z2 && (iArr5 == null || iArr6 == null || iArr5.length != length || iArr6.length != length)) || (i2 != 0 && c5803.m15971() != z2)) {
            throw new IllegalArgumentException("Checkpoint context columns differ from program");
        }
        if (c5803.m15972()) {
            for (int i6 = 0; i6 < i5; i6++) {
                C0571[] c0571Arr2 = c5803.f19711;
                C0571 c0571 = c0571Arr2 == null ? null : c0571Arr2[i6];
                if (c0571 != null && c0571.m2681() != i) {
                    throw new IllegalArgumentException("Checkpoint end proof length differs");
                }
            }
        }
        int i7 = 0;
        int i8 = -1;
        while (i7 < i2) {
            int i9 = iArr[i7];
            if (i9 <= i8 || i9 < 0 || i9 >= i || (i3 = iArr2[i7]) < 0 || i3 > i9 || (i4 = iArr3[i7]) < 0 || i4 > i9) {
                throw new IllegalArgumentException("Invalid syntax checkpoint entry");
            }
            C0571 c0572 = c0571Arr[i7];
            if (c0572 == null) {
                throw new NullPointerException(C2271.m6966(i7, "dependencies[", "]"));
            }
            if (c0572.m2681() != i) {
                throw new IllegalArgumentException("Checkpoint dependency length differs");
            }
            C13638.checkIndex(iArr4[i7], i5);
            if (z2 && (iArr5[i7] < 1 || iArr6[i7] < 0)) {
                throw new IllegalArgumentException("Invalid syntax checkpoint context state");
            }
            i7++;
            i8 = i9;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10743 m26983(C1900 c1900, int i, boolean z) {
        int[] iArr = f36624;
        return new C10743(c1900, i, 0, iArr, iArr, iArr, iArr, null, null, f36626, f36625, z);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m27019() {
        return this.f36636;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m26994() {
        return this.f36631;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m26992(int i) {
        return this.f36627[C13638.checkIndex(i, this.f36631)];
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m27025(int i) {
        return this.f36638.f19716[this.f36632[C13638.checkIndex(i, this.f36631)]];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m27004() {
        return this.f36638.f19698;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m26991() {
        C5803 c5803 = this.f36638;
        return C5803.m15970(c5803.m15972(), c5803.m15971());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26999() {
        return this.f36627.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27002(C21033 c21033, int i) {
        int[] iArr;
        C13638.requireNonNull(c21033, "changes");
        if (c21033.m47422() != this.f36636) {
            throw new IllegalArgumentException("Checkpoint index and change set lengths differ");
        }
        if (this.f36629 || c21033.m47425()) {
            return -1;
        }
        int iM47426 = c21033.m47426();
        int i2 = this.f36631 - 1;
        int i3 = 0;
        while (true) {
            iArr = this.f36627;
            if (i3 > i2) {
                break;
            }
            int i4 = (i3 + i2) >>> 1;
            if (iArr[i4] < iM47426) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i2 >= 0 && iArr[i2] > i) {
            int iM26990 = m26990(i2);
            int[] iArr2 = this.f36638.f19703;
            int i5 = iArr2 == null ? 0 : iArr2[iM26990];
            if ((i5 & 8) == 0 || (i5 & 16) != 0) {
                C0571 c0571 = this.f36628[i2];
                if (this.f36637[i2] == i && c0571.m2689() == EnumC16095.COMPLETE && !c0571.m2687(c21033)) {
                    return i2;
                }
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27001(C1900 c1900, int i) {
        C13638.requireNonNull(c1900, "expectedProgram");
        if (this.f36634 != c1900) {
            return -1;
        }
        C13638.checkFromToIndex(i, i, this.f36636);
        int i2 = this.f36631 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f36627[i4] <= i) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i2 >= 0) {
            int iM26990 = m26990(i2);
            int[] iArr = this.f36638.f19703;
            int i5 = iArr == null ? 0 : iArr[iM26990];
            if (((i5 & 8) == 0 || (i5 & 16) != 0) && this.f36628[i2].m2689() == EnumC16095.COMPLETE) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m27005(int i) {
        return this.f36637[C13638.checkIndex(i, this.f36631)];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1900 m27016() {
        return this.f36634;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m27022() {
        return this.f36629;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m27036(int i) {
        int iM26990 = m26990(i);
        int[] iArr = this.f36638.f19703;
        return ((iArr == null ? 0 : iArr[iM26990]) & 8) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m27015(int i) {
        return this.f36633[C13638.checkIndex(i, this.f36631)];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0571 m26995(int i) {
        return this.f36628[C13638.checkIndex(i, this.f36631)];
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m26990(int i) {
        return this.f36632[C13638.checkIndex(i, this.f36631)];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m27021(int i) {
        C13638.checkIndex(i, this.f36631);
        int[] iArr = this.f36635;
        if (iArr == null) {
            return 1;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27000(int i) {
        C13638.checkIndex(i, this.f36631);
        int[] iArr = this.f36630;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m27012(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19702[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m27028(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19695[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m26997(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19709[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27014(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19707[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int m27003(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19693[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m27032(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19712[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int m27017(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19718[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int m27023(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19700[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m27007(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19714[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m27038(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19713[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int m26996(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19705[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int m27006(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19688[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m26998(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19701[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m27024(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19686[C13638.checkIndex(i, c5803.f19698)];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26993(int i) {
        C5803 c5803 = this.f36638;
        return c5803.f19708[C13638.checkIndex(i, c5803.f19698)];
    }

    public final boolean equals(Object obj) {
        boolean zM26988;
        boolean zM26989;
        if (this != obj) {
            if (obj instanceof C10743) {
                C10743 c10743 = (C10743) obj;
                C0571[] c0571Arr = c10743.f36628;
                if (this.f36634 == c10743.f36634 && this.f36636 == c10743.f36636) {
                    int i = c10743.f36631;
                    int i2 = this.f36631;
                    if (i2 == i && this.f36629 == c10743.f36629 && m26988(i2, this.f36627, c10743.f36627) && m26988(i2, this.f36637, c10743.f36637) && m26988(i2, this.f36633, c10743.f36633) && m26988(i2, this.f36632, c10743.f36632)) {
                        int[] iArr = c10743.f36635;
                        int[] iArr2 = this.f36635;
                        if (iArr2 == null || iArr == null) {
                            zM26988 = iArr2 == iArr;
                        } else {
                            zM26988 = m26988(i2, iArr2, iArr);
                        }
                        if (zM26988) {
                            int[] iArr3 = c10743.f36630;
                            int[] iArr4 = this.f36630;
                            if (iArr4 == null || iArr3 == null) {
                                zM26989 = iArr4 == iArr3;
                            } else {
                                zM26989 = m26988(i2, iArr4, iArr3);
                            }
                            if (zM26989 && this.f36638.equals(c10743.f36638) && i2 <= c0571Arr.length) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if (m26989(this.f36628[i3], c0571Arr[i3])) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iIdentityHashCode = ((((System.identityHashCode(this.f36634) * 31) + this.f36636) * 31) + (this.f36629 ? 1231 : 1237)) * 31;
        int i = this.f36631;
        int iM26986 = (((((((((iIdentityHashCode + i) * 31) + m26986(i, this.f36627)) * 31) + m26986(i, this.f36637)) * 31) + m26986(i, this.f36633)) * 31) + m26986(i, this.f36632)) * 31;
        int[] iArr = this.f36635;
        int iM26987 = (iM26986 + (iArr == null ? 0 : m26986(i, iArr))) * 31;
        int[] iArr2 = this.f36630;
        int iM26988 = ((iM26987 + (iArr2 == null ? 0 : m26986(i, iArr2))) * 31) + this.f36638.hashCode();
        for (int i2 = 0; i2 < i; i2++) {
            iM26988 = (iM26988 * 31) + m26987(this.f36628[i2]);
        }
        return iM26988;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m26988(int i, int[] iArr, int[] iArr2) {
        if (i > iArr.length || i > iArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m26986(int i, int[] iArr) {
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m26989(C0571 c0571, C0571 c0572) {
        return c0571.m2681() == c0572.m2681() && c0571.m2693() == c0572.m2693() && c0571.m2688() == c0572.m2688() && c0571.m2691() == c0572.m2691() && c0571.m2684() == c0572.m2684() && c0571.m2682() == c0572.m2682() && c0571.m2689() == c0572.m2689();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m26987(C0571 c0571) {
        return c0571.m2689().hashCode() + ((((c0571.m2684() + ((c0571.m2691() + ((c0571.m2688() + ((c0571.m2693() + (c0571.m2681() * 31)) * 31)) * 31)) * 31)) * 31) + (c0571.m2682() ? 1231 : 1237)) * 31);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m27008(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19689;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m27009(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19710;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m27010(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19694;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m27011(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19706;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m27013(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19715;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m27018(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19699;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m27020(int i) {
        C5803 c5803 = this.f36638;
        C13638.checkIndex(i, c5803.f19698);
        return ((((long) c5803.f19691[i]) & 4294967295L) << 32) | (4294967295L & ((long) c5803.f19704[i]));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m27026(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19696;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27027(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19697;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27029(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19703;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m27030(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19690;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m27031(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19717;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0571 m27033(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        C0571[] c0571Arr = c5803.f19711;
        if (c0571Arr == null) {
            return null;
        }
        return c0571Arr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m27034(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19687;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m27037(int i) {
        C5803 c5803 = this.f36638;
        int iCheckIndex = C13638.checkIndex(i, c5803.f19698);
        int[] iArr = c5803.f19692;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m27035() {
        C5803 c5803 = this.f36638;
        long length = ((long) c5803.f19702.length) * ((long) C5803.m15970(c5803.m15972(), c5803.m15971()));
        int i = (int) length;
        if (length == i) {
            return i;
        }
        throw new ArithmeticException();
    }
}
