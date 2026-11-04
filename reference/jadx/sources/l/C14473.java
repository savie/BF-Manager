package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes5.dex */
public final class C14473 implements InterfaceC7937 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f45547;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC7937 f45548;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C24171 f45549;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f45550;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f45551;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f45552;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6271 f45553;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4033 f45554;

    public C14473(List list, boolean z, InterfaceC7937 interfaceC7937, boolean z2) {
        this.f45550 = list;
        this.f45551 = z;
        this.f45548 = interfaceC7937;
        this.f45552 = z2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34954() {
        this.f45548 = null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m34937() {
        if (this.f45551) {
            return;
        }
        this.f45550 = new ArrayList(this.f45550);
        this.f45551 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m34934() {
        if (this.f45547 == null) {
            this.f45547 = new ArrayList(this.f45550.size());
            for (int i = 0; i < this.f45550.size(); i++) {
                this.f45547.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m34948() {
        return this.f45550.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34938() {
        return this.f45550.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC9035 m34951(int i) {
        return m34933(i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC9035 m34933(int i, boolean z) {
        ArrayList arrayList = this.f45547;
        if (arrayList == null) {
            return (AbstractC9035) this.f45550.get(i);
        }
        C9998 c9998 = (C9998) arrayList.get(i);
        if (c9998 == null) {
            return (AbstractC9035) this.f45550.get(i);
        }
        return z ? c9998.m25854() : c9998.m25853();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15001 m34939(int i) {
        m34934();
        C9998 c9998 = (C9998) this.f45547.get(i);
        if (c9998 == null) {
            C9998 c9999 = new C9998((AbstractC9035) this.f45550.get(i), this, this.f45552);
            this.f45547.set(i, c9999);
            c9998 = c9999;
        }
        return c9998.m25856();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9078 m34944(int i) {
        ArrayList arrayList = this.f45547;
        if (arrayList == null) {
            return (InterfaceC9078) this.f45550.get(i);
        }
        C9998 c9998 = (C9998) arrayList.get(i);
        if (c9998 == null) {
            return (InterfaceC9078) this.f45550.get(i);
        }
        return c9998.m25852();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34946(int i, AbstractC9035 abstractC9035) {
        C9998 c9998;
        byte[] bArr = C23447.f75887;
        abstractC9035.getClass();
        m34937();
        this.f45550.set(i, abstractC9035);
        ArrayList arrayList = this.f45547;
        if (arrayList != null && (c9998 = (C9998) arrayList.set(i, null)) != null) {
            c9998.m25851();
        }
        m34936();
        m34935();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34953(AbstractC9035 abstractC9035) {
        byte[] bArr = C23447.f75887;
        abstractC9035.getClass();
        m34937();
        this.f45550.add(abstractC9035);
        ArrayList arrayList = this.f45547;
        if (arrayList != null) {
            arrayList.add(null);
        }
        m34936();
        m34935();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34952(int i, AbstractC9035 abstractC9035) {
        byte[] bArr = C23447.f75887;
        abstractC9035.getClass();
        m34937();
        this.f45550.add(i, abstractC9035);
        ArrayList arrayList = this.f45547;
        if (arrayList != null) {
            arrayList.add(i, null);
        }
        m34936();
        m34935();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34942(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC9035 abstractC9035 = (AbstractC9035) it.next();
            byte[] bArr = C23447.f75887;
            abstractC9035.getClass();
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return;
            } else {
                size = collection.size();
            }
        } else {
            size = -1;
        }
        m34937();
        if (size >= 0) {
            List list = this.f45550;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            m34953((AbstractC9035) it2.next());
        }
        m34936();
        m34935();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15001 m34941(AbstractC9035 abstractC9035) {
        m34937();
        m34934();
        C9998 c9998 = new C9998(abstractC9035, this, this.f45552);
        this.f45550.add(null);
        this.f45547.add(c9998);
        m34936();
        m34935();
        return c9998.m25856();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15001 m34940(int i, AbstractC9035 abstractC9035) {
        m34937();
        m34934();
        C9998 c9998 = new C9998(abstractC9035, this, this.f45552);
        this.f45550.add(i, null);
        this.f45547.add(i, c9998);
        m34936();
        m34935();
        return c9998.m25856();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34955(int i) {
        C9998 c9998;
        m34937();
        this.f45550.remove(i);
        ArrayList arrayList = this.f45547;
        if (arrayList != null && (c9998 = (C9998) arrayList.remove(i)) != null) {
            c9998.m25851();
        }
        m34936();
        m34935();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34945() {
        this.f45550 = Collections.EMPTY_LIST;
        this.f45551 = false;
        ArrayList<C9998> arrayList = this.f45547;
        if (arrayList != null) {
            for (C9998 c9998 : arrayList) {
                if (c9998 != null) {
                    c9998.m25851();
                }
            }
            this.f45547 = null;
        }
        m34936();
        m34935();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m34950() {
        this.f45552 = true;
        boolean z = this.f45551;
        if (!z && this.f45547 == null) {
            return this.f45550;
        }
        if (!z) {
            for (int i = 0; i < this.f45550.size(); i++) {
                InterfaceC21013 interfaceC21013 = (InterfaceC21013) this.f45550.get(i);
                C9998 c9998 = (C9998) this.f45547.get(i);
                if (c9998 == null || c9998.m25854() == interfaceC21013) {
                }
            }
            return this.f45550;
        }
        m34937();
        for (int i2 = 0; i2 < this.f45550.size(); i2++) {
            this.f45550.set(i2, m34933(i2, true));
        }
        List listUnmodifiableList = C4681.unmodifiableList(this.f45550);
        this.f45550 = listUnmodifiableList;
        this.f45551 = false;
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List m34947() {
        if (this.f45549 == null) {
            this.f45549 = new C24171(this);
        }
        return this.f45549;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m34949() {
        if (this.f45553 == null) {
            this.f45553 = new C6271(this);
        }
        return this.f45553;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m34943() {
        if (this.f45554 == null) {
            this.f45554 = new C4033(this);
        }
        return this.f45554;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34936() {
        InterfaceC7937 interfaceC7937;
        if (!this.f45552 || (interfaceC7937 = this.f45548) == null) {
            return;
        }
        interfaceC7937.mo21509();
        this.f45552 = false;
    }

    @Override // l.InterfaceC7937
    /* JADX INFO: renamed from: ۙ */
    public final void mo21509() {
        m34936();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m34935() {
        C24171 c24171 = this.f45549;
        if (c24171 != null) {
            c24171.m54142();
        }
        C6271 c6271 = this.f45553;
        if (c6271 != null) {
            c6271.m17941();
        }
        C4033 c4033 = this.f45554;
        if (c4033 != null) {
            c4033.m13005();
        }
    }
}
