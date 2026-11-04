package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes.dex */
public final class C25144 extends C11717 {
    @Override // l.C16938
    /* JADX INFO: renamed from: ۙ */
    public boolean mo39915(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // l.C11717, l.C16938
    /* JADX INFO: renamed from: ۙ */
    public void mo29433(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
