package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.֨ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OP */
/* JADX INFO: loaded from: classes3.dex */
public final class C1072 extends AbstractC8682 implements InterfaceC9274, RandomAccess {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C1072 f3848 = new C1072();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f3849;

    public C1072(ArrayList arrayList) {
        super(true);
        this.f3849 = arrayList;
    }

    public C1072(InterfaceC9274 interfaceC9274) {
        super(true);
        this.f3849 = new ArrayList(interfaceC9274.size());
        addAll(interfaceC9274);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m23373();
        this.f3849.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC9274
    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC9274 mo4030() {
        return super.mo23371() ? new C8464(this) : this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C1072 m4023() {
        return f3848;
    }

    public C1072() {
        super(false);
        this.f3849 = Collections.EMPTY_LIST;
    }

    public C1072(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final String get(int i) {
        List list = this.f3849;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC17084) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                list.set(i, strM40221);
            }
            return strM40221;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C23447.f75888);
        if (C11643.m29258(bArr)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // l.AbstractC8682, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f3849.size(), collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3849.size();
    }

    @Override // l.InterfaceC15987
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15987 mo4024(int i) {
        List list = this.f3849;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C1072(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String set(int i, String str) {
        m23373();
        Object obj = this.f3849.set(i, str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC17084)) {
            return new String((byte[]) obj, C23447.f75888);
        }
        return ((AbstractC17084) obj).m40221();
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m23373();
        if (collection instanceof InterfaceC9274) {
            collection = ((InterfaceC9274) collection).mo4029();
        }
        boolean zAddAll = this.f3849.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m23373();
        Object objRemove = this.f3849.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC17084)) {
            return new String((byte[]) objRemove, C23447.f75888);
        }
        return ((AbstractC17084) objRemove).m40221();
    }

    @Override // l.AbstractC8682, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m23373();
        this.f3849.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC9274
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4028(AbstractC17084 abstractC17084) {
        m23373();
        this.f3849.add(abstractC17084);
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC9274
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Object mo4025(int i) {
        return this.f3849.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17084 m4027(int i) {
        AbstractC17084 abstractC17084M40218;
        List list = this.f3849;
        Object obj = list.get(i);
        if (obj instanceof AbstractC17084) {
            abstractC17084M40218 = (AbstractC17084) obj;
        } else if (obj instanceof String) {
            abstractC17084M40218 = AbstractC17084.m40219((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            AbstractC17084 abstractC17084 = AbstractC17084.f55772;
            abstractC17084M40218 = AbstractC17084.m40218(0, bArr.length, bArr);
        }
        if (abstractC17084M40218 != obj) {
            list.set(i, abstractC17084M40218);
        }
        return abstractC17084M40218;
    }

    @Override // l.InterfaceC9274
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List mo4029() {
        return C4681.unmodifiableList(this.f3849);
    }
}
