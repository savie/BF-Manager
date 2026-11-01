package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20401 implements InterfaceC2443 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f66095;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11229 f66096;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6289 f66097;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19617 f66098;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f66099;

    public C20401(C11229 c11229, AtomicReference atomicReference, C19617 c19617, C6289 c6289, AtomicBoolean atomicBoolean) {
        this.f66096 = c11229;
        this.f66099 = atomicReference;
        this.f66098 = c19617;
        this.f66097 = c6289;
        this.f66095 = atomicBoolean;
    }

    @Override // l.InterfaceC2443
    /* JADX INFO: renamed from: ۙ */
    public final void mo7424(IOException iOException) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f66099;
            if (atomicReference.compareAndSet(null, iOException)) {
                break;
            }
        } while (atomicReference.get() == null);
        try {
            this.f66098.close();
        } catch (Exception unused) {
        }
    }

    @Override // l.InterfaceC2443
    /* JADX INFO: renamed from: ۙ */
    public final void mo7425(C18485 c18485) {
        AtomicReference atomicReference;
        try {
            if (this.f66097.f21296 && c18485.m42858() == 403) {
                this.f66096.m28198();
            }
            C2181.m6778(c18485);
            this.f66095.set(true);
        } catch (IOException e) {
            do {
                atomicReference = this.f66099;
                if (atomicReference.compareAndSet(null, e)) {
                    break;
                }
            } while (atomicReference.get() == null);
            try {
                c18485.close();
            } catch (Exception unused) {
            }
            try {
                this.f66098.close();
            } catch (Exception unused2) {
            }
        }
    }
}
