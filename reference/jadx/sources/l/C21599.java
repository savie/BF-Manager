package l;

import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.᩶᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes.dex */
public final class C21599 implements InterfaceC6753 {
    @Override // l.InterfaceC6753
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18855(int i) {
        int i2 = NativeXZOutputStream.f81999;
        return i >= 0 && i <= 9;
    }

    @Override // l.InterfaceC6753
    /* JADX INFO: renamed from: ۙ */
    public final OutputStream mo18854(OutputStream outputStream, int i) {
        return new NativeXZOutputStream(outputStream, i);
    }
}
