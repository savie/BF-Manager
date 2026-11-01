package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩸ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21377 extends AbstractC18555 {
    @Override // l.AbstractC18555
    /* JADX INFO: renamed from: ۙ */
    public final int mo41439(EnumC0707 enumC0707, int i, int i2, C20464 c20464, C20464 c20465) {
        Integer numM47917 = m47917(enumC0707, i, i2, c20465, 0);
        if (numM47917 != null) {
            return numM47917.intValue();
        }
        Integer numM47918 = m47918(enumC0707, i, i2, c20464, c20465, 0);
        if (numM47918 != null) {
            return numM47918.intValue();
        }
        Integer numM47919 = m47917(enumC0707, i, i2, c20465, 3);
        if (numM47919 != null) {
            return numM47919.intValue();
        }
        Integer numM479110 = m47918(enumC0707, i, i2, c20464, c20465, 3);
        if (numM479110 != null) {
            return numM479110.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Integer m47917(EnumC0707 enumC0707, int i, int i2, C20464 c20464, int i3) {
        List list = (List) enumC0707.m3110((Object) this.f59034, (Object) this.f59036);
        C13638.requireNonNull(list);
        int iM3117 = enumC0707.m3117(c20464.f66401, c20464.f66399);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C1538) list.get(iM3117 + i5)).m5313() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = iM3117 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C1538) list.get(i6 - i8)).m5313() <= i3) {
                break;
            }
            i8++;
        }
        if (i5 == -1 && i8 == -1) {
            return null;
        }
        if (i5 == 0 || i8 == 0) {
            return 0;
        }
        if (i5 == -1) {
            i5 = -i8;
        }
        return Integer.valueOf(i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Integer m47918(EnumC0707 enumC0707, int i, int i2, C20464 c20464, C20464 c20465, int i3) {
        EnumC0707 enumC0707M3124 = enumC0707.m3124();
        List list = (List) enumC0707M3124.m3110((Object) this.f59034, (Object) this.f59036);
        C13638.requireNonNull(list);
        int iM3117 = enumC0707M3124.m3117(c20464.f66400, c20464.f66402);
        int iM3118 = enumC0707M3124.m3117(c20465.f66401, c20465.f66399);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C1538) list.get(iM3117 + i5)).m5313() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = iM3118 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C1538) list.get(i6 - i8)).m5313() <= i3) {
                break;
            }
            i8++;
        }
        if (i5 == -1 && i8 == -1) {
            return null;
        }
        if (i5 == 0 || i8 == 0) {
            return 0;
        }
        if (i5 == -1) {
            i5 = -i8;
        }
        return Integer.valueOf(i5);
    }
}
