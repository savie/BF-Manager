package l;

import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20518 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f65726 = 17;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f65727;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47045(AbstractC8036 abstractC8036, C14769 c14769) {
        if (abstractC8036 == null) {
            return 0;
        }
        final HashMap map = new HashMap();
        C4937.forEach(c14769, new Consumer() { // from class: l.ۗۧۘ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                HashMap map2 = map;
                map2.put((AbstractC11781) obj, Integer.valueOf(map2.size()));
            }
        });
        C20518 c20518 = new C20518(map);
        abstractC8036.mo2284(c20518);
        return c20518.f65726;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47047(Object obj) {
        this.f65726 = C17359.hashCode(obj) + (this.f65726 * 31);
    }

    @Override // l.C23174
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5474(AbstractC8036 abstractC8036) {
        Object objMo39105;
        if (abstractC8036 == null) {
            return;
        }
        AbstractC8036 abstractC8036M28345 = C11239.m28345(abstractC8036);
        AbstractC22664 abstractC22664 = abstractC8036M28345.f26659;
        if (abstractC22664 != null && (objMo39105 = abstractC22664.mo39105()) != null) {
            m47047(objMo39105);
        } else {
            m47047(abstractC8036M28345.mo2285());
            abstractC8036M28345.mo2284(this);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1970(C23787 c23787) {
        m47047(c23787.f77043);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        Integer num;
        AbstractC11781 abstractC11781 = c5887.f20170;
        if (abstractC11781 != null && (num = (Integer) this.f65727.get(abstractC11781)) != null) {
            m47047(num);
        } else {
            m47047(abstractC11781);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        m47047(c23041.f74775);
        mo5474(c23041.f74776);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        C11392.computeIfAbsent(this.f65727, c12510.f40168, new C1628(this, 1));
        super.mo1513(c12510);
    }

    public C20518(HashMap map) {
        this.f65727 = map;
    }
}
