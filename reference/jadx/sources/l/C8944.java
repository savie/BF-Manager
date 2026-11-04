package l;

/* JADX INFO: renamed from: l.۠᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAG5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8944 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m23907(AbstractC4625 abstractC4625) {
        C7453 c7453Mo14436 = abstractC4625.mo14436();
        int iM56029 = c7453Mo14436.m56029();
        c7453Mo14436.m56027(abstractC4625.mo3632().mo4190());
        int iMo4193 = abstractC4625.mo3632().mo4193() - abstractC4625.mo3632().mo4190();
        byte[] bArr = new byte[iMo4193];
        try {
            c7453Mo14436.m56024(iMo4193, bArr);
            c7453Mo14436.m56027(iM56029);
            return bArr;
        } catch (C2013 e) {
            throw new C12082("Cannot read packet bytes from buffer", e);
        }
    }
}
