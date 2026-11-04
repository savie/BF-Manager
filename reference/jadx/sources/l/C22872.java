package l;

import java.io.InputStream;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.᩸ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes.dex */
public final class C22872 implements InterfaceC1989 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f74328 = {0, 3, 6, 7, 8};

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6818(byte[] bArr, int i) {
        return C21030.m48048(i, bArr);
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final long mo6815(InterfaceC17713 interfaceC17713) {
        return C21030.m48047(interfaceC17713);
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo6816(InputStream inputStream) {
        return C24653.m55007(inputStream);
    }

    @Override // l.InterfaceC1989
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo6817(OutputStream outputStream, int i, long j) {
        OutputStream outputStreamM55008 = C24653.m55008(outputStream, f74328[i]);
        return (j <= 0 || !(outputStreamM55008 instanceof NativeXZOutputStream)) ? outputStreamM55008 : new C11683((NativeXZOutputStream) outputStreamM55008, j);
    }
}
