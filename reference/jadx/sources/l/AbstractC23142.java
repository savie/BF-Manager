package l;

/* JADX INFO: renamed from: l.᩺ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6628 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23142 extends AbstractC8325 implements InterfaceC18029 {
    public final int hashCode() {
        return mo19720().hashCode() + ((mo19721().hashCode() + ((mo19722().hashCode() + ((mo19719().hashCode() + (getName().hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC18029)) {
            InterfaceC18029 interfaceC18029 = (InterfaceC18029) obj;
            if (mo19719().equals(interfaceC18029.mo19719()) && mo19722().equals(interfaceC18029.mo19722()) && mo19721().equals(interfaceC18029.mo19721()) && mo19720().equals(interfaceC18029.mo19720())) {
                return true;
            }
        }
        return false;
    }
}
