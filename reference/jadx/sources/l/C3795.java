package l;

/* JADX INFO: renamed from: l.ۘ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06VH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3795 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12969 f13676;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f13677;

    public C3795(int i, C12969 c12969) {
        this.f13677 = i;
        this.f13676 = c12969;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3795 m11039(int[] iArr, Object[] objArr, int i, int i2, C23595 c23595, C23595 c23596, boolean z) {
        C12969 c12969;
        int[] iArr2;
        if (z || c23595 == null || c23595.getClass() != C19402.class || c23595.f76439 != c23596 || ((C19402) c23595).f62544 <= 0 || i != i2 || iArr[i] != 6 || (iArr2 = (c12969 = (C12969) objArr[iArr[i + 2]]).f43077) == null || c12969.f43079 != null || c12969.f43078.length < 2) {
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
        return new C3795(i, c12969);
    }
}
