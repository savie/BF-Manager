package l;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۙܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4737 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m13105(InterfaceC13911 interfaceC13911) {
        InputStream inputStream = interfaceC13911.getInputStream();
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
    }
}
