package l;

/* JADX INFO: renamed from: l.ۧ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10874 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f36973;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f36974 = new int[128];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717[] f36975;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f36976;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f36977;

    public C10874(InterfaceC13717[] interfaceC13717Arr, int[] iArr, int i, int i2) {
        this.f36975 = interfaceC13717Arr;
        this.f36973 = iArr;
        this.f36976 = i;
        this.f36977 = i2;
        for (int i3 = 0; i3 < this.f36974.length; i3++) {
            for (int i4 = 0; i4 < interfaceC13717Arr.length; i4++) {
                if (interfaceC13717Arr[i4].mo1813(i3)) {
                    this.f36974[i3] = iArr[i4];
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10874 m27243(C17244 c17244) {
        int i;
        C23595 c23595;
        C23595 c23596;
        C23595 c23597;
        int i2;
        C23595 c23598;
        C10189 c10189;
        C23595 c23599;
        C23595 c235910;
        C10189 c101810;
        int i3;
        if (c17244 == null) {
            return null;
        }
        int i4 = c17244.f54945;
        int i5 = c17244.f54944;
        if (c17244.getClass() != C17244.class || (i = c17244.f54942) < 0 || c17244.f54941 < i || c17244.f54940 < -1 || i5 < 0 || i4 < 0 || i5 == i4 || (c23595 = c17244.f76439) == null || c23595.getClass() != C20772.class || (c23596 = c17244.f54943) == null || c23596.getClass() != C8778.class) {
            return null;
        }
        C8778 c8778 = (C8778) c17244.f54943;
        boolean z = c8778.f30196;
        int i6 = c8778.f30197;
        if (!z || i6 != i5 || (c23597 = c8778.f76439) == null || c23597.getClass() != C14732.class) {
            return null;
        }
        C14732 c14732 = (C14732) c8778.f76439;
        C23595[] c23595Arr = c14732.f48161;
        C23595 c235911 = c14732.f48159;
        if (c23595Arr == null || (i2 = c14732.f48160) < 1 || i2 > c23595Arr.length || c235911 == null || c235911.getClass() != C2030.class || (c23598 = c235911.f76439) == null || c23598.getClass() != C10189.class || c8778.f30195 != (c10189 = (C10189) c235911.f76439) || !c10189.f34813 || c10189.f34815 != 0 || c10189.f34814 != i6 || c10189.f76439 != c17244) {
            return null;
        }
        int i7 = c14732.f48160;
        InterfaceC13717[] interfaceC13717Arr = new InterfaceC13717[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < c14732.f48160; i8++) {
            C23595 c235912 = c14732.f48161[i8];
            if (c235912 == null) {
                return null;
            }
            if (c235912.getClass() != C8778.class && c235912.getClass() != C17553.class) {
                return null;
            }
            C8778 c8779 = (C8778) c235912;
            int i9 = c8779.f30197;
            if (!c8779.f30196 || i9 < 0 || i9 == i5 || i9 == i4 || (c23599 = c8779.f76439) == null || c23599.getClass() != C0619.class) {
                return null;
            }
            C1015 c1015 = (C1015) c8779.f76439;
            if (c1015.f4704 == null || (c235910 = c1015.f76439) == null || c235910.getClass() != C10189.class || c8779.f30195 != (c101810 = (C10189) c1015.f76439) || !c101810.f34813 || c101810.f34814 != i9 || (i3 = c101810.f34815) <= 0 || (i3 & 1) != 0 || c101810.f76439 != c235911) {
                return null;
            }
            interfaceC13717Arr[i8] = c1015.f4704;
            iArr[i8] = i3;
        }
        return new C10874(interfaceC13717Arr, iArr, c17244.f54942, c17244.f54941);
    }
}
