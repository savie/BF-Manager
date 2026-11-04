package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes.dex */
public final class C22007 extends C15688 implements InterfaceC5599 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13056 f70992;

    @Override // l.InterfaceC5599
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16579() {
        return false;
    }

    @Override // l.InterfaceC5599
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo16580() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22007(C13056 c13056, Context context) {
        super(context, null, R.attr.MT_Protector);
        this.f70992 = c13056;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C6696.m18717(this, getContentDescription());
        setOnTouchListener(new C4853(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f70992.m32535();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C0597.m2689(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
