package l;

import android.text.Layout;

/* JADX INFO: renamed from: l.ۡ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8MF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8759 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f30100;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f30101;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30102;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f30103;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f30104;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C22870 f30105;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Layout.Alignment f30107;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f30109;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f30110;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f30113;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Layout.Alignment f30117;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f30118;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f30112 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30116 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30111 = -1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f30119 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f30099 = -1;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f30106 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f30114 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30108 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f30115 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m22762() {
        int i = this.f30111;
        if (i == -1 && this.f30119 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f30119 == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m22746() {
        return this.f30112 == 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22750(boolean z) {
        this.f30112 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m22743() {
        return this.f30116 == 1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22741(boolean z) {
        this.f30116 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22738(boolean z) {
        this.f30111 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22757(boolean z) {
        this.f30119 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m22726() {
        return this.f30103;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22756(String str) {
        this.f30103 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m22747() {
        if (!this.f30101) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.f30100;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22754(int i) {
        this.f30100 = i;
        this.f30101 = true;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m22745() {
        return this.f30101;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22731() {
        if (!this.f30110) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.f30102;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22733(int i) {
        this.f30102 = i;
        this.f30110 = true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m22761() {
        return this.f30110;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22753(float f) {
        this.f30115 = f;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float m22758() {
        return this.f30115;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22736(C8759 c8759) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c8759 != null) {
            if (!this.f30101 && c8759.f30101) {
                m22754(c8759.f30100);
            }
            if (this.f30111 == -1) {
                this.f30111 = c8759.f30111;
            }
            if (this.f30119 == -1) {
                this.f30119 = c8759.f30119;
            }
            if (this.f30103 == null && (str = c8759.f30103) != null) {
                this.f30103 = str;
            }
            if (this.f30112 == -1) {
                this.f30112 = c8759.f30112;
            }
            if (this.f30116 == -1) {
                this.f30116 = c8759.f30116;
            }
            if (this.f30114 == -1) {
                this.f30114 = c8759.f30114;
            }
            if (this.f30107 == null && (alignment2 = c8759.f30107) != null) {
                this.f30107 = alignment2;
            }
            if (this.f30117 == null && (alignment = c8759.f30117) != null) {
                this.f30117 = alignment;
            }
            if (this.f30108 == -1) {
                this.f30108 = c8759.f30108;
            }
            if (this.f30099 == -1) {
                this.f30099 = c8759.f30099;
                this.f30118 = c8759.f30118;
            }
            if (this.f30105 == null) {
                this.f30105 = c8759.f30105;
            }
            if (this.f30115 == Float.MAX_VALUE) {
                this.f30115 = c8759.f30115;
            }
            if (this.f30113 == null) {
                this.f30113 = c8759.f30113;
            }
            if (this.f30109 == null) {
                this.f30109 = c8759.f30109;
            }
            if (!this.f30110 && c8759.f30110) {
                m22733(c8759.f30102);
            }
            if (this.f30106 != -1 || (i = c8759.f30106) == -1) {
                return;
            }
            this.f30106 = i;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22749(String str) {
        this.f30104 = str;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m22725() {
        return this.f30104;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22740(int i) {
        this.f30106 = i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m22764() {
        return this.f30106;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22727(int i) {
        this.f30114 = i;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m22742() {
        return this.f30114;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Layout.Alignment m22759() {
        return this.f30107;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22755(Layout.Alignment alignment) {
        this.f30107 = alignment;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Layout.Alignment m22751() {
        return this.f30117;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22734(Layout.Alignment alignment) {
        this.f30117 = alignment;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m22760() {
        return this.f30108 == 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22729(boolean z) {
        this.f30108 = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C22870 m22744() {
        return this.f30105;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22737(C22870 c22870) {
        this.f30105 = c22870;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22732(float f) {
        this.f30118 = f;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22748(int i) {
        this.f30099 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m22763() {
        return this.f30099;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m22739() {
        return this.f30118;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22728(String str) {
        this.f30113 = str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m22730() {
        return this.f30113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22735(String str) {
        this.f30109 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m22752() {
        return this.f30109;
    }
}
