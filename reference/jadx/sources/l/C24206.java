package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6JG */
/* JADX INFO: loaded from: classes.dex */
public final class C24206 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f78436;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78437;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f78438;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f78440;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6306 f78441;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f78442;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f78443;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f78445;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f78446;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f78444 = new byte[27];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f78439 = new byte[255];

    public C24206(C6306 c6306, long j) {
        this.f78441 = c6306;
        this.f78445 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 m54194(int i) throws IOException {
        boolean z;
        int i2;
        int i3;
        int i4 = 1024;
        C6178 c6178 = new C6178(1024);
        byte[] bArr = new byte[65025];
        while (true) {
            int i5 = this.f78438;
            int i6 = this.f78436;
            C6306 c6306 = this.f78441;
            byte[] bArr2 = this.f78439;
            if (i5 == i6) {
                if (!this.f78437) {
                    int i7 = this.f78443 + 1;
                    this.f78443 = i7;
                    if (i7 > i4) {
                        break;
                    }
                    long j = this.f78442;
                    long j2 = this.f78445;
                    long j3 = j2 - j;
                    byte[] bArr3 = this.f78444;
                    if (j3 < bArr3.length) {
                        break;
                    }
                    C6262.m17908(c6306, j, bArr3, 0, bArr3.length);
                    this.f78442 += (long) bArr3.length;
                    byte b = bArr3[5];
                    if (C6262.m17909("OggS", 0, bArr3) && bArr3[4] == 0 && (b & 248) == 0) {
                        if (((b & 1) != 0) == (c6178.size() != 0)) {
                            long jM19208 = ((long) C6929.m19208(14, bArr3)) & 4294967295L;
                            long jM19209 = ((long) C6929.m19208(18, bArr3)) & 4294967295L;
                            if (this.f78443 == 1) {
                                if ((b & 2) == 0 || jM19209 != 0) {
                                    throw new IOException("Missing Ogg stream start");
                                }
                                this.f78446 = jM19208;
                            } else if (jM19208 != this.f78446 || jM19209 != this.f78440 || (b & 2) != 0) {
                                throw new IOException("Ogg stream or sequence changed");
                            }
                            this.f78440 = 4294967295L & (jM19209 + 1);
                            this.f78437 = (b & 4) != 0;
                            int i8 = bArr3[26] & 255;
                            this.f78436 = i8;
                            this.f78438 = 0;
                            long j4 = i8;
                            long j5 = this.f78442;
                            if (j4 > j2 - j5) {
                                throw new IOException("Truncated Ogg segment table");
                            }
                            C6262.m17908(c6306, j5, bArr2, 0, i8);
                            this.f78442 += (long) this.f78436;
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                i3 = this.f78436;
                                if (i9 >= i3) {
                                    break;
                                }
                                i10 += bArr2[i9] & 255;
                                i9++;
                            }
                            if (i10 > j2 - this.f78442) {
                                throw new IOException("Truncated Ogg page payload");
                            }
                            if (i3 == 0) {
                                continue;
                            }
                            i4 = 1024;
                        }
                    }
                    throw new IOException("Invalid Ogg page or continuation");
                }
                break;
            }
            int i11 = 0;
            while (true) {
                int i12 = this.f78438;
                if (i12 >= this.f78436) {
                    z = false;
                    i2 = i11;
                    break;
                }
                this.f78438 = i12 + 1;
                int i13 = bArr2[i12] & 255;
                i11 += i13;
                if (i13 < 255) {
                    i2 = i11;
                    z = true;
                    break;
                }
            }
            if (i2 > i - c6178.size()) {
                throw new IOException("Ogg packet exceeds limit");
            }
            C6262.m17908(c6306, this.f78442, bArr, 0, i2);
            this.f78442 += (long) i2;
            c6178.write(bArr, 0, i2);
            if (z) {
                return new C21287(c6178.m17808(), c6178.size());
            }
            i4 = 1024;
        }
        throw new IOException("Truncated or excessive Ogg pages");
    }
}
