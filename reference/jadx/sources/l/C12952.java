package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6XW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12952 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f41513;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23043 f41514;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f41515;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List Local Files";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "List an allowed local directory as a compact entry list. path accepts an absolute path or a Home-relative path; only this tool accepts path=\"\" as current Home. Pass cursor=\"\" initially, limit=200 unless another page size is needed, and no more than 1000. The listing includes hidden entries, uses absolute data.directoryPath as its fixed base, and lists only the current directory when recursive=false (recommended initially). With recursive=true, it traverses readable subdirectories depth-first without following recognized links. Later pages may reuse directory metadata for up to 30 seconds; start with an empty cursor for a fresh listing. This is not a filesystem snapshot. Copy nextActions[0].arguments unchanged for later pages.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_list";
    }

    public C12952(C23043 c23043) {
        this.f41514 = c23043;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f41513 == null) {
            this.f41513 = m32334();
        }
        return this.f41513;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f41515 == null) {
            this.f41515 = C10932.m27734("Result for mt_file_list.", C10932.m27731(JSON.object().add("directoryPath", C10932.m27740("string", "Normalized absolute directory used as the base for every listed path.")).add("listing", C10932.m27742("One entry per array element, formatted as type size modifiedAt relativePath. Split only at the first three ASCII spaces; preserve the remaining raw relativePath without trimming, unquoting, or splitting on newlines. Types: f=file, d=directory, l=link, o=other. Size is bytes for known regular files, otherwise -; modifiedAt is an ISO-8601 timestamp or -. Empty array for no entries.")).add("pagination", C22783.m51386(JSON.object().add("hasMore", C10932.m27740(ClassTransform.BOOLEAN, "Whether another page remains for this directory traversal.")), "string", "Opaque cursor copied unchanged; empty string on the last page.", "nextCursor", "File list pagination.")), "One local directory listing page."), C5596.m16576("mt_file_list"), C10932.m27737("Contains one directly executable mt_file_list continuation when hasMore=true; otherwise empty.", C10932.m27732(m32334(), "mt_file_list", "continue")));
        }
        return this.f41515;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_list", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C15189(), "Invalid mt_file_list argument", MotionUtils.EASING_TYPE_PATH, "recursive", "cursor", "limit");
        String strM32332 = m32332(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("recursive");
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m32335(jSONValue, "Invalid recursive", "recursive");
        }
        boolean zAsBoolean = jSONValue.asBoolean();
        String strM32333 = m32332(jSONObject, "cursor");
        JSONValue jSONValue2 = jSONObject.get("limit");
        if (jSONValue2 == null || !jSONValue2.isNumber()) {
            throw m32335(jSONValue2, "Invalid limit", "limit");
        }
        try {
            int iM31240 = C12556.m31240(jSONValue2);
            if (iM31240 >= 1 && iM31240 <= 1000) {
                C5143 c5143M51948 = this.f41514.m51948(strM32332, iM31240, strM32333, zAsBoolean);
                String str = c5143M51948.f17913;
                String str2 = c5143M51948.f17916;
                boolean z = c5143M51948.f17917;
                JSONObject jSONObjectAdd = JSON.object().add("hasMore", z).add("nextCursor", str2);
                JSONArray jSONArrayArray = JSON.array();
                Iterator it = c5143M51948.f17918.iterator();
                while (it.hasNext()) {
                    jSONArrayArray.add((String) it.next());
                }
                JSONObject jSONObjectAdd2 = JSON.object().add("directoryPath", str).add("listing", jSONArrayArray).add("pagination", jSONObjectAdd);
                JSONArray jSONArrayArray2 = JSON.array();
                if (z) {
                    jSONArrayArray2.add(C2729.m9064(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("recursive", c5143M51948.f17915).add("cursor", str2).add("limit", c5143M51948.f17914), "mt_file_list", "continue", "Continue this exact local directory traversal."));
                }
                return new C1238(C15300.m36728(jSONObjectAdd2, jSONArrayArray2));
            }
            throw m32335(jSONValue2, "limit must be between 1 and 1000", "limit");
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m32335(jSONValue2, "Invalid limit", "limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32332(JSONObject jSONObject, String str) throws C10186 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m32335(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m32335(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "").add("recursive", false).add("cursor", "").add("limit", 200));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m32334() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute or Home-relative directory. Pass \"\" (empty string) for the current Home directory.")).add("recursive", C10932.m27740(ClassTransform.BOOLEAN, "Pass false initially to list only the current directory; true traverses readable subdirectories depth-first without following recognized links.")).add("cursor", C10932.m27740("string", "Pass \"\" (empty string) initially; later copy the server-provided cursor unchanged.")), "integer", "Page size from 1 to 1000; recommended value is 200 and must remain unchanged for a cursor.", "limit", "Arguments for mt_file_list.");
    }
}
