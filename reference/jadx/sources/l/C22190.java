package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z93V */
/* JADX INFO: loaded from: classes.dex */
public final class C22190 implements InterfaceC6790 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f72592;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5256 f72593;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f72594;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f72595;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2433 f72596;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC6790 f72597;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11607 f72598;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f72599;

    public C22190(List list, boolean z, InterfaceC6790 interfaceC6790, boolean z2) {
        this.f72592 = list;
        this.f72599 = z;
        this.f72597 = interfaceC6790;
        this.f72595 = z2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m49236() {
        this.f72597 = null;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m49234() {
        if (this.f72599) {
            return;
        }
        this.f72592 = new ArrayList(this.f72592);
        this.f72599 = true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m49231() {
        if (this.f72594 == null) {
            this.f72594 = new ArrayList(this.f72592.size());
            for (int i = 0; i < this.f72592.size(); i++) {
                this.f72594.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m49252() {
        return this.f72592.size();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m49238() {
        return this.f72592.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC18245 m49249(int i) {
        return m49230(i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC18245 m49230(int i, boolean z) {
        ArrayList arrayList = this.f72594;
        if (arrayList == null) {
            return (AbstractC18245) this.f72592.get(i);
        }
        C15135 c15135 = (C15135) arrayList.get(i);
        if (c15135 == null) {
            return (AbstractC18245) this.f72592.get(i);
        }
        return z ? c15135.m36297() : c15135.m36295();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0584 m49239(int i) {
        m49231();
        C15135 c15135 = (C15135) this.f72594.get(i);
        if (c15135 == null) {
            C15135 c15136 = new C15135((AbstractC18245) this.f72592.get(i), this, this.f72595);
            this.f72594.set(i, c15136);
            c15135 = c15136;
        }
        return c15135.m36293();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18266 m49244(int i) {
        ArrayList arrayList = this.f72594;
        if (arrayList == null) {
            return (InterfaceC18266) this.f72592.get(i);
        }
        C15135 c15135 = (C15135) arrayList.get(i);
        if (c15135 == null) {
            return (InterfaceC18266) this.f72592.get(i);
        }
        return c15135.m36299();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m49246(int i, AbstractC18245 abstractC18245) {
        C15135 c15135;
        byte[] bArr = C9779.f33478;
        abstractC18245.getClass();
        m49234();
        this.f72592.set(i, abstractC18245);
        ArrayList arrayList = this.f72594;
        if (arrayList != null && (c15135 = (C15135) arrayList.set(i, null)) != null) {
            c15135.m36296();
        }
        m49233();
        m49232();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49251(AbstractC18245 abstractC18245) {
        byte[] bArr = C9779.f33478;
        abstractC18245.getClass();
        m49234();
        this.f72592.add(abstractC18245);
        ArrayList arrayList = this.f72594;
        if (arrayList != null) {
            arrayList.add(null);
        }
        m49233();
        m49232();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49250(int i, AbstractC18245 abstractC18245) {
        byte[] bArr = C9779.f33478;
        abstractC18245.getClass();
        m49234();
        this.f72592.add(i, abstractC18245);
        ArrayList arrayList = this.f72594;
        if (arrayList != null) {
            arrayList.add(i, null);
        }
        m49233();
        m49232();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49242(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC18245 abstractC18245 = (AbstractC18245) it.next();
            byte[] bArr = C9779.f33478;
            abstractC18245.getClass();
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
        m49234();
        if (size >= 0) {
            List list = this.f72592;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            m49251((AbstractC18245) it2.next());
        }
        m49233();
        m49232();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0584 m49241(AbstractC18245 abstractC18245) {
        m49234();
        m49231();
        C15135 c15135 = new C15135(abstractC18245, this, this.f72595);
        this.f72592.add(null);
        this.f72594.add(c15135);
        m49233();
        m49232();
        return c15135.m36293();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0584 m49240(int i, AbstractC18245 abstractC18245) {
        m49234();
        m49231();
        C15135 c15135 = new C15135(abstractC18245, this, this.f72595);
        this.f72592.add(i, null);
        this.f72594.add(i, c15135);
        m49233();
        m49232();
        return c15135.m36293();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m49237(int i) {
        C15135 c15135;
        m49234();
        this.f72592.remove(i);
        ArrayList arrayList = this.f72594;
        if (arrayList != null && (c15135 = (C15135) arrayList.remove(i)) != null) {
            c15135.m36296();
        }
        m49233();
        m49232();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m49245() {
        this.f72592 = Collections.EMPTY_LIST;
        this.f72599 = false;
        ArrayList<C15135> arrayList = this.f72594;
        if (arrayList != null) {
            for (C15135 c15135 : arrayList) {
                if (c15135 != null) {
                    c15135.m36296();
                }
            }
            this.f72594 = null;
        }
        m49233();
        m49232();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m49248() {
        this.f72595 = true;
        boolean z = this.f72599;
        if (!z && this.f72594 == null) {
            return this.f72592;
        }
        if (!z) {
            for (int i = 0; i < this.f72592.size(); i++) {
                InterfaceC1332 interfaceC1332 = (InterfaceC1332) this.f72592.get(i);
                C15135 c15135 = (C15135) this.f72594.get(i);
                if (c15135 == null || c15135.m36297() == interfaceC1332) {
                }
            }
            return this.f72592;
        }
        m49234();
        for (int i2 = 0; i2 < this.f72592.size(); i2++) {
            this.f72592.set(i2, m49230(i2, true));
        }
        List listUnmodifiableList = C0561.unmodifiableList(this.f72592);
        this.f72592 = listUnmodifiableList;
        this.f72599 = false;
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List m49235() {
        if (this.f72596 == null) {
            this.f72596 = new C2433(this);
        }
        return this.f72596;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m49243() {
        if (this.f72598 == null) {
            this.f72598 = new C11607(this);
        }
        return this.f72598;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List m49247() {
        if (this.f72593 == null) {
            this.f72593 = new C5256(this);
        }
        return this.f72593;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m49233() {
        InterfaceC6790 interfaceC6790;
        if (!this.f72595 || (interfaceC6790 = this.f72597) == null) {
            return;
        }
        interfaceC6790.mo18391();
        this.f72595 = false;
    }

    @Override // l.InterfaceC6790
    /* JADX INFO: renamed from: ۙ */
    public final void mo18391() {
        m49233();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m49232() {
        C2433 c2433 = this.f72596;
        if (c2433 != null) {
            c2433.m7417();
        }
        C11607 c11607 = this.f72598;
        if (c11607 != null) {
            c11607.m28939();
        }
        C5256 c5256 = this.f72593;
        if (c5256 != null) {
            c5256.m14527();
        }
    }
}
