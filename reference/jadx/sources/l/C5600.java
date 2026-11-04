package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.material.navigation.DrawerLayoutUtils;

/* JADX INFO: renamed from: l.ۚۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F6JW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5600 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f19427 = new Paint(1);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Path f19428 = new Path();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f19429;

    public C5600(float f) {
        this.f19429 = f * 26.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16582(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float f7 = (f6 * f6) + (f5 * f5);
        float f8 = this.f19429;
        return f7 <= f8 * f8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16581(Canvas canvas, float f, float f2) {
        Paint paint = this.f19427;
        paint.setColor(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
        float f3 = this.f19429;
        canvas.drawCircle(f, f2, f3, paint);
        Path path = this.f19428;
        path.rewind();
        float f4 = f - (0.24f * f3);
        float f5 = 0.43f * f3;
        path.moveTo(f4, f2 - f5);
        path.lineTo((f3 * 0.48f) + f, f2);
        path.lineTo(f4, f5 + f2);
        path.close();
        paint.setColor(-1);
        canvas.drawPath(path, paint);
    }
}
