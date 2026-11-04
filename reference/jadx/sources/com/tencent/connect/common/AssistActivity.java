package com.tencent.connect.common;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.alipay.sdk.app.AlipayApi;
import com.alipay.sdk.m.u0.c;
import com.alipay.sdk.m.y.o;
import l.C1121;
import l.C12133;
import l.C1402;
import l.C15862;
import l.C17111;
import l.C17354;
import l.C20512;
import l.C21084;
import l.C21587;
import l.C22004;
import l.C24068;
import l.C3687;
import l.HandlerC23322;
import l.InterfaceC19020;
import l.RunnableC20338;
import l.ViewOnTouchListenerC3184;
import org.json.JSONObject;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class AssistActivity extends Activity {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f879;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f880;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12133 f883;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f882 = "openSDK_LOG.AssistActivity_" + hashCode();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f877 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f881 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17354 f878 = new C17354(0);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Handler f884 = new HandlerC23322(this, Looper.getMainLooper());

    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0222  */
    /* JADX WARN: Code duplicated, block: B:90:0x022c  */
    /* JADX WARN: Code duplicated, block: B:92:0x025f  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        InterfaceC19020 interfaceC19020M48150;
        getWindow().addFlags(67108864);
        boolean z = true;
        requestWindowFeature(1);
        C22004.m49740(this);
        super.onCreate(bundle);
        String str5 = null;
        this.f878.m40750(0);
        boolean zM37820 = C15862.m37820(this);
        String str6 = this.f882;
        if (zM37820) {
            C21587.m49116(str6, "--onCreate-- callPack: " + getCallingPackage());
            finish();
            return;
        }
        this.f880 = getIntent().getBooleanExtra(C24068.f77821, false);
        C21587.m49113(str6, "--onCreate-- mRestoreLandscape=" + this.f880);
        if (getIntent() == null) {
            C21587.m49116(str6, "-->onCreate--getIntent() returns null");
            finish();
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("openSDK_LOG.AssistActivity.ExtraIntent");
        int intExtra = intent == null ? 0 : intent.getIntExtra("key_request_code", 0);
        str5 = "";
        this.f879 = intent == null ? "" : intent.getStringExtra(c.d);
        Bundle bundleExtra = getIntent().getBundleExtra("h5_share_data");
        if (bundle != null) {
            this.f877 = bundle.getBoolean("RESTART_FLAG");
            this.f881 = bundle.getBoolean("RESUME_FLAG", false);
        }
        if (this.f877) {
            C21587.m49111(str6, "is restart");
        } else if (bundleExtra == null) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("key_extra_pending_intent");
            if (intent != null && pendingIntent != null) {
                C21587.m49113(str6, "--onCreate--activityIntent not null, will start activity, reqcode = " + intExtra);
                try {
                    Uri data = intent.getData();
                    if (data != null) {
                        IntentFilter intentFilter = new IntentFilter("com.tencent.tauth.opensdk.SHARE_SUCCESS_AND_STAY_QQ_" + data.getQueryParameter("share_id"));
                        if (this.f883 == null) {
                            this.f883 = new C12133(this);
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            registerReceiver(this.f883, intentFilter, 2);
                        } else {
                            registerReceiver(this.f883, intentFilter);
                        }
                    }
                } catch (Exception e) {
                    C21587.m49112(str6, "registerReceiver exception: ", e);
                }
                try {
                    try {
                        try {
                            IntentSender intentSender = pendingIntent.getIntentSender();
                            try {
                                if (intent.getBooleanExtra("for_result", true)) {
                                    startIntentSenderForResult(intentSender, intExtra, null, 0, 0, 0);
                                } else {
                                    startIntentSender(intentSender, null, 0, 0, 0);
                                }
                                m913(intent, true);
                            } catch (ActivityNotFoundException e2) {
                                e = e2;
                                C21587.m49116(str6, "--onCreate--startActivity exception, ActivityNotFoundException : " + e);
                                InterfaceC19020 interfaceC19020M48149 = C21084.m48147().m48149(intExtra);
                                if (interfaceC19020M48149 != null) {
                                    interfaceC19020M48149.mo2047(new C1121(-20, "手Q版本过低，请下载安装最新版手Q", str5));
                                }
                                m913(intent, false);
                            }
                        } catch (Exception e3) {
                            try {
                                C21587.m49116(str6, "--onCreate--startActivity exception: " + e3.getMessage());
                                C21587.m49116(str6, "--onCreate--startActException");
                                finish();
                            } catch (Throwable th) {
                                th = th;
                                if (z) {
                                    C21587.m49116(str6, "--onCreate--startActException");
                                    finish();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (z) {
                            C21587.m49116(str6, "--onCreate--startActException");
                            finish();
                        }
                        throw th;
                    }
                } catch (ActivityNotFoundException e4) {
                    e = e4;
                    str5 = "";
                    intExtra = intExtra;
                }
            } else {
                StringBuilder sb = new StringBuilder("--onCreate--activityIntent or pendingIntent is null. activityIntent is null? ");
                sb.append(intent == null);
                sb.append(", pendingIntent is null? ");
                sb.append(pendingIntent == null);
                C21587.m49116(str6, sb.toString());
                finish();
            }
        } else {
            C21587.m49114(str6, "--onCreate--h5 bundle not null, will open browser");
            String string = bundleExtra.getString("viaShareType");
            String string2 = bundleExtra.getString("callbackAction");
            String string3 = bundleExtra.getString("url");
            String string4 = bundleExtra.getString("openId");
            String string5 = bundleExtra.getString(AlipayApi.c);
            if ("shareToQQ".equals(string2)) {
                str3 = "ANDROIDQQ.SHARETOQQ.XX";
                str4 = "10";
            } else {
                if ("shareToQzone".equals(string2)) {
                    str3 = "ANDROIDQQ.SHARETOQZ.XX";
                    str4 = "11";
                } else {
                    str = "";
                    str2 = str;
                }
                if (!C20512.m47036(this, string3)) {
                    interfaceC19020M48150 = C21084.m48147().m48150(string2);
                    if (interfaceC19020M48150 != null) {
                        interfaceC19020M48150.mo2047(new C1121(-6, "打开浏览器失败!", null));
                    }
                    C17111.m40275().getClass();
                    C3687.m11981().m11983(C20512.m47031(string4, str, "3", str2, string5, "1", string, "", "", "0", "2", "0"), string5, false);
                    finish();
                } else {
                    C17111.m40275().getClass();
                    C3687.m11981().m11983(C20512.m47031(string4, str, "3", str2, string5, "0", string, "", "", "0", "2", "0"), string5, false);
                }
                getIntent().removeExtra("shareH5");
            }
            str2 = str3;
            str = str4;
            if (!C20512.m47036(this, string3)) {
                interfaceC19020M48150 = C21084.m48147().m48150(string2);
                if (interfaceC19020M48150 != null) {
                    interfaceC19020M48150.mo2047(new C1121(-6, "打开浏览器失败!", null));
                }
                C17111.m40275().getClass();
                C3687.m11981().m11983(C20512.m47031(string4, str, "3", str2, string5, "1", string, "", "", "0", "2", "0"), string5, false);
                finish();
            } else {
                C17111.m40275().getClass();
                C3687.m11981().m11983(C20512.m47031(string4, str, "3", str2, string5, "0", string, "", "", "0", "2", "0"), string5, false);
            }
            getIntent().removeExtra("shareH5");
        }
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setOnTouchListener(new ViewOnTouchListenerC3184(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m913(Intent intent, boolean z) {
        Bundle bundleExtra = intent.getBundleExtra(C24068.f77820);
        if (bundleExtra != null) {
            bundleExtra.putString(o.c, z ? "0" : "1");
            C3687.m11981().m11983(bundleExtra, this.f879, intent.getBooleanExtra(C24068.f77819, false));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        C21587.m49113(this.f882, "-->onStart");
        super.onStart();
        this.f878.m40750(1);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C21587.m49113(this.f882, "-->onResume");
        super.onResume();
        C17354 c17354 = this.f878;
        c17354.m40750(2);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("is_login", false)) {
            return;
        }
        if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.f877 && !isFinishing()) {
            finish();
        }
        if (this.f881 && c17354.m40752()) {
            Handler handler = this.f884;
            handler.sendMessage(handler.obtainMessage(0));
        } else {
            this.f881 = true;
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        C21587.m49113(this.f882, "-->onPause");
        this.f884.removeMessages(0);
        super.onPause();
        this.f878.m40750(3);
    }

    @Override // android.app.Activity
    public final void onStop() {
        String str = this.f882;
        C21587.m49113(str, "-->onStop");
        super.onStop();
        this.f878.m40750(4);
        try {
            int intExtra = getIntent().getIntExtra("key_request_orientation", -1);
            C21587.m49113(str, "getRequestedOrientation= " + intExtra);
            if (intExtra != -1) {
                setRequestedOrientation(intExtra);
            }
        } catch (Throwable th) {
            C21587.m49112(str, "reset requestedOrientation catch exception", th);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C21587.m49113(this.f882, "-->onDestroy");
        super.onDestroy();
        this.f878.m40750(5);
        C12133 c12133 = this.f883;
        if (c12133 != null) {
            unregisterReceiver(c12133);
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str = "--onNewIntent: " + hashCode();
        String str2 = this.f882;
        C21587.m49113(str2, str);
        super.onNewIntent(intent);
        this.f878.m40750(6);
        if (intent != null) {
            intent.setFlags(intent.getFlags() & (-196));
        }
        int intExtra = intent.getIntExtra("key_request_code", -1);
        C21587.m49113(str2, "--onNewIntent callbackRequestCode= " + intExtra);
        if (intExtra == 10108) {
            intent.putExtra("key_action", "action_request_avatar");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10109) {
            intent.putExtra("key_action", "action_request_set_emotion");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10110) {
            intent.putExtra("key_action", "action_request_dynamic_avatar");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10111) {
            intent.putExtra("key_action", "joinGroup");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10112) {
            intent.putExtra("key_action", "bindGroup");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10113) {
            intent.putExtra("key_action", intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            C21587.m49113(str2, "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        if (intExtra == 10114) {
            intent.putExtra("key_action", intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            C21587.m49113(str2, "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        intent.putExtra("key_action", "action_share");
        setResult(-1, intent);
        if (isFinishing()) {
            return;
        }
        C21587.m49113(str2, "--onNewIntent--activity not finished, finish now");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C21587.m49113(this.f882, "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f881);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sbM5126 = C1402.m5126("--onActivityResult--requestCode: ", i, " | resultCode: ", "data = null ? ", i2);
        sbM5126.append(intent == null);
        String string = sbM5126.toString();
        String str = this.f882;
        C21587.m49113(str, string);
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            return;
        }
        if (C15862.m37820(this)) {
            C21587.m49116(str, "onActivityResult callPack: " + getCallingPackage());
            finish();
            return;
        }
        if (intent != null) {
            intent.putExtra("key_action", "action_login");
        }
        Bundle extras = intent == null ? null : intent.getExtras();
        if (extras == null) {
            C21587.m49114(str, "--setResultData--bundle is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i == 11101) {
                C17111 c17111M40275 = C17111.m40275();
                String str2 = this.f879;
                c17111M40275.getClass();
                C17111.m40276("", str2, "2");
            }
        } else {
            try {
                String string2 = extras.getString("key_response");
                C21587.m49111(str, "--setResultDataForLogin-- ");
                Intent intent2 = new Intent();
                intent2.putExtras(extras);
                if (TextUtils.isEmpty(string2)) {
                    C21587.m49114(str, "--setResultData--response is empty, setResult ACTIVITY_OK");
                    setResult(-1, intent2);
                } else {
                    JSONObject jSONObject = new JSONObject(string2);
                    String strOptString = jSONObject.optString("openid");
                    String strOptString2 = jSONObject.optString("access_token");
                    String strOptString3 = jSONObject.optString("proxy_code");
                    long jOptLong = jSONObject.optLong("proxy_expires_in");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        C21587.m49113(str, "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                        setResult(-1, intent2);
                        C17111 c17111M40276 = C17111.m40275();
                        String str3 = this.f879;
                        c17111M40276.getClass();
                        C17111.m40276(strOptString, str3, "0");
                    } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                        C21587.m49114(str, "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                        setResult(0, intent2);
                        C17111 c17111M40277 = C17111.m40275();
                        String str4 = this.f879;
                        c17111M40277.getClass();
                        C17111.m40276("", str4, "1");
                    } else {
                        C21587.m49113(str, "--setResultData--proxy_code and proxy_expires_in are valid");
                        setResult(-1, intent2);
                    }
                }
            } catch (Exception e) {
                C21587.m49116(str, "--setResultData--parse response failed");
                C21587.m49112(str, "--setResultData--parse response exception", e);
            }
        }
        if (this.f880) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC20338(this), 200L);
        } else {
            C21587.m49113(str, "onActivityResult finish immediate");
            finish();
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        if (C22004.m49742(this)) {
            return;
        }
        super.setRequestedOrientation(i);
    }
}
