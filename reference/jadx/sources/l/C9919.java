package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9919 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final RectF f33896;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5270 f33897;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20502 f33898;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10625 f33899;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f33900;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20937 f33901;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Bitmap f33902;

    public C9919(C20937 c20937, Bitmap bitmap, C20502 c20502, C5270 c5270) {
        this.f33901 = c20937;
        this.f33902 = bitmap;
        this.f33898 = c20502;
        this.f33897 = c5270;
        this.f33899 = null;
        this.f33896 = new RectF(0.0f, 0.0f, c20937.f68250, c20937.f68251);
    }

    public C9919(C20937 c20937, InterfaceC10625 interfaceC10625) {
        this.f33901 = c20937;
        this.f33899 = interfaceC10625;
        this.f33902 = null;
        this.f33898 = null;
        this.f33897 = null;
        this.f33896 = new RectF(0.0f, 0.0f, c20937.f68250, c20937.f68251);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m25123() {
        InterfaceC10625 interfaceC10625 = this.f33899;
        if (interfaceC10625 == null) {
            return 0L;
        }
        return interfaceC10625.mo23241();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m25122() {
        InterfaceC10625 interfaceC10625 = this.f33899;
        return interfaceC10625 != null ? interfaceC10625.mo23237() : this.f33898.m46301();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25121() {
        C5270 c5270;
        return (this.f33900 || (c5270 = this.f33897) == null || !c5270.m14553()) ? false : true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m25116() {
        C5270 c5270 = this.f33897;
        if (c5270 == null) {
            return 1;
        }
        return c5270.m14555();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20232 m25117(RectF rectF, float f, C0745 c0745, long j, C11393 c11393) throws IOException {
        C5270 c5270;
        if (this.f33900 || (c5270 = this.f33897) == null || !c5270.m14553()) {
            throw new IOException("No SVG raster document");
        }
        return this.f33897.m14551(rectF, f, c0745, j, c11393);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25118(Canvas canvas, Paint paint) {
        if (this.f33900) {
            return;
        }
        InterfaceC10625 interfaceC10625 = this.f33899;
        if (interfaceC10625 != null) {
            interfaceC10625.mo23238(canvas, this.f33896, paint);
        } else {
            if (this.f33897.m14554(canvas)) {
                return;
            }
            canvas.drawBitmap(this.f33902, (Rect) null, this.f33896, paint);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25120(boolean z, RunnableC7159 runnableC7159) {
        InterfaceC10625 interfaceC10625;
        if (this.f33900 || (interfaceC10625 = this.f33899) == null) {
            return;
        }
        interfaceC10625.mo23240(z, runnableC7159);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m25119(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25119(C20502 c20502) {
        if (this.f33900) {
            return;
        }
        this.f33900 = true;
        InterfaceC10625 interfaceC10625 = this.f33899;
        if (interfaceC10625 != null) {
            interfaceC10625.mo23239(c20502);
            return;
        }
        this.f33902.recycle();
        this.f33898.close();
        this.f33897.m14552(c20502);
    }
}
