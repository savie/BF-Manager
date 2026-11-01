package l;

/* JADX INFO: renamed from: l.ᩴ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes5.dex */
public class C19063 extends AbstractC8480 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1423 f61629;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19769 f61630;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19063(AbstractC19769 abstractC19769, InterfaceC1423 interfaceC1423, InterfaceC10597 interfaceC10597) {
        super(abstractC19769, interfaceC10597);
        this.f61630 = abstractC19769;
        this.f61629 = interfaceC1423;
    }

    @Override // l.AbstractC8480
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo22148() {
        return this.f61629.getLifecycle().mo9170().m24173(EnumC9414.STARTED);
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        InterfaceC1423 interfaceC1424 = this.f61629;
        EnumC9414 enumC9414Mo9170 = interfaceC1424.getLifecycle().mo9170();
        if (enumC9414Mo9170 == EnumC9414.DESTROYED) {
            this.f61630.m44963(this.f29396);
            return;
        }
        EnumC9414 enumC9414 = null;
        while (enumC9414 != enumC9414Mo9170) {
            m22147(mo22148());
            enumC9414 = enumC9414Mo9170;
            enumC9414Mo9170 = interfaceC1424.getLifecycle().mo9170();
        }
    }

    @Override // l.AbstractC8480
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo22145(InterfaceC1423 interfaceC1423) {
        return this.f61629 == interfaceC1423;
    }

    @Override // l.AbstractC8480
    /* JADX INFO: renamed from: ۙ */
    public final void mo22146() {
        this.f61629.getLifecycle().mo9172(this);
    }
}
