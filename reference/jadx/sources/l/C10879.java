package l;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۤ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38NX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10879 extends GLSurfaceView implements InterfaceC22814 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34428 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22068 f34429;

    public C10879(Context context) {
        this(context, null);
    }

    public C10879(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C22068 c22068 = new C22068(this);
        this.f34429 = c22068;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c22068);
        setRenderMode(0);
    }

    @Override // l.InterfaceC22814
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27627(C17622 c17622) {
        this.f34429.m49898(c17622);
    }
}
