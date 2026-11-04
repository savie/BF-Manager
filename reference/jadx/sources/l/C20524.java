package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.᩵ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4D4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20524 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC25000 f65730;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65731;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Inflater f65732;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65733;

    public C20524(InterfaceC25000 interfaceC25000, Inflater inflater) {
        this.f65730 = interfaceC25000;
        this.f65732 = inflater;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        boolean z;
        if (this.f65733) {
            throw new IllegalStateException("closed");
        }
        do {
            Inflater inflater = this.f65732;
            boolean zNeedsInput = inflater.needsInput();
            InterfaceC25000 interfaceC25000 = this.f65730;
            z = false;
            if (zNeedsInput) {
                int i = this.f65731;
                if (i != 0) {
                    int remaining = i - inflater.getRemaining();
                    this.f65731 -= remaining;
                    ((C1133) interfaceC25000).skip(remaining);
                }
                if (inflater.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                C1133 c1133 = (C1133) interfaceC25000;
                if (c1133.mo4182()) {
                    z = true;
                } else {
                    C9335 c9335 = c1133.f4207.f6313;
                    int i2 = c9335.f30348;
                    int i3 = c9335.f30347;
                    int i4 = i2 - i3;
                    this.f65731 = i4;
                    inflater.setInput(c9335.f30343, i3, i4);
                }
            }
            try {
                C9335 c9335M6434 = c1879.m6434(1);
                int iInflate = inflater.inflate(c9335M6434.f30343, c9335M6434.f30348, (int) Math.min(8192L, 8192 - c9335M6434.f30348));
                if (iInflate > 0) {
                    c9335M6434.f30348 += iInflate;
                    long j2 = iInflate;
                    c1879.f6314 += j2;
                    return j2;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                }
                int i5 = this.f65731;
                if (i5 != 0) {
                    int remaining2 = i5 - inflater.getRemaining();
                    this.f65731 -= remaining2;
                    ((C1133) interfaceC25000).skip(remaining2);
                }
                if (c9335M6434.f30347 != c9335M6434.f30348) {
                    return -1L;
                }
                c1879.f6313 = c9335M6434.m24585();
                C2624.m8766(c9335M6434);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f65730.mo4181();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f65733) {
            return;
        }
        this.f65732.end();
        this.f65733 = true;
        ((C1133) this.f65730).close();
    }
}
