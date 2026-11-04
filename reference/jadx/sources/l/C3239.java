package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۗۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99SU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3239 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f10555;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TreeSet f10557;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f10558;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C24123 f10559;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f10562;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f10567;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f10565 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f10556 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f10566 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f10551 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f10553 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public TreeSet f10554 = new TreeSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TreeSet f10561 = new TreeSet();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TreeSet f10560 = new TreeSet();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f10563 = -1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f10552 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f10564 = false;

    public C3239(C24123 c24123, String str, int i) {
        this.f10559 = c24123;
        this.f10562 = str;
        this.f10567 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10592(C3239 c3239) {
        ArrayList arrayList = this.f10556;
        if (arrayList.contains(c3239)) {
            return;
        }
        arrayList.add(c3239);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10593(C3239 c3239, boolean z) {
        if (c3239 == this) {
            return;
        }
        ArrayList arrayList = this.f10566;
        if (!arrayList.contains(c3239)) {
            arrayList.add(c3239);
        }
        if (z) {
            ArrayList arrayList2 = this.f10553;
            if (arrayList2.contains(c3239)) {
                return;
            }
            arrayList2.add(c3239);
            return;
        }
        ArrayList arrayList3 = this.f10551;
        if (arrayList3.contains(c3239)) {
            return;
        }
        arrayList3.add(c3239);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Set m10597() {
        Set set = this.f10558;
        if (set != null) {
            return set;
        }
        Set setM10588 = m10588();
        this.f10558 = setM10588;
        return setM10588;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private Set m10588() {
        int i;
        Set set = this.f10558;
        if (set != null) {
            return set;
        }
        if (this.f10564) {
            return Collections.EMPTY_SET;
        }
        C24123 c24123 = this.f10559;
        if (c24123.f77968 > 60 || (i = c24123.f77969) > 25) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < this.f10567; i2++) {
                if (!this.f10560.contains(Integer.valueOf(i2))) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            this.f10558 = hashSet;
            return hashSet;
        }
        this.f10564 = true;
        c24123.f77969 = i + 1;
        HashSet hashSet2 = new HashSet();
        int i3 = c24123.f77968;
        ArrayList<C3239> arrayList = this.f10566;
        c24123.f77968 = arrayList.size() + i3;
        boolean z = true;
        for (C3239 c3239 : arrayList) {
            hashSet2.addAll(c3239.m10588());
            if (z && c3239.f10558 == null) {
                z = false;
            }
        }
        c24123.f77968 -= arrayList.size();
        if (this.f10553.isEmpty()) {
            hashSet2.removeAll(this.f10561);
        }
        hashSet2.addAll(this.f10554);
        if (z) {
            this.f10558 = hashSet2;
        }
        this.f10564 = false;
        c24123.f77969--;
        return hashSet2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10590() {
        if (this.f10557 != null) {
            return;
        }
        m10595();
        Iterator it = this.f10556.iterator();
        while (it.hasNext()) {
            ((C3239) it.next()).m10590();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Set m10595() {
        TreeSet treeSet = this.f10557;
        if (treeSet != null) {
            return treeSet;
        }
        TreeSet treeSet2 = new TreeSet();
        Iterator it = this.f10566.iterator();
        while (it.hasNext()) {
            Set setM10597 = ((C3239) it.next()).m10597();
            C17359.requireNonNull(setM10597);
            treeSet2.addAll(setM10597);
        }
        this.f10557 = treeSet2;
        return treeSet2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10591(int i, HashSet hashSet) {
        m10587(i, hashSet, new HashSet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10587(int i, HashSet hashSet, HashSet hashSet2) {
        if (hashSet2.add(this)) {
            for (C3239 c3239 : this.f10556) {
                if (c3239.f10551.contains(this)) {
                    c3239.m10589(i, hashSet, hashSet2);
                } else {
                    c3239.m10587(i, hashSet, hashSet2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m10589(int i, HashSet hashSet, HashSet hashSet2) {
        if (!hashSet2.add(this)) {
            return;
        }
        C23377 c23377 = new C23377();
        c23377.f75684 = i;
        ArrayList arrayList = this.f10565;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                InterfaceC23331 interfaceC23331 = (AbstractC12384) arrayList.get(size);
                C24869.m55395(interfaceC23331, false, c23377);
                if (c23377.f75683) {
                    switch (C15917.f51723[interfaceC23331.mo30864().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            c23377.f75683 = false;
                            i = ((InterfaceC18109) interfaceC23331).mo1541();
                            c23377.f75684 = i;
                            break;
                        default:
                            hashSet.add(interfaceC23331);
                            return;
                    }
                }
            } else {
                for (C3239 c3239 : this.f10556) {
                    if (c3239.f10551.contains(this)) {
                        c3239.m10589(i, hashSet, hashSet2);
                    } else {
                        c3239.m10587(i, hashSet, hashSet2);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC12384 m10596() {
        return (AbstractC12384) this.f10565.get(0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m10594() {
        return this.f10565;
    }
}
