package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import java.util.HashMap;
import l.C0375;
import l.C17528;
import l.C20512;
import l.C21084;
import l.C21587;
import l.C2612;
import l.InterfaceC19020;
import l.InterfaceC9323;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class AuthActivity extends Activity {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f898;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f899 = new HashMap();

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21587.m49113("openSDK_LOG.AuthActivity", "->onCreate");
        C0375 c0375 = new C0375(this);
        HashMap map = this.f899;
        map.put("action_common_channel", c0375);
        map.put("action_auth", new C2612());
        m921();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C21587.m49113("openSDK_LOG.AuthActivity", "->onNewIntent");
        m921();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m921() {
        Uri data;
        Intent intent = getIntent();
        if (intent == null) {
            C21587.m49114("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        try {
            data = intent.getData();
        } catch (Exception e) {
            C21587.m49112("openSDK_LOG.AuthActivity", "onCreate exception: ", e);
            data = null;
        }
        C21587.m49118("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + data);
        try {
            m922(intent, data);
        } catch (Exception e2) {
            C21587.m49112("openSDK_LOG.AuthActivity", "onCreate exception: ", e2);
            finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m922(Intent intent, Uri uri) {
        C21587.m49113("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri != null && uri.toString() != null) {
            String string = "";
            if (!uri.toString().equals("")) {
                String string2 = uri.toString();
                Bundle bundleM47030 = C20512.m47030(string2.substring(string2.indexOf("#") + 1));
                if (bundleM47030 == null) {
                    C21587.m49114("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
                    finish();
                    return;
                }
                String string3 = bundleM47030.getString("action");
                C21587.m49113("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string3);
                if (string3 == null) {
                    finish();
                    return;
                }
                if (string3.equals("shareToQQ") || string3.equals("shareToQzone") || string3.equals("sendToMyComputer") || string3.equals("shareToTroopBar")) {
                    if (string3.equals("shareToQzone") && C17528.m41149(this, "com.tencent.mobileqq") != null && C17528.m41144(C17528.m41149(this, "com.tencent.mobileqq"), "5.2.0") < 0) {
                        int i = f898 + 1;
                        f898 = i;
                        if (i == 2) {
                            f898 = 0;
                            finish();
                            return;
                        }
                    }
                    C21587.m49113("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
                    Intent intent2 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent2.putExtras(bundleM47030);
                    intent2.setFlags(603979776);
                    startActivity(intent2);
                    finish();
                    return;
                }
                if (string3.equals("addToQQFavorites")) {
                    Intent intent3 = getIntent();
                    intent3.putExtras(bundleM47030);
                    intent3.putExtra("key_action", "action_share");
                    InterfaceC19020 interfaceC19020M48150 = C21084.m48147().m48150(string3);
                    if (interfaceC19020M48150 != null) {
                        C21084.m48147().getClass();
                        C21084.m48148(intent3, interfaceC19020M48150);
                    }
                    finish();
                    return;
                }
                if (string3.equals("sharePrize")) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                    try {
                        string = C20512.m47044(bundleM47030.getString("response")).getString("activityid");
                    } catch (Exception e) {
                        C21587.m49112("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e);
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
                    intent4.putExtras(bundleM47030);
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
                    intent5.putExtras(bundleM47030);
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
                    intent6.putExtras(bundleM47030);
                    intent6.setFlags(603979776);
                    startActivity(intent6);
                    finish();
                    return;
                }
                if (string3.equals("bindGroup")) {
                    C21587.m49113("openSDK_LOG.AuthActivity", "-->handleActionUri--bind group callback.");
                    boolean booleanExtra4 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent7 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent7.putExtra("key_request_code", 10112);
                    intent7.putExtra("stay_back_stack", booleanExtra4);
                    intent7.putExtras(bundleM47030);
                    intent7.setFlags(603979776);
                    startActivity(intent7);
                    finish();
                    return;
                }
                if (string3.equals("joinGroup")) {
                    C21587.m49113("openSDK_LOG.AuthActivity", "-->handleActionUri--join group callback. ");
                    boolean booleanExtra5 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent8 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent8.putExtra("key_request_code", 10111);
                    intent8.putExtra("stay_back_stack", booleanExtra5);
                    intent8.putExtras(bundleM47030);
                    intent8.setFlags(603979776);
                    startActivity(intent8);
                    finish();
                    return;
                }
                if ("guildOpen".equals(string3)) {
                    Intent intent9 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent9.putExtras(bundleM47030);
                    intent9.putExtra("key_request_code", 10113);
                    intent9.setFlags(603979776);
                    startActivity(intent9);
                    finish();
                    return;
                }
                InterfaceC9323 interfaceC9323 = (InterfaceC9323) this.f899.get(string3);
                C21587.m49118("openSDK_LOG.AuthActivity", "actionHandler: " + interfaceC9323);
                if (interfaceC9323 != null) {
                    interfaceC9323.mo2173(intent, bundleM47030);
                }
                finish();
                return;
            }
        }
        C21587.m49114("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        try {
            super.finish();
        } catch (Exception e) {
            C21587.m49112("openSDK_LOG.AuthActivity", "activity finish exception: ", e);
        }
    }
}
