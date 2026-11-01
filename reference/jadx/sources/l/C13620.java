package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13620 extends AbstractSet {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0918 f44938;

    public C13620(C0918 c0918) {
        this.f44938 = c0918;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f44938.f3678;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4446(this.f44938);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C22086 c22086M3643;
        if (obj instanceof Map.Entry) {
            C0918 c0918 = this.f44938;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C22086 c22086 = null;
            if (key != null) {
                try {
                    c22086M3643 = c0918.m3643(key, false);
                } catch (ClassCastException unused) {
                    c22086M3643 = null;
                }
            } else {
                c22086M3643 = null;
            }
            if (c22086M3643 != null && C13638.equals(c22086M3643.f71549, entry.getValue())) {
                c22086 = c22086M3643;
            }
            if (c22086 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C22086 c22086M3643;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C0918 c0918 = this.f44938;
            C22086 c22086 = null;
            if (key != null) {
                try {
                    c22086M3643 = c0918.m3643(key, false);
                } catch (ClassCastException unused) {
                    c22086M3643 = null;
                }
            } else {
                c22086M3643 = null;
            }
            if (c22086M3643 != null && C13638.equals(c22086M3643.f71549, entry.getValue())) {
                c22086 = c22086M3643;
            }
            if (c22086 != null) {
                c0918.m3644(c22086, true);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f44938.clear();
    }
}
