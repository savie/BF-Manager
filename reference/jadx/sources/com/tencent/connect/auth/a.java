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
import l.C11387;
import l.C12879;
import l.C13878;
import l.C14127;
import l.C14873;
import l.C15116;
import l.C20512;
import l.C21258;
import l.C21587;
import l.C22783;
import l.C23079;
import l.C24242;
import l.C24814;
import l.C4104;
import l.C4433;
import l.DialogInterfaceOnDismissListenerC22576;
import l.HandlerC5422;
import l.InterfaceC19020;
import l.ViewOnClickListenerC4676;
import l.ViewOnLongClickListenerC21830;
import l.ViewOnTouchListenerC10641;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class a extends Dialog {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Handler f858;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ProgressBar f859;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14873 f860;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f861;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21258 f862;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public FrameLayout f863;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Context f864;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f865;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public FrameLayout f866;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f867;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f868;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f869;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public HashMap f870;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC19020 f871;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public LinearLayout f872;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public long f873;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12879 f874;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f875;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long f876;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m906(a aVar) {
        if (C24814.f80290 == null) {
            C24814 c24814 = new C24814();
            c24814.f80291 = new HashMap();
            C24814.f80290 = c24814;
        }
        C24814 c24815 = C24814.f80290;
        c24815.getClass();
        int iCeil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iCeil; i++) {
            stringBuffer.append(charArray[(int) (Math.random() * ((double) length))]);
        }
        String string = stringBuffer.toString();
        C11387 c11387 = new C11387();
        c11387.f35845 = aVar.f871;
        String strM55333 = c24815.m55333(c11387);
        String str = aVar.f869;
        String strSubstring = str.substring(0, str.indexOf("?"));
        Bundle bundleM47041 = C20512.m47041(aVar.f869);
        bundleM47041.putString("token_key", string);
        bundleM47041.putString(i.a, strM55333);
        bundleM47041.putString("browser", "1");
        String str2 = strSubstring + "?" + C14127.m34338(bundleM47041);
        aVar.f869 = str2;
        return C20512.m47036(aVar.f864, str2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m903(a aVar) {
        aVar.f861++;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m905(a aVar, String str) {
        aVar.f869 += ((Object) str);
    }

    public a(Context context, String str, InterfaceC19020 interfaceC19020, C13878 c13878) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f868 = false;
        this.f876 = 0L;
        this.f873 = 30000L;
        this.f864 = context;
        this.f869 = str;
        c13878.getClass();
        C12879 c12879 = new C12879(this, str, interfaceC19020);
        this.f874 = c12879;
        this.f858 = new HandlerC5422(this, c12879, context.getMainLooper());
        this.f871 = interfaceC19020;
        this.f865 = "action_login";
        this.f862 = new C21258();
        getWindow().setSoftInputMode(32);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C23079.m51990(getWindow());
        Context context = this.f864;
        try {
            m890();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C14873 c14873 = new C14873(context);
            this.f860 = c14873;
            c14873.setLayerType(1, null);
            this.f860.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C4433 c4433 = new C4433(context);
            c4433.setLayoutParams(layoutParams);
            c4433.addView(this.f860);
            FrameLayout frameLayout = new FrameLayout(context);
            this.f863 = frameLayout;
            frameLayout.addView(c4433);
            this.f863.setBackgroundColor(-1);
            this.f863.addView(this.f866);
            String string = C20512.m47041(this.f869).getString("style");
            if (string != null && "qr".equals(string)) {
                m891(this.f863);
            }
            setContentView(this.f863);
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.AuthDialog", "onCreateView exception", th);
            C23079.m51989(this, this.f858);
        }
        C14873 c14874 = this.f860;
        if (c14874 != null) {
            c14874.setVerticalScrollBarEnabled(false);
            this.f860.setHorizontalScrollBarEnabled(false);
            this.f860.setWebViewClient(new C15116(this));
            this.f860.setWebChromeClient(new WebChromeClient());
            this.f860.clearFormData();
            this.f860.clearSslPreferences();
            this.f860.setOnLongClickListener(new ViewOnLongClickListenerC21830());
            this.f860.setOnTouchListener(new ViewOnTouchListenerC10641());
            WebSettings settings = this.f860.getSettings();
            C24242.m54242(this.f860);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(context.getDir("databases", 0).getPath());
            settings.setDomStorageEnabled(true);
            C21587.m49118("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f869);
            String str = this.f869;
            this.f875 = str;
            this.f860.loadUrl(str);
            this.f860.setVisibility(4);
            this.f862.m47660(new C4104(), "SecureJsInterface");
            super.setOnDismissListener(new DialogInterfaceOnDismissListenerC22576());
        }
        this.f870 = new HashMap();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (!this.f868) {
            this.f874.mo2046();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m893(a aVar, String str) {
        new StringBuilder(str);
        if (TextUtils.isEmpty(aVar.f867) || aVar.f867.length() < 4) {
            return;
        }
        String str2 = aVar.f867;
        str2.substring(str2.length() - 4);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m909(a aVar) {
        String str = aVar.f869;
        String str2 = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + str.substring(str.indexOf("?") + 1);
        C21587.m49113("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m891(FrameLayout frameLayout) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb;
        Context context = this.f864;
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
                        C21587.m49116("openSDK_LOG.Util", sb.toString());
                    }
                } catch (IOException e2) {
                    e = e2;
                    C21587.m49116("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        C21587.m49116("openSDK_LOG.Util", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    C21587.m49116("openSDK_LOG.Util", "inputStream close exception: " + e4.getMessage());
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
        imageView.setOnClickListener(new ViewOnClickListenerC4676(this));
        frameLayout.addView(imageView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m890() {
        TextView textView;
        Context context = this.f864;
        this.f859 = new ProgressBar(context);
        this.f859.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f872 = new LinearLayout(context);
        if (this.f865.equals("action_login")) {
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
        this.f872.setLayoutParams(layoutParams2);
        this.f872.addView(this.f859);
        if (textView != null) {
            this.f872.addView(textView);
        }
        this.f866 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f866.setLayoutParams(layoutParams3);
        this.f866.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f866.addView(this.f872);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m911(String str) {
        if (this.f860 != null) {
            StringBuilder sbM51387 = C22783.m51387("javascript:", str, "();void(");
            sbM51387.append(System.currentTimeMillis());
            sbM51387.append(");");
            this.f860.loadUrl(sbM51387.toString());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f870.clear();
        this.f858.removeCallbacksAndMessages(null);
        try {
            Context context = this.f864;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                C21587.m49113("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e) {
            C21587.m49112("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e);
        }
        C14873 c14873 = this.f860;
        if (c14873 != null) {
            c14873.destroy();
            this.f860 = null;
        }
    }
}
