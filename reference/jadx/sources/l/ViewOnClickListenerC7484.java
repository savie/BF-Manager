package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7484 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20890 f24930;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15246 f24931;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f24932;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC7484(C20890 c20890, View view) {
        super(view);
        this.f24930 = c20890;
        this.f24932 = (TextView) view.findViewById(R.id.MT_Protector);
        C0674.m3031(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C9886.f33734.m50803()) {
            return;
        }
        C8896 c8896 = new C8896(this, (AbstractActivityC12483) this.f24930.requireActivity());
        c8896.m40369();
        c8896.m40376(R.string.MT_Protector);
        c8896.m40346((CharSequence) this.f24931.m36517());
        c8896.m40371();
        c8896.m40368(true);
    }
}
