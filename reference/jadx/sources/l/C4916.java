package l;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ۙ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAJX */
/* JADX INFO: loaded from: classes3.dex */
public class C4916 extends C14090 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f17234;

    @Override // l.C14090
    @InterfaceC16341
    public synchronized long getNativeInstance() {
        long nativeInstance;
        nativeInstance = this.f17234;
        if (nativeInstance == -1) {
            nativeInstance = super.getNativeInstance();
            this.f17234 = nativeInstance;
        }
        return nativeInstance;
    }

    public C4916(int i) {
        super(1);
        this.f17234 = -1L;
    }

    public C4916() {
        this.f17234 = -1L;
    }

    public C4916(C4916 c4916) {
        super(c4916);
        this.f17234 = -1L;
    }

    @Override // android.graphics.Paint
    public final void reset() {
        super.reset();
        this.f17234 = -1L;
    }

    @Override // android.graphics.Paint
    public final void set(Paint paint) {
        super.set(paint);
        this.f17234 = -1L;
    }

    @Override // android.graphics.Paint
    public final Shader setShader(Shader shader) {
        Shader shader2 = super.setShader(shader);
        this.f17234 = -1L;
        return shader2;
    }

    @Override // android.graphics.Paint
    public final ColorFilter setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = super.setColorFilter(colorFilter);
        this.f17234 = -1L;
        return colorFilter2;
    }

    @Override // android.graphics.Paint
    public final Typeface setTypeface(Typeface typeface) {
        Typeface typeface2 = super.setTypeface(typeface);
        this.f17234 = -1L;
        return typeface2;
    }
}
