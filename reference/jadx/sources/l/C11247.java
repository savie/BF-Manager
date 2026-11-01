package l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C11247 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f38040;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f38041;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6265 f38042;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC3153 f38043;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0413 f38044;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Uri f38045;

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        return Collections.EMPTY_MAP;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
    }

    public C11247(C6265 c6265, InterfaceC0413 interfaceC0413) {
        this.f38042 = c6265;
        this.f38044 = interfaceC0413;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws IOException {
        close();
        InterfaceC0413 interfaceC0413 = this.f38044;
        interfaceC0413.mo2170();
        InterfaceC3153 interfaceC3153M17348 = this.f38042.m17348();
        if (interfaceC3153M17348 == null) {
            throw new IOException("Missing MPEG-TS metadata read handle");
        }
        this.f38043 = interfaceC3153M17348;
        long length = interfaceC3153M17348.length();
        long j = c12257.f41009;
        if (j < 0 || j > length) {
            throw new EOFException("MPEG-TS preview position exceeds source length");
        }
        long jMin = length - j;
        long j2 = c12257.f41017;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.f38041 = jMin;
        this.f38040 = c12257.f41009;
        this.f38045 = c12257.f41015;
        interfaceC0413.mo2170();
        return this.f38041;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f38041 == 0) {
            return -1;
        }
        InterfaceC3153 interfaceC3153 = this.f38043;
        if (interfaceC3153 == null) {
            throw new IOException("MPEG-TS data source is not open");
        }
        InterfaceC0413 interfaceC0413 = this.f38044;
        interfaceC0413.mo2170();
        int iMin = (int) Math.min(this.f38041, i2);
        interfaceC3153.mo9547(this.f38040, bArr, i, iMin);
        interfaceC0413.mo2170();
        long j = iMin;
        this.f38040 += j;
        this.f38041 -= j;
        return iMin;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f38045;
    }

    @Override // l.InterfaceC15785
    public final void close() {
        C19431.m44468(this.f38043);
        this.f38043 = null;
        this.f38045 = null;
        this.f38040 = 0L;
        this.f38041 = 0L;
    }
}
