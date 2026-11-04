package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩹᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes.dex */
public final class C23829 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f77174;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20845 f77175;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77176 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16281 f77177;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f77178;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f77179;

    public C23829(C16281 c16281, C20845 c20845, String str, boolean z) {
        this.f77177 = c16281;
        this.f77175 = c20845;
        this.f77178 = str;
        this.f77174 = z;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        ArrayList arrayList = this.f77176;
        if (arrayList.contains(interfaceC4639)) {
            return;
        }
        arrayList.add(interfaceC4639);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws IOException {
        if (this.f77179 != null) {
            throw new IOException("Data source is already open");
        }
        C11941 c11941M56734 = c25368.m56734();
        c11941M56734.m29912(this.f77178);
        C25368 c25368M29908 = c11941M56734.m29908();
        long j = c25368.f81910;
        if (j == -1) {
            j = C25227.FOREVER_NS;
        }
        long jMin = Math.min(X931RNG.BLOCK64_RESEED_MAX, j);
        C16281 c16281 = this.f77177;
        C8367 c8367M38628 = c16281.m38628();
        InterfaceC15670 interfaceC15670M47664 = C20845.m47664(c16281);
        long jMo22530 = c8367M38628 != null ? c8367M38628.mo22530(this.f77178, c25368.f81909, j) : -1L;
        if (jMo22530 >= jMin) {
            if (jMo22530 < j) {
                j = (jMo22530 / X931RNG.BLOCK64_RESEED_MAX) * X931RNG.BLOCK64_RESEED_MAX;
            }
            c25368M29908 = c25368M29908.m56735(0L, j);
            this.f77179 = interfaceC15670M47664.mo3996();
        } else {
            if (this.f77174) {
                interfaceC15670M47664 = this.f77175;
            }
            this.f77179 = interfaceC15670M47664.mo3996();
        }
        Iterator it = this.f77176.iterator();
        while (it.hasNext()) {
            this.f77179.mo10894((InterfaceC4639) it.next());
        }
        return this.f77179.mo8326(c25368M29908);
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC13433 interfaceC13433 = this.f77179;
        if (interfaceC13433 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC13433.read(bArr, i, i2);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        InterfaceC13433 interfaceC13433 = this.f77179;
        if (interfaceC13433 == null) {
            return null;
        }
        return interfaceC13433.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        InterfaceC13433 interfaceC13433 = this.f77179;
        return interfaceC13433 == null ? Collections.EMPTY_MAP : interfaceC13433.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        InterfaceC13433 interfaceC13433 = this.f77179;
        if (interfaceC13433 != null) {
            try {
                interfaceC13433.close();
            } finally {
                this.f77179 = null;
            }
        }
    }
}
