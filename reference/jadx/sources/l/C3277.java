package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3277 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashSet f12148 = new HashSet(Arrays.asList("array", "bool", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimen", ClassTransform.FLOAT, "fraction", "id", "integer", "plurals", "string", "style"));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashSet f12147 = new HashSet(Arrays.asList(MotionUtils.EASING_TYPE_PATH, Name.REFER, "dynamic-reference", AnnotationHandler.ATTRIBUTE, "dynamic-attribute", "complex"));

    /* JADX WARN: Code duplicated, block: B:103:0x0223 A[Catch: ۫᩻֨ -> 0x02f3, TRY_LEAVE, TryCatch #2 {۫᩻֨ -> 0x02f3, blocks: (B:89:0x01e3, B:91:0x01ed, B:93:0x0201, B:101:0x0219, B:103:0x0223, B:111:0x025b, B:125:0x0294), top: B:195:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x024b A[Catch: ۫᩻֨ -> 0x0210, TryCatch #0 {۫᩻֨ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:192:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0252 A[Catch: ۫᩻֨ -> 0x0210, TryCatch #0 {۫᩻֨ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:192:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x025b A[Catch: ۫᩻֨ -> 0x02f3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {۫᩻֨ -> 0x02f3, blocks: (B:89:0x01e3, B:91:0x01ed, B:93:0x0201, B:101:0x0219, B:103:0x0223, B:111:0x025b, B:125:0x0294), top: B:195:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0266 A[Catch: ۫᩻֨ -> 0x0210, TRY_ENTER, TryCatch #0 {۫᩻֨ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:192:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:115:0x026a A[Catch: ۫᩻֨ -> 0x0210, TryCatch #0 {۫᩻֨ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:192:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0278 A[Catch: ۫᩻֨ -> 0x0210, TRY_LEAVE, TryCatch #0 {۫᩻֨ -> 0x0210, blocks: (B:95:0x020b, B:105:0x0245, B:107:0x024b, B:108:0x0251, B:109:0x0252, B:110:0x025a, B:113:0x0266, B:115:0x026a, B:116:0x0272, B:118:0x0278), top: B:192:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0285 A[EDGE_INSN: B:121:0x0285->B:122:0x0286 BREAK  A[LOOP:3: B:116:0x0272->B:237:?]] */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:168:0x0384  */
    /* JADX WARN: Code duplicated, block: B:171:0x0395  */
    /* JADX WARN: Code duplicated, block: B:174:0x0399  */
    /* JADX WARN: Code duplicated, block: B:192:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01db A[Catch: ۫᩻֨ -> 0x0330, TRY_LEAVE, TryCatch #1 {۫᩻֨ -> 0x0330, blocks: (B:85:0x01d5, B:87:0x01db), top: B:193:0x01d5 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed A[Catch: ۫᩻֨ -> 0x02f3, TryCatch #2 {۫᩻֨ -> 0x02f3, blocks: (B:89:0x01e3, B:91:0x01ed, B:93:0x0201, B:101:0x0219, B:103:0x0223, B:111:0x025b, B:125:0x0294), top: B:195:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0201 A[Catch: ۫᩻֨ -> 0x02f3, TRY_LEAVE, TryCatch #2 {۫᩻֨ -> 0x02f3, blocks: (B:89:0x01e3, B:91:0x01ed, B:93:0x0201, B:101:0x0219, B:103:0x0223, B:111:0x025b, B:125:0x0294), top: B:195:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0213  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0223, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1866 m9760(C22703 c22703, C20545 c20545) throws C12731 {
        String str;
        int i;
        boolean z;
        int i2;
        String str2;
        ArrayList arrayList;
        C9629 c9629M52271;
        int i3;
        int i4;
        int i5;
        String str3;
        int i6;
        HashSet hashSet;
        String str4;
        String strM50274;
        String str5;
        ArrayList arrayList2;
        int i7;
        C7139 c7139;
        ArrayList arrayList3;
        String str6;
        C8340 c8340M23870;
        String strM47740;
        String strM47741;
        ArrayList arrayList4;
        C15916 c15916M9762;
        String str7;
        InterfaceC3609 interfaceC3609;
        InterfaceC19133 interfaceC19133;
        InterfaceC3609 interfaceC3609Mo31753;
        Iterator it;
        ArrayList arrayList5 = c20545.f66539;
        String str8 = "variant";
        String str9 = "resource";
        InterfaceC6432 interfaceC6432M45571 = c22703.m50318().m45571();
        HashMap map = new HashMap();
        ArrayList<C14568> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        int i8 = 0;
        while (i8 < arrayList5.size()) {
            C9962 c9962 = (C9962) arrayList5.get(i8);
            String strM50275 = c9962.f34037;
            String str10 = c9962.f34036;
            ArrayList arrayList9 = c9962.f34035;
            try {
                String str11 = "INVALID_ARGUMENT";
                try {
                    if (arrayList9.isEmpty()) {
                        throw m9767("INVALID_ARGUMENT", "Each add requires at least one value.");
                    }
                    int i9 = str9.equals(str10) ? c9962.f34038 : (int) (Long.parseLong(strM50275.substring(2), 16) >>> 24);
                    C23740 c23740 = (C23740) map.get(Integer.valueOf(i9));
                    if (c23740 == null) {
                        c23740 = new C23740(m9763(i9, interfaceC6432M45571));
                        map.put(Integer.valueOf(i9), c23740);
                    }
                    C23740 c23741 = c23740;
                    int i10 = c23741.f76808;
                    ArrayList arrayList10 = arrayList5;
                    String str12 = "RESOURCE_BATCH_CONFLICT";
                    String str13 = str9;
                    if (str9.equals(str10)) {
                        try {
                            C8340 c8340M23871 = C9298.m23870(((C7139) arrayList9.get(0)).f23859);
                            String strM9759 = m9759(c8340M23871, (String) null);
                            String strM9758 = m9758(c8340M23871);
                            int i11 = 0;
                            while (i11 < strM9758.length()) {
                                char cCharAt = strM9758.charAt(i11);
                                ArrayList arrayList11 = arrayList7;
                                if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (i11 <= 0 || ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.'))))) {
                                    throw m9767("INVALID_VALUE_XML", "New resource names must start with a letter or underscore and contain only letters, digits, underscores, or dots.");
                                }
                                i11++;
                                arrayList7 = arrayList11;
                            }
                            arrayList = arrayList7;
                            c9629M52271 = c23741.m52272(strM9759);
                            HashMap map2 = c9629M52271.f32419;
                            HashSet hashSet2 = c9629M52271.f32426;
                            Integer num = (Integer) map2.get(strM9758);
                            if (num != null) {
                                if (hashSet2.contains(num)) {
                                    throw m9767("RESOURCE_BATCH_CONFLICT", "Multiple adds create the same resource type/name. Combine its variants into one resource add.");
                                }
                                try {
                                    strM50275 = C22703.m50274((i10 << 24) | (c9629M52271.f32425 << 16) | num.intValue());
                                    throw m9767("RESOURCE_ALREADY_EXISTS", "Resource type/name already exists; read or edit the existing resource.");
                                } catch (C12731 e) {
                                    e = e;
                                    i4 = 0;
                                    z = true;
                                    i2 = i4;
                                    if (i2 >= 0) {
                                        str2 = null;
                                    } else {
                                        str2 = null;
                                    }
                                    if (!z) {
                                        strM50275 = null;
                                    }
                                    m9765(e, i8, i2, strM50275, str2);
                                    throw e;
                                }
                            }
                            i3 = c9629M52271.f32422;
                            if (i3 > 65535) {
                                throw m9767("RESOURCE_ID_EXHAUSTED", "No unused entry ID remains in this resource type.");
                            }
                            c9629M52271.f32422 = i3 + 1;
                            hashSet2.add(Integer.valueOf(i3));
                            c9629M52271.f32419.put(strM9758, Integer.valueOf(i3));
                            c9629M52271.f32421.put(Integer.valueOf(i3), strM9758);
                            i5 = 0;
                            str = strM50275;
                            str3 = strM9758;
                            z = false;
                            try {
                                hashSet = c9629M52271.f32418;
                                str4 = c9629M52271.f32423;
                                i6 = i5;
                                try {
                                    int i12 = (c9629M52271.f32425 << 16) | (i10 << 24) | i3;
                                    strM50274 = C22703.m50274(i12);
                                    try {
                                        arrayList2 = new ArrayList();
                                        i7 = i12;
                                        arrayList8.add(new C11019(i8, strM50274, arrayList2));
                                        i2 = 0;
                                        str = strM50274;
                                        while (i2 < arrayList9.size()) {
                                            try {
                                                c7139 = (C7139) arrayList9.get(i2);
                                                arrayList9 = arrayList9;
                                                try {
                                                    arrayList3 = arrayList8;
                                                    if (arrayList6.size() < 200) {
                                                        throw m9767(str11, "A request supports at most 200 resource values.");
                                                    }
                                                    String str14 = c7139.f23859;
                                                    str6 = c7139.f23860;
                                                    c8340M23870 = C9298.m23870(str14);
                                                    if (str3.equals(m9758(c8340M23870))) {
                                                        throw m9767("INVALID_VALUE_XML", "All values must keep the target resource name.");
                                                    }
                                                    strM47740 = C21291.m47740(str4);
                                                    if (str8.equals(str10)) {
                                                        try {
                                                            strM47741 = C21291.m47740(str4);
                                                        } catch (C12731 e2) {
                                                            e = e2;
                                                            strM50275 = str;
                                                            if (i2 >= 0) {
                                                                str2 = null;
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (!z) {
                                                                strM50275 = null;
                                                            }
                                                            m9765(e, i8, i2, strM50275, str2);
                                                            throw e;
                                                        }
                                                    } else {
                                                        strM47741 = null;
                                                    }
                                                    arrayList4 = arrayList6;
                                                    if (strM47740.equals(m9759(c8340M23870, strM47741))) {
                                                        throw m9767("INVALID_VALUE_XML", "valueXml type does not match the target resource type.");
                                                    }
                                                    c15916M9762 = m9762(str6, c23741.f76810);
                                                    str7 = i3 + "\n" + str6;
                                                    if (!c9629M52271.f32420.add(str7)) {
                                                        if (hashSet.contains(str7)) {
                                                            throw m9767(str12, "Multiple values in this request add the same resource variant. Remove duplicate values.");
                                                        }
                                                        throw m9767("RESOURCE_VARIANT_ALREADY_EXISTS", "Resource variant already exists; use mt_apk_resource_edit to change it.");
                                                    }
                                                    hashSet.add(str7);
                                                    InterfaceC17721 interfaceC17721 = c23741.f76810;
                                                    if (str8.equals(str10)) {
                                                        interfaceC19133 = c9629M52271.f32424;
                                                        if (interfaceC19133 != null) {
                                                            interfaceC3609Mo31753 = null;
                                                            break;
                                                        }
                                                        it = interfaceC19133.mo26941().iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                interfaceC3609Mo31753 = null;
                                                                break;
                                                            }
                                                            interfaceC3609Mo31753 = ((InterfaceC12783) it.next()).mo31753(i3);
                                                        } while (interfaceC3609Mo31753 == null);
                                                        interfaceC3609 = interfaceC3609Mo31753;
                                                    } else {
                                                        interfaceC3609 = null;
                                                    }
                                                    int i13 = i7;
                                                    C17763 c17763M41320 = C17763.m41320(i13, str6, str4, str3, m9766(interfaceC17721, c9629M52271, i3, str3, c15916M9762, interfaceC3609));
                                                    ArrayList arrayList12 = arrayList;
                                                    arrayList12.add(c17763M41320);
                                                    str5 = str;
                                                    String str15 = str4;
                                                    HashSet hashSet3 = hashSet;
                                                    C23740 c23742 = c23741;
                                                    String str16 = str12;
                                                    String str17 = str3;
                                                    String str18 = str11;
                                                    String str19 = str8;
                                                    String str20 = str10;
                                                    try {
                                                        arrayList4.add(new C14568(i8, i2, i13, c9629M52271.f32423, str17, c7139, arrayList2, z));
                                                        i2++;
                                                        str11 = str18;
                                                        arrayList6 = arrayList4;
                                                        str = str5;
                                                        str10 = str20;
                                                        str4 = str15;
                                                        hashSet = hashSet3;
                                                        c23741 = c23742;
                                                        str12 = str16;
                                                        str3 = str17;
                                                        arrayList9 = arrayList9;
                                                        arrayList = arrayList12;
                                                        str8 = str19;
                                                        i7 = i13;
                                                        arrayList8 = arrayList3;
                                                    } catch (C12731 e3) {
                                                        e = e3;
                                                    }
                                                } catch (C12731 e4) {
                                                    e = e4;
                                                    str5 = str;
                                                }
                                            } catch (C12731 e5) {
                                                e = e5;
                                                arrayList9 = arrayList9;
                                            }
                                            strM50275 = str5;
                                        }
                                        i8++;
                                        arrayList5 = arrayList10;
                                        arrayList7 = arrayList;
                                        str9 = str13;
                                        interfaceC6432M45571 = interfaceC6432M45571;
                                        map = map;
                                        str8 = str8;
                                    } catch (C12731 e6) {
                                        e = e6;
                                        str5 = strM50274;
                                        arrayList9 = arrayList9;
                                        i2 = i6;
                                    }
                                } catch (C12731 e7) {
                                    e = e7;
                                    arrayList9 = arrayList9;
                                    strM50275 = str;
                                    i2 = i6;
                                }
                            } catch (C12731 e8) {
                                e = e8;
                                i6 = i5;
                            }
                        } catch (C12731 e9) {
                            e = e9;
                            i = 0;
                            str = strM50275;
                            arrayList9 = arrayList9;
                            z = false;
                            i2 = i;
                            strM50275 = str;
                            if (i2 >= 0) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            if (!z) {
                                strM50275 = null;
                            }
                            m9765(e, i8, i2, strM50275, str2);
                            throw e;
                        }
                    } else {
                        arrayList = arrayList7;
                        int i14 = (int) Long.parseLong(strM50275.substring(2), 16);
                        c9629M52271 = c23741.m52271((i14 >>> 16) & 255);
                        i3 = i14 & 65535;
                        String str21 = c9629M52271 == null ? null : (String) c9629M52271.f32421.get(Integer.valueOf(i3));
                        if (str21 == null) {
                            throw m9767("RESOURCE_NOT_FOUND", "Resource not found.");
                        }
                        str = strM50275;
                        try {
                            if (c9629M52271.f32426.contains(Integer.valueOf(i3))) {
                                throw m9767("RESOURCE_NOT_FOUND", "Variant targets must exist before this request. Put all variants of a new resource in its resource add.");
                            }
                            try {
                                m9764(c9629M52271.f32423);
                                i5 = -1;
                                str3 = str21;
                                z = true;
                                hashSet = c9629M52271.f32418;
                                str4 = c9629M52271.f32423;
                                i6 = i5;
                                int i15 = (c9629M52271.f32425 << 16) | (i10 << 24) | i3;
                                strM50274 = C22703.m50274(i15);
                                arrayList2 = new ArrayList();
                                i7 = i15;
                                arrayList8.add(new C11019(i8, strM50274, arrayList2));
                                i2 = 0;
                                str = strM50274;
                                while (i2 < arrayList9.size()) {
                                    c7139 = (C7139) arrayList9.get(i2);
                                    arrayList9 = arrayList9;
                                    arrayList3 = arrayList8;
                                    if (arrayList6.size() < 200) {
                                        throw m9767(str11, "A request supports at most 200 resource values.");
                                    }
                                    String str110 = c7139.f23859;
                                    str6 = c7139.f23860;
                                    c8340M23870 = C9298.m23870(str110);
                                    if (str3.equals(m9758(c8340M23870))) {
                                        throw m9767("INVALID_VALUE_XML", "All values must keep the target resource name.");
                                    }
                                    strM47740 = C21291.m47740(str4);
                                    if (str8.equals(str10)) {
                                        strM47741 = C21291.m47740(str4);
                                    } else {
                                        strM47741 = null;
                                    }
                                    arrayList4 = arrayList6;
                                    if (strM47740.equals(m9759(c8340M23870, strM47741))) {
                                        throw m9767("INVALID_VALUE_XML", "valueXml type does not match the target resource type.");
                                    }
                                    c15916M9762 = m9762(str6, c23741.f76810);
                                    str7 = i3 + "\n" + str6;
                                    if (!c9629M52271.f32420.add(str7)) {
                                        if (hashSet.contains(str7)) {
                                            throw m9767(str12, "Multiple values in this request add the same resource variant. Remove duplicate values.");
                                        }
                                        throw m9767("RESOURCE_VARIANT_ALREADY_EXISTS", "Resource variant already exists; use mt_apk_resource_edit to change it.");
                                    }
                                    hashSet.add(str7);
                                    InterfaceC17721 interfaceC17722 = c23741.f76810;
                                    if (str8.equals(str10)) {
                                        interfaceC19133 = c9629M52271.f32424;
                                        if (interfaceC19133 != null) {
                                            interfaceC3609Mo31753 = null;
                                            break;
                                        }
                                        it = interfaceC19133.mo26941().iterator();
                                        do {
                                            if (it.hasNext()) {
                                                interfaceC3609Mo31753 = null;
                                                break;
                                            }
                                            interfaceC3609Mo31753 = ((InterfaceC12783) it.next()).mo31753(i3);
                                        } while (interfaceC3609Mo31753 == null);
                                        interfaceC3609 = interfaceC3609Mo31753;
                                    } else {
                                        interfaceC3609 = null;
                                    }
                                    int i16 = i7;
                                    C17763 c17763M41321 = C17763.m41320(i16, str6, str4, str3, m9766(interfaceC17722, c9629M52271, i3, str3, c15916M9762, interfaceC3609));
                                    ArrayList arrayList13 = arrayList;
                                    arrayList13.add(c17763M41321);
                                    str5 = str;
                                    String str111 = str4;
                                    HashSet hashSet4 = hashSet;
                                    C23740 c23743 = c23741;
                                    String str112 = str12;
                                    String str113 = str3;
                                    String str114 = str11;
                                    String str115 = str8;
                                    String str22 = str10;
                                    arrayList4.add(new C14568(i8, i2, i16, c9629M52271.f32423, str113, c7139, arrayList2, z));
                                    i2++;
                                    str11 = str114;
                                    arrayList6 = arrayList4;
                                    str = str5;
                                    str10 = str22;
                                    str4 = str111;
                                    hashSet = hashSet4;
                                    c23741 = c23743;
                                    str12 = str112;
                                    str3 = str113;
                                    arrayList9 = arrayList9;
                                    arrayList = arrayList13;
                                    str8 = str115;
                                    i7 = i16;
                                    arrayList8 = arrayList3;
                                    strM50275 = str5;
                                }
                                i8++;
                                arrayList5 = arrayList10;
                                arrayList7 = arrayList;
                                str9 = str13;
                                interfaceC6432M45571 = interfaceC6432M45571;
                                map = map;
                                str8 = str8;
                            } catch (C12731 e10) {
                                e = e10;
                                i4 = -1;
                                strM50275 = str;
                                z = true;
                                i2 = i4;
                            }
                        } catch (C12731 e11) {
                            e = e11;
                            arrayList9 = arrayList9;
                            i = -1;
                            z = false;
                            i2 = i;
                            strM50275 = str;
                            if (i2 >= 0) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            if (!z) {
                                strM50275 = null;
                            }
                            m9765(e, i8, i2, strM50275, str2);
                            throw e;
                        }
                    }
                    if (i2 >= 0 || i2 >= arrayList9.size()) {
                        str2 = null;
                    } else {
                        str2 = ((C7139) arrayList9.get(i2)).f23860;
                    }
                    if (!z) {
                        strM50275 = null;
                    }
                    m9765(e, i8, i2, strM50275, str2);
                    throw e;
                } catch (C12731 e12) {
                    e = e12;
                    i = -1;
                    z = false;
                    i2 = i;
                    strM50275 = str;
                    if (i2 >= 0) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    if (!z) {
                        strM50275 = null;
                    }
                    m9765(e, i8, i2, strM50275, str2);
                    throw e;
                }
            } catch (C12731 e13) {
                e = e13;
                str = strM50275;
            }
        }
        ArrayList arrayList14 = arrayList8;
        C20150 c20150M50315 = c22703.m50315(arrayList7);
        ArrayList arrayList15 = new ArrayList();
        for (C14568 c14568 : arrayList6) {
            try {
                int i17 = c14568.f47673;
                C7139 c71310 = c14568.f47672;
                String str23 = c71310.f23860;
                C17763 c17763M41322 = C17763.m41320(c14568.f47673, str23, c14568.f47679, c14568.f47678, C9298.m23860(c20150M50315, i17, str23, c71310.f23859));
                arrayList15.add(c17763M41322);
                c14568.f47675.add(new C14547(str23, c17763M41322.f56344));
            } catch (C12731 e14) {
                m9765(e14, c14568.f47674, c14568.f47677, c14568.f47676 ? C22703.m50274(c14568.f47673) : null, c14568.f47672.f23860);
                throw e14;
            }
        }
        return new C1866(arrayList15, arrayList14);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17721 m9763(int i, InterfaceC6432 interfaceC6432) throws C12731 {
        InterfaceC17721 interfaceC17721 = null;
        for (InterfaceC17721 interfaceC17722 : interfaceC6432.mo17615()) {
            if (interfaceC17722.mo19106() == i) {
                if (interfaceC17721 != null) {
                    throw m9767("RESOURCE_TARGET_AMBIGUOUS", "Duplicate package IDs prevent adding resources safely.");
                }
                interfaceC17721 = interfaceC17722;
            }
        }
        if (interfaceC17721 != null) {
            return interfaceC17721;
        }
        JSONArray jSONArrayArray = JSON.array();
        HashSet hashSet = new HashSet();
        for (InterfaceC17721 interfaceC17723 : interfaceC6432.mo17615()) {
            if (hashSet.add(Integer.valueOf(interfaceC17723.mo19106()))) {
                jSONArrayArray.add("0x" + C22703.m50274(interfaceC17723.mo19106()).substring(8));
            }
        }
        C12731 c12731M9767 = m9767("RESOURCE_PACKAGE_NOT_FOUND", "Resource package not found; creating packages is not supported.");
        c12731M9767.f42468.put("availablePackageIds", jSONArrayArray);
        throw c12731M9767;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9758(C8340 c8340) throws C12731 {
        C18923 c18923M21780 = c8340.m21780("name");
        if (c18923M21780 == null || c18923M21780.m43586().isEmpty() || c18923M21780.m43586().indexOf(0) >= 0) {
            throw m9767("INVALID_VALUE_XML", "valueXml requires a non-empty resource name without NUL.");
        }
        return c18923M21780.m43586();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9759(C8340 c8340, String str) throws C12731 {
        String strM21779 = c8340.m21779();
        C18923 c18923M21780 = c8340.m21780("type");
        String strM43586 = c18923M21780 == null ? null : c18923M21780.m43586();
        Object obj = ("string-array".equals(strM21779) || "integer-array".equals(strM21779)) ? "array" : strM21779;
        boolean zContains = f12147.contains(strM21779);
        if (!zContains && !f12148.contains(obj)) {
            throw m9767("UNSUPPORTED_VALUE_XML", C0252.m1693("Unsupported valueXml root: ", strM21779));
        }
        if (str != null) {
            if (strM43586 != null && !strM43586.equals(str)) {
                throw m9767("INVALID_VALUE_XML", "valueXml type attribute does not match the target resource type.");
            }
            m9764(str);
            return str;
        }
        if (zContains) {
            if (strM43586 == null) {
                throw m9767("INVALID_VALUE_XML", "This valueXml root requires a type attribute when creating a resource.");
            }
            if (strM43586.isEmpty()) {
                throw m9767("INVALID_VALUE_XML", "Resource type must not be empty.");
            }
            for (int i = 0; i < strM43586.length(); i++) {
                char cCharAt = strM43586.charAt(i);
                if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (i <= 0 || i >= strM43586.length() - 1 || cCharAt < '0' || cCharAt > '9'))) {
                    throw m9767("INVALID_VALUE_XML", "Resource type must contain lowercase ASCII letters, digits, or underscores, start with a letter or underscore, and not end in a digit.");
                }
            }
        } else {
            if (strM43586 != null && !strM43586.equals(obj)) {
                throw m9767("INVALID_VALUE_XML", "valueXml type attribute conflicts with its root element.");
            }
            strM43586 = obj;
        }
        m9764(strM43586);
        return strM43586;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9764(String str) throws C12731 {
        if ("attr".equals(str) || "^attr-private".equals(str)) {
            throw m9767("UNSUPPORTED_VALUE_XML", "Adding attr definitions or their variants is not supported.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15916 m9762(String str, InterfaceC17721 interfaceC17721) throws C12731 {
        String strM37865 = "default";
        try {
            C15916 c15916M37840 = C15916.m37840("default".equals(str) ? "" : str, interfaceC17721.mo19107());
            if (!c15916M37840.m37865().isEmpty()) {
                strM37865 = c15916M37840.m37865();
            }
            if (strM37865.equals(str)) {
                return c15916M37840;
            }
            throw new IllegalArgumentException("Use canonical variant: ".concat(strM37865));
        } catch (Exception e) {
            throw m9767("INVALID_RESOURCE_VARIANT", e.getMessage() == null ? "Invalid resource variant." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m9766(InterfaceC17721 interfaceC17721, C9629 c9629, int i, String str, C15916 c15916, InterfaceC3609 interfaceC3609) {
        C7262 c7262M50439 = C22785.m50438().m50439(interfaceC17721.mo19106(), interfaceC17721.getPackageName());
        c7262M50439.m19388(interfaceC17721.mo19107());
        C0206 c0206M19392 = c7262M50439.m19392(c9629.f32425, c9629.f32423);
        c0206M19392.m1526(i, str, false);
        C18551 c18551M47902 = c0206M19392.m1523(c15916).m47902(i);
        c18551M47902.m42947();
        if (interfaceC3609 != null) {
            c18551M47902.m42945(interfaceC3609.mo7649());
            c18551M47902.m42935(interfaceC3609.mo7648());
        }
        return C1098.m4102(c18551M47902);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m9767(String str, String str2) {
        return C12731.m31623(null, str, str2, "warning");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9765(C12731 c12731, int i, int i2, String str, String str2) {
        c12731.f42468.put("failedAddIndex", i).put("failedValueIndex", i2 < 0 ? JSON.NULL : JSON.value(i2)).put("locator", str == null ? JSON.NULL : JSON.value("resource:".concat(str))).put("variant", str2 == null ? JSON.NULL : JSON.value(str2));
    }
}
