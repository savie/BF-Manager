package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩶֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes5.dex */
public final class C20944 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f67005;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC0807 f67006;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Exception f67007;

    public C20944(EnumC0807 enumC0807, String str, Exception exc) {
        this.f67006 = enumC0807;
        this.f67005 = str;
        this.f67007 = exc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20944)) {
            return false;
        }
        C20944 c20944 = (C20944) obj;
        return C17359.equals(this.f67006, c20944.f67006) && C17359.equals(this.f67005, c20944.f67005) && C17359.equals(this.f67007, c20944.f67007);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f67007) + C24966.m55771(C17359.hashCode(this.f67006) * 31, 31, this.f67005);
    }

    public final String toString() {
        Object[] objArr = {this.f67006, this.f67005, this.f67007};
        String[] strArrSplit = "status;entryName;error".length() == 0 ? new String[0] : "status;entryName;error".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C20944.class, sb, "[");
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
    public final String m47878() {
        return this.f67005;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC0807 m47879() {
        return this.f67006;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Exception m47880() {
        return this.f67007;
    }
}
