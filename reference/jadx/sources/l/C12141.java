package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12141 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39042;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public OutputStream f39043;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7667 f39044;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6527 f39045;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C6527 f39046;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f39047 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6527 f39048;

    public C12141(C7667 c7667) {
        this.f39044 = c7667;
        AbstractC22044 abstractC22044M20878 = C7667.m20878(c7667, this.f39042);
        while (abstractC22044M20878.mo2934() && abstractC22044M20878.mo4285() >= 524288) {
            int i = this.f39042 + 1;
            this.f39042 = i;
            abstractC22044M20878 = C7667.m20878(c7667, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18108 m30349(String str, C21105 c21105) throws IOException {
        C6527 c6527;
        int iM48174 = c21105.m48174();
        AbstractC22044 abstractC22044M20878 = C7667.m20878(this.f39044, this.f39042);
        int iMo4285 = this.f39047;
        if (iMo4285 == -1) {
            iMo4285 = abstractC22044M20878.mo2934() ? (int) abstractC22044M20878.mo4285() : 0;
        }
        if (iMo4285 > 0 && iMo4285 + iM48174 > 524288) {
            C20244.m46520(this.f39043);
            this.f39043 = null;
            this.f39047 = -1;
            int i = this.f39042 + 1;
            this.f39042 = i;
            abstractC22044M20878 = C7667.m20878(this.f39044, i);
            iMo4285 = abstractC22044M20878.mo2934() ? (int) abstractC22044M20878.mo4285() : 0;
        }
        if (this.f39042 > 65535) {
            throw new IOException("Too many smali cache data files");
        }
        if (this.f39043 == null) {
            this.f39043 = abstractC22044M20878.mo4289(true);
        }
        this.f39043.write(c21105.m48178(), 0, iM48174);
        this.f39043.flush();
        synchronized (this.f39044.f25245) {
            this.f39044.f25241.remove(Integer.valueOf(this.f39042));
        }
        C7667 c7667 = this.f39044;
        if (str.length() <= 20000) {
            if (this.f39045 == null) {
                this.f39045 = new C6527(c7667.f25249.mo4289(true));
            }
            c6527 = this.f39045;
        } else {
            if (this.f39046 == null) {
                this.f39046 = new C6527(c7667.f25242.mo4289(true));
            }
            c6527 = this.f39046;
        }
        if (str.length() <= 20000) {
            C18121.m42241(c6527, C21443.m48759(str));
            C21443.m48762(c6527, str);
        } else {
            C18121.m42238(c6527, C21443.m48759(str));
            C21443.m48762(c6527, str);
        }
        C18121.m42241(c6527, this.f39042);
        C18121.m42238(c6527, iMo4285);
        C18121.m42238(c6527, iM48174);
        c6527.flush();
        int i2 = iMo4285 + iM48174;
        this.f39047 = i2;
        int i3 = this.f39042;
        C18108 c18108 = new C18108(i3, iMo4285, iM48174);
        if (i2 >= 524288) {
            this.f39042 = i3 + 1;
            C20244.m46520(this.f39043);
            this.f39043 = null;
            this.f39047 = -1;
        }
        return c18108;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30351(String str) throws IOException {
        if (this.f39048 == null) {
            this.f39048 = new C6527(this.f39044.f25253.mo4289(true));
        }
        C6527 c6527 = this.f39048;
        C18121.m42238(c6527, C21443.m48759(str));
        C21443.m48762(c6527, str);
        this.f39048.flush();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30350() {
        C20244.m46520(this.f39043);
        C20244.m46520(this.f39045);
        C20244.m46520(this.f39046);
        C20244.m46520(this.f39048);
        this.f39043 = null;
        this.f39045 = null;
        this.f39046 = null;
        this.f39048 = null;
        this.f39047 = -1;
    }
}
