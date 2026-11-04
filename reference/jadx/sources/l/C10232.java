package l;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ۢܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAJX */
/* JADX INFO: loaded from: classes4.dex */
public class C10232 extends C1284 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f32694;

    @Override // l.C1284
    @InterfaceC19352
    public synchronized long getNativeInstance() {
        long nativeInstance;
        nativeInstance = this.f32694;
        if (nativeInstance == -1) {
            nativeInstance = super.getNativeInstance();
            this.f32694 = nativeInstance;
        }
        return nativeInstance;
    }

    public C10232(int i) {
        super(1);
        this.f32694 = -1L;
    }

    public C10232() {
        this.f32694 = -1L;
    }

    public C10232(C10232 c10232) {
        super(c10232);
        this.f32694 = -1L;
    }

    @Override // android.graphics.Paint
    public final void reset() {
        super.reset();
        this.f32694 = -1L;
    }

    @Override // android.graphics.Paint
    public final void set(Paint paint) {
        super.set(paint);
        this.f32694 = -1L;
    }

    @Override // android.graphics.Paint
    public final Shader setShader(Shader shader) {
        Shader shader2 = super.setShader(shader);
        this.f32694 = -1L;
        return shader2;
    }

    @Override // android.graphics.Paint
    public final ColorFilter setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = super.setColorFilter(colorFilter);
        this.f32694 = -1L;
        return colorFilter2;
    }

    @Override // android.graphics.Paint
    public final Typeface setTypeface(Typeface typeface) {
        Typeface typeface2 = super.setTypeface(typeface);
        this.f32694 = -1L;
        return typeface2;
    }
}
