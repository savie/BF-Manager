package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C9307 extends AbstractC1584 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2596 f30240;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f30241 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f30243 = new LinkedHashSet();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f30242 = new LinkedHashMap();

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        return (Void) c2832.f9333.mo9324(this, (Object) null);
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1125(C8274 c8274, Object obj) {
        m24532(c8274);
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        c10510.mo23449().mo9324(this, (Object) null);
        Iterator it = c10510.mo15882().iterator();
        while (it.hasNext()) {
            ((AbstractC22664) it.next()).mo9324(this, (Object) null);
        }
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        return (Void) c10729.f34074.mo9324(this, (Object) null);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        AbstractC22664 abstractC22664M8710 = this.f30240.m8710(c17969);
        if (abstractC22664M8710.m51067(EnumC21172.UNDETVAR)) {
            m24532((C8274) abstractC22664M8710);
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
    public final void m24532(C8274 c8274) {
        EnumC0816[] enumC0816Arr;
        int i;
        Iterator it;
        ?? M35548;
        C8274 c8275 = c8274;
        AbstractC22664 abstractC22664 = c8275.f72657;
        if (this.f30243.add(abstractC22664)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singleton(abstractC22664));
            LinkedHashMap linkedHashMap = this.f30242;
            Set set = (Set) C11392.getOrDefault(linkedHashMap, abstractC22664, linkedHashSet);
            EnumC0816[] enumC0816ArrValues = EnumC0816.values();
            int length = enumC0816ArrValues.length;
            char c = 0;
            int i2 = 0;
            while (i2 < length) {
                EnumC0816 enumC0816 = enumC0816ArrValues[i2];
                EnumC0816[] enumC0816Arr2 = new EnumC0816[1];
                enumC0816Arr2[c] = enumC0816;
                Iterator it2 = c8275.m22332(enumC0816Arr2).iterator();
                while (it2.hasNext()) {
                    AbstractC22664 abstractC22665 = (AbstractC22664) it2.next();
                    C2596 c2596 = this.f30240;
                    AbstractC22664 abstractC22664M8710 = c2596.m8710(abstractC22665);
                    if (abstractC22664M8710.m51067(EnumC21172.UNDETVAR)) {
                        C8274 c8276 = (C8274) c2596.m8710(abstractC22665);
                        EnumC0816[] enumC0816ArrValues2 = EnumC0816.values();
                        int length2 = enumC0816ArrValues2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                enumC0816Arr = enumC0816ArrValues;
                                i = length;
                                it = it2;
                                set.add(abstractC22665);
                                this.f30241.add(abstractC22665);
                                break;
                            }
                            enumC0816Arr = enumC0816ArrValues;
                            EnumC0816 enumC0817 = enumC0816ArrValues2[i3];
                            i = length;
                            int i4 = 1;
                            it = it2;
                            C14769 c14769M22332 = c8275.m22332(enumC0817);
                            if (enumC0817 == enumC0816) {
                                M35548 = c14769M22332;
                                i4 = 1;
                                M35548 = c14769M22332.m35548(C14769.of((Object) abstractC22665));
                            }
                            M35548 = c14769M22332;
                            EnumC0816[] enumC0816Arr3 = new EnumC0816[i4];
                            enumC0816Arr3[0] = enumC0817;
                            C14769 c14769M22333 = c8276.m22332(enumC0816Arr3);
                            ?? M35549 = c14769M22333;
                            if (enumC0817 == enumC0816.mo3284()) {
                                M35549 = c14769M22333.m35548(C14769.of((Object) abstractC22664));
                            }
                            if (!M35548.containsAll(M35549) || !M35549.containsAll(M35548)) {
                                abstractC22664M8710.mo9324(this, (Object) null);
                                break;
                            }
                            i3++;
                            c8275 = c8274;
                            enumC0816ArrValues = enumC0816Arr;
                            length = i;
                            it2 = it;
                        }
                    } else {
                        abstractC22664M8710.mo9324(this, (Object) null);
                        enumC0816Arr = enumC0816ArrValues;
                        i = length;
                        it = it2;
                    }
                    c8275 = c8274;
                    enumC0816ArrValues = enumC0816Arr;
                    length = i;
                    it2 = it;
                }
                i2++;
                c = 0;
                c8275 = c8274;
            }
            linkedHashMap.put(abstractC22664, set);
        }
    }

    public C9307(C2596 c2596) {
        this.f30240 = c2596;
    }
}
