package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩺ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1VQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22776 implements InterfaceC19248 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f74150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f74151;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74152;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f74153;

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo25491(long j, C1388 c1388) {
        C17836.m41424(this, c1388, j);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo25493(MessageDigest messageDigest, long j) {
        C17836.m41423(this, messageDigest, j);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ InterfaceC19248 mo25494() {
        return C17836.m41421(this);
    }

    public C22776(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException();
        }
        this.f74151 = bArr;
        this.f74150 = i;
        this.f74152 = i2;
        this.f74153 = 0;
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ܰ */
    public final long mo25495() {
        return size() - mo25490();
    }

    @Override // l.InterfaceC19248
    public final long size() {
        return this.f74152;
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final long mo25490() {
        return this.f74153;
    }

    @Override // l.InterfaceC19248
    public final void reset() {
        this.f74153 = 0;
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final void mo25492(OutputStream outputStream, long j) throws IOException {
        if (j > mo25495()) {
            throw new EOFException();
        }
        outputStream.write(this.f74151, this.f74150 + this.f74153, (int) j);
        this.f74153 = (int) (((long) this.f74153) + j);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m50429() {
        return this.f74151;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m50430() {
        return this.f74150;
    }
}
