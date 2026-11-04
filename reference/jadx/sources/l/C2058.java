package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֫ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2058 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25179 f6850;

    public C2058(C25179 c25179) {
        this.f6850 = c25179;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f6850.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f6850.write(i);
    }
}
