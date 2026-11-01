package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46KL */
/* JADX INFO: loaded from: classes.dex */
public final class C22494 extends AbstractC5560 {
    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_zip_test";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Check the structure of a ZIP archive and fully read every non-directory entry to verify length and checksum or encryption authentication. Files in all directories are checked; any data attached to directory entries is skipped. Stops at the first error and reports the affected entry when available and how many entries passed. This can read the whole archive and exceed client timeouts. Success means all checks completed without a detected error.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Test ZIP Integrity";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C4969.m13777(AbstractC5560.m15346(true).put("password", C4969.m13786("string", "One password used for all encrypted file entries; pass an empty string if none are encrypted. Archives whose entries require different passwords cannot be fully tested with this tool.")), "Arguments for mt_zip_test.");
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ֨ */
    public final JSONObject mo8345() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute archive path.")), "integer", "Non-directory entries fully read and validated.", "checkedEntries", "A completed ZIP integrity test.");
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ۬ */
    public final String[] mo8347() {
        return new String[]{"checkedEntries"};
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ܰ */
    public final JSONObject mo8348(JSONObject jSONObject) {
        return this.f19070.m44332(jSONObject);
    }
}
