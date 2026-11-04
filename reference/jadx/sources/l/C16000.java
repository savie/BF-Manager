package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܶۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46KL */
/* JADX INFO: loaded from: classes5.dex */
public final class C16000 extends AbstractC17492 {
    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Test ZIP Integrity";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Check the structure of a ZIP archive and fully read every non-directory entry to verify length and checksum or encryption authentication. Files in all directories are checked; any data attached to directory entries is skipped. Stops at the first error and reports the affected entry when available and how many entries passed. This can read the whole archive and exceed client timeouts. Success means all checks completed without a detected error.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_zip_test";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C10932.m27731(AbstractC17492.m41000(true).put("password", C10932.m27740("string", "One password used for all encrypted file entries; pass an empty string if none are encrypted. Archives whose entries require different passwords cannot be fully tested with this tool.")), "Arguments for mt_zip_test.");
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ۫ */
    public final JSONObject mo29017() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute archive path.")), "integer", "Non-directory entries fully read and validated.", "checkedEntries", "A completed ZIP integrity test.");
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String[] mo38135() {
        return new String[]{"checkedEntries"};
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ᩷ */
    public final JSONObject mo29018(JSONObject jSONObject) {
        return this.f56851.m2718(jSONObject);
    }
}
