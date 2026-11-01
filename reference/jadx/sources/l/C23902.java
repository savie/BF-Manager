package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes.dex */
public final class C23902 implements InterfaceC23218 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Appendable f77445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19669 f77446;

    public C23902(Appendable appendable, C19669 c19669) {
        this.f77445 = appendable;
        this.f77446 = c19669;
        c19669.m44801();
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ܰ */
    public final void mo20359(AbstractC14730 abstractC14730, int i) {
        try {
            abstractC14730.mo2842(this.f77445, i, this.f77446);
        } catch (IOException e) {
            throw new C4851(e);
        }
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ۙ */
    public final void mo20358(AbstractC14730 abstractC14730, int i) {
        if (abstractC14730.mo2863().equals("#text")) {
            return;
        }
        try {
            abstractC14730.mo2861(this.f77445, i, this.f77446);
        } catch (IOException e) {
            throw new C4851(e);
        }
    }
}
