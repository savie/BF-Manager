package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5629 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9378 f19465;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11594 f19466;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19467 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C6527 f19468;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public OutputStream f19469;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C6527 f19470;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19471;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6527 f19472;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16611() {
        OutputStream outputStream = this.f19469;
        if (outputStream != null) {
            C20244.m46520(outputStream);
            this.f19469 = null;
        }
        this.f19467 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16612(String str, C21105 c21105) {
        try {
            AbstractC22044 abstractC22044M24699 = this.f19465.m24699();
            int iMo4285 = this.f19467;
            if (iMo4285 == -1) {
                iMo4285 = abstractC22044M24699.mo2934() ? (int) abstractC22044M24699.mo4285() : 0;
            }
            int iM48174 = c21105.m48174();
            if (this.f19468 == null) {
                this.f19468 = new C6527(this.f19466.f36403.m24699().mo4289(true));
            }
            if (this.f19470 == null) {
                this.f19470 = new C6527(this.f19466.f36396.m24699().mo4289(true));
            }
            if (this.f19469 == null) {
                this.f19469 = abstractC22044M24699.mo4289(true);
            }
            this.f19469.write(c21105.m48178(), 0, iM48174);
            this.f19469.flush();
            C11594.m29143(this.f19466, this.f19471);
            this.f19466.f36394.put(str, new C1900(this.f19471, iMo4285, iM48174));
            this.f19467 = iMo4285 + iM48174;
            boolean z = str.length() <= 20000;
            C6527 c6527 = z ? this.f19468 : this.f19470;
            if (z) {
                C18121.m42241(c6527, C21443.m48759(str));
                C21443.m48762(c6527, str);
            } else {
                C18121.m42238(c6527, C21443.m48759(str));
                C21443.m48762(c6527, str);
            }
            C18121.m42241(c6527, this.f19471);
            C18121.m42238(c6527, iMo4285);
            C18121.m42238(c6527, iM48174);
            c6527.flush();
            if (this.f19467 >= 524288) {
                this.f19471++;
                this.f19465 = new C9378(this.f19466.f36404, String.valueOf(this.f19471));
                m16611();
            }
        } catch (IOException e) {
            m16613();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m16613() {
        C6527 c6527 = this.f19468;
        if (c6527 != null) {
            C20244.m46520(c6527);
            this.f19468 = null;
        }
        C6527 c6528 = this.f19470;
        if (c6528 != null) {
            C20244.m46520(c6528);
            this.f19470 = null;
        }
        C6527 c6529 = this.f19472;
        if (c6529 != null) {
            C20244.m46520(c6529);
            this.f19472 = null;
        }
        m16611();
    }

    public C5629(C11594 c11594) {
        this.f19466 = c11594;
        AbstractC22044 abstractC22044M29129 = C11594.m29129(c11594, this.f19471);
        while (abstractC22044M29129.mo2934() && abstractC22044M29129.mo4285() >= 524288) {
            int i = this.f19471 + 1;
            this.f19471 = i;
            abstractC22044M29129 = C11594.m29129(c11594, i);
        }
        this.f19465 = new C9378(c11594.f36404, String.valueOf(this.f19471));
    }
}
