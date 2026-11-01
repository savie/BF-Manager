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

/* JADX INFO: renamed from: l.֨۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAYS */
/* JADX INFO: loaded from: classes2.dex */
public class C1145 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f5141;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f5142;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f5143;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f5144;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f5145;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f5146;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC14948 f5147;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f5148;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15923 f5149;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Writer f5150;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f5151;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f5152;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f5140 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String[] f5139 = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            f5139[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f5139;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f5141 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C1145(Writer writer) {
        int[] iArr = new int[32];
        this.f5145 = iArr;
        this.f5152 = 0;
        if (iArr.length == 0) {
            this.f5145 = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f5145;
        int i = this.f5152;
        this.f5152 = i + 1;
        iArr2[i] = 6;
        this.f5147 = EnumC14948.LEGACY_STRICT;
        this.f5144 = true;
        C13638.requireNonNull(writer, "out == null");
        this.f5150 = writer;
        m4206(C15923.f51599);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4206(C15923 c15923) {
        C13638.requireNonNull(c15923);
        this.f5149 = c15923;
        this.f5142 = ",";
        if (c15923.m37887()) {
            this.f5151 = ": ";
            if (this.f5149.m37888().isEmpty()) {
                this.f5142 = ", ";
            }
        } else {
            this.f5151 = ":";
        }
        this.f5143 = this.f5149.m37888().isEmpty() && this.f5149.m37885().isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4205(EnumC14948 enumC14948) {
        C13638.requireNonNull(enumC14948);
        this.f5147 = enumC14948;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC14948 m4210() {
        return this.f5147;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4207(boolean z) {
        this.f5146 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m4215() {
        return this.f5146;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m4213(boolean z) {
        this.f5144 = z;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m4198() {
        return this.f5144;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m4200() throws IOException {
        m4197();
        m4195();
        int i = this.f5152;
        int[] iArr = this.f5145;
        if (i == iArr.length) {
            this.f5145 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f5145;
        int i2 = this.f5152;
        this.f5152 = i2 + 1;
        iArr2[i2] = 1;
        this.f5150.write(91);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m4199() throws IOException {
        m4193(']', 1, 2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m4208() throws IOException {
        m4197();
        m4195();
        int i = this.f5152;
        int[] iArr = this.f5145;
        if (i == iArr.length) {
            this.f5145 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f5145;
        int i2 = this.f5152;
        this.f5152 = i2 + 1;
        iArr2[i2] = 3;
        this.f5150.write(123);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m4216() throws IOException {
        m4193('}', 3, 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4193(char c, int i, int i2) throws IOException {
        int iM4196 = m4196();
        if (iM4196 != i2 && iM4196 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f5148 != null) {
            throw new IllegalStateException("Dangling name: " + this.f5148);
        }
        this.f5152--;
        if (iM4196 == i2) {
            m4194();
        }
        this.f5150.write(c);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private int m4196() {
        int i = this.f5152;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f5145[i - 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m4204(String str) {
        C13638.requireNonNull(str, "name == null");
        if (this.f5148 != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM4196 = m4196();
        if (iM4196 != 3 && iM4196 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f5148 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m4197() throws IOException {
        if (this.f5148 != null) {
            int iM4196 = m4196();
            if (iM4196 == 5) {
                this.f5150.write(this.f5142);
            } else if (iM4196 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m4194();
            this.f5145[this.f5152 - 1] = 4;
            m4192(this.f5148);
            this.f5148 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m4212(String str) throws IOException {
        if (str == null) {
            m4214();
            return;
        }
        m4197();
        m4195();
        m4192(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m4209(boolean z) throws IOException {
        m4197();
        m4195();
        this.f5150.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m4202(Boolean bool) throws IOException {
        if (bool == null) {
            m4214();
            return;
        }
        m4197();
        m4195();
        this.f5150.write(bool.booleanValue() ? "true" : "false");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m4201(double d) throws IOException {
        m4197();
        if (this.f5147 != EnumC14948.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m4195();
        this.f5150.append((CharSequence) Double.toString(d));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m4211(long j) throws IOException {
        m4197();
        m4195();
        this.f5150.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m4203(Number number) throws IOException {
        if (number == null) {
            m4214();
            return;
        }
        m4197();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f5147 != EnumC14948.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f5140.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m4195();
        this.f5150.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1145 m4214() throws IOException {
        if (this.f5148 != null) {
            if (this.f5144) {
                m4197();
            } else {
                this.f5148 = null;
                return this;
            }
        }
        m4195();
        this.f5150.write("null");
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f5152 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f5150.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5150.close();
        int i = this.f5152;
        if (i > 1 || (i == 1 && this.f5145[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f5152 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m4192(String str) throws IOException {
        String str2;
        String[] strArr = this.f5146 ? f5141 : f5139;
        Writer writer = this.f5150;
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

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m4194() throws IOException {
        if (this.f5143) {
            return;
        }
        String strM37888 = this.f5149.m37888();
        Writer writer = this.f5150;
        writer.write(strM37888);
        int i = this.f5152;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f5149.m37885());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m4195() throws IOException {
        int iM4196 = m4196();
        if (iM4196 == 1) {
            this.f5145[this.f5152 - 1] = 2;
            m4194();
            return;
        }
        Writer writer = this.f5150;
        if (iM4196 == 2) {
            writer.append((CharSequence) this.f5142);
            m4194();
        } else {
            if (iM4196 != 4) {
                if (iM4196 != 6) {
                    if (iM4196 == 7) {
                        if (this.f5147 != EnumC14948.LENIENT) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                this.f5145[this.f5152 - 1] = 7;
                return;
            }
            writer.append((CharSequence) this.f5151);
            this.f5145[this.f5152 - 1] = 5;
        }
    }
}
