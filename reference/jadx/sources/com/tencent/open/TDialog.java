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
import l.C0201;
import l.C13878;
import l.C18846;
import l.C20512;
import l.C21587;
import l.C23079;
import l.C24242;
import l.C24571;
import l.C4433;
import l.C7659;
import l.HandlerC9895;
import l.InterfaceC19020;
import l.RunnableC18100;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class TDialog extends c {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static WeakReference f886;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f888;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C24571 f889;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C18846 f890;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Handler f891;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4433 f892;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public WeakReference f893;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19020 f894;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final FrameLayout.LayoutParams f885 = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static Toast f887 = null;

    public TDialog(Context context, String str, InterfaceC19020 interfaceC19020, C13878 c13878) {
        super(context);
        this.f893 = new WeakReference(context);
        this.f888 = str;
        c13878.getClass();
        C18846 c18846 = new C18846(context, str, interfaceC19020);
        this.f890 = c18846;
        this.f891 = new HandlerC9895(this, c18846, context.getMainLooper());
        this.f894 = interfaceC19020;
    }

    @Override // com.tencent.open.c, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C23079.m51990(getWindow());
        WeakReference weakReference = this.f893;
        try {
            new TextView((Context) weakReference.get()).setText("test");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C24571 c24571 = new C24571((Context) weakReference.get());
            this.f889 = c24571;
            c24571.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C4433 c4433 = new C4433((Context) weakReference.get());
            this.f892 = c4433;
            c4433.setLayoutParams(layoutParams);
            this.f892.setBackgroundColor(-1);
            this.f892.addView(this.f889);
            setContentView(this.f892);
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.TDialog", "onCreateView exception", th);
            C23079.m51989(this, this.f891);
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC18100(this));
        C24571 c24572 = this.f889;
        if (c24572 != null) {
            c24572.setVerticalScrollBarEnabled(false);
            this.f889.setHorizontalScrollBarEnabled(false);
            this.f889.setWebViewClient(new C0201(this));
            this.f889.setWebChromeClient(this.f896);
            this.f889.clearFormData();
            WebSettings settings = this.f889.getSettings();
            if (settings == null) {
                return;
            }
            C24242.m54242(this.f889);
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
            this.f895.m47660(new C7659(), "sdk_js_if");
            this.f889.loadUrl(this.f888);
            this.f889.setLayoutParams(f885);
            this.f889.setVisibility(4);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C18846 c18846 = this.f890;
        if (c18846 != null) {
            c18846.mo2046();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.c
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo918(String str) {
        C21587.m49111("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f895.mo47661(this.f889, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m915(Context context, String str) {
        WeakReference weakReference;
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectM47044 = C20512.m47044(str);
            int i = jSONObjectM47044.getInt("action");
            String string = jSONObjectM47044.getString("msg");
            if (i == 1) {
                WeakReference weakReference2 = f886;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((ProgressDialog) f886.get()).setMessage(string);
                    if (((ProgressDialog) f886.get()).isShowing()) {
                        return;
                    }
                    ((ProgressDialog) f886.get()).show();
                    return;
                }
                ProgressDialog progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(string);
                f886 = new WeakReference(progressDialog);
                progressDialog.show();
                return;
            }
            if (i != 0 || (weakReference = f886) == null || weakReference.get() == null || !((ProgressDialog) f886.get()).isShowing()) {
                return;
            }
            ((ProgressDialog) f886.get()).dismiss();
            f886 = null;
        } catch (JSONException unused) {
        }
    }
}
