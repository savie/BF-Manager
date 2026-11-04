package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8RA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19290 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f62358 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f62359 = new HashMap();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Set f62361 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f62360 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44655(C12994 c12994) {
        synchronized (this.f62358) {
            ArrayList arrayList = new ArrayList(this.f62360);
            arrayList.add(c12994);
            this.f62360 = C4681.unmodifiableList(arrayList);
            Integer num = (Integer) this.f62359.get(c12994);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f62361);
                hashSet.add(c12994);
                this.f62361 = C4681.unmodifiableSet(hashSet);
            }
            this.f62359.put(c12994, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44656(C12994 c12994) {
        synchronized (this.f62358) {
            Integer num = (Integer) this.f62359.get(c12994);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f62360);
            arrayList.remove(c12994);
            this.f62360 = C4681.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f62359.remove(c12994);
                HashSet hashSet = new HashSet(this.f62361);
                hashSet.remove(c12994);
                this.f62361 = C4681.unmodifiableSet(hashSet);
            } else {
                this.f62359.put(c12994, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final Set m44658() {
        Set set;
        synchronized (this.f62358) {
            set = this.f62361;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f62358) {
            it = this.f62360.iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m44657(C12994 c12994) {
        int iIntValue;
        synchronized (this.f62358) {
            iIntValue = this.f62359.containsKey(c12994) ? ((Integer) this.f62359.get(c12994)).intValue() : 0;
        }
        return iIntValue;
    }
}
