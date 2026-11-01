package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C8235 extends AbstractC6160 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19524 f28672;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f28671 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f28673 = new LinkedHashSet();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f28670 = new LinkedHashMap();

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        c0309.mo1934().mo1928(this, (Object) null);
        Iterator it = c0309.mo1938().iterator();
        while (it.hasNext()) {
            ((AbstractC16579) it.next()).mo1928(this, (Object) null);
        }
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        return (Void) c0350.f1774.mo1928(this, (Object) null);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        return (Void) c8777.f30194.mo1928(this, (Object) null);
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo4813(C10229 c10229, Object obj) {
        m21616(c10229);
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        AbstractC16579 abstractC16579M44602 = this.f28672.m44602(c22929);
        if (abstractC16579M44602.m39001(EnumC6617.UNDETVAR)) {
            m21616((C10229) abstractC16579M44602);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.AbstractCollection, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.AbstractCollection, java.util.Collection] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21616(C10229 c10229) {
        EnumC8112[] enumC8112Arr;
        int i;
        Iterator it;
        ?? M48593;
        C10229 c102210 = c10229;
        AbstractC16579 abstractC16579 = c102210.f53121;
        if (this.f28673.add(abstractC16579)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singleton(abstractC16579));
            LinkedHashMap linkedHashMap = this.f28670;
            Set set = (Set) C9735.getOrDefault(linkedHashMap, abstractC16579, linkedHashSet);
            EnumC8112[] enumC8112ArrValues = EnumC8112.values();
            int length = enumC8112ArrValues.length;
            char c = 0;
            int i2 = 0;
            while (i2 < length) {
                EnumC8112 enumC8112 = enumC8112ArrValues[i2];
                EnumC8112[] enumC8112Arr2 = new EnumC8112[1];
                enumC8112Arr2[c] = enumC8112;
                Iterator it2 = c102210.m26012(enumC8112Arr2).iterator();
                while (it2.hasNext()) {
                    AbstractC16579 abstractC165710 = (AbstractC16579) it2.next();
                    C19524 c19524 = this.f28672;
                    AbstractC16579 abstractC16579M44602 = c19524.m44602(abstractC165710);
                    if (abstractC16579M44602.m39001(EnumC6617.UNDETVAR)) {
                        C10229 c102211 = (C10229) c19524.m44602(abstractC165710);
                        EnumC8112[] enumC8112ArrValues2 = EnumC8112.values();
                        int length2 = enumC8112ArrValues2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                enumC8112Arr = enumC8112ArrValues;
                                i = length;
                                it = it2;
                                set.add(abstractC165710);
                                this.f28671.add(abstractC165710);
                                break;
                            }
                            enumC8112Arr = enumC8112ArrValues;
                            EnumC8112 enumC8113 = enumC8112ArrValues2[i3];
                            i = length;
                            int i4 = 1;
                            it = it2;
                            C21825 c21825M26012 = c102210.m26012(enumC8113);
                            if (enumC8113 == enumC8112) {
                                M48593 = c21825M26012;
                                i4 = 1;
                                M48593 = c21825M26012.m48593(C21825.of((Object) abstractC165710));
                            }
                            M48593 = c21825M26012;
                            EnumC8112[] enumC8112Arr3 = new EnumC8112[i4];
                            enumC8112Arr3[0] = enumC8113;
                            C21825 c21825M26013 = c102211.m26012(enumC8112Arr3);
                            ?? M48594 = c21825M26013;
                            if (enumC8113 == enumC8112.mo21371()) {
                                M48594 = c21825M26013.m48593(C21825.of((Object) abstractC16579));
                            }
                            if (!M48593.containsAll(M48594) || !M48594.containsAll(M48593)) {
                                abstractC16579M44602.mo1928(this, (Object) null);
                                break;
                            }
                            i3++;
                            c102210 = c10229;
                            enumC8112ArrValues = enumC8112Arr;
                            length = i;
                            it2 = it;
                        }
                    } else {
                        abstractC16579M44602.mo1928(this, (Object) null);
                        enumC8112Arr = enumC8112ArrValues;
                        i = length;
                        it = it2;
                    }
                    c102210 = c10229;
                    enumC8112ArrValues = enumC8112Arr;
                    length = i;
                    it2 = it;
                }
                i2++;
                c = 0;
                c102210 = c10229;
            }
            linkedHashMap.put(abstractC16579, set);
        }
    }

    public C8235(C19524 c19524) {
        this.f28672 = c19524;
    }
}
