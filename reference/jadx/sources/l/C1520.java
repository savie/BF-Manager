package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: l.֨᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 66IQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1520 implements InterfaceC4854 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24236 f5301;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f5302;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f5303;

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ */
    public final int mo2501() {
        return 1;
    }

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ */
    public final void mo2503(RectF rectF, float f, boolean z) {
    }

    public C1520(C24236 c24236) {
        this.f5301 = c24236;
        int intrinsicWidth = c24236.getIntrinsicWidth();
        this.f5302 = intrinsicWidth;
        int intrinsicHeight = c24236.getIntrinsicHeight();
        this.f5303 = intrinsicHeight;
        c24236.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
    }

    @Override // l.InterfaceC4854
    public final int getWidth() {
        return this.f5302;
    }

    @Override // l.InterfaceC4854
    public final int getHeight() {
        return this.f5303;
    }

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ */
    public final void mo2502(Canvas canvas, Paint paint) {
        C24236 c24236 = this.f5301;
        if (c24236 != null) {
            c24236.draw(canvas);
        }
    }

    @Override // l.InterfaceC4854
    public final void close() {
        this.f5301 = null;
    }
}
