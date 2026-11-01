package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H5MU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnLongClickListenerC22543 extends AbstractC12554 implements View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C11072 f73512;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f73513;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f73514;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f73515;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f73516;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f73517;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f73518;

    public boolean onLongClick(View view) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo2418() {
        return this instanceof C19015;
    }

    public AbstractViewOnLongClickListenerC22543(AbstractActivityC12483 abstractActivityC12483, View view) {
        super(view);
        this.f73516 = C20368.f66000;
        this.f73515 = abstractActivityC12483;
        C0674.m3027(view);
        view.setOnLongClickListener(this);
        this.f73513 = view.findViewById(R.id.MT_Protector);
        this.f73512 = (C11072) view.findViewById(R.id.icon);
        this.f73517 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f73514 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f73518 = imageView;
        if (imageView != null) {
            imageView.setOnTouchListener(this);
            imageView.setFocusable(true);
            imageView.setClickable(true);
            Drawable drawableM26304 = C10405.m26304(abstractActivityC12483, R.drawable.MT_Protector);
            C13638.requireNonNull(drawableM26304);
            Drawable drawableMutate = drawableM26304.mutate();
            drawableMutate.setAlpha(119);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo2417(Resources.Theme theme) {
        C0674.m3027(this.itemView);
        this.f73517.setTextColor(C20368.f65976);
        TextView textView = this.f73514;
        if (textView != null) {
            textView.setTextColor(C20368.f66009);
        }
        ImageView imageView = this.f73518;
        if (imageView != null) {
            Drawable drawableM26304 = C10405.m26304(this.f73515, R.drawable.MT_Protector);
            C13638.requireNonNull(drawableM26304);
            Drawable drawableMutate = drawableM26304.mutate();
            drawableMutate.setAlpha(119);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo2419(AbstractC12554 abstractC12554) {
        throw new RuntimeException("Don't support");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.f73518 || motionEvent.getActionMasked() != 0 || view.getVisibility() != 0) {
            return false;
        }
        AbstractC0414 bindingAdapter = getBindingAdapter();
        if (!(bindingAdapter instanceof C12665)) {
            return false;
        }
        ((C12665) bindingAdapter).m31497(this);
        return true;
    }
}
