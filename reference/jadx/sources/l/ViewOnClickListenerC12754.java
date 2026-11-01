package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.۬֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC12754 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f42509;

    public ViewOnClickListenerC12754(Context context) {
        super(new C2830(context));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C13932.m33769(32.0f));
        int iM33769 = C13932.m33769(12.0f);
        marginLayoutParams.bottomMargin = iM33769;
        marginLayoutParams.topMargin = iM33769;
        marginLayoutParams.rightMargin = iM33769;
        marginLayoutParams.leftMargin = iM33769;
        this.itemView.setLayoutParams(marginLayoutParams);
        this.itemView.setBackground(C0674.m3029(context));
        this.itemView.setOnClickListener(this);
        ImageView imageView = (ImageView) this.itemView;
        this.f42509 = imageView;
        imageView.setImageTintList(C20368.f66009);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0414 bindingAdapter = getBindingAdapter();
        if (bindingAdapter instanceof C0758) {
            C0758 c0758 = (C0758) bindingAdapter;
            ((C2169) c0758.f3072).accept((EnumC20447) c0758.f3073.get(getBindingAdapterPosition()));
        }
    }
}
