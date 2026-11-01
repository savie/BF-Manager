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

/* JADX INFO: renamed from: l.ۢۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public class C9497 extends ComponentCallbacksC22654 implements InterfaceC21174, InterfaceC7769 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f32138;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18377 f32139;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10908 f32140;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17492 f32141;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8229 f32142;

    public C9497() {
        super(R.layout.MT_Protector);
        this.f32138 = Collections.EMPTY_LIST;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32139 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        C10908 c10908 = new C10908(this);
        this.f32140 = c10908;
        c10908.m25007((InterfaceC21174) this);
        this.f32140.m25005((InterfaceC7769) this);
        this.f32139.m42658().m44959(this, new C22442(2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩶ۢۘ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.֡ۢۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24331(final C9497 c9497, C8229 c8229) {
        c9497.f32142 = c8229;
        c8229.m21583(c9497, (C20080) new InterfaceC10597() { // from class: l.᩶ۢۘ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C9497.m24329(this.f65234, (List) obj);
            }
        });
        c8229.m21582(c9497, (C0323) new InterfaceC10597() { // from class: l.֡ۢۘ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C9497.m24330(this.f1700, (Set) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24329(C9497 c9497, List list) {
        c9497.f32138 = list;
        c9497.f32140.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24330(C9497 c9497, Set set) {
        HashSet hashSetM25024 = c9497.f32140.m25024();
        c9497.f32140.m24996(1, set);
        c9497.f32140.m24999(hashSetM25024);
        c9497.f32140.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C17492 c17492 = (C17492) view.findViewById(R.id.MT_Protector);
        this.f32141 = c17492;
        c17492.setTag("RecyclerView1");
        this.f32141.setAdapter(this.f32140);
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f32141.setAdapter(null);
        this.f32141 = null;
    }

    @Override // l.InterfaceC21174
    /* JADX INFO: renamed from: ܰ */
    public final void mo6613(C11381 c11381) {
        String strM28482 = c11381.m28482();
        C16737.m39274(new RunnableC15178(4, this, strM28482), 500L);
        ((ActivityC5677) requireActivity()).m15674(strM28482, (C8500) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24328(C9497 c9497, String str) {
        C8229 c8229 = c9497.f32142;
        if (c8229 != null) {
            c8229.m21575(str);
        }
    }

    @Override // l.InterfaceC7769
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6612(final C11381 c11381) {
        if (!c11381.m28481()) {
            return false;
        }
        C16195 c16195 = new C16195(requireContext(), c11381.m28489(), 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.ܽۢۘ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C9497.m24332(this.f53157, c11381, menuItem);
                return true;
            }
        });
        this.f32141.suppressLayout(true);
        c16195.m38295(new C4895(this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24332(C9497 c9497, C11381 c11381, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c9497.f32139.m42650(c11381.m28482());
            return;
        }
        ActivityC5677 activityC5677 = (ActivityC5677) c9497.requireActivity();
        try {
            String strM21570 = c9497.f32142.m21570(c11381.m28482());
            String strM15652 = activityC5677.m15652(c11381.m28482());
            C4388 c4388M12241 = C4388.m12241();
            c4388M12241.m12245(R.string.MT_Protector, strM21570);
            c4388M12241.m12250(R.string.MT_Protector, strM15652);
            c4388M12241.m12242(".xml");
            c4388M12241.m12243();
            c4388M12241.m12251(c11381.m28482());
            c4388M12241.m12244(R.string.MT_Protector);
            c4388M12241.m12249(c11381.m28488());
            c4388M12241.m12246(C6730.m18175(c11381.m28482()) + ".xml");
            c4388M12241.m12248(activityC5677);
        } catch (IOException e) {
            activityC5677.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
