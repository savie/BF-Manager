package l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC9619 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f31109;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f31110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21554 f31111;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ImageView f31112;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19974 f31113;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f31114;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC9619(ActivityC19974 activityC19974, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC19974).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f31113 = activityC19974;
        this.f31112 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f31114 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f31110 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f31109 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.f31111.f68839.applicationInfo.sourceDir;
        int i = ActivityC19974.f64182;
        Intent intent = new Intent();
        intent.putExtra("apkPath", str);
        ActivityC19974 activityC19974 = this.f31113;
        activityC19974.setResult(-1, intent);
        activityC19974.finish();
    }
}
