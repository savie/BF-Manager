package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C7825 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10061 f26062;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f26063;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17103 f26064;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19012 f26065;

    public C7825(C10061 c10061, C12628 c12628, C19012 c19012, C17103 c17103) {
        this.f26062 = c10061;
        this.f26063 = c12628;
        this.f26065 = c19012;
        this.f26064 = c17103;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() throws Throwable {
        C12628 c12628 = this.f26063;
        C13374 c13374M17210 = c12628.f40509.m17210();
        C10061 c10061 = this.f26062;
        c10061.f32263 = c13374M17210;
        Context context = c12628.getContext();
        if (c10061.f32263 == null || !(context instanceof AbstractActivityC17204)) {
            return;
        }
        final C19012 c19012 = this.f26065;
        m8193((AbstractActivityC17204) context, R.string.MT_Protector, 200, new Runnable() { // from class: l.֡ۤܳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f1887.f7780.m33188(new RunnableC14536(c19012));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21309(C7825 c7825) {
        if (c7825.f26065.mo924()) {
            return true;
        }
        C13511 c13511 = c7825.f7780;
        return c13511 != null && c13511.m33196();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C13511 c13511;
        C10061 c10061 = this.f26062;
        C17103 c17103 = this.f26064;
        if (c17103.m40266()) {
            try {
                if (c10061.f32263 != null) {
                    if (!(this.f26065.mo924() || ((c13511 = this.f7780) != null && c13511.m33196()))) {
                        c10061.f32262 = this.f26063.f40509.m17191(c10061.f32263, new C18266(this));
                        c10061.f32260 = true;
                    }
                }
            } finally {
                c17103.m40267();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f26064.m40268();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (exc instanceof C9446) {
            return;
        }
        C12628 c12628 = this.f26063;
        if (c12628.f40509.m17196(this.f26062.f32263)) {
            Context context = c12628.getContext();
            if (context instanceof AbstractActivityC17204) {
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) context;
                if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
                    return;
                }
            }
            if (exc instanceof C12562) {
                C22673.m51152(R.string.MT_Protector);
            } else if (exc instanceof IOException) {
                c12628.m31361((IOException) exc);
            } else {
                c12628.m31361(new IOException("Unable to paste hex range", exc));
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C17103 c17103 = this.f26064;
        c17103.m40267();
        c17103.m40268();
        C10061 c10061 = this.f26062;
        if (c10061.f32263 != null) {
            try {
                c10061.f32263.close();
            } catch (IOException unused) {
            }
        }
        m8196();
        c17103.close();
    }
}
