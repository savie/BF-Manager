package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15010 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f49038;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C9153 f49039;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20911 f49040;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7663 f49041;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RectF f49042;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9044 f49043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Bitmap f49044;

    public C15010(C9044 c9044, Bitmap bitmap, C9153 c9153, C20911 c20911) {
        this.f49043 = c9044;
        this.f49044 = bitmap;
        this.f49039 = c9153;
        this.f49040 = c20911;
        this.f49041 = null;
        this.f49042 = new RectF(0.0f, 0.0f, c9044.f29428, c9044.f29431);
    }

    public C15010(C9044 c9044, InterfaceC7663 interfaceC7663) {
        this.f49043 = c9044;
        this.f49041 = interfaceC7663;
        this.f49044 = null;
        this.f49039 = null;
        this.f49040 = null;
        this.f49042 = new RectF(0.0f, 0.0f, c9044.f29428, c9044.f29431);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m36158() {
        InterfaceC7663 interfaceC7663 = this.f49041;
        if (interfaceC7663 == null) {
            return 0L;
        }
        return interfaceC7663.mo20638();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m36159() {
        InterfaceC7663 interfaceC7663 = this.f49041;
        return interfaceC7663 != null ? interfaceC7663.mo20634() : this.f49039.m24287() + this.f49040.m47774();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36156() {
        C20911 c20911;
        return (this.f49038 || (c20911 = this.f49040) == null || !c20911.m47772()) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36157() {
        C20911 c20911 = this.f49040;
        if (c20911 == null) {
            return 1;
        }
        return c20911.m47775();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8299 m36152(RectF rectF, float f, C2442 c2442, long j, C17532 c17532) throws IOException {
        C20911 c20911;
        if (this.f49038 || (c20911 = this.f49040) == null || !c20911.m47772()) {
            throw new IOException("No SVG raster document");
        }
        return this.f49040.m47770(rectF, f, c2442, j, c17532);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36153(Canvas canvas, Paint paint) {
        if (this.f49038) {
            return;
        }
        InterfaceC7663 interfaceC7663 = this.f49041;
        if (interfaceC7663 != null) {
            interfaceC7663.mo20635(canvas, this.f49042, paint);
        } else {
            if (this.f49040.m47773(canvas)) {
                return;
            }
            canvas.drawBitmap(this.f49044, (Rect) null, this.f49042, paint);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36155(boolean z, RunnableC8582 runnableC8582) {
        InterfaceC7663 interfaceC7663;
        if (this.f49038 || (interfaceC7663 = this.f49041) == null) {
            return;
        }
        interfaceC7663.mo20637(z, runnableC8582);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m36154(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36154(C9153 c9153) {
        if (this.f49038) {
            return;
        }
        this.f49038 = true;
        InterfaceC7663 interfaceC7663 = this.f49041;
        if (interfaceC7663 != null) {
            interfaceC7663.mo20636(c9153);
            return;
        }
        this.f49044.recycle();
        this.f49039.close();
        this.f49040.m47771(c9153);
    }
}
