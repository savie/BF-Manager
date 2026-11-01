package l;

import android.opengl.GLES20;
import java.nio.Buffer;

/* JADX INFO: renamed from: l.ۤ۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8I9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10314 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f35374;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C15121 f35375;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8903 f35376;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f35377;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f35378;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f35379;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f35380;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35381;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final float[] f35373 = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final float[] f35372 = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final float[] f35371 = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m26131(C8197 c8197) {
        C18074 c18074 = c8197.f28557;
        C18074 c18075 = c8197.f28559;
        return c18074.m42068() == 1 && c18074.m42067().f60894 == 0 && c18075.m42068() == 1 && c18075.m42067().f60894 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26134(C8197 c8197) {
        if (m26131(c8197)) {
            this.f35377 = c8197.f28556;
            this.f35376 = new C8903(c8197.f28557.m42067());
            if (c8197.f28558) {
                return;
            }
            new C8903(c8197.f28559.m42067());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26132() {
        try {
            C15121 c15121 = new C15121("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f35375 = c15121;
            this.f35380 = c15121.m36243("uMvpMatrix");
            this.f35379 = this.f35375.m36243("uTexMatrix");
            this.f35378 = this.f35375.m36242("aPosition");
            this.f35381 = this.f35375.m36242("aTexCoords");
            this.f35374 = this.f35375.m36243("uTexture");
        } catch (C21470 unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26133(int i, float[] fArr) {
        float[] fArr2;
        C8903 c8903 = this.f35376;
        if (c8903 == null) {
            return;
        }
        int i2 = this.f35377;
        if (i2 == 1) {
            fArr2 = f35372;
        } else if (i2 == 2) {
            fArr2 = f35371;
        } else {
            fArr2 = f35373;
        }
        GLES20.glUniformMatrix3fv(this.f35379, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f35380, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f35374, 0);
        try {
            C17942.m41761();
        } catch (C21470 unused) {
        }
        GLES20.glVertexAttribPointer(this.f35378, 3, 5126, false, 12, (Buffer) c8903.f30550);
        try {
            C17942.m41761();
        } catch (C21470 unused2) {
        }
        GLES20.glVertexAttribPointer(this.f35381, 2, 5126, false, 8, (Buffer) c8903.f30551);
        try {
            C17942.m41761();
        } catch (C21470 unused3) {
        }
        GLES20.glDrawArrays(c8903.f30549, 0, c8903.f30548);
        try {
            C17942.m41761();
        } catch (C21470 unused4) {
        }
    }
}
