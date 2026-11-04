package l;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩴۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D8NK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19612 implements InterfaceC19830, InterfaceC19084 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public SurfaceTexture f63212;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f63213;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f63219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f63218 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f63217 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10661 f63220 = new C10661();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1185 f63221 = new C1185();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10098 f63216 = new C10098();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C10098 f63214 = new C10098();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float[] f63211 = new float[16];

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final float[] f63215 = new float[16];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f63210 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SurfaceTexture m45265() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C7357.m20174();
            this.f63220.m27165();
            C7357.m20174();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C7357.m20174();
            int i = iArr[0];
            C7357.m20175(36197, i);
            this.f63213 = i;
        } catch (C8848 e) {
            C1896.m6516("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f63213);
        this.f63212 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: l.᩸ۚ᩷
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f73043.f63218.set(true);
            }
        });
        return this.f63212;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45266(float[] fArr) {
        GLES20.glClear(16384);
        try {
            C7357.m20174();
        } catch (C8848 e) {
            C1896.m6516("Failed to draw a frame", e);
        }
        boolean zCompareAndSet = this.f63218.compareAndSet(true, false);
        C10661 c10661 = this.f63220;
        if (zCompareAndSet) {
            SurfaceTexture surfaceTexture = this.f63212;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                C7357.m20174();
            } catch (C8848 e2) {
                C1896.m6516("Failed to draw a frame", e2);
            }
            boolean zCompareAndSet2 = this.f63217.compareAndSet(true, false);
            float[] fArr2 = this.f63211;
            if (zCompareAndSet2) {
                Matrix.setIdentityM(fArr2, 0);
            }
            long timestamp = this.f63212.getTimestamp();
            Long l2 = (Long) this.f63216.m26053(timestamp);
            if (l2 != null) {
                this.f63221.m4363(l2.longValue(), fArr2);
            }
            C13862 c13862 = (C13862) this.f63214.m26058(timestamp);
            if (c13862 != null) {
                c10661.m27167(c13862);
            }
        }
        Matrix.multiplyMM(this.f63215, 0, fArr, 0, this.f63211, 0);
        c10661.m27166(this.f63213, this.f63215);
    }

    @Override // l.InterfaceC19830
    /* JADX INFO: renamed from: ۙ */
    public final void mo24942(long j, long j2, C15648 c15648, MediaFormat mediaFormat) {
        float[] fArr;
        C19612 c19612 = this;
        c19612.f63216.m26055(j2, Long.valueOf(j));
        byte[] bArr = c15648.f50823;
        int i = c15648.f50844;
        byte[] bArr2 = c19612.f63219;
        int i2 = c19612.f63210;
        c19612.f63219 = bArr;
        if (i == -1) {
            i = 0;
        }
        c19612.f63210 = i;
        if (i2 == i && Arrays.equals(bArr2, bArr)) {
            return;
        }
        byte[] bArr3 = c19612.f63219;
        C13862 c13862M14573 = bArr3 != null ? C4696.m14573(c19612.f63210, bArr3) : null;
        if (c13862M14573 == null || !C10661.m27164(c13862M14573)) {
            int i3 = c19612.f63210;
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
            C8642 c8642 = new C8642(new C7151(0, 1, fArr2, fArr3));
            c19612 = this;
            c13862M14573 = new C13862(c8642, c8642, i3);
        }
        c19612.f63214.m26055(j2, c13862M14573);
    }

    @Override // l.InterfaceC19084
    /* JADX INFO: renamed from: ۙ */
    public final void mo24943(long j, float[] fArr) {
        this.f63221.m4364(j, fArr);
    }

    @Override // l.InterfaceC19084
    /* JADX INFO: renamed from: ۤ */
    public final void mo24944() {
        this.f63216.m26054();
        this.f63221.m4362();
        this.f63217.set(true);
    }
}
