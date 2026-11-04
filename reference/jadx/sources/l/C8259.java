package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8259 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f27161;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15385 f27162;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f27163;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Create Local Directory";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Create an allowed local directory with fixed mkdir -p behavior, including every missing parent directory. An existing directory succeeds with changed=false; any existing non-directory component fails. Paths may be absolute or relative to the Home captured at call start. Creating multiple levels is not atomic; a failure may leave created parent directories, with partial progress reported in error diagnostics.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_create_directory";
    }

    public C8259(C15385 c15385) {
        this.f27162 = c15385;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f27161 == null) {
            this.f27161 = C22783.m51386(JSON.object(), "string", "Non-empty absolute path or path relative to the Home captured at call start.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_create_directory; parent creation is always enabled.");
        }
        return this.f27161;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f27163 == null) {
            this.f27163 = C10932.m27734("Result for mt_file_create_directory.", C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute target directory path.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether at least one directory was created.")).add("warnings", C22121.m50076("type", "array", "description", "Non-fatal directory change notification degradation.").add("items", C10932.m27740("string", "One warning message."))), "Successful mkdir -p operation."), C5596.m16576("mt_file_create_directory"), C10932.m27733("mt_file_create_directory has no automatic follow-up action."));
        }
        return this.f27163;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_create_directory", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C2293(), "Invalid directory create argument", MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301("Invalid path", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "parent/child"));
        }
        C19861 c19861M36856 = this.f27162.m36856(jSONValue.asString());
        return new C1238(C15300.m36728(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c19861M36856.f63890).add("changed", c19861M36856.f63889).add("warnings", new JSONArray(c19861M36856.f63892)), JSON.array()));
    }
}
