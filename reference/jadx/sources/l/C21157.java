package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩶۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21157 extends AbstractC19137 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String[] f67542 = {MotionUtils.EASING_TYPE_PATH, "encoding", "pattern", "patternType", "caseSensitive", "contextBefore", "contextAfter", "limit", "maxChars", "cursor"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3651 f67543;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Search File Text";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Search one regular text file line by line and return matching line numbers with original context. Use mt_file_search to find files in a directory. For a first call, use the recommended parameter values below and cursor=\"\". Search completed logs: detected changes require restarting the search; this is not a filesystem snapshot. Follow continue actions even on empty pages; stop calling to abandon a search. Slow files may exceed client timeouts. Decoding errors, lines above 1048576 UTF-16 units and regex resource exhaustion return partial results; inspect stopReason and keep warnings from every page.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_search_text";
    }

    public C21157(C3651 c3651) {
        this.f67543 = c3651;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return m48261();
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C10932.m27734("Result for mt_file_search_text.", C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute source path.")).add("encoding", C10932.m27740("string", "Resolved lowercase encoding token, including physical BOM when present.")).add("matchedLines", m48259(C10932.m27740("integer", "One newly delivered matching line."), "Newly delivered matching lines in ascending order, zero-based. Each line counts once, including zero-width matches. Context may repeat earlier matches; long-line continuation fragments do not count again. Empty files have no lines; a final newline adds no extra empty line.")).add("blocks", m48259(C22783.m51386(JSON.object().add("startLine", C10932.m27740("integer", "Zero-based original logical line.")).add("startColumn", C10932.m27740("integer", "Zero-based Unicode code-point column on startLine.")), "string", "Original text including original line endings; never inserts ellipses or line numbers. Long lines may continue in another page.", TextBundle.TEXT_ENTRY, "One original text fragment."), "Original fragments in file order; adjacent fragments within a page are merged. Context may overlap across pages.")).add("searchedThroughByteOffset", C10932.m27740("integer", "Exclusive original-byte boundary of the contiguous prefix with completed matching decisions, including BOM. May stay unchanged while pending text is delivered.")).add("scanSize", C10932.m27743("integer", "Observed original byte length at search start; null if unavailable.")).add("stopReason", C10932.m27738("eof means both matching and output finished. match_limit, output_limit and scan_budget have a continue action. resource_limit and decode_error terminate incompletely; inspect warnings.", d.aB, "match_limit", "output_limit", "scan_budget", "resource_limit", "decode_error")).add("warnings", m48259(C22783.m51386(JSON.object().add("reason", C10932.m27738("context_clipped only reduces displayed context; context_incomplete means requested following context could not be finished. Other reasons stop matching at the indicated line.", "context_clipped", "context_incomplete", "invalid_encoding", "line_too_long", "match_resource_limit")), "integer", "Zero-based affected logical line.", "line", "A limit or incomplete search location."), "Keep warnings from all pages; context clipping does not imply skipped matching.")), "One text search page."), C5596.m16576("mt_file_search_text"), C10932.m27737("continue resumes pending results; retry recovers a rejected call as described by the action. Empty after eof or terminal partial results.", C10932.m27732(m48261(), "mt_file_search_text", "continue"), C10932.m27732(m48261(), "mt_file_search_text", "retry")));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m48262(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m48260(jSONValue, "Expected a string", str);
        }
        return jSONValue.asString();
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_search_text", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws Throwable {
        String str;
        C9749.m25412(jSONObject, new C14443(), "Invalid mt_file_search_text argument", f67542);
        String strM48262 = m48262(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM48263 = m48262(jSONObject, "encoding");
        String strM48264 = m48262(jSONObject, "pattern");
        if (strM48264.isEmpty() || strM48264.length() > 16384) {
            throw C10186.m26301("Expected a non-empty pattern of at most 16384 UTF-16 units", "pattern", jSONObject.get("pattern"), JSON.array(), JSON.object());
        }
        String strM48265 = m48262(jSONObject, "patternType");
        if (strM48265.equals("literal") || strM48265.equals("regex")) {
            JSONValue jSONValue = jSONObject.get("caseSensitive");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw m48260(jSONValue, "Expected a boolean", "caseSensitive");
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            int iM18216 = (int) C6437.m18216(jSONObject, "contextBefore", 0L, 100L);
            int iM18217 = (int) C6437.m18216(jSONObject, "contextAfter", 0L, 100L);
            int iM18218 = (int) C6437.m18216(jSONObject, "limit", 1L, 200L);
            int iM18219 = (int) C6437.m18216(jSONObject, "maxChars", ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, 131072L);
            try {
                C23789 c23789M11833 = this.f67543.m11833(strM48262, new C16329(strM48263, strM48264, strM48265.equals("regex"), zAsBoolean, iM18216, iM18217, iM18218, iM18219), m48262(jSONObject, "cursor"));
                JSONArray jSONArrayArray = JSON.array();
                if (!c23789M11833.m53065().isEmpty()) {
                    jSONArrayArray.add(C2729.m9064(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, c23789M11833.m53066().getString(MotionUtils.EASING_TYPE_PATH)).put("encoding", c23789M11833.m53066().getString("encoding")).put("cursor", c23789M11833.m53065()), "mt_file_search_text", "continue", "Continue from this logical position, even when this page has no new matches."));
                }
                return new C1238(C15300.m36728(c23789M11833.m53066(), jSONArrayArray));
            } catch (C10186 e) {
                JSONObject jSONObject2 = new JSONObject(jSONObject);
                String str2 = e.f32601;
                if (str2.equals("FILE_INVALID_CURSOR") || str2.equals("FILE_CHANGED_DURING_READ")) {
                    jSONObject2.put("cursor", "");
                    String string = e.f32602.getString(MotionUtils.EASING_TYPE_PATH, null);
                    if (string != null) {
                        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, string);
                    }
                    str = "Restart with the current query and encoding. Treat earlier pages as a separate search.";
                } else {
                    if (!str2.equals("FILE_SEARCH_CANCELED") || !e.f32598) {
                        throw e;
                    }
                    str = "Retry the same search position after cancellation has cleared.";
                }
                throw e.m26307(JSON.array().add(C2729.m9064(jSONObject2, "mt_file_search_text", "retry", str)));
            }
        }
        throw C10186.m26301("Expected literal or regex", "patternType", jSONObject.get("patternType"), JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m48260(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), JSON.object());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m48259(JSONObject jSONObject, String str) {
        return C22121.m50076("type", "array", "description", str).add("items", jSONObject);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m48261() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute or Home-relative regular file path; empty is invalid.")).add("encoding", C10932.m27740("string", "Recommended empty for automatic detection on the first call. Otherwise an exact editor encoding token; copy the resolved token for continuation.")).add("pattern", C10932.m27740("string", "Non-empty literal or regex, at most 16384 UTF-16 units. Literal * is not a wildcard.")).add("patternType", C10932.m27738("Search syntax; recommended literal. LF, CRLF and CR delimit lines and are excluded from matching. Regex applies independently to each line, never across lines.", "literal", "regex")).add("caseSensitive", C10932.m27740(ClassTransform.BOOLEAN, "Recommended false enables Unicode case-insensitive matching.")).add("contextBefore", C10932.m27740("integer", "Requested preceding lines, 0..100; recommended 10. May be clipped with a warning.")).add("contextAfter", C10932.m27740("integer", "Requested following lines, 0..100; recommended 20. May continue on later pages.")).add("limit", C10932.m27740("integer", "Maximum newly delivered matching lines in this page, 1..200; recommended 50.")).add("maxChars", C10932.m27740("integer", "Total returned original-text Unicode code points, 1024..131072; recommended 32768. CRLF is never split.")), "string", "Empty starts a search; otherwise copy continuation arguments unchanged. Retries resume the same logical position but page boundaries may differ. After an application process restart, start a new search.", "cursor", "All fields are required; copy continuation arguments unchanged.");
    }
}
