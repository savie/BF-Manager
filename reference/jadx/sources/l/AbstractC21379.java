package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y660 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21379 implements InterfaceC19969 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f69516;

    @Override // l.InterfaceC19969
    public int getLine() {
        return 0;
    }

    @Override // l.InterfaceC19969
    public InterfaceC19969 getParent() {
        return null;
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ۖ */
    public void mo42953(int i) {
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ۖ */
    public boolean mo41440() {
        return false;
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ۙ */
    public int mo42954() {
        return 0;
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ܰ */
    public int mo42958() {
        return 0;
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ܰ */
    public void mo42960(InterfaceC19969 interfaceC19969) {
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19969 mo45257(int i) {
        List list = this.f69516;
        if (list == null || i >= list.size()) {
            return null;
        }
        return (InterfaceC19969) this.f69516.get(i);
    }

    @Override // l.InterfaceC19969
    public final int getChildCount() {
        List list = this.f69516;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // l.InterfaceC19969
    /* JADX INFO: renamed from: ۙ */
    public final void mo45258(InterfaceC19969 interfaceC19969) {
        if (interfaceC19969 == null) {
            return;
        }
        AbstractC21379 abstractC21379 = (AbstractC21379) interfaceC19969;
        if (abstractC21379.mo41440()) {
            List list = this.f69516;
            if (list != null && list == abstractC21379.f69516) {
                throw new RuntimeException("attempt to add child list to itself");
            }
            List list2 = abstractC21379.f69516;
            if (list2 != null) {
                int i = 0;
                if (list != null) {
                    int size = list2.size();
                    while (i < size) {
                        InterfaceC19969 interfaceC199610 = (InterfaceC19969) abstractC21379.f69516.get(i);
                        this.f69516.add(interfaceC199610);
                        interfaceC199610.mo42960(this);
                        interfaceC199610.mo42953(this.f69516.size() - 1);
                        i++;
                    }
                    return;
                }
                this.f69516 = list2;
                int childCount = getChildCount();
                while (i < childCount) {
                    InterfaceC19969 interfaceC19969Mo45257 = mo45257(i);
                    interfaceC19969Mo45257.mo42953(i);
                    interfaceC19969Mo45257.mo42960(this);
                    i++;
                }
                return;
            }
            return;
        }
        if (this.f69516 == null) {
            this.f69516 = new ArrayList();
        }
        this.f69516.add(interfaceC19969);
        abstractC21379.mo42960(this);
        abstractC21379.mo42953(this.f69516.size() - 1);
    }
}
