package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5UX */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23700 extends AbstractC14528 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f76681;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f76682;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f76683;

    public AbstractC23700(int i) {
        C20296.m45806(i, "initialCapacity");
        this.f76681 = new Object[i];
        this.f76682 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52159(int i) {
        Object[] objArr = this.f76681;
        int iM34968 = AbstractC14528.m34968(objArr.length, this.f76682 + i);
        if (iM34968 > objArr.length || this.f76683) {
            this.f76681 = Arrays.copyOf(this.f76681, iM34968);
            this.f76683 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52160(int i, Object[] objArr) {
        C6019.m16341(i, objArr);
        m52159(i);
        System.arraycopy(objArr, 0, this.f76681, this.f76682, i);
        this.f76682 += i;
    }

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC14528 mo14318(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m52159(collection.size());
            if (collection instanceof AbstractC1826) {
                this.f76682 = ((AbstractC1826) collection).mo5968(this.f76682, this.f76681);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo13308(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m52163(Object obj) {
        m52161(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52162(List list) {
        mo14318((Iterable) list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52161(Object obj) {
        obj.getClass();
        m52159(1);
        Object[] objArr = this.f76681;
        int i = this.f76682;
        this.f76682 = i + 1;
        objArr[i] = obj;
    }
}
