package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩶ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21235 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f67762;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20348 f67763;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CRC32 f67764 = new CRC32();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18251 f67765;

    public C21235(C18251 c18251, int i) {
        this.f67765 = c18251;
        byte[] bArr = new byte[i];
        this.f67762 = bArr;
        this.f67763 = new C20348(bArr);
    }
}
