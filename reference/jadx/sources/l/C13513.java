package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13513 implements InterfaceC12261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f42965;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f42966;

    @Override // l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionPause(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionResume(AbstractC0329 abstractC0329) {
    }

    public C13513(View view, ArrayList arrayList) {
        this.f42966 = view;
        this.f42965 = arrayList;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329) {
        abstractC0329.removeListener(this);
        abstractC0329.addListener(this);
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        abstractC0329.removeListener(this);
        this.f42966.setVisibility(8);
        ArrayList arrayList = this.f42965;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329, boolean z) {
        onTransitionStart(abstractC0329);
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329, boolean z) {
        onTransitionEnd(abstractC0329);
    }
}
