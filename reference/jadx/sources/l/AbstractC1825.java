package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1825 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC23699 f6996 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f6999 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f6997 = 120;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f7001 = 120;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f6998 = 250;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f7000 = 250;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public abstract boolean mo5950();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public abstract void mo5962();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo5963();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo5965(AbstractC12554 abstractC12554);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m5959() {
        return this.f6998;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m5961(long j) {
        this.f6998 = j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m5960() {
        return this.f6997;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5954(long j) {
        this.f6997 = j;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m5966() {
        return this.f7001;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m5952(long j) {
        this.f7001 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m5951() {
        return this.f7000;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5964(long j) {
        this.f7000 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5956(InterfaceC23699 interfaceC23699) {
        this.f6996 = interfaceC23699;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m5949(AbstractC12554 abstractC12554) {
        int i = abstractC12554.mFlags;
        if (!abstractC12554.isInvalid() && (i & 4) == 0) {
            abstractC12554.getOldPosition();
            abstractC12554.getAbsoluteAdapterPosition();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5955(AbstractC12554 abstractC12554) {
        InterfaceC23699 interfaceC23699 = this.f6996;
        if (interfaceC23699 != null) {
            C17492 c17492 = ((C9588) interfaceC23699).f32327;
            abstractC12554.setIsRecyclable(true);
            if (abstractC12554.mShadowedHolder != null && abstractC12554.mShadowingHolder == null) {
                abstractC12554.mShadowedHolder = null;
            }
            abstractC12554.mShadowingHolder = null;
            if (abstractC12554.shouldBeKeptAsChild() || c17492.removeAnimatingView(abstractC12554.itemView) || !abstractC12554.isTmpDetached()) {
                return;
            }
            c17492.removeDetachedView(abstractC12554.itemView, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5958(C18288 c18288) {
        boolean zMo5950 = mo5950();
        if (c18288 != null) {
            if (!zMo5950) {
                c18288.mo27748();
                return zMo5950;
            }
            this.f6999.add(c18288);
        }
        return zMo5950;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo5957(AbstractC12554 abstractC12554, List list) {
        return !((AbstractC14671) this).f47964 || abstractC12554.isInvalid();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5953() {
        ArrayList arrayList = this.f6999;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC10999) arrayList.get(i)).mo27748();
        }
        arrayList.clear();
    }
}
