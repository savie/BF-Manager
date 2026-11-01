package l;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8O3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15121 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f49390;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f49391;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C22882[] f49392;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f49393;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6653[] f49394;

    public C15121(String str, String str2) throws C21470 {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f49393 = iGlCreateProgram;
        C17942.m41761();
        m36241(iGlCreateProgram, 35633, str);
        m36241(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        C17942.m41763("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f49391 = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f49394 = new C6653[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C6653 c6653M18028 = C6653.m18028(this.f49393, i);
            this.f49394[i] = c6653M18028;
            this.f49391.put(c6653M18028.f22469, c6653M18028);
        }
        this.f49390 = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f49393, 35718, iArr3, 0);
        this.f49392 = new C22882[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C22882 c22882M50644 = C22882.m50644(this.f49393, i2);
            this.f49392[i2] = c22882M50644;
            this.f49390.put(c22882M50644.f74420, c22882M50644);
        }
        C17942.m41761();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36241(int i, int i2, String str) throws C21470 {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        C17942.m41763(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        C17942.m41761();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36242(String str) throws C21470 {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f49393, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        C17942.m41761();
        return iGlGetAttribLocation;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m36243(String str) {
        return GLES20.glGetUniformLocation(this.f49393, str);
    }
}
