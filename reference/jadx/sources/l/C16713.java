package l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16713 extends C19122 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f53506;

    public C16713(Drawable drawable) {
        super(drawable);
        this.f53506 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39189(boolean z) {
        this.f53506 = z;
    }

    @Override // l.C19122, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f53506) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // l.C19122, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f53506) {
            super.draw(canvas);
        }
    }

    @Override // l.C19122, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f53506) {
            super.setHotspot(f, f2);
        }
    }

    @Override // l.C19122, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f53506) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // l.C19122, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f53506) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
