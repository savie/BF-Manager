package l;

import com.alipay.sdk.m.b0.a;

/* JADX INFO: renamed from: l.᩵ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9IV */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19532 implements InterfaceC15861 {
    AES_128_CCM(1, "AES/CCM/NoPadding", 11, 16),
    AES_128_GCM(2, a.f, 12, 16),
    AES_256_CCM(3, "AES/CCM/NoPadding", 11, 32),
    AES_256_GCM(4, a.f, 12, 32);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f62801;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f62802;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f62803;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62804;

    EnumC19532(long j, String str, int i, int i2) {
        this.f62803 = j;
        this.f62802 = str;
        this.f62801 = i;
        this.f62804 = i2;
    }

    @Override // l.InterfaceC15861
    public long getValue() {
        return this.f62803;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m44612() {
        return this.f62802;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int m44613() {
        return this.f62801;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m44614() {
        return this.f62804;
    }
}
