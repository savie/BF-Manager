package l;

/* JADX INFO: renamed from: l.ۨᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09W2 */
/* JADX INFO: loaded from: classes4.dex */
public class C11886 implements InterfaceC22180 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f39880;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f39881;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f39882;

    @Override // l.InterfaceC22180
    public final int getAttributes() {
        return 17;
    }

    @Override // l.InterfaceC22180
    public final long length() {
        return 0L;
    }

    @Override // l.InterfaceC22180
    /* JADX INFO: renamed from: ۡ */
    public final long mo24727() {
        return 0L;
    }

    @Override // l.InterfaceC22180
    /* JADX INFO: renamed from: ۨ */
    public final int mo24728() {
        return 0;
    }

    public C11886() {
    }

    public C11886(String str) {
        this.f39881 = str;
        this.f39880 = 0;
        this.f39882 = null;
    }

    @Override // l.InterfaceC22180
    public final String getName() {
        return this.f39881;
    }

    @Override // l.InterfaceC22180
    public final int getType() {
        int i = this.f39880 & 65535;
        if (i != 1) {
            return i != 3 ? 8 : 16;
        }
        return 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11886) {
            return C13638.equals(this.f39881, ((C11886) obj).f39881);
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hashCode(this.f39881);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbShareInfo[netName=");
        sb.append(this.f39881);
        sb.append(",type=0x");
        C18855.m43491(this.f39880, 8, ",remark=", sb);
        return new String(C22697.m50267(sb, this.f39882, "]"));
    }
}
