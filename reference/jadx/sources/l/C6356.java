package l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f21486;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Handler f21487 = new Handler(Looper.getMainLooper());

    public C6356(Context context) {
        this.f21486 = context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18075(C22018 c22018) {
        Handler handler = this.f21487;
        final C16796 c16796 = new C16796(this, c22018);
        try {
            if (C11972.m30031("DELETE_BROWSING_DATA")) {
                WebStorage webStorage = WebStorage.getInstance();
                Runnable runnable = new Runnable() { // from class: l.ܳۧܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c16796.accept(Boolean.TRUE);
                    }
                };
                ExecutorC22835 executorC22835 = new ExecutorC22835();
                if (C19580.f63139.mo27117()) {
                    C5410.m16135().m52380(webStorage).deleteBrowsingData(executorC22835, runnable);
                    return;
                }
                throw C19580.m45180();
            }
            C18495 c18495 = new C18495(this.f21486);
            try {
                c18495.clearCache(true);
                handler.post(new RunnableC7570(1, c18495));
                WebStorage.getInstance().deleteAllData();
                CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: l.۫ۧܳ
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        C16796 c16797 = c16796;
                        if (c16797.f54191) {
                            return;
                        }
                        WebStorage.getInstance().getOrigins(new C5610(this.f41803, c16797));
                    }
                });
            } catch (Throwable th) {
                handler.post(new RunnableC7570(1, c18495));
                throw th;
            }
        } catch (RuntimeException unused) {
            c16796.accept(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18073(final C6356 c6356, final C16796 c16796, Map map) {
        if (c16796.f54191) {
            return;
        }
        if (map != null) {
            for (Object obj : map.values()) {
                if (!(obj instanceof WebStorage.Origin) || ((WebStorage.Origin) obj).getUsage() != 0) {
                    c6356.f21487.postDelayed(new Runnable() { // from class: l.ۧۧܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16796 c16797 = c16796;
                            if (c16797.f54191) {
                                return;
                            }
                            WebStorage.getInstance().getOrigins(new C5610(this.f36373, c16797));
                        }
                    }, 50L);
                    return;
                }
            }
        }
        c16796.accept(Boolean.TRUE);
    }
}
