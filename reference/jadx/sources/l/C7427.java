package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T12U */
/* JADX INFO: loaded from: classes4.dex */
public final class C7427 extends AbstractC12964 {
    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C14138 c14138 = (C14138) abstractC11800;
        C1512 c1512M5367 = C1512.m5367(DialogInterfaceOnDismissListenerC5102.f17804[i]);
        c14138.f44714.setText(c1512M5367.m5370());
        c14138.f44713.setImageDrawable(c1512M5367.m5368().f66118.m30080());
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C14138(C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return DialogInterfaceOnDismissListenerC5102.f17804.length;
    }
}
