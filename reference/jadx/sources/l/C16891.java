package l;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܽ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C16891 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2522 f54014;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f54015;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f54016;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17596 f54017;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f54018;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f54019;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f54020;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f54021;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f54022;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f54024;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f54026;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7648 f54028;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f54029;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f54030;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f54031;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f54032;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f54033;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public MediaFormat f54034;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f54035;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.BufferInfo f54023 = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f54025 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f54027 = -9223372036854775807L;

    public C16891(C17596 c17596, C2522 c2522, MediaCodec mediaCodec, String str, MediaFormat mediaFormat, C7648 c7648, int i, int i2, boolean z, boolean z2) {
        this.f54017 = c17596;
        this.f54014 = c2522;
        this.f54024 = mediaCodec;
        this.f54015 = str;
        this.f54034 = mediaFormat;
        this.f54028 = c7648;
        this.f54020 = i;
        this.f54022 = i2;
        this.f54026 = z;
        this.f54029 = z2 ? 1000 : 250;
        this.f54018 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16891 m39557(C6265 c6265, C17596 c17596, int i, int i2, boolean z, boolean z2, String str, InterfaceC0413 interfaceC0413) throws IOException {
        String name;
        int i3;
        interfaceC0413.mo2170();
        C2522 c2522 = new C2522(new C11445(), new C23947(c6265, interfaceC0413));
        MediaCodec mediaCodec = null;
        boolean z3 = false;
        try {
            c2522.m7891(C2073.f7670);
            interfaceC0413.mo2170();
            int i4 = 0;
            while (true) {
                if (i4 >= c2522.m7887()) {
                    i4 = -1;
                    break;
                }
                String string = c2522.m7889(i4).getString("mime");
                if (string != null && C6632.m17982(string)) {
                    break;
                }
                i4++;
            }
            if (i4 < 0) {
                throw new IOException("Missing MPEG-TS video track");
            }
            MediaFormat mediaFormatM7889 = c2522.m7889(i4);
            C7648 c7648M40174 = C17237.m40174(mediaFormatM7889);
            String str2 = c7648M40174.f25265;
            if (str2 == null || !C6632.m17982(str2)) {
                throw new IOException("Unsupported MPEG-TS video format");
            }
            m39560(mediaFormatM7889);
            c2522.m7895(i4);
            mediaFormatM7889.setInteger("color-format", 2135033992);
            int i5 = c7648M40174.f25246;
            mediaFormatM7889.setInteger("max-input-size", (int) Math.min(X931RNG.BLOCK128_RESEED_MAX, Math.max(2097152L, (i5 <= 0 || (i3 = c7648M40174.f25253) <= 0) ? 0L : (((long) i5) * ((long) i3)) / 2)));
            MediaCodec mediaCodecM39555 = m39555(c7648M40174, mediaFormatM7889, z2, str, interfaceC0413);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    name = mediaCodecM39555.getCanonicalName();
                } else {
                    name = mediaCodecM39555.getName();
                }
                return new C16891(c17596, c2522, mediaCodecM39555, name, mediaFormatM7889, c7648M40174, i, i2, z, m39563(mediaCodecM39555, str2));
            } catch (IOException | RuntimeException e) {
                e = e;
                z3 = true;
                mediaCodec = mediaCodecM39555;
                C2073.m6585(mediaCodec, z3);
                c2522.m7892();
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new IOException("Failed to initialize MPEG-TS preview decoder", e);
            }
        } catch (IOException e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39563(MediaCodec mediaCodec, String str) {
        String name;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return mediaCodec.getCodecInfo().isSoftwareOnly();
        }
        if (i >= 29) {
            name = mediaCodec.getCanonicalName();
        } else {
            name = mediaCodec.getName();
        }
        try {
            for (C5076 c5076 : C19894.m45161(str, false, false)) {
                if (c5076.f17691.equals(name)) {
                    return c5076.f17689;
                }
            }
        } catch (C8605 unused) {
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static MediaCodec m39555(C7648 c7648, MediaFormat mediaFormat, boolean z, String str, InterfaceC0413 interfaceC0413) throws IOException {
        Throwable e;
        MediaCodec mediaCodecCreateByCodecName;
        String str2 = c7648.f25265;
        if (str2 == null) {
            throw new IOException("Missing MPEG-TS video MIME type");
        }
        MediaCodec mediaCodec = null;
        if (!z) {
            interfaceC0413.mo2170();
            try {
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(str2);
                try {
                    m39567(mediaCodecCreateDecoderByType, str2);
                    mediaCodecCreateDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                    return mediaCodecCreateDecoderByType;
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecCreateDecoderByType;
                    C2073.m6585(mediaCodec, false);
                    throw new C20419("Failed to initialize MPEG-TS preview decoder", e);
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        } else {
            try {
                Throwable th = null;
                for (C5076 c5076 : C19894.m45161(str2, false, false)) {
                    boolean z2 = c5076.f17689;
                    String str3 = c5076.f17691;
                    if (z2 && !str3.equals(str)) {
                        try {
                            interfaceC0413.mo2170();
                            if (c5076.m14154(c7648)) {
                                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                                try {
                                    m39567(mediaCodecCreateByCodecName, str2);
                                    mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                                    mediaCodecCreateByCodecName.start();
                                    return mediaCodecCreateByCodecName;
                                } catch (InterruptedIOException e5) {
                                    e = e5;
                                    mediaCodec = mediaCodecCreateByCodecName;
                                } catch (IOException e6) {
                                    e = e6;
                                    C2073.m6585(mediaCodecCreateByCodecName, false);
                                    th = e;
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    C2073.m6585(mediaCodecCreateByCodecName, false);
                                    th = e;
                                } catch (C8605 e8) {
                                    e = e8;
                                    C2073.m6585(mediaCodecCreateByCodecName, false);
                                    th = e;
                                }
                            }
                        } catch (InterruptedIOException e9) {
                            e = e9;
                        } catch (IOException e10) {
                            e = e10;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C2073.m6585(mediaCodecCreateByCodecName, false);
                            th = e;
                        } catch (RuntimeException e11) {
                            e = e11;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C2073.m6585(mediaCodecCreateByCodecName, false);
                            th = e;
                        } catch (C8605 e12) {
                            e = e12;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C2073.m6585(mediaCodecCreateByCodecName, false);
                            th = e;
                        }
                        C2073.m6585(mediaCodec, false);
                        throw e;
                    }
                }
                if (th != null) {
                    throw new C20419("Failed to initialize software MPEG-TS preview decoder", th);
                }
                throw new IOException("Missing software MPEG-TS preview decoder");
            } catch (C8605 e13) {
                throw new IOException("Failed to query software video decoders", e13);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m39567(MediaCodec mediaCodec, String str) throws IOException {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        for (int i : mediaCodec.getCodecInfo().getCapabilitiesForType(str).colorFormats) {
            if (i == 2135033992) {
                return;
            }
        }
        throw new IOException("Decoder does not expose flexible YUV output");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39560(MediaFormat mediaFormat) throws IOException {
        if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("color-transfer")) {
            return;
        }
        int integer = mediaFormat.getInteger("color-transfer");
        if (integer == 6 || integer == 7) {
            throw new IOException("HDR MPEG-TS preview is unsupported");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39564(C16891 c16891, int i, int i2) {
        return c16891.f54020 == i && c16891.f54022 == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39561(C16891 c16891, long j, InterfaceC0413 interfaceC0413) throws IOException {
        boolean z;
        C6307 c6307 = new C6307(c16891.f54020, c16891.f54022, j);
        while (c16891.f54017.m40915(c6307) == null && !c16891.f54021) {
            interfaceC0413.mo2170();
            boolean zM39562 = c16891.m39562(j, 0L, interfaceC0413);
            if (!c16891.f54019) {
                C2522 c2522 = c16891.f54014;
                MediaCodec mediaCodec = c16891.f54024;
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(2000L);
                if (iDequeueInputBuffer < 0) {
                    z = false;
                } else {
                    interfaceC0413.mo2170();
                    long jM7893 = c2522.m7893();
                    if (jM7893 < 0) {
                        c16891.m39558(iDequeueInputBuffer, false);
                    } else if (c16891.f54035 >= 1200) {
                        c16891.m39558(iDequeueInputBuffer, true);
                    } else {
                        if (c16891.f54025 == -9223372036854775807L) {
                            c16891.f54025 = jM7893;
                        }
                        long jMax = Math.max(0L, jM7893 - c16891.f54025);
                        if (jMax > 10000000) {
                            c16891.m39558(iDequeueInputBuffer, true);
                        } else {
                            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                            if (inputBuffer == null) {
                                throw new IOException("Missing MPEG-TS decoder input buffer");
                            }
                            inputBuffer.clear();
                            try {
                                int iM7888 = c2522.m7888(inputBuffer);
                                if (iM7888 < 0) {
                                    c16891.m39558(iDequeueInputBuffer, false);
                                } else {
                                    c16891.f54024.queueInputBuffer(iDequeueInputBuffer, 0, iM7888, jMax, (c2522.m7894() & 1) != 0 ? 1 : 0);
                                    c16891.f54033 = jMax;
                                    c16891.f54035++;
                                    c2522.m7890();
                                }
                            } catch (RuntimeException e) {
                                throw new IOException("MPEG-TS access unit exceeds codec input buffer", e);
                            }
                        }
                    }
                    z = true;
                }
                zM39562 |= z;
            }
            if (c16891.m39562(j, 2000L, interfaceC0413) | zM39562) {
                c16891.f54032 = 0;
            } else {
                int i = c16891.f54032 + 1;
                c16891.f54032 = i;
                if (i >= c16891.f54029) {
                    throw new C12658("MPEG-TS preview decoder timed out: input=" + c16891.f54035 + ", inputEnded=" + c16891.f54019 + ", output=" + c16891.f54031 + ", lastOutputUs=" + c16891.f54027 + ", nextBucket=" + c16891.f54030);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39558(int i, boolean z) {
        this.f54024.queueInputBuffer(i, 0, 0, this.f54033, 4);
        this.f54016 = z;
        this.f54019 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m39562(long j, long j2, InterfaceC0413 interfaceC0413) throws C0662 {
        MediaCodec mediaCodec = this.f54024;
        MediaCodec.BufferInfo bufferInfo = this.f54023;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
        if (iDequeueOutputBuffer == -1) {
            return false;
        }
        if (iDequeueOutputBuffer == -2) {
            try {
                this.f54034 = mediaCodec.getOutputFormat();
                return true;
            } catch (RuntimeException e) {
                throw new C0662("Failed to read MPEG-TS decoder output format", e);
            }
        }
        if (iDequeueOutputBuffer < 0) {
            return true;
        }
        try {
            interfaceC0413.mo2170();
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0) {
                long jMin = Math.min(j, Math.max(0L, bufferInfo.presentationTimeUs) / 1000000);
                if (this.f54030 <= jMin) {
                    try {
                        Image outputImage = mediaCodec.getOutputImage(iDequeueOutputBuffer);
                        if (outputImage == null) {
                            throw new C0662("Decoder did not expose an output image");
                        }
                        m39559(outputImage, jMin);
                    } catch (RuntimeException e2) {
                        throw new C0662("Failed to obtain MPEG-TS decoder output image", e2);
                    }
                }
                this.f54031++;
                this.f54027 = bufferInfo.presentationTimeUs;
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.f54021 = true;
            }
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return true;
        } catch (Throwable th) {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39559(Image image, long j) throws C0662 {
        try {
            Bitmap bitmapM6582 = C2073.m6582(image, this.f54020, this.f54022, this.f54028, this.f54026, this.f54034);
            while (true) {
                long j2 = this.f54030;
                if (j2 > j) {
                    return;
                }
                C6307 c6307 = new C6307(this.f54020, this.f54022, j2);
                C17596 c17596 = this.f54017;
                if (c17596.m40915(c6307) == null) {
                    c17596.m40917(c6307, bitmapM6582);
                }
                this.f54030++;
            }
        } catch (IOException | RuntimeException e) {
            throw new C0662("Unsupported MPEG-TS decoder output image", e);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m39569(C16891 c16891) {
        C2073.m6585(c16891.f54024, c16891.f54018);
        c16891.f54018 = false;
        c16891.f54014.m7892();
    }
}
