package l;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: C5QQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5569 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14474 f19092 = new C14474(10);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12274 f19090 = new C12274();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f19091 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashSet f19089 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15381(View view) {
        C12274 c12274 = this.f19090;
        if (c12274.containsKey(view)) {
            return;
        }
        c12274.put(view, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m15386(View view) {
        return this.f19090.containsKey(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15382(View view, View view2) {
        C12274 c12274 = this.f19090;
        if (!c12274.containsKey(view) || !c12274.containsKey(view2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) c12274.getOrDefault(view, null);
        if (arrayList == null) {
            arrayList = (ArrayList) this.f19092.mo5812();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c12274.put(view, arrayList);
        }
        arrayList.add(view2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m15384(View view) {
        return (List) this.f19090.getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m15379(View view) {
        C12274 c12274 = this.f19090;
        int size = c12274.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) c12274.m30513(i);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c12274.m30510(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m15383(View view) {
        C12274 c12274 = this.f19090;
        int size = c12274.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c12274.m30513(i);
            if (arrayList != null && arrayList.contains(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15380() {
        C12274 c12274 = this.f19090;
        int size = c12274.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c12274.m30513(i);
            if (arrayList != null) {
                arrayList.clear();
                this.f19092.mo5813(arrayList);
            }
        }
        c12274.clear();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m15385() {
        ArrayList arrayList = this.f19091;
        arrayList.clear();
        HashSet hashSet = this.f19089;
        hashSet.clear();
        C12274 c12274 = this.f19090;
        int size = c12274.size();
        for (int i = 0; i < size; i++) {
            m15378(c12274.m30510(i), arrayList, hashSet);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15378(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f19090.getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m15378(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
