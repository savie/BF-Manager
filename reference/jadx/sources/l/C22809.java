package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes.dex */
public final class C22809 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13791 f73939;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f73940 = new ArrayList();

    public C22809(C13791 c13791) {
        this.f73939 = c13791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51433(C19825 c19825, EnumC10874 enumC10874) {
        Set setMo9085 = enumC10874.mo9085(c19825);
        if (setMo9085 != null) {
            if (setMo9085.size() > 1) {
                ArrayList arrayList = new ArrayList(setMo9085);
                C19825 c19825M45613 = ((C19825) arrayList.get(0)).m45613();
                for (int i = 1; i < arrayList.size(); i++) {
                    c19825M45613.m45616((C19825) arrayList.get(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m51434(String str, String str2) {
        if (!str.equals(str2)) {
            EnumC5940 enumC5940M17256 = EnumC5940.m17256(str);
            EnumC5940 enumC5940M17257 = EnumC5940.m17256(str2);
            boolean z = enumC5940M17256.f20312;
            if (!z || enumC5940M17257.f20312) {
                if (!z && enumC5940M17257.f20312) {
                    return str2;
                }
                if (z) {
                    EnumC5940 enumC5940 = EnumC5940.INT;
                    if ((enumC5940M17256 == enumC5940 && enumC5940M17257 == EnumC5940.BOOLEAN) || (enumC5940M17257 == enumC5940 && enumC5940M17256 == EnumC5940.BOOLEAN)) {
                        return "I";
                    }
                    if (enumC5940M17256 != enumC5940M17257) {
                        throw new RuntimeException();
                    }
                    if (enumC5940M17256 == enumC5940) {
                        for (int i = 3; i >= 0; i--) {
                            String str3 = C15349.f50104[i];
                            if (str.equals(str3) || str2.equals(str3)) {
                                return str3;
                            }
                        }
                        return "I";
                    }
                    if (enumC5940M17256 == EnumC5940.OBJECT) {
                        int iM51425 = m51425(str);
                        int iM51426 = m51425(str2);
                        if (iM51425 == 0 || iM51426 == 0) {
                            if (!str.equals(str2) && ("L".endsWith(str) || (!"L".equals(str2) && str.compareTo(str2) <= 0))) {
                                return str2;
                            }
                        } else {
                            String strSubstring = str.substring(iM51425);
                            String strSubstring2 = str2.substring(iM51426);
                            if (iM51425 < iM51426) {
                                if (strSubstring2.charAt(0) != 'L') {
                                    iM51426--;
                                }
                                return m51426(iM51426, "L");
                            }
                            if (iM51425 > iM51426) {
                                if (strSubstring.charAt(0) != 'L') {
                                    iM51425--;
                                }
                                return m51426(iM51425, "L");
                            }
                            if (strSubstring.charAt(0) != 'L' || strSubstring2.charAt(0) != 'L') {
                                return m51426(iM51425 - 1, "L");
                            }
                            return m51426(iM51425, "L");
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    return EnumC5940.m17257(enumC5940M17256, enumC5940M17257).f20313;
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51426(int i, String str) {
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
    public static int m51425(String str) {
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51432(AbstractC11071 abstractC11071, boolean z) {
        int i = C9447.f30638[abstractC11071.f34922.ordinal()];
        if (i == 1) {
            AbstractC8922 abstractC8922 = (AbstractC8922) abstractC11071;
            EnumC22260 enumC22260 = abstractC8922.f34921;
            switch (C9447.f30639[enumC22260.ordinal()]) {
                case 2:
                    C14888 c14888 = (C14888) abstractC8922;
                    m51430(c14888, c14888.f48648);
                    return;
                case 3:
                case 4:
                case 5:
                    C8177 c8177 = (C8177) abstractC8922;
                    String str = c8177.f26966;
                    if (str == null && enumC22260 == EnumC22260.EXCEPTION_REF) {
                        str = "Ljava/lang/Throwable;";
                    }
                    m51430(c8177, str);
                    return;
                case 6:
                    C19364 c19364 = (C19364) abstractC8922;
                    String str2 = c19364.f62554;
                    if (z) {
                        m51430(c19364, str2);
                        return;
                    } else {
                        m51435(c19364, str2);
                        return;
                    }
                case 7:
                    C16380 c16380 = (C16380) abstractC8922;
                    Object obj = c16380.f53172;
                    if (obj instanceof String) {
                        m51430(c16380, "Ljava/lang/String;");
                        return;
                    }
                    if (obj instanceof C15855) {
                        m51430(c16380, "Ljava/lang/Class;");
                        return;
                    }
                    if (!(obj instanceof Number)) {
                        if (obj instanceof Character) {
                            m51430(c16380, "C");
                            return;
                        } else {
                            m51430(c16380, "L");
                            return;
                        }
                    }
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        int iIntValue = ((Number) obj).intValue();
                        if (iIntValue == 0) {
                            m51430(c16380, EnumC5940.ZIFL.f20313);
                            return;
                        } else if (iIntValue == 1) {
                            m51430(c16380, EnumC5940.ZIF.f20313);
                            return;
                        } else {
                            m51430(c16380, EnumC5940.IF.f20313);
                            return;
                        }
                    }
                    if (obj instanceof Long) {
                        m51430(c16380, "w");
                        return;
                    } else if (obj instanceof Float) {
                        m51430(c16380, "F");
                        return;
                    } else {
                        if (obj instanceof Double) {
                            m51430(c16380, "D");
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
        }
        if (i == 2) {
            AbstractC7431 abstractC7431 = (AbstractC7431) abstractC11071;
            AbstractC11071 abstractC11072 = abstractC7431.f24464;
            switch (C9447.f30639[abstractC7431.f34921.ordinal()]) {
                case 8:
                    C17872 c17872 = (C17872) abstractC7431;
                    String str3 = c17872.f58577;
                    if (str3.equals("B")) {
                        EnumC5940 enumC5940 = EnumC5940.ZI;
                        m51435(abstractC11072, enumC5940.f20313);
                        m51430(abstractC7431, enumC5940.f20313);
                    } else {
                        m51435(abstractC11072, c17872.f58578);
                        m51430(abstractC7431, str3);
                    }
                    break;
                case 9:
                    C3702 c3702 = (C3702) abstractC7431;
                    String str4 = c3702.f12711;
                    if (z) {
                        m51430(c3702, str4);
                    } else {
                        m51435(c3702, str4);
                    }
                    if (abstractC11072 != null) {
                        m51435(abstractC11072, c3702.f12712);
                    }
                    break;
                case 10:
                    C1465 c1465 = (C1465) abstractC7431;
                    m51430(c1465, c1465.f5117);
                    m51435(abstractC11072, "L");
                    break;
                case 11:
                    m51430((C1465) abstractC7431, "Z");
                    m51435(abstractC11072, "L");
                    break;
                case 12:
                    C1465 c1466 = (C1465) abstractC7431;
                    m51430(c1466, "[" + c1466.f5117);
                    m51435(abstractC11072, "I");
                    break;
                case 13:
                    m51430((C2956) abstractC7431, "I");
                    m51435(abstractC11072, "[?");
                    break;
                case 14:
                case 15:
                    C2956 c2956 = (C2956) abstractC7431;
                    String str5 = c2956.f9645;
                    m51430(c2956, str5);
                    m51435(abstractC11072, str5);
                    break;
            }
            if (abstractC11072 != null) {
                m51432(abstractC11072, true);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            AbstractC5106 abstractC5106 = (AbstractC5106) abstractC11071;
            AbstractC11071[] abstractC11071Arr = abstractC5106.f17809;
            switch (C9447.f30639[abstractC5106.f34921.ordinal()]) {
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                    AbstractC11905 abstractC11905 = (AbstractC11905) abstractC5106;
                    String strM30291 = abstractC11905.mo18707().m30291();
                    m51430(abstractC5106, strM30291);
                    m51435(abstractC5106, strM30291);
                    String[] strArrM30292 = abstractC11905.mo18707().m30292();
                    if (strArrM30292.length != abstractC11071Arr.length) {
                        if (strArrM30292.length + 1 != abstractC11071Arr.length) {
                            throw new RuntimeException();
                        }
                        m51435(abstractC11071Arr[0], "L");
                        for (int i2 = 1; i2 < abstractC11071Arr.length; i2++) {
                            m51435(abstractC11071Arr[i2], strArrM30292[i2 - 1]);
                        }
                    } else {
                        for (int i3 = 0; i3 < abstractC11071Arr.length; i3++) {
                            m51435(abstractC11071Arr[i3], strArrM30292[i3]);
                        }
                    }
                    break;
                case 49:
                    C20856 c20856 = (C20856) abstractC5106;
                    String str6 = c20856.f66762;
                    for (AbstractC11071 abstractC11073 : abstractC11071Arr) {
                        m51435(abstractC11073, str6);
                    }
                    m51430(c20856, C25272.m56409("[", str6));
                    break;
                case 50:
                    C21602 c21602 = (C21602) abstractC5106;
                    for (AbstractC11071 abstractC11074 : abstractC11071Arr) {
                        m51435(abstractC11074, "I");
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < c21602.f69012; i4++) {
                        sb.append('[');
                    }
                    sb.append(c21602.f69013);
                    m51430(c21602, sb.toString());
                    break;
                case 51:
                    for (AbstractC11071 abstractC11075 : abstractC11071Arr) {
                        m51431(abstractC11075, abstractC5106);
                    }
                    break;
            }
            for (AbstractC11071 abstractC11076 : abstractC5106.f17809) {
                m51432(abstractC11076, true);
            }
            return;
        }
        AbstractC14142 abstractC14142 = (AbstractC14142) abstractC11071;
        AbstractC11071 abstractC11077 = abstractC14142.f44724;
        abstractC11077.getClass();
        AbstractC11071 abstractC11078 = abstractC14142.f44725;
        abstractC11078.getClass();
        switch (C9447.f30639[abstractC14142.f34921.ordinal()]) {
            case 16:
                m51435(abstractC11078, "I");
                String str7 = ((C25332) abstractC14142).f81801;
                m51435(abstractC11077, C25272.m56409("[", str7));
                if (z) {
                    m51430(abstractC14142, str7);
                    C19825 c19825M51428 = m51428(abstractC11077);
                    C19825 c19825M51429 = m51428(abstractC14142);
                    if (c19825M51428.f63742 == null) {
                        c19825M51428.f63742 = new HashSet(3);
                    }
                    c19825M51428.f63742.add(c19825M51429);
                    if (c19825M51429.f63734 == null) {
                        c19825M51429.f63734 = new HashSet(3);
                    }
                    c19825M51429.f63734.add(c19825M51428);
                } else {
                    m51435(abstractC14142, str7);
                    C19825 c19825M514210 = m51428(abstractC11077);
                    C19825 c19825M514211 = m51428(abstractC14142);
                    if (c19825M514210.f63735 == null) {
                        c19825M514210.f63735 = new HashSet(3);
                    }
                    c19825M514210.f63735.add(c19825M514211);
                    if (c19825M514211.f63734 == null) {
                        c19825M514211.f63734 = new HashSet(3);
                    }
                    c19825M514211.f63734.add(c19825M514210);
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                String str8 = ((C17126) abstractC14142).f55874;
                m51435(abstractC11077, str8);
                m51435(abstractC11078, str8);
                m51430(abstractC14142, "I");
                break;
            case 22:
            case 23:
                AbstractC11071 abstractC11079 = abstractC14142.f44725;
                EnumC5940 enumC5941 = EnumC5940.ZIL;
                m51435(abstractC11079, enumC5941.f20313);
                m51435(abstractC14142.f44724, enumC5941.f20313);
                AbstractC11071 abstractC110710 = abstractC14142.f44724;
                AbstractC11071 abstractC110711 = abstractC14142.f44725;
                C19825 c19825M514212 = m51428(abstractC110710);
                C19825 c19825M514213 = m51428(abstractC110711);
                if (c19825M514212.f63733 == null) {
                    c19825M514212.f63733 = new HashSet(3);
                }
                if (c19825M514213.f63733 == null) {
                    c19825M514213.f63733 = new HashSet(3);
                }
                c19825M514212.f63733.add(c19825M514213);
                c19825M514213.f63733.add(c19825M514212);
                m51430(abstractC14142, "Z");
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                String str9 = ((C17126) abstractC14142).f55874;
                m51435(abstractC11077, str9);
                m51435(abstractC11078, str9);
                m51430(abstractC14142, "Z");
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                String str10 = ((C17126) abstractC14142).f55874;
                m51435(abstractC11077, str10);
                m51435(abstractC11078, str10);
                m51430(abstractC14142, str10);
                break;
            case 36:
            case 37:
            case 38:
                String str11 = ((C17126) abstractC14142).f55874;
                m51435(abstractC11077, str11);
                m51435(abstractC11078, str11);
                if ("J".equals(str11) || "w".equals(str11)) {
                    m51430(abstractC14142, str11);
                } else {
                    m51430(abstractC14142, EnumC5940.ZI.f20313);
                }
                break;
            case 39:
            case 40:
            case 41:
                String str12 = ((C17126) abstractC14142).f55874;
                m51435(abstractC11077, str12);
                m51435(abstractC11078, "I");
                m51430(abstractC14142, str12);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        m51432(abstractC11077, true);
        m51432(abstractC11078, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19825 m51428(AbstractC11071 abstractC11071) {
        Object obj = abstractC11071.f34924;
        if (!(obj instanceof C19825)) {
            C19825 c19825 = new C19825(abstractC11071);
            this.f73940.add(c19825);
            abstractC11071.f34924 = c19825;
            return c19825;
        }
        return (C19825) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51431(AbstractC11071 abstractC11071, AbstractC11071 abstractC11072) {
        C19825 c19825M51428 = m51428(abstractC11071);
        C19825 c19825M51429 = m51428(abstractC11072);
        if (c19825M51428.f63741 == null) {
            c19825M51428.f63741 = new HashSet();
        }
        c19825M51428.f63741.add(c19825M51429);
        if (c19825M51429.f63739 == null) {
            c19825M51429.f63739 = new HashSet();
        }
        c19825M51429.f63739.add(c19825M51428);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51430(AbstractC11071 abstractC11071, String str) {
        C19825 c19825M45613 = m51428(abstractC11071).m45613();
        c19825M45613.f63738 = str;
        c19825M45613.m45617(EnumC5940.m17256(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51429(AbstractC3614 abstractC3614) {
        if (abstractC3614.f40344 == EnumC20768.FILL_ARRAY_DATA) {
            m51431(abstractC3614.f12388, abstractC3614.f12387);
            return;
        }
        AbstractC11071 abstractC11071 = abstractC3614.f12387;
        AbstractC11071 abstractC11072 = abstractC3614.f12388;
        m51431(abstractC11071, abstractC11072);
        m51432(abstractC11071, true);
        m51432(abstractC11072, false);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m51436() {
        HashSet hashSet;
        int iM51425;
        int iM51426;
        HashSet hashSet2;
        String str;
        Set set;
        ArrayList arrayList;
        C13791 c13791 = this.f73939;
        AbstractC12563 first = c13791.f43750.getFirst();
        while (true) {
            int i = 1;
            if (first == null) {
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = this.f73940;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C19825 c19825M45613 = ((C19825) it.next()).m45613();
                    if (c19825M45613.f63742 != null || c19825M45613.f63735 != null) {
                        hashSet3.add(c19825M45613);
                    }
                    m51433(c19825M45613, EnumC10874.f34415);
                    m51433(c19825M45613, EnumC10874.f34420);
                    m51433(c19825M45613, EnumC10874.f34421);
                }
                C17587 c17587 = new C17587();
                c17587.addAll(arrayList2);
                while (!c17587.isEmpty()) {
                    while (!c17587.isEmpty()) {
                        C19825 c19825M45614 = ((C19825) c17587.poll()).m45613();
                        EnumC5940 enumC5940 = c19825M45614.f63736;
                        switch (C9447.f30640[enumC5940.ordinal()]) {
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                c19825M45614.f63738 = enumC5940.f20313;
                                break;
                        }
                        String str2 = c19825M45614.f63738;
                        if (str2 == null && (set = c19825M45614.f63739) != null && set.size() > i) {
                            Iterator it2 = c19825M45614.f63739.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    Iterator it3 = c19825M45614.f63739.iterator();
                                    String strM45615 = ((C19825) it3.next()).m45615();
                                    while (it3.hasNext()) {
                                        strM45615 = m51434(strM45615, ((C19825) it3.next()).m45615());
                                    }
                                    c19825M45614.f63738 = strM45615;
                                    str2 = strM45615;
                                }
                            } while (((C19825) it2.next()).m45615() != null);
                        }
                        Set set2 = c19825M45614.f63739;
                        if (set2 != null) {
                            Iterator it4 = set2.iterator();
                            while (it4.hasNext()) {
                                C19825 c19825M45615 = ((C19825) it4.next()).m45613();
                                if (c19825M45615.m45617(enumC5940)) {
                                    c17587.add(c19825M45615);
                                }
                                Set set3 = c19825M45614.f63737;
                                if (set3 != null) {
                                    if (c19825M45615.f63737 == null) {
                                        c19825M45615.f63737 = new HashSet();
                                    }
                                    if (c19825M45615.f63737.addAll(set3)) {
                                        c17587.add(c19825M45615);
                                    }
                                }
                            }
                        }
                        Set set4 = c19825M45614.f63741;
                        if (set4 != null) {
                            Iterator it5 = set4.iterator();
                            while (it5.hasNext()) {
                                C19825 c19825M45616 = ((C19825) it5.next()).m45613();
                                if (c19825M45616.m45617(enumC5940)) {
                                    c17587.add(c19825M45616);
                                }
                                if (str2 != null) {
                                    String str3 = c19825M45616.f63738;
                                    if (str3 == null) {
                                        c19825M45616.f63738 = str2;
                                        c17587.add(c19825M45616);
                                    } else {
                                        String strM51434 = m51434(str2, str3);
                                        if (!strM51434.equals(c19825M45616.f63738)) {
                                            c19825M45616.f63738 = strM51434;
                                            c17587.add(c19825M45616);
                                        }
                                    }
                                }
                            }
                        }
                        Set set5 = c19825M45614.f63733;
                        if (set5 != null) {
                            Iterator it6 = set5.iterator();
                            while (it6.hasNext()) {
                                C19825 c19825M45617 = ((C19825) it6.next()).m45613();
                                if (c19825M45617.m45617(enumC5940)) {
                                    c17587.add(c19825M45617);
                                }
                            }
                        }
                    }
                    Iterator it7 = hashSet3.iterator();
                    while (it7.hasNext()) {
                        C19825 c19825M45618 = ((C19825) it7.next()).m45613();
                        String str4 = c19825M45618.f63738;
                        if (str4 == null || str4.charAt(0) != '[') {
                            hashSet = hashSet3;
                        } else {
                            String strSubstring = str4.substring(i);
                            EnumC5940 enumC5940M17256 = EnumC5940.m17256(strSubstring);
                            Set set6 = c19825M45618.f63742;
                            if (set6 != null) {
                                Iterator it8 = set6.iterator();
                                while (it8.hasNext()) {
                                    C19825 c19825M45619 = ((C19825) it8.next()).m45613();
                                    if (c19825M45619.m45617(enumC5940M17256)) {
                                        c17587.add(c19825M45619);
                                    }
                                    C19825 c19825M456110 = c19825M45619.m45613();
                                    String strM51426 = c19825M456110.f63738;
                                    if (strM51426 == null) {
                                        c19825M456110.f63738 = strSubstring;
                                        c17587.add(c19825M456110);
                                        hashSet2 = hashSet3;
                                    } else {
                                        if (!strSubstring.equals(strM51426) && (iM51425 = m51425(strSubstring)) <= (iM51426 = m51425(strM51426))) {
                                            if (iM51426 > iM51425) {
                                                hashSet2 = hashSet3;
                                            } else {
                                                String strSubstring2 = strSubstring.substring(iM51425);
                                                String strSubstring3 = strM51426.substring(iM51426);
                                                EnumC5940 enumC5940M17257 = EnumC5940.m17256(strSubstring2);
                                                EnumC5940 enumC5940M17258 = EnumC5940.m17256(strSubstring3);
                                                boolean z = enumC5940M17257.f20312;
                                                hashSet2 = hashSet3;
                                                if (!z || enumC5940M17258.f20312) {
                                                    if (z || !enumC5940M17258.f20312) {
                                                        if (!z) {
                                                            strM51426 = m51426(iM51425, EnumC5940.m17257(enumC5940M17257, enumC5940M17258).f20313);
                                                        } else if (enumC5940M17257 != enumC5940M17258) {
                                                            if (iM51425 == 0) {
                                                                throw new RuntimeException();
                                                            }
                                                            strM51426 = m51426(iM51425 - 1, "L");
                                                        } else if (enumC5940M17257 == EnumC5940.INT) {
                                                            int i2 = 3;
                                                            while (true) {
                                                                if (i2 >= 0) {
                                                                    str = C15349.f50104[i2];
                                                                    if (!strSubstring.equals(str) && !strM51426.equals(str)) {
                                                                        i2--;
                                                                    }
                                                                } else {
                                                                    str = "I";
                                                                }
                                                            }
                                                            strM51426 = m51426(iM51425, str);
                                                        } else {
                                                            strM51426 = m51426(iM51425, "L");
                                                        }
                                                    }
                                                }
                                            }
                                            if (!strM51426.equals(c19825M456110.f63738)) {
                                                c19825M456110.f63738 = strM51426;
                                                c17587.add(c19825M456110);
                                            }
                                        } else {
                                            hashSet2 = hashSet3;
                                        }
                                        strM51426 = strSubstring;
                                        if (!strM51426.equals(c19825M456110.f63738)) {
                                            c19825M456110.f63738 = strM51426;
                                            c17587.add(c19825M456110);
                                        }
                                    }
                                    hashSet3 = hashSet2;
                                }
                            }
                            hashSet = hashSet3;
                            Set set7 = c19825M45618.f63735;
                            if (set7 != null) {
                                Iterator it9 = set7.iterator();
                                while (it9.hasNext()) {
                                    C19825 c19825M456111 = ((C19825) it9.next()).m45613();
                                    if (c19825M456111.m45617(enumC5940M17256)) {
                                        c17587.add(c19825M456111);
                                    }
                                    if (c19825M456111.f63737 == null) {
                                        c19825M456111.f63737 = new HashSet();
                                    }
                                    if (c19825M456111.f63737.add(strSubstring)) {
                                        c17587.add(c19825M456111);
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
            int i3 = C9447.f30638[first.f40352.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC23752 abstractC23752 = (AbstractC23752) first;
                    EnumC20768 enumC20768 = abstractC23752.f40344;
                    if (enumC20768 != EnumC20768.GOTO) {
                        AbstractC11071 abstractC11071 = abstractC23752.f76980;
                        switch (C9447.f30641[enumC20768.ordinal()]) {
                            case 1:
                            case 2:
                                m51435(abstractC11071, "I");
                                break;
                            case 3:
                                m51435(abstractC11071, "Z");
                                break;
                            case 4:
                            case 5:
                                m51435(abstractC11071, "L");
                                break;
                            case 6:
                                m51435(abstractC11071, "Ljava/lang/Throwable;");
                                break;
                            case 7:
                                m51435(abstractC11071, c13791.f43753);
                                break;
                        }
                        m51432(abstractC11071, true);
                    }
                } else if (i3 == 3) {
                    m51429((AbstractC3614) first);
                }
            } else if (first.f40344 == EnumC20768.LABEL && (arrayList = ((C11817) first).f38143) != null) {
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    m51429((C20022) it10.next());
                }
            }
            first = first.m31273();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f73940.iterator();
        while (it.hasNext()) {
            sb.append((C19825) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m51435(AbstractC11071 abstractC11071, String str) {
        C19825 c19825M51428 = m51428(abstractC11071);
        if (c19825M51428.f63737 == null) {
            c19825M51428.f63737 = new HashSet();
        }
        c19825M51428.f63737.add(str);
        c19825M51428.m45617(EnumC5940.m17256(str));
    }
}
