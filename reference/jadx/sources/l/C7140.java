package l;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: l.۟֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38NX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7140 implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C20546 f23865;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15121 f23867;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23868;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17443 f23870;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final float[] f23862 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f23863 = {"y_tex", "u_tex", "v_tex"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final FloatBuffer f23861 = C17942.m41760(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f23872 = new int[3];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f23866 = new int[3];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f23869 = new int[3];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int[] f23864 = new int[3];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicReference f23871 = new AtomicReference();

    public C7140(C20546 c20546) {
        this.f23865 = c20546;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f23869;
            this.f23864[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f23866;
        try {
            C15121 c15121 = new C15121("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f23867 = c15121;
            GLES20.glVertexAttribPointer(c15121.m36242("in_pos"), 2, 5126, false, 0, (Buffer) f23861);
            iArr[0] = this.f23867.m36242("in_tc_y");
            iArr[1] = this.f23867.m36242("in_tc_u");
            iArr[2] = this.f23867.m36242("in_tc_v");
            this.f23868 = this.f23867.m36243("mColorConversion");
            C17942.m41761();
            int[] iArr2 = this.f23872;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f23867.m36243(f23863[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    C17942.m41762(3553, iArr2[i]);
                }
                C17942.m41761();
            } catch (C21470 unused) {
            }
            C17942.m41761();
        } catch (C21470 unused2) {
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        C17443 c17443 = (C17443) this.f23871.getAndSet(null);
        if (c17443 == null && this.f23870 == null) {
            return;
        }
        if (c17443 != null) {
            C17443 c17444 = this.f23870;
            if (c17444 != null) {
                c17444.getClass();
                throw null;
            }
            this.f23870 = c17443;
        }
        this.f23870.getClass();
        GLES20.glUniformMatrix3fv(this.f23868, 1, false, f23862, 0);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19036(C17443 c17443) {
        if (((C17443) this.f23871.getAndSet(c17443)) != null) {
            throw null;
        }
        this.f23865.requestRender();
    }
}
