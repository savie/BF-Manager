package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۙ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1IVB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5121 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f17832;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f17833;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f17834;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Read Java Pseudocode";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "For DEX class or method logic, prefer this tool first. Read Java pseudocode for one exact dex_class or dex_method locator. Start with style=readable; use instruction for explicit low-level control flow. If a page is truncated, continue via nextActions. Use mt_apk_read_text for Smali only when exact instructions or editing are needed, generation fails, or questions remain after reading the relevant pseudocode pages. Analysis is limited to the selected class or method, so inferred types may be incomplete. Failed readable methods use instruction form with an error comment. Pseudocode is read-only.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_dex_read_pseudocode";
    }

    public C5121(C1897 c1897) {
        this.f17833 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = new JSONObject(new C23021(new C20037(this.f17833)).mo1808().getJSONObject("properties"));
        jSONObject.put("locator", C10932.m27740("string", "Exact dex_class or dex_method locator copied from list, search or class outline. Other locator kinds are rejected."));
        jSONObject.put("startLine", C10932.m27740("integer", "0-based first line within the returned pseudocode target. Pass 0 for the first page."));
        jSONObject.put("startColumn", C10932.m27740("integer", "0-based Unicode code point column within startLine. Pass 0 for the first page."));
        jSONObject.add("style", C10932.m27738("Pass readable for compact expressions or instruction for explicit low-level control flow.", "readable", "instruction"));
        return C10932.m27731(jSONObject, (String) null);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C10932.m27734("Java pseudocode for analysis; no editable targetVersion is provided.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Selected edit session; empty means base workspace.")).add("locator", C10932.m27740("string", "Original target locator, reusable for Smali reads.")).add("style", C10932.m27738("Requested output style; readable may contain instruction-form methods with error comments.", "readable", "instruction")).add("textWindow", C22783.m51386(JSON.object().add(TextBundle.TEXT_ENTRY, C10932.m27740("string", "LF-normalized Java pseudocode. DEX identifiers retain their original spelling, even when invalid in Java.")).add("startLine", C10932.m27740("integer", "0-based line component of the inclusive start position.")).add("startColumn", C10932.m27740("integer", "0-based Unicode code point column of the inclusive start position.")).add("nextLine", C10932.m27740("integer", "0-based line component of the exclusive end position, paired with nextColumn. May remain on startLine; also valid at EOF. Continue via nextActions.")).add("nextColumn", C10932.m27740("integer", "0-based Unicode code point column of the exclusive end position, paired with nextLine, including at EOF.")).add("returnedLineCount", C10932.m27740("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C10932.m27740("integer", "Number of Unicode code points in text, including LF.")).add("totalLineCount", C10932.m27740("integer", "Total logical pseudocode lines; an empty target counts as one line, a final LF adds no empty line.")), ClassTransform.BOOLEAN, "Whether the last returned line was cut before its end by the character budget. False when the budget ends exactly at the line end, even if its LF remains unread.", "lineTruncated", "Window within this pseudocode target, not Smali or original-source coordinates.")).add("pagination", C10932.m27731(JSON.object().add("hasMore", C10932.m27740(ClassTransform.BOOLEAN, "Whether more pseudocode remains.")).add("nextCursor", C10932.m27743("string", "Opaque continuation cursor, or null at the end.")), "Read continuation.")), "Java pseudocode for the selected target."), C10932.m27741(C10932.m27731(JSON.object(), "No additional pseudocode-specific diagnostics.")), C10932.m27737("Executable calls to continue, inspect Smali, or recover the workspace.", C10932.m27732(C16237.m38540(), "mt_apk_continue", "continue"), C10932.m27732(C16237.m38550(), "mt_apk_read_text", "inspect"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry"), C10932.m27732(C16237.m38543(), "mt_apk_dex_list_classes", "verify_workspace"), C10932.m27732(C16237.m38542(), "mt_apk_dex_read_class_outline", "verify_workspace")));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36730(c10186, JSON.object(), c10186.f32599);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        String strM15483 = m15483(jSONObject);
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.remove("style");
        C2642 c2642M15484 = m15484(jSONObject2);
        String str = null;
        return (C1238) this.f17833.m6532(c2642M15484.f8446, c2642M15484.f8440, (String) null, new C13566(this, c2642M15484, strM15483, str, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m15485(C14596 c14596, JSONObject jSONObject) throws C10186 {
        JSONObject jSONObject2 = c14596.f45982;
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", jSONObject.getString("workspaceId", null)).add("editSessionId", jSONObject.getString("editSessionId", "")).add("locator", jSONObject2.getString("target", null)).add("limit", jSONObject.get("limit")).add("maxChars", jSONObject2.getInt("maxChars", -1));
        JSONObject jSONObject3 = c14596.f45980;
        C2642 c2642M15484 = m15484(jSONObjectAdd.add("startLine", jSONObject3.getInt("lineOffset", -1)).add("startColumn", jSONObject3.getInt("lineCharOffset", -1)));
        String strM15483 = m15483(jSONObject2);
        String string = jSONObject.getString("nextCursor", null);
        String string2 = jSONObject2.getString("textHash", null);
        return (C1238) this.f17833.m6532(c2642M15484.f8446, c2642M15484.f8440, string, new C13566(this, c2642M15484, strM15483, string2, string));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m15483(JSONObject jSONObject) throws C10186 {
        JSONValue jSONValue = jSONObject.get("style");
        if (jSONValue != null && jSONValue.isString()) {
            String strAsString = jSONValue.asString();
            if ("readable".equals(strAsString) || "instruction".equals(strAsString)) {
                return strAsString;
            }
        }
        throw C10186.m26301("Invalid Java pseudocode style", "style", jSONValue, JSON.array("readable", "instruction"), JSON.object().add("style", "readable"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2642 m15484(JSONObject jSONObject) throws C10186 {
        C2642 c2642M13889 = C4375.m13889(jSONObject);
        String str = c2642M13889.f8450.f43896;
        if ("dex_class_smali".equals(str) || "dex_method_smali".equals(str)) {
            return c2642M13889;
        }
        throw C10186.m26301("Java pseudocode requires a class or method locator", "locator", jSONObject.get("locator"), JSON.array("dex_class", "dex_method"), JSON.object().add("locator", "dex_class:Lcom/example/Foo;"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C1238 m15482(C5121 c5121, C2642 c2642, String str, String str2, String str3, int i) throws C10186 {
        String str4;
        JSONArray jSONArray;
        String str5;
        String strM42757;
        C13828 c13828 = c2642.f8450;
        int i2 = c2642.f8443;
        int i3 = c2642.f8449;
        int i4 = c2642.f8444;
        String strM13907 = C4375.m13907(c13828);
        JSONArray jSONArrayArray = JSON.array();
        String str6 = c2642.f8446;
        JSONArray jSONArrayAdd = jSONArrayArray.add(str6);
        String str7 = c2642.f8440;
        String string = jSONArrayAdd.add(str7).add(i).add(strM13907).add(str).toString();
        if (string.equals(c5121.f17832)) {
            str4 = c5121.f17834;
        } else {
            c5121.f17832 = null;
            c5121.f17834 = null;
            String strM6535 = c5121.f17833.m6535(c2642, str);
            if (strM6535.length() <= 2097152) {
                c5121.f17834 = strM6535;
                c5121.f17832 = string;
            }
            str4 = strM6535;
        }
        String strM42535 = C18282.m42535(str4);
        if (str2 != null && !str2.equals(strM42535)) {
            throw C10186.m26301("Pseudocode changed; read the target again", "nextCursor", JSON.value(str3), JSON.array(), JSON.object().add("startLine", 0));
        }
        try {
            C10121 c10121M4320 = C1173.m4320(str4, c2642.f8441, i3, i4, i2);
            String str8 = c10121M4320.f32405;
            boolean z = c10121M4320.f32396;
            JSONArray jSONArrayArray2 = JSON.array();
            if (z) {
                jSONArray = jSONArrayArray2;
                str5 = "startLine";
                strM42757 = C18326.m42757("java_pseudocode", c2642.f8446, c2642.f8440, i, C22121.m50076("target", strM13907, "style", str).add("textHash", strM42535).add("maxChars", i2).add("recommendedLimit", i4).add("limitMax", 2000), JSON.object().add("lineOffset", c10121M4320.f32395.intValue()).add("lineCharOffset", c10121M4320.f32397.intValue()));
                jSONArray.add(C2729.m9064(C4375.m13896(str6, i4, str7, strM42757), "mt_apk_continue", "continue", "Continue Java pseudocode"));
            } else {
                jSONArray = jSONArrayArray2;
                str5 = "startLine";
                strM42757 = null;
            }
            String str9 = strM42757;
            jSONArray.add(C2729.m9064(C22121.m50076("workspaceId", str6, "editSessionId", str7).add("locator", strM13907).add("limit", 500).add("maxChars", 49152).add(str5, 0).add("startColumn", 0), "mt_apk_read_text", "inspect", "Optional: read Smali for verification or editing"));
            return new C1238(C15300.m36728(JSON.object().add("workspaceId", str6).add("editSessionId", str7).add("locator", strM13907).add("style", str).add("textWindow", JSON.object().add(TextBundle.TEXT_ENTRY, str8).add(str5, c10121M4320.f32401).add("startColumn", c10121M4320.f32403).add("nextLine", c10121M4320.f32402).add("nextColumn", c10121M4320.f32404).add("returnedLineCount", c10121M4320.f32398).add("returnedCodePoints", str8.codePointCount(0, str8.length())).add("totalLineCount", c10121M4320.f32399).add("lineTruncated", c10121M4320.f32400)).add("pagination", JSON.object().add("hasMore", z).add("nextCursor", str9)), jSONArray));
        } catch (C10186 unused) {
            throw C10186.m26301("Invalid pseudocode read position", str3 == null ? "startColumn" : "nextCursor", str3 == null ? JSON.value(i3) : JSON.value(str3), JSON.array(), JSON.object().add("startLine", 0).add("startColumn", 0));
        }
    }
}
