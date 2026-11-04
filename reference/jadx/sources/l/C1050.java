package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C1050 extends C22636 {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m51021((Comparable) obj, obj2);
    }

    @Override // l.C22636
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo3949() {
        if (!m51023()) {
            for (int i = 0; i < m51024(); i++) {
                Map.Entry entryM51025 = m51025(i);
                if (((InterfaceC2585) entryM51025.getKey()).mo8649()) {
                    entryM51025.setValue(C4681.unmodifiableList((List) entryM51025.getValue()));
                }
            }
            for (Map.Entry entry : m51026()) {
                if (((InterfaceC2585) entry.getKey()).mo8649()) {
                    entry.setValue(C4681.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo3949();
    }
}
