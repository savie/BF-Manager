package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18463 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12678 f58833;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C12678 f58834;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13626 f58835;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C12678 f58836;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f58837 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19169 f58838;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58839;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public OutputStream f58840;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42823() {
        OutputStream outputStream = this.f58840;
        if (outputStream != null) {
            C19431.m44468(outputStream);
            this.f58840 = null;
        }
        this.f58837 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42824(String str, C17358 c17358) {
        try {
            AbstractC20745 abstractC20745M33318 = this.f58835.m33318();
            int iMo33964 = this.f58837;
            if (iMo33964 == -1) {
                iMo33964 = abstractC20745M33318.mo33975() ? (int) abstractC20745M33318.mo33964() : 0;
            }
            int iM40394 = c17358.m40394();
            if (this.f58833 == null) {
                this.f58833 = new C12678(this.f58838.f61908.m33318().mo33976(true));
            }
            if (this.f58836 == null) {
                this.f58836 = new C12678(this.f58838.f61904.m33318().mo33976(true));
            }
            if (this.f58840 == null) {
                this.f58840 = abstractC20745M33318.mo33976(true);
            }
            this.f58840.write(c17358.m40395(), 0, iM40394);
            this.f58840.flush();
            C19169.m43993(this.f58838, this.f58839);
            this.f58838.f61899.put(str, new C7880(this.f58839, iMo33964, iM40394));
            this.f58837 = iMo33964 + iM40394;
            boolean z = str.length() <= 20000;
            C12678 c12678 = z ? this.f58833 : this.f58836;
            if (z) {
                C6069.m16471(c12678, C23967.m52794(str));
                C23967.m52797(c12678, str);
            } else {
                C6069.m16468(c12678, C23967.m52794(str));
                C23967.m52797(c12678, str);
            }
            C6069.m16471(c12678, this.f58839);
            C6069.m16468(c12678, iMo33964);
            C6069.m16468(c12678, iM40394);
            c12678.flush();
            if (this.f58837 >= 524288) {
                this.f58839++;
                this.f58835 = new C13626(this.f58838.f61901, String.valueOf(this.f58839));
                m42823();
            }
        } catch (IOException e) {
            m42825();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42825() {
        C12678 c12678 = this.f58833;
        if (c12678 != null) {
            C19431.m44468(c12678);
            this.f58833 = null;
        }
        C12678 c12679 = this.f58836;
        if (c12679 != null) {
            C19431.m44468(c12679);
            this.f58836 = null;
        }
        C12678 c126710 = this.f58834;
        if (c126710 != null) {
            C19431.m44468(c126710);
            this.f58834 = null;
        }
        m42823();
    }

    public C18463(C19169 c19169) {
        this.f58838 = c19169;
        AbstractC20745 abstractC20745M43981 = C19169.m43981(c19169, this.f58839);
        while (abstractC20745M43981.mo33975() && abstractC20745M43981.mo33964() >= 524288) {
            int i = this.f58839 + 1;
            this.f58839 = i;
            abstractC20745M43981 = C19169.m43981(c19169, i);
        }
        this.f58835 = new C13626(c19169.f61901, String.valueOf(this.f58839));
    }
}
