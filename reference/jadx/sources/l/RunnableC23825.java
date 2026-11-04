package l;

import android.os.SystemClock;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩹᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23825 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3687 f77165;

    public RunnableC23825(C3687 c3687) {
        this.f77165 = c3687;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jB;
        int iM34334;
        long jC;
        boolean z;
        int i;
        C3687 c3687 = this.f77165;
        try {
            HashMap mapM11982 = c3687.m11982();
            if (mapM11982 == null) {
                return;
            }
            C21587.m49118("openSDK_LOG.ReportManager", "-->doReportVia, params: " + mapM11982);
            int iM55837 = C24988.m55831(C5596.m16575(), (String) null).m55837("Common_HttpRetryCount");
            int i2 = iM55837 == 0 ? 2 : iM55837;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = 0;
            int iD = 0;
            do {
                int i4 = i3 + 1;
                try {
                    InterfaceC11144 interfaceC11144M50403 = C22333.m50398().m50403(mapM11982, "https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report");
                    C21587.m49118("openSDK_LOG.ReportManager", "-->reportVia: statusCode " + interfaceC11144M50403.d());
                    JSONObject jSONObjectM47044 = C20512.m47044(interfaceC11144M50403.a());
                    jC = (long) interfaceC11144M50403.c();
                    jB = interfaceC11144M50403.b();
                    try {
                        try {
                            if (interfaceC11144M50403.d() != 200) {
                                iD = interfaceC11144M50403.d();
                                break;
                            }
                            try {
                                i = jSONObjectM47044.getInt("ret");
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
                        iM34334 = -8;
                        iD = iM34334;
                        i3 = i4;
                        jC = jB;
                    } catch (IOException e) {
                        e = e;
                        jB = 0;
                        iM34334 = C14127.m34334(e);
                        iD = iM34334;
                        i3 = i4;
                        jC = jB;
                    } catch (Exception unused4) {
                        jB = 0;
                        iM34334 = -6;
                        i4 = i2;
                        iD = iM34334;
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
                C3687.m11980("mapp_apptrace_sdk", jElapsedRealtime, jC, jB, i5, null);
                c3687.f12676.clear();
                C21587.m49118("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i5);
            } while (i3 < i2);
            z = false;
            int i6 = iD;
            C3687.m11980("mapp_apptrace_sdk", jElapsedRealtime, jC, jB, i6, null);
            c3687.f12676.clear();
            C21587.m49118("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i6);
        } catch (Throwable th) {
            C21587.m49117("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", th);
        }
    }
}
