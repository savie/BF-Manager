package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import com.alipay.sdk.m.p.a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.᩸۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes.dex */
public final class C22823 implements InterfaceC5095 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73956 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Uri f73957 = Uri.parse("mt-ts-preview:///media.ts");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6964 f73958 = new C6964();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C15648 f73959;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f73960;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f73961;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f73962;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6044 f73963;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C2489 f73964;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f73965;

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo15406() {
        return true;
    }

    public C22823(C6044 c6044, long j) {
        this.f73963 = c6044;
        this.f73960 = j * 1000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22823 m51454(C6044 c6044, long j) throws IOException {
        if (!c6044.m17549() || j <= 0 || j > 10000) {
            throw new IOException("Unsupported MPEG-TS preview source");
        }
        return new C22823(c6044, j);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51453(C6044 c6044, int i, InterfaceC8911 interfaceC8911) throws Throwable {
        Throwable th;
        if (!c6044.m17549()) {
            throw new IOException("Unsupported MPEG-TS thumbnail source");
        }
        int iMax = Math.max(1, i);
        C13675 c13675 = new C13675(iMax, iMax, 0L);
        C6964 c6964 = new C6964();
        String str = null;
        Exception exc = null;
        boolean z = false;
        C2489 c2489 = null;
        while (true) {
            try {
                try {
                    try {
                        interfaceC8911.mo23824();
                        th = exc;
                        try {
                            C2489 c2489M8366 = C2489.m8366(c6044, c6964, iMax, iMax, true, z, str, interfaceC8911);
                            try {
                                C2489.m8370(c2489M8366, 0L, interfaceC8911);
                                Bitmap bitmapM19268 = c6964.m19268(c13675);
                                if (bitmapM19268 == null) {
                                    throw new IOException("MPEG-TS thumbnail frame was not decoded");
                                }
                                C2489.m8375(c2489M8366);
                                c6964.m19269();
                                return bitmapM19268;
                            } catch (InterruptedIOException e) {
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                c2489 = c2489M8366;
                                exc = e;
                                if (z && m51456(exc)) {
                                    str = c2489 == null ? null : c2489.f7983;
                                    if (c2489 != null) {
                                        C2489.m8375(c2489);
                                        c2489 = null;
                                    }
                                    z = true;
                                } else {
                                    if (th != null) {
                                        exc.addSuppressed(th);
                                    }
                                    if (exc instanceof IOException) {
                                        throw ((IOException) exc);
                                    }
                                    throw new IOException("MPEG-TS thumbnail decode failed", exc);
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                c2489 = c2489M8366;
                                exc = e;
                                if (z) {
                                }
                                if (th != null) {
                                    exc.addSuppressed(th);
                                }
                                if (exc instanceof IOException) {
                                    throw ((IOException) exc);
                                }
                                throw new IOException("MPEG-TS thumbnail decode failed", exc);
                            } catch (Throwable th2) {
                                th = th2;
                                c2489 = c2489M8366;
                                if (c2489 != null) {
                                    C2489.m8375(c2489);
                                }
                                c6964.m19269();
                                throw th;
                            }
                        } catch (IOException | RuntimeException e4) {
                            e = e4;
                        }
                    } catch (InterruptedIOException e5) {
                        throw e5;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | RuntimeException e6) {
                e = e6;
                th = exc;
            }
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51456(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C8455) || (cause instanceof C0998) || (cause instanceof C9200) || (cause instanceof MediaCodec.CodecException)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Bitmap m51459(long j, int i, int i2, InterfaceC8911 interfaceC8911) throws IOException {
        C2489 c2489M8366 = this.f73964;
        if (c2489M8366 != null && (!C2489.m8373(c2489M8366, i, i2) || c2489M8366.f7984 > j)) {
            m51457();
            c2489M8366 = null;
        }
        if (c2489M8366 == null) {
            c2489M8366 = C2489.m8366(this.f73963, this.f73958, i, i2, false, this.f73961, this.f73965, interfaceC8911);
            this.f73964 = c2489M8366;
            this.f73959 = c2489M8366.f7975;
        }
        C2489.m8370(c2489M8366, j, interfaceC8911);
        C13675 c13675 = new C13675(i, i2, j);
        C6964 c6964 = this.f73958;
        Bitmap bitmapM19268 = c6964.m19268(c13675);
        if (bitmapM19268 != null) {
            return bitmapM19268;
        }
        Bitmap bitmapM19267 = c6964.m19267(i, i2, j);
        if (bitmapM19267 != null) {
            boolean z = c2489M8366.f7966;
            boolean z2 = c2489M8366.f7965;
            if (z && !z2) {
                return bitmapM19267;
            }
        }
        throw new IOException("MPEG-TS preview frame was not decoded");
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ᩸ */
    public final C13298 mo15407() {
        C15648 c15648 = this.f73959;
        if (c15648 == null) {
            return null;
        }
        return C2112.m7291(c15648.f50814, c15648.f50852, c15648.f50819, c15648.f50825);
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۤ */
    public final void mo15405() {
        m51457();
    }

    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۙ */
    public final void mo15404() {
        if (this.f73962) {
            return;
        }
        this.f73962 = true;
        m51457();
        this.f73958.m19269();
        this.f73959 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m51457() {
        C2489 c2489 = this.f73964;
        this.f73964 = null;
        if (c2489 != null) {
            C2489.m8375(c2489);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    @Override // l.InterfaceC5095
    /* JADX INFO: renamed from: ۙ */
    public final Bitmap mo15403(long j, int i, int i2, InterfaceC8911 interfaceC8911) throws IOException {
        Exception exc;
        C2489 c2489;
        String str;
        if (!this.f73962 && !Thread.currentThread().isInterrupted()) {
            interfaceC8911.mo23824();
            int iMax = Math.max(1, i);
            int iMax2 = Math.max(1, i2);
            long jMax = Math.max(0L, Math.min(j, this.f73960)) / 1000000;
            Bitmap bitmapM19268 = this.f73958.m19268(new C13675(iMax, iMax2, jMax));
            if (bitmapM19268 != null) {
                return bitmapM19268;
            }
            try {
                return m51459(jMax, iMax, iMax2, interfaceC8911);
            } catch (InterruptedIOException e) {
                m51457();
                throw e;
            } catch (IOException e2) {
                e = e2;
                exc = e;
                if (!this.f73961 && m51456(exc)) {
                    c2489 = this.f73964;
                    if (c2489 == null) {
                        str = null;
                    } else {
                        str = c2489.f7983;
                    }
                    this.f73965 = str;
                    m51457();
                    this.f73961 = true;
                    try {
                        return m51459(jMax, iMax, iMax2, interfaceC8911);
                    } catch (InterruptedIOException e3) {
                        m51457();
                        throw e3;
                    } catch (IOException e4) {
                        e = e4;
                        e.addSuppressed(exc);
                        exc = e;
                        m51457();
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new IOException("MPEG-TS preview decode failed", exc);
                    } catch (RuntimeException e5) {
                        e = e5;
                        e.addSuppressed(exc);
                        exc = e;
                        m51457();
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new IOException("MPEG-TS preview decode failed", exc);
                    }
                }
                m51457();
                if (exc instanceof IOException) {
                    throw ((IOException) exc);
                }
                throw new IOException("MPEG-TS preview decode failed", exc);
            } catch (RuntimeException e6) {
                e = e6;
                exc = e;
                if (!this.f73961) {
                    c2489 = this.f73964;
                    if (c2489 == null) {
                        str = null;
                    } else {
                        str = c2489.f7983;
                    }
                    this.f73965 = str;
                    m51457();
                    this.f73961 = true;
                    return m51459(jMax, iMax, iMax2, interfaceC8911);
                }
                m51457();
                if (exc instanceof IOException) {
                    throw ((IOException) exc);
                }
                throw new IOException("MPEG-TS preview decode failed", exc);
            }
        }
        throw new InterruptedIOException("MPEG-TS frame source was closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51455(MediaCodec mediaCodec, boolean z) {
        if (mediaCodec == null) {
            return;
        }
        if (z) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    mediaCodec.stop();
                }
            } catch (Throwable unused) {
            }
        }
        try {
            mediaCodec.release();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0222  */
    /* JADX WARN: Code duplicated, block: B:101:0x0225  */
    /* JADX WARN: Code duplicated, block: B:104:0x0233  */
    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Code duplicated, block: B:108:0x023e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0241  */
    /* JADX WARN: Code duplicated, block: B:112:0x024e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01db  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x0205  */
    /* JADX WARN: Code duplicated, block: B:98:0x0215  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51452(Image image, int i, int i2, C15648 c15648, boolean z, MediaFormat mediaFormat) throws IOException {
        C10888 c10888;
        int iRound;
        int iRound2;
        Rect rect;
        MediaFormat mediaFormat2;
        int i3;
        boolean z2;
        boolean z3;
        int[] iArr;
        int i4;
        int iMin;
        int i5;
        int iMin2;
        int i6;
        int iWidth;
        int iHeight;
        int iM27636;
        int i7;
        int i8;
        int i9;
        int iM31436;
        int i10;
        int i11;
        int i12;
        int iM31437;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (image.getFormat() != 35 || image.getPlanes().length < 3) {
            throw new IOException("Unsupported MPEG-TS decoder image format");
        }
        Rect cropRect = image.getCropRect();
        if (cropRect.width() <= 0 || cropRect.height() <= 0) {
            throw new IOException("Invalid MPEG-TS decoder crop rectangle");
        }
        C10888 c10889 = new C10888(image.getPlanes()[0]);
        C10888 c108810 = new C10888(image.getPlanes()[1]);
        C10888 c108811 = new C10888(image.getPlanes()[2]);
        int i18 = ((c15648.f50819 % 360) + 360) % 360;
        if (i18 != 90 && i18 != 180 && i18 != 270) {
            i18 = 0;
        }
        boolean z4 = i18 == 90 || i18 == 270;
        int iHeight2 = z4 ? cropRect.height() : cropRect.width();
        int iWidth2 = z4 ? cropRect.width() : cropRect.height();
        float f = c15648.f50825;
        if (f <= 0.0f || Float.isInfinite(f)) {
            f = 1.0f;
        }
        float f2 = z4 ? 1.0f : f;
        if (!z4) {
            f = 1.0f;
        }
        if (!z) {
            rect = new Rect(0, 0, iHeight2, iWidth2);
            c10888 = c108811;
        } else {
            double d = f2;
            double d2 = iWidth2;
            c10888 = c108811;
            double d3 = f;
            double d4 = (((double) iHeight2) * d) / (d2 * d3);
            int i19 = iWidth2;
            float f3 = f2;
            double d5 = ((double) i) / ((double) i2);
            if (d4 > d5) {
                iRound = (int) Math.round(((d2 * d5) * d3) / d);
            } else {
                if (d4 < d5) {
                    iRound2 = (int) Math.round(((double) (iHeight2 * f3)) / (d5 * d3));
                    iRound = iHeight2;
                } else {
                    iRound = iHeight2;
                }
                int iMax = Math.max(1, Math.min(iHeight2, iRound));
                int iMax2 = Math.max(1, Math.min(i19, iRound2));
                int i20 = (iHeight2 - iMax) / 2;
                int i21 = (i19 - iMax2) / 2;
                rect = new Rect(i20, i21, iMax + i20, iMax2 + i21);
            }
            iRound2 = i19;
            int iMax3 = Math.max(1, Math.min(iHeight2, iRound));
            int iMax4 = Math.max(1, Math.min(i19, iRound2));
            int i22 = (iHeight2 - iMax3) / 2;
            int i23 = (i19 - iMax4) / 2;
            rect = new Rect(i22, i23, iMax3 + i22, iMax4 + i23);
        }
        int i24 = Build.VERSION.SDK_INT;
        if (i24 >= 24) {
            mediaFormat2 = mediaFormat;
            if (mediaFormat2.containsKey("color-range")) {
                i3 = 1;
                z2 = mediaFormat2.getInteger("color-range") == 1;
                if (i24 < 24 && mediaFormat2.containsKey("color-standard") && mediaFormat2.getInteger("color-standard") == i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                iArr = new int[i * i2];
                i4 = 0;
                while (i4 < i2) {
                    iMin = Math.min(rect.bottom - i3, rect.top + ((int) ((((long) i4) * ((long) rect.height())) / ((long) i2))));
                    i5 = 0;
                    while (i5 < i) {
                        iMin2 = Math.min(rect.right - 1, rect.left + ((int) ((((long) i5) * ((long) rect.width())) / ((long) i))));
                        i6 = i18;
                        if (i6 == 90) {
                            iWidth = cropRect.left + iMin;
                            iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin2;
                        } else if (i6 == 180) {
                            iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin2;
                            iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin;
                        } else if (i6 == 270) {
                            iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin;
                            iHeight = iMin2 + cropRect.top;
                        } else {
                            iWidth = cropRect.left + iMin2;
                            iHeight = cropRect.top + iMin;
                        }
                        C10888 c108812 = c10889;
                        iM27636 = C10888.m27636(c108812, iWidth, iHeight);
                        int i25 = iWidth / 2;
                        int i26 = iHeight / 2;
                        C10888 c108813 = c108810;
                        int iM27637 = C10888.m27636(c108813, i25, i26);
                        Rect rect2 = rect;
                        int iM27638 = C10888.m27636(c10888, i25, i26);
                        int i27 = (i4 * i) + i5;
                        i7 = iM27637 + a.g;
                        i8 = iM27638 + a.g;
                        if (z2) {
                            if (z3) {
                                i14 = 403;
                            } else {
                                i14 = 359;
                            }
                            int i28 = ((i14 * i8) >> 8) + iM27636;
                            if (z3) {
                                i15 = 48;
                            } else {
                                i15 = 88;
                            }
                            int i29 = iM27636 - ((i15 * i7) >> 8);
                            if (z3) {
                                i16 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                            } else {
                                i16 = 183;
                            }
                            int i30 = i29 - ((i16 * i8) >> 8);
                            if (z3) {
                                i17 = 475;
                            } else {
                                i17 = 454;
                            }
                            iM31437 = iM27636 + ((i17 * i7) >> 8);
                            iM31436 = i28;
                            i13 = i30;
                        } else {
                            int iMax5 = Math.max(0, iM27636 - 16) * 298;
                            if (z3) {
                                i9 = 459;
                            } else {
                                i9 = 409;
                            }
                            iM31436 = C12669.m31436(i9, i8, iMax5, 128) >> 8;
                            if (z3) {
                                i10 = 55;
                            } else {
                                i10 = 100;
                            }
                            int i31 = iMax5 - (i10 * i7);
                            if (z3) {
                                i11 = 136;
                            } else {
                                i11 = 208;
                            }
                            int i32 = ((i31 - (i11 * i8)) + 128) >> 8;
                            if (z3) {
                                i12 = 541;
                            } else {
                                i12 = 516;
                            }
                            iM31437 = C12669.m31436(i12, i7, iMax5, 128) >> 8;
                            i13 = i32;
                        }
                        iArr[i27] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM31436)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM31437));
                        i5++;
                        z2 = z2;
                        i18 = i6;
                        cropRect = cropRect;
                        rect = rect2;
                        c10889 = c108812;
                        c108810 = c108813;
                    }
                    i4++;
                    i3 = 1;
                    i18 = i18;
                    c10889 = c10889;
                    c108810 = c108810;
                }
                return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
            }
            if (i24 < 24) {
                z3 = false;
            } else {
                z3 = false;
            }
            iArr = new int[i * i2];
            i4 = 0;
            while (i4 < i2) {
                iMin = Math.min(rect.bottom - i3, rect.top + ((int) ((((long) i4) * ((long) rect.height())) / ((long) i2))));
                i5 = 0;
                while (i5 < i) {
                    iMin2 = Math.min(rect.right - 1, rect.left + ((int) ((((long) i5) * ((long) rect.width())) / ((long) i))));
                    i6 = i18;
                    if (i6 == 90) {
                        iWidth = cropRect.left + iMin;
                        iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin2;
                    } else if (i6 == 180) {
                        iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin2;
                        iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin;
                    } else if (i6 == 270) {
                        iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin;
                        iHeight = iMin2 + cropRect.top;
                    } else {
                        iWidth = cropRect.left + iMin2;
                        iHeight = cropRect.top + iMin;
                    }
                    C10888 c108814 = c10889;
                    iM27636 = C10888.m27636(c108814, iWidth, iHeight);
                    int i210 = iWidth / 2;
                    int i211 = iHeight / 2;
                    C10888 c108815 = c108810;
                    int iM27639 = C10888.m27636(c108815, i210, i211);
                    Rect rect3 = rect;
                    int iM276310 = C10888.m27636(c10888, i210, i211);
                    int i212 = (i4 * i) + i5;
                    i7 = iM27639 + a.g;
                    i8 = iM276310 + a.g;
                    if (z2) {
                        if (z3) {
                            i14 = 403;
                        } else {
                            i14 = 359;
                        }
                        int i213 = ((i14 * i8) >> 8) + iM27636;
                        if (z3) {
                            i15 = 48;
                        } else {
                            i15 = 88;
                        }
                        int i214 = iM27636 - ((i15 * i7) >> 8);
                        if (z3) {
                            i16 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        } else {
                            i16 = 183;
                        }
                        int i33 = i214 - ((i16 * i8) >> 8);
                        if (z3) {
                            i17 = 475;
                        } else {
                            i17 = 454;
                        }
                        iM31437 = iM27636 + ((i17 * i7) >> 8);
                        iM31436 = i213;
                        i13 = i33;
                    } else {
                        int iMax6 = Math.max(0, iM27636 - 16) * 298;
                        if (z3) {
                            i9 = 459;
                        } else {
                            i9 = 409;
                        }
                        iM31436 = C12669.m31436(i9, i8, iMax6, 128) >> 8;
                        if (z3) {
                            i10 = 55;
                        } else {
                            i10 = 100;
                        }
                        int i34 = iMax6 - (i10 * i7);
                        if (z3) {
                            i11 = 136;
                        } else {
                            i11 = 208;
                        }
                        int i35 = ((i34 - (i11 * i8)) + 128) >> 8;
                        if (z3) {
                            i12 = 541;
                        } else {
                            i12 = 516;
                        }
                        iM31437 = C12669.m31436(i12, i7, iMax6, 128) >> 8;
                        i13 = i35;
                    }
                    iArr[i212] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM31436)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM31437));
                    i5++;
                    z2 = z2;
                    i18 = i6;
                    cropRect = cropRect;
                    rect = rect3;
                    c10889 = c108814;
                    c108810 = c108815;
                }
                i4++;
                i3 = 1;
                i18 = i18;
                c10889 = c10889;
                c108810 = c108810;
            }
            return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
        }
        mediaFormat2 = mediaFormat;
        i3 = 1;
        if (i24 < 24) {
            z3 = false;
        } else {
            z3 = false;
        }
        iArr = new int[i * i2];
        i4 = 0;
        while (i4 < i2) {
            iMin = Math.min(rect.bottom - i3, rect.top + ((int) ((((long) i4) * ((long) rect.height())) / ((long) i2))));
            i5 = 0;
            while (i5 < i) {
                iMin2 = Math.min(rect.right - 1, rect.left + ((int) ((((long) i5) * ((long) rect.width())) / ((long) i))));
                i6 = i18;
                if (i6 == 90) {
                    iWidth = cropRect.left + iMin;
                    iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin2;
                } else if (i6 == 180) {
                    iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin2;
                    iHeight = ((cropRect.height() + cropRect.top) - 1) - iMin;
                } else if (i6 == 270) {
                    iWidth = ((cropRect.width() + cropRect.left) - 1) - iMin;
                    iHeight = iMin2 + cropRect.top;
                } else {
                    iWidth = cropRect.left + iMin2;
                    iHeight = cropRect.top + iMin;
                }
                C10888 c108816 = c10889;
                iM27636 = C10888.m27636(c108816, iWidth, iHeight);
                int i215 = iWidth / 2;
                int i216 = iHeight / 2;
                C10888 c108817 = c108810;
                int iM276311 = C10888.m27636(c108817, i215, i216);
                Rect rect4 = rect;
                int iM276312 = C10888.m27636(c10888, i215, i216);
                int i217 = (i4 * i) + i5;
                i7 = iM276311 + a.g;
                i8 = iM276312 + a.g;
                if (z2) {
                    if (z3) {
                        i14 = 403;
                    } else {
                        i14 = 359;
                    }
                    int i218 = ((i14 * i8) >> 8) + iM27636;
                    if (z3) {
                        i15 = 48;
                    } else {
                        i15 = 88;
                    }
                    int i219 = iM27636 - ((i15 * i7) >> 8);
                    if (z3) {
                        i16 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                    } else {
                        i16 = 183;
                    }
                    int i36 = i219 - ((i16 * i8) >> 8);
                    if (z3) {
                        i17 = 475;
                    } else {
                        i17 = 454;
                    }
                    iM31437 = iM27636 + ((i17 * i7) >> 8);
                    iM31436 = i218;
                    i13 = i36;
                } else {
                    int iMax7 = Math.max(0, iM27636 - 16) * 298;
                    if (z3) {
                        i9 = 459;
                    } else {
                        i9 = 409;
                    }
                    iM31436 = C12669.m31436(i9, i8, iMax7, 128) >> 8;
                    if (z3) {
                        i10 = 55;
                    } else {
                        i10 = 100;
                    }
                    int i37 = iMax7 - (i10 * i7);
                    if (z3) {
                        i11 = 136;
                    } else {
                        i11 = 208;
                    }
                    int i38 = ((i37 - (i11 * i8)) + 128) >> 8;
                    if (z3) {
                        i12 = 541;
                    } else {
                        i12 = 516;
                    }
                    iM31437 = C12669.m31436(i12, i7, iMax7, 128) >> 8;
                    i13 = i38;
                }
                iArr[i217] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM31436)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM31437));
                i5++;
                z2 = z2;
                i18 = i6;
                cropRect = cropRect;
                rect = rect4;
                c10889 = c108816;
                c108810 = c108817;
            }
            i4++;
            i3 = 1;
            i18 = i18;
            c10889 = c10889;
            c108810 = c108810;
        }
        return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
    }
}
