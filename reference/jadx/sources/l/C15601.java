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

/* JADX INFO: renamed from: l.ܺ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes5.dex */
public class C15601 extends ComponentCallbacksC22654 implements InterfaceC21174, InterfaceC7769 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f50732;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18377 f50733;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8545 f50734;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17492 f50735;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6094 f50736;

    public C15601() {
        super(R.layout.MT_Protector);
        this.f50732 = Collections.EMPTY_LIST;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50733 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        C8545 c8545 = new C8545(this);
        this.f50734 = c8545;
        c8545.m25007((InterfaceC21174) this);
        this.f50734.m25005((InterfaceC7769) this);
        this.f50733.m42622().m44959(this, new C22442(3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ᩳ֨ۜ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37264(final C15601 c15601, C6094 c6094) {
        c15601.f50736 = c6094;
        c6094.m16545(c15601, new C4496(c15601, 2));
        c6094.m16546(c15601, (C17716) new InterfaceC10597() { // from class: l.ᩳ֨ۜ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C15601.m37262(this.f56251, (Set) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37261(C15601 c15601, List list) {
        c15601.f50732 = list;
        c15601.f50734.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37262(C15601 c15601, Set set) {
        HashSet hashSetM25024 = c15601.f50734.m25024();
        c15601.f50734.m24996(1, set);
        c15601.f50734.m24999(hashSetM25024);
        c15601.f50734.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C17492 c17492 = (C17492) view.findViewById(R.id.MT_Protector);
        this.f50735 = c17492;
        c17492.setTag("RecyclerView1");
        this.f50735.setAdapter(this.f50734);
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f50735.setAdapter(null);
        this.f50735 = null;
    }

    @Override // l.InterfaceC21174
    /* JADX INFO: renamed from: ܰ */
    public final void mo6613(C11381 c11381) {
        String strM28482 = c11381.m28482();
        C16737.m39274(new RunnableC1009(2, this, strM28482), 500L);
        ((ActivityC5677) requireActivity()).m15660(strM28482, (C8500) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37260(C15601 c15601, String str) {
        C6094 c6094 = c15601.f50736;
        if (c6094 != null) {
            c6094.m16532(str);
        }
    }

    @Override // l.InterfaceC7769
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6612(final C11381 c11381) {
        if (!c11381.m28481()) {
            return false;
        }
        C16195 c16195 = new C16195(requireContext(), c11381.m28489(), 0);
        final C1529 c1529 = new C1529(c16195, c11381.m28482(), true);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.᩸֨ۜ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C15601.m37263(this.f69201, c1529, c11381, menuItem);
                return true;
            }
        });
        this.f50735.suppressLayout(true);
        c16195.m38295(new C12686(6, this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37263(C15601 c15601, C1529 c1529, C11381 c11381, MenuItem menuItem) {
        if (c1529.m5303(menuItem)) {
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c15601.f50733.m42626(c11381.m28482());
            return;
        }
        ActivityC5677 activityC5677 = (ActivityC5677) c15601.requireActivity();
        try {
            String strM16551 = c15601.f50736.m16551(c11381.m28482());
            String strM15668 = activityC5677.m15668(c11381.m28482());
            C4388 c4388M12241 = C4388.m12241();
            c4388M12241.m12245(R.string.MT_Protector, strM16551);
            c4388M12241.m12250(R.string.MT_Protector, strM15668);
            c4388M12241.m12242(".smali");
            c4388M12241.m12243();
            c4388M12241.m12251(c11381.m28482());
            c4388M12241.m12244(R.string.MT_Protector);
            c4388M12241.m12249(c11381.m28488());
            c4388M12241.m12246(C6730.m18175(c11381.m28482()) + ".smali");
            c4388M12241.m12248(activityC5677);
        } catch (IOException e) {
            activityC5677.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
