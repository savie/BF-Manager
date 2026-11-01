package l;

/* JADX INFO: renamed from: l.ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3100 extends AbstractC5923 {
    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ */
    public final void mo5606(C4842 c4842, Thread thread) {
        c4842.f17014 = thread;
    }

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ */
    public final void mo5607(C4842 c4842, C4842 c4843) {
        c4842.f17013 = c4843;
    }

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5609(AbstractC14016 abstractC14016, C4842 c4842, C4842 c4843) {
        synchronized (abstractC14016) {
            if (abstractC14016.f46068 != c4842) {
                return false;
            }
            abstractC14016.f46068 = c4843;
            return true;
        }
    }

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5610(AbstractC14016 abstractC14016, C14391 c14391, C14391 c14392) {
        synchronized (abstractC14016) {
            if (abstractC14016.f46069 != c14391) {
                return false;
            }
            abstractC14016.f46069 = c14392;
            return true;
        }
    }

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5608(AbstractC14016 abstractC14016, Object obj, Object obj2) {
        synchronized (abstractC14016) {
            if (abstractC14016.f46070 != obj) {
                return false;
            }
            abstractC14016.f46070 = obj2;
            return true;
        }
    }
}
