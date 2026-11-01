package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes4.dex */
public final class C11819 extends AbstractC0414 {
    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C2645 c2645 = (C2645) abstractC12554;
        C6695 c6695M18078 = C6695.m18078(DialogInterfaceOnDismissListenerC5468.f18839[i]);
        c2645.f10300.setText(c6695M18078.m18081());
        c2645.f10299.setImageDrawable(c6695M18078.m18079().f2940.m35074());
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2645(C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return DialogInterfaceOnDismissListenerC5468.f18839.length;
    }
}
