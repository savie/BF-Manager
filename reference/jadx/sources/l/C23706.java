package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1UK */
/* JADX INFO: loaded from: classes.dex */
public final class C23706 extends AbstractC21803 implements InterfaceC23145 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20178[] f76690;

    public C23706(C20178... c20178Arr) {
        super(2);
        this.f76690 = c20178Arr;
    }

    @Override // l.AbstractC21803, l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ */
    public final void mo4603(C12417 c12417) {
        mo15147(c12417);
        String strM30867 = c12417.m30867();
        if (strM30867 != null) {
            AbstractC0421 abstractC0421M52164 = m52164(C6730.m18157(strM30867));
            if (abstractC0421M52164 instanceof C12417) {
                c12417.m30868((C12417) abstractC0421M52164);
            }
        }
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ܰ */
    public final void mo15147(C12417 c12417) {
        AbstractC0421 abstractC0421M52164;
        if (c12417.m2206() != null && (abstractC0421M52164 = m52164(c12417.m2206())) != null) {
            c12417.m2209(abstractC0421M52164);
            abstractC0421M52164.m2198(c12417);
        }
        Iterator<E> it = c12417.m2191().iterator();
        while (it.hasNext()) {
            AbstractC0421 abstractC0421M52165 = m52164((String) it.next());
            if (abstractC0421M52165 != null) {
                c12417.m2196(abstractC0421M52165);
                abstractC0421M52165.m2198(c12417);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private AbstractC0421 m52164(String str) {
        for (C20178 c20178 : this.f76690) {
            AbstractC0421 abstractC0421M45611 = c20178.m45611(str);
            if (abstractC0421M45611 != null) {
                return abstractC0421M45611;
            }
        }
        return null;
    }
}
