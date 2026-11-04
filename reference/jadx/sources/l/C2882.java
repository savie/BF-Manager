package l;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8O3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2882 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f9463;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f9464;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9593[] f9465;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1391[] f9466;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f9467;

    public C2882(String str, String str2) throws C8848 {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f9464 = iGlCreateProgram;
        C7357.m20174();
        m9495(iGlCreateProgram, 35633, str);
        m9495(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        C7357.m20176("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f9463 = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f9466 = new C1391[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C1391 c1391M5088 = C1391.m5088(this.f9464, i);
            this.f9466[i] = c1391M5088;
            this.f9463.put(c1391M5088.f4943, c1391M5088);
        }
        this.f9467 = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f9464, 35718, iArr3, 0);
        this.f9465 = new C9593[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C9593 c9593M25072 = C9593.m25072(this.f9464, i2);
            this.f9465[i2] = c9593M25072;
            this.f9467.put(c9593M25072.f31058, c9593M25072);
        }
        C7357.m20174();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9495(int i, int i2, String str) throws C8848 {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        C7357.m20176(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        C7357.m20174();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9496(String str) throws C8848 {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f9464, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        C7357.m20174();
        return iGlGetAttribLocation;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m9497(String str) {
        return GLES20.glGetUniformLocation(this.f9464, str);
    }
}
