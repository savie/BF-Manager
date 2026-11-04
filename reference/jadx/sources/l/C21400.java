package l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.᩶ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public class C21400 extends ComponentCallbacksC11612 implements InterfaceC2264, InterfaceC5993 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9378 f68162;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22761 f68163;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f68164;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Stack f68165;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14686 f68166;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9378 f68167;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C25227 f68168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11967 f68169;

    public C21400() {
        super(R.layout.MT_Protector);
        this.f68165 = new Stack();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14686 c14686 = new C14686(this);
        this.f68166 = c14686;
        c14686.m35942((InterfaceC2264) this);
        this.f68166.m35944((InterfaceC5993) this);
        C22761 c22761 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f68163 = c22761;
        c22761.m51322().m40350(this, new C15916(2, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48657(C21400 c21400, C11967 c11967) {
        c21400.f68169 = c11967;
        Bundle arguments = c21400.getArguments();
        if (arguments != null && arguments.containsKey("dataFile")) {
            c21400.f68162 = (C9378) arguments.getSerializable("dataFile");
            c21400.f68167 = (C9378) arguments.getSerializable("configFile");
            c21400.f68164 = true;
        } else {
            c21400.f68162 = new C9378(c11967.m29968(), "search");
            c21400.f68167 = new C9378(c11967.m29968(), "searchCfg");
            c21400.f68164 = false;
            c21400.f68163.m51315(c21400, new C3755(c21400));
        }
        Stack stack = c21400.f68165;
        stack.clear();
        if (c21400.f68162.m24702()) {
            try {
                C20348 c20348M46740 = C20348.m46740(c21400.f68162.m24700());
                if (c20348M46740.readInt() == -2021510030) {
                    int i = c20348M46740.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        stack.push(new C1878(c20348M46740));
                    }
                    if (!stack.isEmpty()) {
                        C20348 c20348M46741 = C20348.m46740(c21400.f68167.m24700());
                        int i3 = c20348M46741.readInt();
                        if (i3 == -2021510029) {
                            HashSet hashSet = ((C1878) stack.peek()).f6307;
                            int i4 = c20348M46741.readInt();
                            for (int i5 = 0; i5 < i4; i5++) {
                                hashSet.add(c20348M46741.m46758());
                            }
                        } else if (i3 == -2021510028) {
                            int iM46749 = c20348M46741.m46749();
                            for (int i6 = 0; i6 < iM46749; i6++) {
                                HashSet hashSet2 = ((C1878) stack.get(i6)).f6307;
                                int i7 = c20348M46741.readInt();
                                for (int i8 = 0; i8 < i7; i8++) {
                                    hashSet2.add(c20348M46741.m46758());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        c21400.m48666();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48658(C21400 c21400, Object[] objArr) {
        if (c21400.f68164) {
            return;
        }
        C1878 c1878 = (C1878) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Stack stack = c21400.f68165;
        if (!zBooleanValue) {
            stack.clear();
        }
        stack.push(c1878);
        c21400.m48668();
        c21400.m48666();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C25227 c25227 = (C25227) view.findViewById(R.id.MT_Protector);
        this.f68168 = c25227;
        c25227.setTag("RecyclerView2");
        this.f68168.setAdapter(this.f68166);
    }

    @Override // l.ComponentCallbacksC11612
    public final void onResume() {
        super.onResume();
        this.f68166.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f68168.setAdapter(null);
        this.f68168 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m48668() {
        C6178 c6178M34975 = C14483.m34975(-2021510030);
        Stack stack = this.f68165;
        c6178M34975.writeInt(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((C1878) it.next()).m6426(c6178M34975);
        }
        try {
            this.f68162.m24696(c6178M34975.m17799());
        } catch (IOException unused) {
        }
        m48661();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m48661() {
        Stack stack = this.f68165;
        if (stack.isEmpty()) {
            this.f68167.m24697();
            return;
        }
        C6178 c6178M34975 = C14483.m34975(-2021510028);
        c6178M34975.mo17812(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            HashSet hashSet = ((C1878) it.next()).f6307;
            c6178M34975.writeInt(hashSet.size());
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                c6178M34975.m17800((String) it2.next());
            }
        }
        try {
            this.f68167.m24696(c6178M34975.m17799());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m48664(C21400 c21400) {
        c21400.f68165.clear();
        c21400.f68162.m24697();
        c21400.f68167.m24697();
        c21400.m48666();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m48666() {
        if (this.f68166 == null) {
            return;
        }
        Stack stack = this.f68165;
        this.f68166.m35938(2, stack.isEmpty() ? Collections.EMPTY_SET : ((C1878) stack.peek()).m6424());
        this.f68166.m35960();
    }

    @Override // l.InterfaceC5993
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12934(final C8230 c8230) {
        C11967 c11967;
        final boolean zM22142 = c8230.m22142();
        if (zM22142 && (c11967 = this.f68169) != null && !c11967.m30009(c8230.m22146())) {
            return false;
        }
        C18452 c18452 = new C18452(requireContext(), c8230.m22143(), 0);
        if (zM22142) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۧܶۧ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C21400.m48656(this.f37873, c8230, zM22142, menuItem);
                return true;
            }
        });
        this.f68168.suppressLayout(true);
        c18452.m42993(new C25130(this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48656(C21400 c21400, C8230 c8230, boolean z, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c21400.f68163.m51327(c8230.m22146());
            return;
        }
        C1878 c1878 = (C1878) c21400.f68165.peek();
        if (z) {
            if (c1878.m6425(c8230.m22146()) == null) {
                return;
            }
            c8230.m22140();
            c1878.m6429(c8230.m22146());
        } else if (c1878.m6423(c8230.m22146(), new RunnableC1518(3, c8230)) == 0) {
            return;
        }
        c21400.m48668();
        c21400.f68166.m35318();
    }

    @Override // l.InterfaceC2264
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7690(C8230 c8230) {
        C11967 c11967 = this.f68169;
        if (c11967 == null || c11967.m30009(c8230.m22146())) {
            ((ActivityC0848) requireActivity()).m3452(c8230.m22146(), (C15301) null);
            this.f68169.m29972(c8230.m22146());
            if (((C1878) this.f68165.peek()).f6307.add(c8230.m22146())) {
                C21576.m49069(new RunnableC22655(1, this, c8230), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48655(C21400 c21400, C8230 c8230) {
        c21400.f68166.notifyItemChanged(c8230.m22144());
        c21400.m48661();
    }
}
