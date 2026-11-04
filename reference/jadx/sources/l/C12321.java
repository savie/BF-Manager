package l;

import android.webkit.WebStorage;
import com.alipay.sdk.m.w.a;

/* JADX INFO: renamed from: l.ۨۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12321 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39593;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f39594;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18495 f39595;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final RunnableC16050 f39596 = new Runnable() { // from class: l.ܶۧܳ
        @Override // java.lang.Runnable
        public final void run() {
            this.f52051.m30728(false);
        }
    };

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6356 f39597;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10829 f39598;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f39599;

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ܶۧܳ] */
    public C12321(C6356 c6356, String str, C10829 c10829) {
        this.f39597 = c6356;
        this.f39599 = str;
        this.f39598 = c10829;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30736() {
        C6356 c6356 = this.f39597;
        c6356.f21487.postDelayed(this.f39596, 10000L);
        try {
            C18495 c18495 = new C18495(c6356.f21486);
            this.f39595 = c18495;
            c18495.getSettings().setJavaScriptEnabled(true);
            this.f39595.getSettings().setDomStorageEnabled(true);
            this.f39595.getSettings().setAllowFileAccess(false);
            this.f39595.getSettings().setAllowContentAccess(false);
            this.f39595.getSettings().setBlockNetworkLoads(true);
            this.f39595.setWebViewClient(new C20526(this));
            this.f39595.loadDataWithBaseURL(this.f39599 + "/", "<!doctype html><html></html>", "text/html", a.D, null);
        } catch (RuntimeException unused) {
            m30728(false);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m30731(C12321 c12321) {
        if (c12321.f39594) {
            return;
        }
        WebStorage.getInstance().getUsageForOrigin(c12321.f39599, new C23510(c12321));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30734(C12321 c12321) {
        if (c12321.f39594) {
            return;
        }
        WebStorage.getInstance().getUsageForOrigin(c12321.f39599, new C23510(c12321));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30727(final C12321 c12321, Long l2) {
        if (c12321.f39594) {
            return;
        }
        if (l2 == null || l2.longValue() != 0) {
            c12321.f39597.f21487.postDelayed(new Runnable() { // from class: l.ܽۧܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12321.m30734(this.f57019);
                }
            }, 50L);
        } else {
            c12321.m30728(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30728(boolean z) {
        if (this.f39594) {
            return;
        }
        this.f39594 = true;
        this.f39597.f21487.removeCallbacks(this.f39596);
        C18495 c18495 = this.f39595;
        if (c18495 != null) {
            c18495.stopLoading();
            this.f39595.destroy();
            this.f39595 = null;
        }
        this.f39598.accept(Boolean.valueOf(z));
    }
}
