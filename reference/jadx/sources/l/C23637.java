package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes.dex */
public final class C23637 extends AbstractC17535 implements InterfaceC3153 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 f76560;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10937 f76561;

    public C23637(InterfaceC3153 interfaceC3153, C10937 c10937) {
        this.f76560 = interfaceC3153;
        this.f76561 = c10937;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23637)) {
            return false;
        }
        C23637 c23637 = (C23637) obj;
        return C13638.equals(this.f76560, c23637.f76560) && C13638.equals(this.f76561, c23637.f76561);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f76561) + (C13638.hashCode(this.f76560) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f76560, this.f76561};
        String[] strArrSplit = "delegate;token".length() == 0 ? new String[0] : "delegate;token".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23637.class, sb, "[");
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

    @Override // l.InterfaceC3153
    public final long length() {
        return this.f76560.length();
    }

    @Override // l.InterfaceC3153
    /* JADX INFO: renamed from: ܰ */
    public final void mo9547(long j, byte[] bArr, int i, int i2) {
        this.f76560.mo9547(j, bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f76561.close();
    }
}
