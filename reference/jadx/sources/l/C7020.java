package l;

/* JADX INFO: renamed from: l.ۜ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7020 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23590;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23592;

    public /* synthetic */ C7020(int i, Object obj, Object obj2) {
        this.f23591 = i;
        this.f23592 = obj;
        this.f23590 = obj2;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        int i = this.f23591;
        Object obj2 = this.f23590;
        Object obj3 = this.f23592;
        switch (i) {
            case 0:
                C8432.m22085((C8432) obj3, (C12665) obj2);
                break;
            default:
                ActivityC19041 activityC19041 = (ActivityC19041) obj3;
                int i2 = ActivityC19041.f61585;
                if (!((C11986) obj2).m29822()) {
                    activityC19041.finish();
                }
                break;
        }
    }
}
