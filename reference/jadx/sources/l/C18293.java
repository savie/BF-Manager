package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86EK */
/* JADX INFO: loaded from: classes5.dex */
public final class C18293 implements Iterable, InterfaceC22091 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final BitSet f59640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2551 f59641;

    @Override // java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18293 m42620(C2551 c2551, List list) {
        C18293 c18293 = new C18293(c2551);
        C4937.forEach(list, new C13498(1, c18293));
        return c18293;
    }

    public C18293(C2551 c2551) {
        this.f59641 = c2551;
        this.f59640 = new BitSet(c2551.m8508().size());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m42625(C21943 c21943) {
        return this.f59640.get(c21943.m49644());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42623(C21943 c21943) {
        this.f59640.set(c21943.m49644());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42622(C18293 c18293) {
        this.f59640.or(c18293.f59640);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42628(C21943 c21943) {
        this.f59640.clear(c21943.m49644());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m42627(C21943 c21943) {
        int iM49644 = c21943.m49644();
        BitSet bitSet = this.f59640;
        boolean z = bitSet.get(iM49644);
        bitSet.set(iM49644);
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18293 m42621(ArrayList arrayList) {
        C2551 c2551 = this.f59641;
        C18293 c18293M42620 = m42620(c2551, arrayList);
        C18293 c18293 = new C18293(c2551);
        BitSet bitSet = this.f59640;
        BitSet bitSet2 = c18293.f59640;
        bitSet2.or(bitSet);
        bitSet2.and(c18293M42620.f59640);
        return c18293;
    }

    public final int size() {
        return this.f59640.cardinality();
    }

    @Override // java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        BitSet bitSet = this.f59640;
        int iCardinality = bitSet.cardinality();
        return C13629.spliterator(new C21277(bitSet, iCardinality, this.f59641.m8508()), iCardinality, 17);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21943 m42626() {
        BitSet bitSet = this.f59640;
        if (bitSet.cardinality() == 1) {
            return (C21943) this.f59641.m8508().get(bitSet.nextSetBit(0));
        }
        return null;
    }

    public final C21943 getFirst() {
        return (C21943) this.f59641.m8508().get(this.f59640.nextSetBit(0));
    }

    @Override // java.lang.Iterable, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        BitSet bitSet = this.f59640;
        if (bitSet.isEmpty()) {
            return;
        }
        List listM8508 = this.f59641.m8508();
        int i = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i);
            if (iNextSetBit < 0) {
                return;
            }
            consumer.n(listM8508.get(iNextSetBit));
            i = iNextSetBit + 1;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        BitSet bitSet = this.f59640;
        return new C21277(bitSet, bitSet.cardinality(), this.f59641.m8508());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m42624() {
        BitSet bitSet = this.f59640;
        if (bitSet == null || bitSet == C20247.f65032) {
            return Collections.EMPTY_LIST;
        }
        int iCardinality = bitSet.cardinality();
        if (iCardinality == 0) {
            return Collections.EMPTY_LIST;
        }
        List listM8508 = this.f59641.m8508();
        ArrayList arrayList = new ArrayList(iCardinality);
        int i = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i);
            if (iNextSetBit < 0) {
                return arrayList;
            }
            arrayList.add((C21943) listM8508.get(iNextSetBit));
            i = iNextSetBit + 1;
        }
    }

    public final String toString() {
        return m42624().toString();
    }
}
