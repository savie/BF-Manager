package l;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩹ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes.dex */
public final class C22355 implements InterfaceC6832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f73027 = {1, 3, 5, 7, 9};

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final long mo4350(InterfaceC7739 interfaceC7739) {
        return -1L;
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4353(byte[] bArr, int i) {
        return i >= 3 && (bArr[0] & 255) == 66 && (bArr[1] & 255) == 90 && (bArr[2] & 255) == 104;
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo4351(InputStream inputStream) {
        return new C6624(new BufferedInputStream(inputStream, 65536));
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo4352(OutputStream outputStream, int i, long j) {
        return new C15092(new BufferedOutputStream(outputStream, 65536), f73027[i]);
    }
}
