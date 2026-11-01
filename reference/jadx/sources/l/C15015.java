package l;

import java.io.EOFException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܶۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1WM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15015 implements InterfaceC19248 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f48973;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48974;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC19248[] f48975;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f48976;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC19248 f48977;

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo25491(long j, C1388 c1388) {
        C17836.m41424(this, c1388, j);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo25493(MessageDigest messageDigest, long j) {
        C17836.m41423(this, messageDigest, j);
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ InterfaceC19248 mo25494() {
        return C17836.m41421(this);
    }

    public C15015(InterfaceC19248... interfaceC19248Arr) {
        if (interfaceC19248Arr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f48975 = interfaceC19248Arr;
        this.f48974 = 0;
        this.f48977 = interfaceC19248Arr[0];
        this.f48976 = 0L;
        this.f48973 = 0L;
        for (InterfaceC19248 interfaceC19248 : interfaceC19248Arr) {
            this.f48973 = interfaceC19248.size() + this.f48973;
        }
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ܰ */
    public final long mo25495() {
        return size() - mo25490();
    }

    @Override // l.InterfaceC19248
    public final long size() {
        return this.f48973;
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final long mo25490() {
        return this.f48976;
    }

    @Override // l.InterfaceC19248
    public final void reset() {
        this.f48974 = 0;
        InterfaceC19248[] interfaceC19248Arr = this.f48975;
        this.f48977 = interfaceC19248Arr[0];
        this.f48976 = 0L;
        for (InterfaceC19248 interfaceC19248 : interfaceC19248Arr) {
            interfaceC19248.reset();
        }
    }

    @Override // l.InterfaceC19248
    /* JADX INFO: renamed from: ۙ */
    public final void mo25492(OutputStream outputStream, long j) throws EOFException {
        if (j > mo25495()) {
            throw new EOFException();
        }
        while (j > 0) {
            long jMin = Math.min(j, this.f48977.mo25495());
            this.f48977.mo25492(outputStream, jMin);
            j -= jMin;
            this.f48976 += jMin;
            if (this.f48977.mo25495() == 0) {
                int i = this.f48974;
                InterfaceC19248[] interfaceC19248Arr = this.f48975;
                if (i < interfaceC19248Arr.length - 1) {
                    int i2 = i + 1;
                    this.f48974 = i2;
                    this.f48977 = interfaceC19248Arr[i2];
                }
            }
        }
    }
}
