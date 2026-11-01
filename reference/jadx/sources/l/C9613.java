package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAS0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9613 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f32380;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7850 f32381;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17643 f32382;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1850[] f32383;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f32384;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f32385;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9613[] f32386;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f32387;

    public C9613() {
        this.f32385 = -1;
        this.f32382 = new C17643();
        this.f32384 = false;
    }

    public C9613(C17643 c17643) {
        this.f32385 = -1;
        new C17643();
        this.f32384 = false;
        this.f32382 = c17643;
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13217(7, this.f32382.hashCode()), 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9613) {
            return this.f32382.equals(((C9613) obj).f32382);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32385);
        sb.append(":");
        sb.append(this.f32382);
        if (this.f32384) {
            sb.append("=>");
            C1850[] c1850Arr = this.f32383;
            if (c1850Arr != null) {
                sb.append(Arrays.toString(c1850Arr));
            } else {
                sb.append(this.f32387);
            }
        }
        return sb.toString();
    }
}
