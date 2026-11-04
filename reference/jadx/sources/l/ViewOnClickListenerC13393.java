package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.۫᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC13393 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f42683;

    public ViewOnClickListenerC13393(Context context) {
        super(new C15688(context));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C6907.m19160(32.0f));
        int iM19160 = C6907.m19160(12.0f);
        marginLayoutParams.bottomMargin = iM19160;
        marginLayoutParams.topMargin = iM19160;
        marginLayoutParams.rightMargin = iM19160;
        marginLayoutParams.leftMargin = iM19160;
        this.itemView.setLayoutParams(marginLayoutParams);
        this.itemView.setBackground(C17423.m40913(context));
        this.itemView.setOnClickListener(this);
        ImageView imageView = (ImageView) this.itemView;
        this.f42683 = imageView;
        imageView.setImageTintList(C3296.f10779);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC12964 bindingAdapter = getBindingAdapter();
        if (bindingAdapter instanceof C15630) {
            C15630 c15630 = (C15630) bindingAdapter;
            ((C22344) c15630.f50764).accept((EnumC3459) c15630.f50765.get(getBindingAdapterPosition()));
        }
    }
}
