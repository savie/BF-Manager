package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.۬ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1VQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13653 extends AbstractC8433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Uri f43356;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f43357;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6338 f43358;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f43359;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f43360;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f43361;

    public C13653(byte[] bArr) {
        C6338 c6338 = new C6338(bArr);
        super(false);
        this.f43358 = c6338;
        C20782.m47565(bArr.length > 0);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws C5976 {
        m22621(c25368);
        Uri uri = c25368.f81907;
        long j = c25368.f81910;
        this.f43356 = uri;
        byte[] bArr = (byte[]) this.f43358.f21461;
        this.f43360 = bArr;
        long j2 = c25368.f81909;
        if (j2 > bArr.length) {
            throw new C5976(2008);
        }
        int i = (int) j2;
        this.f43357 = i;
        int length = bArr.length - i;
        this.f43361 = length;
        if (j != -1) {
            this.f43361 = (int) Math.min(length, j);
        }
        this.f43359 = true;
        m22619(c25368);
        return j != -1 ? j : this.f43361;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f43361;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f43360;
        C20782.m47566(bArr2);
        System.arraycopy(bArr2, this.f43357, bArr, i, iMin);
        this.f43357 += iMin;
        this.f43361 -= iMin;
        m22622(iMin);
        return iMin;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f43356;
    }

    @Override // l.InterfaceC13433
    public final void close() {
        if (this.f43359) {
            this.f43359 = false;
            m22620();
        }
        this.f43356 = null;
        this.f43360 = null;
    }
}
