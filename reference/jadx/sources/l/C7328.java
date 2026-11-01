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
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.۟۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7328 extends AbstractC1371 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static String f24361 = "libwbsafeedit";

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String f24362;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f24363;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public WeakReference f24364;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC18284 f24365;

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
    public final int m19595(Activity activity, InterfaceC18284 interfaceC18284) {
        C15796 c15796;
        ?? r2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        InterfaceC18284 c10151;
        Bundle bundleM4819;
        String str7;
        boolean z;
        String str8;
        String str9;
        String str10;
        Intent intent;
        ?? r3;
        Bundle bundleM48110;
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
        String strM40648;
        ?? r6;
        byte[] bArr;
        double dSqrt;
        String str13 = "openSDK_LOG.AuthAgent";
        if (C18990.m43694()) {
            C23099.m51113("openSDK_LOG.AuthAgent", "permission not granted");
            interfaceC18284.mo16214(new C8407(-6, "用户未授权，暂时无法使用QQ登录及分享等功能", "用户未授权，暂时无法使用QQ登录及分享等功能"));
            return -1;
        }
        this.f24363 = "get_simple_userinfo";
        this.f24364 = new WeakReference(activity);
        this.f24365 = interfaceC18284;
        Object[] objArr = new Object[2];
        Intent intent2 = activity.getIntent();
        boolean z2 = intent2 != null && intent2.getBooleanExtra("KEY_FORCE_QR_LOGIN", false);
        String str14 = "101492915";
        boolean zM6274 = C1931.m6267(activity, "101492915").m6274("C_LoginWeb");
        C23099.m51113("openSDK_LOG.AuthAgent", "doLogin needForceQrLogin=" + z2 + ", toWebLogin=" + zM6274);
        String str15 = "pf";
        String str16 = "5";
        String str17 = "client_id";
        C15796 c15797 = this.f5744;
        if (z2 || zM6274) {
            c15796 = c15797;
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
            C23099.m51113("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
            Intent intent3 = new Intent();
            c15796 = c15797;
            intent3.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
            byte[] bArrDigest = null;
            if (C3342.m9951(C1791.m5862(), intent3)) {
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
                if (C3342.m9951(C1791.m5862(), intent3)) {
                    str13 = "openSDK_LOG.AuthAgent";
                    str14 = "101492915";
                    str8 = "openSDK_LOG.SystemUtils";
                    str = "openmobile_android";
                    str9 = "-";
                    str3 = "-android-";
                    str10 = "desktop_m_qq-";
                } else {
                    try {
                        DisplayMetrics displayMetrics = C1791.m5862().getResources().getDisplayMetrics();
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
                                if (C3342.m9951(C1791.m5862(), intent3)) {
                                    intent = intent3;
                                }
                                if (intent != null) {
                                    bundleM48110 = m4819();
                                    bundleM48110.putString("scope", this.f24363);
                                    str14 = str14;
                                    bundleM48110.putString("client_id", str14);
                                    if (AbstractC1371.f5740) {
                                        str12 = str10;
                                        StringBuilder sb = new StringBuilder(str12);
                                        sb.append(AbstractC1371.f5742);
                                        sb.append(str3);
                                        sb.append(AbstractC1371.f5741);
                                        str11 = str9;
                                        sb.append(str11);
                                        sb.append(AbstractC1371.f5743);
                                        bundleM48110.putString("pf", sb.toString());
                                    } else {
                                        str11 = str9;
                                        str12 = str10;
                                        bundleM48110.putString("pf", str);
                                    }
                                    bundleM48110.putString("need_pay", "1");
                                    bundleM48110.putString("oauth_app_name", C3342.m9947(C1791.m5862()));
                                    intent.putExtra("key_action", "action_login");
                                    intent.putExtra("key_params", bundleM48110);
                                    intent.putExtra(c.d, str14);
                                    string = bundleM48110.getString("status_os");
                                    string2 = bundleM48110.getString("status_machine");
                                    string3 = bundleM48110.getString("status_version");
                                    string4 = bundleM48110.getString("sdkv");
                                    str2 = str11;
                                    string5 = bundleM48110.getString("client_id");
                                    string6 = bundleM48110.getString("need_pay");
                                    string7 = bundleM48110.getString("pf");
                                    str4 = str12;
                                    StringBuilder sbM30515 = C12278.m30515("os=", string, ", machine=", string2, ", version=");
                                    ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30515, string3, ", sdkv=", string4, ", appId=");
                                    ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30515, string5, ", needPay=", string6, ", pf=");
                                    sbM30515.append(string7);
                                    str5 = str13;
                                    C23099.m51110(str5, sbM30515.toString());
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
                                            C23099.m51111("DESUtils", "encryptSha", e);
                                            r4 = "DESUtils";
                                        } catch (Exception e2) {
                                            e = e2;
                                            r4 = str8;
                                            C23099.m51111(r4, "getEncryptPkgName", e);
                                            r6 = r4;
                                            strM40648 = "";
                                            r5 = r6;
                                            bundleM48110.putString("ppsts", strM40648);
                                            this.f24365 = new C8740(this, this.f24365);
                                            C23245.m51287().m51291(this.f24365);
                                            C23099.m51110(str5, "startAssitActivity activity");
                                            AbstractC1371.m4818(activity, intent);
                                            C23099.m51113(str5, "startActionActivity() -- end, found activity for loginIntent");
                                            C3487 c3487M10219 = C3487.m10219();
                                            SystemClock.elapsedRealtime();
                                            c3487M10219.getClass();
                                            objArr[0] = "0";
                                            objArr[1] = 1;
                                            C23099.m51113(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                            C3487 c3487M102110 = C3487.m10219();
                                            String strM37570 = c15796.m37570();
                                            String str18 = (String) objArr[0];
                                            c3487M102110.getClass();
                                            C3487.m10221(strM37570, str14, str16, str18);
                                            return ((Integer) objArr[1]).intValue();
                                        }
                                    }
                                    bArr = bArrDigest;
                                    try {
                                        if (bArr == null) {
                                            String str19 = str8;
                                            C23099.m51115(str19, "getEncryptPkgName shaBytes==null !!!!!!");
                                            r6 = str19;
                                            strM40648 = "";
                                            r5 = r6;
                                        } else {
                                            r5 = str8;
                                            byte[] bArr2 = new byte[8];
                                            System.arraycopy(bArr, 5, bArr2, 0, 8);
                                            byte[] bArr3 = new byte[16];
                                            System.arraycopy(bArr, 8, bArr3, 0, 16);
                                            strM40648 = C17454.m40648(activity.getPackageName(), bArr2, C17454.m40649(bArr3));
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        C23099.m51111(r4, "getEncryptPkgName", e);
                                        r6 = r4;
                                    }
                                    bundleM48110.putString("ppsts", strM40648);
                                    try {
                                        this.f24365 = new C8740(this, this.f24365);
                                        C23245.m51287().m51291(this.f24365);
                                        C23099.m51110(str5, "startAssitActivity activity");
                                        AbstractC1371.m4818(activity, intent);
                                        C23099.m51113(str5, "startActionActivity() -- end, found activity for loginIntent");
                                        C3487 c3487M102111 = C3487.m10219();
                                        SystemClock.elapsedRealtime();
                                        c3487M102111.getClass();
                                        objArr[0] = "0";
                                        objArr[1] = 1;
                                        C23099.m51113(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                        C3487 c3487M102112 = C3487.m10219();
                                        String strM37571 = c15796.m37570();
                                        String str110 = (String) objArr[0];
                                        c3487M102112.getClass();
                                        C3487.m10221(strM37571, str14, str16, str110);
                                        return ((Integer) objArr[1]).intValue();
                                    } catch (Exception e4) {
                                        C23099.m51111(str5, "startActionActivity() exception", e4);
                                        r3 = r5;
                                    }
                                } else {
                                    str4 = str10;
                                    str5 = str13;
                                    str14 = str14;
                                    r3 = str8;
                                    str2 = str9;
                                }
                                C3487 c3487M102113 = C3487.m10219();
                                SystemClock.elapsedRealtime();
                                c3487M102113.getClass();
                                C23099.m51113(str5, "startActionActivity() -- end, no target activity for loginIntent");
                                r2 = r3;
                                C3487 c3487M102114 = C3487.m10219();
                                String strM37572 = c15796.m37570();
                                c3487M102114.getClass();
                                C3487.m10221(strM37572, str14, str16, "1");
                                C23099.m51112(str5, "doLogin startActivity fail show dialog.");
                                str6 = this.f24363;
                                if (str6 != null) {
                                    this.f24365 = new C8740(this, this.f24365);
                                } else {
                                    this.f24365 = new C8740(this, this.f24365);
                                }
                                c10151 = this.f24365;
                                CookieSyncManager.createInstance(C1791.m5862());
                                bundleM4819 = m4819();
                                bundleM4819.putString("scope", this.f24363);
                                bundleM4819.putString(str17, str14);
                                if (AbstractC1371.f5740) {
                                    bundleM4819.putString(str15, str4 + AbstractC1371.f5742 + str3 + AbstractC1371.f5741 + str2 + AbstractC1371.f5743);
                                } else {
                                    bundleM4819.putString(str15, str);
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(System.currentTimeMillis() / 1000);
                                String strM8426 = "";
                                sb3.append(strM8426);
                                String string9 = sb3.toString();
                                Context contextM5862 = C1791.m5862();
                                int i = C3342.f12366;
                                C23099.m51107(r2, "OpenUi, getSignValidString");
                                String packageName = contextM5862.getPackageName();
                                Signature[] signatureArr = contextM5862.getPackageManager().getPackageInfo(packageName, 64).signatures;
                                MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                                messageDigest2.update(signatureArr[0].toByteArray());
                                String strM8427 = C2761.m8426(messageDigest2.digest());
                                messageDigest2.reset();
                                C23099.m51107(r2, "-->sign: " + strM8427);
                                messageDigest2.update(C2761.m8431(packageName + "_" + strM8427 + "_" + string9 + strM8426));
                                strM8426 = C2761.m8426(messageDigest2.digest());
                                messageDigest2.reset();
                                StringBuilder sb4 = new StringBuilder("-->signEncryped: ");
                                sb4.append(strM8426);
                                C23099.m51107(r2, sb4.toString());
                                bundleM4819.putString("sign", strM8426);
                                bundleM4819.putString("time", string9);
                                bundleM4819.putString("display", "mobile");
                                str7 = this.f24363;
                                if (str7 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                bundleM4819.putString("response_type", "token");
                                bundleM4819.putString("redirect_uri", "auth://tauth.qq.com/");
                                bundleM4819.putString("cancel_display", "1");
                                bundleM4819.putString("switch", "1");
                                bundleM4819.putString("compat_v", "1");
                                C23099.m51113(str5, "OpenUI, showDialog addLoginAccount: ");
                                bundleM4819.putString("show_download_ui", Boolean.toString(true));
                                C23099.m51113(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
                                String str20 = C9694.m24660().m24661(C1791.m5862(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C16044.m38038(bundleM4819);
                                if (!z) {
                                    c10151 = new C10151(this, C1791.m5862(), c10151);
                                }
                                C23099.m51110(str5, "OpenUi, showDialog TDialog");
                                C11935.m29731(new RunnableC21439(this, str20, c10151));
                                C23099.m51113(str5, "OpenUi, showDialog -- end");
                                return 2;
                            }
                            intent = null;
                            if (intent != null) {
                                bundleM48110 = m4819();
                                bundleM48110.putString("scope", this.f24363);
                                str14 = str14;
                                bundleM48110.putString("client_id", str14);
                                if (AbstractC1371.f5740) {
                                    str12 = str10;
                                    StringBuilder sb5 = new StringBuilder(str12);
                                    sb5.append(AbstractC1371.f5742);
                                    sb5.append(str3);
                                    sb5.append(AbstractC1371.f5741);
                                    str11 = str9;
                                    sb5.append(str11);
                                    sb5.append(AbstractC1371.f5743);
                                    bundleM48110.putString("pf", sb5.toString());
                                } else {
                                    str11 = str9;
                                    str12 = str10;
                                    bundleM48110.putString("pf", str);
                                }
                                bundleM48110.putString("need_pay", "1");
                                bundleM48110.putString("oauth_app_name", C3342.m9947(C1791.m5862()));
                                intent.putExtra("key_action", "action_login");
                                intent.putExtra("key_params", bundleM48110);
                                intent.putExtra(c.d, str14);
                                string = bundleM48110.getString("status_os");
                                string2 = bundleM48110.getString("status_machine");
                                string3 = bundleM48110.getString("status_version");
                                string4 = bundleM48110.getString("sdkv");
                                str2 = str11;
                                string5 = bundleM48110.getString("client_id");
                                string6 = bundleM48110.getString("need_pay");
                                string7 = bundleM48110.getString("pf");
                                str4 = str12;
                                StringBuilder sbM30516 = C12278.m30515("os=", string, ", machine=", string2, ", version=");
                                ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30516, string3, ", sdkv=", string4, ", appId=");
                                ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30516, string5, ", needPay=", string6, ", pf=");
                                sbM30516.append(string7);
                                str5 = str13;
                                C23099.m51110(str5, sbM30516.toString());
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
                                    C23099.m51115(str111, "getEncryptPkgName shaBytes==null !!!!!!");
                                    r6 = str111;
                                    strM40648 = "";
                                    r5 = r6;
                                } else {
                                    r5 = str8;
                                    byte[] bArr4 = new byte[8];
                                    System.arraycopy(bArr, 5, bArr4, 0, 8);
                                    byte[] bArr5 = new byte[16];
                                    System.arraycopy(bArr, 8, bArr5, 0, 16);
                                    strM40648 = C17454.m40648(activity.getPackageName(), bArr4, C17454.m40649(bArr5));
                                }
                                bundleM48110.putString("ppsts", strM40648);
                                this.f24365 = new C8740(this, this.f24365);
                                C23245.m51287().m51291(this.f24365);
                                C23099.m51110(str5, "startAssitActivity activity");
                                AbstractC1371.m4818(activity, intent);
                                C23099.m51113(str5, "startActionActivity() -- end, found activity for loginIntent");
                                C3487 c3487M102115 = C3487.m10219();
                                SystemClock.elapsedRealtime();
                                c3487M102115.getClass();
                                objArr[0] = "0";
                                objArr[1] = 1;
                                C23099.m51113(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                C3487 c3487M102116 = C3487.m10219();
                                String strM37573 = c15796.m37570();
                                String str112 = (String) objArr[0];
                                c3487M102116.getClass();
                                C3487.m10221(strM37573, str14, str16, str112);
                                return ((Integer) objArr[1]).intValue();
                            }
                            str4 = str10;
                            str5 = str13;
                            str14 = str14;
                            r3 = str8;
                            str2 = str9;
                            C3487 c3487M102117 = C3487.m10219();
                            SystemClock.elapsedRealtime();
                            c3487M102117.getClass();
                            C23099.m51113(str5, "startActionActivity() -- end, no target activity for loginIntent");
                            r2 = r3;
                            C3487 c3487M102118 = C3487.m10219();
                            String strM37574 = c15796.m37570();
                            c3487M102118.getClass();
                            C3487.m10221(strM37574, str14, str16, "1");
                            C23099.m51112(str5, "doLogin startActivity fail show dialog.");
                            str6 = this.f24363;
                            if (str6 != null) {
                                this.f24365 = new C8740(this, this.f24365);
                            } else {
                                this.f24365 = new C8740(this, this.f24365);
                            }
                            c10151 = this.f24365;
                            CookieSyncManager.createInstance(C1791.m5862());
                            bundleM4819 = m4819();
                            bundleM4819.putString("scope", this.f24363);
                            bundleM4819.putString(str17, str14);
                            if (AbstractC1371.f5740) {
                                bundleM4819.putString(str15, str4 + AbstractC1371.f5742 + str3 + AbstractC1371.f5741 + str2 + AbstractC1371.f5743);
                            } else {
                                bundleM4819.putString(str15, str);
                            }
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(System.currentTimeMillis() / 1000);
                            String strM8428 = "";
                            sb7.append(strM8428);
                            String string11 = sb7.toString();
                            Context contextM5863 = C1791.m5862();
                            int i2 = C3342.f12366;
                            C23099.m51107(r2, "OpenUi, getSignValidString");
                            String packageName2 = contextM5863.getPackageName();
                            Signature[] signatureArr2 = contextM5863.getPackageManager().getPackageInfo(packageName2, 64).signatures;
                            MessageDigest messageDigest4 = MessageDigest.getInstance("MD5");
                            messageDigest4.update(signatureArr2[0].toByteArray());
                            String strM8429 = C2761.m8426(messageDigest4.digest());
                            messageDigest4.reset();
                            C23099.m51107(r2, "-->sign: " + strM8429);
                            messageDigest4.update(C2761.m8431(packageName2 + "_" + strM8429 + "_" + string11 + strM8428));
                            strM8428 = C2761.m8426(messageDigest4.digest());
                            messageDigest4.reset();
                            StringBuilder sb8 = new StringBuilder("-->signEncryped: ");
                            sb8.append(strM8428);
                            C23099.m51107(r2, sb8.toString());
                            bundleM4819.putString("sign", strM8428);
                            bundleM4819.putString("time", string11);
                            bundleM4819.putString("display", "mobile");
                            str7 = this.f24363;
                            if (str7 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            bundleM4819.putString("response_type", "token");
                            bundleM4819.putString("redirect_uri", "auth://tauth.qq.com/");
                            bundleM4819.putString("cancel_display", "1");
                            bundleM4819.putString("switch", "1");
                            bundleM4819.putString("compat_v", "1");
                            C23099.m51113(str5, "OpenUI, showDialog addLoginAccount: ");
                            bundleM4819.putString("show_download_ui", Boolean.toString(true));
                            C23099.m51113(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
                            String str21 = C9694.m24660().m24661(C1791.m5862(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C16044.m38038(bundleM4819);
                            if (!z) {
                                c10151 = new C10151(this, C1791.m5862(), c10151);
                            }
                            C23099.m51110(str5, "OpenUi, showDialog TDialog");
                            C11935.m29731(new RunnableC21439(this, str21, c10151));
                            C23099.m51113(str5, "OpenUi, showDialog -- end");
                            return 2;
                        }
                    } catch (Throwable unused4) {
                        str8 = "openSDK_LOG.SystemUtils";
                    }
                    if (dSqrt > 6.5d) {
                        intent3.setClassName("com.tencent.minihd.qq", "com.tencent.open.agent.AgentActivity");
                        if (C3342.m9951(C1791.m5862(), intent3)) {
                        }
                    }
                    intent = null;
                }
                intent = intent3;
            }
            if (intent != null) {
                bundleM48110 = m4819();
                bundleM48110.putString("scope", this.f24363);
                str14 = str14;
                bundleM48110.putString("client_id", str14);
                if (AbstractC1371.f5740) {
                    str12 = str10;
                    StringBuilder sb9 = new StringBuilder(str12);
                    sb9.append(AbstractC1371.f5742);
                    sb9.append(str3);
                    sb9.append(AbstractC1371.f5741);
                    str11 = str9;
                    sb9.append(str11);
                    sb9.append(AbstractC1371.f5743);
                    bundleM48110.putString("pf", sb9.toString());
                } else {
                    str11 = str9;
                    str12 = str10;
                    bundleM48110.putString("pf", str);
                }
                bundleM48110.putString("need_pay", "1");
                bundleM48110.putString("oauth_app_name", C3342.m9947(C1791.m5862()));
                intent.putExtra("key_action", "action_login");
                intent.putExtra("key_params", bundleM48110);
                intent.putExtra(c.d, str14);
                string = bundleM48110.getString("status_os");
                string2 = bundleM48110.getString("status_machine");
                string3 = bundleM48110.getString("status_version");
                string4 = bundleM48110.getString("sdkv");
                str2 = str11;
                string5 = bundleM48110.getString("client_id");
                string6 = bundleM48110.getString("need_pay");
                string7 = bundleM48110.getString("pf");
                str4 = str12;
                StringBuilder sbM30517 = C12278.m30515("os=", string, ", machine=", string2, ", version=");
                ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30517, string3, ", sdkv=", string4, ", appId=");
                ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30517, string5, ", needPay=", string6, ", pf=");
                sbM30517.append(string7);
                str5 = str13;
                C23099.m51110(str5, sbM30517.toString());
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
                    C23099.m51115(str113, "getEncryptPkgName shaBytes==null !!!!!!");
                    r6 = str113;
                    strM40648 = "";
                    r5 = r6;
                } else {
                    r5 = str8;
                    byte[] bArr6 = new byte[8];
                    System.arraycopy(bArr, 5, bArr6, 0, 8);
                    byte[] bArr7 = new byte[16];
                    System.arraycopy(bArr, 8, bArr7, 0, 16);
                    strM40648 = C17454.m40648(activity.getPackageName(), bArr6, C17454.m40649(bArr7));
                }
                bundleM48110.putString("ppsts", strM40648);
                this.f24365 = new C8740(this, this.f24365);
                C23245.m51287().m51291(this.f24365);
                C23099.m51110(str5, "startAssitActivity activity");
                AbstractC1371.m4818(activity, intent);
                C23099.m51113(str5, "startActionActivity() -- end, found activity for loginIntent");
                C3487 c3487M102119 = C3487.m10219();
                SystemClock.elapsedRealtime();
                c3487M102119.getClass();
                objArr[0] = "0";
                objArr[1] = 1;
                C23099.m51113(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                C3487 c3487M1021110 = C3487.m10219();
                String strM37575 = c15796.m37570();
                String str114 = (String) objArr[0];
                c3487M1021110.getClass();
                C3487.m10221(strM37575, str14, str16, str114);
                return ((Integer) objArr[1]).intValue();
            }
            str4 = str10;
            str5 = str13;
            str14 = str14;
            r3 = str8;
            str2 = str9;
            C3487 c3487M1021111 = C3487.m10219();
            SystemClock.elapsedRealtime();
            c3487M1021111.getClass();
            C23099.m51113(str5, "startActionActivity() -- end, no target activity for loginIntent");
            r2 = r3;
        }
        C3487 c3487M1021112 = C3487.m10219();
        String strM37576 = c15796.m37570();
        c3487M1021112.getClass();
        C3487.m10221(strM37576, str14, str16, "1");
        C23099.m51112(str5, "doLogin startActivity fail show dialog.");
        str6 = this.f24363;
        if (str6 != null || !str6.contains("server_side")) {
            this.f24365 = new C8740(this, this.f24365);
        }
        c10151 = this.f24365;
        CookieSyncManager.createInstance(C1791.m5862());
        bundleM4819 = m4819();
        bundleM4819.putString("scope", this.f24363);
        bundleM4819.putString(str17, str14);
        if (AbstractC1371.f5740) {
            bundleM4819.putString(str15, str4 + AbstractC1371.f5742 + str3 + AbstractC1371.f5741 + str2 + AbstractC1371.f5743);
        } else {
            bundleM4819.putString(str15, str);
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(System.currentTimeMillis() / 1000);
        String strM84210 = "";
        sb11.append(strM84210);
        String string13 = sb11.toString();
        Context contextM5864 = C1791.m5862();
        int i3 = C3342.f12366;
        C23099.m51107(r2, "OpenUi, getSignValidString");
        try {
            String packageName3 = contextM5864.getPackageName();
            Signature[] signatureArr3 = contextM5864.getPackageManager().getPackageInfo(packageName3, 64).signatures;
            MessageDigest messageDigest6 = MessageDigest.getInstance("MD5");
            messageDigest6.update(signatureArr3[0].toByteArray());
            String strM84211 = C2761.m8426(messageDigest6.digest());
            messageDigest6.reset();
            C23099.m51107(r2, "-->sign: " + strM84211);
            messageDigest6.update(C2761.m8431(packageName3 + "_" + strM84211 + "_" + string13 + strM84210));
            strM84210 = C2761.m8426(messageDigest6.digest());
            messageDigest6.reset();
            StringBuilder sb12 = new StringBuilder("-->signEncryped: ");
            sb12.append(strM84210);
            C23099.m51107(r2, sb12.toString());
        } catch (Exception e5) {
            C23099.m51111(r2, "OpenUi, getSignValidString error", e5);
        }
        bundleM4819.putString("sign", strM84210);
        bundleM4819.putString("time", string13);
        bundleM4819.putString("display", "mobile");
        str7 = this.f24363;
        if (str7 == null && str7.contains("server_side")) {
            z = true;
        } else {
            z = false;
        }
        bundleM4819.putString("response_type", "token");
        bundleM4819.putString("redirect_uri", "auth://tauth.qq.com/");
        bundleM4819.putString("cancel_display", "1");
        bundleM4819.putString("switch", "1");
        bundleM4819.putString("compat_v", "1");
        C23099.m51113(str5, "OpenUI, showDialog addLoginAccount: ");
        bundleM4819.putString("show_download_ui", Boolean.toString(true));
        C23099.m51113(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
        String str22 = C9694.m24660().m24661(C1791.m5862(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C16044.m38038(bundleM4819);
        if (!z) {
            c10151 = new C10151(this, C1791.m5862(), c10151);
        }
        C23099.m51110(str5, "OpenUi, showDialog TDialog");
        C11935.m29731(new RunnableC21439(this, str22, c10151));
        C23099.m51113(str5, "OpenUi, showDialog -- end");
        return 2;
    }

    static {
        f24362 = C15489.m37076("libwbsafeedit", ".so");
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            f24361 = "libwbsafeedit";
            f24362 = C15489.m37076("libwbsafeedit", ".so");
            C23099.m51113("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase("arm64-v8a")) {
            f24361 = "libwbsafeedit_64";
            f24362 = C15489.m37076("libwbsafeedit_64", ".so");
            C23099.m51113("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        } else if (str.equalsIgnoreCase("x86")) {
            f24361 = "libwbsafeedit_x86";
            f24362 = C15489.m37076("libwbsafeedit_x86", ".so");
            C23099.m51113("openSDK_LOG.AuthAgent", "is x86 architecture");
        } else if (str.equalsIgnoreCase("x86_64")) {
            f24361 = "libwbsafeedit_x86_64";
            f24362 = C15489.m37076("libwbsafeedit_x86_64", ".so");
            C23099.m51113("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        } else {
            f24361 = "libwbsafeedit";
            f24362 = C15489.m37076("libwbsafeedit", ".so");
            C23099.m51113("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19596() {
        this.f24365 = null;
    }
}
