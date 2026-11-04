package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class C2412 implements InterfaceC2833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25093 f7735;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f7736;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f7737;

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo8155(String str) {
    }

    public C2412(C25093 c25093, View view, View view2) {
        this.f7735 = c25093;
        this.f7737 = view;
        this.f7736 = view2;
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8153(String str) {
        C25093 c25093 = this.f7735;
        c25093.f81144 = str;
        Iterator it = ((ArrayList) c25093.f81141).iterator();
        while (it.hasNext()) {
            ((C1972) it.next()).f6615.m15157();
        }
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8154(EnumC8799 enumC8799) {
        boolean zM23629 = enumC8799.m23629();
        View view = this.f7736;
        View view2 = this.f7737;
        if (zM23629) {
            view2.setVisibility(8);
            view.setVisibility(4);
        } else {
            view2.setVisibility(0);
            view.setVisibility(0);
        }
    }
}
