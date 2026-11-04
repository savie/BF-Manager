package l;

import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.ۙۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7I1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4620 implements InterfaceC2885 {
    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C9596.m25073(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C9596.m25074(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        return ((UMModuleRegister.SHARE_EVENT_VALUE_HIGH >> C18446.m42976(i)) & 1) != 0 || (i >= 9 && i <= 13) || i == 133;
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }
}
