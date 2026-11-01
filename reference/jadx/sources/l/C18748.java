package l;

import android.view.MenuItem;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18748 implements InterfaceC21133, InterfaceC3263, InterfaceC11974, InterfaceC1692 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60797;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60798;

    public /* synthetic */ C18748(Object obj, Object obj2) {
        this.f60797 = obj;
        this.f60798 = obj2;
    }

    @Override // l.InterfaceC1692
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC11974
    /* JADX INFO: renamed from: ۙ */
    public C12731 mo15512(String str, String str2, String str3) {
        return C10282.m26075((C10282) this.f60797, (AbstractC20745) this.f60798, str, str2, str3);
    }

    @Override // l.InterfaceC1692
    /* JADX INFO: renamed from: ۙ */
    public void mo3908(String str) {
        C23814.m52485((C23814) this.f60797, (AbstractActivityC12483) this.f60798, str);
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        InterfaceC23898 interfaceC23898 = (InterfaceC23898) this.f60797;
        C23630 c23630 = (C23630) this.f60798;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            ApplicationC0716.f2992.edit().putString("dsai", interfaceC23898.mo16277().flattenToString()).apply();
            C15829.m37611(R.string.MT_Protector);
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            return true;
        }
        c23630.m52099(interfaceC23898);
        return true;
    }

    @Override // l.InterfaceC3263
    /* JADX INFO: renamed from: ۙ */
    public void mo3187(final C10840 c10840) {
        final C11545 c11545 = (C11545) this.f60797;
        final C21422 c21422 = (C21422) this.f60798;
        c10840.m27172();
        c11545.m28817().m28625(c11545, c11545.m28797(), new InterfaceC3263() { // from class: l.᩺᩵᩹
            @Override // l.InterfaceC3263
            /* JADX INFO: renamed from: ۙ */
            public final void mo3187(C10840 c10841) {
                String name;
                String name2;
                c10841.m27172();
                C10840 c10842 = c10840;
                AbstractC20745 abstractC20745M27177 = c10842.m27177();
                AbstractC20745 abstractC20745M27178 = c10841.m27177();
                C21422 c21423 = c21422;
                boolean zM28762 = c21423.m47965().m28762();
                if (abstractC20745M27177.getName().equals(abstractC20745M27178.getName())) {
                    int i = R.string.MT_Protector;
                    name = C16737.m39264(zM28762 ? R.string.MT_Protector : R.string.MT_Protector, abstractC20745M27177.getName());
                    if (!zM28762) {
                        i = R.string.MT_Protector;
                    }
                    name2 = C16737.m39264(i, abstractC20745M27178.getName());
                } else {
                    name = abstractC20745M27177.getName();
                    name2 = abstractC20745M27178.getName();
                }
                C3246 c3246 = new C3246(c10842.m27177(), c10841.m27177(), name, name2, c21423.m47960(), c11545.m28817());
                if (!zM28762) {
                    c3246.m9718();
                }
                C6306.m17403(c21423.m47965(), c3246);
            }
        });
    }
}
