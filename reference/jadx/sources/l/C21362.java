package l;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩶ܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAYS */
/* JADX INFO: loaded from: classes5.dex */
public class C21362 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String[] f68037;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C12587 f68039;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f68040;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC19805 f68041;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f68042;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f68043;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f68044;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f68045;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f68046;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f68047;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Writer f68048;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f68049;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f68036 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String[] f68038 = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            f68038[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f68038;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f68037 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C21362(Writer writer) {
        int[] iArr = new int[32];
        this.f68040 = iArr;
        this.f68044 = 0;
        if (iArr.length == 0) {
            this.f68040 = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f68040;
        int i = this.f68044;
        this.f68044 = i + 1;
        iArr2[i] = 6;
        this.f68041 = EnumC19805.LEGACY_STRICT;
        this.f68045 = true;
        C17359.requireNonNull(writer, "out == null");
        this.f68048 = writer;
        m48590(C12587.f40411);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48590(C12587 c12587) {
        C17359.requireNonNull(c12587);
        this.f68039 = c12587;
        this.f68047 = ",";
        if (c12587.m31299()) {
            this.f68049 = ": ";
            if (this.f68039.m31300().isEmpty()) {
                this.f68047 = ", ";
            }
        } else {
            this.f68049 = ":";
        }
        this.f68043 = this.f68039.m31300().isEmpty() && this.f68039.m31297().isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48591(EnumC19805 enumC19805) {
        C17359.requireNonNull(enumC19805);
        this.f68041 = enumC19805;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC19805 m48593() {
        return this.f68041;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48592(boolean z) {
        this.f68042 = z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m48599() {
        return this.f68042;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48603(boolean z) {
        this.f68045 = z;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m48596() {
        return this.f68045;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48585() throws IOException {
        m48580();
        m48584();
        int i = this.f68044;
        int[] iArr = this.f68040;
        if (i == iArr.length) {
            this.f68040 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f68040;
        int i2 = this.f68044;
        this.f68044 = i2 + 1;
        iArr2[i2] = 1;
        this.f68048.write(91);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m48594() throws IOException {
        m48581(']', 1, 2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m48600() throws IOException {
        m48580();
        m48584();
        int i = this.f68044;
        int[] iArr = this.f68040;
        if (i == iArr.length) {
            this.f68040 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f68040;
        int i2 = this.f68044;
        this.f68044 = i2 + 1;
        iArr2[i2] = 3;
        this.f68048.write(123);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m48597() throws IOException {
        m48581('}', 3, 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48581(char c, int i, int i2) throws IOException {
        int iM48582 = m48582();
        if (iM48582 != i2 && iM48582 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f68046 != null) {
            throw new IllegalStateException("Dangling name: " + this.f68046);
        }
        this.f68044--;
        if (iM48582 == i2) {
            m48579();
        }
        this.f68048.write(c);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private int m48582() {
        int i = this.f68044;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f68040[i - 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48589(String str) {
        C17359.requireNonNull(str, "name == null");
        if (this.f68046 != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM48582 = m48582();
        if (iM48582 != 3 && iM48582 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f68046 = str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m48580() throws IOException {
        if (this.f68046 != null) {
            int iM48582 = m48582();
            if (iM48582 == 5) {
                this.f68048.write(this.f68047);
            } else if (iM48582 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m48579();
            this.f68040[this.f68044 - 1] = 4;
            m48583(this.f68046);
            this.f68046 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m48602(String str) throws IOException {
        if (str == null) {
            m48598();
            return;
        }
        m48580();
        m48584();
        m48583(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m48595(boolean z) throws IOException {
        m48580();
        m48584();
        this.f68048.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48587(Boolean bool) throws IOException {
        if (bool == null) {
            m48598();
            return;
        }
        m48580();
        m48584();
        this.f68048.write(bool.booleanValue() ? "true" : "false");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48586(double d) throws IOException {
        m48580();
        if (this.f68041 != EnumC19805.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m48584();
        this.f68048.append((CharSequence) Double.toString(d));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m48601(long j) throws IOException {
        m48580();
        m48584();
        this.f68048.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48588(Number number) throws IOException {
        if (number == null) {
            m48598();
            return;
        }
        m48580();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f68041 != EnumC19805.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f68036.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m48584();
        this.f68048.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C21362 m48598() {
        if (this.f68046 != null) {
            if (this.f68045) {
                m48580();
            } else {
                this.f68046 = null;
                return this;
            }
        }
        m48584();
        this.f68048.write("null");
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f68044 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f68048.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f68048.close();
        int i = this.f68044;
        if (i > 1 || (i == 1 && this.f68040[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f68044 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m48583(String str) throws IOException {
        String str2;
        String[] strArr = this.f68042 ? f68037 : f68038;
        Writer writer = this.f68048;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m48579() throws IOException {
        if (this.f68043) {
            return;
        }
        String strM31300 = this.f68039.m31300();
        Writer writer = this.f68048;
        writer.write(strM31300);
        int i = this.f68044;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f68039.m31297());
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m48584() throws IOException {
        int iM48582 = m48582();
        if (iM48582 == 1) {
            this.f68040[this.f68044 - 1] = 2;
            m48579();
            return;
        }
        Writer writer = this.f68048;
        if (iM48582 == 2) {
            writer.append((CharSequence) this.f68047);
            m48579();
        } else {
            if (iM48582 != 4) {
                if (iM48582 != 6) {
                    if (iM48582 == 7) {
                        if (this.f68041 != EnumC19805.LENIENT) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                this.f68040[this.f68044 - 1] = 7;
                return;
            }
            writer.append((CharSequence) this.f68049);
            this.f68040[this.f68044 - 1] = 5;
        }
    }
}
