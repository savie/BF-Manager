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

/* JADX INFO: renamed from: l.ۖۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes2.dex */
public final class C2489 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f7965;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f7966;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f7967;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6964 f7968;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f7971;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f7972;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f7973;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17953 f7974;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15648 f7975;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public MediaFormat f7976;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f7977;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f7979;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f7980;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f7981;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f7982;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f7983;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f7984;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f7985;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f7986;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.BufferInfo f7970 = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f7969 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f7978 = -9223372036854775807L;

    public C2489(C6964 c6964, C17953 c17953, MediaCodec mediaCodec, String str, MediaFormat mediaFormat, C15648 c15648, int i, int i2, boolean z, boolean z2) {
        this.f7968 = c6964;
        this.f7974 = c17953;
        this.f7971 = mediaCodec;
        this.f7983 = str;
        this.f7976 = mediaFormat;
        this.f7975 = c15648;
        this.f7985 = i;
        this.f7973 = i2;
        this.f7982 = z;
        this.f7977 = z2 ? 1000 : 250;
        this.f7980 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2489 m8366(C6044 c6044, C6964 c6964, int i, int i2, boolean z, boolean z2, String str, InterfaceC8911 interfaceC8911) throws IOException {
        String name;
        int i3;
        interfaceC8911.mo23824();
        C17953 c17953 = new C17953(new C10732(), new C22077(c6044, interfaceC8911));
        MediaCodec mediaCodec = null;
        boolean z3 = false;
        try {
            c17953.m41904(C22823.f73957);
            interfaceC8911.mo23824();
            int i4 = 0;
            while (true) {
                if (i4 >= c17953.m41909()) {
                    i4 = -1;
                    break;
                }
                String string = c17953.m41902(i4).getString("mime");
                if (string != null && C9681.m25257(string)) {
                    break;
                }
                i4++;
            }
            if (i4 < 0) {
                throw new IOException("Missing MPEG-TS video track");
            }
            MediaFormat mediaFormatM41902 = c17953.m41902(i4);
            C15648 c15648M39701 = C16811.m39701(mediaFormatM41902);
            String str2 = c15648M39701.f50848;
            if (str2 == null || !C9681.m25257(str2)) {
                throw new IOException("Unsupported MPEG-TS video format");
            }
            m8369(mediaFormatM41902);
            c17953.m41908(i4);
            mediaFormatM41902.setInteger("color-format", 2135033992);
            int i5 = c15648M39701.f50814;
            mediaFormatM41902.setInteger("max-input-size", (int) Math.min(X931RNG.BLOCK128_RESEED_MAX, Math.max(2097152L, (i5 <= 0 || (i3 = c15648M39701.f50852) <= 0) ? 0L : (((long) i5) * ((long) i3)) / 2)));
            MediaCodec mediaCodecM8364 = m8364(c15648M39701, mediaFormatM41902, z2, str, interfaceC8911);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    name = mediaCodecM8364.getCanonicalName();
                } else {
                    name = mediaCodecM8364.getName();
                }
                return new C2489(c6964, c17953, mediaCodecM8364, name, mediaFormatM41902, c15648M39701, i, i2, z, m8372(mediaCodecM8364, str2));
            } catch (IOException | RuntimeException e) {
                e = e;
                z3 = true;
                mediaCodec = mediaCodecM8364;
                C22823.m51455(mediaCodec, z3);
                c17953.m41906();
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
    public static boolean m8372(MediaCodec mediaCodec, String str) {
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
            for (C0251 c0251 : C1939.m6722(str, false, false)) {
                if (c0251.f1533.equals(name)) {
                    return c0251.f1529;
                }
            }
        } catch (C22822 unused) {
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static MediaCodec m8364(C15648 c15648, MediaFormat mediaFormat, boolean z, String str, InterfaceC8911 interfaceC8911) throws IOException {
        Throwable e;
        MediaCodec mediaCodecCreateByCodecName;
        String str2 = c15648.f50848;
        if (str2 == null) {
            throw new IOException("Missing MPEG-TS video MIME type");
        }
        MediaCodec mediaCodec = null;
        if (!z) {
            interfaceC8911.mo23824();
            try {
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(str2);
                try {
                    m8377(mediaCodecCreateDecoderByType, str2);
                    mediaCodecCreateDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                    return mediaCodecCreateDecoderByType;
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecCreateDecoderByType;
                    C22823.m51455(mediaCodec, false);
                    throw new C0998("Failed to initialize MPEG-TS preview decoder", e);
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        } else {
            try {
                Throwable th = null;
                for (C0251 c0251 : C1939.m6722(str2, false, false)) {
                    boolean z2 = c0251.f1529;
                    String str3 = c0251.f1533;
                    if (z2 && !str3.equals(str)) {
                        try {
                            interfaceC8911.mo23824();
                            if (c0251.m1748(c15648)) {
                                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                                try {
                                    m8377(mediaCodecCreateByCodecName, str2);
                                    mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                                    mediaCodecCreateByCodecName.start();
                                    return mediaCodecCreateByCodecName;
                                } catch (InterruptedIOException e5) {
                                    e = e5;
                                    mediaCodec = mediaCodecCreateByCodecName;
                                } catch (IOException e6) {
                                    e = e6;
                                    C22823.m51455(mediaCodecCreateByCodecName, false);
                                    th = e;
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    C22823.m51455(mediaCodecCreateByCodecName, false);
                                    th = e;
                                } catch (C22822 e8) {
                                    e = e8;
                                    C22823.m51455(mediaCodecCreateByCodecName, false);
                                    th = e;
                                }
                            }
                        } catch (InterruptedIOException e9) {
                            e = e9;
                        } catch (IOException e10) {
                            e = e10;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C22823.m51455(mediaCodecCreateByCodecName, false);
                            th = e;
                        } catch (RuntimeException e11) {
                            e = e11;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C22823.m51455(mediaCodecCreateByCodecName, false);
                            th = e;
                        } catch (C22822 e12) {
                            e = e12;
                            e = e;
                            mediaCodecCreateByCodecName = null;
                            C22823.m51455(mediaCodecCreateByCodecName, false);
                            th = e;
                        }
                        C22823.m51455(mediaCodec, false);
                        throw e;
                    }
                }
                if (th != null) {
                    throw new C0998("Failed to initialize software MPEG-TS preview decoder", th);
                }
                throw new IOException("Missing software MPEG-TS preview decoder");
            } catch (C22822 e13) {
                throw new IOException("Failed to query software video decoders", e13);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m8377(MediaCodec mediaCodec, String str) throws IOException {
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
    public static void m8369(MediaFormat mediaFormat) throws IOException {
        if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("color-transfer")) {
            return;
        }
        int integer = mediaFormat.getInteger("color-transfer");
        if (integer == 6 || integer == 7) {
            throw new IOException("HDR MPEG-TS preview is unsupported");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8373(C2489 c2489, int i, int i2) {
        return c2489.f7985 == i && c2489.f7973 == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8370(C2489 c2489, long j, InterfaceC8911 interfaceC8911) throws IOException {
        boolean z;
        C13675 c13675 = new C13675(c2489.f7985, c2489.f7973, j);
        while (c2489.f7968.m19268(c13675) == null && !c2489.f7966) {
            interfaceC8911.mo23824();
            boolean zM8371 = c2489.m8371(j, 0L, interfaceC8911);
            if (!c2489.f7972) {
                C17953 c17953 = c2489.f7974;
                MediaCodec mediaCodec = c2489.f7971;
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(2000L);
                if (iDequeueInputBuffer < 0) {
                    z = false;
                } else {
                    interfaceC8911.mo23824();
                    long jM41905 = c17953.m41905();
                    if (jM41905 < 0) {
                        c2489.m8367(iDequeueInputBuffer, false);
                    } else if (c2489.f7986 >= 1200) {
                        c2489.m8367(iDequeueInputBuffer, true);
                    } else {
                        if (c2489.f7969 == -9223372036854775807L) {
                            c2489.f7969 = jM41905;
                        }
                        long jMax = Math.max(0L, jM41905 - c2489.f7969);
                        if (jMax > 10000000) {
                            c2489.m8367(iDequeueInputBuffer, true);
                        } else {
                            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                            if (inputBuffer == null) {
                                throw new IOException("Missing MPEG-TS decoder input buffer");
                            }
                            inputBuffer.clear();
                            try {
                                int iM41901 = c17953.m41901(inputBuffer);
                                if (iM41901 < 0) {
                                    c2489.m8367(iDequeueInputBuffer, false);
                                } else {
                                    c2489.f7971.queueInputBuffer(iDequeueInputBuffer, 0, iM41901, jMax, (c17953.m41907() & 1) != 0 ? 1 : 0);
                                    c2489.f7979 = jMax;
                                    c2489.f7986++;
                                    c17953.m41903();
                                }
                            } catch (RuntimeException e) {
                                throw new IOException("MPEG-TS access unit exceeds codec input buffer", e);
                            }
                        }
                    }
                    z = true;
                }
                zM8371 |= z;
            }
            if (c2489.m8371(j, 2000L, interfaceC8911) | zM8371) {
                c2489.f7967 = 0;
            } else {
                int i = c2489.f7967 + 1;
                c2489.f7967 = i;
                if (i >= c2489.f7977) {
                    throw new C8455("MPEG-TS preview decoder timed out: input=" + c2489.f7986 + ", inputEnded=" + c2489.f7972 + ", output=" + c2489.f7981 + ", lastOutputUs=" + c2489.f7978 + ", nextBucket=" + c2489.f7984);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8367(int i, boolean z) {
        this.f7971.queueInputBuffer(i, 0, 0, this.f7979, 4);
        this.f7965 = z;
        this.f7972 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8371(long j, long j2, InterfaceC8911 interfaceC8911) throws C9200 {
        MediaCodec mediaCodec = this.f7971;
        MediaCodec.BufferInfo bufferInfo = this.f7970;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
        if (iDequeueOutputBuffer == -1) {
            return false;
        }
        if (iDequeueOutputBuffer == -2) {
            try {
                this.f7976 = mediaCodec.getOutputFormat();
                return true;
            } catch (RuntimeException e) {
                throw new C9200("Failed to read MPEG-TS decoder output format", e);
            }
        }
        if (iDequeueOutputBuffer < 0) {
            return true;
        }
        try {
            interfaceC8911.mo23824();
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0) {
                long jMin = Math.min(j, Math.max(0L, bufferInfo.presentationTimeUs) / 1000000);
                if (this.f7984 <= jMin) {
                    try {
                        Image outputImage = mediaCodec.getOutputImage(iDequeueOutputBuffer);
                        if (outputImage == null) {
                            throw new C9200("Decoder did not expose an output image");
                        }
                        m8368(outputImage, jMin);
                    } catch (RuntimeException e2) {
                        throw new C9200("Failed to obtain MPEG-TS decoder output image", e2);
                    }
                }
                this.f7981++;
                this.f7978 = bufferInfo.presentationTimeUs;
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.f7966 = true;
            }
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return true;
        } catch (Throwable th) {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8368(Image image, long j) throws C9200 {
        try {
            Bitmap bitmapM51452 = C22823.m51452(image, this.f7985, this.f7973, this.f7975, this.f7982, this.f7976);
            while (true) {
                long j2 = this.f7984;
                if (j2 > j) {
                    return;
                }
                C13675 c13675 = new C13675(this.f7985, this.f7973, j2);
                C6964 c6964 = this.f7968;
                if (c6964.m19268(c13675) == null) {
                    c6964.m19270(c13675, bitmapM51452);
                }
                this.f7984++;
            }
        } catch (IOException | RuntimeException e) {
            throw new C9200("Unsupported MPEG-TS decoder output image", e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m8375(C2489 c2489) {
        C22823.m51455(c2489.f7971, c2489.f7980);
        c2489.f7980 = false;
        c2489.f7974.m41906();
    }
}
