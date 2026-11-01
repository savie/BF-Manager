package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I6XD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1989 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f7440;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17617 f7441;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f7442;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_copy";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Copy one regular local file as raw bytes. Paths may be absolute or relative to Home and must differ. The destination parent must exist; links, directories, and special nodes are rejected. overwrite=false rejects an existing destination. Large files are supported. A new destination inherits source mode, owner, group, and MT modified-time settings; overwrite preserves destination mode, owner, and group. Unsupported metadata is reported in warnings. If a call fails, inspect whether the destination changed before retrying.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Copy Local File";
    }

    public C1989(C17617 c17617) {
        this.f7441 = c17617;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f7440 == null) {
            this.f7440 = C18828.m43457(JSON.object().add("sourcePath", C4969.m13786("string", "Non-empty absolute or Home-relative regular-file source path.")).add("destinationPath", C4969.m13786("string", "Non-empty absolute or Home-relative file destination path.")), ClassTransform.BOOLEAN, "True permits replacing an existing regular file; false requires a missing destination.", "overwrite", "Arguments for mt_file_copy.");
        }
        return this.f7440;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f7442 == null) {
            this.f7442 = C4969.m13780("Result for mt_file_copy.", C18828.m43457(JSON.object().add("sourcePath", C4969.m13786("string", "Normalized absolute source path fixed for this call.")).add("destinationPath", C4969.m13786("string", "Normalized absolute destination path fixed for this call.")).add("warnings", C3184.m9603("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C4969.m13786("string", "One warning message."))), "integer", "Number of source bytes copied.", "size", "Final state after a successful local file copy."), C12123.m30172("mt_file_copy"), C4969.m13779("mt_file_copy has no automatic follow-up action."));
        }
        return this.f7442;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_copy", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C14691(), "Invalid file copy argument", "sourcePath", "destinationPath", "overwrite");
        JSONValue jSONValue = jSONObject.get("sourcePath");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m6402(jSONValue, "Invalid string argument", "sourcePath");
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("destinationPath");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m6402(jSONValue2, "Invalid string argument", "destinationPath");
        }
        String strAsString2 = jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("overwrite");
        if (jSONValue3 == null || !jSONValue3.isBoolean()) {
            throw m6402(jSONValue3, "Invalid boolean argument", "overwrite");
        }
        C15502 c15502M40989 = this.f7441.m40989(strAsString, strAsString2, jSONValue3.asBoolean());
        return new C17669(C0735.m3193(JSON.object().add("sourcePath", c15502M40989.f50501).add("destinationPath", c15502M40989.f50500).add("warnings", c15502M40989.f50499).add("size", c15502M40989.f50502), JSON.array()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m6402(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), C3184.m9603("sourcePath", "source.bin", "destinationPath", "copy.bin").add("overwrite", false));
    }
}
