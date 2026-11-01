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

/* JADX INFO: renamed from: l.֫᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes2.dex */
public final class C2073 implements InterfaceC17347 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7669 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Uri f7670 = Uri.parse("mt-ts-preview:///media.ts");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f7671;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f7672;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17596 f7673 = new C17596();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6265 f7674;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f7675;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7648 f7676;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16891 f7677;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f7678;

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo6594() {
        return true;
    }

    public C2073(C6265 c6265, long j) {
        this.f7674 = c6265;
        this.f7675 = j * 1000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2073 m6584(C6265 c6265, long j) throws IOException {
        if (!c6265.m17342() || j <= 0 || j > 10000) {
            throw new IOException("Unsupported MPEG-TS preview source");
        }
        return new C2073(c6265, j);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:7:0x002c, B:35:0x006a, B:41:0x007b, B:39:0x0074, B:44:0x0084, B:45:0x0087, B:47:0x008b, B:48:0x008d, B:49:0x008e, B:50:0x0095, B:52:0x0097), top: B:59:0x001f }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m6583(C6265 c6265, int i, InterfaceC0413 interfaceC0413) throws Throwable {
        Throwable th;
        if (!c6265.m17342()) {
            throw new IOException("Unsupported MPEG-TS thumbnail source");
        }
        int iMax = Math.max(1, i);
        C6307 c6307 = new C6307(iMax, iMax, 0L);
        C17596 c17596 = new C17596();
        String str = null;
        Exception exc = null;
        boolean z = false;
        C16891 c16891 = null;
        while (true) {
            try {
                try {
                    try {
                        interfaceC0413.mo2170();
                        th = exc;
                        try {
                            C16891 c16891M39557 = C16891.m39557(c6265, c17596, iMax, iMax, true, z, str, interfaceC0413);
                            try {
                                C16891.m39561(c16891M39557, 0L, interfaceC0413);
                                Bitmap bitmapM40915 = c17596.m40915(c6307);
                                if (bitmapM40915 == null) {
                                    throw new IOException("MPEG-TS thumbnail frame was not decoded");
                                }
                                C16891.m39569(c16891M39557);
                                c17596.m40916();
                                return bitmapM40915;
                            } catch (InterruptedIOException e) {
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                c16891 = c16891M39557;
                                exc = e;
                                if (z && m6586(exc)) {
                                    str = c16891 == null ? null : c16891.f54015;
                                    if (c16891 != null) {
                                        C16891.m39569(c16891);
                                        c16891 = null;
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
                                c16891 = c16891M39557;
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
                                c16891 = c16891M39557;
                                if (c16891 != null) {
                                    C16891.m39569(c16891);
                                }
                                c17596.m40916();
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
    public static boolean m6586(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C12658) || (cause instanceof C20419) || (cause instanceof C0662) || (cause instanceof MediaCodec.CodecException)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Bitmap m6588(long j, int i, int i2, InterfaceC0413 interfaceC0413) throws IOException {
        C16891 c16891M39557 = this.f7677;
        if (c16891M39557 != null && (!C16891.m39564(c16891M39557, i, i2) || c16891M39557.f54030 > j)) {
            m6589();
            c16891M39557 = null;
        }
        if (c16891M39557 == null) {
            c16891M39557 = C16891.m39557(this.f7674, this.f7673, i, i2, false, this.f7671, this.f7672, interfaceC0413);
            this.f7677 = c16891M39557;
            this.f7676 = c16891M39557.f54028;
        }
        C16891.m39561(c16891M39557, j, interfaceC0413);
        C6307 c6307 = new C6307(i, i2, j);
        C17596 c17596 = this.f7673;
        Bitmap bitmapM40915 = c17596.m40915(c6307);
        if (bitmapM40915 != null) {
            return bitmapM40915;
        }
        Bitmap bitmapM40914 = c17596.m40914(i, i2, j);
        if (bitmapM40914 != null) {
            boolean z = c16891M39557.f54021;
            boolean z2 = c16891M39557.f54016;
            if (z && !z2) {
                return bitmapM40914;
            }
        }
        throw new IOException("MPEG-TS preview frame was not decoded");
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9587 mo6590() {
        C7648 c7648 = this.f7676;
        if (c7648 == null) {
            return null;
        }
        return C4791.m13303(c7648.f25246, c7648.f25253, c7648.f25248, c7648.f25241);
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo6593() {
        m6589();
    }

    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6592() {
        if (this.f7678) {
            return;
        }
        this.f7678 = true;
        m6589();
        this.f7673.m40916();
        this.f7676 = null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m6589() {
        C16891 c16891 = this.f7677;
        this.f7677 = null;
        if (c16891 != null) {
            C16891.m39569(c16891);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    @Override // l.InterfaceC17347
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap mo6591(long j, int i, int i2, InterfaceC0413 interfaceC0413) throws IOException {
        Exception exc;
        C16891 c16891;
        String str;
        if (!this.f7678 && !Thread.currentThread().isInterrupted()) {
            interfaceC0413.mo2170();
            int iMax = Math.max(1, i);
            int iMax2 = Math.max(1, i2);
            long jMax = Math.max(0L, Math.min(j, this.f7675)) / 1000000;
            Bitmap bitmapM40915 = this.f7673.m40915(new C6307(iMax, iMax2, jMax));
            if (bitmapM40915 != null) {
                return bitmapM40915;
            }
            try {
                return m6588(jMax, iMax, iMax2, interfaceC0413);
            } catch (InterruptedIOException e) {
                m6589();
                throw e;
            } catch (IOException e2) {
                e = e2;
                exc = e;
                if (!this.f7671 && m6586(exc)) {
                    c16891 = this.f7677;
                    if (c16891 == null) {
                        str = null;
                    } else {
                        str = c16891.f54015;
                    }
                    this.f7672 = str;
                    m6589();
                    this.f7671 = true;
                    try {
                        return m6588(jMax, iMax, iMax2, interfaceC0413);
                    } catch (InterruptedIOException e3) {
                        m6589();
                        throw e3;
                    } catch (IOException e4) {
                        e = e4;
                        e.addSuppressed(exc);
                        exc = e;
                        m6589();
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new IOException("MPEG-TS preview decode failed", exc);
                    } catch (RuntimeException e5) {
                        e = e5;
                        e.addSuppressed(exc);
                        exc = e;
                        m6589();
                        if (exc instanceof IOException) {
                            throw ((IOException) exc);
                        }
                        throw new IOException("MPEG-TS preview decode failed", exc);
                    }
                }
                m6589();
                if (exc instanceof IOException) {
                    throw ((IOException) exc);
                }
                throw new IOException("MPEG-TS preview decode failed", exc);
            } catch (RuntimeException e6) {
                e = e6;
                exc = e;
                if (!this.f7671) {
                    c16891 = this.f7677;
                    if (c16891 == null) {
                        str = null;
                    } else {
                        str = c16891.f54015;
                    }
                    this.f7672 = str;
                    m6589();
                    this.f7671 = true;
                    return m6588(jMax, iMax, iMax2, interfaceC0413);
                }
                m6589();
                if (exc instanceof IOException) {
                    throw ((IOException) exc);
                }
                throw new IOException("MPEG-TS preview decode failed", exc);
            }
        }
        throw new InterruptedIOException("MPEG-TS frame source was closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6585(MediaCodec mediaCodec, boolean z) {
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
    public static Bitmap m6582(Image image, int i, int i2, C7648 c7648, boolean z, MediaFormat mediaFormat) throws IOException {
        C14775 c14775;
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
        int iM35411;
        int i7;
        int i8;
        int i9;
        int iM5620;
        int i10;
        int i11;
        int i12;
        int iM5621;
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
        C14775 c14776 = new C14775(image.getPlanes()[0]);
        C14775 c14777 = new C14775(image.getPlanes()[1]);
        C14775 c14778 = new C14775(image.getPlanes()[2]);
        int i18 = ((c7648.f25248 % 360) + 360) % 360;
        if (i18 != 90 && i18 != 180 && i18 != 270) {
            i18 = 0;
        }
        boolean z4 = i18 == 90 || i18 == 270;
        int iHeight2 = z4 ? cropRect.height() : cropRect.width();
        int iWidth2 = z4 ? cropRect.width() : cropRect.height();
        float f = c7648.f25241;
        if (f <= 0.0f || Float.isInfinite(f)) {
            f = 1.0f;
        }
        float f2 = z4 ? 1.0f : f;
        if (!z4) {
            f = 1.0f;
        }
        if (!z) {
            rect = new Rect(0, 0, iHeight2, iWidth2);
            c14775 = c14778;
        } else {
            double d = f2;
            double d2 = iWidth2;
            c14775 = c14778;
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
                        C14775 c14779 = c14776;
                        iM35411 = C14775.m35411(c14779, iWidth, iHeight);
                        int i25 = iWidth / 2;
                        int i26 = iHeight / 2;
                        C14775 c147710 = c14777;
                        int iM35412 = C14775.m35411(c147710, i25, i26);
                        Rect rect2 = rect;
                        int iM35413 = C14775.m35411(c14775, i25, i26);
                        int i27 = (i4 * i) + i5;
                        i7 = iM35412 + a.g;
                        i8 = iM35413 + a.g;
                        if (z2) {
                            if (z3) {
                                i14 = 403;
                            } else {
                                i14 = 359;
                            }
                            int i28 = ((i14 * i8) >> 8) + iM35411;
                            if (z3) {
                                i15 = 48;
                            } else {
                                i15 = 88;
                            }
                            int i29 = iM35411 - ((i15 * i7) >> 8);
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
                            iM5621 = iM35411 + ((i17 * i7) >> 8);
                            iM5620 = i28;
                            i13 = i30;
                        } else {
                            int iMax5 = Math.max(0, iM35411 - 16) * 298;
                            if (z3) {
                                i9 = 459;
                            } else {
                                i9 = 409;
                            }
                            iM5620 = C1694.m5620(i9, i8, iMax5, 128) >> 8;
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
                            iM5621 = C1694.m5620(i12, i7, iMax5, 128) >> 8;
                            i13 = i32;
                        }
                        iArr[i27] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM5620)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM5621));
                        i5++;
                        z2 = z2;
                        i18 = i6;
                        cropRect = cropRect;
                        rect = rect2;
                        c14776 = c14779;
                        c14777 = c147710;
                    }
                    i4++;
                    i3 = 1;
                    i18 = i18;
                    c14776 = c14776;
                    c14777 = c14777;
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
                    C14775 c147711 = c14776;
                    iM35411 = C14775.m35411(c147711, iWidth, iHeight);
                    int i210 = iWidth / 2;
                    int i211 = iHeight / 2;
                    C14775 c147712 = c14777;
                    int iM35414 = C14775.m35411(c147712, i210, i211);
                    Rect rect3 = rect;
                    int iM35415 = C14775.m35411(c14775, i210, i211);
                    int i212 = (i4 * i) + i5;
                    i7 = iM35414 + a.g;
                    i8 = iM35415 + a.g;
                    if (z2) {
                        if (z3) {
                            i14 = 403;
                        } else {
                            i14 = 359;
                        }
                        int i213 = ((i14 * i8) >> 8) + iM35411;
                        if (z3) {
                            i15 = 48;
                        } else {
                            i15 = 88;
                        }
                        int i214 = iM35411 - ((i15 * i7) >> 8);
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
                        iM5621 = iM35411 + ((i17 * i7) >> 8);
                        iM5620 = i213;
                        i13 = i33;
                    } else {
                        int iMax6 = Math.max(0, iM35411 - 16) * 298;
                        if (z3) {
                            i9 = 459;
                        } else {
                            i9 = 409;
                        }
                        iM5620 = C1694.m5620(i9, i8, iMax6, 128) >> 8;
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
                        iM5621 = C1694.m5620(i12, i7, iMax6, 128) >> 8;
                        i13 = i35;
                    }
                    iArr[i212] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM5620)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM5621));
                    i5++;
                    z2 = z2;
                    i18 = i6;
                    cropRect = cropRect;
                    rect = rect3;
                    c14776 = c147711;
                    c14777 = c147712;
                }
                i4++;
                i3 = 1;
                i18 = i18;
                c14776 = c14776;
                c14777 = c14777;
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
                C14775 c147713 = c14776;
                iM35411 = C14775.m35411(c147713, iWidth, iHeight);
                int i215 = iWidth / 2;
                int i216 = iHeight / 2;
                C14775 c147714 = c14777;
                int iM35416 = C14775.m35411(c147714, i215, i216);
                Rect rect4 = rect;
                int iM35417 = C14775.m35411(c14775, i215, i216);
                int i217 = (i4 * i) + i5;
                i7 = iM35416 + a.g;
                i8 = iM35417 + a.g;
                if (z2) {
                    if (z3) {
                        i14 = 403;
                    } else {
                        i14 = 359;
                    }
                    int i218 = ((i14 * i8) >> 8) + iM35411;
                    if (z3) {
                        i15 = 48;
                    } else {
                        i15 = 88;
                    }
                    int i219 = iM35411 - ((i15 * i7) >> 8);
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
                    iM5621 = iM35411 + ((i17 * i7) >> 8);
                    iM5620 = i218;
                    i13 = i36;
                } else {
                    int iMax7 = Math.max(0, iM35411 - 16) * 298;
                    if (z3) {
                        i9 = 459;
                    } else {
                        i9 = 409;
                    }
                    iM5620 = C1694.m5620(i9, i8, iMax7, 128) >> 8;
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
                    iM5621 = C1694.m5620(i12, i7, iMax7, 128) >> 8;
                    i13 = i38;
                }
                iArr[i217] = (Math.max(0, Math.min(255, i13)) << 8) | (Math.max(0, Math.min(255, iM5620)) << 16) | (-16777216) | Math.max(0, Math.min(255, iM5621));
                i5++;
                z2 = z2;
                i18 = i6;
                cropRect = cropRect;
                rect = rect4;
                c14776 = c147713;
                c14777 = c147714;
            }
            i4++;
            i3 = 1;
            i18 = i18;
            c14776 = c14776;
            c14777 = c14777;
        }
        return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
    }
}
