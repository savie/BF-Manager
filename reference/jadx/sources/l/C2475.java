package l;

import android.content.Context;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۖۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes3.dex */
public final class C2475 extends C0733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f9832;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2475(Context context, List list, AtomicBoolean atomicBoolean) {
        super(context, list);
        this.f9832 = atomicBoolean;
    }

    @Override // l.C0733
    /* JADX INFO: renamed from: ۙ */
    public final void mo3189(TextView textView, boolean z) {
        textView.setTextColor(this.f9832.get() ? C20368.f66007 : C20368.f65963);
    }
}
