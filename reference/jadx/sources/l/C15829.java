package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes5.dex */
public class C15829 extends ComponentCallbacksC11612 implements InterfaceC2264, InterfaceC5993 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C25227 f51491;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C22761 f51492;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11354 f51493;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f51494;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20283 f51495;

    public C15829() {
        super(R.layout.MT_Protector);
        this.f51494 = Collections.EMPTY_LIST;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51492 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        C11354 c11354 = new C11354(this);
        this.f51493 = c11354;
        c11354.m35942((InterfaceC2264) this);
        this.f51493.m35944((InterfaceC5993) this);
        this.f51492.m51321().m40350(this, new C11772(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ᩴۘۧ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ܳۘۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37779(final C15829 c15829, C20283 c20283) {
        c15829.f51495 = c20283;
        c20283.m46586(c15829, (C19559) new InterfaceC16438() { // from class: l.ᩴۘۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C15829.m37776(this.f63076, (List) obj);
            }
        });
        c20283.m46585(c15829, (C15083) new InterfaceC16438() { // from class: l.ܳۘۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C15829.m37777(this.f49228, (Set) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37776(C15829 c15829, List list) {
        c15829.f51494 = list;
        c15829.f51493.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37777(C15829 c15829, Set set) {
        HashSet hashSetM35957 = c15829.f51493.m35957();
        c15829.f51493.m35938(1, set);
        c15829.f51493.m35941(hashSetM35957);
        c15829.f51493.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C25227 c25227 = (C25227) view.findViewById(R.id.MT_Protector);
        this.f51491 = c25227;
        c25227.setTag("RecyclerView1");
        this.f51491.setAdapter(this.f51493);
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f51491.setAdapter(null);
        this.f51491 = null;
    }

    @Override // l.InterfaceC2264
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7690(C8230 c8230) {
        String strM22146 = c8230.m22146();
        C21576.m49069(new RunnableC5927(1, strM22146, this), 500L);
        ((ActivityC0848) requireActivity()).m3431(strM22146, (C15301) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37775(C15829 c15829, String str) {
        C20283 c20283 = c15829.f51495;
        if (c20283 != null) {
            c20283.m46575(str);
        }
    }

    @Override // l.InterfaceC5993
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12934(final C8230 c8230) {
        if (!c8230.m22142()) {
            return false;
        }
        C18452 c18452 = new C18452(requireContext(), c8230.m22143(), 0);
        final C0408 c0408 = new C0408(c18452, c8230.m22146(), true);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.᩸ۘۧ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C15829.m37778(this.f72882, c0408, c8230, menuItem);
                return true;
            }
        });
        this.f51491.suppressLayout(true);
        c18452.m42993(new C6330(this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37778(C15829 c15829, C0408 c0408, C8230 c8230, MenuItem menuItem) {
        if (c0408.m2214(menuItem)) {
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c15829.f51492.m51298(c8230.m22146());
            return;
        }
        ActivityC0848 activityC0848 = (ActivityC0848) c15829.requireActivity();
        try {
            String strM46597 = c15829.f51495.m46597(c8230.m22146());
            String strM3435 = activityC0848.m3435(c8230.m22146());
            C2459 c2459M8296 = C2459.m8296();
            c2459M8296.m8299(R.string.MT_Protector, strM46597);
            c2459M8296.m8304(R.string.MT_Protector, strM3435);
            c2459M8296.m8306(".smali");
            c2459M8296.m8297();
            c2459M8296.m8305(c8230.m22146());
            c2459M8296.m8298(R.string.MT_Protector);
            c2459M8296.m8303(c8230.m22145());
            c2459M8296.m8300(C11293.m28558(c8230.m22146()) + ".smali");
            c2459M8296.m8302(activityC0848);
        } catch (IOException e) {
            activityC0848.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
