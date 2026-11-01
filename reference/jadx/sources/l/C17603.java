package l;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R4LW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17603 extends AbstractViewOnLongClickListenerC22543 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ImageView f55945;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractViewOnClickListenerC6314 f55946;

    public C17603(AbstractActivityC12483 abstractActivityC12483, View view) {
        super(abstractActivityC12483, view);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        this.f55945 = imageView;
        imageView.setImageResource(R.drawable.MT_Protector);
    }

    @Override // l.AbstractViewOnLongClickListenerC22543
    /* JADX INFO: renamed from: ۙ */
    public final void mo2417(Resources.Theme theme) {
        C0674.m3027(this.itemView);
        this.f73517.setTextColor(C20368.f66009);
        this.f55945.setImageResource(R.drawable.MT_Protector);
    }
}
