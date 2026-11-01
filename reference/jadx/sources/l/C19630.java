package l;

import com.alipay.sdk.m.w.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: l.᩵ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19630 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f63006;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63007;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f63008;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public CharacterCodingException f63009;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f63010;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f63011;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f63012;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InputStream f63013;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f63014;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f63015;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f63016;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharBuffer f63017;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f63018;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f63006) {
            return;
        }
        this.f63006 = true;
        this.f63013.close();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #1 {all -> 0x00b3, blocks: (B:18:0x0057, B:21:0x005e, B:25:0x0071, B:28:0x0079, B:29:0x007e, B:30:0x007f, B:31:0x0082, B:32:0x0087, B:33:0x0088), top: B:42:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #1 {all -> 0x00b3, blocks: (B:18:0x0057, B:21:0x005e, B:25:0x0071, B:28:0x0079, B:29:0x007e, B:30:0x007f, B:31:0x0082, B:32:0x0087, B:33:0x0088), top: B:42:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x007f A[SYNTHETIC] */
    public C19630(AbstractC20745 abstractC20745, C5518 c5518, long j, C10458 c10458) throws InterruptedIOException {
        InputStream inputStreamMo33970;
        C9047 c9047M26420;
        byte[] bArr;
        long j2;
        InputStream c18218;
        int i;
        Charset charset = c5518.f18938;
        this.f63014 = ByteBuffer.allocate(8192);
        this.f63017 = CharBuffer.allocate(2);
        this.f63007 = -1;
        m44732();
        if (j > 0) {
            C9047 c9047M26421 = null;
            try {
                C1388 c1388M46710 = abstractC20745.m46710("r");
                c9047M26421 = c10458.m26420(c1388M46710);
                c1388M46710.seek(j);
                c18218 = new C21746(c1388M46710, c9047M26421);
            } catch (IOException | UnsupportedOperationException unused) {
                if (c9047M26421 != null) {
                    try {
                        c9047M26421.close();
                    } catch (IOException unused2) {
                    }
                }
                if (c10458.m26422()) {
                    throw new InterruptedIOException("Text search canceled.");
                }
                m44732();
                inputStreamMo33970 = abstractC20745.mo33970();
                c9047M26420 = c10458.m26420(inputStreamMo33970);
                try {
                    bArr = new byte[8192];
                    j2 = j;
                    while (j2 > 0) {
                        m44732();
                        i = inputStreamMo33970.read(bArr, 0, (int) Math.min(j2, 8192));
                        if (i >= 0) {
                            throw new IOException("File ended before the search checkpoint.");
                        }
                        if (i != 0) {
                            if (inputStreamMo33970.read() >= 0) {
                                throw new IOException("File ended before the search checkpoint.");
                            }
                            i = 1;
                        }
                        j2 -= (long) i;
                    }
                    c18218 = new C18218(inputStreamMo33970, c9047M26420);
                } catch (Throwable th) {
                    try {
                        c9047M26420.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            }
        } else {
            inputStreamMo33970 = abstractC20745.mo33970();
            c9047M26420 = c10458.m26420(inputStreamMo33970);
            bArr = new byte[8192];
            j2 = j;
            while (j2 > 0) {
                m44732();
                i = inputStreamMo33970.read(bArr, 0, (int) Math.min(j2, 8192));
                if (i >= 0) {
                    throw new IOException("File ended before the search checkpoint.");
                }
                if (i != 0) {
                    if (inputStreamMo33970.read() >= 0) {
                        throw new IOException("File ended before the search checkpoint.");
                    }
                    i = 1;
                }
                j2 -= (long) i;
            }
            c18218 = new C18218(inputStreamMo33970, c9047M26420);
        }
        this.f63013 = c18218;
        this.f63015 = j;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.f63012 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.f63008 = charset.name().equalsIgnoreCase(a.D);
        this.f63014.limit(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44732() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Text search canceled.");
        }
    }

    public final long position() {
        return this.f63007 >= 0 ? this.f63010 : this.f63015;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m44733() throws IOException {
        int i = this.f63007;
        if (i >= 0) {
            this.f63007 = -1;
            return i;
        }
        CharacterCodingException characterCodingException = this.f63009;
        if (characterCodingException != null) {
            throw characterCodingException;
        }
        while (true) {
            if (this.f63008 && this.f63014.hasRemaining()) {
                ByteBuffer byteBuffer = this.f63014;
                if (byteBuffer.get(byteBuffer.position()) >= 0) {
                    this.f63015++;
                    return this.f63014.get();
                }
            }
            this.f63017.clear().limit(1);
            if (!this.f63018) {
                int iPosition = this.f63014.position();
                CoderResult coderResultFlush = this.f63016 ? this.f63012.flush(this.f63017) : this.f63012.decode(this.f63014, this.f63017, this.f63011);
                if (coderResultFlush.isOverflow() && (this.f63017.position() == 0 || (this.f63017.position() == 1 && Character.isHighSurrogate(this.f63017.get(0))))) {
                    this.f63017.limit(2);
                    coderResultFlush = this.f63016 ? this.f63012.flush(this.f63017) : this.f63012.decode(this.f63014, this.f63017, this.f63011);
                }
                this.f63015 += (long) (this.f63014.position() - iPosition);
                if (coderResultFlush.isError()) {
                    try {
                        coderResultFlush.throwException();
                    } catch (CharacterCodingException e) {
                        if (this.f63017.position() == 0) {
                            throw e;
                        }
                        this.f63009 = e;
                    }
                }
                if (this.f63011 && coderResultFlush.isUnderflow()) {
                    if (this.f63016) {
                        this.f63018 = true;
                    }
                    this.f63016 = true;
                }
                if (this.f63017.position() > 0) {
                    char c = this.f63017.get(0);
                    if (this.f63017.position() == 2 && Character.isSurrogatePair(c, this.f63017.get(1))) {
                        return Character.toCodePoint(c, this.f63017.get(1));
                    }
                    if (this.f63017.position() != 1 || Character.isSurrogate(c)) {
                        throw new CharacterCodingException();
                    }
                    return c;
                }
                if (!this.f63011) {
                    m44732();
                    if (this.f63006) {
                        throw new IOException("Text search reader is closed.");
                    }
                    this.f63014.compact();
                    int i2 = this.f63013.read(this.f63014.array(), this.f63014.position(), this.f63014.remaining());
                    if (i2 < 0) {
                        this.f63011 = true;
                    } else if (i2 == 0) {
                        int i3 = this.f63013.read();
                        if (i3 < 0) {
                            this.f63011 = true;
                        } else {
                            this.f63014.put((byte) i3);
                        }
                    } else {
                        ByteBuffer byteBuffer2 = this.f63014;
                        byteBuffer2.position(byteBuffer2.position() + i2);
                    }
                    this.f63014.flip();
                } else if (this.f63018) {
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18924 m44734(long j) throws IOException {
        int length;
        m44732();
        if (this.f63006) {
            throw new IOException("Text search reader is closed.");
        }
        long jPosition = position();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int iM44733 = m44733();
            if (iM44733 < 0) {
                if (sb.length() != 0) {
                    length = sb.length();
                    break;
                }
                return null;
            }
            if (iM44733 == 13 || iM44733 == 10) {
                int length2 = sb.length();
                sb.append((char) iM44733);
                if (iM44733 == 13) {
                    long j2 = this.f63015;
                    try {
                        int iM44734 = m44733();
                        if (iM44734 == 10) {
                            sb.append('\n');
                        } else if (iM44734 >= 0) {
                            this.f63007 = iM44734;
                            this.f63010 = j2;
                        }
                    } catch (CharacterCodingException e) {
                        this.f63009 = e;
                        this.f63015 = j2;
                    }
                }
                length = length2;
                break;
            }
            if (Character.charCount(iM44733) + sb.length() > 1048576) {
                throw new C8341();
            }
            sb.appendCodePoint(iM44733);
            if ((sb.length() & 4095) == 0) {
                m44732();
            }
        }
        if (position() > 9007199254740991L) {
            throw new IOException("Text search offset exceeds the supported JSON integer range.");
        }
        return new C18924(j, jPosition, position(), sb.toString(), length, 0L);
    }
}
