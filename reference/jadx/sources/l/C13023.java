package l;

import android.content.Context;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۫ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public final class C13023 extends C3054 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f41704;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13023(Context context, List list, AtomicBoolean atomicBoolean) {
        super(context, list);
        this.f41704 = atomicBoolean;
    }

    @Override // l.C3054
    /* JADX INFO: renamed from: ۙ */
    public final void mo8126(TextView textView, boolean z) {
        textView.setTextColor(this.f41704.get() ? C3296.f10758 : C3296.f10754);
    }
}
