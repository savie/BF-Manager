package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12971 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f41582 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f41583 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C21943 f41584;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f41585;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f41586;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12971 f41587;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f41588;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    public C12971(int i, List list, List list2) {
        this.f41586 = i;
        this.f41588 = list;
        this.f41585 = list2;
        C4937.forEach(list, new C17390(1, this));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m32377() {
        return this.f41588;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m32376() {
        return this.f41588.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32364(C12971 c12971, C21943 c21943) {
        return c12971.f41585.contains(c21943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m32368() {
        return this.f41585;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32370(List list) {
        this.f41585 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32373(C21943 c21943) {
        this.f41585.remove(c21943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32372(C19684 c19684) {
        this.f41588.remove(c19684);
        c19684.m45371();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m32374() {
        return this.f41582;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m32375() {
        boolean zIsEmpty = this.f41582.isEmpty();
        List list = this.f41588;
        if (!zIsEmpty) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = this.f41582.iterator();
            while (it.hasNext()) {
                arrayList.addAll(((C12971) it.next()).f41588);
            }
            list = arrayList;
        }
        return C4681.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32371(C12971 c12971) {
        if (this.f41582.isEmpty()) {
            this.f41582 = new ArrayList();
        }
        this.f41582.add(c12971);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12971 m32383() {
        return this.f41587;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32381(C12971 c12971) {
        this.f41587 = c12971;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21943 m32379() {
        return this.f41584;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32382(C21943 c21943) {
        this.f41584 = c21943;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m32366(C12971 c12971) {
        return c12971.f41583 || c12971.f41588.isEmpty();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m32378() {
        return this.f41583;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m32367() {
        this.f41583 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap m32380() {
        List<C19684> listM32375 = m32375();
        ArrayList arrayList = new ArrayList(listM32375.size());
        for (C19684 c19684 : listM32375) {
            C21943 c21943M45368 = c19684.m45368();
            C21943 c21943M45375 = c19684.m45375();
            if (c21943M45375 == null && (c21943M45375 = C23231.m52159(C6823.m19008((Collection) c21943M45368.m49643(), (Predicate) new C19031(1, this)), false)) == null) {
                c21943M45375 = this.f41584;
            }
            arrayList.add(new C5514(c21943M45375, c21943M45368, EnumC24906.HANDLER, C15867.of(c19684)));
        }
        LinkedList linkedList = new LinkedList();
        m32369(linkedList, new ArrayList(), new LinkedList());
        ArrayList arrayList2 = new ArrayList(linkedList.size() + arrayList.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(linkedList);
        List<C5514> listUnmodifiableList = C4681.unmodifiableList(arrayList2);
        HashMap map = new HashMap();
        for (C5514 c5514 : listUnmodifiableList) {
            map.put(c5514, c5514.m16419());
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32369(LinkedList linkedList, ArrayList arrayList, LinkedList linkedList2) {
        List listM32375 = m32375();
        final HashSet hashSet = new HashSet(this.f41585);
        Iterator it = listM32375.iterator();
        while (it.hasNext()) {
            C4937.forEach(((C19684) it.next()).m45365(), new Consumer() { // from class: l.ܳ۠ۗ
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    hashSet.remove((C21943) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
        }
        C21943 c21943M52201 = C23231.m52201(new ArrayList(hashSet));
        if (c21943M52201 != null) {
            linkedList2.add(this);
            m32363(linkedList, c21943M52201, hashSet, arrayList, linkedList2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32363(LinkedList linkedList, C21943 c21943, HashSet hashSet, ArrayList arrayList, LinkedList linkedList2) {
        boolean z;
        for (C21943 c21944 : c21943.m49646()) {
            if (!arrayList.contains(c21944) && !c21944.mo17865(EnumC1763.EXC_BOTTOM_SPLITTER)) {
                arrayList.add(c21944);
                if (c21944.mo17865(EnumC1763.LOOP_END)) {
                    List<C11785> listM55414 = ((C24884) c21944.mo17862((InterfaceC2157) C11457.f36019)).m55414();
                    LinkedList linkedList3 = new LinkedList();
                    for (C11785 c11785 : listM55414) {
                        linkedList3.add(c11785.m29616());
                        for (C16721 c16721 : c11785.m29621()) {
                            if (c16721.m39488() == c21944) {
                                linkedList3.add(c16721.m39487());
                            }
                        }
                    }
                    if (!C6823.m19005((List) linkedList3, (Predicate) new C18009(1, arrayList))) {
                        linkedList.add(new C5514(c21943, c21944, EnumC24906.LOOP_EXIT));
                    }
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C23231.m52193(c21944, (C21943) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!hashSet.contains(c21944) && !z) {
                    ArrayList arrayList2 = new ArrayList(this.f41585.size() + 1);
                    arrayList2.addAll(this.f41585);
                    arrayList2.add(c21944);
                    C21943 c21943M52159 = C23231.m52159((List) arrayList2, false);
                    if (c21943M52159 != null && c21943M52159 != c21944) {
                        m32363(linkedList, c21944, hashSet, arrayList, linkedList2);
                    } else {
                        C21943 c21943M52165 = C23231.m52165(c21944, Boolean.FALSE, false);
                        if (c21943M52165.mo17865(EnumC1763.EXC_TOP_SPLITTER)) {
                            HashSet hashSet2 = new HashSet();
                            Iterator it2 = C6823.m19008((Collection) c21943M52165.m49646(), (Predicate) new C0110(2)).iterator();
                            while (it2.hasNext()) {
                                C12971 c12971 = (C12971) ((C21943) it2.next()).mo17862((InterfaceC2157) C11457.f36033);
                                if (c12971 != null && !linkedList2.contains(c12971) && c12971.f41584 == this.f41584) {
                                    hashSet2.add(c12971);
                                }
                            }
                            if (!hashSet2.isEmpty()) {
                                Iterator it3 = hashSet2.iterator();
                                while (it3.hasNext()) {
                                    ((C12971) it3.next()).m32369(linkedList, arrayList, linkedList2);
                                }
                            }
                        }
                        if (c21943M52159 == null) {
                            linkedList.add(new C5514(c21943, c21944, EnumC24906.PREMATURE_EXIT));
                        } else if (c21943M52159 == c21944) {
                            linkedList.add(new C5514(c21943, c21944, EnumC24906.TRUE_FALLTHROUGH));
                        } else {
                            throw new C8597("Unexpected code execution branch taken during try edge resolution: blk=" + c21943 + ",successor=" + c21944);
                        }
                    }
                } else {
                    m32363(linkedList, c21944, hashSet, arrayList, linkedList2);
                }
            }
        }
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2157 mo1791() {
        return C11457.f36033;
    }

    public final int hashCode() {
        return (this.f41585.hashCode() * 31) + this.f41588.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12971.class == obj.getClass()) {
            C12971 c12971 = (C12971) obj;
            if (this.f41586 == c12971.f41586 && this.f41588.equals(c12971.f41588) && this.f41585.equals(c12971.f41585)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        if (this.f41583) {
            return "Merged into " + this.f41587;
        }
        StringBuilder sb = new StringBuilder("TryCatch #");
        sb.append(this.f41586);
        sb.append(" {");
        sb.append(C4123.m13221(this.f41588, ", "));
        sb.append(", blocks: (");
        sb.append(C4123.m13221(this.f41585, ", "));
        sb.append(')');
        if (this.f41584 != null) {
            sb.append(", top: ");
            sb.append(this.f41584);
        }
        if (this.f41587 != null) {
            sb.append(", outer: #");
            sb.append(this.f41587.f41586);
        }
        if (!this.f41582.isEmpty()) {
            sb.append(", inners: ");
            sb.append(C4123.m13222(this.f41582, ", ", new C0415(6)));
        }
        sb.append(" }");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m32365(C12971 c12971) {
        return "#" + c12971.f41586;
    }
}
