package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes3.dex */
public final class C4011 extends C13185 {
    @Override // l.C6834
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo11518(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // l.C13185, l.C6834
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo11517(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
