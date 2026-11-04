package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6334 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24234 f21443;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3679 f21444;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f21445;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f21446;

    public C6334(C24234 c24234, C12628 c12628, Context context, C3679 c3679) {
        this.f21443 = c24234;
        this.f21445 = c12628;
        this.f21446 = context;
        this.f21444 = c3679;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f21443.f78481 = this.f21445.f40509.m17212();
        Context context = this.f21446;
        if (context instanceof AbstractActivityC17204) {
            final C3679 c3679 = this.f21444;
            m8193((AbstractActivityC17204) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۗۤܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10938.f7780.m33188(new Runnable() { // from class: l.ۨۤܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            c3679.m11970();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m18060() {
        if (this.f21444.m11971()) {
            return true;
        }
        C13511 c13511 = this.f7780;
        return (c13511 != null && c13511.m33196()) || !C4096.m13187(this.f21445);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.᩵ۤܳ] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C24234 c24234 = this.f21443;
        if (c24234.f78481 != null) {
            C5917 c5917 = this.f21445.f40509;
            C20087 c20087 = c24234.f78481;
            File cacheDir = this.f21446.getCacheDir();
            ?? r4 = new InterfaceC7509() { // from class: l.᩵ۤܳ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f65694.m18060();
                }
            };
            c5917.getClass();
            if (c20087.f64563 != c5917) {
                throw new IllegalArgumentException("Copy request belongs to another HexData");
            }
            c20087.m46220();
            try {
                C7210 c7210M21660 = c20087.f64559.m21660(c20087.f64556, c20087.length(), cacheDir, r4);
                c20087.m46221();
                c24234.f78482 = c7210M21660;
            } catch (Throwable th) {
                c20087.m46221();
                throw th;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (m18060()) {
            return;
        }
        C24234 c24234 = this.f21443;
        if (c24234.f78482 == null || !this.f21445.f40509.m17201(c24234.f78481, c24234.f78482)) {
            return;
        }
        c24234.f78482 = null;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C12628 c12628 = this.f21445;
        C5917 c5917 = c12628.f40509;
        if ((exc instanceof C9446) || m18060()) {
            return;
        }
        boolean z = exc instanceof C13308;
        C24234 c24234 = this.f21443;
        if (z) {
            if (C4096.m13187(c12628)) {
                if (c24234.f78481 == null || c5917.m17200(c24234.f78481)) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                return;
            }
            return;
        }
        if ((c24234.f78481 == null || c5917.m17200(c24234.f78481)) && C4096.m13187(c12628)) {
            if (exc instanceof IOException) {
                c12628.m31361((IOException) exc);
            } else {
                c12628.m31361(new IOException("Unable to copy hex range", exc));
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f21443.m54216();
        m8196();
        this.f21444.close();
    }
}
