package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4657 extends AbstractC5491 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f16453;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4657(ActivityC13125 activityC13125, ActivityC13125 activityC13126, boolean z) {
        super(activityC13126, z);
        this.f16453 = activityC13125;
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ */
    public final void mo6920(C2668 c2668, String str) {
        int[] iArr = C14186.f46539;
        ActivityC13125 activityC13125 = this.f16453;
        int i = iArr[activityC13125.f43713.m4162().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            activityC13125.f43713.getClass();
            C1129 c1129 = activityC13125.f43713;
            c1129.f5095 = true;
            if (c1129.f5076.length < c1129.f5085.mo7647()) {
                C1129 c11210 = activityC13125.f43713;
                c11210.f5076 = new int[c11210.f5085.mo7647()];
            }
            activityC13125.f43713.f5078 = 0;
            for (int i2 = 0; i2 < activityC13125.f43713.f5085.mo7647(); i2++) {
                C16435 value = activityC13125.f43713.f5085.getValue(i2);
                String strM42708 = C18418.m42708(activityC13125.f43713.f5092, value.mo25192(), value.getValue(), null);
                if (strM42708 != null && c2668.m8214(strM42708)) {
                    C1129 c11211 = activityC13125.f43713;
                    int[] iArr2 = c11211.f5076;
                    int i3 = c11211.f5078;
                    c11211.f5078 = i3 + 1;
                    iArr2[i3] = i2;
                } else if (c2668.m8214(activityC13125.f43713.f5097.m16375(value.mo25193()))) {
                    C1129 c11212 = activityC13125.f43713;
                    int[] iArr3 = c11212.f5076;
                    int i4 = c11212.f5078;
                    c11212.f5078 = i4 + 1;
                    iArr3[i4] = i2;
                }
            }
        } else if (i == 4) {
            C1129 c11213 = activityC13125.f43713;
            c11213.f5079 = str;
            c11213.f5073 = true;
            if (c11213.f5084.length < c11213.f5092.size()) {
                C1129 c11214 = activityC13125.f43713;
                c11214.f5084 = new int[c11214.f5092.size()];
            }
            C1129 c11215 = activityC13125.f43713;
            c11215.f5075 = 0;
            int size = c11215.f5092.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (c2668.m8214(activityC13125.f43713.f5092.m10939(i5))) {
                    C1129 c11216 = activityC13125.f43713;
                    int[] iArr4 = c11216.f5084;
                    int i6 = c11216.f5075;
                    c11216.f5075 = i6 + 1;
                    iArr4[i6] = i5;
                }
            }
        } else if (i == 5) {
            C1129 c11217 = activityC13125.f43713;
            c11217.f5079 = str;
            c11217.f5073 = true;
            if (c11217.f5084.length < c11217.f5082.size()) {
                C1129 c11218 = activityC13125.f43713;
                c11218.f5084 = new int[c11218.f5082.size()];
            }
            activityC13125.f43713.f5075 = 0;
            for (int i7 = 0; i7 < activityC13125.f43713.f5082.size(); i7++) {
                C18551 c18551 = (C18551) activityC13125.f43713.f5082.get(i7);
                if (c2668.m8214(c18551.mo7645())) {
                    C1129 c11219 = activityC13125.f43713;
                    int[] iArr5 = c11219.f5084;
                    int i8 = c11219.f5075;
                    c11219.f5075 = i8 + 1;
                    iArr5[i8] = i7;
                } else if (c2668.m8214(String.format("%04X", Integer.valueOf(c18551.mo10691())))) {
                    C1129 c11220 = activityC13125.f43713;
                    int[] iArr6 = c11220.f5084;
                    int i9 = c11220.f5075;
                    c11220.f5075 = i9 + 1;
                    iArr6[i9] = i7;
                } else if (!activityC13125.f43713.f5083.getTypeName().equals("id")) {
                    if (c18551.mo7644() && activityC13125.f43713.f5083.getTypeName().equals("style") && c18551.getParent() != 0 && c2668.m8214(activityC13125.f43713.f5097.m16375(c18551.getParent()))) {
                        C1129 c11221 = activityC13125.f43713;
                        int[] iArr7 = c11221.f5084;
                        int i10 = c11221.f5075;
                        c11221.f5075 = i10 + 1;
                        iArr7[i10] = i7;
                    } else {
                        for (int i11 = 0; i11 < c18551.mo7647(); i11++) {
                            C16435 value2 = c18551.getValue(i11);
                            String strM42709 = C18418.m42708(activityC13125.f43713.f5092, value2.mo25192(), value2.getValue(), null);
                            if (strM42709 != null && c2668.m8214(strM42709)) {
                                C1129 c11222 = activityC13125.f43713;
                                int[] iArr8 = c11222.f5084;
                                int i12 = c11222.f5075;
                                c11222.f5075 = i12 + 1;
                                iArr8[i12] = i7;
                                break;
                            }
                        }
                    }
                }
            }
        }
        activityC13125.setTitle(activityC13125.getString(R.string.MT_Protector, str));
        activityC13125.f43711.notifyDataSetChanged();
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ */
    public final void mo6919() {
        int[] iArr = C14186.f46539;
        ActivityC13125 activityC13125 = this.f16453;
        int i = iArr[activityC13125.f43713.m4162().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C1129 c1129 = activityC13125.f43713;
            c1129.f5095 = false;
            activityC13125.setTitle(c1129.f5085.mo7645());
        } else if (i == 4) {
            activityC13125.f43713.f5073 = false;
            activityC13125.m31016(R.string.MT_Protector);
        } else if (i == 5) {
            C1129 c11210 = activityC13125.f43713;
            c11210.f5073 = false;
            activityC13125.setTitle(c11210.f5090.mo31755());
        }
        activityC13125.f43711.notifyDataSetChanged();
    }
}
