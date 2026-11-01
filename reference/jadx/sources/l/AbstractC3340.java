package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۗܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ANL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3340 extends ComponentCallbacksC22654 implements InterfaceC10397 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC19432 f12365;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16042 m9942();

    @Override // l.ComponentCallbacksC22654
    public final void onAttach(Context context) {
        C13465.m32966(context, d.R);
        super.onAttach(context);
        AbstractC8894 parentFragmentManager = getParentFragmentManager();
        C13465.m32967(parentFragmentManager, "parentFragmentManager");
        AbstractC11447 abstractC11447M23118 = parentFragmentManager.m23118();
        abstractC11447M23118.mo8551(this);
        abstractC11447M23118.mo8560();
    }

    @Override // l.ComponentCallbacksC22654
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13465.m32966(layoutInflater, "inflater");
        C22246 c22246 = new C22246(layoutInflater.getContext(), null);
        c22246.setId(R.id.MT_Protector);
        C15599 c15599 = new C15599(layoutInflater.getContext());
        c15599.setId(R.id.MT_Protector);
        C4606 c4606 = new C4606(getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        c4606.f16310 = getResources().getInteger(R.integer.MT_Protector);
        c22246.addView(c15599, c4606);
        C15599 c155910 = new C15599(layoutInflater.getContext());
        c155910.setId(R.id.MT_Protector);
        C4606 c4607 = new C4606(getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        c4607.f16310 = getResources().getInteger(R.integer.MT_Protector);
        c22246.addView(c155910, c4607);
        if (getChildFragmentManager().m23077(R.id.MT_Protector) == null) {
            AbstractC16042 abstractC16042M9942 = m9942();
            AbstractC8894 childFragmentManager = getChildFragmentManager();
            C13465.m32967(childFragmentManager, "childFragmentManager");
            AbstractC11447 abstractC11447M23118 = childFragmentManager.m23118();
            abstractC11447M23118.m28567();
            abstractC11447M23118.m28564(abstractC16042M9942);
            abstractC11447M23118.mo8560();
        }
        c22246.m49384();
        return c22246;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ܳܺܰ] */
    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C14494 onBackPressedDispatcher;
        C13465.m32966(view, "view");
        super.onViewCreated(view, bundle);
        this.f12365 = new C1929(this);
        C22246 c22246 = (C22246) requireView();
        int i = C5031.f17539;
        if (!c22246.isLaidOut() || c22246.isLayoutRequested()) {
            c22246.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC9692(this));
        } else {
            AbstractC19432 abstractC19432 = this.f12365;
            C13465.m32962(abstractC19432);
            abstractC19432.m44475(((C22246) requireView()).m49392() && ((C22246) requireView()).m49386());
        }
        getChildFragmentManager().m23086((C14631) new InterfaceC18771() { // from class: l.ܳܺܰ
            @Override // l.InterfaceC18771
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo35139() {
                AbstractC3340.m9939(this.f47862);
            }
        });
        InterfaceC1792 interfaceC1792M6853 = C2228.m6853(view);
        if (interfaceC1792M6853 == null || (onBackPressedDispatcher = interfaceC1792M6853.getOnBackPressedDispatcher()) == null) {
            return;
        }
        InterfaceC1423 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC19432 abstractC19433 = this.f12365;
        C13465.m32962(abstractC19433);
        onBackPressedDispatcher.m34908(viewLifecycleOwner, abstractC19433);
    }

    @Override // l.InterfaceC10397
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9941(AbstractC16042 abstractC16042, C4751 c4751) {
        AbstractC11447 abstractC11447M23118;
        ComponentCallbacksC22654 componentCallbacksC22654Mo1008;
        if (abstractC16042.getId() != R.id.MT_Protector) {
            if (abstractC16042.getId() != R.id.MT_Protector) {
                return false;
            }
            C0075 c0075M23108 = getChildFragmentManager().m23108();
            requireContext().getClassLoader();
            String strM13152 = c4751.m13152();
            C13465.m32962((Object) strM13152);
            ComponentCallbacksC22654 componentCallbacksC22654Mo1009 = c0075M23108.mo1008(strM13152);
            C13465.m32967(componentCallbacksC22654Mo1009, "childFragmentManager.fra….fragment!!\n            )");
            componentCallbacksC22654Mo1009.setArguments(c4751.m13165());
            AbstractC8894 childFragmentManager = getChildFragmentManager();
            C13465.m32967(childFragmentManager, "childFragmentManager");
            abstractC11447M23118 = childFragmentManager.m23118();
            abstractC11447M23118.m28567();
            abstractC11447M23118.m28562(R.id.MT_Protector, componentCallbacksC22654Mo1009, null);
            abstractC11447M23118.m28568();
            abstractC11447M23118.m28560();
        } else {
            if (c4751.m13152() == null) {
                Intent intentM13131 = c4751.m13131();
                if (intentM13131 == null) {
                    return true;
                }
                startActivity(intentM13131);
                return true;
            }
            String strM13153 = c4751.m13152();
            if (strM13153 == null) {
                componentCallbacksC22654Mo1008 = null;
            } else {
                C0075 c0075M23109 = getChildFragmentManager().m23108();
                requireContext().getClassLoader();
                componentCallbacksC22654Mo1008 = c0075M23109.mo1008(strM13153);
            }
            if (componentCallbacksC22654Mo1008 != null) {
                componentCallbacksC22654Mo1008.setArguments(c4751.m13165());
            }
            if (getChildFragmentManager().m23107() > 0) {
                InterfaceC23005 interfaceC23005M23134 = getChildFragmentManager().m23134();
                C13465.m32967(interfaceC23005M23134, "childFragmentManager.getBackStackEntryAt(0)");
                getChildFragmentManager().m23120(interfaceC23005M23134.getId());
            }
            AbstractC8894 childFragmentManager2 = getChildFragmentManager();
            C13465.m32967(childFragmentManager2, "childFragmentManager");
            abstractC11447M23118 = childFragmentManager2.m23118();
            abstractC11447M23118.m28567();
            C13465.m32962(componentCallbacksC22654Mo1008);
            abstractC11447M23118.m28562(R.id.MT_Protector, componentCallbacksC22654Mo1008, null);
            if (((C22246) requireView()).m49386()) {
                abstractC11447M23118.m28568();
            }
            ((C22246) requireView()).m49397();
        }
        abstractC11447M23118.mo8560();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9939(AbstractC3340 abstractC3340) {
        AbstractC19432 abstractC19432 = abstractC3340.f12365;
        C13465.m32962(abstractC19432);
        abstractC19432.m44475(abstractC3340.getChildFragmentManager().m23107() == 0);
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewStateRestored(Bundle bundle) {
        ComponentCallbacksC22654 componentCallbacksC22654Mo1008;
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            ComponentCallbacksC22654 componentCallbacksC22654M23077 = getChildFragmentManager().m23077(R.id.MT_Protector);
            if (componentCallbacksC22654M23077 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
            }
            AbstractC16042 abstractC16042 = (AbstractC16042) componentCallbacksC22654M23077;
            if (abstractC16042.m38029().m31075() > 0) {
                int iM31075 = abstractC16042.m38029().m31075();
                int i = 0;
                while (true) {
                    if (i >= iM31075) {
                        componentCallbacksC22654Mo1008 = null;
                        break;
                    }
                    int i2 = i + 1;
                    C4751 c4751M31078 = abstractC16042.m38029().m31078(i);
                    C13465.m32967(c4751M31078, "headerFragment.preferenc…reen.getPreference(index)");
                    if (c4751M31078.m13152() != null) {
                        String strM13152 = c4751M31078.m13152();
                        if (strM13152 == null) {
                            componentCallbacksC22654Mo1008 = null;
                        } else {
                            C0075 c0075M23108 = getChildFragmentManager().m23108();
                            requireContext().getClassLoader();
                            componentCallbacksC22654Mo1008 = c0075M23108.mo1008(strM13152);
                        }
                        if (componentCallbacksC22654Mo1008 == null) {
                            break;
                        }
                        componentCallbacksC22654Mo1008.setArguments(c4751M31078.m13165());
                        break;
                    }
                    i = i2;
                }
            } else {
                componentCallbacksC22654Mo1008 = null;
                break;
            }
            if (componentCallbacksC22654Mo1008 == null) {
                return;
            }
            AbstractC8894 childFragmentManager = getChildFragmentManager();
            C13465.m32967(childFragmentManager, "childFragmentManager");
            AbstractC11447 abstractC11447M23118 = childFragmentManager.m23118();
            abstractC11447M23118.m28567();
            abstractC11447M23118.m28562(R.id.MT_Protector, componentCallbacksC22654Mo1008, null);
            abstractC11447M23118.mo8560();
        }
    }
}
