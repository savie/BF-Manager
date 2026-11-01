package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21429 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17901 f69685;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22841 f69686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f69687;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f69688;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC21429(C17901 c17901, View view) {
        super(view);
        this.f69685 = c17901;
        this.f69687 = (TextView) view.findViewById(R.id.textView1);
        this.f69688 = (ImageView) view.findViewById(R.id.MT_Protector);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C17901 c17901 = this.f69685;
        InterfaceC15080 interfaceC15080 = c17901.f56680;
        C23630 c23630 = c17901.f56688;
        C22841 c22841 = this.f69686;
        interfaceC15080.mo9566(c23630, c22841.f74301, c22841.f74304);
        c17901.f56684.dismiss();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C17901 c17901 = this.f69685;
        InterfaceC15080 interfaceC15080 = c17901.f56680;
        C23630 c23630 = c17901.f56688;
        C22841 c22841 = this.f69686;
        interfaceC15080.mo9565(view, c23630, c22841.f74301, c22841.f74304);
        return true;
    }
}
