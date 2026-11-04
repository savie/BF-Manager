package l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.webkit.CookieSyncManager;
import com.alipay.sdk.m.u0.c;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.۠۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C8658 extends AbstractC6168 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f28263 = "libwbsafeedit";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f28264;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public WeakReference f28265;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f28266;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19020 f28267;

    /* JADX WARN: Code duplicated, block: B:101:0x0353  */
    /* JADX WARN: Code duplicated, block: B:102:0x037d  */
    /* JADX WARN: Code duplicated, block: B:110:0x043f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0447  */
    /* JADX WARN: Code duplicated, block: B:117:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x0168  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0202  */
    /* JADX WARN: Code duplicated, block: B:60:0x0209  */
    /* JADX WARN: Code duplicated, block: B:63:0x0210  */
    /* JADX WARN: Code duplicated, block: B:66:0x0217  */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0247 A[Catch: Exception -> 0x0266, TRY_LEAVE, TryCatch #4 {Exception -> 0x0266, blocks: (B:75:0x0243, B:76:0x0247), top: B:129:0x023d }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0328  */
    /* JADX WARN: Code duplicated, block: B:98:0x032f  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x0353, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23308(Activity activity, InterfaceC19020 interfaceC19020) {
        C13878 c13878;
        ?? r2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        InterfaceC19020 c2692;
        Bundle bundleM17772;
        String str7;
        boolean z;
        String str8;
        String str9;
        String str10;
        Intent intent;
        ?? r3;
        Bundle bundleM17773;
        String str11;
        String str12;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        ?? r4;
        ?? r5;
        String strM45529;
        ?? r6;
        byte[] bArr;
        double dSqrt;
        String str13 = "openSDK_LOG.AuthAgent";
        if (C10069.m26033()) {
            C21587.m49113("openSDK_LOG.AuthAgent", "permission not granted");
            interfaceC19020.mo2047(new C1121(-6, "用户未授权，暂时无法使用QQ登录及分享等功能", "用户未授权，暂时无法使用QQ登录及分享等功能"));
            return -1;
        }
        this.f28266 = "get_simple_userinfo";
        this.f28265 = new WeakReference(activity);
        this.f28267 = interfaceC19020;
        Object[] objArr = new Object[2];
        Intent intent2 = activity.getIntent();
        boolean z2 = intent2 != null && intent2.getBooleanExtra("KEY_FORCE_QR_LOGIN", false);
        String str14 = "101492915";
        boolean zM55838 = C24988.m55831(activity, "101492915").m55838("C_LoginWeb");
        C21587.m49113("openSDK_LOG.AuthAgent", "doLogin needForceQrLogin=" + z2 + ", toWebLogin=" + zM55838);
        String str15 = "pf";
        String str16 = "5";
        String str17 = "client_id";
        C13878 c13879 = this.f21019;
        if (z2 || zM55838) {
            c13878 = c13879;
            str17 = "client_id";
            r2 = "openSDK_LOG.SystemUtils";
            str = "openmobile_android";
            str2 = "-";
            str3 = "-android-";
            str4 = "desktop_m_qq-";
            str15 = "pf";
            str16 = str16;
            str5 = "openSDK_LOG.AuthAgent";
        } else {
            C21587.m49113("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
            Intent intent3 = new Intent();
            c13878 = c13879;
            intent3.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
            byte[] bArrDigest = null;
            if (C17528.m41152(C5596.m16575(), intent3)) {
                str13 = "openSDK_LOG.AuthAgent";
                str14 = "101492915";
                str8 = "openSDK_LOG.SystemUtils";
                str = "openmobile_android";
                str9 = "-";
                str3 = "-android-";
                str10 = "desktop_m_qq-";
                intent = intent3;
            } else {
                intent3.setClassName("com.tencent.tim", "com.tencent.open.agent.AgentActivity");
                if (C17528.m41152(C5596.m16575(), intent3)) {
                    str13 = "openSDK_LOG.AuthAgent";
                    str14 = "101492915";
                    str8 = "openSDK_LOG.SystemUtils";
                    str = "openmobile_android";
                    str9 = "-";
                    str3 = "-android-";
                    str10 = "desktop_m_qq-";
                } else {
                    try {
                        DisplayMetrics displayMetrics = C5596.m16575().getResources().getDisplayMetrics();
                        str8 = "openSDK_LOG.SystemUtils";
                        try {
                            float f = displayMetrics.widthPixels / displayMetrics.xdpi;
                            float f2 = displayMetrics.heightPixels / displayMetrics.ydpi;
                            str = "openmobile_android";
                            str9 = "-";
                            double d = f;
                            str3 = "-android-";
                            str10 = "desktop_m_qq-";
                            try {
                                str13 = "openSDK_LOG.AuthAgent";
                                str14 = "101492915";
                                try {
                                    dSqrt = Math.sqrt(Math.pow(d, 2.0d) + Math.pow(f2, 2.0d));
                                } catch (Throwable unused) {
                                    dSqrt = 0.0d;
                                }
                            } catch (Throwable unused2) {
                                str13 = "openSDK_LOG.AuthAgent";
                                str14 = "101492915";
                            }
                        } catch (Throwable unused3) {
                            str = "openmobile_android";
                            str9 = "-";
                            str3 = "-android-";
                            str10 = "desktop_m_qq-";
                            dSqrt = 0.0d;
                            if (dSqrt > 6.5d) {
                                intent3.setClassName("com.tencent.minihd.qq", "com.tencent.open.agent.AgentActivity");
                                if (C17528.m41152(C5596.m16575(), intent3)) {
                                    intent = intent3;
                                }
                                if (intent != null) {
                                    bundleM17773 = m17772();
                                    bundleM17773.putString("scope", this.f28266);
                                    str14 = str14;
                                    bundleM17773.putString("client_id", str14);
                                    if (AbstractC6168.f21018) {
                                        str12 = str10;
                                        StringBuilder sb = new StringBuilder(str12);
                                        sb.append(AbstractC6168.f21015);
                                        sb.append(str3);
                                        sb.append(AbstractC6168.f21016);
                                        str11 = str9;
                                        sb.append(str11);
                                        sb.append(AbstractC6168.f21017);
                                        bundleM17773.putString("pf", sb.toString());
                                    } else {
                                        str11 = str9;
                                        str12 = str10;
                                        bundleM17773.putString("pf", str);
                                    }
                                    bundleM17773.putString("need_pay", "1");
                                    bundleM17773.putString("oauth_app_name", C17528.m41148(C5596.m16575()));
                                    intent.putExtra("key_action", "action_login");
                                    intent.putExtra("key_params", bundleM17773);
                                    intent.putExtra(c.d, str14);
                                    string = bundleM17773.getString("status_os");
                                    string2 = bundleM17773.getString("status_machine");
                                    string3 = bundleM17773.getString("status_version");
                                    string4 = bundleM17773.getString("sdkv");
                                    str2 = str11;
                                    string5 = bundleM17773.getString("client_id");
                                    string6 = bundleM17773.getString("need_pay");
                                    string7 = bundleM17773.getString("pf");
                                    str4 = str12;
                                    StringBuilder sbM10406 = C3188.m10406("os=", string, ", machine=", string2, ", version=");
                                    C4794.m14774(sbM10406, string3, ", sdkv=", string4, ", appId=");
                                    C4794.m14774(sbM10406, string5, ", needPay=", string6, ", pf=");
                                    sbM10406.append(string7);
                                    str5 = str13;
                                    C21587.m49111(str5, sbM10406.toString());
                                    StringBuilder sb2 = new StringBuilder();
                                    if (string == null) {
                                        string = "";
                                    }
                                    sb2.append(string);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    sb2.append(string2);
                                    if (string3 == null) {
                                        string3 = "";
                                    }
                                    sb2.append(string3);
                                    if (string4 == null) {
                                        string4 = "";
                                    }
                                    sb2.append(string4);
                                    if (string5 == null) {
                                        string5 = "";
                                    }
                                    sb2.append(string5);
                                    if (string6 == null) {
                                        string6 = "";
                                    }
                                    sb2.append(string6);
                                    if (string7 == null) {
                                        string7 = "";
                                    }
                                    sb2.append(string7);
                                    String string8 = sb2.toString();
                                    try {
                                        MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                                        messageDigest.update(string8.getBytes());
                                        bArrDigest = messageDigest.digest();
                                        r4 = messageDigest;
                                    } catch (Exception e) {
                                        try {
                                            C21587.m49112("DESUtils", "encryptSha", e);
                                            r4 = "DESUtils";
                                        } catch (Exception e2) {
                                            e = e2;
                                            r4 = str8;
                                            C21587.m49112(r4, "getEncryptPkgName", e);
                                            r6 = r4;
                                            strM45529 = "";
                                            r5 = r6;
                                            bundleM17773.putString("ppsts", strM45529);
                                            this.f28267 = new C9403(this, this.f28267);
                                            C21084.m48147().m48151(this.f28267);
                                            C21587.m49111(str5, "startAssitActivity activity");
                                            AbstractC6168.m17771(activity, intent);
                                            C21587.m49113(str5, "startActionActivity() -- end, found activity for loginIntent");
                                            C17111 c17111M40275 = C17111.m40275();
                                            SystemClock.elapsedRealtime();
                                            c17111M40275.getClass();
                                            objArr[0] = "0";
                                            objArr[1] = 1;
                                            C21587.m49113(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                            C17111 c17111M40276 = C17111.m40275();
                                            String strM33823 = c13878.m33823();
                                            String str18 = (String) objArr[0];
                                            c17111M40276.getClass();
                                            C17111.m40277(strM33823, str14, str16, str18);
                                            return ((Integer) objArr[1]).intValue();
                                        }
                                    }
                                    bArr = bArrDigest;
                                    try {
                                        if (bArr == null) {
                                            String str19 = str8;
                                            C21587.m49116(str19, "getEncryptPkgName shaBytes==null !!!!!!");
                                            r6 = str19;
                                            strM45529 = "";
                                            r5 = r6;
                                        } else {
                                            r5 = str8;
                                            byte[] bArr2 = new byte[8];
                                            System.arraycopy(bArr, 5, bArr2, 0, 8);
                                            byte[] bArr3 = new byte[16];
                                            System.arraycopy(bArr, 8, bArr3, 0, 16);
                                            strM45529 = C19766.m45529(activity.getPackageName(), bArr2, C19766.m45530(bArr3));
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        C21587.m49112(r4, "getEncryptPkgName", e);
                                        r6 = r4;
                                    }
                                    bundleM17773.putString("ppsts", strM45529);
                                    try {
                                        this.f28267 = new C9403(this, this.f28267);
                                        C21084.m48147().m48151(this.f28267);
                                        C21587.m49111(str5, "startAssitActivity activity");
                                        AbstractC6168.m17771(activity, intent);
                                        C21587.m49113(str5, "startActionActivity() -- end, found activity for loginIntent");
                                        C17111 c17111M40277 = C17111.m40275();
                                        SystemClock.elapsedRealtime();
                                        c17111M40277.getClass();
                                        objArr[0] = "0";
                                        objArr[1] = 1;
                                        C21587.m49113(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                        C17111 c17111M40278 = C17111.m40275();
                                        String strM33824 = c13878.m33823();
                                        String str110 = (String) objArr[0];
                                        c17111M40278.getClass();
                                        C17111.m40277(strM33824, str14, str16, str110);
                                        return ((Integer) objArr[1]).intValue();
                                    } catch (Exception e4) {
                                        C21587.m49112(str5, "startActionActivity() exception", e4);
                                        r3 = r5;
                                    }
                                } else {
                                    str4 = str10;
                                    str5 = str13;
                                    str14 = str14;
                                    r3 = str8;
                                    str2 = str9;
                                }
                                C17111 c17111M40279 = C17111.m40275();
                                SystemClock.elapsedRealtime();
                                c17111M40279.getClass();
                                C21587.m49113(str5, "startActionActivity() -- end, no target activity for loginIntent");
                                r2 = r3;
                                C17111 c17111M402710 = C17111.m40275();
                                String strM33825 = c13878.m33823();
                                c17111M402710.getClass();
                                C17111.m40277(strM33825, str14, str16, "1");
                                C21587.m49114(str5, "doLogin startActivity fail show dialog.");
                                str6 = this.f28266;
                                if (str6 != null) {
                                    this.f28267 = new C9403(this, this.f28267);
                                } else {
                                    this.f28267 = new C9403(this, this.f28267);
                                }
                                c2692 = this.f28267;
                                CookieSyncManager.createInstance(C5596.m16575());
                                bundleM17772 = m17772();
                                bundleM17772.putString("scope", this.f28266);
                                bundleM17772.putString(str17, str14);
                                if (AbstractC6168.f21018) {
                                    bundleM17772.putString(str15, str4 + AbstractC6168.f21015 + str3 + AbstractC6168.f21016 + str2 + AbstractC6168.f21017);
                                } else {
                                    bundleM17772.putString(str15, str);
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(System.currentTimeMillis() / 1000);
                                String strM47032 = "";
                                sb3.append(strM47032);
                                String string9 = sb3.toString();
                                Context contextM16575 = C5596.m16575();
                                int i = C17528.f56975;
                                C21587.m49118(r2, "OpenUi, getSignValidString");
                                String packageName = contextM16575.getPackageName();
                                Signature[] signatureArr = contextM16575.getPackageManager().getPackageInfo(packageName, 64).signatures;
                                MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                                messageDigest2.update(signatureArr[0].toByteArray());
                                String strM47033 = C20512.m47032(messageDigest2.digest());
                                messageDigest2.reset();
                                C21587.m49118(r2, "-->sign: " + strM47033);
                                messageDigest2.update(C20512.m47040(packageName + "_" + strM47033 + "_" + string9 + strM47032));
                                strM47032 = C20512.m47032(messageDigest2.digest());
                                messageDigest2.reset();
                                StringBuilder sb4 = new StringBuilder("-->signEncryped: ");
                                sb4.append(strM47032);
                                C21587.m49118(r2, sb4.toString());
                                bundleM17772.putString("sign", strM47032);
                                bundleM17772.putString("time", string9);
                                bundleM17772.putString("display", "mobile");
                                str7 = this.f28266;
                                if (str7 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                bundleM17772.putString("response_type", "token");
                                bundleM17772.putString("redirect_uri", "auth://tauth.qq.com/");
                                bundleM17772.putString("cancel_display", "1");
                                bundleM17772.putString("switch", "1");
                                bundleM17772.putString("compat_v", "1");
                                C21587.m49113(str5, "OpenUI, showDialog addLoginAccount: ");
                                bundleM17772.putString("show_download_ui", Boolean.toString(true));
                                C21587.m49113(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
                                String str20 = C16782.m39621().m39622(C5596.m16575(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C14127.m34338(bundleM17772);
                                if (!z) {
                                    c2692 = new C2692(this, C5596.m16575(), c2692);
                                }
                                C21587.m49111(str5, "OpenUi, showDialog TDialog");
                                C3358.m11058(new RunnableC0455(this, str20, c2692));
                                C21587.m49113(str5, "OpenUi, showDialog -- end");
                                return 2;
                            }
                            intent = null;
                            if (intent != null) {
                                bundleM17773 = m17772();
                                bundleM17773.putString("scope", this.f28266);
                                str14 = str14;
                                bundleM17773.putString("client_id", str14);
                                if (AbstractC6168.f21018) {
                                    str12 = str10;
                                    StringBuilder sb5 = new StringBuilder(str12);
                                    sb5.append(AbstractC6168.f21015);
                                    sb5.append(str3);
                                    sb5.append(AbstractC6168.f21016);
                                    str11 = str9;
                                    sb5.append(str11);
                                    sb5.append(AbstractC6168.f21017);
                                    bundleM17773.putString("pf", sb5.toString());
                                } else {
                                    str11 = str9;
                                    str12 = str10;
                                    bundleM17773.putString("pf", str);
                                }
                                bundleM17773.putString("need_pay", "1");
                                bundleM17773.putString("oauth_app_name", C17528.m41148(C5596.m16575()));
                                intent.putExtra("key_action", "action_login");
                                intent.putExtra("key_params", bundleM17773);
                                intent.putExtra(c.d, str14);
                                string = bundleM17773.getString("status_os");
                                string2 = bundleM17773.getString("status_machine");
                                string3 = bundleM17773.getString("status_version");
                                string4 = bundleM17773.getString("sdkv");
                                str2 = str11;
                                string5 = bundleM17773.getString("client_id");
                                string6 = bundleM17773.getString("need_pay");
                                string7 = bundleM17773.getString("pf");
                                str4 = str12;
                                StringBuilder sbM10407 = C3188.m10406("os=", string, ", machine=", string2, ", version=");
                                C4794.m14774(sbM10407, string3, ", sdkv=", string4, ", appId=");
                                C4794.m14774(sbM10407, string5, ", needPay=", string6, ", pf=");
                                sbM10407.append(string7);
                                str5 = str13;
                                C21587.m49111(str5, sbM10407.toString());
                                StringBuilder sb6 = new StringBuilder();
                                if (string == null) {
                                    string = "";
                                }
                                sb6.append(string);
                                if (string2 == null) {
                                    string2 = "";
                                }
                                sb6.append(string2);
                                if (string3 == null) {
                                    string3 = "";
                                }
                                sb6.append(string3);
                                if (string4 == null) {
                                    string4 = "";
                                }
                                sb6.append(string4);
                                if (string5 == null) {
                                    string5 = "";
                                }
                                sb6.append(string5);
                                if (string6 == null) {
                                    string6 = "";
                                }
                                sb6.append(string6);
                                if (string7 == null) {
                                    string7 = "";
                                }
                                sb6.append(string7);
                                String string10 = sb6.toString();
                                MessageDigest messageDigest3 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                                messageDigest3.update(string10.getBytes());
                                bArrDigest = messageDigest3.digest();
                                r4 = messageDigest3;
                                bArr = bArrDigest;
                                if (bArr == null) {
                                    String str111 = str8;
                                    C21587.m49116(str111, "getEncryptPkgName shaBytes==null !!!!!!");
                                    r6 = str111;
                                    strM45529 = "";
                                    r5 = r6;
                                } else {
                                    r5 = str8;
                                    byte[] bArr4 = new byte[8];
                                    System.arraycopy(bArr, 5, bArr4, 0, 8);
                                    byte[] bArr5 = new byte[16];
                                    System.arraycopy(bArr, 8, bArr5, 0, 16);
                                    strM45529 = C19766.m45529(activity.getPackageName(), bArr4, C19766.m45530(bArr5));
                                }
                                bundleM17773.putString("ppsts", strM45529);
                                this.f28267 = new C9403(this, this.f28267);
                                C21084.m48147().m48151(this.f28267);
                                C21587.m49111(str5, "startAssitActivity activity");
                                AbstractC6168.m17771(activity, intent);
                                C21587.m49113(str5, "startActionActivity() -- end, found activity for loginIntent");
                                C17111 c17111M402711 = C17111.m40275();
                                SystemClock.elapsedRealtime();
                                c17111M402711.getClass();
                                objArr[0] = "0";
                                objArr[1] = 1;
                                C21587.m49113(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                C17111 c17111M402712 = C17111.m40275();
                                String strM33826 = c13878.m33823();
                                String str112 = (String) objArr[0];
                                c17111M402712.getClass();
                                C17111.m40277(strM33826, str14, str16, str112);
                                return ((Integer) objArr[1]).intValue();
                            }
                            str4 = str10;
                            str5 = str13;
                            str14 = str14;
                            r3 = str8;
                            str2 = str9;
                            C17111 c17111M402713 = C17111.m40275();
                            SystemClock.elapsedRealtime();
                            c17111M402713.getClass();
                            C21587.m49113(str5, "startActionActivity() -- end, no target activity for loginIntent");
                            r2 = r3;
                            C17111 c17111M402714 = C17111.m40275();
                            String strM33827 = c13878.m33823();
                            c17111M402714.getClass();
                            C17111.m40277(strM33827, str14, str16, "1");
                            C21587.m49114(str5, "doLogin startActivity fail show dialog.");
                            str6 = this.f28266;
                            if (str6 != null) {
                                this.f28267 = new C9403(this, this.f28267);
                            } else {
                                this.f28267 = new C9403(this, this.f28267);
                            }
                            c2692 = this.f28267;
                            CookieSyncManager.createInstance(C5596.m16575());
                            bundleM17772 = m17772();
                            bundleM17772.putString("scope", this.f28266);
                            bundleM17772.putString(str17, str14);
                            if (AbstractC6168.f21018) {
                                bundleM17772.putString(str15, str4 + AbstractC6168.f21015 + str3 + AbstractC6168.f21016 + str2 + AbstractC6168.f21017);
                            } else {
                                bundleM17772.putString(str15, str);
                            }
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(System.currentTimeMillis() / 1000);
                            String strM47034 = "";
                            sb7.append(strM47034);
                            String string11 = sb7.toString();
                            Context contextM16576 = C5596.m16575();
                            int i2 = C17528.f56975;
                            C21587.m49118(r2, "OpenUi, getSignValidString");
                            String packageName2 = contextM16576.getPackageName();
                            Signature[] signatureArr2 = contextM16576.getPackageManager().getPackageInfo(packageName2, 64).signatures;
                            MessageDigest messageDigest4 = MessageDigest.getInstance("MD5");
                            messageDigest4.update(signatureArr2[0].toByteArray());
                            String strM47035 = C20512.m47032(messageDigest4.digest());
                            messageDigest4.reset();
                            C21587.m49118(r2, "-->sign: " + strM47035);
                            messageDigest4.update(C20512.m47040(packageName2 + "_" + strM47035 + "_" + string11 + strM47034));
                            strM47034 = C20512.m47032(messageDigest4.digest());
                            messageDigest4.reset();
                            StringBuilder sb8 = new StringBuilder("-->signEncryped: ");
                            sb8.append(strM47034);
                            C21587.m49118(r2, sb8.toString());
                            bundleM17772.putString("sign", strM47034);
                            bundleM17772.putString("time", string11);
                            bundleM17772.putString("display", "mobile");
                            str7 = this.f28266;
                            if (str7 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            bundleM17772.putString("response_type", "token");
                            bundleM17772.putString("redirect_uri", "auth://tauth.qq.com/");
                            bundleM17772.putString("cancel_display", "1");
                            bundleM17772.putString("switch", "1");
                            bundleM17772.putString("compat_v", "1");
                            C21587.m49113(str5, "OpenUI, showDialog addLoginAccount: ");
                            bundleM17772.putString("show_download_ui", Boolean.toString(true));
                            C21587.m49113(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
                            String str21 = C16782.m39621().m39622(C5596.m16575(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C14127.m34338(bundleM17772);
                            if (!z) {
                                c2692 = new C2692(this, C5596.m16575(), c2692);
                            }
                            C21587.m49111(str5, "OpenUi, showDialog TDialog");
                            C3358.m11058(new RunnableC0455(this, str21, c2692));
                            C21587.m49113(str5, "OpenUi, showDialog -- end");
                            return 2;
                        }
                    } catch (Throwable unused4) {
                        str8 = "openSDK_LOG.SystemUtils";
                    }
                    if (dSqrt > 6.5d) {
                        intent3.setClassName("com.tencent.minihd.qq", "com.tencent.open.agent.AgentActivity");
                        if (C17528.m41152(C5596.m16575(), intent3)) {
                        }
                    }
                    intent = null;
                }
                intent = intent3;
            }
            if (intent != null) {
                bundleM17773 = m17772();
                bundleM17773.putString("scope", this.f28266);
                str14 = str14;
                bundleM17773.putString("client_id", str14);
                if (AbstractC6168.f21018) {
                    str12 = str10;
                    StringBuilder sb9 = new StringBuilder(str12);
                    sb9.append(AbstractC6168.f21015);
                    sb9.append(str3);
                    sb9.append(AbstractC6168.f21016);
                    str11 = str9;
                    sb9.append(str11);
                    sb9.append(AbstractC6168.f21017);
                    bundleM17773.putString("pf", sb9.toString());
                } else {
                    str11 = str9;
                    str12 = str10;
                    bundleM17773.putString("pf", str);
                }
                bundleM17773.putString("need_pay", "1");
                bundleM17773.putString("oauth_app_name", C17528.m41148(C5596.m16575()));
                intent.putExtra("key_action", "action_login");
                intent.putExtra("key_params", bundleM17773);
                intent.putExtra(c.d, str14);
                string = bundleM17773.getString("status_os");
                string2 = bundleM17773.getString("status_machine");
                string3 = bundleM17773.getString("status_version");
                string4 = bundleM17773.getString("sdkv");
                str2 = str11;
                string5 = bundleM17773.getString("client_id");
                string6 = bundleM17773.getString("need_pay");
                string7 = bundleM17773.getString("pf");
                str4 = str12;
                StringBuilder sbM10408 = C3188.m10406("os=", string, ", machine=", string2, ", version=");
                C4794.m14774(sbM10408, string3, ", sdkv=", string4, ", appId=");
                C4794.m14774(sbM10408, string5, ", needPay=", string6, ", pf=");
                sbM10408.append(string7);
                str5 = str13;
                C21587.m49111(str5, sbM10408.toString());
                StringBuilder sb10 = new StringBuilder();
                if (string == null) {
                    string = "";
                }
                sb10.append(string);
                if (string2 == null) {
                    string2 = "";
                }
                sb10.append(string2);
                if (string3 == null) {
                    string3 = "";
                }
                sb10.append(string3);
                if (string4 == null) {
                    string4 = "";
                }
                sb10.append(string4);
                if (string5 == null) {
                    string5 = "";
                }
                sb10.append(string5);
                if (string6 == null) {
                    string6 = "";
                }
                sb10.append(string6);
                if (string7 == null) {
                    string7 = "";
                }
                sb10.append(string7);
                String string12 = sb10.toString();
                MessageDigest messageDigest5 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                messageDigest5.update(string12.getBytes());
                bArrDigest = messageDigest5.digest();
                r4 = messageDigest5;
                bArr = bArrDigest;
                if (bArr == null) {
                    String str113 = str8;
                    C21587.m49116(str113, "getEncryptPkgName shaBytes==null !!!!!!");
                    r6 = str113;
                    strM45529 = "";
                    r5 = r6;
                } else {
                    r5 = str8;
                    byte[] bArr6 = new byte[8];
                    System.arraycopy(bArr, 5, bArr6, 0, 8);
                    byte[] bArr7 = new byte[16];
                    System.arraycopy(bArr, 8, bArr7, 0, 16);
                    strM45529 = C19766.m45529(activity.getPackageName(), bArr6, C19766.m45530(bArr7));
                }
                bundleM17773.putString("ppsts", strM45529);
                this.f28267 = new C9403(this, this.f28267);
                C21084.m48147().m48151(this.f28267);
                C21587.m49111(str5, "startAssitActivity activity");
                AbstractC6168.m17771(activity, intent);
                C21587.m49113(str5, "startActionActivity() -- end, found activity for loginIntent");
                C17111 c17111M402715 = C17111.m40275();
                SystemClock.elapsedRealtime();
                c17111M402715.getClass();
                objArr[0] = "0";
                objArr[1] = 1;
                C21587.m49113(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                C17111 c17111M402716 = C17111.m40275();
                String strM33828 = c13878.m33823();
                String str114 = (String) objArr[0];
                c17111M402716.getClass();
                C17111.m40277(strM33828, str14, str16, str114);
                return ((Integer) objArr[1]).intValue();
            }
            str4 = str10;
            str5 = str13;
            str14 = str14;
            r3 = str8;
            str2 = str9;
            C17111 c17111M402717 = C17111.m40275();
            SystemClock.elapsedRealtime();
            c17111M402717.getClass();
            C21587.m49113(str5, "startActionActivity() -- end, no target activity for loginIntent");
            r2 = r3;
        }
        C17111 c17111M402718 = C17111.m40275();
        String strM33829 = c13878.m33823();
        c17111M402718.getClass();
        C17111.m40277(strM33829, str14, str16, "1");
        C21587.m49114(str5, "doLogin startActivity fail show dialog.");
        str6 = this.f28266;
        if (str6 != null || !str6.contains("server_side")) {
            this.f28267 = new C9403(this, this.f28267);
        }
        c2692 = this.f28267;
        CookieSyncManager.createInstance(C5596.m16575());
        bundleM17772 = m17772();
        bundleM17772.putString("scope", this.f28266);
        bundleM17772.putString(str17, str14);
        if (AbstractC6168.f21018) {
            bundleM17772.putString(str15, str4 + AbstractC6168.f21015 + str3 + AbstractC6168.f21016 + str2 + AbstractC6168.f21017);
        } else {
            bundleM17772.putString(str15, str);
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(System.currentTimeMillis() / 1000);
        String strM47036 = "";
        sb11.append(strM47036);
        String string13 = sb11.toString();
        Context contextM16577 = C5596.m16575();
        int i3 = C17528.f56975;
        C21587.m49118(r2, "OpenUi, getSignValidString");
        try {
            String packageName3 = contextM16577.getPackageName();
            Signature[] signatureArr3 = contextM16577.getPackageManager().getPackageInfo(packageName3, 64).signatures;
            MessageDigest messageDigest6 = MessageDigest.getInstance("MD5");
            messageDigest6.update(signatureArr3[0].toByteArray());
            String strM47037 = C20512.m47032(messageDigest6.digest());
            messageDigest6.reset();
            C21587.m49118(r2, "-->sign: " + strM47037);
            messageDigest6.update(C20512.m47040(packageName3 + "_" + strM47037 + "_" + string13 + strM47036));
            strM47036 = C20512.m47032(messageDigest6.digest());
            messageDigest6.reset();
            StringBuilder sb12 = new StringBuilder("-->signEncryped: ");
            sb12.append(strM47036);
            C21587.m49118(r2, sb12.toString());
        } catch (Exception e5) {
            C21587.m49112(r2, "OpenUi, getSignValidString error", e5);
        }
        bundleM17772.putString("sign", strM47036);
        bundleM17772.putString("time", string13);
        bundleM17772.putString("display", "mobile");
        str7 = this.f28266;
        if (str7 == null && str7.contains("server_side")) {
            z = true;
        } else {
            z = false;
        }
        bundleM17772.putString("response_type", "token");
        bundleM17772.putString("redirect_uri", "auth://tauth.qq.com/");
        bundleM17772.putString("cancel_display", "1");
        bundleM17772.putString("switch", "1");
        bundleM17772.putString("compat_v", "1");
        C21587.m49113(str5, "OpenUI, showDialog addLoginAccount: ");
        bundleM17772.putString("show_download_ui", Boolean.toString(true));
        C21587.m49113(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
        String str22 = C16782.m39621().m39622(C5596.m16575(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C14127.m34338(bundleM17772);
        if (!z) {
            c2692 = new C2692(this, C5596.m16575(), c2692);
        }
        C21587.m49111(str5, "OpenUi, showDialog TDialog");
        C3358.m11058(new RunnableC0455(this, str22, c2692));
        C21587.m49113(str5, "OpenUi, showDialog -- end");
        return 2;
    }

    static {
        f28264 = C14483.m34972("libwbsafeedit", ".so");
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            f28263 = "libwbsafeedit";
            f28264 = C14483.m34972("libwbsafeedit", ".so");
            C21587.m49113("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase("arm64-v8a")) {
            f28263 = "libwbsafeedit_64";
            f28264 = C14483.m34972("libwbsafeedit_64", ".so");
            C21587.m49113("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        } else if (str.equalsIgnoreCase("x86")) {
            f28263 = "libwbsafeedit_x86";
            f28264 = C14483.m34972("libwbsafeedit_x86", ".so");
            C21587.m49113("openSDK_LOG.AuthAgent", "is x86 architecture");
        } else if (str.equalsIgnoreCase("x86_64")) {
            f28263 = "libwbsafeedit_x86_64";
            f28264 = C14483.m34972("libwbsafeedit_x86_64", ".so");
            C21587.m49113("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        } else {
            f28263 = "libwbsafeedit";
            f28264 = C14483.m34972("libwbsafeedit", ".so");
            C21587.m49113("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23309() {
        this.f28267 = null;
    }
}
