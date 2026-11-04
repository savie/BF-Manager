package l;

/* JADX INFO: renamed from: l.֡ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47S6 */
/* JADX INFO: loaded from: classes3.dex */
public class C0240 implements InterfaceC16075 {
    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        Class clsM18232 = c6446.m18232();
        if (!Enum.class.isAssignableFrom(clsM18232) || clsM18232 == Enum.class) {
            return null;
        }
        if (!clsM18232.isEnum()) {
            clsM18232 = clsM18232.getSuperclass();
        }
        return new C7698(clsM18232);
    }
}
