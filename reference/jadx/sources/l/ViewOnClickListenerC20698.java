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
import bin.mt.plugin.api.util.AsyncTask$$ExternalSyntheticLambda1;
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.᩵ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnClickListenerC20698 extends ComponentCallbacksC11612 implements View.OnClickListener, InterfaceC2264, InterfaceC5993, InterfaceC16837 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f66339;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f66340;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23940 f66341;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C25227 f66342;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AnimatorSet f66343;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20956 f66344;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C20956 f66345;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f66346;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f66347;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f66348;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14941 f66349;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11967 f66350;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f66351;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f66352;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C22761 f66353;

    public ViewOnClickListenerC20698() {
        super(R.layout.MT_Protector);
        this.f66348 = -1;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        final byte[] byteArray;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f66339 = bundle.getBoolean("batchExportMode", false);
            byteArray = bundle.getByteArray("selection");
        } else {
            byteArray = null;
        }
        C13239 c13239 = new C13239(this, C14941.m35934("<>"));
        this.f66349 = c13239;
        c13239.m35963(!this.f66339);
        this.f66349.m35942((InterfaceC2264) this);
        this.f66349.m35944((InterfaceC5993) this);
        C22761 c22761 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f66353 = c22761;
        c22761.m51322().m40350(this, new InterfaceC16438() { // from class: l.᩸ܽۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                ViewOnClickListenerC20698.m47342((C11967) obj, this.f74510, byteArray);
            }
        });
        C23940 c23940M28900 = ViewOnClickListenerC11499.m28900(this, new C5612(this));
        c23940M28900.m37644("project_import_init_path");
        this.f66341 = c23940M28900;
        C20956 c20956M28897 = ViewOnClickListenerC11499.m28897(this, new C2429(this));
        c20956M28897.m37644("project_import_init_path");
        this.f66345 = c20956M28897;
        C20956 c20956M28898 = ViewOnClickListenerC11499.m28897(this, new InterfaceC0073() { // from class: l.ᩴܽۧ
            @Override // l.InterfaceC0073
            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ void mo1127() {
            }

            @Override // l.InterfaceC0073
            /* JADX INFO: renamed from: ۙ */
            public final void mo1128(String str) {
                ViewOnClickListenerC20698 viewOnClickListenerC20698 = this.f64150;
                viewOnClickListenerC20698.m47341(new RunnableC11435(4, viewOnClickListenerC20698, str));
            }
        });
        c20956M28898.m37644("project_export_init_path");
        this.f66344 = c20956M28898;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47342(final C11967 c11967, final ViewOnClickListenerC20698 viewOnClickListenerC20698, final byte[] bArr) {
        viewOnClickListenerC20698.f66350 = c11967;
        C5261.f18540.execute(new Runnable() { // from class: l.ܳܽۧ
            @Override // java.lang.Runnable
            public final void run() {
                final C11967 c11968 = c11967;
                final C19782 c19782M29997 = c11968.m29997();
                final ViewOnClickListenerC20698 viewOnClickListenerC20699 = viewOnClickListenerC20698;
                final byte[] bArr2 = bArr;
                C21576.m49068(new Runnable() { // from class: l.۬ܺۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC20698.m47351(viewOnClickListenerC20699, c19782M29997, bArr2, c11968);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47351(ViewOnClickListenerC20698 viewOnClickListenerC20698, C19782 c19782, byte[] bArr, C11967 c11967) {
        viewOnClickListenerC20698.f66349.m35948(c19782);
        viewOnClickListenerC20698.f66348 = 0;
        C14941 c14941 = viewOnClickListenerC20698.f66349;
        HashSet hashSet = new HashSet();
        C11967 c11968 = viewOnClickListenerC20698.f66350;
        if (c11968 != null) {
            AbstractC22044 abstractC22044M24694 = c11968.m29968().m24694("explorer");
            if (!abstractC22044M24694.mo2934()) {
                Iterator it = c19782.m45556().iterator();
                while (it.hasNext()) {
                    hashSet.add(((C19782) it.next()).m45560() + "/");
                }
            } else {
                try {
                    C20348 c20348M49835 = abstractC22044M24694.m49835();
                    if (c20348M49835.readInt() == 305419897) {
                        viewOnClickListenerC20698.f66348 = c20348M49835.readInt();
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
        C25227 c25227 = viewOnClickListenerC20698.f66342;
        if (c25227 != null) {
            c25227.scrollToPosition(viewOnClickListenerC20698.f66348);
            viewOnClickListenerC20698.f66348 = -1;
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                AbstractC22044 abstractC22044M24695 = c11967.m29991().m24694("selection");
                try {
                    viewOnClickListenerC20698.f66349.m35951(abstractC22044M24695.m49865());
                } catch (IOException unused2) {
                } finally {
                    abstractC22044M24695.mo4287();
                }
            } else {
                viewOnClickListenerC20698.f66349.m35951(bArr);
            }
        }
        viewOnClickListenerC20698.f66352 = true;
        ActivityC3409 activity = viewOnClickListenerC20698.getActivity();
        if (activity instanceof ActivityC0848) {
            ((ActivityC0848) activity).m3460();
        }
        if (viewOnClickListenerC20698.getView() != null) {
            viewOnClickListenerC20698.f66353.m51329(viewOnClickListenerC20698.getViewLifecycleOwner(), new C19863(viewOnClickListenerC20698));
            if (viewOnClickListenerC20698.f66349.m35959()) {
                viewOnClickListenerC20698.m47362();
            }
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C25227 c25227 = (C25227) view.findViewById(R.id.MT_Protector);
        this.f66342 = c25227;
        c25227.setTag("RecyclerView0");
        this.f66351 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f66347 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f66346 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f66340 = (FloatingActionButton) view.findViewById(R.id.MT_Protector);
        this.f66342.setAdapter(this.f66349);
        int i = this.f66348;
        if (i != -1) {
            this.f66342.scrollToPosition(i);
            this.f66348 = -1;
        }
        if (this.f66352) {
            ActivityC3409 activity = getActivity();
            if (activity instanceof ActivityC0848) {
                ((ActivityC0848) activity).m3460();
            }
            this.f66353.m51329(getViewLifecycleOwner(), new C19863(this));
            if (this.f66349.m35959()) {
                m47362();
            }
        }
        C22761 c22761 = this.f66353;
        InterfaceC11217 viewLifecycleOwner = getViewLifecycleOwner();
        C14941 c14941 = this.f66349;
        C17359.requireNonNull(c14941);
        c22761.m51313(viewLifecycleOwner, new RunnableC24228(4, c14941));
        this.f66353.m51310(getViewLifecycleOwner(), new C22200(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47344(ViewOnClickListenerC20698 viewOnClickListenerC20698, Integer num) {
        if (num.intValue() != R.id.MT_Protector) {
            if (num.intValue() == R.id.MT_Protector) {
                if (viewOnClickListenerC20698.f66349.m35959()) {
                    viewOnClickListenerC20698.f66349.mo32794();
                }
                C20956 c20956 = viewOnClickListenerC20698.f66345;
                c20956.getClass();
                C20956.m47909(c20956, R.string.MT_Protector, null, new String[]{"zip"}, 8);
                return;
            }
            return;
        }
        if (viewOnClickListenerC20698.f66349.m35959()) {
            if (viewOnClickListenerC20698.f66339) {
                return;
            } else {
                viewOnClickListenerC20698.f66349.mo32794();
            }
        }
        viewOnClickListenerC20698.f66339 = true;
        viewOnClickListenerC20698.f66349.m35963(false);
        viewOnClickListenerC20698.f66349.m35961();
        viewOnClickListenerC20698.m47354();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("batchExportMode", this.f66339);
        byte[] bArrM35966 = this.f66349.m35966();
        if (bArrM35966 != null) {
            if (bArrM35966.length > 20480) {
                try {
                    AbstractC22044 abstractC22044M24694 = this.f66350.m29991().m24694("selection");
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
        this.f66342.setAdapter(null);
        this.f66342 = null;
        this.f66351 = null;
        this.f66347 = null;
        this.f66346 = null;
        this.f66340 = null;
    }

    @Override // l.InterfaceC16837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1437() {
        if (!this.f66349.m35959()) {
            return false;
        }
        this.f66349.mo32794();
        return true;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onPause() {
        super.onPause();
        C11967 c11967 = this.f66350;
        if (c11967 != null && c11967.m11160().m24702()) {
            C6178 c6178M34975 = C14483.m34975(305419897);
            HashSet hashSetM35957 = this.f66349.m35957();
            c6178M34975.writeInt(((C0067) this.f66342.getLayoutManager()).findFirstVisibleItemPosition());
            c6178M34975.writeInt(hashSetM35957.size());
            Iterator it = hashSetM35957.iterator();
            while (it.hasNext()) {
                c6178M34975.m17786((CharSequence) it.next());
            }
            try {
                this.f66350.m29968().m24694("explorer").m49844(c6178M34975);
            } catch (IOException e) {
                C22761 c22761 = this.f66353;
                if (c22761 != null) {
                    c22761.m51299(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47363() {
        if (this.f66350 != null) {
            HashSet hashSetM35957 = this.f66349.m35957();
            this.f66349.m35948(this.f66350.m29997());
            this.f66349.m35941(hashSetM35957);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47364(String str) {
        C14941 c14941 = this.f66349;
        c14941.getClass();
        c14941.m35940((Collection) Collections.singletonList(str));
    }

    @Override // l.InterfaceC2264
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7690(C8230 c8230) {
        ((ActivityC0848) requireActivity()).m3452(c8230.m22146(), (C15301) null);
        this.f66350.m29972(c8230.m22146());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    @Override // l.InterfaceC5993
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12934(C8230 c8230) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C18452 c18452 = new C18452(requireContext(), c8230.m22143(), 0);
        if (!c8230.m22142()) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (c8230.m22142()) {
            if (c8230.m22139() == 1 && c8230.m22146().endsWith("/package-info")) {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            } else if (c8230.m22139() != 2) {
                z = false;
                z2 = true;
                z3 = false;
                z4 = false;
                z5 = false;
            } else if (c8230.m22146().endsWith("/type-info")) {
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
            z = c8230.m22139() == 1;
            z2 = c8230.m22144() != 0 || this.f66349.m35935().m3155().size() > 1;
            z3 = true;
            z4 = false;
            z5 = false;
            z6 = true;
        }
        if (z3) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z4) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z2) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z5) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z6) {
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c18452.m42994(new C9085(this, c8230));
        if (c18452.m42995().size() > 0) {
            this.f66342.suppressLayout(true);
            c18452.m42993(new C8742(this));
            c18452.mo21878();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47350(ViewOnClickListenerC20698 viewOnClickListenerC20698, C8230 c8230, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            new ViewOnClickListenerC19184(viewOnClickListenerC20698, c8230.m22146()).m44459();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strM22146 = c8230.m22146();
            String strM28558 = C11293.m28558(strM22146);
            String strM28556 = C11293.m28556(strM22146);
            C17359.requireNonNull(strM28556);
            String strM28559 = C11293.m28558(strM28556);
            C23682 c23682 = new C23682(viewOnClickListenerC20698, (AbstractActivityC17204) viewOnClickListenerC20698.requireActivity(), strM28558, strM28559, strM22146, strM28556);
            c23682.m22945(R.string.MT_Protector);
            c23682.m22924((CharSequence) strM28558);
            c23682.m22918();
            c23682.m22957(6);
            c23682.m22920(strM28559.length(), strM28558.length());
            c23682.m22955(true);
            c23682.m22923(new C3544(strM28559, c23682));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            String strM22147 = c8230.m22146();
            String strM285510 = C11293.m28558(strM22147);
            String strM28557 = C11293.m28556(strM22147);
            C17359.requireNonNull(strM28557);
            String strM285511 = C11293.m28558(strM28557);
            C16222 c16222 = new C16222(viewOnClickListenerC20698, (AbstractActivityC17204) viewOnClickListenerC20698.requireActivity(), strM285510, strM285511, strM22147, strM28557);
            c16222.m22945(R.string.MT_Protector);
            c16222.m22924((CharSequence) strM285510);
            c16222.m22918();
            c16222.m22916();
            c16222.m22957(6);
            c16222.m22955(true);
            c16222.m22923(new C3544(strM285511, c16222));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int iM22139 = c8230.m22139();
            if (iM22139 != 0) {
                if (iM22139 != 1) {
                    return;
                }
                viewOnClickListenerC20698.m47340(R.string.MT_Protector, c8230.m22146(), "<?xml version='1.0' encoding='utf-8' ?>\n<resources>\n    \n</resources>\n");
                return;
            } else {
                C2053 c2053 = new C2053(viewOnClickListenerC20698, (AbstractActivityC17204) viewOnClickListenerC20698.requireActivity(), c8230.m22146());
                c2053.m22945(R.string.MT_Protector);
                c2053.m22933("attr, string, style...");
                c2053.m22918();
                c2053.m22957(6);
                c2053.m22955(true);
                return;
            }
        }
        if (itemId == R.string.MT_Protector) {
            Bundle bundle = new Bundle();
            bundle.putString(MotionUtils.EASING_TYPE_PATH, c8230.m22146());
            viewOnClickListenerC20698.f66341.m37643(1, R.string.MT_Protector, null, null, new String[]{DocumentReader.RESERVED}, bundle);
            return;
        }
        int i = 0;
        if (itemId == R.string.MT_Protector) {
            Context contextRequireContext = viewOnClickListenerC20698.requireContext();
            int i2 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(contextRequireContext);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8008(viewOnClickListenerC20698.getString(R.string.MT_Protector, c8230.m22145()));
            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22190(i, viewOnClickListenerC20698, c8230));
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC20698.f66339 = false;
            viewOnClickListenerC20698.f66349.m35963(true);
            c8230.m22138();
            viewOnClickListenerC20698.m47354();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC20698.f66339 = true;
            viewOnClickListenerC20698.f66349.m35963(false);
            c8230.m22138();
            viewOnClickListenerC20698.m47354();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47349(ViewOnClickListenerC20698 viewOnClickListenerC20698, C8230 c8230) {
        c8230.m22140();
        if (c8230.m22142()) {
            C11967 c11967 = viewOnClickListenerC20698.f66350;
            String strM22146 = c8230.m22146();
            c11967.getClass();
            c11967.m29974(Collections.singleton(strM22146));
        } else {
            viewOnClickListenerC20698.f66350.m29969(c8230.m22146());
        }
        ((ActivityC0848) viewOnClickListenerC20698.requireActivity()).m3445();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47359(ViewOnClickListenerC20698 viewOnClickListenerC20698) {
        C25227 c25227 = viewOnClickListenerC20698.f66342;
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
            c2361.m8008(getString(R.string.MT_Protector, Integer.valueOf(this.f66349.m35968())));
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤܽۧ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC20698.m47343(this.f34747);
                }
            });
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016();
            return;
        }
        if (id == R.id.MT_Protector) {
            C20956 c20956 = this.f66344;
            c20956.getClass();
            C20956.m47908(c20956, R.string.MT_Protector, (String) null, "arsc.zip", new String[]{"zip"}, 16);
        } else if (id == R.id.MT_Protector) {
            this.f66349.mo32794();
        } else if (id == R.id.MT_Protector) {
            this.f66349.m35943(new C11958());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m47362() {
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2 = this.f66340;
        FloatingActionButton floatingActionButton3 = this.f66346;
        if (this.f66339) {
            floatingActionButton = this.f66347;
            this.f66351.setVisibility(4);
        } else {
            floatingActionButton = this.f66351;
            this.f66347.setVisibility(4);
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m47354() {
        FloatingActionButton floatingActionButton;
        AnimatorSet animatorSet = this.f66343;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        FloatingActionButton floatingActionButton2 = this.f66340;
        FloatingActionButton floatingActionButton3 = this.f66346;
        if (this.f66339) {
            floatingActionButton = this.f66347;
            this.f66351.setVisibility(4);
        } else {
            floatingActionButton = this.f66351;
            this.f66347.setVisibility(4);
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
        this.f66343 = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m47352(boolean z) {
        FloatingActionButton floatingActionButton;
        AnimatorSet animatorSet = this.f66343;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        FloatingActionButton floatingActionButton2 = this.f66340;
        FloatingActionButton floatingActionButton3 = this.f66346;
        if (this.f66339) {
            floatingActionButton = this.f66347;
            this.f66351.setVisibility(4);
        } else {
            floatingActionButton = this.f66351;
            this.f66347.setVisibility(4);
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
        duration.addListener(new C5782(floatingActionButton, floatingActionButton2, floatingActionButton3));
        duration.start();
        this.f66343 = duration;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47343(ViewOnClickListenerC20698 viewOnClickListenerC20698) {
        if (viewOnClickListenerC20698.f66350 == null) {
            return;
        }
        if (!C18978.m44078()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        viewOnClickListenerC20698.f66350.m29974(viewOnClickListenerC20698.f66349.m35955());
        viewOnClickListenerC20698.f66349.m35967();
        viewOnClickListenerC20698.m47352(true);
        ((ActivityC0848) viewOnClickListenerC20698.requireActivity()).m3445();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m47355(ViewOnClickListenerC20698 viewOnClickListenerC20698, String str) {
        if (viewOnClickListenerC20698.f66350 == null) {
            return;
        }
        new C25174(viewOnClickListenerC20698, str, viewOnClickListenerC20698.f66349.m35955()).m8197();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m47341(Runnable runnable) {
        if (this.f66352) {
            runnable.run();
        } else {
            C21576.m49069(new AsyncTask$$ExternalSyntheticLambda1(1, this, runnable), 100L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47345(ViewOnClickListenerC20698 viewOnClickListenerC20698, Runnable runnable) {
        if (viewOnClickListenerC20698.isResumed()) {
            viewOnClickListenerC20698.m47341(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m47340(int i, String str, String str2) {
        String strM28558 = C11293.m28558(str);
        C17714 c17714 = new C17714(this, (AbstractActivityC17204) requireActivity(), strM28558, str, str2);
        c17714.m22945(i);
        c17714.m22924((CharSequence) (strM28558 + "-"));
        c17714.m22918();
        c17714.m22916();
        c17714.m22957(6);
        c17714.m22955(true);
        c17714.m22923(new C3544(strM28558, c17714));
    }
}
