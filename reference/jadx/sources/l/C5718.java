package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: renamed from: l.ۚܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes3.dex */
public final class C5718 implements InterfaceC1989 {
    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final long mo6815(InterfaceC17713 interfaceC17713) {
        return -1L;
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6818(byte[] bArr, int i) {
        if (i < 2) {
            return false;
        }
        byte b = bArr[0];
        int i2 = b & 255;
        return (b & 15) == 8 && ((i2 >> 4) & 15) <= 7 && ((i2 << 8) + (bArr[1] & 255)) % 31 == 0;
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo6816(InputStream inputStream) {
        return new InflaterInputStream(inputStream, new Inflater(), 65536);
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo6817(OutputStream outputStream, int i, long j) {
        throw new UnsupportedOperationException();
    }
}
