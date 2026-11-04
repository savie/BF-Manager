package l;

import java.io.EOFException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.۫ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1WM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13315 implements InterfaceC17044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42490;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f42491;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC17044[] f42492;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC17044 f42493;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f42494;

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo32878(long j, C13961 c13961) {
        C2129.m7331(this, c13961, j);
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo32880(MessageDigest messageDigest, long j) {
        C2129.m7330(this, messageDigest, j);
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17044 mo32881() {
        return C2129.m7329(this);
    }

    public C13315(InterfaceC17044... interfaceC17044Arr) {
        if (interfaceC17044Arr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f42492 = interfaceC17044Arr;
        this.f42490 = 0;
        this.f42493 = interfaceC17044Arr[0];
        this.f42491 = 0L;
        this.f42494 = 0L;
        for (InterfaceC17044 interfaceC17044 : interfaceC17044Arr) {
            this.f42494 = interfaceC17044.size() + this.f42494;
        }
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo32882() {
        return size() - mo32877();
    }

    @Override // l.InterfaceC17044
    public final long size() {
        return this.f42494;
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo32877() {
        return this.f42491;
    }

    @Override // l.InterfaceC17044
    public final void reset() {
        this.f42490 = 0;
        InterfaceC17044[] interfaceC17044Arr = this.f42492;
        this.f42493 = interfaceC17044Arr[0];
        this.f42491 = 0L;
        for (InterfaceC17044 interfaceC17044 : interfaceC17044Arr) {
            interfaceC17044.reset();
        }
    }

    @Override // l.InterfaceC17044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32879(OutputStream outputStream, long j) throws EOFException {
        if (j > mo32882()) {
            throw new EOFException();
        }
        while (j > 0) {
            long jMin = Math.min(j, this.f42493.mo32882());
            this.f42493.mo32879(outputStream, jMin);
            j -= jMin;
            this.f42491 += jMin;
            if (this.f42493.mo32882() == 0) {
                int i = this.f42490;
                InterfaceC17044[] interfaceC17044Arr = this.f42492;
                if (i < interfaceC17044Arr.length - 1) {
                    int i2 = i + 1;
                    this.f42490 = i2;
                    this.f42493 = interfaceC17044Arr[i2];
                }
            }
        }
    }
}
