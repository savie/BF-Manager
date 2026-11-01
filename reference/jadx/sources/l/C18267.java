package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Q7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18267 implements InterfaceC3263, InterfaceC1118 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58288;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58289;

    public /* synthetic */ C18267(Object obj, Object obj2) {
        this.f58288 = obj;
        this.f58289 = obj2;
    }

    @Override // l.InterfaceC1118
    /* JADX INFO: renamed from: ۙ */
    public String mo4141(C12257 c12257) {
        return ((ActivityC10957) this.f58288).f37312.m28922(c12257, (C1263) this.f58289);
    }

    @Override // l.InterfaceC3263
    /* JADX INFO: renamed from: ۙ */
    public void mo3187(final C10840 c10840) {
        final C11545 c11545 = (C11545) this.f58288;
        final C21422 c21422 = (C21422) this.f58289;
        c10840.m27172();
        c11545.m28817().m28625(c11545, c11545.m28797(), new InterfaceC3263() { // from class: l.ᩴ᩵᩹
            @Override // l.InterfaceC3263
            /* JADX INFO: renamed from: ۙ */
            public final void mo3187(C10840 c10841) {
                String name;
                String name2;
                c10841.m27172();
                C10840 c10842 = c10840;
                AbstractC20745 abstractC20745M27177 = c10842.m27177();
                AbstractC20745 abstractC20745M27178 = c10841.m27177();
                C21422 c21423 = c21422;
                boolean zM28762 = c21423.m47965().m28762();
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
                C3246 c3246 = new C3246(c10842.m27177(), c10841.m27177(), name, name2, c21423.m47960(), c11545.m28817());
                if (!zM28762) {
                    c3246.m9718();
                }
                C8278.m21696(c21423.m47965(), c3246);
            }
        });
    }
}
