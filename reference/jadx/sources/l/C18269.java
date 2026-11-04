package l;

/* JADX INFO: renamed from: l.ܿۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public class C18269 extends AbstractC21582 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC10064 f59607 = ConcurrentMapC5942.f20334;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f59608;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2213 f59609;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f59610;

    public C18269(Object obj, int i, InterfaceC2213 interfaceC2213) {
        this.f59610 = obj;
        this.f59608 = i;
        this.f59609 = interfaceC2213;
    }

    @Override // l.AbstractC21582, l.InterfaceC2213
    public final Object getKey() {
        return this.f59610;
    }

    @Override // l.AbstractC21582, l.InterfaceC2213
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC10064 mo7552() {
        return this.f59607;
    }

    @Override // l.AbstractC21582, l.InterfaceC2213
    /* JADX INFO: renamed from: ۙ */
    public final void mo7547(InterfaceC10064 interfaceC10064) {
        this.f59607 = interfaceC10064;
    }

    @Override // l.AbstractC21582, l.InterfaceC2213
    public final int getHash() {
        return this.f59608;
    }

    @Override // l.AbstractC21582, l.InterfaceC2213
    public final InterfaceC2213 getNext() {
        return this.f59609;
    }
}
