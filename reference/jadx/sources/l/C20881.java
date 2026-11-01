package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20881 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9116 f67817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f67818 = new ArrayList();

    public C20881(C9116 c9116) {
        this.f67817 = c9116;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46932(C15943 c15943, EnumC7475 enumC7475) {
        Set setMo19969 = enumC7475.mo19969(c15943);
        if (setMo19969 != null) {
            if (setMo19969.size() > 1) {
                ArrayList arrayList = new ArrayList(setMo19969);
                C15943 c15943M37898 = ((C15943) arrayList.get(0)).m37898();
                for (int i = 1; i < arrayList.size(); i++) {
                    c15943M37898.m37901((C15943) arrayList.get(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m46933(String str, String str2) {
        if (!str.equals(str2)) {
            EnumC12643 enumC12643M31422 = EnumC12643.m31422(str);
            EnumC12643 enumC12643M31423 = EnumC12643.m31422(str2);
            boolean z = enumC12643M31422.f42238;
            if (!z || enumC12643M31423.f42238) {
                if (!z && enumC12643M31423.f42238) {
                    return str2;
                }
                if (z) {
                    EnumC12643 enumC12643 = EnumC12643.INT;
                    if ((enumC12643M31422 == enumC12643 && enumC12643M31423 == EnumC12643.BOOLEAN) || (enumC12643M31423 == enumC12643 && enumC12643M31422 == EnumC12643.BOOLEAN)) {
                        return "I";
                    }
                    if (enumC12643M31422 != enumC12643M31423) {
                        throw new RuntimeException();
                    }
                    if (enumC12643M31422 == enumC12643) {
                        for (int i = 3; i >= 0; i--) {
                            String str3 = C20176.f65490[i];
                            if (str.equals(str3) || str2.equals(str3)) {
                                return str3;
                            }
                        }
                        return "I";
                    }
                    if (enumC12643M31422 == EnumC12643.OBJECT) {
                        int iM46924 = m46924(str);
                        int iM46925 = m46924(str2);
                        if (iM46924 == 0 || iM46925 == 0) {
                            if (!str.equals(str2) && ("L".endsWith(str) || (!"L".equals(str2) && str.compareTo(str2) <= 0))) {
                                return str2;
                            }
                        } else {
                            String strSubstring = str.substring(iM46924);
                            String strSubstring2 = str2.substring(iM46925);
                            if (iM46924 < iM46925) {
                                if (strSubstring2.charAt(0) != 'L') {
                                    iM46925--;
                                }
                                return m46925(iM46925, "L");
                            }
                            if (iM46924 > iM46925) {
                                if (strSubstring.charAt(0) != 'L') {
                                    iM46924--;
                                }
                                return m46925(iM46924, "L");
                            }
                            if (strSubstring.charAt(0) != 'L' || strSubstring2.charAt(0) != 'L') {
                                return m46925(iM46924 - 1, "L");
                            }
                            return m46925(iM46924, "L");
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    return EnumC12643.m31423(enumC12643M31422, enumC12643M31423).f42239;
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46925(int i, String str) {
        if (i == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('[');
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46924(String str) {
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46930(AbstractC7124 abstractC7124, boolean z) {
        int i = C21586.f70041[abstractC7124.f23822.ordinal()];
        if (i == 1) {
            AbstractC18413 abstractC18413 = (AbstractC18413) abstractC7124;
            EnumC9947 enumC9947 = abstractC18413.f23823;
            switch (C21586.f70042[enumC9947.ordinal()]) {
                case 2:
                    C5007 c5007 = (C5007) abstractC18413;
                    m46928(c5007, c5007.f17419);
                    return;
                case 3:
                case 4:
                case 5:
                    C3595 c3595 = (C3595) abstractC18413;
                    String str = c3595.f13229;
                    if (str == null && enumC9947 == EnumC9947.EXCEPTION_REF) {
                        str = "Ljava/lang/Throwable;";
                    }
                    m46928(c3595, str);
                    return;
                case 6:
                    C6418 c6418 = (C6418) abstractC18413;
                    String str2 = c6418.f21734;
                    if (z) {
                        m46928(c6418, str2);
                        return;
                    } else {
                        m46934(c6418, str2);
                        return;
                    }
                case 7:
                    C14760 c14760 = (C14760) abstractC18413;
                    Object obj = c14760.f48276;
                    if (obj instanceof String) {
                        m46928(c14760, "Ljava/lang/String;");
                        return;
                    }
                    if (obj instanceof C1686) {
                        m46928(c14760, "Ljava/lang/Class;");
                        return;
                    }
                    if (!(obj instanceof Number)) {
                        if (obj instanceof Character) {
                            m46928(c14760, "C");
                            return;
                        } else {
                            m46928(c14760, "L");
                            return;
                        }
                    }
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        int iIntValue = ((Number) obj).intValue();
                        if (iIntValue == 0) {
                            m46928(c14760, EnumC12643.ZIFL.f42239);
                            return;
                        } else if (iIntValue == 1) {
                            m46928(c14760, EnumC12643.ZIF.f42239);
                            return;
                        } else {
                            m46928(c14760, EnumC12643.IF.f42239);
                            return;
                        }
                    }
                    if (obj instanceof Long) {
                        m46928(c14760, "w");
                        return;
                    } else if (obj instanceof Float) {
                        m46928(c14760, "F");
                        return;
                    } else {
                        if (obj instanceof Double) {
                            m46928(c14760, "D");
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
        }
        if (i == 2) {
            AbstractC7830 abstractC7830 = (AbstractC7830) abstractC7124;
            AbstractC7124 abstractC7125 = abstractC7830.f25764;
            switch (C21586.f70042[abstractC7830.f23823.ordinal()]) {
                case 8:
                    C23932 c23932 = (C23932) abstractC7830;
                    String str3 = c23932.f77509;
                    if (str3.equals("B")) {
                        EnumC12643 enumC12643 = EnumC12643.ZI;
                        m46934(abstractC7125, enumC12643.f42239);
                        m46928(abstractC7830, enumC12643.f42239);
                    } else {
                        m46934(abstractC7125, c23932.f77510);
                        m46928(abstractC7830, str3);
                    }
                    break;
                case 9:
                    C9821 c9821 = (C9821) abstractC7830;
                    String str4 = c9821.f33569;
                    if (z) {
                        m46928(c9821, str4);
                    } else {
                        m46934(c9821, str4);
                    }
                    if (abstractC7125 != null) {
                        m46934(abstractC7125, c9821.f33568);
                    }
                    break;
                case 10:
                    C14886 c14886 = (C14886) abstractC7830;
                    m46928(c14886, c14886.f48643);
                    m46934(abstractC7125, "L");
                    break;
                case 11:
                    m46928((C14886) abstractC7830, "Z");
                    m46934(abstractC7125, "L");
                    break;
                case 12:
                    C14886 c14887 = (C14886) abstractC7830;
                    m46928(c14887, "[" + c14887.f48643);
                    m46934(abstractC7125, "I");
                    break;
                case 13:
                    m46928((C17707) abstractC7830, "I");
                    m46934(abstractC7125, "[?");
                    break;
                case 14:
                case 15:
                    C17707 c17707 = (C17707) abstractC7830;
                    String str5 = c17707.f56229;
                    m46928(c17707, str5);
                    m46934(abstractC7125, str5);
                    break;
            }
            if (abstractC7125 != null) {
                m46930(abstractC7125, true);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            AbstractC8536 abstractC8536 = (AbstractC8536) abstractC7124;
            AbstractC7124[] abstractC7124Arr = abstractC8536.f29544;
            switch (C21586.f70042[abstractC8536.f23823.ordinal()]) {
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                    AbstractC17581 abstractC17581 = (AbstractC17581) abstractC8536;
                    String strM34050 = abstractC17581.mo12099().m34050();
                    m46928(abstractC8536, strM34050);
                    m46934(abstractC8536, strM34050);
                    String[] strArrM34051 = abstractC17581.mo12099().m34051();
                    if (strArrM34051.length != abstractC7124Arr.length) {
                        if (strArrM34051.length + 1 != abstractC7124Arr.length) {
                            throw new RuntimeException();
                        }
                        m46934(abstractC7124Arr[0], "L");
                        for (int i2 = 1; i2 < abstractC7124Arr.length; i2++) {
                            m46934(abstractC7124Arr[i2], strArrM34051[i2 - 1]);
                        }
                    } else {
                        for (int i3 = 0; i3 < abstractC7124Arr.length; i3++) {
                            m46934(abstractC7124Arr[i3], strArrM34051[i3]);
                        }
                    }
                    break;
                case 49:
                    C3469 c3469 = (C3469) abstractC8536;
                    String str6 = c3469.f12741;
                    for (AbstractC7124 abstractC7126 : abstractC7124Arr) {
                        m46934(abstractC7126, str6);
                    }
                    m46928(c3469, C0252.m1693("[", str6));
                    break;
                case 50:
                    C21941 c21941 = (C21941) abstractC8536;
                    for (AbstractC7124 abstractC7127 : abstractC7124Arr) {
                        m46934(abstractC7127, "I");
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < c21941.f71170; i4++) {
                        sb.append('[');
                    }
                    sb.append(c21941.f71171);
                    m46928(c21941, sb.toString());
                    break;
                case 51:
                    for (AbstractC7124 abstractC7128 : abstractC7124Arr) {
                        m46929(abstractC7128, abstractC8536);
                    }
                    break;
            }
            for (AbstractC7124 abstractC7129 : abstractC8536.f29544) {
                m46930(abstractC7129, true);
            }
            return;
        }
        AbstractC19119 abstractC19119 = (AbstractC19119) abstractC7124;
        AbstractC7124 abstractC71210 = abstractC19119.f61770;
        abstractC71210.getClass();
        AbstractC7124 abstractC71211 = abstractC19119.f61771;
        abstractC71211.getClass();
        switch (C21586.f70042[abstractC19119.f23823.ordinal()]) {
            case 16:
                m46934(abstractC71211, "I");
                String str7 = ((C6292) abstractC19119).f21297;
                m46934(abstractC71210, C0252.m1693("[", str7));
                if (z) {
                    m46928(abstractC19119, str7);
                    C15943 c15943M46927 = m46927(abstractC71210);
                    C15943 c15943M46928 = m46927(abstractC19119);
                    if (c15943M46927.f51634 == null) {
                        c15943M46927.f51634 = new HashSet(3);
                    }
                    c15943M46927.f51634.add(c15943M46928);
                    if (c15943M46928.f51636 == null) {
                        c15943M46928.f51636 = new HashSet(3);
                    }
                    c15943M46928.f51636.add(c15943M46927);
                } else {
                    m46934(abstractC19119, str7);
                    C15943 c15943M46929 = m46927(abstractC71210);
                    C15943 c15943M469210 = m46927(abstractC19119);
                    if (c15943M46929.f51640 == null) {
                        c15943M46929.f51640 = new HashSet(3);
                    }
                    c15943M46929.f51640.add(c15943M469210);
                    if (c15943M469210.f51636 == null) {
                        c15943M469210.f51636 = new HashSet(3);
                    }
                    c15943M469210.f51636.add(c15943M46929);
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                String str8 = ((C11232) abstractC19119).f38006;
                m46934(abstractC71210, str8);
                m46934(abstractC71211, str8);
                m46928(abstractC19119, "I");
                break;
            case 22:
            case 23:
                AbstractC7124 abstractC71212 = abstractC19119.f61771;
                EnumC12643 enumC12644 = EnumC12643.ZIL;
                m46934(abstractC71212, enumC12644.f42239);
                m46934(abstractC19119.f61770, enumC12644.f42239);
                AbstractC7124 abstractC71213 = abstractC19119.f61770;
                AbstractC7124 abstractC71214 = abstractC19119.f61771;
                C15943 c15943M469211 = m46927(abstractC71213);
                C15943 c15943M469212 = m46927(abstractC71214);
                if (c15943M469211.f51635 == null) {
                    c15943M469211.f51635 = new HashSet(3);
                }
                if (c15943M469212.f51635 == null) {
                    c15943M469212.f51635 = new HashSet(3);
                }
                c15943M469211.f51635.add(c15943M469212);
                c15943M469212.f51635.add(c15943M469211);
                m46928(abstractC19119, "Z");
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                String str9 = ((C11232) abstractC19119).f38006;
                m46934(abstractC71210, str9);
                m46934(abstractC71211, str9);
                m46928(abstractC19119, "Z");
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                String str10 = ((C11232) abstractC19119).f38006;
                m46934(abstractC71210, str10);
                m46934(abstractC71211, str10);
                m46928(abstractC19119, str10);
                break;
            case 36:
            case 37:
            case 38:
                String str11 = ((C11232) abstractC19119).f38006;
                m46934(abstractC71210, str11);
                m46934(abstractC71211, str11);
                if ("J".equals(str11) || "w".equals(str11)) {
                    m46928(abstractC19119, str11);
                } else {
                    m46928(abstractC19119, EnumC12643.ZI.f42239);
                }
                break;
            case 39:
            case 40:
            case 41:
                String str12 = ((C11232) abstractC19119).f38006;
                m46934(abstractC71210, str12);
                m46934(abstractC71211, "I");
                m46928(abstractC19119, str12);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        m46930(abstractC71210, true);
        m46930(abstractC71211, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15943 m46927(AbstractC7124 abstractC7124) {
        Object obj = abstractC7124.f23824;
        if (!(obj instanceof C15943)) {
            C15943 c15943 = new C15943(abstractC7124);
            this.f67818.add(c15943);
            abstractC7124.f23824 = c15943;
            return c15943;
        }
        return (C15943) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46929(AbstractC7124 abstractC7124, AbstractC7124 abstractC7125) {
        C15943 c15943M46927 = m46927(abstractC7124);
        C15943 c15943M46928 = m46927(abstractC7125);
        if (c15943M46927.f51641 == null) {
            c15943M46927.f51641 = new HashSet();
        }
        c15943M46927.f51641.add(c15943M46928);
        if (c15943M46928.f51642 == null) {
            c15943M46928.f51642 = new HashSet();
        }
        c15943M46928.f51642.add(c15943M46927);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46928(AbstractC7124 abstractC7124, String str) {
        C15943 c15943M37898 = m46927(abstractC7124).m37898();
        c15943M37898.f51633 = str;
        c15943M37898.m37902(EnumC12643.m31422(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46931(AbstractC9242 abstractC9242) {
        if (abstractC9242.f16795 == EnumC2890.FILL_ARRAY_DATA) {
            m46929(abstractC9242.f31402, abstractC9242.f31401);
            return;
        }
        AbstractC7124 abstractC7124 = abstractC9242.f31401;
        AbstractC7124 abstractC7125 = abstractC9242.f31402;
        m46929(abstractC7124, abstractC7125);
        m46930(abstractC7124, true);
        m46930(abstractC7125, false);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m46935() {
        HashSet hashSet;
        int iM46924;
        int iM46925;
        HashSet hashSet2;
        String str;
        Set set;
        ArrayList arrayList;
        C9116 c9116 = this.f67817;
        AbstractC4777 first = c9116.f31045.getFirst();
        while (true) {
            int i = 1;
            if (first == null) {
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = this.f67818;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C15943 c15943M37898 = ((C15943) it.next()).m37898();
                    if (c15943M37898.f51634 != null || c15943M37898.f51640 != null) {
                        hashSet3.add(c15943M37898);
                    }
                    m46932(c15943M37898, EnumC7475.f24889);
                    m46932(c15943M37898, EnumC7475.f24890);
                    m46932(c15943M37898, EnumC7475.f24891);
                }
                C23704 c23704 = new C23704();
                c23704.addAll(arrayList2);
                while (!c23704.isEmpty()) {
                    while (!c23704.isEmpty()) {
                        C15943 c15943M37899 = ((C15943) c23704.poll()).m37898();
                        EnumC12643 enumC12643 = c15943M37899.f51639;
                        switch (C21586.f70043[enumC12643.ordinal()]) {
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                c15943M37899.f51633 = enumC12643.f42239;
                                break;
                        }
                        String str2 = c15943M37899.f51633;
                        if (str2 == null && (set = c15943M37899.f51642) != null && set.size() > i) {
                            Iterator it2 = c15943M37899.f51642.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    Iterator it3 = c15943M37899.f51642.iterator();
                                    String strM37900 = ((C15943) it3.next()).m37900();
                                    while (it3.hasNext()) {
                                        strM37900 = m46933(strM37900, ((C15943) it3.next()).m37900());
                                    }
                                    c15943M37899.f51633 = strM37900;
                                    str2 = strM37900;
                                }
                            } while (((C15943) it2.next()).m37900() != null);
                        }
                        Set set2 = c15943M37899.f51642;
                        if (set2 != null) {
                            Iterator it4 = set2.iterator();
                            while (it4.hasNext()) {
                                C15943 c15943M378910 = ((C15943) it4.next()).m37898();
                                if (c15943M378910.m37902(enumC12643)) {
                                    c23704.add(c15943M378910);
                                }
                                Set set3 = c15943M37899.f51638;
                                if (set3 != null) {
                                    if (c15943M378910.f51638 == null) {
                                        c15943M378910.f51638 = new HashSet();
                                    }
                                    if (c15943M378910.f51638.addAll(set3)) {
                                        c23704.add(c15943M378910);
                                    }
                                }
                            }
                        }
                        Set set4 = c15943M37899.f51641;
                        if (set4 != null) {
                            Iterator it5 = set4.iterator();
                            while (it5.hasNext()) {
                                C15943 c15943M378911 = ((C15943) it5.next()).m37898();
                                if (c15943M378911.m37902(enumC12643)) {
                                    c23704.add(c15943M378911);
                                }
                                if (str2 != null) {
                                    String str3 = c15943M378911.f51633;
                                    if (str3 == null) {
                                        c15943M378911.f51633 = str2;
                                        c23704.add(c15943M378911);
                                    } else {
                                        String strM46933 = m46933(str2, str3);
                                        if (!strM46933.equals(c15943M378911.f51633)) {
                                            c15943M378911.f51633 = strM46933;
                                            c23704.add(c15943M378911);
                                        }
                                    }
                                }
                            }
                        }
                        Set set5 = c15943M37899.f51635;
                        if (set5 != null) {
                            Iterator it6 = set5.iterator();
                            while (it6.hasNext()) {
                                C15943 c15943M378912 = ((C15943) it6.next()).m37898();
                                if (c15943M378912.m37902(enumC12643)) {
                                    c23704.add(c15943M378912);
                                }
                            }
                        }
                    }
                    Iterator it7 = hashSet3.iterator();
                    while (it7.hasNext()) {
                        C15943 c15943M378913 = ((C15943) it7.next()).m37898();
                        String str4 = c15943M378913.f51633;
                        if (str4 == null || str4.charAt(0) != '[') {
                            hashSet = hashSet3;
                        } else {
                            String strSubstring = str4.substring(i);
                            EnumC12643 enumC12643M31422 = EnumC12643.m31422(strSubstring);
                            Set set6 = c15943M378913.f51634;
                            if (set6 != null) {
                                Iterator it8 = set6.iterator();
                                while (it8.hasNext()) {
                                    C15943 c15943M378914 = ((C15943) it8.next()).m37898();
                                    if (c15943M378914.m37902(enumC12643M31422)) {
                                        c23704.add(c15943M378914);
                                    }
                                    C15943 c15943M378915 = c15943M378914.m37898();
                                    String strM46925 = c15943M378915.f51633;
                                    if (strM46925 == null) {
                                        c15943M378915.f51633 = strSubstring;
                                        c23704.add(c15943M378915);
                                        hashSet2 = hashSet3;
                                    } else {
                                        if (!strSubstring.equals(strM46925) && (iM46924 = m46924(strSubstring)) <= (iM46925 = m46924(strM46925))) {
                                            if (iM46925 > iM46924) {
                                                hashSet2 = hashSet3;
                                            } else {
                                                String strSubstring2 = strSubstring.substring(iM46924);
                                                String strSubstring3 = strM46925.substring(iM46925);
                                                EnumC12643 enumC12643M31423 = EnumC12643.m31422(strSubstring2);
                                                EnumC12643 enumC12643M31424 = EnumC12643.m31422(strSubstring3);
                                                boolean z = enumC12643M31423.f42238;
                                                hashSet2 = hashSet3;
                                                if (!z || enumC12643M31424.f42238) {
                                                    if (z || !enumC12643M31424.f42238) {
                                                        if (!z) {
                                                            strM46925 = m46925(iM46924, EnumC12643.m31423(enumC12643M31423, enumC12643M31424).f42239);
                                                        } else if (enumC12643M31423 != enumC12643M31424) {
                                                            if (iM46924 == 0) {
                                                                throw new RuntimeException();
                                                            }
                                                            strM46925 = m46925(iM46924 - 1, "L");
                                                        } else if (enumC12643M31423 == EnumC12643.INT) {
                                                            int i2 = 3;
                                                            while (true) {
                                                                if (i2 >= 0) {
                                                                    str = C20176.f65490[i2];
                                                                    if (!strSubstring.equals(str) && !strM46925.equals(str)) {
                                                                        i2--;
                                                                    }
                                                                } else {
                                                                    str = "I";
                                                                }
                                                            }
                                                            strM46925 = m46925(iM46924, str);
                                                        } else {
                                                            strM46925 = m46925(iM46924, "L");
                                                        }
                                                    }
                                                }
                                            }
                                            if (!strM46925.equals(c15943M378915.f51633)) {
                                                c15943M378915.f51633 = strM46925;
                                                c23704.add(c15943M378915);
                                            }
                                        } else {
                                            hashSet2 = hashSet3;
                                        }
                                        strM46925 = strSubstring;
                                        if (!strM46925.equals(c15943M378915.f51633)) {
                                            c15943M378915.f51633 = strM46925;
                                            c23704.add(c15943M378915);
                                        }
                                    }
                                    hashSet3 = hashSet2;
                                }
                            }
                            hashSet = hashSet3;
                            Set set7 = c15943M378913.f51640;
                            if (set7 != null) {
                                Iterator it9 = set7.iterator();
                                while (it9.hasNext()) {
                                    C15943 c15943M378916 = ((C15943) it9.next()).m37898();
                                    if (c15943M378916.m37902(enumC12643M31422)) {
                                        c23704.add(c15943M378916);
                                    }
                                    if (c15943M378916.f51638 == null) {
                                        c15943M378916.f51638 = new HashSet();
                                    }
                                    if (c15943M378916.f51638.add(strSubstring)) {
                                        c23704.add(c15943M378916);
                                    }
                                }
                            }
                        }
                        i = 1;
                        hashSet3 = hashSet;
                    }
                }
                return arrayList2;
            }
            int i3 = C21586.f70041[first.f16801.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC1479 abstractC1479 = (AbstractC1479) first;
                    EnumC2890 enumC2890 = abstractC1479.f16795;
                    if (enumC2890 != EnumC2890.GOTO) {
                        AbstractC7124 abstractC7124 = abstractC1479.f6011;
                        switch (C21586.f70040[enumC2890.ordinal()]) {
                            case 1:
                            case 2:
                                m46934(abstractC7124, "I");
                                break;
                            case 3:
                                m46934(abstractC7124, "Z");
                                break;
                            case 4:
                            case 5:
                                m46934(abstractC7124, "L");
                                break;
                            case 6:
                                m46934(abstractC7124, "Ljava/lang/Throwable;");
                                break;
                            case 7:
                                m46934(abstractC7124, c9116.f31038);
                                break;
                        }
                        m46930(abstractC7124, true);
                    }
                } else if (i3 == 3) {
                    m46931((AbstractC9242) first);
                }
            } else if (first.f16795 == EnumC2890.LABEL && (arrayList = ((C17002) first).f54351) != null) {
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    m46931((C15592) it10.next());
                }
            }
            first = first.m13247();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f67818.iterator();
        while (it.hasNext()) {
            sb.append((C15943) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m46934(AbstractC7124 abstractC7124, String str) {
        C15943 c15943M46927 = m46927(abstractC7124);
        if (c15943M46927.f51638 == null) {
            c15943M46927.f51638 = new HashSet();
        }
        c15943M46927.f51638.add(str);
        c15943M46927.m37902(EnumC12643.m31422(str));
    }
}
