package l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18228 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f58205;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4670 f58206;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18228(C18934 c18934, OutputStream outputStream, C4670 c4670) {
        super(outputStream, 32768);
        this.f58206 = c4670;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4670 c4670 = this.f58206;
        if (this.f58205) {
            return;
        }
        try {
            super.close();
        } finally {
            int i = C18934.f61253;
            C12563.m31270(c4670);
            this.f58205 = true;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
