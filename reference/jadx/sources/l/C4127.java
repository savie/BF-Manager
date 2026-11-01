package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۘᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R6XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4127 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f15122;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1201 f15123;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f15124;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_list";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "List an allowed local directory as a compact entry list. path accepts an absolute path or a Home-relative path; only this tool accepts path=\"\" as current Home. Pass cursor=\"\" initially, limit=200 unless another page size is needed, and no more than 1000. The listing includes hidden entries, uses absolute data.directoryPath as its fixed base, and recursively traverses readable directories depth-first without following recognized links. Later pages may reuse directory metadata for up to 30 seconds; start with an empty cursor for a fresh listing. This is not a filesystem snapshot. Copy nextActions[0].arguments unchanged for later pages.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "List Local Files";
    }

    public C4127(C1201 c1201) {
        this.f15123 = c1201;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f15122 == null) {
            this.f15122 = m11746();
        }
        return this.f15122;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f15124 == null) {
            this.f15124 = C4969.m13780("Result for mt_file_list.", C4969.m13777(JSON.object().add("directoryPath", C4969.m13786("string", "Normalized absolute directory used as the base for every listed path.")).add("listing", C4969.m13788("One entry per array element, formatted as type size modifiedAt relativePath. Split only at the first three ASCII spaces; preserve the remaining raw relativePath without trimming, unquoting, or splitting on newlines. Types: f=file, d=directory, l=link, o=other. Size is bytes for known regular files, otherwise -; modifiedAt is an ISO-8601 timestamp or -. Empty array for no entries.")).add("pagination", C18828.m43457(JSON.object().add("hasMore", C4969.m13786(ClassTransform.BOOLEAN, "Whether another page remains for this directory traversal.")), "string", "Opaque cursor copied unchanged; empty string on the last page.", "nextCursor", "File list pagination.")), "One local directory listing page."), C12123.m30172("mt_file_list"), C4969.m13783("Contains one directly executable mt_file_list continuation when hasMore=true; otherwise empty.", C4969.m13778(m11746(), "mt_file_list", "continue")));
        }
        return this.f15124;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_list", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C13301(), "Invalid mt_file_list argument", MotionUtils.EASING_TYPE_PATH, "recursive", "cursor", "limit");
        String strM11747 = m11747(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("recursive");
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m11749(jSONValue, "Invalid recursive", "recursive");
        }
        boolean zAsBoolean = jSONValue.asBoolean();
        String strM11748 = m11747(jSONObject, "cursor");
        JSONValue jSONValue2 = jSONObject.get("limit");
        if (jSONValue2 == null || !jSONValue2.isNumber()) {
            throw m11749(jSONValue2, "Invalid limit", "limit");
        }
        try {
            int iM26321 = C10413.m26321(jSONValue2);
            if (iM26321 >= 1 && iM26321 <= 1000) {
                C2612 c2612M4394 = this.f15123.m4394(strM11747, iM26321, strM11748, zAsBoolean);
                String str = c2612M4394.f10215;
                String str2 = c2612M4394.f10216;
                boolean z = c2612M4394.f10218;
                JSONObject jSONObjectAdd = JSON.object().add("hasMore", z).add("nextCursor", str2);
                JSONArray jSONArrayArray = JSON.array();
                Iterator it = c2612M4394.f10214.iterator();
                while (it.hasNext()) {
                    jSONArrayArray.add((String) it.next());
                }
                JSONObject jSONObjectAdd2 = JSON.object().add("directoryPath", str).add("listing", jSONArrayArray).add("pagination", jSONObjectAdd);
                JSONArray jSONArrayArray2 = JSON.array();
                if (z) {
                    jSONArrayArray2.add(C11320.m28376(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("recursive", c2612M4394.f10219).add("cursor", str2).add("limit", c2612M4394.f10217), "mt_file_list", "continue", "Continue this exact local directory traversal."));
                }
                return new C17669(C0735.m3193(jSONObjectAdd2, jSONArrayArray2));
            }
            throw m11749(jSONValue2, "limit must be between 1 and 1000", "limit");
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m11749(jSONValue2, "Invalid limit", "limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11747(JSONObject jSONObject, String str) throws C12731 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m11749(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m11749(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "").add("recursive", false).add("cursor", "").add("limit", 200));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m11746() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute or Home-relative directory. Pass \"\" (empty string) for the current Home directory.")).add("recursive", C4969.m13786(ClassTransform.BOOLEAN, "Whether to traverse readable subdirectories depth-first without following recognized links.")).add("cursor", C4969.m13786("string", "Pass \"\" (empty string) initially; later copy the server-provided cursor unchanged.")), "integer", "Page size from 1 to 1000; recommended value is 200 and must remain unchanged for a cursor.", "limit", "Arguments for mt_file_list.");
    }
}
