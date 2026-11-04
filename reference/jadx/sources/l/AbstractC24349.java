package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.᩺ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ANL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24349 extends ComponentCallbacksC11612 implements InterfaceC19873 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC6323 f78962;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5703 m54391();

    @Override // l.ComponentCallbacksC11612
    public final void onAttach(Context context) {
        C15243.m36590(context, d.R);
        super.onAttach(context);
        AbstractC3191 parentFragmentManager = getParentFragmentManager();
        C15243.m36591(parentFragmentManager, "parentFragmentManager");
        AbstractC4573 abstractC4573M10492 = parentFragmentManager.m10492();
        abstractC4573M10492.mo14350(this);
        abstractC4573M10492.mo14363();
    }

    @Override // l.ComponentCallbacksC11612
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C15243.m36590(layoutInflater, "inflater");
        C10045 c10045 = new C10045(layoutInflater.getContext(), null);
        c10045.setId(R.id.MT_Protector);
        C4155 c4155 = new C4155(layoutInflater.getContext());
        c4155.setId(R.id.MT_Protector);
        C21234 c21234 = new C21234(getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        c21234.f67760 = getResources().getInteger(R.integer.MT_Protector);
        c10045.addView(c4155, c21234);
        C4155 c4156 = new C4155(layoutInflater.getContext());
        c4156.setId(R.id.MT_Protector);
        C21234 c21235 = new C21234(getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        c21235.f67760 = getResources().getInteger(R.integer.MT_Protector);
        c10045.addView(c4156, c21235);
        if (getChildFragmentManager().m10441(R.id.MT_Protector) == null) {
            AbstractC5703 abstractC5703M54391 = m54391();
            AbstractC3191 childFragmentManager = getChildFragmentManager();
            C15243.m36591(childFragmentManager, "childFragmentManager");
            AbstractC4573 abstractC4573M10492 = childFragmentManager.m10492();
            abstractC4573M10492.m14362();
            abstractC4573M10492.m14355(abstractC5703M54391);
            abstractC4573M10492.mo14363();
        }
        c10045.m25942();
        return c10045;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.᩵ܰ᩷] */
    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C7068 onBackPressedDispatcher;
        C15243.m36590(view, "view");
        super.onViewCreated(view, bundle);
        this.f78962 = new C12414(this);
        C10045 c10045 = (C10045) requireView();
        int i = C22666.f73603;
        if (!c10045.isLaidOut() || c10045.isLayoutRequested()) {
            c10045.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6449(this));
        } else {
            AbstractC6323 abstractC6323 = this.f78962;
            C15243.m36586(abstractC6323);
            abstractC6323.m18045(((C10045) requireView()).m25944() && ((C10045) requireView()).m25948());
        }
        getChildFragmentManager().m10456((C20619) new InterfaceC17361() { // from class: l.᩵ܰ᩷
            @Override // l.InterfaceC17361
            /* JADX INFO: renamed from: ۙ */
            public final void mo40789() {
                AbstractC24349.m54389(this.f66140);
            }
        });
        InterfaceC13779 interfaceC13779M37369 = C15622.m37369(view);
        if (interfaceC13779M37369 == null || (onBackPressedDispatcher = interfaceC13779M37369.getOnBackPressedDispatcher()) == null) {
            return;
        }
        InterfaceC11217 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC6323 abstractC6324 = this.f78962;
        C15243.m36586(abstractC6324);
        onBackPressedDispatcher.m19403(viewLifecycleOwner, abstractC6324);
    }

    @Override // l.InterfaceC19873
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo45734(AbstractC5703 abstractC5703, C3906 c3906) {
        AbstractC4573 abstractC4573M10492;
        ComponentCallbacksC11612 componentCallbacksC11612Mo27138;
        if (abstractC5703.getId() != R.id.MT_Protector) {
            if (abstractC5703.getId() != R.id.MT_Protector) {
                return false;
            }
            C21309 c21309M10476 = getChildFragmentManager().m10476();
            requireContext().getClassLoader();
            String strM12593 = c3906.m12593();
            C15243.m36586((Object) strM12593);
            ComponentCallbacksC11612 componentCallbacksC11612Mo27139 = c21309M10476.mo27138(strM12593);
            C15243.m36591(componentCallbacksC11612Mo27139, "childFragmentManager.fra….fragment!!\n            )");
            componentCallbacksC11612Mo27139.setArguments(c3906.m12605());
            AbstractC3191 childFragmentManager = getChildFragmentManager();
            C15243.m36591(childFragmentManager, "childFragmentManager");
            abstractC4573M10492 = childFragmentManager.m10492();
            abstractC4573M10492.m14362();
            abstractC4573M10492.m14353(R.id.MT_Protector, componentCallbacksC11612Mo27139, null);
            abstractC4573M10492.m14361();
            abstractC4573M10492.m14351();
        } else {
            if (c3906.m12593() == null) {
                Intent intentM12587 = c3906.m12587();
                if (intentM12587 == null) {
                    return true;
                }
                startActivity(intentM12587);
                return true;
            }
            String strM12594 = c3906.m12593();
            if (strM12594 == null) {
                componentCallbacksC11612Mo27138 = null;
            } else {
                C21309 c21309M10477 = getChildFragmentManager().m10476();
                requireContext().getClassLoader();
                componentCallbacksC11612Mo27138 = c21309M10477.mo27138(strM12594);
            }
            if (componentCallbacksC11612Mo27138 != null) {
                componentCallbacksC11612Mo27138.setArguments(c3906.m12605());
            }
            if (getChildFragmentManager().m10437() > 0) {
                InterfaceC1700 interfaceC1700M10503 = getChildFragmentManager().m10503();
                C15243.m36591(interfaceC1700M10503, "childFragmentManager.getBackStackEntryAt(0)");
                getChildFragmentManager().m10494(interfaceC1700M10503.getId());
            }
            AbstractC3191 childFragmentManager2 = getChildFragmentManager();
            C15243.m36591(childFragmentManager2, "childFragmentManager");
            abstractC4573M10492 = childFragmentManager2.m10492();
            abstractC4573M10492.m14362();
            C15243.m36586(componentCallbacksC11612Mo27138);
            abstractC4573M10492.m14353(R.id.MT_Protector, componentCallbacksC11612Mo27138, null);
            if (((C10045) requireView()).m25948()) {
                abstractC4573M10492.m14361();
            }
            ((C10045) requireView()).m25943();
        }
        abstractC4573M10492.mo14363();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54389(AbstractC24349 abstractC24349) {
        AbstractC6323 abstractC6323 = abstractC24349.f78962;
        C15243.m36586(abstractC6323);
        abstractC6323.m18045(abstractC24349.getChildFragmentManager().m10437() == 0);
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewStateRestored(Bundle bundle) {
        ComponentCallbacksC11612 componentCallbacksC11612Mo27138;
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            ComponentCallbacksC11612 componentCallbacksC11612M10441 = getChildFragmentManager().m10441(R.id.MT_Protector);
            if (componentCallbacksC11612M10441 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
            }
            AbstractC5703 abstractC5703 = (AbstractC5703) componentCallbacksC11612M10441;
            if (abstractC5703.m16741().m39845() > 0) {
                int iM39845 = abstractC5703.m16741().m39845();
                int i = 0;
                while (true) {
                    if (i >= iM39845) {
                        componentCallbacksC11612Mo27138 = null;
                        break;
                    }
                    int i2 = i + 1;
                    C3906 c3906M39849 = abstractC5703.m16741().m39849(i);
                    C15243.m36591(c3906M39849, "headerFragment.preferenc…reen.getPreference(index)");
                    if (c3906M39849.m12593() != null) {
                        String strM12593 = c3906M39849.m12593();
                        if (strM12593 == null) {
                            componentCallbacksC11612Mo27138 = null;
                        } else {
                            C21309 c21309M10476 = getChildFragmentManager().m10476();
                            requireContext().getClassLoader();
                            componentCallbacksC11612Mo27138 = c21309M10476.mo27138(strM12593);
                        }
                        if (componentCallbacksC11612Mo27138 == null) {
                            break;
                        }
                        componentCallbacksC11612Mo27138.setArguments(c3906M39849.m12605());
                        break;
                    }
                    i = i2;
                }
            } else {
                componentCallbacksC11612Mo27138 = null;
                break;
            }
            if (componentCallbacksC11612Mo27138 == null) {
                return;
            }
            AbstractC3191 childFragmentManager = getChildFragmentManager();
            C15243.m36591(childFragmentManager, "childFragmentManager");
            AbstractC4573 abstractC4573M10492 = childFragmentManager.m10492();
            abstractC4573M10492.m14362();
            abstractC4573M10492.m14353(R.id.MT_Protector, componentCallbacksC11612Mo27138, null);
            abstractC4573M10492.mo14363();
        }
    }
}
