package l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes4.dex */
public class C13185 extends C6834 {
    @Override // l.C6834
    /* JADX INFO: renamed from: ۙ */
    public void mo11517(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C23063.m51015("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
