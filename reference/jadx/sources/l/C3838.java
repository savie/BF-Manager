package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L73O */
/* JADX INFO: loaded from: classes3.dex */
public final class C3838 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6661 f14309;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f14310;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12257 f14312;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f14313;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f14311 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f14314 = -1;

    public C3838(C6661 c6661) {
        this.f14309 = c6661;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        ArrayList arrayList = this.f14311;
        if (arrayList.contains(interfaceC19706)) {
            return;
        }
        arrayList.add(interfaceC19706);
        InterfaceC15785 interfaceC15785 = this.f14313;
        if (interfaceC15785 != null) {
            interfaceC15785.mo11161(interfaceC19706);
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws IOException {
        if (this.f14313 != null) {
            throw new IOException("Data source is already open");
        }
        C6661 c6661 = this.f14309;
        long jM46814 = c6661.f22512.m46814();
        InterfaceC15785 interfaceC15785Mo4000 = (jM46814 >= 0 ? c6661.f22513 : c6661.f22514).mo4000();
        this.f14313 = interfaceC15785Mo4000;
        this.f14312 = c12257;
        this.f14310 = 0L;
        this.f14314 = jM46814;
        Iterator it = this.f14311.iterator();
        while (it.hasNext()) {
            interfaceC15785Mo4000.mo11161((InterfaceC19706) it.next());
        }
        return (jM46814 < 0 || c6661.f22512.m46813(jM46814)) ? interfaceC15785Mo4000.mo9272(c12257) : m11160();
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InterfaceC15785 interfaceC15785 = this.f14313;
        if (interfaceC15785 == null) {
            throw new IOException("Data source is not open");
        }
        if (this.f14314 >= 0 && !this.f14309.f22512.m46813(this.f14314)) {
            C12257 c12257 = this.f14312;
            if (c12257 != null) {
                long j = c12257.f41017;
                if (j != -1 && this.f14310 >= j) {
                    return -1;
                }
            }
            m11160();
            interfaceC15785 = this.f14313;
        }
        int i3 = interfaceC15785.read(bArr, i, i2);
        if (i3 > 0) {
            this.f14310 += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private long m11160() throws IOException {
        C12257 c12257 = this.f14312;
        if (c12257 == null) {
            throw new IOException("HLS media data spec is missing");
        }
        InterfaceC15785 interfaceC15785 = this.f14313;
        if (interfaceC15785 != null) {
            try {
                interfaceC15785.close();
            } catch (IOException | RuntimeException unused) {
            }
        }
        InterfaceC15785 interfaceC15785Mo4000 = this.f14309.f22514.mo4000();
        this.f14313 = interfaceC15785Mo4000;
        this.f14314 = -1L;
        Iterator it = this.f14311.iterator();
        while (it.hasNext()) {
            interfaceC15785Mo4000.mo11161((InterfaceC19706) it.next());
        }
        long j = this.f14310;
        long j2 = c12257.f41017;
        return interfaceC15785Mo4000.mo9272(c12257.m30476(j, j2 != -1 ? j2 - j : -1L));
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        InterfaceC15785 interfaceC15785 = this.f14313;
        if (interfaceC15785 == null) {
            return null;
        }
        return interfaceC15785.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        InterfaceC15785 interfaceC15785 = this.f14313;
        return interfaceC15785 == null ? Collections.EMPTY_MAP : interfaceC15785.mo9273();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC15785
    public final void close() {
        InterfaceC15785 interfaceC15785 = this.f14313;
        if (interfaceC15785 != null) {
            try {
                interfaceC15785.close();
            } finally {
                this.f14313 = null;
                this.f14312 = null;
                this.f14310 = 0L;
                this.f14314 = -1L;
            }
        }
    }
}
