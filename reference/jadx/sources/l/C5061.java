package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5061 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17643 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f17644;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15307(C9622 c9622) {
        C15243.m36590(c9622, "item");
        ArrayList arrayList = this.f17643;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == c9622) {
                return i;
            }
        }
        return -1;
    }

    public C5061(String str) {
        this.f17644 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m15323() {
        return this.f17643;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m15317() {
        return this.f17644;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m15316() {
        return this.f17644 == null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m15314() {
        return C15243.m36589((Object) this.f17644, (Object) "\rH\rI\rS\r");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15306() {
        Iterator it = this.f17643.iterator();
        while (it.hasNext()) {
            ((C9622) it.next()).m25115(false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9622 m15320(int i) {
        Object obj = this.f17643.get(i);
        C15243.m36591(obj, "get(...)");
        return (C9622) obj;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m15315() {
        return this.f17643.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15321(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f17643.addAll(0, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15312(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f17643.addAll(list);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m15318() {
        String str = this.f17644;
        if (str == null) {
            return C21576.m49088(R.string.MT_Protector);
        }
        return str.equals("\rH\rI\rS\r") ? C21576.m49088(R.string.MT_Protector) : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15311(String str) {
        if (!m15316()) {
            m15314();
        }
        this.f17644 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15310(int i, int i2) {
        m15314();
        C9911.m25734(i, i2, this.f17643);
        C22961.m51819();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15309(int i) {
        this.f17643.remove(i);
        C22961.m51819();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9622 m15319() {
        Object next;
        Iterator it = this.f17643.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C9622) next).m25116()) {
                return (C9622) next;
            }
        }
        next = null;
        return (C9622) next;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15308() {
        C7743.m21090(this.f17643, new C7386());
        C22961.f74591.mo40348(C11471.f36082);
        C22961.f74590.m51811();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15313(C5061 c5061) {
        if (!m15314()) {
            c5061.m15314();
        }
        ArrayList<C9622> arrayList = this.f17643;
        for (C9622 c9622 : arrayList) {
            if (c9622.m25116()) {
                new C9622(c9622.m25122(), c9622.m25117()).m25110(c9622.m25124());
            }
        }
        ArrayList arrayList2 = c5061.f17643;
        ArrayList<C9622> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C9622) obj).m25116()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C7743.m21084((Iterable) arrayList3));
        for (C9622 c9623 : arrayList3) {
            C9622 c9624 = new C9622(c9623.m25122(), c9623.m25117());
            c9624.m25110(c9623.m25124());
            arrayList4.add(c9624);
        }
        arrayList2.addAll(arrayList4);
        C22961.f74591.mo40348(C11471.f36082);
        C22961.f74590.m51811();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15322(C5061 c5061) {
        if (!m15314()) {
            c5061.m15314();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f17643;
        for (Object obj : arrayList2) {
            if (((C9622) obj).m25116()) {
                arrayList.add(obj);
            }
        }
        C7743.m21090(arrayList2, new C14097());
        c5061.f17643.addAll(arrayList);
        C22961.f74591.mo40348(C11471.f36082);
        C22961.f74590.m51811();
    }
}
