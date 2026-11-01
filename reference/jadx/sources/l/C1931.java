package l;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.alipay.sdk.m.u0.c;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.am;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֫ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1931 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Context f7308;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public JSONObject f7310;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f7311;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Map f7306 = C0561.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String f7305 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f7307 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7309 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1931 m6267(Context context, String str) {
        C1931 c1931;
        Map map = f7306;
        synchronized (map) {
            C23099.m51107("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                f7305 = str;
            }
            if (str == null && (str = f7305) == null) {
                str = "0";
            }
            c1931 = (C1931) map.get(str);
            if (c1931 == null) {
                c1931 = new C1931(context, str);
                map.put(str, c1931);
            }
            C23099.m51107("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return c1931;
    }

    public C1931(Context context, String str) {
        String strConcat;
        InputStream inputStreamOpen;
        this.f7308 = null;
        this.f7311 = null;
        this.f7310 = null;
        Context applicationContext = context.getApplicationContext();
        this.f7308 = applicationContext;
        this.f7311 = str;
        String string = "";
        try {
            if (str != null) {
                try {
                    strConcat = "com.tencent.open.config.json.".concat(str);
                } catch (FileNotFoundException unused) {
                    inputStreamOpen = applicationContext.getAssets().open("com.tencent.open.config.json");
                }
            } else {
                strConcat = "com.tencent.open.config.json";
            }
            inputStreamOpen = applicationContext.openFileInput(strConcat);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charset.forName(a.D)));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        stringBuffer.append(line);
                    }
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    try {
                        inputStreamOpen.close();
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            }
            string = stringBuffer.toString();
            inputStreamOpen.close();
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        try {
            this.f7310 = new JSONObject(string);
        } catch (JSONException unused5) {
            this.f7310 = new JSONObject();
        }
        m6268();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6268() {
        if (this.f7309 != 0) {
            m6271("update thread is running, return");
            return;
        }
        this.f7309 = 1;
        HashMap map = new HashMap();
        map.put(c.d, this.f7311);
        map.put("status_os", Build.VERSION.RELEASE);
        map.put("status_machine", C6165.f21021.m28006());
        map.put("status_version", Build.VERSION.SDK);
        map.put("sdkv", "3.5.18.lite");
        map.put("sdkp", am.av);
        try {
            C11935.f40036.execute(new RunnableC14633(this, map));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6270(C1931 c1931, JSONObject jSONObject) {
        String strConcat;
        c1931.m6271("cgi back, do update");
        c1931.f7310 = jSONObject;
        String string = jSONObject.toString();
        String str = c1931.f7311;
        if (str != null) {
            try {
                strConcat = "com.tencent.open.config.json.".concat(str);
            } catch (IOException unused) {
            }
        } else {
            strConcat = "com.tencent.open.config.json";
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c1931.f7308.openFileOutput(strConcat, 0), Charset.forName(a.D));
        outputStreamWriter.write(string);
        outputStreamWriter.flush();
        outputStreamWriter.close();
        c1931.f7307 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m6272() {
        int iOptInt = this.f7310.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f7307 >= iOptInt * 3600000) {
            m6268();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6273(String str) {
        m6271("get ".concat(str));
        m6272();
        return this.f7310.optInt(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6274(String str) {
        m6271("get ".concat(str));
        m6272();
        Object objOpt = this.f7310.opt(str);
        if (objOpt != null) {
            if (objOpt instanceof Integer) {
                return !objOpt.equals(0);
            }
            if (objOpt instanceof Boolean) {
                return ((Boolean) objOpt).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m6271(String str) {
        StringBuilder sbM8976 = C3012.m8976(str, "; appid: ");
        sbM8976.append(this.f7311);
        C23099.m51107("openSDK_LOG.OpenConfig", sbM8976.toString());
    }
}
