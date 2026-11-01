package l;

import android.graphics.RectF;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۗܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M6JW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3297 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF f12200 = new RectF();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f12199 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f12198 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9803(long j, RectF rectF, boolean z) {
        long jMax = Math.max(1L, j - this.f12199);
        float f = rectF.left;
        RectF rectF2 = this.f12200;
        boolean z2 = this.f12199 >= 0 && (Math.max(Math.max(Math.abs(f - rectF2.left), Math.abs(rectF.top - rectF2.top)), Math.max(Math.abs(rectF.right - rectF2.right), Math.abs(rectF.bottom - rectF2.bottom))) * 1000.0f) / ((float) jMax) <= Math.min(rectF.width(), rectF.height()) * 0.4f;
        rectF2.set(rectF);
        this.f12199 = j;
        if (!z) {
            this.f12198 = -1L;
            return 0L;
        }
        if (this.f12198 < 0) {
            this.f12198 = j;
        }
        return Math.max(0L, Math.min(z2 ? 40L : 80L, (this.f12198 + ((long) (z2 ? UMErrorCode.E_UM_BE_NOT_MAINPROCESS : 400))) - j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9804() {
        this.f12198 = -1L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9805() {
        this.f12198 = -1L;
        this.f12199 = -1L;
        this.f12200.setEmpty();
    }
}
