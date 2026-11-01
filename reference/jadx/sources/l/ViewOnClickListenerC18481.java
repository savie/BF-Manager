package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC18481 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7898 f58897;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C0841 f58898;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f58899;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC18481(C7898 c7898, View view) {
        super(view);
        this.f58897 = c7898;
        this.f58899 = (TextView) view.findViewById(R.id.MT_Protector);
        C0674.m3031(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C9886.f33734.m50803()) {
            return;
        }
        C21303 c21303 = new C21303(this, (AbstractActivityC12483) this.f58897.requireActivity());
        c21303.m40369();
        c21303.m40376(R.string.MT_Protector);
        c21303.m40346((CharSequence) this.f58898.m3454());
        c21303.m40371();
        c21303.m40368(true);
    }
}
