package l;

import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.᩹۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22162 implements InterfaceC13717 {
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
        return ((UMModuleRegister.SHARE_EVENT_VALUE_HIGH >> C4312.m12113(i)) & 1) != 0 || (i >= 9 && i <= 13) || i == 133;
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }
}
