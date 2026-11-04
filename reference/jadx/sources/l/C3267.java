package l;

import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۗ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3267 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f10638;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f10639;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15945 f10640;

    public C3267(C15945 c15945, int i) {
        this.f10640 = c15945;
        this.f10639 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m10743() throws IOException {
        if (this.f10638) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10744(byte[] bArr, int i, int i2) throws IOException {
        int iM37972;
        m10743();
        C15945 c15945 = this.f10640;
        int i3 = this.f10639;
        final C17964 c17964 = new C17964(c15945, i3, i2, i, bArr);
        c15945.f51781.lock();
        try {
            if (!c15945.f51775.get()) {
                throw new IOException("Connection closed");
            }
            if (c15945.f51776.mo35490() && C22415.m50555()) {
                try {
                    iM37972 = ((Integer) C5261.f18540.submit(new Callable() { // from class: l.۬֡ᩴ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C17964 c17965 = c17964;
                            return Integer.valueOf(C15945.m37972(c17965.f58879, c17965.f58882, c17965.f58880, c17965.f58883, c17965.f58881));
                        }
                    }).get()).intValue();
                } catch (Throwable th) {
                    C4013.m12976(th);
                    throw null;
                }
            } else {
                iM37972 = C15945.m37972(c15945, i3, i2, i, bArr);
            }
            c15945.f51781.unlock();
            c15945.f51784 = 0L;
            return iM37972;
        } catch (Throwable th2) {
            try {
                C4013.m12976(th2);
                throw null;
            } catch (Throwable th3) {
                c15945.f51781.unlock();
                c15945.f51784 = 0L;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10750(byte[] bArr, int i, int i2) throws IOException {
        m10743();
        this.f10640.m38055(this.f10639, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m10747() throws IOException {
        m10743();
        this.f10640.m38038(this.f10639);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10745() {
        if (this.f10638) {
            return;
        }
        this.f10638 = true;
        this.f10640.m38023(this.f10639);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m10751() throws IOException {
        m10743();
        return this.f10640.m38058(this.f10639);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10746(long j) throws IOException {
        m10743();
        this.f10640.m38024(this.f10639, j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m10748() throws IOException {
        m10743();
        return this.f10640.m38050(this.f10639);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10749(long j) throws IOException {
        m10743();
        this.f10640.m38054(this.f10639, j);
    }
}
