package l;

import java.io.EOFException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۤۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1W6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10076 implements InterfaceC19248 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f34415;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f34416;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f34417;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC7739 f34418;

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo25491(long j, C1388 c1388) {
        C17836.m41424(this, c1388, j);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo25493(MessageDigest messageDigest, long j) {
        C17836.m41423(this, messageDigest, j);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19248 mo25494() {
        return C17836.m41421((InterfaceC19248) this);
    }

    public C10076(InterfaceC7739 interfaceC7739, long j, long j2) {
        this.f34418 = interfaceC7739;
        this.f34415 = j;
        this.f34417 = j2;
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long mo25495() {
        return size() - mo25490();
    }

    @Override // l.InterfaceC19248
    public final long size() {
        return this.f34417;
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo25490() {
        return this.f34416;
    }

    @Override // l.InterfaceC19248
    public final void reset() {
        this.f34416 = 0L;
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25492(OutputStream outputStream, long j) {
        int i;
        if (j > mo25495()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[4096];
        long j2 = this.f34415 + this.f34416;
        InterfaceC7739 interfaceC7739 = this.f34418;
        interfaceC7739.seek(j2);
        while (j > 0 && (i = interfaceC7739.read(bArr, 0, (int) Math.min(j, 4096))) != -1) {
            outputStream.write(bArr, 0, i);
            long j3 = i;
            j -= j3;
            this.f34416 += j3;
        }
        if (j != 0) {
            throw new IllegalStateException(C15489.m37074(j, "Remaining length: "));
        }
    }
}
