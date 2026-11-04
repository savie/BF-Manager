package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2677 extends AbstractC24700 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f8513;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2677(ActivityC22597 activityC22597, ActivityC22597 activityC22598, boolean z) {
        super(activityC22598, z);
        this.f8513 = activityC22597;
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8146(C11273 c11273, String str) {
        int[] iArr = C19085.f61800;
        ActivityC22597 activityC22597 = this.f8513;
        int i = iArr[activityC22597.f73046.m27171().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            activityC22597.f73046.getClass();
            C10662 c10662 = activityC22597.f73046;
            c10662.f33820 = true;
            if (c10662.f33805.length < c10662.f33815.mo18154()) {
                C10662 c10663 = activityC22597.f73046;
                c10663.f33805 = new int[c10663.f33815.mo18154()];
            }
            activityC22597.f73046.f33803 = 0;
            for (int i2 = 0; i2 < activityC22597.f73046.f33815.mo18154(); i2++) {
                C3609 value = activityC22597.f73046.f33815.getValue(i2);
                String strM41256 = C17593.m41256(activityC22597.f73046.f33813, value.mo16635(), value.getValue(), null);
                if (strM41256 != null && c11273.m28527(strM41256)) {
                    C10662 c10664 = activityC22597.f73046;
                    int[] iArr2 = c10664.f33805;
                    int i3 = c10664.f33803;
                    c10664.f33803 = i3 + 1;
                    iArr2[i3] = i2;
                } else if (c11273.m28527(activityC22597.f73046.f33807.m48430(value.mo16637()))) {
                    C10662 c10665 = activityC22597.f73046;
                    int[] iArr3 = c10665.f33805;
                    int i4 = c10665.f33803;
                    c10665.f33803 = i4 + 1;
                    iArr3[i4] = i2;
                }
            }
        } else if (i == 4) {
            C10662 c10666 = activityC22597.f73046;
            c10666.f33808 = str;
            c10666.f33817 = true;
            if (c10666.f33801.length < c10666.f33813.size()) {
                C10662 c10667 = activityC22597.f73046;
                c10667.f33801 = new int[c10667.f33813.size()];
            }
            C10662 c10668 = activityC22597.f73046;
            c10668.f33819 = 0;
            int size = c10668.f33813.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (c11273.m28527(activityC22597.f73046.f33813.m15441(i5))) {
                    C10662 c10669 = activityC22597.f73046;
                    int[] iArr4 = c10669.f33801;
                    int i6 = c10669.f33819;
                    c10669.f33819 = i6 + 1;
                    iArr4[i6] = i5;
                }
            }
        } else if (i == 5) {
            C10662 c106610 = activityC22597.f73046;
            c106610.f33808 = str;
            c106610.f33817 = true;
            if (c106610.f33801.length < c106610.f33800.size()) {
                C10662 c106611 = activityC22597.f73046;
                c106611.f33801 = new int[c106611.f33800.size()];
            }
            activityC22597.f73046.f33819 = 0;
            for (int i7 = 0; i7 < activityC22597.f73046.f33800.size(); i7++) {
                C13304 c13304 = (C13304) activityC22597.f73046.f33800.get(i7);
                if (c11273.m28527(c13304.mo18156())) {
                    C10662 c106612 = activityC22597.f73046;
                    int[] iArr5 = c106612.f33801;
                    int i8 = c106612.f33819;
                    c106612.f33819 = i8 + 1;
                    iArr5[i8] = i7;
                } else if (c11273.m28527(String.format("%04X", Integer.valueOf(c13304.mo23383())))) {
                    C10662 c106613 = activityC22597.f73046;
                    int[] iArr6 = c106613.f33801;
                    int i9 = c106613.f33819;
                    c106613.f33819 = i9 + 1;
                    iArr6[i9] = i7;
                } else if (!activityC22597.f73046.f33816.getTypeName().equals("id")) {
                    if (c13304.mo18155() && activityC22597.f73046.f33816.getTypeName().equals("style") && c13304.getParent() != 0 && c11273.m28527(activityC22597.f73046.f33807.m48430(c13304.getParent()))) {
                        C10662 c106614 = activityC22597.f73046;
                        int[] iArr7 = c106614.f33801;
                        int i10 = c106614.f33819;
                        c106614.f33819 = i10 + 1;
                        iArr7[i10] = i7;
                    } else {
                        for (int i11 = 0; i11 < c13304.mo18154(); i11++) {
                            C3609 value2 = c13304.getValue(i11);
                            String strM41257 = C17593.m41256(activityC22597.f73046.f33813, value2.mo16635(), value2.getValue(), null);
                            if (strM41257 != null && c11273.m28527(strM41257)) {
                                C10662 c106615 = activityC22597.f73046;
                                int[] iArr8 = c106615.f33801;
                                int i12 = c106615.f33819;
                                c106615.f33819 = i12 + 1;
                                iArr8[i12] = i7;
                                break;
                            }
                        }
                    }
                }
            }
        }
        activityC22597.setTitle(activityC22597.getString(R.string.MT_Protector, str));
        activityC22597.f73050.notifyDataSetChanged();
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8145() {
        int[] iArr = C19085.f61800;
        ActivityC22597 activityC22597 = this.f8513;
        int i = iArr[activityC22597.f73046.m27171().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C10662 c10662 = activityC22597.f73046;
            c10662.f33820 = false;
            activityC22597.setTitle(c10662.f33815.mo18156());
        } else if (i == 4) {
            activityC22597.f73046.f33817 = false;
            activityC22597.m40418(R.string.MT_Protector);
        } else if (i == 5) {
            C10662 c10663 = activityC22597.f73046;
            c10663.f33817 = false;
            activityC22597.setTitle(c10663.f33818.mo9077());
        }
        activityC22597.f73050.notifyDataSetChanged();
    }
}
