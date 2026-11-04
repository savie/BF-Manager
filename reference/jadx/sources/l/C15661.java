package l;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15661 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f50895;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f50896;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final boolean[] f50897;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final int[] f50898;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f50899;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int[] f50900;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f50901;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f50902;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f50903;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int f50904 = m37412(2, 2, 2, 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50905;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f50906;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f50907;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50908;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f50909;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f50910;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f50911;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50912;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f50913;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f50914;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f50915;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f50917;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f50918;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f50919;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f50920;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50921;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f50923;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f50924;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f50925;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50916 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder f50922 = new SpannableStringBuilder();

    static {
        int iM37412 = m37412(0, 0, 0, 0);
        f50901 = iM37412;
        int iM37413 = m37412(0, 0, 0, 3);
        f50900 = new int[]{0, 0, 0, 0, 0, 2, 0};
        f50896 = new int[]{0, 0, 0, 0, 0, 0, 2};
        f50899 = new int[]{3, 3, 3, 3, 3, 3, 1};
        f50897 = new boolean[]{false, false, false, true, true, true, false};
        f50903 = new int[]{iM37412, iM37413, iM37412, iM37412, iM37413, iM37412, iM37412};
        f50898 = new int[]{0, 1, 2, 3, 4, 3, 4};
        f50895 = new int[]{0, 0, 0, 0, 0, 3, 3};
        f50902 = new int[]{iM37412, iM37412, iM37412, iM37412, iM37412, iM37413, iM37413};
    }

    public C15661() {
        m37420();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m37420() {
        m37427();
        this.f50919 = false;
        this.f50910 = false;
        this.f50917 = 4;
        this.f50918 = false;
        this.f50913 = 0;
        this.f50909 = 0;
        this.f50908 = 0;
        this.f50906 = 15;
        this.f50912 = 0;
        this.f50907 = 0;
        this.f50925 = 0;
        int i = f50901;
        this.f50924 = i;
        this.f50915 = f50904;
        this.f50921 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m37427() {
        this.f50916.clear();
        this.f50922.clear();
        this.f50905 = -1;
        this.f50920 = -1;
        this.f50914 = -1;
        this.f50911 = -1;
        this.f50923 = 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m37423() {
        if (this.f50919) {
            return this.f50916.isEmpty() && this.f50922.length() == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m37424() {
        return this.f50919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37417(boolean z) {
        this.f50910 = z;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m37422() {
        return this.f50910;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37418(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f50919 = true;
        this.f50910 = z;
        this.f50917 = i;
        this.f50918 = z2;
        this.f50913 = i2;
        this.f50909 = i3;
        this.f50908 = i5;
        int i8 = i4 + 1;
        if (this.f50906 != i8) {
            this.f50906 = i8;
            while (true) {
                ArrayList arrayList = this.f50916;
                if (arrayList.size() < this.f50906 && arrayList.size() < 15) {
                    break;
                } else {
                    arrayList.remove(0);
                }
            }
        }
        if (i6 != 0 && this.f50907 != i6) {
            this.f50907 = i6;
            int i9 = i6 - 1;
            int i10 = f50903[i9];
            boolean z3 = f50897[i9];
            int i11 = f50896[i9];
            int i12 = f50899[i9];
            int i13 = f50900[i9];
            this.f50924 = i10;
            this.f50912 = i13;
        }
        if (i7 == 0 || this.f50925 == i7) {
            return;
        }
        this.f50925 = i7;
        int i14 = i7 - 1;
        int i15 = f50895[i14];
        int i16 = f50898[i14];
        m37419(false, false);
        m37416(f50904, f50902[i14]);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37426(int i, int i2) {
        this.f50924 = i;
        this.f50912 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37419(boolean z, boolean z2) {
        int i = this.f50905;
        SpannableStringBuilder spannableStringBuilder = this.f50922;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f50905, spannableStringBuilder.length(), 33);
                this.f50905 = -1;
            }
        } else if (z) {
            this.f50905 = spannableStringBuilder.length();
        }
        if (this.f50920 == -1) {
            if (z2) {
                this.f50920 = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f50920, spannableStringBuilder.length(), 33);
            this.f50920 = -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37416(int i, int i2) {
        int i3 = this.f50914;
        SpannableStringBuilder spannableStringBuilder = this.f50922;
        if (i3 != -1 && this.f50915 != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f50915), this.f50914, spannableStringBuilder.length(), 33);
        }
        if (i != f50904) {
            this.f50914 = spannableStringBuilder.length();
            this.f50915 = i;
        }
        if (this.f50911 != -1 && this.f50921 != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f50921), this.f50911, spannableStringBuilder.length(), 33);
        }
        if (i2 != f50901) {
            this.f50911 = spannableStringBuilder.length();
            this.f50921 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37415(int i) {
        if (this.f50923 != i) {
            m37414('\n');
        }
        this.f50923 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37413() {
        SpannableStringBuilder spannableStringBuilder = this.f50922;
        int length = spannableStringBuilder.length();
        if (length > 0) {
            spannableStringBuilder.delete(length - 1, length);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37414(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f50922;
        if (c == '\n') {
            SpannableString spannableStringM37421 = m37421();
            ArrayList arrayList = this.f50916;
            arrayList.add(spannableStringM37421);
            spannableStringBuilder.clear();
            if (this.f50905 != -1) {
                this.f50905 = 0;
            }
            if (this.f50920 != -1) {
                this.f50920 = 0;
            }
            if (this.f50914 != -1) {
                this.f50914 = 0;
            }
            if (this.f50911 != -1) {
                this.f50911 = 0;
            }
            while (true) {
                if (arrayList.size() >= this.f50906 || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    this.f50923 = arrayList.size();
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final SpannableString m37421() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f50922);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f50905 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f50905, length, 33);
            }
            if (this.f50920 != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f50920, length, 33);
            }
            if (this.f50914 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f50915), this.f50914, length, 33);
            }
            if (this.f50911 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f50921), this.f50911, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20137 m37425() {
        Layout.Alignment alignment;
        float f;
        float f2;
        int i;
        if (m37423()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f50916;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m37421());
        int i3 = this.f50912;
        int i4 = 1;
        if (i3 == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalArgumentException("Unexpected justification value: " + this.f50912);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        if (this.f50918) {
            f = this.f50909 / 99.0f;
            f2 = this.f50913 / 99.0f;
        } else {
            f = this.f50909 / 209.0f;
            f2 = this.f50913 / 74.0f;
        }
        float f3 = (f * 0.9f) + 0.05f;
        float f4 = (f2 * 0.9f) + 0.05f;
        int i5 = this.f50908;
        int i6 = i5 / 3;
        if (i6 == 0) {
            i4 = 0;
        } else if (i6 != 1) {
            i4 = 2;
        }
        int i7 = i5 % 3;
        if (i7 == 0) {
            i = 0;
        } else {
            i = i7 == 1 ? 1 : 2;
        }
        int i8 = this.f50924;
        return new C20137(spannableStringBuilder, alignment2, f4, i4, f3, i, i8 != f50901, i8, this.f50917);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37412(int i, int i2, int i3, int i4) {
        int i5;
        C20782.m47561(i, 4);
        C20782.m47561(i2, 4);
        C20782.m47561(i3, 4);
        C20782.m47561(i4, 4);
        if (i4 == 0 || i4 == 1) {
            i5 = 255;
        } else if (i4 == 2) {
            i5 = 127;
        } else if (i4 != 3) {
            i5 = 255;
        } else {
            i5 = 0;
        }
        return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 <= 1 ? 0 : 255);
    }
}
