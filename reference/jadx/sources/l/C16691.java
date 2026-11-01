package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C16691 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f53470;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53471;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f53472;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f53473;

    public C16691(int i, int i2, boolean z, boolean z2) {
        this.f53470 = i;
        this.f53472 = i2;
        this.f53473 = z;
        this.f53471 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16691)) {
            return false;
        }
        C16691 c16691 = (C16691) obj;
        return this.f53473 == c16691.f53473 && this.f53471 == c16691.f53471 && this.f53470 == c16691.f53470 && this.f53472 == c16691.f53472;
    }

    public final int hashCode() {
        return ((((((this.f53473 ? 1231 : 1237) * 31) + (this.f53471 ? 1231 : 1237)) * 31) + this.f53470) * 31) + this.f53472;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f53470), Integer.valueOf(this.f53472), Boolean.valueOf(this.f53473), Boolean.valueOf(this.f53471)};
        String[] strArrSplit = "selectionStart;selectionEnd;selectHexFirstChar;multiSelect".length() == 0 ? new String[0] : "selectionStart;selectionEnd;selectHexFirstChar;multiSelect".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16691.class, sb, "[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m39164() {
        return this.f53472;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39165() {
        return this.f53471;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m39166() {
        return this.f53473;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m39167() {
        return this.f53470;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39163(C16691 c16691, int i) {
        int i2 = c16691.f53472;
        int i3 = c16691.f53470;
        if (c16691.f53471) {
            if (i == 0 || i3 < 0 || i2 < i3 || i2 >= i) {
                throw new IllegalArgumentException("Invalid history range selection");
            }
            return;
        }
        if (i3 < 0 || i3 != i2 || i3 > i || (i3 == i && !c16691.f53473)) {
            throw new IllegalArgumentException("Invalid history cursor selection");
        }
    }
}
