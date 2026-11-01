package l;

import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.ۙۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4418 implements InterfaceC17824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f15717 = new String[0];

    @Override // l.InterfaceC17824
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // l.InterfaceC17824
    public final StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // l.InterfaceC17824
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] mo12345() {
        return f15717;
    }

    @Override // l.InterfaceC17824
    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
