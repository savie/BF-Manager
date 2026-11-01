package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8MH */
/* JADX INFO: loaded from: classes.dex */
public final class C23906 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f77457;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77458;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f77459;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f77460;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f77461;

    public C23906(int i) {
        this.f77459 = i;
        byte[] bArr = new byte[131];
        this.f77460 = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52733() {
        this.f77461 = false;
        this.f77458 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52731() {
        return this.f77458;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52734(int i) {
        C2023.m6510(!this.f77461);
        boolean z = i == this.f77459;
        this.f77461 = z;
        if (z) {
            this.f77457 = 3;
            this.f77458 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52730(int i, int i2, byte[] bArr) {
        if (this.f77461) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f77460;
            int length = bArr2.length;
            int i4 = this.f77457;
            if (length < i4 + i3) {
                this.f77460 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f77460, this.f77457, i3);
            this.f77457 += i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52732(int i) {
        if (!this.f77461) {
            return false;
        }
        this.f77457 -= i;
        this.f77461 = false;
        this.f77458 = true;
        return true;
    }
}
