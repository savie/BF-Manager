package l;

/* JADX INFO: renamed from: l.᩶᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21626 implements InterfaceC6163 {
    @Override // l.InterfaceC6163
    public final boolean apply(Object obj) {
        InterfaceC22049 interfaceC22049 = (InterfaceC22049) obj;
        if (!(interfaceC22049 instanceof InterfaceC16322)) {
            return false;
        }
        Cloneable expression = ((InterfaceC16322) interfaceC22049).getExpression();
        return (expression instanceof InterfaceC14589) && ((InterfaceC14589) expression).getType() == null;
    }
}
