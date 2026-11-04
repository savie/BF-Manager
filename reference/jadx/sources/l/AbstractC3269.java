package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3269 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC15947 f10647 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f10643 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f10642 = 120;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f10644 = 120;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f10645 = 250;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f10646 = 250;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract void mo10759();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo10762();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo10765();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo10767(AbstractC11800 abstractC11800);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m10764() {
        return this.f10645;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10761(long j) {
        this.f10645 = j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m10760() {
        return this.f10642;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10754(long j) {
        this.f10642 = j;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m10763() {
        return this.f10644;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m10769(long j) {
        this.f10644 = j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m10768() {
        return this.f10646;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10766(long j) {
        this.f10646 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10756(InterfaceC15947 interfaceC15947) {
        this.f10647 = interfaceC15947;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m10752(AbstractC11800 abstractC11800) {
        int i = abstractC11800.mFlags;
        if (!abstractC11800.isInvalid() && (i & 4) == 0) {
            abstractC11800.getOldPosition();
            abstractC11800.getAbsoluteAdapterPosition();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10755(AbstractC11800 abstractC11800) {
        InterfaceC15947 interfaceC15947 = this.f10647;
        if (interfaceC15947 != null) {
            C25227 c25227 = ((C20423) interfaceC15947).f65427;
            abstractC11800.setIsRecyclable(true);
            if (abstractC11800.mShadowedHolder != null && abstractC11800.mShadowingHolder == null) {
                abstractC11800.mShadowedHolder = null;
            }
            abstractC11800.mShadowingHolder = null;
            if (abstractC11800.shouldBeKeptAsChild() || c25227.removeAnimatingView(abstractC11800.itemView) || !abstractC11800.isTmpDetached()) {
                return;
            }
            c25227.removeDetachedView(abstractC11800.itemView, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10757(C4030 c4030) {
        boolean zMo10762 = mo10762();
        if (c4030 != null) {
            if (!zMo10762) {
                c4030.mo13003();
                return zMo10762;
            }
            this.f10643.add(c4030);
        }
        return zMo10762;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo10758(AbstractC11800 abstractC11800, List list) {
        return !((AbstractC23735) this).f76930 || abstractC11800.isInvalid();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10753() {
        ArrayList arrayList = this.f10643;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC17439) arrayList.get(i)).mo13003();
        }
        arrayList.clear();
    }
}
