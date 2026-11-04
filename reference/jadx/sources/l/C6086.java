package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۛۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75EB */
/* JADX INFO: loaded from: classes3.dex */
public class C6086 extends C15688 implements InterfaceC12051 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18018 f20806;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f20807;

    public C6086(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6086(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f20806;
        if (viewOnTouchListenerC18018 == null || viewOnTouchListenerC18018.m42022() == null) {
            this.f20806 = new ViewOnTouchListenerC18018(this);
        }
        ImageView.ScaleType scaleType = this.f20807;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f20807 = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f20806;
        if (viewOnTouchListenerC18018 == null || viewOnTouchListenerC18018.m42022() == null) {
            this.f20806 = new ViewOnTouchListenerC18018(this);
        }
        ImageView.ScaleType scaleType = this.f20807;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f20807 = null;
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return this.f20806.m42017();
    }

    @Override // l.C15688, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f20806;
        if (viewOnTouchListenerC18018 != null) {
            viewOnTouchListenerC18018.m42016();
        }
    }

    @Override // l.C15688, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f20806;
        if (viewOnTouchListenerC18018 != null) {
            viewOnTouchListenerC18018.m42016();
        }
    }

    @Override // l.C15688, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f20806;
        if (viewOnTouchListenerC18018 != null) {
            viewOnTouchListenerC18018.m42016();
        }
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f20806.m42013(onLongClickListener);
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f20806;
        if (viewOnTouchListenerC18018 != null) {
            viewOnTouchListenerC18018.m42014(scaleType);
        } else {
            this.f20807 = scaleType;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f20806.m42010();
        super.onDetachedFromWindow();
    }
}
