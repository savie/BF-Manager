package l;

import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.᩷᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47OP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21159 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13607 f68904;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f68905;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13607 f68906;

    public C21159() {
        this("", new C16346(""), null);
    }

    public C21159(String str, C13607 c13607, C13607 c13608) {
        this.f68905 = str;
        c13607 = c13607.m33251() == 31 ? new C16346(d.O) : c13607;
        this.f68906 = c13607;
        this.f68904 = c13608;
        c13607.f44886 = this;
        if (c13608 != null) {
            c13608.f44886 = this;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13607 m47617() {
        return this.f68906;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13607 m47618() {
        return this.f68904;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47615() {
        C13607 c13607;
        return this.f68906.m33249(false) && ((c13607 = this.f68904) == null || c13607.m33249(true));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m47614() {
        return this.f68905;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final JSONObject m47616() {
        JSONObject jSONObject = new JSONObject();
        C13607 c13607 = this.f68906;
        jSONObject.put(am.av, c13607.m33251());
        jSONObject.put("b", this.f68905);
        int iM33251 = c13607.m33251();
        if (iM33251 == 0) {
            jSONObject.put(am.aF, c13607.mo33246());
        } else if (iM33251 == 27) {
            jSONObject.put("f", c13607.mo33245());
        } else if (iM33251 == 34) {
            jSONObject.put(am.aG, c13607.mo33245());
        }
        C13607 c13608 = this.f68904;
        if (c13608 != null) {
            jSONObject.put("d", c13608.m33251());
            int iM33252 = c13608.m33251();
            if (iM33252 == 0) {
                jSONObject.put("e", c13608.mo33246());
            } else {
                if (iM33252 == 27) {
                    jSONObject.put("g", c13608.mo33245());
                    return jSONObject;
                }
                if (iM33252 == 34) {
                    jSONObject.put(am.aC, c13608.mo33245());
                    return jSONObject;
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21159 m47613(JSONObject jSONObject) {
        C13607 c16346;
        int i = jSONObject.getInt(am.av);
        String string = jSONObject.getString("b");
        C13607 c16347 = null;
        if (i == 0) {
            c16346 = new C16346(jSONObject.getString(am.aF));
        } else if (i == 27) {
            c16346 = new C19874(jSONObject.getJSONObject("f"));
        } else if (i == 34) {
            c16346 = new C14230(jSONObject.getJSONObject(am.aG), null);
        } else {
            c16346 = new C13607(i);
        }
        if (jSONObject.contains("d")) {
            int i2 = jSONObject.getInt("d");
            if (i2 == 0) {
                c16347 = new C16346(jSONObject.getString("e"));
            } else if (i2 == 27) {
                c16347 = new C19874(jSONObject.getJSONObject("g"));
            } else if (i2 == 34) {
                c16347 = new C14230(jSONObject.getJSONObject(am.aC), null);
            } else {
                c16347 = new C13607(i2);
            }
        }
        return new C21159(string, c16346, c16347);
    }
}
