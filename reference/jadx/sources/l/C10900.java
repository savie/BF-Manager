package l;

import android.os.Build;
import android.webkit.WebSettings;

/* JADX INFO: renamed from: l.ۤ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 56YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10900 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27664(WebSettings webSettings, int i) {
        C12392 c12392 = C19580.f63142;
        if (c12392.mo11211()) {
            C21343.m48572(webSettings, i);
        } else {
            if (c12392.mo27117()) {
                m27663(webSettings).mo19744(i);
                return;
            }
            throw C19580.m45180();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m27666(WebSettings webSettings) {
        if (C19580.f63137.mo27117()) {
            m27663(webSettings).mo19748();
            return;
        }
        throw C19580.m45180();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m27665(WebSettings webSettings) {
        if (C19580.f63141.mo27117()) {
            m27663(webSettings).mo19746();
            return;
        }
        throw C19580.m45180();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7172 m27663(WebSettings webSettings) {
        try {
            return C5410.m16135().m52381(webSettings);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                return new C13883(null);
            }
            throw e;
        }
    }
}
