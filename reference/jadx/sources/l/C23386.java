package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩹ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final class C23386 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13753 f75712;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f75713;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f75714;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f75715;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f75716;

    public C23386(AbstractC13753 abstractC13753, InterfaceC19106 interfaceC19106, int i, int i2, int i3) {
        this.f75712 = abstractC13753;
        this.f75715 = interfaceC19106;
        this.f75713 = i;
        this.f75716 = i2;
        this.f75714 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23386)) {
            return false;
        }
        C23386 c23386 = (C23386) obj;
        return this.f75713 == c23386.f75713 && this.f75716 == c23386.f75716 && this.f75714 == c23386.f75714 && C17359.equals(this.f75712, c23386.f75712) && C17359.equals(this.f75715, c23386.f75715);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f75715) + ((C17359.hashCode(this.f75712) + (((((this.f75713 * 31) + this.f75716) * 31) + this.f75714) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f75712, this.f75715, Integer.valueOf(this.f75713), Integer.valueOf(this.f75716), Integer.valueOf(this.f75714)};
        String[] strArrSplit = "layout;owner;version;x;y".length() == 0 ? new String[0] : "layout;owner;version;x;y".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C23386.class, sb, "[");
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
