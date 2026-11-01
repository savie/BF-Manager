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
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ܺۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnClickListenerC15847 extends ComponentCallbacksC22654 implements View.OnClickListener, InterfaceC21174, InterfaceC7769, InterfaceC19601 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8229 f51287;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23566 f51288;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f51289;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C17492 f51290;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f51291;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AnimatorSet f51292;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f51293;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23566 f51294;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C18377 f51295;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17215 f51296;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9886 f51297;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51298;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f51299;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f51300;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f51301;

    public ViewOnClickListenerC15847() {
        super(R.layout.MT_Protector);
        this.f51289 = -1;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        final byte[] byteArray;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f51298 = bundle.getBoolean("batchExportMode", false);
            byteArray = bundle.getByteArray("selection");
        } else {
            byteArray = null;
        }
        C15141 c15141 = new C15141(this, C9886.m24978("<>"));
        this.f51297 = c15141;
        c15141.m25018(!this.f51298);
        this.f51297.m25007((InterfaceC21174) this);
        this.f51297.m25005((InterfaceC7769) this);
        C18377 c18377 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f51295 = c18377;
        c18377.m42658().m44959(this, new InterfaceC10597() { // from class: l.ۜۢۘ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                ViewOnClickListenerC15847.m37725(this.f22531, byteArray, (C8229) obj);
            }
        });
        C17215 c17215M21924 = ViewOnClickListenerC8374.m21924((ComponentCallbacksC22654) this, (InterfaceC14394) new C5672(3, this));
        c17215M21924.m46685("project_import_init_path");
        this.f51296 = c17215M21924;
        C23566 c23566M21927 = ViewOnClickListenerC8374.m21927(this, new C23527(2, this));
        c23566M21927.m46685("project_import_init_path");
        this.f51288 = c23566M21927;
        C23566 c23566M21928 = ViewOnClickListenerC8374.m21927(this, new C22606(this));
        c23566M21928.m46685("project_export_init_path");
        this.f51294 = c23566M21928;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37725(ViewOnClickListenerC15847 viewOnClickListenerC15847, byte[] bArr, C8229 c8229) {
        viewOnClickListenerC15847.f51287 = c8229;
        C4716.f16636.execute(new RunnableC22902(viewOnClickListenerC15847, c8229, bArr, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37722(ViewOnClickListenerC15847 viewOnClickListenerC15847, C5693 c5693, byte[] bArr, C8229 c8229) {
        viewOnClickListenerC15847.f51297.m25004(c5693);
        viewOnClickListenerC15847.f51289 = 0;
        C9886 c9886 = viewOnClickListenerC15847.f51297;
        HashSet hashSet = new HashSet();
        C8229 c82210 = viewOnClickListenerC15847.f51287;
        if (c82210 != null) {
            AbstractC20745 abstractC20745M33320 = c82210.m21572().m33320("explorer");
            if (!abstractC20745M33320.mo33975()) {
                Iterator it = c5693.m15698().iterator();
                while (it.hasNext()) {
                    hashSet.add(((C5693) it.next()).m15701() + "/");
                }
            } else {
                try {
                    C17367 c17367M46713 = abstractC20745M33320.m46713();
                    if (c17367M46713.readInt() == 305419897) {
                        viewOnClickListenerC15847.f51289 = c17367M46713.readInt();
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
        C17492 c17492 = viewOnClickListenerC15847.f51290;
        if (c17492 != null) {
            c17492.scrollToPosition(viewOnClickListenerC15847.f51289);
            viewOnClickListenerC15847.f51289 = -1;
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                AbstractC20745 abstractC20745M33321 = c8229.m21592().m33320("selection");
                try {
                    viewOnClickListenerC15847.f51297.m25009(abstractC20745M33321.m46727());
                } catch (IOException unused2) {
                } finally {
                    abstractC20745M33321.mo24644();
                }
            } else {
                viewOnClickListenerC15847.f51297.m25009(bArr);
            }
        }
        viewOnClickListenerC15847.f51300 = true;
        ActivityC19126 activity = viewOnClickListenerC15847.getActivity();
        if (activity instanceof ActivityC5677) {
            ((ActivityC5677) activity).m15681();
        }
        if (viewOnClickListenerC15847.getView() != null) {
            viewOnClickListenerC15847.f51295.m42651(viewOnClickListenerC15847.getViewLifecycleOwner(), new C2439(viewOnClickListenerC15847));
            if (viewOnClickListenerC15847.f51297.m25023()) {
                viewOnClickListenerC15847.m37713();
            }
        }
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C17492 c17492 = (C17492) view.findViewById(R.id.MT_Protector);
        this.f51290 = c17492;
        c17492.setTag("RecyclerView0");
        this.f51299 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f51291 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f51301 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f51293 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f51290.setAdapter(this.f51297);
        int i = this.f51289;
        if (i != -1) {
            this.f51290.scrollToPosition(i);
            this.f51289 = -1;
        }
        if (this.f51300) {
            ActivityC19126 activity = getActivity();
            if (activity instanceof ActivityC5677) {
                ((ActivityC5677) activity).m15681();
            }
            this.f51295.m42651(getViewLifecycleOwner(), new C2439(this));
            if (this.f51297.m25023()) {
                m37713();
            }
        }
        C18377 c18377 = this.f51295;
        InterfaceC1423 viewLifecycleOwner = getViewLifecycleOwner();
        C9886 c9886 = this.f51297;
        C13638.requireNonNull(c9886);
        c18377.m42632(viewLifecycleOwner, new RunnableC4263(6, c9886));
        this.f51295.m42635(getViewLifecycleOwner(), new C23648(5, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37717(ViewOnClickListenerC15847 viewOnClickListenerC15847, Integer num) {
        if (num.intValue() != R.id.MT_Protector) {
            if (num.intValue() == R.id.MT_Protector) {
                if (viewOnClickListenerC15847.f51297.m25023()) {
                    viewOnClickListenerC15847.f51297.mo24995();
                }
                C23566 c23566 = viewOnClickListenerC15847.f51288;
                c23566.getClass();
                C23566.m51966(c23566, R.string.MT_Protector, null, new String[]{"zip"}, 8);
                return;
            }
            return;
        }
        if (viewOnClickListenerC15847.f51297.m25023()) {
            if (viewOnClickListenerC15847.f51298) {
                return;
            } else {
                viewOnClickListenerC15847.f51297.mo24995();
            }
        }
        viewOnClickListenerC15847.f51298 = true;
        viewOnClickListenerC15847.f51297.m25018(false);
        viewOnClickListenerC15847.f51297.m25022();
        viewOnClickListenerC15847.m37729();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("batchExportMode", this.f51298);
        byte[] bArrM24991 = this.f51297.m24991();
        if (bArrM24991 != null) {
            if (bArrM24991.length > 20480) {
                try {
                    AbstractC20745 abstractC20745M33320 = this.f51287.m21592().m33320("selection");
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
        this.f51290.setAdapter(null);
        this.f51290 = null;
        this.f51299 = null;
        this.f51291 = null;
        this.f51301 = null;
        this.f51293 = null;
    }

    @Override // l.InterfaceC19601
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3616() {
        if (!this.f51297.m25023()) {
            return false;
        }
        this.f51297.mo24995();
        return true;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onPause() {
        super.onPause();
        C8229 c8229 = this.f51287;
        if (c8229 != null && c8229.m47187().m33326()) {
            C11018 c11018M43576 = C18917.m43576(305419897);
            HashSet hashSetM25024 = this.f51297.m25024();
            c11018M43576.writeInt(((C13115) this.f51290.getLayoutManager()).findFirstVisibleItemPosition());
            c11018M43576.writeInt(hashSetM25024.size());
            Iterator it = hashSetM25024.iterator();
            while (it.hasNext()) {
                c11018M43576.m27782((CharSequence) it.next());
            }
            try {
                this.f51287.m21572().m33320("explorer").m46697(c11018M43576);
            } catch (IOException e) {
                C18377 c18377 = this.f51295;
                if (c18377 != null) {
                    c18377.m42627((Throwable) e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37734() {
        if (this.f51287 != null) {
            HashSet hashSetM25024 = this.f51297.m25024();
            this.f51297.m25004(this.f51287.m21602());
            this.f51297.m24999(hashSetM25024);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37735(String str) {
        C9886 c9886 = this.f51297;
        c9886.getClass();
        c9886.m24998((Collection) Collections.singletonList(str));
    }

    @Override // l.InterfaceC21174
    /* JADX INFO: renamed from: ܰ */
    public final void mo6613(C11381 c11381) {
        ((ActivityC5677) requireActivity()).m15674(c11381.m28482(), (C8500) null);
        this.f51287.m21575(c11381.m28482());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    @Override // l.InterfaceC7769
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6612(C11381 c11381) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C16195 c16195 = new C16195(requireContext(), c11381.m28489(), 0);
        if (!c11381.m28481()) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (c11381.m28481()) {
            if (c11381.m28484() == 1 && c11381.m28482().endsWith("/package-info")) {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            } else if (c11381.m28484() != 2) {
                z = false;
                z2 = true;
                z3 = false;
                z4 = false;
                z5 = false;
            } else if (c11381.m28482().endsWith("/type-info")) {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            } else {
                z = false;
                z2 = true;
                z3 = false;
                z4 = true;
                z5 = true;
            }
            z6 = false;
        } else {
            z = c11381.m28484() == 1;
            z2 = c11381.m28485() != 0 || this.f51297.m24992().m33030().size() > 1;
            z3 = true;
            z4 = false;
            z5 = false;
            z6 = true;
        }
        if (z3) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z4) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z2) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z5) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z6) {
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c16195.m38296(new C18246(this, c11381));
        if (c16195.m38298().size() > 0) {
            this.f51290.suppressLayout(true);
            c16195.m38295(new InterfaceC7728() { // from class: l.ۚۢۘ
                @Override // l.InterfaceC7728
                /* JADX INFO: renamed from: ۙ */
                public final void mo11010(C16195 c16196) {
                    ViewOnClickListenerC15847.m37731(this.f18246);
                }
            });
            c16195.m38297();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37724(ViewOnClickListenerC15847 viewOnClickListenerC15847, C11381 c11381, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            new ViewOnClickListenerC2917(viewOnClickListenerC15847, c11381.m28482()).m8741();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strM28482 = c11381.m28482();
            String strM18175 = C6730.m18175(strM28482);
            String strM18172 = C6730.m18172(strM28482);
            C13638.requireNonNull(strM18172);
            String strM18176 = C6730.m18175(strM18172);
            C7379 c7379 = new C7379(viewOnClickListenerC15847, (AbstractActivityC12483) viewOnClickListenerC15847.requireActivity(), strM18175, strM18176, strM28482, strM18172);
            c7379.m40376(R.string.MT_Protector);
            c7379.m40346((CharSequence) strM18175);
            c7379.m40340();
            c7379.m40336(6);
            c7379.m40342(strM18176.length(), strM18175.length());
            c7379.m40368(true);
            c7379.m40345(new C20785(strM18176, c7379));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strM28483 = c11381.m28482();
            String strM18177 = C6730.m18175(strM28483);
            String strM18173 = C6730.m18172(strM28483);
            C13638.requireNonNull(strM18173);
            String strM18178 = C6730.m18175(strM18173);
            C10202 c10202 = new C10202(viewOnClickListenerC15847, (AbstractActivityC12483) viewOnClickListenerC15847.requireActivity(), strM18177, strM18178, strM28483, strM18173);
            c10202.m40376(R.string.MT_Protector);
            c10202.m40346((CharSequence) strM18177);
            c10202.m40340();
            c10202.m40371();
            c10202.m40336(6);
            c10202.m40368(true);
            c10202.m40345(new C20785(strM18178, c10202));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int iM28484 = c11381.m28484();
            if (iM28484 != 0) {
                if (iM28484 != 1) {
                    return;
                }
                viewOnClickListenerC15847.m37714(R.string.MT_Protector, c11381.m28482(), "<?xml version='1.0' encoding='utf-8' ?>\n<resources>\n    \n</resources>\n");
                return;
            } else {
                C17962 c17962 = new C17962(viewOnClickListenerC15847, (AbstractActivityC12483) viewOnClickListenerC15847.requireActivity(), c11381.m28482());
                c17962.m40376(R.string.MT_Protector);
                c17962.m40367("attr, string, style...");
                c17962.m40340();
                c17962.m40336(6);
                c17962.m40368(true);
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            Bundle bundle = new Bundle();
            bundle.putString(MotionUtils.EASING_TYPE_PATH, c11381.m28482());
            viewOnClickListenerC15847.f51296.m46684(1, R.string.MT_Protector, null, null, new String[]{DocumentReader.RESERVED}, bundle);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            Context contextRequireContext = viewOnClickListenerC15847.requireContext();
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(contextRequireContext);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21261(viewOnClickListenerC15847.getString(R.string.MT_Protector, c11381.m28488()));
            c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18064(1, viewOnClickListenerC15847, c11381));
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC15847.f51298 = false;
            viewOnClickListenerC15847.f51297.m25018(true);
            c11381.m28483();
            viewOnClickListenerC15847.m37729();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC15847.f51298 = true;
            viewOnClickListenerC15847.f51297.m25018(false);
            c11381.m28483();
            viewOnClickListenerC15847.m37729();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37723(ViewOnClickListenerC15847 viewOnClickListenerC15847, C11381 c11381) {
        c11381.m28487();
        if (c11381.m28481()) {
            C8229 c8229 = viewOnClickListenerC15847.f51287;
            String strM28482 = c11381.m28482();
            c8229.getClass();
            c8229.m21577(Collections.singleton(strM28482));
        } else {
            viewOnClickListenerC15847.f51287.m21573(c11381.m28482());
        }
        ((ActivityC5677) viewOnClickListenerC15847.requireActivity()).m15655();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37731(ViewOnClickListenerC15847 viewOnClickListenerC15847) {
        C17492 c17492 = viewOnClickListenerC15847.f51290;
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
            c8067.m21261(getString(R.string.MT_Protector, Integer.valueOf(this.f51297.m25025())));
            c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6569(3, this));
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269();
            return;
        }
        if (id == R.id.MT_Protector) {
            C23566 c23566 = this.f51294;
            c23566.getClass();
            C23566.m51965(c23566, R.string.MT_Protector, (String) null, "arsc.zip", new String[]{"zip"}, 16);
        } else if (id == R.id.MT_Protector) {
            this.f51297.mo24995();
        } else if (id == R.id.MT_Protector) {
            this.f51297.m25000(new C16236());
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m37713() {
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2 = this.f51293;
        FloatingActionButton floatingActionButton3 = this.f51301;
        if (this.f51298) {
            floatingActionButton = this.f51291;
            this.f51299.setVisibility(4);
        } else {
            floatingActionButton = this.f51299;
            this.f51291.setVisibility(4);
        }
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
        floatingActionButton.setTranslationY(0.0f);
        floatingActionButton.setAlpha(0.8f);
        floatingActionButton2.setTranslationY(0.0f);
        floatingActionButton2.setAlpha(0.8f);
        floatingActionButton3.setTranslationY(0.0f);
        floatingActionButton3.setAlpha(0.8f);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m37729() {
        FloatingActionButton floatingActionButton;
        AnimatorSet animatorSet = this.f51292;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        FloatingActionButton floatingActionButton2 = this.f51293;
        FloatingActionButton floatingActionButton3 = this.f51301;
        if (this.f51298) {
            floatingActionButton = this.f51291;
            this.f51299.setVisibility(4);
        } else {
            floatingActionButton = this.f51299;
            this.f51291.setVisibility(4);
        }
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
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
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
        float height3 = floatingActionButton3.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
        floatingActionButton3.setTranslationY(height3);
        floatingActionButton3.setAlpha(0.8f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", height3, 0.0f);
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        duration.start();
        this.f51292 = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37726(boolean z) {
        FloatingActionButton floatingActionButton;
        AnimatorSet animatorSet = this.f51292;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        FloatingActionButton floatingActionButton2 = this.f51293;
        FloatingActionButton floatingActionButton3 = this.f51301;
        if (this.f51298) {
            floatingActionButton = this.f51291;
            this.f51299.setVisibility(4);
        } else {
            floatingActionButton = this.f51299;
            this.f51291.setVisibility(4);
        }
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton3, "alpha", 0.8f, 0.0f));
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", 0.0f, floatingActionButton3.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        }
        duration.addListener(new C21490(floatingActionButton, floatingActionButton2, floatingActionButton3));
        duration.start();
        this.f51292 = duration;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37716(ViewOnClickListenerC15847 viewOnClickListenerC15847) {
        if (viewOnClickListenerC15847.f51287 == null) {
            return;
        }
        if (!C1709.m5693()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        viewOnClickListenerC15847.f51287.m21577(viewOnClickListenerC15847.f51297.m25012());
        viewOnClickListenerC15847.f51297.m25021();
        viewOnClickListenerC15847.m37726(true);
        ((ActivityC5677) viewOnClickListenerC15847.requireActivity()).m15655();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m37730(ViewOnClickListenerC15847 viewOnClickListenerC15847, String str) {
        if (viewOnClickListenerC15847.f51287 == null) {
            return;
        }
        new C8085(viewOnClickListenerC15847, str, viewOnClickListenerC15847.f51297.m25012()).m10243();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37715(Runnable runnable) {
        if (this.f51300) {
            runnable.run();
        } else {
            C16737.m39274(new RunnableC3850(0, this, runnable), 100L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37718(ViewOnClickListenerC15847 viewOnClickListenerC15847, Runnable runnable) {
        if (viewOnClickListenerC15847.isResumed()) {
            viewOnClickListenerC15847.m37715(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37714(int i, String str, String str2) {
        String strM18175 = C6730.m18175(str);
        C8791 c8791 = new C8791(this, (AbstractActivityC12483) requireActivity(), strM18175, str, str2);
        c8791.m40376(i);
        c8791.m40346((CharSequence) (strM18175 + "-"));
        c8791.m40340();
        c8791.m40371();
        c8791.m40336(6);
        c8791.m40368(true);
        c8791.m40345(new C20785(strM18175, c8791));
    }
}
