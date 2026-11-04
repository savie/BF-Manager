package l;

import android.app.Activity;
import android.content.Context;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۧ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11879 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38297;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38298;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38299;

    public /* synthetic */ RunnableC11879(int i, Object obj, Object obj2) {
        int i2 = 2000329280;
        int i3 = C1542.f5343;
        int i4 = C1564.f5401;
        this.f38297 = i;
        this.f38299 = obj;
        this.f38298 = obj2;
        int iM3169 = C0773.m3169("ܿ۬") ^ i3;
        int i5 = ((iM3169 ^ i4) * 12929) ^ (-1644716894);
        int i6 = 840858709;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i4) * 5191) >> 31));
            switch (i2) {
                case -2071882684:
                case 2071944180:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ᩴܶ")) * (-79);
                        i5 = ((iM3169 ^ i4) * 12985) ^ (-941392808);
                        i6 = -401592792;
                    } else {
                        iM3169 = C0619.m2761("ܺ᩸") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-23485)) ^ (-1808562820);
                        i6 = 1970726859;
                    }
                    break;
                case -1874420528:
                case 985803116:
                    if (C0487.f2131 > 0) {
                        iM3169 = C0619.m2761("᩺ۖ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 19633) ^ (-423856503);
                        i6 = -1054858937;
                    } else {
                        iM3169 = C0619.m2761("ܶ۠") ^ i3;
                        i5 = ((iM3169 ^ i4) * 29327) ^ 425814941;
                        i6 = -1301648264;
                    }
                    break;
                case -1278945822:
                case 1351510731:
                    if (C2966.f9654 < 0) {
                        iM3169 = (C0619.m2761("ܶۢ") + i4) * 85;
                        i5 = ((iM3169 ^ i3) * (-16563)) ^ 944518215;
                        i6 = -1904714969;
                    } else {
                        iM3169 = C0619.m2761("ۚᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 16307) ^ (-440734076);
                        i6 = 1897705430;
                    }
                    break;
                case -1145767064:
                case -316183054:
                    C1519.m5403();
                    C2834.m9344();
                    throw new RuntimeException();
                case -56333878:
                case 193700028:
                    C3690.m11987();
                    if (C0950.f3488 < 0) {
                        iM3169 = (C0619.m2761("ܶۢ") + i4) * 85;
                        i5 = ((iM3169 ^ i3) * (-16563)) ^ 944518215;
                        i6 = -1904714969;
                    } else {
                        iM3169 = C0619.m2761("᩺ۖ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 19633) ^ (-423856503);
                        i6 = -1054858937;
                    }
                    break;
                case 1008197017:
                case 1253242630:
                    return;
                default:
                    C20932.m47848();
                    C1564.m5509();
                    iM3169 = C0619.m2761("᩺ۖ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 19633) ^ (-423856503);
                    i6 = -1054858937;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x014f A[PHI: r8 r9 r11 r12 r15
      0x014f: PHI (r8v5 l.۠ۨܳ) = (r8v4 l.۠ۨܳ), (r8v2 l.۠ۨܳ), (r8v2 l.۠ۨܳ), (r8v2 l.۠ۨܳ) binds: [B:41:0x014d, B:33:0x00f0, B:9:0x005c, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r9v4 java.lang.Object) = (r9v3 java.lang.Object), (r9v2 java.lang.Object), (r9v2 java.lang.Object), (r9v2 java.lang.Object) binds: [B:41:0x014d, B:33:0x00f0, B:9:0x005c, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r11v5 android.app.Activity) = (r11v2 android.app.Activity), (r11v4 android.app.Activity), (r11v2 android.app.Activity), (r11v2 android.app.Activity) binds: [B:41:0x014d, B:33:0x00f0, B:9:0x005c, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r12v4 java.lang.Object) = (r12v2 java.lang.Object), (r12v3 java.lang.Object), (r12v2 java.lang.Object), (r12v2 java.lang.Object) binds: [B:41:0x014d, B:33:0x00f0, B:9:0x005c, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r15v3 l.ۧ᩷ۧ) = (r15v2 l.ۧ᩷ۧ), (r15v2 l.ۧ᩷ۧ), (r15v2 l.ۧ᩷ۧ), (r15v5 l.ۧ᩷ۧ) binds: [B:41:0x014d, B:33:0x00f0, B:9:0x005c, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ac A[PHI: r6
      0x01ac: PHI (r6v5 l.ۜۗᩴ) = (r6v4 l.ۜۗᩴ), (r6v2 l.ۜۗᩴ), (r6v2 l.ۜۗᩴ) binds: [B:51:0x01aa, B:15:0x0070, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0208 A[PHI: r4 r5
      0x0208: PHI (r4v5 android.content.Context) = 
      (r4v4 android.content.Context)
      (r4v2 android.content.Context)
      (r4v2 android.content.Context)
      (r4v2 android.content.Context)
     binds: [B:61:0x0206, B:57:0x01e4, B:12:0x0067, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r5v4 java.lang.Object) = (r5v2 java.lang.Object), (r5v3 java.lang.Object), (r5v2 java.lang.Object), (r5v2 java.lang.Object) binds: [B:61:0x0206, B:57:0x01e4, B:12:0x0067, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x028a A[PHI: r7 r13 r14 r20
      0x028a: PHI (r7v4 java.lang.Object) = 
      (r7v2 java.lang.Object)
      (r7v3 java.lang.Object)
      (r7v2 java.lang.Object)
      (r7v2 java.lang.Object)
      (r7v2 java.lang.Object)
     binds: [B:71:0x0288, B:47:0x0187, B:27:0x00c5, B:17:0x0074, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r13v5 l.᩺᩶ۘ) = (r13v2 l.᩺᩶ۘ), (r13v2 l.᩺᩶ۘ), (r13v4 l.᩺᩶ۘ), (r13v2 l.᩺᩶ۘ), (r13v2 l.᩺᩶ۘ) binds: [B:71:0x0288, B:47:0x0187, B:27:0x00c5, B:17:0x0074, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r14v4 java.lang.Object) = 
      (r14v2 java.lang.Object)
      (r14v2 java.lang.Object)
      (r14v3 java.lang.Object)
      (r14v2 java.lang.Object)
      (r14v2 java.lang.Object)
     binds: [B:71:0x0288, B:47:0x0187, B:27:0x00c5, B:17:0x0074, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r20v18 bin.mt.plus.Main) = 
      (r20v17 bin.mt.plus.Main)
      (r20v3 bin.mt.plus.Main)
      (r20v3 bin.mt.plus.Main)
      (r20v3 bin.mt.plus.Main)
      (r20v3 bin.mt.plus.Main)
     binds: [B:71:0x0288, B:47:0x0187, B:27:0x00c5, B:17:0x0074, B:15:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        Main main;
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4 = C1542.f5343;
        int i5 = C1080.f3865;
        int iM2763 = (i4 - C0619.m2761("᩺ۧ")) * (-119);
        int i6 = ((iM2763 ^ i5) * 1349) ^ (-1664255465);
        RunnableC11879 runnableC11879 = null;
        int i7 = iM2763 ^ (-1729010201);
        int i8 = 366671851;
        Main main2 = null;
        Object obj = null;
        C24533 c24533 = null;
        Object obj2 = null;
        Activity activity = null;
        RunnableC16072 runnableC16072 = null;
        Object obj3 = null;
        C8614 c8614 = null;
        Object obj4 = null;
        C6865 c6865 = null;
        Object obj5 = null;
        Context context = null;
        Object obj6 = null;
        while (true) {
            i8 = i7 ^ (i6 & (((i8 ^ i5) * 9869) >> 31));
            switch (i8) {
                case -2082571412:
                case 752223042:
                    C3077.m10041();
                    if (C2288.f7433 <= 0) {
                        iM2762 = (i4 - C0773.m3169("ۛܽ")) * 115;
                        i = ((iM2762 ^ i5) * 28709) ^ (-106158369);
                        i3 = 1727413608;
                    } else {
                        iM2762 = (i4 - C0619.m2761("ۢۙ")) * (-103);
                        i = ((iM2762 ^ i5) * 7483) ^ 1548054932;
                        i3 = 1821739199;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -1874911860:
                case -775740542:
                    obj4 = this.f38298;
                    if (C1826.f6190 <= 0) {
                        iM2762 = (i4 - C0773.m3169("ۛܽ")) * 115;
                        i = ((iM2762 ^ i5) * 28709) ^ (-106158369);
                        i3 = 1727413608;
                    } else {
                        iM2762 = C0773.m3169("۬᩸") ^ i5;
                        i = ((iM2762 ^ i4) * (-9005)) ^ (-1586189800);
                        i3 = -391172861;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -1871665418:
                case -1833053657:
                    C17202.m40372();
                    C0773.m3161();
                    break;
                case -1866939618:
                case -1241903464:
                    c24533 = (C24533) this.f38299;
                    obj = this.f38298;
                    if (C2287.f7432 >= 0) {
                        iM2762 = (i4 - C0773.m3169("ۛܽ")) * 115;
                        i = ((iM2762 ^ i5) * 28709) ^ (-106158369);
                        i3 = 1727413608;
                    } else {
                        iM2762 = (C0619.m2761("۠֫") ^ i5) * (-71);
                        i = ((iM2762 ^ i4) * (-4433)) ^ (-1815509543);
                        i3 = 1620646419;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -1766015766:
                case -178657478:
                    break;
                case -1604160182:
                case -1515103183:
                    context = (Context) this.f38299;
                    if (C2834.f9334 <= 0) {
                        iM2762 = (C0619.m2761("ᩳ᩸") ^ i5) * (-13);
                        i = ((iM2762 ^ i4) * (-23013)) ^ (-831282089);
                        i3 = -150223979;
                    } else {
                        iM2762 = C0619.m2761("ܺ֫") ^ i5;
                        i = ((iM2762 ^ i4) * 10401) ^ 482770304;
                        i3 = 931147463;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -1398067750:
                case 1858847692:
                    c6865 = (C6865) this.f38299;
                    if (C2834.m9344() >= 0) {
                        iM2762 = (i4 - C0619.m2761("ۢۙ")) * (-103);
                        i = ((iM2762 ^ i5) * 7483) ^ 1548054932;
                        i3 = 1821739199;
                    } else {
                        iM2762 = C0619.m2761("ۨܽ") ^ i5;
                        i = ((iM2762 ^ i4) * (-27923)) ^ 1337235763;
                        i3 = 178628671;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -1339419272:
                case 1618483225:
                    C3690.m11988(main2, (String) obj6);
                    break;
                case -1215746774:
                case 425453423:
                    C8345.m22451(context, (C0645) obj5);
                    break;
                case -1212021916:
                case -1005585739:
                    runnableC16072.run();
                    iM2762 = (C0773.m3169("ܿ᩻") ^ i5) * 91;
                    i = ((iM2762 ^ i4) * (-6677)) ^ 1219674336;
                    i3 = 1807968598;
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -1126000368:
                case 208810322:
                    Main main3 = main2;
                    obj6 = this.f38298;
                    if (C2966.f9654 >= 0) {
                        int iM2764 = (C0619.m2761("۬ۗ") ^ i4) * (-15);
                        i6 = ((iM2764 ^ i5) * (-6485)) ^ (-1611022097);
                        main2 = main3;
                        i7 = iM2764 ^ 1279541052;
                    } else {
                        main = main3;
                        iM2761 = C0773.m3169("ۡ᩶") ^ i4;
                        i = ((iM2761 ^ i5) * 11889) ^ 491578752;
                        i2 = -112510239;
                        int i9 = iM2761 ^ i2;
                        main2 = main;
                        i7 = i9;
                        i6 = i;
                    }
                    break;
                case -1038808382:
                case 1800094990:
                    C2419.m8178(runnableC11879, 100L);
                    iM2762 = (C0773.m3169("ܿ᩻") ^ i5) * 91;
                    i = ((iM2762 ^ i4) * (-6677)) ^ 1219674336;
                    i3 = 1807968598;
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -1019262681:
                case 868846311:
                    c6865.m19119((C24132) obj4);
                    break;
                case -1002885540:
                case 2111900944:
                    main = main2;
                    switch (this.f38297) {
                        case 0:
                            iM2761 = C0619.m2761("ۘۧ") ^ i5;
                            i = ((iM2761 ^ i4) * 2899) ^ (-1997108000);
                            i2 = 1037480916;
                            break;
                        case 1:
                            iM2761 = (C0773.m3169("ܽ۠") + i5) * 13;
                            i = ((iM2761 ^ i4) * (-4625)) ^ (-75347786);
                            i2 = -2121305058;
                            break;
                        case 2:
                            iM2761 = C0773.m3169("۬۠") ^ i4;
                            i = ((iM2761 ^ i5) * (-9947)) ^ 1021759078;
                            i2 = 665509524;
                            break;
                        case 3:
                            iM2761 = C0773.m3169("۠ۗ") ^ i4;
                            i = ((iM2761 ^ i5) * 8257) ^ (-1950112629);
                            i2 = 1629799849;
                            break;
                        case 4:
                            iM2761 = C0773.m3169("ۛ᩻") ^ i4;
                            i = ((iM2761 ^ i5) * 2067) ^ 46216095;
                            i2 = 1548997290;
                            break;
                        default:
                            iM2761 = (i5 - C0619.m2761("ۙ᩹")) * (-51);
                            i = ((iM2761 ^ i4) * 23855) ^ (-1859823846);
                            i2 = -629898474;
                            break;
                    }
                    int i10 = iM2761 ^ i2;
                    main2 = main;
                    i7 = i10;
                    i6 = i;
                    break;
                case -957136126:
                case -424657357:
                    main2 = (Main) this.f38299;
                    if (AbstractC3624.m11755() != 0) {
                        iM2762 = (i4 - C0773.m3169("ۛܽ")) * 115;
                        i = ((iM2762 ^ i5) * 28709) ^ (-106158369);
                        i3 = 1727413608;
                    } else {
                        iM2762 = C0619.m2761("᩻۬") ^ i4;
                        i = ((iM2762 ^ i5) * 23951) ^ (-202512391);
                        i3 = -176135443;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -924417866:
                case -501367146:
                    runnableC16072 = (RunnableC16072) obj3;
                    if (C2023.m6959(c8614)) {
                        iM2762 = (C0619.m2761("᩵ۚ") + i5) * 101;
                        i = ((iM2762 ^ i4) * (-25337)) ^ (-1831635705);
                        i3 = 112254317;
                    } else {
                        iM2762 = (i4 - C0773.m3169("ᩴ֫")) * 85;
                        i = ((iM2762 ^ i5) * 23993) ^ 759376824;
                        i3 = -1737662868;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -320430690:
                case -258407285:
                    obj5 = this.f38298;
                    if (C2287.f7432 >= 0) {
                        iM2762 = (C0619.m2761("ᩳ᩸") ^ i5) * (-13);
                        i = ((iM2762 ^ i4) * (-23013)) ^ (-831282089);
                        i3 = -150223979;
                    } else {
                        iM2762 = (i4 - C0619.m2761("᩻᩶")) * 39;
                        i = ((iM2762 ^ i5) * 9607) ^ 700170620;
                        i3 = 876136632;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case -16025621:
                case 110524689:
                    if (C4282.f15546 > 0) {
                        iM2762 = (C0619.m2761("ᩳ᩸") ^ i5) * (-13);
                        i = ((iM2762 ^ i4) * (-23013)) ^ (-831282089);
                        i3 = -150223979;
                    } else {
                        iM2762 = C0773.m3169("ܺ۠") ^ i5;
                        i = ((iM2762 ^ i4) * (-18807)) ^ (-1290319266);
                        i3 = -1961100503;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case 95414165:
                case 355663238:
                    activity = (Activity) this.f38299;
                    obj2 = this.f38298;
                    if (C3099.f10023 <= 0) {
                        iM2762 = C0773.m3169("ܺ۠") ^ i5;
                        i = ((iM2762 ^ i4) * (-18807)) ^ (-1290319266);
                        i3 = -1961100503;
                    } else {
                        iM2762 = (C0619.m2761("֡ᩳ") ^ i4) * (-107);
                        i = ((iM2762 ^ i5) * 715) ^ (-274657888);
                        i3 = 548332237;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case 96905441:
                case 378650834:
                    C20932.m47848();
                    iM2762 = (i4 - C0773.m3169("ۛܽ")) * 115;
                    i = ((iM2762 ^ i5) * 28709) ^ (-106158369);
                    i3 = 1727413608;
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case 486223691:
                case 1350388519:
                    C0950.m3785();
                    if (C3033.m9845() <= 0) {
                        iM2762 = (i4 - C0619.m2761("ۢۙ")) * (-103);
                        i = ((iM2762 ^ i5) * 7483) ^ 1548054932;
                        i3 = 1821739199;
                    } else {
                        iM2762 = (C0619.m2761("ᩳ᩸") ^ i5) * (-13);
                        i = ((iM2762 ^ i4) * (-23013)) ^ (-831282089);
                        i3 = -150223979;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case 675667570:
                case 1577485066:
                    c8614 = (C8614) this.f38299;
                    obj3 = this.f38298;
                    if (C13473.f42873 != 0) {
                        iM2762 = C0773.m3169("ܺ۠") ^ i5;
                        i = ((iM2762 ^ i4) * (-18807)) ^ (-1290319266);
                        i3 = -1961100503;
                    } else {
                        iM2762 = (i5 - C0619.m2761("۬ۢ")) * 99;
                        i = ((iM2762 ^ i4) * 16609) ^ (-450873382);
                        i3 = 975194496;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
                case 1055838033:
                case 1960815099:
                    C11650.m29327(activity, C11650.m29287(), (InterfaceC15379) obj2);
                    break;
                case 1175861336:
                case 1841183720:
                    c24533.f79555 = (C14769) obj;
                    break;
                default:
                    runnableC11879 = new RunnableC11879(3, c8614, runnableC16072);
                    if (C2023.f6737) {
                        iM2762 = C0773.m3169("ܺ۠") ^ i5;
                        i = ((iM2762 ^ i4) * (-18807)) ^ (-1290319266);
                        i3 = -1961100503;
                    } else {
                        iM2762 = C0619.m2761("ۛ᩶") ^ i4;
                        i = ((iM2762 ^ i5) * 32543) ^ (-892297363);
                        i3 = -1955322859;
                    }
                    i7 = iM2762 ^ i3;
                    i6 = i;
                    break;
            }
            return;
        }
    }
}
