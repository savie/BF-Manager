package l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;

/* JADX INFO: renamed from: l.ۡᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9055 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۤ֡ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f30889 = {961, -24702, -24698, -24677, -24704, -24683, -24704, -24675, -24677, -24678};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Random f30890;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f30891;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30892;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f30893;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int iM11306;
        int i4;
        ObjectAnimator objectAnimator;
        String str;
        ObjectAnimator objectAnimator2;
        String str2;
        int i5;
        int iM450211;
        int i6;
        int i7;
        int i8;
        short[] sArr;
        int i9;
        String strM5047;
        float f;
        int iM450212;
        int i10;
        int i11;
        int iM11307;
        int i12;
        int i13;
        this = this;
        View view2 = view;
        int i14 = -654426232;
        int i15 = C3722.f13525;
        int i16 = C2871.f10837;
        int iM450213 = C19806.m45029("֡᩺") ^ i15;
        int i17 = ((iM450213 ^ i16) * 331) ^ (-128729595);
        int i18 = iM450213 ^ (-893994797);
        ObjectAnimator objectAnimator3 = null;
        String str3 = null;
        ObjectAnimator objectAnimatorM8649 = null;
        ObjectAnimator objectAnimatorM26816 = null;
        ObjectAnimator objectAnimatorM86410 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i19 = 0;
        boolean z = false;
        boolean z2 = false;
        int i20 = 0;
        float f2 = 0.0f;
        int i21 = 0;
        String strM18989 = null;
        float rotation = 0.0f;
        float f3 = 0.0f;
        float rotation2 = 0.0f;
        boolean z3 = false;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int iNextInt = 0;
        int i22 = 0;
        int i23 = 0;
        float[] fArr = null;
        boolean z4 = false;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * (-9665)) >> 31));
            switch (i14) {
                case -2138967404:
                case -1827315986:
                    this.f30891 = objectAnimatorM8649;
                    C0629.m2908(objectAnimatorM8649);
                    objectAnimatorM8649.setInterpolator(new DecelerateInterpolator());
                    this.f30893 = z;
                    iM11307 = C19806.m45029("۠ۘ") ^ i15;
                    i12 = ((iM11307 ^ i16) * 18741) ^ 1045806985;
                    i13 = 136418043;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    break;
                case -2135829248:
                case 1328160750:
                    objectAnimator = objectAnimatorM8649;
                    i19 = i19;
                    str = strM18989;
                    i22 = i22;
                    C2704.m8238(view2, str);
                    ObjectAnimator objectAnimator4 = this.f30891;
                    z2 = false;
                    z2 = false;
                    if (objectAnimator4 != null) {
                        int iM11308 = (ThreadFactoryC3888.m11306("ۜ۠") ^ i15) * (-111);
                        int i24 = ((iM11308 ^ i16) * (-5205)) ^ (-1648276559);
                        i18 = iM11308 ^ 1877886122;
                        strM18989 = str;
                        objectAnimator3 = objectAnimator4;
                        i22 = i22;
                        i17 = i24;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator;
                        z = true;
                    } else {
                        objectAnimator3 = objectAnimator4;
                        z = true;
                        int iM450214 = (i16 - C19806.m45029("ۚ᩷")) * (-107);
                        int i25 = ((iM450214 ^ i15) * 3871) ^ 997244540;
                        i18 = iM450214 ^ (-1069067102);
                        strM18989 = str;
                        i22 = i22;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator;
                        i17 = i25;
                        this = this;
                    }
                    break;
                case -2127534707:
                case -1013473655:
                    i19 = i19;
                    i22 = i22;
                    rotation2 = view.getRotation();
                    sArr3 = f30889;
                    i23 = 2;
                    if (C1977.m6356()) {
                        objectAnimatorM8649 = objectAnimatorM8649;
                        i20 = 2;
                        iM450210 = ThreadFactoryC3888.m11306("ۛܽ") ^ i16;
                        i17 = ((iM450210 ^ i15) * 4157) ^ (-1830197802);
                        i3 = -1284961735;
                        i18 = iM450210 ^ i3;
                        this = this;
                        i22 = i22;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimatorM8649;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("᩻ᩴ") + i16) * 63;
                        i18 = iM11309 ^ (-649814444);
                        i22 = i22;
                        i17 = ((iM11309 ^ i15) * 23621) ^ (-247354581);
                        i19 = i19;
                        i20 = 2;
                    }
                    break;
                case -2063993340:
                case 1285773089:
                    i22 = 54785;
                    int iM450215 = C19806.m45029("ۤ֨") ^ i15;
                    int i26 = ((iM450215 ^ i16) * 19159) ^ 1863406031;
                    i18 = iM450215 ^ (-129818860);
                    this = this;
                    strM18989 = strM18989;
                    i17 = i26;
                    i19 = i19;
                    objectAnimatorM8649 = objectAnimatorM8649;
                    break;
                case -2048668764:
                case 1516863305:
                    i19 = i19;
                    fArr = new float[i20];
                    fArr[z2 ? 1 : 0] = view.getRotation();
                    fArr[z ? 1 : 0] = f2;
                    if (C2871.f10837 < 0) {
                        iM450212 = (ThreadFactoryC3888.m11306("ۗܶ") + i15) * 17;
                        i10 = ((iM450212 ^ i16) * (-2219)) ^ 715271427;
                        i11 = -2010625913;
                        i18 = iM450212 ^ i11;
                        i17 = i10;
                        i19 = i19;
                    } else {
                        str2 = strM18989;
                        i5 = i22;
                        int iM113010 = (i16 - ThreadFactoryC3888.m11306("ܶܳ")) * 83;
                        i6 = ((iM113010 ^ i15) * (-30755)) ^ 761360479;
                        i18 = iM113010 ^ (-18317055);
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        i17 = i6;
                        view2 = view;
                    }
                    break;
                case -1897193375:
                case 1440633002:
                    C0671.m3008();
                    C1148.m4232();
                    objectAnimatorM8649 = objectAnimatorM8649;
                    i19 = i19;
                    i22 = i22;
                    iM450210 = ThreadFactoryC3888.m11306("ۛܽ") ^ i16;
                    i17 = ((iM450210 ^ i15) * 4157) ^ (-1830197802);
                    i3 = -1284961735;
                    i18 = iM450210 ^ i3;
                    this = this;
                    i22 = i22;
                    i19 = i19;
                    objectAnimatorM8649 = objectAnimatorM8649;
                    break;
                case -1781058674:
                case 2096187607:
                    z3 = true;
                    iM11306 = C19806.m45029("᩻ܳ") ^ i15;
                    i = ((iM11306 ^ i16) * 3641) ^ 929766746;
                    i4 = -1538429361;
                    i18 = iM11306 ^ i4;
                    i17 = i;
                    i22 = i22;
                    i19 = i19;
                    objectAnimatorM8649 = objectAnimatorM8649;
                    break;
                case -1627579392:
                case 131329063:
                    i19 = i19;
                    ObjectAnimator objectAnimator5 = this.f30891;
                    C0629.m2908(objectAnimator5);
                    objectAnimator5.cancel();
                    if (!this.f30893) {
                        objectAnimator = objectAnimatorM8649;
                        str = strM18989;
                        i22 = i22;
                        int iM450216 = (i16 - C19806.m45029("ۚ᩷")) * (-107);
                        int i27 = ((iM450216 ^ i15) * 3871) ^ 997244540;
                        i18 = iM450216 ^ (-1069067102);
                        strM18989 = str;
                        i22 = i22;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator;
                        i17 = i27;
                        this = this;
                    } else {
                        iM450212 = (i16 - C19806.m45029("ۗ᩶")) * 53;
                        i10 = ((iM450212 ^ i15) * (-8973)) ^ (-921077816);
                        i11 = 2004041318;
                        i18 = iM450212 ^ i11;
                        i17 = i10;
                        i19 = i19;
                    }
                    break;
                case -1618259995:
                case 26854263:
                    RunnableC1895.m6170();
                    C2249.m6915();
                    break;
                case -1611928646:
                case 1012911781:
                    i22 = 40948;
                    int iM450217 = C19806.m45029("ۤ֨") ^ i15;
                    int i28 = ((iM450217 ^ i16) * 19159) ^ 1863406031;
                    i18 = iM450217 ^ (-129818860);
                    this = this;
                    strM18989 = strM18989;
                    i17 = i28;
                    i19 = i19;
                    objectAnimatorM8649 = objectAnimatorM8649;
                    break;
                case -1560517053:
                case -347569338:
                    this.f30892 = (z4 ? 1 : 0) ^ (z ? 1 : 0);
                    rotation = view.getRotation();
                    float f4 = -i19;
                    if (RunnableC1564.m5345()) {
                        f3 = f4;
                        iM11307 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i15) * (-39);
                        i12 = ((iM11307 ^ i16) * 26291) ^ 1239536250;
                        i13 = -1972823691;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                    } else {
                        int iM113011 = ThreadFactoryC3888.m11306("ܳ᩵") ^ i16;
                        f3 = f4;
                        i17 = ((iM113011 ^ i15) * 18695) ^ 1140848130;
                        i18 = iM113011 ^ 435788072;
                    }
                    break;
                case -1546017265:
                case -730141771:
                    objectAnimatorM86410.setInterpolator(new AccelerateInterpolator());
                    this.f30893 = z2;
                    iM11307 = C19806.m45029("۠ۘ") ^ i15;
                    i12 = ((iM11307 ^ i16) * 18741) ^ 1045806985;
                    i13 = 136418043;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    break;
                case -1425444346:
                case 153033384:
                    float[] fArr2 = new float[i20];
                    fArr2[z2 ? 1 : 0] = rotation;
                    fArr2[z ? 1 : 0] = f3;
                    objectAnimatorM26816 = C10634.m26816(view2, str3, fArr2);
                    if (C3577.f13150 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("۬ܿ") ^ i15;
                        i12 = ((iM11307 ^ i16) * (-4241)) ^ (-641556311);
                        i13 = -635566359;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩺֫") ^ i16;
                        i12 = ((iM11307 ^ i15) * (-31857)) ^ (-1100760375);
                        i13 = -801638748;
                    }
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    break;
                case -1116771228:
                case -178779090:
                    i19 = i19;
                    objectAnimatorM8649 = C2871.m8649(C1066.m4024(view2, str3, fArr), 800L);
                    if (C0050.m946() > 0) {
                        iM450212 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i16;
                        i10 = ((iM450212 ^ i15) * (-16969)) ^ (-422023310);
                        i11 = 568704012;
                        i18 = iM450212 ^ i11;
                        i17 = i10;
                        i19 = i19;
                    } else {
                        str2 = strM18989;
                        i5 = i22;
                        int iM113012 = (i16 - ThreadFactoryC3888.m11306("ܶܳ")) * 83;
                        i6 = ((iM113012 ^ i15) * (-30755)) ^ 761360479;
                        i18 = iM113012 ^ (-18317055);
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        i17 = i6;
                        view2 = view;
                    }
                    break;
                case -1010364086:
                case -884392423:
                    C3286.m9798();
                    if (RunnableC1606.f6488 < 0) {
                        objectAnimator2 = objectAnimatorM8649;
                        i19 = i19;
                        str2 = strM18989;
                        i5 = i22;
                        iM450211 = (i15 - ThreadFactoryC3888.m11306("ۜܰ")) * (-27);
                        i6 = ((iM450211 ^ i16) * (-21657)) ^ (-12117579);
                        i7 = 1578703860;
                        i18 = iM450211 ^ i7;
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator2;
                        i17 = i6;
                        view2 = view;
                    } else {
                        objectAnimatorM8649 = objectAnimatorM8649;
                        i19 = i19;
                        i22 = i22;
                        iM450210 = ThreadFactoryC3888.m11306("ۛܽ") ^ i16;
                        i17 = ((iM450210 ^ i15) * 4157) ^ (-1830197802);
                        i3 = -1284961735;
                        i18 = iM450210 ^ i3;
                        this = this;
                        i22 = i22;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimatorM8649;
                    }
                    break;
                case -940846566:
                case -162840199:
                    z3 = false;
                    iM11306 = C19806.m45029("᩻ܳ") ^ i15;
                    i = ((iM11306 ^ i16) * 3641) ^ 929766746;
                    i4 = -1538429361;
                    i18 = iM11306 ^ i4;
                    i17 = i;
                    i22 = i22;
                    i19 = i19;
                    objectAnimatorM8649 = objectAnimatorM8649;
                    break;
                case -794719985:
                case -459391775:
                    i19 = i19;
                    i8 = i22;
                    sArr = sArr3;
                    i9 = i23;
                    strM5047 = C1460.m5047(sArr, i9, 8, i8);
                    f = 0.0f;
                    if (rotation2 == 0.0f) {
                        int iM450218 = C19806.m45029("ܺ᩹") ^ i15;
                        String str4 = strM5047;
                        i17 = ((iM450218 ^ i16) * (-32093)) ^ (-1114634701);
                        i18 = iM450218 ^ (-209209489);
                        i22 = i8;
                        sArr3 = sArr;
                        i23 = i9;
                        i19 = i19;
                        f2 = f;
                        str3 = str4;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("۟᩷") ^ i15;
                        i17 = ((iM113013 ^ i16) * 19787) ^ 612216262;
                        i18 = iM113013 ^ 1267491269;
                        i22 = i8;
                        sArr3 = sArr;
                        i23 = i9;
                        i19 = i19;
                        str3 = strM5047;
                        f2 = 0.0f;
                    }
                    break;
                case -770062444:
                case 616709059:
                    i19 = i19;
                    i22 = i22;
                    if (!objectAnimator3.isRunning()) {
                        objectAnimator = objectAnimatorM8649;
                        str = strM18989;
                        int iM450219 = (i16 - C19806.m45029("ۚ᩷")) * (-107);
                        int i29 = ((iM450219 ^ i15) * 3871) ^ 997244540;
                        i18 = iM450219 ^ (-1069067102);
                        strM18989 = str;
                        i22 = i22;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator;
                        i17 = i29;
                        this = this;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩵") + i16) * (-125);
                        objectAnimatorM8649 = objectAnimatorM8649;
                        i = ((iM11306 ^ i15) * (-19159)) ^ (-178983798);
                        i4 = 1051483199;
                        i18 = iM11306 ^ i4;
                        i17 = i;
                        i22 = i22;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimatorM8649;
                    }
                    break;
                case -688293174:
                case 1162384866:
                    i19 = i19;
                    iNextInt = this.f30890.nextInt(340);
                    if (RunnableC1564.f6300) {
                        iM450212 = (C19806.m45029("۟᩹") ^ i16) * (-21);
                        i10 = ((iM450212 ^ i15) * 27677) ^ (-1213114169);
                        i11 = 2033669129;
                    } else {
                        iM450212 = (C19806.m45029("᩵ܺ") + i16) * 37;
                        i10 = ((iM450212 ^ i15) * (-25685)) ^ (-1739969045);
                        i11 = -1163687688;
                    }
                    i18 = iM450212 ^ i11;
                    i17 = i10;
                    i19 = i19;
                    break;
                case -583142518:
                case 748959579:
                    objectAnimatorM8649 = objectAnimatorM8649;
                    i19 = i19;
                    i22 = i22;
                    strM18989 = C7105.m18989(f30889, 1, 1, i22);
                    if (C3286.f12186) {
                        iM450210 = ThreadFactoryC3888.m11306("ۛܽ") ^ i16;
                        i17 = ((iM450210 ^ i15) * 4157) ^ (-1830197802);
                        i3 = -1284961735;
                    } else {
                        iM450210 = (C19806.m45029("ۙܿ") + i16) * (-107);
                        i17 = ((iM450210 ^ i15) * (-1993)) ^ 656087950;
                        i3 = -1241666694;
                    }
                    i18 = iM450210 ^ i3;
                    this = this;
                    i22 = i22;
                    i19 = i19;
                    objectAnimatorM8649 = objectAnimatorM8649;
                    break;
                case -497637200:
                case -272087056:
                    objectAnimator2 = objectAnimatorM8649;
                    i19 = i19;
                    str2 = strM18989;
                    i5 = i22;
                    sArr2 = f30889;
                    c = 0;
                    if (C0629.f2722 <= 0) {
                        iM450211 = (i15 - ThreadFactoryC3888.m11306("ۜܰ")) * (-27);
                        i6 = ((iM450211 ^ i16) * (-21657)) ^ (-12117579);
                        i7 = 1578703860;
                    } else {
                        iM450211 = (i15 - C19806.m45029("ۚۧ")) * (-97);
                        i6 = ((iM450211 ^ i16) * (-705)) ^ 1086022734;
                        i7 = -14751284;
                    }
                    i18 = iM450211 ^ i7;
                    strM18989 = str2;
                    i22 = i5;
                    i19 = i19;
                    objectAnimatorM8649 = objectAnimator2;
                    i17 = i6;
                    view2 = view;
                    break;
                case -397235126:
                case 2008101924:
                    if (C0962.m3746() < 0) {
                        i19 = i19;
                        iM450212 = (C19806.m45029("۟᩹") ^ i16) * (-21);
                        i10 = ((iM450212 ^ i15) * 27677) ^ (-1213114169);
                        i11 = 2033669129;
                        i18 = iM450212 ^ i11;
                        i17 = i10;
                        i19 = i19;
                    } else {
                        objectAnimator2 = objectAnimatorM8649;
                        i19 = i19;
                        str2 = strM18989;
                        i5 = i22;
                        iM450211 = (i15 - ThreadFactoryC3888.m11306("ۜܰ")) * (-27);
                        i6 = ((iM450211 ^ i16) * (-21657)) ^ (-12117579);
                        i7 = 1578703860;
                        i18 = iM450211 ^ i7;
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator2;
                        i17 = i6;
                        view2 = view;
                    }
                    break;
                case -241148577:
                case -164608905:
                    i19 = -i21;
                    iM11307 = (i15 - C19806.m45029("ۙ᩶")) * 109;
                    i12 = ((iM11307 ^ i16) * (-22351)) ^ (-271680704);
                    i13 = 1420052250;
                    i18 = iM11307 ^ i13;
                    i17 = i12;
                    break;
                case -10425120:
                case 517906658:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩻᩹") + i15) * 21;
                        i12 = ((iM11307 ^ i16) * (-7843)) ^ 1989669930;
                        i13 = 1678844860;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                    } else {
                        objectAnimator2 = objectAnimatorM8649;
                        i19 = i19;
                        str2 = strM18989;
                        i5 = i22;
                        iM450211 = (i15 - ThreadFactoryC3888.m11306("ۜܰ")) * (-27);
                        i6 = ((iM450211 ^ i16) * (-21657)) ^ (-12117579);
                        i7 = 1578703860;
                        i18 = iM450211 ^ i7;
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator2;
                        i17 = i6;
                        view2 = view;
                    }
                    break;
                case 321521115:
                case 1861400935:
                    i19 = i19;
                    if (!z3) {
                        iM450212 = C19806.m45029("᩺ܽ") ^ i15;
                        i10 = ((iM450212 ^ i16) * 14873) ^ 453906336;
                        i11 = 2132046992;
                        i18 = iM450212 ^ i11;
                        i17 = i10;
                        i19 = i19;
                    } else {
                        strM5047 = str3;
                        f = f2;
                        i8 = i22;
                        sArr = sArr3;
                        i9 = i23;
                        int iM4502110 = C19806.m45029("ܺ᩹") ^ i15;
                        String str5 = strM5047;
                        i17 = ((iM4502110 ^ i16) * (-32093)) ^ (-1114634701);
                        i18 = iM4502110 ^ (-209209489);
                        i22 = i8;
                        sArr3 = sArr;
                        i23 = i9;
                        i19 = i19;
                        f2 = f;
                        str3 = str5;
                    }
                    break;
                case 722239195:
                case 934186996:
                    if (C1025.f4800 < 0) {
                        i19 = i19;
                        str2 = strM18989;
                        i5 = i22;
                        int iM113014 = (i16 - ThreadFactoryC3888.m11306("ܶܳ")) * 83;
                        i6 = ((iM113014 ^ i15) * (-30755)) ^ 761360479;
                        i18 = iM113014 ^ (-18317055);
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        i17 = i6;
                        view2 = view;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i15) * (-39);
                        i12 = ((iM11307 ^ i16) * 26291) ^ 1239536250;
                        i13 = -1972823691;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                    }
                    break;
                case 761233113:
                case 875600214:
                    ObjectAnimator objectAnimator6 = this.f30891;
                    C0629.m2908(objectAnimator6);
                    C2477.m7594(objectAnimator6);
                    break;
                case 878774111:
                case 1319161264:
                    objectAnimator2 = objectAnimatorM8649;
                    i19 = i19;
                    str2 = strM18989;
                    i5 = i22;
                    s = sArr2[c];
                    s2 = 22608;
                    if (C0671.f2816 == 0) {
                        iM450211 = (i16 - ThreadFactoryC3888.m11306("ۗ۫")) * (-111);
                        i6 = ((iM450211 ^ i15) * (-17281)) ^ 303844569;
                        i7 = 791001040;
                        i18 = iM450211 ^ i7;
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator2;
                        i17 = i6;
                        view2 = view;
                    } else {
                        objectAnimatorM8649 = objectAnimator2;
                        int iM113015 = (i16 - ThreadFactoryC3888.m11306("ܶܳ")) * 83;
                        i6 = ((iM113015 ^ i15) * (-30755)) ^ 761360479;
                        i18 = iM113015 ^ (-18317055);
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        i17 = i6;
                        view2 = view;
                    }
                    break;
                case 1164137160:
                case 1649023023:
                    objectAnimatorM8649 = objectAnimatorM8649;
                    i19 = i19;
                    String str6 = strM18989;
                    i22 = i22;
                    if ((s * s2) - ((s * s) + 127780416) > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۘ") ^ i16;
                        i = ((iM45029 ^ i15) * (-1221)) ^ (-358129525);
                        i2 = 906575860;
                    } else {
                        iM45029 = (i15 - C19806.m45029("ۙ᩵")) * 21;
                        i = ((iM45029 ^ i16) * (-14127)) ^ (-1577206779);
                        i2 = -1934814004;
                    }
                    i18 = iM45029 ^ i2;
                    this = this;
                    strM18989 = str6;
                    i17 = i;
                    i22 = i22;
                    i19 = i19;
                    objectAnimatorM8649 = objectAnimatorM8649;
                    break;
                case 1657069145:
                case 1664696153:
                    objectAnimatorM86410 = C2871.m8649(objectAnimatorM26816, 500L);
                    this.f30891 = objectAnimatorM86410;
                    C0629.m2908(objectAnimatorM86410);
                    if (C10634.f36300 < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i15;
                        i12 = ((iM11307 ^ i16) * 2343) ^ 2067248435;
                        i13 = -251140106;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                    } else {
                        objectAnimator2 = objectAnimatorM8649;
                        i19 = i19;
                        str2 = strM18989;
                        i5 = i22;
                        iM450211 = (i15 - ThreadFactoryC3888.m11306("ۜܰ")) * (-27);
                        i6 = ((iM450211 ^ i16) * (-21657)) ^ (-12117579);
                        i7 = 1578703860;
                        i18 = iM450211 ^ i7;
                        strM18989 = str2;
                        i22 = i5;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimator2;
                        i17 = i6;
                        view2 = view;
                    }
                    break;
                case 1737083693:
                case 1901886915:
                    i19 = i19;
                    int i30 = iNextInt;
                    i21 = i30 + 370;
                    z4 = this.f30892;
                    if (!z4) {
                        iNextInt = i30;
                        i19 = i21;
                        iM11307 = (i15 - C19806.m45029("ۙ᩶")) * 109;
                        i12 = ((iM11307 ^ i16) * (-22351)) ^ (-271680704);
                        i13 = 1420052250;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("ۚܰ") ^ i16;
                        iNextInt = i30;
                        i17 = ((iM113016 ^ i15) * (-30969)) ^ (-1995428248);
                        i18 = iM113016 ^ 1153469805;
                        i19 = i19;
                    }
                    break;
                default:
                    C3722.m10894();
                    if (C1398.f5802 <= 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰܽ") ^ i15) * (-39);
                        i12 = ((iM11307 ^ i16) * 26291) ^ 1239536250;
                        i13 = -1972823691;
                        i18 = iM11307 ^ i13;
                        i17 = i12;
                    } else {
                        objectAnimatorM8649 = objectAnimatorM8649;
                        i19 = i19;
                        i22 = i22;
                        iM450210 = ThreadFactoryC3888.m11306("ۛܽ") ^ i16;
                        i17 = ((iM450210 ^ i15) * 4157) ^ (-1830197802);
                        i3 = -1284961735;
                        i18 = iM450210 ^ i3;
                        this = this;
                        i22 = i22;
                        i19 = i19;
                        objectAnimatorM8649 = objectAnimatorM8649;
                    }
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC9055() {
        Random random = null;
        int i = -466454417;
        int i2 = C2871.f10837;
        int i3 = C2124.f7782;
        int iM45029 = C19806.m45029("֫ۖ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 8731) ^ 808038394;
        int i5 = -169297661;
        while (true) {
            i = ((((i ^ i3) * (-29195)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2027183500:
                case 531886082:
                    if (C0526.m2437() < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4095)) ^ 1568656427;
                        i5 = 653978528;
                    } else {
                        iM45029 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12609) ^ 411723659;
                        i5 = -286616022;
                    }
                    break;
                case -1720594958:
                case 683481133:
                    C1148.m4232();
                    iM45029 = ThreadFactoryC3888.m11306("ۧ᩶") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-30717)) ^ 1466071749;
                    i5 = 1338831361;
                    break;
                case -1548676416:
                case -635505553:
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ܽ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28149)) ^ (-922904974);
                        i5 = 903567091;
                    } else {
                        iM45029 = (C19806.m45029("᩷ۛ") ^ i3) * (-7);
                        i4 = ((iM45029 ^ i2) * (-22309)) ^ 2073212726;
                        i5 = 286195006;
                    }
                    break;
                case -1411633175:
                case -740958970:
                    this.f30890 = random;
                    return;
                case -1336968392:
                case 1159246375:
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30717)) ^ 1466071749;
                        i5 = 1338831361;
                    } else {
                        iM45029 = C19806.m45029("᩵ۚ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19731)) ^ (-1771611732);
                        i5 = -1925302101;
                    }
                    break;
                case -996209658:
                case 1108825362:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4095)) ^ 1568656427;
                        i5 = 653978528;
                    } else {
                        iM45029 = (C19806.m45029("ۖۖ") + i2) * 31;
                        i4 = ((iM45029 ^ i3) * (-17247)) ^ 1579411324;
                        i5 = -546703506;
                    }
                    break;
                case -695278939:
                case 381141888:
                    if (C1025.m3861() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4095)) ^ 1568656427;
                        i5 = 653978528;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7471)) ^ (-2140947855);
                        i5 = 1164381895;
                    }
                    break;
                case -516740995:
                case -141038272:
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30717)) ^ 1466071749;
                        i5 = 1338831361;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 5933) ^ 1654447972;
                        i5 = 289553180;
                    }
                    break;
                case -141017119:
                case 2107671164:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4095)) ^ 1568656427;
                        i5 = 653978528;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22595)) ^ (-1315216500);
                        i5 = -1592410252;
                    }
                    break;
                case -46395166:
                case 1386939551:
                    C2788.m8472();
                    throw new RuntimeException();
                case 4856057:
                case 1463524871:
                    if (C1148.m4232() <= 0) {
                        iM45029 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12609) ^ 411723659;
                        i5 = -286616022;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30717)) ^ 1466071749;
                        i5 = 1338831361;
                    }
                    break;
                case 43058439:
                case 1365349613:
                    AbstractC0464.m2313();
                    if (!C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30717)) ^ 1466071749;
                        i5 = 1338831361;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-479)) ^ (-885680088);
                        i5 = -1296378140;
                    }
                    break;
                case 161761721:
                case 1950698330:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12609) ^ 411723659;
                        i5 = -286616022;
                    } else {
                        iM45029 = C19806.m45029("᩻۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17027) ^ (-191762790);
                        i5 = -942160157;
                    }
                    break;
                case 1070403874:
                case 1977259988:
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("۬ܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12609) ^ 411723659;
                        i5 = -286616022;
                    } else {
                        iM45029 = C19806.m45029("᩹᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7757)) ^ 885237938;
                        i5 = 1186019269;
                    }
                    break;
                case 1192762628:
                case 2078514618:
                    random = new Random();
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4095)) ^ 1568656427;
                        i5 = 653978528;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֨֨")) * 37;
                        i4 = ((iM45029 ^ i2) * (-15309)) ^ (-741833611);
                        i5 = 192373637;
                    }
                    break;
                default:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-479)) ^ (-885680088);
                        i5 = -1296378140;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 9631) ^ 923754495;
                        i5 = -2147450061;
                    }
                    break;
            }
        }
    }
}
