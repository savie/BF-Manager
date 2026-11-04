package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes3.dex */
public final class C3691 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f12687;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C25368 f12688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12689 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20845 f12690;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f12691;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f12692;

    public C3691(C20845 c20845) {
        this.f12690 = c20845;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        ArrayList arrayList = this.f12689;
        if (arrayList.contains(interfaceC4639)) {
            return;
        }
        arrayList.add(interfaceC4639);
        InterfaceC13433 interfaceC13433 = this.f12691;
        if (interfaceC13433 != null) {
            interfaceC13433.mo10894(interfaceC4639);
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws Exception {
        if (this.f12691 != null) {
            throw new IOException("Data source is already open");
        }
        C20845 c20845 = this.f12690;
        String strMo16748 = c20845.f66740.mo16748(c25368);
        C11941 c11941M56734 = c25368.m56734();
        c11941M56734.m29912(strMo16748);
        c11941M56734.m29909(c25368.f81906 | 4);
        C25368 c25368M29908 = c11941M56734.m29908();
        C8367 c8367M38628 = c20845.f66738.m38628();
        this.f12688 = c25368;
        this.f12687 = 0L;
        this.f12692 = c8367M38628 != null;
        this.f12691 = c8367M38628 == null ? c20845.f66739.mo3996() : C20845.m47666(c20845, c8367M38628);
        m12005();
        try {
            return this.f12691.mo8326(c25368M29908);
        } catch (IOException | RuntimeException e) {
            if (!m12004(e)) {
                throw e;
            }
            InterfaceC13433 interfaceC13433 = this.f12691;
            if (interfaceC13433 != null) {
                try {
                    interfaceC13433.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f12691 = null;
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if (cause instanceof C22539) {
                    c20845.f66738.m38632();
                    break;
                }
            }
            this.f12692 = false;
            return m12003(c25368, e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m12005() {
        if (this.f12691 != null) {
            Iterator it = this.f12689.iterator();
            while (it.hasNext()) {
                this.f12691.mo10894((InterfaceC4639) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m12004(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C22539) {
                return true;
            }
            if (this.f12690.f66742 && (cause instanceof C9634)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws Exception {
        InterfaceC13433 interfaceC13433 = this.f12691;
        if (interfaceC13433 == null) {
            throw new IOException("Data source is not open");
        }
        try {
            int i3 = interfaceC13433.read(bArr, i, i2);
            if (i3 > 0) {
                this.f12687 += (long) i3;
            }
            return i3;
        } catch (IOException | RuntimeException e) {
            if (!this.f12692 || !m12004(e)) {
                throw e;
            }
            C25368 c25368 = this.f12688;
            if (c25368 == null) {
                throw new IOException("Media data spec is missing");
            }
            InterfaceC13433 interfaceC13434 = this.f12691;
            if (interfaceC13434 != null) {
                try {
                    interfaceC13434.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f12691 = null;
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if (cause instanceof C22539) {
                    this.f12690.f66738.m38632();
                    break;
                }
            }
            this.f12692 = false;
            long j = this.f12687;
            long j2 = c25368.f81910;
            m12003(c25368.m56735(j, j2 != -1 ? j2 - j : -1L), e);
            int i4 = this.f12691.read(bArr, i, i2);
            if (i4 > 0) {
                this.f12687 += (long) i4;
            }
            return i4;
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        InterfaceC13433 interfaceC13433 = this.f12691;
        if (interfaceC13433 == null) {
            return null;
        }
        return interfaceC13433.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        InterfaceC13433 interfaceC13433 = this.f12691;
        return interfaceC13433 == null ? Collections.EMPTY_MAP : interfaceC13433.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        Throwable cause;
        boolean z;
        InterfaceC13433 interfaceC13433 = this.f12691;
        try {
            if (interfaceC13433 != null) {
                try {
                    interfaceC13433.close();
                } catch (IOException | RuntimeException e) {
                    if (!this.f12692 || !m12004(e)) {
                        cause = e;
                        throw e;
                    }
                    while (true) {
                        if (cause == null) {
                            z = false;
                            break;
                        } else {
                            if (cause instanceof C22539) {
                                z = true;
                                break;
                            }
                            cause = cause.getCause();
                        }
                    }
                    if (z) {
                        this.f12690.f66738.m38632();
                    }
                }
            }
            this.f12691 = null;
            this.f12688 = null;
            this.f12687 = 0L;
            this.f12692 = false;
        } catch (Throwable th) {
            this.f12691 = null;
            this.f12688 = null;
            this.f12687 = 0L;
            this.f12692 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m12003(C25368 c25368, Exception exc) {
        C20845 c20845;
        InterfaceC15670 interfaceC15670;
        Throwable cause = exc;
        while (true) {
            c20845 = this.f12690;
            if (cause == null) {
                interfaceC15670 = c20845.f66739;
                break;
            }
            if (cause instanceof C9634) {
                interfaceC15670 = c20845.f66741;
                break;
            }
            cause = cause.getCause();
        }
        InterfaceC13433 interfaceC13433Mo3996 = interfaceC15670.mo3996();
        this.f12691 = interfaceC13433Mo3996;
        m12005();
        try {
            return interfaceC13433Mo3996.mo8326(c25368);
        } catch (IOException | RuntimeException e) {
            if (interfaceC15670 != c20845.f66741 && c20845.f66742) {
                for (Throwable cause2 = e; cause2 != null; cause2 = cause2.getCause()) {
                    if (cause2 instanceof C9634) {
                        try {
                            interfaceC13433Mo3996.close();
                        } catch (IOException | RuntimeException unused) {
                        }
                        InterfaceC13433 interfaceC13433Mo3997 = c20845.f66741.mo3996();
                        this.f12691 = interfaceC13433Mo3997;
                        m12005();
                        return interfaceC13433Mo3997.mo8326(c25368);
                    }
                }
            }
            throw e;
        }
    }
}
