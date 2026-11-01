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

/* JADX INFO: renamed from: l.ۖܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2636 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C2636 f10276;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Handler f10277;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SecureRandom f10278 = new SecureRandom();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f10280 = C11445.m28558();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f10281 = C11445.m28558();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Executor f10279 = C11935.m29730();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Executor f10282 = C11935.m29730();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized C2636 m8126() {
        if (f10276 == null) {
            f10276 = new C2636();
        }
        return f10276;
    }

    public C2636() {
        HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f10277 = new HandlerC4753(this, handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8128(Bundle bundle, String str, boolean z) {
        int iM6273;
        C23099.m51107("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        C23099.m51107("openSDK_LOG.ReportManager", "-->availableFrequency, report: report_via | ext: " + str);
        boolean z2 = false;
        if (!TextUtils.isEmpty("report_via")) {
            if (C1791.m5862() == null || (iM6273 = C1931.m6267(C1791.m5862(), str).m6273("Common_BusinessReportFrequency")) == 0) {
                iM6273 = 100;
            }
            z2 = this.f10278.nextInt(100) < iM6273;
            C23099.m51107("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z2 + " | frequency: " + iM6273);
        }
        if (z2 || z) {
            this.f10279.execute(new RunnableC13927(this, bundle, z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8124(String str, long j, long j2, long j3, int i) {
        m8125(str, j, j2, j3, i, "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8125(String str, long j, long j2, long j3, int i, String str2) {
        C23099.m51107("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap m8127() {
        List listM28558 = C11445.m28558();
        List<Serializable> list = this.f10280;
        if (listM28558 != null) {
            list.addAll(listM28558);
        }
        C23099.m51107("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + list.size());
        if (list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : list) {
            JSONObject jSONObject = new JSONObject();
            C2076 c2076 = (C2076) serializable;
            for (String str : c2076.f7679.keySet()) {
                try {
                    String str2 = (String) c2076.f7679.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    C23099.m51111("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        C23099.m51107("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(e.m, jSONArray);
            HashMap map = new HashMap();
            map.put(e.m, jSONObject2.toString());
            return map;
        } catch (JSONException e2) {
            C23099.m51111("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }
}
