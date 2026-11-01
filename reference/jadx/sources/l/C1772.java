package l;

/* JADX INFO: renamed from: l.֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1772 extends C14474 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f6906;

    public C1772(int i) {
        super(i);
        this.f6906 = new Object();
    }

    @Override // l.C14474, l.InterfaceC23646
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5812() {
        Object objMo5812;
        synchronized (this.f6906) {
            objMo5812 = super.mo5812();
        }
        return objMo5812;
    }

    @Override // l.C14474, l.InterfaceC23646
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5813(Object obj) {
        boolean zMo5813;
        C13465.m32966(obj, AbstractC11766.MATCH_INSTANCE_STR);
        synchronized (this.f6906) {
            zMo5813 = super.mo5813(obj);
        }
        return zMo5813;
    }
}
