package l;

import bin.mt.json.JSON;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۤᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56G1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11042 extends C18683 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C15517 f34854;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f34855;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22977 f34856;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f34857;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C22231 f34858;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C19225 f34859;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f34860;

    /* JADX WARN: Illegal instructions before constructor call */
    public C11042(C22977 c22977, C15517 c15517, InputStream inputStream, C19225 c19225, long j, boolean z) {
        C22231 c22231 = inputStream == null ? null : new C22231(c22977, inputStream, c15517, j);
        this.f34856 = c22977;
        super(EnumC21667.OK, "application/octet-stream", c22231, j);
        this.f34854 = c15517;
        this.f34859 = c19225;
        this.f34858 = c22231;
        this.f34860 = z;
    }

    @Override // l.C18683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27929(boolean z) {
        this.f34855 = true;
        if (!z) {
            this.f34856.f74615.m17005(this.f34854, C5823.m16993("TRANSFER_SEND_FAILED", "The download response could not be completely sent."));
        } else if (this.f34860) {
            C5823 c5823 = this.f34856.f74615;
            C15517 c15517 = this.f34854;
            synchronized (c5823) {
                String str = c15517.f50498;
                if (str != null) {
                    c5823.m17005(c15517, C5823.m16993(str, "File transfer was interrupted."));
                }
            }
        } else {
            this.f34856.f74615.m17004(this.f34854, C15022.m36182(this.f34858.f71621.digest()), JSON.array());
        }
        try {
            close();
        } catch (IOException unused) {
        }
    }

    @Override // l.C18683, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C19225 c19225 = this.f34859;
        C15517 c15517 = this.f34854;
        C22977 c22977 = this.f34856;
        if (this.f34857) {
            return;
        }
        this.f34857 = true;
        try {
            super.close();
        } finally {
            if (!this.f34855) {
                c22977.f74615.m17005(c15517, C5823.m16993("TRANSFER_SEND_FAILED", "The download response was closed before completion."));
            }
            c19225.close();
            c22977.f74615.m17008(c15517);
        }
    }
}
