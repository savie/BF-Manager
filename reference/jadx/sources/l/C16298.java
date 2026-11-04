package l;

import java.io.EOFException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܶᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G1W6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16298 implements InterfaceC17044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f52911;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f52912;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC17713 f52913;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f52914;

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo32878(long j, C13961 c13961) {
        C2129.m7331(this, c13961, j);
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo32880(MessageDigest messageDigest, long j) {
        C2129.m7330(this, messageDigest, j);
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ InterfaceC17044 mo32881() {
        return C2129.m7329((InterfaceC17044) this);
    }

    public C16298(InterfaceC17713 interfaceC17713, long j, long j2) {
        this.f52913 = interfaceC17713;
        this.f52914 = j;
        this.f52912 = j2;
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ᩷ */
    public final long mo32882() {
        return size() - mo32877();
    }

    @Override // l.InterfaceC17044
    public final long size() {
        return this.f52912;
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final long mo32877() {
        return this.f52911;
    }

    @Override // l.InterfaceC17044
    public final void reset() {
        this.f52911 = 0L;
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final void mo32879(OutputStream outputStream, long j) {
        int i;
        if (j > mo32882()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[4096];
        long j2 = this.f52914 + this.f52911;
        InterfaceC17713 interfaceC17713 = this.f52913;
        interfaceC17713.seek(j2);
        while (j > 0 && (i = interfaceC17713.read(bArr, 0, (int) Math.min(j, 4096))) != -1) {
            outputStream.write(bArr, 0, i);
            long j3 = i;
            j -= j3;
            this.f52911 += j3;
        }
        if (j != 0) {
            throw new IllegalStateException(C24770.m55292(j, "Remaining length: "));
        }
    }
}
