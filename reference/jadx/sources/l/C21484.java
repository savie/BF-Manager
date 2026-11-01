package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21484 extends C15841 {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m37660((Comparable) obj, obj2);
    }

    @Override // l.C15841
    /* JADX INFO: renamed from: ֨ */
    public final void mo37659() {
        if (!m37662()) {
            for (int i = 0; i < m37664(); i++) {
                Map.Entry entryM37665 = m37665(i);
                if (((InterfaceC18930) entryM37665.getKey()).mo23408()) {
                    entryM37665.setValue(C0561.unmodifiableList((List) entryM37665.getValue()));
                }
            }
            for (Map.Entry entry : m37663()) {
                if (((InterfaceC18930) entry.getKey()).mo23408()) {
                    entry.setValue(C0561.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo37659();
    }
}
