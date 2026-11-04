package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7803 extends AbstractC21832 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f25946;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f25947;

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final View mo2088(Main main) {
        return null;
    }

    public C7803(CharSequence[] charSequenceArr, AtomicInteger atomicInteger) {
        this.f25947 = charSequenceArr;
        this.f25946 = atomicInteger;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final void mo2089(C2361 c2361) {
        c2361.m8021(R.string.MT_Protector);
        c2361.m8013(this.f25947, -1, new DialogInterfaceOnClickListenerC21741(2, this.f25946));
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2091(View view) {
        return this.f25946.get() >= 0;
    }
}
