package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1833 extends FrameLayout implements InterfaceC17005 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CollapsibleActionView f7027;

    /* JADX WARN: Multi-variable type inference failed */
    public C1833(View view) {
        super(view.getContext());
        this.f7027 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // l.InterfaceC17005
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5984() {
        this.f7027.onActionViewExpanded();
    }

    @Override // l.InterfaceC17005
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo5985() {
        this.f7027.onActionViewCollapsed();
    }
}
