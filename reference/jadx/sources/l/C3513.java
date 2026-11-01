package l;

import android.content.SharedPreferences;
import android.util.Base64;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W8UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3513 {

    /* JADX INFO: renamed from: ۤܺᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f12867 = {6891, -25701, -25718, -25716, -25714, -25641, -25716, -25714, -25697, -25658, -25699, -25718, -25721, -25698, -25714, -25704, -25643, -25661, -25659, -25659, -25659, -25662, -25723, -25718, -25722, -25714, -25716, -25714, -25697, -25672, -25697, -25703, -25726, -25723, -25716, -25661, -25659, -25659, -25659, -25662, -25701, -25718, -25697, -25725, -25723, -25714, -25697, -25716, -25714, -25697, -25695, -25672, -25692, -25691, -25686, -25703, -25703, -25718, -25710, -25661, -25659, -25659, -25659, -25662, -25725, -25726, -25704, -25697, -25724, -25703, -25710, -25694, -25723, -25713, -25714, -25709, 7657, -15662, -15659, -15662, -15634, -15659, -15672, -15666, -15669, -15669, -15660, -15671, -15665, -15650, -15649, -15717, -15669, -15671, -15650, -15651, -15650, -15671, -15650, -15659, -15656, -15650, -15717, -15665, -15678, -15669, -15650, -15743, -15717, -15652, -15650, -15665, -15631, -15640, -15628, -15627, -15628, -15655, -15663, -15650, -15656, -15665, -15725, -15723, -15723, -15723, -15726, -15658, -15662, -15659, -15662, -15655, -15654, -15672, -15650, -15731, -15729, -15743, -15724, -15724, -15672, -15666, -15655, -15672, -15665, -15671, -15662, -15659, -15652, -15725, -15723, -15723, -15723, -15726, 2223, 16489, 16491, 16506, 16461, 16481, 16480, 16488, 16487, 16489, 16509, 16422, 16416, 16416, 16416, 16423, 16489, 16491, 16506, 16452, 16507, 16483, 16510, 16461, 16481, 16480, 16488, 16487, 16489, 16509, 16422, 16416, 16416, 16416, 16423, 6266, -7017, -7019, -7036, -6989, -7009, -7010, -7018, -7015, -7017, -7037, -6952, -6946, -6946, -6946, -6951, -7017, -7019, -7036, -6982, -7035, -7011, -7040, -6989, -7009, -7010, -7018, -7015, -7017, -7037, -6952, -6946, -6946, -6946, -6951};

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 33021. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10338(bin.mt.json.JSONArray r47, boolean r48) {
        /*
            Method dump skipped, instruction units count: 3302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3513.m10338(bin.mt.json.JSONArray, boolean):void");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m10340(JSONArray jSONArray, boolean z) {
        short s = f12867[154];
        int i = ((s * s) + 84529636) - (s * 18388) < 0 ? 50101 : 16398;
        ArrayList arrayList = new ArrayList(jSONArray.size());
        int i2 = 0;
        if (!z) {
            int size = jSONArray.size();
            while (i2 < size) {
                try {
                    C2249.m6905(arrayList, C5717.m15758(jSONArray.getJSONObject(i2)));
                } catch (RuntimeException unused) {
                }
                i2++;
            }
        } else {
            synchronized (C5717.class) {
                List listM15769 = C5717.m15769();
                C1937.m6286(listM15769, C2788.m8470(f12867, 155, 15, i));
                arrayList.addAll(listM15769);
                List listM15768 = C5717.m15768();
                C1937.m6286(listM15768, C3286.m9788(f12867, 170, 19, i));
                arrayList.addAll(listM15768);
            }
            int size2 = jSONArray.size();
            while (i2 < size2) {
                try {
                    AbstractC12068 abstractC12068M15758 = C5717.m15758(jSONArray.getJSONObject(i2));
                    Iterator itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                    while (true) {
                        if (RunnableC1564.m5348(itM9863)) {
                            AbstractC12068 abstractC12068 = (AbstractC12068) C0278.m1776(itM9863);
                            if (abstractC12068.f40385 == abstractC12068M15758.f40385) {
                                abstractC12068.mo4702(abstractC12068M15758);
                                break;
                            }
                        } else {
                            C3660.m10788(arrayList, abstractC12068M15758);
                            break;
                        }
                    }
                } catch (RuntimeException unused2) {
                }
                i2++;
            }
        }
        C5717.m15763(arrayList);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m10341(JSONArray jSONArray, boolean z) {
        short s = f12867[189];
        int i = (s * 31268) - ((s * s) + 244421956) <= 0 ? 58608 : 29070;
        ArrayList arrayList = new ArrayList(jSONArray.size());
        int i2 = 0;
        if (z) {
            synchronized (C5717.class) {
                List listM15769 = C5717.m15769();
                C1937.m6286(listM15769, C0817.m3406(f12867, 190, 15, i));
                arrayList.addAll(listM15769);
                List listM15768 = C5717.m15768();
                C7105.m18988(listM15768, C2477.m7604(f12867, 205, 19, i));
                arrayList.addAll(listM15768);
            }
            int size = jSONArray.size();
            while (i2 < size) {
                C4718 c4718M10432 = C3536.m10432(jSONArray.getJSONObject(i2));
                Iterator itM10563 = C3577.m10563(arrayList);
                while (true) {
                    if (RunnableC1564.m5348(itM10563)) {
                        AbstractC12068 abstractC12068 = (AbstractC12068) C0278.m1776(itM10563);
                        if (abstractC12068.f40385 == c4718M10432.f40385) {
                            abstractC12068.mo4702(c4718M10432);
                            break;
                        }
                    } else {
                        C2249.m6905(arrayList, c4718M10432);
                        break;
                    }
                }
                i2++;
            }
        } else {
            int size2 = jSONArray.size();
            while (i2 < size2) {
                C3660.m10788(arrayList, C3536.m10432(jSONArray.getJSONObject(i2)));
                i2++;
            }
        }
        C5717.m15763(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x019e  */
    /* JADX WARN: Code duplicated, block: B:38:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x027d A[PHI: r9 r12
      0x027d: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]) binds: [B:52:0x027b, B:23:0x0179] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v2 java.lang.String) binds: [B:52:0x027b, B:23:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10339(JSONObject jSONObject) {
        int i;
        int iM45029;
        int i2;
        int i3;
        int i4;
        int i5;
        SharedPreferences.Editor editorEdit;
        int[] iArr;
        short[] sArr;
        int i6;
        short[] sArr2;
        int i7;
        String str;
        String str2;
        short[] sArr3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        short s;
        String strM2308;
        int iM11306;
        int i13;
        int i14;
        String str3;
        String str4;
        JSONObject jSONObject2;
        int[] iArr2;
        short[] sArr4;
        int i15;
        int i16;
        int i17;
        int i18;
        short[] sArr5;
        String strM3406;
        int iM450210;
        int i19;
        int i20;
        String str5;
        int[] iArr3;
        short[] sArr6;
        int i21;
        int i22;
        int iM450211;
        int i23;
        int i24;
        String str6;
        int i25;
        JSONObject jSONObject3;
        int[] iArr4;
        int i26;
        short[] sArr7;
        SharedPreferences.Editor editor;
        int i27;
        int i28;
        int i29;
        String strM45020;
        int iM11307;
        int i30;
        int i31;
        JSONObject jSONObject4;
        int i32;
        int i33;
        int iM450212;
        int i34;
        int i35;
        int i36;
        int[] iArr5;
        int iM450213;
        int i37;
        int i38;
        int iM450214;
        int i39;
        int iM450215;
        int i40;
        int i41;
        int iM11308;
        int i42;
        int i43 = 0;
        int i44 = -878357856;
        int i45 = C2249.f8050;
        int i46 = C2124.f7782;
        int iM450216 = C19806.m45029("ᩴᩴ") ^ i46;
        int i47 = ((iM450216 ^ i45) * 32747) ^ (-2112196958);
        int i48 = iM450216 ^ 1673780348;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        JSONObject jSONObject5 = null;
        C17625 c17625M35471 = null;
        SharedPreferences.Editor editor2 = null;
        C12687 c12687 = null;
        JSONArray jSONArray = null;
        int[] iArr6 = null;
        String strM8251 = null;
        String strM931 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int iM31548 = 0;
        boolean zContains = false;
        String str10 = null;
        int i52 = 0;
        int iM31549 = 0;
        int i53 = 0;
        int i54 = 0;
        short s2 = 0;
        int i55 = 0;
        int i56 = 0;
        C17625 c17625M35478 = null;
        C12687 c12688 = null;
        JSONObject jSONObject6 = null;
        Iterator itM10563 = null;
        String string = null;
        Iterator itM9863 = null;
        InterfaceC17314 interfaceC17314 = null;
        int i57 = 0;
        while (true) {
            i44 = i48 ^ (i47 & (((i44 ^ i45) * 6239) >> 31));
            switch (i44) {
                case -2040139155:
                case -1663222608:
                    i12 = i50;
                    str2 = strM931;
                    str9 = str9;
                    jSONObject5 = jSONObject5;
                    iArr = iArr6;
                    short[] sArr12 = sArr8;
                    int i58 = i55;
                    int i59 = i56;
                    i9 = i49;
                    sArr11 = sArr11;
                    editor2 = editor2;
                    i10 = iM31549;
                    String str11 = str8;
                    str10 = str10;
                    str = str11;
                    strM2308 = AbstractC0464.m2308(sArr12, i58, i59, i57);
                    sArr9 = f12867;
                    if (C7105.m18985()) {
                        sArr3 = sArr12;
                        i8 = i58;
                        i56 = i59;
                        s = s2;
                        i52 = 1;
                        i11 = 3;
                        int iM450217 = C19806.m45029("᩸ᩴ") ^ i46;
                        i48 = iM450217 ^ (-410116654);
                        s2 = s;
                        i47 = ((iM450217 ^ i45) * (-21531)) ^ (-1747990619);
                        i50 = i12;
                        i49 = i9;
                        strM931 = str2;
                        i55 = i8;
                        sArr8 = sArr3;
                        iArr6 = iArr;
                        i53 = i11;
                        iM31549 = i10;
                        editor2 = editor2;
                    } else {
                        int iM450218 = C19806.m45029("᩶ۢ") ^ i46;
                        i47 = ((iM450218 ^ i45) * 28513) ^ 1378653727;
                        i48 = iM450218 ^ 103432775;
                        i55 = i58;
                        i56 = i59;
                        iM31549 = i10;
                        i50 = i12;
                        i49 = i9;
                        strM931 = str2;
                        sArr8 = sArr12;
                        i52 = 1;
                        i53 = 3;
                        editor2 = editor2;
                        iArr6 = iArr;
                    }
                    sArr11 = sArr11;
                    jSONObject5 = jSONObject5;
                    String str12 = strM2308;
                    str9 = str9;
                    str7 = str12;
                    String str13 = str10;
                    str8 = str;
                    str10 = str13;
                    break;
                case -2007314841:
                case 692950596:
                    iArr6[i51] = jSONArray.getInt(i51);
                    i51++;
                    iArr5 = iArr6;
                    i36 = i50;
                    int iM11309 = ThreadFactoryC3888.m11306("ۗܰ") ^ i45;
                    i41 = ((iM11309 ^ i46) * (-9047)) ^ (-1457594875);
                    i48 = iM11309 ^ 397411786;
                    i50 = i36;
                    i53 = i53;
                    i49 = i49;
                    iArr6 = iArr5;
                    i47 = i41;
                    break;
                case -1980933851:
                case 822428936:
                    if (C1461.m5080()) {
                        iM11308 = ThreadFactoryC3888.m11306("ܰۖ") ^ i46;
                        i41 = ((iM11308 ^ i45) * 7449) ^ 968529850;
                        i42 = -1160293728;
                    } else {
                        iM11308 = C19806.m45029("۫۠") ^ i45;
                        i41 = ((iM11308 ^ i46) * 24083) ^ (-1601093480);
                        i42 = 1650514815;
                    }
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case -1922978787:
                case 1088945223:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    if (iM31549 != i52) {
                        iM45029 = (C19806.m45029("᩺۬") ^ i45) * (-127);
                        i2 = ((iM45029 ^ i46) * (-3969)) ^ 860944877;
                        i3 = 10828026;
                    } else {
                        iM45029 = C19806.m45029("ܳ᩵") ^ i46;
                        i2 = ((iM45029 ^ i45) * (-6599)) ^ (-1694631654);
                        i3 = 1036943612;
                    }
                    i48 = iM45029 ^ i3;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i2;
                    str7 = str7;
                    i52 = i52;
                    i49 = i49;
                    iArr6 = iArr6;
                    break;
                case -1916599550:
                case 1149999514:
                    i7 = i52;
                    str = str8;
                    i57 = 50568;
                    int iM113010 = ThreadFactoryC3888.m11306("᩶۫") ^ i45;
                    i49 = i49;
                    strM931 = strM931;
                    i55 = i55;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    i48 = iM113010 ^ (-965950594);
                    i47 = ((iM113010 ^ i46) * 19477) ^ 1568965035;
                    iArr6 = iArr6;
                    i50 = i50;
                    i53 = i53;
                    iM31549 = iM31549;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    jSONObject5 = jSONObject5;
                    i32 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i32;
                    String str14 = str10;
                    str8 = str;
                    str10 = str14;
                    break;
                case -1898451076:
                case -1109221407:
                    i36 = i50;
                    JSONArray jSONArray2 = jSONObject6.getJSONArray(C2704.m8251(c12687));
                    int size = jSONArray2.size();
                    i54 = size;
                    i51 = i36;
                    jSONArray = jSONArray2;
                    iArr5 = new int[size];
                    int iM113011 = ThreadFactoryC3888.m11306("ۗܰ") ^ i45;
                    i41 = ((iM113011 ^ i46) * (-9047)) ^ (-1457594875);
                    i48 = iM113011 ^ 397411786;
                    i50 = i36;
                    i53 = i53;
                    i49 = i49;
                    iArr6 = iArr5;
                    i47 = i41;
                    break;
                case -1889169600:
                case -161391223:
                    string = jSONObject6.getString(C2704.m8251(c12687));
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(string);
                    sArr10 = f12867;
                    if (RunnableC1606.f6488 >= 0) {
                        iM11308 = C19806.m45029("֫ܿ") ^ i45;
                        i41 = ((iM11308 ^ i46) * (-16405)) ^ 1758716701;
                        i42 = -244931949;
                    } else {
                        iM11308 = C19806.m45029("۟ܰ") ^ i45;
                        i41 = ((iM11308 ^ i46) * 7551) ^ 397546926;
                        i42 = -283642862;
                    }
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case -1877551835:
                case 231341688:
                    if (C0216.f1393 != 0) {
                        jSONObject5 = jSONObject5;
                        iArr = iArr6;
                        sArr = sArr8;
                        i6 = i55;
                        sArr2 = sArr9;
                        sArr11 = sArr11;
                        editor2 = editor2;
                        iM31549 = iM31549;
                        i53 = i53;
                        i50 = i50;
                        int i60 = i52;
                        str7 = str7;
                        str9 = str9;
                        i7 = i60;
                        String str15 = str8;
                        str10 = str10;
                        str = str15;
                        int iM113012 = ThreadFactoryC3888.m11306("۟֨") ^ i46;
                        iArr6 = iArr;
                        i55 = i6;
                        sArr8 = sArr;
                        sArr9 = sArr2;
                        i48 = iM113012 ^ (-324962338);
                        i47 = ((iM113012 ^ i45) * 11263) ^ 11981103;
                        i50 = i50;
                        i53 = i53;
                        iM31549 = iM31549;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject5;
                        i32 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i32;
                        String str16 = str10;
                        str8 = str;
                        str10 = str16;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ܰۖ") ^ i46;
                        i41 = ((iM11308 ^ i45) * 7449) ^ 968529850;
                        i42 = -1160293728;
                        i48 = iM11308 ^ i42;
                        i47 = i41;
                    }
                    break;
                case -1869626201:
                case 2058972640:
                    String str17 = strM931;
                    int i61 = iM31549;
                    JSONObject jSONObject7 = jSONObject5;
                    iArr6 = iArr6;
                    i49 = i49;
                    short[] sArr13 = sArr11;
                    SharedPreferences.Editor editor3 = editor2;
                    int i62 = i53;
                    int i63 = i50;
                    if (i61 == i62) {
                        int iM450219 = (i45 - C19806.m45029("ܰ֫")) * (-121);
                        i33 = ((iM450219 ^ i46) * (-22175)) ^ 519817247;
                        i48 = iM450219 ^ 848180161;
                        editor2 = editor3;
                        sArr11 = sArr13;
                        i50 = i63;
                        jSONObject5 = jSONObject7;
                        i53 = i62;
                        strM931 = str17;
                        iM31549 = i61;
                        i47 = i33;
                        i49 = i49;
                        iArr6 = iArr6;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("ۜᩴ") ^ i46;
                        int i64 = ((iM113013 ^ i45) * (-3169)) ^ 1075878970;
                        i48 = iM113013 ^ 1458033712;
                        editor2 = editor3;
                        sArr11 = sArr13;
                        i49 = i49;
                        jSONObject5 = jSONObject7;
                        iArr6 = iArr6;
                        strM931 = str17;
                        iM31549 = i61;
                        i47 = i64;
                        i50 = i63;
                        i53 = i62;
                    }
                    break;
                case -1857882383:
                case -218256459:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    if (iM31548 != i52) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۚ") ^ i45;
                        str7 = str7;
                        i2 = ((iM45029 ^ i46) * (-26371)) ^ (-1414462511);
                        i3 = 783298278;
                    } else {
                        str7 = str7;
                        iM45029 = (ThreadFactoryC3888.m11306("ܺۢ") + i46) * (-59);
                        i2 = ((iM45029 ^ i45) * 18611) ^ (-1997309527);
                        i3 = 162586551;
                    }
                    i48 = iM45029 ^ i3;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i2;
                    str7 = str7;
                    i52 = i52;
                    i49 = i49;
                    iArr6 = iArr6;
                    break;
                case -1808734718:
                case 2065846163:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
                    str9 = str9;
                    C7105.m18988(interfaceC6025, str9);
                    InterfaceC17314 interfaceC17314M5517 = CallableC1627.m5517(interfaceC6025);
                    itM10563 = C3577.m10563(c17625M35478);
                    interfaceC17314 = interfaceC17314M5517;
                    int iM450220 = C19806.m45029("ܰۨ") ^ i46;
                    i7 = i52;
                    int i65 = ((iM450220 ^ i45) * 25551) ^ 88490348;
                    i48 = iM450220 ^ (-821655173);
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i65;
                    i49 = i49;
                    iArr6 = iArr6;
                    int i66 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i66;
                    break;
                case -1757994014:
                case -93345776:
                    str6 = strM931;
                    i25 = i52;
                    jSONObject3 = jSONObject5;
                    iArr4 = iArr6;
                    i26 = i49;
                    str7 = str7;
                    sArr7 = sArr11;
                    editor = editor2;
                    i27 = iM31549;
                    i28 = i53;
                    i29 = i50;
                    String str18 = str8;
                    str10 = str10;
                    str = str18;
                    strM45020 = C19806.m45020(f12867, 127, 4, i57);
                    if (jSONObject.contains(strM45020)) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜ۟") ^ i45;
                        i30 = ((iM11307 ^ i46) * (-17395)) ^ (-1552177745);
                        i31 = 1529732782;
                    } else {
                        iM11307 = C19806.m45029("᩵᩶") ^ i45;
                        i30 = ((iM11307 ^ i46) * 12729) ^ (-917740659);
                        i31 = 626592867;
                    }
                    i48 = iM11307 ^ i31;
                    i50 = i29;
                    i49 = i26;
                    iArr6 = iArr4;
                    i53 = i28;
                    iM31549 = i27;
                    editor2 = editor;
                    sArr11 = sArr7;
                    jSONObject5 = jSONObject3;
                    strM931 = str6;
                    i32 = i25;
                    str9 = strM45020;
                    i47 = i30;
                    str7 = str7;
                    i52 = i32;
                    String str19 = str10;
                    str8 = str;
                    str10 = str19;
                    break;
                case -1743476999:
                case 446210261:
                    if (C0216.f1393 != 0) {
                        str2 = strM931;
                        jSONObject5 = jSONObject5;
                        iArr = iArr6;
                        sArr3 = sArr8;
                        i8 = i55;
                        i9 = i49;
                        sArr11 = sArr11;
                        editor2 = editor2;
                        i10 = iM31549;
                        i11 = i53;
                        i12 = i50;
                        s = s2;
                        String str20 = str9;
                        strM2308 = str7;
                        str9 = str20;
                        String str21 = str8;
                        str10 = str10;
                        str = str21;
                        int iM4502110 = C19806.m45029("᩸ᩴ") ^ i46;
                        i48 = iM4502110 ^ (-410116654);
                        s2 = s;
                        i47 = ((iM4502110 ^ i45) * (-21531)) ^ (-1747990619);
                        i50 = i12;
                        i49 = i9;
                        strM931 = str2;
                        i55 = i8;
                        sArr8 = sArr3;
                        iArr6 = iArr;
                        i53 = i11;
                        iM31549 = i10;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject5;
                        String str110 = strM2308;
                        str9 = str9;
                        str7 = str110;
                        String str111 = str10;
                        str8 = str;
                        str10 = str111;
                    } else {
                        iM11308 = C19806.m45029("۫۠") ^ i45;
                        i41 = ((iM11308 ^ i46) * 24083) ^ (-1601093480);
                        i42 = 1650514815;
                        i48 = iM11308 ^ i42;
                        i47 = i41;
                    }
                    break;
                case -1690686596:
                case 1911280736:
                    if (C7105.f23796 >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i45;
                        i41 = ((iM11308 ^ i46) * 17759) ^ 1811755322;
                        i42 = 544229083;
                    } else {
                        iM11308 = C19806.m45029("֫ܿ") ^ i45;
                        i41 = ((iM11308 ^ i46) * (-16405)) ^ 1758716701;
                        i42 = -244931949;
                    }
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case -1689365438:
                case 1277082198:
                    str3 = strM931;
                    int i67 = iM31549;
                    jSONObject4 = jSONObject5;
                    i53 = i53;
                    iArr = iArr6;
                    int i68 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    editor2 = editor2;
                    int i69 = i52;
                    str7 = str7;
                    str9 = str9;
                    i7 = i69;
                    jSONObject6 = jSONObject.getJSONObject(str9);
                    String str22 = str8;
                    C1937.m6286(jSONObject6, str22);
                    int i70 = C14804.f48396;
                    c17625M35478 = C14804.m35478();
                    if (C1461.f5957 > 0) {
                        int iM113014 = (i46 - ThreadFactoryC3888.m11306("۠ۖ")) * 95;
                        i16 = i67;
                        i47 = ((iM113014 ^ i45) * (-201)) ^ 639597229;
                        i48 = iM113014 ^ 424104536;
                        str8 = str22;
                        i50 = i50;
                        i49 = i68;
                        iArr6 = iArr;
                        i53 = i53;
                        iM31549 = i16;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject4;
                        strM931 = str3;
                        int i610 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i610;
                    } else {
                        iM31549 = i67;
                        jSONObject5 = jSONObject4;
                        str10 = str10;
                        i49 = i68;
                        strM931 = str3;
                        sArr = sArr8;
                        i6 = i55;
                        sArr2 = sArr9;
                        str = str22;
                        int iM113015 = ThreadFactoryC3888.m11306("۟֨") ^ i46;
                        iArr6 = iArr;
                        i55 = i6;
                        sArr8 = sArr;
                        sArr9 = sArr2;
                        i48 = iM113015 ^ (-324962338);
                        i47 = ((iM113015 ^ i45) * 11263) ^ 11981103;
                        i50 = i50;
                        i53 = i53;
                        iM31549 = iM31549;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject5;
                        i32 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i32;
                        String str112 = str10;
                        str8 = str;
                        str10 = str112;
                    }
                    break;
                case -1657541162:
                case -535799510:
                    C1066.m4023();
                    if (C0216.f1393 != 0) {
                        strM931 = strM931;
                        iM31549 = iM31549;
                        jSONObject5 = jSONObject5;
                        i = i53;
                        iArr6 = iArr6;
                        i49 = i49;
                        i50 = i50;
                        sArr11 = sArr11;
                        i52 = i52;
                        editor2 = editor2;
                        str7 = str7;
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ܿ") ^ i46) * (-59);
                        i2 = ((iM45029 ^ i45) * 17545) ^ (-417266549);
                        i3 = -1892418444;
                        i48 = iM45029 ^ i3;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        i50 = i50;
                        jSONObject5 = jSONObject5;
                        i53 = i;
                        strM931 = strM931;
                        iM31549 = iM31549;
                        i47 = i2;
                        str7 = str7;
                        i52 = i52;
                        i49 = i49;
                        iArr6 = iArr6;
                    } else {
                        iM11308 = C19806.m45029("۫۠") ^ i45;
                        i41 = ((iM11308 ^ i46) * 24083) ^ (-1601093480);
                        i42 = 1650514815;
                        i48 = iM11308 ^ i42;
                        i47 = i41;
                    }
                    break;
                case -1644679853:
                case 1760425907:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    c12687 = (C12687) C0216.m1584(itM10563);
                    if (!jSONObject6.contains(CallableC1627.m5506(c12687))) {
                        str9 = str9;
                        int iM450221 = C19806.m45029("ܰۨ") ^ i46;
                        i7 = i52;
                        int i611 = ((iM450221 ^ i45) * 25551) ^ 88490348;
                        i48 = iM450221 ^ (-821655173);
                        editor2 = editor2;
                        sArr11 = sArr11;
                        i50 = i50;
                        jSONObject5 = jSONObject5;
                        i53 = i;
                        strM931 = strM931;
                        iM31549 = iM31549;
                        i47 = i611;
                        i49 = i49;
                        iArr6 = iArr6;
                        int i612 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i612;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i46;
                        i2 = ((iM45029 ^ i45) * (-2005)) ^ (-807467158);
                        i3 = 1905974801;
                        i48 = iM45029 ^ i3;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        i50 = i50;
                        jSONObject5 = jSONObject5;
                        i53 = i;
                        strM931 = strM931;
                        iM31549 = iM31549;
                        i47 = i2;
                        str7 = str7;
                        i52 = i52;
                        i49 = i49;
                        iArr6 = iArr6;
                    }
                    break;
                case -1638701043:
                case -414648773:
                    C7321 c7321 = C7321.f24318;
                    i = i53;
                    str7 = str7;
                    str9 = str9;
                    int iM450222 = C19806.m45029("ܰۨ") ^ i46;
                    i7 = i52;
                    int i613 = ((iM450222 ^ i45) * 25551) ^ 88490348;
                    i48 = iM450222 ^ (-821655173);
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i613;
                    i49 = i49;
                    iArr6 = iArr6;
                    int i614 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i614;
                    break;
                case -1576839355:
                case -1179342722:
                    C1419.m4973();
                    return;
                case -1571365420:
                case 17507665:
                    strM931 = strM931;
                    i4 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    str8 = str8;
                    int i71 = i52;
                    str7 = str7;
                    i5 = i71;
                    SharedPreferences sharedPreferences = ApplicationC0716.f2988;
                    str10 = str10;
                    C1937.m6286(sharedPreferences, str10);
                    editorEdit = sharedPreferences.edit();
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(c17625M35471);
                    int iM113016 = (i45 - ThreadFactoryC3888.m11306("ܶᩳ")) * (-53);
                    SharedPreferences.Editor editor4 = editorEdit;
                    i47 = ((iM113016 ^ i46) * 23543) ^ (-894858617);
                    i48 = iM113016 ^ (-502341054);
                    str10 = str10;
                    sArr11 = sArr11;
                    i49 = i49;
                    jSONObject5 = jSONObject5;
                    iArr6 = iArr6;
                    strM931 = strM931;
                    str8 = str8;
                    i50 = i50;
                    i53 = i;
                    iM31549 = i4;
                    editor2 = editor4;
                    int i72 = i5;
                    str9 = str9;
                    str7 = str7;
                    i52 = i72;
                    break;
                case -1437446631:
                case 729836377:
                    throw new RuntimeException(C1398.m4903(c12687.m31548(), str7));
                case -1382438417:
                case 185090388:
                    iArr6 = iArr6;
                    i49 = i49;
                    int i73 = i53;
                    if (iM31548 != i73) {
                        iM450213 = ThreadFactoryC3888.m11306("ܶܺ") ^ i46;
                        i37 = ((iM450213 ^ i45) * 14101) ^ 62499563;
                        i38 = -640468041;
                    } else {
                        iM450213 = C19806.m45029("᩵᩸") ^ i45;
                        i37 = ((iM450213 ^ i46) * (-17875)) ^ (-359511959);
                        i38 = -1207783217;
                    }
                    i48 = iM450213 ^ i38;
                    i47 = i37;
                    i50 = i50;
                    i53 = i73;
                    i49 = i49;
                    iArr6 = iArr6;
                    break;
                case -1370989704:
                case -940276813:
                    iArr6 = iArr6;
                    if (iM31548 == 4) {
                        i49 = i49;
                        iM450214 = (C19806.m45029("ܿۧ") ^ i45) * 61;
                        i47 = ((iM450214 ^ i46) * 25065) ^ (-2067924151);
                        i39 = 864685175;
                        i48 = iM450214 ^ i39;
                        i49 = i49;
                        iArr6 = iArr6;
                    } else {
                        iM450215 = (C19806.m45029("ۡۖ") ^ i46) * (-9);
                        i49 = i49;
                        i33 = ((iM450215 ^ i45) * (-23071)) ^ 1212553217;
                        i40 = -1210202532;
                        i48 = iM450215 ^ i40;
                        i47 = i33;
                        i49 = i49;
                        iArr6 = iArr6;
                    }
                    break;
                case -1227044685:
                case -365474515:
                    C0797.m3359();
                    if (C2477.f9839 > 0) {
                        str3 = strM931;
                        strM3406 = str10;
                        str4 = str8;
                        jSONObject2 = jSONObject5;
                        iArr2 = iArr6;
                        sArr4 = sArr8;
                        i18 = i55;
                        sArr5 = sArr9;
                        i15 = i49;
                        sArr11 = sArr11;
                        editor2 = editor2;
                        i16 = iM31549;
                        i53 = i53;
                        i17 = i50;
                        int i74 = i52;
                        str7 = str7;
                        str9 = str9;
                        i7 = i74;
                        iM450210 = (ThreadFactoryC3888.m11306("۬ܰ") + i45) * (-115);
                        i19 = ((iM450210 ^ i46) * 9335) ^ 1645045032;
                        i20 = -2006553406;
                        int i75 = iM450210 ^ i20;
                        str8 = str4;
                        i49 = i15;
                        i55 = i18;
                        sArr8 = sArr4;
                        sArr9 = sArr5;
                        str10 = strM3406;
                        i48 = i75;
                        i47 = i19;
                        iArr6 = iArr2;
                        i50 = i17;
                        strM931 = str3;
                        i53 = i53;
                        iM31549 = i16;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject2;
                        int i615 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i615;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i45;
                        i41 = ((iM11308 ^ i46) * 17759) ^ 1811755322;
                        i42 = 544229083;
                        i48 = iM11308 ^ i42;
                        i47 = i41;
                    }
                    break;
                case -1216560056:
                case -858041403:
                    iArr6 = iArr6;
                    interfaceC17314.mo4068(C2704.m8251(c12687), iArr6);
                    strM931 = strM931;
                    i52 = i52;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    i50 = i50;
                    str7 = str7;
                    sArr11 = sArr11;
                    str9 = str9;
                    editor2 = editor2;
                    int iM450223 = C19806.m45029("ܰۨ") ^ i46;
                    i7 = i52;
                    int i616 = ((iM450223 ^ i45) * 25551) ^ 88490348;
                    i48 = iM450223 ^ (-821655173);
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i616;
                    i49 = i49;
                    iArr6 = iArr6;
                    int i617 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i617;
                    break;
                case -1197610296:
                case 8886336:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    if (RunnableC1564.m5348(itM10563)) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۟") ^ i46;
                        i2 = ((iM45029 ^ i45) * (-25661)) ^ (-1009347764);
                        i3 = -362591016;
                    } else {
                        iM45029 = C19806.m45029("۫ۘ") ^ i46;
                        i2 = ((iM45029 ^ i45) * 23425) ^ 236131155;
                        i3 = 1195062475;
                    }
                    i48 = iM45029 ^ i3;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i2;
                    str7 = str7;
                    i52 = i52;
                    i49 = i49;
                    iArr6 = iArr6;
                    break;
                case -1178532720:
                case -288122700:
                    String str23 = strM931;
                    JSONObject jSONObject8 = jSONObject5;
                    int[] iArr7 = iArr6;
                    int i76 = i49;
                    short[] sArr14 = sArr11;
                    SharedPreferences.Editor editor5 = editor2;
                    int i77 = i53;
                    if (iM31548 != 2) {
                        iM450212 = C19806.m45029("ܽ᩻") ^ i46;
                        i34 = ((iM450212 ^ i45) * (-15929)) ^ 1211837741;
                        i35 = 2090024321;
                    } else {
                        iM450212 = (C19806.m45029("ۘۜ") ^ i46) * (-101);
                        i34 = ((iM450212 ^ i45) * 14341) ^ 1874549503;
                        i35 = 1097049705;
                    }
                    i48 = iM450212 ^ i35;
                    i53 = i77;
                    i47 = i34;
                    editor2 = editor5;
                    sArr11 = sArr14;
                    i49 = i76;
                    i50 = 0;
                    jSONObject5 = jSONObject8;
                    iArr6 = iArr7;
                    strM931 = str23;
                    break;
                case -1168488918:
                case 101493028:
                    str3 = strM931;
                    str4 = str8;
                    jSONObject2 = jSONObject5;
                    iArr2 = iArr6;
                    sArr4 = sArr8;
                    i15 = i49;
                    sArr11 = sArr11;
                    editor2 = editor2;
                    i16 = iM31549;
                    i53 = i53;
                    i17 = i50;
                    int i78 = i52;
                    str7 = str7;
                    str9 = str9;
                    i7 = i78;
                    i18 = i55;
                    sArr5 = sArr9;
                    strM3406 = C0817.m3406(f12867, 77, 3, i57);
                    zContains = jSONObject.contains(strM3406);
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("۬ܰ") + i45) * (-115);
                        i19 = ((iM450210 ^ i46) * 9335) ^ 1645045032;
                        i20 = -2006553406;
                    } else {
                        iM450210 = C19806.m45029("ۢ۫") ^ i46;
                        i19 = ((iM450210 ^ i45) * (-5275)) ^ (-214599689);
                        i20 = 2046516082;
                    }
                    int i79 = iM450210 ^ i20;
                    str8 = str4;
                    i49 = i15;
                    i55 = i18;
                    sArr8 = sArr4;
                    sArr9 = sArr5;
                    str10 = strM3406;
                    i48 = i79;
                    i47 = i19;
                    iArr6 = iArr2;
                    i50 = i17;
                    strM931 = str3;
                    i53 = i53;
                    iM31549 = i16;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    jSONObject5 = jSONObject2;
                    int i618 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i618;
                    break;
                case -1071280465:
                case 1166387594:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    editor2.putString(CallableC1627.m5506(c12688), jSONObject5.getString(CallableC1627.m5506(c12688)));
                    i4 = iM31549;
                    editorEdit = editor2;
                    str10 = str10;
                    str8 = str8;
                    i5 = i52;
                    int iM113017 = (i45 - ThreadFactoryC3888.m11306("ܶᩳ")) * (-53);
                    SharedPreferences.Editor editor6 = editorEdit;
                    i47 = ((iM113017 ^ i46) * 23543) ^ (-894858617);
                    i48 = iM113017 ^ (-502341054);
                    str10 = str10;
                    sArr11 = sArr11;
                    i49 = i49;
                    jSONObject5 = jSONObject5;
                    iArr6 = iArr6;
                    strM931 = strM931;
                    str8 = str8;
                    i50 = i50;
                    i53 = i;
                    iM31549 = i4;
                    editor2 = editor6;
                    int i710 = i5;
                    str9 = str9;
                    str7 = str7;
                    i52 = i710;
                    break;
                case -962281210:
                case 241172784:
                    str5 = strM931;
                    jSONObject5 = jSONObject5;
                    iArr3 = iArr6;
                    sArr6 = sArr9;
                    i21 = i49;
                    sArr11 = sArr11;
                    editor2 = editor2;
                    iM31549 = iM31549;
                    i53 = i53;
                    i22 = i50;
                    int i80 = i52;
                    str7 = str7;
                    str9 = str9;
                    i7 = i80;
                    String str24 = str8;
                    str10 = str10;
                    str = str24;
                    sArr8 = f12867;
                    i55 = 80;
                    i56 = 29;
                    if (C2642.m8171() != 0) {
                        iM450211 = ThreadFactoryC3888.m11306("֨ۡ") ^ i45;
                        i23 = ((iM450211 ^ i46) * 18451) ^ (-1156817179);
                        i24 = 884984209;
                    } else {
                        iM450211 = C19806.m45029("۫᩵") ^ i45;
                        i23 = ((iM450211 ^ i46) * 25771) ^ (-930271993);
                        i24 = 1174819816;
                    }
                    i48 = iM450211 ^ i24;
                    i47 = i23;
                    sArr9 = sArr6;
                    i50 = i22;
                    i49 = i21;
                    strM931 = str5;
                    iArr6 = iArr3;
                    i53 = i53;
                    iM31549 = iM31549;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    jSONObject5 = jSONObject5;
                    i32 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i32;
                    String str113 = str10;
                    str8 = str;
                    str10 = str113;
                    break;
                case -953193452:
                case -801015856:
                    str3 = strM931;
                    sArr11 = sArr11;
                    strM3406 = str10;
                    editor2 = editor2;
                    iArr2 = iArr6;
                    i15 = i49;
                    i16 = iM31549;
                    i53 = i53;
                    i17 = i50;
                    String str25 = str8;
                    int i81 = i52;
                    str7 = str7;
                    str9 = str9;
                    i7 = i81;
                    jSONObject4 = jSONObject.getJSONObject(strM3406);
                    C1937.m6286(jSONObject4, str25);
                    int i82 = C14804.f48396;
                    c17625M35471 = C14804.m35471();
                    if (!C0526.f2219) {
                        int iM450224 = (C19806.m45029("ܰ᩹") + i46) * (-15);
                        i47 = ((iM450224 ^ i45) * (-7491)) ^ (-1504090294);
                        i48 = iM450224 ^ 1602377664;
                        str10 = strM3406;
                        i49 = i15;
                        str8 = str25;
                        iArr6 = iArr2;
                        i50 = i17;
                        i53 = i53;
                        iM31549 = i16;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject4;
                        strM931 = str3;
                        int i619 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i619;
                    } else {
                        str4 = str25;
                        jSONObject2 = jSONObject4;
                        sArr4 = sArr8;
                        i18 = i55;
                        sArr5 = sArr9;
                        iM450210 = (ThreadFactoryC3888.m11306("۬ܰ") + i45) * (-115);
                        i19 = ((iM450210 ^ i46) * 9335) ^ 1645045032;
                        i20 = -2006553406;
                        int i711 = iM450210 ^ i20;
                        str8 = str4;
                        i49 = i15;
                        i55 = i18;
                        sArr8 = sArr4;
                        sArr9 = sArr5;
                        str10 = strM3406;
                        i48 = i711;
                        i47 = i19;
                        iArr6 = iArr2;
                        i50 = i17;
                        strM931 = str3;
                        i53 = i53;
                        iM31549 = i16;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject2;
                        int i6110 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i6110;
                    }
                    break;
                case -921638883:
                case 561823011:
                    throw new RuntimeException(C3535.m10424(c12688.m31548(), str7));
                case -911407324:
                case 112926856:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    if (C0962.m3748(itM9863)) {
                        iM45029 = C19806.m45029("ܶۛ") ^ i46;
                        i2 = ((iM45029 ^ i45) * 16897) ^ (-1613320372);
                        i3 = 1960956514;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩶") + i45) * (-95);
                        i2 = ((iM45029 ^ i46) * 4273) ^ 1827633014;
                        i3 = 1705025954;
                    }
                    i48 = iM45029 ^ i3;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i2;
                    str7 = str7;
                    i52 = i52;
                    i49 = i49;
                    iArr6 = iArr6;
                    break;
                case -901889269:
                case -284903022:
                    String str26 = strM931;
                    jSONObject5 = jSONObject5;
                    int[] iArr8 = iArr6;
                    short[] sArr15 = sArr8;
                    int i83 = i55;
                    short[] sArr16 = sArr9;
                    int i84 = i49;
                    sArr11 = sArr11;
                    editor2 = editor2;
                    int i85 = iM31549;
                    int i86 = i53;
                    int i87 = i50;
                    int i88 = i52;
                    str7 = str7;
                    str9 = str9;
                    i7 = i88;
                    String str27 = str8;
                    str10 = str10;
                    str = str27;
                    short s3 = s2;
                    int i89 = (s3 * s3) + 47527236;
                    if ((i43 * i43) - (i89 + i89) <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۧ") ^ i46;
                        i13 = ((iM11306 ^ i45) * (-2011)) ^ 543713179;
                        i14 = 1824246777;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܳ") ^ i45) * 55;
                        i13 = ((iM11306 ^ i46) * 13921) ^ 1333111402;
                        i14 = -659597509;
                    }
                    s2 = s3;
                    i50 = i87;
                    i49 = i84;
                    i55 = i83;
                    sArr8 = sArr15;
                    sArr9 = sArr16;
                    i48 = iM11306 ^ i14;
                    i47 = i13;
                    iArr6 = iArr8;
                    i53 = i86;
                    iM31549 = i85;
                    strM931 = str26;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    jSONObject5 = jSONObject5;
                    i32 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i32;
                    String str114 = str10;
                    str8 = str;
                    str10 = str114;
                    break;
                case -855567931:
                case -186896697:
                    if (C1398.f5802 <= 0) {
                        iM11308 = C19806.m45029("۫۠") ^ i45;
                        i41 = ((iM11308 ^ i46) * 24083) ^ (-1601093480);
                        i42 = 1650514815;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("᩻ܺ") + i46) * (-35);
                        i41 = ((iM11308 ^ i45) * (-7021)) ^ (-317200055);
                        i42 = 328711409;
                    }
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case -850644723:
                case -536197051:
                    if (C3660.f13403 < 0) {
                        iM11308 = C19806.m45029("۫۠") ^ i45;
                        i41 = ((iM11308 ^ i46) * 24083) ^ (-1601093480);
                        i42 = 1650514815;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i45;
                        i41 = ((iM11308 ^ i46) * 17759) ^ 1811755322;
                        i42 = 544229083;
                    }
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case -836120900:
                case 100819970:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    iM31548 = c12687.m31548();
                    if (iM31548 != 0) {
                        iM45029 = C19806.m45029("ܳ۫") ^ i45;
                        i2 = ((iM45029 ^ i46) * (-9151)) ^ (-1397719752);
                        i3 = 1361133958;
                    } else {
                        iM45029 = C19806.m45029("ۘۖ") ^ i45;
                        i2 = ((iM45029 ^ i46) * (-14781)) ^ (-1598117298);
                        i3 = -1413697810;
                    }
                    i48 = iM45029 ^ i3;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i2;
                    str7 = str7;
                    i52 = i52;
                    i49 = i49;
                    iArr6 = iArr6;
                    break;
                case -776984267:
                case -465004164:
                    interfaceC17314.mo4064((byte) jSONObject6.getInt(CallableC1627.m5506(c12687)), CallableC1627.m5506(c12687));
                    i = i53;
                    str7 = str7;
                    str9 = str9;
                    int iM450225 = C19806.m45029("ܰۨ") ^ i46;
                    i7 = i52;
                    int i6111 = ((iM450225 ^ i45) * 25551) ^ 88490348;
                    i48 = iM450225 ^ (-821655173);
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i6111;
                    i49 = i49;
                    iArr6 = iArr6;
                    int i6112 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i6112;
                    break;
                case -763767241:
                case 1907556192:
                    str5 = strM931;
                    str10 = str10;
                    JSONObject jSONObject9 = jSONObject5;
                    iArr3 = iArr6;
                    i21 = i49;
                    sArr11 = sArr11;
                    editor2 = editor2;
                    iM31549 = iM31549;
                    i53 = i53;
                    i22 = i50;
                    int i90 = i52;
                    str7 = str7;
                    str9 = str9;
                    i7 = i90;
                    jSONObject5 = jSONObject9;
                    sArr6 = sArr9;
                    String strM940 = C0050.m940(sArr6, 109, 18, i57);
                    if (zContains) {
                        int iM113018 = ThreadFactoryC3888.m11306("᩸۬") ^ i45;
                        str = strM940;
                        i47 = ((iM113018 ^ i46) * (-24725)) ^ 1723302260;
                        i48 = iM113018 ^ 122619407;
                    } else {
                        str = strM940;
                        iM450211 = C19806.m45029("᩵ᩴ") ^ i46;
                        i23 = ((iM450211 ^ i45) * (-1163)) ^ 1185149765;
                        i24 = -1913167740;
                        i48 = iM450211 ^ i24;
                        i47 = i23;
                    }
                    sArr9 = sArr6;
                    i50 = i22;
                    i49 = i21;
                    strM931 = str5;
                    iArr6 = iArr3;
                    i53 = i53;
                    iM31549 = iM31549;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    jSONObject5 = jSONObject5;
                    i32 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i32;
                    String str115 = str10;
                    str8 = str;
                    str10 = str115;
                    break;
                case -758515766:
                case 700442692:
                    strM8251 = C2704.m8251(c12687);
                    strM931 = C0050.m931(string, 9);
                    sArr11 = f12867;
                    i49 = 140;
                    if (C10634.f36300 < 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("᩹᩸") + i46) * (-107);
                        i41 = ((iM11308 ^ i45) * 1935) ^ (-1899688965);
                        i42 = 734273235;
                        i48 = iM11308 ^ i42;
                        i47 = i41;
                    } else {
                        jSONObject5 = jSONObject5;
                        iArr = iArr6;
                        sArr = sArr8;
                        i6 = i55;
                        sArr2 = sArr9;
                        sArr11 = sArr11;
                        editor2 = editor2;
                        iM31549 = iM31549;
                        i53 = i53;
                        i50 = i50;
                        int i620 = i52;
                        str7 = str7;
                        str9 = str9;
                        i7 = i620;
                        String str116 = str8;
                        str10 = str10;
                        str = str116;
                        int iM113019 = ThreadFactoryC3888.m11306("۟֨") ^ i46;
                        iArr6 = iArr;
                        i55 = i6;
                        sArr8 = sArr;
                        sArr9 = sArr2;
                        i48 = iM113019 ^ (-324962338);
                        i47 = ((iM113019 ^ i45) * 11263) ^ 11981103;
                        i50 = i50;
                        i53 = i53;
                        iM31549 = iM31549;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject5;
                        i32 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i32;
                        String str117 = str10;
                        str8 = str;
                        str10 = str117;
                    }
                    break;
                case -674000996:
                case -271694596:
                    iArr6 = iArr6;
                    i49 = i49;
                    int i91 = i54;
                    if (i51 >= i91) {
                        i54 = i91;
                        iM450214 = (C19806.m45029("ۤ֡") + i45) * 65;
                        i47 = ((iM450214 ^ i46) * 19915) ^ 613871072;
                        i39 = 1846776804;
                        i48 = iM450214 ^ i39;
                        i49 = i49;
                        iArr6 = iArr6;
                    } else {
                        iM450215 = (i46 - C19806.m45029("ۙܳ")) * 49;
                        i54 = i91;
                        i33 = ((iM450215 ^ i45) * 8973) ^ (-1405980939);
                        i40 = 1824549798;
                        i48 = iM450215 ^ i40;
                        i47 = i33;
                        i49 = i49;
                        iArr6 = iArr6;
                    }
                    break;
                case -520166734:
                case 1454269256:
                    RunnableC3388.m10064();
                    iM11308 = C19806.m45029("۫۠") ^ i45;
                    i41 = ((iM11308 ^ i46) * 24083) ^ (-1601093480);
                    i42 = 1650514815;
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case -517288585:
                case 815820685:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    C3660.m10783(interfaceC17314);
                    C7754.m20411();
                    DialogInterfaceOnDismissListenerC20991.m47152();
                    C21034.m47430();
                    if (C3660.f13403 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺ܿ") ^ i46) * (-59);
                        i2 = ((iM45029 ^ i45) * 17545) ^ (-417266549);
                        i3 = -1892418444;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩸") ^ i45;
                        i2 = ((iM45029 ^ i46) * 10311) ^ 1113064204;
                        i3 = 567011573;
                    }
                    i48 = iM45029 ^ i3;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i2;
                    str7 = str7;
                    i52 = i52;
                    i49 = i49;
                    iArr6 = iArr6;
                    break;
                case -509064950:
                case 1877049002:
                    str6 = strM931;
                    int i92 = iM31549;
                    jSONObject3 = jSONObject5;
                    i28 = i53;
                    iArr4 = iArr6;
                    i26 = i49;
                    i29 = i50;
                    sArr7 = sArr11;
                    int i93 = i52;
                    editor = editor2;
                    str7 = str7;
                    DialogInterfaceOnDismissListenerC5468.m15136();
                    C17403.m40566();
                    C4925.m13712();
                    ApplicationC0716.m3136();
                    i27 = i92;
                    strM45020 = str9;
                    i25 = i93;
                    String str28 = str8;
                    str10 = str10;
                    str = str28;
                    iM11307 = C19806.m45029("᩵᩶") ^ i45;
                    i30 = ((iM11307 ^ i46) * 12729) ^ (-917740659);
                    i31 = 626592867;
                    i48 = iM11307 ^ i31;
                    i50 = i29;
                    i49 = i26;
                    iArr6 = iArr4;
                    i53 = i28;
                    iM31549 = i27;
                    editor2 = editor;
                    sArr11 = sArr7;
                    jSONObject5 = jSONObject3;
                    strM931 = str6;
                    i32 = i25;
                    str9 = strM45020;
                    i47 = i30;
                    str7 = str7;
                    i52 = i32;
                    String str118 = str10;
                    str8 = str;
                    str10 = str118;
                    break;
                case -449244243:
                case 825599101:
                    C1025.m3864(new RunnableC9865());
                    C0674.m3030();
                    return;
                case -441901231:
                case 1732394056:
                    interfaceC17314.mo4065(jSONObject6.getInt(C2704.m8251(c12687)), CallableC1627.m5506(c12687));
                    i = i53;
                    str7 = str7;
                    str9 = str9;
                    int iM450226 = C19806.m45029("ܰۨ") ^ i46;
                    i7 = i52;
                    int i6113 = ((iM450226 ^ i45) * 25551) ^ 88490348;
                    i48 = iM450226 ^ (-821655173);
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i6113;
                    i49 = i49;
                    iArr6 = iArr6;
                    int i6114 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i6114;
                    break;
                case -306149015:
                case 455118985:
                    i7 = i52;
                    str = str8;
                    i57 = 49851;
                    int iM1130110 = ThreadFactoryC3888.m11306("᩶۫") ^ i45;
                    i49 = i49;
                    strM931 = strM931;
                    i55 = i55;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    i48 = iM1130110 ^ (-965950594);
                    i47 = ((iM1130110 ^ i46) * 19477) ^ 1568965035;
                    iArr6 = iArr6;
                    i50 = i50;
                    i53 = i53;
                    iM31549 = iM31549;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    jSONObject5 = jSONObject5;
                    i32 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i32;
                    String str119 = str10;
                    str8 = str;
                    str10 = str119;
                    break;
                case -9997719:
                case 1908100319:
                    str5 = strM931;
                    int i94 = iM31549;
                    JSONObject jSONObject10 = jSONObject5;
                    i53 = i53;
                    iArr3 = iArr6;
                    i21 = i49;
                    i22 = i50;
                    sArr11 = sArr11;
                    int i95 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    editor2.apply();
                    int i96 = C14804.f48396;
                    C14804.m35477();
                    C2539.m7921();
                    iM31549 = i94;
                    jSONObject5 = jSONObject10;
                    str9 = str9;
                    sArr6 = sArr9;
                    i7 = i95;
                    String str29 = str8;
                    str10 = str10;
                    str = str29;
                    iM450211 = C19806.m45029("᩵ᩴ") ^ i46;
                    i23 = ((iM450211 ^ i45) * (-1163)) ^ 1185149765;
                    i24 = -1913167740;
                    i48 = iM450211 ^ i24;
                    i47 = i23;
                    sArr9 = sArr6;
                    i50 = i22;
                    i49 = i21;
                    strM931 = str5;
                    iArr6 = iArr3;
                    i53 = i53;
                    iM31549 = iM31549;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    jSONObject5 = jSONObject5;
                    i32 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i32;
                    String str1110 = str10;
                    str8 = str;
                    str10 = str1110;
                    break;
                case 58372620:
                case 674655809:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    c12688 = (C12687) C0278.m1776(itM9863);
                    if (!jSONObject5.contains(C2704.m8251(c12688))) {
                        i4 = iM31549;
                        editorEdit = editor2;
                        str10 = str10;
                        str8 = str8;
                        i5 = i52;
                        int iM1130111 = (i45 - ThreadFactoryC3888.m11306("ܶᩳ")) * (-53);
                        SharedPreferences.Editor editor7 = editorEdit;
                        i47 = ((iM1130111 ^ i46) * 23543) ^ (-894858617);
                        i48 = iM1130111 ^ (-502341054);
                        str10 = str10;
                        sArr11 = sArr11;
                        i49 = i49;
                        jSONObject5 = jSONObject5;
                        iArr6 = iArr6;
                        strM931 = strM931;
                        str8 = str8;
                        i50 = i50;
                        i53 = i;
                        iM31549 = i4;
                        editor2 = editor7;
                        int i712 = i5;
                        str9 = str9;
                        str7 = str7;
                        i52 = i712;
                    } else {
                        iM45029 = (C19806.m45029("ۨ֡") ^ i45) * 11;
                        i2 = ((iM45029 ^ i46) * 22407) ^ (-1643678901);
                        i3 = 747792120;
                        i48 = iM45029 ^ i3;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        i50 = i50;
                        jSONObject5 = jSONObject5;
                        i53 = i;
                        strM931 = strM931;
                        iM31549 = iM31549;
                        i47 = i2;
                        str7 = str7;
                        i52 = i52;
                        i49 = i49;
                        iArr6 = iArr6;
                    }
                    break;
                case 287983705:
                case 1247149909:
                    int i97 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    SharedPreferences.Editor editor8 = editor2;
                    editor8.putInt(C2704.m8251(c12688), jSONObject5.getInt(CallableC1627.m5506(c12688)));
                    i4 = i97;
                    editorEdit = editor8;
                    int i98 = i52;
                    str7 = str7;
                    i5 = i98;
                    int iM1130112 = (i45 - ThreadFactoryC3888.m11306("ܶᩳ")) * (-53);
                    SharedPreferences.Editor editor9 = editorEdit;
                    i47 = ((iM1130112 ^ i46) * 23543) ^ (-894858617);
                    i48 = iM1130112 ^ (-502341054);
                    str10 = str10;
                    sArr11 = sArr11;
                    i49 = i49;
                    jSONObject5 = jSONObject5;
                    iArr6 = iArr6;
                    strM931 = strM931;
                    str8 = str8;
                    i50 = i50;
                    i53 = i;
                    iM31549 = i4;
                    editor2 = editor9;
                    int i713 = i5;
                    str9 = str9;
                    str7 = str7;
                    i52 = i713;
                    break;
                case 341513463:
                case 588192281:
                    String str30 = strM931;
                    jSONObject5 = jSONObject5;
                    iArr = iArr6;
                    sArr = sArr8;
                    i6 = i55;
                    sArr2 = sArr9;
                    int i99 = i49;
                    sArr11 = sArr11;
                    editor2 = editor2;
                    iM31549 = iM31549;
                    i53 = i53;
                    i50 = i50;
                    int i100 = i52;
                    str7 = str7;
                    str9 = str9;
                    i7 = i100;
                    String str31 = str8;
                    str10 = str10;
                    str = str31;
                    s2 = f12867[76];
                    if (C0671.f2816 == 0) {
                        int iM450227 = C19806.m45029("ܳۨ") ^ i45;
                        i47 = ((iM450227 ^ i46) * 27727) ^ 330672117;
                        i50 = i50;
                        strM931 = str30;
                        i55 = i6;
                        sArr8 = sArr;
                        sArr9 = sArr2;
                        i48 = iM450227 ^ (-1831015881);
                        i53 = i53;
                        iM31549 = iM31549;
                        i49 = i99;
                        editor2 = editor2;
                        iArr6 = iArr;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject5;
                        i32 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i32;
                        String str1111 = str10;
                        str8 = str;
                        str10 = str1111;
                    } else {
                        i49 = i99;
                        strM931 = str30;
                        int iM1130113 = ThreadFactoryC3888.m11306("۟֨") ^ i46;
                        iArr6 = iArr;
                        i55 = i6;
                        sArr8 = sArr;
                        sArr9 = sArr2;
                        i48 = iM1130113 ^ (-324962338);
                        i47 = ((iM1130113 ^ i45) * 11263) ^ 11981103;
                        i50 = i50;
                        i53 = i53;
                        iM31549 = iM31549;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject5;
                        i32 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i32;
                        String str1112 = str10;
                        str8 = str;
                        str10 = str1112;
                    }
                    break;
                case 433945233:
                case 2019733251:
                    iArr6 = iArr6;
                    C1066.m4033(interfaceC17314, C2704.m8251(c12687), jSONObject6.getBoolean(CallableC1627.m5506(c12687)));
                    strM931 = strM931;
                    i52 = i52;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    i50 = i50;
                    str7 = str7;
                    sArr11 = sArr11;
                    str9 = str9;
                    editor2 = editor2;
                    int iM450228 = C19806.m45029("ܰۨ") ^ i46;
                    i7 = i52;
                    int i6115 = ((iM450228 ^ i45) * 25551) ^ 88490348;
                    i48 = iM450228 ^ (-821655173);
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i6115;
                    i49 = i49;
                    iArr6 = iArr6;
                    int i6116 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i6116;
                    break;
                case 727251361:
                case 1766618985:
                    C7105.m18988(strM931, C3722.m10901(sArr11, i49, 14, i57));
                    interfaceC17314.mo4067(strM8251, Base64.decode(strM931, i50));
                    iM11308 = C19806.m45029("ۡۜ") ^ i46;
                    i41 = ((iM11308 ^ i45) * (-1429)) ^ 1836861987;
                    i42 = -1865176021;
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case 796162380:
                case 1703947465:
                    if (C3535.m10420(string, ThreadFactoryC3888.m11312(sArr10, 131, 9, i57))) {
                        iM11308 = ThreadFactoryC3888.m11306("᩶ۘ") ^ i45;
                        i41 = ((iM11308 ^ i46) * 30563) ^ (-1170803044);
                        i42 = 313105799;
                    } else {
                        iM11308 = C19806.m45029("ۡۜ") ^ i46;
                        i41 = ((iM11308 ^ i45) * (-1429)) ^ 1836861987;
                        i42 = -1865176021;
                    }
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case 800232786:
                case 2085884590:
                    if (iM31548 == 5) {
                        iM11308 = (i45 - ThreadFactoryC3888.m11306("ۨۘ")) * 127;
                        i41 = ((iM11308 ^ i46) * (-217)) ^ (-1453957041);
                        i42 = -5094335;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۜ֡") ^ i46;
                        i41 = ((iM11308 ^ i45) * 6787) ^ (-728353629);
                        i42 = 1545287447;
                    }
                    i48 = iM11308 ^ i42;
                    i47 = i41;
                    break;
                case 968303743:
                case 1809786239:
                    strM931 = strM931;
                    iM31549 = iM31549;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    C1398.m4894(interfaceC17314, C2704.m8251(c12687), jSONObject6.getString(C2704.m8251(c12687)));
                    str9 = str9;
                    int iM450229 = C19806.m45029("ܰۨ") ^ i46;
                    i7 = i52;
                    int i6117 = ((iM450229 ^ i45) * 25551) ^ 88490348;
                    i48 = iM450229 ^ (-821655173);
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i6117;
                    i49 = i49;
                    iArr6 = iArr6;
                    int i6118 = i7;
                    str9 = str9;
                    str7 = str7;
                    i52 = i6118;
                    break;
                case 997726055:
                case 1388272973:
                    str2 = strM931;
                    jSONObject5 = jSONObject5;
                    iArr = iArr6;
                    sArr3 = sArr8;
                    i8 = i55;
                    short[] sArr17 = sArr9;
                    i9 = i49;
                    sArr11 = sArr11;
                    editor2 = editor2;
                    i10 = iM31549;
                    i11 = i53;
                    i12 = i50;
                    s = s2;
                    int i101 = i52;
                    str7 = str7;
                    str9 = str9;
                    i7 = i101;
                    String str32 = str8;
                    str10 = str10;
                    str = str32;
                    int i102 = s + 6894;
                    if (C10634.f36300 < 0) {
                        int iM113020 = (i46 - ThreadFactoryC3888.m11306("᩵ܺ")) * (-101);
                        i43 = i102;
                        s2 = s;
                        i50 = i12;
                        i55 = i8;
                        sArr8 = sArr3;
                        sArr9 = sArr17;
                        i47 = ((iM113020 ^ i45) * (-4333)) ^ 927219982;
                        i48 = iM113020 ^ 450154377;
                        i53 = i11;
                        iM31549 = i10;
                        i49 = i9;
                        strM931 = str2;
                        editor2 = editor2;
                        iArr6 = iArr;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject5;
                        i32 = i7;
                        str9 = str9;
                        str7 = str7;
                        i52 = i32;
                        String str1113 = str10;
                        str8 = str;
                        str10 = str1113;
                    } else {
                        i43 = i102;
                        sArr9 = sArr17;
                        i52 = i7;
                        strM2308 = str7;
                        int iM4502111 = C19806.m45029("᩸ᩴ") ^ i46;
                        i48 = iM4502111 ^ (-410116654);
                        s2 = s;
                        i47 = ((iM4502111 ^ i45) * (-21531)) ^ (-1747990619);
                        i50 = i12;
                        i49 = i9;
                        strM931 = str2;
                        i55 = i8;
                        sArr8 = sArr3;
                        iArr6 = iArr;
                        i53 = i11;
                        iM31549 = i10;
                        editor2 = editor2;
                        sArr11 = sArr11;
                        jSONObject5 = jSONObject5;
                        String str1114 = strM2308;
                        str9 = str9;
                        str7 = str1114;
                        String str1115 = str10;
                        str8 = str;
                        str10 = str1115;
                    }
                    break;
                case 1758761418:
                case 1838347918:
                    strM931 = strM931;
                    jSONObject5 = jSONObject5;
                    i = i53;
                    iArr6 = iArr6;
                    i49 = i49;
                    i50 = i50;
                    sArr11 = sArr11;
                    i52 = i52;
                    editor2 = editor2;
                    str7 = str7;
                    iM31549 = c12688.m31548();
                    if (iM31549 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩹") ^ i46) * (-41);
                        i2 = ((iM45029 ^ i45) * (-31143)) ^ (-1311322064);
                        i3 = 1430386440;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۚ") ^ i45;
                        i2 = ((iM45029 ^ i46) * 6727) ^ (-1297669415);
                        i3 = -2048515163;
                    }
                    i48 = iM45029 ^ i3;
                    editor2 = editor2;
                    sArr11 = sArr11;
                    i50 = i50;
                    jSONObject5 = jSONObject5;
                    i53 = i;
                    strM931 = strM931;
                    iM31549 = iM31549;
                    i47 = i2;
                    str7 = str7;
                    i52 = i52;
                    i49 = i49;
                    iArr6 = iArr6;
                    break;
                default:
                    jSONObject5 = jSONObject5;
                    SharedPreferences.Editor editor10 = editor2;
                    editor10.putBoolean(CallableC1627.m5506(c12688), jSONObject5.getBoolean(CallableC1627.m5506(c12688)));
                    editorEdit = editor10;
                    i4 = iM31549;
                    i = i53;
                    int i910 = i52;
                    str7 = str7;
                    i5 = i910;
                    int iM1130114 = (i45 - ThreadFactoryC3888.m11306("ܶᩳ")) * (-53);
                    SharedPreferences.Editor editor11 = editorEdit;
                    i47 = ((iM1130114 ^ i46) * 23543) ^ (-894858617);
                    i48 = iM1130114 ^ (-502341054);
                    str10 = str10;
                    sArr11 = sArr11;
                    i49 = i49;
                    jSONObject5 = jSONObject5;
                    iArr6 = iArr6;
                    strM931 = strM931;
                    str8 = str8;
                    i50 = i50;
                    i53 = i;
                    iM31549 = i4;
                    editor2 = editor11;
                    int i714 = i5;
                    str9 = str9;
                    str7 = str7;
                    i52 = i714;
                    break;
            }
        }
    }
}
