package com.tencent.connect.auth;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.idtracking.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import l.C10857;
import l.C12441;
import l.C12661;
import l.C13346;
import l.C1350;
import l.C15796;
import l.C16044;
import l.C1683;
import l.C23099;
import l.C2761;
import l.C4047;
import l.C5917;
import l.C6870;
import l.C6995;
import l.C9446;
import l.DialogInterfaceOnDismissListenerC12268;
import l.HandlerC23557;
import l.InterfaceC18284;
import l.ViewOnClickListenerC20029;
import l.ViewOnLongClickListenerC0272;
import l.ViewOnTouchListenerC16501;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class a extends Dialog {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC18284 f868;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Context f869;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public long f870;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f871;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f872;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public long f873;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public FrameLayout f874;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C6995 f875;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ProgressBar f876;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f877;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FrameLayout f878;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f879;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6870 f880;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f881;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Handler f882;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public LinearLayout f883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10857 f884;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f885;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f886;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m910(a aVar) {
        if (C9446.f31961 == null) {
            C9446 c9446 = new C9446();
            c9446.f31962 = new HashMap();
            C9446.f31961 = c9446;
        }
        C9446 c9447 = C9446.f31961;
        c9447.getClass();
        int iCeil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iCeil; i++) {
            stringBuffer.append(charArray[(int) (Math.random() * ((double) length))]);
        }
        String string = stringBuffer.toString();
        C1683 c1683 = new C1683();
        c1683.f6675 = aVar.f868;
        String strM24200 = c9447.m24200(c1683);
        String str = aVar.f881;
        String strSubstring = str.substring(0, str.indexOf("?"));
        Bundle bundleM8435 = C2761.m8435(aVar.f881);
        bundleM8435.putString("token_key", string);
        bundleM8435.putString(i.a, strM24200);
        bundleM8435.putString("browser", "1");
        String str2 = strSubstring + "?" + C16044.m38038(bundleM8435);
        aVar.f881 = str2;
        return C2761.m8430(aVar.f869, str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m909(a aVar, String str) {
        aVar.f881 += ((Object) str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m914(a aVar) {
        aVar.f872++;
    }

    public a(Context context, String str, InterfaceC18284 interfaceC18284, C15796 c15796) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f871 = false;
        this.f870 = 0L;
        this.f873 = 30000L;
        this.f869 = context;
        this.f881 = str;
        c15796.getClass();
        C10857 c10857 = new C10857(this, str, interfaceC18284);
        this.f884 = c10857;
        this.f882 = new HandlerC23557(this, c10857, context.getMainLooper());
        this.f868 = interfaceC18284;
        this.f886 = "action_login";
        this.f875 = new C6995();
        getWindow().setSoftInputMode(32);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C12661.m31461(getWindow());
        Context context = this.f869;
        try {
            m898();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C6870 c6870 = new C6870(context);
            this.f880 = c6870;
            c6870.setLayerType(1, null);
            this.f880.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C4047 c4047 = new C4047(context);
            c4047.setLayoutParams(layoutParams);
            c4047.addView(this.f880);
            FrameLayout frameLayout = new FrameLayout(context);
            this.f878 = frameLayout;
            frameLayout.addView(c4047);
            this.f878.setBackgroundColor(-1);
            this.f878.addView(this.f874);
            String string = C2761.m8435(this.f881).getString("style");
            if (string != null && "qr".equals(string)) {
                m899(this.f878);
            }
            setContentView(this.f878);
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.AuthDialog", "onCreateView exception", th);
            C12661.m31460(this, this.f882);
        }
        C6870 c6871 = this.f880;
        if (c6871 != null) {
            c6871.setVerticalScrollBarEnabled(false);
            this.f880.setHorizontalScrollBarEnabled(false);
            this.f880.setWebViewClient(new C5917(this));
            this.f880.setWebChromeClient(new WebChromeClient());
            this.f880.clearFormData();
            this.f880.clearSslPreferences();
            this.f880.setOnLongClickListener(new ViewOnLongClickListenerC0272());
            this.f880.setOnTouchListener(new ViewOnTouchListenerC16501());
            WebSettings settings = this.f880.getSettings();
            C1350.m4756(this.f880);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(context.getDir("databases", 0).getPath());
            settings.setDomStorageEnabled(true);
            C23099.m51107("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f881);
            String str = this.f881;
            this.f879 = str;
            this.f880.loadUrl(str);
            this.f880.setVisibility(4);
            this.f875.m15126(new C13346(), "SecureJsInterface");
            super.setOnDismissListener(new DialogInterfaceOnDismissListenerC12268());
        }
        this.f885 = new HashMap();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (!this.f871) {
            this.f884.mo16213();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m901(a aVar, String str) {
        new StringBuilder(str);
        if (TextUtils.isEmpty(aVar.f877) || aVar.f877.length() < 4) {
            return;
        }
        String str2 = aVar.f877;
        str2.substring(str2.length() - 4);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m913(a aVar) {
        String str = aVar.f881;
        String str2 = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + str.substring(str.indexOf("?") + 1);
        C23099.m51113("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m899(FrameLayout frameLayout) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb;
        Context context = this.f869;
        ImageView imageView = new ImageView(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 15.6f) + 0.5f);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 25.2f) + 0.5f);
        int i3 = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        int i4 = i3 * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i + i4, i2 + i4);
        layoutParams.leftMargin = i3;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(i3, i3, i3, i3);
        InputStream inputStream = null;
        drawableCreateFromStream = null;
        Drawable drawableCreateFromStream = null;
        try {
            inputStreamOpen = context.getAssets().open("h5_qr_back.png");
            try {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, "h5_qr_back.png");
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e) {
                        e = e;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        C23099.m51115("openSDK_LOG.Util", sb.toString());
                    }
                } catch (IOException e2) {
                    e = e2;
                    C23099.m51115("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        C23099.m51115("openSDK_LOG.Util", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    C23099.m51115("openSDK_LOG.Util", "inputStream close exception: " + e4.getMessage());
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream.close();
            throw th;
        }
        imageView.setImageDrawable(drawableCreateFromStream);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnClickListener(new ViewOnClickListenerC20029(this));
        frameLayout.addView(imageView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m898() {
        TextView textView;
        Context context = this.f869;
        this.f876 = new ProgressBar(context);
        this.f876.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f883 = new LinearLayout(context);
        if (this.f886.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(context);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        } else {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.f883.setLayoutParams(layoutParams2);
        this.f883.addView(this.f876);
        if (textView != null) {
            this.f883.addView(textView);
        }
        this.f874 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f874.setLayoutParams(layoutParams3);
        this.f874.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f874.addView(this.f883);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m917(String str) {
        if (this.f880 != null) {
            StringBuilder sbM30914 = C12441.m30914("javascript:", str, "();void(");
            sbM30914.append(System.currentTimeMillis());
            sbM30914.append(");");
            this.f880.loadUrl(sbM30914.toString());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f885.clear();
        this.f882.removeCallbacksAndMessages(null);
        try {
            Context context = this.f869;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                C23099.m51113("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e) {
            C23099.m51111("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e);
        }
        C6870 c6870 = this.f880;
        if (c6870 != null) {
            c6870.destroy();
            this.f880 = null;
        }
    }
}
