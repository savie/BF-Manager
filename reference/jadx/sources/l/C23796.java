package l;

import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.᩻ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes.dex */
public final class C23796 extends AbstractDialogInterfaceOnClickListenerC4973 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f76927;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f76928;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC3333 f76929;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76930;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23796(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333, ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3334, int i, CharSequence[] charSequenceArr, DialogInterfaceC19356 dialogInterfaceC19356) {
        super(viewOnLayoutChangeListenerC3334);
        this.f76929 = viewOnLayoutChangeListenerC3333;
        this.f76930 = i;
        this.f76927 = charSequenceArr;
        this.f76928 = dialogInterfaceC19356;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC4973
    /* JADX INFO: renamed from: ۨ */
    public final void mo7624() {
        String strM13800 = m13800();
        if (!strM13800.isEmpty()) {
            BinderC14748 binderC14748 = this.f76929.f12352;
            int i = this.f76930;
            binderC14748.m35352(i, strM13800);
            this.f76927[i] = strM13800;
            ((BaseAdapter) this.f76928.m44376().getAdapter()).notifyDataSetChanged();
        }
        m13796();
    }
}
