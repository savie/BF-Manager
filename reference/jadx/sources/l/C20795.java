package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8MH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20795 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66601;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f66602;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f66603;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f66604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f66605;

    public C20795(int i) {
        this.f66603 = i;
        byte[] bArr = new byte[131];
        this.f66602 = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47578() {
        this.f66604 = false;
        this.f66601 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47576() {
        return this.f66601;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47579(int i) {
        C20782.m47568(!this.f66604);
        boolean z = i == this.f66603;
        this.f66604 = z;
        if (z) {
            this.f66605 = 3;
            this.f66601 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47575(int i, int i2, byte[] bArr) {
        if (this.f66604) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f66602;
            int length = bArr2.length;
            int i4 = this.f66605;
            if (length < i4 + i3) {
                this.f66602 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f66602, this.f66605, i3);
            this.f66605 += i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47577(int i) {
        if (!this.f66604) {
            return false;
        }
        this.f66605 -= i;
        this.f66604 = false;
        this.f66601 = true;
        return true;
    }
}
