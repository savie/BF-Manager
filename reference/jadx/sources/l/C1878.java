package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1878 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f6307 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f6308 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f6309;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f6310;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f6311;

    public C1878(String str, String str2, List list) {
        this.f6309 = str;
        this.f6311 = str2;
        m6422(list);
    }

    public C1878(C20348 c20348) {
        this.f6309 = c20348.m46756();
        this.f6311 = c20348.m46756();
        int i = c20348.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C5607(c20348));
        }
        m6422(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6422(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            C5607 c5607 = (C5607) it.next();
            size = c5607.f19434.isEmpty() ? size + 1 : c5607.f19434.size() + size;
            this.f6308.put(c5607.f19435, c5607);
        }
        this.f6310 = size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6426(C6178 c6178) {
        c6178.m17786((CharSequence) this.f6309);
        c6178.m17786((CharSequence) this.f6311);
        Collection<C5607> collectionValues = this.f6308.values();
        c6178.writeInt(collectionValues.size());
        for (C5607 c5607 : collectionValues) {
            c6178.m17786((CharSequence) c5607.f19435);
            List<C15301> list = c5607.f19434;
            c6178.writeInt(list.size());
            for (C15301 c15301 : list) {
                c6178.writeInt(c15301.f50015);
                c6178.writeInt(c15301.f50016);
                c6178.writeInt(c15301.f50013);
                c6178.writeInt(c15301.f50019);
                c6178.writeInt(c15301.f50022);
                c6178.m17786((CharSequence) c15301.f50021);
                c6178.m17786((CharSequence) c15301.f50018);
                c6178.m17786((CharSequence) c15301.f50014);
                c6178.m17786((CharSequence) c15301.f50020);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m6427() {
        return this.f6311;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m6430() {
        return this.f6309;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m6428() {
        return this.f6310;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m6424() {
        return this.f6308.keySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5607 m6425(String str) {
        return (C5607) this.f6308.get(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6429(String str) {
        C5607 c5607 = (C5607) this.f6308.remove(str);
        if (c5607 == null) {
            return;
        }
        List list = c5607.f19434;
        this.f6310 -= list.isEmpty() ? 1 : list.size();
        this.f6307.remove(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6423(String str, Runnable runnable) {
        Iterator it = this.f6308.entrySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (C15306.m36755((String) entry.getKey()).equals(str)) {
                if (size == 0) {
                    runnable.run();
                }
                C5607 c5607 = (C5607) entry.getValue();
                size += c5607.f19434.isEmpty() ? 1 : c5607.f19434.size();
                it.remove();
            }
        }
        if (size == 0) {
            return 0;
        }
        this.f6310 -= size;
        C1170.removeIf(this.f6307, new C13064(0, str));
        return size;
    }
}
