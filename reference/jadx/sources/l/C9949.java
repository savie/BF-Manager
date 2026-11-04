package l;

/* JADX INFO: renamed from: l.ۢۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9949 implements InterfaceC18449 {
    @Override // l.InterfaceC18449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo25785(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence == null) {
            return -1;
        }
        return charSequence.length();
    }

    @Override // l.InterfaceC18449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo25786(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        return (charSequence == null ? -1 : charSequence.length()) == (charSequence2 != null ? charSequence2.length() : -1);
    }
}
