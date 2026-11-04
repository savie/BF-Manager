package l;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩸ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes.dex */
public class C23008 extends C22262 implements List {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f74670;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23008(AbstractC20024 abstractC20024, Object obj, List list, C22262 c22262) {
        super(abstractC20024, obj, list, c22262);
        this.f74670 = abstractC20024;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f71734).addAll(i, collection);
        if (zAddAll) {
            AbstractC20024.m46058(this.f74670, this.f71734.size() - size);
            if (size == 0) {
                m50314();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m50313();
        return ((List) this.f71734).get(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m50313();
        return ((List) this.f71734).set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m50313();
        boolean zIsEmpty = this.f71734.isEmpty();
        ((List) this.f71734).add(i, obj);
        AbstractC20024.m46061(this.f74670);
        if (zIsEmpty) {
            m50314();
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m50313();
        Object objRemove = ((List) this.f71734).remove(i);
        AbstractC20024.m46060(this.f74670);
        m50315();
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m50313();
        return ((List) this.f71734).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m50313();
        return ((List) this.f71734).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m50313();
        return new C11073(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m50313();
        return new C11073(this, i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m50313();
        List listSubList = ((List) this.f71734).subList(i, i2);
        C22262 c22262 = this.f71733;
        if (c22262 == null) {
            c22262 = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        AbstractC20024 abstractC20024 = this.f74670;
        Object obj = this.f71731;
        if (!z) {
            return new C23008(abstractC20024, obj, listSubList, c22262);
        }
        return new C8924(abstractC20024, obj, listSubList, c22262);
    }
}
