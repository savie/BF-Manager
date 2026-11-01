package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۨ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L6KP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11911 extends AbstractC5560 {
    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_zip_read_bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Read a hex page of one ZIP entry's uncompressed bytes. Offsets refer to entry content, not the ZIP file itself. Later offsets may require decompressing from the beginning. This preview does not verify the complete entry; use mt_zip_test for integrity. Keep the ZIP unchanged and use the returned continuation to read more.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Read ZIP Bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C18828.m43457(AbstractC5560.m15346(true).add("entryPath", C4969.m13786("string", "Exact full ZIP file path, without a trailing /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization.")).add("byteOffset", C4969.m13786("integer", "Zero-based uncompressed byte offset, 0..9007199254740991; initially 0.")), "integer", "Maximum bytes per page, 1..65536; suggested 256.", "maxBytes", "Arguments for mt_zip_read_bytes.");
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ֨ */
    public final JSONObject mo8345() {
        return C18828.m43457(AbstractC5560.m15345().add("byteOffset", C4969.m13786("integer", "Zero-based offset of the first returned byte.")).add("hex", C4969.m13786("string", "Uppercase hexadecimal without separators; empty when reading at EOF.")).add("nextByteOffset", C4969.m13786("integer", "Offset immediately after the returned bytes.")).add("totalBytes", C4969.m13786("integer", "Uncompressed entry size from ZIP metadata, or the observed length when this read reaches EOF. -1 if unavailable or above 9007199254740991. Does not require a full scan.")), ClassTransform.BOOLEAN, "Whether bytes remain after nextByteOffset.", "hasMore", "One uncompressed byte page.");
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ۬ */
    public final String[] mo8347() {
        return new String[]{"size"};
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ܰ */
    public final JSONObject mo8348(JSONObject jSONObject) {
        return this.f19070.m44335(jSONObject);
    }

    @Override // l.AbstractC5560
    /* JADX INFO: renamed from: ۙ */
    public final JSONArray mo8346(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!jSONObject2.getBoolean("hasMore")) {
            return JSON.array();
        }
        return JSON.array().add(C11320.m28376(new JSONObject(jSONObject).put(MotionUtils.EASING_TYPE_PATH, jSONObject2.getString(MotionUtils.EASING_TYPE_PATH)).put("byteOffset", jSONObject2.getLong("nextByteOffset")), "mt_zip_read_bytes", "continue", "Read the next byte page from the unchanged ZIP entry."));
    }
}
