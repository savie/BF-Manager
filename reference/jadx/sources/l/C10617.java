package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10617 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f36280;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f36282;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36284;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f36281 = new HashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f36283 = new HashMap();

    public C10617(String str, String str2, List list) {
        this.f36282 = str;
        this.f36280 = str2;
        m26794(list);
    }

    public C10617(C17367 c17367) {
        this.f36282 = c17367.m40442();
        this.f36280 = c17367.m40442();
        int i = c17367.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C9206(c17367));
        }
        m26794(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26794(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            C9206 c9206 = (C9206) it.next();
            size = c9206.f31291.isEmpty() ? size + 1 : c9206.f31291.size() + size;
            this.f36283.put(c9206.f31292, c9206);
        }
        this.f36284 = size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26799(C11018 c11018) {
        c11018.m27782((CharSequence) this.f36282);
        c11018.m27782((CharSequence) this.f36280);
        Collection<C9206> collectionValues = this.f36283.values();
        c11018.writeInt(collectionValues.size());
        for (C9206 c9206 : collectionValues) {
            c11018.m27782((CharSequence) c9206.f31292);
            List<C8500> list = c9206.f31291;
            c11018.writeInt(list.size());
            for (C8500 c8500 : list) {
                c11018.writeInt(c8500.f29469);
                c11018.writeInt(c8500.f29468);
                c11018.writeInt(c8500.f29471);
                c11018.writeInt(c8500.f29470);
                c11018.writeInt(c8500.f29473);
                c11018.m27782((CharSequence) c8500.f29472);
                c11018.m27782((CharSequence) c8500.f29466);
                c11018.m27782((CharSequence) c8500.f29467);
                c11018.m27782((CharSequence) c8500.f29465);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m26800() {
        return this.f36280;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m26795() {
        return this.f36282;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m26801() {
        return this.f36284;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m26797() {
        return this.f36283.keySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9206 m26798(String str) {
        return (C9206) this.f36283.get(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26802(String str) {
        C9206 c9206 = (C9206) this.f36283.remove(str);
        if (c9206 == null) {
            return;
        }
        List list = c9206.f31291;
        this.f36284 -= list.isEmpty() ? 1 : list.size();
        this.f36281.remove(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26796(String str, Runnable runnable) {
        Iterator it = this.f36283.entrySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (C22627.m50154((String) entry.getKey()).equals(str)) {
                if (size == 0) {
                    runnable.run();
                }
                C9206 c9206 = (C9206) entry.getValue();
                size += c9206.f31291.isEmpty() ? 1 : c9206.f31291.size();
                it.remove();
            }
        }
        if (size == 0) {
            return 0;
        }
        this.f36284 -= size;
        C9030.removeIf(this.f36281, new C19789(0, str));
        return size;
    }
}
