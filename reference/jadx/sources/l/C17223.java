package l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܿ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6VE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17223 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f54886 = new int[0];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[][] f54887;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12285 f54888;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12285 f54889;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[][] f54890;

    public C17223(C12285 c12285, C12285 c12286, int[][] iArr, int[][] iArr2) {
        this.f54889 = c12285;
        this.f54888 = c12286;
        this.f54887 = iArr;
        this.f54890 = iArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17223 m40163(C23904 c23904) {
        C23595 c23595M40164;
        int i;
        C23595 c23595M40165;
        int[] iArr;
        if (c23904 == null || (c23595M40164 = m40164(c23904.f76439)) == null || c23595M40164.getClass() != C14732.class) {
            return null;
        }
        C14732 c14732 = (C14732) c23595M40164;
        C23595 c23595 = c14732.f48159;
        C23595[] c23595Arr = c14732.f48161;
        if (c23595Arr == null || (i = c14732.f48160) < 2 || i > c23595Arr.length || c23595 == null || c23595.getClass() != C2030.class || (c23595M40165 = m40164(c23595.f76439)) == null || c23595M40165.getClass() != C23904.class) {
            return null;
        }
        C23904 c23905 = (C23904) c23595M40165;
        C23595 c23595M40166 = m40164(c23905.f76439);
        if (c23595M40166 == null || c23595M40166.getClass() != C20772.class) {
            return null;
        }
        int i2 = c14732.f48160;
        int[][] iArr2 = new int[i2][];
        int[] iArr3 = new int[128];
        for (int i3 = 0; i3 < c14732.f48160; i3++) {
            C23595 c23596 = c14732.f48161[i3];
            if (c23596 == null || c23596.getClass() != C6701.class || c23596.f76439 != c23595 || (iArr = ((C6701) c23596).f69912) == null || iArr.length == 0) {
                return null;
            }
            for (int i4 : iArr) {
                if (i4 < 0 || i4 > 65535) {
                    return null;
                }
            }
            iArr2[i3] = (int[]) iArr.clone();
            int i5 = iArr[0];
            if (i5 < 128) {
                iArr3[i5] = iArr3[i5] + 1;
            }
        }
        int[][] iArr4 = new int[128][];
        for (int i6 = 0; i6 < 128; i6++) {
            int i7 = iArr3[i6];
            iArr4[i6] = i7 == 0 ? f54886 : new int[i7];
            iArr3[i6] = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = iArr2[i8][0];
            if (i9 < 128) {
                int[] iArr5 = iArr4[i9];
                int i10 = iArr3[i9];
                iArr3[i9] = i10 + 1;
                iArr5[i10] = i8;
            }
        }
        return new C17223(new C12285(c23904.f77456, c23904.f77455), new C12285(c23905.f77456, c23905.f77455), iArr2, iArr4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23595 m40164(C23595 c23595) {
        C10189 c10189;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        while (c23595 != null) {
            if (c23595.getClass() == C8778.class) {
                C8778 c8778 = (C8778) c23595;
                if (c8778.f30196 || (c10189 = c8778.f30195) == null || c10189.f34813 || c10189.f34815 != 0 || c8778.f30197 != c10189.f34814) {
                    return null;
                }
            } else {
                if (c23595.getClass() != C10189.class) {
                    return c23595;
                }
                C10189 c101810 = (C10189) c23595;
                if (c101810.f34813 || c101810.f34815 != 0) {
                    return null;
                }
            }
            if (identityHashMap.put(c23595, Boolean.TRUE) != null) {
                return null;
            }
            c23595 = c23595.f76439;
        }
        return null;
    }
}
