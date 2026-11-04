package l;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;

/* JADX INFO: renamed from: l.ᩴ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: UAQE */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC19683 extends ActivityC7405 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static C22667 f63378;

    /* JADX INFO: renamed from: ᩹ۛۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f63379 = {2681, -17213, -17208, -17201, -17265, -17204, -17195, -17265, -17199, -17203, -17196, -17198, -17265, -17172, -17216, -17208, -17201, -17169, -17202, -17181, -17210, -17176, -17214, -17202, -17201, -17213, -17208, -17201, -17265, -17204, -17195, -17265, -17199, -17203, -17196, -17198, -17265, -17172, -17216, -17208, -17201, -17171, -17208, -17210, -17207, -17195, -17176, -17214, -17202, -17201, -17213, -17208, -17201, -17265, -17204, -17195, -17265, -17199, -17203, -17196, -17198, -17265, -17172, -17216, -17208, -17201, -17179, -17216, -17197, -17206, -17176, -17214, -17202, -17201, 6661, 18876, 18871, 18864, 18928, 18867, 18858, 18928, 18862, 18866, 18859, 18861, 18928, 18835, 18879, 18871, 18864, 18832, 18865, 18844, 18873, 18839, 18877, 18865, 18864, 18876, 18871, 18864, 18928, 18867, 18858, 18928, 18862, 18866, 18859, 18861, 18928, 18835, 18879, 18871, 18864, 18834, 18871, 18873, 18870, 18858, 18839, 18877, 18865, 18864, 18876, 18871, 18864, 18928, 18867, 18858, 18928, 18862, 18866, 18859, 18861, 18928, 18835, 18879, 18871, 18864, 18842, 18879, 18860, 18869, 18839, 18877, 18865, 18864, 18876, 18871, 18864, 18928, 18867, 18858, 18928, 18862, 18866, 18859, 18861, 18928, 18835, 18879, 18871, 18864, 8116, 15313, 15335, 15328, 15357, 15354, 15343, 15330, 15330, 15313, 15343, 15358, 15333, 15313, 15336, 15356, 15329, 15331, 15313, 15331, 15354, 15313, 15343, 15357, 15291, 15338, 15290, 15292, 15343, 15341, 15354, 15335, 15352, 15335, 15354, 15351, 15340, 15335, 15328, 15264, 15331, 15354, 15264, 15358, 15330, 15355, 15357, 15343, 15328, 15338, 15356, 15329, 15335, 15338, 15264, 15335, 15328, 15354, 15339, 15328, 15354, 15264, 15343, 15341, 15354, 15335, 15329, 15328, 15264, 15325, 15307, 15296, 15306, 15354, 15339, 15350, 15354, 15265, 15343, 15328, 15338, 15356, 15329, 15335, 15338, 15264, 15335, 15328, 15354, 15339, 15328, 15354, 15264, 15339, 15350, 15354, 15356, 15343, 15264, 15322, 15307, 15318, 15322, 15336, 15356, 15329, 15331, 15307, 15350, 15354, 15339, 15356, 15328, 15343, 15330, 15311, 15358, 15358, 15343, 15328, 15338, 15356, 15329, 15335, 15338, 15264, 15335, 15328, 15354, 15339, 15328, 15354, 15264, 15343, 15341, 15354, 15335, 15329, 15328, 15264, 15320, 15303, 15307, 15321};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22667 m45353(Uri uri) {
        C22667 c22667 = null;
        C22667 c22668 = null;
        int i = 138191723;
        int i2 = C3492.f12043;
        int i3 = C3734.f12817;
        int iM2761 = C0619.m2761("ۤܳ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-24017)) ^ 461349191;
        int i5 = 1643797866;
        while (true) {
            i = ((((i ^ i3) * (-28681)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2134580072:
                case 623393012:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩸᩷")) * 127;
                        i4 = ((iM2761 ^ i2) * (-22361)) ^ 106212075;
                        i5 = 377909476;
                    } else {
                        iM2761 = (C0619.m2761("ۗܺ") ^ i3) * (-25);
                        i4 = ((iM2761 ^ i2) * 24351) ^ (-41537143);
                        i5 = -1740669364;
                    }
                    break;
                case -1690414126:
                case -380459814:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ۧ֫") ^ i2) * (-11);
                        i4 = ((iM2761 ^ i3) * (-29979)) ^ 1607481452;
                        i5 = 1491067100;
                    } else {
                        iM2761 = C0773.m3169("᩺᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5705)) ^ (-1531889766);
                        i5 = 1635959697;
                    }
                    break;
                case -1675586805:
                case -372448555:
                    c22668 = null;
                    if (c22667 != null) {
                        iM2761 = C0773.m3169("۫᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10391) ^ 1653796483;
                        i5 = 2135957405;
                    } else {
                        iM2761 = C0773.m3169("ܰ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8147) ^ (-1931903291);
                        i5 = 1641052140;
                    }
                    break;
                case -1325348771:
                case 1749105547:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩸᩷")) * 127;
                        i4 = ((iM2761 ^ i2) * (-22361)) ^ 106212075;
                        i5 = 377909476;
                    } else {
                        iM2761 = (C0773.m3169("ܳ֫") ^ i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-4275)) ^ 788748145;
                        i5 = 500829118;
                    }
                    break;
                case -1288789173:
                case 1924885868:
                    C23916.m53419();
                    if (RunnableC3055.f9898 < 0) {
                        iM2761 = (i3 - C0619.m2761("᩸᩷")) * 127;
                        i4 = ((iM2761 ^ i2) * (-22361)) ^ 106212075;
                        i5 = 377909476;
                    } else {
                        iM2761 = C0619.m2761("᩵֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20373) ^ (-1754160490);
                        i5 = 183077483;
                    }
                    break;
                case -1213175409:
                case 525210121:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩸᩷")) * 127;
                        i4 = ((iM2761 ^ i2) * (-22361)) ^ 106212075;
                        i5 = 377909476;
                    } else {
                        iM2761 = C0619.m2761("ܺܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6947) ^ 1470206811;
                        i5 = -528407696;
                    }
                    break;
                case -1091710245:
                case 549590150:
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0619.m2761("֨ۚ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * 14141) ^ 2081284159;
                        i5 = 1331587594;
                    } else {
                        iM2761 = C0619.m2761("ܺۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28771)) ^ (-1539652209);
                        i5 = -442558139;
                    }
                    break;
                case -1043174276:
                case 421277556:
                    AbstractC3624.m11755();
                    RunnableC3646.m11813();
                    return null;
                case -560792190:
                case 1915096714:
                    return c22668;
                case -459677104:
                case 1972439792:
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0619.m2761("֨ۚ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * 14141) ^ 2081284159;
                        i5 = 1331587594;
                    } else {
                        iM2761 = (C0773.m3169("᩻ۧ") ^ i2) * 119;
                        i4 = ((iM2761 ^ i3) * 15879) ^ 1086348976;
                        i5 = -164599026;
                    }
                    break;
                case -416010846:
                case 422681344:
                    RunnableC1848.m6360();
                    if (AbstractC3624.m11755() == 0) {
                        iM2761 = (C0773.m3169("ۧ֫") ^ i2) * (-11);
                        i4 = ((iM2761 ^ i3) * (-29979)) ^ 1607481452;
                        i5 = 1491067100;
                    } else {
                        iM2761 = C0619.m2761("᩵֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20373) ^ (-1754160490);
                        i5 = 183077483;
                    }
                    break;
                case -364895797:
                case 329256065:
                    if (C3492.m11490(c22667.f73615, uri)) {
                        iM2761 = C0619.m2761("᩻᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20577) ^ 1076085882;
                        i5 = 1817272194;
                    } else {
                        iM2761 = C0773.m3169("ܰ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8147) ^ (-1931903291);
                        i5 = 1641052140;
                    }
                    break;
                case -113058202:
                case 210699281:
                    C22667 c22669 = f63378;
                    f63378 = c22668;
                    return c22669;
                case 384789720:
                case 2111485649:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۗۜ")) * (-29);
                        i4 = ((iM2761 ^ i2) * 19907) ^ 778058328;
                        i5 = 1059549888;
                    } else {
                        iM2761 = C0619.m2761("ܿ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2039)) ^ (-40435745);
                        i5 = -1881740917;
                    }
                    break;
                case 571871804:
                case 1699161403:
                    if (!C0619.f2439) {
                        iM2761 = C0619.m2761("᩵֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20373) ^ (-1754160490);
                        i5 = 183077483;
                    } else {
                        iM2761 = (C0619.m2761("֨ۚ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * 14141) ^ 2081284159;
                        i5 = 1331587594;
                    }
                    break;
                case 829504747:
                case 1888432406:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ۧ֫") ^ i2) * (-11);
                        i4 = ((iM2761 ^ i3) * (-29979)) ^ 1607481452;
                        i5 = 1491067100;
                    } else {
                        iM2761 = (C0619.m2761("֡᩻") + i3) * (-19);
                        i4 = ((iM2761 ^ i2) * 30819) ^ (-1946101325);
                        i5 = -1838478490;
                    }
                    break;
                case 1416710505:
                case 2092240525:
                    C1542.m5459();
                    C11235.m28309();
                    iM2761 = C0619.m2761("᩵֫") ^ i2;
                    i4 = ((iM2761 ^ i3) * 20373) ^ (-1754160490);
                    i5 = 183077483;
                    break;
                case 1913396588:
                case 1922674490:
                    c22667 = f63378;
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("᩵֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20373) ^ (-1754160490);
                        i5 = 183077483;
                    } else {
                        iM2761 = C0619.m2761("ۘܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13977) ^ (-446862418);
                        i5 = 920551263;
                    }
                    break;
                default:
                    if (C1783.m6232()) {
                        iM2761 = (i2 - C0619.m2761("֨ۢ")) * 43;
                        i4 = ((iM2761 ^ i3) * 28225) ^ 1713180730;
                        i5 = -302132342;
                    } else {
                        iM2761 = (C0773.m3169("ۧ֫") ^ i2) * (-11);
                        i4 = ((iM2761 ^ i3) * (-29979)) ^ 1607481452;
                        i5 = 1491067100;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45355(ActivityManager.AppTask appTask) {
        short[] sArr;
        int i;
        short[] sArr2;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        short[] sArr3;
        int i6;
        int i7;
        int i8;
        int iM31610;
        int i9;
        int i10;
        int i11;
        int iM31611;
        int i12;
        int i13;
        ActivityManager.RecentTaskInfo recentTaskInfo;
        ComponentName componentName;
        int iM31612;
        int i14;
        ?? r6;
        byte b;
        int i15 = C2966.f9654;
        int i16 = C0950.f3488;
        int iM31613 = C0773.m3169("᩶᩻") ^ i16;
        int i17 = ((iM31613 ^ i15) * 32407) ^ (-1258674092);
        String className = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i18 = iM31613 ^ (-167817086);
        int i19 = 0;
        boolean z = false;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        char c = 0;
        int i26 = 0;
        int i27 = 0;
        short s = 0;
        short s2 = 0;
        boolean z2 = false;
        int i28 = 0;
        int i29 = -1689446207;
        int i30 = 0;
        ComponentName componentName2 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        ?? r7 = 0;
        ActivityManager.RecentTaskInfo taskInfo = null;
        while (true) {
            i29 = i18 ^ (i17 & (((i29 ^ i15) * (-20601)) >> 31));
            switch (i29) {
                case -2123082972:
                case 1862463995:
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i31 = i28;
                    i19 = i19;
                    i11 = i31;
                    if (!C3492.m11490(className, C1783.m6233(sArr4, i30, i11, i24))) {
                        sArr4 = sArr4;
                        iM31611 = C0619.m2761("᩵᩹") ^ i16;
                        i12 = ((iM31611 ^ i15) * (-11535)) ^ (-256991182);
                        i13 = -811026987;
                        int i32 = iM31611 ^ i13;
                        i30 = i30;
                        short[] sArr9 = sArr4;
                        i18 = i32;
                        i17 = i12;
                        sArr8 = sArr8;
                        sArr4 = sArr9;
                        int i33 = i19;
                        i28 = i11;
                        i19 = i33;
                    } else {
                        r6 = z2;
                        iM31612 = C0619.m2761("֡ۙ") ^ i15;
                        sArr4 = sArr4;
                        i17 = ((iM31612 ^ i16) * (-3499)) ^ (-389040566);
                        i14 = 88670975;
                        r7 = r6;
                        int i34 = iM31612 ^ i14;
                        i30 = i30;
                        int i35 = i19;
                        i28 = i11;
                        i19 = i35;
                        short[] sArr10 = sArr4;
                        i18 = i34;
                        sArr8 = sArr8;
                        sArr4 = sArr10;
                    }
                    break;
                case -2057774800:
                case -1362037262:
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i36 = i28;
                    i19 = i19;
                    i11 = i36;
                    className = componentName2.getClassName();
                    C3734.m12155(className);
                    z = true;
                    switch (C0619.m2761(className)) {
                        case -1577057716:
                            iM31611 = C0773.m3169("֨ᩳ") ^ i16;
                            i12 = ((iM31611 ^ i15) * (-7721)) ^ 2027074109;
                            i13 = -691517986;
                            break;
                        case -1350715006:
                            iM31611 = C0773.m3169("ܿᩳ") ^ i16;
                            i12 = ((iM31611 ^ i15) * (-24343)) ^ (-1335796040);
                            i13 = 486794884;
                            break;
                        case 12451804:
                            iM31611 = (i15 - C0773.m3169("ᩴᩳ")) * 75;
                            i12 = ((iM31611 ^ i16) * 16777) ^ 1775840506;
                            i13 = -1855710904;
                            break;
                        case 1714856877:
                            iM31611 = (C0619.m2761("᩹ۘ") + i16) * (-7);
                            i12 = ((iM31611 ^ i15) * (-31701)) ^ (-1296456141);
                            i13 = -1263550802;
                            break;
                        default:
                            iM31611 = C0619.m2761("᩵᩹") ^ i16;
                            i12 = ((iM31611 ^ i15) * (-11535)) ^ (-256991182);
                            i13 = -811026987;
                            break;
                    }
                    int i37 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr11 = sArr4;
                    i18 = i37;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr11;
                    int i38 = i19;
                    i28 = i11;
                    i19 = i38;
                    break;
                case -1977054276:
                case -1329170057:
                    sArr5 = f63379;
                    i21 = 99;
                    i22 = 25;
                    if (C1542.f5343 > 0) {
                        iM31610 = (C0773.m3169("ۗܽ") + i15) * (-39);
                        i9 = ((iM31610 ^ i16) * (-3063)) ^ (-909120825);
                        i10 = -1471846822;
                        i18 = iM31610 ^ i10;
                        i17 = i9;
                    } else {
                        sArr = sArr4;
                        i = i30;
                        int i39 = i28;
                        i3 = i19;
                        i8 = i39;
                        int iM31614 = (C0773.m3169("ۨܳ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = i8;
                        i4 = ((iM31614 ^ i15) * 20077) ^ 887906720;
                        i7 = iM31614 ^ 259751392;
                        sArr4 = sArr;
                        i18 = i7;
                        i17 = i4;
                        i19 = i3;
                        i28 = i2;
                        i30 = i;
                    }
                    break;
                case -1955080015:
                case 1187246984:
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i40 = i28;
                    i19 = i19;
                    i11 = i40;
                    taskInfo = appTask.getTaskInfo();
                    if (Build.VERSION.SDK_INT >= 23) {
                        iM31611 = (C0773.m3169("ۛ᩶") ^ i16) * 73;
                        i12 = ((iM31611 ^ i15) * 17241) ^ 994620931;
                        i13 = 1012849745;
                    } else {
                        iM31611 = (i16 - C0619.m2761("ۗ۬")) * 31;
                        i12 = ((iM31611 ^ i15) * (-20253)) ^ 1595900689;
                        i13 = -273057265;
                    }
                    int i310 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr12 = sArr4;
                    i18 = i310;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr12;
                    int i311 = i19;
                    i28 = i11;
                    i19 = i311;
                    break;
                case -1917873093:
                case 1517248005:
                    b = 1;
                    sArr8 = sArr8;
                    int i41 = i28;
                    i19 = i19;
                    i11 = i41;
                    r6 = b;
                    iM31612 = C0619.m2761("֡ۙ") ^ i15;
                    sArr4 = sArr4;
                    i17 = ((iM31612 ^ i16) * (-3499)) ^ (-389040566);
                    i14 = 88670975;
                    r7 = r6;
                    int i312 = iM31612 ^ i14;
                    i30 = i30;
                    int i313 = i19;
                    i28 = i11;
                    i19 = i313;
                    short[] sArr13 = sArr4;
                    i18 = i312;
                    sArr8 = sArr8;
                    sArr4 = sArr13;
                    break;
                case -1833401982:
                case 875516424:
                    if (!C3492.m11490(className, RunnableC1848.m6366(sArr8, i20, i25, i24))) {
                        sArr4 = sArr4;
                        i30 = i30;
                        sArr8 = sArr8;
                        int i42 = i28;
                        i19 = i19;
                        i11 = i42;
                        iM31611 = C0619.m2761("᩵᩹") ^ i16;
                        i12 = ((iM31611 ^ i15) * (-11535)) ^ (-256991182);
                        i13 = -811026987;
                        int i314 = iM31611 ^ i13;
                        i30 = i30;
                        short[] sArr14 = sArr4;
                        i18 = i314;
                        i17 = i12;
                        sArr8 = sArr8;
                        sArr4 = sArr14;
                        int i315 = i19;
                        i28 = i11;
                        i19 = i315;
                    } else {
                        iM31610 = (C0619.m2761("᩵ܰ") ^ i16) * 49;
                        i9 = ((iM31610 ^ i15) * 26995) ^ (-244429219);
                        i10 = -219416253;
                        i18 = iM31610 ^ i10;
                        i17 = i9;
                    }
                    break;
                case -1813995891:
                case 772667740:
                    sArr = sArr4;
                    i = i30;
                    sArr2 = sArr8;
                    i2 = i28;
                    i3 = i19;
                    c = 'J';
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ܰۚ") + i15) * 59;
                        i4 = ((iM3169 ^ i16) * 11131) ^ 88182022;
                        i5 = -1097770967;
                    } else {
                        iM3169 = C0773.m3169("᩺᩸") ^ i16;
                        i4 = ((iM3169 ^ i15) * 18701) ^ (-1233641901);
                        i5 = -1105997367;
                    }
                    i7 = iM3169 ^ i5;
                    sArr8 = sArr2;
                    sArr4 = sArr;
                    i18 = i7;
                    i17 = i4;
                    i19 = i3;
                    i28 = i2;
                    i30 = i;
                    break;
                case -1775048284:
                case -707167842:
                    sArr6 = f63379;
                    i23 = 124;
                    i19 = 24;
                    if (C3734.m12152() < 0) {
                        iM31610 = (i16 - C0773.m3169("ܰ۟")) * 87;
                        i9 = ((iM31610 ^ i15) * 5177) ^ 1926778769;
                        i10 = 1585571103;
                        i18 = iM31610 ^ i10;
                        i17 = i9;
                    } else {
                        i8 = i28;
                        sArr = sArr4;
                        i = i30;
                        i3 = 24;
                        int iM31615 = (C0773.m3169("ۨܳ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = i8;
                        i4 = ((iM31615 ^ i15) * 20077) ^ 887906720;
                        i7 = iM31615 ^ 259751392;
                        sArr4 = sArr;
                        i18 = i7;
                        i17 = i4;
                        i19 = i3;
                        i28 = i2;
                        i30 = i;
                    }
                    break;
                case -1744160593:
                case -1197287419:
                    C1146.m4231();
                    return false;
                case -1739165084:
                case 241917165:
                    switch (r7) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            iM31610 = (i15 - C0619.m2761("֡ۢ")) * 123;
                            i9 = ((iM31610 ^ i16) * 5237) ^ (-1888456105);
                            i10 = 587094844;
                            break;
                        default:
                            iM31610 = C0619.m2761("ۖᩴ") ^ i16;
                            i9 = ((iM31610 ^ i15) * (-12323)) ^ 1909789593;
                            i10 = 1814961230;
                            break;
                    }
                    i18 = iM31610 ^ i10;
                    i17 = i9;
                    break;
                case -1634471303:
                case 1144389325:
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i43 = i28;
                    i19 = i19;
                    i11 = i43;
                    z2 = false;
                    if (componentName2 != null) {
                        iM31611 = (C0619.m2761("᩵ܿ") ^ i15) * (-41);
                        i12 = ((iM31611 ^ i16) * (-8471)) ^ (-1314895943);
                        i13 = 1392766943;
                    } else {
                        iM31611 = (C0619.m2761("᩵᩵") ^ i16) * (-63);
                        i12 = ((iM31611 ^ i15) * (-10799)) ^ 1497076202;
                        i13 = 917086698;
                    }
                    int i316 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr15 = sArr4;
                    i18 = i316;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr15;
                    int i317 = i19;
                    i28 = i11;
                    i19 = i317;
                    break;
                case -1584016986:
                case -896297655:
                    recentTaskInfo = taskInfo;
                    i11 = i28;
                    componentName = recentTaskInfo.origActivity;
                    componentName2 = componentName;
                    iM31612 = (C0773.m3169("۬ܺ") ^ i15) * (-45);
                    taskInfo = recentTaskInfo;
                    i17 = ((iM31612 ^ i16) * 10043) ^ 1673981197;
                    i14 = -14993458;
                    r7 = r7;
                    int i318 = iM31612 ^ i14;
                    i30 = i30;
                    int i319 = i19;
                    i28 = i11;
                    i19 = i319;
                    short[] sArr16 = sArr4;
                    i18 = i318;
                    sArr8 = sArr8;
                    sArr4 = sArr16;
                    break;
                case -1558578559:
                case -1252620329:
                    C2419.m8174();
                    if (C2702.f8586 > 0) {
                        sArr4 = sArr4;
                        i30 = i30;
                        sArr8 = sArr8;
                        int i44 = i28;
                        i19 = i19;
                        i11 = i44;
                        iM31611 = (C0619.m2761("ܰ᩺") ^ i16) * 43;
                        i12 = ((iM31611 ^ i15) * 22789) ^ 779745947;
                        i13 = -1224180832;
                        int i3110 = iM31611 ^ i13;
                        i30 = i30;
                        short[] sArr17 = sArr4;
                        i18 = i3110;
                        i17 = i12;
                        sArr8 = sArr8;
                        sArr4 = sArr17;
                        int i3111 = i19;
                        i28 = i11;
                        i19 = i3111;
                    } else {
                        sArr3 = sArr4;
                        sArr2 = sArr8;
                        int i45 = i28;
                        i3 = i19;
                        i6 = i45;
                        int iM31616 = C0773.m3169("ۧ֨") ^ i16;
                        int i46 = ((iM31616 ^ i15) * 5679) ^ (-1012324439);
                        i18 = iM31616 ^ (-140762299);
                        sArr8 = sArr2;
                        sArr4 = sArr3;
                        i17 = i46;
                        int i47 = i3;
                        i28 = i6;
                        i19 = i47;
                    }
                    break;
                case -1555621611:
                case 691734747:
                    sArr = sArr4;
                    i = i30;
                    sArr2 = sArr8;
                    int i48 = i28;
                    i3 = i19;
                    i8 = i48;
                    s = sArr7[c];
                    if (C2354.f7599 < 0) {
                        i2 = i8;
                        iM3169 = C0773.m3169("ۙ᩶") ^ i16;
                        i4 = ((iM3169 ^ i15) * 12337) ^ (-2091523618);
                        i5 = 1881563084;
                        i7 = iM3169 ^ i5;
                        sArr8 = sArr2;
                        sArr4 = sArr;
                        i18 = i7;
                        i17 = i4;
                        i19 = i3;
                        i28 = i2;
                        i30 = i;
                    } else {
                        sArr8 = sArr2;
                        int iM31617 = (C0773.m3169("ۨܳ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = i8;
                        i4 = ((iM31617 ^ i15) * 20077) ^ 887906720;
                        i7 = iM31617 ^ 259751392;
                        sArr4 = sArr;
                        i18 = i7;
                        i17 = i4;
                        i19 = i3;
                        i28 = i2;
                        i30 = i;
                    }
                    break;
                case -1550061837:
                case -94694298:
                    return z2;
                case -1314773858:
                case 86592702:
                    i11 = i28;
                    i24 = 22034;
                    iM31611 = C0773.m3169("ܰۖ") ^ i15;
                    i12 = ((iM31611 ^ i16) * 10065) ^ (-1882790112);
                    i13 = -606284819;
                    int i3112 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr18 = sArr4;
                    i18 = i3112;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr18;
                    int i3113 = i19;
                    i28 = i11;
                    i19 = i3113;
                    break;
                case -1278256591:
                case -418568355:
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i49 = i28;
                    i19 = i19;
                    i11 = i49;
                    i26 = s * 2;
                    if (C3690.f12684 <= 0) {
                        iM31611 = C0773.m3169("᩻᩸") ^ i15;
                        i12 = ((iM31611 ^ i16) * 3403) ^ (-590016656);
                        i13 = 675941705;
                    } else {
                        iM31611 = C0773.m3169("۫ۙ") ^ i15;
                        i12 = ((iM31611 ^ i16) * (-24211)) ^ (-1443119273);
                        i13 = 626288164;
                    }
                    int i3114 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr19 = sArr4;
                    i18 = i3114;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr19;
                    int i3115 = i19;
                    i28 = i11;
                    i19 = i3115;
                    break;
                case -1203629573:
                case -678647095:
                    if (!C2419.m8175(className, C2375.m8069(sArr5, i21, i22, i24))) {
                        sArr4 = sArr4;
                        i30 = i30;
                        sArr8 = sArr8;
                        int i410 = i28;
                        i19 = i19;
                        i11 = i410;
                        iM31611 = C0619.m2761("᩵᩹") ^ i16;
                        i12 = ((iM31611 ^ i15) * (-11535)) ^ (-256991182);
                        i13 = -811026987;
                        int i3116 = iM31611 ^ i13;
                        i30 = i30;
                        short[] sArr110 = sArr4;
                        i18 = i3116;
                        i17 = i12;
                        sArr8 = sArr8;
                        sArr4 = sArr110;
                        int i3117 = i19;
                        i28 = i11;
                        i19 = i3117;
                    } else {
                        iM31610 = C0773.m3169("۟ۢ") ^ i16;
                        i9 = ((iM31610 ^ i15) * 24457) ^ 593070162;
                        i10 = 444914164;
                        i18 = iM31610 ^ i10;
                        i17 = i9;
                    }
                    break;
                case -1203011927:
                case -960349581:
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i50 = i28;
                    i19 = i19;
                    i11 = i50;
                    i27 = i26 + 1;
                    if (C2354.m7983()) {
                        iM31611 = (C0619.m2761("ۧܰ") ^ i16) * 85;
                        i12 = ((iM31611 ^ i15) * 20373) ^ 494475932;
                        i13 = -613568317;
                    } else {
                        iM31611 = (C0619.m2761("ܰ᩺") ^ i16) * 43;
                        i12 = ((iM31611 ^ i15) * 22789) ^ 779745947;
                        i13 = -1224180832;
                    }
                    int i3118 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr111 = sArr4;
                    i18 = i3118;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr111;
                    int i3119 = i19;
                    i28 = i11;
                    i19 = i3119;
                    break;
                case -1069157581:
                case 1622634184:
                    C3998.m12920();
                    C11235.m28309();
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i51 = i28;
                    i19 = i19;
                    i11 = i51;
                    iM31611 = (i15 - C0619.m2761("ۗۨ")) * 25;
                    i12 = ((iM31611 ^ i16) * 12751) ^ (-1110244840);
                    i13 = -525977977;
                    int i31110 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr112 = sArr4;
                    i18 = i31110;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr112;
                    int i31111 = i19;
                    i28 = i11;
                    i19 = i31111;
                    break;
                case -1062265935:
                case 658221342:
                    recentTaskInfo = taskInfo;
                    i11 = i28;
                    componentName = recentTaskInfo.baseActivity;
                    componentName2 = componentName;
                    iM31612 = (C0773.m3169("۬ܺ") ^ i15) * (-45);
                    taskInfo = recentTaskInfo;
                    i17 = ((iM31612 ^ i16) * 10043) ^ 1673981197;
                    i14 = -14993458;
                    r7 = r7;
                    int i3120 = iM31612 ^ i14;
                    i30 = i30;
                    int i3121 = i19;
                    i28 = i11;
                    i19 = i3121;
                    short[] sArr113 = sArr4;
                    i18 = i3120;
                    sArr8 = sArr8;
                    sArr4 = sArr113;
                    break;
                case -1053570726:
                case 2082606467:
                    if (C1343.f4799 == 0) {
                        sArr = sArr4;
                        i = i30;
                        sArr2 = sArr8;
                        i2 = i28;
                        i3 = i19;
                        iM3169 = (C0619.m2761("ܰۚ") + i15) * 59;
                        i4 = ((iM3169 ^ i16) * 11131) ^ 88182022;
                        i5 = -1097770967;
                        i7 = iM3169 ^ i5;
                        sArr8 = sArr2;
                        sArr4 = sArr;
                        i18 = i7;
                        i17 = i4;
                        i19 = i3;
                        i28 = i2;
                        i30 = i;
                    } else {
                        sArr4 = sArr4;
                        i30 = i30;
                        sArr8 = sArr8;
                        int i52 = i28;
                        i19 = i19;
                        i11 = i52;
                        iM31611 = (i15 - C0619.m2761("ۗۨ")) * 25;
                        i12 = ((iM31611 ^ i16) * 12751) ^ (-1110244840);
                        i13 = -525977977;
                        int i31112 = iM31611 ^ i13;
                        i30 = i30;
                        short[] sArr114 = sArr4;
                        i18 = i31112;
                        i17 = i12;
                        sArr8 = sArr8;
                        sArr4 = sArr114;
                        int i31113 = i19;
                        i28 = i11;
                        i19 = i31113;
                    }
                    break;
                case -1041309939:
                case 16785252:
                    if (!C3492.m11490(className, C4238.m13530(sArr6, i23, i19, i24))) {
                        sArr4 = sArr4;
                        i30 = i30;
                        sArr8 = sArr8;
                        int i411 = i28;
                        i19 = i19;
                        i11 = i411;
                        iM31611 = C0619.m2761("᩵᩹") ^ i16;
                        i12 = ((iM31611 ^ i15) * (-11535)) ^ (-256991182);
                        i13 = -811026987;
                        int i31114 = iM31611 ^ i13;
                        i30 = i30;
                        short[] sArr115 = sArr4;
                        i18 = i31114;
                        i17 = i12;
                        sArr8 = sArr8;
                        sArr4 = sArr115;
                        int i31115 = i19;
                        i28 = i11;
                        i19 = i31115;
                    } else {
                        iM31610 = (C0773.m3169("᩸᩶") ^ i15) * (-5);
                        i9 = ((iM31610 ^ i16) * 15559) ^ (-2027800638);
                        i10 = -220947507;
                        i18 = iM31610 ^ i10;
                        i17 = i9;
                    }
                    break;
                case -942322820:
                case -750531198:
                    if (C1343.f4799 != 0) {
                        iM31610 = (C0619.m2761("᩻᩶") ^ i15) * 35;
                        i9 = ((iM31610 ^ i16) * 6449) ^ 1531460268;
                        i10 = -1608916970;
                    } else {
                        iM31610 = (i15 - C0619.m2761("ۙ᩻")) * (-57);
                        i9 = ((iM31610 ^ i16) * 11405) ^ 450619318;
                        i10 = -988681827;
                    }
                    i18 = iM31610 ^ i10;
                    i17 = i9;
                    break;
                case -653009661:
                case 405518467:
                    if (C1542.m5459() < 0) {
                        iM31610 = (C0619.m2761("᩻᩶") ^ i15) * 35;
                        i9 = ((iM31610 ^ i16) * 6449) ^ 1531460268;
                        i10 = -1608916970;
                        i18 = iM31610 ^ i10;
                        i17 = i9;
                    } else {
                        sArr3 = sArr4;
                        sArr2 = sArr8;
                        int i412 = i28;
                        i3 = i19;
                        i6 = i412;
                        int iM31618 = C0773.m3169("ۧ֨") ^ i16;
                        int i413 = ((iM31618 ^ i15) * 5679) ^ (-1012324439);
                        i18 = iM31618 ^ (-140762299);
                        sArr8 = sArr2;
                        sArr4 = sArr3;
                        i17 = i413;
                        int i414 = i3;
                        i28 = i6;
                        i19 = i414;
                    }
                    break;
                case -650861803:
                case 472042116:
                    b = 3;
                    sArr8 = sArr8;
                    int i415 = i28;
                    i19 = i19;
                    i11 = i415;
                    r6 = b;
                    iM31612 = C0619.m2761("֡ۙ") ^ i15;
                    sArr4 = sArr4;
                    i17 = ((iM31612 ^ i16) * (-3499)) ^ (-389040566);
                    i14 = 88670975;
                    r7 = r6;
                    int i3122 = iM31612 ^ i14;
                    i30 = i30;
                    int i3123 = i19;
                    i28 = i11;
                    i19 = i3123;
                    short[] sArr116 = sArr4;
                    i18 = i3122;
                    sArr8 = sArr8;
                    sArr4 = sArr116;
                    break;
                case -642456629:
                case -499181395:
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i53 = i28;
                    i19 = i19;
                    i11 = i53;
                    int i54 = s + s2;
                    if (i27 - (i54 * i54) > 0) {
                        iM31611 = C0619.m2761("ۨۖ") ^ i15;
                        i12 = ((iM31611 ^ i16) * (-22041)) ^ (-329721145);
                        i13 = -1741269613;
                    } else {
                        iM31611 = C0619.m2761("ܶۚ") ^ i16;
                        i12 = ((iM31611 ^ i15) * (-7563)) ^ (-1981559231);
                        i13 = 1702243739;
                    }
                    int i31116 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr117 = sArr4;
                    i18 = i31116;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr117;
                    int i31117 = i19;
                    i28 = i11;
                    i19 = i31117;
                    break;
                case -620817698:
                case 312327126:
                    if (C13473.f42873 == 0) {
                        sArr3 = sArr4;
                        sArr2 = sArr8;
                        int i416 = i28;
                        i3 = i19;
                        i6 = i416;
                        int iM31619 = C0773.m3169("ۧ֨") ^ i16;
                        int i417 = ((iM31619 ^ i15) * 5679) ^ (-1012324439);
                        i18 = iM31619 ^ (-140762299);
                        sArr8 = sArr2;
                        sArr4 = sArr3;
                        i17 = i417;
                        int i418 = i3;
                        i28 = i6;
                        i19 = i418;
                    } else {
                        sArr4 = sArr4;
                        i30 = i30;
                        sArr8 = sArr8;
                        int i55 = i28;
                        i19 = i19;
                        i11 = i55;
                        iM31611 = (i15 - C0619.m2761("ۗۨ")) * 25;
                        i12 = ((iM31611 ^ i16) * 12751) ^ (-1110244840);
                        i13 = -525977977;
                        int i31118 = iM31611 ^ i13;
                        i30 = i30;
                        short[] sArr118 = sArr4;
                        i18 = i31118;
                        i17 = i12;
                        sArr8 = sArr8;
                        sArr4 = sArr118;
                        int i31119 = i19;
                        i28 = i11;
                        i19 = i31119;
                    }
                    break;
                case -365799318:
                case -132815292:
                    sArr4 = sArr4;
                    i30 = i30;
                    sArr8 = sArr8;
                    int i56 = i28;
                    i19 = i19;
                    i11 = i56;
                    s2 = 1;
                    if (C3779.f12953 <= 0) {
                        iM31611 = (i15 - C0619.m2761("ۗۨ")) * 25;
                        i12 = ((iM31611 ^ i16) * 12751) ^ (-1110244840);
                        i13 = -525977977;
                    } else {
                        iM31611 = C0773.m3169("֡ܽ") ^ i15;
                        i12 = ((iM31611 ^ i16) * (-23583)) ^ (-78005099);
                        i13 = 2132830418;
                    }
                    int i311110 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr119 = sArr4;
                    i18 = i311110;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr119;
                    int i311111 = i19;
                    i28 = i11;
                    i19 = i311111;
                    break;
                case -252608519:
                case 1658292331:
                    sArr = sArr4;
                    i = i30;
                    sArr2 = sArr8;
                    i2 = i28;
                    i3 = i19;
                    sArr7 = f63379;
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (i15 - C0773.m3169("ܳ᩹")) * (-83);
                        i4 = ((iM3169 ^ i16) * (-17947)) ^ 1293559096;
                        i5 = 554576837;
                        i7 = iM3169 ^ i5;
                        sArr8 = sArr2;
                        sArr4 = sArr;
                        i18 = i7;
                        i17 = i4;
                        i19 = i3;
                        i28 = i2;
                        i30 = i;
                    } else {
                        sArr3 = sArr;
                        i6 = i2;
                        i30 = i;
                        int iM316110 = C0773.m3169("ۧ֨") ^ i16;
                        int i419 = ((iM316110 ^ i15) * 5679) ^ (-1012324439);
                        i18 = iM316110 ^ (-140762299);
                        sArr8 = sArr2;
                        sArr4 = sArr3;
                        i17 = i419;
                        int i4110 = i3;
                        i28 = i6;
                        i19 = i4110;
                    }
                    break;
                case -228762157:
                case 124665109:
                    i11 = i28;
                    i24 = 18910;
                    iM31611 = C0773.m3169("ܰۖ") ^ i15;
                    i12 = ((iM31611 ^ i16) * 10065) ^ (-1882790112);
                    i13 = -606284819;
                    int i311112 = iM31611 ^ i13;
                    i30 = i30;
                    short[] sArr1110 = sArr4;
                    i18 = i311112;
                    i17 = i12;
                    sArr8 = sArr8;
                    sArr4 = sArr1110;
                    int i311113 = i19;
                    i28 = i11;
                    i19 = i311113;
                    break;
                case -83532740:
                case 1038653288:
                    return C2419.m8175(componentName2.getClassName(), Main.class.getName());
                case 88977589:
                case 480631810:
                    b = 2;
                    sArr8 = sArr8;
                    int i4111 = i28;
                    i19 = i19;
                    i11 = i4111;
                    r6 = b;
                    iM31612 = C0619.m2761("֡ۙ") ^ i15;
                    sArr4 = sArr4;
                    i17 = ((iM31612 ^ i16) * (-3499)) ^ (-389040566);
                    i14 = 88670975;
                    r7 = r6;
                    int i3124 = iM31612 ^ i14;
                    i30 = i30;
                    int i3125 = i19;
                    i28 = i11;
                    i19 = i3125;
                    short[] sArr1111 = sArr4;
                    i18 = i3124;
                    sArr8 = sArr8;
                    sArr4 = sArr1111;
                    break;
                case 179482680:
                case 1105402425:
                    i3 = i19;
                    sArr2 = sArr8;
                    sArr3 = f63379;
                    i30 = 75;
                    i6 = 24;
                    if (!C0619.m2763()) {
                        int iM31620 = (C0773.m3169("ۛ۟") + i15) * 17;
                        i9 = ((iM31620 ^ i16) * 17987) ^ (-689396946);
                        i18 = iM31620 ^ (-295771981);
                        i19 = i3;
                        sArr8 = sArr2;
                        i28 = 24;
                        sArr4 = sArr3;
                        i17 = i9;
                    } else {
                        int iM316111 = C0773.m3169("ۧ֨") ^ i16;
                        int i4112 = ((iM316111 ^ i15) * 5679) ^ (-1012324439);
                        i18 = iM316111 ^ (-140762299);
                        sArr8 = sArr2;
                        sArr4 = sArr3;
                        i17 = i4112;
                        int i4113 = i3;
                        i28 = i6;
                        i19 = i4113;
                    }
                    break;
                case 246286847:
                case 1595049002:
                    return z;
                case 514970868:
                case 1484811613:
                    b = -1;
                    sArr8 = sArr8;
                    int i4114 = i28;
                    i19 = i19;
                    i11 = i4114;
                    r6 = b;
                    iM31612 = C0619.m2761("֡ۙ") ^ i15;
                    sArr4 = sArr4;
                    i17 = ((iM31612 ^ i16) * (-3499)) ^ (-389040566);
                    i14 = 88670975;
                    r7 = r6;
                    int i3126 = iM31612 ^ i14;
                    i30 = i30;
                    int i3127 = i19;
                    i28 = i11;
                    i19 = i3127;
                    short[] sArr1112 = sArr4;
                    i18 = i3126;
                    sArr8 = sArr8;
                    sArr4 = sArr1112;
                    break;
                case 1657757694:
                case 1763179261:
                    sArr8 = f63379;
                    i20 = 148;
                    i25 = 16;
                    if (C1146.f4234 < 0) {
                        iM31610 = C0773.m3169("۬۟") ^ i15;
                        i9 = ((iM31610 ^ i16) * 2027) ^ 1756561086;
                        i10 = 262641970;
                        i18 = iM31610 ^ i10;
                        i17 = i9;
                    } else {
                        sArr = sArr4;
                        i = i30;
                        int i320 = i28;
                        i3 = i19;
                        i8 = i320;
                        int iM316112 = (C0773.m3169("ۨܳ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = i8;
                        i4 = ((iM316112 ^ i15) * 20077) ^ 887906720;
                        i7 = iM316112 ^ 259751392;
                        sArr4 = sArr;
                        i18 = i7;
                        i17 = i4;
                        i19 = i3;
                        i28 = i2;
                        i30 = i;
                    }
                    break;
                default:
                    if (C2702.f8586 <= 0) {
                        sArr = sArr4;
                        i = i30;
                        int i321 = i28;
                        i3 = i19;
                        i8 = i321;
                        int iM316113 = (C0773.m3169("ۨܳ") + i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = i8;
                        i4 = ((iM316113 ^ i15) * 20077) ^ 887906720;
                        i7 = iM316113 ^ 259751392;
                        sArr4 = sArr;
                        i18 = i7;
                        i17 = i4;
                        i19 = i3;
                        i28 = i2;
                        i30 = i;
                    } else {
                        sArr4 = sArr4;
                        i30 = i30;
                        sArr8 = sArr8;
                        int i57 = i28;
                        i19 = i19;
                        i11 = i57;
                        iM31611 = (i15 - C0619.m2761("ۗۨ")) * 25;
                        i12 = ((iM31611 ^ i16) * 12751) ^ (-1110244840);
                        i13 = -525977977;
                        int i311114 = iM31611 ^ i13;
                        i30 = i30;
                        short[] sArr1113 = sArr4;
                        i18 = i311114;
                        i17 = i12;
                        sArr8 = sArr8;
                        sArr4 = sArr1113;
                        int i311115 = i19;
                        i28 = i11;
                        i19 = i311115;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0484 A[PHI: r18 r19 r22 r28
      0x0484: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:116:0x0482, B:108:0x0422] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r19v4 short) = (r19v3 short), (r19v2 short) binds: [B:116:0x0482, B:108:0x0422] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r22v3 int) = (r22v2 int), (r22v4 int) binds: [B:116:0x0482, B:108:0x0422] A[DONT_GENERATE, DONT_INLINE]
      0x0484: PHI (r28v13 int) = (r28v11 int), (r28v14 int) binds: [B:116:0x0482, B:108:0x0422] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ab A[PHI: r10 r12 r13
      0x01ab: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:53:0x01a9, B:191:0x01ab, B:190:0x01ab, B:21:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:53:0x01a9, B:191:0x01ab, B:190:0x01ab, B:21:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:53:0x01a9, B:191:0x01ab, B:190:0x01ab, B:21:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x027f A[PHI: r6
      0x027f: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v1 java.lang.String) binds: [B:69:0x0236, B:57:0x01e1, B:49:0x0187, B:41:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x011a. Please report as an issue. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentName m45352(Activity activity, List list) {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        ComponentName componentName;
        int i5;
        int iM3169;
        int i6;
        Activity activity2 = activity;
        ActivityManager.RecentTaskInfo taskInfo = null;
        String className = null;
        byte b = 0;
        int i7 = 0;
        int i8 = 1510931366;
        int i9 = C4238.f15451;
        int i10 = C2966.f9654;
        int iM2763 = (i9 - C0619.m2761("ۚܿ")) * (-63);
        int i11 = ((iM2763 ^ i10) * (-14431)) ^ 357666796;
        int i12 = iM2763 ^ 114727695;
        ActivityManager.AppTask appTask = null;
        ComponentName componentName2 = null;
        ComponentName componentName3 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        short s3 = 0;
        int i19 = 0;
        int i20 = 0;
        byte b2 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 1643) >> 31));
            switch (i8) {
                case -2045192089:
                case -705179269:
                    if (C3492.m11490(className, C1564.m5510(sArr, i18, i17, i7))) {
                        iM2761 = C0619.m2761("۠᩵") ^ i10;
                        i = ((iM2761 ^ i9) * (-21917)) ^ 1468817789;
                        i2 = 1747611363;
                    } else {
                        iM2761 = (C0619.m2761("֫֫") + i9) * (-61);
                        i = ((iM2761 ^ i10) * 3595) ^ 753014449;
                        i2 = -2124949519;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -2004642463:
                case -1328743673:
                    appTask = (ActivityManager.AppTask) C3690.m11998(list, 0);
                    if (C1542.f5343 <= 0) {
                        i13 = i13;
                        b2 = 0;
                        iM2762 = (C0619.m2761("ᩳ֫") + i10) * (-95);
                        i3 = ((iM2762 ^ i9) * 3417) ^ (-1159171585);
                        i4 = -681982094;
                        int i21 = i13;
                        i12 = iM2762 ^ i4;
                        i11 = i3;
                        i13 = i21;
                    } else {
                        int iM2764 = (C0619.m2761("ܿۢ") + i10) * 17;
                        i11 = ((iM2764 ^ i9) * (-25473)) ^ (-1354060457);
                        i12 = iM2764 ^ (-1680999979);
                        b2 = 0;
                    }
                    break;
                case -1892919224:
                case -981801044:
                    i13 = i13;
                    if (i19 - (i20 * i20) > 0) {
                        iM2762 = C0773.m3169("۫ۧ") ^ i10;
                        i3 = ((iM2762 ^ i9) * (-12655)) ^ (-1899707306);
                        i4 = 17722247;
                    } else {
                        iM2762 = (C0619.m2761("ۛܶ") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2762 ^ i10) * (-7139)) ^ (-491815657);
                        i4 = 84298511;
                    }
                    int i22 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i22;
                    break;
                case -1867304278:
                case 342223741:
                    i13 = i13;
                    i19 = s2 * s;
                    s3 = 17079;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2762 = (C0619.m2761("ᩳ֫") + i10) * (-95);
                        i3 = ((iM2762 ^ i9) * 3417) ^ (-1159171585);
                        i4 = -681982094;
                    } else {
                        iM2762 = (C0619.m2761("۫ܺ") + i10) * 69;
                        i3 = ((iM2762 ^ i9) * 19537) ^ 1560653735;
                        i4 = 778966319;
                    }
                    int i23 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i23;
                    break;
                case -1760170385:
                case 555189972:
                    sArr2 = f63379;
                    i13 = 50;
                    i14 = 24;
                    if (C3492.f12043 > 0) {
                        iM2761 = (C0619.m2761("ۨܶ") ^ i9) * 91;
                        i = ((iM2761 ^ i10) * (-3701)) ^ (-1950213240);
                        i2 = -734443910;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        int iM31610 = C0773.m3169("ܳܰ") ^ i9;
                        i12 = iM31610 ^ 1570274459;
                        i11 = ((iM31610 ^ i10) * 26983) ^ 1160463511;
                        activity2 = activity;
                    }
                    break;
                case -1677322119:
                case 1085075726:
                    sArr4 = f63379;
                    i15 = 1;
                    i16 = 24;
                    if (C2485.f7950 == 0) {
                        iM2761 = C0619.m2761("ۖۡ") ^ i10;
                        i = ((iM2761 ^ i9) * (-17231)) ^ (-172290599);
                        i2 = -982070042;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        int iM31611 = C0773.m3169("ܳܰ") ^ i9;
                        i12 = iM31611 ^ 1570274459;
                        i11 = ((iM31611 ^ i10) * 26983) ^ 1160463511;
                        activity2 = activity;
                    }
                    break;
                case -1676578024:
                case -267753640:
                    i7 = 34107;
                    iM2762 = (C0773.m3169("᩵᩵") + i10) * (-121);
                    i3 = ((iM2762 ^ i9) * 4123) ^ 322258594;
                    i4 = 343211732;
                    int i24 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i24;
                    break;
                case -1676343369:
                case -1373658143:
                    i13 = i13;
                    if (Build.VERSION.SDK_INT <= 23) {
                        iM2762 = (C0619.m2761("ܳ᩺") + i9) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2762 ^ i10) * (-1165)) ^ (-347068491);
                        i4 = -946157496;
                    } else {
                        iM2762 = C0773.m3169("ۧ᩻") ^ i9;
                        i3 = ((iM2762 ^ i10) * 6853) ^ 2103524016;
                        i4 = -1702382318;
                    }
                    int i25 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i25;
                    break;
                case -1581206336:
                case -822140552:
                    if (C1564.f5401 > 0) {
                        i5 = i13;
                        iM3169 = (C0619.m2761("ܰܿ") + i10) * (-13);
                        i11 = ((iM3169 ^ i9) * 27287) ^ (-366702687);
                        i6 = -868466717;
                        int i26 = iM3169 ^ i6;
                        i13 = i5;
                        i12 = i26;
                        activity2 = activity;
                    } else {
                        iM2761 = (i9 - C0619.m2761("۠ۨ")) * (-57);
                        i = ((iM2761 ^ i10) * 11841) ^ 408813001;
                        i2 = 500434157;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -1568254851:
                case -192642315:
                    componentName = null;
                    componentName3 = componentName;
                    iM2762 = (i10 - C0619.m2761("᩶ۙ")) * (-103);
                    i13 = i13;
                    i3 = ((iM2762 ^ i9) * (-22221)) ^ 34976103;
                    i4 = -900306170;
                    int i27 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i27;
                    break;
                case -1524204556:
                case 1734015561:
                    C4282.m13644();
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0773.m3169("ۧ᩹") + i10) * (-9);
                        i = ((iM2761 ^ i9) * (-14941)) ^ (-1637779054);
                        i2 = 558270040;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        i5 = i13;
                        iM3169 = (C0619.m2761("ܰܿ") + i10) * (-13);
                        i11 = ((iM3169 ^ i9) * 27287) ^ (-366702687);
                        i6 = -868466717;
                        int i28 = iM3169 ^ i6;
                        i13 = i5;
                        i12 = i28;
                        activity2 = activity;
                    }
                    break;
                case -1431742784:
                case 264805259:
                    i5 = i13;
                    if (RunnableC1848.f6235) {
                        iM3169 = (i9 - C0773.m3169("ۤ᩹")) * 73;
                        i11 = ((iM3169 ^ i10) * 25721) ^ 2092748336;
                        i6 = -992562159;
                    } else {
                        iM3169 = (C0773.m3169("ۡ֫") ^ i10) * (-9);
                        i11 = ((iM3169 ^ i9) * (-807)) ^ (-351293270);
                        i6 = 1488607136;
                    }
                    int i29 = iM3169 ^ i6;
                    i13 = i5;
                    i12 = i29;
                    activity2 = activity;
                    break;
                case -1385778714:
                case -140076800:
                    sArr = f63379;
                    i18 = 25;
                    i17 = 25;
                    if (C2485.f7950 != 0) {
                        iM2761 = (i9 - C0619.m2761("۠ۨ")) * (-57);
                        i = ((iM2761 ^ i10) * 11841) ^ 408813001;
                        i2 = 500434157;
                    } else {
                        iM2761 = C0773.m3169("ۡۖ") ^ i9;
                        i = ((iM2761 ^ i10) * 9235) ^ (-1321102351);
                        i2 = 1665151047;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -1303593421:
                case 559788079:
                    i5 = i13;
                    sArr3 = f63379;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("ܰܿ") + i10) * (-13);
                        i11 = ((iM3169 ^ i9) * 27287) ^ (-366702687);
                        i6 = -868466717;
                    } else {
                        iM3169 = (C0619.m2761("ᩳۙ") + i9) * (-123);
                        i11 = ((iM3169 ^ i10) * 30679) ^ 977204817;
                        i6 = 13168919;
                    }
                    int i210 = iM3169 ^ i6;
                    i13 = i5;
                    i12 = i210;
                    activity2 = activity;
                    break;
                case -1226574556:
                case 1168885080:
                    i13 = i13;
                    if (AbstractC3624.m11761(list)) {
                        iM2762 = (C0773.m3169("ᩳۘ") + i10) * (-19);
                        i3 = ((iM2762 ^ i9) * (-8187)) ^ 2097290573;
                        i4 = -1562216675;
                    } else {
                        iM2762 = C0619.m2761("ۨ᩺") ^ i9;
                        i3 = ((iM2762 ^ i10) * 11677) ^ 2009409534;
                        i4 = 1043618010;
                    }
                    int i211 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i211;
                    break;
                case -1153201884:
                case 626243569:
                    className = componentName2.getClassName();
                    C17202.m40369(className);
                    switch (C0773.m3169(className)) {
                        case -1577057716:
                            iM2761 = (C0773.m3169("ۤ᩵") + i9) * (-5);
                            i = ((iM2761 ^ i10) * 5689) ^ 1154512130;
                            i2 = 785116368;
                            break;
                        case -1350715006:
                            iM2761 = (i10 - C0619.m2761("ۚ֡")) * 5;
                            i = ((iM2761 ^ i9) * (-12499)) ^ (-13249145);
                            i2 = -432274516;
                            break;
                        case 12451804:
                            iM2761 = (C0773.m3169("ܽ۫") + i10) * 61;
                            i = ((iM2761 ^ i9) * 8467) ^ 1331482135;
                            i2 = 1373551577;
                            break;
                        default:
                            iM2761 = (C0619.m2761("֫֫") + i9) * (-61);
                            i = ((iM2761 ^ i10) * 3595) ^ 753014449;
                            i2 = -2124949519;
                            break;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -928691755:
                case -181058379:
                    b = 1;
                    iM2761 = (C0773.m3169("᩵۟") + i10) * (-51);
                    i = ((iM2761 ^ i9) * 2363) ^ (-1686540636);
                    i2 = 1580131402;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -915703371:
                case 801414141:
                    C2485.m8357();
                    if (!C17202.f56030) {
                        iM2761 = (i9 - C0619.m2761("۠ۨ")) * (-57);
                        i = ((iM2761 ^ i10) * 11841) ^ 408813001;
                        i2 = 500434157;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    } else {
                        i5 = i13;
                        iM3169 = (i9 - C0773.m3169("ۤ᩹")) * 73;
                        i11 = ((iM3169 ^ i10) * 25721) ^ 2092748336;
                        i6 = -992562159;
                        int i212 = iM3169 ^ i6;
                        i13 = i5;
                        i12 = i212;
                        activity2 = activity;
                    }
                    break;
                case -847155885:
                case -812320988:
                    componentName = taskInfo.origActivity;
                    componentName3 = componentName;
                    iM2762 = (i10 - C0619.m2761("᩶ۙ")) * (-103);
                    i13 = i13;
                    i3 = ((iM2762 ^ i9) * (-22221)) ^ 34976103;
                    i4 = -900306170;
                    int i213 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i213;
                    break;
                case -630093143:
                case -174327217:
                    i13 = i13;
                    s2 = sArr3[c];
                    s = 68316;
                    if (C1826.f6190 <= 0) {
                        iM2762 = (i10 - C0773.m3169("ۛܳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2762 ^ i9) * (-3895)) ^ (-936973867);
                        i4 = 1975526191;
                    } else {
                        iM2762 = C0619.m2761("ܰ᩷") ^ i10;
                        i3 = ((iM2762 ^ i9) * 16057) ^ (-1207450158);
                        i4 = 229379630;
                    }
                    int i214 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i214;
                    break;
                case -605007213:
                case -142810454:
                    b = -1;
                    iM2761 = (C0773.m3169("᩵۟") + i10) * (-51);
                    i = ((iM2761 ^ i9) * 2363) ^ (-1686540636);
                    i2 = 1580131402;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case -584233307:
                case 1497234346:
                    C1519.m5403();
                    return null;
                case -567545418:
                case 686827859:
                    C11235.m28309();
                    if (C1519.f5300 >= 0) {
                        int iM31612 = C0773.m3169("ܳܰ") ^ i9;
                        i12 = iM31612 ^ 1570274459;
                        i11 = ((iM31612 ^ i10) * 26983) ^ 1160463511;
                        activity2 = activity;
                    } else {
                        iM2761 = C0619.m2761("᩻᩵") ^ i9;
                        i = ((iM2761 ^ i10) * (-30131)) ^ (-1799058872);
                        i2 = 2018202379;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -524977195:
                case -186222477:
                    taskInfo = appTask.getTaskInfo();
                    ComponentName componentName4 = taskInfo.origActivity;
                    if (componentName4 != null) {
                        int iM31613 = C0773.m3169("ܺۡ") ^ i9;
                        componentName2 = componentName4;
                        i11 = ((iM31613 ^ i10) * (-263)) ^ (-1202119056);
                        i12 = iM31613 ^ 234115818;
                    } else {
                        componentName2 = componentName4;
                        i13 = i13;
                        iM2762 = (C0773.m3169("ᩳۘ") + i10) * (-19);
                        i3 = ((iM2762 ^ i9) * (-8187)) ^ 2097290573;
                        i4 = -1562216675;
                        int i215 = i13;
                        i12 = iM2762 ^ i4;
                        i11 = i3;
                        i13 = i215;
                    }
                    break;
                case -381131591:
                case 31792234:
                    C2023.m6964();
                    if (C3033.m9845() > 0) {
                        i13 = i13;
                        iM2762 = (C0619.m2761("ᩳ֫") + i10) * (-95);
                        i3 = ((iM2762 ^ i9) * 3417) ^ (-1159171585);
                        i4 = -681982094;
                        int i216 = i13;
                        i12 = iM2762 ^ i4;
                        i11 = i3;
                        i13 = i216;
                    } else {
                        iM2761 = (C0773.m3169("ۧ᩹") + i10) * (-9);
                        i = ((iM2761 ^ i9) * (-14941)) ^ (-1637779054);
                        i2 = 558270040;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
                case -332909725:
                case 560706503:
                    switch (b) {
                        case 0:
                        case 1:
                        case 2:
                            iM2761 = C0619.m2761("ۘܳ") ^ i10;
                            i = ((iM2761 ^ i9) * (-21941)) ^ 1280402604;
                            i2 = 1384901052;
                            i12 = iM2761 ^ i2;
                            i11 = i;
                            break;
                        default:
                            i13 = i13;
                            iM2762 = (C0773.m3169("ᩳۘ") + i10) * (-19);
                            i3 = ((iM2762 ^ i9) * (-8187)) ^ 2097290573;
                            i4 = -1562216675;
                            int i217 = i13;
                            i12 = iM2762 ^ i4;
                            i11 = i3;
                            i13 = i217;
                            break;
                    }
                    break;
                case -125833367:
                case 741374031:
                    return new ComponentName(activity2, (Class<?>) Main.class);
                case -16430411:
                case 882938172:
                    i5 = i13;
                    c = 0;
                    if (C23916.f77426 > 0) {
                        iM3169 = (C0773.m3169("᩷֫") + i9) * (-39);
                        i11 = ((iM3169 ^ i10) * 31975) ^ (-517311844);
                        i6 = -603181062;
                        int i218 = iM3169 ^ i6;
                        i13 = i5;
                        i12 = i218;
                        activity2 = activity;
                    } else {
                        i13 = i5;
                        int iM31614 = C0773.m3169("ܳܰ") ^ i9;
                        i12 = iM31614 ^ 1570274459;
                        i11 = ((iM31614 ^ i10) * 26983) ^ 1160463511;
                        activity2 = activity;
                    }
                    break;
                case 22592394:
                case 64115366:
                    if (componentName3 == null) {
                        iM2761 = C0773.m3169("֡ܰ") ^ i10;
                        i = ((iM2761 ^ i9) * 9953) ^ 1745996052;
                        i2 = -1925540803;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩷") ^ i9;
                        i = ((iM2761 ^ i10) * 6575) ^ 195775676;
                        i2 = -263610733;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 259525570:
                case 1191070831:
                    return componentName3;
                case 270918737:
                case 575671008:
                    return new C9575(activity2).m25005();
                case 577470563:
                case 1518696367:
                    b = 2;
                    iM2761 = (C0773.m3169("᩵۟") + i10) * (-51);
                    i = ((iM2761 ^ i9) * 2363) ^ (-1686540636);
                    i2 = 1580131402;
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 660964071:
                case 1575658853:
                    if (C3492.m11490(className, C4238.m13530(sArr2, i13, i14, i7))) {
                        iM2761 = C0619.m2761("᩻ᩴ") ^ i9;
                        i = ((iM2761 ^ i10) * 12111) ^ 2019130097;
                        i2 = -1797262829;
                    } else {
                        iM2761 = (C0619.m2761("֫֫") + i9) * (-61);
                        i = ((iM2761 ^ i10) * 3595) ^ 753014449;
                        i2 = -2124949519;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 737938150:
                case 1483330542:
                    if (C2419.m8175(className, C2878.m9486(sArr4, i15, i16, i7))) {
                        b = b2;
                        iM2761 = (C0773.m3169("᩵۟") + i10) * (-51);
                        i = ((iM2761 ^ i9) * 2363) ^ (-1686540636);
                        i2 = 1580131402;
                    } else {
                        iM2761 = (C0619.m2761("֫֫") + i9) * (-61);
                        i = ((iM2761 ^ i10) * 3595) ^ 753014449;
                        i2 = -2124949519;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 1286626122:
                case 1976405479:
                    AbstractC0116.m1243();
                    C2966.m9664();
                    i5 = i13;
                    iM3169 = (i9 - C0773.m3169("ۤ᩹")) * 73;
                    i11 = ((iM3169 ^ i10) * 25721) ^ 2092748336;
                    i6 = -992562159;
                    int i219 = iM3169 ^ i6;
                    i13 = i5;
                    i12 = i219;
                    activity2 = activity;
                    break;
                case 1436000439:
                case 1486823035:
                    C0487.m2356();
                    if (C1146.f4234 < 0) {
                        iM2761 = (i9 - C0619.m2761("۠ۨ")) * (-57);
                        i = ((iM2761 ^ i10) * 11841) ^ 408813001;
                        i2 = 500434157;
                    } else {
                        iM2761 = C0619.m2761("᩻᩵") ^ i9;
                        i = ((iM2761 ^ i10) * (-30131)) ^ (-1799058872);
                        i2 = 2018202379;
                    }
                    i12 = iM2761 ^ i2;
                    i11 = i;
                    break;
                case 1541084169:
                case 1567200591:
                    i7 = 48289;
                    iM2762 = (C0773.m3169("᩵᩵") + i10) * (-121);
                    i3 = ((iM2762 ^ i9) * 4123) ^ 322258594;
                    i4 = 343211732;
                    int i2110 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i2110;
                    break;
                case 1925297585:
                case 2007111829:
                    i13 = i13;
                    i20 = s2 + s3;
                    if (C11235.f35427 >= 0) {
                        iM2762 = (i10 - C0773.m3169("ۛܳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2762 ^ i9) * (-3895)) ^ (-936973867);
                        i4 = 1975526191;
                    } else {
                        iM2762 = (C0619.m2761("᩻۠") ^ i9) * 5;
                        i3 = ((iM2762 ^ i10) * 3269) ^ 1216823295;
                        i4 = 1425982768;
                    }
                    int i2111 = i13;
                    i12 = iM2762 ^ i4;
                    i11 = i3;
                    i13 = i2111;
                    break;
                default:
                    if (!C2878.f9462) {
                        i13 = i13;
                        iM2762 = (C0619.m2761("ᩳ֫") + i10) * (-95);
                        i3 = ((iM2762 ^ i9) * 3417) ^ (-1159171585);
                        i4 = -681982094;
                        int i2112 = i13;
                        i12 = iM2762 ^ i4;
                        i11 = i3;
                        i13 = i2112;
                    } else {
                        iM2761 = (i9 - C0619.m2761("ܽ᩻")) * 5;
                        i = ((iM2761 ^ i10) * (-18115)) ^ 242445367;
                        i2 = 2026319822;
                        i12 = iM2761 ^ i2;
                        i11 = i;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45354(Activity activity) {
        int i = 1574861967;
        int i2 = C1564.f5401;
        int i3 = C3734.f12817;
        int iM3169 = C0773.m3169("᩻ۜ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 22749) ^ (-1344535352);
        int i5 = 789239909;
        while (true) {
            i = ((((i ^ i3) * (-887)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2046595978:
                case 1009815888:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܶ۠")) * (-35);
                        i4 = ((iM3169 ^ i2) * 26981) ^ (-2142735965);
                        i5 = -1170052469;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֫᩷")) * 41;
                        i4 = ((iM3169 ^ i2) * 1075) ^ (-737565179);
                        i5 = 1801923296;
                    }
                    break;
                case -2031045875:
                case 646876921:
                    C4238.m13540();
                    C1080.m4050();
                    iM3169 = C0619.m2761("ܳۘ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 4581) ^ (-483617561);
                    i5 = -1014201677;
                    break;
                case -1964404494:
                case -1510507268:
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("ۚۛ") ^ i2) * 37;
                        i4 = ((iM3169 ^ i3) * (-26577)) ^ 1997838187;
                        i5 = 836298892;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ᩴۜ")) * 53;
                        i4 = ((iM3169 ^ i2) * 1435) ^ (-897522170);
                        i5 = -46066500;
                    }
                    break;
                case -1658980638:
                case -1258844043:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ۧ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31259) ^ 1891788180;
                        i5 = 1765046449;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۗ۟")) * (-41);
                        i4 = ((iM3169 ^ i2) * 6989) ^ 977571995;
                        i5 = -2099883225;
                    }
                    break;
                case -1615382979:
                case 214571976:
                    activity.finishAndRemoveTask();
                    break;
                case -1566072672:
                case 66962847:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("᩹۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17979)) ^ (-2098401071);
                        i5 = 1883533608;
                    } else {
                        iM3169 = C0619.m2761("ܿۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5051) ^ 1253755924;
                        i5 = -1691087077;
                    }
                    break;
                case -1492592190:
                case -509408992:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ܳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4581) ^ (-483617561);
                        i5 = -1014201677;
                    } else {
                        iM3169 = (C0773.m3169("ᩳܿ") + i3) * (-89);
                        i4 = ((iM3169 ^ i2) * (-22089)) ^ (-1926678853);
                        i5 = -655001460;
                    }
                    break;
                case -1341349638:
                case 1133925862:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ܶ۠")) * (-35);
                        i4 = ((iM3169 ^ i2) * 26981) ^ (-2142735965);
                        i5 = -1170052469;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܶ") + i2) * (-65);
                        i4 = ((iM3169 ^ i3) * 11643) ^ 281984768;
                        i5 = -1336825894;
                    }
                    break;
                case -1189378811:
                case 317180041:
                    C3779.m12264();
                    C1146.m4231();
                    break;
                case -996456476:
                case -184682513:
                    if (C2288.m7767()) {
                        iM3169 = C0619.m2761("᩹۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17979)) ^ (-2098401071);
                        i5 = 1883533608;
                    } else {
                        iM3169 = (C0773.m3169("֨۬") ^ i2) * 81;
                        i4 = ((iM3169 ^ i3) * 6451) ^ 1573094035;
                        i5 = -399567639;
                    }
                    break;
                case -917102994:
                case -447249406:
                    if (C1826.f6190 > 0) {
                        iM3169 = (i3 - C0619.m2761("ܶ۠")) * (-35);
                        i4 = ((iM3169 ^ i2) * 26981) ^ (-2142735965);
                        i5 = -1170052469;
                    } else {
                        iM3169 = C0619.m2761("ܳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4581) ^ (-483617561);
                        i5 = -1014201677;
                    }
                    break;
                case -697713184:
                case 1436418583:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ܶ۠")) * (-35);
                        i4 = ((iM3169 ^ i2) * 26981) ^ (-2142735965);
                        i5 = -1170052469;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ᩷") ^ i2) * (-21);
                        i4 = ((iM3169 ^ i3) * (-12417)) ^ (-1155868554);
                        i5 = -488880789;
                    }
                    break;
                case -381527909:
                case 613504952:
                    C2834.m9344();
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ۧ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31259) ^ 1891788180;
                        i5 = 1765046449;
                    } else {
                        iM3169 = C0619.m2761("ܳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4581) ^ (-483617561);
                        i5 = -1014201677;
                    }
                    break;
                case 259012570:
                case 319939707:
                    if (C1783.m6232()) {
                        iM3169 = (i3 - C0773.m3169("᩹ᩳ")) * 109;
                        i4 = ((iM3169 ^ i2) * (-19739)) ^ (-1959573988);
                        i5 = 891880277;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ᩴۜ")) * 53;
                        i4 = ((iM3169 ^ i2) * 1435) ^ (-897522170);
                        i5 = -46066500;
                    }
                    break;
                case 329476461:
                case 1621867870:
                    C2287.m7745();
                    if (!C0619.f2439) {
                        iM3169 = C0619.m2761("ܳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4581) ^ (-483617561);
                        i5 = -1014201677;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ᩴۜ")) * 53;
                        i4 = ((iM3169 ^ i2) * 1435) ^ (-897522170);
                        i5 = -46066500;
                    }
                    break;
                case 567132622:
                case 1424207143:
                    if (activity.isTaskRoot()) {
                        iM3169 = (C0773.m3169("ᩳ۟") ^ i3) * (-55);
                        i4 = ((iM3169 ^ i2) * (-21209)) ^ 2126982711;
                        i5 = -193175275;
                    } else {
                        iM3169 = (C0773.m3169("ۚ֫") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * 29147) ^ (-9384263);
                        i5 = 502189501;
                    }
                    break;
                case 1597638009:
                case 1858873844:
                    if (C3690.m11987()) {
                        iM3169 = C0619.m2761("ܳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4581) ^ (-483617561);
                        i5 = -1014201677;
                    } else {
                        iM3169 = (C0619.m2761("ܽ᩺") + i3) * 127;
                        i4 = ((iM3169 ^ i2) * 3281) ^ 1692094759;
                        i5 = 2033881496;
                    }
                    break;
                default:
                    C4238.m13537(activity);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x02c9 A[PHI: r51
      0x02c9: PHI (r51v8 int) = (r51v4 int), (r51v9 int) binds: [B:56:0x02b2, B:44:0x023f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v50, types: [java.io.InputStream] */
    @Override // l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM2761;
        int i;
        int i2;
        Uri uri;
        ComponentName componentName;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        Intent intent;
        boolean z;
        String str2;
        int iM2762;
        int i7;
        int i8;
        Intent intent2;
        int i9;
        int i10;
        Intent intentM8359;
        int i11;
        int i12;
        String str3;
        ResolveInfo resolveInfo;
        Uri uri2;
        ComponentName componentName2;
        int i13;
        Intent intent3;
        Uri uri3;
        ComponentName componentName3;
        int i14;
        int i15;
        ResolveInfo resolveInfo2;
        int iM3169;
        int i16;
        int i17;
        int i18;
        Intent intent4;
        ResolveInfo resolveInfo3;
        int i19;
        int iM31610;
        int i20;
        int iM2763;
        int i21;
        Uri uri4;
        int i22 = C3448.f11240;
        int i23 = C4238.f15451;
        int iM31611 = (C0773.m3169("᩷ۜ") + i22) * (-89);
        int i24 = ((iM31611 ^ i23) * (-14565)) ^ 283377264;
        C22667 c22667 = null;
        Intent intent5 = null;
        ComponentName componentNameM45352 = null;
        C22667 c22668 = null;
        ResolveInfo resolveInfo4 = null;
        Intent intent6 = null;
        String str4 = null;
        Object objM13655 = null;
        ActivityManager.AppTask appTask = null;
        int i25 = iM31611 ^ (-1479081891);
        int taskId = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean zM49833 = false;
        boolean zM11761 = false;
        boolean zM45355 = false;
        boolean zIsVisible = false;
        Intent intent7 = null;
        boolean z2 = false;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        List<ActivityManager.AppTask> appTasks = null;
        AbstractC22044 abstractC22044M13271 = null;
        String strM33137 = null;
        IOException iOException = null;
        String strM13270 = null;
        Uri uriM49836 = null;
        boolean z3 = false;
        int i32 = 1611456384;
        List<ResolveInfo> list = null;
        Iterator itM7968 = null;
        Iterator itM7969 = null;
        String type = null;
        int iM9336 = 0;
        C22667 c22669 = null;
        C4144 c4144M35208 = null;
        boolean z4 = false;
        ResolveInfo resolveInfo5 = null;
        String strM3168 = null;
        while (true) {
            int i33 = i25 ^ (i24 & (((i32 ^ i23) * 29413) >> 31));
            switch (i33) {
                case -2138301602:
                case 980276521:
                    i33 = i33;
                    i27 = i27;
                    intent4 = intent5;
                    resolveInfo3 = resolveInfo4;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    Intent intent8 = intent7;
                    i6 = taskId;
                    intent = intent8;
                    String action = intent.getAction();
                    type = intent.getType();
                    iM9336 = iM9336;
                    strM33137 = C13473.m33137(f63379, Primes.SMALL_FACTOR_LIMIT, 26, i5);
                    if (!C3492.m11490(strM33137, action)) {
                        str4 = str;
                        int iM31612 = C0773.m3169("ۧۗ") ^ i23;
                        i7 = ((iM31612 ^ i22) * (-22649)) ^ (-1749621294);
                        i18 = iM31612 ^ (-1767452090);
                        i31 = i4;
                        i29 = i5;
                        intent5 = intent4;
                        i27 = i27;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo3;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i34 = i6;
                        intent7 = intent;
                        taskId = i34;
                    } else {
                        int iM31613 = C0773.m3169("᩵ۖ") ^ i22;
                        i16 = ((iM31613 ^ i23) * (-22151)) ^ 429907693;
                        i19 = iM31613 ^ (-779777409);
                        i31 = i4;
                        intent5 = intent4;
                        i27 = i27;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo3;
                        iM9336 = iM9336;
                        i32 = i33;
                        int i35 = i3;
                        i25 = i19;
                        i24 = i16;
                        str4 = str;
                        i29 = i5;
                        i26 = i26;
                        i30 = i35;
                        int i36 = i6;
                        intent7 = intent;
                        taskId = i36;
                    }
                    break;
                case -2134444703:
                case 1958269842:
                    i33 = i33;
                    i27 = i27;
                    i4 = i31;
                    Intent intent9 = intent7;
                    i6 = taskId;
                    intent = intent9;
                    int i37 = i29;
                    str = str4;
                    int i38 = i30;
                    i26 = i26;
                    i5 = i37;
                    try {
                        intent6 = new Intent();
                        ComponentName componentName4 = componentNameM45352;
                        try {
                            intent6.setComponent(componentName4);
                            AbstractC3624.m11767(intent6, i4);
                            AbstractC3624.m11767(intent6, i38);
                            try {
                                i3 = i38;
                                componentName = componentName4;
                                try {
                                    try {
                                        intent6.setAction(C23916.m53420(f63379, 282, 26, i5));
                                        uri4 = uriM49836;
                                        try {
                                            intent6.setData(uri4);
                                            zM11761 = AbstractC3624.m11761(appTasks);
                                            int iM2764 = (C0619.m2761("֡ۢ") + i22) * 13;
                                            uriM49836 = uri4;
                                            i31 = i4;
                                            componentNameM45352 = componentName;
                                            str4 = str;
                                            i29 = i5;
                                            i26 = i26;
                                            i30 = i3;
                                            i25 = iM2764 ^ 913579229;
                                            i24 = ((iM2764 ^ i23) * 10873) ^ (-1845997391);
                                            i27 = i27;
                                            i32 = i33;
                                        } catch (Exception unused) {
                                            uri = uri4;
                                            iM9336 = iM9336;
                                            str2 = type;
                                            iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                                            i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                                            i8 = 215022886;
                                            i18 = iM2762 ^ i8;
                                            resolveInfo5 = resolveInfo5;
                                            i31 = i4;
                                            componentNameM45352 = componentName;
                                            uriM49836 = uri;
                                            resolveInfo4 = resolveInfo4;
                                            type = str2;
                                            str4 = str;
                                            i29 = i5;
                                            intent5 = intent5;
                                            i27 = i27;
                                            i26 = i26;
                                            i32 = i33;
                                            i30 = i3;
                                            i25 = i18;
                                            i24 = i7;
                                            iM9336 = iM9336;
                                        }
                                    } catch (Exception unused2) {
                                        uri = uriM49836;
                                        str2 = type;
                                        iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                                        i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                                        i8 = 215022886;
                                        i18 = iM2762 ^ i8;
                                        resolveInfo5 = resolveInfo5;
                                        i31 = i4;
                                        componentNameM45352 = componentName;
                                        uriM49836 = uri;
                                        resolveInfo4 = resolveInfo4;
                                        type = str2;
                                        str4 = str;
                                        i29 = i5;
                                        intent5 = intent5;
                                        i27 = i27;
                                        i26 = i26;
                                        i32 = i33;
                                        i30 = i3;
                                        i25 = i18;
                                        i24 = i7;
                                        iM9336 = iM9336;
                                    }
                                } catch (Exception unused3) {
                                    uri4 = uriM49836;
                                    uri = uri4;
                                    iM9336 = iM9336;
                                    str2 = type;
                                    iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                                    i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                                    i8 = 215022886;
                                    i18 = iM2762 ^ i8;
                                    resolveInfo5 = resolveInfo5;
                                    i31 = i4;
                                    componentNameM45352 = componentName;
                                    uriM49836 = uri;
                                    resolveInfo4 = resolveInfo4;
                                    type = str2;
                                    str4 = str;
                                    i29 = i5;
                                    intent5 = intent5;
                                    i27 = i27;
                                    i26 = i26;
                                    i32 = i33;
                                    i30 = i3;
                                    i25 = i18;
                                    i24 = i7;
                                    iM9336 = iM9336;
                                    int i39 = i6;
                                    intent7 = intent;
                                    taskId = i39;
                                    break;
                                }
                            } catch (Exception unused4) {
                                i3 = i38;
                                componentName = componentName4;
                            }
                        } catch (Exception unused5) {
                            i3 = i38;
                            componentName = componentName4;
                        }
                    } catch (Exception unused6) {
                        i3 = i38;
                        componentName = componentNameM45352;
                        intent6 = null;
                    }
                    int i310 = i6;
                    intent7 = intent;
                    taskId = i310;
                    break;
                case -2090502240:
                case -439109243:
                    i26 = 0;
                    iM2761 = C0619.m2761("᩹᩸") ^ i23;
                    i = ((iM2761 ^ i22) * 6993) ^ 856709407;
                    i2 = 1075853796;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -2065370482:
                case 1970017169:
                    i33 = i33;
                    i11 = i27;
                    i12 = iM9336;
                    str3 = type;
                    resolveInfo = resolveInfo4;
                    uri2 = uriM49836;
                    componentName2 = componentNameM45352;
                    i3 = i30;
                    i13 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    Intent intent10 = intent7;
                    i6 = taskId;
                    intent = intent10;
                    intent3 = new Intent(intent.getAction());
                    intent3.setDataAndType(intent.getData(), intent.getType());
                    AbstractC0116.m1232(intent3, i13);
                    C1112.m4126(intent3, intent.getData());
                    List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent3, 65536);
                    list = listQueryIntentActivities;
                    itM7968 = C2354.m7968(listQueryIntentActivities);
                    int iM2765 = (C0619.m2761("۫᩺") ^ i22) * 41;
                    int i40 = ((iM2765 ^ i23) * (-17175)) ^ (-1306970521);
                    i15 = iM2765 ^ 1157755877;
                    i31 = i13;
                    componentNameM45352 = componentName2;
                    uriM49836 = uri2;
                    resolveInfo4 = resolveInfo;
                    iM9336 = i12;
                    type = str3;
                    intent5 = intent3;
                    i24 = i40;
                    i27 = i11;
                    i32 = i33;
                    int i41 = i6;
                    intent7 = intent;
                    taskId = i41;
                    i10 = i3;
                    i25 = i15;
                    str4 = str;
                    i29 = i5;
                    i26 = i26;
                    i30 = i10;
                    break;
                case -2055481499:
                case -1399760415:
                    i33 = i33;
                    i27 = i27;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    Intent intent11 = intent7;
                    i6 = taskId;
                    intent = intent11;
                    uri = uriM49836;
                    if (!C0487.m2359(type, RunnableC0334.m2049(f63379, 237, 5, i5))) {
                        iM9336 = iM9336;
                        intent4 = intent5;
                        resolveInfo3 = resolveInfo4;
                        str4 = str;
                        int iM31614 = C0773.m3169("ۧۗ") ^ i23;
                        i7 = ((iM31614 ^ i22) * (-22649)) ^ (-1749621294);
                        i18 = iM31614 ^ (-1767452090);
                        i31 = i4;
                        i29 = i5;
                        intent5 = intent4;
                        i27 = i27;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo3;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i311 = i6;
                        intent7 = intent;
                        taskId = i311;
                    } else {
                        iM2763 = C0619.m2761("ۚۨ") ^ i22;
                        i16 = ((iM2763 ^ i23) * 4723) ^ (-16488493);
                        i21 = -301659655;
                        i19 = iM2763 ^ i21;
                        i31 = i4;
                        i27 = i27;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        i32 = i33;
                        int i312 = i3;
                        i25 = i19;
                        i24 = i16;
                        str4 = str;
                        i29 = i5;
                        i26 = i26;
                        i30 = i312;
                        int i313 = i6;
                        intent7 = intent;
                        taskId = i313;
                    }
                    break;
                case -2010619143:
                case -872471634:
                    int i42 = i26;
                    int i43 = i27;
                    int i44 = iM9336;
                    int i45 = i29;
                    Intent intent12 = intent7;
                    i6 = taskId;
                    intent = intent12;
                    appTasks = ((ActivityManager) C23916.m53416(this, RunnableC3055.m9937(f63379, 192, 8, i45))).getAppTasks();
                    componentNameM45352 = m45352(this, appTasks);
                    z4 = true;
                    int iM31615 = (i22 - C0773.m3169("ۖ۟")) * (-7);
                    i25 = iM31615 ^ (-1134010419);
                    resolveInfo5 = resolveInfo5;
                    i31 = i31;
                    i24 = ((iM31615 ^ i23) * (-10947)) ^ 952260263;
                    uriM49836 = uriM49836;
                    resolveInfo4 = resolveInfo4;
                    iM9336 = i44;
                    type = type;
                    str4 = str4;
                    i29 = i45;
                    intent5 = intent5;
                    i27 = i43;
                    i26 = i42;
                    i32 = i33;
                    i30 = 67108864;
                    int i314 = i6;
                    intent7 = intent;
                    taskId = i314;
                    break;
                case -1948895189:
                case 969870808:
                    i33 = i33;
                    i27 = i27;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    Intent intent13 = intent7;
                    i6 = taskId;
                    intent = intent13;
                    if (type == null) {
                        iM9336 = iM9336;
                        intent4 = intent5;
                        resolveInfo3 = resolveInfo4;
                        str4 = str;
                        int iM31616 = C0773.m3169("ۧۗ") ^ i23;
                        i7 = ((iM31616 ^ i22) * (-22649)) ^ (-1749621294);
                        i18 = iM31616 ^ (-1767452090);
                        i31 = i4;
                        i29 = i5;
                        intent5 = intent4;
                        i27 = i27;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo3;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i315 = i6;
                        intent7 = intent;
                        taskId = i315;
                    } else {
                        iM2763 = C0619.m2761("֡ۤ") ^ i22;
                        i16 = ((iM2763 ^ i23) * 8893) ^ (-849419080);
                        i21 = 1155026980;
                        i19 = iM2763 ^ i21;
                        i31 = i4;
                        i27 = i27;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        i32 = i33;
                        int i316 = i3;
                        i25 = i19;
                        i24 = i16;
                        str4 = str;
                        i29 = i5;
                        i26 = i26;
                        i30 = i316;
                        int i317 = i6;
                        intent7 = intent;
                        taskId = i317;
                    }
                    break;
                case -1916118144:
                case 932635369:
                    i33 = i33;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    Intent intent14 = intent7;
                    i6 = taskId;
                    intent = intent14;
                    uriM49836 = abstractC22044M13271.m49836();
                    int iM2766 = C0619.m2761("۠ܽ") ^ i23;
                    i16 = ((iM2766 ^ i22) * 12073) ^ 495497809;
                    i19 = iM2766 ^ (-1039191322);
                    i31 = i4;
                    i27 = i27;
                    componentNameM45352 = componentNameM45352;
                    i32 = i33;
                    int i318 = i3;
                    i25 = i19;
                    i24 = i16;
                    str4 = str;
                    i29 = i5;
                    i26 = i26;
                    i30 = i318;
                    int i319 = i6;
                    intent7 = intent;
                    taskId = i319;
                    break;
                case -1909014644:
                case 436741525:
                    i33 = i33;
                    i11 = i27;
                    i12 = iM9336;
                    Intent intent15 = intent5;
                    resolveInfo = resolveInfo4;
                    uri2 = uriM49836;
                    componentName2 = componentNameM45352;
                    i3 = i30;
                    i13 = i31;
                    i26 = i26;
                    str3 = type;
                    i5 = i29;
                    str = str4;
                    Intent intent16 = intent7;
                    i6 = taskId;
                    intent = intent16;
                    ResolveInfo resolveInfo6 = (ResolveInfo) C4238.m13529(itM7968);
                    if ((resolveInfo6.activityInfo.applicationInfo.flags & 129) != 0) {
                        int iM2767 = C0619.m2761("᩺۠") ^ i22;
                        int i46 = ((iM2767 ^ i23) * (-32497)) ^ (-1757294585);
                        i15 = iM2767 ^ (-126463061);
                        resolveInfo5 = resolveInfo6;
                        i31 = i13;
                        i24 = i46;
                        componentNameM45352 = componentName2;
                        uriM49836 = uri2;
                        resolveInfo4 = resolveInfo;
                        iM9336 = i12;
                        type = str3;
                        intent5 = intent15;
                    } else {
                        resolveInfo5 = resolveInfo6;
                        intent3 = intent15;
                        int iM2768 = (C0619.m2761("۫᩺") ^ i22) * 41;
                        int i47 = ((iM2768 ^ i23) * (-17175)) ^ (-1306970521);
                        i15 = iM2768 ^ 1157755877;
                        i31 = i13;
                        componentNameM45352 = componentName2;
                        uriM49836 = uri2;
                        resolveInfo4 = resolveInfo;
                        iM9336 = i12;
                        type = str3;
                        intent5 = intent3;
                        i24 = i47;
                    }
                    i27 = i11;
                    i32 = i33;
                    int i48 = i6;
                    intent7 = intent;
                    taskId = i48;
                    i10 = i3;
                    i25 = i15;
                    str4 = str;
                    i29 = i5;
                    i26 = i26;
                    i30 = i10;
                    break;
                case -1751249204:
                case -1403249609:
                    i33 = i33;
                    throw iOException;
                case -1695887600:
                case 1302756844:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    resolveInfo4 = resolveInfo4;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    resolveInfo5 = resolveInfo5;
                    Intent intent17 = intent7;
                    i6 = taskId;
                    intent = intent17;
                    short s = f63379[164];
                    int i49 = s + 12660;
                    if ((s * 50640) - (i49 * i49) > 0) {
                        iM2762 = C0619.m2761("ۨ᩵") ^ i23;
                        i7 = ((iM2762 ^ i22) * 9845) ^ 1697700122;
                        i8 = -1164627147;
                    } else {
                        iM2762 = (i22 - C0619.m2761("ܰۛ")) * q.h;
                        i7 = ((iM2762 ^ i23) * 19617) ^ (-1079905410);
                        i8 = -680019801;
                    }
                    i18 = iM2762 ^ i8;
                    resolveInfo5 = resolveInfo5;
                    i31 = i4;
                    componentNameM45352 = componentName;
                    uriM49836 = uri;
                    resolveInfo4 = resolveInfo4;
                    type = str2;
                    str4 = str;
                    i29 = i5;
                    intent5 = intent5;
                    i27 = i27;
                    i26 = i26;
                    i32 = i33;
                    i30 = i3;
                    i25 = i18;
                    i24 = i7;
                    iM9336 = iM9336;
                    int i3110 = i6;
                    intent7 = intent;
                    taskId = i3110;
                    break;
                case -1663993216:
                case 1624009834:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    resolveInfo4 = resolveInfo4;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    resolveInfo5 = resolveInfo5;
                    Intent intent18 = intent7;
                    i6 = taskId;
                    intent = intent18;
                    if (!C3998.m12923(itM7969)) {
                        intentM8359 = intent;
                        i31 = i4;
                        int iM31617 = (i23 - C0773.m3169("۬᩹")) * 55;
                        int i50 = ((iM31617 ^ i22) * 10833) ^ 936023613;
                        resolveInfo5 = resolveInfo5;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        iM9336 = iM9336;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = iM31617 ^ 1358303735;
                        taskId = i6;
                        intent7 = intentM8359;
                        i24 = i50;
                    } else {
                        iM2762 = C0773.m3169("᩷ܿ") ^ i22;
                        i7 = ((iM2762 ^ i23) * (-26329)) ^ 1649970284;
                        i8 = -785899929;
                        i18 = iM2762 ^ i8;
                        resolveInfo5 = resolveInfo5;
                        i31 = i4;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i3111 = i6;
                        intent7 = intent;
                        taskId = i3111;
                    }
                    break;
                case -1645328264:
                case -1450774453:
                    i33 = i33;
                    if (strM13270 == null) {
                        iM2761 = (i23 - C0773.m3169("ᩴۨ")) * (-21);
                        i = ((iM2761 ^ i22) * 28515) ^ (-1857977192);
                        i2 = -1352151664;
                        i25 = iM2761 ^ i2;
                        i24 = i;
                        i32 = i33;
                    } else {
                        i27 = i27;
                        objM13655 = c22667;
                        uri = uriM49836;
                        componentName = componentNameM45352;
                        i3 = i30;
                        i4 = i31;
                        i26 = i26;
                        i5 = i29;
                        str = str4;
                        Intent intent19 = intent7;
                        i6 = taskId;
                        intent = intent19;
                        iM2763 = (C0619.m2761("۫ܺ") ^ i23) * 47;
                        i16 = ((iM2763 ^ i22) * (-23067)) ^ 681780637;
                        i21 = 1766090508;
                        i19 = iM2763 ^ i21;
                        i31 = i4;
                        i27 = i27;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        i32 = i33;
                        int i3112 = i3;
                        i25 = i19;
                        i24 = i16;
                        str4 = str;
                        i29 = i5;
                        i26 = i26;
                        i30 = i3112;
                        int i3113 = i6;
                        intent7 = intent;
                        taskId = i3113;
                    }
                    break;
                case -1639771806:
                case 1331975609:
                    z = true;
                    i33 = i33;
                    z2 = z;
                    iM2761 = C0773.m3169("۬ۖ") ^ i23;
                    i = ((iM2761 ^ i22) * (-11131)) ^ 1478118275;
                    i2 = 2068898899;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -1607561918:
                case 934827109:
                    i6 = taskId;
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    resolveInfo4 = resolveInfo4;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    resolveInfo5 = resolveInfo5;
                    super.onCreate(bundle);
                    intentM8359 = C2485.m8359(this);
                    i31 = 268435456;
                    if (intentM8359.getBooleanExtra(AbstractC3624.m11769(f63379, 165, 27, i5), false)) {
                        int iM31618 = (i23 - C0773.m3169("᩺᩻")) * (-83);
                        int i51 = ((iM31618 ^ i22) * 7873) ^ (-1373849871);
                        resolveInfo5 = resolveInfo5;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        type = str2;
                        str4 = str;
                        z3 = false;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = iM31618 ^ (-1228550567);
                        taskId = i6;
                        intent7 = intentM8359;
                        i24 = i51;
                        iM9336 = iM9336;
                    } else {
                        z3 = false;
                        int iM31619 = (i23 - C0773.m3169("۬᩹")) * 55;
                        int i52 = ((iM31619 ^ i22) * 10833) ^ 936023613;
                        resolveInfo5 = resolveInfo5;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        iM9336 = iM9336;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = iM31619 ^ 1358303735;
                        taskId = i6;
                        intent7 = intentM8359;
                        i24 = i52;
                    }
                    break;
                case -1543395978:
                case 1113697574:
                    m45354((Activity) this);
                    C1564.m5513(this, intent6);
                    iM2761 = (i23 - C0773.m3169("ۘ᩸")) * (-3);
                    i = ((iM2761 ^ i22) * (-13861)) ^ (-1890514396);
                    i2 = -984662914;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -1531525066:
                case 461386988:
                    appTask.moveToFront();
                    i33 = i33;
                    iM2761 = (C0619.m2761("ܽ᩻") + i23) * (-43);
                    i = ((iM2761 ^ i22) * (-27959)) ^ 690795761;
                    i2 = -1534539558;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -1463320667:
                case -174466280:
                    i33 = i33;
                    i28 = appTask.getTaskInfo().id;
                    taskId = getTaskId();
                    iM2761 = C0773.m3169("ۘ᩹") ^ i23;
                    i = ((iM2761 ^ i22) * (-6977)) ^ (-2090864953);
                    i2 = -1828051075;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -1416902243:
                case 1659353623:
                    i33 = i33;
                    strM13270 = c4144M35208.m13270();
                    iM2761 = C0773.m3169("ۙ᩵") ^ i23;
                    i = ((iM2761 ^ i22) * (-16263)) ^ 2115860264;
                    i2 = 727292909;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -1411195030:
                case 1807172668:
                    i33 = i33;
                    try {
                        zIsVisible = appTask.getTaskInfo().isVisible();
                        iM2761 = (C0619.m2761("ۖ᩸") ^ i22) * 77;
                        i = ((iM2761 ^ i23) * (-23725)) ^ (-478301465);
                        i2 = 42112337;
                        i25 = iM2761 ^ i2;
                        i24 = i;
                        i32 = i33;
                    } catch (Exception unused7) {
                        intent5 = intent5;
                        resolveInfo4 = resolveInfo4;
                        uri = uriM49836;
                        componentName = componentNameM45352;
                        i3 = i30;
                        i4 = i31;
                        i26 = i26;
                        str2 = type;
                        i5 = i29;
                        str = str4;
                        resolveInfo5 = resolveInfo5;
                        Intent intent20 = intent7;
                        i6 = taskId;
                        intent = intent20;
                        iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                        i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                        i8 = 215022886;
                        i18 = iM2762 ^ i8;
                        resolveInfo5 = resolveInfo5;
                        i31 = i4;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i3114 = i6;
                        intent7 = intent;
                        taskId = i3114;
                    }
                    break;
                case -1387663008:
                case 633206005:
                    i33 = i33;
                    if (i28 != taskId) {
                        iM2761 = (i22 - C0773.m3169("ۖۤ")) * (-7);
                        i = ((iM2761 ^ i23) * 2963) ^ (-1537104392);
                        i2 = 943899258;
                    } else {
                        z = z3;
                        z2 = z;
                        iM2761 = C0773.m3169("۬ۖ") ^ i23;
                        i = ((iM2761 ^ i22) * (-11131)) ^ 1478118275;
                        i2 = 2068898899;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -1342785941:
                case 1992082516:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    resolveInfo4 = resolveInfo4;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    resolveInfo5 = resolveInfo5;
                    Intent intent21 = intent7;
                    i6 = taskId;
                    intent = intent21;
                    if (C1826.m6317(itM7968)) {
                        iM2762 = (i23 - C0619.m2761("۫ᩳ")) * 61;
                        i7 = ((iM2762 ^ i22) * 16651) ^ 1496759152;
                        i8 = 122066161;
                    } else {
                        iM2762 = C0773.m3169("ۗۨ") ^ i23;
                        i7 = ((iM2762 ^ i22) * (-28077)) ^ (-726504543);
                        i8 = -112511720;
                    }
                    i18 = iM2762 ^ i8;
                    resolveInfo5 = resolveInfo5;
                    i31 = i4;
                    componentNameM45352 = componentName;
                    uriM49836 = uri;
                    resolveInfo4 = resolveInfo4;
                    type = str2;
                    str4 = str;
                    i29 = i5;
                    intent5 = intent5;
                    i27 = i27;
                    i26 = i26;
                    i32 = i33;
                    i30 = i3;
                    i25 = i18;
                    i24 = i7;
                    iM9336 = iM9336;
                    int i3115 = i6;
                    intent7 = intent;
                    taskId = i3115;
                    break;
                case -1187477021:
                case 528893728:
                    i33 = i33;
                    iM9336 = C2834.m9336(appTasks);
                    iM2761 = C0773.m3169("ۙܿ") ^ i22;
                    i = ((iM2761 ^ i23) * (-1577)) ^ (-1248751446);
                    i2 = 228253349;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -1175547993:
                case -494510186:
                    i33 = i33;
                    i4 = i31;
                    Intent intent22 = intent7;
                    i6 = taskId;
                    intent = intent22;
                    int i53 = i29;
                    str = str4;
                    int i54 = i30;
                    i26 = i26;
                    i5 = i53;
                    try {
                        C22667 c226610 = new C22667(abstractC22044M13271.mo42888(), objM13655, abstractC22044M13271.mo4285(), c4144M35208.m13270());
                        f63378 = c226610;
                        uriM49836 = c226610.f73615;
                        i3 = i54;
                        int iM2769 = C0619.m2761("۠ܽ") ^ i23;
                        i16 = ((iM2769 ^ i22) * 12073) ^ 495497809;
                        i19 = iM2769 ^ (-1039191322);
                        i31 = i4;
                        i27 = i27;
                        componentNameM45352 = componentNameM45352;
                        i32 = i33;
                        int i3116 = i3;
                        i25 = i19;
                        i24 = i16;
                        str4 = str;
                        i29 = i5;
                        i26 = i26;
                        i30 = i3116;
                        int i3117 = i6;
                        intent7 = intent;
                        taskId = i3117;
                    } catch (Exception unused8) {
                        i3 = i54;
                        i27 = i27;
                        iM9336 = iM9336;
                        uri = uriM49836;
                        componentName = componentNameM45352;
                        str2 = type;
                        iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                        i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                        i8 = 215022886;
                        i18 = iM2762 ^ i8;
                        resolveInfo5 = resolveInfo5;
                        i31 = i4;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i3118 = i6;
                        intent7 = intent;
                        taskId = i3118;
                    }
                    break;
                case -1170861649:
                case 1791686634:
                    i33 = i33;
                    i27 = i27;
                    intent5 = intent5;
                    resolveInfo2 = resolveInfo4;
                    uri3 = uriM49836;
                    componentName3 = componentNameM45352;
                    i3 = i30;
                    i14 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    Intent intent23 = intent7;
                    i6 = taskId;
                    intent = intent23;
                    C3492.m11480(c22668.f73614);
                    f63378 = c22667;
                    iM9336 = iM9336;
                    str2 = type;
                    iM3169 = C0773.m3169("ܺۤ") ^ i23;
                    i16 = ((iM3169 ^ i22) * 3067) ^ (-1425966736);
                    i17 = -1931866390;
                    i19 = iM3169 ^ i17;
                    i31 = i14;
                    componentNameM45352 = componentName3;
                    uriM49836 = uri3;
                    resolveInfo4 = resolveInfo2;
                    iM9336 = iM9336;
                    type = str2;
                    intent5 = intent5;
                    i27 = i27;
                    i32 = i33;
                    int i3119 = i3;
                    i25 = i19;
                    i24 = i16;
                    str4 = str;
                    i29 = i5;
                    i26 = i26;
                    i30 = i3119;
                    int i31110 = i6;
                    intent7 = intent;
                    taskId = i31110;
                    break;
                case -1167642995:
                case -1025892868:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    resolveInfo2 = resolveInfo4;
                    uri3 = uriM49836;
                    componentName3 = componentNameM45352;
                    i3 = i30;
                    i14 = i31;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    Intent intent24 = intent7;
                    i6 = taskId;
                    intent = intent24;
                    c22668 = f63378;
                    if (c22668 != null) {
                        iM3169 = C0773.m3169("۟ۨ") ^ i22;
                        i16 = ((iM3169 ^ i23) * (-2791)) ^ (-2012702797);
                        i17 = 1384085216;
                    } else {
                        iM3169 = C0773.m3169("ܺۤ") ^ i23;
                        i16 = ((iM3169 ^ i22) * 3067) ^ (-1425966736);
                        i17 = -1931866390;
                    }
                    i19 = iM3169 ^ i17;
                    i31 = i14;
                    componentNameM45352 = componentName3;
                    uriM49836 = uri3;
                    resolveInfo4 = resolveInfo2;
                    iM9336 = iM9336;
                    type = str2;
                    intent5 = intent5;
                    i27 = i27;
                    i32 = i33;
                    int i31111 = i3;
                    i25 = i19;
                    i24 = i16;
                    str4 = str;
                    i29 = i5;
                    i26 = i26;
                    i30 = i31111;
                    int i31112 = i6;
                    intent7 = intent;
                    taskId = i31112;
                    break;
                case -1125695448:
                case -403298768:
                    intent2 = intent7;
                    i9 = 15246;
                    int iM27610 = (i22 - C0619.m2761("ۨ᩸")) * (-103);
                    resolveInfo5 = resolveInfo5;
                    i31 = i31;
                    componentNameM45352 = componentNameM45352;
                    uriM49836 = uriM49836;
                    resolveInfo4 = resolveInfo4;
                    type = type;
                    str4 = str4;
                    i29 = i9;
                    intent5 = intent5;
                    i24 = ((iM27610 ^ i23) * 249) ^ (-916511312);
                    i27 = i27;
                    iM9336 = iM9336;
                    i32 = i33;
                    intent7 = intent2;
                    taskId = taskId;
                    i10 = i30;
                    i25 = iM27610 ^ (-1123174589);
                    i26 = i26;
                    i30 = i10;
                    break;
                case -1104585746:
                case 512895003:
                    return;
                case -1095356715:
                case -38545786:
                    i33 = i33;
                    if (zM11761) {
                        iM2761 = C0619.m2761("ۗܶ") ^ i23;
                        i = ((iM2761 ^ i22) * (-10845)) ^ 618145344;
                        i2 = -187282640;
                    } else {
                        iM2761 = C0773.m3169("᩵֫") ^ i22;
                        i = ((iM2761 ^ i23) * (-13811)) ^ (-348039098);
                        i2 = -137575856;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -905673251:
                case -215212226:
                    ActivityInfo activityInfo = resolveInfo4.activityInfo;
                    Intent intent25 = intent5;
                    intent25.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    C2878.m9490(this, intent25);
                    C0950.m3790(this);
                    return;
                case -840498160:
                case 936618346:
                    if (z2) {
                        iM2761 = (C0773.m3169("ᩴܺ") ^ i22) * (-33);
                        i33 = i33;
                        i = ((iM2761 ^ i23) * (-1893)) ^ (-220797783);
                        i2 = -1429031914;
                    } else {
                        i33 = i33;
                        iM2761 = (C0619.m2761("ܽ᩻") + i23) * (-43);
                        i = ((iM2761 ^ i22) * (-27959)) ^ 690795761;
                        i2 = -1534539558;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -823658560:
                case 1926461795:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    resolveInfo4 = resolveInfo4;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    resolveInfo5 = resolveInfo5;
                    Intent intent26 = intent7;
                    i6 = taskId;
                    intent = intent26;
                    C2419.m8171(c22669.f73614);
                    f63378 = c22667;
                    iM2762 = (C0773.m3169("ܶۖ") ^ i22) * q.h;
                    i7 = ((iM2762 ^ i23) * (-25407)) ^ (-1518462576);
                    i8 = -1607569152;
                    i18 = iM2762 ^ i8;
                    resolveInfo5 = resolveInfo5;
                    i31 = i4;
                    componentNameM45352 = componentName;
                    uriM49836 = uri;
                    resolveInfo4 = resolveInfo4;
                    type = str2;
                    str4 = str;
                    i29 = i5;
                    intent5 = intent5;
                    i27 = i27;
                    i26 = i26;
                    i32 = i33;
                    i30 = i3;
                    i25 = i18;
                    i24 = i7;
                    iM9336 = iM9336;
                    int i31113 = i6;
                    intent7 = intent;
                    taskId = i31113;
                    break;
                case -663868688:
                case 1677891913:
                    i26++;
                    iM2761 = C0619.m2761("᩹᩸") ^ i23;
                    i = ((iM2761 ^ i22) * 6993) ^ 856709407;
                    i2 = 1075853796;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -630959988:
                case 299650035:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    resolveInfo4 = resolveInfo4;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    resolveInfo5 = resolveInfo5;
                    Intent intent27 = intent7;
                    i6 = taskId;
                    intent = intent27;
                    c22669 = f63378;
                    c22667 = null;
                    if (c22669 != null) {
                        iM2762 = (C0619.m2761("ۚۚ") ^ i23) * 123;
                        i7 = ((iM2762 ^ i22) * (-8867)) ^ 1433180354;
                        i8 = -1198994160;
                    } else {
                        iM2762 = (C0773.m3169("ܶۖ") ^ i22) * q.h;
                        i7 = ((iM2762 ^ i23) * (-25407)) ^ (-1518462576);
                        i8 = -1607569152;
                    }
                    i18 = iM2762 ^ i8;
                    resolveInfo5 = resolveInfo5;
                    i31 = i4;
                    componentNameM45352 = componentName;
                    uriM49836 = uri;
                    resolveInfo4 = resolveInfo4;
                    type = str2;
                    str4 = str;
                    i29 = i5;
                    intent5 = intent5;
                    i27 = i27;
                    i26 = i26;
                    i32 = i33;
                    i30 = i3;
                    i25 = i18;
                    i24 = i7;
                    iM9336 = iM9336;
                    int i31114 = i6;
                    intent7 = intent;
                    taskId = i31114;
                    break;
                case -597450319:
                case 937208304:
                    int i55 = C1663.f5756;
                    Intent intent28 = new Intent(this, (Class<?>) ActivityC18143.class);
                    intent28.setAction(strM33137);
                    C2419.m8169(intent28, str4, strM3168);
                    intent28.setType(type);
                    AbstractC3624.m11767(intent28, i31);
                    AbstractC3624.m11767(intent28, i30);
                    intent7.putExtra(RunnableC0334.m2049(f63379, 267, 15, i29), z4);
                    m45354((Activity) this);
                    C2878.m9490(this, intent28);
                    return;
                case -594579035:
                case 748526309:
                    i33 = i33;
                    z = zIsVisible ^ z4;
                    z2 = z;
                    iM2761 = C0773.m3169("۬ۖ") ^ i23;
                    i = ((iM2761 ^ i22) * (-11131)) ^ 1478118275;
                    i2 = 2068898899;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -158053422:
                case 378771805:
                    i33 = i33;
                    if (i26 < iM9336) {
                        iM2761 = (C0619.m2761("ۢܶ") ^ i22) * (-111);
                        i = ((iM2761 ^ i23) * 27557) ^ 765132113;
                        i2 = 1266252531;
                    } else {
                        iM2761 = C0619.m2761("ۗܶ") ^ i23;
                        i = ((iM2761 ^ i22) * (-10845)) ^ 618145344;
                        i2 = -187282640;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case -50747721:
                case 55980193:
                    i33 = i33;
                    ActivityManager.AppTask appTask2 = (ActivityManager.AppTask) C3690.m11998(appTasks, i26);
                    try {
                        zM45355 = m45355(appTask2);
                        int iM31620 = (C0773.m3169("ۖۛ") + i22) * 115;
                        i25 = iM31620 ^ 1634357913;
                        i24 = ((iM31620 ^ i23) * 12075) ^ (-747137984);
                        appTask = appTask2;
                        i32 = i33;
                    } catch (Exception unused9) {
                        appTask = appTask2;
                        intent5 = intent5;
                        resolveInfo4 = resolveInfo4;
                        uri = uriM49836;
                        componentName = componentNameM45352;
                        i3 = i30;
                        i4 = i31;
                        i26 = i26;
                        str2 = type;
                        i5 = i29;
                        str = str4;
                        resolveInfo5 = resolveInfo5;
                        Intent intent29 = intent7;
                        i6 = taskId;
                        intent = intent29;
                        iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                        i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                        i8 = 215022886;
                        i18 = iM2762 ^ i8;
                        resolveInfo5 = resolveInfo5;
                        i31 = i4;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i31115 = i6;
                        intent7 = intent;
                        taskId = i31115;
                    }
                    break;
                case 3962135:
                case 1806111352:
                    i33 = i33;
                    int i56 = i27;
                    Intent intent30 = intent5;
                    Uri uri5 = uriM49836;
                    ComponentName componentName5 = componentNameM45352;
                    i3 = i30;
                    int i57 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    ResolveInfo resolveInfo7 = resolveInfo4;
                    Intent intent31 = intent7;
                    i6 = taskId;
                    intent = intent31;
                    if (zM49833) {
                        iM31610 = C0773.m3169("ܺ᩷") ^ i23;
                        i16 = ((iM31610 ^ i22) * 17381) ^ (-417828951);
                        i20 = -1825453374;
                    } else {
                        iM31610 = C0773.m3169("۫ۤ") ^ i23;
                        i16 = ((iM31610 ^ i22) * (-27667)) ^ 430468471;
                        i20 = 998095856;
                    }
                    i19 = iM31610 ^ i20;
                    i31 = i57;
                    intent5 = intent30;
                    i27 = i56;
                    componentNameM45352 = componentName5;
                    uriM49836 = uri5;
                    resolveInfo4 = resolveInfo7;
                    i32 = i33;
                    int i31116 = i3;
                    i25 = i19;
                    i24 = i16;
                    str4 = str;
                    i29 = i5;
                    i26 = i26;
                    i30 = i31116;
                    int i31117 = i6;
                    intent7 = intent;
                    taskId = i31117;
                    break;
                case 41981295:
                case 1096410825:
                    i33 = i33;
                    i27 = Build.VERSION.SDK_INT;
                    iM2761 = (i23 - C0773.m3169("ܿܶ")) * (-105);
                    i = ((iM2761 ^ i22) * 23107) ^ 1131555118;
                    i2 = 1162957710;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case 105672209:
                case 2011979633:
                    i33 = i33;
                    int i58 = i30;
                    i4 = i31;
                    i26 = i26;
                    i5 = i29;
                    Intent intent32 = intent7;
                    i6 = taskId;
                    intent = intent32;
                    i27 = i27;
                    String strM7749 = C2287.m7749(f63379, 242, 25, i5);
                    strM3168 = C0773.m3168(intent, strM7749);
                    if (strM3168 == null) {
                        iM9336 = iM9336;
                        intent4 = intent5;
                        resolveInfo3 = resolveInfo4;
                        uri = uriM49836;
                        componentName = componentNameM45352;
                        i3 = i58;
                        str4 = strM7749;
                        int iM316110 = C0773.m3169("ۧۗ") ^ i23;
                        i7 = ((iM316110 ^ i22) * (-22649)) ^ (-1749621294);
                        i18 = iM316110 ^ (-1767452090);
                        i31 = i4;
                        i29 = i5;
                        intent5 = intent4;
                        i27 = i27;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo3;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i31118 = i6;
                        intent7 = intent;
                        taskId = i31118;
                    } else {
                        int iM31621 = C0773.m3169("᩷۠") ^ i22;
                        i24 = ((iM31621 ^ i23) * (-17795)) ^ (-345176337);
                        i31 = i4;
                        i29 = i5;
                        i26 = i26;
                        i30 = i58;
                        str4 = strM7749;
                        i25 = iM31621 ^ (-543805921);
                        i27 = i27;
                        i32 = i33;
                        int i31119 = i6;
                        intent7 = intent;
                        taskId = i31119;
                    }
                    break;
                case 203619985:
                case 1176360545:
                    intent2 = intent7;
                    i9 = 22846;
                    int iM27611 = (i22 - C0619.m2761("ۨ᩸")) * (-103);
                    resolveInfo5 = resolveInfo5;
                    i31 = i31;
                    componentNameM45352 = componentNameM45352;
                    uriM49836 = uriM49836;
                    resolveInfo4 = resolveInfo4;
                    type = type;
                    str4 = str4;
                    i29 = i9;
                    intent5 = intent5;
                    i24 = ((iM27611 ^ i23) * 249) ^ (-916511312);
                    i27 = i27;
                    iM9336 = iM9336;
                    i32 = i33;
                    intent7 = intent2;
                    taskId = taskId;
                    i10 = i30;
                    i25 = iM27611 ^ (-1123174589);
                    i26 = i26;
                    i30 = i10;
                    break;
                case 272422059:
                case 922654155:
                    Intent intent33 = intent5;
                    ActivityInfo activityInfo2 = resolveInfo5.activityInfo;
                    intent33.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                    C2878.m9490(this, intent33);
                    C4238.m13537(this);
                    return;
                case 417168032:
                case 954750856:
                    i33 = i33;
                    if (zM45355) {
                        iM2761 = C0773.m3169("ۚۘ") ^ i22;
                        i = ((iM2761 ^ i23) * 12961) ^ 678750455;
                        i2 = -355863817;
                    } else {
                        iM2761 = (i23 - C0619.m2761("ۙۙ")) * (-103);
                        i = ((iM2761 ^ i22) * 17689) ^ 903818198;
                        i2 = -1527733103;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case 443104443:
                case 1341969088:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    uri3 = uriM49836;
                    componentName3 = componentNameM45352;
                    i3 = i30;
                    i14 = i31;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    Intent intent34 = intent7;
                    i6 = taskId;
                    intent = intent34;
                    itM7969 = C2354.m7968(list);
                    int iM27612 = (C0619.m2761("ܿ᩻") + i22) * 55;
                    i7 = ((iM27612 ^ i23) * (-4943)) ^ 220855997;
                    i18 = iM27612 ^ (-2000611644);
                    resolveInfo5 = resolveInfo5;
                    i31 = i14;
                    componentNameM45352 = componentName3;
                    uriM49836 = uri3;
                    type = str2;
                    str4 = str;
                    i29 = i5;
                    intent5 = intent5;
                    i27 = i27;
                    i26 = i26;
                    i32 = i33;
                    i30 = i3;
                    i25 = i18;
                    i24 = i7;
                    iM9336 = iM9336;
                    int i311110 = i6;
                    intent7 = intent;
                    taskId = i311110;
                    break;
                case 443125048:
                case 1676077299:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    resolveInfo4 = resolveInfo4;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    str2 = type;
                    i5 = i29;
                    str = str4;
                    resolveInfo5 = resolveInfo5;
                    Intent intent35 = intent7;
                    i6 = taskId;
                    intent = intent35;
                    try {
                        c4144M35208 = C14584.m35208(intent);
                        abstractC22044M13271 = c4144M35208.m13271();
                        zM49833 = abstractC22044M13271.m49833();
                        iM2762 = C0619.m2761("ܽ᩷") ^ i23;
                        i7 = ((iM2762 ^ i22) * (-6563)) ^ (-1032369010);
                        i8 = -1232358684;
                    } catch (Exception unused10) {
                        iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                        i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                        i8 = 215022886;
                    }
                    i18 = iM2762 ^ i8;
                    resolveInfo5 = resolveInfo5;
                    i31 = i4;
                    componentNameM45352 = componentName;
                    uriM49836 = uri;
                    resolveInfo4 = resolveInfo4;
                    type = str2;
                    str4 = str;
                    i29 = i5;
                    intent5 = intent5;
                    i27 = i27;
                    i26 = i26;
                    i32 = i33;
                    i30 = i3;
                    i25 = i18;
                    i24 = i7;
                    iM9336 = iM9336;
                    int i311111 = i6;
                    intent7 = intent;
                    taskId = i311111;
                    break;
                case 504029300:
                case 537998271:
                    m45354((Activity) this);
                    return;
                case 629542294:
                case 1451972421:
                    i33 = i33;
                    i27 = i27;
                    uri = uriM49836;
                    componentName = componentNameM45352;
                    i3 = i30;
                    i4 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    Intent intent36 = intent7;
                    i6 = taskId;
                    intent = intent36;
                    try {
                        try {
                            objM13655 = C4282.m13655(abstractC22044M13271);
                            iM2763 = (C0619.m2761("۫ܺ") ^ i23) * 47;
                            i16 = ((iM2763 ^ i22) * (-23067)) ^ 681780637;
                            i21 = 1766090508;
                            i19 = iM2763 ^ i21;
                            i31 = i4;
                            i27 = i27;
                            componentNameM45352 = componentName;
                            uriM49836 = uri;
                            i32 = i33;
                            int i311112 = i3;
                            i25 = i19;
                            i24 = i16;
                            str4 = str;
                            i29 = i5;
                            i26 = i26;
                            i30 = i311112;
                            int i311113 = i6;
                            intent7 = intent;
                            taskId = i311113;
                        } catch (IOException e) {
                            int iM31622 = C0773.m3169("᩸᩵") ^ i22;
                            int i59 = ((iM31622 ^ i23) * (-23041)) ^ (-1351061756);
                            i15 = iM31622 ^ (-1968355252);
                            iOException = e;
                            i31 = i4;
                            i24 = i59;
                            i27 = i27;
                            componentNameM45352 = componentName;
                            uriM49836 = uri;
                            i32 = i33;
                            int i410 = i6;
                            intent7 = intent;
                            taskId = i410;
                            i10 = i3;
                            i25 = i15;
                            str4 = str;
                            i29 = i5;
                            i26 = i26;
                            i30 = i10;
                        }
                    } catch (Exception unused11) {
                        iM9336 = iM9336;
                        str2 = type;
                        iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                        i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                        i8 = 215022886;
                        i18 = iM2762 ^ i8;
                        resolveInfo5 = resolveInfo5;
                        i31 = i4;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i311114 = i6;
                        intent7 = intent;
                        taskId = i311114;
                    }
                    break;
                case 769694742:
                case 1248219856:
                    i33 = i33;
                    if (i27 >= 32) {
                        iM2761 = C0619.m2761("ܶܿ") ^ i22;
                        i = ((iM2761 ^ i23) * 3599) ^ (-1160218036);
                        i2 = 1135314181;
                    } else {
                        iM2761 = C0619.m2761("ۜۛ") ^ i23;
                        i = ((iM2761 ^ i22) * 6857) ^ 934240973;
                        i2 = 510695923;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    i32 = i33;
                    break;
                case 962763113:
                case 972799988:
                    i33 = i33;
                    i27 = i27;
                    iM9336 = iM9336;
                    intent5 = intent5;
                    uri3 = uriM49836;
                    componentName3 = componentNameM45352;
                    i3 = i30;
                    i14 = i31;
                    i26 = i26;
                    i5 = i29;
                    str = str4;
                    Intent intent37 = intent7;
                    i6 = taskId;
                    intent = intent37;
                    ResolveInfo resolveInfo8 = (ResolveInfo) C0950.m3796(itM7969);
                    resolveInfo2 = resolveInfo8;
                    str2 = type;
                    if (!C0487.m2359(resolveInfo8.activityInfo.packageName, C3690.m11996(f63379, 200, 11, i5))) {
                        iM3169 = C0773.m3169("᩺ܰ") ^ i22;
                        i16 = ((iM3169 ^ i23) * (-863)) ^ (-8324870);
                        i17 = 459708526;
                        i19 = iM3169 ^ i17;
                        i31 = i14;
                        componentNameM45352 = componentName3;
                        uriM49836 = uri3;
                        resolveInfo4 = resolveInfo2;
                        iM9336 = iM9336;
                        type = str2;
                        intent5 = intent5;
                        i27 = i27;
                        i32 = i33;
                        int i311115 = i3;
                        i25 = i19;
                        i24 = i16;
                        str4 = str;
                        i29 = i5;
                        i26 = i26;
                        i30 = i311115;
                        int i311116 = i6;
                        intent7 = intent;
                        taskId = i311116;
                    } else {
                        resolveInfo4 = resolveInfo2;
                        int iM27613 = (C0619.m2761("ܿ᩻") + i22) * 55;
                        i7 = ((iM27613 ^ i23) * (-4943)) ^ 220855997;
                        i18 = iM27613 ^ (-2000611644);
                        resolveInfo5 = resolveInfo5;
                        i31 = i14;
                        componentNameM45352 = componentName3;
                        uriM49836 = uri3;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i311117 = i6;
                        intent7 = intent;
                        taskId = i311117;
                    }
                    break;
                default:
                    try {
                        AbstractActivityC17204.m40384(intent6, z4);
                        C0950.m3790(this);
                        iM2761 = (i23 - C0773.m3169("ۘ᩸")) * (-3);
                        i = ((iM2761 ^ i22) * (-13861)) ^ (-1890514396);
                        i2 = -984662914;
                        i25 = iM2761 ^ i2;
                        i24 = i;
                        i32 = i33;
                    } catch (Exception unused12) {
                        i33 = i33;
                        intent5 = intent5;
                        resolveInfo4 = resolveInfo4;
                        uri = uriM49836;
                        componentName = componentNameM45352;
                        i3 = i30;
                        i4 = i31;
                        i26 = i26;
                        str2 = type;
                        i5 = i29;
                        str = str4;
                        resolveInfo5 = resolveInfo5;
                        Intent intent210 = intent7;
                        i6 = taskId;
                        intent = intent210;
                        iM2762 = C0619.m2761("ۗ᩹") ^ i23;
                        i7 = ((iM2762 ^ i22) * 571) ^ (-1724087666);
                        i8 = 215022886;
                        i18 = iM2762 ^ i8;
                        resolveInfo5 = resolveInfo5;
                        i31 = i4;
                        componentNameM45352 = componentName;
                        uriM49836 = uri;
                        resolveInfo4 = resolveInfo4;
                        type = str2;
                        str4 = str;
                        i29 = i5;
                        intent5 = intent5;
                        i27 = i27;
                        i26 = i26;
                        i32 = i33;
                        i30 = i3;
                        i25 = i18;
                        i24 = i7;
                        iM9336 = iM9336;
                        int i311118 = i6;
                        intent7 = intent;
                        taskId = i311118;
                    }
                    break;
            }
        }
    }
}
