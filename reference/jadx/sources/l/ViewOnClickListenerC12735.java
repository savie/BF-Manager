package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC12735 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f40768;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3786 f40769;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC12735(ActivityC3786 activityC3786, View view, boolean z) {
        super(view);
        this.f40769 = activityC3786;
        this.f40768 = z;
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.MT_Protector);
        if (z) {
            textView.setText(activityC3786.getString(R.string.MT_Protector) + " (MT2/keys)");
            imageView2.setVisibility(8);
            C6696.m18717(imageView, C21576.m49088(R.string.MT_Protector));
            imageView.setOnClickListener(this);
            return;
        }
        textView.setText(activityC3786.getString(R.string.MT_Protector) + " (MT2/keystore)");
        C6696.m18717(imageView, C21576.m49088(R.string.MT_Protector));
        C6696.m18717(imageView2, C21576.m49088(R.string.MT_Protector));
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        ActivityC3786 activityC3786 = this.f40769;
        if (id == R.id.MT_Protector) {
            Main.m55(activityC3786, C6382.m18134().m49876(this.f40768 ? "keys" : "keystore").mo4294(), activityC3786.f12973);
        } else {
            new C10759(activityC3786, new InterfaceC0818() { // from class: l.ܳ֡ۤ
                @Override // l.InterfaceC0818
                public final void accept(Object obj) {
                    ActivityC3786 activityC3787 = this.f48888.f40769;
                    activityC3787.f12970 = ((AbstractC22044) obj).getName();
                    ActivityC3786.m12309(activityC3787);
                }
            }).m27420();
        }
    }
}
