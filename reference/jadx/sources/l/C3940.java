package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes3.dex */
public final class C3940 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f14658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f14659;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6763 f14660;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12257 f14661;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f14662;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f14663 = new ArrayList();

    public C3940(C6763 c6763) {
        this.f14660 = c6763;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        ArrayList arrayList = this.f14663;
        if (arrayList.contains(interfaceC19706)) {
            return;
        }
        arrayList.add(interfaceC19706);
        InterfaceC15785 interfaceC15785 = this.f14662;
        if (interfaceC15785 != null) {
            interfaceC15785.mo11161(interfaceC19706);
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws Exception {
        if (this.f14662 != null) {
            throw new IOException("Data source is already open");
        }
        C6763 c6763 = this.f14660;
        String strMo4141 = c6763.f22848.mo4141(c12257);
        C16490 c16490M30477 = c12257.m30477();
        c16490M30477.m38757(strMo4141);
        c16490M30477.m38754(c12257.f41012 | 4);
        C12257 c12257M38753 = c16490M30477.m38753();
        C15327 c15327M4584 = c6763.f22849.m4584();
        this.f14661 = c12257;
        this.f14659 = 0L;
        this.f14658 = c15327M4584 != null;
        this.f14662 = c15327M4584 == null ? c6763.f22847.mo4000() : C6763.m18335(c6763, c15327M4584);
        m11417();
        try {
            return this.f14662.mo9272(c12257M38753);
        } catch (IOException | RuntimeException e) {
            if (!m11416(e)) {
                throw e;
            }
            InterfaceC15785 interfaceC15785 = this.f14662;
            if (interfaceC15785 != null) {
                try {
                    interfaceC15785.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f14662 = null;
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if (cause instanceof C7711) {
                    c6763.f22849.m4585();
                    break;
                }
            }
            this.f14658 = false;
            return m11415(c12257, e);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m11417() {
        if (this.f14662 != null) {
            Iterator it = this.f14663.iterator();
            while (it.hasNext()) {
                this.f14662.mo11161((InterfaceC19706) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m11416(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C7711) {
                return true;
            }
            if (this.f14660.f22850 && (cause instanceof C19819)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws Exception {
        InterfaceC15785 interfaceC15785 = this.f14662;
        if (interfaceC15785 == null) {
            throw new IOException("Data source is not open");
        }
        try {
            int i3 = interfaceC15785.read(bArr, i, i2);
            if (i3 > 0) {
                this.f14659 += (long) i3;
            }
            return i3;
        } catch (IOException | RuntimeException e) {
            if (!this.f14658 || !m11416(e)) {
                throw e;
            }
            C12257 c12257 = this.f14661;
            if (c12257 == null) {
                throw new IOException("Media data spec is missing");
            }
            InterfaceC15785 interfaceC15786 = this.f14662;
            if (interfaceC15786 != null) {
                try {
                    interfaceC15786.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f14662 = null;
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if (cause instanceof C7711) {
                    this.f14660.f22849.m4585();
                    break;
                }
            }
            this.f14658 = false;
            long j = this.f14659;
            long j2 = c12257.f41017;
            m11415(c12257.m30476(j, j2 != -1 ? j2 - j : -1L), e);
            int i4 = this.f14662.read(bArr, i, i2);
            if (i4 > 0) {
                this.f14659 += (long) i4;
            }
            return i4;
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        InterfaceC15785 interfaceC15785 = this.f14662;
        if (interfaceC15785 == null) {
            return null;
        }
        return interfaceC15785.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        InterfaceC15785 interfaceC15785 = this.f14662;
        return interfaceC15785 == null ? Collections.EMPTY_MAP : interfaceC15785.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        Throwable cause;
        boolean z;
        InterfaceC15785 interfaceC15785 = this.f14662;
        try {
            if (interfaceC15785 != null) {
                try {
                    interfaceC15785.close();
                } catch (IOException | RuntimeException e) {
                    if (!this.f14658 || !m11416(e)) {
                        cause = e;
                        throw e;
                    }
                    while (true) {
                        if (cause == null) {
                            z = false;
                            break;
                        } else {
                            if (cause instanceof C7711) {
                                z = true;
                                break;
                            }
                            cause = cause.getCause();
                        }
                    }
                    if (z) {
                        this.f14660.f22849.m4585();
                    }
                }
            }
            this.f14662 = null;
            this.f14661 = null;
            this.f14659 = 0L;
            this.f14658 = false;
        } catch (Throwable th) {
            this.f14662 = null;
            this.f14661 = null;
            this.f14659 = 0L;
            this.f14658 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m11415(C12257 c12257, Exception exc) {
        C6763 c6763;
        InterfaceC20723 interfaceC20723;
        Throwable cause = exc;
        while (true) {
            c6763 = this.f14660;
            if (cause == null) {
                interfaceC20723 = c6763.f22847;
                break;
            }
            if (cause instanceof C19819) {
                interfaceC20723 = c6763.f22846;
                break;
            }
            cause = cause.getCause();
        }
        InterfaceC15785 interfaceC15785Mo4000 = interfaceC20723.mo4000();
        this.f14662 = interfaceC15785Mo4000;
        m11417();
        try {
            return interfaceC15785Mo4000.mo9272(c12257);
        } catch (IOException | RuntimeException e) {
            if (interfaceC20723 != c6763.f22846 && c6763.f22850) {
                for (Throwable cause2 = e; cause2 != null; cause2 = cause2.getCause()) {
                    if (cause2 instanceof C19819) {
                        try {
                            interfaceC15785Mo4000.close();
                        } catch (IOException | RuntimeException unused) {
                        }
                        InterfaceC15785 interfaceC15785Mo4001 = c6763.f22846.mo4000();
                        this.f14662 = interfaceC15785Mo4001;
                        m11417();
                        return interfaceC15785Mo4001.mo9272(c12257);
                    }
                }
            }
            throw e;
        }
    }
}
