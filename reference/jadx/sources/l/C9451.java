package l;

import android.content.res.AssetManager;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ۢ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U6WA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9451 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31966;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31968;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f31973;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f31974;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f31979;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31980;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31982;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31984;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31985;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f31986;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31988;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31989;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f31991;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f31992;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31993;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31998;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31971 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f31994 = new int[2];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f31969 = new int[2];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f31981 = new int[2];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float[][] f31996 = {new float[16], new float[16]};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float[][] f31972 = {new float[16], new float[16]};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final float[] f31975 = new float[16];

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float[] f31997 = new float[16];

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float[] f31978 = new float[16];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float[] f31970 = new float[16];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float[] f31987 = new float[4];

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int[] f31976 = new int[1];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f31990 = new int[1];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f31995 = new int[1];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] f31977 = new int[1];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f31983 = Float.POSITIVE_INFINITY;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f31967 = Float.NEGATIVE_INFINITY;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24210(AssetManager assetManager, int i, boolean z) throws IOException {
        float[] fArr = this.f31987;
        fArr[0] = ((i >> 16) & 255) / 255.0f;
        fArr[1] = ((i >> 8) & 255) / 255.0f;
        fArr[2] = (i & 255) / 255.0f;
        fArr[3] = z ? 0.15f : 0.0f;
        this.f31974 = m24206("attribute vec3 aPosition,aNormal,aColor; uniform mat4 uMvp,uModel,uLight0,uLight1;varying vec3 vNormal,vColor; varying vec4 vLight0,vLight1;void main(){vec4 p=vec4(aPosition/256.0,1.0);gl_Position=uMvp*p;vNormal=mat3(uModel)*aNormal;vColor=aColor;vLight0=uLight0*p;vLight1=uLight1*p;}", "precision mediump float; varying vec3 vNormal,vColor; varying vec4 vLight0,vLight1;uniform sampler2D uShadow0,uShadow1;uniform bool uHasShadows;uniform vec4 uTheme;float visibility(sampler2D tex,vec4 p){if(!uHasShadows)return 1.0;vec3 q=p.xyz/p.w*0.5+0.5;if(q.x<0.0||q.x>1.0||q.y<0.0||q.y>1.0||q.z>1.0)return 1.0;float s=0.0;for(int x=-1;x<=1;x++){for(int y=-1;y<=1;y++){vec2 d=texture2D(tex,q.xy+vec2(float(x),float(y))/512.0).rg;s+=step(q.z-0.0007,d.x+d.y/255.0);}}return 0.3+0.7*s/9.0;}void main(){vec3 n=normalize(vNormal);if(!gl_FrontFacing)n=-n;float a=max(0.0,dot(n,normalize(vec3(-4.0,7.0,9.0))));float b=max(0.0,dot(n,normalize(vec3(1.0,4.0,-7.0))));float light=0.70+0.60*a*visibility(uShadow0,vLight0)+0.50*b*visibility(uShadow1,vLight1);vec3 color=pow(pow(mix(vColor,uTheme.rgb,uTheme.a),vec3(2.2))*light,vec3(1.0/2.2));gl_FragColor=vec4(color,1.0);}");
        this.f31984 = m24206("attribute vec3 aPosition;uniform mat4 uMvp;void main(){gl_Position=uMvp*vec4(aPosition/256.0,1.0);}", "precision mediump float;void main(){vec2 d=fract(gl_FragCoord.z*vec2(1.0,255.0));d.x-=d.y/255.0;gl_FragColor=vec4(d,0.0,1.0);}");
        int iM24206 = m24206("attribute vec2 aPosition;varying vec2 vUv;void main(){vUv=aPosition*0.5+0.5;gl_Position=vec4(aPosition,0.0,1.0);}", "precision mediump float;varying vec2 vUv;uniform sampler2D uImage;void main(){gl_FragColor=texture2D(uImage,vUv);}");
        this.f31986 = iM24206;
        this.f31988 = GLES20.glGetUniformLocation(iM24206, "uImage");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
        int[] iArr = this.f31977;
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(34962, iArr[0]);
        GLES20.glBufferData(34962, 32, floatBufferAsFloatBuffer, 35044);
        GLES20.glGenTextures(1, this.f31976, 0);
        GLES20.glGenFramebuffers(1, this.f31990, 0);
        GLES20.glGenRenderbuffers(1, this.f31995, 0);
        this.f31980 = GLES20.glGetUniformLocation(this.f31974, "uMvp");
        this.f31973 = GLES20.glGetUniformLocation(this.f31974, "uModel");
        this.f31982 = GLES20.glGetUniformLocation(this.f31974, "uLight0");
        this.f31989 = GLES20.glGetUniformLocation(this.f31974, "uLight1");
        this.f31998 = GLES20.glGetUniformLocation(this.f31974, "uShadow0");
        this.f31985 = GLES20.glGetUniformLocation(this.f31974, "uShadow1");
        this.f31993 = GLES20.glGetUniformLocation(this.f31984, "uMvp");
        this.f31966 = GLES20.glGetUniformLocation(this.f31974, "uHasShadows");
        this.f31968 = GLES20.glGetUniformLocation(this.f31974, "uTheme");
        m24207(assetManager, "folder", true);
        m24207(assetManager, ErrorBundle.DETAIL_ENTRY, false);
        m24207(assetManager, "variant", false);
        if (this.f31967 <= this.f31983) {
            throw new IllegalStateException("Empty logo bounds");
        }
        Matrix.setLookAtM(this.f31978, 0, 0.0f, 0.0f, 13.5f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.orthoM(fArr3, 0, -4.0f, 4.0f, -4.0f, 4.0f, 1.0f, 24.0f);
        Matrix.setLookAtM(fArr2, 0, -4.0f, 7.0f, 9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[][] fArr4 = this.f31996;
        Matrix.multiplyMM(fArr4[0], 0, fArr3, 0, fArr2, 0);
        Matrix.setLookAtM(fArr2, 0, 1.0f, 4.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(fArr4[1], 0, fArr3, 0, fArr2, 0);
        int[] iArr2 = this.f31994;
        GLES20.glGenTextures(2, iArr2, 0);
        int[] iArr3 = this.f31969;
        GLES20.glGenFramebuffers(2, iArr3, 0);
        int[] iArr4 = this.f31981;
        GLES20.glGenRenderbuffers(2, iArr4, 0);
        boolean z2 = true;
        for (int i2 = 0; i2 < 2; i2++) {
            GLES20.glBindTexture(3553, iArr2[i2]);
            GLES20.glTexImage2D(3553, 0, 6408, 512, 512, 0, 6408, 5121, null);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glBindRenderbuffer(36161, iArr4[i2]);
            GLES20.glRenderbufferStorage(36161, 33189, 512, 512);
            GLES20.glBindFramebuffer(36160, iArr3[i2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i2], 0);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr4[i2]);
            z2 &= GLES20.glCheckFramebufferStatus(36160) == 36053;
        }
        GLES20.glBindFramebuffer(36160, 0);
        this.f31979 = z2;
        GLES20.glUseProgram(this.f31974);
        GLES20.glUniform1i(this.f31966, this.f31979 ? 1 : 0);
        GLES20.glUniform1i(this.f31998, 0);
        GLES20.glUniform1i(this.f31985, 1);
        GLES20.glUseProgram(this.f31986);
        GLES20.glUniform1i(this.f31988, 0);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(515);
        GLES20.glDisable(2884);
        GLES20.glDisable(3042);
        GLES20.glDisable(3024);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24207(AssetManager assetManager, String str, boolean z) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str.concat(".bin"));
        try {
            ZstdInputStreamNoFinalizer zstdInputStreamNoFinalizer = new ZstdInputStreamNoFinalizer(inputStreamOpen, RecyclingBufferPool.INSTANCE);
            try {
                ArrayList<C14390> arrayListM34623 = C14390.m34623(new C17367(zstdInputStreamNoFinalizer));
                zstdInputStreamNoFinalizer.close();
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                for (C14390 c14390 : arrayListM34623) {
                    int[] iArr = new int[2];
                    GLES20.glGenBuffers(2, iArr, 0);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = c14390.f47139;
                    ByteBuffer byteBuffer = c14390.f47142;
                    ByteBuffer byteBuffer2 = c14390.f47140;
                    this.f31971.add(new int[]{i, i2, i3, z ? 1 : 0});
                    GLES20.glBindBuffer(34962, iArr[0]);
                    GLES20.glBufferData(34962, byteBuffer2.capacity(), byteBuffer2, 35044);
                    GLES20.glBindBuffer(34963, iArr[1]);
                    GLES20.glBufferData(34963, byteBuffer.capacity(), byteBuffer, 35044);
                    this.f31983 = Math.min(this.f31983, c14390.f47138);
                    this.f31967 = Math.max(this.f31967, c14390.f47141);
                }
            } catch (Throwable th) {
                try {
                    zstdInputStreamNoFinalizer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24209(int i, int i2, float f, float[] fArr) {
        float[][] fArr2;
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int i5 = i * 2;
        int i6 = i2 * 2;
        int i7 = this.f31992;
        int[] iArr = this.f31990;
        int[] iArr2 = this.f31976;
        if (i7 != i5 || this.f31991 != i6) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr2[0]);
            GLES20.glTexImage2D(3553, 0, 6408, i5, i6, 0, 6408, 5121, null);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int[] iArr3 = this.f31995;
            GLES20.glBindRenderbuffer(36161, iArr3[0]);
            GLES20.glRenderbufferStorage(36161, 33189, i5, i6);
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr3[0]);
            if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
                throw new IllegalStateException("Incomplete logo antialias framebuffer");
            }
            this.f31992 = i5;
            this.f31991 = i6;
        }
        int i8 = 0;
        while (true) {
            fArr2 = this.f31972;
            if (i8 >= 2) {
                break;
            }
            Matrix.multiplyMM(fArr2[i8], 0, this.f31996[i8], 0, fArr, 0);
            i8++;
        }
        if (this.f31979) {
            GLES20.glUseProgram(this.f31984);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glDisableVertexAttribArray(2);
            i3 = 0;
            GLES20.glViewport(0, 0, 512, 512);
            GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
            int i9 = 0;
            while (true) {
                i4 = 16640;
                if (i9 >= 2) {
                    break;
                }
                GLES20.glBindFramebuffer(36160, this.f31969[i9]);
                GLES20.glClear(16640);
                GLES20.glUniformMatrix4fv(this.f31993, 1, false, fArr2[i9], 0);
                m24208(false);
                i9++;
            }
        } else {
            i3 = 0;
            i4 = 16640;
        }
        GLES20.glBindFramebuffer(36160, iArr[i3]);
        GLES20.glViewport(i3, i3, i5, i6);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(i4);
        float f2 = this.f31967;
        float f3 = this.f31983;
        float f4 = (f2 - f3) / ((f * 2.0f) * 0.9515277f);
        float f5 = (i5 * f4) / i6;
        float f6 = (f2 + f3) / 2.0f;
        Matrix.orthoM(this.f31997, 0, -f5, f5, f6 - f4, f6 + f4, 0.1f, 30.0f);
        Matrix.multiplyMM(this.f31975, 0, this.f31978, 0, fArr, 0);
        Matrix.multiplyMM(this.f31970, 0, this.f31997, 0, this.f31975, 0);
        GLES20.glUseProgram(this.f31974);
        GLES20.glUniformMatrix4fv(this.f31980, 1, false, this.f31970, 0);
        GLES20.glUniformMatrix4fv(this.f31973, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f31982, 1, false, fArr2[0], 0);
        GLES20.glUniformMatrix4fv(this.f31989, 1, false, fArr2[1], 0);
        for (int i10 = 0; i10 < 2; i10++) {
            GLES20.glActiveTexture(i10 + 33984);
            GLES20.glBindTexture(3553, this.f31994[i10]);
        }
        m24208(true);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glDisable(2929);
        GLES20.glUseProgram(this.f31986);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glBindBuffer(34962, this.f31977[0]);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glDisableVertexAttribArray(1);
        GLES20.glDisableVertexAttribArray(2);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glEnable(2929);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new IllegalStateException(C8479.m22141(iGlGetError, "Logo GL error: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24208(boolean z) {
        GLES20.glEnableVertexAttribArray(0);
        if (z) {
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glEnableVertexAttribArray(2);
        }
        for (int[] iArr : this.f31971) {
            GLES20.glBindBuffer(34962, iArr[0]);
            GLES20.glBindBuffer(34963, iArr[1]);
            GLES20.glVertexAttribPointer(0, 3, 5122, false, 12, 0);
            if (z) {
                GLES20.glVertexAttribPointer(1, 3, 5120, true, 12, 6);
                GLES20.glVertexAttribPointer(2, 3, 5121, true, 12, 9);
                int i = this.f31968;
                float[] fArr = this.f31987;
                GLES20.glUniform4f(i, fArr[0], fArr[1], fArr[2], iArr[3] == 1 ? fArr[3] : 0.0f);
            }
            GLES20.glDrawElements(4, iArr[2], 5123, 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24205(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException(strGlGetShaderInfoLog);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24206(String str, String str2) {
        int iM24205 = m24205(35633, str);
        int iM24206 = m24205(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iM24205);
        GLES20.glAttachShader(iGlCreateProgram, iM24206);
        GLES20.glBindAttribLocation(iGlCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(iGlCreateProgram, 1, "aNormal");
        GLES20.glBindAttribLocation(iGlCreateProgram, 2, "aColor");
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glDeleteShader(iM24205);
        GLES20.glDeleteShader(iM24206);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateProgram;
        }
        throw new IllegalStateException(GLES20.glGetProgramInfoLog(iGlCreateProgram));
    }
}
