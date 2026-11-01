package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: KA0F */
/* JADX INFO: loaded from: classes3.dex */
public final class C5556 extends AbstractC23196 {
    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ۖ */
    public final int mo8341(int i, byte[] bArr) {
        return 0;
    }

    public C5556(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
        this.f75294 = new C11907(interfaceC10601);
    }

    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ۙ */
    public final int mo8342(int i, byte[] bArr) {
        return m51226(i, bArr);
    }

    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ܰ */
    public final int mo8343(int i, byte[] bArr) {
        if (this.f75290 != 0 || this.f75292 != 0) {
            return 0;
        }
        byte b = bArr[i];
        int iM51224 = AbstractC23196.m51224(i + 2, bArr);
        if (iM51224 != 0) {
            this.f75284[this.f75275] = new C15435(this.f75294, iM51224);
            return 6;
        }
        this.f75284[this.f75275] = null;
        return 6;
    }

    @Override // l.AbstractC23196
    public final String toString() {
        StringBuilder sb = new StringBuilder("NameQueryResponse[");
        sb.append(super.toString());
        sb.append(",addrEntry=");
        C15435[] c15435Arr = this.f75284;
        return new String(C22697.m50267(sb, c15435Arr != null ? Arrays.toString(c15435Arr) : "", "]"));
    }
}
