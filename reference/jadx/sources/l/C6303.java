package l;

/* JADX INFO: renamed from: l.ۛ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W7RE */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6303 implements InterfaceC8400 {
    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3208(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC2629 interfaceC2629 = (InterfaceC2629) obj2;
        C13465.m32966(str, "acc");
        C13465.m32966(interfaceC2629, "element");
        if (str.length() == 0) {
            return interfaceC2629.toString();
        }
        return str + ", " + interfaceC2629;
    }
}
