package l;

/* JADX INFO: renamed from: l.֨ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1359 implements InterfaceC5571 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1842 f4844;

    public AbstractC1359(InterfaceC1842 interfaceC1842) {
        this.f4844 = interfaceC1842;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ InterfaceC11536 mo5006(InterfaceC11536 interfaceC11536) {
        return C13028.m32453(this, interfaceC11536);
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public /* bridge */ InterfaceC11536 mo5007(InterfaceC1842 interfaceC1842) {
        return C13028.m32452(this, interfaceC1842);
    }

    @Override // l.InterfaceC5571
    public final InterfaceC1842 getKey() {
        return this.f4844;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5571 mo5005(InterfaceC1842 interfaceC1842) {
        C15243.m36590(interfaceC1842, "key");
        if (C15243.m36589(getKey(), interfaceC1842)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5004(Object obj, InterfaceC23955 interfaceC23955) {
        return interfaceC23955.mo3124(obj, this);
    }
}
