package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18664 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19410 f60693;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo22117(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo22118(Object obj, C4208 c4208, AbstractC0765 abstractC0765);

    /* JADX INFO: renamed from: ᩷ */
    public abstract Object mo22119();

    public AbstractC18664(C19410 c19410) {
        this.f60693 = c19410;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        if (obj == null) {
            c21362.m48598();
            return;
        }
        c21362.m48600();
        try {
            Iterator it = this.f60693.f62742.iterator();
            while (it.hasNext()) {
                ((AbstractC0765) it.next()).mo3141(c21362, obj);
            }
            c21362.m48597();
        } catch (IllegalAccessException e) {
            int i = C1971.f6612;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.15.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        Object objMo22119 = mo22119();
        Map map = this.f60693.f62741;
        try {
            c4208.m13456();
            while (c4208.m13457()) {
                AbstractC0765 abstractC0765 = (AbstractC0765) map.get(c4208.m13437());
                if (abstractC0765 == null) {
                    c4208.m13445();
                } else {
                    mo22118(objMo22119, c4208, abstractC0765);
                }
            }
            c4208.m13447();
            return mo22117(objMo22119);
        } catch (IllegalAccessException e) {
            int i = C1971.f6612;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.15.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new C7367(e2);
        }
    }
}
