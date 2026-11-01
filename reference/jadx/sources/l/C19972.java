package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes5.dex */
public final class C19972 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f63937;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f63938;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f63939;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f63940;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f63941;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f63942;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f63943;

    public C19972(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f63942 = i;
        this.f63941 = i2;
        this.f63937 = i3;
        this.f63943 = i4;
        this.f63939 = i5;
        this.f63940 = i6;
        this.f63938 = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19972)) {
            return false;
        }
        C19972 c19972 = (C19972) obj;
        return this.f63942 == c19972.f63942 && this.f63941 == c19972.f63941 && this.f63937 == c19972.f63937 && this.f63943 == c19972.f63943 && this.f63939 == c19972.f63939 && this.f63940 == c19972.f63940 && this.f63938 == c19972.f63938;
    }

    public final int hashCode() {
        return (((((((((((this.f63942 * 31) + this.f63941) * 31) + this.f63937) * 31) + this.f63943) * 31) + this.f63939) * 31) + this.f63940) * 31) + this.f63938;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f63942), Integer.valueOf(this.f63941), Integer.valueOf(this.f63937), Integer.valueOf(this.f63943), Integer.valueOf(this.f63939), Integer.valueOf(this.f63940), Integer.valueOf(this.f63938)};
        String[] strArrSplit = "first;last;type;start;end;line;level".length() == 0 ? new String[0] : "first;last;type;start;end;line;level".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C19972.class, sb, "[");
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
