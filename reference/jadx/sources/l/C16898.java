package l;

import java.util.AbstractList;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16898 extends AbstractList {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12665 f54041;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f54042;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractViewOnClickListenerC6314[] f54043;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m39572(AbstractViewOnClickListenerC6314 abstractViewOnClickListenerC6314) {
        int i = 0;
        for (int i2 = 0; i2 < this.f54043.length; i2++) {
            if (i2 == 2 && !this.f54042.isEmpty()) {
                int size = this.f54042.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractViewOnClickListenerC6314 abstractViewOnClickListenerC6315 = (AbstractViewOnClickListenerC6314) this.f54042.get(i3);
                    int iMo17413 = abstractViewOnClickListenerC6315.mo17413();
                    if (iMo17413 != 0) {
                        if (abstractViewOnClickListenerC6315 == abstractViewOnClickListenerC6314) {
                            return i;
                        }
                        i += iMo17413;
                    }
                }
            }
            AbstractViewOnClickListenerC6314 abstractViewOnClickListenerC6316 = this.f54043[i2];
            int iMo17414 = abstractViewOnClickListenerC6316.mo17413();
            if (iMo17414 != 0) {
                if (abstractViewOnClickListenerC6316 == abstractViewOnClickListenerC6314) {
                    return i;
                }
                i += iMo17414;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized AbstractC5609 m39573(int i) {
        if (this.f54041.f42286.f19213 == i) {
            return this.f54041.f42286;
        }
        int size = this.f54042.size();
        for (int i2 = 0; i2 < size; i2++) {
            C9138 c9138 = (C9138) this.f54042.get(i2);
            if (c9138.f19213 == i) {
                return c9138;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m39574() {
        this.f54041.f42286.m15484();
        this.f54042.clear();
        C4757.m13200(new C0669(this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized int m39575() {
        int iMo17413;
        iMo17413 = 0;
        for (AbstractViewOnClickListenerC6314 abstractViewOnClickListenerC6314 : this.f54043) {
            iMo17413 += abstractViewOnClickListenerC6314.mo17413();
        }
        int size = this.f54042.size();
        for (int i = 0; i < size; i++) {
            iMo17413 += ((C9138) this.f54042.get(i)).mo17413();
        }
        return iMo17413;
    }

    public C16898(C12665 c12665) {
        this.f54041 = c12665;
        C16753 c16753 = c12665.f42290;
        C13638.requireNonNull(c16753);
        C1229 c1229 = c12665.f42286;
        C13638.requireNonNull(c1229);
        C23561 c23561 = c12665.f42293;
        C13638.requireNonNull(c23561);
        C8432 c8432 = c12665.f42291;
        C13638.requireNonNull(c8432);
        C19575 c19575 = c12665.f42285;
        C13638.requireNonNull(c19575);
        C11359 c11359 = c12665.f42296;
        C13638.requireNonNull(c11359);
        this.f54043 = new AbstractViewOnClickListenerC6314[]{c16753, c1229, c23561, c8432, c19575, c11359};
        this.f54042 = new ArrayList();
        m39574();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39571(C16898 c16898, C9843 c9843) {
        C12665 c12665 = c16898.f54041;
        C9138 c9138 = new C9138(c12665.f42288, c12665, c9843);
        c9138.m15484();
        c16898.f54042.add(c9138);
    }

    @Override // java.util.AbstractList, java.util.List
    public final synchronized AbstractViewOnClickListenerC6314 get(int i) {
        if (i >= 2) {
            int i2 = i - 2;
            if (i2 < this.f54042.size()) {
                return (AbstractViewOnClickListenerC6314) this.f54042.get(i2);
            }
            i -= this.f54042.size();
        }
        return this.f54043[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54042.size() + this.f54043.length;
    }
}
