package l;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1K5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9378 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9378 f30453;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f30454;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f30455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f30456;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f30455.compareTo(((C9378) obj).f30455);
    }

    public C9378(AbstractC22044 abstractC22044) {
        this.f30453 = null;
        this.f30455 = abstractC22044.mo4294();
        this.f30454 = abstractC22044;
    }

    public C9378(C9378 c9378, String str) {
        C17359.requireNonNull(c9378);
        this.f30453 = c9378;
        this.f30455 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24695(AbstractC22044 abstractC22044) {
        C11972.m30030(this.f30453);
        this.f30455 = abstractC22044.mo4294();
        this.f30454 = abstractC22044;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m24699() {
        AbstractC22044 abstractC22044 = this.f30454;
        C9378 c9378 = this.f30453;
        if (c9378 == null) {
            return abstractC22044;
        }
        if (abstractC22044 != null && c9378.m24699().equals(this.f30456)) {
            return abstractC22044;
        }
        AbstractC22044 abstractC22044M24699 = c9378.m24699();
        this.f30456 = abstractC22044M24699;
        AbstractC22044 abstractC22044M49876 = abstractC22044M24699.m49876(this.f30455);
        this.f30454 = abstractC22044M49876;
        return abstractC22044M49876;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m24694(String str) {
        return m24699().m49876(str);
    }

    public final String getName() {
        return m24699().getName();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24693() {
        return m24699().mo4294();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m24702() {
        return m24699().mo2934();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9378[] m24698() {
        List listMo4282 = m24699().mo4282();
        if (listMo4282.isEmpty()) {
            return null;
        }
        int size = listMo4282.size();
        C9378[] c9378Arr = new C9378[size];
        for (int i = 0; i < size; i++) {
            c9378Arr[i] = new C9378(this, (String) listMo4282.get(i));
        }
        return c9378Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9378 m24692(C9378 c9378, AbstractC22044 abstractC22044) {
        String strM24693 = c9378.m24693();
        String strMo4294 = abstractC22044.mo4294();
        if (strM24693.equals(strMo4294)) {
            return c9378;
        }
        if (strMo4294.startsWith(strM24693.concat("/"))) {
            return new C9378(c9378, strMo4294.substring(strM24693.length() + 1));
        }
        throw new RuntimeException(C20196.m46451(strM24693, " > ", strMo4294));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InputStream m24703() {
        return m24699().mo4290();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24697() {
        return m24699().mo4296();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m24701() {
        m24699().mo49834();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24696(byte[] bArr) {
        m24699().m49849(bArr);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] m24700() {
        return m24699().m49865();
    }
}
