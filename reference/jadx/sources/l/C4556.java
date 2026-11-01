package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4556 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        ActivityC5677 activityC5677 = (ActivityC5677) obj;
        activityC5677.setTitle(R.string.MT_Protector);
        activityC5677.m15657((CharSequence) null);
    }
}
