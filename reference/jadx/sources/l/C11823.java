package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۧᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A1VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11823 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f38150;

    public C11823(MessageDigest messageDigest) {
        this.f38150 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f38150.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f38150.update(bArr, i, i2);
    }
}
