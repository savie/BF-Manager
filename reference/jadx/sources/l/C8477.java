package l;

import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۠۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WI */
/* JADX INFO: loaded from: classes4.dex */
public final class C8477 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0580 f27763;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Truncate File Bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Keep the original byte range [0, size) and discard the tail. size=0 empties the file; the current size is a successful no-op. A size greater than the current file is rejected, never zero-filled. May split encoded characters and does not guarantee valid text. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. A failed write may have changed the file; inspect changed and stateKnown before retrying.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_truncate_bytes";
    }

    public C8477(C0580 c0580) {
        this.f27763 = c0580;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C22783.m51386(C9968.m25808(), "integer", "Final byte size to keep, 0..9007199254740991 and no greater than current size. Use 0 to empty.", "size", "Arguments for mt_file_truncate_bytes.");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C9968.m25809("mt_file_truncate_bytes", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_truncate_bytes", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C18919(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "size");
        String strM25811 = C9968.m25811(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM25810 = C9968.m25810(jSONObject);
        long jM18216 = C6437.m18216(jSONObject, "size", 0L, 9007199254740991L);
        C24535.m54817();
        return C9968.m25812(this.f27763.m2662(strM25811, strM25810, new C2511(jM18216)), null, 0L, Math.max(0L, jM18216 - 256));
    }
}
