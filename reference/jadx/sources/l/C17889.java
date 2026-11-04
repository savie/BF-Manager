package l;

/* JADX INFO: renamed from: l.ܽ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17889 implements InterfaceC2885 {
    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C9596.m25073(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
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

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C9596.m25074(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }
}
