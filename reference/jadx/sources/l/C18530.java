package l;

import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.ᩴۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G71Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C18530 implements InterfaceC17824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebViewProviderFactoryBoundaryInterface f58989;

    public C18530(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f58989 = webViewProviderFactoryBoundaryInterface;
    }

    @Override // l.InterfaceC17824
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C15423.m36894(WebkitToCompatConverterBoundaryInterface.class, this.f58989.getWebkitToCompatConverter());
    }

    @Override // l.InterfaceC17824
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C15423.m36894(StaticsBoundaryInterface.class, this.f58989.getStatics());
    }

    @Override // l.InterfaceC17824
    /* JADX INFO: renamed from: ۙ */
    public final String[] mo12345() {
        return this.f58989.getSupportedFeatures();
    }

    @Override // l.InterfaceC17824
    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) C15423.m36894(DropDataContentProviderBoundaryInterface.class, this.f58989.getDropDataProvider());
    }
}
