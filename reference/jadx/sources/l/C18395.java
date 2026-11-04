package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܿܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4FN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18395 implements InterfaceC6595 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7954 f59912;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C10653 f59913;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24363 f59914;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f59915;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15302 f59916;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC19887 f59917;

    public C18395(C24363 c24363, C7954 c7954) {
        this.f59914 = c24363;
        this.f59912 = c7954;
        this.f59913 = new C10653(c24363);
        C14665 c14665 = new C14665(this);
        this.f59916 = c14665;
        long j = c24363.f79052;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c14665.mo15814(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18395 m42899(C24363 c24363, C7954 c7954) {
        C18395 c18395 = new C18395(c24363, c7954);
        ((C10936) c24363.f79040).getClass();
        c18395.f59917 = AbstractC19887.f63993;
        return c18395;
    }

    @Override // l.InterfaceC6595
    public final C9444 execute() {
        synchronized (this) {
            if (this.f59915) {
                throw new IllegalStateException("Already Executed");
            }
            this.f59915 = true;
        }
        this.f59913.m27159(C9052.m24178().mo24185());
        this.f59916.m36749();
        this.f59917.getClass();
        try {
            try {
                this.f59914.f79037.m20147(this);
                C9444 c9444M42902 = m42902();
                if (c9444M42902 == null) {
                    throw new IOException("Canceled");
                }
                this.f59914.f79037.m20150(this);
                return c9444M42902;
            } catch (IOException e) {
                IOException iOExceptionM42901 = m42901(e);
                this.f59917.getClass();
                throw iOExceptionM42901;
            }
        } catch (Throwable th) {
            this.f59914.f79037.m20150(this);
            throw th;
        }
        this.f59914.f79037.m20150(this);
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException m42901(IOException iOException) {
        if (!this.f59916.m36748()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(b.n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // l.InterfaceC6595
    /* JADX INFO: renamed from: ۙ */
    public final void mo18519(InterfaceC24495 interfaceC24495) {
        synchronized (this) {
            if (this.f59915) {
                throw new IllegalStateException("Already Executed");
            }
            this.f59915 = true;
        }
        this.f59913.m27159(C9052.m24178().mo24185());
        this.f59917.getClass();
        this.f59914.f79037.m20148(new C21379(this, interfaceC24495));
    }

    @Override // l.InterfaceC6595
    public final void cancel() {
        this.f59913.m27158();
    }

    @Override // l.InterfaceC6595
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo18520() {
        return this.f59913.m27160();
    }

    public final Object clone() {
        return m42899(this.f59914, this.f59912);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9444 m42902() throws IOException {
        ArrayList arrayList = new ArrayList();
        C24363 c24363 = this.f59914;
        arrayList.addAll(c24363.f79045);
        C10653 c10653 = this.f59913;
        arrayList.add(c10653);
        arrayList.add(new C10125(c24363.f79043));
        C3611 c3611 = c24363.f79055;
        arrayList.add(new C13109(c3611 != null ? c3611.f12371 : null));
        arrayList.add(new C24298(c24363));
        arrayList.addAll(c24363.f79057);
        arrayList.add(new C9379());
        AbstractC19887 abstractC19887 = this.f59917;
        int i = c24363.f79053;
        int i2 = c24363.f79039;
        int i3 = c24363.f79051;
        C7954 c7954 = this.f59912;
        C9444 c9444M14554 = new C4688(arrayList, null, null, null, 0, c7954, this, abstractC19887, i, i2, i3).m14554(c7954);
        if (!c10653.m27160()) {
            return c9444M14554;
        }
        C19822.m45601(c9444M14554);
        throw new IOException("Canceled");
    }
}
