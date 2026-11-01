package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72R */
/* JADX INFO: loaded from: classes3.dex */
public final class C7374 extends AbstractC11026 {
    public C7374() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        long jM28618;
        AbstractC11462 abstractC11462M28817 = c11545.m28817();
        AbstractC9677 abstractC9677Mo13029 = abstractC11462M28817.mo13029();
        try {
            String strM15373 = C5567.m15373(abstractC9677Mo13029);
            C14638 c14638M18621 = c11545.m28807().m18621();
            c14638M18621.m35141();
            try {
                jM28618 = c11545.m28817().m28618(strM15373);
                if (jM28618 == 0) {
                    jM28618 = c11545.m28833().m28817().m28618(strM15373);
                }
                if (jM28618 == 0) {
                    Iterator<E> it = c14638M18621.iterator();
                    while (it.hasNext()) {
                        jM28618 = ((AbstractC11462) it.next()).m28618(strM15373);
                        if (jM28618 != 0) {
                            break;
                        }
                    }
                }
                c14638M18621.m35142();
            } catch (Throwable th) {
                c14638M18621.m35142();
                throw th;
            }
        } catch (Exception unused) {
            jM28618 = 0;
        }
        try {
            int i = C20725.f67443;
            C10142 c10142 = new C10142(C10197.class);
            c10142.m25770("ARG_STATELESS_VISITOR", abstractC9677Mo13029.m24619());
            c10142.m25768("archiveName", abstractC11462M28817.mo13045().m16495());
            if (jM28618 != 0) {
                c10142.m25765(jM28618, "sourceTempLease");
            }
            if (c10142.m25763() != -1) {
                return;
            }
            AbstractC11462.m28611(jM28618);
        } catch (Throwable th2) {
            AbstractC11462.m28611(jM28618);
            throw th2;
        }
    }
}
