package l;

import android.print.PrintAttributes;
import android.print.PrintManager;
import android.webkit.JsPromptResult;
import android.webkit.WebView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۢۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D6J8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9811 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19105 f31595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ActivityC3846 f31596;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f31597;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f31598;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WebView f31599;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final RunnableC3581 f31600;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f31601;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f31602;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f31603;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18762 f31604;

    public C9811(ActivityC3846 activityC3846, WebView webView) {
        String str = "__mt_print_" + UUID.randomUUID().toString().replace("-", "");
        this.f31598 = str;
        this.f31600 = new RunnableC3581(1, this);
        this.f31602 = true;
        this.f31596 = activityC3846;
        this.f31599 = webView;
        String strM34865 = C14442.m34865("(function(){'use strict';if(window!==window.top)return;var prompt=window.prompt;window.print=function(){prompt.call(window,'", str, "','');};})();");
        this.f31597 = strM34865;
        if (C11972.m30031("DOCUMENT_START_SCRIPT")) {
            this.f31595 = C11646.m29277(webView, strM34865, Collections.singleton("*"));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25573() {
        this.f31602 = true;
        this.f31601 = false;
        this.f31599.removeCallbacks(this.f31600);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25571(String str) {
        if (this.f31603) {
            return;
        }
        WebView webView = this.f31599;
        if (C17359.equals(str, webView.getUrl())) {
            this.f31602 = false;
            if (this.f31595 == null) {
                webView.evaluateJavascript(this.f31597, null);
            }
            if (this.f31601) {
                webView.post(this.f31600);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25572(String str, String str2, JsPromptResult jsPromptResult) {
        if (!this.f31598.equals(str2)) {
            return false;
        }
        jsPromptResult.confirm("");
        if (!this.f31603) {
            ActivityC3846 activityC3846 = this.f31596;
            if (!activityC3846.isFinishing() && !activityC3846.isDestroyed() && !this.f31601 && this.f31604 == null) {
                WebView webView = this.f31599;
                if (C17359.equals(str, webView.getUrl())) {
                    this.f31601 = true;
                    if (!this.f31602) {
                        webView.post(this.f31600);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25567(C9811 c9811) {
        WebView webView = c9811.f31599;
        ActivityC3846 activityC3846 = c9811.f31596;
        if (c9811.f31603 || c9811.f31602 || !c9811.f31601 || c9811.f31604 != null) {
            return;
        }
        c9811.f31601 = false;
        if (activityC3846.isFinishing() || activityC3846.isDestroyed()) {
            return;
        }
        try {
            PrintManager printManager = (PrintManager) activityC3846.getSystemService("print");
            if (printManager == null) {
                throw new IllegalStateException("Print service unavailable");
            }
            String title = webView.getTitle();
            if (title == null || title.trim().isEmpty()) {
                title = activityC3846.getString(R.string.MT_Protector);
            }
            C18762 c18762 = new C18762(c9811, webView.createPrintDocumentAdapter(title));
            c9811.f31604 = c18762;
            if (printManager.print(title, c18762, new PrintAttributes.Builder().build()) == null) {
                throw new IllegalStateException("Print job unavailable");
            }
        } catch (RuntimeException unused) {
            C18762 c18763 = c9811.f31604;
            if (c18763 != null) {
                c18763.onFinish();
            }
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25570() {
        if (this.f31603) {
            return;
        }
        this.f31603 = true;
        this.f31601 = false;
        this.f31599.removeCallbacks(this.f31600);
        C19105 c19105 = this.f31595;
        if (c19105 != null) {
            c19105.m44225();
        }
        C18762 c18762 = this.f31604;
        if (c18762 != null) {
            c18762.onFinish();
        }
    }
}
