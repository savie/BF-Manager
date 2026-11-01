package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۤ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10302 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7479 f35338;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35339;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1777 f35340;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3681 f35341;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f35342;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f35343;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35345;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f35344 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AtomicReference f35337 = new AtomicReference();

    public C10302(C7479 c7479, AbstractC12233 abstractC12233, boolean z, boolean z2, long j, RunnableC3681 runnableC3681) {
        this.f35338 = c7479;
        this.f35343 = abstractC12233;
        this.f35339 = z;
        this.f35345 = z2;
        this.f35342 = j;
        this.f35341 = runnableC3681;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f35338.f24913.m28824());
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832("...");
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f35340 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        InterfaceC5614 interfaceC5614 = new InterfaceC5614() { // from class: l.᩵۬֨
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                C10302 c10302 = this.f62693;
                return c10302.f35340.m5824() || c10302.f35337.get() != null;
            }
        };
        final AbstractC12233 abstractC12233 = this.f35343;
        C3950 c3950 = new C3950(abstractC12233, interfaceC5614);
        c3950.m11439(this.f35339);
        c3950.m11441(this.f35345);
        List list = this.f35338.f24916;
        final long j = this.f35342;
        c3950.m11438(list, new InterfaceC1128() { // from class: l.ۡ۬֨
            @Override // l.InterfaceC1128
            /* JADX INFO: renamed from: ۙ */
            public final void mo2212(C13124 c13124, int i, int i2) {
                AbstractC12233 abstractC12234 = abstractC12233;
                long j2 = j;
                C10302 c10302 = this.f30477;
                C1777 c1777 = c10302.f35340;
                String str = c13124.f43706;
                String str2 = c13124.f43707;
                c1777.m5832(str);
                c10302.f35340.m5831(i, i2);
                try {
                    abstractC12234.mo30344(j2, str2);
                    c10302.f35344 = true;
                    if (str.indexOf(47) == -1) {
                        for (InterfaceC2557 interfaceC2557 : c10302.f35338.f24916) {
                            if (interfaceC2557.getPath().equals(str2)) {
                                interfaceC2557.setTime(j2);
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c10302.f35337;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f35340.m5824()) {
            return;
        }
        AtomicReference atomicReference = this.f35337;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f35340.m5824() || !this.f35344) {
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f35338.f24913.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f35344) {
            this.f35341.run();
        }
        this.f35340.m5825();
    }
}
