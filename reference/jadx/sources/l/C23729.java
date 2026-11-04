package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72R */
/* JADX INFO: loaded from: classes.dex */
public final class C23729 extends AbstractC18551 {
    public C23729() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        long jM20194;
        AbstractC7364 abstractC7364M23213 = c8614.m23213();
        AbstractC7629 abstractC7629Mo10174 = abstractC7364M23213.mo10174();
        try {
            String strM22298 = C8265.m22298(abstractC7629Mo10174);
            C2935 c2935M46163 = c8614.m23194().m46163();
            c2935M46163.m9583();
            try {
                jM20194 = c8614.m23213().m20194(strM22298);
                if (jM20194 == 0) {
                    jM20194 = c8614.m23236().m23213().m20194(strM22298);
                }
                if (jM20194 == 0) {
                    Iterator<E> it = c2935M46163.iterator();
                    while (it.hasNext()) {
                        jM20194 = ((AbstractC7364) it.next()).m20194(strM22298);
                        if (jM20194 != 0) {
                            break;
                        }
                    }
                }
                c2935M46163.m9584();
            } catch (Throwable th) {
                c2935M46163.m9584();
                throw th;
            }
        } catch (Exception unused) {
            jM20194 = 0;
        }
        try {
            int i = C13678.f43415;
            C8458 c8458 = new C8458(C16269.class);
            c8458.m22721("ARG_STATELESS_VISITOR", abstractC7629Mo10174.m20838());
            c8458.m22719("archiveName", abstractC7364M23213.mo10171().m48980());
            if (jM20194 != 0) {
                c8458.m22716(jM20194, "sourceTempLease");
            }
            if (c8458.m22714() != -1) {
                return;
            }
            AbstractC7364.m20184(jM20194);
        } catch (Throwable th2) {
            AbstractC7364.m20184(jM20194);
            throw th2;
        }
    }
}
