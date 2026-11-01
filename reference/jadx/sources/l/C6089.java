package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6089 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11672 f20605;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6089(C11672 c11672) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f20605 = c11672;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        C11672.f39229 = new C11835("local", null);
        c11545.m28810();
        if (c11545.m28833().m28794()) {
            c11545.m28833().m28810();
        } else {
            C21094.m47530();
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f20605);
        AbstractC11462 abstractC11462M28817 = c11545.m28833().m28817();
        if (abstractC11462M28817 instanceof C11672) {
            arrayList.add((C11672) abstractC11462M28817);
        }
        C14638<AbstractC11462> c14638M18621 = c11545.m28807().m18621();
        c14638M18621.m35141();
        try {
            for (AbstractC11462 abstractC11462 : c14638M18621) {
                if (abstractC11462 instanceof C11672) {
                    arrayList.add((C11672) abstractC11462);
                }
            }
            c14638M18621.m35142();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C11672) it.next()).f38589.m33194();
            }
            c11545.m28807().m18654();
        } catch (Throwable th) {
            c14638M18621.m35142();
            throw th;
        }
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo6292() {
        return this.f20605.mo28638() && !C11672.f39229.f39735.isEmpty();
    }
}
