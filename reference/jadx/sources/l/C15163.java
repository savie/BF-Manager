package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15163 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16655 f49454;

    public C15163() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f49454 = new C24861();
        } else if (i >= 29) {
            this.f49454 = new C11434();
        } else {
            this.f49454 = new C12926();
        }
    }

    public C15163(C3977 c3977) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f49454 = new C24861(c3977);
        } else if (i >= 29) {
            this.f49454 = new C11434(c3977);
        } else {
            this.f49454 = new C12926(c3977);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36480(C13275 c13275) {
        this.f49454.mo28785(c13275);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36478(int i, C13275 c13275) {
        this.f49454.mo39362(i, c13275);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36479(C13275 c13275) {
        this.f49454.mo28784(c13275);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3977 m36477() {
        return this.f49454.mo28783();
    }
}
