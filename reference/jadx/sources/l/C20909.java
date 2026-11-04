package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩵᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20909 implements InterfaceC18671 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14941 f66918;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f66919;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4501 f66920;

    @Override // l.InterfaceC18671
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18831() {
        return true;
    }

    public C20909(C14941 c14941, InterfaceC4501 interfaceC4501, LinkedList linkedList) {
        this.f66918 = c14941;
        this.f66920 = interfaceC4501;
        this.f66919 = linkedList;
    }

    @Override // l.InterfaceC18671
    /* JADX INFO: renamed from: ۙ */
    public final void mo18830(C21655 c21655) {
        if (c21655.m49186()) {
            if (this.f66918.m35964(c21655)) {
                int iMo12193 = this.f66920.mo12193(c21655.f69128, c21655.m49182());
                if (iMo12193 == 1) {
                    if (c21655.m49182()) {
                        return;
                    }
                    c21655.m49190();
                    return;
                } else {
                    if (iMo12193 == 2 && c21655.m49182()) {
                        c21655.m49178();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.f66919.addFirst(c21655);
    }
}
