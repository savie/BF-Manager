package l;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1K5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13626 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f44950;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f44951;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13626 f44952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f44953;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f44950.compareTo(((C13626) obj).f44950);
    }

    public C13626(AbstractC20745 abstractC20745) {
        this.f44952 = null;
        this.f44950 = abstractC20745.mo33986();
        this.f44951 = abstractC20745;
    }

    public C13626(C13626 c13626, String str) {
        C13638.requireNonNull(c13626);
        this.f44952 = c13626;
        this.f44950 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33321(AbstractC20745 abstractC20745) {
        C6171.m17178(this.f44952);
        this.f44950 = abstractC20745.mo33986();
        this.f44951 = abstractC20745;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m33318() {
        AbstractC20745 abstractC20745 = this.f44951;
        C13626 c13626 = this.f44952;
        if (c13626 == null) {
            return abstractC20745;
        }
        if (abstractC20745 != null && c13626.m33318().equals(this.f44953)) {
            return abstractC20745;
        }
        AbstractC20745 abstractC20745M33318 = c13626.m33318();
        this.f44953 = abstractC20745M33318;
        AbstractC20745 abstractC20745M46690 = abstractC20745M33318.m46690(this.f44950);
        this.f44951 = abstractC20745M46690;
        return abstractC20745M46690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m33320(String str) {
        return m33318().m46690(str);
    }

    public final String getName() {
        return m33318().getName();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m33319() {
        return m33318().mo33986();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m33326() {
        return m33318().mo33975();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C13626[] m33325() {
        List listMo33973 = m33318().mo33973();
        if (listMo33973.isEmpty()) {
            return null;
        }
        int size = listMo33973.size();
        C13626[] c13626Arr = new C13626[size];
        for (int i = 0; i < size; i++) {
            c13626Arr[i] = new C13626(this, (String) listMo33973.get(i));
        }
        return c13626Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13626 m33317(C13626 c13626, AbstractC20745 abstractC20745) {
        String strM33319 = c13626.m33319();
        String strMo33986 = abstractC20745.mo33986();
        if (strM33319.equals(strMo33986)) {
            return c13626;
        }
        if (strMo33986.startsWith(strM33319.concat("/"))) {
            return new C13626(c13626, strMo33986.substring(strM33319.length() + 1));
        }
        throw new RuntimeException(C1679.m5594(strM33319, " > ", strMo33986));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InputStream m33328() {
        return m33318().mo33970();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33323() {
        return m33318().mo24647();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m33324() {
        m33318().mo46720();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33322(byte[] bArr) {
        m33318().m46703(bArr);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final byte[] m33327() {
        return m33318().m46727();
    }
}
