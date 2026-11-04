package l;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: l.ۘ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: DIVX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4384 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final List f15793;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C2257 f15795;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C4384 f15796;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C24281 f15798;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C12587 f15797 = C12587.f40411;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3638 f15792 = EnumC3638.f12459;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC11600 f15799 = EnumC11600.f36426;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC11600 f15794 = EnumC11600.f36423;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14583 f15803 = C14583.f45958;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC22043 f15800 = EnumC22043.f71088;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC20792 f15809 = f15792;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f15802 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f15811 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f15805 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15801 = 2;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f15808 = 2;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f15810 = true;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12587 f15806 = f15797;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC25027 f15812 = f15799;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC25027 f15804 = f15794;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15807 = new ArrayDeque();

    static {
        InterfaceC16075 interfaceC16075M48223;
        InterfaceC16075 interfaceC16075M48224;
        C24281 c24281 = new C24281(Collections.EMPTY_LIST, Collections.EMPTY_MAP);
        f15798 = c24281;
        C2257 c2257 = new C2257(c24281);
        f15795 = c2257;
        C4384 c4384 = new C4384();
        f15796 = c4384;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C22854.f74244);
        arrayList.add(C4494.m14216(c4384.f15812));
        arrayList.add(c4384.f15803);
        ArrayList arrayList2 = c4384.f15811;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Collections.reverse(arrayList3);
            arrayList.addAll(arrayList3);
        }
        ArrayList arrayList4 = c4384.f15805;
        if (!arrayList4.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(arrayList4);
            Collections.reverse(arrayList5);
            arrayList.addAll(arrayList5);
        }
        int i = c4384.f15801;
        int i2 = c4384.f15808;
        boolean z = C12411.f39913;
        if (i != 2 || i2 != 2) {
            InterfaceC16075 interfaceC16075M48225 = AbstractC21123.f67477.m48223(i, i2);
            if (z) {
                interfaceC16075M48223 = C12411.f39911.m48223(i, i2);
                interfaceC16075M48224 = C12411.f39907.m48223(i, i2);
            } else {
                interfaceC16075M48223 = null;
                interfaceC16075M48224 = null;
            }
            arrayList.add(interfaceC16075M48225);
            if (z) {
                arrayList.add(interfaceC16075M48223);
                arrayList.add(interfaceC16075M48224);
            }
        }
        arrayList.add(C22854.f74258);
        arrayList.add(C22854.f74250);
        arrayList.add(C22854.f74243);
        arrayList.add(C22854.f74239);
        arrayList.add(C22854.f74257);
        AbstractC17567 abstractC17567Mo15008 = c4384.f15800.mo15008();
        arrayList.add(C22854.m51568(Long.TYPE, Long.class, abstractC17567Mo15008));
        arrayList.add(C22854.m51568(Double.TYPE, Double.class, C22854.f74254));
        arrayList.add(C22854.m51568(Float.TYPE, Float.class, C22854.f74240));
        arrayList.add(C12697.m31493(c4384.f15804));
        arrayList.add(C22854.f74248);
        arrayList.add(C22854.f74242);
        arrayList.add(C22854.m51569(AtomicLong.class, C22854.m51570(abstractC17567Mo15008)));
        arrayList.add(C22854.m51569(AtomicLongArray.class, C22854.m51572(abstractC17567Mo15008)));
        arrayList.add(C22854.f74262);
        arrayList.add(C22854.f74266);
        arrayList.add(C22854.f74245);
        arrayList.add(C22854.f74237);
        arrayList.add(C22854.f74263);
        arrayList.add(C22854.f74259);
        arrayList.add(C22854.f74265);
        arrayList.add(C22854.f74238);
        arrayList.add(C22854.f74247);
        arrayList.add(C22854.f74246);
        arrayList.add(C22854.f74256);
        arrayList.add(C22854.f74241);
        arrayList.add(C22854.f74260);
        arrayList.add(C22854.f74253);
        arrayList.add(C18139.f59317);
        arrayList.add(C22854.f74249);
        InterfaceC16075 interfaceC16075M51567 = C22854.m51567();
        if (interfaceC16075M51567 != null) {
            arrayList.add(interfaceC16075M51567);
        }
        arrayList.addAll(C12411.f39908);
        arrayList.add(C12172.f39147);
        arrayList.add(C22854.f74255);
        arrayList.add(new C24107(c24281));
        arrayList.add(new C23886(c24281));
        arrayList.add(c2257);
        arrayList.add(C22854.f74264);
        arrayList.add(new C1511(c24281, c4384.f15809, c4384.f15803, c2257, m13996(c4384.f15807)));
        arrayList.trimToSize();
        f15793 = C4681.unmodifiableList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m13996(AbstractCollection abstractCollection) {
        Object next;
        if (abstractCollection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (abstractCollection.size() == 1) {
            if (abstractCollection instanceof List) {
                next = ((List) abstractCollection).get(0);
            } else {
                next = abstractCollection.iterator().next();
            }
            return Collections.singletonList(next);
        }
        return C4681.unmodifiableList(Arrays.asList(abstractCollection.toArray()));
    }
}
