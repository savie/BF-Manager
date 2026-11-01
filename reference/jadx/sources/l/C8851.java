package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۡۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8851 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f30388;

    public C8851(MessageDigest messageDigest) {
        this.f30388 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f30388.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f30388.update(bArr, i, i2);
    }
}
