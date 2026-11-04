package l;

/* JADX INFO: renamed from: l.ܶ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15724 extends C12763 {
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC17216 m37632() {
        return (AbstractC17216) m31593(size() - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37630(InterfaceC16470 interfaceC16470) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ((AbstractC17216) m31593(i)).mo7779(interfaceC16470);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37631(C15724 c15724) {
        int size;
        if (c15724 != null && (size = size()) == c15724.size()) {
            for (int i = 0; i < size; i++) {
                if (((AbstractC17216) m31593(i)).mo7780((AbstractC17216) c15724.m31593(i))) {
                }
            }
            return true;
        }
        return false;
    }
}
