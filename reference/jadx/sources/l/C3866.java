package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3866 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22918 f14458;

    public C3866(C22918 c22918) {
        this.f14458 = c22918;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f14458.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f14458.write(i);
    }
}
