package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21539 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f69962;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11601 f69963;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f69964;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21519 f69965;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f69966;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10148 f69967;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f69968;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f69969;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1263 f69970;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f69971;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f69972;

    public C21539(int i, long j, int i2, long j2, boolean z, C21519 c21519, InterfaceC20723 interfaceC20723, InterfaceC20723 interfaceC20724, C1263 c1263, C10148 c10148, C11601 c11601) {
        this.f69966 = i;
        this.f69972 = j;
        this.f69969 = i2;
        this.f69964 = j2;
        this.f69971 = z;
        this.f69965 = c21519;
        this.f69968 = interfaceC20723;
        this.f69962 = interfaceC20724;
        this.f69970 = c1263;
        this.f69967 = c10148;
        this.f69963 = c11601;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21539)) {
            return false;
        }
        C21539 c21539 = (C21539) obj;
        return this.f69971 == c21539.f69971 && this.f69966 == c21539.f69966 && this.f69969 == c21539.f69969 && this.f69972 == c21539.f69972 && this.f69964 == c21539.f69964 && this.f69965.equals(c21539.f69965) && C13638.equals(this.f69968, c21539.f69968) && C13638.equals(this.f69962, c21539.f69962) && C13638.equals(this.f69970, c21539.f69970) && this.f69967.equals(c21539.f69967) && C13638.equals(this.f69963, c21539.f69963);
    }

    public final int hashCode() {
        int i = (((((this.f69971 ? 1231 : 1237) * 31) + this.f69966) * 31) + this.f69969) * 31;
        long j = this.f69972;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f69964;
        return C13638.hashCode(this.f69963) + ((this.f69967.hashCode() + ((C13638.hashCode(this.f69970) + ((C13638.hashCode(this.f69962) + ((C13638.hashCode(this.f69968) + ((this.f69965.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f69966), Long.valueOf(this.f69972), Integer.valueOf(this.f69969), Long.valueOf(this.f69964), Boolean.valueOf(this.f69971), this.f69965, this.f69968, this.f69962, this.f69970, this.f69967, this.f69963};
        String[] strArrSplit = "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory".length() == 0 ? new String[0] : "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C21539.class, sb, "[");
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m48253() {
        return this.f69966;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 m48254() {
        return this.f69968;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21519 m48255() {
        return this.f69965;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C10148 m48256() {
        return this.f69967;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1263 m48257() {
        return this.f69970;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m48258() {
        return this.f69971;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m48259() {
        return this.f69969;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m48260() {
        return this.f69964;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m48261() {
        return this.f69972;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 m48262() {
        return this.f69962;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11601 m48263() {
        return this.f69963;
    }
}
