package l;

import java.io.Closeable;
import java.io.IOException;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.᩶ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9DJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19946 implements Closeable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f63890 = C13488.m32997(C19946.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC13783 f63891;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5335 f63892;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8864 f63893;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16418 f63894;

    public C19946(C16418 c16418) {
        C5335 c5335 = new C5335();
        this.f63891 = new ConcurrentMapC13783();
        this.f63893 = new C8864();
        this.f63894 = c16418;
        this.f63892 = c5335;
        c5335.m14812(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1163 m45242(String str) {
        return m45241(445, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1163 m45243(int i, String str) {
        return m45241(i, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C1163 m45241(int i, String str) {
        synchronized (this) {
            String str2 = str + ":" + i;
            C1163 c1163 = (C1163) this.f63891.get(str2);
            if (c1163 != null) {
                c1163 = (C1163) c1163.m24010();
            }
            if (c1163 != null && c1163.m4289()) {
                return c1163;
            }
            C1163 c1164 = new C1163(this.f63894, this, this.f63892, this.f63893);
            try {
                c1164.m4291(i, str);
                this.f63891.put(str2, c1164);
                return c1164;
            } catch (IOException e) {
                AutoCloseable[] autoCloseableArr = {c1164};
                int i2 = C16566.f53198;
                AutoCloseable autoCloseable = autoCloseableArr[0];
                if (autoCloseable != null) {
                    try {
                        C9023.m23359(autoCloseable);
                    } catch (Exception unused) {
                    }
                }
                throw e;
            }
        }
    }

    public C19946() {
        this(C16418.m38649().m1398());
    }

    @Handler
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45240(C13803 c13803) {
        synchronized (this) {
            String str = c13803.m33551() + ":" + c13803.m33552();
            this.f63891.remove(str);
            this.f63893.m23005(c13803.m33551());
            f63890.mo12126(str, "Connection to << {} >> closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC4314 interfaceC4314 = f63890;
        interfaceC4314.mo12130("Going to close all remaining connections");
        for (C1163 c1163 : this.f63891.values()) {
            try {
                c1163.m4288(true);
            } catch (Exception e) {
                interfaceC4314.mo12126(c1163.m4292(), "Error closing connection to host {}");
                interfaceC4314.mo12120("Exception was: ", e);
            }
        }
    }
}
