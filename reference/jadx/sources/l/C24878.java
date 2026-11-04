package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩻ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final class C24878 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16361 f80505;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f80506;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC13753 f80507;

    public C24878(InterfaceC19106 interfaceC19106, AbstractC13753 abstractC13753, C16361 c16361) {
        this.f80506 = interfaceC19106;
        this.f80507 = abstractC13753;
        this.f80505 = c16361;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24878)) {
            return false;
        }
        C24878 c24878 = (C24878) obj;
        return C17359.equals(this.f80506, c24878.f80506) && C17359.equals(this.f80507, c24878.f80507) && C17359.equals(this.f80505, c24878.f80505);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f80505) + ((C17359.hashCode(this.f80507) + (C17359.hashCode(this.f80506) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f80506, this.f80507, this.f80505};
        String[] strArrSplit = "owner;layout;editor".length() == 0 ? new String[0] : "owner;layout;editor".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C24878.class, sb, "[");
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
