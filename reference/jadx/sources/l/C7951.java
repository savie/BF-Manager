package l;

/* JADX INFO: renamed from: l.۠ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAG5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7951 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m20981(AbstractC10068 abstractC10068) {
        C19240 c19240Mo25476 = abstractC10068.mo25476();
        int iM27402 = c19240Mo25476.m27402();
        c19240Mo25476.m27376(abstractC10068.mo25478().mo4329());
        int iMo4342 = abstractC10068.mo25478().mo4342() - abstractC10068.mo25478().mo4329();
        byte[] bArr = new byte[iMo4342];
        try {
            c19240Mo25476.m27397(iMo4342, bArr);
            c19240Mo25476.m27376(iM27402);
            return bArr;
        } catch (C17271 e) {
            throw new C13865("Cannot read packet bytes from buffer", e);
        }
    }
}
