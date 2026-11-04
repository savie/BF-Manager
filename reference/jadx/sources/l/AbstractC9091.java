package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۡۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: RIRR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9091 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f29530;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f29531;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f29532;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo10196();

    /* JADX INFO: renamed from: ۙ */
    public abstract JSONObject mo10197(C19050 c19050);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10198(JSONObject jSONObject, C3960 c3960);

    /* JADX INFO: renamed from: ۚ */
    public abstract JSONObject mo10199();

    /* JADX INFO: renamed from: ۫ */
    public abstract JSONObject mo10200();

    /* JADX INFO: renamed from: ᩷ */
    public abstract C19050 mo10201(JSONObject jSONObject);

    public AbstractC9091(C1897 c1897) {
        this.f29531 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f29530 == null) {
            this.f29530 = mo10200();
        }
        return this.f29530;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f29532 == null) {
            this.f29532 = mo10199();
        }
        return this.f29532;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            C19050 c19050Mo10201 = mo10201(jSONObject);
            String str = c19050Mo10201.f61740;
            C1897 c1897 = this.f29531;
            C1238 c1238 = (C1238) c1897.m6532(str, c19050Mo10201.f61738, (String) null, new C0889(this, c19050Mo10201));
            c1897.m6556(str);
            return c1238;
        } finally {
            int i = C24294.f78630;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m24229(C14596 c14596, JSONObject jSONObject) throws C10186 {
        if (!mo10196().equals(c14596.f45981)) {
            throw C10186.m26301("Mismatched list cursor type", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONObject jSONObjectM13966 = C4375.m13966(c14596, jSONObject);
        C19050 c19050Mo10201 = mo10201(jSONObjectM13966);
        String str = c19050Mo10201.f61740;
        String str2 = c19050Mo10201.f61738;
        C19050 c19050 = new C19050(str, str2, c19050Mo10201.f61734, c19050Mo10201.f61735, null, c19050Mo10201.f61733, c14596.f45980.getInt("offset"), 0, c19050Mo10201.f61739, c19050Mo10201.f61732, c19050Mo10201.f61730);
        C10801.m27524(jSONObjectM13966, mo1812());
        String string = jSONObject.getString("nextCursor", null);
        C0889 c0889 = new C0889(this, c19050);
        C1897 c1897 = this.f29531;
        C1238 c1238 = (C1238) c1897.m6532(str, str2, string, c0889);
        c1897.m6556(str);
        return c1238;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1238 m24228(AbstractC9091 abstractC9091, C19050 c19050, int i) {
        String strM42757;
        C3960 c3960M6537 = abstractC9091.f29531.m6537(c19050, new C4156());
        int i2 = C24294.f78630;
        JSONObject jSONObjectObject = JSON.object();
        String str = c3960M6537.f13531;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str).add("editSessionId", c19050.f61738);
        abstractC9091.mo10198(jSONObjectAdd, c3960M6537);
        JSONArray jSONArrayArray = JSON.array();
        boolean z = c3960M6537.f13526;
        if (z) {
            strM42757 = C18326.m42757(abstractC9091.mo10196(), c3960M6537.f13531, c19050.f61738, i, abstractC9091.mo10197(c19050).add("recommendedLimit", c19050.f61733).add("limitMax", 1000), JSON.object().add("offset", c3960M6537.f13542));
            jSONArrayArray.add(C2729.m9064(C4375.m13896(str, c3960M6537.f13528, c19050.f61738, strM42757), "mt_apk_continue", "continue", "Continue listing next page"));
        } else {
            strM42757 = null;
        }
        jSONObjectAdd.add("pagination", JSON.object().add("hasMore", z).add("nextCursor", strM42757).add("returnedCount", c3960M6537.f13529).add("limitMax", 1000).add("totalAvailableCount", c3960M6537.f13541));
        return new C1238(C15300.m36728(jSONObjectAdd, jSONArrayArray));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }
}
