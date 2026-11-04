package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩵᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20884 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f66837;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12303 f66838;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f66839;

    public C20884(C12303 c12303, byte[] bArr, byte[] bArr2) {
        this.f66838 = c12303;
        this.f66839 = bArr;
        this.f66837 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20884)) {
            return false;
        }
        C20884 c20884 = (C20884) obj;
        return C17359.equals(this.f66838, c20884.f66838) && C17359.equals(this.f66839, c20884.f66839) && C17359.equals(this.f66837, c20884.f66837);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f66837) + ((C17359.hashCode(this.f66839) + (C17359.hashCode(this.f66838) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f66838, this.f66839, this.f66837};
        String[] strArrSplit = "view;search;preferences".length() == 0 ? new String[0] : "view;search;preferences".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C20884.class, sb, "[");
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
    public final byte[] m47724() {
        return this.f66837;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12303 m47725() {
        return this.f66838;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m47726() {
        return this.f66839;
    }
}
