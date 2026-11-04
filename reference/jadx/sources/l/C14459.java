package l;

import android.animation.Animator;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 34K8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14459 extends AbstractC6257 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f45505;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C4019 f45506;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f45507;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f45508;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4019 f45509;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f45510;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final RectF f45503 = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final RectF f45502 = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final RectF f45501 = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final C4019 f45500 = new C4019(-522.6f);

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final C4019 f45504 = new C4019(-197.6f);

    public C14459(AbstractActivityC17204 abstractActivityC17204) {
        this.f21231 = true;
        TypedArray typedArrayObtainStyledAttributes = abstractActivityC17204.obtainStyledAttributes(new int[]{R.attr.MT_Protector});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            setTint(color);
            this.f45510 = true;
            C4019 c4019 = new C4019(f45500);
            this.f45509 = c4019;
            C4019 c40110 = new C4019(f45504);
            this.f45506 = c40110;
            float f = abstractActivityC17204.getResources().getDisplayMetrics().density;
            this.f45507 = Math.round(4.0f * f);
            this.f45508 = Math.round(f * 16.0f);
            TypedArray typedArrayObtainStyledAttributes2 = abstractActivityC17204.obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            try {
                float f2 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
                typedArrayObtainStyledAttributes2.recycle();
                this.f45505 = f2;
                this.f21230 = new Animator[]{C3273.m10774(c4019), C3273.m10775(c40110)};
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
    public final void m34928(boolean z) {
        if (this.f21231 != z) {
            this.f21231 = z;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34926() {
        if (this.f45510) {
            this.f45510 = false;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f21231 ? this.f45508 : this.f45507;
    }

    @Override // l.AbstractC24157
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34927(Canvas canvas, Paint paint, int i, int i2) {
        boolean z = this.f21231;
        RectF rectF = f45503;
        if (z) {
            RectF rectF2 = f45502;
            canvas.scale(i / rectF2.width(), i2 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        } else {
            canvas.scale(i / rectF.width(), i2 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        }
        if (this.f45510) {
            paint.setAlpha(Math.round(this.f39271 * this.f45505));
            canvas.drawRect(rectF, paint);
            paint.setAlpha(this.f39271);
        }
        int iSave = canvas.save();
        C4019 c4019 = this.f45506;
        canvas.translate(c4019.f13727, 0.0f);
        canvas.scale(c4019.f13726, 1.0f);
        RectF rectF3 = f45501;
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        C4019 c40110 = this.f45509;
        canvas.translate(c40110.f13727, 0.0f);
        canvas.scale(c40110.f13726, 1.0f);
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(iSave2);
    }
}
