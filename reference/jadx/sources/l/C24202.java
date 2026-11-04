package l;

import android.content.pm.PackageInfo;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24202 {

    /* JADX INFO: renamed from: ᩳۗۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f78354 = {878, -28628, -28573, -28558, -28567, -28628, -28573, -28558, -28567, -28559, -28559};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20472 f78355;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f78356;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f78357;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044[] f78358;

    /* JADX WARN: Code duplicated, block: B:45:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x01be A[PHI: r14
      0x01be: PHI (r14v2 long) = (r14v1 long), (r14v1 long), (r14v3 long) binds: [B:56:0x01bc, B:52:0x01a2, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x0239  */
    /* JADX WARN: Code duplicated, block: B:75:0x0272 A[PHI: r12 r20
      0x0272: PHI (r12v4 long) = (r12v1 long), (r12v2 long), (r12v1 long), (r12v1 long) binds: [B:48:0x0185, B:23:0x0094, B:9:0x004b, B:74:0x0270] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r20v3 long) = (r20v1 long), (r20v1 long), (r20v1 long), (r20v5 long) binds: [B:48:0x0185, B:23:0x0094, B:9:0x004b, B:74:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m54179() {
        int iM2761;
        int i;
        int i2;
        AbstractC22044[] abstractC22044Arr = null;
        long j = 0;
        int length = 0;
        int i3 = 0;
        long j2 = 0;
        long jMo4285 = 0;
        long j3 = 0;
        int i4 = 222868789;
        int i5 = C3734.f12817;
        int i6 = C2287.f7432;
        int iM3169 = (i6 - C0773.m3169("֡᩷")) * 77;
        int i7 = ((iM3169 ^ i5) * (-25381)) ^ 741994103;
        int i8 = iM3169 ^ 1584248313;
        long jMo4286 = 0;
        long j4 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * 6745) >> 31));
            switch (i4) {
                case -1899389162:
                case -250195527:
                    length = abstractC22044Arr.length;
                    j2 = jMo4286;
                    i3 = 0;
                    iM2761 = (C0773.m3169("ܰ᩹") ^ i6) * (-75);
                    i = ((iM2761 ^ i5) * 12549) ^ 1608879441;
                    i2 = -1340155479;
                    int i9 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i9;
                    break;
                case -1896528581:
                case 851821695:
                    jMo4285 = abstractC22044Arr[i3].mo4285();
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۙۧ") ^ i5) * (-51);
                        i = ((iM2761 ^ i6) * 15401) ^ 665219387;
                        i2 = 1564368783;
                    } else {
                        iM2761 = (C0619.m2761("ۡ۬") + i5) * (-83);
                        i = ((iM2761 ^ i6) * (-4073)) ^ (-2008557483);
                        i2 = 1436596226;
                    }
                    int i10 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i10;
                    break;
                case -1684097950:
                case 484972293:
                    i3++;
                    j2 = j3;
                    iM2761 = (C0773.m3169("ܰ᩹") ^ i6) * (-75);
                    i = ((iM2761 ^ i5) * 12549) ^ 1608879441;
                    i2 = -1340155479;
                    int i11 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i11;
                    break;
                case -1623415998:
                case 1834547867:
                    return j4;
                case -1545592276:
                case 1988231804:
                    C1564.m5509();
                    C2375.m8065();
                    return 0L;
                case -1516522387:
                case 284552548:
                    C2702.m8876();
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i5 - C0619.m2761("᩵֡")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i6) * 1995) ^ (-1492715118);
                        i2 = -280158941;
                    } else {
                        iM2761 = C0619.m2761("ۨۛ") ^ i6;
                        i = ((iM2761 ^ i5) * 31873) ^ 938288219;
                        i2 = -1650850690;
                    }
                    int i12 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i12;
                    break;
                case -1478912946:
                case 1964391104:
                    C1519.m5403();
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ۙۧ") ^ i5) * (-51);
                        i = ((iM2761 ^ i6) * 15401) ^ 665219387;
                        i2 = 1564368783;
                    } else {
                        iM2761 = (i5 - C0619.m2761("᩵֡")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i6) * 1995) ^ (-1492715118);
                        i2 = -280158941;
                    }
                    int i13 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i13;
                    break;
                case -1252113192:
                case -18538474:
                    j3 = j2 + jMo4285;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("ܺܳ") ^ i5;
                        i = ((iM2761 ^ i6) * (-21015)) ^ 216607629;
                        i2 = -928157764;
                    } else {
                        iM2761 = (i6 - C0773.m3169("᩻ۚ")) * 119;
                        i = ((iM2761 ^ i5) * (-24775)) ^ (-585342016);
                        i2 = 317129732;
                    }
                    int i14 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i14;
                    break;
                case -1228071419:
                case -772493408:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("᩸ۛ") ^ i6;
                        i = ((iM2761 ^ i5) * (-27697)) ^ (-832178669);
                        i2 = 667758884;
                    } else {
                        iM2761 = (C0619.m2761("ܿ۠") + i5) * (-13);
                        i = ((iM2761 ^ i6) * 6113) ^ (-616466934);
                        i2 = 803123672;
                    }
                    int i15 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i15;
                    break;
                case -1178215183:
                case -174406770:
                    if (j4 != -1) {
                        iM2761 = C0619.m2761("᩵ۚ") ^ i5;
                        i = ((iM2761 ^ i6) * (-21397)) ^ (-1478100610);
                        i2 = 170874622;
                    } else {
                        iM2761 = (C0773.m3169("ۜܳ") + i6) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i5) * 8345) ^ 1734924851;
                        i2 = -801737532;
                    }
                    int i16 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i16;
                    break;
                case -945919063:
                case 396109943:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۨۛ") ^ i6;
                        i = ((iM2761 ^ i5) * 31873) ^ 938288219;
                        i2 = -1650850690;
                    } else {
                        iM2761 = C0773.m3169("ۖۡ") ^ i6;
                        i = ((iM2761 ^ i5) * 24551) ^ (-1972468094);
                        i2 = 1972209484;
                    }
                    int i17 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i17;
                    break;
                case -918939159:
                case 87975781:
                    if (i3 < length) {
                        iM2761 = C0773.m3169("᩸ۘ") ^ i5;
                        i = ((iM2761 ^ i6) * (-8273)) ^ 1882153588;
                        i2 = 468103394;
                    } else {
                        j = j2;
                        iM2761 = C0773.m3169("ۢۢ") ^ i6;
                        i = ((iM2761 ^ i5) * (-29085)) ^ (-1101013128);
                        i2 = -1337613203;
                    }
                    int i18 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i18;
                    break;
                case -918163475:
                case 1245623383:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ܺܳ") ^ i5;
                        i = ((iM2761 ^ i6) * (-21015)) ^ 216607629;
                        i2 = -928157764;
                    } else {
                        iM2761 = C0619.m2761("ܰᩳ") ^ i5;
                        i = ((iM2761 ^ i6) * 3011) ^ 1540026124;
                        i2 = -526050333;
                    }
                    int i19 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i19;
                    break;
                case -788064573:
                case -659315890:
                    long j5 = this.f78356;
                    if (C2287.f7432 >= 0) {
                        j4 = j5;
                        iM2761 = (C0619.m2761("ۙۧ") ^ i5) * (-51);
                        i = ((iM2761 ^ i6) * 15401) ^ 665219387;
                        i2 = 1564368783;
                        int i110 = i;
                        i8 = iM2761 ^ i2;
                        i7 = i110;
                    } else {
                        int iM31610 = C0773.m3169("֡ۘ") ^ i6;
                        j4 = j5;
                        i8 = iM31610 ^ 1373865214;
                        i7 = ((iM31610 ^ i5) * 14407) ^ (-398263628);
                    }
                    break;
                case -437989125:
                case 1103564502:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("᩸ۛ") ^ i6;
                        i = ((iM2761 ^ i5) * (-27697)) ^ (-832178669);
                        i2 = 667758884;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩺") ^ i5) * 13;
                        i = ((iM2761 ^ i6) * 19391) ^ (-1262207620);
                        i2 = -1266797467;
                    }
                    int i111 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i111;
                    break;
                case 88231161:
                case 1044623640:
                    if (C0950.m3785() != 0) {
                        iM2761 = (C0619.m2761("ۙۧ") ^ i5) * (-51);
                        i = ((iM2761 ^ i6) * 15401) ^ 665219387;
                        i2 = 1564368783;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ܿ᩺")) * (-115);
                        i = ((iM2761 ^ i6) * 20503) ^ 391696519;
                        i2 = 511694961;
                    }
                    int i112 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i112;
                    break;
                case 495797892:
                case 1792951068:
                    C2375.m8065();
                    C1542.m5459();
                    iM2761 = (i5 - C0619.m2761("᩵֡")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM2761 ^ i6) * 1995) ^ (-1492715118);
                    i2 = -280158941;
                    int i113 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i113;
                    break;
                case 632101510:
                case 1895672684:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i5 - C0619.m2761("᩵֡")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i6) * 1995) ^ (-1492715118);
                        i2 = -280158941;
                    } else {
                        iM2761 = (C0619.m2761("ܰ۫") ^ i6) * (-73);
                        i = ((iM2761 ^ i5) * (-26845)) ^ 2021709007;
                        i2 = 863178345;
                    }
                    int i114 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i114;
                    break;
                case 810739236:
                case 1260755340:
                    this.f78356 = j;
                    return j;
                case 1071401766:
                case 1528416164:
                    jMo4286 = this.f78357.mo4285();
                    abstractC22044Arr = this.f78358;
                    if (abstractC22044Arr != null) {
                        iM2761 = (C0773.m3169("᩹ᩴ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i6) * 30467) ^ (-772397976);
                        i2 = -752357283;
                    } else {
                        j = jMo4286;
                        iM2761 = C0773.m3169("ۢۢ") ^ i6;
                        i = ((iM2761 ^ i5) * (-29085)) ^ (-1101013128);
                        i2 = -1337613203;
                    }
                    int i115 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i115;
                    break;
                case 1974807577:
                case 2002527756:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("ܺܳ") ^ i5;
                        i = ((iM2761 ^ i6) * (-21015)) ^ 216607629;
                        i2 = -928157764;
                    } else {
                        iM2761 = C0773.m3169("۟ۗ") ^ i6;
                        i = ((iM2761 ^ i5) * (-15753)) ^ (-910204743);
                        i2 = -1101728567;
                    }
                    int i116 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i116;
                    break;
                default:
                    C17202.m40372();
                    if (C0950.f3488 >= 0) {
                        iM2761 = (i5 - C0619.m2761("᩵֡")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i6) * 1995) ^ (-1492715118);
                        i2 = -280158941;
                    } else {
                        iM2761 = C0773.m3169("᩸ۛ") ^ i6;
                        i = ((iM2761 ^ i5) * (-27697)) ^ (-832178669);
                        i2 = 667758884;
                    }
                    int i117 = i;
                    i8 = iM2761 ^ i2;
                    i7 = i117;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d A[PHI: r6
      0x008d: PHI (r6v7 java.lang.Object[]) = (r6v5 java.lang.Object[]), (r6v2 java.lang.Object[]) binds: [B:25:0x008b, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x011b A[PHI: r3
      0x011b: PHI (r3v6 java.lang.String[]) = (r3v5 java.lang.String[]), (r3v2 java.lang.String[]) binds: [B:42:0x0105, B:36:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4 A[PHI: r0 r1
      0x01c4: PHI (r0v4 android.content.pm.PackageInfo) = 
      (r0v2 android.content.pm.PackageInfo)
      (r0v3 android.content.pm.PackageInfo)
      (r0v2 android.content.pm.PackageInfo)
      (r0v2 android.content.pm.PackageInfo)
      (r0v2 android.content.pm.PackageInfo)
      (r0v2 android.content.pm.PackageInfo)
      (r0v2 android.content.pm.PackageInfo)
     binds: [B:62:0x01c2, B:58:0x01a4, B:54:0x0189, B:46:0x013e, B:22:0x007d, B:16:0x005f, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r1v5 java.lang.String) = 
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v4 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
     binds: [B:62:0x01c2, B:58:0x01a4, B:54:0x0189, B:46:0x013e, B:22:0x007d, B:16:0x005f, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f2  */
    public C24202(C20472 c20472) {
        int iM3169;
        int i;
        PackageInfo packageInfo = null;
        String str = null;
        int i2 = 0;
        String[] strArr = null;
        InterfaceC20670 interfaceC20670Stream = null;
        Object[] array = null;
        int i3 = -1293408221;
        int i4 = C2419.f7754;
        int i5 = AbstractC0116.f1064;
        int iM2761 = (C0619.m2761("ܽܿ") ^ i4) * 63;
        int i6 = ((iM2761 ^ i5) * 11017) ^ (-1661535205);
        int i7 = -209307297;
        while (true) {
            int i8 = iM2761 ^ i7;
            C9714 c9714 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 11313) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1971848591:
                    case 1762976149:
                        this.f78358 = (AbstractC22044[]) array;
                        return;
                    case -1854935721:
                    case 1341439532:
                        if (strArr.length == 0) {
                            iM3169 = (i5 - C0773.m3169("֨ܿ")) * (-107);
                            i6 = ((iM3169 ^ i4) * (-10359)) ^ (-89555934);
                            i = 1702041830;
                        } else {
                            iM3169 = (C0773.m3169("᩺ۨ") + i5) * (-3);
                            i6 = ((iM3169 ^ i4) * 11339) ^ (-227454721);
                            i = 176717888;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1676132394:
                    case 573266799:
                        this.f78358 = null;
                        return;
                    case -1543389386:
                    case -1333943989:
                        i2 = 0;
                        if (AbstractC0116.f1064 > 0) {
                            iM3169 = C0619.m2761("᩺֫") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-28613)) ^ 550468741;
                            i = 256624283;
                            i8 = iM3169 ^ i;
                        }
                        break;
                    case -994644214:
                    case 1339139970:
                        C3099.m10095();
                        C1080.m4050();
                        iM3169 = C0773.m3169("ۖۚ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 6683) ^ (-2123422049);
                        i = -1567912825;
                        i8 = iM3169 ^ i;
                        break;
                    case -890621510:
                    case 264963690:
                        str = packageInfo.applicationInfo.sourceDir;
                        if (C3690.f12684 <= 0) {
                            iM3169 = C0773.m3169("ۖۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6683) ^ (-2123422049);
                            i = -1567912825;
                        } else {
                            iM3169 = C0773.m3169("۠ۡ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 4481) ^ (-582894390);
                            i = 745972413;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -827616636:
                    case 43360728:
                        if (C0773.m3161() != 0) {
                            iM3169 = C0773.m3169("ۖۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6683) ^ (-2123422049);
                            i = -1567912825;
                        } else {
                            iM3169 = (C0619.m2761("ۖ᩻") ^ i5) * (-125);
                            i6 = ((iM3169 ^ i4) * (-16481)) ^ 856000919;
                            i = 971415553;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -769056882:
                    case 190185814:
                        this.f78357 = C1321.m4846(str, new String[i2]);
                        if (C1343.m4943()) {
                            iM3169 = C0773.m3169("ۨܿ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 32189) ^ 1646833938;
                            i = 1380480500;
                        } else {
                            iM3169 = C0773.m3169("ۖۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6683) ^ (-2123422049);
                            i = -1567912825;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -633378519:
                    case -450881114:
                        strArr = c20472.f65594.applicationInfo.splitSourceDirs;
                        if (strArr != null) {
                            iM3169 = C0773.m3169("ۗ᩺") ^ i4;
                            i6 = ((iM3169 ^ i5) * 19183) ^ 1932483456;
                            i = 421053022;
                        } else {
                            iM3169 = (i5 - C0773.m3169("֨ܿ")) * (-107);
                            i6 = ((iM3169 ^ i4) * (-10359)) ^ (-89555934);
                            i = 1702041830;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -243416791:
                    case 1955456730:
                        if (C1321.f4751 < 0) {
                            iM3169 = (C0619.m2761("ۖ᩻") ^ i5) * (-125);
                            i6 = ((iM3169 ^ i4) * (-16481)) ^ 856000919;
                            i = 971415553;
                        } else {
                            iM3169 = (i4 - C0619.m2761("۠ᩴ")) * (-93);
                            i6 = ((iM3169 ^ i5) * (-23611)) ^ 9614922;
                            i = 1849694330;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -116272254:
                    case 1533655141:
                        interfaceC20670Stream = C13847.stream(strArr);
                        if (C3448.f11240 < 0) {
                            c9714 = new C9714(2);
                            if (!C17202.f56030) {
                            }
                            iM3169 = C0619.m2761("ܿᩳ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 29489) ^ 2110801301;
                            i = -1676945374;
                            i8 = iM3169 ^ i;
                            break;
                        }
                        break;
                    case 7273240:
                    case 1725192839:
                        this.f78356 = -1L;
                        if (C2702.f8586 <= 0) {
                            iM3169 = (C0619.m2761("ۖ᩻") ^ i5) * (-125);
                            i6 = ((iM3169 ^ i4) * (-16481)) ^ 856000919;
                            i = 971415553;
                        } else {
                            iM3169 = C0773.m3169("ۗۚ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 3615) ^ (-1243809524);
                            i = 927950373;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 220185771:
                    case 343728828:
                        InterfaceC20670 map = interfaceC20670Stream.map(c9714);
                        if (C23916.f77426 <= 0) {
                            iM3169 = C0773.m3169("ۖۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6683) ^ (-2123422049);
                            i = -1567912825;
                        } else {
                            array = map.toArray(new C18113(1));
                            if (C0619.f2439) {
                                iM3169 = (C0619.m2761("ۙ۫") + i4) * (-123);
                                i6 = ((iM3169 ^ i5) * (-16085)) ^ (-710217405);
                                i = 444684150;
                            } else {
                                iM3169 = C0773.m3169("ܺۙ") ^ i5;
                                i6 = ((iM3169 ^ i4) * 15323) ^ 1734534071;
                                i = -1905663726;
                            }
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 319276174:
                    case 2143634264:
                        packageInfo = c20472.f65594;
                        if (C2966.f9654 >= 0) {
                            iM3169 = C0773.m3169("ۖۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6683) ^ (-2123422049);
                            i = -1567912825;
                        } else {
                            iM3169 = (C0619.m2761("ܶ᩸") + i5) * (-91);
                            i6 = ((iM3169 ^ i4) * (-19)) ^ 890025116;
                            i = 1112071884;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 721197001:
                    case 990666448:
                        C0773.m3161();
                        throw new RuntimeException();
                    case 860963194:
                    case 1308565949:
                        this.f78355 = c20472;
                        if (C1542.m5459() >= 0) {
                            iM3169 = C0773.m3169("ۖۚ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 6683) ^ (-2123422049);
                            i = -1567912825;
                        } else {
                            iM3169 = C0773.m3169("۠ۛ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-24951)) ^ (-181267101);
                            i = -139306711;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    default:
                        C1826.m6301();
                        if (C2834.f9334 <= 0) {
                            iM3169 = (C0619.m2761("ۖ᩻") ^ i5) * (-125);
                            i6 = ((iM3169 ^ i4) * (-16481)) ^ 856000919;
                            i = 971415553;
                        } else {
                            iM3169 = (C0619.m2761("ۙ۫") + i4) * (-123);
                            i6 = ((iM3169 ^ i5) * (-16085)) ^ (-710217405);
                            i = 444684150;
                        }
                        i8 = iM3169 ^ i;
                        break;
                }
            }
            iM2761 = C0773.m3169("ܶۢ") ^ i5;
            i6 = ((iM2761 ^ i4) * 24645) ^ 1544541838;
            i7 = 1673687286;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b0 A[PHI: r9 r11 r12
      0x00b0: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]) binds: [B:23:0x00ae, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:23:0x00ae, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:23:0x00ae, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01dc A[PHI: r2
      0x01dc: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:49:0x01da, B:7:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0269 A[PHI: r4 r8 r14
      0x0269: PHI (r4v4 short[]) = (r4v2 short[]), (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:60:0x0267, B:41:0x0194, B:13:0x007e, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:60:0x0267, B:41:0x0194, B:13:0x007e, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r14v4 short) = (r14v3 short), (r14v2 short), (r14v2 short), (r14v2 short) binds: [B:60:0x0267, B:41:0x0194, B:13:0x007e, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02df A[PHI: r10
      0x02df: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:72:0x02dd, B:15:0x0082, B:13:0x007e, B:7:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x032f A[PHI: r3 r17 r18 r19 r20 r25
      0x032f: PHI (r3v3 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v4 java.lang.String)
     binds: [B:80:0x032d, B:76:0x030f, B:68:0x02c0, B:64:0x029d, B:45:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x032f: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:80:0x032d, B:76:0x030f, B:68:0x02c0, B:64:0x029d, B:45:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x032f: PHI (r18v4 char) = (r18v2 char), (r18v3 char), (r18v2 char), (r18v2 char), (r18v2 char) binds: [B:80:0x032d, B:76:0x030f, B:68:0x02c0, B:64:0x029d, B:45:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x032f: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:80:0x032d, B:76:0x030f, B:68:0x02c0, B:64:0x029d, B:45:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x032f: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:80:0x032d, B:76:0x030f, B:68:0x02c0, B:64:0x029d, B:45:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x032f: PHI (r25v5 int) = (r25v3 int), (r25v3 int), (r25v3 int), (r25v4 int), (r25v3 int) binds: [B:80:0x032d, B:76:0x030f, B:68:0x02c0, B:64:0x029d, B:45:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m54177() {
        int iM2761;
        int i;
        int i2;
        String strM4946;
        int i3 = C4282.f15546;
        int i4 = C2287.f7432;
        int iM2762 = (i3 - C0619.m2761("۟᩹")) * (-41);
        int i5 = ((iM2762 ^ i4) * (-15517)) ^ 118332268;
        String strM5471 = null;
        short[] sArr = null;
        int i6 = iM2762 ^ 1110682039;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        char c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -2126125398;
        int i13 = 0;
        String strM5463 = null;
        short[] sArr2 = null;
        String strM21237 = null;
        String str = null;
        String strM4861 = null;
        AbstractC22044[] abstractC22044Arr = null;
        short[] sArr3 = null;
        int i14 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-9877)) >> 31));
            switch (i12) {
                case -2123325120:
                case 633171280:
                    strM21237 = ViewOnClickListenerC7793.m21237(this.f78355);
                    if (C0862.m3503()) {
                        iM2761 = (C0619.m2761("᩻ᩴ") + i3) * 51;
                        i = ((iM2761 ^ i4) * 3141) ^ (-1551289560);
                        i2 = 1192718926;
                    } else {
                        iM2761 = (C0773.m3169("᩹ܺ") + i3) * 73;
                        i = ((iM2761 ^ i4) * 7273) ^ (-1922508183);
                        i2 = -1551952696;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1977386555:
                case 283624465:
                    int i15 = i10 + i11;
                    i13 = i15 + i15;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۙ᩵") ^ i4) * (-99);
                        i = ((iM2761 ^ i3) * 26541) ^ 702541678;
                        i2 = 451423279;
                    } else {
                        iM2761 = C0773.m3169("ᩳۘ") ^ i3;
                        i = ((iM2761 ^ i4) * 32629) ^ 1780740204;
                        i2 = 1516456663;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1810092804:
                case -645400924:
                    if (abstractC22044Arr == null) {
                        strM4861 = strM5471;
                        iM2761 = C0619.m2761("ۤۖ") ^ i4;
                        i = ((iM2761 ^ i3) * 2415) ^ 453721342;
                        i2 = -63994329;
                    } else {
                        iM2761 = (C0773.m3169("֨᩶") ^ i4) * (-109);
                        i = ((iM2761 ^ i3) * (-23827)) ^ (-740504440);
                        i2 = 819034371;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1722235377:
                case -1037252812:
                    strM4946 = C1343.m4946(strM21237, C0862.m3500(sArr, i8, i9, i14));
                    str = strM4946;
                    iM2761 = (C0773.m3169("֫۫") + i3) * 61;
                    i = ((iM2761 ^ i4) * 27665) ^ 1390067026;
                    i2 = 1810412160;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1636611471:
                case 1469712468:
                    strM5471 = C1542.m5471(sArr3, i7, 4, i14);
                    boolean zM10035 = C3077.m10035(strM5463, strM5471);
                    AbstractC22044[] abstractC22044Arr2 = this.f78358;
                    if (zM10035) {
                        int iM3169 = (i4 - C0773.m3169("֡᩵")) * 95;
                        i5 = ((iM3169 ^ i3) * (-23551)) ^ (-995602043);
                        i6 = iM3169 ^ 583802630;
                    } else {
                        int iM2763 = (C0619.m2761("۬ܺ") + i3) * 95;
                        i6 = iM2763 ^ 1083297433;
                        i5 = ((iM2763 ^ i4) * (-16573)) ^ 1839239620;
                    }
                    abstractC22044Arr = abstractC22044Arr2;
                    break;
                case -1599689792:
                case -790461202:
                    C2702.m8876();
                    if (C2878.m9491() > 0) {
                        iM2761 = (i3 - C0619.m2761("ۜܺ")) * 11;
                        i = ((iM2761 ^ i4) * (-14005)) ^ 306106968;
                        i2 = -746567221;
                    } else {
                        iM2761 = C0773.m3169("ۜۛ") ^ i4;
                        i = ((iM2761 ^ i3) * (-16501)) ^ (-358240761);
                        i2 = -297148895;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1458015570:
                case -677000611:
                    sArr = f78354;
                    i8 = 10;
                    i9 = 1;
                    if (C3690.m11987()) {
                        iM2761 = C0773.m3169("ۜۛ") ^ i4;
                        i = ((iM2761 ^ i3) * (-16501)) ^ (-358240761);
                        i2 = -297148895;
                    } else {
                        iM2761 = C0619.m2761("ۛܺ") ^ i3;
                        i = ((iM2761 ^ i4) * 29939) ^ 36685186;
                        i2 = -426794082;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1430975027:
                case 2017704342:
                    if (abstractC22044Arr == null) {
                        str = strM21237;
                        iM2761 = (C0773.m3169("֫۫") + i3) * 61;
                        i = ((iM2761 ^ i4) * 27665) ^ 1390067026;
                        i2 = 1810412160;
                    } else {
                        iM2761 = C0773.m3169("ܳ᩸") ^ i3;
                        i = ((iM2761 ^ i4) * 123) ^ 1549375504;
                        i2 = -217674515;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1425668747:
                case 1327156214:
                    C2023.m6964();
                    C2023.m6964();
                    return null;
                case -1335756637:
                case 173059492:
                    strM5463 = C1542.m5463(strM21237);
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۙ᩵") ^ i4) * (-99);
                        i = ((iM2761 ^ i3) * 26541) ^ 702541678;
                        i2 = 451423279;
                    } else {
                        iM2761 = (i3 - C0619.m2761("֨᩷")) * 77;
                        i = ((iM2761 ^ i4) * 6225) ^ (-410448910);
                        i2 = 655987515;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1226117553:
                case 1919463063:
                    i14 = 36866;
                    iM2761 = C0773.m3169("ܿܰ") ^ i4;
                    i = ((iM2761 ^ i3) * (-22047)) ^ (-140590275);
                    i2 = 23582872;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1162871871:
                case 1708744654:
                    i14 = 32728;
                    iM2761 = C0773.m3169("ܿܰ") ^ i4;
                    i = ((iM2761 ^ i3) * (-22047)) ^ (-140590275);
                    i2 = 23582872;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1059354402:
                case 1189009734:
                    strM4861 = C1321.m4861(f78354, 5, 5, i14);
                    iM2761 = C0619.m2761("ۤۖ") ^ i4;
                    i = ((iM2761 ^ i3) * 2415) ^ 453721342;
                    i2 = -63994329;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1031822396:
                case 1812416046:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0773.m3169("ۘۤ") ^ i4;
                        i = ((iM2761 ^ i3) * (-32755)) ^ 70548563;
                        i2 = -821195021;
                    } else {
                        iM2761 = (C0773.m3169("᩹ܺ") + i3) * 73;
                        i = ((iM2761 ^ i4) * 7273) ^ (-1922508183);
                        i2 = -1551952696;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -970728208:
                case 572151093:
                    sArr3 = f78354;
                    i7 = 1;
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۜܺ")) * 11;
                        i = ((iM2761 ^ i4) * (-14005)) ^ 306106968;
                        i2 = -746567221;
                    } else {
                        iM2761 = C0773.m3169("ۚܿ") ^ i4;
                        i = ((iM2761 ^ i3) * 14827) ^ (-1273226506);
                        i2 = 509874141;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -850980014:
                case 1098877590:
                    C1826.m6301();
                    C0619.m2763();
                    iM2761 = C0773.m3169("ۘۤ") ^ i4;
                    i = ((iM2761 ^ i3) * (-32755)) ^ 70548563;
                    i2 = -821195021;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -791101791:
                case 491493211:
                    return C2310.m7806(ViewOnClickListenerC7793.m21212(), str);
                case -636215014:
                case 1675585946:
                    sArr2 = f78354;
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ۙ᩵") ^ i4) * (-99);
                        i = ((iM2761 ^ i3) * 26541) ^ 702541678;
                        i2 = 451423279;
                    } else {
                        iM2761 = (C0619.m2761("ۨᩴ") ^ i3) * 15;
                        i = ((iM2761 ^ i4) * (-13737)) ^ 1290230607;
                        i2 = 1758097002;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -244191360:
                case 1297860509:
                    c = 0;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("ۙ᩵") ^ i4) * (-99);
                        i = ((iM2761 ^ i3) * 26541) ^ 702541678;
                        i2 = 451423279;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۘۨ")) * 99;
                        i = ((iM2761 ^ i3) * 24923) ^ 1993813902;
                        i2 = -665434270;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -28580463:
                case 1851693911:
                    if (C2966.m9664()) {
                        iM2761 = (i3 - C0619.m2761("ۜܺ")) * 11;
                        i = ((iM2761 ^ i4) * (-14005)) ^ 306106968;
                        i2 = -746567221;
                    } else {
                        iM2761 = C0773.m3169("ۘۤ") ^ i4;
                        i = ((iM2761 ^ i3) * (-32755)) ^ 70548563;
                        i2 = -821195021;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 174087750:
                case 2126761735:
                    s2 = 9230;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۜܺ")) * 11;
                        i = ((iM2761 ^ i4) * (-14005)) ^ 306106968;
                        i2 = -746567221;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩹") ^ i4;
                        i = ((iM2761 ^ i3) * (-30273)) ^ (-201553348);
                        i2 = -611677044;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 235425560:
                case 935423455:
                    i10 = s * s;
                    i11 = 85192900;
                    if (C2375.m8065() <= 0) {
                        iM2761 = (C0619.m2761("ۙ᩵") ^ i4) * (-99);
                        i = ((iM2761 ^ i3) * 26541) ^ 702541678;
                        i2 = 451423279;
                    } else {
                        iM2761 = C0773.m3169("ۧۙ") ^ i4;
                        i = ((iM2761 ^ i3) * (-14537)) ^ (-1935993706);
                        i2 = 171195166;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1352343849:
                case 1838148813:
                    s = sArr2[c];
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("ۘۤ") ^ i4;
                        i = ((iM2761 ^ i3) * (-32755)) ^ 70548563;
                        i2 = -821195021;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺ۢ")) * (-103);
                        i = ((iM2761 ^ i4) * (-4919)) ^ (-77538997);
                        i2 = 1298354237;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1537080658:
                case 2124716827:
                    int i16 = s + s2;
                    if (i13 - (i16 * i16) >= 0) {
                        iM2761 = (i4 - C0773.m3169("۫ᩳ")) * (-21);
                        i = ((iM2761 ^ i3) * (-9865)) ^ 1151340138;
                        i2 = -926342652;
                    } else {
                        iM2761 = C0773.m3169("᩸ۛ") ^ i3;
                        i = ((iM2761 ^ i4) * 16851) ^ (-1613516382);
                        i2 = -1643151433;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM4946 = C1343.m4946(strM21237, strM4861);
                    str = strM4946;
                    iM2761 = (C0773.m3169("֫۫") + i3) * 61;
                    i = ((iM2761 ^ i4) * 27665) ^ 1390067026;
                    i2 = 1810412160;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:114:0x041d  */
    /* JADX WARN: Code duplicated, block: B:118:0x044f  */
    /* JADX WARN: Code duplicated, block: B:122:0x047f  */
    /* JADX WARN: Code duplicated, block: B:126:0x04af  */
    /* JADX WARN: Code duplicated, block: B:134:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x02d9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54178(AbstractC22044 abstractC22044, InterfaceC3573 interfaceC3573) throws Throwable {
        int iM3169;
        int i;
        int i2;
        int i3 = C3099.f10023;
        int i4 = C2419.f7754;
        int iM2761 = (C0619.m2761("ܿܰ") ^ i4) * 29;
        int i5 = ((iM2761 ^ i3) * 16431) ^ 1769163398;
        Throwable th = null;
        Object obj = null;
        AbstractC22044 abstractC22045 = null;
        int i6 = iM2761 ^ 39070991;
        C25179 c25179 = null;
        int length = 0;
        int i7 = 0;
        boolean zM8058 = false;
        int i8 = -164328059;
        AbstractC22044[] abstractC22044Arr = null;
        Throwable th2 = null;
        AbstractC22044 abstractC22046 = null;
        int i9 = 0;
        while (true) {
            i8 = i6 ^ (i5 & (((i8 ^ i3) * 14769) >> 31));
            switch (i8) {
                case -2057460261:
                case 1693988951:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0773.m3169("ۛᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-5147)) ^ 51450160;
                        i2 = 1602131822;
                    } else {
                        iM3169 = C0619.m2761("ۨܶ") ^ i4;
                        i = ((iM3169 ^ i3) * 9505) ^ 830605814;
                        i2 = 999471884;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2000296397:
                case -1791018315:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("֡ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29795)) ^ (-1033993395);
                        i2 = 477486041;
                    } else {
                        iM3169 = (C0619.m2761("ᩳܰ") + i4) * 45;
                        i = ((iM3169 ^ i3) * 25095) ^ (-764203063);
                        i2 = 837199809;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1984554694:
                case -741845828:
                    abstractC22044.mo4287();
                    return;
                case -1950351060:
                case -1216752607:
                    i7++;
                    iM3169 = (i3 - C0619.m2761("᩸ᩴ")) * 79;
                    i = ((iM3169 ^ i4) * (-10205)) ^ (-1631814518);
                    i2 = 1570549547;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1944427821:
                case -123496000:
                    try {
                        C3779.m12255(c25179, C1826.m6311(abstractC22045));
                        abstractC22045.m49842(c25179.m56119(), interfaceC3573);
                        iM3169 = (C0619.m2761("᩶ܿ") ^ i4) * (-25);
                        i = ((iM3169 ^ i3) * 3353) ^ (-2060408842);
                        i2 = 468337044;
                    } catch (Throwable th3) {
                        th2 = th3;
                        iM3169 = (C0619.m2761("ۢ᩺") ^ i3) * (-15);
                        i = ((iM3169 ^ i4) * 13679) ^ 530680870;
                        i2 = 1525950995;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1922962455:
                case -1811263778:
                    abstractC22046.m49847(abstractC22044, (C24523) null, interfaceC3573);
                    if (C2375.m8058(interfaceC3573)) {
                        iM3169 = (i4 - C0619.m2761("֫ܽ")) * 101;
                        i = ((iM3169 ^ i3) * (-21367)) ^ (-1233864728);
                        i2 = 1598108866;
                    } else {
                        iM3169 = C0619.m2761("᩸ۨ") ^ i3;
                        i = ((iM3169 ^ i4) * 18757) ^ 200479987;
                        i2 = -677489145;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1915026280:
                case -1141548269:
                    if (C2375.m8058(interfaceC3573)) {
                        iM3169 = C0773.m3169("ܽ֨") ^ i4;
                        i = ((iM3169 ^ i3) * 20509) ^ 296292664;
                        i2 = 1355401902;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۗۡ")) * (-73);
                        i = ((iM3169 ^ i4) * (-20845)) ^ (-776454864);
                        i2 = 2126803707;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1882220559:
                case 1952317038:
                    if (C21576.m49078()) {
                        iM3169 = (C0773.m3169("ۢۨ") + i4) * 77;
                        i = ((iM3169 ^ i3) * (-21769)) ^ (-188480701);
                        i2 = -991079409;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۗۡ")) * (-73);
                        i = ((iM3169 ^ i4) * (-20845)) ^ (-776454864);
                        i2 = 2126803707;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1872124243:
                case 1474808012:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("֡ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29795)) ^ (-1033993395);
                        i2 = 477486041;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩶᩸")) * 79;
                        i = ((iM3169 ^ i3) * 9143) ^ (-1900518138);
                        i2 = -2140811396;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1706641942:
                case -717808751:
                    abstractC22045 = abstractC22044Arr[i7];
                    zM8058 = C2375.m8058(interfaceC3573);
                    iM3169 = C0619.m2761("۟᩻") ^ i4;
                    i = ((iM3169 ^ i3) * (-2487)) ^ 1385261870;
                    i2 = -1723049903;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1685412668:
                case 1114410128:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۛᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-5147)) ^ 51450160;
                        i2 = 1602131822;
                    } else {
                        iM3169 = C0619.m2761("ܿ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 22439) ^ 48224024;
                        i2 = 525478939;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1677536797:
                case 487145661:
                    if (i7 < length) {
                        iM3169 = C0619.m2761("ۚ᩹") ^ i3;
                        i = ((iM3169 ^ i4) * (-7547)) ^ (-68619548);
                        i2 = -1038835277;
                    } else {
                        iM3169 = C0773.m3169("֨ᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3475)) ^ (-1890345376);
                        i2 = -6790218;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1605646884:
                case -658576081:
                    abstractC22044.mo4287();
                    iM3169 = (i3 - C0773.m3169("ۗۡ")) * (-73);
                    i = ((iM3169 ^ i4) * (-20845)) ^ (-776454864);
                    i2 = 2126803707;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1546178951:
                case 289109671:
                    if (zM8058) {
                        iM3169 = C0773.m3169("֨ᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3475)) ^ (-1890345376);
                        i2 = -6790218;
                    } else {
                        iM3169 = C0619.m2761("۟᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 29207) ^ (-121966686);
                        i2 = -1594782659;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1545503106:
                case -1199874759:
                    if (C3099.m10095()) {
                        iM3169 = (C0619.m2761("ۜᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 32171) ^ 346003908;
                        i2 = 1234917819;
                    } else {
                        iM3169 = C0773.m3169("۬ܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 7771) ^ 1138994090;
                        i2 = 2102007244;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1530167773:
                case 791891614:
                    throw th;
                case -1437917919:
                case 1999336768:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0619.m2761("֡ۨ") ^ i3) * (-97);
                        i = ((iM3169 ^ i4) * 21301) ^ 424430948;
                        i2 = -1779498213;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩹") ^ i4;
                        i = ((iM3169 ^ i3) * (-17167)) ^ 1097544139;
                        i2 = 1728365361;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1370452353:
                case 1057300549:
                    return;
                case -1276794936:
                case -850553156:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("֡ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29795)) ^ (-1033993395);
                        i2 = 477486041;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 21429) ^ (-981664050);
                        i2 = 640280517;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -952548264:
                case -864498022:
                    C2966.m9664();
                    if (C0862.m3503()) {
                        iM3169 = (C0619.m2761("֡ۨ") ^ i3) * (-97);
                        i = ((iM3169 ^ i4) * 21301) ^ 424430948;
                        i2 = -1779498213;
                    } else {
                        iM3169 = C0773.m3169("֡ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29795)) ^ (-1033993395);
                        i2 = 477486041;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -928373857:
                case -552887066:
                    abstractC22044.mo2942(C2834.m9342());
                    return;
                case -880692738:
                case 402873608:
                    c25179.m56121(i9);
                    C1783.m6245(c25179, C3998.m12926(abstractC22046));
                    abstractC22046.m49842(c25179.m56119(), interfaceC3573);
                    length = abstractC22044Arr.length;
                    iM3169 = (i4 - C0773.m3169("ܰ֨")) * 55;
                    i = ((iM3169 ^ i3) * 29243) ^ 1387062862;
                    i2 = 2097980343;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -750777567:
                case 2122049351:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۚ᩷") ^ i3) * 7;
                        i = ((iM3169 ^ i4) * (-1243)) ^ 698318069;
                        i2 = 16686097;
                    } else {
                        iM3169 = C0619.m2761("ۢۡ") ^ i3;
                        i = ((iM3169 ^ i4) * 1235) ^ 1027635278;
                        i2 = -72132409;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -668873317:
                case -114803113:
                    C3734.m12152();
                    if (C4238.m13540() <= 0) {
                        iM3169 = C0773.m3169("۫ᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * 10633) ^ 730319052;
                        i2 = -1899658155;
                    } else {
                        iM3169 = (C0773.m3169("ܳ֨") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM3169 ^ i4) * (-12789)) ^ (-1096686193);
                        i2 = 1732004219;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -665134288:
                case -180549246:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("֡ۨ") ^ i3) * (-97);
                        i = ((iM3169 ^ i4) * 21301) ^ 424430948;
                        i2 = -1779498213;
                    } else {
                        iM3169 = C0619.m2761("ܺܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3473)) ^ 670756310;
                        i2 = 2044413797;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -661070984:
                case 2046487060:
                    if (C3492.m11488()) {
                        iM3169 = C0773.m3169("֡ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29795)) ^ (-1033993395);
                        i2 = 477486041;
                    } else {
                        iM3169 = (C0619.m2761("ۜᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 32171) ^ 346003908;
                        i2 = 1234917819;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -650738673:
                case 1191193994:
                    abstractC22046 = this.f78357;
                    abstractC22044Arr = this.f78358;
                    if (abstractC22044Arr == null) {
                        iM3169 = (C0773.m3169("ۡۧ") + i3) * 19;
                        i = ((iM3169 ^ i4) * 29793) ^ 1545331129;
                        i2 = 439525402;
                    } else {
                        iM3169 = C0773.m3169("ܶ֡") ^ i4;
                        i = ((iM3169 ^ i3) * (-8499)) ^ 546344968;
                        i2 = 1866233164;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -414494227:
                case 1628075742:
                    try {
                        c25179 = new C25179(abstractC22044);
                        iM3169 = C0773.m3169("ۗ۫") ^ i3;
                        i = ((iM3169 ^ i4) * 20211) ^ 379812532;
                        i2 = 1611520695;
                    } catch (Throwable th4) {
                        th = th4;
                        c25179 = null;
                        iM3169 = C0619.m2761("ܳ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-21411)) ^ 1271536090;
                        i2 = -99164576;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -277612348:
                case 1110464588:
                    if (C2702.m8876()) {
                        iM3169 = (C0773.m3169("᩺ᩳ") ^ i3) * (-91);
                        i = ((iM3169 ^ i4) * 18915) ^ 353228831;
                        i2 = -32744116;
                    } else {
                        iM3169 = (C0619.m2761("֡ۨ") ^ i3) * (-97);
                        i = ((iM3169 ^ i4) * 21301) ^ 424430948;
                        i2 = -1779498213;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -271973484:
                case 886560992:
                    abstractC22044.mo4287();
                    iM3169 = (i3 - C0773.m3169("ۖۤ")) * (-89);
                    i = ((iM3169 ^ i4) * 27491) ^ 307953915;
                    i2 = -273053909;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -240361041:
                case -133640051:
                    if (C3033.m9845() <= 0) {
                        iM3169 = (C0619.m2761("۫۬") ^ i3) * (-85);
                        i = ((iM3169 ^ i4) * 21517) ^ (-689782883);
                        i2 = 965212920;
                    } else {
                        iM3169 = C0619.m2761("᩹ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 14921) ^ 830132766;
                        i2 = 263588289;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -239301063:
                case 488683684:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("۫ᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * 10633) ^ 730319052;
                        i2 = -1899658155;
                    } else {
                        iM3169 = (C0773.m3169("ۚ᩷") ^ i3) * 7;
                        i = ((iM3169 ^ i4) * (-1243)) ^ 698318069;
                        i2 = 16686097;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -91647830:
                case 1143444542:
                    C1826.m6301();
                    AbstractC0116.m1243();
                    return;
                case -26415681:
                case 1415539402:
                    RunnableC3646.m11799(th2, obj);
                    iM3169 = C0773.m3169("ۘ۫") ^ i3;
                    i = ((iM3169 ^ i4) * (-7763)) ^ 1601360481;
                    i2 = 1031451404;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 7477772:
                case 1919018562:
                    if (C2375.m8058(interfaceC3573)) {
                        iM3169 = (C0619.m2761("֫᩺") + i4) * 17;
                        i = ((iM3169 ^ i3) * 20731) ^ (-831122815);
                        i2 = 618045353;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۖۤ")) * (-89);
                        i = ((iM3169 ^ i4) * 27491) ^ 307953915;
                        i2 = -273053909;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 89642282:
                case 1790972524:
                    C2702.m8876();
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("֡ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-29795)) ^ (-1033993395);
                        i2 = 477486041;
                    } else {
                        iM3169 = C0773.m3169("۫ᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * 10633) ^ 730319052;
                        i2 = -1899658155;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 112375094:
                case 1557444471:
                    C0269.m1775();
                    C0487.m2356();
                    iM3169 = C0773.m3169("֡ۢ") ^ i3;
                    i = ((iM3169 ^ i4) * (-29795)) ^ (-1033993395);
                    i2 = 477486041;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 120357649:
                case 326555912:
                    C3998.m12920();
                    if (AbstractC3624.m11755() == 0) {
                        iM3169 = (C0619.m2761("۫۬") ^ i3) * (-85);
                        i = ((iM3169 ^ i4) * 21517) ^ (-689782883);
                        i2 = 965212920;
                    } else {
                        iM3169 = C0773.m3169("᩹ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 25759) ^ 1055387430;
                        i2 = 1901904903;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 690942731:
                case 1697157785:
                    throw th2;
                case 746970473:
                case 2024770415:
                    i7 = 0;
                    iM3169 = (i3 - C0619.m2761("᩸ᩴ")) * 79;
                    i = ((iM3169 ^ i4) * (-10205)) ^ (-1631814518);
                    i2 = 1570549547;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 808685081:
                case 945814213:
                    i9 = 3;
                    iM3169 = C0619.m2761("᩹ۗ") ^ i4;
                    i = ((iM3169 ^ i3) * (-9313)) ^ 436936760;
                    i2 = -1871206404;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1139444464:
                case 1603475419:
                    C1826.m6301();
                    if (C4282.f15546 > 0) {
                        iM3169 = (C0619.m2761("ᩳܰ") + i4) * 45;
                        i = ((iM3169 ^ i3) * 25095) ^ (-764203063);
                        i2 = 837199809;
                    } else {
                        iM3169 = (C0619.m2761("۫۬") ^ i3) * (-85);
                        i = ((iM3169 ^ i4) * 21517) ^ (-689782883);
                        i2 = 965212920;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1952263760:
                case 2012179440:
                    try {
                        C0619.m2765(c25179);
                        iM3169 = C0773.m3169("ۗ᩹") ^ i3;
                        i = ((iM3169 ^ i4) * 25999) ^ 72159193;
                        i2 = -475574505;
                    } catch (Throwable th5) {
                        th = th5;
                        iM3169 = C0619.m2761("ܳ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * (-21411)) ^ 1271536090;
                        i2 = -99164576;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    try {
                        C0773.m3160(c25179);
                        iM3169 = C0773.m3169("ۘ۫") ^ i3;
                        i = ((iM3169 ^ i4) * (-7763)) ^ 1601360481;
                        i2 = 1031451404;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } catch (Throwable th6) {
                        int iM31610 = (C0773.m3169("۠ۨ") + i4) * (-13);
                        i6 = iM31610 ^ (-273477079);
                        obj = th6;
                        i5 = ((iM31610 ^ i3) * (-15315)) ^ 1252631717;
                    }
                    break;
            }
        }
    }
}
