package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC5694 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13591 f19664;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1965 f19665;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f19666;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC5694(C1965 c1965, View view) {
        super(view);
        this.f19665 = c1965;
        this.f19666 = (TextView) view.findViewById(R.id.title);
        C17423.m40915(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C14941.f48783.m55200()) {
            return;
        }
        C15388 c15388 = new C15388(this, (AbstractActivityC17204) this.f19665.requireActivity());
        c15388.m22961();
        c15388.m22945(R.string.MT_Protector);
        c15388.m22924((CharSequence) this.f19664.m33319());
        c15388.m22916();
        c15388.m22955(true);
    }
}
