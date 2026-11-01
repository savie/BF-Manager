package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩸۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21463 extends AbstractC8202 implements InterfaceC17935, RandomAccess {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C21463 f69766 = new C21463();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f69767;

    public C21463(ArrayList arrayList) {
        super(true);
        this.f69767 = arrayList;
    }

    public C21463(InterfaceC17935 interfaceC17935) {
        super(true);
        this.f69767 = new ArrayList(interfaceC17935.size());
        addAll(interfaceC17935);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m21491();
        this.f69767.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC17935
    /* JADX INFO: renamed from: ۗܰ */
    public final InterfaceC17935 mo21382() {
        return super.mo6484() ? new C8120(this) : this;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C21463 m48084() {
        return f69766;
    }

    public C21463() {
        super(false);
        this.f69767 = Collections.EMPTY_LIST;
    }

    public C21463(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final String get(int i) {
        List list = this.f69767;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC23725) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                list.set(i, strM52260);
            }
            return strM52260;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C9779.f33479);
        if (C6003.m16293(bArr)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // l.AbstractC8202, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f69767.size(), collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f69767.size();
    }

    @Override // l.InterfaceC2016
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2016 mo3072(int i) {
        List list = this.f69767;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C21463(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String set(int i, String str) {
        m21491();
        Object obj = this.f69767.set(i, str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC23725)) {
            return new String((byte[]) obj, C9779.f33479);
        }
        return ((AbstractC23725) obj).m52260();
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m21491();
        if (collection instanceof InterfaceC17935) {
            collection = ((InterfaceC17935) collection).mo21385();
        }
        boolean zAddAll = this.f69767.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21491();
        Object objRemove = this.f69767.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC23725)) {
            return new String((byte[]) objRemove, C9779.f33479);
        }
        return ((AbstractC23725) objRemove).m52260();
    }

    @Override // l.AbstractC8202, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m21491();
        this.f69767.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC17935
    /* JADX INFO: renamed from: ۙ */
    public final void mo21383(AbstractC23725 abstractC23725) {
        m21491();
        this.f69767.add(abstractC23725);
        ((AbstractList) this).modCount++;
    }

    @Override // l.InterfaceC17935
    /* JADX INFO: renamed from: ۠ */
    public final Object mo21384(int i) {
        return this.f69767.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23725 m48086(int i) {
        AbstractC23725 abstractC23725M52255;
        List list = this.f69767;
        Object obj = list.get(i);
        if (obj instanceof AbstractC23725) {
            abstractC23725M52255 = (AbstractC23725) obj;
        } else if (obj instanceof String) {
            abstractC23725M52255 = AbstractC23725.m52256((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            AbstractC23725 abstractC23725 = AbstractC23725.f76778;
            abstractC23725M52255 = AbstractC23725.m52255(0, bArr.length, bArr);
        }
        if (abstractC23725M52255 != obj) {
            list.set(i, abstractC23725M52255);
        }
        return abstractC23725M52255;
    }

    @Override // l.InterfaceC17935
    /* JADX INFO: renamed from: ۢ */
    public final List mo21385() {
        return C0561.unmodifiableList(this.f69767);
    }
}
