package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩶֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6W3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20938 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0580 f66987;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Append File Bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Append raw hexadecimal bytes at the original EOF, preserving all existing bytes. No separator, newline or BOM is added. Empty hex is a successful no-op. The final file size must be at most 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. A failed write may have changed the file; inspect changed and stateKnown before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_append_bytes";
    }

    public C20938(C0580 c0580) {
        this.f66987 = c0580;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C22783.m51386(C9968.m25808(), "string", "Append 0..1048576 raw bytes as even-length, case-insensitive hexadecimal without separators. Empty is a no-op.", "hex", "Arguments for mt_file_append_bytes.");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C9968.m25809("mt_file_append_bytes", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_append_bytes", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C18919(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "hex");
        String strM25811 = C9968.m25811(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM25810 = C9968.m25810(jSONObject);
        String strM25812 = C9968.m25811(jSONObject, "hex");
        if (strM25812.length() > 2097152) {
            throw C9968.m25813("Appended bytes exceed the 1048576-byte limit.", 1048576L, (((long) strM25812.length()) + 1) / 2);
        }
        try {
            byte[] bArrM40024 = C16973.m40024(strM25812);
            C24535.m54817();
            long[] jArr = {0};
            return C9968.m25812(this.f66987.m2662(strM25811, strM25810, new C14224(jArr, bArrM40024)), null, 0L, Math.max(0L, jArr[0] - 32));
        } catch (IllegalArgumentException e) {
            throw C10186.m26302("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, JSON.object());
        }
    }
}
