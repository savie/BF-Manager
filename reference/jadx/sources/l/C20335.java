package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩶ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 76Y3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20335 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16621 f65857;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public JSONObject f65858;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f65859;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_get_access_policy";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Query the current MCP file access policy before using local file paths. Call with {}. Returns the absolute Home path, path rules in descending priority order with targetType and active status, and permanently denied MT managed paths. Home is read_write except Android/data; elsewhere the first matching active rule applies. The final directory rule has path / and supplies the default access level. Only the user can change permissions in MT settings.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Get File Access Policy";
    }

    public C20335(C16621 c16621) {
        this.f65857 = c16621;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f65859 == null) {
            this.f65859 = JSON.object().add("type", "object").add("additionalProperties", false).add("properties", JSON.object()).add(AnnotationHandler.REQUIRED, JSON.array());
        }
        return this.f65859;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f65858 == null) {
            this.f65858 = C4969.m13780("Result for mt_file_get_access_policy.", C4969.m13777(JSON.object().add("homePath", C4969.m13786("string", "Normalized absolute Home path.")).add("rules", C3184.m9603("type", "array", "description", "Access rules in descending priority order. The first matching active rule wins; the final / directory rule is the default. Inactive rules are shadowed by Home or managed paths.").add("items", C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute rule target.")).add("targetType", C4969.m13786("string", "file or directory.")).add(am.Q, C4969.m13786("string", "read_only, read_write, or deny.")), ClassTransform.BOOLEAN, "Whether the rule currently participates in matching.", "active", "Explicit path access rule."))).add("managedPaths", C3184.m9603("type", "array", "description", "Permanently denied MT managed roots.").add("items", C4969.m13786("string", "Normalized absolute path."))), "Current MCP file access policy."), C4969.m13787(C4969.m13777(JSON.object(), "No tool-specific diagnostics are emitted by this query.")), C4969.m13779("Always empty for this query."));
        }
        return this.f65858;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3194(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        if (!jSONObject.names().isEmpty()) {
            String str = (String) jSONObject.names().get(0);
            throw C12731.m31626("Invalid file access policy argument", str, jSONObject.get(str), JSON.array(), JSON.object());
        }
        C3070 c3070M8504 = ((C2800) this.f65857.f53327).m8504();
        JSONArray jSONArrayArray = JSON.array();
        for (C9422 c9422 : c3070M8504.f11562) {
            jSONArrayArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c9422.f31925).add("targetType", c9422.f31923.m32668()).add(am.Q, c9422.f31924.m51849()).add("active", c9422.f31926));
        }
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it = c3070M8504.f11563.iterator();
        while (it.hasNext()) {
            jSONArrayArray2.add((String) it.next());
        }
        return new C17669(C0735.m3193(JSON.object().add("homePath", c3070M8504.f11564).add("rules", jSONArrayArray).add("managedPaths", jSONArrayArray2), JSON.array()));
    }
}
