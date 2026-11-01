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

/* JADX INFO: renamed from: l.ۘۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: F43P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3729 implements InterfaceC13464 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Set f13542 = EnumC19730.m44878();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f13543;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f13544;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f13545;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14770 f13546;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f13548;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20414 f13549;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Charset f13553;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f13547 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f13552 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f13551 = new HashMap();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0907 f13550 = new C0907();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20456 f13554 = new C20456();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized void m10921() {
        if (this.f13552 > 0) {
            this.f13547 = System.currentTimeMillis();
        }
    }

    public AbstractC3729(Charset charset) {
        this.f13553 = charset;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo10917(C12343 c12343) {
        this.f13549 = C20414.m46161(c12343);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f13546 = c14770M35395;
        this.f13543 = c14770M35395.m35397("procloader");
        C14770 c14770 = this.f13546;
        c14770.getClass();
        EnumC19730 enumC19730 = EnumC19730.f63399;
        boolean z = c14770.m35402(enumC19730, MotionUtils.EASING_TYPE_PATH) || ((c14770.m35408(EnumC19730.f63340) || c14770.m35402(enumC19730, ProviderConfigurationPermission.ALL_STR)) && c14770.m35409(enumC19730, "-path"));
        C20414 c20414 = this.f13549;
        C21369 c21369 = (C21369) c12343.m30655(C21369.class);
        if (c21369 == null) {
            c21369 = new C21369();
        }
        this.f13554.m46275(c20414, z, c21369);
        String strM35397 = this.f13546.m35397("fileManager.deferClose");
        if (strM35397 != null) {
            try {
                this.f13552 = (int) (Float.parseFloat(strM35397) * 1000.0f);
            } catch (NumberFormatException unused) {
                this.f13552 = 60000L;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m10920() {
        C20456 c20456 = this.f13554;
        c20456.getClass();
        return ((C3024) c20456.m46272(EnumC3584.PLATFORM_CLASS_PATH)).m9022();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m10911() {
        C20456 c20456 = this.f13554;
        c20456.getClass();
        return !((C16223) c20456.m46272(EnumC3584.SYSTEM_MODULES)).f31745;
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10918(Iterator it, String str) {
        C5141 c5141 = new C5141(this, this.f13549);
        EnumC19730 enumC19730M44860 = EnumC19730.m44860(str, f13542);
        if (enumC19730M44860 == null) {
            return false;
        }
        try {
            enumC19730M44860.m44882(c5141, str, it);
            return true;
        } catch (C21846 e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC4996
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo10912(String str) {
        EnumC19730 enumC19730M44860 = EnumC19730.m44860(str, f13542);
        if (enumC19730M44860 == null) {
            return -1;
        }
        return enumC19730M44860.mo18447() ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo10919(EnumC19730 enumC19730, String str) {
        int i = C22075.f71526[enumC19730.ordinal()];
        if (i == 1) {
            this.f13545 = str;
            return true;
        }
        C20456 c20456 = this.f13554;
        if (i == 2) {
            this.f13544 = str;
            c20456.m46274(str);
            return true;
        }
        AbstractC14107 abstractC14107 = (AbstractC14107) c20456.f66395.get(enumC19730);
        if (abstractC14107 == null) {
            return false;
        }
        return abstractC14107.mo4921(enumC19730, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10913() {
        String str = this.f13545;
        if (str != null) {
            return str;
        }
        if (this.f13548 == null) {
            this.f13548 = Charset.defaultCharset().name();
        }
        return this.f13548;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharBuffer m10915(ByteBuffer byteBuffer, boolean z) {
        Charset charsetForName;
        CodingErrorAction codingErrorAction;
        String strM10913 = m10913();
        Charset charset = this.f13553;
        if (charset == null) {
            try {
                charsetForName = Charset.forName(strM10913);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
                C20414 c20414 = this.f13549;
                C5909 c5909 = C23879.f77204;
                c20414.m48197(new C5909("compiler", "unsupported.encoding", strM10913));
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
                String strName = charset == null ? strM10913 : charset.name();
                C20414 c20415 = this.f13549;
                int iLimit = charBufferAllocate.limit();
                String string = sb.toString();
                C5909 c59010 = C23879.f77204;
                c20415.m48188(iLimit, new C5909("compiler", "illegal.char.for.encoding", string, strName));
                charBufferAllocate.position(charBufferAllocate.limit());
                charBufferAllocate.limit(charBufferAllocate.capacity());
                charBufferAllocate.put((char) 65533);
            } else {
                throw new AssertionError(coderResultDecode);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m10914(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable < 1024) {
            iAvailable = 1024;
        }
        ByteBuffer byteBufferM3623 = this.f13550.m3623(iAvailable);
        int i = 0;
        while (inputStream.available() != 0) {
            if (i >= iAvailable) {
                iAvailable <<= 1;
                byteBufferM3623 = ByteBuffer.allocate(iAvailable).put((ByteBuffer) byteBufferM3623.flip());
            }
            int i2 = inputStream.read(byteBufferM3623.array(), i, iAvailable - i);
            if (i2 < 0) {
                break;
            }
            i += i2;
            byteBufferM3623.position(i);
        }
        return (ByteBuffer) byteBufferM3623.flip();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10916(ByteBuffer byteBuffer) {
        this.f13550.m3624(byteBuffer);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC11347 m10910(String str) {
        EnumC11347 enumC11347 = EnumC11347.CLASS;
        if (str.endsWith(enumC11347.f38286)) {
            return enumC11347;
        }
        EnumC11347 enumC11348 = EnumC11347.SOURCE;
        if (str.endsWith(enumC11348.f38286)) {
            return enumC11348;
        }
        EnumC11347 enumC11349 = EnumC11347.HTML;
        return str.endsWith(enumC11349.f38286) ? enumC11349 : EnumC11347.OTHER;
    }
}
