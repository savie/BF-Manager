package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۜܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 75EB */
/* JADX INFO: loaded from: classes3.dex */
public class C6883 extends C2830 implements InterfaceC4060 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18878 f23187;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f23188;

    public C6883(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6883(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f23187;
        if (viewOnTouchListenerC18878 == null || viewOnTouchListenerC18878.m43539() == null) {
            this.f23187 = new ViewOnTouchListenerC18878(this);
        }
        ImageView.ScaleType scaleType = this.f23188;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f23188 = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f23187;
        if (viewOnTouchListenerC18878 == null || viewOnTouchListenerC18878.m43539() == null) {
            this.f23187 = new ViewOnTouchListenerC18878(this);
        }
        ImageView.ScaleType scaleType = this.f23188;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f23188 = null;
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return this.f23187.m43550();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18501(float f, float f2) {
        this.f23187.m43549(f, f2);
    }

    @Override // l.C2830, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f23187;
        if (viewOnTouchListenerC18878 != null) {
            viewOnTouchListenerC18878.m43540();
        }
    }

    @Override // l.C2830, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f23187;
        if (viewOnTouchListenerC18878 != null) {
            viewOnTouchListenerC18878.m43540();
        }
    }

    @Override // l.C2830, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f23187;
        if (viewOnTouchListenerC18878 != null) {
            viewOnTouchListenerC18878.m43540();
        }
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f23187.m43545(onLongClickListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18500(float f) {
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f23187;
        ImageView imageViewM43539 = viewOnTouchListenerC18878.m43539();
        if (imageViewM43539 != null) {
            viewOnTouchListenerC18878.m43544(f, imageViewM43539.getRight() / 2.0f, imageViewM43539.getBottom() / 2.0f, false);
        }
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f23187;
        if (viewOnTouchListenerC18878 != null) {
            viewOnTouchListenerC18878.m43546(scaleType);
        } else {
            this.f23188 = scaleType;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f23187.m43541();
        super.onDetachedFromWindow();
    }
}
