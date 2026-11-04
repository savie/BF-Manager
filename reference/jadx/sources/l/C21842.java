package l;

/* JADX INFO: renamed from: l.᩷ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4FW */
/* JADX INFO: loaded from: classes.dex */
public final class C21842 extends AbstractC8699 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f69596;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25000 f69597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f69598;

    public C21842(String str, long j, InterfaceC25000 interfaceC25000) {
        this.f69598 = str;
        this.f69596 = j;
        this.f69597 = interfaceC25000;
    }

    @Override // l.AbstractC8699
    /* JADX INFO: renamed from: ܳ */
    public final C16157 mo9081() {
        String str = this.f69598;
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
        return this.f69596;
    }

    @Override // l.AbstractC8699
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC25000 mo9080() {
        return this.f69597;
    }
}
