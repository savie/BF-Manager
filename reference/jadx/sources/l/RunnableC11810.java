package l;

import android.os.SystemClock;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۨܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11810 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2636 f39681;

    public RunnableC11810(C2636 c2636) {
        this.f39681 = c2636;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jB;
        int iM38034;
        long jC;
        boolean z;
        int i;
        C2636 c2636 = this.f39681;
        try {
            HashMap mapM8127 = c2636.m8127();
            if (mapM8127 == null) {
                return;
            }
            C23099.m51107("openSDK_LOG.ReportManager", "-->doReportVia, params: " + mapM8127);
            int iM6273 = C1931.m6267(C1791.m5862(), (String) null).m6273("Common_HttpRetryCount");
            int i2 = iM6273 == 0 ? 2 : iM6273;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = 0;
            int iD = 0;
            do {
                int i4 = i3 + 1;
                try {
                    InterfaceC16894 interfaceC16894M2994 = C0665.m2989().m2994(mapM8127, "https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report");
                    C23099.m51107("openSDK_LOG.ReportManager", "-->reportVia: statusCode " + interfaceC16894M2994.d());
                    JSONObject jSONObjectM8423 = C2761.m8423(interfaceC16894M2994.a());
                    jC = (long) interfaceC16894M2994.c();
                    jB = interfaceC16894M2994.b();
                    try {
                        try {
                            if (interfaceC16894M2994.d() != 200) {
                                iD = interfaceC16894M2994.d();
                                break;
                            }
                            try {
                                i = jSONObjectM8423.getInt("ret");
                            } catch (JSONException unused) {
                                i = -4;
                            }
                            if (i == 0 || jB != 0) {
                                z = true;
                            } else {
                                i3 = i4;
                            }
                        } catch (JSONException unused2) {
                            jB = 0;
                            i3 = i4;
                            jC = jB;
                            iD = -4;
                        }
                    } catch (SocketTimeoutException unused3) {
                        jB = 0;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        iM38034 = -8;
                        iD = iM38034;
                        i3 = i4;
                        jC = jB;
                    } catch (IOException e) {
                        e = e;
                        jB = 0;
                        iM38034 = C16044.m38034(e);
                        iD = iM38034;
                        i3 = i4;
                        jC = jB;
                    } catch (Exception unused4) {
                        jB = 0;
                        iM38034 = -6;
                        i4 = i2;
                        iD = iM38034;
                        i3 = i4;
                        jC = jB;
                    }
                } catch (SocketTimeoutException unused5) {
                    jB = 0;
                } catch (IOException e2) {
                    e = e2;
                    jB = 0;
                } catch (JSONException unused6) {
                    jB = 0;
                } catch (Exception unused7) {
                    jB = 0;
                }
                int i5 = iD;
                C2636.m8125("mapp_apptrace_sdk", jElapsedRealtime, jC, jB, i5, null);
                c2636.f10280.clear();
                C23099.m51107("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i5);
            } while (i3 < i2);
            z = false;
            int i6 = iD;
            C2636.m8125("mapp_apptrace_sdk", jElapsedRealtime, jC, jB, i6, null);
            c2636.f10280.clear();
            C23099.m51107("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i6);
        } catch (Throwable th) {
            C23099.m51116("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", th);
        }
    }
}
