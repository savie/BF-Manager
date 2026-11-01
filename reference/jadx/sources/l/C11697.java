package l;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۨ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes.dex */
public final class C11697 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f39317;

    /* JADX INFO: renamed from: ᩶ܺ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f39318;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f39319;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f39320;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39321;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f39322;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f39323;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f39324;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m29210();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:359:0x064d A[PHI: r28
      0x064d: PHI (r28v8 java.util.Iterator) = (r28v7 java.util.Iterator), (r28v7 java.util.Iterator), (r28v7 java.util.Iterator), (r28v10 java.util.Iterator) binds: [B:353:0x0631, B:355:0x0637, B:357:0x063f, B:350:0x0622] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:425:0x082d  */
    /* JADX WARN: Multi-variable type inference failed */
    public C11697(String str, int i) {
        String str2;
        ArrayList arrayList;
        int i2;
        byte b;
        String str3;
        LinkedHashSet linkedHashSet;
        HashMap map;
        C11697 c11697;
        String str4;
        String str5;
        String str6;
        C3353 c3353;
        Iterator it;
        String strM29208;
        C3353 c3354;
        Iterator it2;
        String strM29209;
        C3353 c3355;
        C3353 c3356;
        C3353 c3357;
        String str7;
        String str8;
        byte b2;
        String strSubstring;
        int i3;
        this.f39324 = -1;
        C4640 c4640 = new C4640(this);
        try {
            AbstractC16706 abstractC16706ListIterator = AbstractC3632.m10736(str).mo3382().listIterator(0);
            int i4 = i;
            boolean z = false;
            while (true) {
                String str9 = ".end";
                String str10 = "return";
                String str11 = "if-nez";
                String str12 = "if-ltz";
                String str13 = "if-lez";
                String str14 = "if-gtz";
                String str15 = "if-gez";
                String str16 = "if-eqz";
                String str17 = "return-wide";
                String str18 = ".end sparse-switch";
                if (!abstractC16706ListIterator.hasNext()) {
                    Object obj = "if-gtz";
                    String str19 = ".end packed-switch";
                    c4640.m12811();
                    ArrayList<C3353> arrayList2 = c4640.f16394;
                    String str20 = "goto";
                    C11697 c11698 = this;
                    c11698.f39321 = arrayList2;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    c11698.f39323 = linkedHashSet2;
                    String str21 = ":";
                    HashMap map2 = new HashMap();
                    for (C3353 c3358 : arrayList2) {
                        String str22 = str19;
                        LinkedHashSet linkedHashSet3 = linkedHashSet2;
                        for (Iterator it3 = c3358.f12404.iterator(); it3.hasNext(); it3 = it3) {
                            map2.put((String) it3.next(), c3358);
                        }
                        linkedHashSet2 = linkedHashSet3;
                        str19 = str22;
                    }
                    String str23 = str19;
                    LinkedHashSet linkedHashSet4 = linkedHashSet2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    C3353 c3359 = null;
                    while (i5 < size) {
                        HashMap map3 = map2;
                        C3353 c33510 = (C3353) arrayList2.get(i5);
                        List list = c33510.f12405;
                        String str24 = ((C14644) C3012.m8974(1, list)).f47887;
                        int iIndexOf = str24.indexOf(32);
                        ArrayList arrayList3 = arrayList2;
                        String strSubstring2 = iIndexOf == -1 ? str24 : str24.substring(0, iIndexOf);
                        strSubstring2.getClass();
                        switch (strSubstring2.hashCode()) {
                            case -1532365807:
                                if (strSubstring2.equals("return-void")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1532341936:
                                if (strSubstring2.equals("return-wide")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193266018:
                                if (strSubstring2.equals("if-eqz")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193264468:
                                if (strSubstring2.equals("if-gez")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193264003:
                                if (strSubstring2.equals(obj)) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193259663:
                                if (strSubstring2.equals(str13)) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193259198:
                                if (strSubstring2.equals(str12)) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1193257741:
                                if (strSubstring2.equals(str11)) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -934396624:
                                if (strSubstring2.equals(str10)) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1470957:
                                if (strSubstring2.equals(str9)) {
                                    b = 9;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 3178851:
                                if (strSubstring2.equals(str20)) {
                                    b = 10;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100054876:
                                if (strSubstring2.equals("if-eq")) {
                                    b = 11;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100054926:
                                if (strSubstring2.equals("if-ge")) {
                                    b = 12;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100054941:
                                if (strSubstring2.equals("if-gt")) {
                                    b = cb.k;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100055081:
                                if (strSubstring2.equals("if-le")) {
                                    b = cb.f77931l;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100055096:
                                if (strSubstring2.equals("if-lt")) {
                                    b = 15;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 100055143:
                                if (strSubstring2.equals("if-ne")) {
                                    b = 16;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 110339814:
                                if (strSubstring2.equals("throw")) {
                                    b = 17;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 211916369:
                                if (strSubstring2.equals("goto/16")) {
                                    b = 18;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 211916427:
                                if (strSubstring2.equals("goto/32")) {
                                    b = 19;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 302833181:
                                if (strSubstring2.equals("throw-verification-error")) {
                                    b = 20;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 357866108:
                                if (strSubstring2.equals("return-object")) {
                                    b = 21;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 489643561:
                                if (strSubstring2.equals("packed-switch")) {
                                    b = 22;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 750443003:
                                if (strSubstring2.equals("return-void-barrier")) {
                                    b = 23;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1677267841:
                                if (strSubstring2.equals("sparse-switch")) {
                                    b = 24;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2018064103:
                                if (strSubstring2.equals("return-void-no-barrier")) {
                                    b = 25;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                            case 8:
                            case 17:
                            case 20:
                            case 21:
                            case 23:
                            case 25:
                                str9 = str9;
                                str10 = str10;
                                str3 = str13;
                                linkedHashSet = linkedHashSet4;
                                map = map3;
                                arrayList2 = arrayList3;
                                c11697 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                if (c3359 == null) {
                                    c3353 = new C3353(c11697, arrayList2.size(), new ArrayList(0));
                                    arrayList2.add(c3353);
                                } else {
                                    c3353 = c3359;
                                }
                                linkedHashSet.add(new C23816(c11697, c33510, c3353, 5));
                                c3359 = c3353;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                                str9 = str9;
                                str10 = str10;
                                str3 = str13;
                                linkedHashSet = linkedHashSet4;
                                map = map3;
                                arrayList2 = arrayList3;
                                c11697 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                int i6 = i5 + 1;
                                C3353 c33511 = i6 < size ? (C3353) arrayList2.get(i6) : null;
                                if (c33511 != null) {
                                    linkedHashSet.add(new C23816(c11697, c33510, c33511, 0));
                                }
                                C3353 c33512 = (C3353) map.get(m29208(str24));
                                if (c33512 != null) {
                                    linkedHashSet.add(new C23816(c11697, c33510, c33512, 1));
                                }
                                break;
                            case 9:
                                str10 = str10;
                                linkedHashSet = linkedHashSet4;
                                arrayList2 = arrayList3;
                                c11697 = this;
                                obj = obj;
                                str4 = str12;
                                String str25 = str23;
                                str9 = str9;
                                map = map3;
                                str11 = str11;
                                if (str24.startsWith(str25)) {
                                    Iterator it4 = list.iterator();
                                    boolean z2 = true;
                                    while (it4.hasNext()) {
                                        String str26 = str25;
                                        String str27 = ((C14644) it4.next()).f47887;
                                        if (z2) {
                                            it2 = it4;
                                            if (str27.startsWith(".packed-switch ")) {
                                                z2 = false;
                                            }
                                        } else {
                                            it2 = it4;
                                            String str28 = str21;
                                            if (!str27.startsWith(str28) || (strM29209 = m29208(str27)) == null || (c3355 = (C3353) map.get(strM29209)) == null) {
                                                str21 = str28;
                                            } else {
                                                str21 = str28;
                                                linkedHashSet.add(new C23816(c11697, c33510, c3355, 2));
                                            }
                                        }
                                        it4 = it2;
                                        str25 = str26;
                                        str13 = str13;
                                    }
                                    str5 = str25;
                                    str3 = str13;
                                    str6 = str21;
                                } else {
                                    str5 = str25;
                                    str3 = str13;
                                    String str29 = str21;
                                    String str30 = str18;
                                    if (str24.startsWith(str30)) {
                                        Iterator it5 = list.iterator();
                                        boolean z3 = true;
                                        while (it5.hasNext()) {
                                            String str31 = str30;
                                            String str32 = ((C14644) it5.next()).f47887;
                                            if (z3) {
                                                it = it5;
                                                if (str32.startsWith(".sparse-switch")) {
                                                    z3 = false;
                                                }
                                            } else {
                                                it = it5;
                                                if (str32.contains("->") && (strM29208 = m29208(str32)) != null && (c3354 = (C3353) map.get(strM29208)) != null) {
                                                    linkedHashSet.add(new C23816(c11697, c33510, c3354, 2));
                                                }
                                            }
                                            it5 = it;
                                            str30 = str31;
                                            str29 = str29;
                                        }
                                        str18 = str30;
                                        str6 = str29;
                                    } else {
                                        str18 = str30;
                                        str6 = str29;
                                        int i7 = i5 + 1;
                                        C3353 c33513 = i7 < size ? (C3353) arrayList2.get(i7) : null;
                                        if (c33513 != null) {
                                            linkedHashSet.add(new C23816(c11697, c33510, c33513, 0));
                                        }
                                    }
                                }
                                break;
                            case 10:
                            case 18:
                            case 19:
                                str9 = str9;
                                str10 = str10;
                                linkedHashSet = linkedHashSet4;
                                map = map3;
                                arrayList2 = arrayList3;
                                c11697 = this;
                                obj = obj;
                                str4 = str12;
                                str11 = str11;
                                C3353 c33514 = (C3353) map.get(m29208(str24));
                                if (c33514 != null) {
                                    linkedHashSet.add(new C23816(c11697, c33510, c33514, 4));
                                }
                                str3 = str13;
                                str5 = str23;
                                str6 = str21;
                                break;
                            case 22:
                            case 24:
                                int i8 = i5 + 1;
                                if (i8 < size) {
                                    arrayList2 = arrayList3;
                                    c3356 = (C3353) arrayList2.get(i8);
                                } else {
                                    arrayList2 = arrayList3;
                                    c3356 = null;
                                }
                                if (c3356 != null) {
                                    c11697 = this;
                                    c3357 = c33510;
                                    C23816 c23816 = new C23816(c11697, c3357, c3356, 0);
                                    linkedHashSet = linkedHashSet4;
                                    linkedHashSet.add(c23816);
                                } else {
                                    linkedHashSet = linkedHashSet4;
                                    c11697 = this;
                                    c3357 = c33510;
                                }
                                map = map3;
                                C3353 c33515 = (C3353) map.get(m29208(str24));
                                if (c33515 != null) {
                                    str4 = str12;
                                    linkedHashSet.add(new C23816(c11697, c3357, c33515, 1));
                                } else {
                                    str4 = str12;
                                }
                                str3 = str13;
                                str5 = str23;
                                str6 = str21;
                                break;
                            default:
                                str9 = str9;
                                str10 = str10;
                                str3 = str13;
                                linkedHashSet = linkedHashSet4;
                                map = map3;
                                arrayList2 = arrayList3;
                                c11697 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                int i9 = i5 + 1;
                                C3353 c33516 = i9 < size ? (C3353) arrayList2.get(i9) : null;
                                if (c33516 != null) {
                                    linkedHashSet.add(new C23816(c11697, c33510, c33516, 0));
                                }
                                break;
                        }
                        i5++;
                        map2 = map;
                        str12 = str4;
                        str21 = str6;
                        str11 = str11;
                        str23 = str5;
                        str9 = str9;
                        obj = obj;
                        str13 = str3;
                        linkedHashSet4 = linkedHashSet;
                        c11698 = c11697;
                        str10 = str10;
                    }
                    C11697 c11699 = c11698;
                    LinkedHashSet<C23816> linkedHashSet5 = c11699.f39323;
                    ArrayList arrayList4 = c11699.f39321;
                    int size2 = arrayList4.size();
                    C13814[] c13814Arr = new C13814[size2];
                    for (int i10 = 0; i10 < size2; i10++) {
                        c13814Arr[i10] = new C13814((C3353) arrayList4.get(i10));
                    }
                    for (C23816 c23817 : linkedHashSet5) {
                        c13814Arr[c23817.f77017.f12423].f45597.add(c23817);
                        c13814Arr[c23817.f77011.f12423].f45599.add(c23817);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int i11 = 0;
                    while (i11 < size2) {
                        C13814 c13814 = c13814Arr[i11];
                        boolean z4 = c13814.f45600;
                        ArrayList arrayList6 = c13814.f45597;
                        ArrayList arrayList7 = c13814.f45599;
                        C3353 c33517 = c13814.f45598;
                        if (z4) {
                            str2 = str20;
                            arrayList = arrayList4;
                            i2 = size2;
                        } else {
                            List list2 = c33517.f12405;
                            if (!list2.isEmpty() && c33517.f12404.isEmpty() && list2.size() <= 3 && ((C14644) list2.get(0)).f47887.startsWith(str20) && arrayList7.size() == 1 && arrayList6.size() == 1) {
                                C23816 c23818 = (C23816) arrayList7.get(0);
                                C23816 c23819 = (C23816) arrayList6.get(0);
                                if (c23818.f77013 == 0 && c23819.f77013 == 0) {
                                    C3353 c33518 = c23818.f77017;
                                    C3353 c33519 = c23819.f77011;
                                    C14644 c14644M10006 = c33518.m10006();
                                    ArrayList arrayList8 = c33518.f12406;
                                    str2 = str20;
                                    List list3 = c33518.f12405;
                                    i2 = size2;
                                    C14644 c14644 = (C14644) list2.get(0);
                                    int i12 = c14644M10006.f47888;
                                    arrayList = arrayList4;
                                    int i13 = i12 + 2;
                                    int i14 = c14644.f47888;
                                    if (i13 == i14) {
                                        list3.add(new C14644(i12 + 1, ""));
                                        arrayList8.add(null);
                                    } else if (i13 != i14) {
                                    }
                                    c13814Arr[c33518.f12423].f45600 = true;
                                    c13814Arr[c33519.f12423].f45600 = true;
                                    list3.addAll(list2);
                                    arrayList8.addAll(c33517.f12406);
                                    linkedHashSet5.remove(c23818);
                                    linkedHashSet5.remove(c23819);
                                    linkedHashSet5.add(new C23816(c11699, c33518, c33519, 0));
                                    arrayList5.add(c33517);
                                } else {
                                    str2 = str20;
                                    arrayList = arrayList4;
                                    i2 = size2;
                                }
                            } else {
                                str2 = str20;
                                arrayList = arrayList4;
                                i2 = size2;
                            }
                        }
                        i11++;
                        size2 = i2;
                        str20 = str2;
                        arrayList4 = arrayList;
                    }
                    ArrayList arrayList9 = arrayList4;
                    if (!arrayList5.isEmpty()) {
                        arrayList9.removeAll(arrayList5);
                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                            ((C3353) arrayList9.get(i15)).f12423 = i15;
                        }
                        ArrayList arrayList10 = new ArrayList(linkedHashSet5);
                        linkedHashSet5.clear();
                        linkedHashSet5.addAll(arrayList10);
                    }
                    ArrayList<C6176> arrayList11 = c4640.f16395;
                    ArrayList<C3353> arrayList12 = c11699.f39321;
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    HashMap map4 = new HashMap();
                    for (C3353 c33520 : arrayList12) {
                        Iterator it6 = c33520.f12404.iterator();
                        while (it6.hasNext()) {
                            map4.put((String) it6.next(), c33520);
                        }
                    }
                    for (C6176 c6176 : arrayList11) {
                        C3353 c33521 = (C3353) map4.get(c6176.f21043);
                        C3353 c33522 = (C3353) map4.get(c6176.f21045);
                        C3353 c33523 = (C3353) map4.get(c6176.f21044);
                        if (c33521 != null && c33522 != null && c33523 != null) {
                            c33523.m10003(c6176.f21046);
                            for (int i16 = c33521.f12423; i16 < c33522.f12423; i16++) {
                                c11699.f39323.add(new C23816(c11699, (C3353) arrayList12.get(i16), c33523, 3));
                            }
                        }
                    }
                    return;
                }
                int i17 = i4 + 1;
                String strTrim = ((String) abstractC16706ListIterator.next()).trim();
                AbstractC16706 abstractC16706 = abstractC16706ListIterator;
                if (strTrim.startsWith(".registers ") || strTrim.startsWith(".locals ") || strTrim.startsWith(".param ") || strTrim.startsWith(".annotation ")) {
                    c4640.m12811();
                } else {
                    if (strTrim.startsWith(".end param") || strTrim.startsWith(".end annotation")) {
                        c4640.f16396.clear();
                    } else {
                        if (strTrim.startsWith(":") && z) {
                            ArrayList arrayList13 = new ArrayList();
                            while (true) {
                                if (c4640.f16396.isEmpty()) {
                                    str15 = str15;
                                    str7 = str16;
                                    str8 = str17;
                                } else {
                                    str8 = str17;
                                    C14644 c14645 = (C14644) C19084.m43861(c4640.f16396, 1);
                                    str7 = str16;
                                    int iIndexOf2 = c14645.f47887.indexOf(32);
                                    if (iIndexOf2 == -1) {
                                        strSubstring = c14645.f47887;
                                        i3 = 0;
                                    } else {
                                        strSubstring = c14645.f47887.substring(0, iIndexOf2);
                                        i3 = 0;
                                    }
                                    if (!strSubstring.matches("[a-z0-9\\-/]+")) {
                                        arrayList13.add(i3, c14645);
                                        C19028.m43762(c4640.f16396, 1);
                                        str17 = str8;
                                        str16 = str7;
                                        str15 = str15;
                                    }
                                }
                            }
                            c4640.m12811();
                            c4640.f16396 = arrayList13;
                            z = false;
                        } else {
                            str15 = "if-gez";
                            str7 = "if-eqz";
                            str8 = "return-wide";
                        }
                        if (strTrim.startsWith(".catch ") || strTrim.startsWith(".catchall ")) {
                            Matcher matcher = f39317.matcher(strTrim);
                            C6176 c6177 = matcher.find() ? new C6176(new C14644(i4, strTrim), matcher.group(1), matcher.group(2), matcher.group(3)) : null;
                            if (c6177 != null) {
                                c4640.f16395.add(c6177);
                            }
                        } else {
                            z = z;
                            str14 = "if-gtz";
                        }
                        c4640.f16396.add(new C14644(i4, strTrim));
                        int iIndexOf3 = strTrim.indexOf(32);
                        String strSubstring3 = iIndexOf3 == -1 ? strTrim : strTrim.substring(0, iIndexOf3);
                        z = strSubstring3.matches("[a-z0-9\\-/]+") ? true : z;
                        switch (strSubstring3.hashCode()) {
                            case -1532365807:
                                if (strSubstring3.equals("return-void")) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1532341936:
                                if (strSubstring3.equals(str8)) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193266018:
                                if (strSubstring3.equals(str7)) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193264468:
                                if (strSubstring3.equals(str15)) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193264003:
                                if (strSubstring3.equals(str14)) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193259663:
                                if (strSubstring3.equals("if-lez")) {
                                    b2 = 5;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193259198:
                                if (strSubstring3.equals("if-ltz")) {
                                    b2 = 6;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -1193257741:
                                if (strSubstring3.equals("if-nez")) {
                                    b2 = 7;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -934396624:
                                if (strSubstring3.equals("return")) {
                                    b2 = 8;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1470957:
                                if (strSubstring3.equals(".end")) {
                                    b2 = 9;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 3178851:
                                if (strSubstring3.equals("goto")) {
                                    b2 = 10;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100054876:
                                if (strSubstring3.equals("if-eq")) {
                                    b2 = 11;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100054926:
                                if (strSubstring3.equals("if-ge")) {
                                    b2 = 12;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100054941:
                                if (strSubstring3.equals("if-gt")) {
                                    b2 = cb.k;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100055081:
                                if (strSubstring3.equals("if-le")) {
                                    b2 = cb.f77931l;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100055096:
                                if (strSubstring3.equals("if-lt")) {
                                    b2 = 15;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 100055143:
                                if (strSubstring3.equals("if-ne")) {
                                    b2 = 16;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 110339814:
                                if (strSubstring3.equals("throw")) {
                                    b2 = 17;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 211916369:
                                if (strSubstring3.equals("goto/16")) {
                                    b2 = 18;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 211916427:
                                if (strSubstring3.equals("goto/32")) {
                                    b2 = 19;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 302833181:
                                if (strSubstring3.equals("throw-verification-error")) {
                                    b2 = 20;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 357866108:
                                if (strSubstring3.equals("return-object")) {
                                    b2 = 21;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 489643561:
                                if (strSubstring3.equals("packed-switch")) {
                                    b2 = 22;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 750443003:
                                if (strSubstring3.equals("return-void-barrier")) {
                                    b2 = 23;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1677267841:
                                if (strSubstring3.equals("sparse-switch")) {
                                    b2 = 24;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2018064103:
                                if (strSubstring3.equals("return-void-no-barrier")) {
                                    b2 = 25;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                c4640.m12811();
                                break;
                            case 9:
                                if (strTrim.startsWith(".end packed-switch") || strTrim.startsWith(str18)) {
                                    c4640.m12811();
                                }
                                break;
                            default:
                                continue;
                        }
                        z = false;
                    }
                    i4 = i17;
                    abstractC16706ListIterator = abstractC16706;
                }
                z = false;
                i4 = i17;
                abstractC16706ListIterator = abstractC16706;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29211() {
        Paint paint = new Paint(1);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C11116.f37734 * 18.0f);
        Iterator it = this.f39321.iterator();
        while (it.hasNext()) {
            ((C3353) it.next()).m10001(paint);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29208(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return null;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        int iIndexOf3 = str.indexOf(35, i);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        if (iIndexOf3 == -1) {
            iIndexOf3 = str.length();
        }
        return str.substring(iIndexOf, Math.min(iIndexOf2, iIndexOf3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3353 m29209(PointF pointF) {
        for (C3353 c3353 : this.f39321) {
            float fM10008 = c3353.m10008();
            float fM10004 = c3353.m10004() + fM10008;
            float fM9995 = c3353.m9995();
            float fM9998 = c3353.m9998() + fM9995;
            float f = pointF.x;
            if (fM10008 <= f && f <= fM10004) {
                float f2 = pointF.y;
                if (fM9995 <= f2 && f2 <= fM9998) {
                    return c3353;
                }
            }
        }
        return null;
    }

    static {
        ApplicationC6132.m17119(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        f39318 = new short[]{5182, 19261, -16837, 32269, 8890, 8845, 8845, 8848, 8845};
        f39317 = Pattern.compile("\\{\\s*(:[a-zA-Z0-9_$]+)\\s*\\.\\.\\s*(:[a-zA-Z0-9_$]+)\\s*\\}\\s*(:[a-zA-Z0-9_$]+)");
    }

    public C11697(C17367 c17367) {
        this.f39324 = -1;
        if (c17367.readInt() != 1986488099) {
            throw new RuntimeException();
        }
        this.f39319 = c17367.readInt();
        this.f39322 = c17367.readInt();
        this.f39324 = c17367.readInt();
        int i = c17367.readInt();
        this.f39321 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f39321.add(new C3353(this, c17367));
        }
        int i3 = c17367.readInt();
        this.f39323 = new LinkedHashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.f39323.add(new C23816(this, c17367));
        }
    }
}
