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

/* JADX INFO: renamed from: l.ܳ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14778 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static C14778 f48313;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f48324;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f48317 = "";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f48322 = "";

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f48320 = "";

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f48315 = "";

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f48318 = "";

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f48323 = "";

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f48314 = "";

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f48321 = C11445.m28558();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public List f48316 = C11445.m28558();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Executor f48319 = C11935.m29730();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C14778 m35413() {
        if (f48313 == null) {
            f48313 = new C14778();
        }
        return f48313;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35416(Context context) {
        C23099.m51107("AttaReporter", "init");
        this.f48317 = "101492915";
        this.f48322 = C3342.m9947(context);
        this.f48315 = C2761.m8432(context, C1791.m5872());
        this.f48318 = C1791.m5872();
        this.f48323 = C3342.m9954(context) ? "1" : "0";
        this.f48314 = C2761.m8436(context);
        while (true) {
            List list = this.f48316;
            if (list.isEmpty()) {
                break;
            }
            C2076 c2076 = (C2076) list.remove(0);
            HashMap map = c2076.f7679;
            map.put(c.d, this.f48317);
            map.put("app_name", this.f48322);
            map.put("app_ver", this.f48315);
            map.put("pkg_name", this.f48318);
            map.put("qq_install", this.f48323);
            map.put("qq_ver", this.f48314);
            map.put("openid", this.f48320);
            map.put("time_appid_openid", ((String) map.get("time")) + "_" + this.f48317 + "_" + this.f48320);
            StringBuilder sb = new StringBuilder("fixDirtyData--------------------------");
            sb.append(c2076);
            C23099.m51107("AttaReporter", sb.toString());
            this.f48321.add(c2076);
        }
        Context contextM5862 = C1791.m5862();
        if (contextM5862 == null) {
            return;
        }
        contextM5862.deleteDatabase("sdk_report.db");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35417(String str) {
        C23099.m51107("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f48320 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35418(String str, String str2, Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("attaid", "09400051119");
        map.put("token", "9389887874");
        map.put("time_appid_openid", jCurrentTimeMillis + "_" + this.f48317 + "_" + this.f48320);
        map.put("time", String.valueOf(jCurrentTimeMillis));
        map.put("openid", this.f48320);
        map.put(c.d, this.f48317);
        map.put("app_name", this.f48322);
        map.put("app_ver", this.f48315);
        map.put("pkg_name", this.f48318);
        map.put(am.x, "AND");
        map.put("os_ver", Build.VERSION.RELEASE);
        map.put("sdk_ver", "3.5.18.lite");
        map.put("mn", C11105.m28002().m28006());
        map.put("interface_name", str);
        map.put("interface_data", str2);
        map.put("interface_result", obj == null ? "" : obj.toString());
        map.put("qq_install", this.f48323);
        map.put("qq_ver", this.f48314);
        C2076 c2076 = new C2076(map);
        if (TextUtils.isEmpty(this.f48317) || TextUtils.isEmpty(this.f48322) || C1791.m5862() == null) {
            C23099.m51107("AttaReporter", "attaReport cancel appid=" + this.f48317 + ", mAppName=" + this.f48322 + ", context=" + C1791.m5862() + ", " + c2076);
            this.f48316.add(c2076);
            return;
        }
        this.f48319.execute(new RunnableC23950(this, c2076));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35415(C14778 c14778) {
        List list = c14778.f48321;
        C23099.m51107("AttaReporter", "attaReportAtSubThread");
        if (!c14778.f48324) {
            List listM28558 = C11445.m28558();
            c14778.f48324 = listM28558.isEmpty();
            list.addAll(listM28558);
            Iterator it = listM28558.iterator();
            while (it.hasNext()) {
                C23099.m51107("AttaReporter", "attaReportAtSubThread from db = " + ((Serializable) it.next()));
            }
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = 1;
            int i2 = 0;
            if (list.isEmpty()) {
                break;
            }
            C2076 c2076 = (C2076) list.remove(0);
            while (true) {
                i2 += i;
                try {
                    C23099.m51107("AttaReporter", "doAttaReportItem post " + c2076);
                    if (C0665.m2989().m2994(c2076.f7679, "https://h.trace.qq.com/kv").d() != 200) {
                        arrayList.add(c2076);
                        break;
                    }
                    break;
                } catch (Exception e) {
                    C23099.m51116("AttaReporter", "Exception", e);
                    if (i2 >= 2) {
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (c14778.f48324) {
                return;
            }
            C23099.m51107("AttaReporter", "attaReportAtSubThread clear db");
            c14778.f48324 = true;
            return;
        }
        C23099.m51107("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C23099.m51107("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((C2076) ((Serializable) it2.next())));
        }
        c14778.f48324 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m35414() {
        return m35413().f48317;
    }
}
