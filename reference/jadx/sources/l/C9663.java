package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۡ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes4.dex */
public class C9663 extends AbstractC5703 {
    @Override // l.AbstractC5703
    /* JADX INFO: renamed from: ᩴ */
    public final void mo16738() {
        Bundle bundleRequireArguments = requireArguments();
        if (bundleRequireArguments.containsKey("preferencesName")) {
            m16737().m2330(bundleRequireArguments.getString("preferencesName"));
        }
        m16733(bundleRequireArguments.getInt("layoutID"));
        m25175((AbstractC16889) m16741());
        ActivityC3409 activity = getActivity();
        if (activity instanceof AbstractActivityC2952) {
            ((AbstractActivityC2952) activity).mo6716(this, m16741());
        }
        if (bundleRequireArguments.containsKey("scrollTo")) {
            String string = bundleRequireArguments.getString("scrollTo");
            C17359.requireNonNull(string);
            m16740(string);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25175(AbstractC16889 abstractC16889) {
        int iM39845 = abstractC16889.m39845();
        for (int i = 0; i < iM39845; i++) {
            C3906 c3906M39849 = abstractC16889.m39849(i);
            if (c3906M39849 instanceof C21806) {
                C21806 c21806 = (C21806) c3906M39849;
                if (!AbstractActivityC2952.f9637.contains(c3906M39849.m12557())) {
                    c21806.mo12567(c21806.m49461());
                }
                c21806.m12572(this);
            } else if (c3906M39849 instanceof C20071) {
                c3906M39849.m12572(this);
            } else if (c3906M39849 instanceof C10462) {
                c3906M39849.m12572(this);
            } else if (c3906M39849 instanceof C7207) {
                c3906M39849.m12572(this);
            } else if (c3906M39849 instanceof AbstractC16889) {
                m25175((AbstractC16889) c3906M39849);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25176(C3906 c3906, Object obj) {
        ActivityC3409 activity = getActivity();
        if (!((activity instanceof AbstractActivityC2952) && ((AbstractActivityC2952) activity).mo6717(this, c3906, obj)) && (c3906 instanceof C21806)) {
            C21806 c21806 = (C21806) c3906;
            if (AbstractActivityC2952.f9637.contains(c3906.m12557())) {
                return;
            }
            c3906.mo12567(c21806.m49458()[c21806.m49457((String) obj)]);
        }
    }
}
