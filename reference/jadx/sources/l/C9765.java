package l;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9765 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m25437(InterfaceC0817 interfaceC0817) {
        InputStream inputStream = interfaceC0817.getInputStream();
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
    }
}
