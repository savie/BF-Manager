package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W8UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10312 {

    /* JADX INFO: renamed from: ܳۙۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f32912 = {7576, -1873, -1858, -1864, -1862, -1821, -1864, -1862, -1877, -1806, -1879, -1858, -1869, -1878, -1862, -1876, -1823, -1801, -1807, -1807, -1807, -1802, -1871, -1858, -1870, -1862, -1864, -1862, -1877, -1908, -1877, -1875, -1866, -1871, -1864, -1801, -1807, -1807, -1807, -1802, -1873, -1858, -1877, -1865, -1871, -1862, -1877, -1864, -1862, -1877, -1899, -1908, -1904, -1903, -1890, -1875, -1875, -1858, -1882, -1801, -1807, -1807, -1807, -1802, -1865, -1866, -1876, -1877, -1872, -1875, -1882, -1898, -1871, -1861, -1862, -1881, 7697, -29338, -29343, -29338, -29350, -29343, -29316, -29318, -29313, -29313, -29344, -29315, -29317, -29334, -29333, -29393, -29313, -29315, -29334, -29335, -29334, -29315, -29334, -29343, -29332, -29334, -29393, -29317, -29322, -29313, -29334, -29387, -29393, -29336, -29334, -29317, -29371, -29348, -29376, -29375, -29376, -29331, -29339, -29334, -29332, -29317, -29401, -29407, -29407, -29407, -29402, -29342, -29338, -29343, -29338, -29331, -29330, -29316, -29334, -29383, -29381, -29387, -29408, -29408, -29316, -29318, -29331, -29316, -29317, -29315, -29338, -29343, -29336, -29401, -29407, -29407, -29407, -29402, 3961, -21122, -21124, -21139, -21158, -21130, -21129, -21121, -21136, -21122, -21142, -21199, -21193, -21193, -21193, -21200, -21122, -21124, -21139, -21165, -21140, -21132, -21143, -21158, -21130, -21129, -21121, -21136, -21122, -21142, -21199, -21193, -21193, -21193, -21200, 2769, 8314, 8312, 8297, 8286, 8306, 8307, 8315, 8308, 8314, 8302, 8245, 8243, 8243, 8243, 8244, 8314, 8312, 8297, 8279, 8296, 8304, 8301, 8286, 8306, 8307, 8315, 8308, 8314, 8302, 8245, 8243, 8243, 8243, 8244};

    /* JADX WARN: Code duplicated, block: B:37:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e4  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ee, code lost:
    
        if (l.AbstractC0116.m1243() == 0) goto L13;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m26581(bin.mt.json.JSONObject r52) {
        /*
            Method dump skipped, instruction units count: 4262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10312.m26581(bin.mt.json.JSONObject):void");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m26582(JSONArray jSONArray, boolean z) {
        short s = f32912[154];
        int i = s + 1;
        int i2 = ((s * 2) + 1) - (i * i) > 0 ? 26249 : 44313;
        ArrayList arrayList = new ArrayList(jSONArray.size());
        int i3 = 0;
        if (!z) {
            int size = jSONArray.size();
            while (i3 < size) {
                try {
                    RunnableC0334.m2054(arrayList, C7606.m20781(jSONArray.getJSONObject(i3)));
                } catch (RuntimeException unused) {
                }
                i3++;
            }
        } else {
            synchronized (C7606.class) {
                List listM20791 = C7606.m20791();
                C2310.m7811(listM20791, C1519.m5399(f32912, 155, 15, i2));
                arrayList.addAll(listM20791);
                List listM20795 = C7606.m20795();
                C0269.m1781(listM20795, RunnableC0334.m2049(f32912, 170, 19, i2));
                arrayList.addAll(listM20795);
            }
            int size2 = jSONArray.size();
            while (i3 < size2) {
                try {
                    AbstractC0148 abstractC0148M20781 = C7606.m20781(jSONArray.getJSONObject(i3));
                    Iterator itM4942 = C1343.m4942(arrayList);
                    while (true) {
                        if (C3998.m12923(itM4942)) {
                            AbstractC0148 abstractC0148 = (AbstractC0148) C4238.m13529(itM4942);
                            if (abstractC0148.f1127 == abstractC0148M20781.f1127) {
                                abstractC0148.mo1327(abstractC0148M20781);
                                break;
                            }
                        } else {
                            RunnableC0334.m2054(arrayList, abstractC0148M20781);
                            break;
                        }
                    }
                } catch (RuntimeException unused2) {
                }
                i3++;
            }
        }
        C7606.m20786(arrayList);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m26583(JSONArray jSONArray, boolean z) {
        short s = f32912[189];
        int i = s * 3024;
        int i2 = s + 756;
        int i3 = (i2 * i2) - i < 0 ? 759 : 8221;
        ArrayList arrayList = new ArrayList(jSONArray.size());
        int i4 = 0;
        if (z) {
            synchronized (C7606.class) {
                List listM20791 = C7606.m20791();
                C0269.m1781(listM20791, AbstractC0116.m1236(f32912, 190, 15, i3));
                arrayList.addAll(listM20791);
                List listM20795 = C7606.m20795();
                C0269.m1781(listM20795, C1542.m5471(f32912, 205, 19, i3));
                arrayList.addAll(listM20795);
            }
            int size = jSONArray.size();
            while (i4 < size) {
                C21799 c21799M14495 = C4645.m14495(jSONArray.getJSONObject(i4));
                Iterator itM4942 = C1343.m4942(arrayList);
                while (true) {
                    if (C1826.m6317(itM4942)) {
                        AbstractC0148 abstractC0148 = (AbstractC0148) C0950.m3796(itM4942);
                        if (abstractC0148.f1127 == c21799M14495.f1127) {
                            abstractC0148.mo1327(c21799M14495);
                            break;
                        }
                    } else {
                        RunnableC0334.m2054(arrayList, c21799M14495);
                        break;
                    }
                }
                i4++;
            }
        } else {
            int size2 = jSONArray.size();
            while (i4 < size2) {
                C1519.m5406(arrayList, C4645.m14495(jSONArray.getJSONObject(i4)));
                i4++;
            }
        }
        C7606.m20786(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x022f A[PHI: r9 r22
      0x022f: PHI (r9v76 java.util.ArrayList) = (r9v74 java.util.ArrayList), (r9v77 java.util.ArrayList) binds: [B:55:0x022d, B:49:0x01c9] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r22v84 java.lang.String) = (r22v82 java.lang.String), (r22v85 java.lang.String) binds: [B:55:0x022d, B:49:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26580(JSONArray jSONArray, boolean z) {
        int i;
        String str;
        int i2;
        short[] sArr;
        int i3;
        Collection collection;
        int iM2761;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short[] sArr2;
        int i9;
        int i10;
        String str2;
        short[] sArr3;
        int iM3169;
        int i11;
        int i12;
        int iM2762;
        int i13;
        int iM2763;
        int i14;
        int i15;
        int i16;
        int size;
        int i17;
        int i18;
        int i19;
        String str3;
        String strM2820;
        short[] sArr4;
        Collection collection2;
        int iM31610;
        String str4;
        int i20;
        int i21;
        String str5;
        int iM2764;
        int i22;
        int i23;
        int iM2765;
        int i24;
        int i25;
        int iM31611;
        int i26;
        int i27;
        int iM31612;
        int i28;
        int i29;
        int iM31613;
        int i30;
        int i31;
        int iM2766;
        int i32;
        int i33;
        jSONArray = jSONArray;
        int i34 = -120024416;
        int i35 = C0269.f1558;
        int i36 = C2310.f7472;
        int iM31614 = C0773.m3169("ܰۛ") ^ i35;
        int i37 = ((iM31614 ^ i36) * (-31159)) ^ 640615231;
        int i38 = iM31614 ^ 1853410638;
        String str6 = null;
        String string = null;
        String strM8881 = null;
        String str7 = null;
        C5061 c5061 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        JSONObject jSONObject = null;
        String str8 = null;
        C5061 c5061M2738 = null;
        ArrayList arrayList = null;
        Iterator itM13647 = null;
        int size2 = 0;
        String str9 = null;
        Collection collectionValues = null;
        String str10 = null;
        Iterator itM47859 = null;
        LinkedHashMap linkedHashMap = null;
        int i47 = 0;
        String string2 = null;
        Iterator itM2357 = null;
        C9622 c9622 = null;
        while (true) {
            i34 = i38 ^ (i37 & (((i34 ^ i36) * (-16825)) >> 31));
            switch (i34) {
                case -2094984630:
                case 36985829:
                    i39 = i39;
                    strM8881 = strM8881;
                    i = i41;
                    arrayList = arrayList;
                    str = str8;
                    str6 = str6;
                    c5061M2738 = C0618.m2738(linkedHashMap, str);
                    short[] sArr8 = f32912;
                    if (!C0619.f2439) {
                        String string3 = jSONObject.getString(C13473.m33137(sArr8, 22, 4, i40));
                        if (AbstractC3624.f12429 > 0) {
                            String strM5510 = C1564.m5510(f32912, 26, 14, i40);
                            C0269.m1781(string3, strM5510);
                            if (C1564.f5401 > 0) {
                                str8 = str;
                                String strM12149 = C3734.m12149(f32912, 40, 4, i40);
                                if (!C2878.f9462) {
                                    String string4 = jSONObject.getString(strM12149);
                                    C0269.m1781(string4, strM5510);
                                    if (C3734.f12817 < 0) {
                                        c9622 = new C9622(string3, string4);
                                        strM8881 = C2702.m8881(f32912, 44, 3, i40);
                                        if (jSONObject.contains(strM8881)) {
                                            iM2761 = C0619.m2761("ᩴܳ") ^ i35;
                                            i4 = ((iM2761 ^ i36) * (-5461)) ^ 543137902;
                                            i5 = 1626949577;
                                        } else {
                                            iM2761 = (i36 - C0773.m3169("۠᩸")) * 75;
                                            i4 = ((iM2761 ^ i35) * (-16893)) ^ (-1519480913);
                                            i5 = -863972688;
                                        }
                                        i38 = iM2761 ^ i5;
                                        i37 = i4;
                                        str6 = str6;
                                        i41 = i;
                                        i39 = i39;
                                        arrayList = arrayList;
                                    }
                                    int iM2767 = C0619.m2761("ܿܿ") ^ i36;
                                    i38 = iM2767 ^ 320348545;
                                    i37 = ((iM2767 ^ i35) * (-32225)) ^ 901014776;
                                    c9622 = null;
                                    str6 = str6;
                                    i41 = i;
                                    i39 = i39;
                                    strM8881 = strM8881;
                                    arrayList = arrayList;
                                } else {
                                    str9 = str9;
                                    i43 = i43;
                                    i41 = i;
                                    Collection collection3 = collectionValues;
                                    i42 = i42;
                                    collection = collection3;
                                    int iM31615 = C0773.m3169("ۡ֫") ^ i35;
                                    i37 = ((iM31615 ^ i36) * (-1651)) ^ 1325455616;
                                    i38 = iM31615 ^ (-1979653253);
                                    str9 = str9;
                                    i43 = i43;
                                    c9622 = null;
                                    str6 = str6;
                                    sArr6 = sArr6;
                                    i39 = i39;
                                    i41 = i41;
                                    arrayList = arrayList;
                                    strM8881 = strM8881;
                                    int i48 = i42;
                                    collectionValues = collection;
                                    i42 = i48;
                                }
                            } else {
                                str8 = str;
                                str9 = str9;
                                i2 = i43;
                                i41 = i;
                                sArr = sArr7;
                                i3 = i45;
                                Collection collection4 = collectionValues;
                                i42 = i42;
                                collection = collection4;
                                int iM31616 = (i35 - C0773.m3169("ۚܽ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                i37 = ((iM31616 ^ i36) * 10635) ^ (-1278446028);
                                i38 = iM31616 ^ 256162137;
                                i45 = i3;
                                i43 = i2;
                                c9622 = null;
                                sArr7 = sArr;
                                i39 = i39;
                                str9 = str9;
                                i41 = i41;
                                str6 = str6;
                                strM8881 = strM8881;
                                arrayList = arrayList;
                                int i49 = i42;
                                collectionValues = collection;
                                i42 = i49;
                            }
                            break;
                        }
                    }
                    int iM2768 = C0619.m2761("ᩳ᩹") ^ i35;
                    i38 = iM2768 ^ (-822813597);
                    str8 = str;
                    i37 = ((iM2768 ^ i36) * 27807) ^ 62048169;
                    c9622 = null;
                    str6 = str6;
                    i41 = i;
                    i39 = i39;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    break;
                case -2084108490:
                case -1266159169:
                    i39 = i39;
                    strM8881 = strM8881;
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    itM47859 = C20932.m47859(collectionValues);
                    iM3169 = C0619.m2761("ۙ֫") ^ i35;
                    i11 = ((iM3169 ^ i36) * 30561) ^ 1979702012;
                    i12 = -1003803407;
                    i38 = iM3169 ^ i12;
                    i37 = i11;
                    str6 = str6;
                    i41 = i;
                    i39 = i39;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    break;
                case -2068625989:
                case 69326227:
                    C11235.m28309();
                    break;
                case -2018043371:
                case -734481107:
                    i39 = i39;
                    strM8881 = strM8881;
                    int i50 = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    str5 = str9;
                    if (C3077.m10045(string) == 0) {
                        str8 = str6;
                        i43 = i43;
                        i41 = i50;
                    } else {
                        i43 = i43;
                        i41 = i50;
                        str8 = string;
                    }
                    iM2764 = (i35 - C0773.m3169("֡ۛ")) * 109;
                    i22 = ((iM2764 ^ i36) * 19497) ^ 1508539095;
                    i23 = -1545560149;
                    i38 = iM2764 ^ i23;
                    str9 = str5;
                    i37 = i22;
                    i43 = i43;
                    str6 = str6;
                    i39 = i39;
                    i41 = i41;
                    arrayList = arrayList;
                    strM8881 = strM8881;
                    break;
                case -1815679658:
                case 979799704:
                    arrayList = arrayList;
                    itM13647 = C4282.m13647(arrayList);
                    iM31613 = (C0773.m3169("ۢ᩻") + i35) * (-105);
                    i30 = ((iM31613 ^ i36) * (-10913)) ^ 1422250073;
                    i31 = 772165353;
                    i38 = iM31613 ^ i31;
                    i37 = i30;
                    str6 = str6;
                    arrayList = arrayList;
                    break;
                case -1777534970:
                case -230337005:
                    i39 = i39;
                    strM8881 = strM8881;
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    if (!C1826.m6317(itM2357)) {
                        i6 = i43;
                        i7 = i;
                        i8 = i39;
                        sArr2 = sArr6;
                        i9 = i44;
                        i10 = i45;
                        str2 = str9;
                        sArr3 = sArr7;
                        Collection collection5 = collectionValues;
                        i42 = i42;
                        collection = collection5;
                        int iM2769 = C0619.m2761("᩻ܺ") ^ i36;
                        short[] sArr9 = sArr2;
                        i37 = ((iM2769 ^ i35) * (-321)) ^ 1513151456;
                        i38 = iM2769 ^ (-1177314629);
                        i44 = i9;
                        i45 = i10;
                        sArr7 = sArr3;
                        str6 = str6;
                        i39 = i8;
                        sArr6 = sArr9;
                        str9 = str2;
                        i43 = i6;
                        arrayList = arrayList;
                        i41 = i7;
                        strM8881 = strM8881;
                        int i410 = i42;
                        collectionValues = collection;
                        i42 = i410;
                    } else {
                        iM3169 = (i36 - C0773.m3169("ۛܺ")) * (-99);
                        i11 = ((iM3169 ^ i35) * (-4801)) ^ 844837704;
                        i12 = 2107692826;
                        i38 = iM3169 ^ i12;
                        i37 = i11;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                    }
                    break;
                case -1757249704:
                case 1663497491:
                    arrayList = arrayList;
                    str6 = str6;
                    if (!c5061M2738.m15323().contains(c9622)) {
                        i39 = i39;
                        strM8881 = strM8881;
                        i = i41;
                        iM3169 = C0773.m3169("᩵ۗ") ^ i35;
                        i11 = ((iM3169 ^ i36) * (-9529)) ^ 669740131;
                        i12 = 308920478;
                        i38 = iM3169 ^ i12;
                        i37 = i11;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                    }
                    iM31613 = (C0773.m3169("۟᩺") + i35) * 15;
                    i30 = ((iM31613 ^ i36) * 5251) ^ 1227886362;
                    i31 = -1744111087;
                    i38 = iM31613 ^ i31;
                    i37 = i30;
                    str6 = str6;
                    arrayList = arrayList;
                    break;
                case -1747574141:
                case -1467857722:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    arrayList = arrayList;
                    i17 = i43;
                    short[] sArr10 = sArr7;
                    i18 = i45;
                    i19 = i46;
                    str6 = str6;
                    str3 = str9;
                    strM2820 = AbstractC0641.m2820(sArr10, i18, i19, i40);
                    sArr4 = sArr10;
                    collection2 = collectionValues;
                    C0269.m1781(collection2, strM2820);
                    if (collection2.isEmpty()) {
                        iM31610 = (C0619.m2761("᩷᩻") + i35) * 23;
                        str4 = strM2820;
                        i20 = ((iM31610 ^ i36) * (-25757)) ^ 1222184338;
                        i21 = 1592339425;
                    } else {
                        iM31610 = (C0773.m3169("᩵᩻") ^ i36) * (-107);
                        str4 = strM2820;
                        i20 = ((iM31610 ^ i35) * 12153) ^ (-50688419);
                        i21 = -840937516;
                    }
                    i38 = iM31610 ^ i21;
                    collectionValues = collection2;
                    i45 = i18;
                    i46 = i19;
                    sArr7 = sArr4;
                    str10 = str4;
                    i39 = i39;
                    i37 = i20;
                    str9 = str3;
                    i43 = i17;
                    str6 = str6;
                    jSONArray = jSONArray;
                    i41 = i41;
                    arrayList = arrayList;
                    strM8881 = strM8881;
                    break;
                case -1693190319:
                case 1223846542:
                    arrayList = arrayList;
                    C3077.m10033(arrayList, i39, new C5061(str6));
                    iM31613 = (i35 - C0773.m3169("᩷ܰ")) * 37;
                    str6 = str6;
                    i30 = ((iM31613 ^ i36) * (-14853)) ^ (-511032919);
                    i31 = 742325837;
                    i38 = iM31613 ^ i31;
                    i37 = i30;
                    str6 = str6;
                    arrayList = arrayList;
                    break;
                case -1680528565:
                case 262900238:
                    if (C0950.f3488 >= 0) {
                        i39 = i39;
                        i = i41;
                        arrayList = arrayList;
                        str6 = str6;
                        iM2761 = (i35 - C0619.m2761("ۖ۠")) * (-33);
                        i4 = ((iM2761 ^ i36) * 28633) ^ (-1066637505);
                        i5 = -576387434;
                        i38 = iM2761 ^ i5;
                        i37 = i4;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        arrayList = arrayList;
                    } else {
                        i39 = i39;
                        strM8881 = strM8881;
                        i41 = i41;
                        arrayList = arrayList;
                        i43 = i43;
                        str6 = str6;
                        str9 = str9;
                        Collection collection6 = collectionValues;
                        i42 = i42;
                        collection = collection6;
                        int iM31617 = C0773.m3169("ۡ֫") ^ i35;
                        i37 = ((iM31617 ^ i36) * (-1651)) ^ 1325455616;
                        i38 = iM31617 ^ (-1979653253);
                        str9 = str9;
                        i43 = i43;
                        c9622 = null;
                        str6 = str6;
                        sArr6 = sArr6;
                        i39 = i39;
                        i41 = i41;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                        int i411 = i42;
                        collectionValues = collection;
                        i42 = i411;
                    }
                    break;
                case -1596441168:
                case 1013831163:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    arrayList = arrayList;
                    i2 = i43;
                    i3 = i45;
                    str6 = str6;
                    str9 = str9;
                    sArr = sArr7;
                    Collection collection7 = collectionValues;
                    i42 = i42;
                    collection = collection7;
                    linkedHashMap = new LinkedHashMap();
                    sArr6 = f32912;
                    i44 = 1;
                    if (C2419.f7754 >= 0) {
                        int iM31618 = (i35 - C0773.m3169("ۚܽ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i37 = ((iM31618 ^ i36) * 10635) ^ (-1278446028);
                        i38 = iM31618 ^ 256162137;
                        i45 = i3;
                        i43 = i2;
                        c9622 = null;
                    } else {
                        iM2763 = C0619.m2761("۫ۖ") ^ i35;
                        i37 = ((iM2763 ^ i36) * 14801) ^ (-1367623713);
                        i14 = 14257179;
                        i38 = iM2763 ^ i14;
                        i45 = i3;
                        i43 = i2;
                    }
                    sArr7 = sArr;
                    i39 = i39;
                    str9 = str9;
                    i41 = i41;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i412 = i42;
                    collectionValues = collection;
                    i42 = i412;
                    break;
                case -1522097778:
                case -582047950:
                    if (C2834.f9334 > 0) {
                        iM2766 = (C0619.m2761("֫ۡ") + i36) * (-89);
                        i32 = ((iM2766 ^ i35) * (-25887)) ^ (-1675115260);
                        i33 = 367415823;
                        i38 = iM2766 ^ i33;
                        i37 = i32;
                    } else {
                        i39 = i39;
                        strM8881 = strM8881;
                        i41 = i41;
                        arrayList = arrayList;
                        i43 = i43;
                        sArr6 = sArr6;
                        i45 = i45;
                        str6 = str6;
                        str9 = str9;
                        sArr7 = sArr7;
                        Collection collection8 = collectionValues;
                        i42 = i42;
                        collection = collection8;
                        iM2762 = C0773.m3169("۫ܽ") ^ i36;
                        i37 = ((iM2762 ^ i35) * 1637) ^ (-1540469140);
                        i13 = 1384223568;
                        i38 = iM2762 ^ i13;
                        jSONArray = jSONArray;
                        i45 = i45;
                        i43 = i43;
                        sArr7 = sArr7;
                        sArr6 = sArr6;
                        i39 = i39;
                        str9 = str9;
                        i41 = i41;
                        str6 = str6;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                        int i413 = i42;
                        collectionValues = collection;
                        i42 = i413;
                    }
                    break;
                case -1390008985:
                case -125656813:
                    C22961.m51796(arrayList);
                    break;
                case -1260492717:
                case 551129811:
                    arrayList = arrayList;
                    str6 = str6;
                    int i51 = C0618.f2435;
                    C0618.m2738(linkedHashMap, c5061.m15317()).m15323().addAll(c5061.m15323());
                    i = i41;
                    iM2765 = (C0773.m3169("᩹᩵") + i36) * 91;
                    i24 = ((iM2765 ^ i35) * (-30593)) ^ 523233901;
                    i25 = -1292116079;
                    i38 = iM2765 ^ i25;
                    str9 = str9;
                    i37 = i24;
                    i43 = i43;
                    str6 = str6;
                    i41 = i;
                    i39 = i39;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    break;
                case -1246792287:
                case 1525243575:
                    arrayList = arrayList;
                    str6 = str6;
                    if (C3998.m12923(itM13647)) {
                        iM31613 = C0619.m2761("ۢܶ") ^ i35;
                        i30 = ((iM31613 ^ i36) * (-1425)) ^ (-530663703);
                        i31 = -490269048;
                    } else {
                        iM31613 = C0773.m3169("ᩴܰ") ^ i36;
                        i30 = ((iM31613 ^ i35) * (-16715)) ^ 1540044701;
                        i31 = 1294124852;
                    }
                    i38 = iM31613 ^ i31;
                    i37 = i30;
                    str6 = str6;
                    arrayList = arrayList;
                    break;
                case -1245959839:
                case 820123365:
                    C2375.m8065();
                    if (C2375.f7641 > 0) {
                        i39 = i39;
                        strM8881 = strM8881;
                        i41 = i41;
                        arrayList = arrayList;
                        i43 = i43;
                        str6 = str6;
                        str9 = str9;
                        Collection collection9 = collectionValues;
                        i42 = i42;
                        collection = collection9;
                        int iM31619 = C0773.m3169("ۡ֫") ^ i35;
                        i37 = ((iM31619 ^ i36) * (-1651)) ^ 1325455616;
                        i38 = iM31619 ^ (-1979653253);
                        str9 = str9;
                        i43 = i43;
                        c9622 = null;
                        str6 = str6;
                        sArr6 = sArr6;
                        i39 = i39;
                        i41 = i41;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                        int i414 = i42;
                        collectionValues = collection;
                        i42 = i414;
                    } else {
                        iM2766 = (C0619.m2761("֫ۡ") + i36) * (-89);
                        i32 = ((iM2766 ^ i35) * (-25887)) ^ (-1675115260);
                        i33 = 367415823;
                        i38 = iM2766 ^ i33;
                        i37 = i32;
                    }
                    break;
                case -1220654398:
                case 2053202050:
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    i39 = i39;
                    strM8881 = strM8881;
                    if (!((C5061) C4238.m13529(itM47859)).m15314()) {
                        iM3169 = C0619.m2761("ۙ֫") ^ i35;
                        i11 = ((iM3169 ^ i36) * 30561) ^ 1979702012;
                        i12 = -1003803407;
                        i38 = iM3169 ^ i12;
                        i37 = i11;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                    } else {
                        strM2820 = str10;
                        str3 = str9;
                        collection2 = collectionValues;
                        i17 = i43;
                        i41 = i;
                        sArr4 = sArr7;
                        i18 = i45;
                        i19 = i46;
                        iM31610 = (C0619.m2761("᩷᩻") + i35) * 23;
                        str4 = strM2820;
                        i20 = ((iM31610 ^ i36) * (-25757)) ^ 1222184338;
                        i21 = 1592339425;
                        i38 = iM31610 ^ i21;
                        collectionValues = collection2;
                        i45 = i18;
                        i46 = i19;
                        sArr7 = sArr4;
                        str10 = str4;
                        i39 = i39;
                        i37 = i20;
                        str9 = str3;
                        i43 = i17;
                        str6 = str6;
                        jSONArray = jSONArray;
                        i41 = i41;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                    }
                    break;
                case -1179912735:
                case -180576460:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2766 = C0619.m2761("֡۬") ^ i36;
                        i32 = ((iM2766 ^ i35) * (-3495)) ^ (-885756192);
                        i33 = -644271044;
                        i38 = iM2766 ^ i33;
                        i37 = i32;
                    } else {
                        i39 = i39;
                        i = i41;
                        arrayList = arrayList;
                        str6 = str6;
                        iM2761 = (i35 - C0619.m2761("ۖ۠")) * (-33);
                        i4 = ((iM2761 ^ i36) * 28633) ^ (-1066637505);
                        i5 = -576387434;
                        i38 = iM2761 ^ i5;
                        i37 = i4;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        arrayList = arrayList;
                    }
                    break;
                case -1173063640:
                case 216265531:
                    i39 = i39;
                    strM8881 = strM8881;
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    if (z) {
                        iM3169 = (C0773.m3169("ۡܽ") + i35) * (-123);
                        i11 = ((iM3169 ^ i36) * 321) ^ 699138581;
                        i12 = 730598548;
                    } else {
                        iM3169 = C0773.m3169("᩵ۗ") ^ i35;
                        i11 = ((iM3169 ^ i36) * (-9529)) ^ 669740131;
                        i12 = 308920478;
                    }
                    i38 = iM3169 ^ i12;
                    i37 = i11;
                    str6 = str6;
                    i41 = i;
                    i39 = i39;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    break;
                case -1072683587:
                case -712727325:
                    arrayList = arrayList;
                    str6 = str6;
                    C2966.m9660(arrayList, i47, C22961.m51809());
                    if (C1321.m4851(arrayList)) {
                        iM31613 = C0773.m3169("ᩴܰ") ^ i36;
                        i30 = ((iM31613 ^ i35) * (-16715)) ^ 1540044701;
                        i31 = 1294124852;
                    } else {
                        iM31613 = C0619.m2761("ᩳۤ") ^ i36;
                        i30 = ((iM31613 ^ i35) * (-32127)) ^ 1718894809;
                        i31 = -329793776;
                    }
                    i38 = iM31613 ^ i31;
                    i37 = i30;
                    str6 = str6;
                    arrayList = arrayList;
                    break;
                case -987050696:
                case 321832410:
                    AbstractC0641.m2813();
                    if (C1519.f5300 < 0) {
                        i39 = i39;
                        strM8881 = strM8881;
                        i = i41;
                        arrayList = arrayList;
                        str = str8;
                        str6 = str6;
                        int iM27610 = C0619.m2761("ᩳ᩹") ^ i35;
                        i38 = iM27610 ^ (-822813597);
                        str8 = str;
                        i37 = ((iM27610 ^ i36) * 27807) ^ 62048169;
                        c9622 = null;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                    } else {
                        iM2766 = C0619.m2761("֫ۢ") ^ i36;
                        i32 = ((iM2766 ^ i35) * 30015) ^ (-41685781);
                        i33 = -422532309;
                        i38 = iM2766 ^ i33;
                        i37 = i32;
                    }
                    break;
                case -963034032:
                case 1094627578:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    arrayList = arrayList;
                    i43 = i43;
                    sArr6 = sArr6;
                    i45 = i45;
                    str6 = str6;
                    str9 = str9;
                    sArr7 = sArr7;
                    Collection collection10 = collectionValues;
                    i42 = i42;
                    collection = collection10;
                    sArr5 = f32912;
                    c = 0;
                    if (C2023.f6737) {
                        iM2762 = C0773.m3169("۫ܽ") ^ i36;
                        i37 = ((iM2762 ^ i35) * 1637) ^ (-1540469140);
                        i13 = 1384223568;
                    } else {
                        iM2762 = C0619.m2761("ۘ۫") ^ i36;
                        i37 = ((iM2762 ^ i35) * (-3661)) ^ 1303200231;
                        i13 = -628454389;
                    }
                    i38 = iM2762 ^ i13;
                    jSONArray = jSONArray;
                    i45 = i45;
                    i43 = i43;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    i39 = i39;
                    str9 = str9;
                    i41 = i41;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i415 = i42;
                    collectionValues = collection;
                    i42 = i415;
                    break;
                case -935383274:
                case 172649661:
                    if (C4282.f15546 <= 0) {
                        i39 = i39;
                        strM8881 = strM8881;
                        i = i41;
                        arrayList = arrayList;
                        str6 = str6;
                        int iM27611 = C0619.m2761("ܿܿ") ^ i36;
                        i38 = iM27611 ^ 320348545;
                        i37 = ((iM27611 ^ i35) * (-32225)) ^ 901014776;
                        c9622 = null;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                    } else {
                        iM2766 = C0619.m2761("֡۬") ^ i36;
                        i32 = ((iM2766 ^ i35) * (-3495)) ^ (-885756192);
                        i33 = -644271044;
                        i38 = iM2766 ^ i33;
                        i37 = i32;
                    }
                    break;
                case -922867846:
                case 1314122796:
                    i16 = i41;
                    size = jSONArray.size();
                    i43 = 0;
                    int iM27612 = (C0619.m2761("ܳ᩹") ^ i35) * (-29);
                    i38 = iM27612 ^ (-1904947908);
                    i45 = i45;
                    i37 = ((iM27612 ^ i36) * 22345) ^ (-2113792591);
                    collectionValues = collectionValues;
                    sArr7 = sArr7;
                    i39 = i39;
                    i42 = size;
                    str9 = str9;
                    i41 = i16;
                    str6 = str6;
                    strM8881 = strM8881;
                    jSONArray = jSONArray;
                    arrayList = arrayList;
                    break;
                case -847162877:
                case 1112560868:
                    arrayList = arrayList;
                    if (((C5061) C4238.m13529(itM13647)).m15316()) {
                        iM31613 = (i35 - C0773.m3169("᩷ܰ")) * 37;
                        str6 = str6;
                        i30 = ((iM31613 ^ i36) * (-14853)) ^ (-511032919);
                        i31 = 742325837;
                    } else {
                        iM31613 = (C0773.m3169("ۢ᩻") + i35) * (-105);
                        i30 = ((iM31613 ^ i36) * (-10913)) ^ 1422250073;
                        i31 = 772165353;
                    }
                    i38 = iM31613 ^ i31;
                    i37 = i30;
                    str6 = str6;
                    arrayList = arrayList;
                    break;
                case -750892692:
                case 1130457129:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    arrayList = arrayList;
                    i43 = i43;
                    sArr6 = sArr6;
                    i45 = i45;
                    str6 = str6;
                    str9 = str9;
                    sArr7 = sArr7;
                    Collection collection11 = collectionValues;
                    i42 = i42;
                    collection = collection11;
                    if ((s * s2) - ((s * s) + 1408969) <= 0) {
                        iM2762 = C0773.m3169("᩷ۤ") ^ i35;
                        i37 = ((iM2762 ^ i36) * 22803) ^ (-2024422845);
                        i13 = -898518627;
                    } else {
                        iM2762 = C0619.m2761("֫ܺ") ^ i36;
                        i37 = ((iM2762 ^ i35) * (-9143)) ^ (-1936812109);
                        i13 = -1886225819;
                    }
                    i38 = iM2762 ^ i13;
                    jSONArray = jSONArray;
                    i45 = i45;
                    i43 = i43;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    i39 = i39;
                    str9 = str9;
                    i41 = i41;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i416 = i42;
                    collectionValues = collection;
                    i42 = i416;
                    break;
                case -724788728:
                case 1290803338:
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    i47 = 0;
                    iM31612 = (C0619.m2761("ۘ᩺") ^ i36) * 83;
                    i28 = ((iM31612 ^ i35) * 1569) ^ (-1355903648);
                    i29 = -1299139108;
                    i38 = iM31612 ^ i29;
                    i37 = i28;
                    str6 = str6;
                    i41 = i;
                    arrayList = arrayList;
                    break;
                case -668091546:
                case 1577745115:
                    i39 = i39;
                    strM8881 = strM8881;
                    i = i41;
                    arrayList = arrayList;
                    i43 = i43;
                    str6 = str6;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i43);
                    int i52 = C0618.f2435;
                    RunnableC3646.m11808(jSONObject2);
                    str9 = str9;
                    string2 = jSONObject2.getString(str9);
                    if (string2 != null) {
                        iM2765 = C0619.m2761("ۙ᩹") ^ i36;
                        i24 = ((iM2765 ^ i35) * 15987) ^ 1298835372;
                        i25 = -1486018987;
                    } else {
                        str7 = string2;
                        iM2765 = C0619.m2761("ۨۙ") ^ i35;
                        i24 = ((iM2765 ^ i36) * 19199) ^ (-258301967);
                        i25 = 800903647;
                    }
                    i38 = iM2765 ^ i25;
                    str9 = str9;
                    i37 = i24;
                    i43 = i43;
                    str6 = str6;
                    i41 = i;
                    i39 = i39;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    break;
                case -634440235:
                case -17891648:
                    i39 = i39;
                    strM8881 = strM8881;
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    itM2357 = C0487.m2357(C22961.m51820());
                    iM2765 = (C0773.m3169("᩹᩵") + i36) * 91;
                    i24 = ((iM2765 ^ i35) * (-30593)) ^ 523233901;
                    i25 = -1292116079;
                    i38 = iM2765 ^ i25;
                    str9 = str9;
                    i37 = i24;
                    i43 = i43;
                    str6 = str6;
                    i41 = i;
                    i39 = i39;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    break;
                case -586906167:
                case 213408833:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    arrayList = arrayList;
                    i43 = i43;
                    sArr6 = sArr6;
                    i45 = i45;
                    str6 = str6;
                    str9 = str9;
                    sArr7 = sArr7;
                    Collection collection12 = collectionValues;
                    i42 = i42;
                    collection = collection12;
                    s = sArr5[c];
                    s2 = 2374;
                    if (!C1343.m4943()) {
                        i45 = i45;
                        sArr7 = sArr7;
                        int iM316110 = C0773.m3169("ۡ֫") ^ i35;
                        i37 = ((iM316110 ^ i36) * (-1651)) ^ 1325455616;
                        i38 = iM316110 ^ (-1979653253);
                        str9 = str9;
                        i43 = i43;
                        c9622 = null;
                        str6 = str6;
                        sArr6 = sArr6;
                        i39 = i39;
                        i41 = i41;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                        int i417 = i42;
                        collectionValues = collection;
                        i42 = i417;
                    } else {
                        iM2762 = (C0773.m3169("᩻᩹") ^ i35) * (-71);
                        i37 = ((iM2762 ^ i36) * (-15351)) ^ (-851761691);
                        i13 = 815728021;
                        i38 = iM2762 ^ i13;
                        jSONArray = jSONArray;
                        i45 = i45;
                        i43 = i43;
                        sArr7 = sArr7;
                        sArr6 = sArr6;
                        i39 = i39;
                        str9 = str9;
                        i41 = i41;
                        str6 = str6;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                        int i418 = i42;
                        collectionValues = collection;
                        i42 = i418;
                    }
                    break;
                case -508491238:
                case 1622678355:
                    if (C0487.f2131 <= 0) {
                        iM2766 = (C0619.m2761("֫ۡ") + i36) * (-89);
                        i32 = ((iM2766 ^ i35) * (-25887)) ^ (-1675115260);
                        i33 = 367415823;
                    } else {
                        iM2766 = C0619.m2761("ܳܳ") ^ i35;
                        i32 = ((iM2766 ^ i36) * 12593) ^ 1159846035;
                        i33 = -629481141;
                    }
                    i38 = iM2766 ^ i33;
                    i37 = i32;
                    break;
                case -502595440:
                case 1564084247:
                    i15 = i41 + 1;
                    collection = collectionValues;
                    int iM31620 = (C0773.m3169("᩹۟") + i36) * (-67);
                    int i53 = ((iM31620 ^ i35) * (-22737)) ^ (-1615557654);
                    i38 = iM31620 ^ (-221970606);
                    jSONArray = jSONArray;
                    i45 = i45;
                    i43 = i43;
                    sArr7 = sArr7;
                    i39 = i39;
                    i41 = i15;
                    str9 = str9;
                    i37 = i53;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i419 = i42;
                    collectionValues = collection;
                    i42 = i419;
                    break;
                case -449572145:
                case 2133629789:
                    collection = collectionValues;
                    i40 = 63711;
                    iM2762 = C0619.m2761("᩻ۙ") ^ i36;
                    i37 = ((iM2762 ^ i35) * (-26701)) ^ (-957840093);
                    i13 = 1994984791;
                    i38 = iM2762 ^ i13;
                    jSONArray = jSONArray;
                    i45 = i45;
                    i43 = i43;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    i39 = i39;
                    str9 = str9;
                    i41 = i41;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i4110 = i42;
                    collectionValues = collection;
                    i42 = i4110;
                    break;
                case -415761438:
                case 1632299684:
                    String str11 = str6;
                    int i54 = i39;
                    String str12 = strM8881;
                    int i55 = i41;
                    Collection collectionValues2 = linkedHashMap.values();
                    C2310.m7811(collectionValues2, str10);
                    ArrayList arrayList2 = new ArrayList(collectionValues2);
                    if (jSONArray.size() > 0) {
                        iM31611 = (C0773.m3169("ۙۘ") ^ i36) * 81;
                        i26 = ((iM31611 ^ i35) * (-10849)) ^ 1615019881;
                        i27 = 894546599;
                    } else {
                        iM31611 = C0773.m3169("ᩴۗ") ^ i35;
                        i26 = ((iM31611 ^ i36) * 7141) ^ 1590928667;
                        i27 = -74893068;
                    }
                    i38 = iM31611 ^ i27;
                    i37 = i26;
                    i41 = i55;
                    i39 = i54;
                    strM8881 = str12;
                    arrayList = arrayList2;
                    str6 = str11;
                    break;
                case -377075831:
                case 16422193:
                    C0618.m2738(linkedHashMap, str7);
                    i43++;
                    size = i42;
                    i16 = i41;
                    int iM27613 = (C0619.m2761("ܳ᩹") ^ i35) * (-29);
                    i38 = iM27613 ^ (-1904947908);
                    i45 = i45;
                    i37 = ((iM27613 ^ i36) * 22345) ^ (-2113792591);
                    collectionValues = collectionValues;
                    sArr7 = sArr7;
                    i39 = i39;
                    i42 = size;
                    str9 = str9;
                    i41 = i16;
                    str6 = str6;
                    strM8881 = strM8881;
                    jSONArray = jSONArray;
                    arrayList = arrayList;
                    break;
                case -345150180:
                case 224087508:
                    i39 = i39;
                    strM8881 = strM8881;
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    if (!C1826.m6317(itM47859)) {
                        strM2820 = str10;
                        str3 = str9;
                        collection2 = collectionValues;
                        i17 = i43;
                        i41 = i;
                        sArr4 = sArr7;
                        i18 = i45;
                        i19 = i46;
                        iM31610 = (C0619.m2761("᩷᩻") + i35) * 23;
                        str4 = strM2820;
                        i20 = ((iM31610 ^ i36) * (-25757)) ^ 1222184338;
                        i21 = 1592339425;
                        i38 = iM31610 ^ i21;
                        collectionValues = collection2;
                        i45 = i18;
                        i46 = i19;
                        sArr7 = sArr4;
                        str10 = str4;
                        i39 = i39;
                        i37 = i20;
                        str9 = str3;
                        i43 = i17;
                        str6 = str6;
                        jSONArray = jSONArray;
                        i41 = i41;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                    } else {
                        iM3169 = (C0619.m2761("ܳ۠") ^ i36) * (-5);
                        i11 = ((iM3169 ^ i35) * (-13085)) ^ 684549161;
                        i12 = -1419756066;
                        i38 = iM3169 ^ i12;
                        i37 = i11;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                    }
                    break;
                case -213756799:
                case 484751759:
                    arrayList = arrayList;
                    str6 = str6;
                    i = i41;
                    int i56 = jSONArray.getJSONObject(i39).getInt(C2834.m9343(f32912, 64, 12, i40), i39);
                    int iM8879 = C2702.m8879(arrayList);
                    i47 = i56 > iM8879 ? iM8879 : i56;
                    iM31612 = (C0619.m2761("ۘ᩺") ^ i36) * 83;
                    i28 = ((iM31612 ^ i35) * 1569) ^ (-1355903648);
                    i29 = -1299139108;
                    i38 = iM31612 ^ i29;
                    i37 = i28;
                    str6 = str6;
                    i41 = i;
                    arrayList = arrayList;
                    break;
                case 46828785:
                case 957410463:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    int i57 = size2;
                    arrayList = arrayList;
                    i2 = i43;
                    i3 = i45;
                    str6 = str6;
                    str9 = str9;
                    sArr = sArr7;
                    Collection collection13 = collectionValues;
                    i42 = i42;
                    collection = collection13;
                    if (i41 < i57) {
                        int iM27614 = C0619.m2761("ۛᩴ") ^ i36;
                        size2 = i57;
                        i38 = iM27614 ^ (-1495748326);
                        i37 = ((iM27614 ^ i35) * 805) ^ 779885688;
                        i45 = i3;
                        i43 = i2;
                        sArr7 = sArr;
                        i39 = i39;
                        jSONArray = jSONArray;
                    } else {
                        size2 = i57;
                        iM2763 = C0773.m3169("ᩳ᩺") ^ i36;
                        i37 = ((iM2763 ^ i35) * 799) ^ (-1396567663);
                        i14 = -1386628474;
                        i38 = iM2763 ^ i14;
                        i45 = i3;
                        i43 = i2;
                        sArr7 = sArr;
                        i39 = i39;
                    }
                    str9 = str9;
                    i41 = i41;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i4111 = i42;
                    collectionValues = collection;
                    i42 = i4111;
                    break;
                case 88037242:
                case 1877126653:
                    collection = collectionValues;
                    i15 = 0;
                    size2 = jSONArray.size();
                    int iM31621 = (C0773.m3169("᩹۟") + i36) * (-67);
                    int i58 = ((iM31621 ^ i35) * (-22737)) ^ (-1615557654);
                    i38 = iM31621 ^ (-221970606);
                    jSONArray = jSONArray;
                    i45 = i45;
                    i43 = i43;
                    sArr7 = sArr7;
                    i39 = i39;
                    i41 = i15;
                    str9 = str9;
                    i37 = i58;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i4112 = i42;
                    collectionValues = collection;
                    i42 = i4112;
                    break;
                case 212919053:
                case 799000911:
                    strM8881 = strM8881;
                    i7 = i41;
                    arrayList = arrayList;
                    i6 = i43;
                    sArr3 = sArr7;
                    i10 = i45;
                    Collection collection14 = collectionValues;
                    i42 = i42;
                    collection = collection14;
                    sArr2 = sArr6;
                    i9 = i44;
                    String strM4056 = C1080.m4056(sArr2, i9, 4, i40);
                    str6 = null;
                    i8 = 0;
                    if (z) {
                        int iM27615 = C0619.m2761("ۧۢ") ^ i35;
                        i38 = iM27615 ^ 1628809448;
                        sArr6 = sArr2;
                        i44 = i9;
                        i45 = i10;
                        i43 = i6;
                        sArr7 = sArr3;
                        str6 = null;
                        str9 = strM4056;
                        i39 = 0;
                        i37 = ((iM27615 ^ i36) * (-14445)) ^ (-559806095);
                        i41 = i7;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                        jSONArray = jSONArray;
                    } else {
                        str2 = strM4056;
                        int iM27616 = C0619.m2761("᩻ܺ") ^ i36;
                        short[] sArr11 = sArr2;
                        i37 = ((iM27616 ^ i35) * (-321)) ^ 1513151456;
                        i38 = iM27616 ^ (-1177314629);
                        i44 = i9;
                        i45 = i10;
                        sArr7 = sArr3;
                        str6 = str6;
                        i39 = i8;
                        sArr6 = sArr11;
                        str9 = str2;
                        i43 = i6;
                        arrayList = arrayList;
                        i41 = i7;
                        strM8881 = strM8881;
                    }
                    int i4113 = i42;
                    collectionValues = collection;
                    i42 = i4113;
                    break;
                case 287557619:
                case 1465532520:
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    c5061 = (C5061) C0950.m3796(itM2357);
                    if (!c5061.m15314()) {
                        iM31612 = C0773.m3169("ܶܶ") ^ i36;
                        i28 = ((iM31612 ^ i35) * 26669) ^ (-1120869874);
                        i29 = -152338614;
                        i38 = iM31612 ^ i29;
                        i37 = i28;
                        str6 = str6;
                        i41 = i;
                        arrayList = arrayList;
                    } else {
                        iM2765 = (C0773.m3169("᩹᩵") + i36) * 91;
                        i24 = ((iM2765 ^ i35) * (-30593)) ^ 523233901;
                        i25 = -1292116079;
                        i38 = iM2765 ^ i25;
                        str9 = str9;
                        i37 = i24;
                        i43 = i43;
                        str6 = str6;
                        i41 = i;
                        i39 = i39;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                    }
                    break;
                case 435988817:
                case 1503709139:
                    collection = collectionValues;
                    i40 = 59993;
                    iM2762 = C0619.m2761("᩻ۙ") ^ i36;
                    i37 = ((iM2762 ^ i35) * (-26701)) ^ (-957840093);
                    i13 = 1994984791;
                    i38 = iM2762 ^ i13;
                    jSONArray = jSONArray;
                    i45 = i45;
                    i43 = i43;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    i39 = i39;
                    str9 = str9;
                    i41 = i41;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i4114 = i42;
                    collectionValues = collection;
                    i42 = i4114;
                    break;
                case 728900407:
                case 2104784100:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    int i59 = i42;
                    arrayList = arrayList;
                    Collection collection15 = collectionValues;
                    i2 = i43;
                    i3 = i45;
                    str6 = str6;
                    str9 = str9;
                    sArr = sArr7;
                    if (i2 < i59) {
                        int iM31622 = C0773.m3169("ᩳ֨") ^ i35;
                        int i60 = ((iM31622 ^ i36) * (-17667)) ^ 1420419386;
                        i38 = iM31622 ^ (-144172308);
                        i45 = i3;
                        i43 = i2;
                        sArr7 = sArr;
                        i42 = i59;
                        i39 = i39;
                        collectionValues = collection15;
                        str9 = str9;
                        i41 = i41;
                        str6 = str6;
                        strM8881 = strM8881;
                        i37 = i60;
                        arrayList = arrayList;
                        jSONArray = jSONArray;
                    } else {
                        i42 = i59;
                        iM2763 = (i35 - C0773.m3169("᩹֨")) * (-21);
                        collection = collection15;
                        i37 = ((iM2763 ^ i36) * (-8639)) ^ 947631612;
                        i14 = -984188891;
                        i38 = iM2763 ^ i14;
                        i45 = i3;
                        i43 = i2;
                        sArr7 = sArr;
                        i39 = i39;
                        str9 = str9;
                        i41 = i41;
                        str6 = str6;
                        strM8881 = strM8881;
                        arrayList = arrayList;
                        int i4115 = i42;
                        collectionValues = collection;
                        i42 = i4115;
                    }
                    break;
                case 851875616:
                case 900177565:
                    C2878.m9491();
                    if (!C17202.f56030) {
                        i39 = i39;
                        strM8881 = strM8881;
                        i41 = i41;
                        arrayList = arrayList;
                        i43 = i43;
                        str6 = str6;
                        str9 = str9;
                        Collection collection16 = collectionValues;
                        i42 = i42;
                        collection = collection16;
                        int iM316111 = C0773.m3169("ۡ֫") ^ i35;
                        i37 = ((iM316111 ^ i36) * (-1651)) ^ 1325455616;
                        i38 = iM316111 ^ (-1979653253);
                        str9 = str9;
                        i43 = i43;
                        c9622 = null;
                        str6 = str6;
                        sArr6 = sArr6;
                        i39 = i39;
                        i41 = i41;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                        int i4116 = i42;
                        collectionValues = collection;
                        i42 = i4116;
                    } else {
                        iM2766 = C0619.m2761("֫ۢ") ^ i36;
                        i32 = ((iM2766 ^ i35) * 30015) ^ (-41685781);
                        i33 = -422532309;
                        i38 = iM2766 ^ i33;
                        i37 = i32;
                    }
                    break;
                case 869186364:
                case 1026319235:
                    arrayList = arrayList;
                    str6 = str6;
                    RunnableC0334.m2054(c5061M2738.m15323(), c9622);
                    iM31613 = (C0773.m3169("۟᩺") + i35) * 15;
                    i30 = ((iM31613 ^ i36) * 5251) ^ 1227886362;
                    i31 = -1744111087;
                    i38 = iM31613 ^ i31;
                    i37 = i30;
                    str6 = str6;
                    arrayList = arrayList;
                    break;
                case 898655828:
                case 1337779433:
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    JSONArray jSONArray2 = jSONObject.getJSONArray(strM8881);
                    short[] sArr12 = f32912;
                    i39 = i39;
                    if (C0950.m3785() != 0) {
                        iM2761 = (i35 - C0619.m2761("ۖ۠")) * (-33);
                        i4 = ((iM2761 ^ i36) * 28633) ^ (-1066637505);
                        i5 = -576387434;
                    } else {
                        C2310.m7811(jSONArray2, C3998.m12925(sArr12, 47, 17, i40));
                        c9622.m25109(new C8877(jSONArray2));
                        strM8881 = strM8881;
                        iM2761 = (i36 - C0773.m3169("۠᩸")) * 75;
                        i4 = ((iM2761 ^ i35) * (-16893)) ^ (-1519480913);
                        i5 = -863972688;
                    }
                    i38 = iM2761 ^ i5;
                    i37 = i4;
                    str6 = str6;
                    i41 = i;
                    i39 = i39;
                    arrayList = arrayList;
                    break;
                case 903422297:
                case 1894405306:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    arrayList = arrayList;
                    i43 = i43;
                    str6 = str6;
                    str5 = str9;
                    jSONObject = jSONArray.getJSONObject(i41);
                    int i61 = C0618.f2435;
                    RunnableC3646.m11808(jSONObject);
                    string = jSONObject.getString(str5);
                    if (string != null) {
                        iM2764 = C0619.m2761("ܺۧ") ^ i36;
                        i22 = ((iM2764 ^ i35) * 14983) ^ (-1130535915);
                        i23 = 1367734177;
                    } else {
                        str8 = string;
                        iM2764 = (i35 - C0773.m3169("֡ۛ")) * 109;
                        i22 = ((iM2764 ^ i36) * 19497) ^ 1508539095;
                        i23 = -1545560149;
                    }
                    i38 = iM2764 ^ i23;
                    str9 = str5;
                    i37 = i22;
                    i43 = i43;
                    str6 = str6;
                    i39 = i39;
                    i41 = i41;
                    arrayList = arrayList;
                    strM8881 = strM8881;
                    break;
                case 1253165014:
                case 2070478776:
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    arrayList = arrayList;
                    i43 = i43;
                    str6 = str6;
                    str9 = str9;
                    collectionValues = linkedHashMap.values();
                    sArr7 = f32912;
                    i45 = 5;
                    i46 = 17;
                    if (C3779.f12953 > 0) {
                        int iM27617 = C0619.m2761("ۡۖ") ^ i35;
                        i37 = ((iM27617 ^ i36) * 24525) ^ (-725142478);
                        i38 = iM27617 ^ (-1198496119);
                        jSONArray = jSONArray;
                        str9 = str9;
                        i43 = i43;
                        str6 = str6;
                        i39 = i39;
                        i41 = i41;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                    } else {
                        Collection collection17 = collectionValues;
                        i42 = i42;
                        collection = collection17;
                        int iM316112 = C0773.m3169("ۡ֫") ^ i35;
                        i37 = ((iM316112 ^ i36) * (-1651)) ^ 1325455616;
                        i38 = iM316112 ^ (-1979653253);
                        str9 = str9;
                        i43 = i43;
                        c9622 = null;
                        str6 = str6;
                        sArr6 = sArr6;
                        i39 = i39;
                        i41 = i41;
                        arrayList = arrayList;
                        strM8881 = strM8881;
                        int i4117 = i42;
                        collectionValues = collection;
                        i42 = i4117;
                    }
                    break;
                case 1902101452:
                case 2039460690:
                    i39 = i39;
                    strM8881 = strM8881;
                    i = i41;
                    arrayList = arrayList;
                    str6 = str6;
                    str9 = str9;
                    if (C3077.m10045(string2) == 0) {
                        str7 = str6;
                        i43 = i43;
                    } else {
                        i43 = i43;
                        str7 = string2;
                    }
                    iM2765 = C0619.m2761("ۨۙ") ^ i35;
                    i24 = ((iM2765 ^ i36) * 19199) ^ (-258301967);
                    i25 = 800903647;
                    i38 = iM2765 ^ i25;
                    str9 = str9;
                    i37 = i24;
                    i43 = i43;
                    str6 = str6;
                    i41 = i;
                    i39 = i39;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    break;
                default:
                    C2419.m8174();
                    RunnableC3055.m9933();
                    i39 = i39;
                    strM8881 = strM8881;
                    i41 = i41;
                    arrayList = arrayList;
                    i43 = i43;
                    sArr6 = sArr6;
                    i45 = i45;
                    str6 = str6;
                    str9 = str9;
                    sArr7 = sArr7;
                    Collection collection18 = collectionValues;
                    i42 = i42;
                    collection = collection18;
                    iM2762 = C0773.m3169("۫ܽ") ^ i36;
                    i37 = ((iM2762 ^ i35) * 1637) ^ (-1540469140);
                    i13 = 1384223568;
                    i38 = iM2762 ^ i13;
                    jSONArray = jSONArray;
                    i45 = i45;
                    i43 = i43;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    i39 = i39;
                    str9 = str9;
                    i41 = i41;
                    str6 = str6;
                    strM8881 = strM8881;
                    arrayList = arrayList;
                    int i4118 = i42;
                    collectionValues = collection;
                    i42 = i4118;
                    break;
            }
            return;
        }
    }
}
