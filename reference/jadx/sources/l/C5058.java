package l;

import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: I7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5058 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17648 = 17;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f17649;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14096(AbstractC8774 abstractC8774, C21825 c21825) {
        if (abstractC8774 == null) {
            return 0;
        }
        final HashMap map = new HashMap();
        C0356.forEach(c21825, new Consumer() { // from class: l.ۖۖ۟
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                HashMap map2 = map;
                map2.put((AbstractC23903) obj, Integer.valueOf(map2.size()));
            }
        });
        C5058 c5058 = new C5058(map);
        abstractC8774.mo1802(c5058);
        return c5058.f17648;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14098(Object obj) {
        this.f17648 = C13638.hashCode(obj) + (this.f17648 * 31);
    }

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ */
    public final void mo7248(AbstractC8774 abstractC8774) {
        Object objMo24292;
        if (abstractC8774 == null) {
            return;
        }
        AbstractC8774 abstractC8774M9467 = C3128.m9467(abstractC8774);
        AbstractC16579 abstractC16579 = abstractC8774M9467.f30190;
        if (abstractC16579 != null && (objMo24292 = abstractC16579.mo24292()) != null) {
            m14098(objMo24292);
        } else {
            m14098(abstractC8774M9467.mo1803());
            abstractC8774M9467.mo1802(this);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3917(C1321 c1321) {
        m14098(c1321.f5612);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        Integer num;
        AbstractC23903 abstractC23903 = c3107.f11716;
        if (abstractC23903 != null && (num = (Integer) this.f17649.get(abstractC23903)) != null) {
            m14098(num);
        } else {
            m14098(abstractC23903);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        m14098(c23570.f76355);
        mo7248(c23570.f76357);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        C9735.computeIfAbsent(this.f17649, c6656.f22475, new C18467(1, this));
        super.mo3928(c6656);
    }

    public C5058(HashMap map) {
        this.f17649 = map;
    }
}
