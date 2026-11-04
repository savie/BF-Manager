package l;

/* JADX INFO: renamed from: l.ᩳ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09W2 */
/* JADX INFO: loaded from: classes5.dex */
public class C19412 implements InterfaceC9627 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f62745;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62746;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f62747;

    @Override // l.InterfaceC9627
    public final int getAttributes() {
        return 17;
    }

    @Override // l.InterfaceC9627
    public final long length() {
        return 0L;
    }

    @Override // l.InterfaceC9627
    /* JADX INFO: renamed from: ۤ */
    public final int mo6139() {
        return 0;
    }

    @Override // l.InterfaceC9627
    /* JADX INFO: renamed from: ۨ */
    public final long mo6140() {
        return 0L;
    }

    public C19412() {
    }

    public C19412(String str) {
        this.f62745 = str;
        this.f62746 = 0;
        this.f62747 = null;
    }

    @Override // l.InterfaceC9627
    public final String getName() {
        return this.f62745;
    }

    @Override // l.InterfaceC9627
    public final int getType() {
        int i = this.f62746 & 65535;
        if (i != 1) {
            return i != 3 ? 8 : 16;
        }
        return 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19412) {
            return C17359.equals(this.f62745, ((C19412) obj).f62745);
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hashCode(this.f62745);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbShareInfo[netName=");
        sb.append(this.f62745);
        sb.append(",type=0x");
        C8008.m21876(this.f62746, 8, ",remark=", sb);
        return new String(C8947.m23910(sb, this.f62747, "]"));
    }
}
