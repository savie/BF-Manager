package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۫ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12355 extends AbstractC7713 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f41269;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f41270;

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final View mo2074(Main main) {
        return null;
    }

    public C12355(CharSequence[] charSequenceArr, AtomicInteger atomicInteger) {
        this.f41270 = charSequenceArr;
        this.f41269 = atomicInteger;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final void mo2075(C8067 c8067) {
        c8067.m21274(R.string.MT_Protector);
        c8067.m21266(this.f41270, -1, new DialogInterfaceOnClickListenerC16588(0, this.f41269));
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2077(View view) {
        return this.f41269.get() >= 0;
    }
}
