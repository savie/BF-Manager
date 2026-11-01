package l;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ᩴۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18542 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f59009;

    public C18542(MessageDigest messageDigest) {
        this.f59009 = messageDigest;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f59009.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f59009.update(bArr, i, i2);
    }
}
