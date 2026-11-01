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

/* JADX INFO: renamed from: l.᩹ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes2.dex */
public class C22032 extends ComponentCallbacksC22654 implements InterfaceC21174, InterfaceC7769 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13626 f71402;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Stack f71403;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18377 f71404;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f71405;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5098 f71406;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6094 f71407;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17492 f71408;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13626 f71409;

    public C22032() {
        super(R.layout.MT_Protector);
        this.f71403 = new Stack();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5098 c5098 = new C5098(this);
        this.f71406 = c5098;
        c5098.m25007((InterfaceC21174) this);
        this.f71406.m25005((InterfaceC7769) this);
        C18377 c18377 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f71404 = c18377;
        c18377.m42622().m44959(this, new InterfaceC10597() { // from class: l.᩶۬ۜ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C22032.m48926(this.f65521, (C6094) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ܽ۬ۜ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48926(final C22032 c22032, C6094 c6094) {
        c22032.f71407 = c6094;
        Bundle arguments = c22032.getArguments();
        if (arguments != null && arguments.containsKey("dataFile")) {
            c22032.f71402 = (C13626) arguments.getSerializable("dataFile");
            c22032.f71409 = (C13626) arguments.getSerializable("configFile");
            c22032.f71405 = true;
        } else {
            c22032.f71402 = new C13626(c6094.m16575(), "search");
            c22032.f71409 = new C13626(c6094.m16575(), "searchCfg");
            c22032.f71405 = false;
            c22032.f71404.m42641(c22032, (C16657) new InterfaceC0380() { // from class: l.ܽ۬ۜ
                @Override // l.InterfaceC0380
                /* JADX INFO: renamed from: ۙ */
                public final void mo1825(Object obj) {
                    C22032.m48930(this.f53408, (Object[]) obj);
                }
            });
        }
        Stack stack = c22032.f71403;
        stack.clear();
        if (c22032.f71402.m33326()) {
            try {
                C17367 c17367M40441 = C17367.m40441(c22032.f71402.m33327());
                if (c17367M40441.readInt() == -2021510030) {
                    int i = c17367M40441.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        stack.push(new C10617(c17367M40441));
                    }
                    if (!stack.isEmpty()) {
                        C17367 c17367M40442 = C17367.m40441(c22032.f71409.m33327());
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
        c22032.m48937();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48930(C22032 c22032, Object[] objArr) {
        if (c22032.f71405) {
            return;
        }
        C10617 c10617 = (C10617) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Stack stack = c22032.f71403;
        if (!zBooleanValue) {
            stack.clear();
        }
        stack.push(c10617);
        c22032.m48922();
        c22032.m48937();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C17492 c17492 = (C17492) view.findViewById(R.id.MT_Protector);
        this.f71408 = c17492;
        c17492.setTag("RecyclerView2");
        this.f71408.setAdapter(this.f71406);
        this.f71404.m42628(getViewLifecycleOwner(), new C0297(this));
        this.f71404.m42634(getViewLifecycleOwner(), new C15952(this));
        this.f71404.m42653(getViewLifecycleOwner(), new C23648(7, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48923(C14500 c14500, boolean z) {
        if (this.f71407 == null) {
            C6094 c6094 = (C6094) this.f71404.m42622().m44956();
            C13638.requireNonNull(c6094);
            this.f71407 = c6094;
        }
        new C11013(this, (ActivityC5677) requireActivity(), z, c14500).m10243();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onResume() {
        super.onResume();
        this.f71406.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f71408.setAdapter(null);
        this.f71408 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48927(C22032 c22032, C10617 c10617) {
        c22032.f71403.push(c10617);
        c22032.m48922();
        c22032.m48937();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m48922() {
        C11018 c11018M43576 = C18917.m43576(-2021510030);
        Stack stack = this.f71403;
        c11018M43576.writeInt(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((C10617) it.next()).m26799(c11018M43576);
        }
        try {
            this.f71402.m33322(c11018M43576.m27798());
        } catch (IOException unused) {
        }
        m48933();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m48933() {
        Stack stack = this.f71403;
        if (stack.isEmpty()) {
            this.f71409.m33323();
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
            this.f71409.m33322(c11018M43576.m27798());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m48931(C22032 c22032) {
        c22032.f71403.clear();
        c22032.f71402.m33323();
        c22032.f71409.m33323();
        c22032.m48937();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m48937() {
        if (this.f71406 == null) {
            return;
        }
        Stack stack = this.f71403;
        this.f71406.m24996(2, stack.isEmpty() ? Collections.EMPTY_SET : ((C10617) stack.peek()).m26797());
        this.f71406.m25011();
    }

    @Override // l.InterfaceC7769
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6612(final C11381 c11381) {
        final C1529 c1529;
        C6094 c6094;
        final boolean zM28481 = c11381.m28481();
        if (zM28481 && (c6094 = this.f71407) != null && !c6094.m16563(c11381.m28482())) {
            return false;
        }
        C16195 c16195 = new C16195(requireContext(), c11381.m28489(), 0);
        if (zM28481) {
            c1529 = new C1529(c16195, c11381.m28482(), true);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            c1529 = null;
        }
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.۫۬ۜ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C22032.m48925(this.f41460, c1529, c11381, zM28481, menuItem);
                return true;
            }
        });
        this.f71408.suppressLayout(true);
        c16195.m38295(new InterfaceC7728() { // from class: l.ܿ۬ۜ
            @Override // l.InterfaceC7728
            /* JADX INFO: renamed from: ۙ */
            public final void mo11010(C16195 c16196) {
                this.f55243.f71408.suppressLayout(false);
            }
        });
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48925(C22032 c22032, C1529 c1529, C11381 c11381, boolean z, MenuItem menuItem) {
        if (c1529 == null || !c1529.m5303(menuItem)) {
            if (menuItem.getItemId() == R.string.MT_Protector) {
                c22032.f71404.m42626(c11381.m28482());
                return;
            }
            C10617 c10617 = (C10617) c22032.f71403.peek();
            if (z) {
                if (c10617.m26798(c11381.m28482()) == null) {
                    return;
                }
                c11381.m28487();
                c10617.m26802(c11381.m28482());
            } else if (c10617.m26796(c11381.m28482(), new RunnableC5843(2, c11381)) == 0) {
                return;
            }
            c22032.m48922();
            c22032.f71406.m14205();
        }
    }

    @Override // l.InterfaceC21174
    /* JADX INFO: renamed from: ܰ */
    public final void mo6613(C11381 c11381) {
        C6094 c6094 = this.f71407;
        if (c6094 == null || c6094.m16563(c11381.m28482())) {
            ((ActivityC5677) requireActivity()).m15660(c11381.m28482(), (C8500) null);
            this.f71407.m16532(c11381.m28482());
            if (((C10617) this.f71403.peek()).f36281.add(c11381.m28482())) {
                C16737.m39274(new RunnableC0428(0, this, c11381), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48928(C22032 c22032, C11381 c11381) {
        c22032.f71406.notifyItemChanged(c11381.m28485());
        c22032.m48933();
    }
}
