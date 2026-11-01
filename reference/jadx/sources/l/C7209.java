package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9649 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7209 extends Drawable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20615 f24018;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C7209(C20615 c20615) {
        this.f24018 = c20615;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C20615 c20615 = this.f24018;
        if (c20615.f67155) {
            Drawable drawable = c20615.f67154;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = c20615.f67159;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = c20615.f67160;
        if (drawable3 == null || !c20615.f67158) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        C20615 c20615 = this.f24018;
        boolean z = c20615.f67155;
        Drawable drawable = c20615.f67159;
        if (z) {
            if (c20615.f67154 != null) {
                drawable.getOutline(outline);
            }
        } else if (drawable != null) {
            drawable.getOutline(outline);
        }
    }
}
