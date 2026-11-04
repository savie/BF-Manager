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

/* JADX INFO: renamed from: l.ܿܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public class C18372 extends ComponentCallbacksC11612 implements InterfaceC2264, InterfaceC5993 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20283 f59861;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22761 f59862;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f59863;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Stack f59864;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21356 f59865;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9378 f59866;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C25227 f59867;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9378 f59868;

    public C18372() {
        super(R.layout.MT_Protector);
        this.f59864 = new Stack();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21356 c21356 = new C21356(this);
        this.f59865 = c21356;
        c21356.m35942((InterfaceC2264) this);
        this.f59865.m35944((InterfaceC5993) this);
        C22761 c22761 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f59862 = c22761;
        c22761.m51321().m40350(this, new C23304(4, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42855(C18372 c18372, C20283 c20283) {
        c18372.f59861 = c20283;
        Bundle arguments = c18372.getArguments();
        if (arguments != null && arguments.containsKey("dataFile")) {
            c18372.f59866 = (C9378) arguments.getSerializable("dataFile");
            c18372.f59868 = (C9378) arguments.getSerializable("configFile");
            c18372.f59863 = true;
        } else {
            c18372.f59866 = new C9378(c20283.m46610(), "search");
            c18372.f59868 = new C9378(c20283.m46610(), "searchCfg");
            c18372.f59863 = false;
            c18372.f59862.m51314(c18372, new C8648(c18372));
        }
        Stack stack = c18372.f59864;
        stack.clear();
        if (c18372.f59866.m24702()) {
            try {
                C20348 c20348M46740 = C20348.m46740(c18372.f59866.m24700());
                if (c20348M46740.readInt() == -2021510030) {
                    int i = c20348M46740.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        stack.push(new C1878(c20348M46740));
                    }
                    if (!stack.isEmpty()) {
                        C20348 c20348M46741 = C20348.m46740(c18372.f59868.m24700());
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
        c18372.m42867();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42857(C18372 c18372, Object[] objArr) {
        if (c18372.f59863) {
            return;
        }
        C1878 c1878 = (C1878) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Stack stack = c18372.f59864;
        if (!zBooleanValue) {
            stack.clear();
        }
        stack.push(c1878);
        c18372.m42870();
        c18372.m42867();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C25227 c25227 = (C25227) view.findViewById(R.id.MT_Protector);
        this.f59867 = c25227;
        c25227.setTag("RecyclerView2");
        this.f59867.setAdapter(this.f59865);
        this.f59862.m51307(getViewLifecycleOwner(), new C17299(6, this));
        this.f59862.m51304(getViewLifecycleOwner(), new C11398(9, this));
        this.f59862.m51309(getViewLifecycleOwner(), new C19403(6, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m42858(C21532 c21532, boolean z) {
        if (this.f59861 == null) {
            C20283 c20283 = (C20283) this.f59862.m51321().m40346();
            C17359.requireNonNull(c20283);
            this.f59861 = c20283;
        }
        new C16880(this, (ActivityC0848) requireActivity(), z, c21532).m8197();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onResume() {
        super.onResume();
        this.f59865.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f59867.setAdapter(null);
        this.f59867 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42853(C18372 c18372, C1878 c1878) {
        c18372.f59864.push(c1878);
        c18372.m42870();
        c18372.m42867();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m42870() {
        C6178 c6178M34975 = C14483.m34975(-2021510030);
        Stack stack = this.f59864;
        c6178M34975.writeInt(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((C1878) it.next()).m6426(c6178M34975);
        }
        try {
            this.f59866.m24696(c6178M34975.m17799());
        } catch (IOException unused) {
        }
        m42861();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m42861() {
        Stack stack = this.f59864;
        if (stack.isEmpty()) {
            this.f59868.m24697();
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
            this.f59868.m24696(c6178M34975.m17799());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m42865(C18372 c18372) {
        c18372.f59864.clear();
        c18372.f59866.m24697();
        c18372.f59868.m24697();
        c18372.m42867();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m42867() {
        if (this.f59865 == null) {
            return;
        }
        Stack stack = this.f59864;
        this.f59865.m35938(2, stack.isEmpty() ? Collections.EMPTY_SET : ((C1878) stack.peek()).m6424());
        this.f59865.m35960();
    }

    @Override // l.InterfaceC5993
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12934(final C8230 c8230) {
        final C0408 c0408;
        C20283 c20283;
        final boolean zM22142 = c8230.m22142();
        if (zM22142 && (c20283 = this.f59861) != null && !c20283.m46617(c8230.m22146())) {
            return false;
        }
        C18452 c18452 = new C18452(requireContext(), c8230.m22143(), 0);
        if (zM22142) {
            c0408 = new C0408(c18452, c8230.m22146(), true);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            c0408 = null;
        }
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۧܰۧ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C18372.m42852(this.f37788, c0408, c8230, zM22142, menuItem);
                return true;
            }
        });
        this.f59867.suppressLayout(true);
        c18452.m42993(new C9492(6, this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42852(C18372 c18372, C0408 c0408, C8230 c8230, boolean z, MenuItem menuItem) {
        if (c0408 == null || !c0408.m2214(menuItem)) {
            if (menuItem.getItemId() == R.string.MT_Protector) {
                c18372.f59862.m51298(c8230.m22146());
                return;
            }
            C1878 c1878 = (C1878) c18372.f59864.peek();
            if (z) {
                if (c1878.m6425(c8230.m22146()) == null) {
                    return;
                }
                c8230.m22140();
                c1878.m6429(c8230.m22146());
            } else if (c1878.m6423(c8230.m22146(), new RunnableC1518(3, c8230)) == 0) {
                return;
            }
            c18372.m42870();
            c18372.f59865.m48578();
        }
    }

    @Override // l.InterfaceC2264
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7690(C8230 c8230) {
        C20283 c20283 = this.f59861;
        if (c20283 == null || c20283.m46617(c8230.m22146())) {
            ((ActivityC0848) requireActivity()).m3431(c8230.m22146(), (C15301) null);
            this.f59861.m46575(c8230.m22146());
            if (((C1878) this.f59864.peek()).f6307.add(c8230.m22146())) {
                C21576.m49069(new RunnableC4755(2, this, c8230), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42854(C18372 c18372, C8230 c8230) {
        c18372.f59865.notifyItemChanged(c8230.m22144());
        c18372.m42861();
    }
}
