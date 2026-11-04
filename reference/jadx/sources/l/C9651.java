package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 497P */
/* JADX INFO: loaded from: classes4.dex */
public final class C9651 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f31189;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC6670 f31190;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC14806 f31191;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f31192;

    public C9651(AbstractC14806 abstractC14806, EnumC6670 enumC6670, String str, boolean z) {
        this.f31191 = abstractC14806;
        this.f31190 = enumC6670;
        this.f31192 = str;
        this.f31189 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9651)) {
            return false;
        }
        C9651 c9651 = (C9651) obj;
        return this.f31189 == c9651.f31189 && C17359.equals(this.f31191, c9651.f31191) && C17359.equals(this.f31190, c9651.f31190) && C17359.equals(this.f31192, c9651.f31192);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f31192) + ((C17359.hashCode(this.f31190) + ((C17359.hashCode(this.f31191) + ((this.f31189 ? 1231 : 1237) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f31191, this.f31190, this.f31192, Boolean.valueOf(this.f31189)};
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC14806 m25168() {
        return this.f31191;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m25169() {
        return this.f31192;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC6670 m25170() {
        return this.f31190;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25171() {
        return this.f31189;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m25167() {
        C6178 c6178 = new C6178();
        c6178.m17806(this.f31191.m35651());
        c6178.writeByte(this.f31190.ordinal());
        c6178.m17804(this.f31192);
        c6178.m17789(this.f31189);
        return c6178.m17796();
    }
}
