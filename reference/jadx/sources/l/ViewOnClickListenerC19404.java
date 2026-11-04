package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnClickListenerC19404 extends ComponentCallbacksC11612 implements View.OnClickListener, InterfaceC2264, InterfaceC5993, InterfaceC16837 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23940 f62704;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f62705;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f62706;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C25227 f62707;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f62708;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f62709;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C20956 f62710;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f62711;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22761 f62712;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14941 f62713;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20283 f62714;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f62715;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f62716;

    public ViewOnClickListenerC19404() {
        super(R.layout.MT_Protector);
        this.f62709 = -1;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        final byte[] byteArray;
        super.onCreate(bundle);
        C16420 c16420 = new C16420(this);
        this.f62713 = c16420;
        c16420.m35942((InterfaceC2264) this);
        this.f62713.m35944((InterfaceC5993) this);
        if (bundle != null) {
            this.f62706 = bundle.getString("importParent");
            byteArray = bundle.getByteArray("selection");
        } else {
            byteArray = null;
        }
        C22761 c22761 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f62712 = c22761;
        c22761.m51321().m40350(this, new InterfaceC16438() { // from class: l.ۙ᩺ۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                ViewOnClickListenerC19404.m44885(this.f18439, byteArray, (C20283) obj);
            }
        });
        C20956 c20956M28897 = ViewOnClickListenerC11499.m28897(this, new C8114(this));
        c20956M28897.m37644("project_import_init_path");
        this.f62710 = c20956M28897;
        C23940 c23940M28900 = ViewOnClickListenerC11499.m28900(this, new C17299(5, this));
        c23940M28900.m37644("project_export_init_path");
        this.f62704 = c23940M28900;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44885(ViewOnClickListenerC19404 viewOnClickListenerC19404, byte[] bArr, C20283 c20283) {
        viewOnClickListenerC19404.f62714 = c20283;
        C5261.f18540.execute(new RunnableC2598(viewOnClickListenerC19404, c20283, bArr, 2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44883(ViewOnClickListenerC19404 viewOnClickListenerC19404, C19782 c19782, byte[] bArr, C20283 c20283) {
        viewOnClickListenerC19404.f62713.m35948(c19782);
        viewOnClickListenerC19404.f62709 = 0;
        C14941 c14941 = viewOnClickListenerC19404.f62713;
        HashSet hashSet = new HashSet();
        C20283 c20284 = viewOnClickListenerC19404.f62714;
        if (c20284 != null) {
            AbstractC22044 abstractC22044M24694 = c20284.m46610().m24694("explorer");
            if (abstractC22044M24694.mo2934()) {
                try {
                    C20348 c20348M49835 = abstractC22044M24694.m49835();
                    if (c20348M49835.readInt() == 305419897) {
                        viewOnClickListenerC19404.f62709 = c20348M49835.readInt();
                        int i = c20348M49835.readInt();
                        for (int i2 = 0; i2 < i; i2++) {
                            hashSet.add(c20348M49835.m46756());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        c14941.m35941(hashSet);
        C25227 c25227 = viewOnClickListenerC19404.f62707;
        if (c25227 != null) {
            c25227.scrollToPosition(viewOnClickListenerC19404.f62709);
            viewOnClickListenerC19404.f62709 = -1;
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                AbstractC22044 abstractC22044M24695 = c20283.m46606().m24694("selection");
                try {
                    viewOnClickListenerC19404.f62713.m35951(abstractC22044M24695.m49865());
                } catch (IOException unused2) {
                } finally {
                    abstractC22044M24695.mo4287();
                }
            } else {
                viewOnClickListenerC19404.f62713.m35951(bArr);
            }
        }
        viewOnClickListenerC19404.f62716 = true;
        ActivityC3409 activity = viewOnClickListenerC19404.getActivity();
        if (activity instanceof ActivityC0848) {
            ((ActivityC0848) activity).m3460();
        }
        if (viewOnClickListenerC19404.getView() != null) {
            viewOnClickListenerC19404.f62712.m51308(viewOnClickListenerC19404.getViewLifecycleOwner(), new C0292(viewOnClickListenerC19404));
            if (viewOnClickListenerC19404.f62713.m35959()) {
                viewOnClickListenerC19404.m44888();
            }
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C25227 c25227 = (C25227) view.findViewById(R.id.MT_Protector);
        this.f62707 = c25227;
        c25227.setTag("RecyclerView0");
        this.f62708 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f62705 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f62711 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f62715 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f62707.setAdapter(this.f62713);
        int i = this.f62709;
        if (i != -1) {
            this.f62707.scrollToPosition(i);
            this.f62709 = -1;
        }
        if (this.f62716) {
            ActivityC3409 activity = getActivity();
            if (activity instanceof ActivityC0848) {
                ((ActivityC0848) activity).m3460();
            }
            this.f62712.m51308(getViewLifecycleOwner(), new C0292(this));
            if (this.f62713.m35959()) {
                m44888();
            }
        }
        this.f62707.addOnScrollListener(this.f62713.m35937(new C1779(1, this)));
    }

    @Override // l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("importParent", this.f62706);
        byte[] bArrM35966 = this.f62713.m35966();
        if (bArrM35966 != null) {
            if (bArrM35966.length > 20480) {
                try {
                    AbstractC22044 abstractC22044M24694 = this.f62714.m46606().m24694("selection");
                    abstractC22044M24694.getClass();
                    abstractC22044M24694.m49850(bArrM35966, 0, bArrM35966.length);
                    bundle.putByteArray("selection", new byte[0]);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            bundle.putByteArray("selection", bArrM35966);
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f62707.setAdapter(null);
        this.f62707 = null;
        this.f62708 = null;
        this.f62705 = null;
        this.f62711 = null;
        this.f62715 = null;
    }

    @Override // l.InterfaceC16837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1437() {
        if (!this.f62713.m35959()) {
            return false;
        }
        this.f62713.mo32794();
        return true;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onPause() {
        super.onPause();
        C20283 c20283 = this.f62714;
        if (c20283 != null && c20283.m11160().m24702()) {
            C6178 c6178M34975 = C14483.m34975(305419897);
            HashSet hashSetM35957 = this.f62713.m35957();
            c6178M34975.writeInt(((C0067) this.f62707.getLayoutManager()).findFirstVisibleItemPosition());
            c6178M34975.writeInt(hashSetM35957.size());
            Iterator it = hashSetM35957.iterator();
            while (it.hasNext()) {
                c6178M34975.m17786((CharSequence) it.next());
            }
            try {
                this.f62714.m46610().m24694("explorer").m49844(c6178M34975);
            } catch (IOException e) {
                C22761 c22761 = this.f62712;
                if (c22761 != null) {
                    c22761.m51299(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44896() {
        if (this.f62714 != null) {
            HashSet hashSetM35957 = this.f62713.m35957();
            this.f62713.m35948(this.f62714.m46623());
            this.f62713.m35941(hashSetM35957);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44897(String str) {
        C14941 c14941 = this.f62713;
        c14941.getClass();
        c14941.m35940((Collection) Collections.singletonList(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44895(Collection collection) {
        this.f62713.m35940(collection);
    }

    @Override // l.InterfaceC2264
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7690(C8230 c8230) {
        ((ActivityC0848) requireActivity()).m3431(c8230.m22146(), (C15301) null);
        this.f62714.m46575(c8230.m22146());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006b  */
    @Override // l.InterfaceC5993
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12934(final C8230 c8230) {
        final C0408 c0408;
        C18452 c18452 = new C18452(requireContext(), c8230.m22143(), 0);
        if (c8230.m22142()) {
            c0408 = new C0408(c18452, c8230.m22146(), true);
        } else {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c0408 = null;
        }
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        if (c8230.m22142()) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            if (!(c8230.m22146() + "/").startsWith("# TOO_LONG_NAME/")) {
                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            }
        }
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.ܽ᩺ۧ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ViewOnClickListenerC19404.m44880(this.f58690, c0408, c8230, menuItem);
                return true;
            }
        });
        this.f62707.suppressLayout(true);
        c18452.m42993(new C9492(5, this));
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44880(final ViewOnClickListenerC19404 viewOnClickListenerC19404, C0408 c0408, final C8230 c8230, MenuItem menuItem) {
        if (c0408 == null || !c0408.m2214(menuItem)) {
            int itemId = menuItem.getItemId();
            if (itemId == R.string.MT_Protector) {
                new ViewOnClickListenerC13657(viewOnClickListenerC19404, c8230.m22146()).m33441();
                return;
            }
            if (itemId == R.string.MT_Protector) {
                ((ActivityC0848) viewOnClickListenerC19404.requireActivity()).m3436(new Runnable() { // from class: l.᩸᩺ۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC19404 viewOnClickListenerC19405 = this.f75008;
                        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) viewOnClickListenerC19405.requireActivity();
                        C8230 c8231 = c8230;
                        C12691 c12691 = new C12691(viewOnClickListenerC19405, abstractActivityC17204, abstractActivityC17204, c8231);
                        c12691.m22945(R.string.MT_Protector);
                        c12691.m22924((CharSequence) c8231.m22146());
                        c12691.m22918();
                        c12691.m22916();
                        c12691.m22957(6);
                        c12691.m22955(true);
                    }
                });
                return;
            }
            if (itemId == R.string.MT_Protector) {
                if (c8230.m22142()) {
                    viewOnClickListenerC19404.f62706 = c8230.m22141();
                } else {
                    viewOnClickListenerC19404.f62706 = c8230.m22146();
                }
                C20956 c20956 = viewOnClickListenerC19404.f62710;
                c20956.getClass();
                C20956.m47909(c20956, R.string.MT_Protector, null, new String[]{"smali", "zip", "dex"}, 8);
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                if (c8230.m22142()) {
                    viewOnClickListenerC19404.m44871(R.string.MT_Protector, c8230.m22141(), "", false, new C15674());
                    return;
                } else {
                    viewOnClickListenerC19404.m44871(R.string.MT_Protector, c8230.m22146(), "", false, new C15674());
                    return;
                }
            }
            int i = 3;
            if (itemId == R.string.MT_Protector) {
                Context contextRequireContext = viewOnClickListenerC19404.requireContext();
                int i2 = DialogInterfaceC8327.f27315;
                C2361 c2361 = new C2361(contextRequireContext);
                c2361.m8021(R.string.MT_Protector);
                c2361.m8008(viewOnClickListenerC19404.getString(R.string.MT_Protector, c8230.m22145()));
                c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7410(i, viewOnClickListenerC19404, c8230));
                c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361.m8016();
                return;
            }
            if (itemId == R.string.MT_Protector) {
                c8230.m22138();
                FloatingActionButton floatingActionButton = viewOnClickListenerC19404.f62708;
                FloatingActionButton floatingActionButton2 = viewOnClickListenerC19404.f62715;
                FloatingActionButton floatingActionButton3 = viewOnClickListenerC19404.f62711;
                FloatingActionButton floatingActionButton4 = viewOnClickListenerC19404.f62705;
                floatingActionButton.setOnClickListener(viewOnClickListenerC19404);
                floatingActionButton2.setOnClickListener(viewOnClickListenerC19404);
                floatingActionButton3.setOnClickListener(viewOnClickListenerC19404);
                floatingActionButton4.setOnClickListener(viewOnClickListenerC19404);
                floatingActionButton.setVisibility(0);
                floatingActionButton2.setVisibility(0);
                floatingActionButton3.setVisibility(0);
                floatingActionButton4.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
                float height = floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                floatingActionButton.setTranslationY(height);
                floatingActionButton.setAlpha(0.8f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", height, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
                float height2 = floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                floatingActionButton2.setTranslationY(height2);
                floatingActionButton2.setAlpha(0.8f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", height2, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton4.getLayoutParams();
                float height3 = floatingActionButton4.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                floatingActionButton4.setTranslationY(height3);
                floatingActionButton4.setAlpha(0.8f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", height3, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
                float height4 = floatingActionButton3.getHeight() + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                floatingActionButton3.setTranslationY(height4);
                floatingActionButton3.setAlpha(0.8f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", height4, 0.0f);
                AnimatorSet duration = new AnimatorSet().setDuration(200L);
                duration.setInterpolator(new DecelerateInterpolator());
                duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                duration.start();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44881(ViewOnClickListenerC19404 viewOnClickListenerC19404, C8230 c8230) {
        c8230.m22140();
        if (c8230.m22142()) {
            C20283 c20283 = viewOnClickListenerC19404.f62714;
            String strM22146 = c8230.m22146();
            c20283.getClass();
            c20283.m46580(Collections.singleton(strM22146));
        } else {
            viewOnClickListenerC19404.f62714.m46620(c8230.m22146());
        }
        ((ActivityC0848) viewOnClickListenerC19404.requireActivity()).m3447();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44891(ViewOnClickListenerC19404 viewOnClickListenerC19404) {
        C25227 c25227 = viewOnClickListenerC19404.f62707;
        if (c25227 != null) {
            c25227.suppressLayout(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            Context contextRequireContext = requireContext();
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(contextRequireContext);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8008(getString(R.string.MT_Protector, Integer.valueOf(this.f62713.m35968())));
            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC25372(0, this));
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016();
            return;
        }
        if (id == R.id.MT_Protector) {
            CharSequence[] charSequenceArr = {getString(R.string.MT_Protector, "Smali"), getString(R.string.MT_Protector, "Dex"), getString(R.string.MT_Protector, "Jar")};
            Context contextRequireContext2 = requireContext();
            int i2 = DialogInterfaceC8327.f27315;
            C2361 c2362 = new C2361(contextRequireContext2);
            c2362.m8014(charSequenceArr, new DialogInterfaceOnClickListenerC17166(0, this));
            c2362.m8016();
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f62713.m35943(new C11958());
            return;
        }
        if (id == R.id.MT_Protector) {
            Set<String> setM46571 = this.f62714.m46571();
            if (setM46571.isEmpty()) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            this.f62713.m35943(new C9706(setM46571));
            HashSet hashSet = new HashSet();
            for (String strSubstring : setM46571) {
                while (true) {
                    int iLastIndexOf = strSubstring.lastIndexOf(47);
                    if (iLastIndexOf != -1) {
                        strSubstring = strSubstring.substring(0, iLastIndexOf);
                        hashSet.add(strSubstring + "/");
                    }
                }
            }
            this.f62713.m35941(hashSet);
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44874(ViewOnClickListenerC19404 viewOnClickListenerC19404, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        if (i == 0) {
            C23940 c23940 = viewOnClickListenerC19404.f62704;
            c23940.getClass();
            C23940.m53469(c23940, R.string.MT_Protector, bundle, null, "smali.zip", new String[]{"zip"}, 32);
        } else if (i == 1) {
            C23940 c23941 = viewOnClickListenerC19404.f62704;
            c23941.getClass();
            C23940.m53469(c23941, R.string.MT_Protector, bundle, null, "classes.dex", new String[]{"dex"}, 32);
        } else {
            if (i != 2) {
                return;
            }
            C23940 c23942 = viewOnClickListenerC19404.f62704;
            c23942.getClass();
            C23940.m53469(c23942, R.string.MT_Protector, bundle, null, "classes.jar", new String[]{"jar"}, 32);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m44888() {
        FloatingActionButton floatingActionButton = this.f62708;
        FloatingActionButton floatingActionButton2 = this.f62715;
        FloatingActionButton floatingActionButton3 = this.f62711;
        FloatingActionButton floatingActionButton4 = this.f62705;
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton4.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
        floatingActionButton4.setVisibility(0);
        floatingActionButton.setTranslationY(0.0f);
        floatingActionButton.setAlpha(0.8f);
        floatingActionButton2.setTranslationY(0.0f);
        floatingActionButton2.setAlpha(0.8f);
        floatingActionButton3.setTranslationY(0.0f);
        floatingActionButton3.setAlpha(0.8f);
        floatingActionButton4.setTranslationY(0.0f);
        floatingActionButton4.setAlpha(0.8f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44886(boolean z) {
        FloatingActionButton floatingActionButton = this.f62708;
        FloatingActionButton floatingActionButton2 = this.f62715;
        FloatingActionButton floatingActionButton3 = this.f62711;
        FloatingActionButton floatingActionButton4 = this.f62705;
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton4, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton3, "alpha", 0.8f, 0.0f));
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton4.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", 0.0f, floatingActionButton4.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", 0.0f, floatingActionButton3.getHeight() + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin);
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        }
        duration.addListener(new C6726(floatingActionButton, floatingActionButton2, floatingActionButton4, floatingActionButton3));
        duration.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44873(ViewOnClickListenerC19404 viewOnClickListenerC19404) {
        if (viewOnClickListenerC19404.f62714 == null) {
            return;
        }
        viewOnClickListenerC19404.f62714.m46580(viewOnClickListenerC19404.f62713.m35955());
        viewOnClickListenerC19404.f62713.m35967();
        viewOnClickListenerC19404.m44886(true);
        ((ActivityC0848) viewOnClickListenerC19404.requireActivity()).m3447();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44872(Runnable runnable) {
        if (this.f62716) {
            runnable.run();
        } else {
            C21576.m49069(new RunnableC1014(3, this, runnable), 100L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44875(ViewOnClickListenerC19404 viewOnClickListenerC19404, Runnable runnable) {
        if (viewOnClickListenerC19404.isResumed()) {
            viewOnClickListenerC19404.m44872(runnable);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44893(ViewOnClickListenerC19404 viewOnClickListenerC19404, String str, Bundle bundle) {
        if (viewOnClickListenerC19404.f62714 == null) {
            return;
        }
        new C24626(viewOnClickListenerC19404, bundle.getInt("type"), viewOnClickListenerC19404.f62713.m35955(), str).m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44879(final ViewOnClickListenerC19404 viewOnClickListenerC19404, final String str, final ArrayList arrayList, final boolean z) {
        final AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) viewOnClickListenerC19404.requireActivity();
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC23087 viewOnClickListenerC23087 = new ViewOnClickListenerC23087(radioButton, radioButton2, c23255, 1);
        radioButton.setOnClickListener(viewOnClickListenerC23087);
        radioButton2.setOnClickListener(viewOnClickListenerC23087);
        c23255.setEnabled(radioButton2.isChecked());
        final Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        c23255.mo52335((CharSequence) viewOnClickListenerC19404.f62706);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = viewOnClickListenerC19404.f62714.m46619().iterator();
        while (it.hasNext()) {
            arrayList2.add(((String) it.next()) + ".dex");
        }
        if (arrayList2.size() > 1) {
            spinner.setAdapter((SpinnerAdapter) new C3054(viewOnClickListenerC19404.requireContext(), arrayList2));
        } else {
            viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        Context contextRequireContext = viewOnClickListenerC19404.requireContext();
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(contextRequireContext);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ᩺ۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (z) {
                    C14584.m35193(str, new String[0]).mo4296();
                }
            }
        });
        c2361.m8003(new DialogInterface.OnCancelListener() { // from class: l.֫᩺ۧ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                if (z) {
                    C14584.m35193(str, new String[0]).mo4296();
                }
            }
        });
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩺ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strReplace;
                dialogInterfaceC8327M8016.dismiss();
                if (radioButton.isChecked()) {
                    strReplace = "";
                } else {
                    strReplace = c23255.m54021().toString().replace('.', '/');
                    if (strReplace.startsWith("/")) {
                        strReplace = strReplace.substring(1);
                    }
                    if (!strReplace.isEmpty() && !strReplace.endsWith("/")) {
                        strReplace = strReplace.concat("/");
                    }
                }
                new C18658(this.f38473, abstractActivityC17204, spinner, str, arrayList, strReplace, z).m8197();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44871(int i, String str, String str2, final boolean z, final InterfaceC23955 interfaceC23955) {
        if (str == null) {
            str = "";
        }
        String strReplace = str.replace('/', '.');
        if (strReplace.endsWith(".")) {
            strReplace = C1402.m5124(1, 0, strReplace);
        }
        View viewM40395 = ((AbstractActivityC17204) requireActivity()).m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(i);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        c23255.mo52335((CharSequence) strReplace);
        c23256.mo52335((CharSequence) str2);
        c23256.mo52339(c23256.m54099());
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f62714.m46619().iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()) + ".dex");
        }
        if (arrayList.size() > 1) {
            spinner.setAdapter((SpinnerAdapter) new C3054(requireContext(), arrayList));
        } else {
            viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        Context contextRequireContext = requireContext();
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(contextRequireContext);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.۫᩺ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC19404.m44884(this.f42794, c23256, c23255, z, dialogInterfaceC8327M8016, interfaceC23955, spinner);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44884(ViewOnClickListenerC19404 viewOnClickListenerC19404, C23255 c23255, C23255 c23256, boolean z, DialogInterfaceC8327 dialogInterfaceC8327, InterfaceC23955 interfaceC23955, Spinner spinner) {
        if (c23255.m54021().toString().isEmpty()) {
            c23255.requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        String strReplace = c23256.m54021().toString().replace('.', '/');
        if (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        if (!strReplace.isEmpty() && !strReplace.endsWith("/")) {
            strReplace = strReplace.concat("/");
        }
        String string = c23255.m54021().toString();
        if (C18415.m42925("[./\\s]").matcher((CharSequence) string).find()) {
            c23255.requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        String strM34972 = C14483.m34972(strReplace, string);
        if (!viewOnClickListenerC19404.f62714.m46617(strM34972)) {
            String str = (String) viewOnClickListenerC19404.f62714.m46619().get(Math.max(0, spinner.getSelectedItemPosition()));
            try {
                viewOnClickListenerC19404.f62714.m46577(str, strM34972, (String) interfaceC23955.mo3124(str, strM34972));
                viewOnClickListenerC19404.m44896();
                viewOnClickListenerC19404.m44897(strM34972);
                dialogInterfaceC8327.dismiss();
                return;
            } catch (Exception e) {
                viewOnClickListenerC19404.f62712.m51299(e);
                return;
            }
        }
        if (!z) {
            c23255.requestFocus();
            C22673.m51154((CharSequence) viewOnClickListenerC19404.getString(R.string.MT_Protector, strM34972.replace('/', '.')));
            return;
        }
        Context contextRequireContext = viewOnClickListenerC19404.requireContext();
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(contextRequireContext);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8008(viewOnClickListenerC19404.getString(R.string.MT_Protector, strM34972.replace('/', '.')));
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0758(viewOnClickListenerC19404, dialogInterfaceC8327, interfaceC23955, strM34972, 1));
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44882(ViewOnClickListenerC19404 viewOnClickListenerC19404, DialogInterfaceC8327 dialogInterfaceC8327, InterfaceC23955 interfaceC23955, String str) {
        dialogInterfaceC8327.dismiss();
        try {
            viewOnClickListenerC19404.f62714.m46576(str, (String) interfaceC23955.mo3124(null, str));
            viewOnClickListenerC19404.m44896();
            viewOnClickListenerC19404.m44897(str);
        } catch (Exception e) {
            viewOnClickListenerC19404.f62712.m51299(e);
        }
    }
}
