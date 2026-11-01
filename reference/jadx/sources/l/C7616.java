package l;

/* JADX INFO: renamed from: l.۟ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C7616 extends AbstractC22433 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9548 f25174;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25175;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0559 f25176;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25177;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return true;
    }

    public C7616(C0559 c0559, int i, int i2, C9548 c9548) {
        this.f25175 = i;
        this.f25177 = i2;
        this.f25174 = c9548;
        this.f25176 = c0559;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25175;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f25175;
        C18304.m42510(i, i2);
        int i3 = this.f25177;
        C0559 c0559 = this.f25176;
        return (i == 0 || i == i2 + (-1)) ? ((C9548) c0559.f2337.get(i + i3)).m24410(this.f25174) : (C9548) c0559.f2337.get(i + i3);
    }

    @Override // l.AbstractC22433, l.AbstractC1826
    public Object writeReplace() {
        return super.writeReplace();
    }
}
