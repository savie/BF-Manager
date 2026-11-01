package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes.dex */
public final class C23564 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC14392 f76318;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC3101 f76319;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6254 f76320;

    public C23564(C6254 c6254, EnumC3101 enumC3101, EnumC14392 enumC14392) {
        this.f76320 = c6254;
        this.f76319 = enumC3101;
        this.f76318 = enumC14392;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23564)) {
            return false;
        }
        C23564 c23564 = (C23564) obj;
        return C13638.equals(this.f76320, c23564.f76320) && C13638.equals(this.f76319, c23564.f76319) && C13638.equals(this.f76318, c23564.f76318);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f76318) + ((C13638.hashCode(this.f76319) + (C13638.hashCode(this.f76320) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f76320, this.f76319, this.f76318};
        String[] strArrSplit = "key;signingMode;dialectMode".length() == 0 ? new String[0] : "key;signingMode;dialectMode".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23564.class, sb, "[");
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
    public final EnumC3101 m51962() {
        return this.f76319;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC14392 m51963() {
        return this.f76318;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6254 m51964() {
        return this.f76320;
    }
}
