package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۙۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AI4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4387 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13561 f15628;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15629;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1777 f15630;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3681 f15631;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f15632;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15634;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f15633 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AtomicReference f15627 = new AtomicReference();

    public C4387(C13561 c13561, AbstractC12233 abstractC12233, boolean z, boolean z2, RunnableC3681 runnableC3681) {
        this.f15628 = c13561;
        this.f15632 = abstractC12233;
        this.f15629 = z;
        this.f15634 = z2;
        this.f15631 = runnableC3681;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f15628.f44736.m28824());
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832("...");
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f15630 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        C13561 c13561 = this.f15628;
        final int iM41908 = c13561.f44739.m41908();
        InterfaceC5614 interfaceC5614 = new InterfaceC5614() { // from class: l.ۢ۬֨
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                C4387 c4387 = this.f32337;
                return c4387.f15630.m5824() || c4387.f15627.get() != null;
            }
        };
        final AbstractC12233 abstractC12233 = this.f15632;
        C3950 c3950 = new C3950(abstractC12233, interfaceC5614);
        c3950.m11439(this.f15629);
        c3950.m11441(this.f15634);
        c3950.m11438(c13561.f44738, new InterfaceC1128() { // from class: l.ۗ۬֨
            @Override // l.InterfaceC1128
            /* JADX INFO: renamed from: ۙ */
            public final void mo2212(C13124 c13124, int i, int i2) {
                AbstractC12233 abstractC12234 = abstractC12233;
                int i3 = iM41908;
                C4387 c4387 = this.f12067;
                C1777 c1777 = c4387.f15630;
                String str = c13124.f43706;
                String str2 = c13124.f43707;
                c1777.m5832(str);
                c4387.f15630.m5831(i, i2);
                try {
                    abstractC12234.mo30346(i3, str2);
                    c4387.f15633 = true;
                    if (str.indexOf(47) == -1) {
                        for (InterfaceC2557 interfaceC2557 : c4387.f15628.f44738) {
                            if (interfaceC2557.getPath().equals(str2)) {
                                AbstractC5362 abstractC5362 = (AbstractC5362) interfaceC2557;
                                C11731 c11731Mo7971 = abstractC5362.mo7971();
                                if (c11731Mo7971 != null) {
                                    abstractC5362.mo14868(c11731Mo7971.m29321(i3));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c4387.f15627;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f15630.m5824()) {
            return;
        }
        AtomicReference atomicReference = this.f15627;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f15630.m5824() || !this.f15633) {
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f15628.f44736.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f15633) {
            this.f15631.run();
        }
        this.f15630.m5825();
    }
}
