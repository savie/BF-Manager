package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۙ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4854 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6640 f17095;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_zip_extract";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Extract files or directory contents from a ZIP to explicit local destinations. Unsafe extraction paths, destination conflicts, or symbolic links in the selected entries reject the entire request before output is created. Required directories are created. Extraction cannot overwrite its source ZIP. Failure or cancellation can leave completed files and directories; check the reported progress before retrying.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Extract ZIP";
    }

    public C4854(C6640 c6640) {
        this.f17095 = c6640;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute or Home-relative source ZIP file; split archives are not supported.")).add("entries", JSON.object().add("type", "array").add("items", C18828.m43457(JSON.object().add("entryPath", C4969.m13786("string", "Exact full ZIP file path or directory path ending in /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization. An empty string selects the ZIP root. Directory mappings remove the selected prefix: docs/ to out/ maps docs/a.txt to out/a.txt; / to out/ maps /a.txt to out/a.txt.")), "string", "Absolute or Home-relative destination. For a file, specify the complete target filename; the ZIP source name does not affect it. For a directory, end in /. The remaining ZIP suffix must not start with / or contain a .. segment; . segments are removed, characters such as ? and * become _, and whitespace becomes spaces. Use individual file mappings to choose exact filenames.", "destinationPath", "One extraction mapping.")).add("description", "Non-empty extraction mappings. Expanded entries must not collide at the same local destination or require a file as a parent directory.")).add("password", C4969.m13786("string", "One password used for all selected encrypted files; pass an empty string if none are encrypted. Extract files requiring different passwords in separate calls.")), ClassTransform.BOOLEAN, "Allow replacing existing regular destination files; recommended false.", "overwrite", "Arguments for mt_zip_extract.");
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        return C4148.m11791("mt_zip_extract", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C4148.m11792(c12731, true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        return new C17669(C0735.m3193(this.f17095.m18011(jSONObject), JSON.array()));
    }
}
