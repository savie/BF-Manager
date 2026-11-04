package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩵۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20560 extends AbstractC2323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f65834;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10561 f65835;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f65836;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f65837;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5516 f65838;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f65839;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f65840;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f65841;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16281 f65842;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9771 f65843;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f65844;

    public C20560(int i, long j, int i2, long j2, boolean z, C10561 c10561, InterfaceC15670 interfaceC15670, InterfaceC15670 interfaceC15671, C16281 c16281, C5516 c5516, C9771 c9771) {
        this.f65841 = i;
        this.f65844 = j;
        this.f65836 = i2;
        this.f65834 = j2;
        this.f65840 = z;
        this.f65835 = c10561;
        this.f65837 = interfaceC15670;
        this.f65839 = interfaceC15671;
        this.f65842 = c16281;
        this.f65838 = c5516;
        this.f65843 = c9771;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20560)) {
            return false;
        }
        C20560 c20560 = (C20560) obj;
        return this.f65840 == c20560.f65840 && this.f65841 == c20560.f65841 && this.f65836 == c20560.f65836 && this.f65844 == c20560.f65844 && this.f65834 == c20560.f65834 && this.f65835.equals(c20560.f65835) && C17359.equals(this.f65837, c20560.f65837) && C17359.equals(this.f65839, c20560.f65839) && C17359.equals(this.f65842, c20560.f65842) && this.f65838.equals(c20560.f65838) && C17359.equals(this.f65843, c20560.f65843);
    }

    public final int hashCode() {
        int i = (((((this.f65840 ? 1231 : 1237) * 31) + this.f65841) * 31) + this.f65836) * 31;
        long j = this.f65844;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f65834;
        return C17359.hashCode(this.f65843) + ((this.f65838.hashCode() + ((C17359.hashCode(this.f65842) + ((C17359.hashCode(this.f65839) + ((C17359.hashCode(this.f65837) + ((this.f65835.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f65841), Long.valueOf(this.f65844), Integer.valueOf(this.f65836), Long.valueOf(this.f65834), Boolean.valueOf(this.f65840), this.f65835, this.f65837, this.f65839, this.f65842, this.f65838, this.f65843};
        String[] strArrSplit = "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory".length() == 0 ? new String[0] : "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C20560.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5516 m47134() {
        return this.f65838;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10561 m47135() {
        return this.f65835;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m47136() {
        return this.f65840;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 m47137() {
        return this.f65837;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m47138() {
        return this.f65841;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m47139() {
        return this.f65844;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9771 m47140() {
        return this.f65843;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m47141() {
        return this.f65836;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 m47142() {
        return this.f65839;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16281 m47143() {
        return this.f65842;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m47144() {
        return this.f65834;
    }
}
