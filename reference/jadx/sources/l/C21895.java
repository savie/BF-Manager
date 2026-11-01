package l;

/* JADX INFO: renamed from: l.᩸᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21895 extends C5541 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC15546 m48689() {
        return (AbstractC15546) m15249(size() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48687(InterfaceC23307 interfaceC23307) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ((AbstractC15546) m15249(i)).mo6699(interfaceC23307);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48688(C21895 c21895) {
        int size;
        if (c21895 != null && (size = size()) == c21895.size()) {
            for (int i = 0; i < size; i++) {
                if (((AbstractC15546) m15249(i)).mo37182((AbstractC15546) c21895.m15249(i))) {
                }
            }
            return true;
        }
        return false;
    }
}
