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

/* JADX INFO: renamed from: l.ᩳܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes5.dex */
public class C19206 extends ComponentCallbacksC11612 implements InterfaceC2264, InterfaceC5993 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C25227 f62118;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C22761 f62119;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21444 f62120;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f62121;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11967 f62122;

    public C19206() {
        super(R.layout.MT_Protector);
        this.f62121 = Collections.EMPTY_LIST;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f62119 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        C21444 c21444 = new C21444(this);
        this.f62120 = c21444;
        c21444.m35942((InterfaceC2264) this);
        this.f62120.m35944((InterfaceC5993) this);
        this.f62119.m51322().m40350(this, new C19787(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ۨܽۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44514(final C19206 c19206, C11967 c11967) {
        c19206.f62122 = c11967;
        c11967.m29982(c19206, new C15311(1, c19206));
        c11967.m29981(c19206, (C12493) new InterfaceC16438() { // from class: l.ۨܽۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C19206.m44512(this.f40113, (Set) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44511(C19206 c19206, List list) {
        c19206.f62121 = list;
        c19206.f62120.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44512(C19206 c19206, Set set) {
        HashSet hashSetM35957 = c19206.f62120.m35957();
        c19206.f62120.m35938(1, set);
        c19206.f62120.m35941(hashSetM35957);
        c19206.f62120.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C25227 c25227 = (C25227) view.findViewById(R.id.MT_Protector);
        this.f62118 = c25227;
        c25227.setTag("RecyclerView1");
        this.f62118.setAdapter(this.f62120);
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f62118.setAdapter(null);
        this.f62118 = null;
    }

    @Override // l.InterfaceC2264
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7690(C8230 c8230) {
        String strM22146 = c8230.m22146();
        C21576.m49069(new RunnableC6528(0, this, strM22146), 500L);
        ((ActivityC0848) requireActivity()).m3452(strM22146, (C15301) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44510(C19206 c19206, String str) {
        C11967 c11967 = c19206.f62122;
        if (c11967 != null) {
            c11967.m29972(str);
        }
    }

    @Override // l.InterfaceC5993
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12934(C8230 c8230) {
        if (!c8230.m22142()) {
            return false;
        }
        C18452 c18452 = new C18452(requireContext(), c8230.m22143(), 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new C10460(this, c8230));
        this.f62118.suppressLayout(true);
        c18452.m42993(new C11021(this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44513(C19206 c19206, C8230 c8230, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c19206.f62119.m51327(c8230.m22146());
            return;
        }
        ActivityC0848 activityC0848 = (ActivityC0848) c19206.requireActivity();
        try {
            String strM30005 = c19206.f62122.m30005(c8230.m22146());
            String strM3455 = activityC0848.m3455(c8230.m22146());
            C2459 c2459M8296 = C2459.m8296();
            c2459M8296.m8299(R.string.MT_Protector, strM30005);
            c2459M8296.m8304(R.string.MT_Protector, strM3455);
            c2459M8296.m8306(".xml");
            c2459M8296.m8297();
            c2459M8296.m8305(c8230.m22146());
            c2459M8296.m8298(R.string.MT_Protector);
            c2459M8296.m8303(c8230.m22145());
            c2459M8296.m8300(C11293.m28558(c8230.m22146()) + ".xml");
            c2459M8296.m8302(activityC0848);
        } catch (IOException e) {
            activityC0848.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
