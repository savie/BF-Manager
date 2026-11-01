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

/* JADX INFO: renamed from: l.᩻ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes2.dex */
public class C23421 extends ComponentCallbacksC22654 implements InterfaceC21174, InterfaceC7769 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13626 f75830;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Stack f75831;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18377 f75832;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75833;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10721 f75834;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13626 f75835;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17492 f75836;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8229 f75837;

    public C23421() {
        super(R.layout.MT_Protector);
        this.f75831 = new Stack();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10721 c10721 = new C10721(this);
        this.f75834 = c10721;
        c10721.m25007((InterfaceC21174) this);
        this.f75834.m25005((InterfaceC7769) this);
        C18377 c18377 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f75832 = c18377;
        c18377.m42658().m44959(this, new InterfaceC10597() { // from class: l.᩵ۗۘ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C23421.m51568(this.f61965, (C8229) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51568(C23421 c23421, C8229 c8229) {
        c23421.f75837 = c8229;
        Bundle arguments = c23421.getArguments();
        if (arguments != null && arguments.containsKey("dataFile")) {
            c23421.f75835 = (C13626) arguments.getSerializable("dataFile");
            c23421.f75830 = (C13626) arguments.getSerializable("configFile");
            c23421.f75833 = true;
        } else {
            c23421.f75835 = new C13626(c8229.m21572(), "search");
            c23421.f75830 = new C13626(c8229.m21572(), "searchCfg");
            c23421.f75833 = false;
            c23421.f75832.m42642(c23421, new C13217(c23421));
        }
        Stack stack = c23421.f75831;
        stack.clear();
        if (c23421.f75835.m33326()) {
            try {
                C17367 c17367M40441 = C17367.m40441(c23421.f75835.m33327());
                if (c17367M40441.readInt() == -2021510030) {
                    int i = c17367M40441.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        stack.push(new C10617(c17367M40441));
                    }
                    if (!stack.isEmpty()) {
                        C17367 c17367M40442 = C17367.m40441(c23421.f75830.m33327());
                        int i3 = c17367M40442.readInt();
                        if (i3 == -2021510029) {
                            HashSet hashSet = ((C10617) stack.peek()).f36281;
                            int i4 = c17367M40442.readInt();
                            for (int i5 = 0; i5 < i4; i5++) {
                                hashSet.add(c17367M40442.m40458());
                            }
                        } else if (i3 == -2021510028) {
                            int iM40462 = c17367M40442.m40462();
                            for (int i6 = 0; i6 < iM40462; i6++) {
                                HashSet hashSet2 = ((C10617) stack.get(i6)).f36281;
                                int i7 = c17367M40442.readInt();
                                for (int i8 = 0; i8 < i7; i8++) {
                                    hashSet2.add(c17367M40442.m40458());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        c23421.m51577();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51571(C23421 c23421, Object[] objArr) {
        if (c23421.f75833) {
            return;
        }
        C10617 c10617 = (C10617) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Stack stack = c23421.f75831;
        if (!zBooleanValue) {
            stack.clear();
        }
        stack.push(c10617);
        c23421.m51566();
        c23421.m51577();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C17492 c17492 = (C17492) view.findViewById(R.id.MT_Protector);
        this.f75836 = c17492;
        c17492.setTag("RecyclerView2");
        this.f75836.setAdapter(this.f75834);
    }

    @Override // l.ComponentCallbacksC22654
    public final void onResume() {
        super.onResume();
        this.f75834.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f75836.setAdapter(null);
        this.f75836 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m51566() {
        C11018 c11018M43576 = C18917.m43576(-2021510030);
        Stack stack = this.f75831;
        c11018M43576.writeInt(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((C10617) it.next()).m26799(c11018M43576);
        }
        try {
            this.f75835.m33322(c11018M43576.m27798());
        } catch (IOException unused) {
        }
        m51574();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m51574() {
        Stack stack = this.f75831;
        if (stack.isEmpty()) {
            this.f75830.m33323();
            return;
        }
        C11018 c11018M43576 = C18917.m43576(-2021510028);
        c11018M43576.mo24508(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            HashSet hashSet = ((C10617) it.next()).f36281;
            c11018M43576.writeInt(hashSet.size());
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                c11018M43576.m27786((String) it2.next());
            }
        }
        try {
            this.f75830.m33322(c11018M43576.m27798());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m51572(C23421 c23421) {
        c23421.f75831.clear();
        c23421.f75835.m33323();
        c23421.f75830.m33323();
        c23421.m51577();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m51577() {
        if (this.f75834 == null) {
            return;
        }
        Stack stack = this.f75831;
        this.f75834.m24996(2, stack.isEmpty() ? Collections.EMPTY_SET : ((C10617) stack.peek()).m26797());
        this.f75834.m25011();
    }

    @Override // l.InterfaceC7769
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6612(final C11381 c11381) {
        C8229 c8229;
        final boolean zM28481 = c11381.m28481();
        if (zM28481 && (c8229 = this.f75837) != null && !c8229.m21609(c11381.m28482())) {
            return false;
        }
        C16195 c16195 = new C16195(requireContext(), c11381.m28489(), 0);
        if (zM28481) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.ۡۗۘ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C23421.m51570(this.f29713, c11381, zM28481, menuItem);
                return true;
            }
        });
        this.f75836.suppressLayout(true);
        c16195.m38295((InterfaceC7728) new C15101(6, this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51570(C23421 c23421, C11381 c11381, boolean z, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c23421.f75832.m42650(c11381.m28482());
            return;
        }
        C10617 c10617 = (C10617) c23421.f75831.peek();
        if (z) {
            if (c10617.m26798(c11381.m28482()) == null) {
                return;
            }
            c11381.m28487();
            c10617.m26802(c11381.m28482());
        } else if (c10617.m26796(c11381.m28482(), new RunnableC5843(2, c11381)) == 0) {
            return;
        }
        c23421.m51566();
        c23421.f75834.m26947();
    }

    @Override // l.InterfaceC21174
    /* JADX INFO: renamed from: ܰ */
    public final void mo6613(C11381 c11381) {
        C8229 c8229 = this.f75837;
        if (c8229 == null || c8229.m21609(c11381.m28482())) {
            ((ActivityC5677) requireActivity()).m15674(c11381.m28482(), (C8500) null);
            this.f75837.m21575(c11381.m28482());
            if (((C10617) this.f75831.peek()).f36281.add(c11381.m28482())) {
                C16737.m39274(new RunnableC23104(2, this, c11381), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51569(C23421 c23421, C11381 c11381) {
        c23421.f75834.notifyItemChanged(c11381.m28485());
        c23421.m51574();
    }
}
