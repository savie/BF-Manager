package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 4A2K */
/* JADX INFO: loaded from: classes3.dex */
public final class C3129 extends C10892 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C1718 f11788;

    @Override // l.C10892, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // l.C10892
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5952 mo9476() {
        return this.f11788.m5719();
    }

    public C3129(C1718 c1718, C17987 c17987) {
        super(c1718.m5716(), c17987);
        this.f11788 = c1718;
    }

    @Override // l.C10892, java.io.InputStream
    public final int available() throws IOException {
        int iM11709;
        C1718 c1718 = this.f11788;
        try {
            C5952 c5952M5719 = c1718.m5719();
            try {
                C17987 c17987M16222 = c5952M5719.m16222();
                try {
                    if (c17987M16222.m41875()) {
                        C21453 c21453 = new C21453(1130508, c17987M16222.m41882(), c5952M5719.m16229());
                        c21453.m48076(16);
                        c21453.m48077();
                        iM11709 = ((C8048) ((C17925) c17987M16222.m41868(c21453, null, EnumC19358.NO_RETRY)).m41620()).m21180();
                    } else {
                        C13297 c13297 = new C13297(c17987M16222.m41882(), c1718.m5723(), c5952M5719.m16223());
                        C4123 c4123 = new C4123(c17987M16222.m41882());
                        c17987M16222.m41868(c13297, c4123, EnumC19358.NO_RETRY);
                        if (c4123.m15238() != 1 && c4123.m15238() != 4) {
                            iM11709 = c4123.m11709();
                        }
                        c5952M5719.m16228();
                        c17987M16222.close();
                        c5952M5719.m16227();
                        return 0;
                    }
                    c17987M16222.close();
                    c5952M5719.m16227();
                    return iM11709;
                } catch (Throwable th) {
                    try {
                        c17987M16222.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c5952M5719.m16227();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C12303 e) {
            throw C10892.m27292(e);
        }
    }
}
