package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܽᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08DV */
/* JADX INFO: loaded from: classes4.dex */
public class C16831 extends AbstractC0998 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f53871 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f53872 = new LinkedHashMap();

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ܰ */
    public final void mo2809() {
        Iterator it = this.f53871.iterator();
        while (it.hasNext()) {
            ((AbstractC0998) it.next()).mo2809();
        }
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ۙ */
    public final void mo3814() {
        Iterator it = this.f53871.iterator();
        while (it.hasNext()) {
            ((AbstractC0998) it.next()).mo3814();
        }
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ۙ */
    public final void mo3820(boolean z) {
        super.mo3820(z);
        Iterator it = this.f53871.iterator();
        while (it.hasNext()) {
            ((AbstractC0998) it.next()).mo3820(z);
        }
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ۙ */
    public final void mo3816(C3403 c3403) {
        super.mo3816(c3403);
        Iterator it = this.f53871.iterator();
        while (it.hasNext()) {
            ((AbstractC0998) it.next()).mo3816(c3403);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39478(AbstractC0998 abstractC0998) {
        this.f53871.add(abstractC0998);
        abstractC0998.m3819(this);
        abstractC0998.mo3820(m3812());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39479(C7659 c7659, String str) {
        this.f53872.put(str.toLowerCase(), c7659);
    }

    @Override // l.AbstractC0998
    /* JADX INFO: renamed from: ۙ */
    public final C16126 mo3813(String str) {
        C16126 c16126Mo3813 = super.mo3813(str);
        return c16126Mo3813 == null ? (C16126) this.f53872.get(str.toLowerCase()) : c16126Mo3813;
    }
}
