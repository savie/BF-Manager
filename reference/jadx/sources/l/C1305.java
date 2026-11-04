package l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C1305 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f4690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4288 f4691;

    public C1305(InterfaceC4288 interfaceC4288, List list) {
        this.f4691 = interfaceC4288;
        this.f4690 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return C19906.m45835(this.f4691, this.f4690.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4690.size();
    }
}
