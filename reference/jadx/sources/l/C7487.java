package l;

import java.io.IOException;
import java.util.Set;

/* JADX INFO: renamed from: l.۟۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7487 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15249 f24934;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9191 f24935;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f24936;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15249 f24938;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f24939 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f24937 = 0;

    public C7487(InterfaceC9191 interfaceC9191, C15249 c15249, int i) throws IOException {
        this.f24936 = c15249.getPosition();
        this.f24935 = interfaceC9191;
        this.f24934 = c15249;
        int i2 = i * 4;
        C15249.m36518(c15249, 0);
        this.f24938 = AbstractC15955.m37928(interfaceC9191, c15249.getPosition());
        for (int i3 = 0; i3 < i2; i3++) {
            this.f24934.write(0);
        }
        this.f24934.flush();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19984() throws IOException {
        if (!this.f24939) {
            C15249 c15249 = this.f24938;
            c15249.getClass();
            C15249.m36518(c15249, 0);
        }
        this.f24939 = false;
        this.f24937 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19983(Set set) throws IOException {
        boolean zIsEmpty = set.isEmpty();
        C15249 c15249 = this.f24934;
        if (zIsEmpty) {
            if (this.f24939) {
                int value = EnumC18763.WHITELIST.getValue();
                c15249.getClass();
                C15249.m36519(c15249, value);
                return;
            }
            this.f24937++;
            return;
        }
        if (!this.f24939) {
            this.f24939 = true;
            int position = c15249.getPosition() - this.f24936;
            C15249 c152410 = this.f24938;
            c152410.getClass();
            C15249.m36518(c152410, position);
            for (int i = 0; i < this.f24937; i++) {
                C15249.m36519(c15249, EnumC18763.WHITELIST.getValue());
            }
            this.f24937 = 0;
        }
        int iM43322 = EnumC18763.m43322(set);
        c15249.getClass();
        C15249.m36519(c15249, iM43322);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19982() {
        int i = this.f24936;
        this.f24938.close();
        C15249 c15249M37928 = null;
        try {
            c15249M37928 = AbstractC15955.m37928(this.f24935, i);
            C15249.m36518(c15249M37928, this.f24934.getPosition() - i);
            c15249M37928.close();
        } catch (Throwable th) {
            if (c15249M37928 != null) {
                c15249M37928.close();
            }
            throw th;
        }
    }
}
