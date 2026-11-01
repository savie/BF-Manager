package l;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11932 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ImageView f40032;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Animatable f40033;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2758 f40034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f40035;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29728(int i) {
        C2758 c2758 = this.f40034;
        String str = ((C13689) c2758.get(i)).f45154;
        TextView textView = this.f40035;
        textView.setText(str);
        int iMo7403 = c2758.mo7403();
        ImageView imageView = this.f40032;
        Animatable animatable = this.f40033;
        if (i == iMo7403) {
            textView.setTextColor(C20368.f65970);
            imageView.setVisibility(0);
            if (C3589.f13219.m44956() == Boolean.TRUE) {
                if (animatable.isRunning()) {
                    return;
                }
                animatable.start();
                return;
            } else {
                if (animatable.isRunning()) {
                    animatable.stop();
                    return;
                }
                return;
            }
        }
        textView.setTextColor(C20368.f65976);
        imageView.setVisibility(8);
        if (animatable.isRunning()) {
            animatable.stop();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC11932(C2758 c2758, View view) {
        super(view);
        this.f40034 = c2758;
        this.f40035 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        this.f40032 = imageView;
        this.f40033 = (Animatable) imageView.getDrawable();
        view.setOnClickListener(this);
        C0674.m3031(view);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        C2758 c2758 = this.f40034;
        int iMo7403 = c2758.mo7403();
        if (bindingAdapterPosition != iMo7403) {
            if (c2758.f10572.m31740(bindingAdapterPosition)) {
                this.f40032.setVisibility(0);
                AbstractC0414 bindingAdapter = getBindingAdapter();
                C13638.requireNonNull(bindingAdapter);
                bindingAdapter.notifyItemChanged(iMo7403);
                return;
            }
            return;
        }
        c2758.f10572.m31738();
    }
}
