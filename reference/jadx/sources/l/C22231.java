package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩷ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22231 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22977 f71618;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15517 f71619;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f71620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final MessageDigest f71621;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22231(C22977 c22977, InputStream inputStream, C15517 c15517, long j) {
        super(inputStream);
        this.f71618 = c22977;
        this.f71621 = C15022.m36179();
        this.f71619 = c15517;
        this.f71620 = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f71618.f74615.m17002(this.f71619);
        if (this.f71620 == 0) {
            return -1;
        }
        int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, this.f71620));
        if (i3 <= 0) {
            throw new IOException("Download source ended before Content-Length");
        }
        this.f71620 -= (long) i3;
        this.f71621.update(bArr, i, i3);
        this.f71618.f74615.m17003(this.f71619, i3);
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
