package l;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes.dex */
public final class C5570 {

    /* JADX INFO: renamed from: ۨܳ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f19349;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f19350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f19351;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19352;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f19353;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f19354;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f19355;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f19356;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m16511();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:359:0x064d A[PHI: r28
      0x064d: PHI (r28v8 java.util.Iterator) = (r28v7 java.util.Iterator), (r28v7 java.util.Iterator), (r28v7 java.util.Iterator), (r28v10 java.util.Iterator) binds: [B:353:0x0631, B:355:0x0637, B:357:0x063f, B:350:0x0622] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:425:0x082d  */
    /* JADX WARN: Multi-variable type inference failed */
    public C5570(String str, int i) {
        String str2;
        ArrayList arrayList;
        int i2;
        byte b;
        String str3;
        LinkedHashSet linkedHashSet;
        HashMap map;
        C5570 c5570;
        String str4;
        String str5;
        String str6;
        C19740 c19740;
        Iterator it;
        String strM16509;
        C19740 c19741;
        Iterator it2;
        String strM165010;
        C19740 c19742;
        C19740 c19743;
        C19740 c19744;
        String str7;
        String str8;
        byte b2;
        String strSubstring;
        int i3;
        this.f19353 = -1;
        C15264 c15264 = new C15264(this);
        try {
            AbstractC14956 abstractC14956ListIterator = AbstractC15460.m37015(str).mo37017().listIterator(0);
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
                if (!abstractC14956ListIterator.hasNext()) {
                    Object obj = "if-gtz";
                    String str19 = ".end packed-switch";
                    c15264.m36617();
                    ArrayList<C19740> arrayList2 = c15264.f49905;
                    String str20 = "goto";
                    C5570 c5571 = this;
                    c5571.f19354 = arrayList2;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    c5571.f19355 = linkedHashSet2;
                    String str21 = ":";
                    HashMap map2 = new HashMap();
                    for (C19740 c19745 : arrayList2) {
                        String str22 = str19;
                        LinkedHashSet linkedHashSet3 = linkedHashSet2;
                        for (Iterator it3 = c19745.f63549.iterator(); it3.hasNext(); it3 = it3) {
                            map2.put((String) it3.next(), c19745);
                        }
                        linkedHashSet2 = linkedHashSet3;
                        str19 = str22;
                    }
                    String str23 = str19;
                    LinkedHashSet linkedHashSet4 = linkedHashSet2;
                    int size = arrayList2.size();
                    int i5 = 0;
                    C19740 c19746 = null;
                    while (i5 < size) {
                        HashMap map3 = map2;
                        C19740 c19747 = (C19740) arrayList2.get(i5);
                        List list = c19747.f63557;
                        String str24 = ((C21978) C7750.m21093(1, list)).f70920;
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
                                    b = cb.f82047l;
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
                                c5570 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                if (c19746 == null) {
                                    c19740 = new C19740(c5570, arrayList2.size(), new ArrayList(0));
                                    arrayList2.add(c19740);
                                } else {
                                    c19740 = c19746;
                                }
                                linkedHashSet.add(new C4824(c5570, c19747, c19740, 5));
                                c19746 = c19740;
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
                                c5570 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                int i6 = i5 + 1;
                                C19740 c19748 = i6 < size ? (C19740) arrayList2.get(i6) : null;
                                if (c19748 != null) {
                                    linkedHashSet.add(new C4824(c5570, c19747, c19748, 0));
                                }
                                C19740 c19749 = (C19740) map.get(m16509(str24));
                                if (c19749 != null) {
                                    linkedHashSet.add(new C4824(c5570, c19747, c19749, 1));
                                }
                                break;
                            case 9:
                                str10 = str10;
                                linkedHashSet = linkedHashSet4;
                                arrayList2 = arrayList3;
                                c5570 = this;
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
                                        String str27 = ((C21978) it4.next()).f70920;
                                        if (z2) {
                                            it2 = it4;
                                            if (str27.startsWith(".packed-switch ")) {
                                                z2 = false;
                                            }
                                        } else {
                                            it2 = it4;
                                            String str28 = str21;
                                            if (!str27.startsWith(str28) || (strM165010 = m16509(str27)) == null || (c19742 = (C19740) map.get(strM165010)) == null) {
                                                str21 = str28;
                                            } else {
                                                str21 = str28;
                                                linkedHashSet.add(new C4824(c5570, c19747, c19742, 2));
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
                                            String str32 = ((C21978) it5.next()).f70920;
                                            if (z3) {
                                                it = it5;
                                                if (str32.startsWith(".sparse-switch")) {
                                                    z3 = false;
                                                }
                                            } else {
                                                it = it5;
                                                if (str32.contains("->") && (strM16509 = m16509(str32)) != null && (c19741 = (C19740) map.get(strM16509)) != null) {
                                                    linkedHashSet.add(new C4824(c5570, c19747, c19741, 2));
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
                                        C19740 c197410 = i7 < size ? (C19740) arrayList2.get(i7) : null;
                                        if (c197410 != null) {
                                            linkedHashSet.add(new C4824(c5570, c19747, c197410, 0));
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
                                c5570 = this;
                                obj = obj;
                                str4 = str12;
                                str11 = str11;
                                C19740 c197411 = (C19740) map.get(m16509(str24));
                                if (c197411 != null) {
                                    linkedHashSet.add(new C4824(c5570, c19747, c197411, 4));
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
                                    c19743 = (C19740) arrayList2.get(i8);
                                } else {
                                    arrayList2 = arrayList3;
                                    c19743 = null;
                                }
                                if (c19743 != null) {
                                    c5570 = this;
                                    c19744 = c19747;
                                    C4824 c4824 = new C4824(c5570, c19744, c19743, 0);
                                    linkedHashSet = linkedHashSet4;
                                    linkedHashSet.add(c4824);
                                } else {
                                    linkedHashSet = linkedHashSet4;
                                    c5570 = this;
                                    c19744 = c19747;
                                }
                                map = map3;
                                C19740 c197412 = (C19740) map.get(m16509(str24));
                                if (c197412 != null) {
                                    str4 = str12;
                                    linkedHashSet.add(new C4824(c5570, c19744, c197412, 1));
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
                                c5570 = this;
                                obj = obj;
                                str4 = str12;
                                str5 = str23;
                                str6 = str21;
                                str11 = str11;
                                int i9 = i5 + 1;
                                C19740 c197413 = i9 < size ? (C19740) arrayList2.get(i9) : null;
                                if (c197413 != null) {
                                    linkedHashSet.add(new C4824(c5570, c19747, c197413, 0));
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
                        c5571 = c5570;
                        str10 = str10;
                    }
                    C5570 c5572 = c5571;
                    LinkedHashSet<C4824> linkedHashSet5 = c5572.f19355;
                    ArrayList arrayList4 = c5572.f19354;
                    int size2 = arrayList4.size();
                    C13027[] c13027Arr = new C13027[size2];
                    for (int i10 = 0; i10 < size2; i10++) {
                        c13027Arr[i10] = new C13027((C19740) arrayList4.get(i10));
                    }
                    for (C4824 c4825 : linkedHashSet5) {
                        c13027Arr[c4825.f16876.f63550].f41709.add(c4825);
                        c13027Arr[c4825.f16871.f63550].f41707.add(c4825);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int i11 = 0;
                    while (i11 < size2) {
                        C13027 c13027 = c13027Arr[i11];
                        boolean z4 = c13027.f41708;
                        ArrayList arrayList6 = c13027.f41709;
                        ArrayList arrayList7 = c13027.f41707;
                        C19740 c197414 = c13027.f41706;
                        if (z4) {
                            str2 = str20;
                            arrayList = arrayList4;
                            i2 = size2;
                        } else {
                            List list2 = c197414.f63557;
                            if (!list2.isEmpty() && c197414.f63549.isEmpty() && list2.size() <= 3 && ((C21978) list2.get(0)).f70920.startsWith(str20) && arrayList7.size() == 1 && arrayList6.size() == 1) {
                                C4824 c4826 = (C4824) arrayList7.get(0);
                                C4824 c4827 = (C4824) arrayList6.get(0);
                                if (c4826.f16874 == 0 && c4827.f16874 == 0) {
                                    C19740 c197415 = c4826.f16876;
                                    C19740 c197416 = c4827.f16871;
                                    C21978 c21978M45498 = c197415.m45498();
                                    ArrayList arrayList8 = c197415.f63540;
                                    str2 = str20;
                                    List list3 = c197415.f63557;
                                    i2 = size2;
                                    C21978 c21978 = (C21978) list2.get(0);
                                    int i12 = c21978M45498.f70921;
                                    arrayList = arrayList4;
                                    int i13 = i12 + 2;
                                    int i14 = c21978.f70921;
                                    if (i13 == i14) {
                                        list3.add(new C21978(i12 + 1, ""));
                                        arrayList8.add(null);
                                    } else if (i13 != i14) {
                                    }
                                    c13027Arr[c197415.f63550].f41708 = true;
                                    c13027Arr[c197416.f63550].f41708 = true;
                                    list3.addAll(list2);
                                    arrayList8.addAll(c197414.f63540);
                                    linkedHashSet5.remove(c4826);
                                    linkedHashSet5.remove(c4827);
                                    linkedHashSet5.add(new C4824(c5572, c197415, c197416, 0));
                                    arrayList5.add(c197414);
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
                            ((C19740) arrayList9.get(i15)).f63550 = i15;
                        }
                        ArrayList arrayList10 = new ArrayList(linkedHashSet5);
                        linkedHashSet5.clear();
                        linkedHashSet5.addAll(arrayList10);
                    }
                    ArrayList<C7324> arrayList11 = c15264.f49906;
                    ArrayList<C19740> arrayList12 = c5572.f19354;
                    if (arrayList11.isEmpty()) {
                        return;
                    }
                    HashMap map4 = new HashMap();
                    for (C19740 c197417 : arrayList12) {
                        Iterator it6 = c197417.f63549.iterator();
                        while (it6.hasNext()) {
                            map4.put((String) it6.next(), c197417);
                        }
                    }
                    for (C7324 c7324 : arrayList11) {
                        C19740 c197418 = (C19740) map4.get(c7324.f24134);
                        C19740 c197419 = (C19740) map4.get(c7324.f24132);
                        C19740 c197420 = (C19740) map4.get(c7324.f24131);
                        if (c197418 != null && c197419 != null && c197420 != null) {
                            c197420.m45497(c7324.f24133);
                            for (int i16 = c197418.f63550; i16 < c197419.f63550; i16++) {
                                c5572.f19355.add(new C4824(c5572, (C19740) arrayList12.get(i16), c197420, 3));
                            }
                        }
                    }
                    return;
                }
                int i17 = i4 + 1;
                String strTrim = ((String) abstractC14956ListIterator.next()).trim();
                AbstractC14956 abstractC14956 = abstractC14956ListIterator;
                if (strTrim.startsWith(".registers ") || strTrim.startsWith(".locals ") || strTrim.startsWith(".param ") || strTrim.startsWith(".annotation ")) {
                    c15264.m36617();
                } else {
                    if (strTrim.startsWith(".end param") || strTrim.startsWith(".end annotation")) {
                        c15264.f49907.clear();
                    } else {
                        if (strTrim.startsWith(":") && z) {
                            ArrayList arrayList13 = new ArrayList();
                            while (true) {
                                if (c15264.f49907.isEmpty()) {
                                    str15 = str15;
                                    str7 = str16;
                                    str8 = str17;
                                } else {
                                    str8 = str17;
                                    C21978 c21979 = (C21978) j$$ExternalSyntheticOutline0.m(c15264.f49907, 1);
                                    str7 = str16;
                                    int iIndexOf2 = c21979.f70920.indexOf(32);
                                    if (iIndexOf2 == -1) {
                                        strSubstring = c21979.f70920;
                                        i3 = 0;
                                    } else {
                                        strSubstring = c21979.f70920.substring(0, iIndexOf2);
                                        i3 = 0;
                                    }
                                    if (!strSubstring.matches("[a-z0-9\\-/]+")) {
                                        arrayList13.add(i3, c21979);
                                        C2764.m9138(c15264.f49907, 1);
                                        str17 = str8;
                                        str16 = str7;
                                        str15 = str15;
                                    }
                                }
                            }
                            c15264.m36617();
                            c15264.f49907 = arrayList13;
                            z = false;
                        } else {
                            str15 = "if-gez";
                            str7 = "if-eqz";
                            str8 = "return-wide";
                        }
                        if (strTrim.startsWith(".catch ") || strTrim.startsWith(".catchall ")) {
                            Matcher matcher = f19350.matcher(strTrim);
                            C7324 c7325 = matcher.find() ? new C7324(new C21978(i4, strTrim), matcher.group(1), matcher.group(2), matcher.group(3)) : null;
                            if (c7325 != null) {
                                c15264.f49906.add(c7325);
                            }
                        } else {
                            z = z;
                            str14 = "if-gtz";
                        }
                        c15264.f49907.add(new C21978(i4, strTrim));
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
                                    b2 = cb.f82047l;
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
                                c15264.m36617();
                                break;
                            case 9:
                                if (strTrim.startsWith(".end packed-switch") || strTrim.startsWith(str18)) {
                                    c15264.m36617();
                                }
                                break;
                            default:
                                continue;
                        }
                        z = false;
                    }
                    i4 = i17;
                    abstractC14956ListIterator = abstractC14956;
                }
                z = false;
                i4 = i17;
                abstractC14956ListIterator = abstractC14956;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16512() {
        Paint paint = new Paint(1);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C14035.f44479 * 18.0f);
        Iterator it = this.f19354.iterator();
        while (it.hasNext()) {
            ((C19740) it.next()).m45495(paint);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16509(String str) {
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
    public final C19740 m16510(PointF pointF) {
        for (C19740 c19740 : this.f19354) {
            float fM45501 = c19740.m45501();
            float fM45502 = c19740.m45502() + fM45501;
            float fM45500 = c19740.m45500();
            float fM45492 = c19740.m45492() + fM45500;
            float f = pointF.x;
            if (fM45501 <= f && f <= fM45502) {
                float f2 = pointF.y;
                if (fM45500 <= f2 && f2 <= fM45492) {
                    return c19740;
                }
            }
        }
        return null;
    }

    static {
        ApplicationC23172.m52091(64);
        f19349 = new short[]{4259, -26024, -30229, 18792, -11237, -11220, -11220, -11215, -11220};
        f19350 = Pattern.compile("\\{\\s*(:[a-zA-Z0-9_$]+)\\s*\\.\\.\\s*(:[a-zA-Z0-9_$]+)\\s*\\}\\s*(:[a-zA-Z0-9_$]+)");
    }

    public C5570(C20348 c20348) {
        this.f19353 = -1;
        if (c20348.readInt() != 1986488099) {
            throw new RuntimeException();
        }
        this.f19356 = c20348.readInt();
        this.f19352 = c20348.readInt();
        this.f19353 = c20348.readInt();
        int i = c20348.readInt();
        this.f19354 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f19354.add(new C19740(this, c20348));
        }
        int i3 = c20348.readInt();
        this.f19355 = new LinkedHashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.f19355.add(new C4824(this, c20348));
        }
    }
}
