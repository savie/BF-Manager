package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۖ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 96L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2737 extends AbstractC5560 {
    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_zip_read_text";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Read a page of text from a ZIP file entry, preserving original line endings. This preview does not verify the complete entry; use mt_zip_test for integrity. Keep the ZIP unchanged and use the returned continuation to read more. Later pages may take longer because reading starts from the entry beginning. To edit, extract the file, edit it with File tools, then replace it with mt_zip_update.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Read ZIP Text";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C18828.m43457(AbstractC5560.m15346(true).add("entryPath", C4969.m13786("string", "Exact full ZIP file path, without a trailing /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization.")).add("encoding", C4969.m13786("string", "Text content encoding, not ZIP filename encoding. Pass an empty string for automatic detection, or specify a lowercase token such as utf-8 if decoding fails or text looks wrong. For continuation, use the returned encoding unchanged.")).add("startLine", C4969.m13786("integer", "Zero-based logical line, 0..9007199254740991; initially 0.")).add("startColumn", C4969.m13786("integer", "Zero-based Unicode code-point column, 0..9007199254740991; initially 0.")).add("limit", C4969.m13786("integer", "Maximum logical lines touched, 1..2000; suggested 500.")), "integer", "Maximum Unicode code points, 2..131072; suggested 49152. CRLF is kept together.", "maxChars", "Arguments for mt_zip_read_text.");
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final JSONObject mo8345() {
        return C18828.m43457(AbstractC5560.m15345().add(TextBundle.TEXT_ENTRY, C4969.m13786("string", "Original decoded text, preserving LF, CRLF and CR.")).add("encoding", C4969.m13786("string", "Actual lowercase text encoding token; a -bom suffix means the entry has that BOM.")).add("startLine", C4969.m13786("integer", "Zero-based original line where this page starts.")).add("startColumn", C4969.m13786("integer", "Zero-based Unicode code-point column where this page starts.")).add("nextLine", C4969.m13786("integer", "Zero-based line for the next page.")).add("nextColumn", C4969.m13786("integer", "Zero-based Unicode code-point column for the next page.")).add("returnedLineCount", C4969.m13786("integer", "Number of distinct logical lines touched by returned text.")).add("returnedCodePoints", C4969.m13786("integer", "Number of Unicode code points in text, including each CR and LF.")), ClassTransform.BOOLEAN, "Whether another code point exists after this page.", "hasMore", "One uncompressed text page.");
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String[] mo8347() {
        return new String[]{"finalLine", "finalColumn"};
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo8348(JSONObject jSONObject) {
        return this.f19070.m44334(jSONObject);
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONArray mo8346(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!jSONObject2.getBoolean("hasMore")) {
            return JSON.array();
        }
        return JSON.array().add(C11320.m28376(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, jSONObject2.getString(MotionUtils.EASING_TYPE_PATH)).put("encoding", jSONObject2.getString("encoding")).put("startLine", jSONObject2.getLong("nextLine")).put("startColumn", jSONObject2.getLong("nextColumn")), "mt_zip_read_text", "continue", "Read the next text page from the unchanged ZIP entry."));
    }
}
