package l;

import android.opengl.GLES20;

/* JADX INFO: renamed from: l.᩺ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8O3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22882 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f74420;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22882 m50644(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35719, iArr, 0);
        int i3 = iArr[0];
        byte[] bArr = new byte[i3];
        GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4] == 0) {
                i3 = i4;
                break;
            }
        }
        String str = new String(bArr, 0, i3);
        GLES20.glGetUniformLocation(i, str);
        return new C22882(str);
    }

    public C22882(String str) {
        this.f74420 = str;
    }
}
