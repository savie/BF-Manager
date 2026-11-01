package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C14268 extends AbstractC3492 {

    /* JADX INFO: renamed from: ܰܶܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f46697;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13914 f46698;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23229 f46699;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f46700 = true;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f46701;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f46702;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13914 f46703;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f46704;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f46705;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f46706;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f46707;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46708;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7817 f46709;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4471 f46710;

    static {
        ApplicationC6132.m17119(126);
        f46697 = new short[]{5730, 32380, 32311, 32306, 32295, 32306, 32381, 32354, 32381, 32353};
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public native void mo1158(Exception exc);

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public native void mo1159();

    public C14268(ActivityC4471 activityC4471, boolean z, boolean z2, byte[] bArr, String str, int i, ArrayList arrayList, Bundle bundle) {
        this.f46710 = activityC4471;
        this.f46705 = z;
        this.f46706 = z2;
        this.f46701 = bArr;
        this.f46707 = str;
        this.f46708 = i;
        this.f46704 = arrayList;
        this.f46702 = bundle;
        this.f46699 = C23229.m51233(activityC4471);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ܽۘۖ] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ActivityC4471 activityC4471 = this.f46710;
        activityC4471.f15900 = true;
        activityC4471.f15887.m9118();
        m10250(activityC4471, this.f46699, (RunnableC16384) new Runnable() { // from class: l.ܽۘۖ
            @Override // java.lang.Runnable
            public final void run() {
                C14268.m34419(this.f52719);
            }
        });
        if (this.f46705) {
            return;
        }
        activityC4471.f15889.m41936(activityC4471.f15885.f32344, activityC4471.f15894.f32344);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34419(C14268 c14268) {
        C17485 c17485 = c14268.f12806;
        C3040 c3040 = c14268.f46710.f15887;
        C13638.requireNonNull(c3040);
        c17485.m40697(new RunnableC23440(0, c3040));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        String string;
        String str;
        if (this.f46699.m51236()) {
            boolean zM34418 = m34418();
            ActivityC4471 activityC4471 = this.f46710;
            if (zM34418) {
                activityC4471.finish();
                return;
            }
            if (this.f46698 != null && this.f46703 != null) {
                activityC4471.f15887.m9108();
                activityC4471.f15902 = this.f46698.f45833;
                activityC4471.f15896 = this.f46703.f45833;
                C6111 c6111M9091 = activityC4471.f15887.m9091();
                c6111M9091.m17057(false);
                c6111M9091.m16949();
                C6111 c6111M9117 = activityC4471.f15887.m9117();
                c6111M9117.m17057(false);
                c6111M9117.m16949();
                activityC4471.f15887.m9128();
                activityC4471.m12469();
                C6037 c6037 = activityC4471.f15902.f7653;
                C6037 c6038 = activityC4471.f15896.f7653;
                if (C1709.m5693() && (c6037 != null || c6038 != null)) {
                    if ((c6037 != null && c6037.m16369() == null) || (c6038 != null && c6038.m16369() == null)) {
                        string = activityC4471.getString(R.string.MT_Protector);
                        str = "arsc_not_found";
                    } else if (((activityC4471.f15902.f7654 > 0 && c6037 != null && c6037.m16373()) || (activityC4471.f15896.f7654 > 0 && c6038 != null && c6038.m16373())) && ActivityC11632.m29003()) {
                        string = activityC4471.getString(R.string.MT_Protector);
                        str = "arsc_confused";
                    }
                    DialogInterfaceOnClickListenerC14147.m34221(activityC4471, str, string, false);
                }
                if (activityC4471.f15902.m6571()) {
                    for (int i = 0; i < activityC4471.f15902.f7654; i += activityC4471.f15902.f7654) {
                        activityC4471.f15887.m9091().m16876(new C18731(activityC4471, activityC4471.f15902.f7653, activityC4471.f15902.f7649));
                    }
                } else {
                    activityC4471.f15887.m9091().m16990(activityC4471.f15889.m41942());
                }
                if (activityC4471.f15896.m6571()) {
                    for (int i2 = 0; i2 < activityC4471.f15896.f7654; i2 += activityC4471.f15896.f7654) {
                        activityC4471.f15887.m9117().m16876(new C18731(activityC4471, activityC4471.f15896.f7653, activityC4471.f15896.f7649));
                    }
                } else {
                    activityC4471.f15887.m9117().m16990(activityC4471.f15889.m41950());
                }
            }
            if (this.f46702 != null) {
                activityC4471.f15887.m9091().m17063();
                activityC4471.f15887.m9117().m17063();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean m34418() {
        C17485 c17485 = this.f12806;
        ActivityC4471 activityC4471 = this.f46710;
        if (activityC4471.f15887.m9091().m16913() || activityC4471.f15887.m9117().m16913()) {
            return true;
        }
        return c17485 != null && c17485.m40693();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ActivityC4471 activityC4471 = this.f46710;
        activityC4471.f15887.m9093();
        m10251();
        C7817 c7817 = this.f46709;
        if (c7817 != null) {
            c7817.m20606();
        }
        if (this.f46699.m51236()) {
            activityC4471.f15897.m36055((activityC4471.f15902 != null && activityC4471.f15902.m6571()) || (activityC4471.f15896 != null && activityC4471.f15896.m6571()));
            C6111 c6111M9095 = activityC4471.f15887.m9095();
            activityC4471.f15897.m36052(c6111M9095.m17037());
            activityC4471.f15897.m36070(c6111M9095.m16938());
            if (!activityC4471.f15904) {
                activityC4471.f15897.m36082(activityC4471.f15887.m9113());
            }
            activityC4471.f15897.m36075(activityC4471.f15887.m9091().m17040());
            activityC4471.f15897.m36057(activityC4471.f15887.m9117().m17040());
            activityC4471.f15889.m41943();
            ActivityC4471.m12453(activityC4471, this.f46708);
            activityC4471.f15900 = false;
        }
    }
}
