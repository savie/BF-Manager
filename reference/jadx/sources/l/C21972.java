package l;

import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.᩹֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes5.dex */
public final class C21972 implements InterfaceC8951 {
    @Override // l.InterfaceC8951
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21625(int i) {
        int i2 = NativeXZOutputStream.f77883;
        return i >= 0 && i <= 9;
    }

    @Override // l.InterfaceC8951
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo21624(OutputStream outputStream, int i) {
        return new NativeXZOutputStream(outputStream, i);
    }
}
