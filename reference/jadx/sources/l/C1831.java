package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1831 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12534 f6208;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Extract ZIP";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Extract files or directory contents from a ZIP to explicit local destinations. Unsafe extraction paths, destination conflicts, or symbolic links in the selected entries reject the entire request before output is created. Required directories are created. Extraction cannot overwrite its source ZIP. Failure or cancellation can leave completed files and directories; check the reported progress before retrying.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_zip_extract";
    }

    public C1831(C12534 c12534) {
        this.f6208 = c12534;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute or Home-relative source ZIP file; split archives are not supported.")).add("entries", JSON.object().add("type", "array").add("items", C22783.m51386(JSON.object().add("entryPath", C10932.m27740("string", "Exact full ZIP file path or directory path ending in /. From mt_zip_list, concatenate data.entryPath and the listed relative path directly; preserve all characters without path normalization. An empty string selects the ZIP root. Directory mappings remove the selected prefix: docs/ to out/ maps docs/a.txt to out/a.txt; / to out/ maps /a.txt to out/a.txt.")), "string", "Absolute or Home-relative destination. For a file, specify the complete target filename; the ZIP source name does not affect it. For a directory, end in /. The remaining ZIP suffix must not start with / or contain a .. segment; . segments are removed, characters such as ? and * become _, and whitespace becomes spaces. Use individual file mappings to choose exact filenames.", "destinationPath", "One extraction mapping.")).add("description", "Non-empty extraction mappings. Expanded entries must not collide at the same local destination or require a file as a parent directory.")).add("password", C10932.m27740("string", "One password used for all selected encrypted files; pass an empty string if none are encrypted. Extract files requiring different passwords in separate calls.")), ClassTransform.BOOLEAN, "Allow replacing existing regular destination files; recommended false.", "overwrite", "Arguments for mt_zip_extract.");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C20476.m46979("mt_zip_extract", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C20476.m46980(c10186, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        return new C1238(C15300.m36728(this.f6208.m31152(jSONObject), JSON.array()));
    }
}
