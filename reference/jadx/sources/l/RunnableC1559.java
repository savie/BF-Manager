package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1559 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11999 f5388;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5288 f5389;

    public RunnableC1559(C11999 c11999, C5288 c5288, int i) {
        this.f5388 = c11999;
        this.f5389 = c5288;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5288 c5288 = this.f5389;
        AbstractC11800 abstractC11800 = c5288.f75150;
        C11999 c11999 = this.f5388;
        C25227 c25227 = c11999.f38692;
        if (c25227 == null || !c25227.isAttachedToWindow() || c5288.f75147 || abstractC11800.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        AbstractC3269 itemAnimator = c11999.f38692.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.m10757((C4030) null)) {
            ArrayList arrayList = c11999.f38673;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C23188) arrayList.get(i)).f75148) {
                }
            }
            c11999.f38680.mo9677(abstractC11800);
            return;
        }
        c11999.f38692.post(this);
    }
}
