package l;

import android.opengl.GLES20;
import java.nio.Buffer;

/* JADX INFO: renamed from: l.ۤۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8I9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10661 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21850 f33789;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f33790;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33791;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f33792;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f33793;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f33794;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f33795;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2882 f33796;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final float[] f33788 = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final float[] f33787 = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final float[] f33786 = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m27164(C13862 c13862) {
        C8642 c8642 = c13862.f43981;
        C8642 c8643 = c13862.f43983;
        return c8642.m23289() == 1 && c8642.m23288().f23649 == 0 && c8643.m23289() == 1 && c8643.m23288().f23649 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27167(C13862 c13862) {
        if (m27164(c13862)) {
            this.f33794 = c13862.f43984;
            this.f33789 = new C21850(c13862.f43981.m23288());
            if (c13862.f43982) {
                return;
            }
            new C21850(c13862.f43983.m23288());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27165() {
        try {
            C2882 c2882 = new C2882("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f33796 = c2882;
            this.f33795 = c2882.m9497("uMvpMatrix");
            this.f33790 = this.f33796.m9497("uTexMatrix");
            this.f33791 = this.f33796.m9496("aPosition");
            this.f33793 = this.f33796.m9496("aTexCoords");
            this.f33792 = this.f33796.m9497("uTexture");
        } catch (C8848 unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27166(int i, float[] fArr) {
        float[] fArr2;
        C21850 c21850 = this.f33789;
        if (c21850 == null) {
            return;
        }
        int i2 = this.f33794;
        if (i2 == 1) {
            fArr2 = f33787;
        } else if (i2 == 2) {
            fArr2 = f33786;
        } else {
            fArr2 = f33788;
        }
        GLES20.glUniformMatrix3fv(this.f33790, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f33795, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f33792, 0);
        try {
            C7357.m20174();
        } catch (C8848 unused) {
        }
        GLES20.glVertexAttribPointer(this.f33791, 3, 5126, false, 12, (Buffer) c21850.f69614);
        try {
            C7357.m20174();
        } catch (C8848 unused2) {
        }
        GLES20.glVertexAttribPointer(this.f33793, 2, 5126, false, 8, (Buffer) c21850.f69615);
        try {
            C7357.m20174();
        } catch (C8848 unused3) {
        }
        GLES20.glDrawArrays(c21850.f69613, 0, c21850.f69616);
        try {
            C7357.m20174();
        } catch (C8848 unused4) {
        }
    }
}
