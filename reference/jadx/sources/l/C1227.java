package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֨ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: KA0F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1227 extends AbstractC5154 {
    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo4459(int i, byte[] bArr) {
        return 0;
    }

    public C1227(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
        this.f17978 = new C19126(interfaceC5878);
    }

    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4457(int i, byte[] bArr) {
        return m15573(i, bArr);
    }

    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo4458(int i, byte[] bArr) {
        if (this.f17958 != 0 || this.f17981 != 0) {
            return 0;
        }
        byte b = bArr[i];
        int iM15570 = AbstractC5154.m15570(i + 2, bArr);
        if (iM15570 != 0) {
            this.f17966[this.f17980] = new C22308(this.f17978, iM15570);
            return 6;
        }
        this.f17966[this.f17980] = null;
        return 6;
    }

    @Override // l.AbstractC5154
    public final String toString() {
        StringBuilder sb = new StringBuilder("NameQueryResponse[");
        sb.append(super.toString());
        sb.append(",addrEntry=");
        C22308[] c22308Arr = this.f17966;
        return new String(C8947.m23910(sb, c22308Arr != null ? Arrays.toString(c22308Arr) : "", "]"));
    }
}
