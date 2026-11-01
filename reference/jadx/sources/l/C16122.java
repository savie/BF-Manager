package l;

/* JADX INFO: renamed from: l.ܺᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16122 implements InterfaceC13717 {
    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
        return C4543.m12682(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
        return C4543.m12683(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        int i2 = C4312.f15487;
        if (i > 127) {
            return Character.isLetterOrDigit(i);
        }
        if (97 <= i && i <= 122) {
            return true;
        }
        if (65 > i || i > 90) {
            return 48 <= i && i <= 57;
        }
        return true;
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }
}
