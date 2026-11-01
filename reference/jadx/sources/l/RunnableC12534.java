package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12534 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4647 f41961;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16767 f41962;

    public RunnableC12534(C4647 c4647, C16767 c16767, int i) {
        this.f41961 = c4647;
        this.f41962 = c16767;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C16767 c16767 = this.f41962;
        AbstractC12554 abstractC12554 = c16767.f7349;
        C4647 c4647 = this.f41961;
        C17492 c17492 = c4647.f16432;
        if (c17492 == null || !c17492.isAttachedToWindow() || c16767.f7341 || abstractC12554.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        AbstractC1825 itemAnimator = c4647.f16432.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.m5958((C18288) null)) {
            ArrayList arrayList = c4647.f16419;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1949) arrayList.get(i)).f7345) {
                }
            }
            c4647.f16422.mo8536(abstractC12554);
            return;
        }
        c4647.f16432.post(this);
    }
}
