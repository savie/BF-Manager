package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 412K */
/* JADX INFO: loaded from: classes.dex */
public final class C24854 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f80450;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f80451;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f80452;

    public C24854(AbstractC22044 abstractC22044) {
        boolean z = C21576.f68932.getBoolean("generate_backup_file", true);
        this.f80450 = abstractC22044;
        String lowerCase = abstractC22044.mo4278().toLowerCase();
        if (z && (lowerCase.startsWith("/dev/") || lowerCase.startsWith("/proc/") || abstractC22044.getParent() == null)) {
            z = false;
        }
        if (z && abstractC22044.mo4297() && abstractC22044.mo2954() == null) {
            this.f80452 = true;
            AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(".tmp");
            try {
                if ((abstractC22044.mo4295() && !(abstractC22044 instanceof C17063)) || (abstractC22044.mo19981() && abstractC22044.mo19983().m19980())) {
                    this.f80451 = abstractC22044M49862;
                } else if (abstractC22044M49862.mo4283()) {
                    this.f80451 = abstractC22044M49862;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55383(InterfaceC5462 interfaceC5462) throws IOException {
        AbstractC22044 abstractC22044 = null;
        AbstractC22044 abstractC22045 = this.f80450;
        AbstractC22044 abstractC22046 = this.f80451;
        if (abstractC22046 == null) {
            if (abstractC22045.mo19981() || !abstractC22045.mo4297() || abstractC22045.mo2954() != null) {
                interfaceC5462.mo14029(abstractC22045);
                return;
            }
            if (abstractC22045.mo2934() && !abstractC22045.mo4281()) {
                AbstractC22044 abstractC22044M49862 = abstractC22045.m49862(".rollback");
                if (abstractC22045.mo4301(abstractC22044M49862)) {
                    abstractC22044 = abstractC22044M49862;
                }
            }
            try {
                interfaceC5462.mo14029(abstractC22045);
                if (abstractC22044 != null) {
                    abstractC22044.mo4296();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (abstractC22044 != null && abstractC22044.mo2934()) {
                    if (abstractC22045.mo2934()) {
                        abstractC22045.mo4296();
                    }
                    abstractC22044.mo4301(abstractC22045);
                }
                throw th;
            }
        }
        try {
            interfaceC5462.mo14029(abstractC22046);
            if (this.f80452) {
                abstractC22045.m49867();
            } else {
                abstractC22045.mo4296();
            }
            abstractC22046.m49845(abstractC22045, (Runnable) null);
            C14584.m35196(abstractC22045);
        } catch (Throwable th2) {
            abstractC22046.mo4296();
            throw th2;
        }
    }
}
