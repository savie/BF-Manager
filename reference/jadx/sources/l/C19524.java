package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19524 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C21825 f62771;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f62772;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23800 f62773;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13174 f62774;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f62775;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21825 f62776;

    public C19524() {
        throw null;
    }

    public C19524(C13174 c13174, C21825 c21825, C21825 c21826) {
        this.f62775 = new LinkedHashMap();
        this.f62772 = new HashMap();
        this.f62771 = c21825;
        this.f62776 = c21826;
        this.f62774 = c13174;
        this.f62773 = c13174.f43867;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m44584() {
        return m44582(new C15147(1));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m44603() {
        return m44582(new C19380(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m44589() {
        return m44582(new C2185(3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21825 m44582(Predicate predicate) {
        C19003 c19003 = new C19003();
        Iterator it = this.f62776.iterator();
        while (it.hasNext()) {
            C10229 c10229 = (C10229) ((AbstractC16579) it.next());
            if (predicate.test(c10229)) {
                c19003.m43723(c10229.f53121);
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44601(C21825 c21825) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            if (((AbstractC16579) it.next()).m39005(this.f62771)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m44599(AbstractC16579 abstractC16579) {
        C19003 c19003 = new C19003();
        for (AbstractC16579 abstractC165710 : this.f62771) {
            if (abstractC16579.mo1932(abstractC165710)) {
                c19003.m43723(abstractC165710);
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m44585(C21825 c21825) {
        C19003<AbstractC16579> c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            c19003.m43725(m44599((AbstractC16579) it.next()));
        }
        C19003 c19004 = new C19003();
        for (AbstractC16579 abstractC16579 : c19003) {
            if (!c19004.contains(abstractC16579)) {
                c19004.m43723(abstractC16579);
            }
        }
        return c19004.m43726();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m44602(AbstractC16579 abstractC16579) {
        return this.f62773.m52371(abstractC16579, this.f62771, this.f62776);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m44604(C21825 c21825) {
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            c19003.m43723(m44602((AbstractC16579) it.next()));
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m44587(AbstractC16579 abstractC16579) {
        C21825 c21825 = this.f62771;
        C19003 c19003 = new C19003();
        Iterator it = this.f62776.iterator();
        while (it.hasNext()) {
            C10229 c10229 = (C10229) ((AbstractC16579) it.next());
            c19003.m43723(c10229.m26017() != null ? c10229.m26017() : c10229.f53121);
        }
        return this.f62773.m52371(abstractC16579, c21825, c19003.m43726());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m44590(C21825 c21825) {
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            c19003.m43723(m44587((AbstractC16579) it.next()));
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44595(C21825 c21825, InterfaceC18383 interfaceC18383) {
        this.f62775.put(interfaceC18383, m44585(c21825));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44600() {
        m44598(this.f62771.m48593(m44584()));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m44598(C21825 c21825) {
        LinkedHashMap linkedHashMap = this.f62775;
        C17677 c17677 = null;
        for (Map.Entry entry : new LinkedHashMap(linkedHashMap).entrySet()) {
            if (!AbstractC16579.m38997((C21825) entry.getValue(), this.f62771.m48593(c21825))) {
                try {
                    ((InterfaceC18383) entry.getKey()).mo969(this);
                    linkedHashMap.remove(entry.getKey());
                } catch (C17677 e) {
                    if (c17677 == null) {
                        c17677 = e;
                    }
                }
            }
        }
        if (c17677 != null) {
            throw c17677;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21825 m44597() {
        C19003 c19003 = new C19003();
        Iterator it = this.f62776.iterator();
        while (it.hasNext()) {
            C10229 c10229 = (C10229) ((AbstractC16579) it.next());
            C23800 c23800 = this.f62774.f43867;
            C10229 c102210 = new C10229((C22929) c10229.f53121, c10229.f34913, c23800);
            c10229.m26015(c102210, c23800);
            c19003.m43723(c102210);
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m44606(C21825 c21825) {
        C6171.m17176(c21825 != null);
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        while (c21825.m48595() && this.f62776.m48595()) {
            C21825 c21826 = this.f62776;
            C10229 c10229 = (C10229) c21826.f70876;
            C10229 c102210 = (C10229) c21825.f70876;
            if (c10229.f53121 == c102210.f53121) {
                c102210.m26015(c10229, this.f62773);
                this.f62776 = this.f62776.f70877;
                c21825 = c21825.f70877;
                c19003.m43723(c10229);
                c19004.m43723(c10229.f53121);
            } else {
                this.f62776 = c21826.f70877;
            }
        }
        this.f62776 = c19003.m43726();
        this.f62771 = c19004.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44593(C19524 c19524, boolean z) {
        C21825 c21825 = c19524.f62771;
        C21825 c21825M48593 = this.f62771.m48593(c21825);
        c21825.getClass();
        c19524.f62771 = c21825M48593.m48594(c21825);
        C21825 c21825M44597 = z ? m44597() : this.f62776;
        C21825 c21826 = c19524.f62776;
        C21825 c21825M48594 = c21825M44597.m48593(c21826);
        c21826.getClass();
        c19524.f62776 = c21825M48594.m48594(c21826);
        Iterator it = this.f62771.iterator();
        while (it.hasNext()) {
            c19524.f62775.put(new InterfaceC18383() { // from class: l.᩺ܳۤ
                @Override // l.InterfaceC18383
                /* JADX INFO: renamed from: ۙ */
                public final void mo969(C19524 c19525) {
                    this.f74903.m44600();
                }
            }, C21825.of(it.next()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19524 m44588(C21825 c21825, boolean z, final C10391 c10391) {
        if (c21825.m48596() != this.f62771.m48596()) {
            for (AbstractC16579 abstractC16579 : this.f62771) {
                if (!abstractC16579.m39001(EnumC6617.TYPEVAR) || !((C22929) abstractC16579).mo46762()) {
                }
            }
            final C8235 c8235 = new C8235(this);
            C9030.stream(c21825).forEach(new Consumer() { // from class: l.ᩴܳۤ
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((AbstractC16579) obj).mo1928(c8235, (Object) null);
                }
            });
            if (c8235.f28673.size() != this.f62771.m48596()) {
                C21825 c21825M48583 = C21825.m48583((Iterable) c8235.f28673);
                C21825 c21825M48593 = this.f62771.m48593(c21825M48583);
                C19003 c19003 = new C19003();
                Iterator it = c21825M48583.iterator();
                while (it.hasNext()) {
                    C10229 c10229 = (C10229) m44602((AbstractC16579) it.next());
                    C6171.m17176(c10229.f34911.isEmpty());
                    C22929 c22929 = (C22929) c10229.f53121;
                    InterfaceC8818 interfaceC8818 = c10229.f34913;
                    C23800 c23800 = this.f62773;
                    C10229 c102210 = new C10229(c22929, interfaceC8818, c23800);
                    c10229.m26015(c102210, c23800);
                    EnumC8112[] enumC8112ArrValues = EnumC8112.values();
                    int length = enumC8112ArrValues.length;
                    char c = 0;
                    int i = 0;
                    while (i < length) {
                        EnumC8112 enumC8112 = enumC8112ArrValues[i];
                        EnumC8112[] enumC8112Arr = new EnumC8112[1];
                        enumC8112Arr[c] = enumC8112;
                        c102210.m26014(enumC8112, (C21825) C9030.stream(c10229.m26012(enumC8112Arr)).filter(new C12197(3, c21825M48593)).collect(C21825.m48587()));
                        i++;
                        c = 0;
                    }
                    c19003.m43723(c102210);
                }
                C19524 c19524 = new C19524(this.f62774, c21825M48583, c19003.m43726());
                for (final AbstractC16579 abstractC165710 : c19524.f62771) {
                    c19524.m44595(C21825.of((Object) abstractC165710), new InterfaceC18383() { // from class: l.ۘܳۤ
                        @Override // l.InterfaceC18383
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo969(C19524 c19525) {
                            AbstractC16579 abstractC165711 = abstractC165710;
                            AbstractC16579 abstractC16579M44587 = c19525.m44587(abstractC165711);
                            Iterator it2 = ((Set) c8235.f28670.get(abstractC165711)).iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                C19524 c19526 = this.f14843;
                                if (zHasNext) {
                                    ((C10229) c19526.m44602((AbstractC16579) it2.next())).m26011(abstractC16579M44587);
                                } else {
                                    c19526.f62774.m32584(c19526, c10391);
                                    c19526.m44600();
                                    return;
                                }
                            }
                        }
                    });
                }
                if (z) {
                    final C21825 c21825M48594 = c21825M48593.m48593(C21825.m48583((Iterable) c8235.f28671));
                    c19524.m44595(c21825M48583, new InterfaceC18383() { // from class: l.ۜܳۤ
                        @Override // l.InterfaceC18383
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo969(C19524 c19525) {
                            C21825 c21826 = c21825M48594;
                            C10391 c10392 = c10391;
                            C19524 c19526 = this.f22994;
                            c19526.m44594(c21826, c10392);
                            c19526.m44600();
                        }
                    });
                }
                return c19524;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44583(AbstractC11763 abstractC11763, C10391 c10391) {
        C13174 c13174 = this.f62774;
        C13638.requireNonNull(c13174);
        C9212 c9212 = new C9212(c13174, this, c10391);
        c13174.m32584(this, c10391);
        C19795 c19795 = new C19795(c9212);
        while (!abstractC11763.mo20469()) {
            if (c13174.f43863 != null) {
                C21825 c21825 = c13174.f43870;
                StringBuilder sb = new StringBuilder();
                Iterator it = c19795.f63563.f31302.f62776.iterator();
                while (it.hasNext()) {
                    C10229 c10229 = (C10229) ((AbstractC16579) it.next());
                    sb.append(String.format("var %s - upper bounds = %s, lower bounds = %s, eq bounds = %s\\n", c10229.f53121, c10229.m26012(EnumC8112.f28427), c10229.m26012(EnumC8112.f28425), c10229.m26012(EnumC8112.f28428)));
                }
                c13174.f43870 = c21825.m48597(C8732.m22597(c19795.f63562, "inferenceGraph" + c19795.hashCode(), sb.toString()));
            }
            C8506 c8506Mo20468 = abstractC11763.mo20468(c19795);
            C21825 c21825M48583 = C21825.m48583((Iterable) c8506Mo20468.f22269);
            C21825 c21825M44597 = m44597();
            while (AbstractC16579.m38997(m44584(), c21825M48583)) {
                try {
                    EnumC19089[] enumC19089ArrValues = EnumC19089.values();
                    int length = enumC19089ArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (m44591(c21825M48583, enumC19089ArrValues[i].f61677).m48595()) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            throw C13174.m32568((C11948) null);
                        }
                    }
                    c13174.m32584(this, c10391);
                } catch (C17677 unused) {
                    m44606(c21825M44597);
                    c13174.m32585(c21825M48583, this);
                    c13174.m32584(this, c10391);
                }
            }
            C6171.m17176(c19795.f63562.contains(c8506Mo20468));
            c19795.f63562.remove(c8506Mo20468);
            c19795.m45008(c8506Mo20468, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44592(C10391 c10391) {
        C13174 c13174 = this.f62774;
        C13638.requireNonNull(c13174);
        m44583(new C15291(this, c13174), c10391);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44594(C21825 c21825, C10391 c10391) {
        C13174 c13174 = this.f62774;
        C13638.requireNonNull(c13174);
        m44583(new C21640(this, c13174, c21825, c21825), c10391);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44605(C21825 c21825, C10391 c10391) {
        C13174 c13174 = this.f62774;
        C13638.requireNonNull(c13174);
        m44583(new C18112(this, c13174, c21825.m48598(m44584())), c10391);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44596(boolean z, C10391 c10391, EnumSet enumSet) {
        C13174 c13174;
        while (true) {
            C21825 c21825M44591 = m44591(this.f62771, enumSet);
            boolean zIsEmpty = m44584().isEmpty();
            c13174 = this.f62774;
            if (zIsEmpty || z) {
                break;
            }
            if (c21825M44591.isEmpty()) {
                c13174.m32585(m44584(), this);
                break;
            }
            Iterator it = this.f62776.iterator();
            while (it.hasNext()) {
                ((C10229) ((AbstractC16579) it.next())).m26016(this.f62773, c21825M44591, m44590(c21825M44591));
            }
        }
        c13174.m32584(this, c10391);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m44591(C21825 c21825, EnumSet enumSet) {
        C19003 c19003 = new C19003();
        Iterator it = c21825.m48598(m44584()).iterator();
        while (it.hasNext()) {
            C10229 c10229 = (C10229) m44602((AbstractC16579) it.next());
            Iterator it2 = enumSet.iterator();
            while (it2.hasNext()) {
                EnumC13880 enumC13880 = (EnumC13880) it2.next();
                if (enumC13880.mo6717(c10229, this)) {
                    c10229.m26011(enumC13880.mo6718(c10229, this));
                    c19003.m43723(c10229.f53121);
                    break;
                }
            }
        }
        return c19003.m43726();
    }

    public final String toString() {
        return "Inference vars: " + this.f62771 + "\nUndet vars: " + this.f62776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m44586(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, boolean z) {
        HashMap map = this.f62772;
        AbstractC16579 abstractC165710 = (AbstractC16579) map.get(abstractC8774);
        if (abstractC165710 != null) {
            return abstractC165710;
        }
        AbstractC16579 abstractC16579M52419 = this.f62773.m52419(abstractC16579);
        if (abstractC16579M52419 != abstractC16579 && !z) {
            map.put(abstractC8774, abstractC16579M52419);
        }
        return abstractC16579M52419;
    }
}
