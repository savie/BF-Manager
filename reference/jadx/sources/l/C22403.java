package l;

import android.app.ActivityManager;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩷᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes.dex */
public final class C22403 implements InterfaceC8408, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f72549;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f72550;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f72551;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7091 f72552;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public AbstractC13628 f72553;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C13519 f72554;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f72555;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile long f72556;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f72557;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C9153 f72558;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C10226 f72559;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile C7091 f72560;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f72561;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final long f72562;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C2266 f72563;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public RunnableC5473 f72564;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f72565;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C7091 f72566;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72567;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public long f72568;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C2266 f72569;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2442 f72570;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f72571;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f72572;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f72573;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f72574;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f72575;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public volatile long f72576;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final long f72577;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f72578;

    @Override // l.InterfaceC8408
    public final long getItemId(int i) {
        return ((long) i) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50491(final C22403 c22403, C9153 c9153, final C9327 c9327, final boolean z, C8299 c8299, long j, final C7091 c7091, final C8299 c82910) {
        AbstractC13057 abstractC13057 = c7091.f23374;
        final C13802 c13802 = new C13802();
        c13802.f43777 = c9153;
        try {
            try {
                if (!c22403.m50495(c9327)) {
                    c13802.f43774 = false;
                    if (z) {
                        c13802.f43775 = C13519.m33208(c8299, c9153, c22403.f72562);
                        c13802.f43777 = null;
                    } else {
                        C2442 c2442 = new C2442(j, c9153);
                        if (abstractC13057.mo32546()) {
                            C2266 c2266 = c22403.f72563;
                            if (c2266 == null) {
                                throw new IOException("A cache directory is required for this image source");
                            }
                            C5995 c5995M7698 = c2266.m7698(abstractC13057, false, new InterfaceC7509() { // from class: l.ۗۧ֫
                                @Override // l.InterfaceC7509
                                /* JADX INFO: renamed from: ۫ */
                                public final boolean mo924() {
                                    return this.f10971.m50495(c9327);
                                }
                            });
                            try {
                                c22403.m50487(c9327, c5995M7698, c13802, c2442, false);
                                c5995M7698.close();
                            } catch (Throwable th) {
                                try {
                                    c5995M7698.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else {
                            c22403.m50487(c9327, c7091.f23374, c13802, c2442, false);
                        }
                        c9153.m24288(c2442.m8244());
                    }
                }
                if (c8299 != null) {
                    c8299.close();
                }
            } catch (Throwable th3) {
                if (c8299 != null) {
                    c8299.close();
                }
                throw th3;
            }
        } catch (IOException e) {
            e = e;
            c13802.f43776 = e;
            if (c8299 != null) {
                c8299.close();
            }
        } catch (OutOfMemoryError e2) {
            e = e2;
            c13802.f43776 = e;
            if (c8299 != null) {
                c8299.close();
            }
        } catch (RuntimeException e3) {
            e = e3;
            c13802.f43776 = e;
            if (c8299 != null) {
                c8299.close();
            }
        } catch (StackOverflowError e4) {
            e = e4;
            c13802.f43776 = e;
            if (c8299 != null) {
                c8299.close();
            }
        }
        c22403.f72575.post(new Runnable() { // from class: l.᩵ۧ֫
            @Override // java.lang.Runnable
            public final void run() {
                C22403.m50494(this.f65722, z, c7091, c82910, c9327, c13802);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50493(C22403 c22403, C11438 c11438, long j, C23653 c23653, C7091 c7091, int i, C1041 c1041) {
        C23653 c23653M52888;
        c22403.getClass();
        if (c11438.f35952.get() || c22403.f72557 || !c22403.f72565 || c22403.f72576 != j) {
            return;
        }
        if (c23653.f76732 == R.string.MT_Protector && c7091 != null && c22403.f72572.get(i) == c7091) {
            c22403.m50545(i);
        }
        if (c7091 != null && c7091.f23392) {
            c23653M52888 = C23653.m52887(R.string.MT_Protector);
        } else {
            c23653M52888 = c23653.m52888(c22403.m50542(i));
        }
        c1041.accept(c23653M52888);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50498(C22403 c22403, C11438 c11438, long j, C7091 c7091) {
        c22403.getClass();
        if (c11438.f35952.get() || c22403.f72557 || !c22403.f72565 || c22403.f72576 != j) {
            return true;
        }
        return c7091 != null && c7091.f23392;
    }

    public C22403(ActivityC15913 activityC15913, ArrayList arrayList) {
        long jMin;
        ActivityManager activityManager = (ActivityManager) activityC15913.getSystemService("activity");
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        int memoryClass = activityManager.getMemoryClass();
        boolean zIsLowRamDevice = activityManager.isLowRamDevice();
        if (jMaxMemory <= 0) {
            throw new IllegalArgumentException("Maximum heap must be positive");
        }
        if (memoryClass > 0) {
            if (zIsLowRamDevice) {
                jMin = Math.min(16777216L, (((long) memoryClass) * 1048576) / 16);
            } else {
                jMin = Math.min(268435456L, jMaxMemory / 3);
            }
            C2442 c2442 = new C2442(Math.max(1048576L, jMin), null);
            File file = new File(activityC15913.getCacheDir(), "gallery-sources");
            this.f72572 = new SparseArray(3);
            this.f72554 = new C13519();
            this.f72575 = new Handler(Looper.getMainLooper());
            this.f72573 = Executors.newSingleThreadExecutor(new ThreadFactoryC18278());
            this.f72555 = Executors.newSingleThreadExecutor(new ThreadFactoryC0379());
            this.f72551 = new IdentityHashMap();
            this.f72565 = true;
            if (arrayList == null || arrayList.isEmpty() || c2442.m8241() < 1048576) {
                throw new IllegalArgumentException("Invalid gallery sources or bitmap budget");
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f72567 = arrayList2;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((AbstractC13057) it.next()) == null) {
                    throw new IllegalArgumentException("Null gallery source");
                }
            }
            this.f72570 = c2442;
            c2442.m8243(new RunnableC4886(2, this));
            long jMin2 = Math.min(X931RNG.BLOCK128_RESEED_MAX, c2442.m8241() / 8);
            this.f72562 = jMin2;
            this.f72574 = (c2442.m8241() / 3) * 2;
            this.f72577 = c2442.m8241() - (jMin2 * 3);
            this.f72569 = new C2266(file);
            this.f72563 = new C2266(file);
            return;
        }
        throw new IllegalArgumentException("Memory class must be positive");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50538(AbstractC13628 abstractC13628, int i) {
        m50512();
        if (this.f72557 || this.f72553 != null) {
            throw new IllegalStateException("Gallery session already attached or closed");
        }
        this.f72553 = abstractC13628;
        abstractC13628.getClass();
        this.f72571 = abstractC13628 instanceof C0205;
        abstractC13628.mo1642(this, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50544(AbstractC13628 abstractC13628, int i) {
        AbstractC13628 abstractC13629;
        m50512();
        if (this.f72557 || (abstractC13629 = this.f72553) == null) {
            throw new IllegalStateException("Gallery session is not attached");
        }
        abstractC13629.mo1649();
        this.f72553 = null;
        m50538(abstractC13628, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50537(RunnableC5473 runnableC5473) {
        m50512();
        this.f72564 = runnableC5473;
    }

    @Override // l.InterfaceC8408
    public final int getCount() {
        return this.f72567.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9044 m50542(int i) {
        m50512();
        C7091 c7091 = (C7091) this.f72572.get(i);
        if (c7091 == null || c7091.f23392) {
            return null;
        }
        return c7091.f23384;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50536(final int i, final C11438 c11438, final C1041 c1041) {
        m50512();
        if (this.f72557 || i < 0 || i >= this.f72567.size()) {
            return;
        }
        final C7091 c7091 = (C7091) this.f72572.get(i);
        final C9044 c9044M50542 = m50542(i);
        final long j = this.f72576;
        final C7837 c7837 = new C7837(this, c11438, j, c7091);
        this.f72573.execute(new Runnable() { // from class: l.ᩳۧ֫
            @Override // java.lang.Runnable
            public final void run() {
                C22403.m50490(this.f61634, c7837, i, c7091, c9044M50542, c11438, j, c1041);
            }
        });
    }

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
    public static /* synthetic */ void m50490(final C22403 c22403, C7837 c7837, final int i, final C7091 c7091, C9044 c9044, final C11438 c11438, final long j, final C1041 c1041) {
        C23653 c23653M52887;
        C5995 c5995;
        IdentityHashMap identityHashMap = c22403.f72551;
        C2266 c2266 = c22403.f72569;
        try {
            AbstractC13057.m32543(c7837);
            try {
                AbstractC13057 abstractC13057 = (AbstractC13057) c22403.f72567.get(i);
                boolean zMo32546 = abstractC13057.mo32546();
                AbstractC13057 abstractC13058 = abstractC13057;
                if (zMo32546) {
                    if (c7091 == null || c2266 == null) {
                        throw new IOException("No gallery source owner for details");
                    }
                    C5995 c5996 = (C5995) identityHashMap.get(c7091);
                    if (c5996 == null) {
                        C5995 c5995M7698 = c2266.m7698(abstractC13057, true, c7837);
                        if (c7837.mo924()) {
                            c5995M7698.close();
                            AbstractC13057.m32543(c7837);
                        }
                        identityHashMap.put(c7091, c5995M7698);
                        c5995 = c5995M7698;
                    } else {
                        c5995 = c5996;
                    }
                    c5995.m17427();
                    abstractC13058 = c5995;
                }
                c23653M52887 = C3515.m11516(abstractC13058, c9044, c7837);
                if (abstractC13058 instanceof C5995) {
                    ((C5995) abstractC13058).m17427();
                }
            } catch (C19770 unused) {
                c23653M52887 = C23653.m52887(R.string.MT_Protector);
            } catch (IOException | OutOfMemoryError | RuntimeException unused2) {
                c23653M52887 = C23653.m52887(R.string.MT_Protector);
            }
        } catch (C19770 unused3) {
        } catch (IOException | OutOfMemoryError | RuntimeException unused4) {
        }
        final C23653 c23653 = c23653M52887;
        c22403.f72575.post(new Runnable() { // from class: l.֨ۧ֫
            @Override // java.lang.Runnable
            public final void run() {
                C22403.m50493(this.f4192, c11438, j, c23653, c7091, i, c1041);
            }
        });
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50541(int i) {
        C7091 c7091 = (C7091) this.f72572.get(i);
        return c7091 != null && c7091.f23394;
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22606(int i) {
        AbstractC13057 abstractC13057 = (AbstractC13057) this.f72567.get(i);
        abstractC13057.getClass();
        return abstractC13057 instanceof C8977;
    }

    @Override // l.InterfaceC8408
    public final void onPageSelected(int i) {
        m50512();
        this.f72576++;
        this.f72550 = i;
        this.f72560 = (C7091) this.f72572.get(i);
        if (this.f72560 != null) {
            this.f72560.f23370 = false;
            if (this.f72560.f23384 != null) {
                this.f72560.f23383 = true;
            }
            this.f72560.f23381 |= this.f72560.f23393;
            this.f72560.f23393 = true;
        }
        for (int i2 = 0; i2 < this.f72572.size(); i2++) {
            C7091 c7091 = (C7091) this.f72572.valueAt(i2);
            if (!this.f72571 && c7091 != this.f72560) {
                c7091.m19433();
            }
            c7091.m19434();
        }
        for (int i3 = 0; i3 < this.f72572.size(); i3++) {
            ((C7091) this.f72572.valueAt(i3)).f23387 = false;
        }
        m50533();
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final void mo22603() {
        if (!this.f72571 || this.f72557) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f72572.size(); i++) {
            C7091 c7091 = (C7091) this.f72572.valueAt(i);
            boolean zMo1643 = this.f72553.mo1643(c7091.f23378);
            if (c7091.f23385 != zMo1643) {
                c7091.f23385 = zMo1643;
                if (!zMo1643) {
                    c7091.m19433();
                }
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < this.f72572.size(); i2++) {
                ((C7091) this.f72572.valueAt(i2)).f23362 = false;
            }
        }
        m50533();
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final void mo22605(AbstractC13628 abstractC13628, int i, long j) {
        m50512();
        if (this.f72557) {
            return;
        }
        C7091 c7091 = (C7091) this.f72572.get(i);
        if (c7091 != null) {
            c7091.close();
        }
        C7091 c7092 = new C7091(this, i, j, (AbstractC13057) this.f72567.get(i));
        this.f72572.put(i, c7092);
        if (i == this.f72550) {
            this.f72560 = c7092;
            c7092.f23393 = true;
        }
        m50533();
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final void mo22604(int i, long j) {
        m50512();
        C7091 c7091 = (C7091) this.f72572.get(i);
        if (c7091 == null || c7091.f23360 != j) {
            return;
        }
        this.f72572.remove(i);
        if (this.f72560 == c7091) {
            this.f72560 = null;
        }
        c7091.close();
        m50533();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50545(int i) {
        AbstractC13628 abstractC13628;
        m50512();
        if (this.f72557 || (abstractC13628 = this.f72553) == null) {
            return;
        }
        abstractC13628.mo1651(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50543() {
        m50545(this.f72550);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50539(boolean z) {
        m50512();
        if (this.f72557 || this.f72565 == z) {
            return;
        }
        this.f72565 = z;
        this.f72556++;
        for (int i = 0; i < this.f72572.size(); i++) {
            C7091 c7091 = (C7091) this.f72572.valueAt(i);
            c7091.m19433();
            if (z && c7091.f23384 != null) {
                c7091.f23383 = true;
                c7091.f23381 = true;
            }
            c7091.m19434();
        }
        AbstractC13628 abstractC13628 = this.f72553;
        if (abstractC13628 != null) {
            abstractC13628.invalidate();
        }
        m50533();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50540() {
        m50512();
        this.f72556++;
        for (int i = 0; i < this.f72572.size(); i++) {
            C7091 c7091 = (C7091) this.f72572.valueAt(i);
            c7091.f23366 = Math.max(262144L, c7091.f23366 / 2);
            c7091.m19433();
        }
        AbstractC13628 abstractC13628 = this.f72553;
        if (abstractC13628 != null) {
            abstractC13628.invalidate();
        }
        m50533();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m50512();
        if (this.f72557) {
            return;
        }
        this.f72557 = true;
        this.f72570.m8243((RunnableC4886) null);
        this.f72565 = false;
        this.f72560 = null;
        this.f72564 = null;
        AbstractC13628 abstractC13628 = this.f72553;
        if (abstractC13628 != null) {
            abstractC13628.mo1649();
        }
        this.f72553 = null;
        for (int i = 0; i < this.f72572.size(); i++) {
            ((C7091) this.f72572.valueAt(i)).close();
        }
        this.f72572.clear();
        this.f72573.execute(new RunnableC8501(3, this));
        this.f72573.shutdown();
        this.f72555.execute(new RunnableC3009(1, this));
        this.f72555.shutdown();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50525(C22403 c22403) {
        c22403.m50499();
        c22403.m50526(true);
        C2266 c2266 = c22403.f72569;
        if (c2266 != null) {
            c2266.close();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50520(C22403 c22403) {
        C2266 c2266 = c22403.f72563;
        if (c2266 != null) {
            c2266.close();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m50512() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery UI access off main thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m50533() {
        if (this.f72557) {
            return;
        }
        this.f72561 = true;
        if (this.f72578) {
            return;
        }
        this.f72578 = true;
        this.f72575.post(new RunnableC23484(5, this));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m50504(final C22403 c22403) {
        c22403.f72578 = false;
        if (c22403.f72557 || c22403.f72549) {
            return;
        }
        long jM50518 = c22403.m50518();
        if (jM50518 != 0 && c22403.f72570.m8241() - c22403.f72570.m8244() < jM50518 && c22403.f72566 == null) {
            for (int size = c22403.f72572.size() - 1; size >= 0; size--) {
                C7091 c7091 = (C7091) c22403.f72572.valueAt(size);
                if (c7091 != c22403.f72560 && (c7091.f23365 != null || c7091.f23379 != null)) {
                    c22403.f72553.mo1651(c7091.f23378);
                }
            }
        }
        c22403.m50516();
        final C9327 c9327M50510 = c22403.m50510();
        if (c9327M50510 != null) {
            c9327M50510.f30320 = c9327M50510.f30322 != c22403.f72560;
        }
        c22403.f72561 = false;
        c22403.f72549 = true;
        c22403.f72573.execute(new Runnable() { // from class: l.ۢۧ֫
            @Override // java.lang.Runnable
            public final void run() {
                C22403.m50535(this.f32301, c9327M50510);
            }
        });
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50535(final C22403 c22403, final C9327 c9327) {
        C7091 c7091;
        final C13802 c13802 = new C13802();
        try {
            if (c22403.f72552 != (c9327 == null ? c22403.f72560 : c9327.f30322) || !c22403.f72565 || ((c7091 = c22403.f72552) != null && c7091.f23392)) {
                c22403.m50499();
            }
            c22403.m50526(false);
            if (c9327 != null && !c9327.f30322.f23392 && c22403.f72565 && !c22403.f72557) {
                c22403.m50524(c9327, c13802);
            }
        } catch (IOException | OutOfMemoryError | RuntimeException | StackOverflowError e) {
            c13802.f43776 = e;
            if (c9327 != null && c9327.f30323 == null && c22403.f72552 == c9327.f30322) {
                c22403.m50499();
            }
        }
        if (c22403.f72557 || (c9327 != null && c9327.f30322.f23392)) {
            c13802.close();
            c22403.m50499();
        }
        c22403.f72575.post(new Runnable() { // from class: l.᩻ۧ֫
            @Override // java.lang.Runnable
            public final void run() {
                C22403.m50492(this.f80929, c9327, c13802);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50492(C22403 c22403, C9327 c9327, C13802 c13802) {
        c22403.f72549 = false;
        if (c9327 != null) {
            c22403.m50488(c9327, c13802);
        } else {
            c13802.close();
        }
        if (!c22403.f72557 && (c22403.f72561 || c22403.m50510() != null)) {
            c22403.m50533();
        }
        c22403.m50516();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9327 m50510() {
        C9327 c9327M50503;
        C9327 c9327M50486;
        C9327 c9327M50504;
        if (!this.f72565 || this.f72557) {
            return null;
        }
        C9327 c9327M50505 = m50503(this.f72560);
        if (c9327M50505 != null) {
            return c9327M50505;
        }
        if (this.f72571) {
            for (int i = 0; i < this.f72572.size(); i++) {
                C7091 c7091 = (C7091) this.f72572.valueAt(i);
                if (c7091 != this.f72560 && c7091.f23385 && (c9327M50504 = m50503(c7091)) != null) {
                    return c9327M50504;
                }
            }
        }
        C9327 c9327M50487 = m50486(this.f72560);
        if (c9327M50487 != null) {
            return c9327M50487;
        }
        if (this.f72571) {
            for (int i2 = 0; i2 < this.f72572.size(); i2++) {
                C7091 c7092 = (C7091) this.f72572.valueAt(i2);
                if (c7092 != this.f72560 && c7092.f23385 && (c9327M50486 = m50486(c7092)) != null) {
                    return c9327M50486;
                }
            }
        }
        if (!this.f72571) {
            return null;
        }
        for (int i3 = 0; i3 < this.f72572.size(); i3++) {
            C7091 c7093 = (C7091) this.f72572.valueAt(i3);
            if (c7093 != this.f72560 && !c7093.f23385 && c7093.f23374.mo23981() && (c9327M50503 = m50503(c7093)) != null) {
                return c9327M50503;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9327 m50486(C7091 c7091) {
        if (c7091 == null || c7091.f23392 || c7091.f23383) {
            return null;
        }
        if (c7091.m19432() && c7091.f23364) {
            return null;
        }
        if (c7091.f23379 != null) {
            for (C4503 c4503 : c7091.f23395) {
                if (!(c7091.f23361 ? c7091.f23396 : c7091.f23373).containsKey(c4503) && !c7091.f23388.contains(c4503)) {
                    return new C9327(c7091, c4503, this.f72556, this.f72576);
                }
            }
        }
        if (c7091.f23384 == null || c7091.f23386) {
            return null;
        }
        for (C0774 c0774 : c7091.f23376) {
            if (!c7091.f23372.containsKey(c0774) && !c7091.f23382.contains(c0774)) {
                return new C9327(c7091, c0774, false, this.f72556, this.f72576);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C9327 m50503(C7091 c7091) {
        if (c7091 == null || c7091.f23392) {
            return null;
        }
        if (c7091.f23371 && (c7091 == this.f72560 || (this.f72571 && c7091.f23385))) {
            if (this.f72570.m8241() - this.f72570.m8244() < (this.f72571 ? Math.min(1048576L, this.f72570.m8241() / 128) : this.f72574)) {
                return null;
            }
            return new C9327(c7091, null, false, this.f72556, this.f72576);
        }
        if (c7091.f23394) {
            return null;
        }
        if (c7091 != this.f72560 && c7091.f23369) {
            return null;
        }
        if (c7091 != this.f72560 && !c7091.f23374.mo23981()) {
            return null;
        }
        if (c7091.f23384 == null) {
            if (c7091 == this.f72566) {
                return null;
            }
            return new C9327(c7091, null, false, this.f72556, this.f72576);
        }
        if (c7091.f23383) {
            return new C9327(c7091, null, true, this.f72556, this.f72576);
        }
        long jM50518 = m50518();
        if (c7091 != this.f72560 || jM50518 <= 0 || this.f72570.m8241() - this.f72570.m8244() < jM50518) {
            return null;
        }
        return new C9327(c7091, null, false, this.f72556, this.f72576);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private long m50518() {
        if (this.f72571 || !this.f72565 || this.f72560 == null || this.f72560.f23392) {
            return 0L;
        }
        if (this.f72560.f23371) {
            return this.f72571 ? Math.min(1048576L, this.f72570.m8241() / 128) : this.f72574;
        }
        if (this.f72560.f23379 == null || this.f72560.f23370 || this.f72560.f23383) {
            return 0L;
        }
        long jM36158 = this.f72560.f23379.m36158();
        if (jM36158 <= this.f72570.m8241() - this.f72560.f23379.m36159()) {
            return jM36158;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.᩺ۧ֫] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.ۛۧ֫] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50487(final C9327 c9327, AbstractC13057 abstractC13057, C13802 c13802, C2442 c2442, boolean z) {
        C10226 c10226M26361;
        if (abstractC13057 instanceof C8977) {
            C15294 c15294Mo17423 = abstractC13057.mo17423();
            c13802.f43775 = ((C8977) abstractC13057).m23979(c2442, this.f72562, (C6346) new InterfaceC7509() { // from class: l.ۛۧ֫
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f21474.m50495(c9327);
                }
            });
            abstractC13057.m32544(c15294Mo17423);
            c13802.f43773 = new C9044(abstractC13057.mo17426(), c13802.f43775.f27263.getWidth(), c13802.f43775.f27263.getHeight(), 1, "video/*", c15294Mo17423);
            return;
        }
        long jMin = this.f72571 ? Math.min(1048576L, this.f72570.m8241() / 128) : this.f72562;
        C19486 c19486M39135 = C16502.m39135(abstractC13057, (C24246) new InterfaceC7509() { // from class: l.᩺ۧ֫
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                return this.f78537.m50495(c9327);
            }
        });
        C15010 c15010M39134 = C16502.m39134(abstractC13057, c19486M39135, c2442, this.f72562, this.f72574, new C4108(this, c9327));
        c13802.f43772 = c15010M39134;
        if (c15010M39134 != null) {
            c13802.f43773 = c15010M39134.f49043;
            return;
        }
        C9044 c9044M33215 = this.f72554.m33215(abstractC13057, c19486M39135.f62912, c19486M39135.f62911);
        c13802.f43773 = c9044M33215;
        if (c9044M33215.f29432 != null) {
            if (!z || abstractC13057.mo17424() == null) {
                c10226M26361 = null;
            } else {
                m50499();
                try {
                    c10226M26361 = C10226.m26361(abstractC13057, c13802.f43773, c2442, new InterfaceC7509() { // from class: l.ܰۧ֫
                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return this.f45857.m50495(c9327);
                        }
                    });
                    this.f72559 = c10226M26361;
                    this.f72552 = c9327.f30322;
                } catch (C18740 unused) {
                    c10226M26361 = null;
                }
            }
            c13802.f43775 = C21657.m49196(abstractC13057, c13802.f43773, c2442, jMin, c10226M26361, new InterfaceC7509() { // from class: l.᩶ۧ֫
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f67823.m50495(c9327);
                }
            }, C6808.f22671);
            return;
        }
        if (!C10226.m26362(c9044M33215.f29436)) {
            jMin = this.f72562;
        }
        if (m50495(c9327)) {
            return;
        }
        c13802.f43775 = this.f72554.m33214(abstractC13057, c13802.f43773, c2442, (!this.f72571 && z && c9327.f30322 == this.f72560 && "image/png".equals(c13802.f43773.f29436)) ? Math.min(X931RNG.BLOCK128_RESEED_MAX, this.f72562 * 2) : jMin);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private long m50529(C7091 c7091) {
        C8299 c8299 = c7091.f23365;
        if (c8299 == null || c7091.f23387) {
            return 0L;
        }
        long allocationByteCount = c8299.f27263.getAllocationByteCount();
        long j = this.f72562;
        if (allocationByteCount <= j) {
            return 0L;
        }
        int i = 2;
        while (C13519.m33204(c7091.f23365.f27263.getWidth(), c7091.f23365.f27263.getHeight(), i) > j) {
            i *= 2;
        }
        return C13519.m33204(c7091.f23365.f27263.getWidth(), c7091.f23365.f27263.getHeight(), i);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m50516() {
        final C7091 c7091;
        long jMin;
        C7091 c7092;
        if (this.f72557 || !this.f72565 || this.f72566 != null || this.f72560 == null) {
            return;
        }
        if ((this.f72560.f23384 != null || this.f72560.f23394) && !this.f72560.f23383) {
            if (this.f72571 || !this.f72565 || this.f72557 || m50518() > 0) {
                c7091 = null;
            } else {
                long jM8241 = this.f72570.m8241() - this.f72570.m8244();
                int i = 0;
                while (true) {
                    if (i < this.f72572.size()) {
                        c7092 = (C7091) this.f72572.valueAt(i);
                        long jM50529 = m50529(c7092);
                        if (c7092 == this.f72560 || jM50529 <= 0 || jM50529 > jM8241) {
                            i++;
                        }
                    } else {
                        if (jM8241 >= this.f72562) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < this.f72572.size()) {
                                    c7092 = (C7091) this.f72572.valueAt(i2);
                                    if (c7092 == this.f72560 || c7092.f23392 || c7092.f23394 || c7092.f23369 || c7092.f23384 != null || !c7092.f23374.mo23981()) {
                                        i2++;
                                    }
                                }
                            }
                        }
                        c7091 = null;
                    }
                    c7091 = c7092;
                }
            }
            if (c7091 == null) {
                return;
            }
            final C8299 c8299 = c7091.f23365;
            boolean z = c8299 != null;
            long jM505210 = z ? m50529(c7091) : this.f72562;
            if (!this.f72560.f23386 || (this.f72560.f23379 != null && this.f72560.f23379.m36156())) {
                jMin = this.f72562;
            } else {
                jMin = Math.min(this.f72574, this.f72570.m8241() - this.f72570.m8244());
            }
            final long j = jMin;
            final C9153 c9153M8242 = this.f72570.m8242(jM505210);
            if (c9153M8242 == null) {
                return;
            }
            C8299 c8299M22388 = z ? c8299.m22388() : null;
            this.f72566 = c7091;
            this.f72568 = z ? jM505210 : 0L;
            this.f72558 = z ? null : c9153M8242;
            final C9327 c9327 = new C9327(c7091, null, false, this.f72556, this.f72576);
            c9327.f30320 = true;
            final boolean z2 = z;
            final C8299 c82910 = c8299M22388;
            this.f72555.execute(new Runnable() { // from class: l.ܺۧ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C22403.m50491(this.f54169, c9153M8242, c9327, z2, c82910, j, c7091, c8299);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50494(C22403 c22403, boolean z, C7091 c7091, C8299 c8299, C9327 c9327, C13802 c13802) {
        c22403.f72566 = null;
        c22403.f72568 = 0L;
        c22403.f72558 = null;
        if (z) {
            if (!c22403.f72557 && c22403.f72565 && !c7091.f23392 && c7091 != c22403.f72560 && c7091.f23365 == c8299 && c9327.f30321 == c22403.f72556 && !c13802.f43774) {
                C8299 c82910 = c13802.f43775;
                if (c82910 == null) {
                    c7091.f23387 = true;
                } else {
                    c13802.f43775 = null;
                    c7091.f23365 = c82910;
                    c8299.close();
                }
            }
            c13802.close();
        } else {
            c22403.m50488(c9327, c13802);
        }
        if (c22403.f72557) {
            return;
        }
        if (c22403.f72560 != null) {
            c22403.f72560.f23362 = false;
        }
        AbstractC13628 abstractC13628 = c22403.f72553;
        if (abstractC13628 != null) {
            abstractC13628.invalidate();
        }
        c22403.m50533();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m50524(final C9327 c9327, C13802 c13802) throws IOException {
        C7091 c7091 = c9327.f30322;
        C0774 c0774 = c9327.f30323;
        if (m50495(c9327)) {
            return;
        }
        c13802.f43774 = false;
        if (c9327.f30319) {
            c13802.f43778 = (c9327.f30318 && c7091.f23374.mo23982()) || !c7091.f23384.f29430.equals(c7091.f23374.mo17423());
            return;
        }
        C4503 c4503 = c9327.f30316;
        if (c4503 != null) {
            c13802.f43775 = c9327.f30314.m36152(c4503.f16076, c4503.f16074, this.f72570, c9327.f30312, new C17532(this, c9327));
            return;
        }
        if (c0774 == null) {
            m50487(c9327, m50523(c9327), c13802, this.f72570, true);
            return;
        }
        C7091 c7092 = this.f72552;
        C2442 c2442 = this.f72570;
        if (c7092 != c7091) {
            m50499();
            AbstractC13057 abstractC13057M50523 = m50523(c9327);
            C9044 c9044 = c7091.f23384;
            this.f72559 = c9044.f29432 == null ? C10226.m26360(abstractC13057M50523, c9044) : C10226.m26361(abstractC13057M50523, c9044, c2442, new InterfaceC7509() { // from class: l.ܶۧ֫
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f52026.m50495(c9327);
                }
            });
            this.f72552 = c7091;
        }
        c13802.f43775 = this.f72559.m26363(new Rect(c0774.f2798, c0774.f2793, c0774.f2797, c0774.f2794), c0774.f2795, c2442, new InterfaceC7509() { // from class: l.᩹ۧ֫
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                return this.f75978.m50495(c9327);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m50495(C9327 c9327) {
        if (this.f72557 || !this.f72565 || c9327.f30321 != this.f72556 || c9327.f30322.f23392 || ((c9327.f30315 != this.f72576 && ((!this.f72571 || !c9327.f30322.f23374.mo23981() || (!c9327.f30320 && c9327.f30322.f23374.mo32546())) && (!c9327.f30320 || c9327.f30317 != null || c9327.f30322 != this.f72560 || c9327.f30323 != null || c9327.f30316 != null || !c9327.f30322.f23374.mo23981()))) || (((c9327.f30323 != null || c9327.f30316 != null) && !m50527(c9327.f30322)) || (c9327.f30316 != null && !c9327.f30322.f23395.contains(c9327.f30316))))) {
            c9327.f30313 = true;
        }
        return c9327.f30313;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m50527(C7091 c7091) {
        if (this.f72571) {
            return c7091.f23385;
        }
        return c7091 == this.f72560;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC13057 m50523(final C9327 c9327) throws IOException {
        C7091 c7091 = c9327.f30322;
        AbstractC13057 abstractC13057 = c7091.f23374;
        if (!abstractC13057.mo32546()) {
            return abstractC13057;
        }
        IdentityHashMap identityHashMap = this.f72551;
        C5995 c5995 = (C5995) identityHashMap.get(c7091);
        if (c5995 != null) {
            return c5995;
        }
        C2266 c2266 = this.f72569;
        if (c2266 == null) {
            throw new IOException("A cache directory is required for this image source");
        }
        C5995 c5995M7698 = c2266.m7698(abstractC13057, !c9327.f30320, new InterfaceC7509() { // from class: l.ۨۧ֫
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                return this.f39579.m50495(c9327);
            }
        });
        identityHashMap.put(c7091, c5995M7698);
        return c5995M7698;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m50526(boolean z) {
        Iterator it = this.f72551.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C7091 c7091 = (C7091) entry.getKey();
            if (z || c7091.f23392 || !m50527(c7091)) {
                if (this.f72552 == c7091) {
                    m50499();
                }
                ((C5995) entry.getValue()).close();
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m50499() {
        try {
            C10226 c10226 = this.f72559;
            if (c10226 != null) {
                c10226.close();
            }
        } catch (IOException unused) {
        } finally {
            this.f72559 = null;
            this.f72552 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50485(Throwable th) {
        if (th instanceof C1587) {
            return R.string.MT_Protector;
        }
        if ((th instanceof C22470) || (th instanceof C9789) || (th instanceof C9339)) {
            return R.string.MT_Protector;
        }
        return ((th instanceof C18740) || (th instanceof OutOfMemoryError)) ? R.string.MT_Protector : R.string.MT_Protector;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:122:0x01da A[LOOP:0: B:120:0x01d4->B:122:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x021a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0233  */
    /* JADX WARN: Code duplicated, block: B:130:0x0239  */
    /* JADX WARN: Code duplicated, block: B:132:0x024d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0250  */
    /* JADX WARN: Code duplicated, block: B:135:0x0260  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50488(C9327 c9327, C13802 c13802) {
        C5249 c5249;
        Iterator it;
        C7091 c7091 = c9327.f30322;
        if (this.f72557 || !this.f72565 || c9327.f30321 != this.f72556 || c7091.f23392 || this.f72572.get(c7091.f23378) != c7091 || c13802.f43774 || m50495(c9327)) {
            c13802.close();
            return;
        }
        boolean z = true;
        if (c9327.f30320 && c7091.f23384 == null && c13802.f43776 != null && (!this.f72571 || !c7091.f23385 || !(c13802.f43776 instanceof C18740))) {
            c7091.f23369 = true;
            c7091.f23371 = this.f72571 && (c13802.f43776 instanceof C18740);
            c13802.close();
            return;
        }
        Throwable th = c13802.f43776;
        if ((th instanceof C19770) || c13802.f43778) {
            c13802.close();
            m50545(c7091.f23378);
            return;
        }
        if (c9327.f30319) {
            c7091.f23383 = false;
            if (th != null) {
                m50545(c7091.f23378);
            } else {
                c7091.m19434();
            }
        } else {
            C4503 c4503 = c9327.f30316;
            if (c4503 != null) {
                C8299 c8299 = c13802.f43775;
                if (c8299 != null) {
                    HashMap map = c7091.f23361 ? c7091.f23396 : c7091.f23373;
                    c13802.f43775 = null;
                    C8299 c82910 = (C8299) map.put(c4503, c8299);
                    if (c82910 != null) {
                        c82910.close();
                    }
                    c7091.m19429();
                    this.f72553.invalidate();
                } else {
                    if (th instanceof C18740) {
                        c7091.f23366 = Math.max(262144L, c7091.f23366 / 2);
                        c7091.m19428();
                        c7091.f23395 = new ArrayList();
                        c7091.f23362 = false;
                        this.f72553.invalidate();
                    }
                    c7091.f23388.add(c9327.f30316);
                }
            } else if (c9327.f30323 == null) {
                C15010 c15010 = c9327.f30317;
                if (c15010 != null && c13802.f43772 == null) {
                    c7091.f23370 = true;
                    c13802.close();
                    return;
                }
                if (c13802.f43775 == null && c13802.f43772 == null) {
                    if (!(th instanceof C18740) || (c13802.f43777 == null && c7091.f23371)) {
                        z = false;
                    }
                    c7091.f23371 = z;
                    c7091.f23394 = !z;
                    if (!z) {
                        this.f72553.mo1640(c7091.f23378, m50485(th), c7091.f23360);
                    }
                } else {
                    if (c15010 != null) {
                        c15010.m36154(c7091.f23397);
                    }
                    c7091.f23369 = false;
                    c7091.f23371 = false;
                    c7091.f23394 = false;
                    c7091.f23384 = c13802.f43773;
                    C9153 c9153 = c13802.f43777;
                    c13802.f43777 = null;
                    c7091.f23397 = c9153;
                    C8299 c82911 = c13802.f43775;
                    c13802.f43775 = null;
                    c7091.f23365 = c82911;
                    C15010 c15011 = c13802.f43772;
                    c13802.f43772 = null;
                    c7091.f23379 = c15011;
                    AbstractC13057 abstractC13057 = c7091.f23374;
                    abstractC13057.getClass();
                    if (!(abstractC13057 instanceof C8977) && c7091.f23379 == null) {
                        z = false;
                    }
                    c7091.f23386 = z;
                    if (!this.f72553.mo1644(c7091.f23378, c7091.f23360, c7091)) {
                        c7091.close();
                    }
                    c7091.m19434();
                }
            } else if (m50527(c7091)) {
                if (c7091.m19432()) {
                    C0774 c0774 = c9327.f30323;
                    RectF rectF = c7091.f23380;
                    C8299 c82912 = c7091.f23365;
                    if (c82912 != null) {
                        float f = c7091.f23367;
                        if (f > 0.0f) {
                            C9044 c9044 = c7091.f23384;
                            List listM29095 = C11565.m29095(c9044.f29428, c9044.f29431, rectF, f, c82912.f27262, c7091.m19431(), c7091.f23398, c7091.f23377);
                            if (!listM29095.isEmpty()) {
                                C9044 c9045 = c7091.f23384;
                                if (C11565.m29098(c0774, rectF, c9045.f29428, c9045.f29431, ((C0774) listM29095.get(0)).f2795)) {
                                    if (c13802.f43775 != null) {
                                        if (c7091.m19432()) {
                                            it = c7091.f23372.values().iterator();
                                            while (it.hasNext()) {
                                                ((C5249) it.next()).f18497.close();
                                            }
                                            c7091.f23372.clear();
                                            c7091.f23376 = Collections.singletonList(c9327.f30323);
                                            this.f72575.removeCallbacks(c7091.f23390);
                                            c7091.f23364 = false;
                                            c7091.f23391.m6420();
                                            c7091.f23362 = true;
                                        }
                                        C0774 c0775 = c9327.f30323;
                                        C8299 c82913 = c13802.f43775;
                                        c13802.f43775 = null;
                                        c5249 = (C5249) c7091.f23372.put(c9327.f30323, new C5249(c0775, c82913));
                                        if (c5249 != null) {
                                            c5249.f18497.close();
                                        }
                                        ArrayList arrayList = c7091.f23375;
                                        arrayList.clear();
                                        arrayList.addAll(c7091.f23372.values());
                                        this.f72553.invalidate();
                                    } else if (c13802.f43776 instanceof C18740) {
                                        c7091.f23366 = Math.max(262144L, c7091.f23366 / 2);
                                        if (c7091.m19432()) {
                                            c7091.f23362 = false;
                                        } else {
                                            c7091.m19433();
                                        }
                                        c7091.f23382.add(c9327.f30323);
                                        this.f72553.invalidate();
                                    } else {
                                        c7091.f23386 = true;
                                        c7091.m19433();
                                    }
                                }
                            }
                        }
                    }
                } else if (c7091.f23376.contains(c9327.f30323)) {
                    if (c13802.f43775 != null) {
                        if (c7091.m19432()) {
                            it = c7091.f23372.values().iterator();
                            while (it.hasNext()) {
                                ((C5249) it.next()).f18497.close();
                            }
                            c7091.f23372.clear();
                            c7091.f23376 = Collections.singletonList(c9327.f30323);
                            this.f72575.removeCallbacks(c7091.f23390);
                            c7091.f23364 = false;
                            c7091.f23391.m6420();
                            c7091.f23362 = true;
                        }
                        C0774 c0776 = c9327.f30323;
                        C8299 c82914 = c13802.f43775;
                        c13802.f43775 = null;
                        c5249 = (C5249) c7091.f23372.put(c9327.f30323, new C5249(c0776, c82914));
                        if (c5249 != null) {
                            c5249.f18497.close();
                        }
                        ArrayList arrayList2 = c7091.f23375;
                        arrayList2.clear();
                        arrayList2.addAll(c7091.f23372.values());
                        this.f72553.invalidate();
                    } else if (c13802.f43776 instanceof C18740) {
                        c7091.f23366 = Math.max(262144L, c7091.f23366 / 2);
                        if (c7091.m19432()) {
                            c7091.f23362 = false;
                        } else {
                            c7091.m19433();
                        }
                        c7091.f23382.add(c9327.f30323);
                        this.f72553.invalidate();
                    } else {
                        c7091.f23386 = true;
                        c7091.m19433();
                    }
                }
            }
        }
        c13802.close();
        if (m50518() > 0) {
            m50533();
        }
        RunnableC5473 runnableC5473 = this.f72564;
        if (runnableC5473 != null) {
            runnableC5473.run();
        }
    }
}
