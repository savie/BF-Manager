package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ۖܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2598 implements InterfaceC6832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f10186 = {1, 3, 6, 8, 9};

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4353(byte[] bArr, int i) {
        return i >= 2 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139;
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final long mo4350(InterfaceC7739 interfaceC7739) {
        interfaceC7739.seek(interfaceC7739.length() - 4);
        return ((long) interfaceC7739.readInt()) & 4294967295L;
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo4351(InputStream inputStream) {
        return new GZIPInputStream(inputStream, 65536);
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo4352(OutputStream outputStream, int i, long j) {
        return new C11772(outputStream, i);
    }
}
