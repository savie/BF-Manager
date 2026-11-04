package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܳᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V1VQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15552 implements InterfaceC17044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f50592;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f50593;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50594;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f50595;

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
        return C2129.m7329(this);
    }

    public C15552(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException();
        }
        this.f50592 = bArr;
        this.f50595 = i;
        this.f50593 = i2;
        this.f50594 = 0;
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ᩷ */
    public final long mo32882() {
        return size() - mo32877();
    }

    @Override // l.InterfaceC17044
    public final long size() {
        return this.f50593;
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final long mo32877() {
        return this.f50594;
    }

    @Override // l.InterfaceC17044
    public final void reset() {
        this.f50594 = 0;
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ */
    public final void mo32879(OutputStream outputStream, long j) throws IOException {
        if (j > mo32882()) {
            throw new EOFException();
        }
        outputStream.write(this.f50592, this.f50595 + this.f50594, (int) j);
        this.f50594 = (int) (((long) this.f50594) + j);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] m37265() {
        return this.f50592;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m37264() {
        return this.f50595;
    }
}
