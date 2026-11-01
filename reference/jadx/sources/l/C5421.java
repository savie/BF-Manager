package l;

import java.io.InputStream;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.ۚܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes3.dex */
public final class C5421 implements InterfaceC6832 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f18721 = {0, 3, 6, 7, 8};

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4353(byte[] bArr, int i) {
        return C6603.m17906(i, bArr);
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final long mo4350(InterfaceC7739 interfaceC7739) {
        return C6603.m17905(interfaceC7739);
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo4351(InputStream inputStream) {
        return C10362.m26260(inputStream);
    }

    @Override // l.InterfaceC6832
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo4352(OutputStream outputStream, int i, long j) {
        OutputStream outputStreamM26261 = C10362.m26261(outputStream, f18721[i]);
        return (j <= 0 || !(outputStreamM26261 instanceof NativeXZOutputStream)) ? outputStreamM26261 : new C23061((NativeXZOutputStream) outputStreamM26261, j);
    }
}
