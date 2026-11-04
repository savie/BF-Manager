package l;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4LW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2560 extends AbstractViewOnLongClickListenerC5544 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ImageView f8228;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractViewOnClickListenerC8526 f8229;

    public C2560(AbstractActivityC17204 abstractActivityC17204, View view) {
        super(abstractActivityC17204, view);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        this.f8228 = imageView;
        imageView.setImageResource(R.drawable.MT_Protector);
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8595(Resources.Theme theme) {
        C17423.m40911(this.itemView);
        this.f19266.setTextColor(C3296.f10779);
        this.f8228.setImageResource(R.drawable.MT_Protector);
    }
}
