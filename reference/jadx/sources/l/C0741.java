package l;

/* JADX INFO: renamed from: l.֡᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes3.dex */
public final class C0741 extends AbstractC11348 implements InterfaceC8400 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C0741 f3034 = new C0741(2);

    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo3208(Object obj, Object obj2) {
        InterfaceC2629 interfaceC2629 = (InterfaceC2629) obj2;
        if (!(interfaceC2629 instanceof InterfaceC15041)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? interfaceC2629 : Integer.valueOf(iIntValue + 1);
    }
}
