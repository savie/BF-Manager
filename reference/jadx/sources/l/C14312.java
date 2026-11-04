package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.k;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76EV */
/* JADX INFO: loaded from: classes5.dex */
public final class C14312 extends AbstractC19137 {
    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Install APK";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Install one existing APK file on the phone using MT's installation settings. The phone may require installation permission or user confirmation. Installation may replace an installed version. Split APK sets and APKs inside archives are not supported.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_install";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C6929.m19209("{\"path\":{\"type\":\"string\",\"description\":\"Non-empty path to one readable APK on the phone, absolute or relative to Home. Example: MTestApp-Beta.apk.\"}}\n");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C10932.m27734("APK installation request result.", C22783.m51386(JSON.object().add(c.a, C10932.m27738("installed: confirmed success; failed: installation could not start or failed; see message; user_action_required: follow message to continue on the phone; started: installation was submitted; final outcome is unknown. For user_action_required or started, check the outcome on the phone before retrying. No polling tool is provided.", "installed", k.j, "user_action_required", "started")), "string", "Result explanation or the action needed on the phone.", "message", "Observed installation outcome. A successful tool call alone does not confirm installation success."), C10932.m27741(C10932.m27731(JSON.object(), "Request validation or dispatch error.")), C10932.m27733("No automatic follow-up actions."));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        if (jSONObject.size() != 1 || jSONObject.get(MotionUtils.EASING_TYPE_PATH) == null || !jSONObject.get(MotionUtils.EASING_TYPE_PATH).isString()) {
            throw C10186.m26301("Expected only a string path.", MotionUtils.EASING_TYPE_PATH, jSONObject.get(MotionUtils.EASING_TYPE_PATH), JSON.array(), JSON.object());
        }
        C19818 c19818 = new C19818(jSONObject.getString(MotionUtils.EASING_TYPE_PATH), new C22209(C20015.m46048(), C20015.m46049()));
        C10801.m27516(c19818.f63706);
        AbstractC11810.m29655();
        C22802 c22802M56557 = C25303.m56557(c19818);
        return new C1238(C15300.m36728(JSON.object().add(c.a, c22802M56557.m51415()).add("message", c22802M56557.m51414()), JSON.array()));
    }
}
