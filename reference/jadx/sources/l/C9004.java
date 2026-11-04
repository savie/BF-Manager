package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۡ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6XD */
/* JADX INFO: loaded from: classes4.dex */
public final class C9004 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f29320;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0580 f29321;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f29322;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Copy Local File";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Copy one regular local file as raw bytes. Paths may be absolute or relative to Home and must differ. The destination parent must exist; links, directories, and special nodes are rejected. overwrite=false rejects an existing destination. Large files are supported. A new destination inherits source mode, owner, group, and MT modified-time settings; overwrite preserves destination mode, owner, and group. Unsupported metadata is reported in warnings. If a call fails, inspect whether the destination changed before retrying.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_copy";
    }

    public C9004(C0580 c0580) {
        this.f29321 = c0580;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f29320 == null) {
            this.f29320 = C22783.m51386(JSON.object().add("sourcePath", C10932.m27740("string", "Non-empty absolute or Home-relative regular-file source path.")).add("destinationPath", C10932.m27740("string", "Non-empty absolute or Home-relative file destination path.")), ClassTransform.BOOLEAN, "True permits replacing an existing regular file; false requires a missing destination.", "overwrite", "Arguments for mt_file_copy.");
        }
        return this.f29320;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f29322 == null) {
            this.f29322 = C10932.m27734("Result for mt_file_copy.", C22783.m51386(JSON.object().add("sourcePath", C10932.m27740("string", "Normalized absolute source path fixed for this call.")).add("destinationPath", C10932.m27740("string", "Normalized absolute destination path fixed for this call.")).add("warnings", C22121.m50076("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C10932.m27740("string", "One warning message."))), "integer", "Number of source bytes copied.", "size", "Final state after a successful local file copy."), C5596.m16576("mt_file_copy"), C10932.m27733("mt_file_copy has no automatic follow-up action."));
        }
        return this.f29322;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_copy", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C0801(), "Invalid file copy argument", "sourcePath", "destinationPath", "overwrite");
        JSONValue jSONValue = jSONObject.get("sourcePath");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m24024(jSONValue, "Invalid string argument", "sourcePath");
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("destinationPath");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m24024(jSONValue2, "Invalid string argument", "destinationPath");
        }
        String strAsString2 = jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("overwrite");
        if (jSONValue3 == null || !jSONValue3.isBoolean()) {
            throw m24024(jSONValue3, "Invalid boolean argument", "overwrite");
        }
        C2072 c2072M2659 = this.f29321.m2659(strAsString, strAsString2, jSONValue3.asBoolean());
        return new C1238(C15300.m36728(JSON.object().add("sourcePath", c2072M2659.f6895).add("destinationPath", c2072M2659.f6894).add("warnings", c2072M2659.f6897).add("size", c2072M2659.f6896), JSON.array()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m24024(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), C22121.m50076("sourcePath", "source.bin", "destinationPath", "copy.bin").add("overwrite", false));
    }
}
