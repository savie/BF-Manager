package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22864 extends C8824 {
    public static final C7816 h = C7816.of(2000, 1, 1);
    public final InterfaceC17116 g;

    @Override // l.C8824
    public final boolean b(C25102 c25102) {
        if (c25102.c) {
            return super.b(c25102);
        }
        return false;
    }

    public C22864(InterfaceC16831 interfaceC16831, int i, int i2, InterfaceC17116 interfaceC17116, int i3) {
        super(interfaceC16831, i, i2, EnumC8079.NOT_NEGATIVE, i3);
        this.g = interfaceC17116;
    }

    @Override // l.C8824
    public final long a(C16150 c16150, long j) {
        long jAbs = Math.abs(j);
        InterfaceC17116 interfaceC17116 = this.g;
        long jI = interfaceC17116 != null ? AbstractC2946.r(c16150.a).B(interfaceC17116).i(this.a) : 0;
        long[] jArr = C8824.f;
        if (j >= jI) {
            long j2 = jArr[this.b];
            if (j < jI + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // l.C8824
    public final int c(final C25102 c25102, final long j, final int i, final int i2) {
        int i3;
        InterfaceC17116 interfaceC17116 = this.g;
        if (interfaceC17116 != null) {
            InterfaceC8912 interfaceC8912 = c25102.c().c;
            if (interfaceC8912 == null && (interfaceC8912 = c25102.a.e) == null) {
                interfaceC8912 = C20012.c;
            }
            i3 = interfaceC8912.B(interfaceC17116).i(this.a);
            Consumer consumer = new Consumer() { // from class: l.ۤܳۗ
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C12312.$default$andThen(this, consumer2);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    this.a.c(c25102, j, i, i2);
                }
            };
            if (c25102.e == null) {
                c25102.e = new ArrayList();
            }
            c25102.e.add(consumer);
        } else {
            i3 = 0;
        }
        int i4 = i2 - i;
        int i5 = this.b;
        if (i4 == i5 && j >= 0) {
            long j2 = C8824.f[i5];
            long j3 = i3;
            long j4 = j3 - (j3 % j2);
            j = i3 > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return c25102.f(this.a, j, i, i2);
    }

    @Override // l.C8824
    public final C8824 d() {
        if (this.e == -1) {
            return this;
        }
        return new C22864(this.a, this.b, this.c, this.g, -1);
    }

    @Override // l.C8824
    public final C8824 e(int i) {
        return new C22864(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // l.C8824
    public final String toString() {
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + C17359.requireNonNullElse(this.g, 0) + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
