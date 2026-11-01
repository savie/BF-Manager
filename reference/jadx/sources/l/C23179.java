package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩺ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WX */
/* JADX INFO: loaded from: classes.dex */
public final class C23179 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f75223;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public JSONObject f75224;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17659 f75225;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_move";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Move or rename one regular local file or directory. Paths may be absolute or relative to Home and must differ; the destination parent must exist. For files, overwrite=true permits replacing an existing regular file. Directories require overwrite=false and a missing destination; they cannot be merged, replaced, or moved into themselves or descendants. Moves that require copying then deleting are unsupported. Some storage locations cannot change the parent and basename together: move with the same basename first, then rename. After a failure, inspect the reported state before retrying.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Move Local File";
    }

    public C23179(C17659 c17659) {
        this.f75225 = c17659;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f75223 == null) {
            this.f75223 = C18828.m43457(JSON.object().add("sourcePath", C4969.m13786("string", "Non-empty absolute or Home-relative source path.")).add("destinationPath", C4969.m13786("string", "Non-empty absolute or Home-relative destination path.")), ClassTransform.BOOLEAN, "For a regular file, allow direct replacement of an existing regular file; must be false for a directory.", "overwrite", "Arguments for mt_file_move.");
        }
        return this.f75223;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f75224 == null) {
            this.f75224 = C4969.m13780("Result for mt_file_move.", C4969.m13777(JSON.object().add("sourcePath", C4969.m13786("string", "Normalized absolute source identity that no longer exists.")).add("destinationPath", C4969.m13786("string", "Normalized absolute destination identity of the moved node.")).add("type", C4969.m13786("string", "Moved node type: file or directory.")).add("warnings", C3184.m9603("type", "array", "description", "Non-fatal notification or backend metadata degradation.").add("items", C4969.m13786("string", "One warning message."))), "Successful direct local file move."), C12123.m30172("mt_file_move"), C4969.m13783("Success returns one mt_file_stat verification action.", C4969.m13778(C18828.m43457(JSON.object(), "string", "Normalized absolute moved destination path.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat."), "mt_file_stat", "inspect")));
        }
        return this.f75224;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_move", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C6950(), "Invalid mt_file_move argument", "sourcePath", "destinationPath", "overwrite");
        JSONValue jSONValue = jSONObject.get("sourcePath");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m51172(jSONValue, "Invalid string argument", "sourcePath");
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("destinationPath");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m51172(jSONValue2, "Invalid string argument", "destinationPath");
        }
        String strAsString2 = jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("overwrite");
        if (jSONValue3 == null || !jSONValue3.isBoolean()) {
            throw m51172(jSONValue3, "Invalid boolean argument", "overwrite");
        }
        C12721 c12721M41139 = this.f75225.m41139(strAsString, strAsString2, jSONValue3.asBoolean());
        String str = c12721M41139.f42421;
        return new C17669(C0735.m3193(JSON.object().add("sourcePath", c12721M41139.f42423).add("destinationPath", str).add("type", c12721M41139.f42422).add("warnings", c12721M41139.f42420), JSON.array().add(C11320.m28376(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "mt_file_stat", "inspect", "Inspect the moved node at its normalized destination path."))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m51172(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), C3184.m9603("sourcePath", "old/name.bin", "destinationPath", "new/name.bin").add("overwrite", false));
    }
}
