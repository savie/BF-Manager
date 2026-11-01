package l;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.᩷֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38NX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20546 extends GLSurfaceView implements InterfaceC15608 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66542 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7140 f66543;

    public C20546(Context context) {
        this(context, null);
    }

    public C20546(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C7140 c7140 = new C7140(this);
        this.f66543 = c7140;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c7140);
        setRenderMode(0);
    }

    @Override // l.InterfaceC15608
    /* JADX INFO: renamed from: ۙ */
    public final void mo37274(C17443 c17443) {
        this.f66543.m19036(c17443);
    }
}
