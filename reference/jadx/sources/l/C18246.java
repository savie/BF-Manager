package l;

import android.view.MenuItem;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ᩳᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18246 implements InterfaceC23891, InterfaceC21133 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58233;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58234;

    public /* synthetic */ C18246(Object obj, Object obj2) {
        this.f58233 = obj;
        this.f58234 = obj2;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        ViewOnClickListenerC15847.m37724((ViewOnClickListenerC15847) this.f58233, (C11381) this.f58234, menuItem);
        return true;
    }

    @Override // l.InterfaceC23891
    /* JADX INFO: renamed from: ۙ */
    public void mo11094(String str, C5546 c5546) {
        C6936 c6936 = (C6936) this.f58233;
        Main main = (Main) this.f58234;
        if (ApplicationC0716.f2988.getBoolean("bookmark_swipe_pos_aware", false)) {
            c6936.m18650(main.m118().m20964());
        }
        if (c5546 != null) {
            if (main.m132(c5546.m15296(), str, c5546.m15295())) {
                c6936.m18637();
            }
        } else {
            c6936.m18637();
            final AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
            final C11545 c11545M18646 = c6936.m18646();
            final boolean zMo33974 = abstractC20745M15313.mo33974();
            C16737.m39274(new Runnable() { // from class: l.۠ᩴ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = zMo33974;
                    C11545 c11545 = c11545M18646;
                    AbstractC20745 abstractC20745 = abstractC20745M15313;
                    if (!z) {
                        c11545.m28763(abstractC20745.getName());
                    }
                    c11545.m28812(z ? abstractC20745.mo33986() : abstractC20745.getParent(), true);
                }
            }, 180L);
        }
    }
}
