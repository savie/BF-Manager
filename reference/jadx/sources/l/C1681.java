package l;

import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: renamed from: l.֫ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06IW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1681 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebViewProviderBoundaryInterface f5787;

    public C1681(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f5787 = webViewProviderBoundaryInterface;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6028(String str, String[] strArr, C11021 c11021) {
        this.f5787.addWebMessageListener(str, strArr, C8372.m22532(new C2697(c11021)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19105 m6026(String str, String[] strArr) {
        return C19105.m44224(this.f5787.addDocumentStartJavaScript(str, strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6027(String str) {
        this.f5787.removeWebMessageListener(str);
    }
}
