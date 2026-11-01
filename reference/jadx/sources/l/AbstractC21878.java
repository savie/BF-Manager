package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21878 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8473 f70988;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo43807(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo43808(Object obj, C5379 c5379, AbstractC18350 abstractC18350);

    /* JADX INFO: renamed from: ܰ */
    public abstract Object mo43809();

    public AbstractC21878(C8473 c8473) {
        this.f70988 = c8473;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        if (obj == null) {
            c1145.m4214();
            return;
        }
        c1145.m4208();
        try {
            Iterator it = this.f70988.f29381.iterator();
            while (it.hasNext()) {
                ((AbstractC18350) it.next()).mo37114(c1145, obj);
            }
            c1145.m4216();
        } catch (IllegalAccessException e) {
            int i = C17023.f54385;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        Object objMo43809 = mo43809();
        Map map = this.f70988.f29380;
        try {
            c5379.m14917();
            while (c5379.m14924()) {
                AbstractC18350 abstractC18350 = (AbstractC18350) map.get(c5379.m14921());
                if (abstractC18350 == null) {
                    c5379.m14911();
                } else {
                    mo43808(objMo43809, c5379, abstractC18350);
                }
            }
            c5379.m14910();
            return mo43807(objMo43809);
        } catch (IllegalAccessException e) {
            int i = C17023.f54385;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new C22003(e2);
        }
    }
}
