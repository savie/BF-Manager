package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1766 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f6071;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public JSONObject f6072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18369 f6073;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Move Local File";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Move or rename one regular local file or directory. Paths may be absolute or relative to Home and must differ; the destination parent must exist. For files, overwrite=true permits replacing an existing regular file. Directories require overwrite=false and a missing destination; they cannot be merged, replaced, or moved into themselves or descendants. Moves that require copying then deleting are unsupported. Some storage locations cannot change the parent and basename together: move with the same basename first, then rename. After a failure, inspect the reported state before retrying.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_move";
    }

    public C1766(C18369 c18369) {
        this.f6073 = c18369;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f6071 == null) {
            this.f6071 = C22783.m51386(JSON.object().add("sourcePath", C10932.m27740("string", "Non-empty absolute or Home-relative source path.")).add("destinationPath", C10932.m27740("string", "Non-empty absolute or Home-relative destination path.")), ClassTransform.BOOLEAN, "For a regular file, allow direct replacement of an existing regular file; must be false for a directory.", "overwrite", "Arguments for mt_file_move.");
        }
        return this.f6071;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f6072 == null) {
            this.f6072 = C10932.m27734("Result for mt_file_move.", C10932.m27731(JSON.object().add("sourcePath", C10932.m27740("string", "Normalized absolute source identity that no longer exists.")).add("destinationPath", C10932.m27740("string", "Normalized absolute destination identity of the moved node.")).add("type", C10932.m27740("string", "Moved node type: file or directory.")).add("warnings", C22121.m50076("type", "array", "description", "The move completed, but file views may not have refreshed. Do not repeat the move solely because notification failed.").add("items", C10932.m27740("string", "One warning message."))), "Successful direct local file move."), C5596.m16576("mt_file_move"), C10932.m27737("Success returns one mt_file_stat verification action.", C10932.m27732(C22783.m51386(JSON.object(), "string", "Normalized absolute moved destination path.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat."), "mt_file_stat", "inspect")));
        }
        return this.f6072;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_move", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C5495(), "Invalid mt_file_move argument", "sourcePath", "destinationPath", "overwrite");
        JSONValue jSONValue = jSONObject.get("sourcePath");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m6219(jSONValue, "Invalid string argument", "sourcePath");
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("destinationPath");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m6219(jSONValue2, "Invalid string argument", "destinationPath");
        }
        String strAsString2 = jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("overwrite");
        if (jSONValue3 == null || !jSONValue3.isBoolean()) {
            throw m6219(jSONValue3, "Invalid boolean argument", "overwrite");
        }
        C21353 c21353M42845 = this.f6073.m42845(strAsString, strAsString2, jSONValue3.asBoolean());
        String str = c21353M42845.f68012;
        return new C1238(C15300.m36728(JSON.object().add("sourcePath", c21353M42845.f68014).add("destinationPath", str).add("type", c21353M42845.f68013).add("warnings", c21353M42845.f68015), JSON.array().add(C2729.m9064(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "mt_file_stat", "inspect", "Inspect the moved node at its normalized destination path."))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m6219(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), C22121.m50076("sourcePath", "old/name.bin", "destinationPath", "new/name.bin").add("overwrite", false));
    }
}
