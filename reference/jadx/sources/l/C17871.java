package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ᩳۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17871 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10111 f56578;

    public C17871(C10111 c10111) {
        this.f56578 = c10111;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        C10111 c10111 = this.f56578;
        if (c10111.f34517) {
            c10111.m25727();
        }
        return ((C15050) c10111.f34519.get(i)).f49051;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C10111 c10111 = this.f56578;
        if (c10111.f34517) {
            c10111.m25727();
        }
        return c10111.f34519.size() - 1;
    }
}
