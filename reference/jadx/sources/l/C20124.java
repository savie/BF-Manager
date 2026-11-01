package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20124 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f65344;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f65345;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f65346;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f65347;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f65348;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f65349;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f65350;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f65351;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f65352;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f65353;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f65354;

    public C20124(int i, int i2, int i3, int i4, int i5, String str, boolean z, boolean z2, boolean z3, boolean z4, int i6) {
        this.f65349 = i;
        this.f65352 = i2;
        this.f65354 = i3;
        this.f65344 = i4;
        this.f65348 = i5;
        this.f65345 = str;
        this.f65353 = z;
        this.f65351 = z2;
        this.f65346 = z3;
        this.f65347 = z4;
        this.f65350 = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20124)) {
            return false;
        }
        C20124 c20124 = (C20124) obj;
        return this.f65353 == c20124.f65353 && this.f65351 == c20124.f65351 && this.f65346 == c20124.f65346 && this.f65347 == c20124.f65347 && this.f65349 == c20124.f65349 && this.f65352 == c20124.f65352 && this.f65354 == c20124.f65354 && this.f65344 == c20124.f65344 && this.f65348 == c20124.f65348 && this.f65350 == c20124.f65350 && C13638.equals(this.f65345, c20124.f65345);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f65345) + ((((((((((((((((((((this.f65353 ? 1231 : 1237) * 31) + (this.f65351 ? 1231 : 1237)) * 31) + (this.f65346 ? 1231 : 1237)) * 31) + (this.f65347 ? 1231 : 1237)) * 31) + this.f65349) * 31) + this.f65352) * 31) + this.f65354) * 31) + this.f65344) * 31) + this.f65348) * 31) + this.f65350) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f65349), Integer.valueOf(this.f65352), Integer.valueOf(this.f65354), Integer.valueOf(this.f65344), Integer.valueOf(this.f65348), this.f65345, Boolean.valueOf(this.f65353), Boolean.valueOf(this.f65351), Boolean.valueOf(this.f65346), Boolean.valueOf(this.f65347), Integer.valueOf(this.f65350)};
        String[] strArrSplit = "start;end;type;indent;gapEnd;gap;hardBreak;protectedText;softBefore;continuation;functionEnd".length() == 0 ? new String[0] : "start;end;type;indent;gapEnd;gap;hardBreak;protectedText;softBefore;continuation;functionEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C20124.class, sb, "[");
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
}
