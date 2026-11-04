package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.ܶ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16448 extends AbstractC4450 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9802 f53340;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23908 f53341;

    public C16448(C23908 c23908, InterfaceC9802 interfaceC9802) {
        this.f53340 = interfaceC9802;
        this.f53341 = c23908;
    }

    @Override // l.AbstractC4450
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14147() {
        C18117 c18117 = (C18117) this.f53340;
        if (!c18117.hasNext()) {
            m14148();
            return null;
        }
        C2346 c2346 = (C2346) c18117.next();
        if (!this.f53341.f77415.f7568.mo11449((Comparable) c2346.f7569)) {
            m14148();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c2346.f7569, c2346);
    }
}
