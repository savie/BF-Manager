package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15896 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC20129 f51488;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4646 f51489;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16601 f51490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence f51491;

    public C15896(EnumC20129 enumC20129, CharSequence charSequence, C16601 c16601, C4646 c4646) {
        this.f51488 = enumC20129;
        this.f51491 = charSequence;
        this.f51490 = c16601;
        this.f51489 = c4646;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15896)) {
            return false;
        }
        C15896 c15896 = (C15896) obj;
        return C13638.equals(this.f51488, c15896.f51488) && C13638.equals(this.f51491, c15896.f51491) && C13638.equals(this.f51490, c15896.f51490) && C13638.equals(this.f51489, c15896.f51489);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f51489) + ((C13638.hashCode(this.f51490) + ((C13638.hashCode(this.f51491) + (C13638.hashCode(this.f51488) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f51488, this.f51491, this.f51490, this.f51489};
        String[] strArrSplit = "type;title;trackOption;subtitleMatch".length() == 0 ? new String[0] : "type;title;trackOption;subtitleMatch".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C15896.class, sb, "[");
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
    public final C16601 m37805() {
        return this.f51490;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4646 m37806() {
        return this.f51489;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence m37807() {
        return this.f51491;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC20129 m37808() {
        return this.f51488;
    }
}
