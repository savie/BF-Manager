package l;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19711 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public HashMap f63269;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f63271;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f63272;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13756 f63273;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C10497 f63275;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4582 f63276;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC21516 f63277;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f63278;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C2424 f63279;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C8111 f63280;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C6699 f63274 = new C6699();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3876 f63270 = new C3876();

    /* JADX INFO: renamed from: ۙ */
    public abstract List mo14460(String str, C0617 c0617, String str2, C13756 c13756);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo14473(AbstractC21516 abstractC21516);

    /* JADX INFO: renamed from: ܰ */
    public abstract C4582 mo14492();

    /* JADX INFO: renamed from: ܰ */
    public boolean mo14496(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14463(StringReader stringReader, String str, C13756 c13756) {
        if (str == null) {
            throw new C22491("The parameter 'baseUri' must not be null.");
        }
        C10497 c10497 = new C10497(str);
        this.f63275 = c10497;
        c10497.m26636(c13756);
        this.f63273 = c13756;
        this.f63276 = c13756.m33519();
        this.f63279 = new C2424(stringReader, 32768);
        this.f63278 = c13756.m33521();
        C2424 c2424 = this.f63279;
        c13756.m33522();
        c2424.m7389(this.f63278);
        this.f63277 = null;
        this.f63280 = new C8111(this.f63279, c13756.m33516());
        this.f63271 = new ArrayList(32);
        this.f63269 = new HashMap();
        this.f63272 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44840() {
        AbstractC21516 abstractC21516M21366;
        C8111 c8111 = this.f63280;
        EnumC15167 enumC15167 = EnumC15167.EOF;
        do {
            abstractC21516M21366 = c8111.m21366();
            mo14473(abstractC21516M21366);
            abstractC21516M21366.mo3991();
        } while (abstractC21516M21366.f69910 != enumC15167);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m44833(String str) {
        AbstractC21516 abstractC21516 = this.f63277;
        C6699 c6699 = this.f63274;
        if (abstractC21516 == c6699) {
            C6699 c66910 = new C6699();
            c66910.m50744(str);
            mo14473(c66910);
        } else {
            c6699.mo3991();
            c6699.m50744(str);
            mo14473(c6699);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m44839(C15436 c15436) {
        AbstractC21516 abstractC21516 = this.f63277;
        C6699 c6699 = this.f63274;
        if (abstractC21516 == c6699) {
            C6699 c66910 = new C6699();
            c66910.f74530 = "input";
            c66910.f74528 = c15436;
            c66910.f74529 = C1323.m4722("input");
            return mo14473(c66910);
        }
        c6699.mo3991();
        c6699.f74530 = "input";
        c6699.f74528 = c15436;
        c6699.f74529 = C1323.m4722("input");
        return mo14473(c6699);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44841(String str) {
        AbstractC21516 abstractC21516 = this.f63277;
        C3876 c3876 = this.f63270;
        if (abstractC21516 == c3876) {
            C3876 c3877 = new C3876();
            c3877.m50744(str);
            return mo14473(c3877);
        }
        c3876.mo3991();
        c3876.m50744(str);
        return mo14473(c3876);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0617 m44834() {
        int size = this.f63271.size();
        return size > 0 ? (C0617) this.f63271.get(size - 1) : this.f63275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44838(String str) {
        C0617 c0617M44834;
        return (this.f63271.size() == 0 || (c0617M44834 = m44834()) == null || !c0617M44834.m2833().equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11639 m44835(String str, C4582 c4582) {
        C11639 c11639 = (C11639) this.f63269.get(str);
        if (c11639 != null) {
            return c11639;
        }
        C11639 c11639M29046 = C11639.m29046(str, c4582);
        this.f63269.put(str, c11639M29046);
        return c11639M29046;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44837(AbstractC14730 abstractC14730, AbstractC21516 abstractC21516) {
        m44832(abstractC14730, abstractC21516, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44836(C0617 c0617, AbstractC21516 abstractC21516) {
        m44832((AbstractC14730) c0617, abstractC21516, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44832(AbstractC14730 abstractC14730, AbstractC21516 abstractC21516, boolean z) {
        int iM48233;
        if (!this.f63278 || abstractC21516 == null || (iM48233 = abstractC21516.m48233()) == -1) {
            return;
        }
        C3439 c3439 = new C3439(iM48233, this.f63279.m7386(iM48233), this.f63279.m7370(iM48233));
        int iM48229 = abstractC21516.m48229();
        new C4541(c3439, new C3439(iM48229, this.f63279.m7386(iM48229), this.f63279.m7370(iM48229))).m12679(abstractC14730, z);
    }
}
