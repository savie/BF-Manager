package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7A5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19137 {
    /* JADX INFO: renamed from: ۙ */
    public abstract C1238 mo1807(JSONObject jSONObject);

    /* JADX INFO: renamed from: ۤ */
    public abstract JSONObject mo1808();

    /* JADX INFO: renamed from: ܳ */
    public abstract String mo1809();

    /* JADX INFO: renamed from: ᩴ */
    public abstract JSONObject mo1810();

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo1811();

    /* JADX INFO: renamed from: ᩸ */
    public abstract String mo1812();

    /* JADX INFO: renamed from: ۙ */
    public JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObjectAdd = JSON.object().add("errorCode", c10186.f32601).add("message", c10186.getMessage()).add("recoverable", c10186.f32600).add("retrySameArguments", c10186.f32598).add("errorSeverity", c10186.f32604).add("nextActions", c10186.f32599);
        for (JSONObject.Member member : c10186.f32602) {
            String name = member.getName();
            if (!"errorCode".equals(name) && !"message".equals(name) && !"recoverable".equals(name) && !"retrySameArguments".equals(name) && !"errorSeverity".equals(name) && !"nextActions".equals(name)) {
                jSONObjectAdd.put(name, member.getValue());
            }
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ۙ */
    public JSONObject mo1805() {
        return JSON.object();
    }
}
