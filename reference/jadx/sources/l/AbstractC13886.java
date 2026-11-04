package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.۬۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13886 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14676 f44037;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo33830() {
    }

    @Override // l.C23174
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5474(AbstractC8036 abstractC8036) {
        if (abstractC8036 != null) {
            if (this.f44037.test(abstractC8036)) {
                abstractC8036.mo2284(this);
            } else {
                mo33830();
            }
        }
    }

    public AbstractC13886(EnumSet enumSet) {
        this.f44037 = new C14676(3, enumSet);
    }
}
