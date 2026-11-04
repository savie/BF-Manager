package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۛۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6088 extends AbstractC2323 implements InterfaceC1278 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1278 f20809;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12053 f20810;

    public C6088(InterfaceC1278 interfaceC1278, C12053 c12053) {
        this.f20809 = interfaceC1278;
        this.f20810 = c12053;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6088)) {
            return false;
        }
        C6088 c6088 = (C6088) obj;
        return C17359.equals(this.f20809, c6088.f20809) && C17359.equals(this.f20810, c6088.f20810);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f20810) + (C17359.hashCode(this.f20809) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f20809, this.f20810};
        String[] strArrSplit = "delegate;token".length() == 0 ? new String[0] : "delegate;token".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C6088.class, sb, "[");
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

    @Override // l.InterfaceC1278
    public final long length() {
        return this.f20809.length();
    }

    @Override // l.InterfaceC1278
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4667(long j, byte[] bArr, int i, int i2) {
        this.f20809.mo4667(j, bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f20810.close();
    }
}
