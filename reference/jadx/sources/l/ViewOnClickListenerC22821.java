package l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22821 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ImageView f74238;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f74239;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C2358 f74240;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f74241;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7298 f74242;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f74243;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22821(ActivityC7298 activityC7298, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC7298).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f74242 = activityC7298;
        this.f74238 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f74243 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f74239 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f74241 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.f74240.f8322.applicationInfo.sourceDir;
        int i = ActivityC7298.f24232;
        Intent intent = new Intent();
        intent.putExtra("apkPath", str);
        ActivityC7298 activityC7298 = this.f74242;
        activityC7298.setResult(-1, intent);
        activityC7298.finish();
    }
}
