package l;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܰܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C13947 extends C2886 implements List {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f45897;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13947(AbstractC11830 abstractC11830, Object obj, List list, C2886 c2886) {
        super(abstractC11830, obj, list, c2886);
        this.f45897 = abstractC11830;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f10884).addAll(i, collection);
        if (zAddAll) {
            AbstractC11830.m29502(this.f45897, this.f10884.size() - size);
            if (size == 0) {
                m8688();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m8687();
        return ((List) this.f10884).get(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m8687();
        return ((List) this.f10884).set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m8687();
        boolean zIsEmpty = this.f10884.isEmpty();
        ((List) this.f10884).add(i, obj);
        AbstractC11830.m29505(this.f45897);
        if (zIsEmpty) {
            m8688();
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m8687();
        Object objRemove = ((List) this.f10884).remove(i);
        AbstractC11830.m29504(this.f45897);
        m8686();
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m8687();
        return ((List) this.f10884).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m8687();
        return ((List) this.f10884).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m8687();
        return new C4773(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m8687();
        return new C4773(this, i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m8687();
        List listSubList = ((List) this.f10884).subList(i, i2);
        C2886 c2886 = this.f10886;
        if (c2886 == null) {
            c2886 = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        AbstractC11830 abstractC11830 = this.f45897;
        Object obj = this.f10887;
        if (!z) {
            return new C13947(abstractC11830, obj, listSubList, c2886);
        }
        return new C23349(abstractC11830, obj, listSubList, c2886);
    }
}
