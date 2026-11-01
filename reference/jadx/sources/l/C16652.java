package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܽ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B7T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16652 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12419 f53381;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f53382;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1777 f53383;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3681 f53384;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f53385;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f53387;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f53386 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AtomicReference f53380 = new AtomicReference();

    public C16652(C12419 c12419, AbstractC12233 abstractC12233, boolean z, boolean z2, RunnableC3681 runnableC3681) {
        this.f53381 = c12419;
        this.f53385 = abstractC12233;
        this.f53382 = z;
        this.f53387 = z2;
        this.f53384 = runnableC3681;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f53381.f41450.m28824());
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832("...");
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f53383 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        C12419 c12419 = this.f53381;
        final int iM52199 = c12419.f41453.m52199();
        final int iM52196 = c12419.f41453.m52196();
        final String strM52195 = c12419.f41453.m52195();
        final String strM52200 = c12419.f41453.m52200();
        C3950 c3950 = new C3950(this.f53385, new InterfaceC5614() { // from class: l.᩶۬֨
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                C16652 c16652 = this.f65508;
                return c16652.f53383.m5824() || c16652.f53380.get() != null;
            }
        });
        c3950.m11439(this.f53382);
        c3950.m11441(this.f53387);
        List list = c12419.f41452;
        final AbstractC12233 abstractC12233 = this.f53385;
        c3950.m11438(list, new InterfaceC1128() { // from class: l.֡۬֨
            @Override // l.InterfaceC1128
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo2212(C13124 c13124, int i, int i2) {
                AbstractC12233 abstractC12234 = abstractC12233;
                int i3 = iM52199;
                int i4 = iM52196;
                String str = strM52195;
                String str2 = strM52200;
                C16652 c16652 = this.f1924;
                C1777 c1777 = c16652.f53383;
                String str3 = c13124.f43706;
                String str4 = c13124.f43707;
                c1777.m5832(str3);
                c16652.f53383.m5831(i, i2);
                try {
                    abstractC12234.mo30342(i3, i4, str4);
                    c16652.f53386 = true;
                    if (str3.indexOf(47) == -1) {
                        for (InterfaceC2557 interfaceC2557 : c16652.f53381.f41452) {
                            if (interfaceC2557.getPath().equals(str4)) {
                                AbstractC5362 abstractC5362 = (AbstractC5362) interfaceC2557;
                                C11731 c11731Mo7971 = abstractC5362.mo7971();
                                if (c11731Mo7971 != null) {
                                    abstractC5362.mo14868(c11731Mo7971.m29323(str, str2));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c16652.f53380;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str3 + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f53383.m5824()) {
            return;
        }
        AtomicReference atomicReference = this.f53380;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f53383.m5824() || !this.f53386) {
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f53381.f41450.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f53386) {
            this.f53384.run();
        }
        this.f53383.m5825();
    }
}
