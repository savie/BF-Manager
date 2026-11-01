package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes2.dex */
public final class C6857 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f23132;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f23132++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f23132 += (long) i2;
    }
}
