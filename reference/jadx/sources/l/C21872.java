package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩸᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7AJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7845 f70965;

    public C21872(C7845 c7845) {
        this.f70965 = c7845;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m48649(C4667 c4667, C15283 c15283) {
        String str = c4667.f16494;
        String str2 = c4667.f16488;
        C15523 c15523 = new C15523(this, c4667, c15283);
        C7845 c7845 = this.f70965;
        C17669 c17669 = (C17669) c7845.m20698(str, str2, (String) null, c15523);
        c7845.m20720(str);
        return c17669;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17669 m48648(C21872 c21872, C4667 c4667, C15283 c15283, int i) throws C12731 {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONValue jSONValueAdd;
        JSONObject jSONObjectM3193;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONValue jSONValueAdd2;
        AbstractC21803 abstractC21803M20716 = c21872.f70965.m20716(c4667, c15283);
        int i2 = C23044.f74862;
        String str12 = c4667.f16488;
        if (abstractC21803M20716 instanceof C13572) {
            throw C12731.m31630("UNSUPPORTED_RESOURCE_READ", "Resource reads must use mt_apk_resource_read batch arguments.");
        }
        if (abstractC21803M20716 instanceof C20191) {
            C20191 c20191 = (C20191) abstractC21803M20716;
            long j = c20191.f65540;
            String str13 = c20191.f65538;
            int i3 = c20191.f65539;
            byte[] bArr = c20191.f65542;
            int i4 = c20191.f65543;
            C2550 c2550 = c20191.f65541;
            if (j < 0 || j > 9007199254740991L) {
                j = -1;
            }
            String str14 = "hex";
            JSONObject jSONObjectAdd = C3184.m9603("workspaceId", str13, "editSessionId", str12).add("locator", C17638.m41045(c2550)).add("name", c2550.m7954()).add("maxBytes", i4).add(e.m, JSON.object().add("hex", C9754.m24738(bArr)).add("byteOffset", i3).add("nextByteOffset", ((long) i3) + ((long) bArr.length)).add("totalBytes", j)).add("nextActions", JSON.array());
            if (c20191.f65537) {
                str8 = "nextByteOffset";
                str14 = str14;
                str9 = "byteOffset";
                String strM43390 = C18810.m43390("read", c20191.f65538, str12, i, JSON.object().add("target", C17638.m41045(c2550)).add("format", str14).add("recommendedLimit", i4).add("limitMax", 65536), JSON.object().add("hexOffset", c20191.f65536));
                str10 = "pagination";
                jSONObjectAdd.add(str10, m48645(strM43390, true));
                jSONObjectAdd.getJSONArray("nextActions").add(C11320.m28376(C17638.m41034(str13, i4, str12, strM43390), "mt_apk_continue", "continue", "Continue reading next hex byte page"));
                str11 = null;
            } else {
                str8 = "nextByteOffset";
                str9 = "byteOffset";
                str10 = "pagination";
                jSONObjectAdd.add(str10, m48645((String) null, false));
                str11 = null;
            }
            JSONObject jSONObjectAdd2 = JSON.object().add("workspaceId", jSONObjectAdd.getString("workspaceId", str11)).add("editSessionId", jSONObjectAdd.getString("editSessionId", "")).add("locator", C10413.m26320(jSONObjectAdd.get(r8))).add("name", jSONObjectAdd.getString("name", str11)).add("maxBytes", jSONObjectAdd.get("maxBytes") == null ? JSON.NULL : jSONObjectAdd.get("maxBytes"));
            JSONObject jSONObject = jSONObjectAdd.getJSONObject(e.m);
            if (jSONObject == null) {
                jSONValueAdd2 = JSON.NULL;
            } else {
                String str15 = str14;
                String str16 = str9;
                String str17 = str8;
                jSONValueAdd2 = JSON.object().add(str15, jSONObject.getString(str15, "")).add(str16, jSONObject.get(str16) == null ? JSON.NULL : jSONObject.get(str16)).add(str17, jSONObject.getLong(str17, 0L)).add("totalBytes", jSONObject.getLong("totalBytes", -1L));
            }
            jSONObjectM3193 = C0735.m3193(jSONObjectAdd2.add("byteWindow", jSONValueAdd2).add(str10, jSONObjectAdd.getJSONObject(str10)), jSONObjectAdd.getJSONArray("nextActions"));
        } else {
            C6515 c6515 = (C6515) abstractC21803M20716;
            C10344 c10344 = c6515.f21944;
            int i5 = c6515.f21941;
            String str18 = c6515.f21949;
            Integer num = c6515.f21947;
            C2550 c2551 = c6515.f21942;
            String strM41045 = C17638.m41045(c2551);
            JSONObject jSONObjectObject = JSON.object();
            String str19 = c10344.f35469;
            boolean z = c10344.f35462;
            JSONObject jSONObjectAdd3 = jSONObjectObject.add(TextBundle.TEXT_ENTRY, str19);
            int i6 = c10344.f35468;
            JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("startLine", i6).add("startColumn", c10344.f35467);
            int i7 = c10344.f35463;
            JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("nextLine", i7).add("nextColumn", c10344.f35460).add("returnedLineCount", c10344.f35465);
            String str20 = c10344.f35469;
            JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("returnedCodePoints", str20.codePointCount(0, str20.length()));
            boolean z2 = c6515.f21940;
            JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("totalLineCount", z2 ? -1 : c10344.f35464).add("lineTruncated", c10344.f35459);
            if (num != null) {
                jSONObjectAdd7.add("absoluteStartLine", num.intValue() + i6).add("absoluteEndLine", num.intValue() + i7);
            }
            JSONObject jSONObjectAdd8 = C3184.m9603("workspaceId", str18, "editSessionId", str12).add("locator", strM41045).add("name", c2551.m7954()).add("textSourceKind", c6515.f21948).add("targetVersion", c6515.f21945).add("truncated", z || z2).add("limit", i5).add(e.m, jSONObjectAdd7).add("nextActions", JSON.array());
            String str21 = c6515.f21946;
            if (str21 != null) {
                jSONObjectAdd8.add("truncatedReason", str21);
            } else if (z) {
                jSONObjectAdd8.add("truncatedReason", "window");
            }
            if (!z || c10344.f35461 == null) {
                str = "limit";
                str2 = "truncated";
                str3 = "pagination";
                str4 = TextBundle.TEXT_ENTRY;
                str5 = "";
                str6 = "truncatedReason";
                jSONObjectAdd8.add(str3, m48645((String) null, false));
                str7 = null;
            } else {
                String str22 = c6515.f21949;
                str = "limit";
                JSONObject jSONObjectAdd9 = JSON.object().add("target", C17638.m41045(c2551)).add("format", TextBundle.TEXT_ENTRY).add("recommendedLimit", i5).add("limitMax", 2000).add("maxChars", c6515.f21943);
                JSONObject jSONObjectAdd10 = JSON.object().add("lineOffset", c10344.f35461.intValue());
                Integer num2 = c10344.f35466;
                JSONObject jSONObjectAdd11 = jSONObjectAdd10.add("lineCharOffset", num2 == null ? 0 : num2.intValue());
                str6 = "truncatedReason";
                str2 = "truncated";
                str5 = "";
                str4 = TextBundle.TEXT_ENTRY;
                str3 = "pagination";
                String strM43391 = C18810.m43390("read", str22, str12, i, jSONObjectAdd9, jSONObjectAdd11);
                jSONObjectAdd8.add(str3, m48645(strM43391, true));
                jSONObjectAdd8.getJSONArray("nextActions").add(C11320.m28376(C17638.m41034(str18, i5, str12, strM43391), "mt_apk_continue", "continue", "Continue reading next page"));
                str7 = null;
            }
            String str23 = str;
            String str24 = str2;
            JSONObject jSONObjectAdd12 = JSON.object().add("workspaceId", jSONObjectAdd8.getString("workspaceId", str7)).add("editSessionId", jSONObjectAdd8.getString("editSessionId", str5)).add("locator", C10413.m26320(jSONObjectAdd8.get("locator"))).add("name", jSONObjectAdd8.getString("name", str7)).add("textSourceKind", jSONObjectAdd8.getString("textSourceKind", str7)).add("targetVersion", jSONObjectAdd8.getString("targetVersion", str7)).add(str23, jSONObjectAdd8.get(str23) == null ? JSON.NULL : jSONObjectAdd8.get(str23)).add(str24, jSONObjectAdd8.getBoolean(str24, false));
            String str25 = str6;
            JSONObject jSONObjectAdd13 = jSONObjectAdd12.add(str25, jSONObjectAdd8.getString(str25, str7));
            JSONObject jSONObject2 = jSONObjectAdd8.getJSONObject(e.m);
            if (jSONObject2 == null) {
                jSONValueAdd = JSON.NULL;
            } else {
                String str26 = str4;
                jSONValueAdd = JSON.object().add(str26, jSONObject2.getString(str26, str5)).add("startLine", jSONObject2.getInt("startLine", 0)).add("startColumn", jSONObject2.getInt("startColumn", 0)).add("nextLine", jSONObject2.getInt("nextLine", 0)).add("nextColumn", jSONObject2.getInt("nextColumn", 0)).add("returnedLineCount", jSONObject2.getInt("returnedLineCount", 0)).add("returnedCodePoints", jSONObject2.getInt("returnedCodePoints", 0)).add("totalLineCount", jSONObject2.getInt("totalLineCount", -1)).add("lineTruncated", jSONObject2.getBoolean("lineTruncated", false)).add("absoluteStartLine", C10413.m26312(jSONObject2.get("absoluteStartLine"))).add("absoluteEndLine", C10413.m26312(jSONObject2.get("absoluteEndLine")));
            }
            jSONObjectM3193 = C0735.m3193(jSONObjectAdd13.add("textWindow", jSONValueAdd).add(str3, jSONObjectAdd8.getJSONObject(str3)), jSONObjectAdd8.getJSONArray("nextActions"));
        }
        return new C17669(jSONObjectM3193);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:171:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:172:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m48650(C11724 c11724) {
        String str;
        C13531 c13531;
        byte b;
        JSONObject jSONObject;
        C13531 c13532;
        JSONValue jSONValueValue;
        Object obj;
        String str2;
        Object obj2;
        Object obj3;
        byte b2;
        String str3;
        JSONValue jSONValueValue2;
        Integer num;
        JSONValue jSONValueValue3;
        JSONObject jSONObjectAdd;
        JSONArray jSONArray;
        JSONValue jSONValueValue4;
        C7845 c7845 = this.f70965;
        C9608 c9608M20707 = c7845.m20707(c11724);
        int i = C23044.f74862;
        String str4 = c11724.f39413;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c9608M20707.f32372.iterator();
        while (true) {
            str = "locator";
            if (!it.hasNext()) {
                break;
            }
            C11455 c11455 = (C11455) it.next();
            jSONArrayArray.add(JSON.object().add("locator", m48647(c11455.f38556)).add("variants", C10413.m26314(c11455.f38557)));
        }
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it2 = c9608M20707.f32374.iterator();
        while (it2.hasNext()) {
            C1845 c1845 = (C1845) it2.next();
            String str5 = c1845.f7052;
            String str6 = c1845.f7050;
            String str7 = c1845.f7053;
            int i2 = c1845.f7055;
            C17327 c17327 = c1845.f7054;
            Iterator it3 = it2;
            C7845 c7846 = c7845;
            if (str5 != null) {
                jSONObjectAdd = JSON.object().add("index", i2).add(str, m48647(str7)).add("variant", str6).add("errorCode", str5).add("message", c1845.f7051);
                if (!"RESOURCE_NOT_FOUND".equals(str5)) {
                    if ("RESOURCE_VARIANT_NOT_FOUND".equals(str5) && c17327 != null) {
                        jSONObjectAdd = jSONObjectAdd.add("type", c17327.f55133).add("name", c17327.f55132);
                    } else {
                        throw new IllegalStateException("Unsupported resource read error: ".concat(str5));
                    }
                }
                jSONArray = jSONArrayArray2;
            } else {
                if (c17327 == null || (c13531 = c1845.f7056) == null) {
                    throw new IllegalStateException("Missing successful resource read value");
                }
                JSONObject jSONObjectAdd2 = JSON.object().add("index", i2).add(str, m48647(str7)).add("variant", str6).add("type", c17327.f55133).add("name", c17327.f55132);
                String str8 = c13531.f44684;
                boolean z = c13531.f44686;
                String str9 = c13531.f44683;
                JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("valueKind", str8);
                JSONArray jSONArray2 = jSONArrayArray2;
                String str10 = "valueKind";
                switch (str8) {
                    case "item_list":
                        b = 0;
                        break;
                    case "null_value":
                        b = 1;
                        break;
                    case "fraction":
                        b = 2;
                        break;
                    case "file_path":
                        b = 3;
                        break;
                    case "dimension":
                        b = 4;
                        break;
                    case "number":
                        b = 5;
                        break;
                    case "reference":
                        b = 6;
                        break;
                    case "unparsed":
                        b = 7;
                        break;
                    case "text":
                        b = 8;
                        break;
                    case "attribute":
                        b = 9;
                        break;
                    case "boolean":
                        b = 10;
                        break;
                    case "color":
                        b = 11;
                        break;
                    case "styled_text":
                        b = 12;
                        break;
                    default:
                        b = -1;
                        break;
                }
                String str11 = "zip_entry";
                Object obj4 = "null_value";
                String str12 = "fileLocator";
                Object obj5 = "fraction";
                Object obj6 = "file_path";
                Object obj7 = "dimension";
                Object obj8 = "number";
                switch (b) {
                    case 0:
                        ArrayList arrayList = c13531.f44671;
                        JSONArray jSONArrayArray3 = JSON.array();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C13531 c13533 = (C13531) it4.next();
                            Iterator it5 = it4;
                            JSONObject jSONObjectObject = JSON.object();
                            C13531 c13534 = c13531;
                            String str13 = c13533.f44687;
                            JSONObject jSONObject2 = jSONObjectAdd3;
                            boolean z2 = c13533.f44686;
                            JSONArray jSONArray3 = jSONArrayArray3;
                            String str14 = c13533.f44683;
                            String str15 = str12;
                            String str16 = c13533.f44684;
                            String str17 = str11;
                            JSONObject jSONObjectAdd4 = jSONObjectObject.add("key", str13);
                            String str18 = c13533.f44670;
                            if (str18 == null) {
                                jSONValueValue = JSON.NULL;
                            } else {
                                jSONValueValue = JSON.value(m48647(str18));
                            }
                            JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("keyLocator", jSONValueValue);
                            String str19 = str10;
                            JSONObject jSONObjectAdd6 = jSONObjectAdd5.add(str19, str16);
                            switch (str16.hashCode()) {
                                case -2017576775:
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    b2 = !str16.equals(obj2) ? (byte) -1 : (byte) 0;
                                    break;
                                case -1653751294:
                                    obj = obj8;
                                    str2 = str19;
                                    obj3 = obj5;
                                    if (str16.equals(obj3)) {
                                        b2 = 1;
                                        obj5 = obj3;
                                        obj2 = obj4;
                                    }
                                    obj5 = obj3;
                                    obj2 = obj4;
                                    break;
                                case -1316408056:
                                    obj = obj8;
                                    str2 = str19;
                                    Object obj9 = obj6;
                                    if (!str16.equals(obj9)) {
                                        obj6 = obj9;
                                        obj3 = obj5;
                                        obj5 = obj3;
                                        obj2 = obj4;
                                    } else {
                                        b2 = 2;
                                        obj6 = obj9;
                                        obj2 = obj4;
                                    }
                                    break;
                                case -1095013018:
                                    obj = obj8;
                                    str2 = str19;
                                    Object obj10 = obj7;
                                    if (!str16.equals(obj10)) {
                                        obj7 = obj10;
                                        obj3 = obj5;
                                        obj5 = obj3;
                                        obj2 = obj4;
                                    } else {
                                        b2 = 3;
                                        obj7 = obj10;
                                        obj2 = obj4;
                                    }
                                    break;
                                case -1034364087:
                                    obj = obj8;
                                    if (!str16.equals(obj)) {
                                        str2 = str19;
                                        obj3 = obj5;
                                        obj5 = obj3;
                                        obj2 = obj4;
                                    } else {
                                        b2 = 4;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    break;
                                case -925155509:
                                    if (str16.equals(Name.REFER)) {
                                        obj = obj8;
                                        b2 = 5;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case -108907542:
                                    if (str16.equals("unparsed")) {
                                        obj = obj8;
                                        b2 = 6;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 3556653:
                                    if (str16.equals(TextBundle.TEXT_ENTRY)) {
                                        obj = obj8;
                                        b2 = 7;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 13085340:
                                    if (str16.equals(AnnotationHandler.ATTRIBUTE)) {
                                        obj = obj8;
                                        b2 = 8;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 64711720:
                                    if (str16.equals(ClassTransform.BOOLEAN)) {
                                        obj = obj8;
                                        b2 = 9;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 94842723:
                                    if (str16.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR)) {
                                        obj = obj8;
                                        b2 = 10;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                case 172355865:
                                    if (str16.equals("styled_text")) {
                                        obj = obj8;
                                        b2 = 11;
                                        str2 = str19;
                                        obj2 = obj4;
                                    }
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                                default:
                                    obj = obj8;
                                    str2 = str19;
                                    obj2 = obj4;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                case 1:
                                case 3:
                                case 4:
                                case 6:
                                case 7:
                                case 9:
                                case 10:
                                case 11:
                                    str12 = str15;
                                    str3 = str17;
                                    jSONObjectAdd6.add(b.d, str14).add("valueTruncated", z2);
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c13531 = c13534;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                case 2:
                                    JSONObject jSONObjectAdd7 = jSONObjectAdd6.add(b.d, str14).add("valueTruncated", z2);
                                    String str20 = c13533.f44679;
                                    str3 = str17;
                                    str12 = str15;
                                    jSONObjectAdd7.add(str12, C17638.m41075(str3, str20));
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c13531 = c13534;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                case 5:
                                case 8:
                                    JSONObject jSONObjectAdd8 = jSONObjectAdd6.add(b.d, str14).add("valueTruncated", z2);
                                    String str21 = c13533.f44675;
                                    if (str21 == null) {
                                        jSONValueValue2 = JSON.NULL;
                                    } else {
                                        jSONValueValue2 = JSON.value(m48647(str21));
                                    }
                                    jSONObjectAdd8.add("targetLocator", jSONValueValue2).add("resolvedTarget", m48646(c13533.f44680));
                                    str12 = str15;
                                    str3 = str17;
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c13531 = c13534;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                default:
                                    throw new IllegalStateException("Unsupported resource child value kind: ".concat(str16));
                            }
                        }
                        jSONObject = jSONObjectAdd3;
                        c13532 = c13531;
                        jSONObject.add("items", jSONArrayArray3).add("itemsTruncated", c13532.f44674).add("totalItemCount", c13532.f44682);
                        JSONObject jSONObjectAdd9 = jSONObject.add("targetVersion", c13532.f44688).add("valueXml", c13532.f44676);
                        num = c13532.f44685;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd9.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c13532.f44677).add("editable", c13532.f44673).add("editableReason", c13532.f44681);
                        jSONArray = jSONArray2;
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        jSONObjectAdd3.add(b.d, str9).add("valueTruncated", z);
                        jSONObject = jSONObjectAdd3;
                        c13532 = c13531;
                        JSONObject jSONObjectAdd10 = jSONObject.add("targetVersion", c13532.f44688).add("valueXml", c13532.f44676);
                        num = c13532.f44685;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd10.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c13532.f44677).add("editable", c13532.f44673).add("editableReason", c13532.f44681);
                        jSONArray = jSONArray2;
                        break;
                    case 3:
                        jSONObjectAdd3.add(b.d, str9).add("valueTruncated", z).add("fileLocator", C17638.m41075("zip_entry", c13531.f44679));
                        jSONObject = jSONObjectAdd3;
                        c13532 = c13531;
                        JSONObject jSONObjectAdd11 = jSONObject.add("targetVersion", c13532.f44688).add("valueXml", c13532.f44676);
                        num = c13532.f44685;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd11.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c13532.f44677).add("editable", c13532.f44673).add("editableReason", c13532.f44681);
                        jSONArray = jSONArray2;
                        break;
                    case 6:
                    case 9:
                        JSONObject jSONObjectAdd12 = jSONObjectAdd3.add(b.d, str9).add("valueTruncated", z);
                        String str22 = c13531.f44675;
                        if (str22 == null) {
                            jSONValueValue4 = JSON.NULL;
                        } else {
                            jSONValueValue4 = JSON.value(m48647(str22));
                        }
                        jSONObjectAdd12.add("targetLocator", jSONValueValue4).add("resolvedTarget", m48646(c13531.f44680));
                        jSONObject = jSONObjectAdd3;
                        c13532 = c13531;
                        JSONObject jSONObjectAdd13 = jSONObject.add("targetVersion", c13532.f44688).add("valueXml", c13532.f44676);
                        num = c13532.f44685;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd13.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c13532.f44677).add("editable", c13532.f44673).add("editableReason", c13532.f44681);
                        jSONArray = jSONArray2;
                        break;
                    default:
                        throw new IllegalStateException("Unsupported resource value kind: ".concat(str8));
                }
            }
            jSONArray.add(jSONObjectAdd);
            jSONArrayArray2 = jSONArray;
            it2 = it3;
            c7845 = c7846;
            str = str;
            jSONArrayArray = jSONArrayArray;
            str4 = str4;
            c9608M20707 = c9608M20707;
        }
        JSONObject jSONObjectM32895 = C13406.m32895(JSON.object().add("workspaceId", c9608M20707.f32373).add("editSessionId", str4).add("resourceNamePolicy", c9608M20707.f32375.m35686()).add("variantSets", jSONArrayArray).add("results", jSONArrayArray2).add("nextActions", JSON.array()));
        c7845.m20720(c11724.f39411);
        return new C17669(jSONObjectM32895);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m48651(C21632 c21632, JSONObject jSONObject, C15283 c15283) throws C12731 {
        C4667 c4667M41079 = C17638.m41079(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c21632, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c4667M41079.f16494;
        String str2 = c4667M41079.f16488;
        C15523 c15523 = new C15523(this, c4667M41079, c15283);
        C7845 c7845 = this.f70965;
        C17669 c17669 = (C17669) c7845.m20698(str, str2, string, c15523);
        c7845.m20720(str);
        return c17669;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m48645(String str, boolean z) {
        return JSON.object().add("hasMore", z).add("nextCursor", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48647(String str) {
        return C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, str.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m48646(C9567 c9567) {
        if (c9567 == null) {
            return JSON.NULL;
        }
        return JSON.object().add("locator", m48647(c9567.f32270)).add("missing", c9567.f32274).add("type", c9567.f32271).add("name", c9567.f32272).add("variant", c9567.f32273).add("valueKind", c9567.f32275).add("valueSnippet", c9567.f32268).add("valueTruncated", c9567.f32269);
    }
}
