package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15565 implements InterfaceC24031 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f50625;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f50626;

    @Override // l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionPause(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionResume(AbstractC11766 abstractC11766) {
    }

    public C15565(View view, ArrayList arrayList) {
        this.f50626 = view;
        this.f50625 = arrayList;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766) {
        abstractC11766.removeListener(this);
        abstractC11766.addListener(this);
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        abstractC11766.removeListener(this);
        this.f50626.setVisibility(8);
        ArrayList arrayList = this.f50625;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766, boolean z) {
        onTransitionStart(abstractC11766);
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766, boolean z) {
        onTransitionEnd(abstractC11766);
    }
}
