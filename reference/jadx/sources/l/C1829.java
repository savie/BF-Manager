package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.֫۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99SU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1829 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TreeSet f7003;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f7007;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f7010;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13970 f7014;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f7018;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f7019;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f7004 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f7008 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f7015 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f7005 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f7006 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TreeSet f7011 = new TreeSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TreeSet f7017 = new TreeSet();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public TreeSet f7013 = new TreeSet();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f7016 = -1;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f7009 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7012 = false;

    public C1829(C13970 c13970, String str, int i) {
        this.f7014 = c13970;
        this.f7007 = str;
        this.f7019 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5978(C1829 c1829) {
        ArrayList arrayList = this.f7008;
        if (arrayList.contains(c1829)) {
            return;
        }
        arrayList.add(c1829);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5979(C1829 c1829, boolean z) {
        if (c1829 == this) {
            return;
        }
        ArrayList arrayList = this.f7015;
        if (!arrayList.contains(c1829)) {
            arrayList.add(c1829);
        }
        if (z) {
            ArrayList arrayList2 = this.f7006;
            if (arrayList2.contains(c1829)) {
                return;
            }
            arrayList2.add(c1829);
            return;
        }
        ArrayList arrayList3 = this.f7005;
        if (arrayList3.contains(c1829)) {
            return;
        }
        arrayList3.add(c1829);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Set m5975() {
        Set set = this.f7018;
        if (set != null) {
            return set;
        }
        Set setM5974 = m5974();
        this.f7018 = setM5974;
        return setM5974;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private Set m5974() {
        int i;
        Set set = this.f7018;
        if (set != null) {
            return set;
        }
        if (this.f7012) {
            return Collections.EMPTY_SET;
        }
        C13970 c13970 = this.f7014;
        if (c13970.f45947 > 60 || (i = c13970.f45948) > 25) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < this.f7019; i2++) {
                if (!this.f7013.contains(Integer.valueOf(i2))) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            this.f7018 = hashSet;
            return hashSet;
        }
        this.f7012 = true;
        c13970.f45948 = i + 1;
        HashSet hashSet2 = new HashSet();
        int i3 = c13970.f45947;
        ArrayList<C1829> arrayList = this.f7015;
        c13970.f45947 = arrayList.size() + i3;
        boolean z = true;
        for (C1829 c1829 : arrayList) {
            hashSet2.addAll(c1829.m5974());
            if (z && c1829.f7018 == null) {
                z = false;
            }
        }
        c13970.f45947 -= arrayList.size();
        if (this.f7006.isEmpty()) {
            hashSet2.removeAll(this.f7017);
        }
        hashSet2.addAll(this.f7011);
        if (z) {
            this.f7018 = hashSet2;
        }
        this.f7012 = false;
        c13970.f45948--;
        return hashSet2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5976() {
        if (this.f7003 != null) {
            return;
        }
        m5980();
        Iterator it = this.f7008.iterator();
        while (it.hasNext()) {
            ((C1829) it.next()).m5976();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set m5980() {
        TreeSet treeSet = this.f7003;
        if (treeSet != null) {
            return treeSet;
        }
        TreeSet treeSet2 = new TreeSet();
        Iterator it = this.f7015.iterator();
        while (it.hasNext()) {
            Set setM5975 = ((C1829) it.next()).m5975();
            C13638.requireNonNull(setM5975);
            treeSet2.addAll(setM5975);
        }
        this.f7003 = treeSet2;
        return treeSet2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5977(int i, HashSet hashSet) {
        m5972(i, hashSet, new HashSet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5972(int i, HashSet hashSet, HashSet hashSet2) {
        if (hashSet2.add(this)) {
            for (C1829 c1829 : this.f7008) {
                if (c1829.f7005.contains(this)) {
                    c1829.m5973(i, hashSet, hashSet2);
                } else {
                    c1829.m5972(i, hashSet, hashSet2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m5973(int i, HashSet hashSet, HashSet hashSet2) {
        if (!hashSet2.add(this)) {
            return;
        }
        C14531 c14531 = new C14531();
        c14531.f47593 = i;
        ArrayList arrayList = this.f7004;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                InterfaceC1594 interfaceC1594 = (AbstractC3384) arrayList.get(size);
                C17352.m40379(interfaceC1594, false, c14531);
                if (c14531.f47592) {
                    switch (C23703.f76688[interfaceC1594.mo5435().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            c14531.f47592 = false;
                            i = ((InterfaceC1157) interfaceC1594).mo1144();
                            c14531.f47593 = i;
                            break;
                        default:
                            hashSet.add(interfaceC1594);
                            return;
                    }
                }
            } else {
                for (C1829 c1829 : this.f7008) {
                    if (c1829.f7005.contains(this)) {
                        c1829.m5973(i, hashSet, hashSet2);
                    } else {
                        c1829.m5972(i, hashSet, hashSet2);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC3384 m5982() {
        return (AbstractC3384) this.f7004.get(0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m5981() {
        return this.f7004;
    }
}
