package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: KIUZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23414 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        int i;
        if (c24927.mo17867(C11457.f36004)) {
            for (C2551 c2551 : c24927.getMethods()) {
                if (c2551.mo17865(EnumC1763.ANONYMOUS_CONSTRUCTOR)) {
                    ArrayList arrayList = new ArrayList();
                    C21965 c21965Mo8532 = c2551.mo8532();
                    C24927 c24927M8536 = c2551.m8536();
                    List listM8526 = c2551.m8526();
                    Map linkedHashMap = new LinkedHashMap();
                    int size = listM8526.size();
                    for (int i2 = (c21965Mo8532.m49705() == 0 || !((AbstractC1566) c21965Mo8532.m49702().get(0)).equals(((C2551) c2551.m8514().get(0)).m8536().m55571().getType())) ? 0 : 1; i2 < size; i2++) {
                        C6041 c6041 = (C6041) listM8526.get(i2);
                        C18959 c18959M52609 = m52609(c6041);
                        if (c18959M52609 == null) {
                            linkedHashMap = Collections.EMPTY_MAP;
                            break;
                        }
                        int i3 = C15954.f51794[c18959M52609.getType().ordinal()];
                        if (i3 == 1) {
                            C17467 c17467M55538 = c24927M8536.m55538((C14022) ((C3319) c18959M52609).m10937());
                            if (c17467M55538 == null || !c17467M55538.mo8547().m26528()) {
                                linkedHashMap = Collections.EMPTY_MAP;
                                break;
                            }
                            linkedHashMap.put(c6041, c17467M55538);
                            arrayList.add(c18959M52609);
                        } else {
                            if (i3 != 2) {
                                linkedHashMap = Collections.EMPTY_MAP;
                                break;
                            }
                            if (!((C6787) c18959M52609).m18922()) {
                                linkedHashMap = Collections.EMPTY_MAP;
                                break;
                            }
                            arrayList.add(c18959M52609);
                        }
                    }
                    if (linkedHashMap.isEmpty()) {
                        c2551.mo17866(EnumC1763.NO_SKIP_ARGS);
                    } else {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            C17467 c17467 = (C17467) entry.getValue();
                            if (c17467 != null) {
                                AbstractC16481 abstractC16481 = (AbstractC16481) entry.getKey();
                                c17467.mo17864(new C13694(abstractC16481));
                                c17467.mo17866(EnumC1763.DONT_GENERATE);
                                abstractC16481.getClass();
                                if (abstractC16481 instanceof C6041) {
                                    abstractC16481.mo17866(EnumC1763.SKIP_ARG);
                                    C6041 c6042 = (C6041) abstractC16481;
                                    List listM8527 = c2551.m8526();
                                    if (listM8527 == null || listM8527.isEmpty()) {
                                        i = -1;
                                        break;
                                    }
                                    int size2 = listM8527.size();
                                    i = 0;
                                    while (true) {
                                        if (i >= size2) {
                                            i = -1;
                                            break;
                                        }
                                        if (listM8527.get(i) == c6042) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (i == -1) {
                                        throw new C8597("Arg not found: " + c6042);
                                    }
                                    C21482.m48888(c2551, i);
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C18959) it.next()).mo17866(EnumC1763.DONT_GENERATE);
                    }
                    break;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m52609(C6041 c6041) {
        C18959 c18959M39118;
        C17973 c17973M17530 = c6041.m17530();
        if (c17973M17530.m41952() == 1 && (c18959M39118 = ((C6041) c17973M17530.m41946().get(0)).m39118()) != null) {
            return c18959M39118.getType() == EnumC24203.MOVE ? m52609(c18959M39118.m44027()) : c18959M39118;
        }
        return null;
    }
}
