package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.۫᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C12627 implements Appendable, CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f42181;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public char[] f42182;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16072 f42183;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f42184;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13333 f42185;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f42186;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public StringBuilder f42187 = new StringBuilder();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10428 f42188;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f42189;

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) throws Throwable {
        append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    public C12627(InterfaceC3800 interfaceC3800, C10428 c10428, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative output threshold");
        }
        C13638.requireNonNull(interfaceC3800);
        this.f42184 = interfaceC3800;
        C13638.requireNonNull(c10428);
        this.f42188 = c10428;
        this.f42189 = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = this.f42187;
        if (sb != null) {
            return sb.charAt(i);
        }
        int iM32842 = this.f42185.m32842();
        return i < iM32842 ? this.f42185.m32838(i) : this.f42182[i - iM32842];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C17499(i, i2, this);
    }

    @Override // java.lang.Appendable
    public final void append(char c) throws Throwable {
        int length = length();
        if (length == Integer.MAX_VALUE) {
            throw new IllegalStateException("Output is too large");
        }
        StringBuilder sb = this.f42187;
        if (sb != null && length < this.f42189) {
            sb.append(c);
            return;
        }
        m31409();
        if (this.f42186 == this.f42182.length) {
            flush();
        }
        char[] cArr = this.f42182;
        int i = this.f42186;
        this.f42186 = i + 1;
        cArr[i] = c;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        C14744.m35328(i, i2, charSequence.length());
        int i3 = i2 - i;
        if (i3 > Integer.MAX_VALUE - length()) {
            throw new IllegalStateException("Output is too large");
        }
        StringBuilder sb = this.f42187;
        if (sb != null && i3 <= this.f42189 - sb.length()) {
            this.f42187.append(charSequence, i, i2);
            return;
        }
        m31409();
        while (i < i2) {
            if (this.f42186 == this.f42182.length) {
                flush();
            }
            int iMin = Math.min(i2 - i, this.f42182.length - this.f42186);
            if (charSequence instanceof C17565) {
                ((C17565) charSequence).getChars(i, i + iMin, this.f42182, this.f42186);
            } else if (charSequence instanceof String) {
                ((String) charSequence).getChars(i, i + iMin, this.f42182, this.f42186);
            } else {
                for (int i4 = 0; i4 < iMin; i4++) {
                    this.f42182[this.f42186 + i4] = charSequence.charAt(i + i4);
                }
            }
            this.f42186 += iMin;
            i += iMin;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31410(int i) {
        if (i < 0 || i > length()) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = this.f42187;
        if (sb != null) {
            sb.setLength(i);
        } else {
            if (i >= this.f42185.m32842()) {
                this.f42186 = i - this.f42185.m32842();
                return;
            }
            this.f42185.m32843(i);
            this.f42185.m32841();
            this.f42186 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31409() throws Throwable {
        InterfaceC3800 interfaceC3800 = this.f42184;
        if (this.f42187 == null) {
            return;
        }
        try {
            C5212.createDirectories(interfaceC3800, new InterfaceC20030[0]);
            InterfaceC3800 interfaceC3800CreateTempFile = C5212.createTempFile(interfaceC3800, "format-", ".pages", new InterfaceC20030[0]);
            try {
                C16860 c16860 = new C16860(interfaceC3800CreateTempFile);
                try {
                    C16072 c16072M38077 = C16072.m38077(c16860, this.f42188);
                    this.f42183 = c16072M38077;
                    this.f42185 = new C13333(c16072M38077);
                    this.f42182 = new char[2048];
                    CharSequence charSequence = this.f42187;
                    this.f42187 = null;
                    if (charSequence == null) {
                        charSequence = "null";
                    }
                    append(charSequence, 0, charSequence.length());
                } catch (IOException | Error | RuntimeException e) {
                    try {
                        c16860.close();
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                C5212.deleteIfExists(interfaceC3800CreateTempFile);
                throw e;
            } catch (Error e4) {
                e = e4;
                C5212.deleteIfExists(interfaceC3800CreateTempFile);
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                C5212.deleteIfExists(interfaceC3800CreateTempFile);
                throw e;
            }
        } catch (IOException e6) {
            throw new UncheckedIOException(e6);
        }
    }

    private void flush() {
        int i = this.f42186;
        if (i == 0) {
            return;
        }
        this.f42185.m32840(this.f42182, i);
        this.f42185.m32841();
        this.f42186 = 0;
    }

    public final C17565 finish() {
        if (!this.f42181) {
            if (this.f42187 != null) {
                this.f42185 = new C13333(null);
                this.f42182 = new char[2048];
                CharSequence charSequence = this.f42187;
                this.f42187 = null;
                if (charSequence == null) {
                    charSequence = "null";
                }
                append(charSequence, 0, charSequence.length());
            }
            flush();
            C17565 c17565 = new C17565(this.f42185.m32839());
            close();
            return c17565;
        }
        throw new IllegalStateException("Text output is closed");
    }

    @Override // java.lang.CharSequence
    public final int length() {
        if (!this.f42181) {
            StringBuilder sb = this.f42187;
            return sb != null ? sb.length() : this.f42185.m32842() + this.f42186;
        }
        throw new IllegalStateException("Text output is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f42181) {
            return;
        }
        this.f42181 = true;
        this.f42187 = null;
        this.f42182 = null;
        this.f42185 = null;
        C16072 c16072 = this.f42183;
        if (c16072 != null) {
            c16072.close();
        }
    }
}
