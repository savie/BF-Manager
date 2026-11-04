package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩵ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20511 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f65714;

    public C20511(MessageDigest messageDigest) {
        this.f65714 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f65714.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f65714.update(bArr, i, i2);
    }
}
