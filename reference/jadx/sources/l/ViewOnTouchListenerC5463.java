package l;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC5463 extends AbstractC12554 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ImageView f18829;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f18830;

    public ViewOnTouchListenerC5463(AbstractActivityC12483 abstractActivityC12483, View view) {
        super(view);
        C0674.m3027(view);
        this.f18830 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f18829 = imageView;
        Drawable drawableM26304 = C10405.m26304(abstractActivityC12483, R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM26304);
        Drawable drawableMutate = drawableM26304.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15128(C9843 c9843, C4647 c4647) {
        this.f18830.setText(c9843.f33626);
        this.f18829.setTag(c4647);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        Object tag = view.getTag();
        if (!(tag instanceof C4647)) {
            return false;
        }
        ((C4647) tag).m12830(this);
        return false;
    }
}
