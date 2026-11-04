package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13627 extends FrameLayout implements InterfaceC1168 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CollapsibleActionView f43278;

    /* JADX WARN: Multi-variable type inference failed */
    public C13627(View view) {
        super(view.getContext());
        this.f43278 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // l.InterfaceC1168
    /* JADX INFO: renamed from: ۙ */
    public final void mo4307() {
        this.f43278.onActionViewExpanded();
    }

    @Override // l.InterfaceC1168
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4308() {
        this.f43278.onActionViewCollapsed();
    }
}
