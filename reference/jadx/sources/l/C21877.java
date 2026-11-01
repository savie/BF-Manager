package l;

/* JADX INFO: renamed from: l.᩸᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4NK */
/* JADX INFO: loaded from: classes4.dex */
public class C21877 extends RuntimeException {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f70983;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC19055 f70984;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23289 f70985;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 f70986;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22583 f70987;

    public C21877(AbstractC19055 abstractC19055, InterfaceC22583 interfaceC22583, C23289 c23289) {
        this.f70983 = -1;
        this.f70984 = abstractC19055;
        this.f70987 = interfaceC22583;
        this.f70985 = c23289;
        if (abstractC19055 != null) {
            this.f70983 = abstractC19055.m43800();
        }
    }

    public C21877(String str, AbstractC7060 abstractC7060, InterfaceC22583 interfaceC22583, C23289 c23289) {
        super(str);
        this.f70983 = -1;
        this.f70984 = abstractC7060;
        this.f70987 = interfaceC22583;
        this.f70985 = c23289;
        if (abstractC7060 != null) {
            this.f70983 = abstractC7060.m43800();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48661(int i) {
        this.f70983 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0875 m48660() {
        AbstractC19055 abstractC19055 = this.f70984;
        if (abstractC19055 != null) {
            return abstractC19055.mo5091().m38340(this.f70983, this.f70985);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22583 m48664() {
        return this.f70987;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19761 m48663() {
        return this.f70986;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48662(InterfaceC19761 interfaceC19761) {
        this.f70986 = interfaceC19761;
    }
}
