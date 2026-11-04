package l;

import android.media.MediaCodec;
import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۘ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes2.dex */
public final class C4177 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0884 f14168 = new C0884(500);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f14169 = Long.toHexString(System.currentTimeMillis()) + Long.toHexString(System.nanoTime());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13358(long j, String str) {
        return C6044.m17541(str) && j >= 48128 && j % 188 == 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m13361(String str) {
        return C6044.m17541(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23569 m13354(String str) {
        EnumC23569 enumC23569;
        C0884 c0884 = f14168;
        synchronized (c0884) {
            enumC23569 = (EnumC23569) c0884.m3588(str);
        }
        return enumC23569;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13357(String str, EnumC23569 enumC23569) {
        C0884 c0884 = f14168;
        synchronized (c0884) {
            c0884.m3589(str, enumC23569);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13348(String str, InterfaceC2386 interfaceC2386, long j) {
        if (j > 0) {
            return str;
        }
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(f14169);
        sbM27333.append(System.identityHashCode(interfaceC2386));
        return C15022.m36181(sbM27333.toString()).toLowerCase();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23569 m13353(InputStream inputStream) throws IOException {
        m13359();
        byte[] bArr = new byte[940];
        C5125.m15498(inputStream, bArr);
        m13359();
        return m13355(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23569 m13352(MediaDataSource mediaDataSource) throws IOException {
        byte[] bArr = new byte[940];
        int i = 0;
        while (i < 940) {
            m13359();
            int at = mediaDataSource.readAt(i, bArr, i, 940 - i);
            if (at <= 0) {
                throw new EOFException("Unexpected end of MPEG-TS probe source");
            }
            i += at;
        }
        return m13355(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23569 m13355(byte[] bArr) {
        for (int i = 0; i < 188; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                if ((bArr[(i2 * 188) + i] & 255) != 71) {
                }
            }
            return EnumC23569.MPEG_TS;
        }
        return EnumC23569.NOT_MPEG_TS;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3431 m13351(AbstractC22044 abstractC22044, int i) {
        final C20585 c20585 = new C20585();
        final C6044 c6044M17540 = C6044.m17540(abstractC22044, true);
        try {
            return new C3431(C22823.m51453(C6044.m17538("ts-thumbnail-local:" + Integer.toHexString(System.identityHashCode(abstractC22044)), new InterfaceC3806() { // from class: l.ܺ۬ۚ
                @Override // l.InterfaceC3806
                /* JADX INFO: renamed from: ۙ */
                public final InterfaceC1278 mo10127() throws IOException {
                    C6044 c6044 = c6044M17540;
                    C20585 c20586 = c20585;
                    try {
                        InterfaceC1278 interfaceC1278M17552 = c6044.m17552();
                        if (interfaceC1278M17552 != null) {
                            return new C6415(interfaceC1278M17552, c20586);
                        }
                        throw new IOException("Missing MPEG-TS thumbnail read handle");
                    } catch (IOException e) {
                        C20585.m47177(c20586);
                        throw new C12380(e);
                    }
                }
            }, true), i, new C17601()));
        } catch (IOException | RuntimeException e) {
            if (C20585.m47176(c20585)) {
                return C3431.f11123;
            }
            return m13350(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3431 m13349(final MediaDataSource mediaDataSource, int i) {
        C3431 c3431M13350;
        C3431 c3431M13351;
        try {
            final long size = mediaDataSource.getSize();
            if (size < 0) {
                return C3431.f11123;
            }
            final C20585 c20585 = new C20585();
            try {
                c3431M13351 = new C3431(C22823.m51453(C6044.m17538("ts-thumbnail:" + Integer.toHexString(System.identityHashCode(mediaDataSource)), new InterfaceC3806() { // from class: l.ܶ۬ۚ
                    @Override // l.InterfaceC3806
                    /* JADX INFO: renamed from: ۙ */
                    public final InterfaceC1278 mo10127() {
                        return new C24315(mediaDataSource, size, c20585);
                    }
                }, true), i, new C17601()));
            } catch (IOException | RuntimeException e) {
                if (C20585.m47176(c20585)) {
                    c3431M13351 = C3431.f11123;
                } else {
                    c3431M13351 = m13350(e);
                }
            }
            return c3431M13351;
        } catch (IOException unused) {
            c3431M13350 = C3431.f11123;
            return c3431M13350;
        } catch (RuntimeException e2) {
            c3431M13350 = m13350(e2);
            return c3431M13350;
        } finally {
            C20244.m46520(mediaDataSource);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3431 m13350(Exception exc) {
        if (!Thread.currentThread().isInterrupted()) {
            for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
                if (!(cause instanceof InterruptedIOException) && !(cause instanceof C12380)) {
                    int i = C22823.f73956;
                    if (!(cause instanceof C8455)) {
                        if (cause instanceof MediaCodec.CodecException) {
                            MediaCodec.CodecException codecException = (MediaCodec.CodecException) cause;
                            if (codecException.isTransient() || codecException.isRecoverable()) {
                            }
                        }
                    }
                }
            }
            return C3431.f11124;
        }
        return C3431.f11123;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m13359() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS thumbnail decode was canceled");
        }
    }
}
