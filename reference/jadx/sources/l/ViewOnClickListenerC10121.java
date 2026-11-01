package l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10121 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f34599;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7298 f34600;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15060 f34601;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f34602;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f34603;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10121(ActivityC7298 activityC7298, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC7298).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f34600 = activityC7298;
        this.f34603 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f34602 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f34599 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C15060 c15060 = this.f34601;
        boolean z = c15060.f49106;
        ActivityC7298 activityC7298 = this.f34600;
        if (z) {
            if (c15060.f49109.equals("..")) {
                activityC7298.f24234.f69596.m22541();
                return;
            }
            activityC7298.f24234.f69596.f29953 = this.f34601.f49108.mo33986();
            activityC7298.f24234.f69596.m22542(null);
            return;
        }
        ApplicationC0716.f2992.edit().putString("apk_selector_path", this.f34601.f49108.getParent()).apply();
        String strMo33986 = this.f34601.f49108.mo33986();
        int i = ActivityC7298.f24232;
        Intent intent = new Intent();
        intent.putExtra("apkPath", strMo33986);
        activityC7298.setResult(-1, intent);
        activityC7298.finish();
    }
}
