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

/* JADX INFO: renamed from: l.᩹֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23176 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f75093;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f75094;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InputStream f75095;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f75096;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f75097;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f75098;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f75099;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharacterCodingException f75100;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f75101;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f75102;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f75103;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f75104;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharBuffer f75105;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f75103) {
            return;
        }
        this.f75103 = true;
        this.f75095.close();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #1 {all -> 0x00b3, blocks: (B:18:0x0057, B:21:0x005e, B:25:0x0071, B:28:0x0079, B:29:0x007e, B:30:0x007f, B:31:0x0082, B:32:0x0087, B:33:0x0088), top: B:42:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #1 {all -> 0x00b3, blocks: (B:18:0x0057, B:21:0x005e, B:25:0x0071, B:28:0x0079, B:29:0x007e, B:30:0x007f, B:31:0x0082, B:32:0x0087, B:33:0x0088), top: B:42:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x007f A[SYNTHETIC] */
    public C23176(AbstractC22044 abstractC22044, C10495 c10495, long j, C20192 c20192) throws InterruptedIOException {
        InputStream inputStreamMo4290;
        C3038 c3038M46434;
        byte[] bArr;
        long j2;
        InputStream c16462;
        int i;
        Charset charset = c10495.f33393;
        this.f75102 = ByteBuffer.allocate(8192);
        this.f75105 = CharBuffer.allocate(2);
        this.f75098 = -1;
        m52093();
        if (j > 0) {
            C3038 c3038M46435 = null;
            try {
                C13961 c13961M49855 = abstractC22044.m49855("r");
                c3038M46435 = c20192.m46434(c13961M49855);
                c13961M49855.seek(j);
                c16462 = new C24668(c13961M49855, c3038M46435);
            } catch (IOException | UnsupportedOperationException unused) {
                if (c3038M46435 != null) {
                    try {
                        c3038M46435.close();
                    } catch (IOException unused2) {
                    }
                }
                if (c20192.m46436()) {
                    throw new InterruptedIOException("Text search canceled.");
                }
                m52093();
                inputStreamMo4290 = abstractC22044.mo4290();
                c3038M46434 = c20192.m46434(inputStreamMo4290);
                try {
                    bArr = new byte[8192];
                    j2 = j;
                    while (j2 > 0) {
                        m52093();
                        i = inputStreamMo4290.read(bArr, 0, (int) Math.min(j2, 8192));
                        if (i >= 0) {
                            throw new IOException("File ended before the search checkpoint.");
                        }
                        if (i != 0) {
                            if (inputStreamMo4290.read() >= 0) {
                                throw new IOException("File ended before the search checkpoint.");
                            }
                            i = 1;
                        }
                        j2 -= (long) i;
                    }
                    c16462 = new C16462(inputStreamMo4290, c3038M46434);
                } catch (Throwable th) {
                    try {
                        c3038M46434.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            }
        } else {
            inputStreamMo4290 = abstractC22044.mo4290();
            c3038M46434 = c20192.m46434(inputStreamMo4290);
            bArr = new byte[8192];
            j2 = j;
            while (j2 > 0) {
                m52093();
                i = inputStreamMo4290.read(bArr, 0, (int) Math.min(j2, 8192));
                if (i >= 0) {
                    throw new IOException("File ended before the search checkpoint.");
                }
                if (i != 0) {
                    if (inputStreamMo4290.read() >= 0) {
                        throw new IOException("File ended before the search checkpoint.");
                    }
                    i = 1;
                }
                j2 -= (long) i;
            }
            c16462 = new C16462(inputStreamMo4290, c3038M46434);
        }
        this.f75095 = c16462;
        this.f75093 = j;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.f75097 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.f75101 = charset.name().equalsIgnoreCase(a.D);
        this.f75102.limit(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52093() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Text search canceled.");
        }
    }

    public final long position() {
        return this.f75098 >= 0 ? this.f75096 : this.f75093;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m52094() throws IOException {
        int i = this.f75098;
        if (i >= 0) {
            this.f75098 = -1;
            return i;
        }
        CharacterCodingException characterCodingException = this.f75100;
        if (characterCodingException != null) {
            throw characterCodingException;
        }
        while (true) {
            if (this.f75101 && this.f75102.hasRemaining()) {
                ByteBuffer byteBuffer = this.f75102;
                if (byteBuffer.get(byteBuffer.position()) >= 0) {
                    this.f75093++;
                    return this.f75102.get();
                }
            }
            this.f75105.clear().limit(1);
            if (!this.f75099) {
                int iPosition = this.f75102.position();
                CoderResult coderResultFlush = this.f75104 ? this.f75097.flush(this.f75105) : this.f75097.decode(this.f75102, this.f75105, this.f75094);
                if (coderResultFlush.isOverflow() && (this.f75105.position() == 0 || (this.f75105.position() == 1 && Character.isHighSurrogate(this.f75105.get(0))))) {
                    this.f75105.limit(2);
                    coderResultFlush = this.f75104 ? this.f75097.flush(this.f75105) : this.f75097.decode(this.f75102, this.f75105, this.f75094);
                }
                this.f75093 += (long) (this.f75102.position() - iPosition);
                if (coderResultFlush.isError()) {
                    try {
                        coderResultFlush.throwException();
                    } catch (CharacterCodingException e) {
                        if (this.f75105.position() == 0) {
                            throw e;
                        }
                        this.f75100 = e;
                    }
                }
                if (this.f75094 && coderResultFlush.isUnderflow()) {
                    if (this.f75104) {
                        this.f75099 = true;
                    }
                    this.f75104 = true;
                }
                if (this.f75105.position() > 0) {
                    char c = this.f75105.get(0);
                    if (this.f75105.position() == 2 && Character.isSurrogatePair(c, this.f75105.get(1))) {
                        return Character.toCodePoint(c, this.f75105.get(1));
                    }
                    if (this.f75105.position() != 1 || Character.isSurrogate(c)) {
                        throw new CharacterCodingException();
                    }
                    return c;
                }
                if (!this.f75094) {
                    m52093();
                    if (this.f75103) {
                        throw new IOException("Text search reader is closed.");
                    }
                    this.f75102.compact();
                    int i2 = this.f75095.read(this.f75102.array(), this.f75102.position(), this.f75102.remaining());
                    if (i2 < 0) {
                        this.f75094 = true;
                    } else if (i2 == 0) {
                        int i3 = this.f75095.read();
                        if (i3 < 0) {
                            this.f75094 = true;
                        } else {
                            this.f75102.put((byte) i3);
                        }
                    } else {
                        ByteBuffer byteBuffer2 = this.f75102;
                        byteBuffer2.position(byteBuffer2.position() + i2);
                    }
                    this.f75102.flip();
                } else if (this.f75099) {
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17208 m52095(long j) throws IOException {
        int length;
        m52093();
        if (this.f75103) {
            throw new IOException("Text search reader is closed.");
        }
        long jPosition = position();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int iM52094 = m52094();
            if (iM52094 < 0) {
                if (sb.length() != 0) {
                    length = sb.length();
                    break;
                }
                return null;
            }
            if (iM52094 == 13 || iM52094 == 10) {
                int length2 = sb.length();
                sb.append((char) iM52094);
                if (iM52094 == 13) {
                    long j2 = this.f75093;
                    try {
                        int iM52095 = m52094();
                        if (iM52095 == 10) {
                            sb.append('\n');
                        } else if (iM52095 >= 0) {
                            this.f75098 = iM52095;
                            this.f75096 = j2;
                        }
                    } catch (CharacterCodingException e) {
                        this.f75100 = e;
                        this.f75093 = j2;
                    }
                }
                length = length2;
                break;
            }
            if (Character.charCount(iM52094) + sb.length() > 1048576) {
                throw new C15716();
            }
            sb.appendCodePoint(iM52094);
            if ((sb.length() & 4095) == 0) {
                m52093();
            }
        }
        if (position() > 9007199254740991L) {
            throw new IOException("Text search offset exceeds the supported JSON integer range.");
        }
        return new C17208(j, jPosition, position(), sb.toString(), length, 0L);
    }
}
