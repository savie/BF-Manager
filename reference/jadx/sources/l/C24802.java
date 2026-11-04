package l;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.᩻ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G71Z */
/* JADX INFO: loaded from: classes.dex */
public final class C24802 implements InterfaceC11375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebViewProviderFactoryBoundaryInterface f80254;

    public C24802(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f80254 = webViewProviderFactoryBoundaryInterface;
    }

    @Override // l.InterfaceC11375
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C8372.m22531(WebViewProviderBoundaryInterface.class, this.f80254.createWebView(webView));
    }

    @Override // l.InterfaceC11375
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C8372.m22531(WebkitToCompatConverterBoundaryInterface.class, this.f80254.getWebkitToCompatConverter());
    }

    @Override // l.InterfaceC11375
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C8372.m22531(StaticsBoundaryInterface.class, this.f80254.getStatics());
    }

    @Override // l.InterfaceC11375
    /* JADX INFO: renamed from: ۙ */
    public final String[] mo2275() {
        return this.f80254.getSupportedFeatures();
    }

    @Override // l.InterfaceC11375
    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) C8372.m22531(DropDataContentProviderBoundaryInterface.class, this.f80254.getDropDataProvider());
    }
}
