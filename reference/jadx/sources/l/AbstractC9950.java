package l;

/* JADX INFO: renamed from: l.ۢۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G683 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9950 implements InterfaceC4685 {
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC4685)) {
            return false;
        }
        InterfaceC4685 interfaceC4685 = (InterfaceC4685) obj;
        return mo4114() == interfaceC4685.mo4114() && mo4115() == interfaceC4685.mo4115() && mo4116().equals(interfaceC4685.mo4116());
    }
}
