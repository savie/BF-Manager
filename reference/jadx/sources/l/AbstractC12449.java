package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12449 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11038 f41509;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f41511;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC6098 f41512;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f41513 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41510 = AbstractC6741.f22680;

    /* JADX INFO: renamed from: ܰ */
    public int mo2279() {
        return 1;
    }

    public AbstractC12449(C11038 c11038, EnumC6098 enumC6098, Object obj) {
        this.f41509 = c11038;
        this.f41512 = enumC6098;
        this.f41511 = obj;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo2277(InterfaceC10434 interfaceC10434, int i) {
        interfaceC10434.mo18524(this.f41509.m18222(i, this.f41512.m16590()));
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo2280(InterfaceC10434 interfaceC10434, int i) {
        interfaceC10434.mo18524(this.f41509.m18222(i, this.f41512.m16595()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30922() {
        return this.f41513;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30923(IOException iOException) {
        this.f41513.add(iOException);
    }

    /* JADX INFO: renamed from: ۨ */
    public String mo2278() {
        return String.valueOf(this.f41511);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC12449)) {
            return false;
        }
        AbstractC12449 abstractC12449 = (AbstractC12449) obj;
        if (this.f41512 != abstractC12449.f41512) {
            return false;
        }
        return this.f41511.equals(abstractC12449.f41511);
    }

    public int hashCode() {
        return this.f41511.hashCode() + (this.f41512.hashCode() * 31);
    }

    public final String toString() {
        return "<CONSTANT " + this.f41512 + " " + mo2278() + ">";
    }
}
