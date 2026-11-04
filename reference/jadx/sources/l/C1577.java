package l;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.֫֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4ZE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1577 extends FilterWriter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f5463;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f5464;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f5465;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f5466;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f5467;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f5468;

    public C1577(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.f5467 = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.f5463 = i2;
        this.f5464 = str.length() == 0 ? null : str;
        this.f5468 = 0;
        this.f5465 = i2 != 0;
        this.f5466 = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            boolean z = true;
            if (this.f5465) {
                if (i == 32) {
                    int i3 = this.f5466 + 1;
                    this.f5466 = i3;
                    int i4 = this.f5463;
                    if (i3 >= i4) {
                        this.f5466 = i4;
                        this.f5465 = false;
                    }
                } else {
                    this.f5465 = false;
                }
            }
            if (this.f5468 == this.f5467 && i != 10) {
                ((FilterWriter) this).out.write(10);
                this.f5468 = 0;
            }
            if (this.f5468 == 0) {
                String str = this.f5464;
                if (str != null) {
                    ((FilterWriter) this).out.write(str);
                }
                if (!this.f5465) {
                    int i5 = 0;
                    while (true) {
                        i2 = this.f5466;
                        if (i5 >= i2) {
                            break;
                        }
                        ((FilterWriter) this).out.write(32);
                        i5++;
                    }
                    this.f5468 = i2;
                }
            }
            ((FilterWriter) this).out.write(i);
            if (i != 10) {
                this.f5468++;
            } else {
                this.f5468 = 0;
                if (this.f5463 == 0) {
                    z = false;
                }
                this.f5465 = z;
                this.f5466 = 0;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                write(cArr[i]);
                i++;
                i2--;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                write(str.charAt(i));
                i++;
                i2--;
            }
        }
    }
}
