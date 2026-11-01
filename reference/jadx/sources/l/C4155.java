package l;

import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ۘ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P98B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4155 implements InterfaceC18848, InterfaceC3263 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15179;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15180;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15181;

    public /* synthetic */ C4155(Object obj, Object obj2, Object obj3) {
        this.f15180 = obj;
        this.f15181 = obj2;
        this.f15179 = obj3;
    }

    @Override // l.InterfaceC3263
    /* JADX INFO: renamed from: ۙ */
    public void mo3187(C10840 c10840) {
        String name;
        String name2;
        C10840 c10841 = (C10840) this.f15180;
        C21422 c21422 = (C21422) this.f15181;
        C11545 c11545 = (C11545) this.f15179;
        c10840.m27172();
        AbstractC20745 abstractC20745M27177 = c10841.m27177();
        AbstractC20745 abstractC20745M27178 = c10840.m27177();
        boolean zM28762 = c21422.m47965().m28762();
        if (abstractC20745M27177.getName().equals(abstractC20745M27178.getName())) {
            int i = R.string.MT_Protector;
            name = C16737.m39264(zM28762 ? R.string.MT_Protector : R.string.MT_Protector, abstractC20745M27177.getName());
            if (!zM28762) {
                i = R.string.MT_Protector;
            }
            name2 = C16737.m39264(i, abstractC20745M27178.getName());
        } else {
            name = abstractC20745M27177.getName();
            name2 = abstractC20745M27178.getName();
        }
        C3246 c3246 = new C3246(c10841.m27177(), c10840.m27177(), name, name2, c21422.m47960(), c11545.m28817());
        if (!zM28762) {
            c3246.m9718();
        }
        C3090.m9281(c21422.m47965(), c3246);
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) this.f15180;
        C23630 c23630 = (C23630) this.f15181;
        InterfaceC23898 interfaceC23898 = (InterfaceC23898) this.f15179;
        C6936.m18602(interfaceC2557, OpenAuthTask.Duplex);
        c23630.m52100(interfaceC23898, abstractC20745, false);
    }
}
