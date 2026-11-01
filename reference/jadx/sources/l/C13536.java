package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ܰۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13536 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Inflater f44693;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f44694;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 f44695;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f44696;

    public C13536(InterfaceC23683 interfaceC23683, Inflater inflater) {
        this.f44695 = interfaceC23683;
        this.f44693 = inflater;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        boolean z;
        if (this.f44696) {
            throw new IllegalStateException("closed");
        }
        do {
            Inflater inflater = this.f44693;
            boolean zNeedsInput = inflater.needsInput();
            InterfaceC23683 interfaceC23683 = this.f44695;
            z = false;
            if (zNeedsInput) {
                int i = this.f44694;
                if (i != 0) {
                    int remaining = i - inflater.getRemaining();
                    this.f44694 -= remaining;
                    ((C17768) interfaceC23683).skip(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                C17768 c17768 = (C17768) interfaceC23683;
                if (c17768.mo16415()) {
                    z = true;
                } else {
                    C18474 c18474 = c17768.f56358.f20521;
                    int i2 = c18474.f58877;
                    int i3 = c18474.f58875;
                    int i4 = i2 - i3;
                    this.f44694 = i4;
                    inflater.setInput(c18474.f58874, i3, i4);
                }
            }
            try {
                C18474 c18474M16406 = c6043.m16406(1);
                int iInflate = inflater.inflate(c18474M16406.f58874, c18474M16406.f58877, (int) Math.min(8192L, 8192 - c18474M16406.f58877));
                if (iInflate > 0) {
                    c18474M16406.f58877 += iInflate;
                    long j2 = iInflate;
                    c6043.f20522 += j2;
                    return j2;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i5 = this.f44694;
                if (i5 != 0) {
                    int remaining2 = i5 - inflater.getRemaining();
                    this.f44694 -= remaining2;
                    ((C17768) interfaceC23683).skip(remaining2);
                }
                if (c18474M16406.f58875 != c18474M16406.f58877) {
                    return -1L;
                }
                c6043.f20521 = c18474M16406.m42844();
                C7891.m20825(c18474M16406);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f44695.mo2292();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f44696) {
            return;
        }
        this.f44693.end();
        this.f44696 = true;
        ((C17768) this.f44695).close();
    }
}
