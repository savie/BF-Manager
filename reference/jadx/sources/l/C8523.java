package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8523 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29507;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f29508;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7817 f29509;

    public C8523(C7817 c7817, int i) {
        this.f29509 = c7817;
        this.f29508 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m22253() throws IOException {
        if (this.f29507) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22255(byte[] bArr, int i, int i2) throws IOException {
        int iM20523;
        m22253();
        C7817 c7817 = this.f29509;
        int i3 = this.f29508;
        C17568 c17568 = new C17568(c7817, i3, i2, i, bArr);
        c7817.f25721.lock();
        try {
            if (!c7817.f25723.get()) {
                throw new IOException("Connection closed");
            }
            if (c7817.f25725.mo39299() && C13890.m33726()) {
                try {
                    iM20523 = ((Integer) C4716.f16636.submit(new CallableC9829(1, c17568)).get()).intValue();
                } catch (Throwable th) {
                    C19812.m45046(th);
                    throw null;
                }
            } else {
                iM20523 = C7817.m20523(c7817, i3, i2, i, bArr);
            }
            c7817.f25721.unlock();
            c7817.f25728 = 0L;
            return iM20523;
        } catch (Throwable th2) {
            try {
                C19812.m45046(th2);
                throw null;
            } catch (Throwable th3) {
                c7817.f25721.unlock();
                c7817.f25728 = 0L;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22261(byte[] bArr, int i, int i2) throws IOException {
        m22253();
        this.f29509.m20601(this.f29508, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22258() throws IOException {
        m22253();
        this.f29509.m20593(this.f29508);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22256() {
        if (this.f29507) {
            return;
        }
        this.f29507 = true;
        this.f29509.m20578(this.f29508);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m22254() throws IOException {
        m22253();
        return this.f29509.m20573(this.f29508);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22257(long j) throws IOException {
        m22253();
        this.f29509.m20579(this.f29508, j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m22259() throws IOException {
        m22253();
        return this.f29509.m20597(this.f29508);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22260(long j) throws IOException {
        m22253();
        this.f29509.m20600(this.f29508, j);
    }
}
