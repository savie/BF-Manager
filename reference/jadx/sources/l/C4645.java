package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.n.c;

/* JADX INFO: renamed from: l.ۙۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4645 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21799 m14495(JSONObject jSONObject) {
        C21799 c21799 = new C21799(jSONObject.getInt("id"));
        c21799.f69525 = jSONObject.getString(c.f);
        c21799.f69524 = jSONObject.getInt("port");
        c21799.f1122 = jSONObject.getString("remark");
        c21799.f69523 = jSONObject.getString("username");
        c21799.f69526 = jSONObject.getString("password");
        c21799.f1128 = jSONObject.getString("startPath");
        c21799.f69521 = jSONObject.getString("charset");
        c21799.f69522 = jSONObject.getBoolean("passive");
        return c21799;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21799 m14496(C20348 c20348) {
        c20348.readByte();
        C21799 c21799 = new C21799(c20348.readInt());
        c21799.f69524 = c20348.readInt();
        c20348.m46753();
        c21799.f69522 = c20348.m46753();
        c21799.f69525 = c20348.m46756();
        c21799.f69523 = c20348.m46756();
        c21799.f69526 = c20348.m46756();
        c21799.f1122 = c20348.m46756();
        c21799.f1128 = c20348.m46756();
        c21799.f69521 = c20348.m46756();
        if (!c21799.f1128.startsWith(":")) {
            c21799.f1128 = "";
            return c21799;
        }
        c21799.f1128 = c21799.f1128.substring(1);
        return c21799;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21799 m14497(C20348 c20348) {
        c20348.readByte();
        C21799 c21799 = new C21799(c20348.readInt());
        c21799.f69524 = c20348.readInt();
        c20348.m46753();
        c21799.f69525 = c20348.m46756();
        c21799.f69523 = c20348.m46756();
        c21799.f69526 = c20348.m46756();
        c21799.f1122 = c20348.m46756();
        c21799.f1128 = c20348.m46756();
        c21799.f69521 = c20348.m46756();
        if (!c21799.f1128.startsWith(":")) {
            c21799.f1128 = "";
            return c21799;
        }
        c21799.f1128 = c21799.f1128.substring(1);
        return c21799;
    }
}
