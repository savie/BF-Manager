package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.᩺᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24643 implements InterfaceC16722 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Set f79773 = EnumC7687.m20941();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7312 f79776;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C13015 f79777;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f79778;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f79779;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f79781;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f79783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Charset f79785;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f79775 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f79784 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f79774 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12708 f79782 = new C12708();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C22185 f79780 = new C22185();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m54980() {
        if (this.f79784 > 0) {
            this.f79775 = System.currentTimeMillis();
        }
    }

    public AbstractC24643(Charset charset) {
        this.f79785 = charset;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo6985(C4747 c4747) {
        this.f79776 = C7312.m20023(c4747);
        C13015 c13015M32421 = C13015.m32421(c4747);
        this.f79777 = c13015M32421;
        this.f79783 = c13015M32421.m32422("procloader");
        C13015 c13015 = this.f79777;
        c13015.getClass();
        EnumC7687 enumC7687 = EnumC7687.f25329;
        boolean z = c13015.m32427(enumC7687, MotionUtils.EASING_TYPE_PATH) || ((c13015.m32433(EnumC7687.f25345) || c13015.m32427(enumC7687, ProviderConfigurationPermission.ALL_STR)) && c13015.m32434(enumC7687, "-path"));
        C7312 c7312 = this.f79776;
        C0776 c0776 = (C0776) c4747.m14642(C0776.class);
        if (c0776 == null) {
            c0776 = new C0776();
        }
        this.f79780.m50197(c7312, z, c0776);
        String strM32422 = this.f79777.m32422("fileManager.deferClose");
        if (strM32422 != null) {
            try {
                this.f79784 = (int) (Float.parseFloat(strM32422) * 1000.0f);
            } catch (NumberFormatException unused) {
                this.f79784 = 60000L;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54981() {
        C22185 c22185 = this.f79780;
        c22185.getClass();
        return ((C17687) c22185.m50193(EnumC6282.PLATFORM_CLASS_PATH)).m41392();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54979() {
        C22185 c22185 = this.f79780;
        c22185.getClass();
        return !((C5031) c22185.m50193(EnumC6282.SYSTEM_MODULES)).f55346;
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo26605(Iterator it, String str) {
        C3759 c3759 = new C3759(this, this.f79776);
        EnumC7687 enumC7687M20931 = EnumC7687.m20931(str, f79773);
        if (enumC7687M20931 == null) {
            return false;
        }
        try {
            enumC7687M20931.m20954(c3759, str, it);
            return true;
        } catch (C14398 e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC23436
    /* JADX INFO: renamed from: ۙ */
    public final int mo26603(String str) {
        EnumC7687 enumC7687M20931 = EnumC7687.m20931(str, f79773);
        if (enumC7687M20931 == null) {
            return -1;
        }
        return enumC7687M20931.mo18110() ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6987(EnumC7687 enumC7687, String str) {
        int i = C20913.f66933[enumC7687.ordinal()];
        if (i == 1) {
            this.f79781 = str;
            return true;
        }
        C22185 c22185 = this.f79780;
        if (i == 2) {
            this.f79779 = str;
            c22185.m50196(str);
            return true;
        }
        AbstractC23655 abstractC23655 = (AbstractC23655) c22185.f71483.get(enumC7687);
        if (abstractC23655 == null) {
            return false;
        }
        return abstractC23655.mo4671(enumC7687, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54975() {
        String str = this.f79781;
        if (str != null) {
            return str;
        }
        if (this.f79778 == null) {
            this.f79778 = Charset.defaultCharset().name();
        }
        return this.f79778;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharBuffer m54977(ByteBuffer byteBuffer, boolean z) {
        Charset charsetForName;
        CodingErrorAction codingErrorAction;
        String strM54975 = m54975();
        Charset charset = this.f79785;
        if (charset == null) {
            try {
                charsetForName = Charset.forName(strM54975);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
                C7312 c7312 = this.f79776;
                C11040 c11040 = C22843.f74058;
                c7312.m34525(new C11040("compiler", "unsupported.encoding", strM54975));
                return (CharBuffer) CharBuffer.allocate(1).flip();
            }
        } else {
            charsetForName = charset;
        }
        CharsetDecoder charsetDecoderNewDecoder = charsetForName.newDecoder();
        if (z) {
            codingErrorAction = CodingErrorAction.REPLACE;
        } else {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(((int) (byteBuffer.remaining() * ((charsetDecoderOnUnmappableCharacter.maxCharsPerByte() * 0.2f) + (charsetDecoderOnUnmappableCharacter.averageCharsPerByte() * 0.8f)))) + 10);
        while (true) {
            CoderResult coderResultDecode = charsetDecoderOnUnmappableCharacter.decode(byteBuffer, charBufferAllocate, true);
            charBufferAllocate.flip();
            if (coderResultDecode.isUnderflow()) {
                if (charBufferAllocate.limit() != charBufferAllocate.capacity()) {
                    return charBufferAllocate;
                }
                CharBuffer charBufferPut = CharBuffer.allocate(charBufferAllocate.capacity() + 1).put(charBufferAllocate);
                charBufferPut.flip();
                return charBufferPut;
            }
            if (coderResultDecode.isOverflow()) {
                charBufferAllocate = CharBuffer.allocate(charBufferAllocate.capacity() + 10 + ((int) (charsetDecoderOnUnmappableCharacter.maxCharsPerByte() * byteBuffer.remaining()))).put(charBufferAllocate);
            } else if (coderResultDecode.isMalformed() || coderResultDecode.isUnmappable()) {
                StringBuilder sb = new StringBuilder();
                int length = coderResultDecode.length();
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02X", Byte.valueOf(byteBuffer.get())));
                }
                String strName = charset == null ? strM54975 : charset.name();
                C7312 c7313 = this.f79776;
                int iLimit = charBufferAllocate.limit();
                String string = sb.toString();
                C11040 c11041 = C22843.f74058;
                c7313.m34517(iLimit, new C11040("compiler", "illegal.char.for.encoding", string, strName));
                charBufferAllocate.position(charBufferAllocate.limit());
                charBufferAllocate.limit(charBufferAllocate.capacity());
                charBufferAllocate.put((char) 65533);
            } else {
                throw new AssertionError(coderResultDecode);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m54976(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable < 1024) {
            iAvailable = 1024;
        }
        ByteBuffer byteBufferM31496 = this.f79782.m31496(iAvailable);
        int i = 0;
        while (inputStream.available() != 0) {
            if (i >= iAvailable) {
                iAvailable <<= 1;
                byteBufferM31496 = ByteBuffer.allocate(iAvailable).put((ByteBuffer) byteBufferM31496.flip());
            }
            int i2 = inputStream.read(byteBufferM31496.array(), i, iAvailable - i);
            if (i2 < 0) {
                break;
            }
            i += i2;
            byteBufferM31496.position(i);
        }
        return (ByteBuffer) byteBufferM31496.flip();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54978(ByteBuffer byteBuffer) {
        this.f79782.m31497(byteBuffer);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC17468 m54974(String str) {
        EnumC17468 enumC17468 = EnumC17468.CLASS;
        if (str.endsWith(enumC17468.f56797)) {
            return enumC17468;
        }
        EnumC17468 enumC17469 = EnumC17468.SOURCE;
        if (str.endsWith(enumC17469.f56797)) {
            return enumC17469;
        }
        EnumC17468 enumC174610 = EnumC17468.HTML;
        return str.endsWith(enumC174610.f56797) ? enumC174610 : EnumC17468.OTHER;
    }
}
