package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes.dex */
public final class C23379 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f75732;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17565 f75733;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f75734;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f75735;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f75736;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f75737;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f75738;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75739;

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23379 m51502(C3329 c3329, C6222 c6222, String str, boolean z, int i, boolean z2, Runnable runnable, Supplier supplier) {
        boolean z3;
        CharSequence charSequence;
        CharSequence charSequence2;
        C23379 c23379 = new C23379();
        c23379.f75734 = new ArrayList();
        try {
            C17028 c17028 = new C17028(c23379, c3329, runnable, supplier);
            if (z) {
                try {
                    if (str.indexOf(36) >= 0 || str.indexOf(92) >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } catch (Throwable th) {
                    try {
                        c17028.close();
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
                ArrayDeque<C5739> arrayDeque = new ArrayDeque();
                while (C5780.m15915(c6222)) {
                    runnable.run();
                    C5739 c5739 = arrayDeque.size() == i ? (C5739) arrayDeque.removeFirst() : new C5739(c3329, c6222.pattern(), runnable);
                    c5739.m15790(c6222, z3);
                    arrayDeque.addLast(c5739);
                }
                for (C5739 c57310 : arrayDeque) {
                    runnable.run();
                    int iStart = c57310.start(0);
                    int iEnd = c57310.end(0);
                    if (sb == null) {
                        charSequence2 = str;
                    } else {
                        sb.setLength(0);
                        C9751.m24731(c57310, sb, str);
                        charSequence2 = sb;
                    }
                    c17028.m39801(iStart, iEnd, charSequence2);
                }
            } else {
                C5739 c57311 = z3 ? new C5739(c3329, c6222.pattern(), runnable) : null;
                while (C5780.m15915(c6222)) {
                    runnable.run();
                    if (c57311 != null) {
                        c57311.m15790(c6222, true);
                    }
                    int iStart2 = c6222.start();
                    int iEnd2 = c6222.end();
                    if (sb == null) {
                        charSequence = str;
                    } else {
                        sb.setLength(0);
                        C9751.m24731(c57311, sb, str);
                        charSequence = sb;
                    }
                    c17028.m39801(iStart2, iEnd2, charSequence);
                    if (i > 0 && c23379.f75739 == i) {
                        break;
                    }
                }
            }
            c17028.finish();
            runnable.run();
            c17028.close();
            return c23379;
        } catch (Error | RuntimeException | C22356 e) {
            c23379.close();
            throw e;
        }
    }

    public final int count() {
        return this.f75739;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51514(final C6111 c6111, final InterfaceC2916 interfaceC2916, final boolean z) {
        if (this.f75736) {
            throw new IllegalStateException("Replacement plan is consumed");
        }
        this.f75736 = true;
        if (this.f75739 == 0) {
            return;
        }
        if (c6111.m17000() != interfaceC2916) {
            throw new IllegalStateException("Replacement owner changed");
        }
        boolean[] zArr = {false};
        final RunnableC14456 runnableC14456 = new RunnableC14456(1, zArr, c6111);
        try {
            if (!interfaceC2916.mo8724(new Runnable() { // from class: l.ܽ֫ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    C23379.m51506(this.f52563, interfaceC2916, runnableC14456, c6111, z);
                }
            })) {
                throw new IllegalStateException("Replacement owner is unavailable");
            }
            if (zArr[0] && c6111.m17000() == interfaceC2916 && c6111.f20787) {
                c6111.m16833();
            }
            c6111.requestFocus();
            c6111.m16992(false);
        } catch (Throwable th) {
            if (zArr[0] && c6111.m17000() == interfaceC2916 && c6111.f20787) {
                c6111.m16833();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51506(C23379 c23379, InterfaceC2916 interfaceC2916, RunnableC14456 runnableC14456, C6111 c6111, boolean z) {
        int i;
        C16031 c12090 = c23379.f75738 ? null : new C12090(interfaceC2916, runnableC14456);
        int i2 = -1;
        for (int size = c23379.f75734.size() - 1; size >= 0; size--) {
            if (c6111.m17000() != interfaceC2916) {
                throw new IllegalStateException("Replacement owner changed");
            }
            C10679 c10679 = (C10679) c23379.f75734.get(size);
            if (c12090 != null) {
                if (i2 >= 0 && i2 - c10679.f36437 > 256) {
                    c12090.m38023();
                }
                int i3 = c10679.f36436;
                int i4 = c10679.f36437;
                String str = c10679.f36438;
                int length = str.length();
                c12090.delete(i3, i4);
                c12090.m38022(i3, 0, length, str);
            } else {
                runnableC14456.run();
                C17565 c17565 = c23379.f75733;
                if (c17565 == null) {
                    interfaceC2916.replace(c10679.f36436, c10679.f36437, c10679.f36438);
                } else {
                    int i5 = c10679.f36436;
                    int i6 = c10679.f36437;
                    int i7 = c10679.f36439;
                    interfaceC2916.replace(i5, i6, c17565, i7, c10679.f36440 + i7);
                }
            }
            i2 = c10679.f36436;
        }
        if (c12090 != null) {
            c12090.m38023();
        }
        if (c6111.m17000() != interfaceC2916) {
            throw new IllegalStateException("Replacement owner changed");
        }
        if (z) {
            i = c23379.f75737;
        } else {
            long j = ((long) c23379.f75735) + c23379.f75732;
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        }
        c6111.mo17029(i);
        c6111.m16827(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f75736 = true;
        this.f75734.clear();
        C17565 c17565 = this.f75733;
        if (c17565 != null) {
            c17565.close();
            this.f75733 = null;
        }
    }
}
