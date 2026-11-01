package l;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8QH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18946 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f61346;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61348;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f61349;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f61351;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f61352;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61347 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f61353 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f61350 = new StringBuilder();

    public C18946(int i, int i2) {
        m43637(i);
        this.f61352 = i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43637(int i) {
        this.f61348 = i;
        this.f61347.clear();
        this.f61353.clear();
        this.f61350.setLength(0);
        this.f61346 = 15;
        this.f61349 = 0;
        this.f61351 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m43638() {
        return this.f61347.isEmpty() && this.f61353.isEmpty() && this.f61350.length() == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43636(int i) {
        this.f61348 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m43630(int i) {
        this.f61352 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43634(int i, boolean z) {
        this.f61347.add(new C18240(i, this.f61350.length(), z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43632() {
        C18240 c18240;
        int i;
        StringBuilder sb = this.f61350;
        int length = sb.length();
        if (length <= 0) {
            return;
        }
        sb.delete(length - 1, length);
        ArrayList arrayList = this.f61347;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || (i = (c18240 = (C18240) arrayList.get(size)).f58227) != length) {
                return;
            } else {
                c18240.f58227 = i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43633(char c) {
        StringBuilder sb = this.f61350;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43635() {
        SpannableString spannableStringM43625 = m43625();
        ArrayList arrayList = this.f61353;
        arrayList.add(spannableStringM43625);
        this.f61350.setLength(0);
        this.f61347.clear();
        int iMin = Math.min(this.f61352, this.f61346);
        while (arrayList.size() >= iMin) {
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0612 m43631(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f61353;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m43625());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.f61349 + this.f61351;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        if (i == Integer.MIN_VALUE) {
            if (this.f61348 != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                i = (this.f61348 != 2 || i4 <= 0) ? 0 : 2;
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
        int i5 = this.f61346;
        if (i5 > 7) {
            i5 -= 17;
        } else if (this.f61348 == 1) {
            i5 -= this.f61352 - 1;
        }
        C20369 c20369 = new C20369();
        c20369.m46002(spannableStringBuilder);
        c20369.m46012(Layout.Alignment.ALIGN_NORMAL);
        c20369.m45998(i5, 1);
        c20369.m46009(f);
        c20369.m46011(i);
        return c20369.m45996();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private SpannableString m43625() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f61350);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f61347;
            if (i >= arrayList.size()) {
                break;
            }
            C18240 c18240 = (C18240) arrayList.get(i);
            boolean z2 = c18240.f58228;
            int i7 = c18240.f58229;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i6 = C8363.f29002[i7];
                }
                z = z3;
            }
            int i8 = c18240.f58227;
            i++;
            if (i8 != (i < arrayList.size() ? ((C18240) arrayList.get(i)).f58227 : length)) {
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
