package l;

/* JADX INFO: renamed from: l.۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13496 extends C6785 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f42915;

    public C13496(int i) {
        super(i);
        this.f42915 = new Object();
    }

    @Override // l.C6785, l.InterfaceC8276
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18919() {
        Object objMo18919;
        synchronized (this.f42915) {
            objMo18919 = super.mo18919();
        }
        return objMo18919;
    }

    @Override // l.C6785, l.InterfaceC8276
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18920(Object obj) {
        boolean zMo18920;
        C15243.m36590(obj, AbstractC0329.MATCH_INSTANCE_STR);
        synchronized (this.f42915) {
            zMo18920 = super.mo18920(obj);
        }
        return zMo18920;
    }
}
