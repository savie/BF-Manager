package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۚܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8ZU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5417 extends Drawable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Drawable f18706;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20235 f18707;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f18708;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable.Callback f18709;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC21803 f18710;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f18711;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f18712;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Drawable f18713;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18714;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC22351 f18715;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f18716 = false;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C5417(String str, AbstractC22351 abstractC22351, AbstractC21803 abstractC21803, C20235 c20235) {
        this.f18712 = str;
        this.f18715 = abstractC22351;
        this.f18710 = abstractC21803;
        this.f18707 = c20235;
        abstractC22351.getClass();
        this.f18706 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m14990() {
        return this.f18712;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14994() {
        return this.f18713 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14992(Drawable.Callback callback) {
        this.f18709 = callback == null ? null : new C2594(this, callback);
        setCallback(callback);
        Drawable.Callback callback2 = this.f18709;
        AbstractC22351 abstractC22351 = this.f18715;
        if (callback2 != null) {
            Drawable drawable = this.f18713;
            if (drawable != null && drawable.getCallback() == null) {
                this.f18713.setCallback(this.f18709);
            }
            Drawable drawable2 = this.f18713;
            boolean z = drawable2 == null || drawable2 == this.f18706;
            if (drawable2 != null) {
                drawable2.setCallback(this.f18709);
                Object obj = this.f18713;
                if ((obj instanceof Animatable) && this.f18716) {
                    ((Animatable) obj).start();
                }
            }
            if (z) {
                abstractC22351.mo18438(this);
                return;
            }
            return;
        }
        Drawable drawable3 = this.f18713;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            Object obj2 = this.f18713;
            if (obj2 instanceof Animatable) {
                Animatable animatable = (Animatable) obj2;
                boolean zIsRunning = animatable.isRunning();
                this.f18716 = zIsRunning;
                if (zIsRunning) {
                    animatable.stop();
                }
            }
        }
        abstractC22351.mo18437(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14993(Drawable drawable) {
        this.f18716 = false;
        Drawable drawable2 = this.f18713;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f18713 = drawable;
        m14989();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m14989() {
        Rect rect;
        int iMo2348;
        Rect rect2;
        if (this.f18714 == 0) {
            this.f18711 = true;
            Drawable drawable = this.f18713;
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
        this.f18711 = false;
        C0478 c0478 = (C0478) this.f18710;
        c0478.getClass();
        Rect bounds = this.f18713.getBounds();
        int i = this.f18714;
        float f = this.f18708;
        C20235 c20235 = this.f18707;
        if (c20235 == null) {
            int iWidth = bounds.width();
            if (iWidth > i) {
                bounds = new Rect(0, 0, i, (int) ((bounds.height() / (iWidth / i)) + 0.5f));
            }
        } else {
            C16002 c16002 = c20235.f65661;
            C16002 c16003 = c20235.f65660;
            int iWidth2 = bounds.width();
            int iHeight = bounds.height();
            float f2 = iWidth2 / iHeight;
            if (c16002 != null) {
                if ("%".equals(c16002.f51812)) {
                    iMo2348 = (int) (((c16002.f51813 / 100.0f) * i) + 0.5f);
                } else {
                    iMo2348 = c0478.mo2348(c16002, iWidth2, f);
                }
                rect = new Rect(0, 0, iMo2348, (c16003 == null || "%".equals(c16003.f51812)) ? (int) ((iMo2348 / f2) + 0.5f) : c0478.mo2348(c16003, iHeight, f));
            } else if (c16003 != null && !"%".equals(c16003.f51812)) {
                int iMo2349 = c0478.mo2348(c16003, iHeight, f);
                rect = new Rect(0, 0, (int) ((iMo2349 * f2) + 0.5f), iMo2349);
            }
            bounds = rect;
        }
        this.f18713.setBounds(bounds);
        this.f18713.setCallback(this.f18709);
        setBounds(bounds);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14991(float f, int i) {
        this.f18714 = i;
        this.f18708 = f;
        if (this.f18711) {
            m14989();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (m14994()) {
            this.f18713.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (m14994()) {
            return this.f18713.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (m14994()) {
            return this.f18713.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (m14994()) {
            return this.f18713.getIntrinsicHeight();
        }
        return 1;
    }

    public final String toString() {
        return "AsyncDrawable{destination='" + this.f18712 + "', imageSize=" + this.f18707 + ", result=" + this.f18713 + ", canvasWidth=" + this.f18714 + ", textSize=" + this.f18708 + ", waitingForDimensions=" + this.f18711 + '}';
    }
}
