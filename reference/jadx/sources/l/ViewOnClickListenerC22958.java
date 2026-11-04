package l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22958 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f74575;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19974 f74576;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2908 f74577;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f74578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f74579;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22958(ActivityC19974 activityC19974, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC19974).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f74576 = activityC19974;
        this.f74579 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f74575 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f74578 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2908 c2908 = this.f74577;
        boolean z = c2908.f9519;
        ActivityC19974 activityC19974 = this.f74576;
        if (z) {
            if (c2908.f9518.equals("..")) {
                activityC19974.f64184.f28993.m27888();
                return;
            }
            activityC19974.f64184.f28993.f34815 = this.f74577.f9520.mo4294();
            activityC19974.f64184.f28993.m27889(null);
            return;
        }
        ApplicationC17729.f58258.edit().putString("apk_selector_path", this.f74577.f9520.getParent()).apply();
        String strMo4294 = this.f74577.f9520.mo4294();
        int i = ActivityC19974.f64182;
        Intent intent = new Intent();
        intent.putExtra("apkPath", strMo4294);
        activityC19974.setResult(-1, intent);
        activityC19974.finish();
    }
}
