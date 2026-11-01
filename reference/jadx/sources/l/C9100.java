package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۡ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9100 implements AutoCloseable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C16072 f31019;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31021;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31023;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16072 f31024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f31025;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f31020 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f31018 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Runnable f31022 = new RunnableC19683();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23448(Runnable runnable) {
        this.f31022 = runnable;
    }

    public C9100(C16072 c16072, C16072 c16073) {
        if (c16072 == c16073 || c16072.f51982 != c16073.f51982 || c16072.f51978 != c16073.f51978 || c16072.f51976 != c16073.f51976 || !c16072.f51979.equals(c16073.f51979) || c16073.f51980 <= c16072.f51980) {
            throw new IllegalArgumentException("Invalid recovery graph copy configuration");
        }
        this.f31024 = c16072;
        this.f31019 = c16073;
        this.f31023 = BasicLabelFormatter.MILLION;
        m23443();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9100 m23442(C16072 c16072, C16072 c16073) {
        return new C9100(c16072, c16073, 0);
    }

    public C9100(C16072 c16072, C16072 c16073, int i) {
        if (c16072 != null && c16073 != null && (c16072.f51978 != c16073.f51978 || c16072.f51976 != c16073.f51976)) {
            throw new IllegalArgumentException("Invalid session graph copy configuration");
        }
        this.f31024 = c16072;
        this.f31019 = c16073;
        this.f31023 = BasicLabelFormatter.MILLION;
        m23443();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m23443() {
        C16072 c16072 = this.f31024;
        if (c16072 != null) {
            c16072.m38089();
        }
        try {
            C16072 c16073 = this.f31019;
            if (c16073 != null) {
                c16073.m38089();
            }
        } catch (Error | RuntimeException e) {
            if (c16072 != null) {
                c16072.m38088();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m23444(Object obj) {
        return this.f31018.get(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23447(Object obj, Object obj2) {
        this.f31018.put(obj, obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m23445(C14744 c14744) throws IOException {
        C16072 c16072;
        C16072 c16073 = c14744.f48220;
        int i = c14744.f48223;
        int i2 = c14744.f48221;
        C16072 c16074 = this.f31024;
        if (c16073 != c16074 || ((c16072 = this.f31019) != null && (i2 != c16072.f51978 || i != c16072.f51976))) {
            throw new IOException("History tree belongs to another recovery generation");
        }
        if (c16074 == null && c16072 == null) {
            return c14744;
        }
        IdentityHashMap identityHashMap = this.f31018;
        C14744 c14745 = (C14744) identityHashMap.get(c14744);
        if (c14745 != null) {
            return c14745;
        }
        m23446();
        C14744 c14746 = new C14744(m23441(c14744.f48222), i2, i, c16072);
        identityHashMap.put(c14744, c14746);
        return c14746;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC0631 m23441(AbstractC0631 abstractC0631) throws IOException {
        AbstractC0631 c1337;
        if (abstractC0631 == null) {
            return null;
        }
        IdentityHashMap identityHashMap = this.f31018;
        AbstractC0631 abstractC0632 = (AbstractC0631) identityHashMap.get(abstractC0631);
        if (abstractC0632 != null) {
            return abstractC0632;
        }
        m23446();
        boolean z = abstractC0631 instanceof C16155;
        Object obj = this.f31020;
        if (z) {
            C16155 c16155 = (C16155) abstractC0631;
            C7605 c7605 = c16155.f52216;
            if ((c7605 != null ? c7605.f25159 : null) != this.f31024) {
                throw new IOException("Text page belongs to another recovery generation");
            }
            Object objM38241 = c16155.m38241();
            c1337 = (C16155) identityHashMap.get(objM38241);
            if (c1337 == null) {
                m23446();
                C21093 c21093M38247 = c16155.m38247();
                C13625 c13625 = c21093M38247.f68721;
                try {
                    C16072 c16072 = this.f31019;
                    if (c16072 != null) {
                        c1337 = new C16155(obj, c16072.m38092(c13625));
                    } else {
                        int i = c16155.f2727;
                        char[] cArr = new char[i];
                        c13625.m33309(0, i, cArr, 0);
                        c1337 = new C16155(obj, c16155.m38243(), cArr, 0, i, null);
                    }
                    c21093M38247.close();
                    identityHashMap.put(objM38241, c1337);
                } catch (Throwable th) {
                    try {
                        c21093M38247.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } else {
            AbstractC0631[] abstractC0631Arr = ((C1337) abstractC0631).f5650;
            AbstractC0631[] abstractC0631Arr2 = new AbstractC0631[abstractC0631Arr.length];
            for (int i2 = 0; i2 < abstractC0631Arr.length; i2++) {
                abstractC0631Arr2[i2] = m23441(abstractC0631Arr[i2]);
            }
            c1337 = new C1337(obj, abstractC0631Arr2);
        }
        identityHashMap.put(abstractC0631, c1337);
        return c1337;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23446() {
        this.f31022.run();
        int i = this.f31021;
        if (i == this.f31023) {
            throw new C9722("Recovery graph copy object limit exceeded");
        }
        this.f31021 = i + 1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C16072 c16072 = this.f31024;
        if (this.f31025) {
            return;
        }
        this.f31025 = true;
        this.f31018.clear();
        try {
            C16072 c16073 = this.f31019;
            if (c16073 != null) {
                c16073.m38088();
            }
        } finally {
            if (c16072 != null) {
                c16072.m38088();
            }
        }
    }
}
