package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܽᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6W3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16807 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17617 f53805;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_append_bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Append raw hexadecimal bytes at the original EOF, preserving all existing bytes. No separator, newline or BOM is added. Empty hex is a successful no-op. The final file size must be at most 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Append File Bytes";
    }

    public C16807(C17617 c17617) {
        this.f53805 = c17617;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C18828.m43457(C23884.m52643(), "string", "Append 0..1048576 raw bytes as even-length, case-insensitive hexadecimal without separators. Empty is a no-op.", "hex", "Arguments for mt_file_append_bytes.");
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        return C23884.m52644("mt_file_append_bytes", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_append_bytes", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C11184(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "hex");
        String strM52646 = C23884.m52646(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM52645 = C23884.m52645(jSONObject);
        String strM52647 = C23884.m52646(jSONObject, "hex");
        if (strM52647.length() > 2097152) {
            throw C23884.m52647("Appended bytes exceed the 1048576-byte limit.", 1048576L, (((long) strM52647.length()) + 1) / 2);
        }
        try {
            byte[] bArrM24741 = C9754.m24741(strM52647);
            C16020.m37995();
            long[] jArr = {0};
            return C23884.m52648(this.f53805.m40988(strM52646, strM52645, new C0578(jArr, bArrM24741)), null, 0L, Math.max(0L, jArr[0] - 32));
        } catch (IllegalArgumentException e) {
            throw C12731.m31627("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, JSON.object());
        }
    }
}
