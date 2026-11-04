package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A1VX */
/* JADX INFO: loaded from: classes.dex */
public final class C25250 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13961 f81574;

    public C25250(C13961 c13961) {
        this.f81574 = c13961;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f81574.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f81574.write(bArr, i, i2);
    }
}
