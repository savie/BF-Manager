package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1YM */
/* JADX INFO: loaded from: classes4.dex */
public final class C11608 extends AbstractC4674 {
    public C11608() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        if (!C1709.m5693()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (c21422.m47975() == 2) {
            ArrayList arrayList = new ArrayList(4);
            HashSet hashSet = new HashSet();
            for (InterfaceC2557 interfaceC2557 : c21422.m47979()) {
                arrayList.add(new C10840(interfaceC2557));
                hashSet.add(interfaceC2557.getParent());
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(new C10840("resources.arsc", (String) it.next(), false, true));
            }
            c21422.m47960().mo13033(c21422.m47965(), arrayList, new RunnableC21737(1, arrayList, c21422));
            return;
        }
        final C11545 c11545M47970 = c21422.m47970();
        final ArrayList arrayList2 = new ArrayList(2);
        final ArrayList arrayList3 = new ArrayList(2);
        InterfaceC2557 interfaceC2557M47981 = c21422.m47981();
        InterfaceC2557 interfaceC2557M28797 = c11545M47970.m28797();
        arrayList2.add(new C10840(interfaceC2557M47981));
        arrayList2.add(new C10840("resources.arsc", interfaceC2557M47981.getParent(), false, true));
        arrayList3.add(new C10840(interfaceC2557M28797));
        arrayList3.add(new C10840("resources.arsc", interfaceC2557M28797.getParent(), false, true));
        c21422.m47960().mo13033(c21422.m47965(), arrayList2, new Runnable() { // from class: l.ۙۡ᩹
            @Override // java.lang.Runnable
            public final void run() {
                final ArrayList arrayList4 = arrayList2;
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((C10840) it2.next()).m27172();
                }
                final C11545 c11545 = c11545M47970;
                AbstractC11462 abstractC11462M28817 = c11545.m28817();
                final C21422 c21423 = c21422;
                final ArrayList arrayList5 = arrayList3;
                abstractC11462M28817.mo13033(c11545, arrayList5, new Runnable() { // from class: l.ܰۡ᩹
                    @Override // java.lang.Runnable
                    public final void run() {
                        String name;
                        String name2;
                        ArrayList arrayList6 = arrayList5;
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            ((C10840) it3.next()).m27172();
                        }
                        AbstractC20745 abstractC20745M27177 = ((C10840) arrayList4.get(0)).m27177();
                        AbstractC20745 abstractC20745M27178 = ((C10840) arrayList6.get(0)).m27177();
                        C21422 c21424 = c21423;
                        boolean zM28762 = c21424.m47965().m28762();
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
                        C3246 c3246 = new C3246(abstractC20745M27177, abstractC20745M27178, name, name2, c21424.m47960(), c11545.m28817());
                        if (!zM28762) {
                            c3246.m9718();
                        }
                        C4388.m12237(c21424.m47980(), c3246);
                    }
                });
            }
        });
    }
}
