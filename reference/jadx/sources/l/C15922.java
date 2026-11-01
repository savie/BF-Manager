package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15922 implements InterfaceC8597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16627 f51597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8597 f51598;

    public C15922(C16627 c16627, InterfaceC8597 interfaceC8597) {
        this.f51597 = c16627;
        this.f51598 = interfaceC8597;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) throws IOException {
        C15653.m37329(c6043.f20522, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C18474 c18474 = c6043.f20521;
            while (j2 < 65536) {
                j2 += (long) (c18474.f58877 - c18474.f58875);
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                c18474 = c18474.f58876;
            }
            C16627 c16627 = this.f51597;
            c16627.m39092();
            try {
                try {
                    ((C11419) this.f51598).mo5901(c6043, j2);
                    j -= j2;
                    c16627.m39093(true);
                } catch (IOException e) {
                    if (!c16627.m39094()) {
                        throw e;
                    }
                    throw c16627.mo16598(e);
                }
            } catch (Throwable th) {
                c16627.m39093(false);
                throw th;
            }
        }
    }

    @Override // l.InterfaceC8597, java.io.Flushable
    public final void flush() throws IOException {
        C16627 c16627 = this.f51597;
        c16627.m39092();
        try {
            try {
                ((C11419) this.f51598).flush();
                c16627.m39093(true);
            } catch (IOException e) {
                if (!c16627.m39094()) {
                    throw e;
                }
                throw c16627.mo16598(e);
            }
        } catch (Throwable th) {
            c16627.m39093(false);
            throw th;
        }
    }

    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C16627 c16627 = this.f51597;
        c16627.m39092();
        try {
            try {
                ((C11419) this.f51598).close();
                c16627.m39093(true);
            } catch (IOException e) {
                if (!c16627.m39094()) {
                    throw e;
                }
                throw c16627.mo16598(e);
            }
        } catch (Throwable th) {
            c16627.m39093(false);
            throw th;
        }
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo5902() {
        return this.f51597;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f51598 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
