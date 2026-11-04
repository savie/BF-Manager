package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes.dex */
public final class C22355 implements InterfaceC24495 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5947 f72348;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16096 f72349;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13404 f72350;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f72351;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f72352;

    public C22355(C5947 c5947, AtomicReference atomicReference, C16096 c16096, C13404 c13404, AtomicBoolean atomicBoolean) {
        this.f72348 = c5947;
        this.f72351 = atomicReference;
        this.f72349 = c16096;
        this.f72350 = c13404;
        this.f72352 = atomicBoolean;
    }

    @Override // l.InterfaceC24495
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo50423(IOException iOException) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f72351;
            if (atomicReference.compareAndSet(null, iOException)) {
                break;
            }
        } while (atomicReference.get() == null);
        try {
            this.f72349.close();
        } catch (Exception unused) {
        }
    }

    @Override // l.InterfaceC24495
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo50424(C9444 c9444) {
        AtomicReference atomicReference;
        try {
            if (this.f72350.f42709 && c9444.m24820() == 403) {
                this.f72348.m17312();
            }
            C20863.m47689(c9444);
            this.f72352.set(true);
        } catch (IOException e) {
            do {
                atomicReference = this.f72351;
                if (atomicReference.compareAndSet(null, e)) {
                    break;
                }
            } while (atomicReference.get() == null);
            try {
                c9444.close();
            } catch (Exception unused) {
            }
            try {
                this.f72349.close();
            } catch (Exception unused2) {
            }
        }
    }
}
