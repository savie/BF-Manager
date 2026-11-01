package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88HU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3257 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f12100;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f12101;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f12102;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12103;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f12104;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f12105;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f12106;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f12107;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f12108;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f12109;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f12110;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float f12111;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3257 m9737(C2460 c2460) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            c2460.m7535(4);
            int iM7516 = (c2460.m7516() & 3) + 1;
            if (iM7516 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM7517 = c2460.m7516() & 31;
            for (int i9 = 0; i9 < iM7517; i9++) {
                int iM7519 = c2460.m7519();
                int iM7500 = c2460.m7500();
                c2460.m7535(iM7519);
                arrayList.add(C2419.m7351(iM7500, iM7519, c2460.m7518()));
            }
            int iM7518 = c2460.m7516();
            for (int i10 = 0; i10 < iM7518; i10++) {
                int iM75110 = c2460.m7519();
                int iM7501 = c2460.m7500();
                c2460.m7535(iM75110);
                arrayList.add(C2419.m7351(iM7501, iM75110, c2460.m7518()));
            }
            if (iM7517 > 0) {
                C13668 c13668M28857 = C11551.m28857(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i11 = c13668M28857.f45077;
                int i12 = c13668M28857.f45074;
                int i13 = c13668M28857.f45080 + 8;
                int i14 = c13668M28857.f45072 + 8;
                int i15 = c13668M28857.f45070;
                int i16 = c13668M28857.f45078;
                int i17 = c13668M28857.f45073;
                int i18 = c13668M28857.f45081;
                float f2 = c13668M28857.f45083;
                int i19 = c13668M28857.f45075;
                int i20 = c13668M28857.f45086;
                int i21 = c13668M28857.f45087;
                int i22 = C2419.f9699;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf(i21));
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new C3257(arrayList, iM7516, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C22861.m50610("Error parsing AVC config", e);
        }
    }

    public C3257(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f12107 = arrayList;
        this.f12105 = i;
        this.f12109 = i2;
        this.f12100 = i3;
        this.f12108 = i4;
        this.f12103 = i5;
        this.f12104 = i6;
        this.f12101 = i7;
        this.f12110 = i8;
        this.f12102 = i9;
        this.f12111 = f;
        this.f12106 = str;
    }
}
