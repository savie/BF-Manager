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

/* JADX INFO: renamed from: l.ۤᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10480 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f35891;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f35892;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f35893;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f35894;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final boolean[] f35895;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int f35896;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f35897;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f35898;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int f35899 = m26593(2, 2, 2, 0);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f35900;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f35901;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f35903;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f35904;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f35905;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f35906;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f35907;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f35908;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f35909;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f35910;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f35911;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f35912;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f35913;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f35914;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f35916;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f35917;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35918;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35919;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35920;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f35921;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35915 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder f35902 = new SpannableStringBuilder();

    static {
        int iM26593 = m26593(0, 0, 0, 0);
        f35896 = iM26593;
        int iM26594 = m26593(0, 0, 0, 3);
        f35892 = new int[]{0, 0, 0, 0, 0, 2, 0};
        f35893 = new int[]{0, 0, 0, 0, 0, 0, 2};
        f35900 = new int[]{3, 3, 3, 3, 3, 3, 1};
        f35895 = new boolean[]{false, false, false, true, true, true, false};
        f35898 = new int[]{iM26593, iM26594, iM26593, iM26593, iM26594, iM26593, iM26593};
        f35894 = new int[]{0, 1, 2, 3, 4, 3, 4};
        f35897 = new int[]{0, 0, 0, 0, 0, 3, 3};
        f35891 = new int[]{iM26593, iM26593, iM26593, iM26593, iM26593, iM26594, iM26594};
    }

    public C10480() {
        m26605();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m26605() {
        m26595();
        this.f35905 = false;
        this.f35910 = false;
        this.f35914 = 4;
        this.f35919 = false;
        this.f35909 = 0;
        this.f35912 = 0;
        this.f35904 = 0;
        this.f35908 = 15;
        this.f35906 = 0;
        this.f35918 = 0;
        this.f35921 = 0;
        int i = f35896;
        this.f35907 = i;
        this.f35920 = f35899;
        this.f35913 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m26595() {
        this.f35915.clear();
        this.f35902.clear();
        this.f35903 = -1;
        this.f35917 = -1;
        this.f35901 = -1;
        this.f35911 = -1;
        this.f35916 = 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m26603() {
        return this.f35905;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m26608() {
        if (this.f35905) {
            return this.f35915.isEmpty() && this.f35902.length() == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26600(boolean z) {
        this.f35910 = z;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m26594() {
        return this.f35910;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26601(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f35905 = true;
        this.f35910 = z;
        this.f35914 = i;
        this.f35919 = z2;
        this.f35909 = i2;
        this.f35912 = i3;
        this.f35904 = i5;
        int i8 = i4 + 1;
        if (this.f35908 != i8) {
            this.f35908 = i8;
            while (true) {
                ArrayList arrayList = this.f35915;
                if (arrayList.size() < this.f35908 && arrayList.size() < 15) {
                    break;
                } else {
                    arrayList.remove(0);
                }
            }
        }
        if (i6 != 0 && this.f35918 != i6) {
            this.f35918 = i6;
            int i9 = i6 - 1;
            int i10 = f35898[i9];
            boolean z3 = f35895[i9];
            int i11 = f35893[i9];
            int i12 = f35900[i9];
            int i13 = f35892[i9];
            this.f35907 = i10;
            this.f35906 = i13;
        }
        if (i7 == 0 || this.f35921 == i7) {
            return;
        }
        this.f35921 = i7;
        int i14 = i7 - 1;
        int i15 = f35897[i14];
        int i16 = f35894[i14];
        m26602(false, false);
        m26599(f35899, f35891[i14]);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26607(int i, int i2) {
        this.f35907 = i;
        this.f35906 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26602(boolean z, boolean z2) {
        int i = this.f35903;
        SpannableStringBuilder spannableStringBuilder = this.f35902;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f35903, spannableStringBuilder.length(), 33);
                this.f35903 = -1;
            }
        } else if (z) {
            this.f35903 = spannableStringBuilder.length();
        }
        if (this.f35917 == -1) {
            if (z2) {
                this.f35917 = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f35917, spannableStringBuilder.length(), 33);
            this.f35917 = -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26599(int i, int i2) {
        int i3 = this.f35901;
        SpannableStringBuilder spannableStringBuilder = this.f35902;
        if (i3 != -1 && this.f35920 != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f35920), this.f35901, spannableStringBuilder.length(), 33);
        }
        if (i != f35899) {
            this.f35901 = spannableStringBuilder.length();
            this.f35920 = i;
        }
        if (this.f35911 != -1 && this.f35913 != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f35913), this.f35911, spannableStringBuilder.length(), 33);
        }
        if (i2 != f35896) {
            this.f35911 = spannableStringBuilder.length();
            this.f35913 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26598(int i) {
        if (this.f35916 != i) {
            m26597('\n');
        }
        this.f35916 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26596() {
        SpannableStringBuilder spannableStringBuilder = this.f35902;
        int length = spannableStringBuilder.length();
        if (length > 0) {
            spannableStringBuilder.delete(length - 1, length);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26597(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f35902;
        if (c == '\n') {
            SpannableString spannableStringM26604 = m26604();
            ArrayList arrayList = this.f35915;
            arrayList.add(spannableStringM26604);
            spannableStringBuilder.clear();
            if (this.f35903 != -1) {
                this.f35903 = 0;
            }
            if (this.f35917 != -1) {
                this.f35917 = 0;
            }
            if (this.f35901 != -1) {
                this.f35901 = 0;
            }
            if (this.f35911 != -1) {
                this.f35911 = 0;
            }
            while (true) {
                if (arrayList.size() >= this.f35908 || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    this.f35916 = arrayList.size();
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final SpannableString m26604() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f35902);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f35903 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f35903, length, 33);
            }
            if (this.f35917 != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f35917, length, 33);
            }
            if (this.f35901 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f35920), this.f35901, length, 33);
            }
            if (this.f35911 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f35913), this.f35911, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9069 m26606() {
        Layout.Alignment alignment;
        float f;
        float f2;
        int i;
        if (m26608()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f35915;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m26604());
        int i3 = this.f35906;
        int i4 = 1;
        if (i3 == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalArgumentException("Unexpected justification value: " + this.f35906);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        if (this.f35919) {
            f = this.f35912 / 99.0f;
            f2 = this.f35909 / 99.0f;
        } else {
            f = this.f35912 / 209.0f;
            f2 = this.f35909 / 74.0f;
        }
        float f3 = (f * 0.9f) + 0.05f;
        float f4 = (f2 * 0.9f) + 0.05f;
        int i5 = this.f35904;
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
        int i8 = this.f35907;
        return new C9069(spannableStringBuilder, alignment2, f4, i4, f3, i, i8 != f35896, i8, this.f35914);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26593(int i, int i2, int i3, int i4) {
        int i5;
        C2023.m6503(i, 4);
        C2023.m6503(i2, 4);
        C2023.m6503(i3, 4);
        C2023.m6503(i4, 4);
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
