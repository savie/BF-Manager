package l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.c;
import com.umeng.analytics.pro.am;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֫᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2196 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C2196 f7210;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f7221;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f7212 = "";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f7219 = "";

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f7214 = "";

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f7220 = "";

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f7218 = "";

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f7217 = "";

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f7216 = "";

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f7213 = C1402.m5127();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f7211 = C1402.m5127();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Executor f7215 = C3358.m11057();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C2196 m7504() {
        if (f7210 == null) {
            f7210 = new C2196();
        }
        return f7210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7507(Context context) {
        C21587.m49118("AttaReporter", "init");
        this.f7212 = "101492915";
        this.f7219 = C17528.m41148(context);
        this.f7220 = C20512.m47037(context, C5596.m16572());
        this.f7218 = C5596.m16572();
        this.f7217 = C17528.m41155(context) ? "1" : "0";
        this.f7216 = C20512.m47042(context);
        while (true) {
            List list = this.f7211;
            if (list.isEmpty()) {
                break;
            }
            C11890 c11890 = (C11890) list.remove(0);
            HashMap map = c11890.f38310;
            map.put(c.d, this.f7212);
            map.put("app_name", this.f7219);
            map.put("app_ver", this.f7220);
            map.put("pkg_name", this.f7218);
            map.put("qq_install", this.f7217);
            map.put("qq_ver", this.f7216);
            map.put("openid", this.f7214);
            map.put("time_appid_openid", ((String) map.get("time")) + "_" + this.f7212 + "_" + this.f7214);
            StringBuilder sb = new StringBuilder("fixDirtyData--------------------------");
            sb.append(c11890);
            C21587.m49118("AttaReporter", sb.toString());
            this.f7213.add(c11890);
        }
        Context contextM16575 = C5596.m16575();
        if (contextM16575 == null) {
            return;
        }
        contextM16575.deleteDatabase("sdk_report.db");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7508(String str) {
        C21587.m49118("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f7214 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7509(String str, String str2, Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("attaid", "09400051119");
        map.put("token", "9389887874");
        map.put("time_appid_openid", jCurrentTimeMillis + "_" + this.f7212 + "_" + this.f7214);
        map.put("time", String.valueOf(jCurrentTimeMillis));
        map.put("openid", this.f7214);
        map.put(c.d, this.f7212);
        map.put("app_name", this.f7219);
        map.put("app_ver", this.f7220);
        map.put("pkg_name", this.f7218);
        map.put(am.x, "AND");
        map.put("os_ver", Build.VERSION.RELEASE);
        map.put("sdk_ver", "3.5.18.lite");
        map.put("mn", C13053.m32513().m32517());
        map.put("interface_name", str);
        map.put("interface_data", str2);
        map.put("interface_result", obj == null ? "" : obj.toString());
        map.put("qq_install", this.f7217);
        map.put("qq_ver", this.f7216);
        C11890 c11890 = new C11890(map);
        if (TextUtils.isEmpty(this.f7212) || TextUtils.isEmpty(this.f7219) || C5596.m16575() == null) {
            C21587.m49118("AttaReporter", "attaReport cancel appid=" + this.f7212 + ", mAppName=" + this.f7219 + ", context=" + C5596.m16575() + ", " + c11890);
            this.f7211.add(c11890);
            return;
        }
        this.f7215.execute(new RunnableC5925(this, c11890));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7506(C2196 c2196) {
        List list = c2196.f7213;
        C21587.m49118("AttaReporter", "attaReportAtSubThread");
        if (!c2196.f7221) {
            List listM5127 = C1402.m5127();
            c2196.f7221 = listM5127.isEmpty();
            list.addAll(listM5127);
            Iterator it = listM5127.iterator();
            while (it.hasNext()) {
                C21587.m49118("AttaReporter", "attaReportAtSubThread from db = " + ((Serializable) it.next()));
            }
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = 1;
            int i2 = 0;
            if (list.isEmpty()) {
                break;
            }
            C11890 c11890 = (C11890) list.remove(0);
            while (true) {
                i2 += i;
                try {
                    C21587.m49118("AttaReporter", "doAttaReportItem post " + c11890);
                    if (C22333.m50398().m50403(c11890.f38310, "https://h.trace.qq.com/kv").d() != 200) {
                        arrayList.add(c11890);
                        break;
                    }
                    break;
                } catch (Exception e) {
                    C21587.m49117("AttaReporter", "Exception", e);
                    if (i2 >= 2) {
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (c2196.f7221) {
                return;
            }
            C21587.m49118("AttaReporter", "attaReportAtSubThread clear db");
            c2196.f7221 = true;
            return;
        }
        C21587.m49118("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C21587.m49118("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((C11890) ((Serializable) it2.next())));
        }
        c2196.f7221 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m7505() {
        return m7504().f7212;
    }
}
