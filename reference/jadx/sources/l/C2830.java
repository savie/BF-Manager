package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۖܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2830 implements Appendable, CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f9322;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C10046 f9323;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f9324;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f9325;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public char[] f9326;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16254 f9327;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f9328;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f9329 = new StringBuilder();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0352 f9330;

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

    public C2830(InterfaceC24329 interfaceC24329, C0352 c0352, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative output threshold");
        }
        C17359.requireNonNull(interfaceC24329);
        this.f9324 = interfaceC24329;
        C17359.requireNonNull(c0352);
        this.f9330 = c0352;
        this.f9325 = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = this.f9329;
        if (sb != null) {
            return sb.charAt(i);
        }
        int iM38572 = this.f9327.m38572();
        return i < iM38572 ? this.f9327.m38568(i) : this.f9326[i - iM38572];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C18334(i, i2, this);
    }

    @Override // java.lang.Appendable
    public final void append(char c) throws Throwable {
        int length = length();
        if (length == Integer.MAX_VALUE) {
            throw new IllegalStateException("Output is too large");
        }
        StringBuilder sb = this.f9329;
        if (sb != null && length < this.f9325) {
            sb.append(c);
            return;
        }
        m9320();
        if (this.f9322 == this.f9326.length) {
            flush();
        }
        char[] cArr = this.f9326;
        int i = this.f9322;
        this.f9322 = i + 1;
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
        C21697.m49248(i, i2, charSequence.length());
        int i3 = i2 - i;
        if (i3 > Integer.MAX_VALUE - length()) {
            throw new IllegalStateException("Output is too large");
        }
        StringBuilder sb = this.f9329;
        if (sb != null && i3 <= this.f9325 - sb.length()) {
            this.f9329.append(charSequence, i, i2);
            return;
        }
        m9320();
        while (i < i2) {
            if (this.f9322 == this.f9326.length) {
                flush();
            }
            int iMin = Math.min(i2 - i, this.f9326.length - this.f9322);
            if (charSequence instanceof C8796) {
                ((C8796) charSequence).getChars(i, i + iMin, this.f9326, this.f9322);
            } else if (charSequence instanceof String) {
                ((String) charSequence).getChars(i, i + iMin, this.f9326, this.f9322);
            } else {
                for (int i4 = 0; i4 < iMin; i4++) {
                    this.f9326[this.f9322 + i4] = charSequence.charAt(i + i4);
                }
            }
            this.f9322 += iMin;
            i += iMin;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9321(int i) {
        if (i < 0 || i > length()) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = this.f9329;
        if (sb != null) {
            sb.setLength(i);
        } else {
            if (i >= this.f9327.m38572()) {
                this.f9322 = i - this.f9327.m38572();
                return;
            }
            this.f9327.m38573(i);
            this.f9327.m38571();
            this.f9322 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9320() throws Throwable {
        InterfaceC24329 interfaceC24329 = this.f9324;
        if (this.f9329 == null) {
            return;
        }
        try {
            C3445.createDirectories(interfaceC24329, new InterfaceC13885[0]);
            InterfaceC24329 interfaceC24329CreateTempFile = C3445.createTempFile(interfaceC24329, "format-", ".pages", new InterfaceC13885[0]);
            try {
                C9541 c9541 = new C9541(interfaceC24329CreateTempFile);
                try {
                    C10046 c10046M25951 = C10046.m25951(c9541, this.f9330);
                    this.f9323 = c10046M25951;
                    this.f9327 = new C16254(c10046M25951);
                    this.f9326 = new char[2048];
                    CharSequence charSequence = this.f9329;
                    this.f9329 = null;
                    if (charSequence == null) {
                        charSequence = "null";
                    }
                    append(charSequence, 0, charSequence.length());
                } catch (IOException | Error | RuntimeException e) {
                    try {
                        c9541.close();
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                C3445.deleteIfExists(interfaceC24329CreateTempFile);
                throw e;
            } catch (Error e4) {
                e = e4;
                C3445.deleteIfExists(interfaceC24329CreateTempFile);
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                C3445.deleteIfExists(interfaceC24329CreateTempFile);
                throw e;
            }
        } catch (IOException e6) {
            throw new UncheckedIOException(e6);
        }
    }

    private void flush() {
        int i = this.f9322;
        if (i == 0) {
            return;
        }
        this.f9327.m38570(this.f9326, i);
        this.f9327.m38571();
        this.f9322 = 0;
    }

    public final C8796 finish() {
        if (!this.f9328) {
            if (this.f9329 != null) {
                this.f9327 = new C16254(null);
                this.f9326 = new char[2048];
                CharSequence charSequence = this.f9329;
                this.f9329 = null;
                if (charSequence == null) {
                    charSequence = "null";
                }
                append(charSequence, 0, charSequence.length());
            }
            flush();
            C8796 c8796 = new C8796(this.f9327.m38569());
            close();
            return c8796;
        }
        throw new IllegalStateException("Text output is closed");
    }

    @Override // java.lang.CharSequence
    public final int length() {
        if (!this.f9328) {
            StringBuilder sb = this.f9329;
            return sb != null ? sb.length() : this.f9327.m38572() + this.f9322;
        }
        throw new IllegalStateException("Text output is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f9328) {
            return;
        }
        this.f9328 = true;
        this.f9329 = null;
        this.f9326 = null;
        this.f9327 = null;
        C10046 c10046 = this.f9323;
        if (c10046 != null) {
            c10046.close();
        }
    }
}
