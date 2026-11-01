package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC4064 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f14962;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20293 f14963;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC4064(ActivityC20293 activityC20293, View view, boolean z) {
        super(view);
        this.f14963 = activityC20293;
        this.f14962 = z;
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.MT_Protector);
        if (z) {
            textView.setText(activityC20293.getString(R.string.MT_Protector) + " (MT2/keys)");
            imageView2.setVisibility(8);
            C18933.m43611(imageView, C16737.m39288(R.string.MT_Protector));
            imageView.setOnClickListener(this);
            return;
        }
        textView.setText(activityC20293.getString(R.string.MT_Protector) + " (MT2/keystore)");
        C18933.m43611(imageView, C16737.m39288(R.string.MT_Protector));
        C18933.m43611(imageView2, C16737.m39288(R.string.MT_Protector));
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        ActivityC20293 activityC20293 = this.f14963;
        if (id == R.id.MT_Protector) {
            Main.m68(activityC20293, C11904.m29695().m46690(this.f14962 ? "keys" : "keystore").mo33986(), activityC20293.f65764);
        } else {
            new C22618(activityC20293, new InterfaceC17295() { // from class: l.۬ܽۨ
                @Override // l.InterfaceC17295
                public final void accept(Object obj) {
                    ActivityC20293 activityC20294 = this.f43992.f14963;
                    activityC20294.f65759 = ((AbstractC20745) obj).getName();
                    ActivityC20293.m45803(activityC20294);
                }
            }).m50139();
        }
    }
}
