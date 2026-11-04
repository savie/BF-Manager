package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.math.BigDecimal;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۘ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6WI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4003 extends AbstractC19137 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String[] f13679 = {MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "contentPattern", "contentPatternType", "contentCaseSensitive", "writeText", "replacementMode", "replaceMode", "expectedReplacements"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f13680;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0580 f13681;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f13682;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Replace File Text";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Replace text in one existing regular file. First call mt_file_read_text and copy path, encoding and targetVersion. Matches are non-overlapping and evaluated against the whole original text; inserted text is never searched again. Regex uses multiline ^/$; dot excludes newlines unless enabled in the expression. Zero-width regex matches use the regex engine's UTF-16 position advancement, including EOF once. Zero matches are a successful no-op unless expectedReplacements disagrees. A timeout, stack limit, cancellation, invalid encoding or replacement count mismatch aborts preparation without changing the file. Original raw bytes are limited to 524288 bytes; encoded output is limited to 10485760 bytes (10 MiB); contentPattern plus writeText are limited to 524288 Unicode code points. Preserves encoding, BOM and original newline characters, with no automatic backup or transcoding. Rejects replacements that change the physical BOM, including exposing a leading U+FEFF. A failed write may have changed the file; inspect changed and stateKnown before retrying.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_replace_text";
    }

    public C4003(C0580 c0580) {
        this.f13681 = c0580;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f13680 == null) {
            this.f13680 = C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Existing regular file; absolute or Home-relative path. Empty is invalid.")).add("targetVersion", C10932.m27740("string", "Copy the existing file's version from mt_file_read_text or mt_file_stat. Empty and missing are invalid.")).add("encoding", C10932.m27740("string", "Copy the non-empty exact token from mt_file_read_text, including its BOM suffix.")).add("contentPattern", C10932.m27740("string", "Non-empty literal or regex to find in the original whole-file text.")).add("contentPatternType", C10932.m27738("Pattern syntax; recommended literal.", "literal", "regex")).add("contentCaseSensitive", C10932.m27740(ClassTransform.BOOLEAN, "Recommended true; false uses Unicode case-insensitive matching.")).add("writeText", C10932.m27740("string", "Replacement text. Empty deletes selected matches. No automatic newline.")).add("replacementMode", C10932.m27738("literal preserves writeText exactly. template requires regex and supports $0..$9, ${number}, ${name}, and escapes \\n, \\r, \\t, \\\\, \\$. Other escapes or unknown groups are invalid; unmatched optional groups expand to empty. Use ${12} for group 12; $12 means group 1 followed by 2. Recommended literal.", "literal", "template")).add("replaceMode", C10932.m27738("first selects the first non-overlapping match; all selects every non-overlapping match. Recommended all.", "first", ProviderConfigurationPermission.ALL_STR)), "integer", "Expected selected count after applying replaceMode, 0..9007199254740991; -1 disables the check. A mismatch rejects the entire operation before publication.", "expectedReplacements", "Arguments for mt_file_replace_text; all fields are required.");
        }
        return this.f13680;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f13682 == null) {
            this.f13682 = C10932.m27734("Result for mt_file_replace_text.", C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute file path.")).add("encoding", C10932.m27740("string", "Actual encoding token, including any physical BOM.")).add("size", C10932.m27740("integer", "Final raw file size in bytes.")).add("targetVersion", C10932.m27740("string", "Final raw-byte version; copy unchanged for subsequent operations.")).add("replacements", C10932.m27740("integer", "Number of original matches selected for replacement, even when writeText leaves their content unchanged.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation file.")).add("warnings", C10932.m27742("Metadata or publication guarantee limitations; empty when none.")), "Final file state after text replacement."), C5596.m16576("mt_file_replace_text"), C19665.m45335());
        }
        return this.f13682;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_replace_text", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C12206(), "Invalid mt_file_replace_text argument", f13679);
        String strM12957 = m12957(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM12958 = m12957(jSONObject, "targetVersion");
        if (strM12958.length() == 16) {
            for (int i = 0; i < strM12958.length(); i++) {
                char cCharAt = strM12958.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'f')) {
                }
            }
            String strM12959 = m12957(jSONObject, "encoding");
            if (strM12959.isEmpty()) {
                throw m12964(jSONObject.get("encoding"), "Copy the encoding returned by mt_file_read_text", "encoding");
            }
            C10495 c10495M50582 = C22430.m50582(strM12959);
            String strM129510 = m12957(jSONObject, "contentPattern");
            if (strM129510.isEmpty()) {
                throw m12964(jSONObject.get("contentPattern"), "contentPattern must not be empty", "contentPattern");
            }
            String strM129511 = m12957(jSONObject, "writeText");
            if (((long) strM129510.codePointCount(0, strM129510.length())) + ((long) strM129511.codePointCount(0, strM129511.length())) > 524288) {
                throw m12964(jSONObject.get("writeText"), "contentPattern plus writeText exceed 524288 Unicode code points", "writeText");
            }
            boolean zEquals = m12958(jSONObject, "contentPatternType", "literal", "regex").equals("regex");
            JSONValue jSONValue = jSONObject.get("contentCaseSensitive");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw m12964(jSONValue, "Invalid contentCaseSensitive", "contentCaseSensitive");
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            boolean zEquals2 = m12958(jSONObject, "replacementMode", "literal", "template").equals("template");
            if (zEquals2 && !zEquals) {
                throw m12964(jSONObject.get("replacementMode"), "template requires contentPatternType=regex", "replacementMode");
            }
            boolean zEquals3 = m12958(jSONObject, "replaceMode", "first", ProviderConfigurationPermission.ALL_STR).equals("first");
            JSONValue jSONValue2 = jSONObject.get("expectedReplacements");
            if (jSONValue2 != null && jSONValue2.isNumber()) {
                try {
                    long jLongValueExact = new BigDecimal(jSONValue2.toString()).longValueExact();
                    if (jLongValueExact >= -1 && jLongValueExact <= 9007199254740991L) {
                        int i2 = zEquals ? 8 : 16;
                        if (!zAsBoolean) {
                            i2 |= 66;
                        }
                        try {
                            try {
                                C1547 c1547 = new C1547(C18415.m42924(i2, strM129510), strM129511, zEquals2);
                                try {
                                    C1547.m5475();
                                    String[] strArr = {strM12959};
                                    int[] iArr = {0};
                                    C21551[] c21551Arr = {null};
                                    C20717 c20717M2662 = this.f13681.m2662(strM12957, strM12958, new C6241(strM12957, strM12959, strArr, c1547, zEquals3, iArr, jLongValueExact, c21551Arr, c10495M50582));
                                    String str = c20717M2662.f66394;
                                    String str2 = c20717M2662.f66393;
                                    C21551 c21551 = c21551Arr[0];
                                    if (c21551 != null) {
                                        C0668.m2893(c21551);
                                    }
                                    return new C1238(C15300.m36728(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("encoding", strArr[0]).add("size", c20717M2662.f66391).add("targetVersion", str).add("replacements", iArr[0]).add("changed", c20717M2662.f66390).add("warnings", c20717M2662.f66392), JSON.array().add(C19665.m45328("inspect", "Read text from the final file version.", str2, strArr[0], str))));
                                } catch (C19446 e) {
                                    throw m12966(e, (String) null);
                                }
                            } catch (IllegalArgumentException e2) {
                                throw m12964(jSONObject.get("writeText"), e2.getMessage(), "writeText");
                            }
                        } catch (PatternSyntaxException e3) {
                            throw m12964(jSONObject.get("contentPattern"), "Invalid regular expression: " + e3.getDescription(), "contentPattern");
                        }
                    }
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            throw m12964(jSONValue2, "Expected -1 or a non-negative safe integer", "expectedReplacements");
        }
        throw m12964(jSONObject.get("targetVersion"), "Copy an existing file's 16 lowercase hex targetVersion", "targetVersion");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m12961(String str, String str2, String str3) {
        return C10186.m26302(str, str2, "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m12966(C19446 c19446, String str) {
        int i = C24141.f78148[c19446.f62816.ordinal()];
        if (i == 1) {
            return C10186.m26302("FILE_TEXT_REPLACE_CANCELED", "Text replacement was canceled before publication.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (i == 2) {
            return C10186.m26302("FILE_TEXT_REPLACE_FAILED", "Regex matching did not complete. Simplify the expression before retrying.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (i != 3) {
            throw new IncompatibleClassChangeError();
        }
        return m12965(str, JSON.NULL);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m12965(String str, JSONValue jSONValue) {
        return C10186.m26302("FILE_TEXT_RESULT_TOO_LARGE", "The replacement result exceeds the 10485760-byte text limit.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("limit", 10485760).add("actual", jSONValue));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12963(String str) throws C10186 {
        try {
            C1547.m5475();
        } catch (C19446 e) {
            throw m12966(e, str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12957(JSONObject jSONObject, String str) throws C10186 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m12964(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12958(JSONObject jSONObject, String str, String str2, String str3) throws C10186 {
        String strM12957 = m12957(jSONObject, str);
        if (strM12957.equals(str2) || strM12957.equals(str3)) {
            return strM12957;
        }
        throw m12964(jSONObject.get(str), ExternalValue$$ExternalSyntheticOutline0.m("Expected ", str2, " or ", str3), str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m12964(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), JSON.object());
    }
}
