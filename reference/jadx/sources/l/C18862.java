package l;

import android.media.MediaCodec;
import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ᩴܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes4.dex */
public final class C18862 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10157 f61091 = new C10157(500);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f61092 = Long.toHexString(System.currentTimeMillis()) + Long.toHexString(System.nanoTime());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43511(long j, String str) {
        return C6265.m17337(str) && j >= 48128 && j % 188 == 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m43514(String str) {
        return C6265.m17337(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4044 m43504(String str) {
        EnumC4044 enumC4044;
        C10157 c10157 = f61091;
        synchronized (c10157) {
            enumC4044 = (EnumC4044) c10157.m25800(str);
        }
        return enumC4044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43510(String str, EnumC4044 enumC4044) {
        C10157 c10157 = f61091;
        synchronized (c10157) {
            c10157.m25801(str, enumC4044);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43501(String str, InterfaceC2557 interfaceC2557, long j) {
        if (j > 0) {
            return str;
        }
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(f61092);
        sbM23356.append(System.identityHashCode(interfaceC2557));
        return C22253.m49423(sbM23356.toString()).toLowerCase();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4044 m43503(InputStream inputStream) throws IOException {
        m43512();
        byte[] bArr = new byte[940];
        C20010.m45306(inputStream, bArr, 940);
        m43512();
        return m43505(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4044 m43502(MediaDataSource mediaDataSource) throws IOException {
        byte[] bArr = new byte[940];
        int i = 0;
        while (i < 940) {
            m43512();
            int at = mediaDataSource.readAt(i, bArr, i, 940 - i);
            if (at <= 0) {
                throw new EOFException("Unexpected end of MPEG-TS probe source");
            }
            i += at;
        }
        return m43505(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4044 m43505(byte[] bArr) {
        for (int i = 0; i < 188; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                if ((bArr[(i2 * 188) + i] & 255) != 71) {
                }
            }
            return EnumC4044.MPEG_TS;
        }
        return EnumC4044.NOT_MPEG_TS;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6867 m43508(AbstractC20745 abstractC20745, int i) {
        final C23096 c23096 = new C23096();
        final C6265 c6265M17336 = C6265.m17336(abstractC20745, true);
        try {
            return new C6867(C2073.m6583(C6265.m17334("ts-thumbnail-local:" + Integer.toHexString(System.identityHashCode(abstractC20745)), new InterfaceC23905() { // from class: l.᩹ܺ۬
                @Override // l.InterfaceC23905
                /* JADX INFO: renamed from: ۙ */
                public final InterfaceC3153 mo32704() throws IOException {
                    C6265 c6265 = c6265M17336;
                    C23096 c23097 = c23096;
                    try {
                        InterfaceC3153 interfaceC3153M17348 = c6265.m17348();
                        if (interfaceC3153M17348 != null) {
                            return new C21684(interfaceC3153M17348, c23097);
                        }
                        throw new IOException("Missing MPEG-TS thumbnail read handle");
                    } catch (IOException e) {
                        C23096.m51104(c23097);
                        throw new C15335(e);
                    }
                }
            }, true), i, new C1222()));
        } catch (IOException | RuntimeException e) {
            if (C23096.m51103(c23096)) {
                return C6867.f23157;
            }
            return m43507(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6867 m43506(final MediaDataSource mediaDataSource, int i) {
        C6867 c6867M43507;
        C6867 c6867M43508;
        try {
            final long size = mediaDataSource.getSize();
            if (size < 0) {
                return C6867.f23157;
            }
            final C23096 c23096 = new C23096();
            try {
                c6867M43508 = new C6867(C2073.m6583(C6265.m17334("ts-thumbnail:" + Integer.toHexString(System.identityHashCode(mediaDataSource)), new InterfaceC23905() { // from class: l.۬ܺ۬
                    @Override // l.InterfaceC23905
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final InterfaceC3153 mo32704() {
                        return new C18156(mediaDataSource, size, c23096);
                    }
                }, true), i, new C1222()));
            } catch (IOException | RuntimeException e) {
                if (C23096.m51103(c23096)) {
                    c6867M43508 = C6867.f23157;
                } else {
                    c6867M43508 = m43507(e);
                }
            }
            return c6867M43508;
        } catch (IOException unused) {
            c6867M43507 = C6867.f23157;
            return c6867M43507;
        } catch (RuntimeException e2) {
            c6867M43507 = m43507(e2);
            return c6867M43507;
        } finally {
            C19431.m44468(mediaDataSource);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6867 m43507(Exception exc) {
        if (!Thread.currentThread().isInterrupted()) {
            for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
                if (!(cause instanceof InterruptedIOException) && !(cause instanceof C15335)) {
                    int i = C2073.f7669;
                    if (!(cause instanceof C12658)) {
                        if (cause instanceof MediaCodec.CodecException) {
                            MediaCodec.CodecException codecException = (MediaCodec.CodecException) cause;
                            if (codecException.isTransient() || codecException.isRecoverable()) {
                            }
                        }
                    }
                }
            }
            return C6867.f23156;
        }
        return C6867.f23157;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m43512() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS thumbnail decode was canceled");
        }
    }
}
