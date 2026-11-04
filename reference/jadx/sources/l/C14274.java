package l;

import android.content.res.AssetManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܰ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6ZG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14274 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45098;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f45099;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public WebView f45100;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f45101;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3834 f45102;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f45103;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20988 f45104;

    public C14274(WebView webView) {
        InterfaceC9801 interfaceC9801 = C21576.f68931;
        String str = "__mt_inspector_settings_" + UUID.randomUUID().toString().replace("-", "");
        this.f45101 = str;
        this.f45100 = webView;
        C20988 c20988 = new C20988(interfaceC9801);
        this.f45104 = c20988;
        C3834 c3834 = new C3834(c20988);
        this.f45102 = c3834;
        webView.addJavascriptInterface(c3834, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34682() {
        this.f45098++;
        this.f45099 = false;
        this.f45103 = false;
        C3834.m12372(this.f45102, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34680(final boolean z) {
        if (this.f45100 == null || this.f45099) {
            return;
        }
        this.f45099 = true;
        final int i = this.f45098;
        final String string = UUID.randomUUID().toString();
        final AssetManager assets = this.f45100.getContext().getAssets();
        final String strQuote = JSONObject.quote(C4767.m14707(this.f45100.getResources()).toLanguageTag());
        this.f45100.evaluateJavascript(C14442.m34865("(function(){var root=document.documentElement;if(!root)return false;var state=root['__mt_html_inspector_7d26a6c9__'];if(state){state.show();return true;}root['__mt_html_inspector_7d26a6c9__request']='", string, "';return false;})()"), new ValueCallback() { // from class: l.᩵֫ܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                boolean z2 = z;
                C14274.m34677(i, assets, this.f64946, string, strQuote, (String) obj, z2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34673(final int i, AssetManager assetManager, final C14274 c14274, String str, String str2, String str3, boolean z) {
        try {
            final String strM34672 = m34672(assetManager, str, str2, z, str3, c14274.f45101);
            C21576.m49077().post(new Runnable() { // from class: l.ۛ֫ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14274.m34678(this.f20723, i, strM34672);
                }
            });
        } catch (IOException unused) {
            C21576.m49077().post(new RunnableC2090(i, 1, c14274));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34675(C14274 c14274, int i, String str) {
        boolean zEquals = "true".equals(str);
        if (c14274.f45100 == null || c14274.f45098 != i) {
            return;
        }
        c14274.f45099 = false;
        c14274.f45103 = zEquals;
        if (zEquals) {
            return;
        }
        C3834.m12372(c14274.f45102, null);
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34681(final RunnableC22205 runnableC22205) {
        if (this.f45099) {
            this.f45098++;
            this.f45099 = false;
            this.f45103 = true;
            this.f45100.evaluateJavascript("(function(){var root=document.documentElement;delete root['__mt_html_inspector_7d26a6c9__request'];var state=root['__mt_html_inspector_7d26a6c9__'];if(state)state.hide();})()", null);
            return true;
        }
        WebView webView = this.f45100;
        if (webView == null || !this.f45103) {
            return false;
        }
        final int i = this.f45098;
        webView.evaluateJavascript("(function(){var state=document.documentElement['__mt_html_inspector_7d26a6c9__'];return !!(state&&state.hide());})()", new ValueCallback() { // from class: l.ۗ֫ܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C14274.m34676(this.f10015, i, runnableC22205, (String) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34679() {
        m34682();
        WebView webView = this.f45100;
        if (webView != null) {
            webView.removeJavascriptInterface(this.f45101);
        }
        this.f45100 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34674(C14274 c14274, int i) {
        if (c14274.f45100 == null || c14274.f45098 != i) {
            return;
        }
        c14274.f45099 = false;
        c14274.f45103 = false;
        C3834.m12372(c14274.f45102, null);
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34676(C14274 c14274, int i, RunnableC22205 runnableC22205, String str) {
        if (c14274.f45100 == null || c14274.f45098 != i || "true".equals(str)) {
            return;
        }
        runnableC22205.run();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m34677(final int i, final AssetManager assetManager, final C14274 c14274, final String str, final String str2, String str3, final boolean z) {
        if (c14274.f45100 == null || c14274.f45098 != i) {
            return;
        }
        if ("true".equals(str3)) {
            c14274.f45099 = false;
            c14274.f45103 = true;
        } else {
            C3834.m12372(c14274.f45102, str);
            final String string = c14274.f45104.m47972().toString();
            C5261.f18538.execute(new Runnable() { // from class: l.ۨ֫ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14274.m34673(i, assetManager, c14274, str, str2, string, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m34678(final C14274 c14274, final int i, String str) {
        WebView webView = c14274.f45100;
        if (webView == null || c14274.f45098 != i) {
            return;
        }
        webView.evaluateJavascript(str, new ValueCallback() { // from class: l.᩺֫ܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C14274.m34675(this.f77574, i, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34672(AssetManager assetManager, String str, String str2, boolean z, String str3, String str4) throws IOException {
        StringBuilder sbM10406 = C3188.m10406("(function(){var root=document.documentElement;if(!root||root['__mt_html_inspector_7d26a6c9__request']!=='", str, "')return false;try{var bridge=window['", str4, "'],encode=JSON.stringify;var mount=");
        InputStream inputStreamOpen = assetManager.open("eruda.js");
        try {
            String strM15490 = C5125.m15490(inputStreamOpen, StandardCharsets.UTF_8);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            C4794.m14774(sbM10406, strM15490, ";root['__mt_html_inspector_7d26a6c9__']=mount(", str2, ",");
            sbM10406.append(z);
            sbM10406.append(",");
            sbM10406.append(str3);
            sbM10406.append(",function(command){try{return bridge.update('");
            return C8947.m23910(sbM10406, str, "',encode(command))===true;}catch(error){return false;}});delete root['__mt_html_inspector_7d26a6c9__request'];return true;}catch(error){return false;}})()");
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
