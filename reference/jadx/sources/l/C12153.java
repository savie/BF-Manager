package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88HU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12153 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f39064;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f39065;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39066;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f39067;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f39068;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f39069;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f39070;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f39071;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f39072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f39073;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f39074;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f39075;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12153 m30362(C21287 c21287) {
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
            c21287.m48503(4);
            int iM48493 = (c21287.m48493() & 3) + 1;
            if (iM48493 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM48494 = c21287.m48493() & 31;
            for (int i9 = 0; i9 < iM48494; i9++) {
                int iM48495 = c21287.m48494();
                int iM48516 = c21287.m48516();
                c21287.m48503(iM48495);
                arrayList.add(C21528.m48972(iM48516, iM48495, c21287.m48497()));
            }
            int iM48496 = c21287.m48493();
            for (int i10 = 0; i10 < iM48496; i10++) {
                int iM48497 = c21287.m48494();
                int iM48517 = c21287.m48516();
                c21287.m48503(iM48497);
                arrayList.add(C21528.m48972(iM48517, iM48497, c21287.m48497()));
            }
            if (iM48494 > 0) {
                C3959 c3959M34830 = C14399.m34830(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i11 = c3959M34830.f13510;
                int i12 = c3959M34830.f13512;
                int i13 = c3959M34830.f13521 + 8;
                int i14 = c3959M34830.f13508 + 8;
                int i15 = c3959M34830.f13522;
                int i16 = c3959M34830.f13511;
                int i17 = c3959M34830.f13519;
                int i18 = c3959M34830.f13517;
                float f2 = c3959M34830.f13523;
                int i19 = c3959M34830.f13507;
                int i20 = c3959M34830.f13515;
                int i21 = c3959M34830.f13524;
                int i22 = C21528.f68786;
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
            return new C12153(arrayList, iM48493, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C2970.m9688("Error parsing AVC config", e);
        }
    }

    public C12153(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f39066 = arrayList;
        this.f39068 = i;
        this.f39071 = i2;
        this.f39069 = i3;
        this.f39073 = i4;
        this.f39065 = i5;
        this.f39072 = i6;
        this.f39074 = i7;
        this.f39070 = i8;
        this.f39064 = i9;
        this.f39075 = f;
        this.f39067 = str;
    }
}
