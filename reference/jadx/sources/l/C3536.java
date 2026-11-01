package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.n.c;

/* JADX INFO: renamed from: l.ۗ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3536 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4718 m10432(JSONObject jSONObject) {
        C4718 c4718 = new C4718(jSONObject.getInt("id"));
        c4718.f16654 = jSONObject.getString(c.f);
        c4718.f16652 = jSONObject.getInt("port");
        c4718.f40386 = jSONObject.getString("remark");
        c4718.f16655 = jSONObject.getString("username");
        c4718.f16650 = jSONObject.getString("password");
        c4718.f40395 = jSONObject.getString("startPath");
        c4718.f16651 = jSONObject.getString("charset");
        c4718.f16653 = jSONObject.getBoolean("passive");
        return c4718;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4718 m10433(C17367 c17367) {
        c17367.readByte();
        C4718 c4718 = new C4718(c17367.readInt());
        c4718.f16652 = c17367.readInt();
        c17367.m40461();
        c4718.f16653 = c17367.m40461();
        c4718.f16654 = c17367.m40442();
        c4718.f16655 = c17367.m40442();
        c4718.f16650 = c17367.m40442();
        c4718.f40386 = c17367.m40442();
        c4718.f40395 = c17367.m40442();
        c4718.f16651 = c17367.m40442();
        if (!c4718.f40395.startsWith(":")) {
            c4718.f40395 = "";
            return c4718;
        }
        c4718.f40395 = c4718.f40395.substring(1);
        return c4718;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4718 m10434(C17367 c17367) {
        c17367.readByte();
        C4718 c4718 = new C4718(c17367.readInt());
        c4718.f16652 = c17367.readInt();
        c17367.m40461();
        c4718.f16654 = c17367.m40442();
        c4718.f16655 = c17367.m40442();
        c4718.f16650 = c17367.m40442();
        c4718.f40386 = c17367.m40442();
        c4718.f40395 = c17367.m40442();
        c4718.f16651 = c17367.m40442();
        if (!c4718.f40395.startsWith(":")) {
            c4718.f40395 = "";
            return c4718;
        }
        c4718.f40395 = c4718.f40395.substring(1);
        return c4718;
    }
}
