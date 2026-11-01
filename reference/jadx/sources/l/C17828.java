package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17828 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56462;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f56463;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f56464;

    public C17828(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Missing Seed for KDF");
        }
        this.f56463 = Arrays.copyOf(bArr, bArr.length);
        if (bArr2 == null) {
            this.f56464 = new byte[0];
        } else {
            this.f56464 = Arrays.copyOf(bArr2, bArr2.length);
        }
        this.f56462 = 32;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m41404() {
        return this.f56463;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m41405() {
        return this.f56464;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41403() {
        return this.f56462;
    }
}
