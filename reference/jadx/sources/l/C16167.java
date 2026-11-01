package l;

/* JADX INFO: renamed from: l.ܺ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public class C16167 extends AbstractC20981 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC0769 f52244;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f52245;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC12639 f52246 = ConcurrentMapC21937.f71143;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f52247;

    public C16167(Object obj, int i, InterfaceC0769 interfaceC0769) {
        this.f52247 = obj;
        this.f52245 = i;
        this.f52244 = interfaceC0769;
    }

    @Override // l.AbstractC20981, l.InterfaceC0769
    public final Object getKey() {
        return this.f52247;
    }

    @Override // l.AbstractC20981, l.InterfaceC0769
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC12639 mo3304() {
        return this.f52246;
    }

    @Override // l.AbstractC20981, l.InterfaceC0769
    /* JADX INFO: renamed from: ۙ */
    public final void mo3303(InterfaceC12639 interfaceC12639) {
        this.f52246 = interfaceC12639;
    }

    @Override // l.AbstractC20981, l.InterfaceC0769
    public final int getHash() {
        return this.f52245;
    }

    @Override // l.AbstractC20981, l.InterfaceC0769
    public final InterfaceC0769 getNext() {
        return this.f52244;
    }
}
