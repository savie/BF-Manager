package l;

/* JADX INFO: renamed from: l.ܿۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6VP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f59080 = new int[128];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f59081;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885[] f59082;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f59083;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f59084;

    public C18044(InterfaceC2885[] interfaceC2885Arr, int[] iArr, int i, int i2) {
        this.f59082 = interfaceC2885Arr;
        this.f59084 = iArr;
        this.f59081 = i;
        this.f59083 = i2;
        for (int i3 = 0; i3 < this.f59080.length; i3++) {
            for (int i4 = 0; i4 < interfaceC2885Arr.length; i4++) {
                if (interfaceC2885Arr[i4].mo1303(i3)) {
                    this.f59080[i3] = iArr[i4];
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18044 m42052(C14576 c14576) {
        int i;
        C0407 c0407;
        C0407 c0408;
        C0407 c0409;
        int i2;
        C0407 c04010;
        C16068 c16068;
        C0407 c04011;
        C0407 c04012;
        C16068 c16069;
        int i3;
        if (c14576 == null) {
            return null;
        }
        int i4 = c14576.f45931;
        int i5 = c14576.f45933;
        if (c14576.getClass() != C14576.class || (i = c14576.f45932) < 0 || c14576.f45934 < i || c14576.f45930 < -1 || i5 < 0 || i4 < 0 || i5 == i4 || (c0407 = c14576.f1952) == null || c0407.getClass() != C3390.class || (c0408 = c14576.f45929) == null || c0408.getClass() != C17560.class) {
            return null;
        }
        C17560 c17560 = (C17560) c14576.f45929;
        boolean z = c17560.f57061;
        int i6 = c17560.f57062;
        if (!z || i6 != i5 || (c0409 = c17560.f1952) == null || c0409.getClass() != C8106.class) {
            return null;
        }
        C8106 c8106 = (C8106) c17560.f1952;
        C0407[] c0407Arr = c8106.f26768;
        C0407 c04013 = c8106.f26771;
        if (c0407Arr == null || (i2 = c8106.f26769) < 1 || i2 > c0407Arr.length || c04013 == null || c04013.getClass() != C19293.class || (c04010 = c04013.f1952) == null || c04010.getClass() != C16068.class || c17560.f57063 != (c16068 = (C16068) c04013.f1952) || !c16068.f52070 || c16068.f52069 != 0 || c16068.f52068 != i6 || c16068.f1952 != c14576) {
            return null;
        }
        int i7 = c8106.f26769;
        InterfaceC2885[] interfaceC2885Arr = new InterfaceC2885[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < c8106.f26769; i8++) {
            C0407 c04014 = c8106.f26768[i8];
            if (c04014 == null) {
                return null;
            }
            if (c04014.getClass() != C17560.class && c04014.getClass() != C14817.class) {
                return null;
            }
            C17560 c17561 = (C17560) c04014;
            int i9 = c17561.f57062;
            if (!c17561.f57061 || i9 < 0 || i9 == i5 || i9 == i4 || (c04011 = c17561.f1952) == null || c04011.getClass() != C6615.class) {
                return null;
            }
            C22036 c22036 = (C22036) c17561.f1952;
            if (c22036.f71066 == null || (c04012 = c22036.f1952) == null || c04012.getClass() != C16068.class || c17561.f57063 != (c16069 = (C16068) c22036.f1952) || !c16069.f52070 || c16069.f52068 != i9 || (i3 = c16069.f52069) <= 0 || (i3 & 1) != 0 || c16069.f1952 != c04013) {
                return null;
            }
            interfaceC2885Arr[i8] = c22036.f71066;
            iArr[i8] = i3;
        }
        return new C18044(interfaceC2885Arr, iArr, c14576.f45932, c14576.f45934);
    }
}
