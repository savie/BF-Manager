package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: EIYC */
/* JADX INFO: loaded from: classes3.dex */
public final class C2530 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f8079;

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8439(C1610 c1610) {
        HashSet hashSet = new HashSet();
        this.f8079 = hashSet;
        hashSet.add(m8438(c1610, AbstractC1566.f5429, "java.lang.Integer"));
        this.f8079.add(m8438(c1610, AbstractC1566.f5436, "java.lang.Boolean"));
        this.f8079.add(m8438(c1610, AbstractC1566.f5421, "java.lang.Byte"));
        this.f8079.add(m8438(c1610, AbstractC1566.f5407, "java.lang.Short"));
        this.f8079.add(m8438(c1610, AbstractC1566.f5433, "java.lang.Character"));
        this.f8079.add(m8438(c1610, AbstractC1566.f5438, "java.lang.Long"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21965 m8438(C1610 c1610, AbstractC1566 abstractC1566, String str) {
        AbstractC1566 abstractC1566M5538 = AbstractC1566.m5538(str);
        return C21965.m49691(c1610, C1345.m4955(c1610, abstractC1566M5538), "valueOf", Collections.singletonList(abstractC1566), abstractC1566M5538);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        Iterator it;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C18959 c18959M41951;
        if (c2551.m8524()) {
            return;
        }
        Iterator it2 = c2551.m8508().iterator();
        int i = 0;
        boolean z5 = false;
        while (it2.hasNext()) {
            C21943 c21943 = (C21943) it2.next();
            ArrayList arrayList = (ArrayList) c21943.mo1986();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                C18959 c18959 = (C18959) arrayList.get(i2);
                if (c18959.getType() == EnumC24203.INVOKE) {
                    C21219 c21219 = (C21219) c18959;
                    C18959 c189510 = null;
                    if (c21219.m48374() == EnumC0336.STATIC && c21219.m44027() != null) {
                        C21965 c21965Mo18926 = c21219.mo18926();
                        if (this.f8079.contains(c21965Mo18926)) {
                            C6041 c6041M44027 = c21219.m44027();
                            AbstractC16481 abstractC16481Mo44035 = c21219.mo44035(i);
                            abstractC16481Mo44035.getClass();
                            if ((abstractC16481Mo44035 instanceof C23195) && C8314.m22408(c2551, (AbstractC15251) c21219)) {
                                AbstractC1566 abstractC1566 = (AbstractC1566) c21965Mo18926.m49702().get(i);
                                AbstractC1566 abstractC1566M49698 = c21965Mo18926.m49698();
                                if (abstractC1566 == AbstractC1566.f5438) {
                                    z2 = true;
                                } else if (abstractC1566 != AbstractC1566.f5429) {
                                    HashSet hashSet = new HashSet();
                                    for (C6041 c6041 : c6041M44027.m17530().m41946()) {
                                        hashSet.add(c6041.getType());
                                        hashSet.add(c6041.m17531());
                                    }
                                    hashSet.add(c6041M44027.getType());
                                    hashSet.remove(abstractC1566M49698);
                                    hashSet.remove(abstractC1566);
                                    z2 = !hashSet.isEmpty();
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    abstractC16481Mo44035.mo17866(EnumC1763.EXPLICIT_PRIMITIVE_TYPE);
                                }
                                abstractC16481Mo44035.mo1130(abstractC1566);
                                Iterator it3 = c6041M44027.m17530().m41945().m28519().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        it = it2;
                                        z = z5;
                                        z3 = true;
                                        break;
                                    }
                                    C17973 c17973 = (C17973) it3.next();
                                    if (!c17973.m41942() && (c18959M41951 = c17973.m41951()) != null) {
                                        EnumC24203 type = c18959M41951.getType();
                                        it = it2;
                                        if (type == EnumC24203.CONST || type == EnumC24203.MOVE) {
                                            z3 = false;
                                            if (c18959M41951.mo44035(0).getType().mo5543()) {
                                            }
                                            z = z5;
                                            break;
                                        }
                                        z3 = false;
                                        AbstractC1566 abstractC1566M17531 = c18959M41951.m44027().m17531();
                                        if (!abstractC1566M17531.mo5543() || abstractC1566M17531.equals(abstractC1566M49698)) {
                                            Iterator it4 = c17973.m41946().iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    C6041 c6042 = (C6041) it4.next();
                                                    C18959 c18959M39118 = c6042.m39118();
                                                    if (c18959M39118 != null) {
                                                        z = z5;
                                                        if (c18959M39118.getType() == EnumC24203.INVOKE && c6042.equals(((C21219) c18959M39118).mo13131())) {
                                                            z3 = false;
                                                            break;
                                                        } else {
                                                            z3 = false;
                                                            z5 = z;
                                                        }
                                                    }
                                                } else {
                                                    it2 = it;
                                                }
                                            }
                                        }
                                        z = z5;
                                        break;
                                    }
                                    it = it2;
                                    z = z5;
                                    z3 = false;
                                    break;
                                }
                                if (z3) {
                                    c6041M44027.mo1130(abstractC1566);
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                c189510 = new C18959(EnumC24203.CONST, 1);
                                c189510.mo44014(abstractC16481Mo44035);
                                c189510.m44031(c6041M44027);
                                if (z4) {
                                    c189510.mo17866(EnumC1763.DONT_INLINE);
                                }
                            }
                        }
                        if (c189510 != null) {
                            C23231.m52172(c2551, c21943, i2, c189510);
                            z5 = true;
                        }
                        i2++;
                        i = 0;
                        it2 = it;
                    }
                    it = it2;
                    z = z5;
                    if (c189510 != null) {
                        C23231.m52172(c2551, c21943, i2, c189510);
                        z5 = true;
                    }
                    i2++;
                    i = 0;
                    it2 = it;
                } else {
                    it = it2;
                    z = z5;
                }
                z5 = z;
                i2++;
                i = 0;
                it2 = it;
            }
        }
        if (z5) {
            C1039.m3944(c2551);
        }
    }
}
