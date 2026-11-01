package l;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C14015 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static WeakReference f46056;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f46057 = 0;

    /* JADX INFO: renamed from: ۚ᩷᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f46058 = {1191, 4334, 3001, 397, -1400, -6263, 1722, 25725, 25714, 25717, 25727, 25677, 25714, 25726, 25708, 25689, 25698, 25682, 25727, 25651, 25653, 25653, 25653, 25650, -3657, 12349, 10997, -316, -6801, 10903, 1347, 1811, -4411, 6466, -5618, -5486, -5307, 4130, -1238, -136, 14421, 4757, 15358, 6307, 7936, -1971, -4012, 6075, -1851, -3922, 12730, 3300, 14557, 7860, 3169, 14445, 6770, 7588, -2248, -1981, 25652, 3697, 2143, 14210, 25717, 25710, 25719, 25719, 25659, 25720, 25722, 25717, 25717, 25716, 25711, 25659, 25721, 25726, 25659, 25720, 25722, 25704, 25711, 25659, 25711, 25716, 25659, 25717, 25716, 25717, 25654, 25717, 25710, 25719, 25719, 25659, 25711, 25698, 25707, 25726, 25659, 25722, 25717, 25727, 25705, 25716, 25714, 25727, 25653, 25708, 25714, 25727, 25724, 25726, 25711, 25653, 25679, 25726, 25699, 25711, 25677, 25714, 25726, 25708, 25641, 25653, 25641, 25645, 25653, 25642, 25643, 25659, 25651, 25641, 25645, 25642, 25643, 25642, 25643, 25645, 25642, 25650, 25655, 25659, 25679, 25672, 25641, 25635, -403, 1115, 690, 2133, 8052, 2545, 5931, -2730, 813, -2667, -4248, 10843, -4476, -7311, -6228, -906, 15032, 1112, -6058, 6664, 13258, 3148, 12984, 12830, 13394, 4910, 2544, 25673, 25684, 25684, 25679, 1932, -1418, 11027, 3261, 891, 1172, 25672, 25683, 25694, 25687, 25687, 5968, 14412, 1127, 25717, 25710, 25719, 25719, 25659, 25720, 25722, 25717, 25717, 25716, 25711, 25659, 25721, 25726, 25659, 25720, 25722, 25704, 25711, 25659, 25711, 25716, 25659, 25717, 25716, 25717, 25654, 25717, 25710, 25719, 25719, 25659, 25711, 25698, 25707, 25726, 25659, 25722, 25717, 25727, 25705, 25716, 25714, 25727, 25653, 25709, 25714, 25726, 25708, 25653, 25677, 25714, 25726, 25708, 15238, 7342, 7792, 25724, 25726, 25711, 25673, 25726, 25704, 25716, 25710, 25705, 25720, 25726, 25704, 25651, 25653, 25653, 25653, 25650, 2526, 8189, -365, 25717, 25710, 25719, 25719, 25659, 25720, 25722, 25717, 25717, 25716, 25711, 25659, 25721, 25726, 25659, 25720, 25722, 25704, 25711, 25659, 25711, 25716, 25659, 25717, 25716, 25717, 25654, 25717, 25710, 25719, 25719, 25659, 25711, 25698, 25707, 25726, 25659, 25722, 25717, 25727, 25705, 25716, 25714, 25727, 25653, 25709, 25714, 25726, 25708, 25653, 25677, 25714, 25726, 25708, 25692, 25705, 25716, 25710, 25707, 2338, 19208, 19220, 19220, 19210, 19221, 19200, 19211, 19222, 19201, 19214, 19204, 19221, 19212, 19295, 19274, 19274, 19207, 19212, 19231, 19236, 19202, 19200, 19211, 19217, 19274, 19220, 19208, 19274, 19220, 19223, 19290, 19216, 19223, 19209, 19288, 19213, 19217, 19217, 19221, 19264, 19286, 19236, 19264, 19287, 19235, 19264, 19287, 19235, 19220, 19208, 19275, 19220, 19220, 19275, 19206, 19210, 19208, 19264, 19287, 19235, 19206, 19202, 19212, 19272, 19207, 19212, 19211, 19264, 19287, 19235, 19220, 19208, 19264, 19287, 19235, 19220, 19223, 19264, 19286, 19235, 19203, 19223, 19210, 19208, 19264, 19286, 19233, 19204, 19221, 19221, 19264, 19287, 19283, 19221, 19264, 19286, 19233, 19204, 19211, 19201, 19223, 19210, 19212, 19201, 19264, 19287, 19283, 19215, 19216, 19208, 19221, 19258, 19203, 19223, 19210, 19208, 19264, 19286, 19233, 19218, 19200, 19207, 19204, 19221, 19212, 19264, 19287, 19283, 19214, 19264, 19286, 19233, 2802, -26956, -26954, -26975, -26948, -26973, -26948, -26975, -26964, 978, -30929, -30928, -30916, -30930, 6783, -10430, -7083, -30920, -30923, -30935, -30927, -30920, -30931, -30933, -30920, -30921, -30934, -30923, -30920, -30931, -30928, -30922, -30921, -30976, -1155, -11235, -5121, -30933, -30922, -30931, -30920, -30931, -30928, -30922, -30921, 7834, -11218, 4461, 2352, -1524, -4483, -11273, -1278, -8476, 5307, -485, -660, -9969, -4661, -5556, -30921, -30932, -30923, -30923, -30855, -30918, -30920, -30921, -30921, -30922, -30931, -30855, -30917, -30916, -30855, -30918, -30920, -30934, -30931, -30855, -30931, -30922, -30855, -30921, -30922, -30921, -30860, -30921, -30932, -30923, -30923, -30855, -30931, -30944, -30935, -30916, -30855, -30920, -30921, -30915, -30933, -30922, -30928, -30915, -30857, -30929, -30928, -30916, -30930, -30857, -30961, -30928, -30916, -30930, -30946, -30933, -30922, -30932, -30935, 6415, 606, -10440, -8093, 8139, 6804, -30921, -30932, -30923, -30923, -30855, -30918, -30920, -30921, -30921, -30922, -30931, -30855, -30917, -30916, -30855, -30918, -30920, -30934, -30931, -30855, -30931, -30922, -30855, -30921, -30922, -30921, -30860, -30921, -30932, -30923, -30923, -30855, -30931, -30944, -30935, -30916, -30855, -30920, -30921, -30915, -30933, -30922, -30928, -30915, -30857, -30929, -30928, -30916, -30930, -30857, -30961, -30928, -30916, -30930, -5528, -4378, -5271};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C22959 f46059 = C22959.m50800();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient boolean f46060;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f46061;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13188 f46062;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f46063;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 53401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33891(l.C14015 r62, l.AbstractActivityC12483 r63, l.DialogInterfaceC19356 r64, android.view.View r65, boolean r66, android.view.View r67) {
        /*
            Method dump skipped, instruction units count: 5340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14015.m33891(l.ܰᩴ᩺, l.۫ܶۘ, l.᩵ۡۜ, android.view.View, boolean, android.view.View):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33894(AbstractActivityC12483 abstractActivityC12483, List list) {
        int i = 0;
        String str = null;
        Object objM5478 = null;
        int i2 = -1717317448;
        int i3 = C1025.f4800;
        int i4 = C2249.f8050;
        int iM11306 = ThreadFactoryC3888.m11306("֫ܳ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 14041) ^ (-723081839);
        int i6 = -2036567490;
        while (true) {
            i2 = ((((i2 ^ i3) * 27985) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2108479175:
                case -940538963:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("ۨܿ") ^ i3) * (-105);
                        i5 = ((iM11306 ^ i4) * (-24673)) ^ 785264327;
                        i6 = 2011358663;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15767)) ^ (-108805251);
                        i6 = 801373608;
                    }
                    break;
                case -1986020485:
                case 1605914680:
                    C0671.m3008();
                    break;
                case -1924483288:
                case 2059251069:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ۜۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-27743)) ^ (-1324751428);
                        i6 = 390180074;
                    } else {
                        iM11306 = C19806.m45029("ᩴ᩺") ^ i4;
                        i5 = ((iM11306 ^ i3) * 12559) ^ (-241771449);
                        i6 = 427082491;
                    }
                    break;
                case -1885923051:
                case -533211507:
                    objM5478 = RunnableC1606.m5478(list, 1);
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (C19806.m45029("ۗ᩶") ^ i3) * 51;
                        i5 = ((iM11306 ^ i4) * 7793) ^ 842610165;
                        i6 = -1541075434;
                    } else {
                        iM11306 = (C19806.m45029("ܳ֨") + i3) * (-29);
                        i5 = ((iM11306 ^ i4) * 297) ^ (-161374434);
                        i6 = 1571459988;
                    }
                    break;
                case -1656246018:
                case 357883947:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (C19806.m45029("ܺܺ") ^ i4) * (-27);
                        i5 = ((iM11306 ^ i3) * (-20045)) ^ (-1707512387);
                        i6 = 51912886;
                    } else {
                        iM11306 = (C19806.m45029("ۗ᩶") ^ i3) * 51;
                        i5 = ((iM11306 ^ i4) * 7793) ^ 842610165;
                        i6 = -1541075434;
                    }
                    break;
                case -1234966083:
                case -285003764:
                    if (RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("ۨܿ") ^ i3) * (-105);
                        i5 = ((iM11306 ^ i4) * (-24673)) ^ 785264327;
                        i6 = 2011358663;
                    } else {
                        iM11306 = C19806.m45029("ۚۡ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-24953)) ^ (-1113888892);
                        i6 = -1159846059;
                    }
                    break;
                case -983666436:
                case 929914630:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i4;
                    i5 = ((iM11306 ^ i3) * 23365) ^ (-250446313);
                    i6 = 1241490672;
                    break;
                case -652944110:
                case 46992495:
                    AbstractC0464.m2313();
                    if (C2124.m6673() > 0) {
                        iM11306 = (C19806.m45029("ۗ᩶") ^ i3) * 51;
                        i5 = ((iM11306 ^ i4) * 7793) ^ 842610165;
                        i6 = -1541075434;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ᩴۡ")) * (-31);
                        i5 = ((iM11306 ^ i3) * 9409) ^ 1882796475;
                        i6 = 662164449;
                    }
                    break;
                case -519026335:
                case -219050292:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ۗ᩶") ^ i3) * 51;
                        i5 = ((iM11306 ^ i4) * 7793) ^ 842610165;
                        i6 = -1541075434;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۨ۬")) * 75;
                        i5 = ((iM11306 ^ i4) * (-9409)) ^ 1191056286;
                        i6 = 1087135253;
                    }
                    break;
                case -9358448:
                case 663861314:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ۨܿ") ^ i3) * (-105);
                        i5 = ((iM11306 ^ i4) * (-24673)) ^ 785264327;
                        i6 = 2011358663;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۠۟")) * 15;
                        i5 = ((iM11306 ^ i3) * 14749) ^ (-1452177938);
                        i6 = -1529566991;
                    }
                    break;
                case 3848224:
                case 1191155129:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (C19806.m45029("ۗ᩶") ^ i3) * 51;
                        i5 = ((iM11306 ^ i4) * 7793) ^ 842610165;
                        i6 = -1541075434;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-31249)) ^ 433873602;
                        i6 = -974794979;
                    }
                    break;
                case 102222840:
                case 619585693:
                    m33886(abstractActivityC12483, str, (String) objM5478);
                    break;
                case 280434031:
                case 433793073:
                    if (C0050.f912 > 0) {
                        iM11306 = (C19806.m45029("ۗ᩶") ^ i3) * 51;
                        i5 = ((iM11306 ^ i4) * 7793) ^ 842610165;
                        i6 = -1541075434;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 23365) ^ (-250446313);
                        i6 = 1241490672;
                    }
                    break;
                case 408036852:
                case 652607628:
                    str = (String) C2477.m7592(list, i);
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("ᩴ᩺") ^ i4;
                        i5 = ((iM11306 ^ i3) * 12559) ^ (-241771449);
                        i6 = 427082491;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܰ") ^ i4) * 37;
                        i5 = ((iM11306 ^ i3) * 20955) ^ 1881356672;
                        i6 = 1106514962;
                    }
                    break;
                case 1063574424:
                case 1663936108:
                    i = 2;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (C19806.m45029("ۗ᩶") ^ i3) * 51;
                        i5 = ((iM11306 ^ i4) * 7793) ^ 842610165;
                        i6 = -1541075434;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢᩴ") ^ i4) * 7;
                        i5 = ((iM11306 ^ i3) * (-16815)) ^ 327947868;
                        i6 = 1683765159;
                    }
                    break;
                default:
                    if (C1398.f5802 > 0) {
                        iM11306 = (C19806.m45029("ۨܿ") ^ i3) * (-105);
                        i5 = ((iM11306 ^ i4) * (-24673)) ^ 785264327;
                        i6 = 2011358663;
                    } else {
                        iM11306 = (C19806.m45029("ۗ᩶") ^ i3) * 51;
                        i5 = ((iM11306 ^ i4) * 7793) ^ 842610165;
                        i6 = -1541075434;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01d7 A[PHI: r1 r5 r6 r7
      0x01d7: PHI (r1v3 android.content.Intent) = 
      (r1v2 android.content.Intent)
      (r1v2 android.content.Intent)
      (r1v2 android.content.Intent)
      (r1v6 android.content.Intent)
     binds: [B:57:0x01d5, B:53:0x01b4, B:10:0x0042, B:35:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r5v5 short) = (r5v4 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:57:0x01d5, B:53:0x01b4, B:10:0x0042, B:35:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:57:0x01d5, B:53:0x01b4, B:10:0x0042, B:35:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:57:0x01d5, B:53:0x01b4, B:10:0x0042, B:35:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x025b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33886(AbstractActivityC12483 abstractActivityC12483, String str, String str2) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
        Intent intent = null;
        String strM3407 = null;
        Uri uri = null;
        short[] sArr = null;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = -342839296;
        int i9 = C1148.f5161;
        int i10 = C2249.f8050;
        int iM45029 = (C19806.m45029("ᩴܶ") + i10) * (-13);
        int i11 = ((iM45029 ^ i9) * 7475) ^ (-1183596060);
        int i12 = 504952403;
        while (true) {
            int i13 = iM45029 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i9) * (-2015)) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -1827033264:
                    case 609350696:
                        AbstractC0464.m2313();
                        C2871.m8646();
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i10;
                        i = ((iM11306 ^ i9) * 28025) ^ 1391697983;
                        i2 = -1386480666;
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case -1593006722:
                    case 1832642025:
                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                        ThreadFactoryC3888.m11300();
                        break;
                    case -1567060754:
                    case 1446927705:
                        if (C2249.m6915() <= 0) {
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i10;
                        i = ((iM11306 ^ i9) * 28025) ^ 1391697983;
                        i2 = -1386480666;
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case -1550652576:
                    case 219246311:
                        C1148.m4232();
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        }
                        iM11306 = (i10 - C19806.m45029("ܺۛ")) * 73;
                        i = ((iM11306 ^ i9) * (-17813)) ^ 896626500;
                        i2 = 2122903184;
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case -1296029138:
                    case -573847373:
                        intent = new Intent();
                        if (RunnableC1895.f7152) {
                            short[] sArr2 = f46058;
                            if (C1668.f6641 < 0) {
                                String strM6105 = C1875.m6105(sArr2, 330, 132, i7);
                                if (C3660.f13403 >= 0) {
                                    int iM11308 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * (-119);
                                    i11 = ((iM11308 ^ i9) * (-12439)) ^ 611840440;
                                    i13 = iM11308 ^ (-616659840);
                                    abstractActivityC12484 = abstractActivityC12483;
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder(strM6105);
                                    C1148.m4223(sb, str);
                                    strM3407 = C0817.m3407(sb);
                                    if (C0050.m946() > 0) {
                                        iM11306 = ThreadFactoryC3888.m11306("ܳۚ") ^ i10;
                                        i = ((iM11306 ^ i9) * (-26785)) ^ (-1411191708);
                                        i2 = 81881320;
                                    }
                                }
                            }
                            iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i10;
                            i = ((iM11306 ^ i9) * 28025) ^ 1391697983;
                            i2 = -1386480666;
                        } else {
                            iM11306 = C19806.m45029("ۛ۫") ^ i9;
                            i = ((iM11306 ^ i10) * (-3319)) ^ (-1914930625);
                            i2 = -601788937;
                        }
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case -998056064:
                    case 288511989:
                        uri = Uri.parse(strM3407);
                        if (ThreadFactoryC3888.m11300() > 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("ۢܶ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i = ((iM11307 ^ i10) * (-25971)) ^ (-1039461854);
                            i3 = 1445133306;
                            i4 = iM11307 ^ i3;
                            i13 = i4;
                            i11 = i;
                        } else {
                            int iM11309 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * (-119);
                            i11 = ((iM11309 ^ i9) * (-12439)) ^ 611840440;
                            i13 = iM11309 ^ (-616659840);
                            abstractActivityC12484 = abstractActivityC12483;
                        }
                        break;
                    case -811202841:
                    case 1705116788:
                        i7 = 60346;
                        iM11306 = C19806.m45029("᩶֨") ^ i9;
                        i = ((iM11306 ^ i10) * 9471) ^ (-1444114917);
                        i2 = -848277957;
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case -641375956:
                    case 777561285:
                        if (C0216.f1393 != 0) {
                            iM11306 = (i10 - C19806.m45029("ܺۛ")) * 73;
                            i = ((iM11306 ^ i9) * (-17813)) ^ 896626500;
                            i2 = 2122903184;
                        } else {
                            iM11306 = (i9 - C19806.m45029("ᩳܺ")) * (-9);
                            i = ((iM11306 ^ i10) * 13483) ^ 1878460174;
                            i2 = 1649825500;
                        }
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case -526872164:
                    case 1125862391:
                        sArr = f46058;
                        if (C2871.f10837 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩻᩻") ^ i10;
                            i = ((iM11306 ^ i9) * 28025) ^ 1391697983;
                            i2 = -1386480666;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i10;
                            i = ((iM11306 ^ i9) * 10199) ^ 1694507309;
                            i2 = -644961333;
                        }
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case -465522316:
                    case 510301635:
                        CallableC1627.m5511(abstractActivityC12484, str2);
                        break;
                    case -132092667:
                    case 1743549908:
                        try {
                            C1419.m4977(abstractActivityC12484, intent);
                            iM11307 = (i9 - ThreadFactoryC3888.m11306("ۙ᩻")) * (-45);
                            i = ((iM11307 ^ i10) * 24035) ^ 1904744742;
                            i3 = -550627645;
                        } catch (Exception unused) {
                            iM11307 = ThreadFactoryC3888.m11306("᩹ᩴ") ^ i9;
                            i = ((iM11307 ^ i10) * 11697) ^ 970500884;
                            i3 = -1678728312;
                        }
                        i4 = iM11307 ^ i3;
                        i13 = i4;
                        i11 = i;
                        break;
                    case 115105752:
                    case 617753936:
                        if (C0797.m3359()) {
                            iM11306 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i10;
                            i = ((iM11306 ^ i9) * (-28371)) ^ (-769126020);
                            i2 = -298116309;
                        } else {
                            iM11306 = (i10 - C19806.m45029("ܺۛ")) * 73;
                            i = ((iM11306 ^ i9) * (-17813)) ^ 896626500;
                            i2 = 2122903184;
                        }
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case 257957474:
                    case 412831797:
                        if ((89401 + i6) - i5 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i10;
                            i = ((iM11306 ^ i9) * (-9443)) ^ 561828349;
                            i2 = -1514041771;
                        } else {
                            iM11306 = C19806.m45029("᩺۟") ^ i9;
                            i = ((iM11306 ^ i10) * (-6437)) ^ (-983118582);
                            i2 = -207954207;
                        }
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case 312357823:
                    case 924577471:
                        intent.setData(uri);
                        C2871.m8643(intent, 268435456);
                        iM11307 = ThreadFactoryC3888.m11306("ۡ᩺") ^ i10;
                        i = ((iM11307 ^ i9) * (-14773)) ^ 1098214794;
                        i3 = 943969235;
                        i4 = iM11307 ^ i3;
                        i13 = i4;
                        i11 = i;
                        break;
                    case 435074083:
                    case 898782871:
                        s = sArr[329];
                        if (C0050.f912 <= 0) {
                            iM11306 = C19806.m45029("ۛ۫") ^ i9;
                            i = ((iM11306 ^ i10) * (-3319)) ^ (-1914930625);
                            i2 = -601788937;
                        } else {
                            iM11306 = (i9 - ThreadFactoryC3888.m11306("ܶ᩵")) * 3;
                            i = ((iM11306 ^ i10) * 29775) ^ (-1274893547);
                            i2 = 1595636582;
                        }
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case 537678046:
                    case 1217769362:
                        i5 = s * 598;
                        i6 = s * s;
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = C19806.m45029("ۛ۫") ^ i9;
                            i = ((iM11306 ^ i10) * (-3319)) ^ (-1914930625);
                            i2 = -601788937;
                        } else {
                            iM11306 = C19806.m45029("᩺ܳ") ^ i10;
                            i = ((iM11306 ^ i9) * (-8073)) ^ (-742659120);
                            i2 = -654624093;
                        }
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    case 1047661226:
                    case 1384931516:
                        break;
                    case 1225023834:
                    case 2085319911:
                        if (C0278.f1572 <= 0) {
                            iM11306 = C19806.m45029("ۛ۫") ^ i9;
                            i = ((iM11306 ^ i10) * (-3319)) ^ (-1914930625);
                            i2 = -601788937;
                            i4 = iM11306 ^ i2;
                            abstractActivityC12484 = abstractActivityC12483;
                            i13 = i4;
                            i11 = i;
                        }
                        iM11306 = (i10 - C19806.m45029("ܺۛ")) * 73;
                        i = ((iM11306 ^ i9) * (-17813)) ^ 896626500;
                        i2 = 2122903184;
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                    default:
                        i7 = 19301;
                        iM11306 = C19806.m45029("᩶֨") ^ i9;
                        i = ((iM11306 ^ i10) * 9471) ^ (-1444114917);
                        i2 = -848277957;
                        i4 = iM11306 ^ i2;
                        abstractActivityC12484 = abstractActivityC12483;
                        i13 = i4;
                        i11 = i;
                        break;
                }
                return;
            }
            iM45029 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i9;
            i11 = ((iM45029 ^ i10) * 10453) ^ 741888575;
            i12 = 1541509868;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 93521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public C14015(l.AbstractActivityC12483 r89, boolean r90, boolean r91, java.lang.Runnable r92) {
        /*
            Method dump skipped, instruction units count: 9352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14015.<init>(l.۫ܶۘ, boolean, boolean, java.lang.Runnable):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33887(AbstractActivityC12483 abstractActivityC12483, List list) {
        int i = 0;
        String str = null;
        Object objM5478 = null;
        int i2 = -2107097564;
        int i3 = C0629.f2722;
        int i4 = C1461.f5957;
        int iM11306 = (ThreadFactoryC3888.m11306("᩸᩷") + i3) * (-29);
        int i5 = ((iM11306 ^ i4) * (-24037)) ^ (-573152438);
        int i6 = 1818352285;
        while (true) {
            i2 = ((((i2 ^ i4) * 9941) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2029246413:
                case -1553254882:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۢ") + i4) * 21;
                        i5 = ((iM11306 ^ i3) * (-6323)) ^ (-1410526109);
                        i6 = 1056881784;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܿ᩻")) * 83;
                        i5 = ((iM11306 ^ i3) * (-12975)) ^ (-1717821427);
                        i6 = 27763991;
                    }
                    break;
                case -1943833075:
                case -220329051:
                    if (!C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * 5403) ^ 1045716592;
                        i6 = 1525357967;
                    } else {
                        iM11306 = C19806.m45029("֫᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25735)) ^ (-320354314);
                        i6 = 1917565032;
                    }
                    break;
                case -1849866197:
                case 1170062463:
                    if (C19806.f63586) {
                        iM11306 = (i4 - C19806.m45029("ܿ᩻")) * 83;
                        i5 = ((iM11306 ^ i3) * (-12975)) ^ (-1717821427);
                        i6 = 27763991;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ܽ") ^ i3) * (-27);
                        i5 = ((iM11306 ^ i4) * (-16229)) ^ 1598779139;
                        i6 = 1950725882;
                    }
                    break;
                case -1483424652:
                case -185160720:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ܿ᩻")) * 83;
                        i5 = ((iM11306 ^ i3) * (-12975)) ^ (-1717821427);
                        i6 = 27763991;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۖ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-22919)) ^ 790876584;
                        i6 = 1443116247;
                    }
                    break;
                case -1458048944:
                case -261817729:
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("֫᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25735)) ^ (-320354314);
                        i6 = 1917565032;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܿ᩻")) * 83;
                        i5 = ((iM11306 ^ i3) * (-12975)) ^ (-1717821427);
                        i6 = 27763991;
                    }
                    break;
                case -1457113902:
                case -808105330:
                    C3577.m10565();
                    break;
                case -1399371844:
                case 1361045178:
                    objM5478 = RunnableC1606.m5478(list, 1);
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("۟ۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25035)) ^ (-556311254);
                        i6 = -1622377196;
                    } else {
                        iM11306 = (C19806.m45029("᩶֫") + i4) * 35;
                        i5 = ((iM11306 ^ i3) * 15841) ^ (-845095352);
                        i6 = -301543624;
                    }
                    break;
                case -1244035167:
                case -689034891:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ܿ᩻")) * 83;
                        i5 = ((iM11306 ^ i3) * (-12975)) ^ (-1717821427);
                        i6 = 27763991;
                    } else {
                        iM11306 = C19806.m45029("֨ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-7687)) ^ 1878101539;
                        i6 = -908541184;
                    }
                    break;
                case -1166376173:
                case 2121225347:
                    i = 2;
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("۟ۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25035)) ^ (-556311254);
                        i6 = -1622377196;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۙ۬")) * 23;
                        i5 = ((iM11306 ^ i4) * 2163) ^ (-1691467219);
                        i6 = -638602590;
                    }
                    break;
                case -1011836090:
                case 1233617709:
                    C2788.m8472();
                    if (C3743.m10966() > 0) {
                        iM11306 = (i4 - C19806.m45029("ۢᩴ")) * 35;
                        i5 = ((iM11306 ^ i3) * 10299) ^ (-682612958);
                        i6 = -1130277949;
                    } else {
                        iM11306 = C19806.m45029("֫᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25735)) ^ (-320354314);
                        i6 = 1917565032;
                    }
                    break;
                case -980527829:
                case -236055970:
                    if (C1148.m4232() <= 0) {
                        iM11306 = C19806.m45029("֫᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25735)) ^ (-320354314);
                        i6 = 1917565032;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ۟") + i3) * (-115);
                        i5 = ((iM11306 ^ i4) * 23261) ^ (-1385837951);
                        i6 = -1836286193;
                    }
                    break;
                case -964098252:
                case -129067280:
                    m33886(abstractActivityC12483, str, (String) objM5478);
                    break;
                case -308236578:
                case 196513411:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ۢᩴ")) * 35;
                        i5 = ((iM11306 ^ i3) * 10299) ^ (-682612958);
                        i6 = -1130277949;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۬") ^ i4) * 109;
                        i5 = ((iM11306 ^ i3) * (-8643)) ^ 1868549805;
                        i6 = 1724932951;
                    }
                    break;
                case 241316436:
                case 588296819:
                    if (C1668.m5583()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-2635)) ^ 2079703824;
                        i6 = 416908569;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * 5403) ^ 1045716592;
                        i6 = 1525357967;
                    }
                    break;
                case 1729602213:
                case 2117156900:
                    str = (String) RunnableC1606.m5478(list, i);
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("۟ۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-25035)) ^ (-556311254);
                        i6 = -1622377196;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹ۧ")) * (-49);
                        i5 = ((iM11306 ^ i4) * 17499) ^ 1413441333;
                        i6 = 422090256;
                    }
                    break;
                default:
                    C0216.m1591();
                    RunnableC1895.m6170();
                    iM11306 = (i4 - C19806.m45029("ܿ᩻")) * 83;
                    i5 = ((iM11306 ^ i3) * (-12975)) ^ (-1717821427);
                    i6 = 27763991;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33892(AbstractActivityC12483 abstractActivityC12483, List list) {
        int i = 0;
        String str = null;
        Object objM5478 = null;
        int i2 = 1306564222;
        int i3 = C1066.f4915;
        int i4 = C1875.f7103;
        int iM45029 = (C19806.m45029("᩸ܺ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i5 = ((iM45029 ^ i3) * 23007) ^ 18879686;
        int i6 = 1498874662;
        while (true) {
            i2 = ((((i2 ^ i3) * (-15515)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2110474676:
                case 1478703871:
                    i = 2;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("ۢܺ") ^ i4) * (-119);
                        i5 = ((iM45029 ^ i3) * 30741) ^ 1621835861;
                        i6 = 696818890;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩶") + i4) * 95;
                        i5 = ((iM45029 ^ i3) * (-18525)) ^ (-1258382196);
                        i6 = -1272878770;
                    }
                    break;
                case -2108673385:
                case -278557203:
                    C2642.m8171();
                    RunnableC0195.m1431();
                    iM45029 = (C19806.m45029("ۚ۟") ^ i3) * (-25);
                    i5 = ((iM45029 ^ i4) * 3211) ^ (-739447346);
                    i6 = -1468100170;
                    break;
                case -2037536863:
                case 2077454600:
                    if (!C10634.m26820()) {
                        iM45029 = (C19806.m45029("ۚ۟") ^ i3) * (-25);
                        i5 = ((iM45029 ^ i4) * 3211) ^ (-739447346);
                        i6 = -1468100170;
                    } else {
                        iM45029 = (C19806.m45029("ۢܺ") ^ i4) * (-119);
                        i5 = ((iM45029 ^ i3) * 30741) ^ 1621835861;
                        i6 = 696818890;
                    }
                    break;
                case -1940045892:
                case -216246854:
                    m33886(abstractActivityC12483, str, (String) objM5478);
                    break;
                case -1919865559:
                case 1367563116:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("ۚ۟") ^ i3) * (-25);
                        i5 = ((iM45029 ^ i4) * 3211) ^ (-739447346);
                        i6 = -1468100170;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩵ۚ")) * (-97);
                        i5 = ((iM45029 ^ i4) * (-14091)) ^ 1874099409;
                        i6 = 751734984;
                    }
                    break;
                case -1797697230:
                case 408787348:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۛ") ^ i4) * (-113);
                        i5 = ((iM45029 ^ i3) * 10327) ^ 780821765;
                        i6 = 1428231762;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩷ۙ")) * (-63);
                        i5 = ((iM45029 ^ i3) * (-16597)) ^ (-409402800);
                        i6 = -2091288748;
                    }
                    break;
                case -1662072065:
                case -195284808:
                    if (C1461.m5080()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۛ") ^ i4) * (-113);
                        i5 = ((iM45029 ^ i3) * 10327) ^ 780821765;
                        i6 = 1428231762;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۚۗ")) * 51;
                        i5 = ((iM45029 ^ i4) * (-2189)) ^ 1184084629;
                        i6 = 264342011;
                    }
                    break;
                case -1618184112:
                case 1928235089:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-19273)) ^ 838391409;
                        i6 = -244956034;
                    } else {
                        iM45029 = C19806.m45029("ܳܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 28789) ^ 1696842831;
                        i6 = 2142967720;
                    }
                    break;
                case -1572175226:
                case -1192137214:
                    if (C2642.m8171() != 0) {
                        iM45029 = C19806.m45029("֡᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20193)) ^ 49998390;
                        i6 = 825777640;
                    } else {
                        iM45029 = (C19806.m45029("ۚᩴ") + i4) * (-73);
                        i5 = ((iM45029 ^ i3) * 9897) ^ 1221350314;
                        i6 = -142080736;
                    }
                    break;
                case -1416583988:
                case 422920865:
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-23271)) ^ (-1572030465);
                        i6 = 876581899;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۛ") ^ i4) * (-113);
                        i5 = ((iM45029 ^ i3) * 10327) ^ 780821765;
                        i6 = 1428231762;
                    }
                    break;
                case -206697809:
                case 1630872622:
                    str = (String) RunnableC1606.m5478(list, i);
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("ܳܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 28789) ^ 1696842831;
                        i6 = 2142967720;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 25565) ^ (-616860242);
                        i6 = -1088006495;
                    }
                    break;
                case 436721829:
                case 1216334282:
                    C0962.m3746();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = C19806.m45029("֡᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20193)) ^ 49998390;
                        i6 = 825777640;
                    } else {
                        iM45029 = (C19806.m45029("ۚ۟") ^ i3) * (-25);
                        i5 = ((iM45029 ^ i4) * 3211) ^ (-739447346);
                        i6 = -1468100170;
                    }
                    break;
                case 588180397:
                case 1417985148:
                    C1377.m4833();
                    if (!C0817.f3443) {
                        iM45029 = (C19806.m45029("ۚ۟") ^ i3) * (-25);
                        i5 = ((iM45029 ^ i4) * 3211) ^ (-739447346);
                        i6 = -1468100170;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۛ") ^ i4) * (-113);
                        i5 = ((iM45029 ^ i3) * 10327) ^ 780821765;
                        i6 = 1428231762;
                    }
                    break;
                case 1267800632:
                case 1447721927:
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۛ") ^ i4) * (-113);
                        i5 = ((iM45029 ^ i3) * 10327) ^ 780821765;
                        i6 = 1428231762;
                    } else {
                        iM45029 = (C19806.m45029("ۙ۬") + i4) * 79;
                        i5 = ((iM45029 ^ i3) * (-11033)) ^ (-1323393818);
                        i6 = 748280098;
                    }
                    break;
                case 1410834001:
                case 1637299353:
                    objM5478 = RunnableC1606.m5478(list, 1);
                    if (C3535.m10431() <= 0) {
                        iM45029 = (C19806.m45029("ۚ۟") ^ i3) * (-25);
                        i5 = ((iM45029 ^ i4) * 3211) ^ (-739447346);
                        i6 = -1468100170;
                    } else {
                        iM45029 = C19806.m45029("ۛܺ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 1495) ^ 30318882;
                        i6 = -371077779;
                    }
                    break;
                default:
                    C3722.m10894();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0170 A[PHI: r9 r11 r12 r13
      0x0170: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:45:0x016e, B:34:0x00f2, B:30:0x00cf, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:45:0x016e, B:34:0x00f2, B:30:0x00cf, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:45:0x016e, B:34:0x00f2, B:30:0x00cf, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:45:0x016e, B:34:0x00f2, B:30:0x00cf, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c5 A[PHI: r2 r7 r8
      0x01c5: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:53:0x01c3, B:49:0x01a2, B:26:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:53:0x01c3, B:49:0x01a2, B:26:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:53:0x01c3, B:49:0x01a2, B:26:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0219 A[PHI: r4 r5 r6
      0x0219: PHI (r4v6 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:61:0x0217, B:57:0x01f9, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r5v6 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:61:0x0217, B:57:0x01f9, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r6v6 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:61:0x0217, B:57:0x01f9, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x025e A[PHI: r18
      0x025e: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:65:0x0247, B:19:0x0088, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m33888(AbstractActivityC12483 abstractActivityC12483, boolean z) {
        int iM11306;
        int i;
        AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
        int i2 = C2124.f7782;
        int i3 = C0050.f912;
        int iM11307 = (i2 - ThreadFactoryC3888.m11306("ۡܳ")) * (-67);
        int i4 = ((iM11307 ^ i3) * 9509) ^ 54837478;
        short[] sArr = null;
        short[] sArr2 = null;
        int i5 = iM11307 ^ 620930279;
        String strM5481 = null;
        char c = 0;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1945859833;
        while (true) {
            i12 = i5 ^ (i4 & (((i12 ^ i3) * (-23799)) >> 31));
            switch (i12) {
                case -2127508452:
                case 419226628:
                    C1025.m3861();
                    C3743.m10966();
                    iM11306 = C19806.m45029("᩻ۙ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 28017) ^ (-82872662);
                    i = 380981273;
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -2033167551:
                case -529377396:
                    i9 = 35811;
                    iM11306 = C19806.m45029("֨ܽ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 10207) ^ (-1785966916);
                    i = 1555918268;
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -1785748843:
                case 278348490:
                    sArr2 = f46058;
                    i10 = 463;
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19635) ^ 1160294405;
                        i = -1925415388;
                    } else {
                        iM11306 = (C19806.m45029("᩹ۡ") ^ i2) * 59;
                        i4 = ((iM11306 ^ i3) * (-15295)) ^ (-673210833);
                        i = -210871975;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -1628715308:
                case 635633177:
                    C0526.m2437();
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("᩻ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28017) ^ (-82872662);
                        i = 380981273;
                        i5 = iM11306 ^ i;
                        abstractActivityC12484 = abstractActivityC12483;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ۢۢ") ^ i2;
                        i5 = iM11308 ^ (-1850511898);
                        i4 = ((iM11308 ^ i3) * 6517) ^ (-1758906287);
                    }
                    break;
                case -1607616358:
                case -537770383:
                    strM5481 = RunnableC1606.m5481(sArr2, i10, i11, i9);
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19833)) ^ (-125007969);
                        i = 1774749836;
                        i5 = iM11306 ^ i;
                    } else {
                        int iM45029 = C19806.m45029("ۜ֡") ^ i3;
                        i5 = iM45029 ^ (-1313507610);
                        i4 = ((iM45029 ^ i2) * 25051) ^ (-1638354404);
                    }
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -1455932176:
                case 1630399916:
                    C1668.m5583();
                    C1398.m4895();
                    break;
                case -1164240676:
                case -193652174:
                    i7 = 245517561;
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19833)) ^ (-125007969);
                        i = 1774749836;
                    } else {
                        iM11306 = (C19806.m45029("ۙۤ") ^ i3) * (-67);
                        i4 = ((iM11306 ^ i2) * (-21459)) ^ 1940369379;
                        i = 1109004482;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -1132038837:
                case 1394964225:
                    s2 = 15669;
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19635) ^ 1160294405;
                        i = -1925415388;
                    } else {
                        iM11306 = C19806.m45029("ܳۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25815)) ^ 1567085508;
                        i = 152943701;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -766788266:
                case -691051565:
                    c = 462;
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("᩻ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28017) ^ (-82872662);
                        i = 380981273;
                    } else {
                        iM11306 = C19806.m45029("ܿ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11921) ^ 480083674;
                        i = 1282191562;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -715596748:
                case -433571923:
                    C0629.m2907();
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19635) ^ 1160294405;
                        i = -1925415388;
                        i5 = iM11306 ^ i;
                        abstractActivityC12484 = abstractActivityC12483;
                    }
                    iM11306 = C19806.m45029("᩻ۙ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 28017) ^ (-82872662);
                    i = 380981273;
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -589045106:
                case 1785866599:
                    i9 = 38613;
                    iM11306 = C19806.m45029("֨ܽ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 10207) ^ (-1785966916);
                    i = 1555918268;
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -306160877:
                case 1006096515:
                    s = sArr[c];
                    i6 = s * s;
                    if (C1461.f5957 <= 0) {
                        iM11306 = C19806.m45029("᩻ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28017) ^ (-82872662);
                        i = 380981273;
                    } else {
                        iM11306 = C19806.m45029("֫ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8447) ^ (-436948472);
                        i = -156158003;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -89868657:
                case 308032466:
                    C0671.m3008();
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("᩺ۚ") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * 25467) ^ 1993556198;
                        i = 213254549;
                        i5 = iM11306 ^ i;
                        abstractActivityC12484 = abstractActivityC12483;
                    }
                    iM11306 = C19806.m45029("᩻ۙ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 28017) ^ (-82872662);
                    i = 380981273;
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case -39897792:
                case 255664291:
                    C2704.m8238(abstractActivityC12484, strM5481);
                    C7643.m20197(abstractActivityC12484, false, z, null);
                    break;
                case 175438746:
                case 1489226597:
                    sArr = f46058;
                    if (C3660.f13403 >= 0) {
                        iM11306 = (C19806.m45029("᩺ۚ") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * 25467) ^ 1993556198;
                        i = 213254549;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29519)) ^ (-1047643169);
                        i = -1588309174;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case 835919150:
                case 1391105386:
                    int i13 = i6 + i7;
                    i8 = i13 + i13;
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-19833)) ^ (-125007969);
                        i = 1774749836;
                    } else {
                        iM11306 = (C19806.m45029("ۗۨ") ^ i2) * 59;
                        i4 = ((iM11306 ^ i3) * (-11509)) ^ (-780170731);
                        i = 742922453;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case 1161282495:
                case 1337675890:
                    int i14 = s + s2;
                    if ((i14 * i14) - i8 > 0) {
                        iM11306 = C19806.m45029("᩶ᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26219)) ^ 1722661315;
                        i = -1746231495;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙܳ") ^ i2) * (-119);
                        i4 = ((iM11306 ^ i3) * 22517) ^ 361516427;
                        i = -1172016393;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                case 1317493525:
                case 1667101800:
                    i11 = 8;
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19635) ^ 1160294405;
                        i = -1925415388;
                    } else {
                        iM11306 = (C19806.m45029("᩻ۤ") ^ i3) * (-111);
                        i4 = ((iM11306 ^ i2) * (-23191)) ^ 2023062466;
                        i = 1507792720;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
                default:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("᩺ۚ") + i3) * 91;
                        i4 = ((iM11306 ^ i2) * 25467) ^ 1993556198;
                        i = 213254549;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘܳ")) * (-101);
                        i4 = ((iM11306 ^ i2) * (-3399)) ^ (-1186872572);
                        i = -1421598915;
                    }
                    i5 = iM11306 ^ i;
                    abstractActivityC12484 = abstractActivityC12483;
                    break;
            }
            return;
        }
    }
}
