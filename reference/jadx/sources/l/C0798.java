package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0798 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18438 f3387;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C12678 f3388;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3389;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C12678 f3390;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public OutputStream f3391;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3392 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12678 f3393;

    public C0798(C18438 c18438) {
        this.f3387 = c18438;
        AbstractC20745 abstractC20745M42753 = C18438.m42753(c18438, this.f3389);
        while (abstractC20745M42753.mo33975() && abstractC20745M42753.mo33964() >= 524288) {
            int i = this.f3389 + 1;
            this.f3389 = i;
            abstractC20745M42753 = C18438.m42753(c18438, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21260 m3367(String str, C17358 c17358) throws IOException {
        C12678 c12678;
        int iM40394 = c17358.m40394();
        AbstractC20745 abstractC20745M42753 = C18438.m42753(this.f3387, this.f3389);
        int iMo33964 = this.f3392;
        if (iMo33964 == -1) {
            iMo33964 = abstractC20745M42753.mo33975() ? (int) abstractC20745M42753.mo33964() : 0;
        }
        if (iMo33964 > 0 && iMo33964 + iM40394 > 524288) {
            C19431.m44468(this.f3391);
            this.f3391 = null;
            this.f3392 = -1;
            int i = this.f3389 + 1;
            this.f3389 = i;
            abstractC20745M42753 = C18438.m42753(this.f3387, i);
            iMo33964 = abstractC20745M42753.mo33975() ? (int) abstractC20745M42753.mo33964() : 0;
        }
        if (this.f3389 > 65535) {
            throw new IOException("Too many smali cache data files");
        }
        if (this.f3391 == null) {
            this.f3391 = abstractC20745M42753.mo33976(true);
        }
        this.f3391.write(c17358.m40395(), 0, iM40394);
        this.f3391.flush();
        synchronized (this.f3387.f58769) {
            this.f3387.f58760.remove(Integer.valueOf(this.f3389));
        }
        C18438 c18438 = this.f3387;
        if (str.length() <= 20000) {
            if (this.f3393 == null) {
                this.f3393 = new C12678(c18438.f58766.mo33976(true));
            }
            c12678 = this.f3393;
        } else {
            if (this.f3390 == null) {
                this.f3390 = new C12678(c18438.f58765.mo33976(true));
            }
            c12678 = this.f3390;
        }
        if (str.length() <= 20000) {
            C6069.m16471(c12678, C23967.m52794(str));
            C23967.m52797(c12678, str);
        } else {
            C6069.m16468(c12678, C23967.m52794(str));
            C23967.m52797(c12678, str);
        }
        C6069.m16471(c12678, this.f3389);
        C6069.m16468(c12678, iMo33964);
        C6069.m16468(c12678, iM40394);
        c12678.flush();
        int i2 = iMo33964 + iM40394;
        this.f3392 = i2;
        int i3 = this.f3389;
        C21260 c21260 = new C21260(i3, iMo33964, iM40394);
        if (i2 >= 524288) {
            this.f3389 = i3 + 1;
            C19431.m44468(this.f3391);
            this.f3391 = null;
            this.f3392 = -1;
        }
        return c21260;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3369(String str) throws IOException {
        if (this.f3388 == null) {
            this.f3388 = new C12678(this.f3387.f58771.mo33976(true));
        }
        C12678 c12678 = this.f3388;
        C6069.m16468(c12678, C23967.m52794(str));
        C23967.m52797(c12678, str);
        this.f3388.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3368() {
        C19431.m44468(this.f3391);
        C19431.m44468(this.f3393);
        C19431.m44468(this.f3390);
        C19431.m44468(this.f3388);
        this.f3391 = null;
        this.f3393 = null;
        this.f3390 = null;
        this.f3388 = null;
        this.f3392 = -1;
    }
}
