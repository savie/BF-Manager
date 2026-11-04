package l;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alipay.sdk.m.t.e;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۗ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3687 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C3687 f12674;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Handler f12680;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SecureRandom f12675 = new SecureRandom();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f12676 = C1402.m5127();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f12679 = C1402.m5127();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Executor f12678 = C3358.m11057();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Executor f12677 = C3358.m11057();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized C3687 m11981() {
        if (f12674 == null) {
            f12674 = new C3687();
        }
        return f12674;
    }

    public C3687() {
        HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f12680 = new HandlerC17857(this, handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11983(Bundle bundle, String str, boolean z) {
        int iM55837;
        C21587.m49118("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        C21587.m49118("openSDK_LOG.ReportManager", "-->availableFrequency, report: report_via | ext: " + str);
        boolean z2 = false;
        if (!TextUtils.isEmpty("report_via")) {
            if (C5596.m16575() == null || (iM55837 = C24988.m55831(C5596.m16575(), str).m55837("Common_BusinessReportFrequency")) == 0) {
                iM55837 = 100;
            }
            z2 = this.f12675.nextInt(100) < iM55837;
            C21587.m49118("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z2 + " | frequency: " + iM55837);
        }
        if (z2 || z) {
            this.f12678.execute(new RunnableC16365(this, bundle, z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11979(String str, long j, long j2, long j3, int i) {
        m11980(str, j, j2, j3, i, "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11980(String str, long j, long j2, long j3, int i, String str2) {
        C21587.m49118("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap m11982() {
        List listM5127 = C1402.m5127();
        List<Serializable> list = this.f12676;
        if (listM5127 != null) {
            list.addAll(listM5127);
        }
        C21587.m49118("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + list.size());
        if (list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : list) {
            JSONObject jSONObject = new JSONObject();
            C11890 c11890 = (C11890) serializable;
            for (String str : c11890.f38310.keySet()) {
                try {
                    String str2 = (String) c11890.f38310.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    C21587.m49112("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        C21587.m49118("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(e.m, jSONArray);
            HashMap map = new HashMap();
            map.put(e.m, jSONObject2.toString());
            return map;
        } catch (JSONException e2) {
            C21587.m49112("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }
}
