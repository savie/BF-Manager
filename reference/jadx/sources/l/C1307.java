package l;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.֨ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4ZE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1307 extends FilterWriter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f5583;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f5584;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f5585;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f5586;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f5587;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f5588;

    public C1307(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.f5587 = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.f5586 = i2;
        this.f5584 = str.length() == 0 ? null : str;
        this.f5588 = 0;
        this.f5585 = i2 != 0;
        this.f5583 = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            boolean z = true;
            if (this.f5585) {
                if (i == 32) {
                    int i3 = this.f5583 + 1;
                    this.f5583 = i3;
                    int i4 = this.f5586;
                    if (i3 >= i4) {
                        this.f5583 = i4;
                        this.f5585 = false;
                    }
                } else {
                    this.f5585 = false;
                }
            }
            if (this.f5588 == this.f5587 && i != 10) {
                ((FilterWriter) this).out.write(10);
                this.f5588 = 0;
            }
            if (this.f5588 == 0) {
                String str = this.f5584;
                if (str != null) {
                    ((FilterWriter) this).out.write(str);
                }
                if (!this.f5585) {
                    int i5 = 0;
                    while (true) {
                        i2 = this.f5583;
                        if (i5 >= i2) {
                            break;
                        }
                        ((FilterWriter) this).out.write(32);
                        i5++;
                    }
                    this.f5588 = i2;
                }
            }
            ((FilterWriter) this).out.write(i);
            if (i != 10) {
                this.f5588++;
            } else {
                this.f5588 = 0;
                if (this.f5586 == 0) {
                    z = false;
                }
                this.f5585 = z;
                this.f5583 = 0;
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
