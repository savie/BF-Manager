package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.᩶ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QD */
/* JADX INFO: loaded from: classes.dex */
public final class C21476 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f68632;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f68634;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10046 f68635;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10046 f68638;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f68639;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object f68633 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f68637 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Runnable f68636 = new RunnableC10858(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48859(Runnable runnable) {
        this.f68636 = runnable;
    }

    public C21476(C10046 c10046, C10046 c10047) {
        if (c10046 == c10047 || c10046.f32208 != c10047.f32208 || c10046.f32213 != c10047.f32213 || c10046.f32209 != c10047.f32209 || !c10046.f32223.equals(c10047.f32223) || c10047.f32210 <= c10046.f32210) {
            throw new IllegalArgumentException("Invalid recovery graph copy configuration");
        }
        this.f68638 = c10046;
        this.f68635 = c10047;
        this.f68632 = BasicLabelFormatter.MILLION;
        m48854();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21476 m48853(C10046 c10046, C10046 c10047) {
        return new C21476(c10046, c10047, 0);
    }

    public C21476(C10046 c10046, C10046 c10047, int i) {
        if (c10046 != null && c10047 != null && (c10046.f32213 != c10047.f32213 || c10046.f32209 != c10047.f32209)) {
            throw new IllegalArgumentException("Invalid session graph copy configuration");
        }
        this.f68638 = c10046;
        this.f68635 = c10047;
        this.f68632 = BasicLabelFormatter.MILLION;
        m48854();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m48854() {
        C10046 c10046 = this.f68638;
        if (c10046 != null) {
            c10046.m25972();
        }
        try {
            C10046 c10047 = this.f68635;
            if (c10047 != null) {
                c10047.m25972();
            }
        } catch (Error | RuntimeException e) {
            if (c10046 != null) {
                c10046.m25975();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m48855(Object obj) {
        return this.f68637.get(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48858(Object obj, Object obj2) {
        this.f68637.put(obj, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m48856(C21697 c21697) throws IOException {
        C10046 c10046;
        C10046 c10047 = c21697.f69247;
        int i = c21697.f69246;
        int i2 = c21697.f69244;
        C10046 c10048 = this.f68638;
        if (c10047 != c10048 || ((c10046 = this.f68635) != null && (i2 != c10046.f32213 || i != c10046.f32209))) {
            throw new IOException("History tree belongs to another recovery generation");
        }
        if (c10048 == null && c10046 == null) {
            return c21697;
        }
        IdentityHashMap identityHashMap = this.f68637;
        C21697 c21698 = (C21697) identityHashMap.get(c21697);
        if (c21698 != null) {
            return c21698;
        }
        m48857();
        C21697 c21699 = new C21697(m48852(c21697.f69245), i2, i, c10046);
        identityHashMap.put(c21697, c21699);
        return c21699;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1339 m48852(AbstractC1339 abstractC1339) throws IOException {
        AbstractC1339 c17746;
        if (abstractC1339 == null) {
            return null;
        }
        IdentityHashMap identityHashMap = this.f68637;
        AbstractC1339 abstractC13310 = (AbstractC1339) identityHashMap.get(abstractC1339);
        if (abstractC13310 != null) {
            return abstractC13310;
        }
        m48857();
        boolean z = abstractC1339 instanceof C19238;
        Object obj = this.f68633;
        if (z) {
            C19238 c19238 = (C19238) abstractC1339;
            C7810 c7810 = c19238.f62239;
            if ((c7810 != null ? c7810.f26019 : null) != this.f68638) {
                throw new IOException("Text page belongs to another recovery generation");
            }
            Object objM44576 = c19238.m44576();
            c17746 = (C19238) identityHashMap.get(objM44576);
            if (c17746 == null) {
                m48857();
                C8051 c8051M44573 = c19238.m44573();
                C5311 c5311 = c8051M44573.f26678;
                try {
                    C10046 c10046 = this.f68635;
                    if (c10046 != null) {
                        c17746 = new C19238(obj, c10046.m25966(c5311));
                    } else {
                        int i = c19238.f4794;
                        char[] cArr = new char[i];
                        c5311.m15953(0, i, cArr, 0);
                        c17746 = new C19238(obj, c19238.m44569(), cArr, 0, i, null);
                    }
                    c8051M44573.close();
                    identityHashMap.put(objM44576, c17746);
                } catch (Throwable th) {
                    try {
                        c8051M44573.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } else {
            AbstractC1339[] abstractC1339Arr = ((C17746) abstractC1339).f58291;
            AbstractC1339[] abstractC1339Arr2 = new AbstractC1339[abstractC1339Arr.length];
            for (int i2 = 0; i2 < abstractC1339Arr.length; i2++) {
                abstractC1339Arr2[i2] = m48852(abstractC1339Arr[i2]);
            }
            c17746 = new C17746(obj, abstractC1339Arr2);
        }
        identityHashMap.put(abstractC1339, c17746);
        return c17746;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48857() {
        this.f68636.run();
        int i = this.f68634;
        if (i == this.f68632) {
            throw new C19481("Recovery graph copy object limit exceeded");
        }
        this.f68634 = i + 1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C10046 c10046 = this.f68638;
        if (this.f68639) {
            return;
        }
        this.f68639 = true;
        this.f68637.clear();
        try {
            C10046 c10047 = this.f68635;
            if (c10047 != null) {
                c10047.m25975();
            }
        } finally {
            if (c10046 != null) {
                c10046.m25975();
            }
        }
    }
}
