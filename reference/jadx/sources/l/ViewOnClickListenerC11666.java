package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11666 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25093 f37804;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final TextView f37805;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22109 f37806;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1972 f37807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f37808;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC11666(C25093 c25093, View view, C1972 c1972) {
        super(view);
        this.f37804 = c25093;
        this.f37807 = c1972;
        this.f37805 = (TextView) view.findViewById(R.id.textView1);
        this.f37808 = (ImageView) view.findViewById(R.id.MT_Protector);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C17328 c17328;
        C25093 c25093 = this.f37804;
        if (c25093.f81137 && (c17328 = this.f37806.f71253) != null) {
            C5396.m16077(this.f37807.f6618, c17328);
        }
        InterfaceC15395 interfaceC15395 = c25093.f81139;
        C20312 c20312 = c25093.f81148;
        C22109 c22109 = this.f37806;
        interfaceC15395.mo3725(c20312, c22109.f71253, c22109.f71257);
        c25093.f81140.dismiss();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C25093 c25093 = this.f37804;
        InterfaceC15395 interfaceC15395 = c25093.f81139;
        C20312 c20312 = c25093.f81148;
        C22109 c22109 = this.f37806;
        interfaceC15395.mo3724(view, c20312, c22109.f71253, c22109.f71257);
        return true;
    }
}
