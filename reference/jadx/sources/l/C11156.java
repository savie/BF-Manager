package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470D */
/* JADX INFO: loaded from: classes4.dex */
public final class C11156 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f37822;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16800 f37823;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f37824;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f37825;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f37826;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC23856 f37827;

    public C11156(int i, int i2, int i3, int i4, EnumC23856 enumC23856, C16800 c16800) {
        this.f37822 = i;
        this.f37826 = i2;
        this.f37824 = i3;
        this.f37825 = i4;
        this.f37827 = enumC23856;
        this.f37823 = c16800;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11156)) {
            return false;
        }
        C11156 c11156 = (C11156) obj;
        return this.f37822 == c11156.f37822 && this.f37826 == c11156.f37826 && this.f37824 == c11156.f37824 && this.f37825 == c11156.f37825 && C13638.equals(this.f37827, c11156.f37827) && C13638.equals(this.f37823, c11156.f37823);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f37823) + ((C13638.hashCode(this.f37827) + (((((((this.f37822 * 31) + this.f37826) * 31) + this.f37824) * 31) + this.f37825) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f37822), Integer.valueOf(this.f37826), Integer.valueOf(this.f37824), Integer.valueOf(this.f37825), this.f37827, this.f37823};
        String[] strArrSplit = "oldReplayOffset;newReplayOffset;oldSuffixOffset;newSuffixOffset;reason;affectedDecisions".length() == 0 ? new String[0] : "oldReplayOffset;newReplayOffset;oldSuffixOffset;newSuffixOffset;reason;affectedDecisions".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C11156.class, sb, "[");
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
    public final int m28089() {
        return this.f37824;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m28090() {
        return this.f37825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16800 m28091() {
        return this.f37823;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m28092() {
        return this.f37826;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m28093() {
        return this.f37822;
    }
}
