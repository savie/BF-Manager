package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܿᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 06WR */
/* JADX INFO: loaded from: classes5.dex */
public final class C17533 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f55730 = {MotionUtils.EASING_TYPE_PATH, "recursive", "namePattern", "namePatternType", "nameMatchMode", "nameCaseSensitive", "minSize", "maxSize", "minModifiedAt", "maxModifiedAt", "contentPattern", "contentPatternType", "contentCaseSensitive", "cursor", "limit"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f55731;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21663 f55732;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f55733;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_search";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Find regular files under an allowed directory. All enabled filters are ANDed; each file appears at most once. Includes hidden files, does not enter archives or follow recognized links. Directory names and metadata never prune recursion. Start with path=\".\", recursive=true, cursor=\"\", limit=200; use empty patterns and times and size=-1 to disable filters. Content is automatically decoded using BOM, editor encoding records and detection, then searched as text with no file-size cap. Streaming matching uses sliding windows: very long matches and regex anchors/lookarounds near window boundaries may differ from whole-file regex matching. Content regex uses multiline ^/$; dot does not match newlines unless enabled in the expression. Empty files participate in enabled content matching. Search is not a filesystem snapshot; continuation may reuse directory metadata for up to 30 seconds. An empty page can still have more search work. A page completes its current file before yielding; large files may take longer than a client timeout. Copy the purpose=continue action unchanged. Keep warnings from all pages to identify incomplete searches.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Search Local Files";
    }

    public C17533(C21663 c21663) {
        this.f55732 = c21663;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f55731 == null) {
            this.f55731 = m40801();
        }
        return this.f55731;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f55733 == null) {
            this.f55733 = C4969.m13780("Result for mt_file_search.", C4969.m13777(JSON.object().add("directoryPath", C4969.m13786("string", "Normalized absolute root, fixed for continuation and the base of every relative path.")).add("listing", C4969.m13788("One matching regular file per element: f size modifiedAt relativePath. Split only at the first three ASCII spaces. Size is bytes or - when unknown; modifiedAt is ISO-8601 or -. Preserve the remaining raw path without trimming, unquoting or splitting on newlines.")).add("pagination", C18828.m43457(JSON.object().add("hasMore", C4969.m13786(ClassTransform.BOOLEAN, "Whether more traversal remains, not whether another match is guaranteed. Can be true with an empty listing.")), "string", "Opaque continuation cursor; empty on the final page. Bound to this root, filters, page size and access policy.", "nextCursor", "Remaining search work.")).add("warnings", C3184.m9603("type", "array", "description", "Reasons and counts of items not evaluated on this page. Empty means no observed search failures, not a filesystem snapshot. Permission-excluded paths are outside the search scope and are not disclosed.").add("items", C18828.m43457(JSON.object().add("reason", C4969.m13784("metadata_unavailable: required size/time unknown; file_unreadable: disappeared or changed type before opening; content_search_failed: read/decode failure or regex timeout/stack limit; name_match_failed: filename regex timeout/stack limit; directory_unreadable: subtree could not be traversed.", "metadata_unavailable", "file_unreadable", "content_search_failed", "name_match_failed", "directory_unreadable")), "integer", "Number of affected files or directories on this page; one unreadable directory can hide many files.", "count", "One aggregated reason."))).add("failedFiles", C3184.m9603("type", "array", "description", "First 20 failed files on this page, in traversal order. Warnings count all failures, including omitted files and unreadable directories. These files were not determined to be non-matches; narrow the name filter to inspect omitted failures. Permission-excluded paths are not disclosed.").add("items", C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute path usable with file tools.")).add("reason", C4969.m13784("invalid_encoding: strict decoding failed; read_timeout: file read timed out; content_search_failed: another read failure or incomplete regex matching; other reasons match the aggregated warning.", "invalid_encoding", "read_timeout", "content_search_failed", "metadata_unavailable", "file_unreadable", "name_match_failed")), "One file whose search could not complete."))), "One file search page."), C12123.m30172("mt_file_search"), C4969.m13783("One directly executable search continuation when hasMore=true, otherwise empty.", C4969.m13778(m40801(), "mt_file_search", "continue")));
        }
        return this.f55733;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_search", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        String str;
        C12595 c12595 = new C12595();
        String[] strArr = f55730;
        C23863.m52589(jSONObject, c12595, "Invalid mt_file_search argument", strArr);
        String strM40806 = m40806(jSONObject, MotionUtils.EASING_TYPE_PATH);
        boolean zM40805 = m40805(jSONObject, "recursive");
        String strM40807 = m40806(jSONObject, "namePattern");
        String strM40803 = m40803(jSONObject, "namePatternType", "literal", "regex");
        String strM40804 = m40803(jSONObject, "nameMatchMode", "exact", "contains");
        boolean zM40806 = m40805(jSONObject, "nameCaseSensitive");
        long jM40807 = m40807(jSONObject, "minSize");
        long jM40808 = m40807(jSONObject, "maxSize");
        Long lM40802 = m40802(jSONObject, "minModifiedAt");
        Long lM40803 = m40802(jSONObject, "maxModifiedAt");
        if (jM40807 != -1 && jM40808 != -1 && jM40807 >= jM40808) {
            throw m40808(jSONObject.get("maxSize"), "minSize must be less than maxSize", "maxSize");
        }
        if (lM40802 != null && lM40803 != null && lM40802.longValue() >= lM40803.longValue()) {
            throw m40808(jSONObject.get("maxModifiedAt"), "minModifiedAt must be before maxModifiedAt", "maxModifiedAt");
        }
        String strM40808 = m40806(jSONObject, "contentPattern");
        String strM40805 = m40803(jSONObject, "contentPatternType", "literal", "regex");
        boolean zM40807 = m40805(jSONObject, "contentCaseSensitive");
        String strM40809 = m40806(jSONObject, "cursor");
        String str2 = "cursor";
        int iM38376 = (int) C16249.m38376(jSONObject, "limit", 1L, 1000L);
        JSONObject jSONObjectObject = JSON.object();
        int i = 0;
        while (i < 15) {
            String str3 = strArr[i];
            if (str3.equals(MotionUtils.EASING_TYPE_PATH)) {
                str = str2;
            } else {
                str = str2;
                if (!str3.equals(str) && !str3.equals("limit")) {
                    jSONObjectObject.add(str3, jSONObject.get(str3));
                }
            }
            i++;
            str2 = str;
        }
        String str4 = str2;
        jSONObjectObject.put("minSize", jM40807).put("maxSize", jM40808);
        C15314 c15314M48397 = this.f55732.m48397(strM40806, zM40805, strM40809, iM38376, C22253.m49424(C22253.m49421().digest(jSONObjectObject.toString().getBytes(StandardCharsets.UTF_8))), new C23075(strM40807, strM40803.equals("regex"), strM40804.equals("exact"), zM40806, jM40807, jM40808, lM40802, lM40803, strM40808, strM40805.equals("regex"), zM40807));
        C2612 c2612M36676 = c15314M48397.m36676();
        JSONArray jSONArrayArray = JSON.array();
        ArrayList arrayList = c2612M36676.f10214;
        String str5 = c2612M36676.f10216;
        boolean z = c2612M36676.f10218;
        String str6 = c2612M36676.f10215;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        JSONObject jSONObjectAdd = JSON.object().add("directoryPath", str6).add("listing", jSONArrayArray).add("pagination", JSON.object().add("hasMore", z).add("nextCursor", str5)).add("warnings", c15314M48397.m36674()).add("failedFiles", c15314M48397.m36675());
        JSONArray jSONArrayArray2 = JSON.array();
        if (z) {
            jSONArrayArray2.add(C11320.m28376(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, str6).put(str4, str5), "mt_file_search", "continue", "Continue the same file search, even when this page has no matches."));
        }
        return new C17669(C0735.m3193(jSONObjectAdd, jSONArrayArray2));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m40806(JSONObject jSONObject, String str) throws C12731 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m40808(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40805(JSONObject jSONObject, String str) throws C12731 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m40808(jSONValue, strConcat, str);
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40803(JSONObject jSONObject, String str, String str2, String str3) throws C12731 {
        String strM40806 = m40806(jSONObject, str);
        if (strM40806.equals(str2) || strM40806.equals(str3)) {
            return strM40806;
        }
        throw m40808(jSONObject.get(str), C7997.m21055("Expected ", str2, " or ", str3), str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m40807(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue != null && jSONValue.isNumber()) {
            try {
                long jLongValueExact = new BigDecimal(jSONValue.toString()).longValueExact();
                if (jLongValueExact >= -1 && jLongValueExact <= 9007199254740991L) {
                    return jLongValueExact;
                }
            } catch (ArithmeticException | NumberFormatException unused) {
            }
        }
        throw m40808(jSONValue, "Expected -1 or a non-negative safe integer byte count", str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Long m40802(JSONObject jSONObject, String str) throws C12731 {
        String strM40806 = m40806(jSONObject, str);
        if (strM40806.isEmpty()) {
            return null;
        }
        try {
            C8408 c8408 = C8408.parse(strM40806);
            if (c8408.getNano() % BasicLabelFormatter.MILLION != 0) {
                throw new C15464("Sub-millisecond precision");
            }
            return Long.valueOf(c8408.toInstant().toEpochMilli());
        } catch (ArithmeticException | C15464 unused) {
            throw m40808(jSONObject.get(str), "Expected ISO-8601 with Z or an explicit UTC offset, at most millisecond precision", str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m40808(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, ".").add("recursive", true).add("namePattern", "").add("namePatternType", "literal").add("nameMatchMode", "contains").add("nameCaseSensitive", false).add("minSize", -1).add("maxSize", -1).add("minModifiedAt", "").add("maxModifiedAt", "").add("contentPattern", "").add("contentPatternType", "literal").add("contentCaseSensitive", false).add("cursor", "").add("limit", 200));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m40801() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute or Home-relative directory. Use . for Home; empty is invalid.")).add("recursive", C4969.m13786(ClassTransform.BOOLEAN, "Search readable subdirectories without following recognized links; recommended true.")).add("namePattern", C4969.m13786("string", "Expression matched against basename including extension, never the parent path. Empty disables name filtering. Literal * is not a wildcard.")).add("namePatternType", C4969.m13784("Expression syntax; recommended literal. Ignored when namePattern is empty.", "literal", "regex")).add("nameMatchMode", C4969.m13784("exact matches the whole basename; contains finds a substring or a regex match. Recommended contains; ignored when namePattern is empty.", "exact", "contains")).add("nameCaseSensitive", C4969.m13786(ClassTransform.BOOLEAN, "Use true for case-sensitive names; recommended false uses Unicode case-insensitive matching. Ignored when namePattern is empty.")).add("minSize", C4969.m13786("integer", "Inclusive minimum bytes; -1 disables. Otherwise 0..9007199254740991. Unknown size cannot satisfy an enabled size filter.")).add("maxSize", C4969.m13786("integer", "Exclusive maximum bytes; -1 disables. Otherwise 0..9007199254740991 and greater than an enabled minSize.")).add("minModifiedAt", C4969.m13786("string", "Inclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Unknown time cannot satisfy an enabled time filter.")).add("maxModifiedAt", C4969.m13786("string", "Exclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Must be after an enabled minModifiedAt.")).add("contentPattern", C4969.m13786("string", "Require at least one match in decoded file content; empty disables. Literal and regex content matching both use streaming windows, not a file prefix.")).add("contentPatternType", C4969.m13784("Content syntax; recommended literal. Ignored when contentPattern is empty.", "literal", "regex")).add("contentCaseSensitive", C4969.m13786(ClassTransform.BOOLEAN, "Use true for case-sensitive content; recommended false uses Unicode case-insensitive matching. Ignored when contentPattern is empty.")).add("cursor", C4969.m13786("string", "Empty for a new search. For continuation copy the returned action unchanged; changing filters or access policy invalidates the cursor.")), "integer", "Maximum matches per page, 1..1000; recommended 200. A scan budget can yield fewer or zero matches; keep unchanged for continuation.", "limit", "Arguments for mt_file_search; every field is required.");
    }
}
