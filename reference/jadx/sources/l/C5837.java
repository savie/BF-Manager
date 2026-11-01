package l;

/* JADX INFO: renamed from: l.ۛۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5837 implements InterfaceC19010 {
    @Override // l.InterfaceC19010
    public final boolean apply(Object obj) {
        InterfaceC0723 interfaceC0723 = (InterfaceC0723) obj;
        if (!(interfaceC0723 instanceof InterfaceC14131)) {
            return false;
        }
        Cloneable expression = ((InterfaceC14131) interfaceC0723).getExpression();
        return (expression instanceof InterfaceC6844) && ((InterfaceC6844) expression).getType() == null;
    }
}
