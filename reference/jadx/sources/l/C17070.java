package l;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: C5QQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17070 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6785 f55738 = new C6785(10);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9086 f55736 = new C9086();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f55737 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashSet f55739 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40203(View view) {
        C9086 c9086 = this.f55736;
        if (c9086.containsKey(view)) {
            return;
        }
        c9086.put(view, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40208(View view) {
        return this.f55736.containsKey(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40204(View view, View view2) {
        C9086 c9086 = this.f55736;
        if (!c9086.containsKey(view) || !c9086.containsKey(view2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) c9086.get(view);
        if (arrayList == null) {
            arrayList = (ArrayList) this.f55738.mo18919();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c9086.put(view, arrayList);
        }
        arrayList.add(view2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m40205(View view) {
        return (List) this.f55736.get(view);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m40209(View view) {
        C9086 c9086 = this.f55736;
        int size = c9086.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) c9086.m24221(i);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c9086.m24220(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m40206(View view) {
        C9086 c9086 = this.f55736;
        int size = c9086.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c9086.m24221(i);
            if (arrayList != null && arrayList.contains(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40202() {
        C9086 c9086 = this.f55736;
        int size = c9086.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c9086.m24221(i);
            if (arrayList != null) {
                arrayList.clear();
                this.f55738.mo18920(arrayList);
            }
        }
        c9086.clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m40207() {
        ArrayList arrayList = this.f55737;
        arrayList.clear();
        HashSet hashSet = this.f55739;
        hashSet.clear();
        C9086 c9086 = this.f55736;
        int size = c9086.size();
        for (int i = 0; i < size; i++) {
            m40201(c9086.m24220(i), arrayList, hashSet);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40201(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f55736.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m40201(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
