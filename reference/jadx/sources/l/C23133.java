package l;

/* JADX INFO: renamed from: l.᩸᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06VH */
/* JADX INFO: loaded from: classes.dex */
public final class C23133 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11198 f75006;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f75007;

    public C23133(int i, C11198 c11198) {
        this.f75007 = i;
        this.f75006 = c11198;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23133 m52061(int[] iArr, Object[] objArr, int i, int i2, C0407 c0407, C0407 c0408, boolean z) {
        C11198 c11198;
        int[] iArr2;
        if (z || c0407 == null || c0407.getClass() != C16640.class || c0407.f1952 != c0408 || ((C16640) c0407).f53784 <= 0 || i != i2 || iArr[i] != 6 || (iArr2 = (c11198 = (C11198) objArr[iArr[i + 2]]).f35333) == null || c11198.f35335 != null || c11198.f35334.length < 2) {
            return null;
        }
        for (int i3 : iArr2) {
            if ((i3 & (i3 - 1)) != 0) {
                return null;
            }
        }
        for (int i4 = 0; i4 < iArr.length; i4 += 8) {
            switch (iArr[i4]) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                case 11:
                case 12:
                case 13:
                    break;
                case 2:
                case 5:
                case 9:
                case 10:
                default:
                    return null;
            }
        }
        return new C23133(i, c11198);
    }
}
