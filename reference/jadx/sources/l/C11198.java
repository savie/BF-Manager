package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 412K */
/* JADX INFO: loaded from: classes3.dex */
public final class C11198 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f37909;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f37910;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f37911;

    public C11198(AbstractC20745 abstractC20745) {
        boolean z = C16737.f53615.getBoolean("generate_backup_file", true);
        this.f37909 = abstractC20745;
        String lowerCase = abstractC20745.mo24643().toLowerCase();
        if (z && (lowerCase.startsWith("/dev/") || lowerCase.startsWith("/proc/") || abstractC20745.getParent() == null)) {
            z = false;
        }
        if (z && abstractC20745.mo33988() && abstractC20745.mo33968() == null) {
            this.f37911 = true;
            AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(".tmp");
            try {
                if ((abstractC20745.mo36912() && !(abstractC20745 instanceof C14705)) || (abstractC20745.mo33979() && abstractC20745.mo33969().m33967())) {
                    this.f37910 = abstractC20745M46733;
                } else if (abstractC20745M46733.mo33978()) {
                    this.f37910 = abstractC20745M46733;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28135(InterfaceC12609 interfaceC12609) throws IOException {
        AbstractC20745 abstractC20745 = null;
        AbstractC20745 abstractC20746 = this.f37909;
        AbstractC20745 abstractC20747 = this.f37910;
        if (abstractC20747 == null) {
            if (abstractC20746.mo33979() || !abstractC20746.mo33988() || abstractC20746.mo33968() != null) {
                interfaceC12609.mo4798(abstractC20746);
                return;
            }
            if (abstractC20746.mo33975() && !abstractC20746.mo33974()) {
                AbstractC20745 abstractC20745M46733 = abstractC20746.m46733(".rollback");
                if (abstractC20746.mo24646(abstractC20745M46733)) {
                    abstractC20745 = abstractC20745M46733;
                }
            }
            try {
                interfaceC12609.mo4798(abstractC20746);
                if (abstractC20745 != null) {
                    abstractC20745.mo24647();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (abstractC20745 != null && abstractC20745.mo33975()) {
                    if (abstractC20746.mo33975()) {
                        abstractC20746.mo24647();
                    }
                    abstractC20745.mo24646(abstractC20746);
                }
                throw th;
            }
        }
        try {
            interfaceC12609.mo4798(abstractC20747);
            if (this.f37911) {
                abstractC20746.m46687();
            } else {
                abstractC20746.mo24647();
            }
            abstractC20747.m46699(abstractC20746, (Runnable) null);
            C5553.m15317(abstractC20746);
        } catch (Throwable th2) {
            abstractC20747.mo24647();
            throw th2;
        }
    }
}
