package l;

import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8829 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public TextDirectionHeuristic f30351;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30352;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextPaint f30353;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30354;

    public C8829(TextPaint textPaint) {
        this.f30353 = textPaint;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f30352 = 1;
            this.f30354 = 1;
        } else {
            this.f30354 = 0;
            this.f30352 = 0;
        }
        this.f30351 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22961(int i) {
        this.f30352 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22963(int i) {
        this.f30354 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22962(TextDirectionHeuristic textDirectionHeuristic) {
        this.f30351 = textDirectionHeuristic;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10240 m22960() {
        return new C10240(this.f30353, this.f30351, this.f30352, this.f30354);
    }
}
