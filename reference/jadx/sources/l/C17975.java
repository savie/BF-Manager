package l;

/* JADX INFO: renamed from: l.ᩳۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 951O */
/* JADX INFO: loaded from: classes5.dex */
public final class C17975 implements InterfaceC2568 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18681 f57486;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57487;

    public C17975(C18681 c18681, int i) {
        this.f57486 = c18681;
        this.f57487 = i;
    }

    @Override // l.InterfaceC2568
    public final int getKey() {
        C18681 c18681 = this.f57486;
        return c18681.f60629.f22552.m41166().mo5859((this.f57487 * 4) + c18681.f60629.f22553 + 4);
    }

    @Override // l.InterfaceC2568
    /* JADX INFO: renamed from: ۙ */
    public final int mo8019() {
        C8098 c8098 = this.f57486.f60629;
        return c8098.f22552.m41166().mo5859((this.f57487 * 4) + (c8098.f28360 * 4) + c8098.f22553 + 4);
    }
}
