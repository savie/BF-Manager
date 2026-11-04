package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18360 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f59839;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f59840;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f59841;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8796 f59842;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f59843;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f59844;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f59845;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59846;

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18360 m42816(C15508 c15508, C4245 c4245, String str, boolean z, int i, boolean z2, Runnable runnable, Supplier supplier) {
        boolean z3;
        CharSequence charSequence;
        CharSequence charSequence2;
        C18360 c18360 = new C18360();
        c18360.f59840 = new ArrayList();
        try {
            C4190 c4190 = new C4190(c18360, c15508, runnable, supplier);
            if (z) {
                try {
                    if (str.indexOf(36) >= 0 || str.indexOf(92) >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } catch (Throwable th) {
                    try {
                        c4190.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                z3 = false;
            }
            StringBuilder sb = z3 ? new StringBuilder() : null;
            if (z2 && i > 0) {
                ArrayDeque<C14630> arrayDeque = new ArrayDeque();
                while (C12632.m31399(c4245)) {
                    runnable.run();
                    C14630 c14630 = arrayDeque.size() == i ? (C14630) arrayDeque.removeFirst() : new C14630(c15508, c4245.pattern(), runnable);
                    c14630.m35268(c4245, z3);
                    arrayDeque.addLast(c14630);
                }
                for (C14630 c14631 : arrayDeque) {
                    runnable.run();
                    int iStart = c14631.start(0);
                    int iEnd = c14631.end(0);
                    if (sb == null) {
                        charSequence2 = str;
                    } else {
                        sb.setLength(0);
                        C7974.m21760(c14631, sb, str);
                        charSequence2 = sb;
                    }
                    c4190.m13372(iStart, iEnd, charSequence2);
                }
            } else {
                C14630 c14632 = z3 ? new C14630(c15508, c4245.pattern(), runnable) : null;
                while (C12632.m31399(c4245)) {
                    runnable.run();
                    if (c14632 != null) {
                        c14632.m35268(c4245, true);
                    }
                    int iStart2 = c4245.start();
                    int iEnd2 = c4245.end();
                    if (sb == null) {
                        charSequence = str;
                    } else {
                        sb.setLength(0);
                        C7974.m21760(c14632, sb, str);
                        charSequence = sb;
                    }
                    c4190.m13372(iStart2, iEnd2, charSequence);
                    if (i > 0 && c18360.f59846 == i) {
                        break;
                    }
                }
            }
            c4190.finish();
            runnable.run();
            c4190.close();
            return c18360;
        } catch (Error | RuntimeException | C13464 e) {
            c18360.close();
            throw e;
        }
    }

    public final int count() {
        return this.f59846;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42829(final C24132 c24132, final InterfaceC19106 interfaceC19106, final boolean z) {
        if (this.f59843) {
            throw new IllegalStateException("Replacement plan is consumed");
        }
        this.f59843 = true;
        if (this.f59846 == 0) {
            return;
        }
        if (c24132.m54021() != interfaceC19106) {
            throw new IllegalStateException("Replacement owner changed");
        }
        boolean[] zArr = {false};
        final RunnableC9530 runnableC9530 = new RunnableC9530(2, zArr, c24132);
        try {
            if (!interfaceC19106.mo11040(new Runnable() { // from class: l.ۛ۬᩸
                @Override // java.lang.Runnable
                public final void run() {
                    C18360.m42821(this.f21648, interfaceC19106, runnableC9530, c24132, z);
                }
            })) {
                throw new IllegalStateException("Replacement owner is unavailable");
            }
            if (zArr[0] && c24132.m54021() == interfaceC19106 && c24132.f78013) {
                c24132.m53987();
            }
            c24132.requestFocus();
            c24132.m54077(false);
        } catch (Throwable th) {
            if (zArr[0] && c24132.m54021() == interfaceC19106 && c24132.f78013) {
                c24132.m53987();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42821(C18360 c18360, InterfaceC19106 interfaceC19106, RunnableC9530 runnableC9530, C24132 c24132, boolean z) {
        int i;
        C10375 c24328 = c18360.f59845 ? null : new C24328(interfaceC19106, runnableC9530);
        int i2 = -1;
        for (int size = c18360.f59840.size() - 1; size >= 0; size--) {
            if (c24132.m54021() != interfaceC19106) {
                throw new IllegalStateException("Replacement owner changed");
            }
            C21344 c21344 = (C21344) c18360.f59840.get(size);
            if (c24328 != null) {
                if (i2 >= 0 && i2 - c21344.f67994 > 256) {
                    c24328.m26683();
                }
                int i3 = c21344.f67998;
                int i4 = c21344.f67994;
                String str = c21344.f67996;
                int length = str.length();
                c24328.delete(i3, i4);
                c24328.m26682(i3, 0, length, str);
            } else {
                runnableC9530.run();
                C8796 c8796 = c18360.f59842;
                if (c8796 == null) {
                    interfaceC19106.replace(c21344.f67998, c21344.f67994, c21344.f67996);
                } else {
                    int i5 = c21344.f67998;
                    int i6 = c21344.f67994;
                    int i7 = c21344.f67995;
                    interfaceC19106.replace(i5, i6, c8796, i7, c21344.f67997 + i7);
                }
            }
            i2 = c21344.f67998;
        }
        if (c24328 != null) {
            c24328.m26683();
        }
        if (c24132.m54021() != interfaceC19106) {
            throw new IllegalStateException("Replacement owner changed");
        }
        if (z) {
            i = c18360.f59839;
        } else {
            long j = ((long) c18360.f59841) + c18360.f59844;
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        }
        c24132.mo52339(i);
        c24132.m54091(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f59843 = true;
        this.f59840.clear();
        C8796 c8796 = this.f59842;
        if (c8796 != null) {
            c8796.close();
            this.f59842 = null;
        }
    }
}
