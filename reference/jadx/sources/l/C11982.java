package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11982 extends AbstractC12410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7042 f40128;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f40129;

    public C11982(ActivityC7042 activityC7042, TextView textView) {
        this.f40128 = activityC7042;
        this.f40129 = textView;
    }

    @Override // l.AbstractC12410
    public final void onChanged() {
        this.f40129.setVisibility(((ArrayList) this.f40128.f23660).isEmpty() ? 0 : 8);
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
