package l;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19888 implements InterfaceC1989 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f63994 = {1, 3, 5, 7, 9};

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final long mo6815(InterfaceC17713 interfaceC17713) {
        return -1L;
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6818(byte[] bArr, int i) {
        return i >= 3 && (bArr[0] & 255) == 66 && (bArr[1] & 255) == 90 && (bArr[2] & 255) == 104;
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo6816(InputStream inputStream) {
        return new C1024(new BufferedInputStream(inputStream, 65536));
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo6817(OutputStream outputStream, int i, long j) {
        return new C2515(new BufferedOutputStream(outputStream, 65536), f63994[i]);
    }
}
