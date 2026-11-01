package l;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.۠ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6YZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7947 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebkitToCompatConverterBoundaryInterface f26110;

    public C7947(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f26110 = webkitToCompatConverterBoundaryInterface;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5124 m20976(WebSettings webSettings) {
        return new C5124((WebSettingsBoundaryInterface) C15423.m36894(WebSettingsBoundaryInterface.class, this.f26110.convertSettings(webSettings)));
    }
}
