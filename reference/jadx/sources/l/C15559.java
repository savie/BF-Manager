package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܳ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15559 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15252 f50601;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24705 f50602;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23019 f50603;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f50604 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f50600 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20035 f50605 = new C20035(this);

    public C15559(C24705 c24705, C15252 c15252) {
        this.f50602 = c24705;
        this.f50601 = c15252;
        this.f50603 = new C23019(this, c24705);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37272(AbstractC22664 abstractC22664) {
        return C20035.m46076(this.f50605, this.f50602.m55132(abstractC22664));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37276(AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22664M55132 = this.f50602.m55132(abstractC22664);
        C23019 c23019 = this.f50603;
        c23019.f74703.f29318 = 0;
        c23019.mo25984(abstractC22664M55132);
        C9002 c9002 = c23019.f74703;
        C15252 c15252 = c23019.f74702.f50601;
        byte[] bArr = c9002.f29317;
        return C20035.m46076(this.f50605, c15252.f49864.mo2068(0, c9002.f29318, bArr));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m37274(AbstractC11781 abstractC11781) {
        AbstractC19728 abstractC19728Mo2068;
        EnumC13603 enumC13603 = abstractC11781.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43213;
        C23019 c23019 = this.f50603;
        C20035 c20035 = this.f50605;
        if (enumC13603 == enumC13604) {
            AbstractC22664 abstractC22664 = abstractC11781.f38067;
            c23019.f74703.f29318 = 0;
            C14769 c14769Mo15882 = abstractC22664.mo15882();
            if (c14769Mo15882.m35550()) {
                c23019.m25981(c14769Mo15882);
            }
            C24705 c24705 = this.f50602;
            c23019.mo25984(c24705.m55137(abstractC22664));
            Iterator it = c24705.m55144(abstractC22664).iterator();
            while (it.hasNext()) {
                c23019.mo25984((AbstractC22664) it.next());
            }
            C9002 c9002 = c23019.f74703;
            C15252 c15252 = c23019.f74702.f50601;
            byte[] bArr = c9002.f29317;
            abstractC19728Mo2068 = c15252.f49864.mo2068(0, c9002.f29318, bArr);
        } else {
            AbstractC22664 abstractC22665 = abstractC11781.f38067;
            c23019.f74703.f29318 = 0;
            c23019.mo25984(abstractC22665);
            C9002 c9003 = c23019.f74703;
            C15252 c15253 = c23019.f74702.f50601;
            byte[] bArr2 = c9003.f29317;
            abstractC19728Mo2068 = c15253.f49864.mo2068(0, c9003.f29318, bArr2);
        }
        return C20035.m46076(c20035, abstractC19728Mo2068);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37269(Object obj) {
        if (obj instanceof Integer) {
            return m37270((InterfaceC8344) new C2378(3, (Integer) obj));
        }
        if (obj instanceof Float) {
            return m37270((InterfaceC8344) new C2378(4, (Float) obj));
        }
        if (obj instanceof Long) {
            return m37270((InterfaceC8344) new C2378(5, (Long) obj));
        }
        if (obj instanceof Double) {
            return m37270((InterfaceC8344) new C2378(6, (Double) obj));
        }
        if (obj instanceof String) {
            return m37270((InterfaceC8344) C9089.m24226((String) obj));
        }
        throw new AssertionError(C14483.m34971("unexpected constant: ", obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37270(InterfaceC8344 interfaceC8344) {
        int iMo2973 = interfaceC8344.mo2973();
        if (iMo2973 == 7) {
            return m37272((AbstractC22664) interfaceC8344);
        }
        C20035 c20035 = this.f50605;
        if (iMo2973 == 16) {
            return C20035.m46076(c20035, this.f50602.m55132((AbstractC22664) interfaceC8344));
        }
        return C20035.m46076(c20035, interfaceC8344);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37275(AbstractC11781 abstractC11781) {
        AbstractC19728 abstractC19728 = abstractC11781.f38072;
        EnumC13603 enumC13603 = abstractC11781.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43218;
        C24705 c24705 = this.f50602;
        return C20035.m46076(this.f50605, new C6853(abstractC19728, enumC13603 == enumC13604 ? abstractC11781.m29598(c24705) : abstractC11781.mo29576(c24705)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37273(C24550 c24550) {
        if (c24550.f38067.mo18914()) {
            throw new AssertionError("Unexpected intersection type: " + c24550.f38067);
        }
        c24550.mo29590();
        if (c24550.f38069.m29558() != null) {
            LinkedHashSet linkedHashSet = this.f50604;
            if (linkedHashSet.contains(c24550)) {
                return;
            }
            m37273(c24550.f38069.m29558());
            linkedHashSet.add(c24550);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37271(AbstractC11781 abstractC11781) {
        EnumC13603 enumC13603 = abstractC11781.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43218;
        C24705 c24705 = this.f50602;
        return m37276(enumC13603 == enumC13604 ? abstractC11781.m29598(c24705) : abstractC11781.mo29576(c24705));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37266(C15559 c15559, InterfaceC0887 interfaceC0887) {
        C9835 c9835Mo2975 = interfaceC0887.mo2975(c15559.f50602);
        LinkedHashMap linkedHashMap = c15559.f50600;
        Integer numValueOf = (Integer) linkedHashMap.get(c9835Mo2975);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(c9835Mo2975, numValueOf);
        }
        return numValueOf.intValue();
    }
}
