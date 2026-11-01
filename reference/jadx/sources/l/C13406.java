package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M798 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13406 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0317  */
    /* JADX WARN: Code duplicated, block: B:88:0x023d  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32895(JSONObject jSONObject) {
        JSONObject jSONObjectAdd;
        byte b;
        JSONArray jSONArray;
        boolean z;
        String str;
        JSONObject jSONObject2;
        Object obj;
        Object obj2;
        String str2;
        byte b2;
        JSONObject jSONObject3;
        JSONObject jSONObjectAdd2;
        JSONArray jSONArray2;
        String str3 = null;
        JSONObject jSONObjectAdd3 = JSON.object().add("workspaceId", jSONObject.getString("workspaceId", null)).add("editSessionId", jSONObject.getString("editSessionId", ""));
        JSONObject jSONObject4 = jSONObject.getJSONObject("resourceNamePolicy");
        if (jSONObject4 == null) {
            jSONObjectAdd = JSON.object().add("confused", false).add("appReferenceOutput", "names_or_hex").add("appNameReferencesAccepted", true).add("systemNameReferencesAccepted", true).add("hexPrefixAccepted", true);
        } else {
            jSONObjectAdd = JSON.object().add("confused", jSONObject4.getBoolean("confused", false)).add("appReferenceOutput", jSONObject4.getString("appReferenceOutput", "names_or_hex")).add("appNameReferencesAccepted", jSONObject4.getBoolean("appNameReferencesAccepted", true)).add("systemNameReferencesAccepted", jSONObject4.getBoolean("systemNameReferencesAccepted", true)).add("hexPrefixAccepted", jSONObject4.getBoolean("hexPrefixAccepted", true));
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("resourceNamePolicy", jSONObjectAdd);
        JSONArray jSONArray3 = jSONObject.getJSONArray("variantSets");
        JSONArray jSONArrayArray = JSON.array();
        String str4 = "locator";
        if (jSONArray3 != null) {
            Iterator it = jSONArray3.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                jSONArrayArray.add(JSON.object().add("locator", C10413.m26320(jSONObjectAsObject.get("locator"))).add("variants", C10413.m26313(jSONObjectAsObject.getJSONArray("variants"))));
            }
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("variantSets", jSONArrayArray);
        String str5 = "results";
        JSONArray jSONArray4 = jSONObject.getJSONArray("results");
        JSONArray jSONArrayArray2 = JSON.array();
        if (jSONArray4 != null) {
            Iterator it2 = jSONArray4.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it2.next()).asObject();
                int i = jSONObjectAsObject2.getInt("index", -1);
                if (i < 0) {
                    throw new IllegalStateException("Invalid resource read integer: ".concat("index"));
                }
                String strM32890 = m32890(jSONObjectAsObject2, str4);
                String strM32896 = m32896(jSONObjectAsObject2, "variant");
                String string = jSONObjectAsObject2.getString("errorCode", str3);
                Iterator it3 = it2;
                if (string != null) {
                    jSONObjectAdd2 = JSON.object().add("index", i).add(str4, strM32890).add("variant", strM32896).add("errorCode", string).add("message", m32896(jSONObjectAsObject2, "message"));
                    if (!"RESOURCE_NOT_FOUND".equals(string)) {
                        if ("RESOURCE_VARIANT_NOT_FOUND".equals(string)) {
                            jSONObjectAdd2 = jSONObjectAdd2.add("type", m32896(jSONObjectAsObject2, "type")).add("name", m32896(jSONObjectAsObject2, "name"));
                        } else {
                            throw new IllegalStateException("Unsupported resource read error: ".concat(string));
                        }
                    }
                    str3 = null;
                    jSONArray2 = jSONArrayArray2;
                } else {
                    String str6 = "valueKind";
                    String strM32897 = m32896(jSONObjectAsObject2, "valueKind");
                    JSONObject jSONObjectAdd6 = JSON.object().add("index", i).add(str4, strM32890).add("variant", strM32896).add("type", m32896(jSONObjectAsObject2, "type")).add("name", m32896(jSONObjectAsObject2, "name")).add("valueKind", strM32897);
                    switch (strM32897) {
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
                    String str7 = "fileLocator";
                    JSONArray jSONArray5 = jSONArrayArray2;
                    String str8 = "resolvedTarget";
                    Object obj3 = "null_value";
                    Object obj4 = "fraction";
                    Object obj5 = "file_path";
                    switch (b) {
                        case 0:
                            String str9 = "items";
                            JSONArray jSONArray6 = jSONObjectAsObject2.getJSONArray("items");
                            JSONArray jSONArrayArray3 = JSON.array();
                            if (jSONArray6 == null) {
                                z = false;
                                jSONObject2 = jSONObjectAdd6;
                                str = "items";
                                jSONArray = jSONArrayArray3;
                            } else {
                                Iterator it4 = jSONArray6.iterator();
                                while (it4.hasNext()) {
                                    JSONObject jSONObject5 = jSONObjectAdd6;
                                    JSONObject jSONObjectAsObject3 = ((JSONValue) it4.next()).asObject();
                                    String str10 = str9;
                                    String strM32898 = m32896(jSONObjectAsObject3, str6);
                                    JSONArray jSONArray7 = jSONArrayArray3;
                                    String str11 = str7;
                                    String str12 = str8;
                                    JSONObject jSONObjectAdd7 = JSON.object().add("key", jSONObjectAsObject3.getString("key", null)).add("keyLocator", C10413.m26320(jSONObjectAsObject3.get("keyLocator"))).add(str6, strM32898);
                                    switch (strM32898.hashCode()) {
                                        case -2017576775:
                                            obj = obj4;
                                            obj2 = obj5;
                                            str2 = str6;
                                            obj3 = obj3;
                                            b2 = !strM32898.equals(obj3) ? (byte) -1 : (byte) 0;
                                            break;
                                        case -1653751294:
                                            obj = obj4;
                                            obj2 = obj5;
                                            if (!strM32898.equals(obj)) {
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 1;
                                            }
                                            break;
                                        case -1316408056:
                                            obj2 = obj5;
                                            if (!strM32898.equals(obj2)) {
                                                str2 = str6;
                                                obj3 = obj3;
                                                obj = obj4;
                                            } else {
                                                str2 = str6;
                                                obj3 = obj3;
                                                obj = obj4;
                                                b2 = 2;
                                            }
                                            break;
                                        case -1095013018:
                                            if (!strM32898.equals("dimension")) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 3;
                                            }
                                            break;
                                        case -1034364087:
                                            if (!strM32898.equals("number")) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 4;
                                            }
                                            break;
                                        case -925155509:
                                            if (!strM32898.equals(Name.REFER)) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 5;
                                            }
                                            break;
                                        case -108907542:
                                            if (!strM32898.equals("unparsed")) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 6;
                                            }
                                            break;
                                        case 3556653:
                                            if (!strM32898.equals(TextBundle.TEXT_ENTRY)) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 7;
                                            }
                                            break;
                                        case 13085340:
                                            if (!strM32898.equals(AnnotationHandler.ATTRIBUTE)) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 8;
                                            }
                                            break;
                                        case 64711720:
                                            if (!strM32898.equals(ClassTransform.BOOLEAN)) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 9;
                                            }
                                            break;
                                        case 94842723:
                                            if (!strM32898.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR)) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 10;
                                            }
                                            break;
                                        case 172355865:
                                            if (!strM32898.equals("styled_text")) {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                            } else {
                                                obj = obj4;
                                                obj2 = obj5;
                                                str2 = str6;
                                                obj3 = obj3;
                                                b2 = 11;
                                            }
                                            break;
                                        default:
                                            obj = obj4;
                                            obj2 = obj5;
                                            str2 = str6;
                                            obj3 = obj3;
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
                                            jSONObjectAdd7.add(b.d, jSONObjectAsObject3.getString(b.d, null)).add("valueTruncated", jSONObjectAsObject3.getBoolean("valueTruncated", false));
                                            break;
                                        case 2:
                                            jSONObjectAdd7.add(b.d, m32896(jSONObjectAsObject3, b.d)).add("valueTruncated", jSONObjectAsObject3.getBoolean("valueTruncated", false)).add(str11, m32890(jSONObjectAsObject3, str11));
                                            break;
                                        case 5:
                                        case 8:
                                            jSONObjectAdd7.add(b.d, m32896(jSONObjectAsObject3, b.d)).add("valueTruncated", jSONObjectAsObject3.getBoolean("valueTruncated", false)).add("targetLocator", C10413.m26320(jSONObjectAsObject3.get("targetLocator"))).add(str12, m32889(jSONObjectAsObject3.getJSONObject(str12)));
                                            break;
                                        default:
                                            throw new IllegalStateException("Unsupported resource child value kind: ".concat(strM32898));
                                    }
                                    jSONArray7.add(jSONObjectAdd7);
                                    obj4 = obj;
                                    str6 = str2;
                                    str9 = str10;
                                    str7 = str11;
                                    str8 = str12;
                                    obj5 = obj2;
                                    jSONArrayArray3 = jSONArray7;
                                    jSONObjectAdd6 = jSONObject5;
                                }
                                JSONObject jSONObject6 = jSONObjectAdd6;
                                jSONArray = jSONArrayArray3;
                                z = false;
                                str = str9;
                                jSONObject2 = jSONObject6;
                            }
                            jSONObject3 = jSONObjectAsObject2;
                            JSONObject jSONObjectAdd8 = jSONObject2.add(str, jSONArray).add("itemsTruncated", jSONObject3.getBoolean("itemsTruncated", z));
                            int i2 = jSONObject3.getInt("totalItemCount", -1);
                            if (i2 >= 0) {
                                jSONObjectAdd8.add("totalItemCount", i2);
                                jSONObjectAdd2 = jSONObject2.add("targetVersion", m32896(jSONObject3, "targetVersion")).add("valueXml", jSONObject3.getString("valueXml", null)).add("valueXmlCharCount", C10413.m26312(jSONObject3.get("valueXmlCharCount"))).add("valueXmlTruncated", jSONObject3.getBoolean("valueXmlTruncated", false)).add("editable", jSONObject3.getBoolean("editable", false)).add("editableReason", jSONObject3.getString("editableReason", null));
                                str3 = null;
                                jSONArray2 = jSONArray5;
                            } else {
                                throw new IllegalStateException("Invalid resource read integer: ".concat("totalItemCount"));
                            }
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
                            jSONObjectAdd6.add(b.d, jSONObjectAsObject2.getString(b.d, null)).add("valueTruncated", jSONObjectAsObject2.getBoolean("valueTruncated", false));
                            jSONObject2 = jSONObjectAdd6;
                            jSONObject3 = jSONObjectAsObject2;
                            jSONObjectAdd2 = jSONObject2.add("targetVersion", m32896(jSONObject3, "targetVersion")).add("valueXml", jSONObject3.getString("valueXml", null)).add("valueXmlCharCount", C10413.m26312(jSONObject3.get("valueXmlCharCount"))).add("valueXmlTruncated", jSONObject3.getBoolean("valueXmlTruncated", false)).add("editable", jSONObject3.getBoolean("editable", false)).add("editableReason", jSONObject3.getString("editableReason", null));
                            str3 = null;
                            jSONArray2 = jSONArray5;
                            break;
                        case 3:
                            jSONObjectAdd6.add(b.d, m32896(jSONObjectAsObject2, b.d)).add("valueTruncated", jSONObjectAsObject2.getBoolean("valueTruncated", false)).add("fileLocator", m32890(jSONObjectAsObject2, "fileLocator"));
                            jSONObject2 = jSONObjectAdd6;
                            jSONObject3 = jSONObjectAsObject2;
                            jSONObjectAdd2 = jSONObject2.add("targetVersion", m32896(jSONObject3, "targetVersion")).add("valueXml", jSONObject3.getString("valueXml", null)).add("valueXmlCharCount", C10413.m26312(jSONObject3.get("valueXmlCharCount"))).add("valueXmlTruncated", jSONObject3.getBoolean("valueXmlTruncated", false)).add("editable", jSONObject3.getBoolean("editable", false)).add("editableReason", jSONObject3.getString("editableReason", null));
                            str3 = null;
                            jSONArray2 = jSONArray5;
                            break;
                        case 6:
                        case 9:
                            jSONObjectAdd6.add(b.d, m32896(jSONObjectAsObject2, b.d)).add("valueTruncated", jSONObjectAsObject2.getBoolean("valueTruncated", false)).add("targetLocator", C10413.m26320(jSONObjectAsObject2.get("targetLocator"))).add("resolvedTarget", m32889(jSONObjectAsObject2.getJSONObject("resolvedTarget")));
                            jSONObject2 = jSONObjectAdd6;
                            jSONObject3 = jSONObjectAsObject2;
                            jSONObjectAdd2 = jSONObject2.add("targetVersion", m32896(jSONObject3, "targetVersion")).add("valueXml", jSONObject3.getString("valueXml", null)).add("valueXmlCharCount", C10413.m26312(jSONObject3.get("valueXmlCharCount"))).add("valueXmlTruncated", jSONObject3.getBoolean("valueXmlTruncated", false)).add("editable", jSONObject3.getBoolean("editable", false)).add("editableReason", jSONObject3.getString("editableReason", null));
                            str3 = null;
                            jSONArray2 = jSONArray5;
                            break;
                        default:
                            throw new IllegalStateException("Unsupported resource value kind: ".concat(strM32897));
                    }
                }
                jSONArray2.add(jSONObjectAdd2);
                jSONArrayArray2 = jSONArray2;
                it2 = it3;
                str4 = str4;
                jSONObjectAdd5 = jSONObjectAdd5;
                str5 = str5;
            }
        }
        return C0735.m3193(jSONObjectAdd5.add(str5, jSONArrayArray2), jSONObject.getJSONArray("nextActions"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m32889(JSONObject jSONObject) {
        if (jSONObject == null) {
            return JSON.NULL;
        }
        return JSON.object().add("locator", m32890(jSONObject, "locator")).add("missing", jSONObject.getBoolean("missing", false)).add("type", jSONObject.getString("type", null)).add("name", jSONObject.getString("name", null)).add("variant", jSONObject.getString("variant", null)).add("valueKind", jSONObject.getString("valueKind", null)).add("valueSnippet", jSONObject.getString("valueSnippet", null)).add("valueTruncated", jSONObject.getBoolean("valueTruncated", false));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m32896(JSONObject jSONObject, String str) {
        String string = jSONObject.getString(str, null);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Missing resource read field: ".concat(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32890(JSONObject jSONObject, String str) {
        JSONValue jSONValueM26320 = C10413.m26320(jSONObject.get(str));
        if (jSONValueM26320 == null || jSONValueM26320.isNull() || !jSONValueM26320.isString()) {
            throw new IllegalStateException("Missing resource read locator: ".concat(str));
        }
        return jSONValueM26320.asString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static JSONObject m32897() {
        return C4969.m13780("Result for mt_apk_read_text. LF-normalized text in data.textWindow.text and a targetVersion for the selected target. Copy the version unchanged for subsequent edits; use nextActions to continue reading.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id for successful reads.")).add("editSessionId", C4969.m13789("string", "Edit session id used for this read result; pass this value together with data.workspaceId for follow-up reads.")).add("locator", C4969.m13789("string", "Normalized locator reusable with mt_apk_read_text together with data.workspaceId and data.editSessionId.")).add("name", C4969.m13789("string", "Human-readable target name.")).add("textSourceKind", C4969.m13789("string", "Text source kind such as zip_entry text, axml, dex_class, dex_method, or dex_field.")).add("targetVersion", C4969.m13789("string", "16-digit lowercase hex version token for this exact LF-normalized text target; for editable locators (dex_class, dex_method, axml, zip_entry), pass it unchanged to mt_apk_edit_text. For dex_method and dex_field, this is based on the member text only; dex_field is read-only for edit_text and its targetVersion is informational.")).add("limit", C4969.m13789("integer", "Line limit used by this page.")).add("truncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether the text result is truncated.")).add("truncatedReason", C4969.m13789("string", "Reason for truncation, or null when the page is complete.")).add("textWindow", C4969.m13785(C4969.m13777(JSON.object().add(TextBundle.TEXT_ENTRY, C4969.m13786("string", "Returned LF-normalized text. Smali .line N directives, if present, are original Java source debug lines; edit_text does not accept line or column positions.")).add("startLine", C4969.m13786("integer", "0-based line component of the inclusive start position within this read target.")).add("startColumn", C4969.m13786("integer", "0-based column component of the inclusive start position, counted by code point.")).add("nextLine", C4969.m13786("integer", "0-based line component of the exclusive end position within this read target, paired with nextColumn. May remain on startLine; at EOF identifies the end position. Continue via nextActions.")).add("nextColumn", C4969.m13786("integer", "0-based Unicode code-point column of the exclusive end position, paired with nextLine, including at EOF.")).add("returnedLineCount", C4969.m13786("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C4969.m13786("integer", "Number of Unicode code points in text, including LF.")).add("totalLineCount", C4969.m13786("integer", "Total logical lines in the LF-normalized target; an empty target counts as one line, a final LF adds no empty line. -1 when the source text is truncated.")).add("lineTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether a returned line was truncated by character budget.")).add("absoluteStartLine", C4969.m13789("integer", "0-based absolute class-smali line component of the start position for member reads, or JSON null for non-member reads.")).add("absoluteEndLine", C4969.m13789("integer", "0-based absolute class-smali line component of the end position for member reads, or JSON null for non-member reads.")), "Text window data."))).add("pagination", C4969.m13785(m32892())), "Successful mt_apk_read_text data."), C4969.m13787(C4969.m13777(JSON.object().add("suggestedLocator", C4969.m13789("string", "Suggested locator for NOT_TEXT_ENTRY AXML correction; follow nextActions to execute.")), "mt_apk_read_text recovery diagnostics.")), m32894());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32887() {
        return C4969.m13780("Result for mt_apk_read_bytes. data.byteWindow.hex contains uppercase raw ZIP entry bytes with byteOffset metadata for a zip_entry locator; reuse data.workspaceId and data.editSessionId for follow-up reads; nextActions carries continuation or retry calls.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id for successful reads.")).add("editSessionId", C4969.m13789("string", "Edit session id used for this read result; pass this value together with data.workspaceId for follow-up reads.")).add("locator", C4969.m13789("string", "Normalized zip_entry locator reusable together with data.workspaceId and data.editSessionId.")).add("name", C4969.m13789("string", "Human-readable ZIP entry name.")).add("maxBytes", C4969.m13789("integer", "Maximum bytes requested for this page.")).add("byteWindow", C4969.m13785(C4969.m13777(JSON.object().add("hex", C4969.m13786("string", "Uppercase hexadecimal without separators; empty when reading at EOF.")).add("byteOffset", C4969.m13786("integer", "Byte offset of the first returned byte.")).add("nextByteOffset", C4969.m13786("integer", "Byte offset immediately after the returned bytes, including at EOF. Continue via nextActions.")).add("totalBytes", C4969.m13786("integer", "Total uncompressed bytes in the selected entry, including session edits. -1 if unknown or above 9007199254740991.")), "ZIP byte window data."))).add("pagination", C4969.m13785(m32892())), "Successful mt_apk_read_bytes data."), C4969.m13787(C4969.m13777(JSON.object().add("failures", C3184.m9603("type", "array", "description", "Temporary AXML encode failures when a saved AXML overlay cannot be synthesized as bytes.").add("items", C4969.m13777(JSON.object().add("locator", C4969.m13789("string", "Failure text locator.")).add("className", C4969.m13789("string", "Dex class descriptor, or null for entry failures.")).add("errorCode", C4969.m13789("string", "Failure code.")).add("message", C4969.m13789("string", "Compiler or encoder message.")).add("line", C4969.m13789("integer", "0-based line in the failed text, or null.")).add("column", C4969.m13789("integer", "0-based column in the failed text, or null.")), "One temporary entry synthesize failure."))), "mt_apk_read_bytes recovery diagnostics.")), m32894());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32891() {
        return C4969.m13780("Result for mt_apk_resource_read. data.workspaceId and data.editSessionId identify the inspected resource view. Each data.results[] item contains only the fields applicable to its errorCode or valueKind branch; data.variantSets[] lists available variants per existing resource id; data.resourceNamePolicy describes name/hex reference rules for valueXml. Successful resource reads use empty nextActions.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id for successful reads.")).add("editSessionId", C4969.m13789("string", "Edit session id used for this read result; pass this value together with data.workspaceId for follow-up reads.")).add("resourceNamePolicy", C18828.m43457(JSON.object().add("confused", C4969.m13786(ClassTransform.BOOLEAN, "Whether resources.arsc appears resource-name confused.")).add("appReferenceOutput", C4969.m13784("How APP resource references are emitted.", "names_or_hex", "hex8_upper_no_0x")).add("appNameReferencesAccepted", C4969.m13786(ClassTransform.BOOLEAN, "Whether APP name references are accepted in valueXml input.")).add("systemNameReferencesAccepted", C4969.m13786(ClassTransform.BOOLEAN, "Whether android: system name references are accepted in valueXml input.")), ClassTransform.BOOLEAN, "Whether 0x-prefixed hex ids are accepted in all resource/attr id input positions.", "hexPrefixAccepted", "Resource name/reference policy for this ARSC snapshot.")).add("variantSets", C3184.m9603("type", "array", "description", "Available variant sets grouped by existing resource locator.").add("items", C4969.m13777(JSON.object().add("locator", C4969.m13789("string", "Normalized resource locator.")).add("variants", C3184.m9603("type", "array", "description", "All real variants for this resource; default comes first.").add("items", C4969.m13786("string", "String item."))), "One resource variant set."))).add("results", C3184.m9603("type", "array", "description", "Flat resource read results in the same order as input reads[].").add("items", JSON.object().add("description", "One resource_read result. If errorCode is present, read the item-level failure branch; otherwise inspect valueKind for the applicable success fields.").add("anyOf", JSON.array().add(m32888("RESOURCE_NOT_FOUND", false)).add(m32888("RESOURCE_VARIANT_NOT_FOUND", true)).add(m32886(JSON.object().add("valueKind", C4969.m13784("Decoded scalar value kind.", TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", "null_value", "unparsed")).add(b.d, C4969.m13789("string", "Decoded value text; null only when null_value or unparsed has no readable text.")).add("valueTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether the decoded value summary was truncated by maxValueChars.")), "Scalar resource value.")).add(m32886(JSON.object().add("valueKind", C4969.m13784("Decoded reference kind.", Name.REFER, AnnotationHandler.ATTRIBUTE)).add(b.d, C4969.m13786("string", "Decoded reference or attribute text.")).add("valueTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether the decoded value summary was truncated by maxValueChars.")).add("targetLocator", C4969.m13789("string", "Direct resource target, or null for a zero or unavailable target id.")).add("resolvedTarget", C4969.m13785(m32885())), "Resource reference or attribute value.")).add(m32886(JSON.object().add("valueKind", C4969.m13784("Decoded file-path kind.", "file_path")).add(b.d, C4969.m13786("string", "Decoded file path text.")).add("valueTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether the decoded value summary was truncated by maxValueChars.")).add("fileLocator", C4969.m13786("string", "ZIP entry locator for the complete decoded file path.")), "Resource value that names a ZIP entry.")).add(m32886(JSON.object().add("valueKind", C4969.m13784("Decoded item-list kind.", "item_list")).add("items", C3184.m9603("type", "array", "description", "Child value summaries for item_list results.").add("items", JSON.object().add("description", "One item_list child. Inspect valueKind for the applicable fields.").add("anyOf", JSON.array().add(m32893(JSON.object().add("valueKind", C4969.m13784("Decoded scalar child kind.", TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", "null_value", "unparsed")).add(b.d, C4969.m13789("string", "Decoded child text; null only when null_value or unparsed has no readable text.")).add("valueTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether the child summary was truncated by maxValueChars.")), "Scalar child value.")).add(m32893(JSON.object().add("valueKind", C4969.m13784("Decoded reference child kind.", Name.REFER, AnnotationHandler.ATTRIBUTE)).add(b.d, C4969.m13786("string", "Decoded reference or attribute text.")).add("valueTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether the child summary was truncated by maxValueChars.")).add("targetLocator", C4969.m13789("string", "Direct resource target, or null for a zero or unavailable target id.")).add("resolvedTarget", C4969.m13785(m32885())), "Reference or attribute child value.")).add(m32893(JSON.object().add("valueKind", C4969.m13784("Decoded file-path child kind.", "file_path")).add(b.d, C4969.m13786("string", "Decoded child file path text.")).add("valueTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether the child summary was truncated by maxValueChars.")).add("fileLocator", C4969.m13786("string", "ZIP entry locator for the complete decoded child file path.")), "File-path child value."))))).add("itemsTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether children were limited by maxItemsPerValue.")).add("totalItemCount", C4969.m13786("integer", "Complete non-negative child item count.")), "Complex resource value with child items."))))), "Successful mt_apk_resource_read data."), C4969.m13787(C4969.m13777(JSON.object(), "No tool-level resource_read diagnostics; per-item resource misses are returned in successful data.results[].")), C3184.m9603("type", "array", "description", "mt_apk_resource_read returns per-item status in data.results[] and does not emit follow-up actions.").add("items", C4969.m13777(JSON.object(), "No follow-up action is emitted.")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32888(String str, boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add("index", C4969.m13786("integer", "0-based index matching the input reads[] item.")).add("locator", C4969.m13786("string", "Normalized resource locator string formatted as resource:0x plus 8 lowercase hex digits.")).add("variant", C4969.m13786("string", "Requested variant that failed.")).add("errorCode", C4969.m13784("Stable item-level failure code.", str)).add("message", C4969.m13786("string", "Human-readable item-level failure message."));
        if (z) {
            jSONObjectAdd.add("type", C4969.m13786("string", "Existing resource type name.")).add("name", C4969.m13786("string", "Existing resource entry name."));
        }
        return C4969.m13777(jSONObjectAdd, "Item-level resource read failure.");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32886(JSONObject jSONObject, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("index", C4969.m13786("integer", "0-based index matching the input reads[] item.")).add("locator", C4969.m13786("string", "Normalized resource locator string formatted as resource:0x plus 8 lowercase hex digits.")).add("variant", C4969.m13786("string", "Actual public variant selected for this value.")).add("type", C4969.m13786("string", "Resource type name from the ARSC identity.")).add("name", C4969.m13786("string", "Resource entry name from the ARSC identity."));
        Iterator it = jSONObject.iterator();
        while (it.hasNext()) {
            JSONObject.Member member = (JSONObject.Member) it.next();
            jSONObjectAdd.add(member.getName(), member.getValue());
        }
        jSONObjectAdd.add("targetVersion", C4969.m13786("string", "Version token of 16 lowercase hex digits for this exact resource id and variant; use it with mt_apk_resource_edit only when editable and complete valueXml are available.")).add("valueXml", C4969.m13789("string", "Complete editable single-entry resource XML when returned within maxValueXmlChars, or null. This is never a partial XML fragment.")).add("valueXmlCharCount", C4969.m13789("integer", "Unicode code point count of complete valueXml when known, or null when unavailable.")).add("valueXmlTruncated", C4969.m13786(ClassTransform.BOOLEAN, "Whether complete valueXml exceeded maxValueXmlChars; valueXml is null when true.")).add("editable", C4969.m13786(ClassTransform.BOOLEAN, "Whether this value can be edited when complete valueXml is available.")).add("editableReason", C4969.m13790("XML editability or truncation reason, or null.", "VALUE_XML_TRUNCATED", "VALUE_XML_TOO_LARGE", "VALUE_XML_UNAVAILABLE", "UNSUPPORTED_VALUE_XML", "UNSUPPORTED_STYLED_TEXT_XML", "INVALID_VALUE_XML"));
        return C4969.m13777(jSONObjectAdd, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32893(JSONObject jSONObject, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("key", C4969.m13789("string", "Item key, or null for a default or unnamed child.")).add("keyLocator", C4969.m13789("string", "Resource locator when the item key is addressable, or null."));
        Iterator it = jSONObject.iterator();
        while (it.hasNext()) {
            JSONObject.Member member = (JSONObject.Member) it.next();
            jSONObjectAdd.add(member.getName(), member.getValue());
        }
        return C4969.m13777(jSONObjectAdd, str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32885() {
        return C18828.m43457(JSON.object().add("locator", C4969.m13786("string", "Referenced resource locator.")).add("missing", C4969.m13786(ClassTransform.BOOLEAN, "Whether the referenced resource id is absent.")).add("type", C4969.m13789("string", "Referenced resource type, or null.")).add("name", C4969.m13789("string", "Referenced resource name, or null.")).add("variant", C4969.m13789("string", "Actual variant selected for the summary, or null.")).add("valueKind", C4969.m13790("Summary value kind, or null.", TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", Name.REFER, AnnotationHandler.ATTRIBUTE, "file_path", "item_list", "null_value", "unparsed")).add("valueSnippet", C4969.m13789("string", "Short value snippet up to 300 chars, or null.")), ClassTransform.BOOLEAN, "Whether valueSnippet was truncated.", "valueTruncated", "Direct referenced resource summary.");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32892() {
        return C4969.m13777(JSON.object().add("hasMore", C4969.m13786(ClassTransform.BOOLEAN, "Whether another page is available through nextActions.")).add("nextCursor", C4969.m13789("string", "Cursor for mt_apk_continue; null when no page remains.")), "Read continuation state.");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m32894() {
        return C4969.m13783("Executable follow-up calls; copy arguments directly.", C4969.m13778(C13530.m33061(), "mt_apk_continue", "continue"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry"), C4969.m13778(C13530.m33058(), "mt_apk_list", "verify_workspace"), C4969.m13778(C13530.m33057(), "mt_apk_dex_read_class_outline", "verify_workspace"), C4969.m13778(C13530.m33069(), "mt_apk_read_text", "retry"), C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "retry"), C4969.m13778(C13530.m33060(), "mt_apk_resource_read", "retry"), C4969.m13778(C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Non-empty edit session id.")).add("edits", C3184.m9603("type", "array", "description", "Atomic resource value edits. Runtime accepts 1..200 items; suggested batch size is 20.").add("items", C18828.m43457(JSON.object().add("locator", C4969.m13786("string", "Resource locator string such as resource:0x7f010000. Copy from mt_apk_resource_read data.results[].locator.")).add("variant", C4969.m13786("string", "Exact resource variant to edit.")).add("targetVersion", C4969.m13786("string", "Semantic targetVersion as 16 lowercase hex digits, copied from the matching resource_read value for the same workspaceId, editSessionId, locator, and variant.")), "string", "Complete single-entry resource XML to compile and save.", "valueXml", "One resource value edit."))), "Arguments for mt_apk_resource_edit."), "mt_apk_resource_edit", "retry"));
    }
}
