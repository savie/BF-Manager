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

/* JADX INFO: renamed from: l.᩻ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C24988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Context f80922;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public JSONObject f80923;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f80925;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Map f80921 = C4681.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String f80920 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f80926 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f80924 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24988 m55831(Context context, String str) {
        C24988 c24988;
        Map map = f80921;
        synchronized (map) {
            C21587.m49118("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                f80920 = str;
            }
            if (str == null && (str = f80920) == null) {
                str = "0";
            }
            c24988 = (C24988) map.get(str);
            if (c24988 == null) {
                c24988 = new C24988(context, str);
                map.put(str, c24988);
            }
            C21587.m49118("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return c24988;
    }

    public C24988(Context context, String str) {
        String strConcat;
        InputStream inputStreamOpen;
        this.f80922 = null;
        this.f80925 = null;
        this.f80923 = null;
        Context applicationContext = context.getApplicationContext();
        this.f80922 = applicationContext;
        this.f80925 = str;
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
            this.f80923 = new JSONObject(string);
        } catch (JSONException unused5) {
            this.f80923 = new JSONObject();
        }
        m55832();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55832() {
        if (this.f80924 != 0) {
            m55835("update thread is running, return");
            return;
        }
        this.f80924 = 1;
        HashMap map = new HashMap();
        map.put(c.d, this.f80925);
        map.put("status_os", Build.VERSION.RELEASE);
        map.put("status_machine", C15290.f49992.m32517());
        map.put("status_version", Build.VERSION.SDK);
        map.put("sdkv", "3.5.18.lite");
        map.put("sdkp", am.av);
        try {
            C3358.f10966.execute(new RunnableC11561(this, map));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55834(C24988 c24988, JSONObject jSONObject) {
        String strConcat;
        c24988.m55835("cgi back, do update");
        c24988.f80923 = jSONObject;
        String string = jSONObject.toString();
        String str = c24988.f80925;
        if (str != null) {
            try {
                strConcat = "com.tencent.open.config.json.".concat(str);
            } catch (IOException unused) {
            }
        } else {
            strConcat = "com.tencent.open.config.json";
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c24988.f80922.openFileOutput(strConcat, 0), Charset.forName(a.D));
        outputStreamWriter.write(string);
        outputStreamWriter.flush();
        outputStreamWriter.close();
        c24988.f80926 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m55836() {
        int iOptInt = this.f80923.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f80926 >= iOptInt * 3600000) {
            m55832();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55837(String str) {
        m55835("get ".concat(str));
        m55836();
        return this.f80923.optInt(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55838(String str) {
        m55835("get ".concat(str));
        m55836();
        Object objOpt = this.f80923.opt(str);
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m55835(String str) {
        StringBuilder sbM10405 = C3188.m10405(str, "; appid: ");
        sbM10405.append(this.f80925);
        C21587.m49118("openSDK_LOG.OpenConfig", sbM10405.toString());
    }
}
