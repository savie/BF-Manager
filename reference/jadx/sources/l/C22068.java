package l;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: l.᩷۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38NX */
/* JADX INFO: loaded from: classes.dex */
public final class C22068 implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C2882 f71150;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10879 f71152;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71153;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17622 f71155;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final float[] f71146 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f71145 = {"y_tex", "u_tex", "v_tex"};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final FloatBuffer f71147 = C7357.m20173(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] f71151 = new int[3];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f71149 = new int[3];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int[] f71148 = new int[3];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f71154 = new int[3];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicReference f71156 = new AtomicReference();

    public C22068(C10879 c10879) {
        this.f71152 = c10879;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f71148;
            this.f71154[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f71149;
        try {
            C2882 c2882 = new C2882("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f71150 = c2882;
            GLES20.glVertexAttribPointer(c2882.m9496("in_pos"), 2, 5126, false, 0, (Buffer) f71147);
            iArr[0] = this.f71150.m9496("in_tc_y");
            iArr[1] = this.f71150.m9496("in_tc_u");
            iArr[2] = this.f71150.m9496("in_tc_v");
            this.f71153 = this.f71150.m9497("mColorConversion");
            C7357.m20174();
            int[] iArr2 = this.f71151;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f71150.m9497(f71145[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    C7357.m20175(3553, iArr2[i]);
                }
                C7357.m20174();
            } catch (C8848 unused) {
            }
            C7357.m20174();
        } catch (C8848 unused2) {
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        C17622 c17622 = (C17622) this.f71156.getAndSet(null);
        if (c17622 == null && this.f71155 == null) {
            return;
        }
        if (c17622 != null) {
            C17622 c17623 = this.f71155;
            if (c17623 != null) {
                c17623.getClass();
                throw null;
            }
            this.f71155 = c17622;
        }
        this.f71155.getClass();
        GLES20.glUniformMatrix3fv(this.f71153, 1, false, f71146, 0);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49898(C17622 c17622) {
        if (((C17622) this.f71156.getAndSet(c17622)) != null) {
            throw null;
        }
        this.f71152.requestRender();
    }
}
