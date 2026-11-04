package l;

import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes.dex */
public final class C23939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77496;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextPaint f77497;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f77498;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextDirectionHeuristic f77499;

    public C23939(TextPaint textPaint) {
        this.f77497 = textPaint;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f77496 = 1;
            this.f77498 = 1;
        } else {
            this.f77498 = 0;
            this.f77496 = 0;
        }
        this.f77499 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53466(int i) {
        this.f77496 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53468(int i) {
        this.f77498 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53467(TextDirectionHeuristic textDirectionHeuristic) {
        this.f77499 = textDirectionHeuristic;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3801 m53465() {
        return new C3801(this.f77497, this.f77499, this.f77496, this.f77498);
    }
}
