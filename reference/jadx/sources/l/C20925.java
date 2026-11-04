package l;

/* JADX INFO: renamed from: l.᩵᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70C */
/* JADX INFO: loaded from: classes5.dex */
public final class C20925 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int[] f66944 = new int[0];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C12831[] f66945 = new C12831[0];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C3771 f66946;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f66947;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f66948;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20661 f66949;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f66950;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f66951;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f66952;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f66953;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f66954;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f66955;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f66956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12831[] f66957;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3771 f66958;

    static {
        int[] iArr = new int[0];
        f66946 = new C3771(0, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, null, iArr, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public C20925(C20661 c20661, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, C12831[] c12831Arr, C3771 c3771, boolean z) {
        int i3;
        int i4;
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        int length = iArr.length;
        if (i2 < 0 || i2 > length || iArr2.length != length || iArr3.length != length || iArr4.length != length || c12831Arr.length != length) {
            throw new IllegalArgumentException("Checkpoint columns have different sizes");
        }
        C17359.requireNonNull(c20661, "program");
        this.f66949 = c20661;
        this.f66954 = i;
        this.f66955 = i2;
        this.f66952 = iArr;
        this.f66953 = iArr2;
        this.f66950 = iArr3;
        this.f66951 = iArr4;
        this.f66956 = iArr5;
        this.f66948 = iArr6;
        this.f66957 = c12831Arr;
        C17359.requireNonNull(c3771, "states");
        int i5 = c3771.f12918;
        this.f66958 = c3771;
        this.f66947 = z;
        if (i5 != 0 && c3771.m12243() != c20661.m47285()) {
            throw new IllegalArgumentException("Checkpoint end-proof sidecar differs from program");
        }
        if (i5 != 0 && c3771.m12242() != c20661.m47286()) {
            throw new IllegalArgumentException("Checkpoint embedded sidecar differs from program");
        }
        boolean z2 = (iArr5 == null && iArr6 == null) ? false : true;
        if ((z2 && (iArr5 == null || iArr6 == null || iArr5.length != length || iArr6.length != length)) || (i2 != 0 && c3771.m12242() != z2)) {
            throw new IllegalArgumentException("Checkpoint context columns differ from program");
        }
        if (c3771.m12243()) {
            for (int i6 = 0; i6 < i5; i6++) {
                C12831[] c12831Arr2 = c3771.f12939;
                C12831 c12831 = c12831Arr2 == null ? null : c12831Arr2[i6];
                if (c12831 != null && c12831.m31855() != i) {
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
            C12831 c12832 = c12831Arr[i7];
            if (c12832 == null) {
                throw new NullPointerException(C14442.m34864(i7, "dependencies[", "]"));
            }
            if (c12832.m31855() != i) {
                throw new IllegalArgumentException("Checkpoint dependency length differs");
            }
            C17359.checkIndex(iArr4[i7], i5);
            if (z2 && (iArr5[i7] < 1 || iArr6[i7] < 0)) {
                throw new IllegalArgumentException("Invalid syntax checkpoint context state");
            }
            i7++;
            i8 = i9;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20925 m47780(C20661 c20661, int i, boolean z) {
        int[] iArr = f66944;
        return new C20925(c20661, i, 0, iArr, iArr, iArr, iArr, null, null, f66945, f66946, z);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m47798() {
        return this.f66954;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m47830() {
        return this.f66955;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m47812(int i) {
        return this.f66952[C17359.checkIndex(i, this.f66955)];
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m47818(int i) {
        return this.f66958.f12928[this.f66951[C17359.checkIndex(i, this.f66955)]];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m47822() {
        return this.f66958.f12918;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m47811() {
        C3771 c3771 = this.f66958;
        return C3771.m12241(c3771.m12243(), c3771.m12242());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47793() {
        return this.f66952.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47796(C22528 c22528, int i) {
        int[] iArr;
        C17359.requireNonNull(c22528, "changes");
        if (c22528.m50762() != this.f66954) {
            throw new IllegalArgumentException("Checkpoint index and change set lengths differ");
        }
        if (this.f66947 || c22528.m50760()) {
            return -1;
        }
        int iM50764 = c22528.m50764();
        int i2 = this.f66955 - 1;
        int i3 = 0;
        while (true) {
            iArr = this.f66952;
            if (i3 > i2) {
                break;
            }
            int i4 = (i3 + i2) >>> 1;
            if (iArr[i4] < iM50764) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i2 >= 0 && iArr[i2] > i) {
            int iM47820 = m47820(i2);
            int[] iArr2 = this.f66958.f12916;
            int i5 = iArr2 == null ? 0 : iArr2[iM47820];
            if ((i5 & 8) == 0 || (i5 & 16) != 0) {
                C12831 c12831 = this.f66957[i2];
                if (this.f66953[i2] == i && c12831.m31854() == EnumC19544.COMPLETE && !c12831.m31852(c22528)) {
                    return i2;
                }
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47795(C20661 c20661, int i) {
        C17359.requireNonNull(c20661, "expectedProgram");
        if (this.f66949 != c20661) {
            return -1;
        }
        C17359.checkFromToIndex(i, i, this.f66954);
        int i2 = this.f66955 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f66952[i4] <= i) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i2 >= 0) {
            int iM47820 = m47820(i2);
            int[] iArr = this.f66958.f12916;
            int i5 = iArr == null ? 0 : iArr[iM47820];
            if (((i5 & 8) == 0 || (i5 & 16) != 0) && this.f66957[i2].m31854() == EnumC19544.COMPLETE) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m47823(int i) {
        return this.f66953[C17359.checkIndex(i, this.f66955)];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20661 m47807() {
        return this.f66949;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m47828() {
        return this.f66947;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m47816(int i) {
        int iM47820 = m47820(i);
        int[] iArr = this.f66958.f12916;
        return ((iArr == null ? 0 : iArr[iM47820]) & 8) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m47806(int i) {
        return this.f66950[C17359.checkIndex(i, this.f66955)];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12831 m47831(int i) {
        return this.f66957[C17359.checkIndex(i, this.f66955)];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m47820(int i) {
        return this.f66951[C17359.checkIndex(i, this.f66955)];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m47827(int i) {
        C17359.checkIndex(i, this.f66955);
        int[] iArr = this.f66956;
        if (iArr == null) {
            return 1;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47794(int i) {
        C17359.checkIndex(i, this.f66955);
        int[] iArr = this.f66948;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m47801(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12919[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47821(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12940[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m47813(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12933[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m47788(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12927[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int m47797(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12922[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m47826(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12935[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int m47808(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12921[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int m47829(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12910[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m47805(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12914[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m47804(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12936[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int m47832(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12912[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int m47824(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12920[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47789(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12923[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m47790(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12932[C17359.checkIndex(i, c3771.f12918)];
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m47803(int i) {
        C3771 c3771 = this.f66958;
        return c3771.f12909[C17359.checkIndex(i, c3771.f12918)];
    }

    public final boolean equals(Object obj) {
        boolean zM47785;
        boolean zM47786;
        if (this != obj) {
            if (obj instanceof C20925) {
                C20925 c20925 = (C20925) obj;
                C12831[] c12831Arr = c20925.f66957;
                if (this.f66949 == c20925.f66949 && this.f66954 == c20925.f66954) {
                    int i = c20925.f66955;
                    int i2 = this.f66955;
                    if (i2 == i && this.f66947 == c20925.f66947 && m47785(i2, this.f66952, c20925.f66952) && m47785(i2, this.f66953, c20925.f66953) && m47785(i2, this.f66950, c20925.f66950) && m47785(i2, this.f66951, c20925.f66951)) {
                        int[] iArr = c20925.f66956;
                        int[] iArr2 = this.f66956;
                        if (iArr2 == null || iArr == null) {
                            zM47785 = iArr2 == iArr;
                        } else {
                            zM47785 = m47785(i2, iArr2, iArr);
                        }
                        if (zM47785) {
                            int[] iArr3 = c20925.f66948;
                            int[] iArr4 = this.f66948;
                            if (iArr4 == null || iArr3 == null) {
                                zM47786 = iArr4 == iArr3;
                            } else {
                                zM47786 = m47785(i2, iArr4, iArr3);
                            }
                            if (zM47786 && this.f66958.equals(c20925.f66958) && i2 <= c12831Arr.length) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if (m47786(this.f66957[i3], c12831Arr[i3])) {
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
        int iIdentityHashCode = ((((System.identityHashCode(this.f66949) * 31) + this.f66954) * 31) + (this.f66947 ? 1231 : 1237)) * 31;
        int i = this.f66955;
        int iM47783 = (((((((((iIdentityHashCode + i) * 31) + m47783(i, this.f66952)) * 31) + m47783(i, this.f66953)) * 31) + m47783(i, this.f66950)) * 31) + m47783(i, this.f66951)) * 31;
        int[] iArr = this.f66956;
        int iM47784 = (iM47783 + (iArr == null ? 0 : m47783(i, iArr))) * 31;
        int[] iArr2 = this.f66948;
        int iM47785 = ((iM47784 + (iArr2 == null ? 0 : m47783(i, iArr2))) * 31) + this.f66958.hashCode();
        for (int i2 = 0; i2 < i; i2++) {
            iM47785 = (iM47785 * 31) + m47784(this.f66957[i2]);
        }
        return iM47785;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m47785(int i, int[] iArr, int[] iArr2) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m47783(int i, int[] iArr) {
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m47786(C12831 c12831, C12831 c12832) {
        return c12831.m31855() == c12832.m31855() && c12831.m31856() == c12832.m31856() && c12831.m31857() == c12832.m31857() && c12831.m31858() == c12832.m31858() && c12831.m31849() == c12832.m31849() && c12831.m31860() == c12832.m31860() && c12831.m31854() == c12832.m31854();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m47784(C12831 c12831) {
        return c12831.m31854().hashCode() + ((((c12831.m31849() + ((c12831.m31858() + ((c12831.m31857() + ((c12831.m31856() + (c12831.m31855() * 31)) * 31)) * 31)) * 31)) * 31) + (c12831.m31860() ? 1231 : 1237)) * 31);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m47787(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12925;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m47791(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12924;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12831 m47792(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        C12831[] c12831Arr = c3771.f12939;
        if (c12831Arr == null) {
            return null;
        }
        return c12831Arr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m47799(int i) {
        C3771 c3771 = this.f66958;
        C17359.checkIndex(i, c3771.f12918);
        return ((((long) c3771.f12915[i]) & 4294967295L) << 32) | (4294967295L & ((long) c3771.f12937[i]));
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m47800(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12931;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m47802(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12917;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47809(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12938;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m47810(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12930;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m47814(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12913;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m47817(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12916;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m47819(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12926;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m47825(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12941;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m47833(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12911;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m47834(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12929;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m47835(int i) {
        C3771 c3771 = this.f66958;
        int iCheckIndex = C17359.checkIndex(i, c3771.f12918);
        int[] iArr = c3771.f12934;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m47815() {
        C3771 c3771 = this.f66958;
        long length = ((long) c3771.f12919.length) * ((long) C3771.m12241(c3771.m12243(), c3771.m12242()));
        int i = (int) length;
        if (length == i) {
            return i;
        }
        throw new ArithmeticException();
    }
}
