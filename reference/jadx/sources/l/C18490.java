package l;

import android.os.Build;
import android.webkit.WebSettings;

/* JADX INFO: renamed from: l.ᩴۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18490 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42881(WebSettings webSettings, int i) {
        C5790 c5790 = C6535.f22004;
        if (c5790.mo1242()) {
            C9319.m23942(webSettings, i);
        } else {
            if (c5790.mo3563()) {
                m42880(webSettings).mo14277(i);
                return;
            }
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42883(WebSettings webSettings) {
        if (C6535.f22002.mo3563()) {
            m42880(webSettings).mo14278();
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @Deprecated
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m42882(WebSettings webSettings) {
        if (C6535.f22003.mo3563()) {
            m42880(webSettings).mo14276();
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5124 m42880(WebSettings webSettings) {
        try {
            return C21352.m47881().m20976(webSettings);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                return new C22058(null);
            }
            throw e;
        }
    }
}
