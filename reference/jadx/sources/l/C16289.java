package l;

/* JADX INFO: renamed from: l.ܶᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16289 extends AbstractC8699 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C3414 f52890;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25000 f52891;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f52892;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f52893;

    public C16289(C3414 c3414, String str, String str2) {
        this.f52890 = c3414;
        this.f52892 = str;
        this.f52893 = str2;
        this.f52891 = C14556.m35108(new C17781(c3414.m11164(1), c3414));
    }

    @Override // l.AbstractC8699
    /* JADX INFO: renamed from: ܳ */
    public final C16157 mo9081() {
        String str = this.f52892;
        if (str == null) {
            return null;
        }
        try {
            return C16157.m38331(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l.AbstractC8699
    /* JADX INFO: renamed from: ۤ */
    public final long mo9079() {
        try {
            String str = this.f52893;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1L;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // l.AbstractC8699
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC25000 mo9080() {
        return this.f52891;
    }
}
