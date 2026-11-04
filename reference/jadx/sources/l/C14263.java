package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9649 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14263 extends Drawable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20977 f45074;

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

    public C14263(C20977 c20977) {
        this.f45074 = c20977;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C20977 c20977 = this.f45074;
        if (c20977.f67076) {
            Drawable drawable = c20977.f67075;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = c20977.f67082;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = c20977.f67077;
        if (drawable3 == null || !c20977.f67081) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        C20977 c20977 = this.f45074;
        boolean z = c20977.f67076;
        Drawable drawable = c20977.f67082;
        if (z) {
            if (c20977.f67075 != null) {
                drawable.getOutline(outline);
            }
        } else if (drawable != null) {
            drawable.getOutline(outline);
        }
    }
}
