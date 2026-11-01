package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 075F */
/* JADX INFO: loaded from: classes5.dex */
public final class C21580 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70026 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f70027;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18052 f70028;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15793 f70029;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f70030;

    public C21580(C18052 c18052) {
        this.f70028 = c18052;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        ArrayList arrayList = this.f70026;
        if (arrayList.contains(interfaceC19706)) {
            return;
        }
        arrayList.add(interfaceC19706);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws IOException {
        InterfaceC15785 c3940;
        if (this.f70030 != null || this.f70027) {
            throw new IOException("Data source is already open");
        }
        C15793 c15793M30484 = C12265.m30484(this.f70028.f57715, c12257.f41015, this.f70028.f57716, new C15231(this));
        this.f70029 = c15793M30484;
        if (this.f70027) {
            c15793M30484.close();
            throw new InterruptedIOException("HTTP media open was canceled");
        }
        String strM37558 = c15793M30484.m37558();
        if (strM37558 != null) {
            c3940 = new C3940(new C6763(this.f70028.f57715, this.f70028.f57716, new C13217(strM37558)));
        } else {
            c3940 = this.f70028.f57716.mo4000();
        }
        this.f70030 = c3940;
        if (this.f70027) {
            this.f70030 = null;
            c3940.close();
            c15793M30484.close();
            throw new InterruptedIOException("HTTP media open was canceled");
        }
        Iterator it = this.f70026.iterator();
        while (it.hasNext()) {
            c3940.mo11161((InterfaceC19706) it.next());
        }
        return c3940.mo9272(c12257);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48292(C21580 c21580, C15793 c15793) {
        c21580.f70029 = c15793;
        if (c21580.f70027) {
            c15793.close();
        }
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC15785 interfaceC15785 = this.f70030;
        if (interfaceC15785 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC15785.read(bArr, i, i2);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        InterfaceC15785 interfaceC15785 = this.f70030;
        if (interfaceC15785 == null) {
            return null;
        }
        return interfaceC15785.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        InterfaceC15785 interfaceC15785 = this.f70030;
        return interfaceC15785 == null ? Collections.EMPTY_MAP : interfaceC15785.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        this.f70027 = true;
        InterfaceC15785 interfaceC15785 = this.f70030;
        this.f70030 = null;
        if (interfaceC15785 != null) {
            try {
                interfaceC15785.close();
            } finally {
                C15793 c15793 = this.f70029;
                this.f70029 = null;
                if (c15793 != null) {
                    c15793.close();
                }
            }
        }
    }
}
