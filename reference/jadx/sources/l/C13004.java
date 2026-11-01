package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C13004 implements Iterable {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f43368 = new Object();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f43367 = new HashMap();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Set f43369 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f43366 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32171(C21200 c21200) {
        synchronized (this.f43368) {
            ArrayList arrayList = new ArrayList(this.f43366);
            arrayList.add(c21200);
            this.f43366 = C0561.unmodifiableList(arrayList);
            Integer num = (Integer) this.f43367.get(c21200);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f43369);
                hashSet.add(c21200);
                this.f43369 = C0561.unmodifiableSet(hashSet);
            }
            this.f43367.put(c21200, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32172(C21200 c21200) {
        synchronized (this.f43368) {
            Integer num = (Integer) this.f43367.get(c21200);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f43366);
            arrayList.remove(c21200);
            this.f43366 = C0561.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f43367.remove(c21200);
                HashSet hashSet = new HashSet(this.f43369);
                hashSet.remove(c21200);
                this.f43369 = C0561.unmodifiableSet(hashSet);
            } else {
                this.f43367.put(c21200, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final Set m32174() {
        Set set;
        synchronized (this.f43368) {
            set = this.f43369;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f43368) {
            it = this.f43366.iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m32173(C21200 c21200) {
        int iIntValue;
        synchronized (this.f43368) {
            iIntValue = this.f43367.containsKey(c21200) ? ((Integer) this.f43367.get(c21200)).intValue() : 0;
        }
        return iIntValue;
    }
}
