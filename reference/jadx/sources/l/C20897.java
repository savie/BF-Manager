package l;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩷۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8NK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20897 implements InterfaceC19841, InterfaceC3962 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f67896;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f67899;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public SurfaceTexture f67902;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f67903 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f67898 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10314 f67905 = new C10314();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23014 f67906 = new C23014();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3871 f67907 = new C3871();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3871 f67901 = new C3871();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float[] f67900 = new float[16];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f67897 = new float[16];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67904 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SurfaceTexture m47006() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C17942.m41761();
            this.f67905.m26132();
            C17942.m41761();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C17942.m41761();
            int i = iArr[0];
            C17942.m41762(36197, i);
            this.f67899 = i;
        } catch (C21470 e) {
            C0303.m1854("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f67899);
        this.f67902 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: l.۟۬ܰ
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f24946.f67903.set(true);
            }
        });
        return this.f67902;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47007(float[] fArr) {
        GLES20.glClear(16384);
        try {
            C17942.m41761();
        } catch (C21470 e) {
            C0303.m1854("Failed to draw a frame", e);
        }
        boolean zCompareAndSet = this.f67903.compareAndSet(true, false);
        C10314 c10314 = this.f67905;
        if (zCompareAndSet) {
            SurfaceTexture surfaceTexture = this.f67902;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                C17942.m41761();
            } catch (C21470 e2) {
                C0303.m1854("Failed to draw a frame", e2);
            }
            boolean zCompareAndSet2 = this.f67898.compareAndSet(true, false);
            float[] fArr2 = this.f67900;
            if (zCompareAndSet2) {
                Matrix.setIdentityM(fArr2, 0);
            }
            long timestamp = this.f67902.getTimestamp();
            Long l2 = (Long) this.f67907.m11199(timestamp);
            if (l2 != null) {
                this.f67906.m50906(l2.longValue(), fArr2);
            }
            C8197 c8197 = (C8197) this.f67901.m11204(timestamp);
            if (c8197 != null) {
                c10314.m26134(c8197);
            }
        }
        Matrix.multiplyMM(this.f67897, 0, fArr, 0, this.f67900, 0);
        c10314.m26133(this.f67899, this.f67897);
    }

    @Override // l.InterfaceC19841
    /* JADX INFO: renamed from: ۙ */
    public final void mo2526(long j, long j2, C7648 c7648, MediaFormat mediaFormat) {
        float[] fArr;
        C20897 c20897 = this;
        c20897.f67907.m11201(j2, Long.valueOf(j));
        byte[] bArr = c7648.f25256;
        int i = c7648.f25250;
        byte[] bArr2 = c20897.f67896;
        int i2 = c20897.f67904;
        c20897.f67896 = bArr;
        if (i == -1) {
            i = 0;
        }
        c20897.f67904 = i;
        if (i2 == i && Arrays.equals(bArr2, bArr)) {
            return;
        }
        byte[] bArr3 = c20897.f67896;
        C8197 c8197M44544 = bArr3 != null ? C19486.m44544(c20897.f67904, bArr3) : null;
        if (c8197M44544 == null || !C10314.m26131(c8197M44544)) {
            int i3 = c20897.f67904;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            int i4 = 36;
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr2 = new float[15984];
            float[] fArr3 = new float[10656];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < i4) {
                float f3 = radians / 2.0f;
                float f4 = (i5 * f) - f3;
                int i8 = i5 + 1;
                float f5 = (i8 * f) - f3;
                int i9 = 0;
                while (i9 < 73) {
                    int i10 = 0;
                    int i11 = i8;
                    while (i10 < 2) {
                        float f6 = i9 * f2;
                        float f7 = f2;
                        int i12 = i3;
                        float f8 = radians;
                        double d = 50.0f;
                        float f9 = f;
                        double d2 = (3.1415927f + f6) - (radians2 / 2.0f);
                        int i13 = i9;
                        double d3 = i10 == 0 ? f4 : f5;
                        float[] fArr4 = fArr3;
                        int i14 = i5;
                        fArr2[i6] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        fArr2[i6 + 1] = (float) (Math.sin(d3) * d);
                        int i15 = i6 + 3;
                        fArr2[i6 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr4[i7] = f6 / radians2;
                        int i16 = i7 + 2;
                        fArr4[i7 + 1] = ((i14 + i10) * f9) / f8;
                        if ((i13 == 0 && i10 == 0) || (i13 == 72 && i10 == 1)) {
                            System.arraycopy(fArr2, i6, fArr2, i15, 3);
                            i6 += 6;
                            fArr = fArr4;
                            System.arraycopy(fArr, i7, fArr, i16, 2);
                            i7 += 4;
                        } else {
                            fArr = fArr4;
                            i6 = i15;
                            i7 = i16;
                        }
                        i10++;
                        f2 = f7;
                        fArr3 = fArr;
                        i9 = i13;
                        i3 = i12;
                        radians = f8;
                        f = f9;
                        i5 = i14;
                    }
                    i9++;
                    i8 = i11;
                }
                i4 = 36;
                i5 = i8;
            }
            C18074 c18074 = new C18074(new C18780(0, 1, fArr2, fArr3));
            c20897 = this;
            c8197M44544 = new C8197(c18074, c18074, i3);
        }
        c20897.f67901.m11201(j2, c8197M44544);
    }

    @Override // l.InterfaceC3962
    /* JADX INFO: renamed from: ۙ */
    public final void mo11447(long j, float[] fArr) {
        this.f67906.m50907(j, fArr);
    }

    @Override // l.InterfaceC3962
    /* JADX INFO: renamed from: ۨ */
    public final void mo11448() {
        this.f67907.m11200();
        this.f67906.m50905();
        this.f67898.set(true);
    }
}
