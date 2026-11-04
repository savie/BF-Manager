package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6KP */
/* JADX INFO: loaded from: classes.dex */
public final class C24952 extends AbstractC17492 {
    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Read ZIP Bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Read a hex page of one ZIP entry's uncompressed bytes. Offsets refer to entry content, not the ZIP file itself. Later offsets may require decompressing from the beginning. This preview does not verify the complete entry; use mt_zip_test for integrity. Keep the ZIP unchanged and use the returned continuation to read more.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_zip_read_bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C22783.m51386(AbstractC17492.m41000(true).add("entryPath", C10932.m27740("string", "Exact full ZIP file path, without a trailing /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization.")).add("byteOffset", C10932.m27740("integer", "Zero-based uncompressed byte offset, 0..9007199254740991; initially 0.")), "integer", "Maximum bytes per page, 1..65536; suggested 256.", "maxBytes", "Arguments for mt_zip_read_bytes.");
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ۫ */
    public final JSONObject mo29017() {
        return C22783.m51386(AbstractC17492.m40999().add("byteOffset", C10932.m27740("integer", "Zero-based offset of the first returned byte.")).add("hex", C10932.m27740("string", "Uppercase hexadecimal without separators; empty when reading at EOF.")).add("nextByteOffset", C10932.m27740("integer", "Offset immediately after the returned bytes.")).add("totalBytes", C10932.m27740("integer", "Uncompressed entry size from ZIP metadata, or the observed length when this read reaches EOF. -1 if unavailable or above 9007199254740991. Does not require a full scan.")), ClassTransform.BOOLEAN, "Whether bytes remain after nextByteOffset.", "hasMore", "One uncompressed byte page.");
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ۚ */
    public final String[] mo38135() {
        return new String[]{"size"};
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ᩷ */
    public final JSONObject mo29018(JSONObject jSONObject) {
        return this.f56851.m2717(jSONObject);
    }

    @Override // l.AbstractC17492
    /* JADX INFO: renamed from: ۙ */
    public final JSONArray mo29016(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!jSONObject2.getBoolean("hasMore")) {
            return JSON.array();
        }
        return JSON.array().add(C2729.m9064(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, jSONObject2.getString(MotionUtils.EASING_TYPE_PATH)).put("byteOffset", jSONObject2.getLong("nextByteOffset")), "mt_zip_read_bytes", "continue", "Read the next byte page from the unchanged ZIP entry."));
    }
}
