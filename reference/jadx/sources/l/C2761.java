package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.alipay.sdk.m.m.b;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.o;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2761 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f10575 = "";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String f10576 = "";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m8424(String str) {
        String[] strArr;
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split(a.p)) {
                    int iIndexOf = str2.indexOf("=");
                    if (iIndexOf == -1) {
                        strArr = new String[]{str2};
                    } else {
                        strArr = new String[]{str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1)};
                    }
                    if (strArr.length == 2) {
                        bundle.putString(C12352.decode(strArr[0]), C12352.decode(strArr[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8427(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split(a.p)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    try {
                        strArrSplit[0] = C12352.decode(strArrSplit[0]);
                        strArrSplit[1] = C12352.decode(strArrSplit[1]);
                    } catch (Exception unused) {
                    }
                    try {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    } catch (JSONException e) {
                        C23099.m51115("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bundle m8435(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle bundleM8424 = m8424(url.getQuery());
            bundleM8424.putAll(m8424(url.getRef()));
            return bundleM8424;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8433(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject jSONObjectM8427 = m8427((JSONObject) null, url.getQuery());
            m8427(jSONObjectM8427, url.getRef());
            return jSONObjectM8427;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8423(String str) {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + l.d;
        }
        return new JSONObject(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8434(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (C3342.m9943(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strM8426 = m8426(messageDigest.digest());
                    messageDigest.reset();
                    if (strM8426.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e) {
                    C23099.m51115("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8430(Context context, String str) {
        boolean zM8434;
        try {
            zM8434 = m8434(context);
            try {
                if (zM8434) {
                    m8428(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    m8428(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (zM8434) {
                    try {
                        try {
                            try {
                                m8428(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                                return true;
                            } catch (Exception unused2) {
                                return false;
                            }
                        } catch (Exception unused3) {
                            m8428(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                            return true;
                        }
                    } catch (Exception unused4) {
                        m8428(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    }
                }
                try {
                    try {
                        m8428(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    } catch (Exception unused5) {
                        return false;
                    }
                } catch (Exception unused6) {
                    m8428(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                    return true;
                }
            }
        } catch (Exception unused7) {
            zM8434 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8428(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8426(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String string = Integer.toString(b & 255, 16);
            if (string.length() == 1) {
                string = "0".concat(string);
            }
            sb.append(string);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0084 A[LOOP:0: B:52:0x0079->B:56:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0083 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8429(Context context) {
        ConnectivityManager connectivityManager;
        int i;
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return true;
                }
            } catch (Exception e) {
                C23099.m51111("openSDK_LOG.Util", "checkSelfPermission exception", e);
            }
        }
        NetworkInfo[] allNetworkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.Util", "Util.isNetWorkAvailable getConnectivity has exception", th);
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return true;
        }
        try {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3))) ? false : true;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (Exception e2) {
                C23099.m51111("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e2);
                if (allNetworkInfo != null && allNetworkInfo.length != 0) {
                    for (NetworkInfo networkInfo : allNetworkInfo) {
                        if (networkInfo.isConnectedOrConnecting()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        } catch (Throwable unused) {
            allNetworkInfo = connectivityManager.getAllNetworkInfo();
            if (allNetworkInfo != null) {
                while (i < r6) {
                    if (networkInfo.isConnectedOrConnecting()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m8425(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString(b.D0, str5);
        bundle.putString("type", str7);
        bundle.putString("login_status", str8);
        bundle.putString("need_user_auth", str9);
        bundle.putString("to_uin", str10);
        bundle.putString("call_source", str11);
        bundle.putString("to_type", str12);
        bundle.putString("platform", "1");
        bundle.putString(o.c, str6);
        return bundle;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m8437(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            f10576 = str2;
            f10575 = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f10576;
            str3.substring(str3.lastIndexOf(46) + 1, f10576.length());
        } catch (PackageManager.NameNotFoundException e) {
            C23099.m51115("openSDK_LOG.Util", "getPackageInfo has exception: " + e.getMessage());
        } catch (Exception e2) {
            C23099.m51115("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m8436(Context context) {
        if (context == null) {
            return "";
        }
        m8437(context, "com.tencent.mobileqq");
        return f10576;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m8432(Context context, String str) {
        if (context == null) {
            return "";
        }
        m8437(context, str);
        return f10575;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static byte[] m8431(String str) {
        try {
            return str.getBytes(a.D);
        } catch (UnsupportedEncodingException e) {
            C23099.m51111("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e);
            return new byte[0];
        }
    }
}
