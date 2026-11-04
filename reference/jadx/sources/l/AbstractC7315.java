package l;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۜᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7315 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f24093;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f24094;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20193 f24095;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C5056 f24096;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public HashMap f24098;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C24448 f24099;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f24100;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C11988 f24101;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC0802 f24102;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8260 f24104;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7514 f24097 = new C7514();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0056 f24103 = new C0056();

    /* JADX INFO: renamed from: ۙ */
    public abstract List mo13745(String str, C15496 c15496, String str2, C11988 c11988);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo13758(AbstractC0802 abstractC0802);

    /* JADX INFO: renamed from: ᩷ */
    public abstract C20193 mo13791();

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo13795(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo13748(StringReader stringReader, String str, C11988 c11988) {
        if (str == null) {
            throw new C21552("The parameter 'baseUri' must not be null.");
        }
        C5056 c5056 = new C5056(str);
        this.f24096 = c5056;
        c5056.m15294(c11988);
        this.f24101 = c11988;
        this.f24095 = c11988.m30123();
        this.f24099 = new C24448(stringReader, 32768);
        this.f24100 = c11988.m30122();
        C24448 c24448 = this.f24099;
        c11988.m30125();
        c24448.m54685(this.f24100);
        this.f24102 = null;
        this.f24104 = new C8260(this.f24099, c11988.m30119());
        this.f24093 = new ArrayList(32);
        this.f24098 = new HashMap();
        this.f24094 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20065() {
        AbstractC0802 abstractC0802M22260;
        C8260 c8260 = this.f24104;
        EnumC9750 enumC9750 = EnumC9750.EOF;
        do {
            abstractC0802M22260 = c8260.m22260();
            mo13758(abstractC0802M22260);
            abstractC0802M22260.mo3216();
        } while (abstractC0802M22260.f2843 != enumC9750);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m20067(String str) {
        AbstractC0802 abstractC0802 = this.f24102;
        C7514 c7514 = this.f24097;
        if (abstractC0802 == c7514) {
            C7514 c7515 = new C7514();
            c7515.m43497(str);
            mo13758(c7515);
        } else {
            c7514.mo3216();
            c7514.m43497(str);
            mo13758(c7514);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m20064(C10363 c10363) {
        AbstractC0802 abstractC0802 = this.f24102;
        C7514 c7514 = this.f24097;
        if (abstractC0802 == c7514) {
            C7514 c7515 = new C7514();
            c7515.f60786 = "input";
            c7515.f60782 = c10363;
            c7515.f60787 = C15300.m36731("input");
            return mo13758(c7515);
        }
        c7514.mo3216();
        c7514.f60786 = "input";
        c7514.f60782 = c10363;
        c7514.f60787 = C15300.m36731("input");
        return mo13758(c7514);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m20066(String str) {
        AbstractC0802 abstractC0802 = this.f24102;
        C0056 c0056 = this.f24103;
        if (abstractC0802 == c0056) {
            C0056 c0057 = new C0056();
            c0057.m43497(str);
            return mo13758(c0057);
        }
        c0056.mo3216();
        c0056.m43497(str);
        return mo13758(c0056);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15496 m20060() {
        int size = this.f24093.size();
        return size > 0 ? (C15496) this.f24093.get(size - 1) : this.f24096;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20063(String str) {
        C15496 c15496M20060;
        return (this.f24093.size() == 0 || (c15496M20060 = m20060()) == null || !c15496M20060.m37100().equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6023 m20059(String str, C20193 c20193) {
        C6023 c6023 = (C6023) this.f24098.get(str);
        if (c6023 != null) {
            return c6023;
        }
        C6023 c6023M17487 = C6023.m17487(str, c20193);
        this.f24098.put(str, c6023M17487);
        return c6023M17487;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20062(AbstractC17734 abstractC17734, AbstractC0802 abstractC0802) {
        m20058(abstractC17734, abstractC0802, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20061(C15496 c15496, AbstractC0802 abstractC0802) {
        m20058((AbstractC17734) c15496, abstractC0802, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20058(AbstractC17734 abstractC17734, AbstractC0802 abstractC0802, boolean z) {
        int iM3214;
        if (!this.f24100 || abstractC0802 == null || (iM3214 = abstractC0802.m3214()) == -1) {
            return;
        }
        C3564 c3564 = new C3564(iM3214, this.f24099.m54682(iM3214), this.f24099.m54661(iM3214));
        int iM3212 = abstractC0802.m3212();
        new C20718(c3564, new C3564(iM3212, this.f24099.m54682(iM3212), this.f24099.m54661(iM3212))).m47385(abstractC17734, z);
    }
}
