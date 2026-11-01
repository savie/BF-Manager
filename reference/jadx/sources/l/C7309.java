package l;

import android.os.Message;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7309 implements InterfaceC7359, InterfaceC8773, InterfaceC17045, InterfaceC19782 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m19505(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19506(int i, String str) {
        C0303.m1848(str + i);
    }

    @Override // l.InterfaceC8773
    /* JADX INFO: renamed from: ۙ */
    public void mo5624(Object obj, Message message) {
        ((C20556) obj).m46358();
    }

    @Override // l.InterfaceC17045
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo19507(byte[] bArr) {
        return Arrays.equals(bArr, C14454.f47399);
    }

    @Override // l.InterfaceC19782
    public void accept(Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        if (closeable != null) {
            closeable.close();
        }
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }
}
