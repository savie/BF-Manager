package l;

import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ܺۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47OP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16626 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19147 f53759;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f53760;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19147 f53761;

    public C16626() {
        this("", new C3485(""), null);
    }

    public C16626(String str, C19147 c19147, C19147 c19148) {
        this.f53760 = str;
        c19147 = c19147.m44387() == 31 ? new C3485(d.O) : c19147;
        this.f53761 = c19147;
        this.f53759 = c19148;
        c19147.f61964 = this;
        if (c19148 != null) {
            c19148.f61964 = this;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19147 m39343() {
        return this.f53761;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19147 m39345() {
        return this.f53759;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39342() {
        C19147 c19147;
        return this.f53761.m44386(false) && ((c19147 = this.f53759) == null || c19147.m44386(true));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m39346() {
        return this.f53760;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final JSONObject m39344() {
        JSONObject jSONObject = new JSONObject();
        C19147 c19147 = this.f53761;
        jSONObject.put(am.av, c19147.m44387());
        jSONObject.put("b", this.f53760);
        int iM44387 = c19147.m44387();
        if (iM44387 == 0) {
            jSONObject.put(am.aF, c19147.mo11454());
        } else if (iM44387 == 27) {
            jSONObject.put("f", c19147.mo35301());
        } else if (iM44387 == 34) {
            jSONObject.put(am.aG, c19147.mo35301());
        }
        C19147 c19148 = this.f53759;
        if (c19148 != null) {
            jSONObject.put("d", c19148.m44387());
            int iM44388 = c19148.m44387();
            if (iM44388 == 0) {
                jSONObject.put("e", c19148.mo11454());
            } else {
                if (iM44388 == 27) {
                    jSONObject.put("g", c19148.mo35301());
                    return jSONObject;
                }
                if (iM44388 == 34) {
                    jSONObject.put(am.aC, c19148.mo35301());
                    return jSONObject;
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16626 m39341(JSONObject jSONObject) {
        C19147 c3485;
        int i = jSONObject.getInt(am.av);
        String string = jSONObject.getString("b");
        C19147 c3486 = null;
        if (i == 0) {
            c3485 = new C3485(jSONObject.getString(am.aF));
        } else if (i == 27) {
            c3485 = new C16163(jSONObject.getJSONObject("f"));
        } else if (i == 34) {
            c3485 = new C14671(jSONObject.getJSONObject(am.aG), null);
        } else {
            c3485 = new C19147(i);
        }
        if (jSONObject.contains("d")) {
            int i2 = jSONObject.getInt("d");
            if (i2 == 0) {
                c3486 = new C3485(jSONObject.getString("e"));
            } else if (i2 == 27) {
                c3486 = new C16163(jSONObject.getJSONObject("g"));
            } else if (i2 == 34) {
                c3486 = new C14671(jSONObject.getJSONObject(am.aC), null);
            } else {
                c3486 = new C19147(i2);
            }
        }
        return new C16626(string, c3485, c3486);
    }
}
