package l;

import android.animation.Animator;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34K8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11089 extends AbstractC12500 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f37648;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6149 f37649;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C6149 f37650;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f37651;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f37652;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f37653;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final RectF f37645 = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final RectF f37647 = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final RectF f37643 = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final C6149 f37646 = new C6149(-522.6f);

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final C6149 f37644 = new C6149(-197.6f);

    public C11089(AbstractActivityC12483 abstractActivityC12483) {
        this.f41799 = true;
        TypedArray typedArrayObtainStyledAttributes = abstractActivityC12483.obtainStyledAttributes(new int[]{R.attr.MT_Protector});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            setTint(color);
            this.f37652 = true;
            C6149 c6149 = new C6149(f37646);
            this.f37649 = c6149;
            C6149 c61410 = new C6149(f37644);
            this.f37650 = c61410;
            float f = abstractActivityC12483.getResources().getDisplayMetrics().density;
            this.f37651 = Math.round(4.0f * f);
            this.f37648 = Math.round(f * 16.0f);
            TypedArray typedArrayObtainStyledAttributes2 = abstractActivityC12483.obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            try {
                float f2 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
                typedArrayObtainStyledAttributes2.recycle();
                this.f37653 = f2;
                this.f41798 = new Animator[]{C20261.m45770(c6149), C20261.m45771(c61410)};
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27980(boolean z) {
        if (this.f41799 != z) {
            this.f41799 = z;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27978() {
        if (this.f37652) {
            this.f37652 = false;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f41799 ? this.f37648 : this.f37651;
    }

    @Override // l.AbstractC17438
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27979(Canvas canvas, Paint paint, int i, int i2) {
        boolean z = this.f41799;
        RectF rectF = f37645;
        if (z) {
            RectF rectF2 = f37647;
            canvas.scale(i / rectF2.width(), i2 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        } else {
            canvas.scale(i / rectF.width(), i2 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        }
        if (this.f37652) {
            paint.setAlpha(Math.round(this.f53591 * this.f37653));
            canvas.drawRect(rectF, paint);
            paint.setAlpha(this.f53591);
        }
        int iSave = canvas.save();
        C6149 c6149 = this.f37650;
        canvas.translate(c6149.f21004, 0.0f);
        canvas.scale(c6149.f21003, 1.0f);
        RectF rectF3 = f37643;
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        C6149 c61410 = this.f37649;
        canvas.translate(c61410.f21004, 0.0f);
        canvas.scale(c61410.f21003, 1.0f);
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(iSave2);
    }
}
