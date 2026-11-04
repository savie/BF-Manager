package l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4923 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f17177;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC1278 f17178;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Uri f17179;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6044 f17180;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC8911 f17181;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f17182;

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        return Collections.EMPTY_MAP;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
    }

    public C4923(C6044 c6044, InterfaceC8911 interfaceC8911) {
        this.f17180 = c6044;
        this.f17181 = interfaceC8911;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws IOException {
        close();
        InterfaceC8911 interfaceC8911 = this.f17181;
        interfaceC8911.mo23824();
        InterfaceC1278 interfaceC1278M17552 = this.f17180.m17552();
        if (interfaceC1278M17552 == null) {
            throw new IOException("Missing MPEG-TS metadata read handle");
        }
        this.f17178 = interfaceC1278M17552;
        long length = interfaceC1278M17552.length();
        long j = c25368.f81909;
        if (j < 0 || j > length) {
            throw new EOFException("MPEG-TS preview position exceeds source length");
        }
        long jMin = length - j;
        long j2 = c25368.f81910;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.f17177 = jMin;
        this.f17182 = c25368.f81909;
        this.f17179 = c25368.f81907;
        interfaceC8911.mo23824();
        return this.f17177;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f17177 == 0) {
            return -1;
        }
        InterfaceC1278 interfaceC1278 = this.f17178;
        if (interfaceC1278 == null) {
            throw new IOException("MPEG-TS data source is not open");
        }
        InterfaceC8911 interfaceC8911 = this.f17181;
        interfaceC8911.mo23824();
        int iMin = (int) Math.min(this.f17177, i2);
        interfaceC1278.mo4667(this.f17182, bArr, i, iMin);
        interfaceC8911.mo23824();
        long j = iMin;
        this.f17182 += j;
        this.f17177 -= j;
        return iMin;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f17179;
    }

    @Override // l.InterfaceC13433
    public final void close() {
        C20244.m46520(this.f17178);
        this.f17178 = null;
        this.f17179 = null;
        this.f17182 = 0L;
        this.f17177 = 0L;
    }
}
