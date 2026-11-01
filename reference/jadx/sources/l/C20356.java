package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.math.BigDecimal;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩶ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N6WI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20356 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f65927 = {MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "contentPattern", "contentPatternType", "contentCaseSensitive", "writeText", "replacementMode", "replaceMode", "expectedReplacements"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f65928;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17617 f65929;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f65930;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_replace_text";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Replace text in one existing regular file. First call mt_file_read_text and copy path, encoding and targetVersion. Matches are non-overlapping and evaluated against the whole original text; inserted text is never searched again. Regex uses multiline ^/$; dot excludes newlines unless enabled in the expression. Zero-width regex matches use the regex engine's UTF-16 position advancement, including EOF once. Zero matches are a successful no-op unless expectedReplacements disagrees. A timeout, stack limit, cancellation, invalid encoding or replacement count mismatch aborts preparation without changing the file. Original raw bytes are limited to 524288 bytes; encoded output is limited to 10485760 bytes (10 MiB); contentPattern plus writeText are limited to 524288 Unicode code points. Preserves encoding, BOM and original newline characters, with no automatic backup or transcoding. Rejects replacements that change the physical BOM, including exposing a leading U+FEFF. Publication guarantees depend on the file backend; inspect error state before retrying a failed write.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Replace File Text";
    }

    public C20356(C17617 c17617) {
        this.f65929 = c17617;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f65928 == null) {
            this.f65928 = C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Existing regular file; absolute or Home-relative path. Empty is invalid.")).add("targetVersion", C4969.m13786("string", "Copy the existing file's version from mt_file_read_text or mt_file_stat. Empty and missing are invalid.")).add("encoding", C4969.m13786("string", "Copy the non-empty exact token from mt_file_read_text, including its BOM suffix.")).add("contentPattern", C4969.m13786("string", "Non-empty literal or regex to find in the original whole-file text.")).add("contentPatternType", C4969.m13784("Pattern syntax; recommended literal.", "literal", "regex")).add("contentCaseSensitive", C4969.m13786(ClassTransform.BOOLEAN, "Recommended true; false uses Unicode case-insensitive matching.")).add("writeText", C4969.m13786("string", "Replacement text. Empty deletes selected matches. No automatic newline.")).add("replacementMode", C4969.m13784("literal preserves writeText exactly. template requires regex and supports $0..$9, ${number}, ${name}, and escapes \\n, \\r, \\t, \\\\, \\$. Other escapes or unknown groups are invalid; unmatched optional groups expand to empty. Use ${12} for group 12; $12 means group 1 followed by 2. Recommended literal.", "literal", "template")).add("replaceMode", C4969.m13784("first selects the first non-overlapping match; all selects every non-overlapping match. Recommended all.", "first", ProviderConfigurationPermission.ALL_STR)), "integer", "Expected selected count after applying replaceMode, 0..9007199254740991; -1 disables the check. A mismatch rejects the entire operation before publication.", "expectedReplacements", "Arguments for mt_file_replace_text; all fields are required.");
        }
        return this.f65928;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f65930 == null) {
            this.f65930 = C4969.m13780("Result for mt_file_replace_text.", C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute file path.")).add("encoding", C4969.m13786("string", "Actual encoding token, including any physical BOM.")).add("size", C4969.m13786("integer", "Final raw file size in bytes.")).add("targetVersion", C4969.m13786("string", "Final raw-byte version; copy unchanged for subsequent operations.")).add("replacements", C4969.m13786("integer", "Number of original matches selected for replacement, even when writeText leaves their content unchanged.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation file.")).add("warnings", C4969.m13788("Metadata or publication guarantee limitations; empty when none.")), "Final file state after text replacement."), C12123.m30172("mt_file_replace_text"), C1305.m4659());
        }
        return this.f65930;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_replace_text", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C7656(), "Invalid mt_file_replace_text argument", f65927);
        String strM45924 = m45924(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM45925 = m45924(jSONObject, "targetVersion");
        if (strM45925.length() == 16) {
            for (int i = 0; i < strM45925.length(); i++) {
                char cCharAt = strM45925.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'f')) {
                }
            }
            String strM45926 = m45924(jSONObject, "encoding");
            if (strM45926.isEmpty()) {
                throw m45931(jSONObject.get("encoding"), "Copy the encoding returned by mt_file_read_text", "encoding");
            }
            C5518 c5518M49943 = C22452.m49943(strM45926);
            String strM45927 = m45924(jSONObject, "contentPattern");
            if (strM45927.isEmpty()) {
                throw m45931(jSONObject.get("contentPattern"), "contentPattern must not be empty", "contentPattern");
            }
            String strM45928 = m45924(jSONObject, "writeText");
            if (((long) strM45927.codePointCount(0, strM45927.length())) + ((long) strM45928.codePointCount(0, strM45928.length())) > 524288) {
                throw m45931(jSONObject.get("writeText"), "contentPattern plus writeText exceed 524288 Unicode code points", "writeText");
            }
            boolean zEquals = m45925(jSONObject, "contentPatternType", "literal", "regex").equals("regex");
            JSONValue jSONValue = jSONObject.get("contentCaseSensitive");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw m45931(jSONValue, "Invalid contentCaseSensitive", "contentCaseSensitive");
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            boolean zEquals2 = m45925(jSONObject, "replacementMode", "literal", "template").equals("template");
            if (zEquals2 && !zEquals) {
                throw m45931(jSONObject.get("replacementMode"), "template requires contentPatternType=regex", "replacementMode");
            }
            boolean zEquals3 = m45925(jSONObject, "replaceMode", "first", ProviderConfigurationPermission.ALL_STR).equals("first");
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
                                C23158 c23158 = new C23158(C14690.m35218(i2, strM45927), strM45928, zEquals2);
                                try {
                                    C23158.m51160();
                                    String[] strArr = {strM45926};
                                    int[] iArr = {0};
                                    C16725[] c16725Arr = {null};
                                    C7740 c7740M40988 = this.f65929.m40988(strM45924, strM45925, new C21061(strM45924, strM45926, strArr, c23158, zEquals3, iArr, jLongValueExact, c16725Arr, c5518M49943));
                                    String str = c7740M40988.f25575;
                                    String str2 = c7740M40988.f25579;
                                    C16725 c16725 = c16725Arr[0];
                                    if (c16725 != null) {
                                        C17430.m40635(c16725);
                                    }
                                    return new C17669(C0735.m3193(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("encoding", strArr[0]).add("size", c7740M40988.f25578).add("targetVersion", str).add("replacements", iArr[0]).add("changed", c7740M40988.f25576).add("warnings", c7740M40988.f25577), JSON.array().add(C1305.m4652("inspect", "Read text from the final file version.", str2, strArr[0], str))));
                                } catch (C1284 e) {
                                    throw m45933(e, (String) null);
                                }
                            } catch (IllegalArgumentException e2) {
                                throw m45931(jSONObject.get("writeText"), e2.getMessage(), "writeText");
                            }
                        } catch (PatternSyntaxException e3) {
                            throw m45931(jSONObject.get("contentPattern"), "Invalid regular expression: " + e3.getDescription(), "contentPattern");
                        }
                    }
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            throw m45931(jSONValue2, "Expected -1 or a non-negative safe integer", "expectedReplacements");
        }
        throw m45931(jSONObject.get("targetVersion"), "Copy an existing file's 16 lowercase hex targetVersion", "targetVersion");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m45928(String str, String str2, String str3) {
        return C12731.m31627(str, str2, "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m45933(C1284 c1284, String str) {
        int i = C16123.f52113[c1284.f5529.ordinal()];
        if (i == 1) {
            return C12731.m31627("FILE_TEXT_REPLACE_CANCELED", "Text replacement was canceled before publication.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (i == 2) {
            return C12731.m31627("FILE_TEXT_REPLACE_FAILED", "Regex matching did not complete. Simplify the expression before retrying.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (i != 3) {
            throw new IncompatibleClassChangeError();
        }
        return m45932(str, JSON.NULL);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m45932(String str, JSONValue jSONValue) {
        return C12731.m31627("FILE_TEXT_RESULT_TOO_LARGE", "The replacement result exceeds the 10485760-byte text limit.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("limit", 10485760).add("actual", jSONValue));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45930(String str) throws C12731 {
        try {
            C23158.m51160();
        } catch (C1284 e) {
            throw m45933(e, str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45924(JSONObject jSONObject, String str) throws C12731 {
        String strConcat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m45931(jSONValue, strConcat, str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45925(JSONObject jSONObject, String str, String str2, String str3) throws C12731 {
        String strM45924 = m45924(jSONObject, str);
        if (strM45924.equals(str2) || strM45924.equals(str3)) {
            return strM45924;
        }
        throw m45931(jSONObject.get(str), C7997.m21055("Expected ", str2, " or ", str3), str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m45931(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), JSON.object());
    }
}
