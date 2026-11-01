package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10421 extends C21709 {
    public static final C18991 h = C18991.h0(2000, 1, 1);
    public final InterfaceC17579 g;

    @Override // l.C21709
    public final boolean b(C12537 c12537) {
        if (c12537.c) {
            return super.b(c12537);
        }
        return false;
    }

    public C10421(InterfaceC11002 interfaceC11002, int i, int i2, InterfaceC17579 interfaceC17579, int i3) {
        super(interfaceC11002, i, i2, EnumC1247.NOT_NEGATIVE, i3);
        this.g = interfaceC17579;
    }

    @Override // l.C21709
    public final long a(C11126 c11126, long j) {
        long jAbs = Math.abs(j);
        InterfaceC17579 interfaceC17579 = this.g;
        long jL = interfaceC17579 != null ? AbstractC14884.r(c11126.a).E(interfaceC17579).l(this.a) : 0;
        long[] jArr = C21709.f;
        if (j >= jL) {
            long j2 = jArr[this.b];
            if (j < jL + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // l.C21709
    public final int c(final C12537 c12537, final long j, final int i, final int i2) {
        int iL;
        InterfaceC17579 interfaceC17579 = this.g;
        if (interfaceC17579 != null) {
            InterfaceC21233 interfaceC21233 = c12537.c().c;
            if (interfaceC21233 == null && (interfaceC21233 = c12537.a.e) == null) {
                interfaceC21233 = C7122.c;
            }
            iL = interfaceC21233.E(interfaceC17579).l(this.a);
            Consumer consumer = new Consumer() { // from class: l.ۡܽᩴ
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C1455.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    this.a.c(c12537, j, i, i2);
                }
            };
            if (c12537.e == null) {
                c12537.e = new ArrayList();
            }
            c12537.e.add(consumer);
        } else {
            iL = 0;
        }
        int i3 = i2 - i;
        int i4 = this.b;
        if (i3 == i4 && j >= 0) {
            long j2 = C21709.f[i4];
            long j3 = iL;
            long j4 = j3 - (j3 % j2);
            j = iL > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return c12537.f(this.a, j, i, i2);
    }

    @Override // l.C21709
    public final C21709 d() {
        if (this.e == -1) {
            return this;
        }
        return new C10421(this.a, this.b, this.c, this.g, -1);
    }

    @Override // l.C21709
    public final C21709 e(int i) {
        return new C10421(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // l.C21709
    public final String toString() {
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + C13638.requireNonNullElse(this.g, 0) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
