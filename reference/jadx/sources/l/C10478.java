package l;

/* JADX INFO: renamed from: l.ۤᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10478 implements InterfaceC13717 {
    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
        return C4543.m12682(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        if (i >= 48 && i <= 57) {
            return true;
        }
        if (i >= 65 && i <= 70) {
            return true;
        }
        if (i >= 97 && i <= 102) {
            return true;
        }
        if (i >= 65296 && i <= 65305) {
            return true;
        }
        if (i < 65313 || i > 65318) {
            return i >= 65345 && i <= 65350;
        }
        return true;
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
        return C4543.m12683(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }
}
