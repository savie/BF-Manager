package com.tencent.open;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import l.C12661;
import l.C13221;
import l.C1350;
import l.C15796;
import l.C18305;
import l.C19011;
import l.C21833;
import l.C23099;
import l.C2761;
import l.C4047;
import l.HandlerC8428;
import l.InterfaceC18284;
import l.RunnableC15484;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class TDialog extends c {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static WeakReference f896;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public WeakReference f898;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4047 f899;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13221 f900;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19011 f901;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f902;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC18284 f903;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Handler f904;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final FrameLayout.LayoutParams f897 = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Toast f895 = null;

    public TDialog(Context context, String str, InterfaceC18284 interfaceC18284, C15796 c15796) {
        super(context);
        this.f898 = new WeakReference(context);
        this.f902 = str;
        c15796.getClass();
        C19011 c19011 = new C19011(context, str, interfaceC18284);
        this.f901 = c19011;
        this.f904 = new HandlerC8428(this, c19011, context.getMainLooper());
        this.f903 = interfaceC18284;
    }

    @Override // com.tencent.open.c, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C12661.m31461(getWindow());
        WeakReference weakReference = this.f898;
        try {
            new TextView((Context) weakReference.get()).setText("test");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C13221 c13221 = new C13221((Context) weakReference.get());
            this.f900 = c13221;
            c13221.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C4047 c4047 = new C4047((Context) weakReference.get());
            this.f899 = c4047;
            c4047.setLayoutParams(layoutParams);
            this.f899.setBackgroundColor(-1);
            this.f899.addView(this.f900);
            setContentView(this.f899);
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.TDialog", "onCreateView exception", th);
            C12661.m31460(this, this.f904);
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC15484(this));
        C13221 c13222 = this.f900;
        if (c13222 != null) {
            c13222.setVerticalScrollBarEnabled(false);
            this.f900.setHorizontalScrollBarEnabled(false);
            this.f900.setWebViewClient(new C21833(this));
            this.f900.setWebChromeClient(this.f906);
            this.f900.clearFormData();
            WebSettings settings = this.f900.getSettings();
            if (settings == null) {
                return;
            }
            C1350.m4756(this.f900);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (weakReference != null && weakReference.get() != null) {
                settings.setDatabaseEnabled(true);
                settings.setDatabasePath(((Context) weakReference.get()).getApplicationContext().getDir("databases", 0).getPath());
            }
            settings.setDomStorageEnabled(true);
            this.f905.m15126(new C18305(), "sdk_js_if");
            this.f900.loadUrl(this.f902);
            this.f900.setLayoutParams(f897);
            this.f900.setVisibility(4);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C19011 c19011 = this.f901;
        if (c19011 != null) {
            c19011.mo16213();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.c
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo924(String str) {
        C23099.m51110("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f905.mo15127(this.f900, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m921(Context context, String str) {
        WeakReference weakReference;
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectM8423 = C2761.m8423(str);
            int i = jSONObjectM8423.getInt("action");
            String string = jSONObjectM8423.getString("msg");
            if (i == 1) {
                WeakReference weakReference2 = f896;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((ProgressDialog) f896.get()).setMessage(string);
                    if (((ProgressDialog) f896.get()).isShowing()) {
                        return;
                    }
                    ((ProgressDialog) f896.get()).show();
                    return;
                }
                ProgressDialog progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(string);
                f896 = new WeakReference(progressDialog);
                progressDialog.show();
                return;
            }
            if (i != 0 || (weakReference = f896) == null || weakReference.get() == null || !((ProgressDialog) f896.get()).isShowing()) {
                return;
            }
            ((ProgressDialog) f896.get()).dismiss();
            f896 = null;
        } catch (JSONException unused) {
        }
    }
}
