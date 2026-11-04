package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y660 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10476 implements InterfaceC22915 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f33340;

    @Override // l.InterfaceC22915
    public int getLine() {
        return 0;
    }

    @Override // l.InterfaceC22915
    public InterfaceC22915 getParent() {
        return null;
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ۙ */
    public int mo25318() {
        return 0;
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ᩷ */
    public int mo25323() {
        return 0;
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ᩷ */
    public void mo25325(InterfaceC22915 interfaceC22915) {
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ᩸ */
    public void mo25326(int i) {
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ᩸ */
    public boolean mo5415() {
        return false;
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22915 mo26898(int i) {
        List list = this.f33340;
        if (list == null || i >= list.size()) {
            return null;
        }
        return (InterfaceC22915) this.f33340.get(i);
    }

    @Override // l.InterfaceC22915
    public final int getChildCount() {
        List list = this.f33340;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // l.InterfaceC22915
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26899(InterfaceC22915 interfaceC22915) {
        if (interfaceC22915 == null) {
            return;
        }
        AbstractC10476 abstractC10476 = (AbstractC10476) interfaceC22915;
        if (abstractC10476.mo5415()) {
            List list = this.f33340;
            if (list != null && list == abstractC10476.f33340) {
                throw new RuntimeException("attempt to add child list to itself");
            }
            List list2 = abstractC10476.f33340;
            if (list2 != null) {
                int i = 0;
                if (list != null) {
                    int size = list2.size();
                    while (i < size) {
                        InterfaceC22915 interfaceC22916 = (InterfaceC22915) abstractC10476.f33340.get(i);
                        this.f33340.add(interfaceC22916);
                        interfaceC22916.mo25325(this);
                        interfaceC22916.mo25326(this.f33340.size() - 1);
                        i++;
                    }
                    return;
                }
                this.f33340 = list2;
                int childCount = getChildCount();
                while (i < childCount) {
                    InterfaceC22915 interfaceC22915Mo26898 = mo26898(i);
                    interfaceC22915Mo26898.mo25326(i);
                    interfaceC22915Mo26898.mo25325(this);
                    i++;
                }
                return;
            }
            return;
        }
        if (this.f33340 == null) {
            this.f33340 = new ArrayList();
        }
        this.f33340.add(interfaceC22915);
        abstractC10476.mo25325(this);
        abstractC10476.mo25326(this.f33340.size() - 1);
    }
}
