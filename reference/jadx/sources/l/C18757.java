package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C18757 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܽۤܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f60915;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11555 f60916;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f60917;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C5902 f60918;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60919 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f60920;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5902 f60921;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15945 f60922;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f60923;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f60924;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60925;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60926;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f60927;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2350 f60928;

    static {
        ApplicationC23172.m52091(134);
        f60915 = new short[]{5819, 23446, 23517, 23512, 23501, 23512, 23447, 23432, 23447, 23435};
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public native void mo1135(Exception exc);

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public native void mo1136();

    public C18757(ActivityC2350 activityC2350, boolean z, boolean z2, byte[] bArr, String str, int i, ArrayList arrayList, Bundle bundle) {
        this.f60928 = activityC2350;
        this.f60923 = z;
        this.f60927 = z2;
        this.f60917 = bArr;
        this.f60926 = str;
        this.f60925 = i;
        this.f60924 = arrayList;
        this.f60920 = bundle;
        this.f60916 = C11555.m29068(activityC2350);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.᩺֫᩸] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC2350 activityC2350 = this.f60928;
        activityC2350.f7593 = true;
        activityC2350.f7578.m55696();
        m8195(activityC2350, this.f60916, (RunnableC23979) new Runnable() { // from class: l.᩺֫᩸
            @Override // java.lang.Runnable
            public final void run() {
                C18757.m43557(this.f77600);
            }
        });
        if (this.f60923) {
            return;
        }
        activityC2350.f7583.m13075(activityC2350.f7585.f3540, activityC2350.f7581.f3540);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43557(C18757 c18757) {
        C13511 c13511 = c18757.f7780;
        C24943 c24943 = c18757.f60928.f7578;
        C17359.requireNonNull(c24943);
        c13511.m33188(new RunnableC7570(0, c24943));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        String string;
        String str;
        if (this.f60916.m29071()) {
            boolean zM43556 = m43556();
            ActivityC2350 activityC2350 = this.f60928;
            if (zM43556) {
                activityC2350.finish();
                return;
            }
            if (this.f60921 != null && this.f60918 != null) {
                activityC2350.f7578.m55693();
                activityC2350.f7580 = this.f60921.f20205;
                activityC2350.f7586 = this.f60918.f20205;
                C24132 c24132M55686 = activityC2350.f7578.m55686();
                c24132M55686.m54016(false);
                c24132M55686.m54048();
                C24132 c24132M55680 = activityC2350.f7578.m55680();
                c24132M55680.m54016(false);
                c24132M55680.m54048();
                activityC2350.f7578.m55702();
                activityC2350.m7961();
                C21246 c21246 = activityC2350.f7580.f74807;
                C21246 c21247 = activityC2350.f7586.f74807;
                if (C18978.m44078() && (c21246 != null || c21247 != null)) {
                    if ((c21246 != null && c21246.m48424() == null) || (c21247 != null && c21247.m48424() == null)) {
                        string = activityC2350.getString(R.string.MT_Protector);
                        str = "arsc_not_found";
                    } else if (((activityC2350.f7580.f74805 > 0 && c21246 != null && c21246.m48427()) || (activityC2350.f7586.f74805 > 0 && c21247 != null && c21247.m48427())) && ActivityC18143.m42278()) {
                        string = activityC2350.getString(R.string.MT_Protector);
                        str = "arsc_confused";
                    }
                    DialogInterfaceOnClickListenerC12983.m32395(activityC2350, str, string, false);
                }
                if (activityC2350.f7580.m51962()) {
                    for (int i = 0; i < activityC2350.f7580.f74805; i += activityC2350.f7580.f74805) {
                        activityC2350.f7578.m55686().m53924(new C15549(activityC2350, activityC2350.f7580.f74807, activityC2350.f7580.f74808));
                    }
                } else {
                    activityC2350.f7578.m55686().m54075(activityC2350.f7583.m13086());
                }
                if (activityC2350.f7586.m51962()) {
                    for (int i2 = 0; i2 < activityC2350.f7586.f74805; i2 += activityC2350.f7586.f74805) {
                        activityC2350.f7578.m55680().m53924(new C15549(activityC2350, activityC2350.f7586.f74807, activityC2350.f7586.f74808));
                    }
                } else {
                    activityC2350.f7578.m55680().m54075(activityC2350.f7583.m13085());
                }
            }
            if (this.f60920 != null) {
                activityC2350.f7578.m55686().m54030();
                activityC2350.f7578.m55680().m54030();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m43556() {
        C13511 c13511 = this.f7780;
        ActivityC2350 activityC2350 = this.f60928;
        if (activityC2350.f7578.m55686().m54109() || activityC2350.f7578.m55680().m54109()) {
            return true;
        }
        return c13511 != null && c13511.m33196();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC2350 activityC2350 = this.f60928;
        activityC2350.f7578.m55698();
        m8196();
        C15945 c15945 = this.f60922;
        if (c15945 != null) {
            c15945.m38061();
        }
        if (this.f60916.m29071()) {
            activityC2350.f7577.m6497((activityC2350.f7580 != null && activityC2350.f7580.m51962()) || (activityC2350.f7586 != null && activityC2350.f7586.m51962()));
            C24132 c24132M55666 = activityC2350.f7578.m55666();
            activityC2350.f7577.m6484(c24132M55666.m53999());
            activityC2350.f7577.m6482(c24132M55666.m53957());
            if (!activityC2350.f7587) {
                activityC2350.f7577.m6486(activityC2350.f7578.m55685());
            }
            activityC2350.f7577.m6477(activityC2350.f7578.m55686().m53890());
            activityC2350.f7577.m6467(activityC2350.f7578.m55680().m53890());
            activityC2350.f7583.m13083();
            ActivityC2350.m7929(activityC2350, this.f60925);
            activityC2350.f7593 = false;
        }
    }
}
