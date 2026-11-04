package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C3194 extends AbstractC21094 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f10425;

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short mo10518(int i) {
        byte[] bArr = this.f10425;
        return (short) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8));
    }

    public C3194(byte[] bArr) {
        this.f10425 = bArr;
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte mo10516(int i) {
        return this.f10425[i];
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo10513(int i) {
        return C6929.m19208(i, this.f10425);
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo10515(int i) {
        return this.f10425[i] & 255;
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo10514(int i) {
        return C6929.m19212(i, this.f10425);
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10511(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f10425, i, bArr, 0, i2);
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo10510() {
        return this.f10425.length;
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10512(OutputStream outputStream) throws IOException {
        outputStream.write(this.f10425);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m10517() {
        return this.f10425;
    }
}
