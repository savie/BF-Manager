package l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.AdapterView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final class C8614 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static Object f28132;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f28133;

    /* JADX INFO: renamed from: ۬ᩳۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f28134;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final Bitmap f28135;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f28136;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static C24720 f28137;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashSet f28138;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22612 f28139;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public String f28140;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f28142;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f28143;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f28144;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f28145;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f28146;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f28148;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f28149;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f28150;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f28151;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C20065 f28152;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28153;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28155;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public List f28156;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7364 f28157;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C15152 f28158;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C3966 f28159;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24720 f28160;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C24720 f28161;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9843 f28162;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f28163;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8614 f28164;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f28165;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28166;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public List f28167;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f28168;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C10105 f28154 = new C10105(this);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final HashSet f28147 = new HashSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f28141 = new AtomicInteger();

    @Override // android.widget.AdapterView.OnItemClickListener
    public native void onItemClick(AdapterView adapterView, View view, int i, long j);

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public native void m23212();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23134(C8614 c8614, C2889 c2889, String str) {
        c8614.getClass();
        c8614.m23125(Integer.valueOf(c2889.f9478), str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23155(C8614 c8614, C2889 c2889, String str) {
        c8614.getClass();
        c8614.m23125(Integer.valueOf(c2889.f9478), str);
    }

    public C8614(C20065 c20065, C19987 c19987, AbstractC7364 abstractC7364, boolean z, C20348 c20348) {
        List list = Collections.EMPTY_LIST;
        this.f28156 = list;
        this.f28148 = list;
        this.f28149 = "";
        this.f28142 = new WeakReference(null);
        this.f28167 = list;
        this.f28163 = new ArrayList();
        this.f28160 = C24720.m55198();
        this.f28161 = C24720.m55196();
        this.f28143 = new HashSet();
        this.f28152 = c20065;
        this.f28145 = z;
        this.f28157 = abstractC7364;
        this.f28159 = new C3966(this, c19987);
        C15152 c15152 = new C15152(this);
        this.f28158 = c15152;
        this.f28139 = new C22612(this);
        c15152.m36463(new C19802(this, c20065));
        c19987.setOnItemClickListener(this);
        c19987.setOnItemLongClickListener(this);
        c19987.m45947(new View.OnTouchListener() { // from class: l.ܳۨܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C8614.m23131(this.f50070, motionEvent);
                return false;
            }
        });
        if (z) {
            c20065.m46161().getLifecycle().mo23077(new C13089());
        }
        if (c20348 != null) {
            final int i = c20348.readInt();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            int i2 = c20348.readInt();
            for (int i3 = 0; i3 < i2; i3++) {
                hashSet.add(c20348.m46758());
            }
            int i4 = c20348.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                hashSet2.add(c20348.m46758());
            }
            if (c20348.m46753()) {
                this.f28139.m50944(true);
                this.f28139.m50941(c20348.m46758());
                if (c20065.m46140() == z) {
                    this.f28152.m46169();
                }
            }
            final boolean zMo20209 = this.f28157.mo20209();
            m23139(false, false, new Runnable() { // from class: l.ۚۨܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C8614.m23130(this.f19476, i, hashSet, hashSet2, zMo20209);
                }
            });
            return;
        }
        m23139(false, false, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23136(C8614 c8614, C20065 c20065) {
        if (c8614.f28155) {
            c20065.m46172();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23138(EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_PAUSE) {
            C5261.m15834(f28135);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23130(C8614 c8614, int i, HashSet hashSet, HashSet hashSet2, boolean z) {
        C3966 c3966 = c8614.f28159;
        c3966.m12742(i);
        boolean z2 = false;
        boolean z3 = false;
        for (InterfaceC2386 interfaceC2386 : c8614.f28148) {
            if (hashSet.contains(interfaceC2386.getName())) {
                interfaceC2386.setChecked(true);
                z2 = true;
                z3 = true;
            }
            if (hashSet2.contains(z ? interfaceC2386.getPath() : interfaceC2386.getName())) {
                interfaceC2386.mo8111(true);
                z3 = true;
            }
        }
        if (z2) {
            c8614.f28158.m36476();
        }
        if (z3) {
            c3966.m12741();
        }
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m23232() {
        if (m23193()) {
            return;
        }
        m23139(true, false, (Runnable) null);
        if (m23228("local")) {
            C13356.m32933(this.f28152.m46161(), this.f28157.m20193());
        }
    }

    static {
        ApplicationC23172.m52091(83);
        f28134 = new short[]{7730, 30942, 30933, 30930, 30866, 30929, 30920, 30866, 30924, 30928, 30921, 30927, 7417, 6257, 6258, 6270, 6268, 6257, 8004, -27559, -27556, -27575, -27556};
        f28133 = Executors.newFixedThreadPool(2);
        f28137 = C24720.m55194(500);
        f28135 = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_4444);
        f28136 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23139(boolean z, boolean z2, Runnable runnable) {
        if (this.f28153 && this.f28155) {
            this.f28152.m46166();
        }
        C6378 c6378 = new C6378(this, this.f28157, z, z2, runnable);
        c6378.m8189(f28133);
        c6378.m8197();
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m23234() {
        int i = 0;
        int i2 = 0;
        for (InterfaceC2386 interfaceC2386 : m23215()) {
            if (!interfaceC2386.mo8106()) {
                if (interfaceC2386.mo8090()) {
                    i2++;
                } else {
                    i++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Resources resourcesM49055 = C21576.m49055();
        sb.append(resourcesM49055.getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i)));
        sb.append(EnumC7687.f25319);
        sb.append(resourcesM49055.getQuantityString(R.plurals.MT_Protector, i2, Integer.valueOf(i2)));
        C15152 c15152 = this.f28158;
        if (c15152.m36475()) {
            sb.append(EnumC7687.f25319);
            sb.append(resourcesM49055.getString(R.string.MT_Protector, Integer.valueOf(c15152.m36466())));
        }
        this.f28149 = sb.toString();
        m23124();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23127(List list, boolean z) {
        HashSet hashSet;
        HashSet hashSet2;
        C15152 c15152 = this.f28158;
        if (!c15152.m36475()) {
            hashSet = null;
        } else if (z) {
            hashSet = new HashSet();
            for (InterfaceC2386 interfaceC2386 : this.f28156) {
                if (interfaceC2386.isChecked()) {
                    hashSet.add(interfaceC2386.getPath());
                }
            }
        } else {
            c15152.m36458();
            hashSet = null;
        }
        final int iIncrementAndGet = this.f28141.incrementAndGet();
        C22612 c22612 = this.f28139;
        List listM50939 = (!c22612.m50945() || c22612.m50946().isEmpty()) ? list : C22612.m50939(c22612.m50946(), list);
        this.f28156 = list;
        this.f28148 = listM50939;
        if (this.f28166) {
            int size = list.size();
            int i = 0;
            int i2 = 0;
            final int i3 = -1;
            while (true) {
                hashSet2 = this.f28147;
                if (i >= size) {
                    break;
                }
                InterfaceC2386 interfaceC2387 = (InterfaceC2386) list.get(i);
                if (!interfaceC2387.mo8106()) {
                    if (hashSet2.contains(this.f28150 ? interfaceC2387.getPath() : interfaceC2387.getName())) {
                        i2++;
                        interfaceC2387.mo8111(true);
                        if (i3 == -1) {
                            i3 = i;
                        }
                    } else {
                        interfaceC2387.mo8111(false);
                    }
                }
                i++;
            }
            if (i2 > 0 && listM50939 != list) {
                int size2 = listM50939.size();
                int i4 = 0;
                int i5 = -1;
                for (int i6 = 0; i6 < size2; i6++) {
                    InterfaceC2386 interfaceC2388 = (InterfaceC2386) listM50939.get(i6);
                    if (!interfaceC2388.mo8106() && interfaceC2388.mo8103()) {
                        i4++;
                        if (i5 == -1) {
                            i5 = i6;
                        }
                    }
                }
                if (i2 == i4) {
                    i3 = i5;
                } else {
                    c22612.m50940();
                    this.f28148 = list;
                }
            }
            final boolean z2 = this.f28146;
            if (z2) {
                this.f28146 = false;
            }
            this.f28166 = false;
            hashSet2.clear();
            this.f28150 = false;
            if (i3 != -1) {
                C21576.m49068(new Runnable() { // from class: l.᩹ۨܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8614.m23128(this.f76028, iIncrementAndGet, i3, z2);
                    }
                });
            }
        }
        if (hashSet != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC2386 interfaceC2389 = (InterfaceC2386) it.next();
                if (!interfaceC2389.mo8106()) {
                    interfaceC2389.setChecked(hashSet.contains(interfaceC2389.getPath()));
                }
            }
            c15152.m36476();
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC2386 interfaceC23810 = (InterfaceC2386) it2.next();
                if (!interfaceC23810.mo8106()) {
                    interfaceC23810.setChecked(false);
                }
            }
            if (c15152.m36475()) {
                c15152.m36458();
            }
        }
        m23234();
        c15152.m36472();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.᩸ۨܳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23128(final C8614 c8614, final int i, int i2, boolean z) {
        if (i != c8614.f28141.get()) {
            return;
        }
        c8614.f28159.m12736(i2, (C22786) new BooleanSupplier() { // from class: l.᩸ۨܳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C8614.m23141(this.f73904, i);
            }
        });
        if (!z || c8614.f28158.m36475()) {
            return;
        }
        new RunnableC24278(c8614, i, i2).run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m23141(C8614 c8614, int i) {
        return i == c8614.f28141.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23178(List list) {
        this.f28141.incrementAndGet();
        this.f28148 = list;
        m23234();
        this.f28158.m36472();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m23215() {
        if (!m23152()) {
            return C3292.f10718;
        }
        return C4681.unmodifiableList(this.f28148);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m23168(int i) {
        return (InterfaceC2386) this.f28148.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc A[PHI: r1 r11 r16
      0x00dc: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v1 java.lang.String) binds: [B:30:0x00da, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r11v3 short[]) = (r11v2 short[]), (r11v1 short[]) binds: [B:30:0x00da, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r16v22 int) = (r16v17 int), (r16v23 int) binds: [B:30:0x00da, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x012d A[PHI: r16 r17
      0x012d: PHI (r16v19 int) = (r16v16 int), (r16v20 int) binds: [B:36:0x0114, B:23:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r17v3 java.io.File) = (r17v2 java.io.File), (r17v1 java.io.File) binds: [B:36:0x0114, B:23:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0237 A[PHI: r4 r7 r8 r12 r16
      0x0237: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:62:0x0235, B:50:0x01bb, B:26:0x00b5, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:62:0x0235, B:50:0x01bb, B:26:0x00b5, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short), (r8v1 short) binds: [B:62:0x0235, B:50:0x01bb, B:26:0x00b5, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:62:0x0235, B:50:0x01bb, B:26:0x00b5, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r16v27 int) = (r16v9 int), (r16v12 int), (r16v18 int), (r16v28 int) binds: [B:62:0x0235, B:50:0x01bb, B:26:0x00b5, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02ad A[PHI: r2 r3 r5 r9 r16
      0x02ad: PHI (r2v3 short[]) = 
      (r2v2 short[])
      (r2v1 short[])
      (r2v1 short[])
      (r2v1 short[])
      (r2v1 short[])
      (r2v1 short[])
      (r2v1 short[])
      (r2v1 short[])
     binds: [B:74:0x02ab, B:70:0x028a, B:66:0x026b, B:58:0x0214, B:46:0x019a, B:17:0x0077, B:15:0x0073, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:74:0x02ab, B:70:0x028a, B:66:0x026b, B:58:0x0214, B:46:0x019a, B:17:0x0077, B:15:0x0073, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:74:0x02ab, B:70:0x028a, B:66:0x026b, B:58:0x0214, B:46:0x019a, B:17:0x0077, B:15:0x0073, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:74:0x02ab, B:70:0x028a, B:66:0x026b, B:58:0x0214, B:46:0x019a, B:17:0x0077, B:15:0x0073, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r16v24 int) = (r16v6 int), (r16v7 int), (r16v8 int), (r16v10 int), (r16v13 int), (r16v21 int), (r16v23 int), (r16v25 int) binds: [B:74:0x02ab, B:70:0x028a, B:66:0x026b, B:58:0x0214, B:46:0x019a, B:17:0x0077, B:15:0x0073, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23152() {
        int iM2761;
        int i;
        int i2;
        String name = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = -797167996;
        int i10 = C3448.f11240;
        int i11 = C1321.f4751;
        int iM3169 = (C0773.m3169("۫ۨ") + i10) * (-25);
        int i12 = ((iM3169 ^ i11) * 7967) ^ (-1698641417);
        int i13 = iM3169 ^ (-369488164);
        File parentFile = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i11) * (-16517)) >> 31));
            switch (i14) {
                case -2116080035:
                case -96562024:
                    return true;
                case -2079362293:
                case -1607035650:
                    i14 = i14;
                    name = parentFile.getName();
                    sArr2 = f28134;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ۚۡ") + i10) * 5;
                        i = ((iM2761 ^ i11) * 1995) ^ (-2096523287);
                        i2 = -264605769;
                    } else {
                        iM2761 = C0619.m2761("۫ܿ") ^ i11;
                        i = ((iM2761 ^ i10) * 18729) ^ (-1772443467);
                        i2 = 1164545180;
                    }
                    int i15 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i15;
                    break;
                case -2036742141:
                case -237880664:
                    i14 = i14;
                    i4 = i3 + 378146916;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۘܺ") ^ i11;
                        i = ((iM2761 ^ i10) * 8949) ^ 1685164382;
                        i2 = -1863765229;
                    } else {
                        iM2761 = (C0773.m3169("֡ۢ") ^ i10) * 37;
                        i = ((iM2761 ^ i11) * (-29827)) ^ 1291874325;
                        i2 = 118686469;
                    }
                    int i16 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i16;
                    break;
                case -1961930574:
                case -445083927:
                    i7 = 14150;
                    iM2761 = C0619.m2761("ۡܺ") ^ i11;
                    i = ((iM2761 ^ i10) * 30245) ^ 2016053407;
                    i2 = -1071811407;
                    int i17 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i17;
                    break;
                case -1903147148:
                case -1123507572:
                    i14 = i14;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("᩵ۡ") ^ i11) * (-51);
                        i = ((iM2761 ^ i10) * 17765) ^ (-1985284656);
                        i2 = -1335981328;
                    } else {
                        iM2761 = (C0773.m3169("۠ܰ") + i11) * 77;
                        i = ((iM2761 ^ i10) * (-1375)) ^ 1323055442;
                        i2 = 941769503;
                    }
                    int i18 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i18;
                    break;
                case -1893378783:
                case 2035193878:
                    i14 = i14;
                    C1146.m4231();
                    iM2761 = (C0619.m2761("᩵ۡ") ^ i11) * (-51);
                    i = ((iM2761 ^ i10) * 17765) ^ (-1985284656);
                    i2 = -1335981328;
                    int i19 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i19;
                    break;
                case -1784845626:
                case -720894709:
                    i14 = i14;
                    i5 = i4 + i4;
                    s2 = 19446;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i11 - C0619.m2761("᩵ۛ")) * 79;
                        i = ((iM2761 ^ i10) * 28023) ^ 299045887;
                        i2 = -802636399;
                    } else {
                        iM2761 = (i11 - C0773.m3169("᩺ۧ")) * 67;
                        i = ((iM2761 ^ i10) * 11975) ^ (-500173542);
                        i2 = -1775302521;
                    }
                    int i110 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i110;
                    break;
                case -1631636893:
                case 252106349:
                    i14 = i14;
                    i6 = s + s2;
                    if (C1343.m4943()) {
                        iM2761 = C0619.m2761("֨ᩴ") ^ i10;
                        i = ((iM2761 ^ i11) * 10765) ^ 157113361;
                        i2 = 564207201;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۡ") ^ i11) * (-51);
                        i = ((iM2761 ^ i10) * 17765) ^ (-1985284656);
                        i2 = -1335981328;
                    }
                    int i111 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i111;
                    break;
                case -1590996787:
                case 316242309:
                    i14 = i14;
                    i3 = s * s;
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("᩵ۡ") ^ i11) * (-51);
                        i = ((iM2761 ^ i10) * 17765) ^ (-1985284656);
                        i2 = -1335981328;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۤ") ^ i11) * 15;
                        i = ((iM2761 ^ i10) * (-9783)) ^ (-557963187);
                        i2 = 1169924627;
                    }
                    int i112 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i112;
                    break;
                case -1506190393:
                case -907515125:
                    i14 = i14;
                    if (i5 - (i6 * i6) >= 0) {
                        iM2761 = (i11 - C0773.m3169("ܽۙ")) * (-3);
                        i = ((iM2761 ^ i10) * 30437) ^ 633052705;
                        i2 = -1907482869;
                    } else {
                        iM2761 = C0773.m3169("ܺ۬") ^ i10;
                        i = ((iM2761 ^ i11) * 639) ^ (-762532342);
                        i2 = 221369533;
                    }
                    int i113 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i113;
                    break;
                case -1287273590:
                case 120923306:
                    return false;
                case -1255175041:
                case 1503770102:
                    i14 = i14;
                    if (C2966.m9664()) {
                        iM2761 = (i11 - C0773.m3169("ۜ᩶")) * 53;
                        i = ((iM2761 ^ i10) * (-20199)) ^ (-1453758077);
                        i2 = -1065589095;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۡ") ^ i11) * (-51);
                        i = ((iM2761 ^ i10) * 17765) ^ (-1985284656);
                        i2 = -1335981328;
                    }
                    int i114 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i114;
                    break;
                case -1207599734:
                case -570156370:
                    C3033.m9845();
                    if (C3033.f9831 >= 0) {
                        i14 = i14;
                        iM2761 = (C0619.m2761("᩵ۡ") ^ i11) * (-51);
                        i = ((iM2761 ^ i10) * 17765) ^ (-1985284656);
                        i2 = -1335981328;
                    } else {
                        iM2761 = (C0619.m2761("ۢܰ") ^ i10) * (-15);
                        i14 = i14;
                        i = ((iM2761 ^ i11) * (-13557)) ^ 63867910;
                        i2 = 1402764885;
                    }
                    int i115 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i115;
                    break;
                case -1186137239:
                case 1162482284:
                    i14 = i14;
                    sArr = f28134;
                    c = 0;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("᩵ۡ") ^ i11) * (-51);
                        i = ((iM2761 ^ i10) * 17765) ^ (-1985284656);
                        i2 = -1335981328;
                    } else {
                        iM2761 = (C0619.m2761("ۡᩴ") + i10) * 39;
                        i = ((iM2761 ^ i11) * (-399)) ^ (-1659996099);
                        i2 = 985789561;
                    }
                    int i116 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i116;
                    break;
                case -470708653:
                case 457722167:
                    i14 = i14;
                    i8 = 1;
                    if (C1080.m4050()) {
                        iM2761 = (C0619.m2761("۠ܽ") ^ i11) * (-123);
                        i = ((iM2761 ^ i10) * 27183) ^ (-1925308719);
                        i2 = -1599912678;
                    } else {
                        iM2761 = (i11 - C0619.m2761("᩵ۛ")) * 79;
                        i = ((iM2761 ^ i10) * 28023) ^ 299045887;
                        i2 = -802636399;
                    }
                    int i117 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i117;
                    break;
                case -437846550:
                case 2125461179:
                    RunnableC0334.m2063();
                    C2354.m7983();
                    return false;
                case 201962904:
                case 1720022963:
                    i14 = i14;
                    parentFile = C21576.m49072().getParentFile();
                    if (parentFile != null) {
                        iM2761 = (C0619.m2761("ܰ᩷") + i10) * 119;
                        i = ((iM2761 ^ i11) * 12779) ^ 4379781;
                        i2 = 1519125973;
                    } else {
                        iM2761 = C0773.m3169("֨ۘ") ^ i10;
                        i = ((iM2761 ^ i11) * 20851) ^ 2021912919;
                        i2 = 1527564572;
                    }
                    int i118 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i118;
                    break;
                case 457149087:
                case 913389322:
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = (C0619.m2761("ۢܰ") ^ i10) * (-15);
                        i14 = i14;
                        i = ((iM2761 ^ i11) * (-13557)) ^ 63867910;
                        i2 = 1402764885;
                    } else {
                        i14 = i14;
                        iM2761 = (i11 - C0619.m2761("᩵ۛ")) * 79;
                        i = ((iM2761 ^ i10) * 28023) ^ 299045887;
                        i2 = -802636399;
                    }
                    int i119 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i119;
                    break;
                case 606027536:
                case 1781150219:
                    i14 = i14;
                    s = sArr[c];
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i11 - C0619.m2761("᩵ۛ")) * 79;
                        i = ((iM2761 ^ i10) * 28023) ^ 299045887;
                        i2 = -802636399;
                    } else {
                        iM2761 = (i10 - C0773.m3169("᩹ۧ")) * (-111);
                        i = ((iM2761 ^ i11) * (-21641)) ^ 647282893;
                        i2 = -398109099;
                    }
                    int i1110 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i1110;
                    break;
                case 808395773:
                case 1160339434:
                    i14 = i14;
                    if (C1080.m4050()) {
                        iM2761 = (C0619.m2761("ۚۡ") + i10) * 5;
                        i = ((iM2761 ^ i11) * 1995) ^ (-2096523287);
                        i2 = -264605769;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۡ") ^ i11) * (-51);
                        i = ((iM2761 ^ i10) * 17765) ^ (-1985284656);
                        i2 = -1335981328;
                    }
                    int i1111 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i1111;
                    break;
                case 1414871460:
                case 1976898333:
                    i14 = i14;
                    if (C2419.m8175(name, C0950.m3780(sArr2, i8, 11, i7))) {
                        iM2761 = (i10 - C0773.m3169("᩹ᩴ")) * 73;
                        i = ((iM2761 ^ i11) * (-3507)) ^ (-1042936515);
                        i2 = -1110830338;
                    } else {
                        iM2761 = C0773.m3169("֨ۘ") ^ i10;
                        i = ((iM2761 ^ i11) * 20851) ^ 2021912919;
                        i2 = 1527564572;
                    }
                    int i1112 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i1112;
                    break;
                default:
                    i7 = 30908;
                    iM2761 = C0619.m2761("ۡܺ") ^ i11;
                    i = ((iM2761 ^ i10) * 30245) ^ 2016053407;
                    i2 = -1071811407;
                    int i1113 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    i9 = i1113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m23202() {
        return C4681.unmodifiableList(this.f28156);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23183(C8614 c8614) {
        this.f28164 = c8614;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m23200() {
        AbstractC7364 abstractC7364 = this.f28157;
        return abstractC7364.f24220.m23725() || abstractC7364.m20204() != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC7364 m23213() {
        return this.f28157;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 m23223() {
        return this.f28157.mo10174();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
          (r0v2 ?? I:boolean) from 0x0008: RETURN (r0v2 ?? I:boolean)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1413)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m23231() {
        /*
            r1 = this;
            l.ۜ᩵ܳ r0 = r1.f28157
            l.۠᩵ܳ r0 = r0.f24220
            void r0 = r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8614.m23231():boolean");
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m23197() {
        return this.f28157.mo20209();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23199(AbstractC7364 abstractC7364) {
        AbstractC7364 abstractC7365 = this.f28157;
        abstractC7365.f24220.f28934.put(abstractC7365.m20218(), Integer.valueOf(this.f28159.m12732()));
        this.f28157 = abstractC7364;
        m23143();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23180(C6728 c6728) {
        this.f28142 = new WeakReference(c6728);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23227(AbstractC7364 abstractC7364) {
        m23199(abstractC7364);
        if (abstractC7364 != this.f28142.get()) {
            m23139(false, true, (Runnable) new RunnableC4886(0, this));
        } else {
            this.f28142.clear();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23154(C8614 c8614) {
        AbstractC7364 abstractC7364 = c8614.f28157;
        Integer num = (Integer) abstractC7364.f24220.f28934.get(abstractC7364.m20218());
        c8614.f28159.m12742(num == null ? 0 : num.intValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23185(InterfaceC14075 interfaceC14075, Runnable runnable) {
        C20065 c20065 = this.f28152;
        c20065.getClass();
        C5149 c5149 = new C5149(c20065, this, interfaceC14075, runnable);
        c5149.m8189(f28133);
        c5149.m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23184(InterfaceC14075 interfaceC14075) {
        C20065 c20065 = this.f28152;
        c20065.getClass();
        C5149 c5149 = new C5149(c20065, this, interfaceC14075, null);
        c5149.m8189(f28133);
        c5149.m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23186(AbstractC22044 abstractC22044) {
        this.f28164 = this.f28164;
        m23209();
        this.f28164.m23209();
        AbstractC22044 abstractC22044M49856 = abstractC22044.m49856();
        if (m23228("local") && C14584.m35193(this.f28157.m20218(), new String[0]).equals(abstractC22044M49856)) {
            m23230(abstractC22044.getName());
            return;
        }
        this.f28164.m23230(abstractC22044.getName());
        if (this.f28164.m23228("local") && C14584.m35193(this.f28164.f28157.m20218(), new String[0]).equals(abstractC22044M49856)) {
            return;
        }
        this.f28164.m23226(abstractC22044M49856.mo4294(), true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23198(String str) {
        C8614 c8614 = this.f28164;
        String strM20187 = AbstractC7364.m20187(str);
        AbstractC7364 abstractC7364 = this.f28157;
        if (!(abstractC7364 instanceof C7495 ? abstractC7364.m20218().equals(strM20187) : false)) {
            c8614.getClass();
            String strM20188 = AbstractC7364.m20187(str);
            AbstractC7364 abstractC7365 = c8614.f28157;
            if (abstractC7365 instanceof C7495 ? abstractC7365.m20218().equals(strM20188) : false) {
                c8614.m23210();
                HashSet hashSet = this.f28147;
                if (!hashSet.isEmpty()) {
                    c8614.m23153(hashSet, this.f28150);
                    if (this.f28146) {
                        c8614.f28146 = true;
                        this.f28146 = false;
                    }
                    hashSet.clear();
                    this.f28150 = false;
                }
                c8614.m23226(str, true);
                return;
            }
        }
        m23226(str, true);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8614 m23236() {
        return this.f28164;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m23166() {
        return this.f28157.m20218();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m23204() {
        return this.f28157.m20193();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m23222() {
        if (this.f28157.mo20209()) {
            return C21576.m49088(R.string.MT_Protector);
        }
        String strM20218 = this.f28157.m20218();
        if (strM20218.length() == 1) {
            return strM20218;
        }
        int iLastIndexOf = strM20218.lastIndexOf(47, strM20218.length() - 2);
        return iLastIndexOf != -1 ? C1402.m5124(1, iLastIndexOf + 1, strM20218) : C1402.m5124(1, 0, strM20218);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m23192() {
        return this.f28157.mo20207();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23187(boolean z) {
        this.f28155 = z;
        m23124();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m23196() {
        return this.f28155;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m23193() {
        boolean z;
        synchronized (this.f28143) {
            z = !this.f28143.isEmpty();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public void m23124() {
        if (this.f28155) {
            String strMo10159 = this.f28157.mo10159();
            C20065 c20065 = this.f28152;
            c20065.m46158(strMo10159);
            if (!this.f28153 || TextUtils.isEmpty(this.f28144)) {
                String strMo20213 = this.f28157.mo20213(this);
                if (strMo20213 != null) {
                    c20065.m46144((CharSequence) C12669.m31438(new StringBuilder(), this.f28149, EnumC7687.f25319, strMo20213));
                } else {
                    c20065.m46144((CharSequence) this.f28149);
                }
            } else {
                c20065.m46144((CharSequence) this.f28144);
            }
            c20065.m46172();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m23217() {
        return this.f28157.mo10159();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23173(SubMenu subMenu) {
        if (m23193()) {
            return;
        }
        if (this.f28153) {
            this.f28167 = Collections.singletonList(AbstractC7364.f24216);
        } else {
            this.f28167 = this.f28157.mo10166();
        }
        ArrayList arrayList = this.f28163;
        arrayList.clear();
        int size = this.f28167.size();
        for (int i = 0; i < size; i++) {
            AbstractC18551 abstractC18551 = (AbstractC18551) this.f28167.get(i);
            if (abstractC18551.mo3179()) {
                List<AbstractC18551> listM43132 = abstractC18551.m43132();
                if (listM43132.isEmpty()) {
                    MenuItem icon = subMenu.add(0, i | 2113929216, 0, abstractC18551.m43131()).setIcon(abstractC18551.m43129());
                    if (abstractC18551.mo26901()) {
                        icon.setCheckable(true).setChecked(abstractC18551.mo26900());
                    }
                    if (!abstractC18551.mo25328(this)) {
                        icon.setEnabled(false);
                    }
                } else {
                    SubMenu icon2 = subMenu.addSubMenu(0, i | 2113929216, 0, abstractC18551.m43131()).setIcon(abstractC18551.m43129());
                    if (!abstractC18551.mo25328(this)) {
                        icon2.getItem().setEnabled(false);
                    }
                    for (AbstractC18551 abstractC18552 : listM43132) {
                        int size2 = arrayList.size();
                        arrayList.add(abstractC18552);
                        MenuItem icon3 = icon2.add(0, size2 | 2097152000, 0, abstractC18552.m43131()).setIcon(abstractC18552.m43129());
                        if (abstractC18552.mo26901()) {
                            icon3.setCheckable(true).setChecked(abstractC18552.mo26900());
                        }
                        if (!abstractC18552.mo25328(this)) {
                            icon3.setEnabled(false);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23225(int i) {
        int i2 = i >>> 24;
        int i3 = i & 16777215;
        if (i2 == 126) {
            if (i3 < this.f28167.size()) {
                ((AbstractC18551) this.f28167.get(i3)).mo3178(this);
            }
        } else if (i2 == 125) {
            ArrayList arrayList = this.f28163;
            if (i3 < arrayList.size()) {
                ((AbstractC18551) arrayList.get(i3)).mo3178(this);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23226(String str, boolean z) {
        AbstractC7364 abstractC7364;
        if (m23193()) {
            RunnableC16072 runnableC16072 = new RunnableC16072(this, this.f28166, this.f28146, this.f28150, new ArrayList(this.f28147), str, z);
            if (m23193()) {
                C21576.m49069(new RunnableC11879(3, this, runnableC16072), 100L);
                return;
            } else {
                runnableC16072.run();
                return;
            }
        }
        if (z) {
            AbstractC7364 abstractC7365 = this.f28157;
            if (abstractC7365 instanceof C7495) {
                m23149(str);
                return;
            }
            int iM20204 = abstractC7365.m20204();
            C2935<AbstractC7364> c2935M46163 = this.f28152.m46163();
            c2935M46163.m9583();
            AbstractC7364 abstractC7366 = null;
            if (iM20204 != 0) {
                try {
                    abstractC7364 = null;
                    for (AbstractC7364 abstractC7367 : c2935M46163) {
                        if (abstractC7367.m20191() == iM20204 && (abstractC7367 instanceof C7495)) {
                            abstractC7366 = abstractC7367;
                            break;
                        } else if (abstractC7364 == null && (abstractC7367 instanceof C7495)) {
                            abstractC7364 = abstractC7367;
                        }
                    }
                } catch (Throwable th) {
                    c2935M46163.m9584();
                    throw th;
                }
            } else {
                abstractC7364 = null;
            }
            if (abstractC7366 == null) {
                if (abstractC7364 == null) {
                    throw new RuntimeException();
                }
                abstractC7366 = abstractC7364;
            }
            c2935M46163.remove(abstractC7366);
            if (abstractC7365.mo20215()) {
                c2935M46163.add(abstractC7365);
                abstractC7365.f24220.f28934.put(abstractC7365.m20218(), Integer.valueOf(this.f28159.m12732()));
            } else {
                if (abstractC7365.m20204() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                abstractC7365.m20210();
            }
            c2935M46163.m9584();
            this.f28157 = abstractC7366;
            abstractC7366.mo10168(this);
            m23143();
            m23149(str);
            C8287.m22382();
            return;
        }
        m23149(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23137(C8614 c8614, boolean z, boolean z2, boolean z3, ArrayList arrayList, String str, boolean z4) {
        c8614.f28166 = z;
        c8614.f28146 = z2;
        c8614.f28150 = z3;
        HashSet hashSet = c8614.f28147;
        hashSet.clear();
        hashSet.addAll(arrayList);
        c8614.m23226(str, z4);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m23149(String str) {
        String strM20187 = AbstractC7364.m20187(str);
        if (!this.f28157.m20218().equals(strM20187)) {
            AbstractC7364 abstractC7364 = this.f28157;
            abstractC7364.f24220.f28934.put(abstractC7364.m20218(), Integer.valueOf(this.f28159.m12732()));
            this.f28157.f24220.m23727(m23146());
            this.f28157.mo20211(strM20187);
        }
        C22612 c22612 = this.f28139;
        boolean zM50945 = c22612.m50945();
        C20065 c20065 = this.f28152;
        if (zM50945) {
            c22612.m50940();
            c20065.m46168();
        }
        m23139(false, true, this.f28166 ? null : new Runnable() { // from class: l.᩷ۨܳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f71082.f28159.m12742(0);
            }
        });
        if (m23228("local")) {
            C13356.m32933(c20065.m46161(), this.f28157.m20193());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23131(C8614 c8614, MotionEvent motionEvent) {
        if (!f28136 && motionEvent.getActionMasked() == 0 && c8614.f28152.m46161().m40413()) {
            f28136 = true;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int iM31981;
        InterfaceC2386 interfaceC2386;
        InterfaceC2386 interfaceC2387;
        if (!m23193() && !this.f28153 && i <= this.f28148.size()) {
            this.f28168 = i;
            if (!((InterfaceC2386) this.f28148.get(i)).mo8106()) {
                final int i2 = this.f28141.get();
                final C12915 c12915 = new C12915(this);
                AbstractC7364 abstractC7364 = this.f28157;
                abstractC7364.getClass();
                C6774 c6774 = null;
                if (!c12915.m31986("trash") && c12915.m31968() && (iM31981 = c12915.m31981()) <= 2) {
                    if (iM31981 == 2) {
                        List listM31982 = c12915.m31982();
                        interfaceC2386 = (InterfaceC2386) listM31982.get(0);
                        interfaceC2387 = (InterfaceC2386) listM31982.get(1);
                    } else {
                        C8614 c8614M31974 = c12915.m31974();
                        if (!c8614M31974.m23228("trash") && c8614M31974.f28158.m36475() && c8614M31974.m23167() == 1) {
                            InterfaceC2386 interfaceC2386M31989 = c12915.m31989();
                            InterfaceC2386 interfaceC2386M23235 = c8614M31974.m23235();
                            interfaceC2386 = interfaceC2386M31989;
                            interfaceC2387 = interfaceC2386M23235;
                        }
                    }
                    if (interfaceC2386.isDirectory() && interfaceC2387.isDirectory()) {
                        c6774 = new C6774(-1L, -1L, "folder", "folder");
                    } else if (interfaceC2386.mo8090() && interfaceC2387.mo8090()) {
                        String lowerCase = interfaceC2386.getName().toLowerCase();
                        String lowerCase2 = interfaceC2387.getName().toLowerCase();
                        if (lowerCase.endsWith(".bak")) {
                            lowerCase = C1402.m5124(4, 0, lowerCase);
                        }
                        if (lowerCase2.endsWith(".bak")) {
                            lowerCase2 = C1402.m5124(4, 0, lowerCase2);
                        }
                        String strM49832 = AbstractC22044.m49832(lowerCase);
                        String strM49833 = AbstractC22044.m49832(lowerCase2);
                        if (!strM49832.isEmpty()) {
                            strM49832 = strM49832.substring(1);
                        }
                        String str = strM49832;
                        if (!strM49833.isEmpty()) {
                            strM49833 = strM49833.substring(1);
                        }
                        c6774 = new C6774(interfaceC2386.getSize(), interfaceC2387.getSize(), str, strM49833);
                    }
                }
                abstractC7364.f24219 = c6774;
                final ArrayList arrayList = new ArrayList(10);
                for (int i3 : DialogInterfaceOnDismissListenerC3610.m11713()) {
                    switch (i3) {
                        case 0:
                            arrayList.add(abstractC7364.mo20196(c12915));
                            break;
                        case 1:
                            arrayList.add(abstractC7364.mo18808(c12915));
                            break;
                        case 2:
                            arrayList.add(abstractC7364.mo18807());
                            break;
                        case 3:
                            arrayList.add(abstractC7364.mo18809());
                            break;
                        case 4:
                            arrayList.add(abstractC7364.mo18805());
                            break;
                        case 5:
                            arrayList.add(abstractC7364.mo20219());
                            break;
                        case 6:
                            arrayList.add(abstractC7364.mo10173());
                            break;
                        case 7:
                            arrayList.add(abstractC7364.mo20192());
                            break;
                        case 8:
                            arrayList.add(abstractC7364.mo20208());
                            break;
                        case 9:
                            arrayList.add(abstractC7364.mo18802());
                            break;
                    }
                }
                abstractC7364.mo20202(c12915, arrayList);
                if (!arrayList.isEmpty()) {
                    Main mainM46161 = this.f28152.m46161();
                    if (f28136 || !mainM46161.m40413()) {
                        ViewOnClickListenerC23411 viewOnClickListenerC23411 = new ViewOnClickListenerC23411(mainM46161, mainM46161.m118());
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC9843 abstractC9843 = (AbstractC9843) arrayList.get(i4);
                            String strM49088 = C21576.m49088(abstractC9843.m25627());
                            if (abstractC9843.m25625()) {
                                strM49088 = this.f28145 ? strM49088.concat(" ->") : "<- ".concat(strM49088);
                            }
                            viewOnClickListenerC23411.m52604(strM49088, i4, abstractC9843.m25624(), abstractC9843.m25622(c12915), abstractC9843.m25626(c12915));
                        }
                        viewOnClickListenerC23411.m52605(new InterfaceC15951() { // from class: l.᩻ۨܳ
                            @Override // l.InterfaceC15951
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo38065(int i5) {
                                C8614.m23129(this.f80971, i2, arrayList, c12915, i5);
                            }
                        });
                        viewOnClickListenerC23411.m52606(new C16818(this, i2, arrayList, c12915));
                        viewOnClickListenerC23411.m52602();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23129(C8614 c8614, int i, ArrayList arrayList, C12915 c12915, int i2) {
        if (i == c8614.f28141.get()) {
            ((AbstractC9843) arrayList.get(i2)).m25623(c12915, false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m23157(C8614 c8614, int i, ArrayList arrayList, C12915 c12915, int i2) {
        if (i == c8614.f28141.get()) {
            return ((AbstractC9843) arrayList.get(i2)).m25623(c12915, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23188() {
        String strM20218;
        String strM28556;
        if (!m23193()) {
            if (this.f28158.m36475()) {
                m23209();
                return true;
            }
            C22612 c22612 = this.f28139;
            boolean zM50945 = c22612.m50945();
            C20065 c20065 = this.f28152;
            if (zM50945) {
                c22612.m50944(false);
                c20065.m46168();
                return true;
            }
            if (this.f28157.mo20209()) {
                strM28556 = this.f28157.mo20212();
                strM20218 = null;
            } else {
                strM20218 = this.f28157.m20218();
                strM28556 = C11293.m28556(strM20218);
            }
            if (strM28556 == null) {
                if (this.f28157.m20204() == 0) {
                    return false;
                }
                AbstractC7364 abstractC7364 = this.f28157;
                abstractC7364.getClass();
                if (abstractC7364 instanceof C6728) {
                    if (this.f28161.m55199()) {
                        C22673.m51152(this.f28157.mo18795());
                        return true;
                    }
                    C22673.m51157();
                }
                this.f28159.m12737(this.f28157.m20203());
                c20065.m46148(this);
                return true;
            }
            if (!this.f28160.m55200()) {
                this.f28157.f24220.m23727(m23146());
                this.f28157.mo20211(strM28556);
                c22612.m50940();
                m23139(false, true, (Runnable) new RunnableC2598(this, strM28556, strM20218, 1));
                if (m23228("local")) {
                    C13356.m32933(c20065.m46161(), this.f28157.m20193());
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23224() {
        if (m23193() || !m23200()) {
            return;
        }
        if (!this.f28157.f24220.m23725()) {
            AbstractC7364 abstractC7364 = this.f28157;
            abstractC7364.getClass();
            if (abstractC7364 instanceof C6728) {
                if (this.f28161.m55199()) {
                    C22673.m51152(this.f28157.mo18795());
                    return;
                }
                C22673.m51157();
            }
            this.f28159.m12737(this.f28157.m20203());
            this.f28152.m46148(this);
            return;
        }
        C2889 c2889M23722 = this.f28157.f24220.m23722(m23146());
        String strM20218 = this.f28157.m20218();
        this.f28157.mo20211(c2889M23722.f9476);
        String strM20219 = this.f28157.m20218();
        if (!strM20219.startsWith("//SEARCH//") && (strM20218.startsWith("//SEARCH//") || strM20218.length() <= strM20219.length() || !strM20219.equals(C11293.m28556(strM20218)))) {
            strM20218 = null;
        }
        this.f28139.m50943(c2889M23722);
        m23139(false, true, (Runnable) new RunnableC16675(this, c2889M23722, strM20218));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0015: IF  (r0v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:10:0x0018
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1413)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23163() {
        /*
            r5 = this;
            boolean r0 = r5.m23193()
            if (r0 != 0) goto L6b
            boolean r0 = r5.m23231()
            if (r0 != 0) goto Ld
            goto L6b
        Ld:
            l.ۜ᩵ܳ r0 = r5.f28157
            l.۠᩵ܳ r0 = r0.f24220
            void r0 = r0.<init>()
            if (r0 != 0) goto L18
            goto L6b
        L18:
            l.ۜ᩵ܳ r0 = r5.f28157
            l.۠᩵ܳ r0 = r0.f24220
            l.ۖ᩵ܳ r1 = r5.m23146()
            l.ۖ᩵ܳ r0 = r0.m23728(r1)
            l.ۜ᩵ܳ r1 = r5.f28157
            java.lang.String r1 = r1.m20218()
            l.ۜ᩵ܳ r2 = r5.f28157
            java.lang.String r3 = r0.f9476
            r2.mo20211(r3)
            l.ۜ᩵ܳ r2 = r5.f28157
            java.lang.String r2 = r2.m20218()
            java.lang.String r3 = "//SEARCH//"
            boolean r4 = r1.startsWith(r3)
            if (r4 != 0) goto L5a
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L5a
            int r3 = r1.length()
            int r4 = r2.length()
            if (r3 <= r4) goto L5a
            java.lang.String r3 = l.C11293.m28556(r1)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r1 = 0
        L5b:
            l.᩸ۛܳ r2 = r5.f28139
            r2.m50943(r0)
            l.֫ۨܳ r2 = new l.֫ۨܳ
            r3 = 0
            r2.<init>(r5, r0, r1, r3)
            r0 = 1
            r1 = 0
            r5.m23139(r1, r0, r2)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8614.m23163():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۤۨܳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23125(Integer num, String str) {
        int iIntValue = num == null ? 0 : num.intValue();
        C3966 c3966 = this.f28159;
        if (str != null) {
            if (str.endsWith("/")) {
                str = C1402.m5124(1, 0, str);
            }
            for (int i = 0; i < this.f28148.size(); i++) {
                InterfaceC2386 interfaceC2386 = (InterfaceC2386) this.f28148.get(i);
                if (interfaceC2386.isDirectory() && interfaceC2386.getPath().equals(str)) {
                    final int i2 = this.f28141.get();
                    c3966.m12733(iIntValue, i, str, (C10851) new BooleanSupplier() { // from class: l.ۤۨܳ
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            return C8614.m23156(this.f34359, i2);
                        }
                    });
                    return;
                }
            }
        }
        c3966.m12742(iIntValue);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m23156(C8614 c8614, int i) {
        return i == c8614.f28141.get();
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final void m23206() {
        if (m23193() || this.f28153) {
            return;
        }
        this.f28158.m36469();
        this.f28159.m12740();
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final void m23164() {
        if (m23193() || this.f28153) {
            return;
        }
        C15152 c15152 = this.f28158;
        if (c15152.m36475()) {
            c15152.m36465();
            this.f28159.m12740();
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final void m23203() {
        if (m23193() || this.f28153) {
            return;
        }
        C15152 c15152 = this.f28158;
        if (c15152.m36475()) {
            c15152.m36457();
            this.f28159.m12740();
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final void m23191() {
        if (!m23193() && this.f28158.m36475()) {
            new C17059(this.f28152.m46161(), new C4140(this)).m40196();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m23209() {
        if (m23193()) {
            return;
        }
        C15152 c15152 = this.f28158;
        if (c15152.m36475()) {
            c15152.m36458();
            this.f28159.m12740();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23182(AbstractC7364 abstractC7364) {
        this.f28152.m46150(this, abstractC7364);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C20065 m23194() {
        return this.f28152;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private C2889 m23146() {
        String strM20218 = this.f28157.m20218();
        int iM12732 = this.f28159.m12732();
        C22612 c22612 = this.f28139;
        return new C2889(strM20218, iM12732, c22612.m50946(), c22612.m50945());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23228(String str) {
        return str.equals(this.f28157.mo10164());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23174(String str) {
        if (C17359.equals(str, this.f28157.mo10164())) {
            return;
        }
        StringBuilder sbM51387 = C22783.m51387("Expected type: ", str, ", got: ");
        sbM51387.append(this.f28157.mo10164());
        throw new RuntimeException(sbM51387.toString());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Main m23233() {
        return this.f28152.m46161();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m23162() {
        return this.f28158.m36475();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m23167() {
        C15152 c15152 = this.f28158;
        if (!c15152.m36475()) {
            return 1;
        }
        if (this.f28139.m50945()) {
            Iterator it = this.f28148.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((InterfaceC2386) it.next()).isChecked()) {
                    i++;
                }
            }
            return i;
        }
        return Math.max(1, c15152.m36466());
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m23235() {
        if (m23167() != 1) {
            throw new IllegalStateException("Selected item size != 1");
        }
        return (InterfaceC2386) m23208().get(0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m23208() {
        C15152 c15152 = this.f28158;
        if (c15152.m36475() && c15152.m36466() > 0) {
            ArrayList arrayList = new ArrayList(c15152.m36466());
            for (InterfaceC2386 interfaceC2386 : this.f28148) {
                if (interfaceC2386.isChecked()) {
                    arrayList.add(interfaceC2386);
                }
            }
            return C4681.unmodifiableList(arrayList);
        }
        return Collections.singletonList((InterfaceC2386) this.f28148.get(this.f28168));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m23211() {
        return (InterfaceC2386) this.f28148.get(this.f28168);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23171(int i, String str, String str2, ArrayList arrayList) {
        this.f28159.m12735(i, str, str2, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23177(Collection collection, boolean z) {
        C15152 c15152;
        List listM23215 = m23215();
        int i = 0;
        int i2 = -1;
        while (true) {
            int size = listM23215.size();
            c15152 = this.f28158;
            if (i >= size) {
                break;
            }
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM23215.get(i);
            if (!interfaceC2386.mo8106()) {
                if (!c15152.m36475()) {
                    c15152.m36468();
                }
                boolean zContains = collection.contains(interfaceC2386.getPath());
                c15152.m36461(interfaceC2386, zContains);
                if (zContains && z && i2 == -1) {
                    i2 = i;
                }
            }
            i++;
        }
        if (c15152.m36475() && !c15152.m36471()) {
            c15152.m36458();
        }
        C3966 c3966 = this.f28159;
        c3966.m12740();
        if (i2 != -1) {
            c3966.m12742(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23176(Collection collection) {
        m23153(collection, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m23230(String str) {
        m23153((Collection) Collections.singleton(str), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23175(ArrayList arrayList) {
        m23153((Collection) arrayList, true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m23153(Collection collection, boolean z) {
        HashSet hashSet = this.f28147;
        hashSet.clear();
        hashSet.addAll(collection);
        this.f28150 = z;
        this.f28166 = !hashSet.isEmpty();
        this.f28146 = false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m23165() {
        return this.f28146;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m23205() {
        this.f28146 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public void m23159() {
        if (this.f28151) {
            C20065 c20065 = this.f28152;
            if (c20065.m46161().isFinishing() || c20065.m46161().isDestroyed()) {
                this.f28151 = false;
            } else {
                if (m23193()) {
                    return;
                }
                m23229();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String, l.۠᩵ܳ, res.Hex] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, long[]] */
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
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m23229() {
        if (m23193()) {
            this.f28151 = true;
            return;
        }
        this.f28151 = false;
        AbstractC7364 abstractC7364 = this.f28157;
        String strM20218 = abstractC7364.m20218();
        ?? r0 = abstractC7364.f24220;
        ?? Decode_J = r0.decode_J(r0);
        int i = this.f28165;
        if (abstractC7364.mo10170()) {
            C14580 c14580 = new C14580(this, abstractC7364, strM20218, Decode_J, i);
            c14580.m8189(f28133);
            c14580.m8197();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m23220(String str) {
        if (m23193()) {
            return;
        }
        AbstractC7364 abstractC7364 = this.f28157;
        if (abstractC7364.mo18801(str)) {
            C21294 c21294 = new C21294(this, abstractC7364);
            c21294.m8189(f28133);
            c21294.m8197();
        }
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void m23201() {
        if (m23193()) {
            return;
        }
        m23139(false, false, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23140(List list, List list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((InterfaceC2386) list.get(i)).equals(list2.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m23195() {
        return this.f28145;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23135(C8614 c8614, C8614 c8615) {
        c8614.m23159();
        c8615.m23159();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7123 m23161() {
        C7123 c7123 = new C7123();
        c7123.f23479 = this.f28157;
        c7123.f23475 = this.f28156;
        c7123.f23478 = this.f28148;
        C22612 c22612 = this.f28139;
        c7123.f23472 = c22612.m50945();
        c7123.f23477 = c22612.m50946();
        c7123.f23473 = this.f28159.m12732();
        c7123.f23476 = this.f28162;
        c7123.f23474 = this.f28153;
        c7123.f23471 = this.f28144;
        c7123.f23469 = this.f28140;
        c7123.f23470 = this.f28138;
        return c7123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23181(C7123 c7123) {
        if (m23193()) {
            return;
        }
        this.f28141.incrementAndGet();
        this.f28157 = c7123.f23479;
        this.f28156 = c7123.f23475;
        this.f28148 = c7123.f23478;
        this.f28162 = c7123.f23476;
        this.f28153 = c7123.f23474;
        this.f28144 = c7123.f23471;
        this.f28140 = c7123.f23469;
        this.f28138 = c7123.f23470;
        C15152 c15152 = this.f28158;
        c15152.m36476();
        if (this.f28153 && c15152.m36475()) {
            c15152.m36458();
        }
        boolean z = c7123.f23472;
        this.f28139.m50942(c7123.f23477, z);
        this.f28166 = false;
        this.f28147.clear();
        this.f28150 = false;
        C3966 c3966 = this.f28159;
        c3966.m12741();
        c3966.m12742(c7123.f23473);
        m23234();
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C2648 m23214() {
        return m23169(true, (Runnable) null);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C2648 m23237() {
        return m23169(false, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2648 m23169(boolean z, Runnable runnable) {
        boolean z2;
        C2648 c2648;
        synchronized (this.f28143) {
            if (m23193()) {
                z2 = false;
            } else {
                if (!this.f28143.isEmpty()) {
                    throw new IllegalStateException();
                }
                z2 = true;
            }
            c2648 = new C2648(this, runnable);
            this.f28143.add(c2648);
        }
        if (z2) {
            final C10105 c10105 = this.f28154;
            C8614 c8614 = c10105.f32373;
            C12060 c12060 = c10105.f32377;
            if (c12060 != null) {
                c12060.cancel();
                c10105.f32377 = null;
            }
            ViewGroup viewGroupM46142 = c8614.f28152.m46142(c8614.f28145);
            c10105.f32375 = viewGroupM46142;
            viewGroupM46142.setAlpha(0.0f);
            c10105.f32375.setVisibility(0);
            c10105.f32375.getChildAt(0).setVisibility(4);
            TextView textView = (TextView) c10105.f32375.getChildAt(2);
            c10105.f32374 = textView;
            textView.setVisibility(4);
            c10105.f32374.setTag(-1);
            final View childAt = c10105.f32375.getChildAt(1);
            childAt.setVisibility(4);
            childAt.setAlpha(0.0f);
            C12060 c12060M30238 = C12060.m30238(c10105.f32375, 0.0f, 0.1f);
            c12060M30238.m30239(200L);
            c10105.f32371 = c12060M30238;
            c12060M30238.m28879();
            C12060 c12060M30239 = C12060.m30238(c10105.f32375, 0.1f, 1.0f);
            c12060M30239.m30239(2500L);
            c10105.f32376 = c12060M30239;
            c12060M30239.m55250(new C0411(c10105));
            c10105.f32376.m28878(500L);
            c10105.f32376.m28871(new AccelerateInterpolator());
            c10105.f32376.m28879();
            if (z) {
                C12060 c12060M302310 = C12060.m30238(c10105.f32375.getChildAt(1), 0.0f, 1.0f);
                c10105.f32372 = c12060M302310;
                c12060M302310.m55250(new C7869(c10105, childAt));
                c10105.f32372.m28878(c.a);
                c10105.f32372.m28879();
                final C24720 c24720M55197 = C24720.m55197();
                childAt.setOnClickListener(new View.OnClickListener() { // from class: l.ܿۨܳ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C10105 c10106 = c10105;
                        c10106.getClass();
                        if (c24720M55197.m55200()) {
                            return;
                        }
                        childAt.setOnClickListener(null);
                        c10106.f32373.m23219();
                    }
                });
            }
        }
        return c2648;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m23219() {
        ArrayList arrayList;
        this.f28151 = false;
        this.f28165++;
        synchronized (this.f28143) {
            arrayList = new ArrayList(this.f28143);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2648.m8775((C2648) it.next());
        }
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    private void m23143() {
        C22612 c22612 = this.f28139;
        boolean zM50945 = c22612.m50945();
        C20065 c20065 = this.f28152;
        if (zM50945) {
            c22612.m50940();
            c20065.m46168();
        }
        if (this.f28153) {
            this.f28153 = false;
            this.f28162 = null;
            this.f28140 = null;
            this.f28138 = null;
            c20065.m46152(this.f28145, false);
            if (this.f28155) {
                c20065.m46172();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m23218() {
        return this.f28153;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23172(int i, Function function) {
        if (!this.f28153) {
            C15152 c15152 = this.f28158;
            if (c15152.m36475()) {
                this.f28140 = this.f28157.m20218();
                this.f28138 = new HashSet();
                for (InterfaceC2386 interfaceC2386 : m23215()) {
                    if (!interfaceC2386.mo8106() && interfaceC2386.isChecked()) {
                        this.f28138.add(interfaceC2386.getPath());
                    }
                }
            } else {
                this.f28140 = null;
                this.f28138 = null;
            }
            this.f28162 = (AbstractC9843) function;
            this.f28153 = true;
            if (i == -1) {
                this.f28144 = null;
            } else {
                this.f28144 = "➤ ".concat(C21576.m49088(i));
            }
            C3966.m12724(200);
            if (c15152.m36475()) {
                c15152.m36458();
            }
            this.f28159.m12741();
            this.f28152.m46177(this.f28145, true);
            m23124();
            return;
        }
        throw new IllegalStateException("Already in paste mode.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.function.Function, l.ۢۗܳ] */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m23189() {
        C20065 c20065 = this.f28152;
        c20065.m46166();
        ?? r1 = this.f28162;
        if (r1 == 0 || ((Boolean) r1.apply(this)).booleanValue()) {
            this.f28153 = false;
            this.f28162 = null;
            this.f28140 = null;
            this.f28138 = null;
            C3966.m12724(200);
            this.f28159.m12741();
            c20065.m46152(this.f28145, true);
            m23124();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m23207() {
        this.f28153 = false;
        this.f28162 = null;
        C3966.m12724(200);
        HashSet hashSet = this.f28138;
        C3966 c3966 = this.f28159;
        if (hashSet != null && C17359.equals(this.f28140, this.f28157.m20218())) {
            m23177((Collection) hashSet, false);
            if (hashSet.isEmpty()) {
                C15152 c15152 = this.f28158;
                if (!c15152.m36475()) {
                    c15152.m36468();
                    c3966.m12740();
                }
            }
        }
        this.f28140 = null;
        this.f28138 = null;
        c3966.m12741();
        this.f28152.m46152(this.f28145, false);
        m23124();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23179(C6178 c6178) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean zM36475 = this.f28158.m36475();
        boolean zMo20209 = this.f28157.mo20209();
        for (InterfaceC2386 interfaceC2386 : C4681.unmodifiableList(this.f28156)) {
            if (zM36475 && interfaceC2386.isChecked()) {
                arrayList.add(interfaceC2386.getName());
            }
            if (interfaceC2386.mo8103()) {
                arrayList2.add(zMo20209 ? interfaceC2386.getPath() : interfaceC2386.getName());
            }
        }
        c6178.writeInt(this.f28159.m12732());
        c6178.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c6178.m17800((String) it.next());
        }
        c6178.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c6178.m17800((String) it2.next());
        }
        C22612 c22612 = this.f28139;
        c6178.m17789(c22612.m50945());
        if (c22612.m50945()) {
            c6178.m17800(c22612.m50946());
        }
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m23216() {
        AbstractC7364 abstractC7364 = this.f28157;
        if (abstractC7364 != null) {
            abstractC7364.f24218 = true;
            if (m23228("local") && this.f28164.m23228("local") && this.f28157.mo20207().equals(this.f28164.f28157.mo20207())) {
                this.f28164.f28157.f24218 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final void m23221() {
        this.f28159.m12744();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m23170(String str, boolean z) {
        String strM49881;
        String strReplaceAll = str.replaceAll("[:\\\\/*?<>\"|]", "_").replaceAll("\\s", " ");
        String str2 = null;
        if (m23228("local")) {
            strM49881 = this.f28157.m20218();
            if (!C14584.m35214(strM49881)) {
                strM49881 = null;
            }
        } else {
            strM49881 = null;
        }
        if (!z && strM49881 == null && this.f28164.m23228("local")) {
            strM49881 = this.f28164.f28157.m20218();
            if (!C14584.m35214(strM49881)) {
                strM49881 = null;
            }
        }
        if (strM49881 == null && m23228("zip")) {
            strM49881 = C14584.m35193(((C15102) this.f28157).m36371(), new String[0]).m49881();
            if (!C14584.m35214(strM49881)) {
                strM49881 = null;
            }
        }
        if (strM49881 == null && m23228("archive")) {
            String strM49882 = C14584.m35193(((C20766) this.f28157).m47478(), new String[0]).m49881();
            if (C14584.m35214(strM49882)) {
                str2 = strM49882;
            }
        } else {
            str2 = strM49881;
        }
        return (str2 == null ? C6382.m18134() : C14584.m35193(str2, new String[0])).m49876(strReplaceAll);
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void m23210() {
        C20065 c20065 = this.f28152;
        if (c20065.m46140() != this.f28145) {
            c20065.m46141();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m23190() {
        MessageDigest messageDigestM36183 = C15022.m36183();
        AbstractC7364 abstractC7364 = this.f28157;
        List<InterfaceC2386> listM23215 = m23215();
        boolean zM36475 = this.f28158.m36475();
        C15022.m36176(messageDigestM36183, abstractC7364.mo10164() + "|" + abstractC7364.m20218() + "|" + zM36475 + "|" + listM23215.size());
        messageDigestM36183.update((byte) -1);
        for (InterfaceC2386 interfaceC2386 : listM23215) {
            C15022.m36176(messageDigestM36183, interfaceC2386.getName());
            messageDigestM36183.update((byte) -1);
            C15022.m36176(messageDigestM36183, String.valueOf(interfaceC2386.isDirectory()));
            messageDigestM36183.update((byte) -1);
            C15022.m36176(messageDigestM36183, String.valueOf(interfaceC2386.mo8107()));
            messageDigestM36183.update((byte) -1);
            C15022.m36176(messageDigestM36183, String.valueOf(interfaceC2386.mo8113()));
            messageDigestM36183.update((byte) -1);
            C15022.m36176(messageDigestM36183, String.valueOf(zM36475 && interfaceC2386.isChecked()));
            messageDigestM36183.update((byte) -1);
        }
        return C15022.m36182(messageDigestM36183.digest());
    }
}
