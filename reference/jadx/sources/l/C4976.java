package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4976 extends AbstractSet {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15416 f17302;

    public C4976(C15416 c15416) {
        this.f17302 = c15416;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17302.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f17302.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C15416 c15416 = this.f17302;
        Map mapM36914 = c15416.m36914();
        if (mapM36914 != null) {
            return mapM36914.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iM36896 = c15416.m36896(entry.getKey());
        return iM36896 != -1 && C17359.equals(C15416.m36912(c15416, iM36896), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C15416 c15416 = this.f17302;
        Map mapM36914 = c15416.m36914();
        if (mapM36914 != null) {
            return mapM36914.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (c15416.m36919()) {
            return false;
        }
        int iM36903 = c15416.m36903();
        int iM32697 = C13179.m32697(entry.getKey(), entry.getValue(), iM36903, C15416.m36911(c15416), c15416.m36894(), c15416.m36902(), c15416.m36906());
        if (iM32697 == -1) {
            return false;
        }
        c15416.m36915(iM32697, iM36903);
        C15416.m36905(c15416);
        c15416.m36918();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C15416 c15416 = this.f17302;
        Map mapM36914 = c15416.m36914();
        if (mapM36914 != null) {
            return mapM36914.entrySet().iterator();
        }
        return new C7345(c15416);
    }
}
