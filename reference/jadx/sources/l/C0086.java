package l;

/* JADX INFO: renamed from: l.֡֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C0086 implements InterfaceC15747 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7323 f998;

    public C0086(C24478 c24478, int i) {
        this.f998 = (C7323) ((C10788) c24478.m54737().get(i)).getFields().get(0);
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo1159(AbstractC9035 abstractC9035) {
        return abstractC9035.hasField(this.f998);
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo1157(AbstractC15001 abstractC15001) {
        return abstractC15001.hasField(this.f998);
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7323 mo1155(AbstractC9035 abstractC9035) {
        C7323 c7323 = this.f998;
        if (abstractC9035.hasField(c7323)) {
            return c7323;
        }
        return null;
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7323 mo1158(AbstractC15001 abstractC15001) {
        C7323 c7323 = this.f998;
        if (abstractC15001.hasField(c7323)) {
            return c7323;
        }
        return null;
    }

    @Override // l.InterfaceC15747
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1156(AbstractC15001 abstractC15001) {
        abstractC15001.clearField(this.f998);
    }
}
