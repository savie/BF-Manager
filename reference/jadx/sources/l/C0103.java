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

/* JADX INFO: renamed from: l.֡֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0103 implements InterfaceC16974, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0745 f1047;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C14216 f1048;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20502 f1049;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public volatile long f1050;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public RunnableC12918 f1051;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f1052;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C16704 f1053;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f1054;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile C20565 f1055;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final long f1056;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17679 f1057;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile long f1058;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f1059;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f1060;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f1061;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f1062;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Handler f1063;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20565 f1064;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f1065;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f1066;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f1067;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f1068;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1069;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final long f1070;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f1071;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f1072;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C14216 f1073;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C20565 f1074;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1075;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9505 f1076;

    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1081(final C0103 c0103, C20502 c20502, final C8571 c8571, final boolean z, C20232 c20232, long j, final C20565 c20565, final C20232 c20233) {
        AbstractC1886 abstractC1886 = c20565.f66989;
        final C15627 c15627 = new C15627();
        c15627.f50822 = c20502;
        try {
            try {
                if (!c0103.m1087(c8571)) {
                    c15627.f50818 = false;
                    if (z) {
                        c15627.f50820 = C16704.m39178(c20232, c20502, c0103.f1056);
                        c15627.f50822 = null;
                    } else {
                        C0745 c0745 = new C0745(j, c20502);
                        if (abstractC1886.mo6140()) {
                            C14216 c14216 = c0103.f1048;
                            if (c14216 == null) {
                                throw new IOException("A cache directory is required for this image source");
                            }
                            C23388 c23388M34317 = c14216.m34317(abstractC1886, false, new InterfaceC5614() { // from class: l.᩹֫۬
                                @Override // l.InterfaceC5614
                                /* JADX INFO: renamed from: ֨ */
                                public final boolean mo2357() {
                                    return this.f71284.m1087(c8571);
                                }
                            });
                            try {
                                c0103.m1083(c8571, c23388M34317, c15627, c0745, false);
                                c23388M34317.close();
                            } catch (Throwable th) {
                                try {
                                    c23388M34317.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else {
                            c0103.m1083(c8571, c20565.f66989, c15627, c0745, false);
                        }
                        c20502.m46302(c0745.m3241());
                    }
                }
                if (c20232 != null) {
                    c20232.close();
                }
            } catch (Throwable th3) {
                if (c20232 != null) {
                    c20232.close();
                }
                throw th3;
            }
        } catch (IOException e) {
            e = e;
            c15627.f50817 = e;
            if (c20232 != null) {
                c20232.close();
            }
        } catch (OutOfMemoryError e2) {
            e = e2;
            c15627.f50817 = e;
            if (c20232 != null) {
                c20232.close();
            }
        } catch (RuntimeException e3) {
            e = e3;
            c15627.f50817 = e;
            if (c20232 != null) {
                c20232.close();
            }
        } catch (StackOverflowError e4) {
            e = e4;
            c15627.f50817 = e;
            if (c20232 != null) {
                c20232.close();
            }
        }
        c0103.f1063.post(new Runnable() { // from class: l.֨֫۬
            @Override // java.lang.Runnable
            public final void run() {
                C0103.m1082(this.f3423, z, c20565, c20233, c8571, c15627);
            }
        });
    }

    public C0103(ActivityC15481 activityC15481, ArrayList arrayList) {
        long jMin;
        ActivityManager activityManager = (ActivityManager) activityC15481.getSystemService("activity");
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
            C0745 c0745 = new C0745(Math.max(1048576L, jMin), null);
            File file = new File(activityC15481.getCacheDir(), "gallery-sources");
            this.f1054 = new SparseArray(3);
            this.f1053 = new C16704();
            this.f1063 = new Handler(Looper.getMainLooper());
            this.f1071 = Executors.newSingleThreadExecutor(new ThreadFactoryC17742());
            this.f1062 = Executors.newSingleThreadExecutor(new ThreadFactoryC18448());
            this.f1052 = new IdentityHashMap();
            this.f1066 = true;
            if (arrayList == null || arrayList.isEmpty() || c0745.m3238() < 1048576) {
                throw new IllegalArgumentException("Invalid gallery sources or bitmap budget");
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f1069 = arrayList2;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((AbstractC1886) it.next()) == null) {
                    throw new IllegalArgumentException("Null gallery source");
                }
            }
            this.f1047 = c0745;
            c0745.m3240(new RunnableC7981(3, this));
            long jMin2 = Math.min(X931RNG.BLOCK128_RESEED_MAX, c0745.m3238() / 8);
            this.f1056 = jMin2;
            this.f1072 = (c0745.m3238() / 3) * 2;
            this.f1070 = c0745.m3238() - (jMin2 * 3);
            this.f1073 = new C14216(file);
            this.f1048 = new C14216(file);
            return;
        }
        throw new IllegalArgumentException("Memory class must be positive");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1126(AbstractC17679 abstractC17679, int i) {
        m1071();
        if (this.f1061 || this.f1057 != null) {
            throw new IllegalStateException("Gallery session already attached or closed");
        }
        this.f1057 = abstractC17679;
        abstractC17679.getClass();
        this.f1068 = abstractC17679 instanceof C9214;
        abstractC17679.mo19695(this, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1131(AbstractC17679 abstractC17679, int i) {
        AbstractC17679 abstractC176710;
        m1071();
        if (this.f1061 || (abstractC176710 = this.f1057) == null) {
            throw new IllegalStateException("Gallery session is not attached");
        }
        abstractC176710.mo19700();
        this.f1057 = null;
        m1126(abstractC17679, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1125(RunnableC12918 runnableC12918) {
        m1071();
        this.f1051 = runnableC12918;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1122() {
        return this.f1069.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20937 m1123(int i) {
        m1071();
        C20565 c20565 = (C20565) this.f1054.get(i);
        if (c20565 == null || c20565.f67001) {
            return null;
        }
        return c20565.f67004;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m1132(int i) {
        C20565 c20565 = (C20565) this.f1054.get(i);
        return c20565 != null && c20565.f66981;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m1129(int i) {
        AbstractC1886 abstractC1886 = (AbstractC1886) this.f1069.get(i);
        abstractC1886.getClass();
        return abstractC1886 instanceof C17970;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m1121(int i) {
        m1071();
        this.f1050++;
        this.f1059 = i;
        this.f1055 = (C20565) this.f1054.get(i);
        if (this.f1055 != null) {
            this.f1055.f66994 = false;
            if (this.f1055.f67004 != null) {
                this.f1055.f67008 = true;
            }
            this.f1055.f67005 |= this.f1055.f67002;
            this.f1055.f67002 = true;
        }
        for (int i2 = 0; i2 < this.f1054.size(); i2++) {
            C20565 c20565 = (C20565) this.f1054.valueAt(i2);
            if (!this.f1068 && c20565 != this.f1055) {
                c20565.m46406();
            }
            c20565.m46405();
        }
        for (int i3 = 0; i3 < this.f1054.size(); i3++) {
            ((C20565) this.f1054.valueAt(i3)).f67007 = false;
        }
        m1093();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m1128() {
        if (!this.f1068 || this.f1061) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f1054.size(); i++) {
            C20565 c20565 = (C20565) this.f1054.valueAt(i);
            boolean zMo23733 = this.f1057.mo23733(c20565.f66993);
            if (c20565.f67013 != zMo23733) {
                c20565.f67013 = zMo23733;
                if (!zMo23733) {
                    c20565.m46406();
                }
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < this.f1054.size(); i2++) {
                ((C20565) this.f1054.valueAt(i2)).f66984 = false;
            }
        }
        m1093();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1130(int i, long j) {
        m1071();
        if (this.f1061) {
            return;
        }
        C20565 c20565 = (C20565) this.f1054.get(i);
        if (c20565 != null) {
            c20565.m46411();
        }
        C20565 c20566 = new C20565(this, i, j, (AbstractC1886) this.f1069.get(i));
        this.f1054.put(i, c20566);
        if (i == this.f1059) {
            this.f1055 = c20566;
            c20566.f67002 = true;
        }
        m1093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1124(int i, long j) {
        m1071();
        C20565 c20565 = (C20565) this.f1054.get(i);
        if (c20565 == null || c20565.f67006 != j) {
            return;
        }
        this.f1054.remove(i);
        if (this.f1055 == c20565) {
            this.f1055 = null;
        }
        c20565.m46411();
        m1093();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m1120() {
        AbstractC17679 abstractC17679;
        int i = this.f1059;
        m1071();
        if (this.f1061 || (abstractC17679 = this.f1057) == null) {
            return;
        }
        abstractC17679.mo19712(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1127(boolean z) {
        m1071();
        if (this.f1061 || this.f1066 == z) {
            return;
        }
        this.f1066 = z;
        this.f1058++;
        for (int i = 0; i < this.f1054.size(); i++) {
            C20565 c20565 = (C20565) this.f1054.valueAt(i);
            c20565.m46406();
            if (z && c20565.f67004 != null) {
                c20565.f67008 = true;
                c20565.f67005 = true;
            }
            c20565.m46405();
        }
        AbstractC17679 abstractC17679 = this.f1057;
        if (abstractC17679 != null) {
            abstractC17679.invalidate();
        }
        m1093();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m1133() {
        m1071();
        this.f1058++;
        for (int i = 0; i < this.f1054.size(); i++) {
            C20565 c20565 = (C20565) this.f1054.valueAt(i);
            c20565.f66985 = Math.max(262144L, c20565.f66985 / 2);
            c20565.m46406();
        }
        AbstractC17679 abstractC17679 = this.f1057;
        if (abstractC17679 != null) {
            abstractC17679.invalidate();
        }
        m1093();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m1071();
        if (this.f1061) {
            return;
        }
        this.f1061 = true;
        this.f1047.m3240((RunnableC7981) null);
        this.f1066 = false;
        this.f1055 = null;
        this.f1051 = null;
        AbstractC17679 abstractC17679 = this.f1057;
        if (abstractC17679 != null) {
            abstractC17679.mo19700();
        }
        this.f1057 = null;
        for (int i = 0; i < this.f1054.size(); i++) {
            ((C20565) this.f1054.valueAt(i)).m46411();
        }
        this.f1054.clear();
        this.f1071.execute(new RunnableC3787(6, this));
        this.f1071.shutdown();
        this.f1062.execute(new RunnableC19265(1, this));
        this.f1062.shutdown();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1088(C0103 c0103) {
        c0103.m1115();
        c0103.m1105(true);
        C14216 c14216 = c0103.f1073;
        if (c14216 != null) {
            c14216.close();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1097(C0103 c0103) {
        C14216 c14216 = c0103.f1048;
        if (c14216 != null) {
            c14216.close();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m1071() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery UI access off main thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void m1093() {
        if (this.f1061) {
            return;
        }
        this.f1060 = true;
        if (this.f1075) {
            return;
        }
        this.f1075 = true;
        this.f1063.post(new RunnableC14990(4, this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m1103(final C0103 c0103) {
        c0103.f1075 = false;
        if (c0103.f1061 || c0103.f1067) {
            return;
        }
        long jM1109 = c0103.m1109();
        if (jM1109 != 0 && c0103.f1047.m3238() - c0103.f1047.m3241() < jM1109 && c0103.f1074 == null) {
            for (int size = c0103.f1054.size() - 1; size >= 0; size--) {
                C20565 c20565 = (C20565) c0103.f1054.valueAt(size);
                if (c20565 != c0103.f1055 && (c20565.f67012 != null || c20565.f66979 != null)) {
                    c0103.f1057.mo19712(c20565.f66993);
                }
            }
        }
        c0103.m1112();
        final C8571 c8571M1099 = c0103.m1099();
        if (c8571M1099 != null) {
            c8571M1099.f29643 = c8571M1099.f29640 != c0103.f1055;
        }
        c0103.f1060 = false;
        c0103.f1067 = true;
        c0103.f1071.execute(new Runnable() { // from class: l.۠֫۬
            @Override // java.lang.Runnable
            public final void run() {
                C0103.m1119(this.f25884, c8571M1099);
            }
        });
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1119(final C0103 c0103, final C8571 c8571) {
        C20565 c20565;
        final C15627 c15627 = new C15627();
        try {
            if (c0103.f1064 != (c8571 == null ? c0103.f1055 : c8571.f29640) || !c0103.f1066 || ((c20565 = c0103.f1064) != null && c20565.f67001)) {
                c0103.m1115();
            }
            c0103.m1105(false);
            if (c8571 != null && !c8571.f29640.f67001 && c0103.f1066 && !c0103.f1061) {
                c0103.m1104(c8571, c15627);
            }
        } catch (IOException | OutOfMemoryError | RuntimeException | StackOverflowError e) {
            c15627.f50817 = e;
            if (c8571 != null && c8571.f29650 == null && c0103.f1064 == c8571.f29640) {
                c0103.m1115();
            }
        }
        if (c0103.f1061 || (c8571 != null && c8571.f29640.f67001)) {
            c15627.close();
            c0103.m1115();
        }
        c0103.f1063.post(new Runnable() { // from class: l.ܰ֫۬
            @Override // java.lang.Runnable
            public final void run() {
                C0103.m1080(this.f44622, c8571, c15627);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1080(C0103 c0103, C8571 c8571, C15627 c15627) {
        c0103.f1067 = false;
        if (c8571 != null) {
            c0103.m1084(c8571, c15627);
        } else {
            c15627.close();
        }
        if (!c0103.f1061 && (c0103.f1060 || c0103.m1099() != null)) {
            c0103.m1093();
        }
        c0103.m1112();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8571 m1099() {
        C8571 c8571M1096;
        C8571 c8571M1078;
        C8571 c8571M1097;
        if (!this.f1066 || this.f1061) {
            return null;
        }
        C8571 c8571M1098 = m1096(this.f1055);
        if (c8571M1098 != null) {
            return c8571M1098;
        }
        if (this.f1068) {
            for (int i = 0; i < this.f1054.size(); i++) {
                C20565 c20565 = (C20565) this.f1054.valueAt(i);
                if (c20565 != this.f1055 && c20565.f67013 && (c8571M1097 = m1096(c20565)) != null) {
                    return c8571M1097;
                }
            }
        }
        C8571 c8571M1079 = m1078(this.f1055);
        if (c8571M1079 != null) {
            return c8571M1079;
        }
        if (this.f1068) {
            for (int i2 = 0; i2 < this.f1054.size(); i2++) {
                C20565 c20566 = (C20565) this.f1054.valueAt(i2);
                if (c20566 != this.f1055 && c20566.f67013 && (c8571M1078 = m1078(c20566)) != null) {
                    return c8571M1078;
                }
            }
        }
        if (!this.f1068) {
            return null;
        }
        for (int i3 = 0; i3 < this.f1054.size(); i3++) {
            C20565 c20567 = (C20565) this.f1054.valueAt(i3);
            if (c20567 != this.f1055 && !c20567.f67013 && c20567.f66989.mo6138() && (c8571M1096 = m1096(c20567)) != null) {
                return c8571M1096;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8571 m1078(C20565 c20565) {
        if (c20565 == null || c20565.f67001 || c20565.f67008) {
            return null;
        }
        if (c20565.m46409() && c20565.f66992) {
            return null;
        }
        if (c20565.f66979 != null) {
            for (C1036 c1036 : c20565.f66982) {
                if (!(c20565.f66996 ? c20565.f67009 : c20565.f67016).containsKey(c1036) && !c20565.f66987.contains(c1036)) {
                    return new C8571(c20565, c1036, this.f1058, this.f1050);
                }
            }
        }
        if (c20565.f67004 == null || c20565.f66978) {
            return null;
        }
        for (C22910 c22910 : c20565.f66998) {
            if (!c20565.f66980.containsKey(c22910) && !c20565.f67014.contains(c22910)) {
                return new C8571(c20565, c22910, false, this.f1058, this.f1050);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C8571 m1096(C20565 c20565) {
        if (c20565 == null || c20565.f67001) {
            return null;
        }
        if (c20565.f66999 && (c20565 == this.f1055 || (this.f1068 && c20565.f67013))) {
            if (this.f1047.m3238() - this.f1047.m3241() < (this.f1068 ? Math.min(1048576L, this.f1047.m3238() / 128) : this.f1072)) {
                return null;
            }
            return new C8571(c20565, null, false, this.f1058, this.f1050);
        }
        if (c20565.f66981) {
            return null;
        }
        if (c20565 != this.f1055 && c20565.f66995) {
            return null;
        }
        if (c20565 != this.f1055 && !c20565.f66989.mo6138()) {
            return null;
        }
        if (c20565.f67004 == null) {
            if (c20565 == this.f1074) {
                return null;
            }
            return new C8571(c20565, null, false, this.f1058, this.f1050);
        }
        if (c20565.f67008) {
            return new C8571(c20565, null, true, this.f1058, this.f1050);
        }
        long jM1109 = m1109();
        if (c20565 != this.f1055 || jM1109 <= 0 || this.f1047.m3238() - this.f1047.m3241() < jM1109) {
            return null;
        }
        return new C8571(c20565, null, false, this.f1058, this.f1050);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m1109() {
        if (this.f1068 || !this.f1066 || this.f1055 == null || this.f1055.f67001) {
            return 0L;
        }
        if (this.f1055.f66999) {
            return this.f1068 ? Math.min(1048576L, this.f1047.m3238() / 128) : this.f1072;
        }
        if (this.f1055.f66979 == null || this.f1055.f66994 || this.f1055.f67008) {
            return 0L;
        }
        long jM25123 = this.f1055.f66979.m25123();
        if (jM25123 <= this.f1047.m3238() - this.f1055.f66979.m25122()) {
            return jM25123;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ۜ֫۬] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.ۘ֫۬] */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.᩺֫۬] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1083(final C8571 c8571, AbstractC1886 abstractC1886, C15627 c15627, C0745 c0745, boolean z) {
        C9505 c9505M24340;
        if (abstractC1886 instanceof C17970) {
            C14588 c14588Mo5283 = abstractC1886.mo5283();
            c15627.f50820 = ((C17970) abstractC1886).m41799(c0745, this.f1056, (C3630) new InterfaceC5614() { // from class: l.ۘ֫۬
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f13335.m1087(c8571);
                }
            });
            abstractC1886.m6137(c14588Mo5283);
            c15627.f50819 = new C20937(abstractC1886.mo5281(), c15627.f50820.f65655.getWidth(), c15627.f50820.f65655.getHeight(), 1, "video/*", c14588Mo5283);
            return;
        }
        long jMin = this.f1068 ? Math.min(1048576L, this.f1047.m3238() / 128) : this.f1056;
        C2156 c2156M8058 = C2591.m8058(abstractC1886, (C6453) new InterfaceC5614() { // from class: l.ۜ֫۬
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                return this.f21826.m1087(c8571);
            }
        });
        C9919 c9919M8059 = C2591.m8059(abstractC1886, c2156M8058, c0745, this.f1056, this.f1072, (C22682) new InterfaceC5614() { // from class: l.᩺֫۬
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                return this.f73865.m1087(c8571);
            }
        });
        c15627.f50821 = c9919M8059;
        if (c9919M8059 != null) {
            c15627.f50819 = c9919M8059.f33901;
            return;
        }
        C20937 c20937M39183 = this.f1053.m39183(abstractC1886, c2156M8058.f7836, c2156M8058.f7835.f36925);
        c15627.f50819 = c20937M39183;
        if (c20937M39183.f68252 != null) {
            if (!z || abstractC1886.mo6139() == null) {
                c9505M24340 = null;
            } else {
                m1115();
                try {
                    c9505M24340 = C9505.m24340(abstractC1886, c15627.f50819, c0745, new InterfaceC5614() { // from class: l.ܶ֫۬
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return this.f48698.m1087(c8571);
                        }
                    });
                    this.f1076 = c9505M24340;
                    this.f1064 = c8571.f29640;
                } catch (C10354 unused) {
                    c9505M24340 = null;
                }
            }
            c15627.f50820 = C3858.m11179(abstractC1886, c15627.f50819, c0745, jMin, c9505M24340, new InterfaceC5614() { // from class: l.᩸֫۬
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f69260.m1087(c8571);
                }
            }, C0475.f2151);
            return;
        }
        if (!C9505.m24341(c20937M39183.f68249)) {
            jMin = this.f1056;
        }
        if (m1087(c8571)) {
            return;
        }
        c15627.f50820 = this.f1053.m39182(abstractC1886, c15627.f50819, c0745, (!this.f1068 && z && c8571.f29640 == this.f1055 && "image/png".equals(c15627.f50819.f68249)) ? Math.min(X931RNG.BLOCK128_RESEED_MAX, this.f1056 * 2) : jMin);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private long m1073(C20565 c20565) {
        C20232 c20232 = c20565.f67012;
        if (c20232 == null || c20565.f67007) {
            return 0L;
        }
        long allocationByteCount = c20232.f65655.getAllocationByteCount();
        long j = this.f1056;
        if (allocationByteCount <= j) {
            return 0L;
        }
        int i = 2;
        while (C16704.m39174(c20565.f67012.f65655.getWidth(), c20565.f67012.f65655.getHeight(), i) > j) {
            i *= 2;
        }
        return C16704.m39174(c20565.f67012.f65655.getWidth(), c20565.f67012.f65655.getHeight(), i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m1112() {
        final C20565 c20565;
        long jMin;
        C20565 c20566;
        if (this.f1061 || !this.f1066 || this.f1074 != null || this.f1055 == null) {
            return;
        }
        if ((this.f1055.f67004 != null || this.f1055.f66981) && !this.f1055.f67008) {
            if (this.f1068 || !this.f1066 || this.f1061 || m1109() > 0) {
                c20565 = null;
            } else {
                long jM3238 = this.f1047.m3238() - this.f1047.m3241();
                int i = 0;
                while (true) {
                    if (i < this.f1054.size()) {
                        c20566 = (C20565) this.f1054.valueAt(i);
                        long jM1073 = m1073(c20566);
                        if (c20566 == this.f1055 || jM1073 <= 0 || jM1073 > jM3238) {
                            i++;
                        }
                    } else {
                        if (jM3238 >= this.f1056) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < this.f1054.size()) {
                                    c20566 = (C20565) this.f1054.valueAt(i2);
                                    if (c20566 == this.f1055 || c20566.f67001 || c20566.f66981 || c20566.f66995 || c20566.f67004 != null || !c20566.f66989.mo6138()) {
                                        i2++;
                                    }
                                }
                            }
                        }
                        c20565 = null;
                    }
                    c20565 = c20566;
                }
            }
            if (c20565 == null) {
                return;
            }
            final C20232 c20232 = c20565.f67012;
            boolean z = c20232 != null;
            long jM1074 = z ? m1073(c20565) : this.f1056;
            if (!this.f1055.f66978 || (this.f1055.f66979 != null && this.f1055.f66979.m25121())) {
                jMin = this.f1056;
            } else {
                jMin = Math.min(this.f1072, this.f1047.m3238() - this.f1047.m3241());
            }
            final long j = jMin;
            final C20502 c20502M3239 = this.f1047.m3239(jM1074);
            if (c20502M3239 == null) {
                return;
            }
            C20232 c20232M45735 = z ? c20232.m45735() : null;
            this.f1074 = c20565;
            this.f1065 = z ? jM1074 : 0L;
            this.f1049 = z ? null : c20502M3239;
            final C8571 c8571 = new C8571(c20565, null, false, this.f1058, this.f1050);
            c8571.f29643 = true;
            final boolean z2 = z;
            final C20232 c20233 = c20232M45735;
            this.f1062.execute(new Runnable() { // from class: l.᩵֫۬
                @Override // java.lang.Runnable
                public final void run() {
                    C0103.m1081(this.f61871, c20502M3239, c8571, z2, c20233, j, c20565, c20232);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1082(C0103 c0103, boolean z, C20565 c20565, C20232 c20232, C8571 c8571, C15627 c15627) {
        c0103.f1074 = null;
        c0103.f1065 = 0L;
        c0103.f1049 = null;
        if (z) {
            if (!c0103.f1061 && c0103.f1066 && !c20565.f67001 && c20565 != c0103.f1055 && c20565.f67012 == c20232 && c8571.f29647 == c0103.f1058 && !c15627.f50818) {
                C20232 c20233 = c15627.f50820;
                if (c20233 == null) {
                    c20565.f67007 = true;
                } else {
                    c15627.f50820 = null;
                    c20565.f67012 = c20233;
                    c20232.close();
                }
            }
            c15627.close();
        } else {
            c0103.m1084(c8571, c15627);
        }
        if (c0103.f1061) {
            return;
        }
        if (c0103.f1055 != null) {
            c0103.f1055.f66984 = false;
        }
        AbstractC17679 abstractC17679 = c0103.f1057;
        if (abstractC17679 != null) {
            abstractC17679.invalidate();
        }
        c0103.m1093();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m1104(final C8571 c8571, C15627 c15627) throws IOException {
        C20565 c20565 = c8571.f29640;
        C22910 c22910 = c8571.f29650;
        if (m1087(c8571)) {
            return;
        }
        c15627.f50818 = false;
        if (c8571.f29648) {
            c15627.f50823 = (c8571.f29649 && c20565.f66989.mo6141()) || !c20565.f67004.f68245.equals(c20565.f66989.mo5283());
            return;
        }
        C1036 c1036 = c8571.f29644;
        if (c1036 != null) {
            c15627.f50820 = c8571.f29646.m25117(c1036.f4829, c1036.f4826, this.f1047, c8571.f29641, new C11393(this, c8571));
            return;
        }
        if (c22910 == null) {
            m1083(c8571, m1102(c8571), c15627, this.f1047, true);
            return;
        }
        C20565 c20566 = this.f1064;
        C0745 c0745 = this.f1047;
        if (c20566 != c20565) {
            m1115();
            AbstractC1886 abstractC1886M1102 = m1102(c8571);
            C20937 c20937 = c20565.f67004;
            this.f1076 = c20937.f68252 == null ? C9505.m24339(abstractC1886M1102, c20937) : C9505.m24340(abstractC1886M1102, c20937, c0745, new InterfaceC5614() { // from class: l.ۖ֫۬
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f7994.m1087(c8571);
                }
            });
            this.f1064 = c20565;
        }
        c15627.f50820 = this.f1076.m24342(new Rect(c22910.f74479, c22910.f74473, c22910.f74471, c22910.f74474), c22910.f74477, c0745, new InterfaceC5614() { // from class: l.ۚ֫۬
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                return this.f17607.m1087(c8571);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m1087(C8571 c8571) {
        if (this.f1061 || !this.f1066 || c8571.f29647 != this.f1058 || c8571.f29640.f67001 || ((c8571.f29645 != this.f1050 && ((!this.f1068 || !c8571.f29640.f66989.mo6138() || (!c8571.f29643 && c8571.f29640.f66989.mo6140())) && (!c8571.f29643 || c8571.f29639 != null || c8571.f29640 != this.f1055 || c8571.f29650 != null || c8571.f29644 != null || !c8571.f29640.f66989.mo6138()))) || (((c8571.f29650 != null || c8571.f29644 != null) && !m1107(c8571.f29640)) || (c8571.f29644 != null && !c8571.f29640.f66982.contains(c8571.f29644))))) {
            c8571.f29642 = true;
        }
        return c8571.f29642;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m1107(C20565 c20565) {
        if (this.f1068) {
            return c20565.f67013;
        }
        return c20565 == this.f1055;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AbstractC1886 m1102(final C8571 c8571) throws IOException {
        C20565 c20565 = c8571.f29640;
        AbstractC1886 abstractC1886 = c20565.f66989;
        if (!abstractC1886.mo6140()) {
            return abstractC1886;
        }
        IdentityHashMap identityHashMap = this.f1052;
        C23388 c23388 = (C23388) identityHashMap.get(c20565);
        if (c23388 != null) {
            return c23388;
        }
        C14216 c14216 = this.f1073;
        if (c14216 == null) {
            throw new IOException("A cache directory is required for this image source");
        }
        C23388 c23388M34317 = c14216.m34317(abstractC1886, !c8571.f29643, new InterfaceC5614() { // from class: l.۬֫۬
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                return this.f42645.m1087(c8571);
            }
        });
        identityHashMap.put(c20565, c23388M34317);
        return c23388M34317;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m1105(boolean z) {
        Iterator it = this.f1052.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C20565 c20565 = (C20565) entry.getKey();
            if (z || c20565.f67001 || !m1107(c20565)) {
                if (this.f1064 == c20565) {
                    m1115();
                }
                ((C23388) entry.getValue()).close();
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m1115() {
        try {
            C9505 c9505 = this.f1076;
            if (c9505 != null) {
                c9505.close();
            }
        } catch (IOException unused) {
        } finally {
            this.f1076 = null;
            this.f1064 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x0203 A[LOOP:0: B:138:0x01fd->B:140:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0243  */
    /* JADX WARN: Code duplicated, block: B:146:0x025c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0262  */
    /* JADX WARN: Code duplicated, block: B:150:0x0276  */
    /* JADX WARN: Code duplicated, block: B:151:0x0279  */
    /* JADX WARN: Code duplicated, block: B:153:0x0289  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1084(C8571 c8571, C15627 c15627) {
        AbstractC17679 abstractC17679;
        C19860 c19860;
        Iterator it;
        int i;
        AbstractC17679 abstractC176710;
        C20565 c20565 = c8571.f29640;
        if (this.f1061 || !this.f1066 || c8571.f29647 != this.f1058 || c20565.f67001 || this.f1054.get(c20565.f66993) != c20565 || c15627.f50818 || m1087(c8571)) {
            c15627.close();
            return;
        }
        boolean z = true;
        if (c8571.f29643 && c20565.f67004 == null && c15627.f50817 != null && (!this.f1068 || !c20565.f67013 || !(c15627.f50817 instanceof C10354))) {
            c20565.f66995 = true;
            c20565.f66999 = this.f1068 && (c15627.f50817 instanceof C10354);
            c15627.close();
            return;
        }
        Throwable th = c15627.f50817;
        if ((th instanceof C23760) || c15627.f50823) {
            c15627.close();
            int i2 = c20565.f66993;
            m1071();
            if (this.f1061 || (abstractC17679 = this.f1057) == null) {
                return;
            }
            abstractC17679.mo19712(i2);
            return;
        }
        if (c8571.f29648) {
            c20565.f67008 = false;
            if (th != null) {
                int i3 = c20565.f66993;
                m1071();
                if (!this.f1061 && (abstractC176710 = this.f1057) != null) {
                    abstractC176710.mo19712(i3);
                }
            } else {
                c20565.m46405();
            }
        } else {
            C1036 c1036 = c8571.f29644;
            if (c1036 != null) {
                C20232 c20232 = c15627.f50820;
                if (c20232 != null) {
                    HashMap map = c20565.f66996 ? c20565.f67009 : c20565.f67016;
                    c15627.f50820 = null;
                    C20232 c20233 = (C20232) map.put(c1036, c20232);
                    if (c20233 != null) {
                        c20233.close();
                    }
                    c20565.m46404();
                    this.f1057.invalidate();
                } else {
                    if (th instanceof C10354) {
                        c20565.f66985 = Math.max(262144L, c20565.f66985 / 2);
                        c20565.m46399();
                        c20565.f66982 = new ArrayList();
                        c20565.f66984 = false;
                        this.f1057.invalidate();
                    }
                    c20565.f66987.add(c8571.f29644);
                }
            } else if (c8571.f29650 == null) {
                C9919 c9919 = c8571.f29639;
                if (c9919 != null && c15627.f50821 == null) {
                    c20565.f66994 = true;
                    c15627.close();
                    return;
                }
                if (c15627.f50820 == null && c15627.f50821 == null) {
                    boolean z2 = th instanceof C10354;
                    if (!z2 || (c15627.f50822 == null && c20565.f66999)) {
                        z = false;
                    }
                    c20565.f66999 = z;
                    c20565.f66981 = !z;
                    if (!z) {
                        AbstractC17679 abstractC176711 = this.f1057;
                        int i4 = c20565.f66993;
                        long j = c20565.f67006;
                        if (th instanceof C4708) {
                            i = R.string.MT_Protector;
                        } else if (th instanceof C14858) {
                            i = R.string.MT_Protector;
                        } else {
                            i = (z2 || (th instanceof OutOfMemoryError) || (th instanceof C24038)) ? R.string.MT_Protector : R.string.MT_Protector;
                        }
                        abstractC176711.mo19694(i4, i, j);
                    }
                } else {
                    if (c9919 != null) {
                        c9919.m25119(c20565.f66991);
                    }
                    c20565.f66995 = false;
                    c20565.f66999 = false;
                    c20565.f66981 = false;
                    c20565.f67004 = c15627.f50819;
                    C20502 c20502 = c15627.f50822;
                    c15627.f50822 = null;
                    c20565.f66991 = c20502;
                    C20232 c20234 = c15627.f50820;
                    c15627.f50820 = null;
                    c20565.f67012 = c20234;
                    C9919 c99110 = c15627.f50821;
                    c15627.f50821 = null;
                    c20565.f66979 = c99110;
                    AbstractC1886 abstractC1886 = c20565.f66989;
                    abstractC1886.getClass();
                    if (!(abstractC1886 instanceof C17970) && c20565.f66979 == null) {
                        z = false;
                    }
                    c20565.f66978 = z;
                    if (!this.f1057.mo19698(c20565.f66993, c20565.f67006, c20565)) {
                        c20565.m46411();
                    }
                    c20565.m46405();
                }
            } else if (m1107(c20565)) {
                if (c20565.m46409()) {
                    C22910 c22910 = c8571.f29650;
                    RectF rectF = c20565.f66983;
                    C20232 c20235 = c20565.f67012;
                    if (c20235 != null) {
                        float f = c20565.f66986;
                        if (f > 0.0f) {
                            C20937 c20937 = c20565.f67004;
                            List listM12169 = C4336.m12169(c20937.f68250, c20937.f68251, rectF, f, c20235.f65654, c20565.m46410(), c20565.f67015, c20565.f66990);
                            if (!listM12169.isEmpty()) {
                                C20937 c20938 = c20565.f67004;
                                if (C4336.m12172(c22910, rectF, c20938.f68250, c20938.f68251, ((C22910) listM12169.get(0)).f74477)) {
                                    if (c15627.f50820 != null) {
                                        if (c20565.m46409()) {
                                            it = c20565.f66980.values().iterator();
                                            while (it.hasNext()) {
                                                ((C19860) it.next()).f63693.close();
                                            }
                                            c20565.f66980.clear();
                                            c20565.f66998 = Collections.singletonList(c8571.f29650);
                                            this.f1063.removeCallbacks(c20565.f67010);
                                            c20565.f66992 = false;
                                            c20565.f67011.m9804();
                                            c20565.f66984 = true;
                                        }
                                        C22910 c22911 = c8571.f29650;
                                        C20232 c20236 = c15627.f50820;
                                        c15627.f50820 = null;
                                        c19860 = (C19860) c20565.f66980.put(c8571.f29650, new C19860(c22911, c20236));
                                        if (c19860 != null) {
                                            c19860.f63693.close();
                                        }
                                        ArrayList arrayList = c20565.f66997;
                                        arrayList.clear();
                                        arrayList.addAll(c20565.f66980.values());
                                        this.f1057.invalidate();
                                    } else if (c15627.f50817 instanceof C10354) {
                                        c20565.f66985 = Math.max(262144L, c20565.f66985 / 2);
                                        if (c20565.m46409()) {
                                            c20565.f66984 = false;
                                        } else {
                                            c20565.m46406();
                                        }
                                        c20565.f67014.add(c8571.f29650);
                                        this.f1057.invalidate();
                                    } else {
                                        c20565.f66978 = true;
                                        c20565.m46406();
                                    }
                                }
                            }
                        }
                    }
                } else if (c20565.f66998.contains(c8571.f29650)) {
                    if (c15627.f50820 != null) {
                        if (c20565.m46409()) {
                            it = c20565.f66980.values().iterator();
                            while (it.hasNext()) {
                                ((C19860) it.next()).f63693.close();
                            }
                            c20565.f66980.clear();
                            c20565.f66998 = Collections.singletonList(c8571.f29650);
                            this.f1063.removeCallbacks(c20565.f67010);
                            c20565.f66992 = false;
                            c20565.f67011.m9804();
                            c20565.f66984 = true;
                        }
                        C22910 c22912 = c8571.f29650;
                        C20232 c20237 = c15627.f50820;
                        c15627.f50820 = null;
                        c19860 = (C19860) c20565.f66980.put(c8571.f29650, new C19860(c22912, c20237));
                        if (c19860 != null) {
                            c19860.f63693.close();
                        }
                        ArrayList arrayList2 = c20565.f66997;
                        arrayList2.clear();
                        arrayList2.addAll(c20565.f66980.values());
                        this.f1057.invalidate();
                    } else if (c15627.f50817 instanceof C10354) {
                        c20565.f66985 = Math.max(262144L, c20565.f66985 / 2);
                        if (c20565.m46409()) {
                            c20565.f66984 = false;
                        } else {
                            c20565.m46406();
                        }
                        c20565.f67014.add(c8571.f29650);
                        this.f1057.invalidate();
                    } else {
                        c20565.f66978 = true;
                        c20565.m46406();
                    }
                }
            }
        }
        c15627.close();
        if (m1109() > 0) {
            m1093();
        }
        RunnableC12918 runnableC12918 = this.f1051;
        if (runnableC12918 != null) {
            runnableC12918.run();
        }
    }
}
