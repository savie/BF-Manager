package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۨ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E8ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12724 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f40742;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable.Callback f40743;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Drawable f40744;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f40745;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f40746;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable f40747;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC6759 f40748;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC11902 f40749;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f40750;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22179 f40751;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f40752 = false;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C12724(String str, AbstractC6759 abstractC6759, AbstractC11902 abstractC11902, C22179 c22179) {
        this.f40745 = str;
        this.f40748 = abstractC6759;
        this.f40749 = abstractC11902;
        this.f40751 = c22179;
        abstractC6759.getClass();
        this.f40747 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31534() {
        return this.f40745;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m31538() {
        return this.f40744 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31536(Drawable.Callback callback) {
        this.f40743 = callback == null ? null : new C20929(this, callback);
        setCallback(callback);
        Drawable.Callback callback2 = this.f40743;
        AbstractC6759 abstractC6759 = this.f40748;
        if (callback2 != null) {
            Drawable drawable = this.f40744;
            if (drawable != null && drawable.getCallback() == null) {
                this.f40744.setCallback(this.f40743);
            }
            Drawable drawable2 = this.f40744;
            boolean z = drawable2 == null || drawable2 == this.f40747;
            if (drawable2 != null) {
                drawable2.setCallback(this.f40743);
                Object obj = this.f40744;
                if ((obj instanceof Animatable) && this.f40752) {
                    ((Animatable) obj).start();
                }
            }
            if (z) {
                abstractC6759.mo18885(this);
                return;
            }
            return;
        }
        Drawable drawable3 = this.f40744;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            Object obj2 = this.f40744;
            if (obj2 instanceof Animatable) {
                Animatable animatable = (Animatable) obj2;
                boolean zIsRunning = animatable.isRunning();
                this.f40752 = zIsRunning;
                if (zIsRunning) {
                    animatable.stop();
                }
            }
        }
        abstractC6759.mo18884(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31537(Drawable drawable) {
        this.f40752 = false;
        Drawable drawable2 = this.f40744;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f40744 = drawable;
        m31533();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m31533() {
        Rect rect;
        int iMo6010;
        Rect rect2;
        if (this.f40750 == 0) {
            this.f40746 = true;
            Drawable drawable = this.f40744;
            if (drawable != null) {
                rect2 = drawable.getBounds();
                if (rect2.isEmpty()) {
                    rect2 = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    if (rect2.isEmpty()) {
                        rect2 = new Rect(0, 0, 1, 1);
                    }
                }
            } else {
                rect2 = new Rect(0, 0, 1, 1);
            }
            setBounds(rect2);
            return;
        }
        this.f40746 = false;
        C10990 c10990 = (C10990) this.f40749;
        c10990.getClass();
        Rect bounds = this.f40744.getBounds();
        int i = this.f40750;
        float f = this.f40742;
        C22179 c22179 = this.f40751;
        if (c22179 == null) {
            int iWidth = bounds.width();
            if (iWidth > i) {
                bounds = new Rect(0, 0, i, (int) ((bounds.height() / (iWidth / i)) + 0.5f));
            }
        } else {
            C5025 c5025 = c22179.f71455;
            C5025 c5026 = c22179.f71454;
            int iWidth2 = bounds.width();
            int iHeight = bounds.height();
            float f2 = iWidth2 / iHeight;
            if (c5025 != null) {
                if ("%".equals(c5025.f17420)) {
                    iMo6010 = (int) (((c5025.f17421 / 100.0f) * i) + 0.5f);
                } else {
                    iMo6010 = c10990.mo6010(c5025, iWidth2, f);
                }
                rect = new Rect(0, 0, iMo6010, (c5026 == null || "%".equals(c5026.f17420)) ? (int) ((iMo6010 / f2) + 0.5f) : c10990.mo6010(c5026, iHeight, f));
            } else if (c5026 != null && !"%".equals(c5026.f17420)) {
                int iMo6011 = c10990.mo6010(c5026, iHeight, f);
                rect = new Rect(0, 0, (int) ((iMo6011 * f2) + 0.5f), iMo6011);
            }
            bounds = rect;
        }
        this.f40744.setBounds(bounds);
        this.f40744.setCallback(this.f40743);
        setBounds(bounds);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31535(float f, int i) {
        this.f40750 = i;
        this.f40742 = f;
        if (this.f40746) {
            m31533();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (m31538()) {
            this.f40744.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (m31538()) {
            return this.f40744.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (m31538()) {
            return this.f40744.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (m31538()) {
            return this.f40744.getIntrinsicHeight();
        }
        return 1;
    }

    public final String toString() {
        return "AsyncDrawable{destination='" + this.f40745 + "', imageSize=" + this.f40751 + ", result=" + this.f40744 + ", canvasWidth=" + this.f40750 + ", textSize=" + this.f40742 + ", waitingForDimensions=" + this.f40746 + '}';
    }
}
