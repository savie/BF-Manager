package l;

/* JADX INFO: renamed from: l.ᩳ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19292 extends AbstractC7714 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62364;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19775 f62365;

    public C19292(C21530 c21530, int i) {
        this.f62365 = c21530;
        this.f62364 = i;
    }

    @Override // l.AbstractC7714, l.InterfaceC9376
    /* JADX INFO: renamed from: ۢ᩷ */
    public final InterfaceC19775 mo20989() {
        return this.f62365;
    }

    @Override // l.InterfaceC9376
    /* JADX INFO: renamed from: ۤ᩷ */
    public final String mo11196() {
        InterfaceC19775 interfaceC19775 = this.f62365;
        if (interfaceC19775 == null) {
            return null;
        }
        return interfaceC19775.getType();
    }

    @Override // l.InterfaceC9376
    /* JADX INFO: renamed from: ۬ */
    public final int mo11197() {
        return this.f62364;
    }
}
