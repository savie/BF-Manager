package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ᩴ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1VQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18606 extends AbstractC21428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f59210;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Uri f59211;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f59212;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23396 f59213;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f59214;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f59215;

    public C18606(byte[] bArr) {
        C23396 c23396 = new C23396(bArr);
        super(false);
        this.f59213 = c23396;
        C2023.m6507(bArr.length > 0);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws C20018 {
        m48019(c12257);
        Uri uri = c12257.f41015;
        long j = c12257.f41017;
        this.f59211 = uri;
        byte[] bArr = (byte[]) this.f59213.f75785;
        this.f59215 = bArr;
        long j2 = c12257.f41009;
        if (j2 > bArr.length) {
            throw new C20018(2008);
        }
        int i = (int) j2;
        this.f59214 = i;
        int length = bArr.length - i;
        this.f59212 = length;
        if (j != -1) {
            this.f59212 = (int) Math.min(length, j);
        }
        this.f59210 = true;
        m48018(c12257);
        return j != -1 ? j : this.f59212;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f59212;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f59215;
        C2023.m6508(bArr2);
        System.arraycopy(bArr2, this.f59214, bArr, i, iMin);
        this.f59214 += iMin;
        this.f59212 -= iMin;
        m48017(iMin);
        return iMin;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f59211;
    }

    @Override // l.InterfaceC15785
    public final void close() {
        if (this.f59210) {
            this.f59210 = false;
            m48020();
        }
        this.f59211 = null;
        this.f59215 = null;
    }
}
