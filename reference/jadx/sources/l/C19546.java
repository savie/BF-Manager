package l;

import android.text.Layout;

/* JADX INFO: renamed from: l.ᩴۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8MF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19546 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f63024;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63027;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f63028;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f63030;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f63031;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Layout.Alignment f63032;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f63034;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f63035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Layout.Alignment f63037;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f63038;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63041;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C8949 f63043;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f63036 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f63026 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f63040 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f63044 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f63033 = -1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f63025 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f63042 = -1;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f63029 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f63039 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m45102() {
        int i = this.f63040;
        if (i == -1 && this.f63044 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f63044 == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m45091() {
        return this.f63036 == 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45095(boolean z) {
        this.f63036 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m45118() {
        return this.f63026 == 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m45105(boolean z) {
        this.f63026 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45089(boolean z) {
        this.f63040 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45112(boolean z) {
        this.f63044 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m45113() {
        return this.f63038;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45111(String str) {
        this.f63038 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m45092() {
        if (!this.f63024) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.f63041;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45109(int i) {
        this.f63041 = i;
        this.f63024 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m45097() {
        return this.f63024;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45082() {
        if (!this.f63028) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.f63027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45084(int i) {
        this.f63027 = i;
        this.f63028 = true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m45106() {
        return this.f63028;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45108(float f) {
        this.f63039 = f;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float m45101() {
        return this.f63039;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45088(C19546 c19546) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c19546 != null) {
            if (!this.f63024 && c19546.f63024) {
                m45109(c19546.f63041);
            }
            if (this.f63040 == -1) {
                this.f63040 = c19546.f63040;
            }
            if (this.f63044 == -1) {
                this.f63044 = c19546.f63044;
            }
            if (this.f63038 == null && (str = c19546.f63038) != null) {
                this.f63038 = str;
            }
            if (this.f63036 == -1) {
                this.f63036 = c19546.f63036;
            }
            if (this.f63026 == -1) {
                this.f63026 = c19546.f63026;
            }
            if (this.f63042 == -1) {
                this.f63042 = c19546.f63042;
            }
            if (this.f63032 == null && (alignment2 = c19546.f63032) != null) {
                this.f63032 = alignment2;
            }
            if (this.f63037 == null && (alignment = c19546.f63037) != null) {
                this.f63037 = alignment;
            }
            if (this.f63029 == -1) {
                this.f63029 = c19546.f63029;
            }
            if (this.f63033 == -1) {
                this.f63033 = c19546.f63033;
                this.f63034 = c19546.f63034;
            }
            if (this.f63043 == null) {
                this.f63043 = c19546.f63043;
            }
            if (this.f63039 == Float.MAX_VALUE) {
                this.f63039 = c19546.f63039;
            }
            if (this.f63035 == null) {
                this.f63035 = c19546.f63035;
            }
            if (this.f63030 == null) {
                this.f63030 = c19546.f63030;
            }
            if (!this.f63028 && c19546.f63028) {
                m45084(c19546.f63027);
            }
            if (this.f63025 != -1 || (i = c19546.f63025) == -1) {
                return;
            }
            this.f63025 = i;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45094(String str) {
        this.f63031 = str;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m45098() {
        return this.f63031;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m45104(int i) {
        this.f63025 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m45119() {
        return this.f63025;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m45114(int i) {
        this.f63042 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45096() {
        return this.f63042;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Layout.Alignment m45100() {
        return this.f63032;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45110(Layout.Alignment alignment) {
        this.f63032 = alignment;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Layout.Alignment m45090() {
        return this.f63037;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45085(Layout.Alignment alignment) {
        this.f63037 = alignment;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m45117() {
        return this.f63029 == 1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m45116(boolean z) {
        this.f63029 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8949 m45081() {
        return this.f63043;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45087(C8949 c8949) {
        this.f63043 = c8949;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45083(float f) {
        this.f63034 = f;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45093(int i) {
        this.f63033 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m45099() {
        return this.f63033;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m45103() {
        return this.f63034;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m45115(String str) {
        this.f63035 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m45080() {
        return this.f63035;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45086(String str) {
        this.f63030 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m45107() {
        return this.f63030;
    }
}
