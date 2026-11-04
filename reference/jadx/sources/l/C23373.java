package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6IV */
/* JADX INFO: loaded from: classes.dex */
public class C23373 extends C19023 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f75672;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f75673;

    public C23373(Context context, AttributeSet attributeSet) {
        Drawable drawableM2186;
        super(context, attributeSet);
        if (Build.VERSION.SDK_INT >= 23) {
            drawableM2186 = C0385.m2186(getContext(), R.drawable.MT_Protector);
        } else {
            Resources resources = getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.drawable.MT_Protector, options);
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-2039584, PorterDuff.Mode.SRC_IN);
            C16083 c16083 = new C16083();
            c16083.m38245(new int[]{android.R.attr.state_checked}, new C3235(bitmapDecodeResource, 10, porterDuffColorFilter), R.id.MT_Protector);
            c16083.m38245(new int[0], new C3235(bitmapDecodeResource, 0, porterDuffColorFilter), R.id.MT_Protector);
            AnimationDrawable animationDrawable = new AnimationDrawable();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            int i = 0;
            while (i < 16) {
                animationDrawable.addFrame(new C3235(bitmapDecodeResource, i < 6 ? 0 : i - 5, porterDuffColorFilter), 15);
                animationDrawable2.addFrame(new C3235(bitmapDecodeResource, i < 7 ? i + 11 : 0, porterDuffColorFilter), 15);
                i++;
            }
            c16083.m38244(R.id.MT_Protector, R.id.MT_Protector, animationDrawable);
            c16083.m38244(R.id.MT_Protector, R.id.MT_Protector, animationDrawable2);
            drawableM2186 = c16083;
        }
        Drawable drawableMutate = drawableM2186.mutate();
        this.f75672 = drawableMutate;
        C0597.m2700(drawableMutate, -2039584);
        drawableMutate.setCallback(this);
        drawableMutate.setState(getDrawableState());
        m52538();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52539(boolean z) {
        if (this.f75673 == z) {
            return;
        }
        this.f75673 = z;
        this.f75672.setState(getDrawableState());
        jumpDrawablesToCurrentState();
        m52538();
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawableM14518 = C4661.m14518(this);
        if (!this.f75673 || drawableM14518 == null) {
            return;
        }
        Rect bounds = drawableM14518.getBounds();
        Drawable drawable = this.f75672;
        drawable.setBounds(bounds);
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // l.C19023, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f75672;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            if (this.f75673) {
                return;
            }
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f75672 || super.verifyDrawable(drawable);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f75672;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m52538();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m52538();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m52538();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f75672.setVisible(false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52538() {
        Drawable drawable = this.f75672;
        if (drawable != null) {
            drawable.setVisible(this.f75673 && isShown() && getWindowVisibility() == 0, false);
        }
    }
}
