package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֫ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2010 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17617 f7511;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_truncate_bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Keep the original byte range [0, size) and discard the tail. size=0 empties the file; the current size is a successful no-op. A size greater than the current file is rejected, never zero-filled. May split encoded characters and does not guarantee valid text. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Truncate File Bytes";
    }

    public C2010(C17617 c17617) {
        this.f7511 = c17617;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C18828.m43457(C23884.m52643(), "integer", "Final byte size to keep, 0..9007199254740991 and no greater than current size. Use 0 to empty.", "size", "Arguments for mt_file_truncate_bytes.");
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        return C23884.m52644("mt_file_truncate_bytes", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_truncate_bytes", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C11184(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "size");
        String strM52646 = C23884.m52646(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM52645 = C23884.m52645(jSONObject);
        long jM38376 = C16249.m38376(jSONObject, "size", 0L, 9007199254740991L);
        C16020.m37995();
        return C23884.m52648(this.f7511.m40988(strM52646, strM52645, new C14712(jM38376)), null, 0L, Math.max(0L, jM38376 - 256));
    }
}
