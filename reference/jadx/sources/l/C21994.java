package l;

/* JADX INFO: renamed from: l.᩷ۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes2.dex */
public final class C21994 extends AbstractC13006 implements InterfaceC23955 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C21994 f70949 = new C21994(2);

    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        InterfaceC5571 interfaceC5571 = (InterfaceC5571) obj2;
        if (!(interfaceC5571 instanceof InterfaceC16120)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? interfaceC5571 : Integer.valueOf(iIntValue + 1);
    }
}
