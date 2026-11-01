package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R69D */
/* JADX INFO: loaded from: classes3.dex */
public final class C7018 extends C14075 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23584;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f23585;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f23586;

    @Override // l.C14075, l.AbstractC7724
    /* JADX INFO: renamed from: ۚ */
    public final void mo9290() {
    }

    public C7018(C10547 c10547, int i, InterfaceC22969 interfaceC22969) {
        int key;
        super(c10547, i, interfaceC22969);
        int iM26681 = c10547.m26681(i);
        this.f23584 = new ArrayList();
        boolean z = true;
        if (iM26681 >= 0) {
            key = 0;
            boolean z2 = true;
            for (InterfaceC2568 interfaceC2568 : interfaceC22969.mo14955()) {
                if (z2) {
                    key = interfaceC2568.getKey();
                    z2 = false;
                }
                C8430 c8430M23459 = c10547.m26683().m23459(new C8430(c10547.f36110, interfaceC2568.mo8019() + iM26681, "pswitch_"));
                if (c8430M23459.m22081()) {
                    c8430M23459.m22078(String.format("%s, 0x%x", c8430M23459.m22076(), Integer.valueOf(interfaceC2568.getKey())));
                } else {
                    c8430M23459.m22078(String.format("0x%x", Integer.valueOf(interfaceC2568.getKey())));
                }
                this.f23584.add(new C1373(c8430M23459));
            }
        } else {
            this.f23585 = true;
            key = 0;
            for (InterfaceC2568 interfaceC2569 : interfaceC22969.mo14955()) {
                if (z) {
                    key = interfaceC2569.getKey();
                    z = false;
                }
                this.f23584.add(new C13369(interfaceC2569.mo8019()));
            }
        }
        this.f23586 = key;
    }

    @Override // l.C14075, l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        if (this.f23585) {
            c12283 = new C7330(c12283);
        }
        c12283.getClass();
        c12283.write(".packed-switch ", 0, 15);
        int i = this.f23586;
        C0667.m2995(c12283, i);
        c12283.m30527();
        c12283.write(10);
        boolean z = this.f46226.f36110.f66203;
        for (AbstractC4195 abstractC4195 : this.f23584) {
            if (abstractC4195 instanceof C1373) {
                ((C1373) abstractC4195).f5745.m22080(c12283);
            } else {
                abstractC4195.mo4823(c12283);
            }
            String str = String.format("  #%08x", Integer.valueOf(i));
            c12283.write(str, 0, str.length());
            if (z) {
                m34043(c12283, i);
            }
            c12283.write(10);
            i++;
        }
        c12283.m30526();
        c12283.write(".end packed-switch", 0, 18);
        return true;
    }
}
