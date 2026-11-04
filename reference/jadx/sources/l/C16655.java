package l;

/* JADX INFO: renamed from: l.ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C16655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3977 f53802;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13275[] f53803;

    /* JADX INFO: renamed from: ۙ */
    public void mo28780(C13275 c13275) {
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo28781(C13275 c13275) {
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo28782(C13275 c13275) {
    }

    /* JADX INFO: renamed from: ᩷ */
    public C3977 mo28783() {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo28784(C13275 c13275) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo28785(C13275 c13275) {
        throw null;
    }

    public C16655() {
        this(new C3977());
    }

    public C16655(C3977 c3977) {
        this.f53802 = c3977;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo39362(int i, C13275 c13275) {
        if (this.f53803 == null) {
            this.f53803 = new C13275[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f53803[C6215.m17849(i2)] = c13275;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39361() {
        C13275[] c13275Arr = this.f53803;
        if (c13275Arr != null) {
            C13275 c13275M12817 = c13275Arr[0];
            C13275 c13275M12818 = c13275Arr[1];
            C3977 c3977 = this.f53802;
            if (c13275M12818 == null) {
                c13275M12818 = c3977.m12817(2);
            }
            if (c13275M12817 == null) {
                c13275M12817 = c3977.m12817(1);
            }
            mo28785(C13275.m32821(c13275M12817, c13275M12818));
            C13275 c13275 = this.f53803[C6215.m17849(16)];
            if (c13275 != null) {
                mo28781(c13275);
            }
            C13275 c13276 = this.f53803[C6215.m17849(32)];
            if (c13276 != null) {
                mo28780(c13276);
            }
            C13275 c13277 = this.f53803[C6215.m17849(64)];
            if (c13277 != null) {
                mo28782(c13277);
            }
        }
    }
}
