package l;

/* JADX INFO: renamed from: l.֨ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6628 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1002 extends AbstractC13679 implements InterfaceC2338 {
    public final int hashCode() {
        return mo7876().hashCode() + ((mo7878().hashCode() + ((mo7877().hashCode() + ((mo7875().hashCode() + (getName().hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC2338)) {
            InterfaceC2338 interfaceC2338 = (InterfaceC2338) obj;
            if (mo7875().equals(interfaceC2338.mo7875()) && mo7877().equals(interfaceC2338.mo7877()) && mo7878().equals(interfaceC2338.mo7878()) && mo7876().equals(interfaceC2338.mo7876())) {
                return true;
            }
        }
        return false;
    }
}
