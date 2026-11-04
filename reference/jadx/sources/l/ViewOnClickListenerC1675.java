package l;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC1675 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11369 f5776;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Animatable f5777;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ImageView f5778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f5779;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6018(int i) {
        C11369 c11369 = this.f5776;
        String str = ((C14902) c11369.get(i)).f48685;
        TextView textView = this.f5779;
        textView.setText(str);
        int iMo3299 = c11369.mo3299();
        ImageView imageView = this.f5778;
        Animatable animatable = this.f5777;
        if (i == iMo3299) {
            textView.setTextColor(C3296.f10738);
            imageView.setVisibility(0);
            if (C3669.f12621.m40346() == Boolean.TRUE) {
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
        textView.setTextColor(C3296.f10751);
        imageView.setVisibility(8);
        if (animatable.isRunning()) {
            animatable.stop();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC1675(C11369 c11369, View view) {
        super(view);
        this.f5776 = c11369;
        this.f5779 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        this.f5778 = imageView;
        this.f5777 = (Animatable) imageView.getDrawable();
        view.setOnClickListener(this);
        C17423.m40915(view);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        C11369 c11369 = this.f5776;
        int iMo3299 = c11369.mo3299();
        if (bindingAdapterPosition != iMo3299) {
            if (c11369.f35784.m53131(bindingAdapterPosition)) {
                this.f5778.setVisibility(0);
                AbstractC12964 bindingAdapter = getBindingAdapter();
                C17359.requireNonNull(bindingAdapter);
                bindingAdapter.notifyItemChanged(iMo3299);
                return;
            }
            return;
        }
        c11369.f35784.m53127();
    }
}
