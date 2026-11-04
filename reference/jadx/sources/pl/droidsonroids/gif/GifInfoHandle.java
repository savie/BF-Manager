package pl.droidsonroids.gif;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l.C20052;
import l.EnumC3141;

/* JADX INFO: loaded from: classes2.dex */
public final class GifInfoHandle {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f82019 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile long f82020;

    public static native void bindSurface(long j, Surface surface, long[] jArr);

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z);

    public static native void free(long j);

    public static native long getAllocationByteCount(long j);

    public static native String getComment(long j);

    public static native int getCurrentFrameIndex(long j);

    public static native int getCurrentLoop(long j);

    public static native int getCurrentPosition(long j);

    public static native int getDuration(long j);

    public static native int getFrameDuration(long j, int i);

    public static native int getHeight(long j);

    public static native int getLoopCount(long j);

    public static native long getMetadataByteCount(long j);

    public static native int getNativeErrorCode(long j);

    public static native int getNumberOfFrames(long j);

    public static native long[] getSavedState(long j);

    public static native long getSourceLength(long j);

    public static native int getWidth(long j);

    public static native void glTexImage2D(long j, int i, int i2);

    public static native void glTexSubImage2D(long j, int i, int i2);

    public static native void initTexImageDescriptor(long j);

    public static native boolean isAnimationCompleted(long j);

    public static native boolean isOpaque(long j);

    public static native long openByteArray(byte[] bArr);

    public static native long openDirectByteBuffer(ByteBuffer byteBuffer);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i, long j);

    public static native long openStream(InputStream inputStream);

    public static native void postUnbindSurface(long j);

    public static native long renderFrame(long j, Bitmap bitmap);

    public static native boolean reset(long j);

    public static native long restoreRemainder(long j);

    public static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    public static native void saveRemainder(long j);

    public static native void seekToFrame(long j, int i, Bitmap bitmap);

    public static native void seekToFrameGL(long j, int i);

    public static native void seekToTime(long j, int i, Bitmap bitmap);

    public static native void setLoopCount(long j, char c);

    public static native void setOptions(long j, char c, boolean z);

    public static native void setSpeedFactor(long j, float f);

    public static native void startDecoderThread(long j);

    public static native void stopDecoderThread(long j);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized void m56816() {
        free(this.f82020);
        this.f82020 = 0L;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m56819() {
        return this.f82020 == 0;
    }

    static {
        C20052.m46110();
    }

    public GifInfoHandle() {
    }

    public GifInfoHandle(byte[] bArr) {
        this.f82020 = openByteArray(bArr);
    }

    public GifInfoHandle(String str) {
        this.f82020 = openFile(str);
    }

    public GifInfoHandle(InputStream inputStream) {
        this.f82020 = openStream(inputStream);
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        int iCreateTempNativeFileDescriptor;
        try {
            FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
            long startOffset = assetFileDescriptor.getStartOffset();
            if (Build.VERSION.SDK_INT <= 27) {
                iCreateTempNativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, false);
            } else {
                try {
                    iCreateTempNativeFileDescriptor = createTempNativeFileDescriptor();
                    Os.dup2(fileDescriptor, iCreateTempNativeFileDescriptor);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Exception e) {
                        throw new GifIOException(EnumC3141.OPEN_FAILED.f10200, e.getMessage());
                    }
                }
            }
            this.f82020 = openNativeFileDescriptor(iCreateTempNativeFileDescriptor, startOffset);
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized long m56799(Bitmap bitmap) {
        return renderFrame(this.f82020, bitmap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56803(Surface surface, long[] jArr) {
        bindSurface(this.f82020, surface, jArr);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final synchronized long m56806() {
        return restoreRemainder(this.f82020);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m56809() {
        return reset(this.f82020);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final synchronized void m56820() {
        saveRemainder(this.f82020);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized int m56810() {
        return getLoopCount(this.f82020);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56801(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f82020, (char) i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m56795() {
        return getNativeErrorCode(this.f82020);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56800(float f) {
        if (f <= 0.0f || Float.isNaN(f)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f < 4.656613E-10f) {
            f = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f82020, f);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized int m56815() {
        return getDuration(this.f82020);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized int m56818() {
        return getCurrentPosition(this.f82020);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized int m56817() {
        return getCurrentFrameIndex(this.f82020);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized int m56807() {
        return getCurrentLoop(this.f82020);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m56802(int i, Bitmap bitmap) {
        seekToTime(this.f82020, i, bitmap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized long m56798() {
        return getAllocationByteCount(this.f82020);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized long m56805() {
        return getMetadataByteCount(this.f82020);
    }

    public final void finalize() throws Throwable {
        try {
            m56816();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final synchronized void m56796() {
        postUnbindSurface(this.f82020);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m56814() {
        return isAnimationCompleted(this.f82020);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized long[] m56821() {
        return getSavedState(this.f82020);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m56797(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f82020, jArr, bitmap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56804(boolean z, char c) {
        setOptions(this.f82020, c, z);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized int m56813() {
        return getWidth(this.f82020);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized int m56811() {
        return getHeight(this.f82020);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m56808() {
        return getNumberOfFrames(this.f82020);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m56812() {
        return isOpaque(this.f82020);
    }
}
