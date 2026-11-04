package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC5738 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13984 f19754;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2009 f19755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f19756;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC5738(C2009 c2009, View view) {
        super(view);
        this.f19755 = c2009;
        this.f19756 = (TextView) view.findViewById(R.id.title);
        C17423.m40915(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C14941.f48783.m55200()) {
            return;
        }
        C15432 c15432 = new C15432(this, (AbstractActivityC17204) this.f19755.requireActivity());
        c15432.m22961();
        c15432.m22945(R.string.MT_Protector);
        c15432.m22924((CharSequence) this.f19754.m34072());
        c15432.m22916();
        c15432.m22955(true);
    }
}
