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
import com.umeng.commonsdk.statistics.UMErrorCode;
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

/* JADX INFO: renamed from: l.ۨۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final class C11545 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final Bitmap f38793;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static C22959 f38794;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static Object f38795;

    /* JADX INFO: renamed from: ܺ᩵ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f38796;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f38797;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f38798;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22959 f38799;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public String f38800;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4674 f38802;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f38804;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f38805;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public List f38806;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f38807;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C15073 f38808;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final C6936 f38809;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f38810;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6605 f38811;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f38812;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f38813;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public String f38814;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f38815;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11462 f38817;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f38818;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashSet f38819;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22959 f38820;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f38821;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f38822;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11545 f38823;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public List f38824;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38825;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C5900 f38826;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f38827;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C2994 f38803 = new C2994(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f38801 = new HashSet();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f38816 = new AtomicInteger();

    @Override // android.widget.AdapterView.OnItemClickListener
    public native void onItemClick(AdapterView adapterView, View view, int i, long j);

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public native void m28823();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28738(C11545 c11545, C4405 c4405, String str) {
        c11545.getClass();
        c11545.m28729(Integer.valueOf(c4405.f15684), str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28753(C11545 c11545, C4405 c4405, String str) {
        c11545.getClass();
        c11545.m28729(Integer.valueOf(c4405.f15684), str);
    }

    public C11545(C6936 c6936, C6606 c6606, AbstractC11462 abstractC11462, boolean z, C17367 c17367) {
        List list = Collections.EMPTY_LIST;
        this.f38806 = list;
        this.f38827 = list;
        this.f38807 = "";
        this.f38821 = new WeakReference(null);
        this.f38824 = list;
        this.f38822 = new ArrayList();
        this.f38799 = C22959.m50798();
        this.f38820 = C22959.m50801();
        this.f38805 = new HashSet();
        this.f38809 = c6936;
        this.f38810 = z;
        this.f38817 = abstractC11462;
        this.f38826 = new C5900(this, c6606);
        C15073 c15073 = new C15073(this);
        this.f38808 = c15073;
        this.f38811 = new C6605(this);
        c15073.m36139(new C13330(this, c6936));
        c6606.setOnItemClickListener(this);
        c6606.setOnItemLongClickListener(this);
        c6606.m17932(new View.OnTouchListener() { // from class: l.ۘۘ᩹
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C11545.m28735(this.f13499, motionEvent);
                return false;
            }
        });
        if (c17367 != null) {
            final int i = c17367.readInt();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            int i2 = c17367.readInt();
            for (int i3 = 0; i3 < i2; i3++) {
                hashSet.add(c17367.m40458());
            }
            int i4 = c17367.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                hashSet2.add(c17367.m40458());
            }
            if (c17367.m40461()) {
                this.f38811.m17912(true);
                this.f38811.m17909(c17367.m40458());
                if (c6936.m18640() == z) {
                    this.f38809.m18658();
                }
            }
            final boolean zMo28638 = this.f38817.mo28638();
            m28741(false, new Runnable() { // from class: l.ۜۘ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C11545.m28734(this.f21975, i, hashSet, hashSet2, zMo28638);
                }
            }, false);
            return;
        }
        m28741(false, (Runnable) null, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28739(C11545 c11545, C6936 c6936) {
        if (c11545.f38818) {
            c6936.m18654();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28734(C11545 c11545, int i, HashSet hashSet, HashSet hashSet2, boolean z) {
        C5900 c5900 = c11545.f38826;
        c5900.m16167(i);
        boolean z2 = false;
        boolean z3 = false;
        for (InterfaceC2557 interfaceC2557 : c11545.f38827) {
            if (hashSet.contains(interfaceC2557.getName())) {
                interfaceC2557.setChecked(true);
                z2 = true;
                z3 = true;
            }
            if (hashSet2.contains(z ? interfaceC2557.getPath() : interfaceC2557.getName())) {
                interfaceC2557.mo7977(true);
                z3 = true;
            }
        }
        if (z2) {
            c11545.f38808.m36150();
        }
        if (z3) {
            c5900.m16166();
        }
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final void m28765() {
        if (m28800()) {
            return;
        }
        m28741(true, (Runnable) null, false);
        if (m28814("local")) {
            C4183.m11826(this.f38809.m18638(), this.f38817.m28640());
        }
    }

    static {
        ApplicationC6132.m17119(109);
        f38796 = new short[]{6441, -12434, -12443, -12446, -12510, -12447, -12424, -12510, -12420, -12448, -12423, -12417, 2984, 17370, 17369, 17365, 17367, 17370, 6871, -24080, -24133, -24130, -24149, -24130};
        f38797 = Executors.newFixedThreadPool(2);
        f38794 = C22959.m50799(500);
        f38793 = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_4444);
        f38798 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28741(boolean z, Runnable runnable, boolean z2) {
        if (this.f38825 && this.f38818) {
            this.f38809.m18655();
        }
        C16401 c16401 = new C16401(this, this.f38817, z, z2, runnable);
        c16401.m10244(f38797);
        c16401.m10243();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final void m28825() {
        int i = 0;
        int i2 = 0;
        for (InterfaceC2557 interfaceC2557 : m28829()) {
            if (!interfaceC2557.mo7980()) {
                if (interfaceC2557.mo7985()) {
                    i2++;
                } else {
                    i++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Resources resourcesM39279 = C16737.m39279();
        sb.append(resourcesM39279.getQuantityString(R.plurals.MT_Protector, i, Integer.valueOf(i)));
        sb.append(EnumC19730.f63352);
        sb.append(resourcesM39279.getQuantityString(R.plurals.MT_Protector, i2, Integer.valueOf(i2)));
        C15073 c15073 = this.f38808;
        if (c15073.m36132()) {
            sb.append(EnumC19730.f63352);
            sb.append(resourcesM39279.getString(R.string.MT_Protector, Integer.valueOf(c15073.m36143())));
        }
        this.f38807 = sb.toString();
        m28745();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28731(List list, boolean z) {
        HashSet hashSet;
        HashSet hashSet2;
        C15073 c15073 = this.f38808;
        if (!c15073.m36132()) {
            hashSet = null;
        } else if (z) {
            hashSet = new HashSet();
            for (InterfaceC2557 interfaceC2557 : this.f38806) {
                if (interfaceC2557.isChecked()) {
                    hashSet.add(interfaceC2557.getPath());
                }
            }
        } else {
            c15073.m36134();
            hashSet = null;
        }
        final int iIncrementAndGet = this.f38816.incrementAndGet();
        C6605 c6605 = this.f38811;
        List listM17907 = (!c6605.m17913() || c6605.m17914().isEmpty()) ? list : C6605.m17907(c6605.m17914(), list);
        this.f38806 = list;
        this.f38827 = listM17907;
        if (this.f38812) {
            int size = list.size();
            int i = 0;
            int i2 = 0;
            final int i3 = -1;
            while (true) {
                hashSet2 = this.f38801;
                if (i >= size) {
                    break;
                }
                InterfaceC2557 interfaceC2558 = (InterfaceC2557) list.get(i);
                if (!interfaceC2558.mo7980()) {
                    if (hashSet2.contains(this.f38815 ? interfaceC2558.getPath() : interfaceC2558.getName())) {
                        i2++;
                        interfaceC2558.mo7977(true);
                        if (i3 == -1) {
                            i3 = i;
                        }
                    } else {
                        interfaceC2558.mo7977(false);
                    }
                }
                i++;
            }
            if (i2 > 0 && listM17907 != list) {
                int size2 = listM17907.size();
                int i4 = 0;
                int i5 = -1;
                for (int i6 = 0; i6 < size2; i6++) {
                    InterfaceC2557 interfaceC2559 = (InterfaceC2557) listM17907.get(i6);
                    if (!interfaceC2559.mo7980() && interfaceC2559.mo7983()) {
                        i4++;
                        if (i5 == -1) {
                            i5 = i6;
                        }
                    }
                }
                if (i2 == i4) {
                    i3 = i5;
                } else {
                    c6605.m17908();
                    this.f38827 = list;
                }
            }
            final boolean z2 = this.f38813;
            if (z2) {
                this.f38813 = false;
            }
            this.f38812 = false;
            hashSet2.clear();
            this.f38815 = false;
            if (i3 != -1) {
                C16737.m39273(new Runnable() { // from class: l.ۚۘ᩹
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11545.m28732(this.f17805, iIncrementAndGet, i3, z2);
                    }
                });
            }
        }
        if (hashSet != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC2557 interfaceC25510 = (InterfaceC2557) it.next();
                if (!interfaceC25510.mo7980()) {
                    interfaceC25510.setChecked(hashSet.contains(interfaceC25510.getPath()));
                }
            }
            c15073.m36150();
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC2557 interfaceC25511 = (InterfaceC2557) it2.next();
                if (!interfaceC25511.mo7980()) {
                    interfaceC25511.setChecked(false);
                }
            }
            if (c15073.m36132()) {
                c15073.m36134();
            }
        }
        m28825();
        c15073.m36146();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۤۘ᩹] */
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
    public static void m28732(final C11545 c11545, final int i, int i2, boolean z) {
        if (i != c11545.f38816.get()) {
            return;
        }
        c11545.f38826.m16161(i2, (C10051) new BooleanSupplier() { // from class: l.ۤۘ᩹
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C11545.m28743(this.f34340, i);
            }
        });
        if (!z || c11545.f38808.m36132()) {
            return;
        }
        new RunnableC12168(c11545, i, i2).run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m28743(C11545 c11545, int i) {
        return i == c11545.f38816.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28779(List list) {
        this.f38816.incrementAndGet();
        this.f38827 = list;
        m28825();
        this.f38808.m36146();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m28829() {
        if (!m28756()) {
            return C2431.f9738;
        }
        return C0561.unmodifiableList(this.f38827);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m28769(int i) {
        return (InterfaceC2557) this.f38827.get(i);
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28756() {
        File parentFile = null;
        String name = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -1105410394;
        int i7 = C2642.f10294;
        int i8 = C0278.f1572;
        int iM11306 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i7;
        int i9 = ((iM11306 ^ i8) * 3199) ^ 1872324128;
        int i10 = -2136951185;
        while (true) {
            i6 = ((((i6 ^ i8) * 28751) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -2065407791:
                case 688918925:
                    i2 = s * s;
                    i3 = 16941456;
                    if (C2477.m7593() >= 0) {
                        iM11306 = (i8 - C19806.m45029("ܶۜ")) * 31;
                        i9 = ((iM11306 ^ i7) * 5989) ^ (-23873735);
                        i10 = 2108580312;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۨ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 5187) ^ (-677140);
                        i10 = 1509743998;
                    }
                    break;
                case -1841783953:
                case -834215673:
                    if (C1460.m5058(name, C2477.m7604(sArr2, i5, 11, i4))) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۫") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-24405)) ^ (-730627687);
                        i10 = -432030503;
                    } else {
                        iM11306 = (C19806.m45029("᩹ᩴ") ^ i8) * 63;
                        i9 = ((iM11306 ^ i7) * (-11173)) ^ 1202275172;
                        i10 = -1527276068;
                    }
                    break;
                case -1749673027:
                case 627905264:
                    i = s * 8232;
                    if (C0671.m3008() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺֨") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-1825)) ^ 125017269;
                        i10 = 1888116367;
                    } else {
                        iM11306 = C19806.m45029("᩻ܰ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 20621) ^ (-828646924);
                        i10 = 878980863;
                    }
                    break;
                case -1699872066:
                case -767887387:
                    i5 = 1;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("ۚ۟") ^ i7) * (-21);
                        i9 = ((iM11306 ^ i8) * 22385) ^ 698133213;
                        i10 = -650489712;
                    } else {
                        iM11306 = (C19806.m45029("ܶۢ") ^ i7) * (-127);
                        i9 = ((iM11306 ^ i8) * 27095) ^ (-1257080241);
                        i10 = -1007293895;
                    }
                    break;
                case -1687597224:
                case -1245552714:
                    return false;
                case -1672362176:
                case -227219604:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (i7 - C19806.m45029("۬᩸")) * 127;
                        i9 = ((iM11306 ^ i8) * 8963) ^ 1960033492;
                        i10 = 2034915057;
                    } else {
                        iM11306 = (C19806.m45029("ۘۡ") + i8) * (-121);
                        i9 = ((iM11306 ^ i7) * (-20303)) ^ 1908136265;
                        i10 = 1070118146;
                    }
                    break;
                case -1639693299:
                case -932847045:
                    name = parentFile.getName();
                    sArr2 = f38796;
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺֨") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-1825)) ^ 125017269;
                        i10 = 1888116367;
                    } else {
                        iM11306 = (C19806.m45029("ۘ᩷") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM11306 ^ i8) * 1301) ^ 1650861931;
                        i10 = 780104873;
                    }
                    break;
                case -1623656771:
                case 1535017558:
                    sArr = f38796;
                    c = 0;
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("۟᩵") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-13905)) ^ 1163020873;
                        i10 = -2083892724;
                    } else {
                        iM11306 = (i7 - C19806.m45029("۬᩸")) * 127;
                        i9 = ((iM11306 ^ i8) * 8963) ^ 1960033492;
                        i10 = 2034915057;
                    }
                    break;
                case -1584737129:
                case 1029350828:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("ܶۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-20483)) ^ (-1660704741);
                        i10 = 1781468363;
                    } else {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("᩻ۜ")) * 67;
                        i9 = ((iM11306 ^ i7) * (-11717)) ^ 1417860033;
                        i10 = 1732964045;
                    }
                    break;
                case -1366344133:
                case -313199376:
                    i4 = 53004;
                    iM11306 = (i7 - C19806.m45029("ۜۘ")) * (-53);
                    i9 = ((iM11306 ^ i8) * 11107) ^ (-1646922603);
                    i10 = 1591837384;
                    break;
                case -1325297659:
                case 1172603146:
                    C3286.m9798();
                    C3577.m10565();
                    return false;
                case -1278093904:
                case 706519138:
                    parentFile = C16737.m39285().getParentFile();
                    if (parentFile != null) {
                        iM11306 = C19806.m45029("ᩴᩴ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 25483) ^ 1281125833;
                        i10 = -720261156;
                    } else {
                        iM11306 = (C19806.m45029("᩹ᩴ") ^ i8) * 63;
                        i9 = ((iM11306 ^ i7) * (-11173)) ^ 1202275172;
                        i10 = -1527276068;
                    }
                    break;
                case -1186804889:
                case -320609593:
                    C2124.m6673();
                    iM11306 = (C19806.m45029("ۚ۟") ^ i7) * (-21);
                    i9 = ((iM11306 ^ i8) * 22385) ^ 698133213;
                    i10 = -650489712;
                    break;
                case -899234479:
                case 765421586:
                    if (C0526.f2219) {
                        iM11306 = (i7 - C19806.m45029("۬᩸")) * 127;
                        i9 = ((iM11306 ^ i8) * 8963) ^ 1960033492;
                        i10 = 2034915057;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ᩸") + i7) * (-25);
                        i9 = ((iM11306 ^ i8) * 4205) ^ 2031032122;
                        i10 = -1371948522;
                    }
                    break;
                case -771248449:
                case 1717765094:
                    s = sArr[c];
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ܶۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-20483)) ^ (-1660704741);
                        i10 = 1781468363;
                    } else {
                        iM11306 = (C19806.m45029("ۜ۟") ^ i7) * 59;
                        i9 = ((iM11306 ^ i8) * (-9659)) ^ 1153823641;
                        i10 = -546808290;
                    }
                    break;
                case -751547331:
                case 568355204:
                    i4 = 9476;
                    iM11306 = (i7 - C19806.m45029("ۜۘ")) * (-53);
                    i9 = ((iM11306 ^ i8) * 11107) ^ (-1646922603);
                    i10 = 1591837384;
                    break;
                case -723494109:
                case -341177112:
                    if (!C3286.f12186) {
                        iM11306 = (C19806.m45029("ۚ۟") ^ i7) * (-21);
                        i9 = ((iM11306 ^ i8) * 22385) ^ 698133213;
                        i10 = -650489712;
                    } else {
                        iM11306 = (i8 - C19806.m45029("ܶۜ")) * 31;
                        i9 = ((iM11306 ^ i7) * 5989) ^ (-23873735);
                        i10 = 2108580312;
                    }
                    break;
                case -103416543:
                case 1181171727:
                    if (i - (i2 + i3) <= 0) {
                        iM11306 = (C19806.m45029("ܺܺ") + i8) * (-9);
                        i9 = ((iM11306 ^ i7) * (-29637)) ^ (-1775475982);
                        i10 = 463221969;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۖܿ")) * (-125);
                        i9 = ((iM11306 ^ i8) * (-19711)) ^ (-715606419);
                        i10 = -1335870153;
                    }
                    break;
                case -79142211:
                case 425028078:
                    return true;
                case 1076432559:
                case 1195892580:
                    if (C0216.f1393 != 0) {
                        iM11306 = (C19806.m45029("ۚ۟") ^ i7) * (-21);
                        i9 = ((iM11306 ^ i8) * 22385) ^ 698133213;
                        i10 = -650489712;
                    } else {
                        iM11306 = C19806.m45029("۠᩷") ^ i8;
                        i9 = ((iM11306 ^ i7) * 13573) ^ (-1794723127);
                        i10 = 539838812;
                    }
                    break;
                case 1863458523:
                case 2083549955:
                    C2704.m8255();
                    if (C3722.m10894() <= 0) {
                        iM11306 = C19806.m45029("ܶۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-20483)) ^ (-1660704741);
                        i10 = 1781468363;
                    } else {
                        iM11306 = (C19806.m45029("ۚ۟") ^ i7) * (-21);
                        i9 = ((iM11306 ^ i8) * 22385) ^ 698133213;
                        i10 = -650489712;
                    }
                    break;
                default:
                    C3722.m10894();
                    if (!C1377.f5749) {
                        iM11306 = (i8 - C19806.m45029("ܶۜ")) * 31;
                        i9 = ((iM11306 ^ i7) * 5989) ^ (-23873735);
                        i10 = 2108580312;
                    } else {
                        iM11306 = (i7 - C19806.m45029("۬᩸")) * 127;
                        i9 = ((iM11306 ^ i8) * 8963) ^ 1960033492;
                        i10 = 2034915057;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m28795() {
        return C0561.unmodifiableList(this.f38806);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28786(C11545 c11545) {
        this.f38823 = c11545;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m28764() {
        return this.f38817.f38589.m33197();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m28805() {
        AbstractC11462 abstractC11462 = this.f38817;
        return abstractC11462.f38589.m33193() || abstractC11462.m28632() != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC11462 m28817() {
        return this.f38817;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 m28827() {
        return this.f38817.mo13029();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m28794() {
        return this.f38817.mo28638();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28804(AbstractC11462 abstractC11462) {
        AbstractC11462 abstractC11463 = this.f38817;
        abstractC11463.f38589.f44775.put(abstractC11463.m28629(), Integer.valueOf(this.f38826.m16157()));
        this.f38817 = abstractC11462;
        m28748();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28783(C9183 c9183) {
        this.f38821 = new WeakReference(c9183);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28813(AbstractC11462 abstractC11462) {
        m28804(abstractC11462);
        if (abstractC11462 != this.f38821.get()) {
            m28741(false, (Runnable) new RunnableC14990(0, this), true);
        } else {
            this.f38821.clear();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28752(C11545 c11545) {
        AbstractC11462 abstractC11462 = c11545.f38817;
        Integer num = (Integer) abstractC11462.f38589.f44775.getOrDefault(abstractC11462.m28629(), null);
        c11545.f38826.m16167(num == null ? 0 : num.intValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28781(InterfaceC2288 interfaceC2288, Runnable runnable) {
        C6936 c6936 = this.f38809;
        c6936.getClass();
        C22459 c22459 = new C22459(c6936, this, interfaceC2288, runnable);
        c22459.m10244(f38797);
        c22459.m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28780(InterfaceC2288 interfaceC2288) {
        C6936 c6936 = this.f38809;
        c6936.getClass();
        C22459 c22459 = new C22459(c6936, this, interfaceC2288, null);
        c22459.m10244(f38797);
        c22459.m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28787(AbstractC20745 abstractC20745) {
        this.f38823 = this.f38823;
        m28831();
        this.f38823.m28831();
        AbstractC20745 abstractC20745M46711 = abstractC20745.m46711();
        if (m28814("local") && C5553.m15313(this.f38817.m28629(), new String[0]).equals(abstractC20745M46711)) {
            m28763(abstractC20745.getName());
            return;
        }
        this.f38823.m28763(abstractC20745.getName());
        if (this.f38823.m28814("local") && C5553.m15313(this.f38823.f38817.m28629(), new String[0]).equals(abstractC20745M46711)) {
            return;
        }
        this.f38823.m28812(abstractC20745M46711.mo33986(), true);
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28803(String str) {
        C11545 c11545 = this.f38823;
        String strM28608 = AbstractC11462.m28608(str);
        AbstractC11462 abstractC11462 = this.f38817;
        if (!(abstractC11462 instanceof C11672 ? abstractC11462.m28629().equals(strM28608) : false)) {
            c11545.getClass();
            String strM28609 = AbstractC11462.m28608(str);
            AbstractC11462 abstractC11463 = c11545.f38817;
            if (abstractC11463 instanceof C11672 ? abstractC11463.m28629().equals(strM28609) : false) {
                c11545.m28832();
                HashSet hashSet = this.f38801;
                if (!hashSet.isEmpty()) {
                    c11545.m28751(hashSet, this.f38815);
                    if (this.f38813) {
                        c11545.f38813 = true;
                        this.f38813 = false;
                    }
                    hashSet.clear();
                    this.f38815 = false;
                }
                c11545.m28812(str, true);
                return;
            }
        }
        m28812(str, true);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C11545 m28833() {
        return this.f38823;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m28798() {
        return this.f38817.m28629();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m28799() {
        return this.f38817.m28640();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m28826() {
        if (this.f38817.mo28638()) {
            return C16737.m39288(R.string.MT_Protector);
        }
        String strM28629 = this.f38817.m28629();
        if (strM28629.length() == 1) {
            return strM28629;
        }
        int iLastIndexOf = strM28629.lastIndexOf(47, strM28629.length() - 2);
        return iLastIndexOf != -1 ? C20630.m46498(1, iLastIndexOf + 1, strM28629) : C20630.m46498(1, 0, strM28629);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m28801() {
        return this.f38817.mo28637();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28788(boolean z) {
        this.f38818 = z;
        m28745();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m28835() {
        return this.f38818;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m28800() {
        boolean z;
        synchronized (this.f38805) {
            z = !this.f38805.isEmpty();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public void m28745() {
        if (this.f38818) {
            String strMo13043 = this.f38817.mo13043();
            C6936 c6936 = this.f38809;
            c6936.m18648(strMo13043);
            if (!this.f38825 || TextUtils.isEmpty(this.f38800)) {
                String strMo28635 = this.f38817.mo28635(this);
                if (strMo28635 != null) {
                    c6936.m18626((CharSequence) C1694.m5622(new StringBuilder(), this.f38807, EnumC19730.f63352, strMo28635));
                } else {
                    c6936.m18626((CharSequence) this.f38807);
                }
            } else {
                c6936.m18626((CharSequence) this.f38800);
            }
            c6936.m18654();
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m28759() {
        return this.f38817.mo13043();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28774(SubMenu subMenu) {
        if (m28800()) {
            return;
        }
        if (this.f38825) {
            this.f38824 = Collections.singletonList(AbstractC11462.f38579);
        } else {
            this.f38824 = this.f38817.mo13046();
        }
        ArrayList arrayList = this.f38822;
        arrayList.clear();
        int size = this.f38824.size();
        for (int i = 0; i < size; i++) {
            AbstractC11026 abstractC11026 = (AbstractC11026) this.f38824.get(i);
            if (abstractC11026.mo6292()) {
                List<AbstractC11026> listM27807 = abstractC11026.m27807();
                if (listM27807.isEmpty()) {
                    MenuItem icon = subMenu.add(0, i | 2113929216, 0, abstractC11026.m27806()).setIcon(abstractC11026.m27804());
                    if (abstractC11026.mo6053()) {
                        icon.setCheckable(true).setChecked(abstractC11026.mo6054());
                    }
                    if (!abstractC11026.mo9747(this)) {
                        icon.setEnabled(false);
                    }
                } else {
                    SubMenu icon2 = subMenu.addSubMenu(0, i | 2113929216, 0, abstractC11026.m27806()).setIcon(abstractC11026.m27804());
                    if (!abstractC11026.mo9747(this)) {
                        icon2.getItem().setEnabled(false);
                    }
                    for (AbstractC11026 abstractC11027 : listM27807) {
                        int size2 = arrayList.size();
                        arrayList.add(abstractC11027);
                        MenuItem icon3 = icon2.add(0, size2 | 2097152000, 0, abstractC11027.m27806()).setIcon(abstractC11027.m27804());
                        if (abstractC11027.mo6053()) {
                            icon3.setCheckable(true).setChecked(abstractC11027.mo6054());
                        }
                        if (!abstractC11027.mo9747(this)) {
                            icon3.setEnabled(false);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28811(int i) {
        int i2 = i >>> 24;
        int i3 = i & 16777215;
        if (i2 == 126) {
            if (i3 < this.f38824.size()) {
                ((AbstractC11026) this.f38824.get(i3)).mo2267(this);
            }
        } else if (i2 == 125) {
            ArrayList arrayList = this.f38822;
            if (i3 < arrayList.size()) {
                ((AbstractC11026) arrayList.get(i3)).mo2267(this);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28812(String str, boolean z) {
        AbstractC11462 abstractC11462;
        if (m28800()) {
            RunnableC19223 runnableC19223 = new RunnableC19223(this, this.f38812, this.f38813, this.f38815, new ArrayList(this.f38801), str, z);
            if (m28800()) {
                C16737.m39274(new RunnableC7228(0, this, runnableC19223), 100L);
                return;
            } else {
                runnableC19223.run();
                return;
            }
        }
        if (z) {
            AbstractC11462 abstractC11463 = this.f38817;
            if (abstractC11463 instanceof C11672) {
                m28757(str);
                return;
            }
            int iM28632 = abstractC11463.m28632();
            C14638<AbstractC11462> c14638M18621 = this.f38809.m18621();
            c14638M18621.m35141();
            AbstractC11462 abstractC11464 = null;
            if (iM28632 != 0) {
                try {
                    abstractC11462 = null;
                    for (AbstractC11462 abstractC11465 : c14638M18621) {
                        if (abstractC11465.m28617() == iM28632 && (abstractC11465 instanceof C11672)) {
                            abstractC11464 = abstractC11465;
                            break;
                        } else if (abstractC11462 == null && (abstractC11465 instanceof C11672)) {
                            abstractC11462 = abstractC11465;
                        }
                    }
                } catch (Throwable th) {
                    c14638M18621.m35142();
                    throw th;
                }
            } else {
                abstractC11462 = null;
            }
            if (abstractC11464 == null) {
                if (abstractC11462 == null) {
                    throw new RuntimeException();
                }
                abstractC11464 = abstractC11462;
            }
            c14638M18621.remove(abstractC11464);
            if (abstractC11463.mo28636()) {
                c14638M18621.add(abstractC11463);
                abstractC11463.f38589.f44775.put(abstractC11463.m28629(), Integer.valueOf(this.f38826.m16157()));
            } else {
                if (abstractC11463.m28632() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                abstractC11463.m28627();
            }
            c14638M18621.m35142();
            this.f38817 = abstractC11464;
            abstractC11464.mo13038(this);
            m28748();
            m28757(str);
            C23561.m51925();
            return;
        }
        m28757(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28740(C11545 c11545, boolean z, boolean z2, boolean z3, ArrayList arrayList, String str, boolean z4) {
        c11545.f38812 = z;
        c11545.f38813 = z2;
        c11545.f38815 = z3;
        HashSet hashSet = c11545.f38801;
        hashSet.clear();
        hashSet.addAll(arrayList);
        c11545.m28812(str, z4);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m28757(String str) {
        String strM28608 = AbstractC11462.m28608(str);
        if (!this.f38817.m28629().equals(strM28608)) {
            AbstractC11462 abstractC11462 = this.f38817;
            abstractC11462.f38589.f44775.put(abstractC11462.m28629(), Integer.valueOf(this.f38826.m16157()));
            this.f38817.f38589.m33195(m28747());
            this.f38817.mo28628(strM28608);
        }
        C6605 c6605 = this.f38811;
        boolean zM17913 = c6605.m17913();
        C6936 c6936 = this.f38809;
        if (zM17913) {
            c6605.m17908();
            c6936.m18660();
        }
        m28741(false, this.f38812 ? null : new Runnable() { // from class: l.᩹ۘ᩹
            @Override // java.lang.Runnable
            public final void run() {
                this.f71449.f38826.m16167(0);
            }
        }, true);
        if (m28814("local")) {
            C4183.m11826(c6936.m18638(), this.f38817.m28640());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28735(C11545 c11545, MotionEvent motionEvent) {
        if (!f38798 && motionEvent.getActionMasked() == 0 && c11545.f38809.m18638().m31024()) {
            f38798 = true;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int iM47975;
        InterfaceC2557 interfaceC2557;
        InterfaceC2557 interfaceC2558;
        if (!m28800() && !this.f38825 && i <= this.f38827.size()) {
            this.f38804 = i;
            if (!((InterfaceC2557) this.f38827.get(i)).mo7980()) {
                final int i2 = this.f38816.get();
                final C21422 c21422 = new C21422(this);
                AbstractC11462 abstractC11462 = this.f38817;
                abstractC11462.getClass();
                C22501 c22501 = null;
                if (!c21422.m47974("trash") && c21422.m47967() && (iM47975 = c21422.m47975()) <= 2) {
                    if (iM47975 == 2) {
                        List listM47979 = c21422.m47979();
                        interfaceC2557 = (InterfaceC2557) listM47979.get(0);
                        interfaceC2558 = (InterfaceC2557) listM47979.get(1);
                    } else {
                        C11545 c11545M47970 = c21422.m47970();
                        if (!c11545M47970.m28814("trash") && c11545M47970.f38808.m36132() && c11545M47970.m28828() == 1) {
                            InterfaceC2557 interfaceC2557M47981 = c21422.m47981();
                            InterfaceC2557 interfaceC2557M28797 = c11545M47970.m28797();
                            interfaceC2557 = interfaceC2557M47981;
                            interfaceC2558 = interfaceC2557M28797;
                        }
                    }
                    if (interfaceC2557.isDirectory() && interfaceC2558.isDirectory()) {
                        c22501 = new C22501(-1L, -1L, "folder", "folder");
                    } else if (interfaceC2557.mo7985() && interfaceC2558.mo7985()) {
                        String lowerCase = interfaceC2557.getName().toLowerCase();
                        String lowerCase2 = interfaceC2558.getName().toLowerCase();
                        if (lowerCase.endsWith(".bak")) {
                            lowerCase = C20630.m46498(4, 0, lowerCase);
                        }
                        if (lowerCase2.endsWith(".bak")) {
                            lowerCase2 = C20630.m46498(4, 0, lowerCase2);
                        }
                        String strM46686 = AbstractC20745.m46686(lowerCase);
                        String strM46687 = AbstractC20745.m46686(lowerCase2);
                        if (!strM46686.isEmpty()) {
                            strM46686 = strM46686.substring(1);
                        }
                        String str = strM46686;
                        if (!strM46687.isEmpty()) {
                            strM46687 = strM46687.substring(1);
                        }
                        c22501 = new C22501(interfaceC2557.getSize(), interfaceC2558.getSize(), str, strM46687);
                    }
                }
                abstractC11462.f38585 = c22501;
                final ArrayList arrayList = new ArrayList(10);
                for (int i3 : DialogInterfaceOnDismissListenerC20991.m47153()) {
                    switch (i3) {
                        case 0:
                            arrayList.add(abstractC11462.mo28620(c21422));
                            break;
                        case 1:
                            arrayList.add(abstractC11462.mo23634(c21422));
                            break;
                        case 2:
                            arrayList.add(abstractC11462.mo23638());
                            break;
                        case 3:
                            arrayList.add(abstractC11462.mo23637());
                            break;
                        case 4:
                            arrayList.add(abstractC11462.mo23636());
                            break;
                        case 5:
                            arrayList.add(abstractC11462.mo28642());
                            break;
                        case 6:
                            arrayList.add(abstractC11462.mo13044());
                            break;
                        case 7:
                            arrayList.add(abstractC11462.mo28630());
                            break;
                        case 8:
                            arrayList.add(abstractC11462.mo28641());
                            break;
                        case 9:
                            arrayList.add(abstractC11462.mo23631());
                            break;
                    }
                }
                abstractC11462.mo28626(c21422, arrayList);
                if (!arrayList.isEmpty()) {
                    Main mainM18638 = this.f38809.m18638();
                    if (f38798 || !mainM18638.m31024()) {
                        ViewOnClickListenerC16028 viewOnClickListenerC16028 = new ViewOnClickListenerC16028(mainM18638, mainM18638.m133());
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC4674 abstractC4674 = (AbstractC4674) arrayList.get(i4);
                            String strM39288 = C16737.m39288(abstractC4674.m12942());
                            if (abstractC4674.m12947()) {
                                strM39288 = this.f38810 ? strM39288.concat(" ->") : "<- ".concat(strM39288);
                            }
                            viewOnClickListenerC16028.m38014(strM39288, i4, abstractC4674.m12948(), abstractC4674.m12945(c21422), abstractC4674.m12949(c21422));
                        }
                        viewOnClickListenerC16028.m38016(new InterfaceC20966() { // from class: l.᩸ۘ᩹
                            @Override // l.InterfaceC20966
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo5519(int i5) {
                                C11545.m28733(this.f69451, i2, arrayList, c21422, i5);
                            }
                        });
                        viewOnClickListenerC16028.m38015(new C17811(this, i2, arrayList, c21422));
                        viewOnClickListenerC16028.m38012();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28733(C11545 c11545, int i, ArrayList arrayList, C21422 c21422, int i2) {
        if (i == c11545.f38816.get()) {
            ((AbstractC4674) arrayList.get(i2)).m12946(c21422, false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m28755(C11545 c11545, int i, ArrayList arrayList, C21422 c21422, int i2) {
        if (i == c11545.f38816.get()) {
            return ((AbstractC4674) arrayList.get(i2)).m12946(c21422, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28789() {
        final String strM28629;
        final String strM18172;
        if (!m28800()) {
            if (this.f38808.m36132()) {
                m28831();
                return true;
            }
            C6605 c6605 = this.f38811;
            boolean zM17913 = c6605.m17913();
            C6936 c6936 = this.f38809;
            if (zM17913) {
                c6605.m17912(false);
                c6936.m18660();
                return true;
            }
            if (this.f38817.mo28638()) {
                strM18172 = this.f38817.mo28639();
                strM28629 = null;
            } else {
                strM28629 = this.f38817.m28629();
                strM18172 = C6730.m18172(strM28629);
            }
            if (strM18172 == null) {
                if (this.f38817.m28632() == 0) {
                    return false;
                }
                AbstractC11462 abstractC11462 = this.f38817;
                abstractC11462.getClass();
                if (abstractC11462 instanceof C9183) {
                    if (this.f38820.m50802()) {
                        C15829.m37611(this.f38817.mo23635());
                        return true;
                    }
                    C15829.m37616();
                }
                this.f38826.m16162(this.f38817.m28634());
                c6936.m18630(this);
                return true;
            }
            if (!this.f38799.m50803()) {
                this.f38817.f38589.m33195(m28747());
                this.f38817.mo28628(strM18172);
                c6605.m17908();
                m28741(false, new Runnable() { // from class: l.ۡۘ᩹
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11545.m28736(this.f29799, strM18172, strM28629);
                    }
                }, true);
                if (m28814("local")) {
                    C4183.m11826(c6936.m18638(), this.f38817.m28640());
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28736(C11545 c11545, String str, String str2) {
        c11545.m28729((Integer) c11545.f38817.f38589.f44775.getOrDefault(str, null), str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28810() {
        if (m28800() || !m28805()) {
            return;
        }
        if (!this.f38817.f38589.m33193()) {
            AbstractC11462 abstractC11462 = this.f38817;
            abstractC11462.getClass();
            if (abstractC11462 instanceof C9183) {
                if (this.f38820.m50802()) {
                    C15829.m37611(this.f38817.mo23635());
                    return;
                }
                C15829.m37616();
            }
            this.f38826.m16162(this.f38817.m28634());
            this.f38809.m18630(this);
            return;
        }
        C4405 c4405M33190 = this.f38817.f38589.m33190(m28747());
        String strM28629 = this.f38817.m28629();
        this.f38817.mo28628(c4405M33190.f15686);
        String strM286210 = this.f38817.m28629();
        if (!strM286210.startsWith("//SEARCH//") && (strM28629.startsWith("//SEARCH//") || strM28629.length() <= strM286210.length() || !strM286210.equals(C6730.m18172(strM28629)))) {
            strM28629 = null;
        }
        this.f38811.m17911(c4405M33190);
        m28741(false, (Runnable) new RunnableC12873(this, c4405M33190, strM28629), true);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m28767() {
        if (!m28800() && m28764() && this.f38817.f38589.m33197()) {
            final C4405 c4405M33196 = this.f38817.f38589.m33196(m28747());
            final String strM28629 = this.f38817.m28629();
            this.f38817.mo28628(c4405M33196.f15686);
            String strM286210 = this.f38817.m28629();
            if (strM28629.startsWith("//SEARCH//") || strM286210.startsWith("//SEARCH//") || strM28629.length() <= strM286210.length() || !strM286210.equals(C6730.m18172(strM28629))) {
                strM28629 = null;
            }
            this.f38811.m17911(c4405M33196);
            m28741(false, new Runnable() { // from class: l.᩺ۘ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C11545.m28753(this.f74096, c4405M33196, strM28629);
                }
            }, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.֨ۘ᩹] */
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
    private void m28729(Integer num, String str) {
        int iIntValue = num == null ? 0 : num.intValue();
        C5900 c5900 = this.f38826;
        if (str != null) {
            if (str.endsWith("/")) {
                str = C20630.m46498(1, 0, str);
            }
            for (int i = 0; i < this.f38827.size(); i++) {
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) this.f38827.get(i);
                if (interfaceC2557.isDirectory() && interfaceC2557.getPath().equals(str)) {
                    final int i2 = this.f38816.get();
                    c5900.m16158(iIntValue, i, str, (C0877) new BooleanSupplier() { // from class: l.֨ۘ᩹
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            return C11545.m28754(this.f3567, i2);
                        }
                    });
                    return;
                }
            }
        }
        c5900.m16167(iIntValue);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m28754(C11545 c11545, int i) {
        return i == c11545.f38816.get();
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final void m28761() {
        if (m28800() || this.f38825) {
            return;
        }
        this.f38808.m36131();
        this.f38826.m16164();
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final void m28768() {
        if (m28800() || this.f38825) {
            return;
        }
        C15073 c15073 = this.f38808;
        if (c15073.m36132()) {
            c15073.m36145();
            this.f38826.m16164();
        }
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final void m28796() {
        if (m28800() || this.f38825) {
            return;
        }
        C15073 c15073 = this.f38808;
        if (c15073.m36132()) {
            c15073.m36133();
            this.f38826.m16164();
        }
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final void m28809() {
        if (!m28800() && this.f38808.m36132()) {
            new C8909(this.f38809.m18638(), new C17106(this)).m23183();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m28831() {
        if (m28800()) {
            return;
        }
        C15073 c15073 = this.f38808;
        if (c15073.m36132()) {
            c15073.m36134();
            this.f38826.m16164();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28785(AbstractC11462 abstractC11462) {
        this.f38809.m18632(this, abstractC11462);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6936 m28807() {
        return this.f38809;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    private C4405 m28747() {
        String strM28629 = this.f38817.m28629();
        int iM16157 = this.f38826.m16157();
        C6605 c6605 = this.f38811;
        return new C4405(strM28629, iM16157, c6605.m17914(), c6605.m17913());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m28814(String str) {
        return str.equals(this.f38817.mo13039());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28775(String str) {
        if (C13638.equals(str, this.f38817.mo13039())) {
            return;
        }
        StringBuilder sbM30914 = C12441.m30914("Expected type: ", str, ", got: ");
        sbM30914.append(this.f38817.mo13039());
        throw new RuntimeException(sbM30914.toString());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Main m28824() {
        return this.f38809.m18638();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m28802() {
        return this.f38808.m36132();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m28828() {
        C15073 c15073 = this.f38808;
        if (!c15073.m36132()) {
            return 1;
        }
        if (this.f38811.m17913()) {
            Iterator it = this.f38827.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((InterfaceC2557) it.next()).isChecked()) {
                    i++;
                }
            }
            return i;
        }
        return Math.max(1, c15073.m36143());
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m28797() {
        if (m28828() != 1) {
            throw new IllegalStateException("Selected item size != 1");
        }
        return (InterfaceC2557) m28819().get(0);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m28819() {
        C15073 c15073 = this.f38808;
        if (c15073.m36132() && c15073.m36143() > 0) {
            ArrayList arrayList = new ArrayList(c15073.m36143());
            for (InterfaceC2557 interfaceC2557 : this.f38827) {
                if (interfaceC2557.isChecked()) {
                    arrayList.add(interfaceC2557);
                }
            }
            return C0561.unmodifiableList(arrayList);
        }
        return Collections.singletonList((InterfaceC2557) this.f38827.get(this.f38804));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m28822() {
        return (InterfaceC2557) this.f38827.get(this.f38804);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28772(int i, String str, String str2, ArrayList arrayList) {
        this.f38826.m16160(i, str, str2, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28778(Collection collection, boolean z) {
        C15073 c15073;
        List listM28829 = m28829();
        int i = 0;
        int i2 = -1;
        while (true) {
            int size = listM28829.size();
            c15073 = this.f38808;
            if (i >= size) {
                break;
            }
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM28829.get(i);
            if (!interfaceC2557.mo7980()) {
                if (!c15073.m36132()) {
                    c15073.m36142();
                }
                boolean zContains = collection.contains(interfaceC2557.getPath());
                c15073.m36137(interfaceC2557, zContains);
                if (zContains && z && i2 == -1) {
                    i2 = i;
                }
            }
            i++;
        }
        if (c15073.m36132() && !c15073.m36141()) {
            c15073.m36134();
        }
        C5900 c5900 = this.f38826;
        c5900.m16164();
        if (i2 != -1) {
            c5900.m16167(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28777(Collection collection) {
        m28751(collection, false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m28763(String str) {
        m28751((Collection) Collections.singleton(str), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28776(ArrayList arrayList) {
        m28751((Collection) arrayList, true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m28751(Collection collection, boolean z) {
        HashSet hashSet = this.f38801;
        hashSet.clear();
        hashSet.addAll(collection);
        this.f38815 = z;
        this.f38812 = !hashSet.isEmpty();
        this.f38813 = false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m28816() {
        return this.f38813;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m28760() {
        this.f38813 = true;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void m28815() {
        if (m28800()) {
            return;
        }
        AbstractC11462 abstractC11462 = this.f38817;
        String strM28629 = abstractC11462.m28629();
        int iM33189 = abstractC11462.f38589.m33189();
        if (abstractC11462.mo13031()) {
            C5817 c5817 = new C5817(this, abstractC11462, strM28629, iM33189);
            c5817.m10244(f38797);
            c5817.m10243();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28792(String str) {
        if (m28800()) {
            return;
        }
        AbstractC11462 abstractC11462 = this.f38817;
        if (abstractC11462.mo23633(str)) {
            C10757 c10757 = new C10757(this, abstractC11462);
            c10757.m10244(f38797);
            c10757.m10243();
        }
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final void m28806() {
        if (m28800()) {
            return;
        }
        m28741(false, (Runnable) null, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28742(List list, List list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((InterfaceC2557) list.get(i)).equals(list2.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28762() {
        return this.f38810;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2371 m28820() {
        C2371 c2371 = new C2371();
        c2371.f8391 = this.f38817;
        c2371.f8390 = this.f38806;
        c2371.f8382 = this.f38827;
        C6605 c6605 = this.f38811;
        c2371.f8387 = c6605.m17913();
        c2371.f8389 = c6605.m17914();
        c2371.f8386 = this.f38826.m16157();
        c2371.f8385 = this.f38802;
        c2371.f8381 = this.f38825;
        c2371.f8388 = this.f38800;
        c2371.f8383 = this.f38814;
        c2371.f8384 = this.f38819;
        return c2371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28782(C2371 c2371) {
        if (m28800()) {
            return;
        }
        this.f38816.incrementAndGet();
        this.f38817 = c2371.f8391;
        this.f38806 = c2371.f8390;
        this.f38827 = c2371.f8382;
        this.f38802 = c2371.f8385;
        this.f38825 = c2371.f8381;
        this.f38800 = c2371.f8388;
        this.f38814 = c2371.f8383;
        this.f38819 = c2371.f8384;
        C15073 c15073 = this.f38808;
        c15073.m36150();
        if (this.f38825 && c15073.m36132()) {
            c15073.m36134();
        }
        boolean z = c2371.f8387;
        this.f38811.m17910(c2371.f8389, z);
        this.f38812 = false;
        this.f38801.clear();
        this.f38815 = false;
        C5900 c5900 = this.f38826;
        c5900.m16166();
        c5900.m16167(c2371.f8386);
        m28825();
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C13662 m28818() {
        return m28770(true, (Runnable) null);
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C13662 m28834() {
        return m28770(false, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13662 m28770(boolean z, Runnable runnable) {
        boolean z2;
        C13662 c13662;
        synchronized (this.f38805) {
            if (m28800()) {
                z2 = false;
            } else {
                if (!this.f38805.isEmpty()) {
                    throw new IllegalStateException();
                }
                z2 = true;
            }
            c13662 = new C13662(this, runnable);
            this.f38805.add(c13662);
        }
        if (z2) {
            final C2994 c2994 = this.f38803;
            C11545 c11545 = c2994.f11237;
            C5563 c5563 = c2994.f11238;
            if (c5563 != null) {
                c5563.cancel();
                c2994.f11238 = null;
            }
            ViewGroup viewGroupM18624 = c11545.f38809.m18624(c11545.f38810);
            c2994.f11240 = viewGroupM18624;
            viewGroupM18624.setAlpha(0.0f);
            c2994.f11240.setVisibility(0);
            c2994.f11240.getChildAt(0).setVisibility(4);
            TextView textView = (TextView) c2994.f11240.getChildAt(2);
            c2994.f11243 = textView;
            textView.setVisibility(4);
            c2994.f11243.setTag(-1);
            final View childAt = c2994.f11240.getChildAt(1);
            childAt.setVisibility(4);
            childAt.setAlpha(0.0f);
            C5563 c5563M15349 = C5563.m15349(c2994.f11240, 0.0f, 0.1f);
            c5563M15349.m15354(200L);
            c2994.f11239 = c5563M15349;
            c5563M15349.m35318();
            C5563 c5563M153410 = C5563.m15349(c2994.f11240, 0.1f, 1.0f);
            c5563M153410.m15354(2500L);
            c2994.f11242 = c5563M153410;
            c5563M153410.m5665(new C14285(c2994));
            c2994.f11242.m35317(500L);
            c2994.f11242.m35310(new AccelerateInterpolator());
            c2994.f11242.m35318();
            if (z) {
                C5563 c5563M153411 = C5563.m15349(c2994.f11240.getChildAt(1), 0.0f, 1.0f);
                c2994.f11241 = c5563M153411;
                c5563M153411.m5665(new C1583(c2994, childAt));
                c2994.f11241.m35317(c.a);
                c2994.f11241.m35318();
                final C22959 c22959M50800 = C22959.m50800();
                childAt.setOnClickListener(new View.OnClickListener() { // from class: l.᩻ۘ᩹
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2994 c2995 = c2994;
                        c2995.getClass();
                        if (c22959M50800.m50803()) {
                            return;
                        }
                        childAt.setOnClickListener(null);
                        c2995.f11237.m28791();
                    }
                });
            }
        }
        return c13662;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28791() {
        ArrayList arrayList;
        synchronized (this.f38805) {
            arrayList = new ArrayList(this.f38805);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13662.m33363((C13662) it.next());
        }
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private void m28748() {
        C6605 c6605 = this.f38811;
        boolean zM17913 = c6605.m17913();
        C6936 c6936 = this.f38809;
        if (zM17913) {
            c6605.m17908();
            c6936.m18660();
        }
        if (this.f38825) {
            this.f38825 = false;
            this.f38802 = null;
            this.f38814 = null;
            this.f38819 = null;
            c6936.m18634(this.f38810, false);
            if (this.f38818) {
                c6936.m18654();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m28821() {
        return this.f38825;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28773(int i, Function function) {
        if (!this.f38825) {
            C15073 c15073 = this.f38808;
            if (c15073.m36132()) {
                this.f38814 = this.f38817.m28629();
                this.f38819 = new HashSet();
                for (InterfaceC2557 interfaceC2557 : m28829()) {
                    if (!interfaceC2557.mo7980() && interfaceC2557.isChecked()) {
                        this.f38819.add(interfaceC2557.getPath());
                    }
                }
            } else {
                this.f38814 = null;
                this.f38819 = null;
            }
            this.f38802 = (AbstractC4674) function;
            this.f38825 = true;
            if (i == -1) {
                this.f38800 = null;
            } else {
                this.f38800 = "➤ ".concat(C16737.m39288(i));
            }
            C5900.m16151(200);
            if (c15073.m36132()) {
                c15073.m36134();
            }
            this.f38826.m16166();
            this.f38809.m18651(this.f38810, true);
            m28745();
            return;
        }
        throw new IllegalStateException("Already in paste mode.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.function.Function, l.ۙ۬᩹] */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m28790() {
        C6936 c6936 = this.f38809;
        c6936.m18655();
        ?? r1 = this.f38802;
        if (r1 == 0 || ((Boolean) r1.apply(this)).booleanValue()) {
            this.f38825 = false;
            this.f38802 = null;
            this.f38814 = null;
            this.f38819 = null;
            C5900.m16151(200);
            this.f38826.m16166();
            c6936.m18634(this.f38810, true);
            m28745();
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m28766() {
        this.f38825 = false;
        this.f38802 = null;
        C5900.m16151(200);
        HashSet hashSet = this.f38819;
        C5900 c5900 = this.f38826;
        if (hashSet != null && C13638.equals(this.f38814, this.f38817.m28629())) {
            m28778((Collection) hashSet, false);
            if (hashSet.isEmpty()) {
                C15073 c15073 = this.f38808;
                if (!c15073.m36132()) {
                    c15073.m36142();
                    c5900.m16164();
                }
            }
        }
        this.f38814 = null;
        this.f38819 = null;
        c5900.m16166();
        this.f38809.m18634(this.f38810, false);
        m28745();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28784(C11018 c11018) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean zM36132 = this.f38808.m36132();
        boolean zMo28638 = this.f38817.mo28638();
        for (InterfaceC2557 interfaceC2557 : C0561.unmodifiableList(this.f38806)) {
            if (zM36132 && interfaceC2557.isChecked()) {
                arrayList.add(interfaceC2557.getName());
            }
            if (interfaceC2557.mo7983()) {
                arrayList2.add(zMo28638 ? interfaceC2557.getPath() : interfaceC2557.getName());
            }
        }
        c11018.writeInt(this.f38826.m16157());
        c11018.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c11018.m27786((String) it.next());
        }
        c11018.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c11018.m27786((String) it2.next());
        }
        C6605 c6605 = this.f38811;
        c11018.m27784(c6605.m17913());
        if (c6605.m17913()) {
            c11018.m27786(c6605.m17914());
        }
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m28830() {
        AbstractC11462 abstractC11462 = this.f38817;
        if (abstractC11462 != null) {
            abstractC11462.f38584 = true;
            if (m28814("local") && this.f38823.m28814("local") && this.f38817.mo28637().equals(this.f38823.f38817.mo28637())) {
                this.f38823.f38817.f38584 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final void m28793() {
        this.f38826.m16156();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m28771(String str, boolean z) {
        String strM46737;
        String strReplaceAll = str.replaceAll("[:\\\\/*?<>\"|]", "_").replaceAll("\\s", " ");
        String str2 = null;
        if (m28814("local")) {
            strM46737 = this.f38817.m28629();
            if (!C5553.m15304(strM46737)) {
                strM46737 = null;
            }
        } else {
            strM46737 = null;
        }
        if (!z && strM46737 == null && this.f38823.m28814("local")) {
            strM46737 = this.f38823.f38817.m28629();
            if (!C5553.m15304(strM46737)) {
                strM46737 = null;
            }
        }
        if (strM46737 == null && m28814("zip")) {
            strM46737 = C5553.m15313(((C13810) this.f38817).m33624(), new String[0]).m46737();
            if (!C5553.m15304(strM46737)) {
                strM46737 = null;
            }
        }
        if (strM46737 == null && m28814("archive")) {
            String strM46738 = C5553.m15313(((C9221) this.f38817).m23740(), new String[0]).m46737();
            if (C5553.m15304(strM46738)) {
                str2 = strM46738;
            }
        } else {
            str2 = strM46737;
        }
        return (str2 == null ? C11904.m29695() : C5553.m15313(str2, new String[0])).m46690(strReplaceAll);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m28832() {
        C6936 c6936 = this.f38809;
        if (c6936.m18640() != this.f38810) {
            c6936.m18659();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m28808() {
        MessageDigest messageDigestM49425 = C22253.m49425();
        AbstractC11462 abstractC11462 = this.f38817;
        List<InterfaceC2557> listM28829 = m28829();
        boolean zM36132 = this.f38808.m36132();
        C22253.m49418(messageDigestM49425, abstractC11462.mo13039() + "|" + abstractC11462.m28629() + "|" + zM36132 + "|" + listM28829.size());
        messageDigestM49425.update((byte) -1);
        for (InterfaceC2557 interfaceC2557 : listM28829) {
            C22253.m49418(messageDigestM49425, interfaceC2557.getName());
            messageDigestM49425.update((byte) -1);
            C22253.m49418(messageDigestM49425, String.valueOf(interfaceC2557.isDirectory()));
            messageDigestM49425.update((byte) -1);
            C22253.m49418(messageDigestM49425, String.valueOf(interfaceC2557.mo7986()));
            messageDigestM49425.update((byte) -1);
            C22253.m49418(messageDigestM49425, String.valueOf(interfaceC2557.mo7987()));
            messageDigestM49425.update((byte) -1);
            C22253.m49418(messageDigestM49425, String.valueOf(zM36132 && interfaceC2557.isChecked()));
            messageDigestM49425.update((byte) -1);
        }
        return C22253.m49424(messageDigestM49425.digest());
    }
}
