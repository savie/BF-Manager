package l;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8QH */
/* JADX INFO: loaded from: classes.dex */
public final class C22375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f72440;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f72441;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f72443;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f72445;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f72446;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f72447 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72444 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f72442 = new StringBuilder();

    public C22375(int i, int i2) {
        m50456(i);
        this.f72446 = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50456(int i) {
        this.f72440 = i;
        this.f72447.clear();
        this.f72444.clear();
        this.f72442.setLength(0);
        this.f72443 = 15;
        this.f72445 = 0;
        this.f72441 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m50457() {
        return this.f72447.isEmpty() && this.f72444.isEmpty() && this.f72442.length() == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50455(int i) {
        this.f72440 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50458(int i) {
        this.f72446 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50453(int i, boolean z) {
        this.f72447.add(new C5221(i, this.f72442.length(), z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50451() {
        C5221 c5221;
        int i;
        StringBuilder sb = this.f72442;
        int length = sb.length();
        if (length <= 0) {
            return;
        }
        sb.delete(length - 1, length);
        ArrayList arrayList = this.f72447;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || (i = (c5221 = (C5221) arrayList.get(size)).f18412) != length) {
                return;
            } else {
                c5221.f18412 = i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50452(char c) {
        StringBuilder sb = this.f72442;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50454() {
        SpannableString spannableStringM50449 = m50449();
        ArrayList arrayList = this.f72444;
        arrayList.add(spannableStringM50449);
        this.f72442.setLength(0);
        this.f72447.clear();
        int iMin = Math.min(this.f72446, this.f72443);
        while (arrayList.size() >= iMin) {
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2137 m50450(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f72444;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m50449());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.f72445 + this.f72441;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        if (i == Integer.MIN_VALUE) {
            if (this.f72440 != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                i = (this.f72440 != 2 || i4 <= 0) ? 0 : 2;
            } else {
                i = 1;
            }
        }
        if (i != 1) {
            if (i == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i5 = this.f72443;
        if (i5 > 7) {
            i5 -= 17;
        } else if (this.f72440 == 1) {
            i5 -= this.f72446 - 1;
        }
        C5866 c5866 = new C5866();
        c5866.m17079(spannableStringBuilder);
        c5866.m17089(Layout.Alignment.ALIGN_NORMAL);
        c5866.m17075(i5, 1);
        c5866.m17086(f);
        c5866.m17088(i);
        return c5866.m17073();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private SpannableString m50449() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f72442);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f72447;
            if (i >= arrayList.size()) {
                break;
            }
            C5221 c5221 = (C5221) arrayList.get(i);
            boolean z2 = c5221.f18413;
            int i7 = c5221.f18414;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i6 = C11186.f35260[i7];
                }
                z = z3;
            }
            int i8 = c5221.f18412;
            i++;
            if (i8 != (i < arrayList.size() ? ((C5221) arrayList.get(i)).f18412 : length)) {
                if (i2 != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i3 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                    i3 = -1;
                } else if (i3 == -1 && z) {
                    i3 = i8;
                }
                if (i6 != i5) {
                    if (i5 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                    }
                    i5 = i6;
                    i4 = i8;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
        }
        if (i4 != length && i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
