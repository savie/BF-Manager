package l;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC1619 extends AbstractC11800 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ImageView f5580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f5581;

    public ViewOnTouchListenerC1619(AbstractActivityC17204 abstractActivityC17204, View view) {
        super(view);
        C17423.m40911(view);
        this.f5581 = (TextView) view.findViewById(R.id.title);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f5580 = imageView;
        Drawable drawableM20563 = C7508.m20563(abstractActivityC17204, R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM20563);
        Drawable drawableMutate = drawableM20563.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5717(C10567 c10567, C11999 c11999) {
        this.f5581.setText(c10567.f33581);
        this.f5580.setTag(c11999);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        Object tag = view.getTag();
        if (!(tag instanceof C11999)) {
            return false;
        }
        ((C11999) tag).m30178(this);
        return false;
    }
}
