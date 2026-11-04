package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ᩴ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19498 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f62937;

    public C19498(MessageDigest messageDigest) {
        this.f62937 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f62937.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f62937.update(bArr, i, i2);
    }
}
