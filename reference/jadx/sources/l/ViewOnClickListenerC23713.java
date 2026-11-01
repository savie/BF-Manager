package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23713 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8500 f76740;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22032 f76741;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9206 f76742;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f76743;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f76744;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC23713(C22032 c22032, View view) {
        super(view);
        this.f76741 = c22032;
        this.f76743 = (TextView) view.findViewById(R.id.textView);
        C0674.m3031(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C22032 c22032 = this.f76741;
        if ((c22032.f71407 == null || c22032.f71407.m16563(this.f76742.f31292)) && !C9886.f33734.m50803()) {
            ((ActivityC5677) c22032.requireActivity()).m15660(this.f76742.f31292, this.f76740);
            c22032.f71407.m16532(this.f76742.f31292);
            if (((C10617) c22032.f71403.peek()).f36281.add(this.f76742.f31292 + " " + this.f76744)) {
                C16737.m39274(new RunnableC4310(1, this), 200L);
            }
        }
    }
}
