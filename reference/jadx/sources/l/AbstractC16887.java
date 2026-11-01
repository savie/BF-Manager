package l;

/* JADX INFO: renamed from: l.ܽ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16887 implements InterfaceC2629 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5452 f54009;

    public AbstractC16887(InterfaceC5452 interfaceC5452) {
        this.f54009 = interfaceC5452;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ InterfaceC22386 mo4417(InterfaceC22386 interfaceC22386) {
        return C11803.m29482(this, interfaceC22386);
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ܰ */
    public /* bridge */ InterfaceC22386 mo4418(InterfaceC5452 interfaceC5452) {
        return C11803.m29481(this, interfaceC5452);
    }

    @Override // l.InterfaceC2629
    public final InterfaceC5452 getKey() {
        return this.f54009;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC2629 mo4416(InterfaceC5452 interfaceC5452) {
        C13465.m32966(interfaceC5452, "key");
        if (C13465.m32965(getKey(), interfaceC5452)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4415(Object obj, InterfaceC8400 interfaceC8400) {
        return interfaceC8400.mo3208(obj, this);
    }
}
