package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import java.util.HashMap;
import l.C15463;
import l.C23099;
import l.C23245;
import l.C2761;
import l.C3342;
import l.C9113;
import l.InterfaceC18284;
import l.InterfaceC19696;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class AuthActivity extends Activity {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f908;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f909 = new HashMap();

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C23099.m51113("openSDK_LOG.AuthActivity", "->onCreate");
        C15463 c15463 = new C15463(this);
        HashMap map = this.f909;
        map.put("action_common_channel", c15463);
        map.put("action_auth", new C9113());
        m927();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C23099.m51113("openSDK_LOG.AuthActivity", "->onNewIntent");
        m927();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m927() {
        Uri data;
        Intent intent = getIntent();
        if (intent == null) {
            C23099.m51112("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        try {
            data = intent.getData();
        } catch (Exception e) {
            C23099.m51111("openSDK_LOG.AuthActivity", "onCreate exception: ", e);
            data = null;
        }
        C23099.m51107("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + data);
        try {
            m928(intent, data);
        } catch (Exception e2) {
            C23099.m51111("openSDK_LOG.AuthActivity", "onCreate exception: ", e2);
            finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m928(Intent intent, Uri uri) {
        C23099.m51113("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri != null && uri.toString() != null) {
            String string = "";
            if (!uri.toString().equals("")) {
                String string2 = uri.toString();
                Bundle bundleM8424 = C2761.m8424(string2.substring(string2.indexOf("#") + 1));
                if (bundleM8424 == null) {
                    C23099.m51112("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
                    finish();
                    return;
                }
                String string3 = bundleM8424.getString("action");
                C23099.m51113("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string3);
                if (string3 == null) {
                    finish();
                    return;
                }
                if (string3.equals("shareToQQ") || string3.equals("shareToQzone") || string3.equals("sendToMyComputer") || string3.equals("shareToTroopBar")) {
                    if (string3.equals("shareToQzone") && C3342.m9948(this, "com.tencent.mobileqq") != null && C3342.m9943(C3342.m9948(this, "com.tencent.mobileqq"), "5.2.0") < 0) {
                        int i = f908 + 1;
                        f908 = i;
                        if (i == 2) {
                            f908 = 0;
                            finish();
                            return;
                        }
                    }
                    C23099.m51113("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
                    Intent intent2 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent2.putExtras(bundleM8424);
                    intent2.setFlags(603979776);
                    startActivity(intent2);
                    finish();
                    return;
                }
                if (string3.equals("addToQQFavorites")) {
                    Intent intent3 = getIntent();
                    intent3.putExtras(bundleM8424);
                    intent3.putExtra("key_action", "action_share");
                    InterfaceC18284 interfaceC18284M51290 = C23245.m51287().m51290(string3);
                    if (interfaceC18284M51290 != null) {
                        C23245.m51287().getClass();
                        C23245.m51288(intent3, interfaceC18284M51290);
                    }
                    finish();
                    return;
                }
                if (string3.equals("sharePrize")) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                    try {
                        string = C2761.m8423(bundleM8424.getString("response")).getString("activityid");
                    } catch (Exception e) {
                        C23099.m51111("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        launchIntentForPackage.putExtra("sharePrize", true);
                        Bundle bundle = new Bundle();
                        bundle.putString("activityid", string);
                        launchIntentForPackage.putExtras(bundle);
                    }
                    startActivity(launchIntentForPackage);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetAvatar")) {
                    boolean booleanExtra = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent4 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent4.putExtra("key_request_code", 10108);
                    intent4.putExtra("stay_back_stack", booleanExtra);
                    intent4.putExtras(bundleM8424);
                    intent4.setFlags(603979776);
                    startActivity(intent4);
                    finish();
                    return;
                }
                if ("sdkSetDynamicAvatar".equals(string3)) {
                    boolean booleanExtra2 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent5 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent5.putExtra("key_request_code", 10110);
                    intent5.putExtra("stay_back_stack", booleanExtra2);
                    intent5.putExtras(bundleM8424);
                    intent5.setFlags(603979776);
                    startActivity(intent5);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetEmotion")) {
                    boolean booleanExtra3 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent6 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent6.putExtra("key_request_code", 10109);
                    intent6.putExtra("stay_back_stack", booleanExtra3);
                    intent6.putExtras(bundleM8424);
                    intent6.setFlags(603979776);
                    startActivity(intent6);
                    finish();
                    return;
                }
                if (string3.equals("bindGroup")) {
                    C23099.m51113("openSDK_LOG.AuthActivity", "-->handleActionUri--bind group callback.");
                    boolean booleanExtra4 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent7 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent7.putExtra("key_request_code", 10112);
                    intent7.putExtra("stay_back_stack", booleanExtra4);
                    intent7.putExtras(bundleM8424);
                    intent7.setFlags(603979776);
                    startActivity(intent7);
                    finish();
                    return;
                }
                if (string3.equals("joinGroup")) {
                    C23099.m51113("openSDK_LOG.AuthActivity", "-->handleActionUri--join group callback. ");
                    boolean booleanExtra5 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent8 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent8.putExtra("key_request_code", 10111);
                    intent8.putExtra("stay_back_stack", booleanExtra5);
                    intent8.putExtras(bundleM8424);
                    intent8.setFlags(603979776);
                    startActivity(intent8);
                    finish();
                    return;
                }
                if ("guildOpen".equals(string3)) {
                    Intent intent9 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent9.putExtras(bundleM8424);
                    intent9.putExtra("key_request_code", 10113);
                    intent9.setFlags(603979776);
                    startActivity(intent9);
                    finish();
                    return;
                }
                InterfaceC19696 interfaceC19696 = (InterfaceC19696) this.f909.get(string3);
                C23099.m51107("openSDK_LOG.AuthActivity", "actionHandler: " + interfaceC19696);
                if (interfaceC19696 != null) {
                    interfaceC19696.mo23453(intent, bundleM8424);
                }
                finish();
                return;
            }
        }
        C23099.m51112("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        try {
            super.finish();
        } catch (Exception e) {
            C23099.m51111("openSDK_LOG.AuthActivity", "activity finish exception: ", e);
        }
    }
}
