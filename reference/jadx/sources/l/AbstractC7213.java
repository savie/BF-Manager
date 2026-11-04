package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5UX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7213 extends AbstractC13924 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f23798;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f23799;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f23800;

    public AbstractC7213(int i) {
        C19278.m44623(i, "initialCapacity");
        this.f23798 = new Object[i];
        this.f23799 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19802(int i) {
        Object[] objArr = this.f23798;
        int iM33910 = AbstractC13924.m33910(objArr.length, this.f23799 + i);
        if (iM33910 > objArr.length || this.f23800) {
            this.f23798 = Arrays.copyOf(this.f23798, iM33910);
            this.f23800 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19804(int i, Object[] objArr) {
        C7566.m20662(i, objArr);
        m19802(i);
        System.arraycopy(objArr, 0, this.f23798, this.f23799, i);
        this.f23799 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13924 mo19803(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m19802(collection.size());
            if (collection instanceof AbstractC4911) {
                this.f23799 = ((AbstractC4911) collection).mo6619(this.f23799, this.f23798);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo24710(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m19807(Object obj) {
        m19805(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m19806(List list) {
        mo19803((Iterable) list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19805(Object obj) {
        obj.getClass();
        m19802(1);
        Object[] objArr = this.f23798;
        int i = this.f23799;
        this.f23799 = i + 1;
        objArr[i] = obj;
    }
}
