package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۚܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C5719 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10938[] f19724;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f19725;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f19726;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 f19727;

    public C5719(int i, InterfaceC22808 interfaceC22808, int i2, C10938[] c10938Arr) {
        this.f19726 = i;
        this.f19727 = interfaceC22808;
        this.f19725 = i2;
        this.f19724 = c10938Arr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5719)) {
            return false;
        }
        C5719 c5719 = (C5719) obj;
        return this.f19726 == c5719.f19726 && this.f19725 == c5719.f19725 && C17359.equals(this.f19727, c5719.f19727) && C17359.equals(this.f19724, c5719.f19724);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f19724) + ((C17359.hashCode(this.f19727) + C18176.m42345(this.f19726, 31, this.f19725, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f19726), this.f19727, Integer.valueOf(this.f19725), this.f19724};
        String[] strArrSplit = "index;source;occurrenceBytes;backings".length() == 0 ? new String[0] : "index;source;occurrenceBytes;backings".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C5719.class, sb, "[");
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10938[] m16755() {
        return this.f19724;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m16756() {
        return this.f19725;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 m16757() {
        return this.f19727;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m16758() {
        return this.f19726;
    }
}
