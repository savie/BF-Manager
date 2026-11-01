package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩷ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20687 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9503 f67280;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo46520() {
    }

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ */
    public final void mo7248(AbstractC8774 abstractC8774) {
        if (abstractC8774 != null) {
            if (this.f67280.test(abstractC8774)) {
                abstractC8774.mo1802(this);
            } else {
                mo46520();
            }
        }
    }

    public AbstractC20687(EnumSet enumSet) {
        this.f67280 = new C9503(1, enumSet);
    }
}
