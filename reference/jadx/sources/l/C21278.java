package l;

/* JADX INFO: renamed from: l.᩸֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21278 implements InterfaceC22685 {
    @Override // l.InterfaceC22685
    /* JADX INFO: renamed from: ۙ */
    public final int mo3246(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        int length = charSequence.length();
        if (length < 100) {
            return charSequence.hashCode();
        }
        return charSequence.charAt(length / 2) | (length << 16);
    }

    @Override // l.InterfaceC22685
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3247(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence instanceof C16277) {
            C16277 c16277 = (C16277) charSequence;
            if (charSequence2 instanceof C16277) {
                return c16277.equals((C16277) charSequence2);
            }
            return c16277.m38434(charSequence2);
        }
        if (charSequence2 instanceof C16277) {
            return ((C16277) charSequence2).m38434(charSequence);
        }
        return charSequence.equals(charSequence2);
    }
}
