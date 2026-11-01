package l;

import java.io.IOException;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ܿۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17259 implements InterfaceC22335 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5970 f54993;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final LongSupplier f54994;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f54995;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f54996;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f54997 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f54998;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12321 f54999;

    public C17259(C5970 c5970, C12321 c12321, C20559 c20559, int i) {
        this.f54993 = c5970;
        this.f54999 = c12321;
        this.f54994 = c20559;
        this.f54995 = i;
    }

    @Override // l.InterfaceC22335
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745 mo40224() {
        return this.f54999;
    }

    @Override // l.InterfaceC22335
    public final int position() {
        return this.f54996;
    }

    @Override // l.InterfaceC22335
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo40225(int i, byte[] bArr) throws IOException {
        if (this.f54998) {
            throw new IllegalStateException("Hex restore delta entry is finished");
        }
        C5970.m16262(this.f54993);
        C22979.m50824(bArr.length, 0, i);
        if (i == 0) {
            return;
        }
        long j = i;
        if (((long) this.f54996) + j > this.f54995) {
            throw new IOException("Hex restore delta exceeds entry length");
        }
        long asLong = this.f54994.getAsLong();
        if (asLong < j) {
            throw new IOException("Invalid hex checkpoint delta offset");
        }
        long j2 = asLong - j;
        long j3 = this.f54997;
        if (j3 < 0) {
            this.f54997 = j2;
        } else {
            long j4 = this.f54996;
            if (j2 < j4 || j3 != j2 - j4) {
                throw new IOException("Non-contiguous hex checkpoint delta entry");
            }
        }
        this.f54996 += i;
    }

    @Override // l.InterfaceC22335
    public final void finish() throws IOException {
        if (this.f54998) {
            return;
        }
        C5970 c5970 = this.f54993;
        C5970.m16262(c5970);
        if (this.f54996 != this.f54995) {
            throw new IOException("Incomplete hex restore delta entry");
        }
        this.f54999.m30590(this.f54997);
        this.f54998 = true;
        C5970.m16261(c5970, this);
    }
}
