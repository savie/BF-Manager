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

/* JADX INFO: renamed from: l.ᩴ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7AJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20037 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1897 f64377;

    public C20037(C1897 c1897) {
        this.f64377 = c1897;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m46094(C2642 c2642, C4156 c4156) {
        String str = c2642.f8446;
        String str2 = c2642.f8440;
        C8536 c8536 = new C8536(this, c2642, c4156);
        C1897 c1897 = this.f64377;
        C1238 c1238 = (C1238) c1897.m6532(str, str2, (String) null, c8536);
        c1897.m6556(str);
        return c1238;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1238 m46093(C20037 c20037, C2642 c2642, C4156 c4156, int i) throws C10186 {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONValue jSONValueAdd;
        JSONObject jSONObjectM36728;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONValue jSONValueAdd2;
        AbstractC4279 abstractC4279M6538 = c20037.f64377.m6538(c2642, c4156);
        int i2 = C24294.f78630;
        String str12 = c2642.f8440;
        if (abstractC4279M6538 instanceof C6943) {
            throw C10186.m26305("UNSUPPORTED_RESOURCE_READ", "Resource reads must use mt_apk_resource_read batch arguments.");
        }
        if (abstractC4279M6538 instanceof C24098) {
            C24098 c24098 = (C24098) abstractC4279M6538;
            long j = c24098.f77911;
            String str13 = c24098.f77906;
            int i3 = c24098.f77912;
            byte[] bArr = c24098.f77905;
            int i4 = c24098.f77910;
            C13828 c13828 = c24098.f77908;
            if (j < 0 || j > 9007199254740991L) {
                j = -1;
            }
            String str14 = "hex";
            JSONObject jSONObjectAdd = C22121.m50076("workspaceId", str13, "editSessionId", str12).add("locator", C4375.m13907(c13828)).add("name", c13828.m33748()).add("maxBytes", i4).add(e.m, JSON.object().add("hex", C16973.m40022(bArr)).add("byteOffset", i3).add("nextByteOffset", ((long) i3) + ((long) bArr.length)).add("totalBytes", j)).add("nextActions", JSON.array());
            if (c24098.f77907) {
                str8 = "nextByteOffset";
                str14 = str14;
                str9 = "byteOffset";
                String strM42757 = C18326.m42757("read", c24098.f77906, str12, i, JSON.object().add("target", C4375.m13907(c13828)).add("format", str14).add("recommendedLimit", i4).add("limitMax", 65536), JSON.object().add("hexOffset", c24098.f77909));
                str10 = "pagination";
                jSONObjectAdd.add(str10, m46090(strM42757, true));
                jSONObjectAdd.getJSONArray("nextActions").add(C2729.m9064(C4375.m13896(str13, i4, str12, strM42757), "mt_apk_continue", "continue", "Continue reading next hex byte page"));
                str11 = null;
            } else {
                str8 = "nextByteOffset";
                str9 = "byteOffset";
                str10 = "pagination";
                jSONObjectAdd.add(str10, m46090((String) null, false));
                str11 = null;
            }
            JSONObject jSONObjectAdd2 = JSON.object().add("workspaceId", jSONObjectAdd.getString("workspaceId", str11)).add("editSessionId", jSONObjectAdd.getString("editSessionId", "")).add("locator", C12556.m31239(jSONObjectAdd.get(r8))).add("name", jSONObjectAdd.getString("name", str11)).add("maxBytes", jSONObjectAdd.get("maxBytes") == null ? JSON.NULL : jSONObjectAdd.get("maxBytes"));
            JSONObject jSONObject = jSONObjectAdd.getJSONObject(e.m);
            if (jSONObject == null) {
                jSONValueAdd2 = JSON.NULL;
            } else {
                String str15 = str14;
                String str16 = str9;
                String str17 = str8;
                jSONValueAdd2 = JSON.object().add(str15, jSONObject.getString(str15, "")).add(str16, jSONObject.get(str16) == null ? JSON.NULL : jSONObject.get(str16)).add(str17, jSONObject.getLong(str17, 0L)).add("totalBytes", jSONObject.getLong("totalBytes", -1L));
            }
            jSONObjectM36728 = C15300.m36728(jSONObjectAdd2.add("byteWindow", jSONValueAdd2).add(str10, jSONObjectAdd.getJSONObject(str10)), jSONObjectAdd.getJSONArray("nextActions"));
        } else {
            C13434 c13434 = (C13434) abstractC4279M6538;
            C10121 c10121 = c13434.f42776;
            int i5 = c13434.f42779;
            String str18 = c13434.f42780;
            Integer num = c13434.f42777;
            C13828 c13829 = c13434.f42778;
            String strM13907 = C4375.m13907(c13829);
            JSONObject jSONObjectObject = JSON.object();
            String str19 = c10121.f32405;
            boolean z = c10121.f32396;
            JSONObject jSONObjectAdd3 = jSONObjectObject.add(TextBundle.TEXT_ENTRY, str19);
            int i6 = c10121.f32401;
            JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("startLine", i6).add("startColumn", c10121.f32403);
            int i7 = c10121.f32402;
            JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("nextLine", i7).add("nextColumn", c10121.f32404).add("returnedLineCount", c10121.f32398);
            String str20 = c10121.f32405;
            JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("returnedCodePoints", str20.codePointCount(0, str20.length()));
            boolean z2 = c13434.f42782;
            JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("totalLineCount", z2 ? -1 : c10121.f32399).add("lineTruncated", c10121.f32400);
            if (num != null) {
                jSONObjectAdd7.add("absoluteStartLine", num.intValue() + i6).add("absoluteEndLine", num.intValue() + i7);
            }
            JSONObject jSONObjectAdd8 = C22121.m50076("workspaceId", str18, "editSessionId", str12).add("locator", strM13907).add("name", c13829.m33748()).add("textSourceKind", c13434.f42783).add("targetVersion", c13434.f42784).add("truncated", z || z2).add("limit", i5).add(e.m, jSONObjectAdd7).add("nextActions", JSON.array());
            String str21 = c13434.f42781;
            if (str21 != null) {
                jSONObjectAdd8.add("truncatedReason", str21);
            } else if (z) {
                jSONObjectAdd8.add("truncatedReason", "window");
            }
            if (!z || c10121.f32395 == null) {
                str = "limit";
                str2 = "truncated";
                str3 = "pagination";
                str4 = TextBundle.TEXT_ENTRY;
                str5 = "";
                str6 = "truncatedReason";
                jSONObjectAdd8.add(str3, m46090((String) null, false));
                str7 = null;
            } else {
                String str22 = c13434.f42780;
                str = "limit";
                JSONObject jSONObjectAdd9 = JSON.object().add("target", C4375.m13907(c13829)).add("format", TextBundle.TEXT_ENTRY).add("recommendedLimit", i5).add("limitMax", 2000).add("maxChars", c13434.f42785);
                JSONObject jSONObjectAdd10 = JSON.object().add("lineOffset", c10121.f32395.intValue());
                Integer num2 = c10121.f32397;
                JSONObject jSONObjectAdd11 = jSONObjectAdd10.add("lineCharOffset", num2 == null ? 0 : num2.intValue());
                str6 = "truncatedReason";
                str2 = "truncated";
                str5 = "";
                str4 = TextBundle.TEXT_ENTRY;
                str3 = "pagination";
                String strM42758 = C18326.m42757("read", str22, str12, i, jSONObjectAdd9, jSONObjectAdd11);
                jSONObjectAdd8.add(str3, m46090(strM42758, true));
                jSONObjectAdd8.getJSONArray("nextActions").add(C2729.m9064(C4375.m13896(str18, i5, str12, strM42758), "mt_apk_continue", "continue", "Continue reading next page"));
                str7 = null;
            }
            String str23 = str;
            String str24 = str2;
            JSONObject jSONObjectAdd12 = JSON.object().add("workspaceId", jSONObjectAdd8.getString("workspaceId", str7)).add("editSessionId", jSONObjectAdd8.getString("editSessionId", str5)).add("locator", C12556.m31239(jSONObjectAdd8.get("locator"))).add("name", jSONObjectAdd8.getString("name", str7)).add("textSourceKind", jSONObjectAdd8.getString("textSourceKind", str7)).add("targetVersion", jSONObjectAdd8.getString("targetVersion", str7)).add(str23, jSONObjectAdd8.get(str23) == null ? JSON.NULL : jSONObjectAdd8.get(str23)).add(str24, jSONObjectAdd8.getBoolean(str24, false));
            String str25 = str6;
            JSONObject jSONObjectAdd13 = jSONObjectAdd12.add(str25, jSONObjectAdd8.getString(str25, str7));
            JSONObject jSONObject2 = jSONObjectAdd8.getJSONObject(e.m);
            if (jSONObject2 == null) {
                jSONValueAdd = JSON.NULL;
            } else {
                String str26 = str4;
                jSONValueAdd = JSON.object().add(str26, jSONObject2.getString(str26, str5)).add("startLine", jSONObject2.getInt("startLine", 0)).add("startColumn", jSONObject2.getInt("startColumn", 0)).add("nextLine", jSONObject2.getInt("nextLine", 0)).add("nextColumn", jSONObject2.getInt("nextColumn", 0)).add("returnedLineCount", jSONObject2.getInt("returnedLineCount", 0)).add("returnedCodePoints", jSONObject2.getInt("returnedCodePoints", 0)).add("totalLineCount", jSONObject2.getInt("totalLineCount", -1)).add("lineTruncated", jSONObject2.getBoolean("lineTruncated", false)).add("absoluteStartLine", C12556.m31242(jSONObject2.get("absoluteStartLine"))).add("absoluteEndLine", C12556.m31242(jSONObject2.get("absoluteEndLine")));
            }
            jSONObjectM36728 = C15300.m36728(jSONObjectAdd13.add("textWindow", jSONValueAdd).add(str3, jSONObjectAdd8.getJSONObject(str3)), jSONObjectAdd8.getJSONArray("nextActions"));
        }
        return new C1238(jSONObjectM36728);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:171:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:172:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m46095(C7117 c7117) {
        String str;
        C3497 c3497;
        byte b;
        JSONObject jSONObject;
        C3497 c3498;
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
        C1897 c1897 = this.f64377;
        C9179 c9179M6544 = c1897.m6544(c7117);
        int i = C24294.f78630;
        String str4 = c7117.f23457;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c9179M6544.f29779.iterator();
        while (true) {
            str = "locator";
            if (!it.hasNext()) {
                break;
            }
            C13654 c13654 = (C13654) it.next();
            jSONArrayArray.add(JSON.object().add("locator", m46092(c13654.f43362)).add("variants", C12556.m31235(c13654.f43363)));
        }
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it2 = c9179M6544.f29780.iterator();
        while (it2.hasNext()) {
            C0977 c0977 = (C0977) it2.next();
            String str5 = c0977.f3562;
            String str6 = c0977.f3564;
            String str7 = c0977.f3566;
            int i2 = c0977.f3567;
            C13192 c13192 = c0977.f3563;
            Iterator it3 = it2;
            C1897 c1898 = c1897;
            if (str5 != null) {
                jSONObjectAdd = JSON.object().add("index", i2).add(str, m46092(str7)).add("variant", str6).add("errorCode", str5).add("message", c0977.f3568);
                if (!"RESOURCE_NOT_FOUND".equals(str5)) {
                    if ("RESOURCE_VARIANT_NOT_FOUND".equals(str5) && c13192 != null) {
                        jSONObjectAdd = jSONObjectAdd.add("type", c13192.f42136).add("name", c13192.f42138);
                    } else {
                        throw new IllegalStateException("Unsupported resource read error: ".concat(str5));
                    }
                }
                jSONArray = jSONArrayArray2;
            } else {
                if (c13192 == null || (c3497 = c0977.f3565) == null) {
                    throw new IllegalStateException("Missing successful resource read value");
                }
                JSONObject jSONObjectAdd2 = JSON.object().add("index", i2).add(str, m46092(str7)).add("variant", str6).add("type", c13192.f42136).add("name", c13192.f42138);
                String str8 = c3497.f12068;
                boolean z = c3497.f12063;
                String str9 = c3497.f12061;
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
                        ArrayList arrayList = c3497.f12067;
                        JSONArray jSONArrayArray3 = JSON.array();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C3497 c3499 = (C3497) it4.next();
                            Iterator it5 = it4;
                            JSONObject jSONObjectObject = JSON.object();
                            C3497 c34910 = c3497;
                            String str13 = c3499.f12060;
                            JSONObject jSONObject2 = jSONObjectAdd3;
                            boolean z2 = c3499.f12063;
                            JSONArray jSONArray3 = jSONArrayArray3;
                            String str14 = c3499.f12061;
                            String str15 = str12;
                            String str16 = c3499.f12068;
                            String str17 = str11;
                            JSONObject jSONObjectAdd4 = jSONObjectObject.add("key", str13);
                            String str18 = c3499.f12059;
                            if (str18 == null) {
                                jSONValueValue = JSON.NULL;
                            } else {
                                jSONValueValue = JSON.value(m46092(str18));
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
                                    c3497 = c34910;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                case 2:
                                    JSONObject jSONObjectAdd7 = jSONObjectAdd6.add(b.d, str14).add("valueTruncated", z2);
                                    String str20 = c3499.f12056;
                                    str3 = str17;
                                    str12 = str15;
                                    jSONObjectAdd7.add(str12, C4375.m13930(str3, str20));
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c3497 = c34910;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                case 5:
                                case 8:
                                    JSONObject jSONObjectAdd8 = jSONObjectAdd6.add(b.d, str14).add("valueTruncated", z2);
                                    String str21 = c3499.f12057;
                                    if (str21 == null) {
                                        jSONValueValue2 = JSON.NULL;
                                    } else {
                                        jSONValueValue2 = JSON.value(m46092(str21));
                                    }
                                    jSONObjectAdd8.add("targetLocator", jSONValueValue2).add("resolvedTarget", m46091(c3499.f12054));
                                    str12 = str15;
                                    str3 = str17;
                                    jSONArray3.add(jSONObjectAdd6);
                                    jSONArrayArray3 = jSONArray3;
                                    obj4 = obj2;
                                    str11 = str3;
                                    str10 = str2;
                                    c3497 = c34910;
                                    jSONObjectAdd3 = jSONObject2;
                                    obj8 = obj;
                                    it4 = it5;
                                    break;
                                default:
                                    throw new IllegalStateException("Unsupported resource child value kind: ".concat(str16));
                            }
                        }
                        jSONObject = jSONObjectAdd3;
                        c3498 = c3497;
                        jSONObject.add("items", jSONArrayArray3).add("itemsTruncated", c3498.f12064).add("totalItemCount", c3498.f12062);
                        JSONObject jSONObjectAdd9 = jSONObject.add("targetVersion", c3498.f12069).add("valueXml", c3498.f12052);
                        num = c3498.f12065;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd9.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c3498.f12058).add("editable", c3498.f12053).add("editableReason", c3498.f12066);
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
                        c3498 = c3497;
                        JSONObject jSONObjectAdd10 = jSONObject.add("targetVersion", c3498.f12069).add("valueXml", c3498.f12052);
                        num = c3498.f12065;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd10.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c3498.f12058).add("editable", c3498.f12053).add("editableReason", c3498.f12066);
                        jSONArray = jSONArray2;
                        break;
                    case 3:
                        jSONObjectAdd3.add(b.d, str9).add("valueTruncated", z).add("fileLocator", C4375.m13930("zip_entry", c3497.f12056));
                        jSONObject = jSONObjectAdd3;
                        c3498 = c3497;
                        JSONObject jSONObjectAdd11 = jSONObject.add("targetVersion", c3498.f12069).add("valueXml", c3498.f12052);
                        num = c3498.f12065;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd11.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c3498.f12058).add("editable", c3498.f12053).add("editableReason", c3498.f12066);
                        jSONArray = jSONArray2;
                        break;
                    case 6:
                    case 9:
                        JSONObject jSONObjectAdd12 = jSONObjectAdd3.add(b.d, str9).add("valueTruncated", z);
                        String str22 = c3497.f12057;
                        if (str22 == null) {
                            jSONValueValue4 = JSON.NULL;
                        } else {
                            jSONValueValue4 = JSON.value(m46092(str22));
                        }
                        jSONObjectAdd12.add("targetLocator", jSONValueValue4).add("resolvedTarget", m46091(c3497.f12054));
                        jSONObject = jSONObjectAdd3;
                        c3498 = c3497;
                        JSONObject jSONObjectAdd13 = jSONObject.add("targetVersion", c3498.f12069).add("valueXml", c3498.f12052);
                        num = c3498.f12065;
                        if (num == null) {
                            jSONValueValue3 = JSON.NULL;
                        } else {
                            jSONValueValue3 = JSON.value(num.intValue());
                        }
                        jSONObjectAdd = jSONObjectAdd13.add("valueXmlCharCount", jSONValueValue3).add("valueXmlTruncated", c3498.f12058).add("editable", c3498.f12053).add("editableReason", c3498.f12066);
                        jSONArray = jSONArray2;
                        break;
                    default:
                        throw new IllegalStateException("Unsupported resource value kind: ".concat(str8));
                }
            }
            jSONArray.add(jSONObjectAdd);
            jSONArrayArray2 = jSONArray;
            it2 = it3;
            c1897 = c1898;
            str = str;
            jSONArrayArray = jSONArrayArray;
            str4 = str4;
            c9179M6544 = c9179M6544;
        }
        JSONObject jSONObjectM19085 = C6855.m19085(JSON.object().add("workspaceId", c9179M6544.f29781).add("editSessionId", str4).add("resourceNamePolicy", c9179M6544.f29778.m44398()).add("variantSets", jSONArrayArray).add("results", jSONArrayArray2).add("nextActions", JSON.array()));
        c1897.m6556(c7117.f23459);
        return new C1238(jSONObjectM19085);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m46096(C14596 c14596, JSONObject jSONObject, C4156 c4156) throws C10186 {
        C2642 c2642M13970 = C4375.m13970(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c14596, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c2642M13970.f8446;
        String str2 = c2642M13970.f8440;
        C8536 c8536 = new C8536(this, c2642M13970, c4156);
        C1897 c1897 = this.f64377;
        C1238 c1238 = (C1238) c1897.m6532(str, str2, string, c8536);
        c1897.m6556(str);
        return c1238;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m46090(String str, boolean z) {
        return JSON.object().add("hasMore", z).add("nextCursor", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46092(String str) {
        return C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, str.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m46091(C17667 c17667) {
        if (c17667 == null) {
            return JSON.NULL;
        }
        return JSON.object().add("locator", m46092(c17667.f58050)).add("missing", c17667.f58056).add("type", c17667.f58055).add("name", c17667.f58052).add("variant", c17667.f58051).add("valueKind", c17667.f58054).add("valueSnippet", c17667.f58053).add("valueTruncated", c17667.f58057);
    }
}
