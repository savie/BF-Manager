package l;

import com.alipay.sdk.m.b0.a;

/* JADX INFO: renamed from: l.۬᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9IV */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC14208 implements InterfaceC22896 {
    AES_128_CCM(1, "AES/CCM/NoPadding", 11, 16),
    AES_128_GCM(2, a.f, 12, 16),
    AES_256_CCM(3, "AES/CCM/NoPadding", 11, 32),
    AES_256_GCM(4, a.f, 12, 32);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f44902;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f44903;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f44904;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f44905;

    EnumC14208(long j, String str, int i, int i2) {
        this.f44902 = j;
        this.f44903 = str;
        this.f44904 = i;
        this.f44905 = i2;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f44902;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m34491() {
        return this.f44903;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int m34492() {
        return this.f44904;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m34493() {
        return this.f44905;
    }
}
