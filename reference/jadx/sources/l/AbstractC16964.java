package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܽ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P7A5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16964 {
    /* JADX INFO: renamed from: ۖ */
    public abstract String mo1545();

    /* JADX INFO: renamed from: ۙ */
    public abstract C17669 mo1548(JSONObject jSONObject);

    /* JADX INFO: renamed from: ۚ */
    public abstract JSONObject mo1549();

    /* JADX INFO: renamed from: ۨ */
    public abstract JSONObject mo1550();

    /* JADX INFO: renamed from: ܰ */
    public abstract String mo1551();

    /* JADX INFO: renamed from: ᩹ */
    public abstract String mo1552();

    /* JADX INFO: renamed from: ۙ */
    public JSONObject mo1547(C12731 c12731) {
        JSONObject jSONObjectAdd = JSON.object().add("errorCode", c12731.f42472).add("message", c12731.getMessage()).add("recoverable", c12731.f42469).add("retrySameArguments", c12731.f42470).add("errorSeverity", c12731.f42475).add("nextActions", c12731.f42471);
        for (JSONObject.Member member : c12731.f42468) {
            String name = member.getName();
            if (!"errorCode".equals(name) && !"message".equals(name) && !"recoverable".equals(name) && !"retrySameArguments".equals(name) && !"errorSeverity".equals(name) && !"nextActions".equals(name)) {
                jSONObjectAdd.put(name, member.getValue());
            }
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ۙ */
    public JSONObject mo1546() {
        return JSON.object();
    }
}
