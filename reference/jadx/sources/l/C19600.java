package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩵ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19600 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9017 f62934;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f62935;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17367 f62936;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CRC32 f62937 = new CRC32();

    public C19600(C9017 c9017, int i) {
        this.f62934 = c9017;
        byte[] bArr = new byte[i];
        this.f62935 = bArr;
        this.f62936 = new C17367(bArr);
    }
}
