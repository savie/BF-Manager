package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15303 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5609 f50030;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50031;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f50034;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3547 f50035;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f50033 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C24720 f50032 = C24720.m55195();

    public C15303(C5609 c5609, long j, boolean z, boolean z2, RunnableC3547 runnableC3547) {
        this.f50030 = c5609;
        this.f50034 = j;
        this.f50029 = z;
        this.f50031 = z2;
        this.f50035 = runnableC3547;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f50030.f19440.m23233(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ArrayList<C13066> arrayList = new ArrayList();
        C5609 c5609 = this.f50030;
        for (InterfaceC2386 interfaceC2386 : c5609.f19439) {
            AbstractC22044 abstractC22044Mo8093 = interfaceC2386.mo8093();
            String name = interfaceC2386.getName();
            if ((this.f50029 || this.f50031) && interfaceC2386.isDirectory() && !interfaceC2386.mo8107()) {
                for (AbstractC22044 abstractC22044 : abstractC22044Mo8093.mo4299(true)) {
                    StringBuilder sbM10405 = C3188.m10405(name, "/");
                    sbM10405.append(abstractC22044.getName());
                    m36750(arrayList, abstractC22044, sbM10405.toString());
                }
            }
            arrayList.add(new C13066(abstractC22044Mo8093, name));
        }
        try {
            for (C13066 c13066 : arrayList) {
                if (this.f50032.m55199()) {
                    this.f7780.m33189(c13066.f41802);
                }
                AbstractC22044 abstractC22045 = c13066.f41801;
                if (abstractC22045.mo2945() && abstractC22045.mo2942(this.f50034)) {
                    this.f50033 = true;
                }
            }
        } finally {
            if (this.f50033) {
                for (InterfaceC2386 interfaceC2387 : c5609.f19439) {
                    interfaceC2387.setTime(interfaceC2387.mo8093().mo4286());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36750(ArrayList arrayList, AbstractC22044 abstractC22044, String str) {
        if (abstractC22044.m49860()) {
            return;
        }
        if (!abstractC22044.mo4281()) {
            if (this.f50029) {
                arrayList.add(new C13066(abstractC22044, str));
                return;
            }
            return;
        }
        for (AbstractC22044 abstractC22045 : abstractC22044.mo4299(true)) {
            StringBuilder sbM10405 = C3188.m10405(str, "/");
            sbM10405.append(abstractC22045.getName());
            m36750(arrayList, abstractC22045, sbM10405.toString());
        }
        if (this.f50031) {
            arrayList.add(new C13066(abstractC22044, str));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f50033) {
            this.f50035.run();
            C22673.m51152(R.string.MT_Protector);
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f50033) {
            this.f50035.run();
        }
        this.f50030.f19440.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
