package l;

/* JADX INFO: renamed from: l.۠ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W7RE */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8816 implements InterfaceC23955 {
    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC5571 interfaceC5571 = (InterfaceC5571) obj2;
        C15243.m36590(str, "acc");
        C15243.m36590(interfaceC5571, "element");
        if (str.length() == 0) {
            return interfaceC5571.toString();
        }
        return str + ", " + interfaceC5571;
    }
}
