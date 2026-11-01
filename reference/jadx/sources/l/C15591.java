package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15591 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17706 f50705;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC9011[] f50706;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f50707;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f50708;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14655[] f50709;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C15591 c15591 = (C15591) obj;
        C17706 c17706 = this.f50705;
        if (c17706 == null) {
            return c15591.f50705 == null ? 0 : -1;
        }
        C17706 c17707 = c15591.f50705;
        if (c17707 == null) {
            return 1;
        }
        return c17706.compareTo(c17707);
    }

    public C15591(C12063 c12063) {
        super(c12063);
        this.f50705 = null;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        AbstractC9011 abstractC9011M44688;
        this.f50707 = c13825.m33647();
        this.f50709 = new C14655[c13825.m33647()];
        C19594 c19594 = this.f30808.f40354;
        int i = 0;
        while (true) {
            C14655[] c14655Arr = this.f50709;
            if (i < c14655Arr.length) {
                int iM33647 = c13825.m33647() - 1;
                if (iM33647 == -1) {
                    c19594.getClass();
                    abstractC9011M44688 = null;
                } else {
                    abstractC9011M44688 = c19594.m44688(iM33647);
                }
                c14655Arr[i] = (C14655) abstractC9011M44688;
                i++;
            } else {
                int iM33639 = c13825.m33639();
                ArrayList arrayList = new ArrayList(50);
                C7829.m20654(c13825, new C8535(this, arrayList));
                AbstractC9011[] abstractC9011Arr = new AbstractC9011[arrayList.size()];
                this.f50706 = abstractC9011Arr;
                arrayList.toArray(abstractC9011Arr);
                int iM336310 = c13825.m33639() - iM33639;
                c13825.m33643(iM33639);
                this.f50708 = c13825.m33646(iM336310);
                return;
            }
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        int iM33072 = C13530.m33072(this.f50709.length) + C13530.m33072(this.f50707) + i;
        C14655[] c14655Arr = this.f50709;
        int length = c14655Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            C14655 c14655 = c14655Arr[i2];
            iM33072 += C13530.m33072(c14655 == null ? 0 : c14655.f30809 + 1);
        }
        C13825 c13825 = new C13825(this.f50708);
        C7123 c7123 = new C7123(this);
        C7829.m20654(c13825, c7123);
        return iM33072 + c7123.f33954;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12842(this.f50707);
        c4651.m12842(this.f50709.length);
        C14655[] c14655Arr = this.f50709;
        int length = c14655Arr.length;
        for (int i = 0; i < length; i++) {
            C14655 c14655 = c14655Arr[i];
            c4651.m12842(c14655 == null ? 0 : c14655.f30809 + 1);
        }
        C7829.m20654(new C13825(this.f50708), new C20529(this, c4651));
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return C9576.m24440(new StringBuilder("debug_info_item @0x"), this.f30807);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37255(C17706 c17706) {
        this.f50705 = c17706;
    }
}
