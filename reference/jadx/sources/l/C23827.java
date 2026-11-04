package l;

import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.᩹᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes.dex */
public final class C23827 extends AbstractDialogInterfaceOnClickListenerC15220 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC6673 f77167;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f77168;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f77169;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77170;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23827(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673, ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6674, int i, CharSequence[] charSequenceArr, DialogInterfaceC8327 dialogInterfaceC8327) {
        super(viewOnLayoutChangeListenerC6674);
        this.f77167 = viewOnLayoutChangeListenerC6673;
        this.f77170 = i;
        this.f77169 = charSequenceArr;
        this.f77168 = dialogInterfaceC8327;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC15220
    /* JADX INFO: renamed from: ۤ */
    public final void mo16630() {
        String strM36570 = m36570();
        if (!strM36570.isEmpty()) {
            BinderC16784 binderC16784 = this.f77167.f22254;
            int i = this.f77170;
            binderC16784.m39630(i, strM36570);
            this.f77169[i] = strM36570;
            ((BaseAdapter) this.f77168.m22437().getAdapter()).notifyDataSetChanged();
        }
        m36564();
    }
}
