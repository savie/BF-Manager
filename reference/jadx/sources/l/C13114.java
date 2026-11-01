package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes4.dex */
public final class C13114 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f43684;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f43685;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1263 f43686;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6763 f43687;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f43688;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f43689 = new ArrayList();

    public C13114(C1263 c1263, C6763 c6763, String str, boolean z) {
        this.f43686 = c1263;
        this.f43687 = c6763;
        this.f43688 = str;
        this.f43685 = z;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        ArrayList arrayList = this.f43689;
        if (arrayList.contains(interfaceC19706)) {
            return;
        }
        arrayList.add(interfaceC19706);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws IOException {
        if (this.f43684 != null) {
            throw new IOException("Data source is already open");
        }
        C16490 c16490M30477 = c12257.m30477();
        c16490M30477.m38757(this.f43688);
        C12257 c12257M38753 = c16490M30477.m38753();
        long j = c12257.f41017;
        if (j == -1) {
            j = C17492.FOREVER_NS;
        }
        long jMin = Math.min(X931RNG.BLOCK64_RESEED_MAX, j);
        C1263 c1263 = this.f43686;
        C15327 c15327M4584 = c1263.m4584();
        InterfaceC20723 interfaceC20723M18336 = C6763.m18336(c1263);
        long jMo36696 = c15327M4584 != null ? c15327M4584.mo36696(this.f43688, c12257.f41009, j) : -1L;
        if (jMo36696 >= jMin) {
            if (jMo36696 < j) {
                j = (jMo36696 / X931RNG.BLOCK64_RESEED_MAX) * X931RNG.BLOCK64_RESEED_MAX;
            }
            c12257M38753 = c12257M38753.m30476(0L, j);
            this.f43684 = interfaceC20723M18336.mo4000();
        } else {
            if (this.f43685) {
                interfaceC20723M18336 = this.f43687;
            }
            this.f43684 = interfaceC20723M18336.mo4000();
        }
        Iterator it = this.f43689.iterator();
        while (it.hasNext()) {
            this.f43684.mo11161((InterfaceC19706) it.next());
        }
        return this.f43684.mo9272(c12257M38753);
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC15785 interfaceC15785 = this.f43684;
        if (interfaceC15785 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC15785.read(bArr, i, i2);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        InterfaceC15785 interfaceC15785 = this.f43684;
        if (interfaceC15785 == null) {
            return null;
        }
        return interfaceC15785.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        InterfaceC15785 interfaceC15785 = this.f43684;
        return interfaceC15785 == null ? Collections.EMPTY_MAP : interfaceC15785.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        InterfaceC15785 interfaceC15785 = this.f43684;
        if (interfaceC15785 != null) {
            try {
                interfaceC15785.close();
            } finally {
                this.f43684 = null;
            }
        }
    }
}
