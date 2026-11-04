package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5MU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnLongClickListenerC5544 extends AbstractC11800 implements View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f19261;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final TextView f19262;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f19263;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f19264;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3034 f19265;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f19266;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f19267;

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo16457() {
        return this instanceof C24190;
    }

    public AbstractViewOnLongClickListenerC5544(AbstractActivityC17204 abstractActivityC17204, View view) {
        super(view);
        this.f19261 = C3296.f10776;
        this.f19264 = abstractActivityC17204;
        C17423.m40911(view);
        view.setOnLongClickListener(this);
        this.f19263 = view.findViewById(R.id.MT_Protector);
        this.f19265 = (C3034) view.findViewById(R.id.icon);
        this.f19266 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f19262 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f19267 = imageView;
        if (imageView != null) {
            imageView.setOnTouchListener(this);
            imageView.setFocusable(true);
            imageView.setClickable(true);
            Drawable drawableM20563 = C7508.m20563(abstractActivityC17204, R.drawable.MT_Protector);
            C17359.requireNonNull(drawableM20563);
            Drawable drawableMutate = drawableM20563.mutate();
            drawableMutate.setAlpha(119);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo8595(Resources.Theme theme) {
        C17423.m40911(this.itemView);
        this.f19266.setTextColor(C3296.f10751);
        TextView textView = this.f19262;
        if (textView != null) {
            textView.setTextColor(C3296.f10779);
        }
        ImageView imageView = this.f19267;
        if (imageView != null) {
            Drawable drawableM20563 = C7508.m20563(this.f19264, R.drawable.MT_Protector);
            C17359.requireNonNull(drawableM20563);
            Drawable drawableMutate = drawableM20563.mutate();
            drawableMutate.setAlpha(119);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo16458(AbstractC11800 abstractC11800) {
        throw new RuntimeException("Don't support");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.f19267 || motionEvent.getActionMasked() != 0 || view.getVisibility() != 0) {
            return false;
        }
        AbstractC12964 bindingAdapter = getBindingAdapter();
        if (!(bindingAdapter instanceof C9271)) {
            return false;
        }
        ((C9271) bindingAdapter).m24484(this);
        return true;
    }
}
