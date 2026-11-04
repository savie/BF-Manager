package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֨ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V1DS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1318 extends AbstractC4301 implements Cloneable, InterfaceC5881, InterfaceC14375 {
    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C13629.spliterator(this, 1);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != size()) {
            return false;
        }
        if (set instanceof InterfaceC5881) {
            return mo13696((InterfaceC5881) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC21040 it = iterator();
        int iMo5320 = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iMo5320;
            }
            iMo5320 += it.mo5320();
            size = i;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo4844(char c) {
        return super.mo4843(c);
    }

    @Override // l.AbstractC4301, l.InterfaceC12835
    @Deprecated
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo4843(char c) {
        return mo4844(c);
    }
}
