package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۛ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6357 implements InterfaceC4324 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9886 f21419;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f21420;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2123 f21421;

    @Override // l.InterfaceC4324
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12162() {
        return true;
    }

    public C6357(C9886 c9886, InterfaceC2123 interfaceC2123, LinkedList linkedList) {
        this.f21419 = c9886;
        this.f21421 = interfaceC2123;
        this.f21420 = linkedList;
    }

    @Override // l.InterfaceC4324
    /* JADX INFO: renamed from: ۙ */
    public final void mo12161(C3534 c3534) {
        if (c3534.m10396()) {
            if (this.f21419.m25019(c3534)) {
                int iMo1698 = this.f21421.mo1698(c3534.f13022, c3534.m10409());
                if (iMo1698 == 1) {
                    if (c3534.m10409()) {
                        return;
                    }
                    c3534.m10410();
                    return;
                } else {
                    if (iMo1698 == 2 && c3534.m10409()) {
                        c3534.m10400();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.f21420.addFirst(c3534);
    }
}
