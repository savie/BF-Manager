package l;

import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6156 implements InterfaceC7359, InterfaceC21133, InterfaceC21570, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21014;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21015;

    public /* synthetic */ C6156(int i, Object obj) {
        this.f21014 = i;
        this.f21015 = obj;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f21014) {
            case 0:
                ViewOnLayoutChangeListenerC3333.m9906((ViewOnLayoutChangeListenerC3333) this.f21015, menuItem);
                break;
            default:
                C17901.m41537((C17901) this.f21015, menuItem);
                break;
        }
        return true;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC19333) obj).mo2595((List) this.f21015);
    }

    @Override // l.InterfaceC21570
    /* JADX INFO: renamed from: ۙ */
    public byte mo14692(int i) {
        ArrayList arrayList = (ArrayList) this.f21015;
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2519 c2519 = (C2519) arrayList.get(i2);
            int iM7847 = c2519.m7847() - 1;
            if (i < iM7847) {
                return c2519.m7860(i + 1);
            }
            i -= iM7847;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        throw new C9573((String) this.f21015);
    }
}
