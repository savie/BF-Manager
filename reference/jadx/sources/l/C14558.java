package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 497P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14558 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f47660;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f47661;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC7501 f47662;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC17131 f47663;

    public C14558(AbstractC17131 abstractC17131, EnumC7501 enumC7501, String str, boolean z) {
        this.f47663 = abstractC17131;
        this.f47662 = enumC7501;
        this.f47660 = str;
        this.f47661 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14558)) {
            return false;
        }
        C14558 c14558 = (C14558) obj;
        return this.f47661 == c14558.f47661 && C13638.equals(this.f47663, c14558.f47663) && C13638.equals(this.f47662, c14558.f47662) && C13638.equals(this.f47660, c14558.f47660);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f47660) + ((C13638.hashCode(this.f47662) + ((C13638.hashCode(this.f47663) + ((this.f47661 ? 1231 : 1237) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f47663, this.f47662, this.f47660, Boolean.valueOf(this.f47661)};
        String[] strArrSplit = "key;schemes;v1Filename;keepV1SignatureData".length() == 0 ? new String[0] : "key;schemes;v1Filename;keepV1SignatureData".split(l.b);
        StringBuilder sb = new StringBuilder("ApkSignerOptions[");
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
    public final String m35030() {
        return this.f47660;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC17131 m35031() {
        return this.f47663;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m35033() {
        return this.f47661;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC7501 m35034() {
        return this.f47662;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m35032() {
        C11018 c11018 = new C11018();
        c11018.m27794(this.f47663.m40011());
        c11018.writeByte(this.f47662.ordinal());
        c11018.m27792(this.f47660);
        c11018.m27784(this.f47661);
        return c11018.m27773();
    }
}
