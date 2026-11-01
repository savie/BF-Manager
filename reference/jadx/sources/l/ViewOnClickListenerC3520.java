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
import android.widget.EditText;
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

/* JADX INFO: renamed from: l.ۗ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC3520 extends ComponentCallbacksC22654 implements View.OnClickListener, InterfaceC21174, InterfaceC7769, InterfaceC19601 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6094 f12880;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f12881;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18377 f12882;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f12883;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17492 f12884;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f12885;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f12886;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f12887;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9886 f12888;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17215 f12889;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f12890;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12891;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23566 f12892;

    public ViewOnClickListenerC3520() {
        super(R.layout.MT_Protector);
        this.f12881 = -1;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        final byte[] byteArray;
        super.onCreate(bundle);
        C21160 c21160 = new C21160(this);
        this.f12888 = c21160;
        c21160.m25007((InterfaceC21174) this);
        this.f12888.m25005((InterfaceC7769) this);
        if (bundle != null) {
            this.f12887 = bundle.getString("importParent");
            byteArray = bundle.getByteArray("selection");
        } else {
            byteArray = null;
        }
        C18377 c18377 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f12882 = c18377;
        c18377.m42622().m44959(this, new InterfaceC10597() { // from class: l.ۖ᩹ۜ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                ViewOnClickListenerC3520.m10368((C6094) obj, this.f10694, byteArray);
            }
        });
        C23566 c23566M21927 = ViewOnClickListenerC8374.m21927(this, new C21450(4, this));
        c23566M21927.m46685("project_import_init_path");
        this.f12892 = c23566M21927;
        C17215 c17215M21924 = ViewOnClickListenerC8374.m21924(this, new C11509(6, this));
        c17215M21924.m46685("project_export_init_path");
        this.f12889 = c17215M21924;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10368(final C6094 c6094, final ViewOnClickListenerC3520 viewOnClickListenerC3520, final byte[] bArr) {
        viewOnClickListenerC3520.f12880 = c6094;
        C4716.f16636.execute(new Runnable() { // from class: l.ۚ᩹ۜ
            @Override // java.lang.Runnable
            public final void run() {
                final C6094 c6095 = c6094;
                final C5693 c5693M16579 = c6095.m16579();
                final ViewOnClickListenerC3520 viewOnClickListenerC3521 = viewOnClickListenerC3520;
                final byte[] bArr2 = bArr;
                C16737.m39273(new Runnable() { // from class: l.᩹᩹ۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC3520.m10365(viewOnClickListenerC3521, c5693M16579, bArr2, c6095);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10365(ViewOnClickListenerC3520 viewOnClickListenerC3520, C5693 c5693, byte[] bArr, C6094 c6094) {
        viewOnClickListenerC3520.f12888.m25004(c5693);
        viewOnClickListenerC3520.f12881 = 0;
        C9886 c9886 = viewOnClickListenerC3520.f12888;
        HashSet hashSet = new HashSet();
        C6094 c6095 = viewOnClickListenerC3520.f12880;
        if (c6095 != null) {
            AbstractC20745 abstractC20745M33320 = c6095.m16575().m33320("explorer");
            if (abstractC20745M33320.mo33975()) {
                try {
                    C17367 c17367M46713 = abstractC20745M33320.m46713();
                    if (c17367M46713.readInt() == 305419897) {
                        viewOnClickListenerC3520.f12881 = c17367M46713.readInt();
                        int i = c17367M46713.readInt();
                        for (int i2 = 0; i2 < i; i2++) {
                            hashSet.add(c17367M46713.m40442());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        c9886.m24999(hashSet);
        C17492 c17492 = viewOnClickListenerC3520.f12884;
        if (c17492 != null) {
            c17492.scrollToPosition(viewOnClickListenerC3520.f12881);
            viewOnClickListenerC3520.f12881 = -1;
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                AbstractC20745 abstractC20745M33321 = c6094.m16568().m33320("selection");
                try {
                    viewOnClickListenerC3520.f12888.m25009(abstractC20745M33321.m46727());
                } catch (IOException unused2) {
                } finally {
                    abstractC20745M33321.mo24644();
                }
            } else {
                viewOnClickListenerC3520.f12888.m25009(bArr);
            }
        }
        viewOnClickListenerC3520.f12891 = true;
        ActivityC19126 activity = viewOnClickListenerC3520.getActivity();
        if (activity instanceof ActivityC5677) {
            ((ActivityC5677) activity).m15681();
        }
        if (viewOnClickListenerC3520.getView() != null) {
            viewOnClickListenerC3520.f12882.m42629(viewOnClickListenerC3520.getViewLifecycleOwner(), new C9167(viewOnClickListenerC3520));
            if (viewOnClickListenerC3520.f12888.m25023()) {
                viewOnClickListenerC3520.m10372();
            }
        }
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C17492 c17492 = (C17492) view.findViewById(R.id.MT_Protector);
        this.f12884 = c17492;
        c17492.setTag("RecyclerView0");
        this.f12886 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f12885 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f12883 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f12890 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f12884.setAdapter(this.f12888);
        int i = this.f12881;
        if (i != -1) {
            this.f12884.scrollToPosition(i);
            this.f12881 = -1;
        }
        if (this.f12891) {
            ActivityC19126 activity = getActivity();
            if (activity instanceof ActivityC5677) {
                ((ActivityC5677) activity).m15681();
            }
            this.f12882.m42629(getViewLifecycleOwner(), new C9167(this));
            if (this.f12888.m25023()) {
                m10372();
            }
        }
        this.f12884.addOnScrollListener(this.f12888.m24994(new C10578(0, this)));
    }

    @Override // l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("importParent", this.f12887);
        byte[] bArrM24991 = this.f12888.m24991();
        if (bArrM24991 != null) {
            if (bArrM24991.length > 20480) {
                try {
                    AbstractC20745 abstractC20745M33320 = this.f12880.m16568().m33320("selection");
                    abstractC20745M33320.getClass();
                    abstractC20745M33320.m46704(bArrM24991, 0, bArrM24991.length);
                    bundle.putByteArray("selection", new byte[0]);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            bundle.putByteArray("selection", bArrM24991);
        }
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f12884.setAdapter(null);
        this.f12884 = null;
        this.f12886 = null;
        this.f12885 = null;
        this.f12883 = null;
        this.f12890 = null;
    }

    @Override // l.InterfaceC19601
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3616() {
        if (!this.f12888.m25023()) {
            return false;
        }
        this.f12888.mo24995();
        return true;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onPause() {
        super.onPause();
        C6094 c6094 = this.f12880;
        if (c6094 != null && c6094.m47187().m33326()) {
            C11018 c11018M43576 = C18917.m43576(305419897);
            HashSet hashSetM25024 = this.f12888.m25024();
            c11018M43576.writeInt(((C13115) this.f12884.getLayoutManager()).findFirstVisibleItemPosition());
            c11018M43576.writeInt(hashSetM25024.size());
            Iterator it = hashSetM25024.iterator();
            while (it.hasNext()) {
                c11018M43576.m27782((CharSequence) it.next());
            }
            try {
                this.f12880.m16575().m33320("explorer").m46697(c11018M43576);
            } catch (IOException e) {
                C18377 c18377 = this.f12882;
                if (c18377 != null) {
                    c18377.m42627((Throwable) e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10378() {
        if (this.f12880 != null) {
            HashSet hashSetM25024 = this.f12888.m25024();
            this.f12888.m25004(this.f12880.m16579());
            this.f12888.m24999(hashSetM25024);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10379(String str) {
        C9886 c9886 = this.f12888;
        c9886.getClass();
        c9886.m24998((Collection) Collections.singletonList(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10377(Collection collection) {
        this.f12888.m24998(collection);
    }

    @Override // l.InterfaceC21174
    /* JADX INFO: renamed from: ܰ */
    public final void mo6613(C11381 c11381) {
        ((ActivityC5677) requireActivity()).m15660(c11381.m28482(), (C8500) null);
        this.f12880.m16532(c11381.m28482());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006b  */
    @Override // l.InterfaceC7769
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6612(final C11381 c11381) {
        final C1529 c1529;
        C16195 c16195 = new C16195(requireContext(), c11381.m28489(), 0);
        if (c11381.m28481()) {
            c1529 = new C1529(c16195, c11381.m28482(), true);
        } else {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c1529 = null;
        }
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        if (c11381.m28481()) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            if (!(c11381.m28482() + "/").startsWith("# TOO_LONG_NAME/")) {
                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            }
        }
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.۟᩹ۜ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ViewOnClickListenerC3520.m10364(this.f25608, c1529, c11381, menuItem);
                return true;
            }
        });
        this.f12884.suppressLayout(true);
        c16195.m38295((InterfaceC7728) new C23648(6, this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10364(final ViewOnClickListenerC3520 viewOnClickListenerC3520, C1529 c1529, final C11381 c11381, MenuItem menuItem) {
        if (c1529 == null || !c1529.m5303(menuItem)) {
            int itemId = menuItem.getItemId();
            if (itemId == R.string.MT_Protector) {
                new ViewOnClickListenerC11989(viewOnClickListenerC3520, c11381.m28482()).m29855();
                return;
            }
            if (itemId == R.string.MT_Protector) {
                ((ActivityC5677) viewOnClickListenerC3520.requireActivity()).m15669(new Runnable() { // from class: l.֨᩹ۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC3520 viewOnClickListenerC3521 = this.f5823;
                        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) viewOnClickListenerC3521.requireActivity();
                        C11381 c11382 = c11381;
                        C16927 c16927 = new C16927(viewOnClickListenerC3521, abstractActivityC12483, abstractActivityC12483, c11382);
                        c16927.m40376(R.string.MT_Protector);
                        c16927.m40346((CharSequence) c11382.m28482());
                        c16927.m40340();
                        c16927.m40371();
                        c16927.m40336(6);
                        c16927.m40368(true);
                    }
                });
                return;
            }
            if (itemId == R.string.MT_Protector) {
                if (c11381.m28481()) {
                    viewOnClickListenerC3520.f12887 = c11381.m28486();
                } else {
                    viewOnClickListenerC3520.f12887 = c11381.m28482();
                }
                C23566 c23566 = viewOnClickListenerC3520.f12892;
                c23566.getClass();
                C23566.m51966(c23566, R.string.MT_Protector, null, new String[]{"smali", "zip", "dex"}, 8);
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                if (c11381.m28481()) {
                    viewOnClickListenerC3520.m10354(R.string.MT_Protector, c11381.m28486(), "", false, new C4226());
                    return;
                } else {
                    viewOnClickListenerC3520.m10354(R.string.MT_Protector, c11381.m28482(), "", false, new C4226());
                    return;
                }
            }
            int i = 1;
            if (itemId == R.string.MT_Protector) {
                Context contextRequireContext = viewOnClickListenerC3520.requireContext();
                int i2 = DialogInterfaceC19356.f62401;
                C8067 c8067 = new C8067(contextRequireContext);
                c8067.m21274(R.string.MT_Protector);
                c8067.m21261(viewOnClickListenerC3520.getString(R.string.MT_Protector, c11381.m28488()));
                c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC1630(i, viewOnClickListenerC3520, c11381));
                c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067.m21269();
                return;
            }
            if (itemId == R.string.MT_Protector) {
                c11381.m28483();
                FloatingActionButton floatingActionButton = viewOnClickListenerC3520.f12886;
                FloatingActionButton floatingActionButton2 = viewOnClickListenerC3520.f12890;
                FloatingActionButton floatingActionButton3 = viewOnClickListenerC3520.f12883;
                FloatingActionButton floatingActionButton4 = viewOnClickListenerC3520.f12885;
                floatingActionButton.setOnClickListener(viewOnClickListenerC3520);
                floatingActionButton2.setOnClickListener(viewOnClickListenerC3520);
                floatingActionButton3.setOnClickListener(viewOnClickListenerC3520);
                floatingActionButton4.setOnClickListener(viewOnClickListenerC3520);
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
    public static void m10366(ViewOnClickListenerC3520 viewOnClickListenerC3520, C11381 c11381) {
        c11381.m28487();
        if (c11381.m28481()) {
            C6094 c6094 = viewOnClickListenerC3520.f12880;
            String strM28482 = c11381.m28482();
            c6094.getClass();
            c6094.m16537(Collections.singleton(strM28482));
        } else {
            viewOnClickListenerC3520.f12880.m16570(c11381.m28482());
        }
        ((ActivityC5677) viewOnClickListenerC3520.requireActivity()).m15672();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10373(ViewOnClickListenerC3520 viewOnClickListenerC3520) {
        C17492 c17492 = viewOnClickListenerC3520.f12884;
        if (c17492 != null) {
            c17492.suppressLayout(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            Context contextRequireContext = requireContext();
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(contextRequireContext);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21261(getString(R.string.MT_Protector, Integer.valueOf(this.f12888.m25025())));
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴ᩹ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC3520.m10356(this.f61601);
                }
            });
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269();
            return;
        }
        if (id == R.id.MT_Protector) {
            CharSequence[] charSequenceArr = {getString(R.string.MT_Protector, "Smali"), getString(R.string.MT_Protector, "Dex"), getString(R.string.MT_Protector, "Jar")};
            Context contextRequireContext2 = requireContext();
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8068 = new C8067(contextRequireContext2);
            c8068.m21267(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.۠᩹ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ViewOnClickListenerC3520.m10357(this.f29360, i3);
                }
            });
            c8068.m21269();
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f12888.m25000(new C16236());
            return;
        }
        if (id == R.id.MT_Protector) {
            final Set<String> setM16554 = this.f12880.m16554();
            if (setM16554.isEmpty()) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            this.f12888.m25000(new InterfaceC2123() { // from class: l.᩵᩹ۜ
                @Override // l.InterfaceC2123
                /* JADX INFO: renamed from: ۙ */
                public final int mo1698(String str, boolean z) {
                    return setM16554.contains(str) ? 2 : 1;
                }
            });
            HashSet hashSet = new HashSet();
            for (String strSubstring : setM16554) {
                while (true) {
                    int iLastIndexOf = strSubstring.lastIndexOf(47);
                    if (iLastIndexOf != -1) {
                        strSubstring = strSubstring.substring(0, iLastIndexOf);
                        hashSet.add(strSubstring + "/");
                    }
                }
            }
            this.f12888.m24999(hashSet);
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10357(ViewOnClickListenerC3520 viewOnClickListenerC3520, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        if (i == 0) {
            C17215 c17215 = viewOnClickListenerC3520.f12889;
            c17215.getClass();
            C17215.m40155(c17215, R.string.MT_Protector, bundle, null, "smali.zip", new String[]{"zip"}, 32);
        } else if (i == 1) {
            C17215 c17216 = viewOnClickListenerC3520.f12889;
            c17216.getClass();
            C17215.m40155(c17216, R.string.MT_Protector, bundle, null, "classes.dex", new String[]{"dex"}, 32);
        } else {
            if (i != 2) {
                return;
            }
            C17215 c17217 = viewOnClickListenerC3520.f12889;
            c17217.getClass();
            C17215.m40155(c17217, R.string.MT_Protector, bundle, null, "classes.jar", new String[]{"jar"}, 32);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m10372() {
        FloatingActionButton floatingActionButton = this.f12886;
        FloatingActionButton floatingActionButton2 = this.f12890;
        FloatingActionButton floatingActionButton3 = this.f12883;
        FloatingActionButton floatingActionButton4 = this.f12885;
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
    public void m10369(boolean z) {
        FloatingActionButton floatingActionButton = this.f12886;
        FloatingActionButton floatingActionButton2 = this.f12890;
        FloatingActionButton floatingActionButton3 = this.f12883;
        FloatingActionButton floatingActionButton4 = this.f12885;
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
        duration.addListener(new C12694(floatingActionButton, floatingActionButton2, floatingActionButton4, floatingActionButton3));
        duration.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10356(ViewOnClickListenerC3520 viewOnClickListenerC3520) {
        if (viewOnClickListenerC3520.f12880 == null) {
            return;
        }
        viewOnClickListenerC3520.f12880.m16537(viewOnClickListenerC3520.f12888.m25012());
        viewOnClickListenerC3520.f12888.m25021();
        viewOnClickListenerC3520.m10369(true);
        ((ActivityC5677) viewOnClickListenerC3520.requireActivity()).m15672();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m10355(Runnable runnable) {
        if (this.f12891) {
            runnable.run();
        } else {
            C16737.m39274(new RunnableC23104(3, this, runnable), 100L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10359(ViewOnClickListenerC3520 viewOnClickListenerC3520, Runnable runnable) {
        if (viewOnClickListenerC3520.isResumed()) {
            viewOnClickListenerC3520.m10355(runnable);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m10375(ViewOnClickListenerC3520 viewOnClickListenerC3520, String str, Bundle bundle) {
        if (viewOnClickListenerC3520.f12880 == null) {
            return;
        }
        new C17632(viewOnClickListenerC3520, bundle.getInt("type"), viewOnClickListenerC3520.f12888.m25012(), str).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10363(final ViewOnClickListenerC3520 viewOnClickListenerC3520, final String str, final ArrayList arrayList, final boolean z) {
        final AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) viewOnClickListenerC3520.requireActivity();
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC23278 viewOnClickListenerC23278 = new ViewOnClickListenerC23278(radioButton, radioButton2, editText, 0);
        radioButton.setOnClickListener(viewOnClickListenerC23278);
        radioButton2.setOnClickListener(viewOnClickListenerC23278);
        final Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        editText.setText(viewOnClickListenerC3520.f12887);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = viewOnClickListenerC3520.f12880.m16569().iterator();
        while (it.hasNext()) {
            arrayList2.add(((String) it.next()) + ".dex");
        }
        if (arrayList2.size() > 1) {
            spinner.setAdapter((SpinnerAdapter) new C0733(viewOnClickListenerC3520.requireContext(), arrayList2));
        } else {
            viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        Context contextRequireContext = viewOnClickListenerC3520.requireContext();
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(contextRequireContext);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ᩹ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (z) {
                    C5553.m15313(str, new String[0]).mo24647();
                }
            }
        });
        c8067.m21256(new DialogInterfaceOnCancelListenerC13288(z, str));
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩸᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strReplace;
                dialogInterfaceC19356M21269.dismiss();
                if (radioButton.isChecked()) {
                    strReplace = "";
                } else {
                    strReplace = editText.getText().toString().replace('.', '/');
                    if (strReplace.startsWith("/")) {
                        strReplace = strReplace.substring(1);
                    }
                    if (!strReplace.isEmpty() && !strReplace.endsWith("/")) {
                        strReplace = strReplace.concat("/");
                    }
                }
                new C14811(this.f70957, abstractActivityC12483, spinner, str, arrayList, strReplace, z).m10243();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m10354(int i, String str, String str2, final boolean z, final InterfaceC8400 interfaceC8400) {
        if (str == null) {
            str = "";
        }
        String strReplace = str.replace('/', '.');
        if (strReplace.endsWith(".")) {
            strReplace = C20630.m46498(1, 0, strReplace);
        }
        View viewM30995 = ((AbstractActivityC12483) requireActivity()).m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(i);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        editText.setText(strReplace);
        editText2.setText(str2);
        editText2.setSelection(editText2.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12880.m16569().iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()) + ".dex");
        }
        if (arrayList.size() > 1) {
            spinner.setAdapter((SpinnerAdapter) new C0733(requireContext(), arrayList));
        } else {
            viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        Context contextRequireContext = requireContext();
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(contextRequireContext);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۜ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC3520.m10358(this.f23685, editText2, editText, z, dialogInterfaceC19356M21269, interfaceC8400, spinner);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10358(final ViewOnClickListenerC3520 viewOnClickListenerC3520, EditText editText, EditText editText2, boolean z, final DialogInterfaceC19356 dialogInterfaceC19356, final InterfaceC8400 interfaceC8400, Spinner spinner) {
        if (editText.getText().toString().isEmpty()) {
            editText.requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        String strReplace = editText2.getText().toString().replace('.', '/');
        if (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        if (!strReplace.isEmpty() && !strReplace.endsWith("/")) {
            strReplace = strReplace.concat("/");
        }
        String string = editText.getText().toString();
        if (C14690.m35219("[./\\s]").matcher((CharSequence) string).find()) {
            editText.requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        final String strM37076 = C15489.m37076(strReplace, string);
        if (!viewOnClickListenerC3520.f12880.m16563(strM37076)) {
            String str = (String) viewOnClickListenerC3520.f12880.m16569().get(Math.max(0, spinner.getSelectedItemPosition()));
            try {
                viewOnClickListenerC3520.f12880.m16534(str, strM37076, (String) interfaceC8400.mo3208(str, strM37076));
                viewOnClickListenerC3520.m10378();
                viewOnClickListenerC3520.m10379(strM37076);
                dialogInterfaceC19356.dismiss();
                return;
            } catch (Exception e) {
                viewOnClickListenerC3520.f12882.m42627((Throwable) e);
                return;
            }
        }
        if (!z) {
            editText.requestFocus();
            C15829.m37613((CharSequence) viewOnClickListenerC3520.getString(R.string.MT_Protector, strM37076.replace('/', '.')));
            return;
        }
        Context contextRequireContext = viewOnClickListenerC3520.requireContext();
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(contextRequireContext);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21261(viewOnClickListenerC3520.getString(R.string.MT_Protector, strM37076.replace('/', '.')));
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ᩹ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ViewOnClickListenerC3520.m10367(this.f58503, dialogInterfaceC19356, interfaceC8400, strM37076);
            }
        });
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10367(ViewOnClickListenerC3520 viewOnClickListenerC3520, DialogInterfaceC19356 dialogInterfaceC19356, InterfaceC8400 interfaceC8400, String str) {
        dialogInterfaceC19356.dismiss();
        try {
            viewOnClickListenerC3520.f12880.m16533(str, (String) interfaceC8400.mo3208(null, str));
            viewOnClickListenerC3520.m10378();
            viewOnClickListenerC3520.m10379(str);
        } catch (Exception e) {
            viewOnClickListenerC3520.f12882.m42627((Throwable) e);
        }
    }
}
