package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V717 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13545 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f44704;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11428 f44705;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22198 f44706;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f44707;

    public C13545(C11428 c11428, C13026 c13026, Context context, C22198 c22198) {
        this.f44705 = c11428;
        this.f44704 = c13026;
        this.f44707 = context;
        this.f44706 = c22198;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f44705.f38477 = this.f44704.f43452.m33470();
        Context context = this.f44707;
        if (context instanceof AbstractActivityC12483) {
            final C22198 c22198 = this.f44706;
            m10248((AbstractActivityC12483) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۢۢۚ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32143.f12806.m40697(new Runnable() { // from class: l.ۙۗۚ
                        @Override // java.lang.Runnable
                        public final void run() {
                            c22198.m49254();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean m33132() {
        if (this.f44706.m49255()) {
            return true;
        }
        C17485 c17485 = this.f12806;
        return (c17485 != null && c17485.m40693()) || !C2254.m6921(this.f44704);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ۗۢۚ] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C11428 c11428 = this.f44705;
        if (c11428.f38477 != null) {
            C13732 c13732 = this.f44704.f43452;
            C9271 c9271 = c11428.f38477;
            File cacheDir = this.f44707.getCacheDir();
            ?? r4 = new InterfaceC5614() { // from class: l.ۗۢۚ
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f11878.m33132();
                }
            };
            c13732.getClass();
            if (c9271.f31517 != c13732) {
                throw new IllegalArgumentException("Copy request belongs to another HexData");
            }
            c9271.m23820();
            try {
                C6750 c6750M29187 = c9271.f31519.m29187(c9271.f31512, c9271.length(), cacheDir, r4);
                c9271.m23821();
                c11428.f38478 = c6750M29187;
            } catch (Throwable th) {
                c9271.m23821();
                throw th;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (m33132()) {
            return;
        }
        C11428 c11428 = this.f44705;
        if (c11428.f38478 == null || !this.f44704.f43452.m33457(c11428.f38477, c11428.f38478)) {
            return;
        }
        c11428.f38478 = null;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C13026 c13026 = this.f44704;
        C13732 c13732 = c13026.f43452;
        if ((exc instanceof C1105) || m33132()) {
            return;
        }
        boolean z = exc instanceof C19950;
        C11428 c11428 = this.f44705;
        if (z) {
            if (C2254.m6921(c13026)) {
                if (c11428.f38477 == null || c13732.m33456(c11428.f38477)) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                return;
            }
            return;
        }
        if ((c11428.f38477 == null || c13732.m33456(c11428.f38477)) && C2254.m6921(c13026)) {
            if (exc instanceof IOException) {
                c13026.m32228((IOException) exc);
            } else {
                c13026.m32228(new IOException("Unable to copy hex range", exc));
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f44705.m28547();
        m10251();
        this.f44706.close();
    }
}
