package l;

import java.io.IOException;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.֫ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes3.dex */
public final class C1859 implements InterfaceC10324 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f6254;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f6255 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11553 f6256;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5588 f6257;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f6258;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f6259;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LongSupplier f6260;

    public C1859(C11553 c11553, C5588 c5588, LongSupplier longSupplier, int i) {
        this.f6256 = c11553;
        this.f6257 = c5588;
        this.f6260 = longSupplier;
        this.f6254 = i;
    }

    @Override // l.InterfaceC10324
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 mo6386() {
        return this.f6257;
    }

    @Override // l.InterfaceC10324
    public final int position() {
        return this.f6258;
    }

    @Override // l.InterfaceC10324
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6387(int i, byte[] bArr) throws IOException {
        if (this.f6259) {
            throw new IllegalStateException("Hex restore delta entry is finished");
        }
        C11553.m29067(this.f6256);
        C13921.m33902(bArr.length, 0, i);
        if (i == 0) {
            return;
        }
        long j = i;
        if (((long) this.f6258) + j > this.f6254) {
            throw new IOException("Hex restore delta exceeds entry length");
        }
        long asLong = this.f6260.getAsLong();
        if (asLong < j) {
            throw new IOException("Invalid hex checkpoint delta offset");
        }
        long j2 = asLong - j;
        long j3 = this.f6255;
        if (j3 < 0) {
            this.f6255 = j2;
        } else {
            long j4 = this.f6258;
            if (j2 < j4 || j3 != j2 - j4) {
                throw new IOException("Non-contiguous hex checkpoint delta entry");
            }
        }
        this.f6258 += i;
    }

    @Override // l.InterfaceC10324
    public final void finish() throws IOException {
        if (this.f6259) {
            return;
        }
        C11553 c11553 = this.f6256;
        C11553.m29067(c11553);
        if (this.f6258 != this.f6254) {
            throw new IOException("Incomplete hex restore delta entry");
        }
        this.f6257.m16562(this.f6255);
        this.f6259 = true;
        C11553.m29066(c11553, this);
    }
}
