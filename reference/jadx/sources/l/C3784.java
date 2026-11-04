package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۘ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76Y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3784 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15953 f12964;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public JSONObject f12965;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f12966;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Get File Access Policy";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Query the current MCP file access policy before using local file paths. Call with {}. Returns the absolute Home path, path rules in descending priority order with targetType and active status, and permanently denied MT managed paths. Home is read_write except Android/data; elsewhere the first matching active rule applies. The final directory rule has path / and supplies the default access level. Only the user can change permissions in MT settings.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_get_access_policy";
    }

    public C3784(C15953 c15953) {
        this.f12964 = c15953;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f12966 == null) {
            this.f12966 = JSON.object().add("type", "object").add("additionalProperties", false).add("properties", JSON.object()).add(AnnotationHandler.REQUIRED, JSON.array());
        }
        return this.f12966;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f12965 == null) {
            this.f12965 = C10932.m27734("Result for mt_file_get_access_policy.", C10932.m27731(JSON.object().add("homePath", C10932.m27740("string", "Normalized absolute Home path.")).add("rules", C22121.m50076("type", "array", "description", "Access rules in descending priority order. The first matching active rule wins; the final / directory rule is the default. Inactive rules are shadowed by Home or managed paths.").add("items", C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute rule target.")).add("targetType", C10932.m27740("string", "file or directory.")).add(am.Q, C10932.m27740("string", "read_only, read_write, or deny.")), ClassTransform.BOOLEAN, "Whether the rule currently participates in matching.", "active", "Explicit path access rule."))).add("managedPaths", C22121.m50076("type", "array", "description", "Permanently denied MT managed roots.").add("items", C10932.m27740("string", "Normalized absolute path."))), "Current MCP file access policy."), C10932.m27741(C10932.m27731(JSON.object(), "No tool-specific diagnostics are emitted by this query.")), C10932.m27733("Always empty for this query."));
        }
        return this.f12965;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        if (!jSONObject.names().isEmpty()) {
            String str = (String) jSONObject.names().get(0);
            throw C10186.m26301("Invalid file access policy argument", str, jSONObject.get(str), JSON.array(), JSON.object());
        }
        C9113 c9113M50227 = ((C22209) this.f12964.f51793).m50227();
        JSONArray jSONArrayArray = JSON.array();
        for (C0911 c0911 : c9113M50227.f29600) {
            jSONArrayArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c0911.f3413).add("targetType", c0911.f3415.m46113()).add(am.Q, c0911.f3412.m20827()).add("active", c0911.f3414));
        }
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it = c9113M50227.f29599.iterator();
        while (it.hasNext()) {
            jSONArrayArray2.add((String) it.next());
        }
        return new C1238(C15300.m36728(JSON.object().add("homePath", c9113M50227.f29601).add("rules", jSONArrayArray).add("managedPaths", jSONArrayArray2), JSON.array()));
    }
}
