package l;

/* JADX INFO: renamed from: l.ܽܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17697 implements InterfaceC18449 {
    @Override // l.InterfaceC18449
    /* JADX INFO: renamed from: ۙ */
    public final int mo25785(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        int length = charSequence.length();
        if (length < 100) {
            return charSequence.hashCode();
        }
        return charSequence.charAt(length / 2) | (length << 16);
    }

    @Override // l.InterfaceC18449
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25786(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence instanceof C14560) {
            C14560 c14560 = (C14560) charSequence;
            if (charSequence2 instanceof C14560) {
                return c14560.equals((C14560) charSequence2);
            }
            return c14560.m35114(charSequence2);
        }
        if (charSequence2 instanceof C14560) {
            return ((C14560) charSequence2).m35114(charSequence);
        }
        return charSequence.equals(charSequence2);
    }
}
