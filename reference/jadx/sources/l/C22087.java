package l;

import android.content.res.AssetManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩹ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K6ZG */
/* JADX INFO: loaded from: classes.dex */
public final class C22087 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public WebView f71550;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0919 f71551;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f71552;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5153 f71553;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f71554;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f71555;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f71556;

    public C22087(WebView webView) {
        InterfaceC6025 interfaceC6025 = C16737.f53607;
        String str = "__mt_inspector_settings_" + UUID.randomUUID().toString().replace("-", "");
        this.f71556 = str;
        this.f71550 = webView;
        C0919 c0919 = new C0919(interfaceC6025);
        this.f71551 = c0919;
        C5153 c5153 = new C5153(c0919);
        this.f71553 = c5153;
        webView.addJavascriptInterface(c5153, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49037() {
        this.f71552++;
        this.f71554 = false;
        this.f71555 = false;
        C5153.m14301(this.f71553, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49035(final boolean z) {
        if (this.f71550 == null || this.f71554) {
            return;
        }
        this.f71554 = true;
        final int i = this.f71552;
        final String string = UUID.randomUUID().toString();
        final AssetManager assets = this.f71550.getContext().getAssets();
        final String strQuote = JSONObject.quote(C6730.m18165(this.f71550.getResources()).toLanguageTag());
        this.f71550.evaluateJavascript(C16523.m38890("(function(){var root=document.documentElement;if(!root)return false;var state=root['__mt_html_inspector_7d26a6c9__'];if(state){state.show();return true;}root['__mt_html_inspector_7d26a6c9__request']='", string, "';return false;})()"), new ValueCallback() { // from class: l.ۗۖ᩹
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                boolean z2 = z;
                C22087.m49032(i, assets, this.f11057, string, strQuote, (String) obj, z2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49028(final int i, AssetManager assetManager, final C22087 c22087, String str, String str2, String str3, boolean z) {
        try {
            final String strM49027 = m49027(assetManager, str, str2, z, str3, c22087.f71556);
            C16737.m39278().post(new Runnable() { // from class: l.ۨۚ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C22087.m49033(this.f38680, i, strM49027);
                }
            });
        } catch (IOException unused) {
            C16737.m39278().post(new Runnable() { // from class: l.ܰۚ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C22087.m49029(this.f44939, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49030(C22087 c22087, int i, String str) {
        boolean zEquals = "true".equals(str);
        if (c22087.f71550 == null || c22087.f71552 != i) {
            return;
        }
        c22087.f71554 = false;
        c22087.f71555 = zEquals;
        if (zEquals) {
            return;
        }
        C5153.m14301(c22087.f71553, null);
        C15829.m37611(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49036(final RunnableC3185 runnableC3185) {
        if (this.f71554) {
            this.f71552++;
            this.f71554 = false;
            this.f71555 = true;
            this.f71550.evaluateJavascript("(function(){var root=document.documentElement;delete root['__mt_html_inspector_7d26a6c9__request'];var state=root['__mt_html_inspector_7d26a6c9__'];if(state)state.hide();})()", null);
            return true;
        }
        WebView webView = this.f71550;
        if (webView == null || !this.f71555) {
            return false;
        }
        final int i = this.f71552;
        webView.evaluateJavascript("(function(){var state=document.documentElement['__mt_html_inspector_7d26a6c9__'];return !!(state&&state.hide());})()", new ValueCallback() { // from class: l.ۢۖ᩹
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C22087.m49031(this.f31575, i, runnableC3185, (String) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49034() {
        m49037();
        WebView webView = this.f71550;
        if (webView != null) {
            webView.removeJavascriptInterface(this.f71556);
        }
        this.f71550 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49029(C22087 c22087, int i) {
        if (c22087.f71550 == null || c22087.f71552 != i) {
            return;
        }
        c22087.f71554 = false;
        c22087.f71555 = false;
        C5153.m14301(c22087.f71553, null);
        C15829.m37611(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49031(C22087 c22087, int i, RunnableC3185 runnableC3185, String str) {
        if (c22087.f71550 == null || c22087.f71552 != i || "true".equals(str)) {
            return;
        }
        runnableC3185.run();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m49032(final int i, final AssetManager assetManager, final C22087 c22087, final String str, final String str2, String str3, final boolean z) {
        if (c22087.f71550 == null || c22087.f71552 != i) {
            return;
        }
        if ("true".equals(str3)) {
            c22087.f71554 = false;
            c22087.f71555 = true;
        } else {
            C5153.m14301(c22087.f71553, str);
            final String string = c22087.f71551.m3649().toString();
            C4716.f16635.execute(new Runnable() { // from class: l.ۙۚ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C22087.m49028(i, assetManager, c22087, str, str2, string, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m49033(final C22087 c22087, final int i, String str) {
        WebView webView = c22087.f71550;
        if (webView == null || c22087.f71552 != i) {
            return;
        }
        webView.evaluateJavascript(str, new ValueCallback() { // from class: l.ۖۚ᩹
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C22087.m49030(this.f8258, i, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49027(AssetManager assetManager, String str, String str2, boolean z, String str3, String str4) throws IOException {
        StringBuilder sbM30515 = C12278.m30515("(function(){var root=document.documentElement;if(!root||root['__mt_html_inspector_7d26a6c9__request']!=='", str, "')return false;try{var bridge=window['", str4, "'],encode=JSON.stringify;var mount=");
        InputStream inputStreamOpen = assetManager.open("eruda.js");
        try {
            String strM45297 = C20010.m45297(inputStreamOpen, StandardCharsets.UTF_8);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30515, strM45297, ";root['__mt_html_inspector_7d26a6c9__']=mount(", str2, ",");
            sbM30515.append(z);
            sbM30515.append(",");
            sbM30515.append(str3);
            sbM30515.append(",function(command){try{return bridge.update('");
            return C22697.m50267(sbM30515, str, "',encode(command))===true;}catch(error){return false;}});delete root['__mt_html_inspector_7d26a6c9__request'];return true;}catch(error){return false;}})()");
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
