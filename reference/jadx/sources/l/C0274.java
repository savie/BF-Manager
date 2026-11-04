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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֡۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06WR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0274 extends AbstractC19137 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String[] f1572 = {MotionUtils.EASING_TYPE_PATH, "recursive", "namePattern", "namePatternType", "nameMatchMode", "nameCaseSensitive", "minSize", "maxSize", "minModifiedAt", "maxModifiedAt", "contentPattern", "contentPatternType", "contentCaseSensitive", "cursor", "limit"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f1573;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25281 f1574;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f1575;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo1809() {
        return "Search Local Files";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo1811() {
        return "Find regular files under an allowed directory. All enabled filters are ANDed; each file appears at most once. Includes hidden files, does not enter archives or follow recognized links. Directory names and metadata never prune recursion. Start with path=\".\", recursive=true, cursor=\"\", limit=200; use empty patterns and times and minSize=-1 and maxSize=-1 to disable filters. Content is automatically decoded using BOM, editor encoding records and detection, then searched as text with no file-size cap. Streaming matching uses sliding windows: very long matches and regex anchors/lookarounds near window boundaries may differ from whole-file regex matching. Content regex uses multiline ^/$; dot does not match newlines unless enabled in the expression. Empty files participate in enabled content matching. Search is not a filesystem snapshot; continuation may reuse directory metadata for up to 30 seconds. An empty page can still have more search work. A page completes its current file before yielding; large files may take longer than a client timeout. Copy the purpose=continue action unchanged. Keep warnings from all pages to identify incomplete searches.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo1812() {
        return "mt_file_search";
    }

    public C0274(C25281 c25281) {
        this.f1574 = c25281;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo1808() {
        if (this.f1573 == null) {
            this.f1573 = m1801();
        }
        return this.f1573;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo1810() {
        if (this.f1575 == null) {
            this.f1575 = C10932.m27734("Result for mt_file_search.", C10932.m27731(JSON.object().add("directoryPath", C10932.m27740("string", "Normalized absolute root, fixed for continuation and the base of every relative path.")).add("listing", C10932.m27742("One matching regular file per element: f size modifiedAt relativePath. Split only at the first three ASCII spaces. Size is bytes or - when unknown; modifiedAt is ISO-8601 or -. Preserve the remaining raw path without trimming, unquoting or splitting on newlines.")).add("pagination", C22783.m51386(JSON.object().add("hasMore", C10932.m27740(ClassTransform.BOOLEAN, "Whether more traversal remains, not whether another match is guaranteed. Can be true with an empty listing.")), "string", "Opaque continuation cursor; empty on the final page. Bound to this root, filters, page size and access policy.", "nextCursor", "Remaining search work.")).add("warnings", C22121.m50076("type", "array", "description", "Reasons and counts of items not evaluated on this page. Empty means no observed search failures, not a filesystem snapshot. Permission-excluded paths are outside the search scope and are not disclosed.").add("items", C22783.m51386(JSON.object().add("reason", C10932.m27738("metadata_unavailable: required size/time unknown; file_unreadable: disappeared or changed type before opening; content_search_failed: read/decode failure or regex timeout/stack limit; name_match_failed: filename regex timeout/stack limit; directory_unreadable: subtree could not be traversed.", "metadata_unavailable", "file_unreadable", "content_search_failed", "name_match_failed", "directory_unreadable")), "integer", "Number of affected files or directories on this page; one unreadable directory can hide many files.", "count", "One aggregated reason."))).add("failedFiles", C22121.m50076("type", "array", "description", "First 20 failed files on this page, in traversal order. Warnings count all failures, including omitted files and unreadable directories. These files were not determined to be non-matches; narrow the name filter to inspect omitted failures. Permission-excluded paths are not disclosed.").add("items", C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute path usable with file tools.")).add("reason", C10932.m27738("invalid_encoding: strict decoding failed; read_timeout: file read timed out; content_search_failed: another read failure or incomplete regex matching; other reasons match the aggregated warning.", "invalid_encoding", "read_timeout", "content_search_failed", "metadata_unavailable", "file_unreadable", "name_match_failed")), "One file whose search could not complete."))), "One file search page."), C5596.m16576("mt_file_search"), C10932.m27737("One directly executable search continuation when hasMore=true, otherwise empty.", C10932.m27732(m1801(), "mt_file_search", "continue")));
        }
        return this.f1575;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_search", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        String str;
        C18173 c18173 = new C18173();
        String[] strArr = f1572;
        C9749.m25412(jSONObject, c18173, "Invalid mt_file_search argument", strArr);
        String strM1800 = m1800(jSONObject, MotionUtils.EASING_TYPE_PATH);
        boolean zM1799 = m1799(jSONObject, "recursive");
        String strM1801 = m1800(jSONObject, "namePattern");
        String strM1797 = m1797(jSONObject, "namePatternType", "literal", "regex");
        String strM1798 = m1797(jSONObject, "nameMatchMode", "exact", "contains");
        boolean zM17910 = m1799(jSONObject, "nameCaseSensitive");
        long jM1802 = m1802(jSONObject, "minSize");
        long jM1803 = m1802(jSONObject, "maxSize");
        Long lM1804 = m1804(jSONObject, "minModifiedAt");
        Long lM1805 = m1804(jSONObject, "maxModifiedAt");
        if (jM1802 != -1 && jM1803 != -1 && jM1802 >= jM1803) {
            throw m1803(jSONObject.get("maxSize"), "minSize must be less than maxSize", "maxSize");
        }
        if (lM1804 != null && lM1805 != null && lM1804.longValue() >= lM1805.longValue()) {
            throw m1803(jSONObject.get("maxModifiedAt"), "minModifiedAt must be before maxModifiedAt", "maxModifiedAt");
        }
        String strM1802 = m1800(jSONObject, "contentPattern");
        String strM1799 = m1797(jSONObject, "contentPatternType", "literal", "regex");
        boolean zM17911 = m1799(jSONObject, "contentCaseSensitive");
        String strM1803 = m1800(jSONObject, "cursor");
        String str2 = "cursor";
        int iM18216 = (int) C6437.m18216(jSONObject, "limit", 1L, 1000L);
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
        jSONObjectObject.put("minSize", jM1802).put("maxSize", jM1803);
        C11854 c11854M56462 = this.f1574.m56462(strM1800, zM1799, strM1803, iM18216, C15022.m36182(C15022.m36179().digest(jSONObjectObject.toString().getBytes(StandardCharsets.UTF_8))), new C2160(strM1801, strM1797.equals("regex"), strM1798.equals("exact"), zM17910, jM1802, jM1803, lM1804, lM1805, strM1802, strM1799.equals("regex"), zM17911));
        C5143 c5143M29703 = c11854M56462.m29703();
        JSONArray jSONArrayArray = JSON.array();
        ArrayList arrayList = c5143M29703.f17918;
        String str5 = c5143M29703.f17916;
        boolean z = c5143M29703.f17917;
        String str6 = c5143M29703.f17913;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        JSONObject jSONObjectAdd = JSON.object().add("directoryPath", str6).add("listing", jSONArrayArray).add("pagination", JSON.object().add("hasMore", z).add("nextCursor", str5)).add("warnings", c11854M56462.m29702()).add("failedFiles", c11854M56462.m29701());
        JSONArray jSONArrayArray2 = JSON.array();
        if (z) {
            jSONArrayArray2.add(C2729.m9064(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, str6).put(str4, str5), "mt_file_search", "continue", "Continue the same file search, even when this page has no matches."));
        }
        return new C1238(C15300.m36728(jSONObjectAdd, jSONArrayArray2));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m1800(JSONObject jSONObject, String str) throws C10186 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m1803(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1799(JSONObject jSONObject, String str) throws C10186 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m1803(jSONValue, strConcat, str);
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1797(JSONObject jSONObject, String str, String str2, String str3) throws C10186 {
        String strM1800 = m1800(jSONObject, str);
        if (strM1800.equals(str2) || strM1800.equals(str3)) {
            return strM1800;
        }
        throw m1803(jSONObject.get(str), ExternalValue$$ExternalSyntheticOutline0.m("Expected ", str2, " or ", str3), str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m1802(JSONObject jSONObject, String str) throws C10186 {
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
        throw m1803(jSONValue, "Expected -1 or a non-negative safe integer byte count", str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Long m1804(JSONObject jSONObject, String str) throws C10186 {
        String strM1800 = m1800(jSONObject, str);
        if (strM1800.isEmpty()) {
            return null;
        }
        try {
            C9306 c9306 = C9306.parse(strM1800);
            if (c9306.getNano() % BasicLabelFormatter.MILLION != 0) {
                throw new C21241("Sub-millisecond precision");
            }
            return Long.valueOf(c9306.toInstant().toEpochMilli());
        } catch (ArithmeticException | C21241 unused) {
            throw m1803(jSONObject.get(str), "Expected ISO-8601 with Z or an explicit UTC offset, at most millisecond precision", str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m1803(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, ".").add("recursive", true).add("namePattern", "").add("namePatternType", "literal").add("nameMatchMode", "contains").add("nameCaseSensitive", false).add("minSize", -1).add("maxSize", -1).add("minModifiedAt", "").add("maxModifiedAt", "").add("contentPattern", "").add("contentPatternType", "literal").add("contentCaseSensitive", false).add("cursor", "").add("limit", 200));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m1801() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute or Home-relative directory. Use . for Home; empty is invalid.")).add("recursive", C10932.m27740(ClassTransform.BOOLEAN, "Search readable subdirectories without following recognized links; recommended true.")).add("namePattern", C10932.m27740("string", "Expression matched against basename including extension, never the parent path. Empty disables name filtering. Literal * is not a wildcard.")).add("namePatternType", C10932.m27738("Expression syntax; recommended literal. Ignored when namePattern is empty.", "literal", "regex")).add("nameMatchMode", C10932.m27738("exact matches the whole basename; contains finds a substring or a regex match. Recommended contains; ignored when namePattern is empty.", "exact", "contains")).add("nameCaseSensitive", C10932.m27740(ClassTransform.BOOLEAN, "Use true for case-sensitive names; recommended false uses Unicode case-insensitive matching. Ignored when namePattern is empty.")).add("minSize", C10932.m27740("integer", "Inclusive minimum bytes; -1 disables. Otherwise 0..9007199254740991. Unknown size cannot satisfy an enabled size filter.")).add("maxSize", C10932.m27740("integer", "Exclusive maximum bytes; -1 disables. Otherwise 0..9007199254740991 and greater than an enabled minSize.")).add("minModifiedAt", C10932.m27740("string", "Inclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Unknown time cannot satisfy an enabled time filter.")).add("maxModifiedAt", C10932.m27740("string", "Exclusive modification time, ISO-8601 with Z or UTC offset, at most millisecond precision. Empty disables. Must be after an enabled minModifiedAt.")).add("contentPattern", C10932.m27740("string", "Require at least one match in decoded file content; empty disables. Literal and regex content matching both use streaming windows, not a file prefix.")).add("contentPatternType", C10932.m27738("Content syntax; recommended literal. Ignored when contentPattern is empty.", "literal", "regex")).add("contentCaseSensitive", C10932.m27740(ClassTransform.BOOLEAN, "Use true for case-sensitive content; recommended false uses Unicode case-insensitive matching. Ignored when contentPattern is empty.")).add("cursor", C10932.m27740("string", "Empty for a new search. For continuation copy the returned action unchanged; changing filters or access policy invalidates the cursor.")), "integer", "Maximum matches per page, 1..1000; recommended 200. A scan budget can yield fewer or zero matches; keep unchanged for continuation.", "limit", "Arguments for mt_file_search; every field is required.");
    }
}
