package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۘۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G4FN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3667 implements InterfaceC11617 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f13416;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15715 f13417;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5079 f13418;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22719 f13419;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16627 f13420;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC0327 f13421;

    public C3667(C5079 c5079, C22719 c22719) {
        this.f13418 = c5079;
        this.f13419 = c22719;
        this.f13417 = new C15715(c5079);
        C0845 c0845 = new C0845(this);
        this.f13420 = c0845;
        long j = c5079.f17695;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0845.mo9654(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3667 m10826(C5079 c5079, C22719 c22719) {
        C3667 c3667 = new C3667(c5079, c22719);
        ((C15851) c5079.f17705).getClass();
        c3667.f13421 = AbstractC0327.f1723;
        return c3667;
    }

    @Override // l.InterfaceC11617
    public final C18485 execute() {
        synchronized (this) {
            if (this.f13416) {
                throw new IllegalStateException("Already Executed");
            }
            this.f13416 = true;
        }
        this.f13417.m37423(C18743.m43294().mo11395());
        this.f13420.m39092();
        this.f13421.getClass();
        try {
            try {
                this.f13418.f17711.m22916(this);
                C18485 c18485M10829 = m10829();
                if (c18485M10829 == null) {
                    throw new IOException("Canceled");
                }
                this.f13418.f17711.m22919(this);
                return c18485M10829;
            } catch (IOException e) {
                IOException iOExceptionM10828 = m10828(e);
                this.f13421.getClass();
                throw iOExceptionM10828;
            }
        } catch (Throwable th) {
            this.f13418.f17711.m22919(this);
            throw th;
        }
        this.f13418.f17711.m22919(this);
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException m10828(IOException iOException) {
        if (!this.f13420.m39094()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(b.n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // l.InterfaceC11617
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10830(InterfaceC2443 interfaceC2443) {
        synchronized (this) {
            if (this.f13416) {
                throw new IllegalStateException("Already Executed");
            }
            this.f13416 = true;
        }
        this.f13417.m37423(C18743.m43294().mo11395());
        this.f13421.getClass();
        this.f13418.f17711.m22917(new C12841(this, interfaceC2443));
    }

    @Override // l.InterfaceC11617
    public final void cancel() {
        this.f13417.m37422();
    }

    @Override // l.InterfaceC11617
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo10827() {
        return this.f13417.m37424();
    }

    public final Object clone() {
        return m10826(this.f13418, this.f13419);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18485 m10829() throws IOException {
        ArrayList arrayList = new ArrayList();
        C5079 c5079 = this.f13418;
        arrayList.addAll(c5079.f17707);
        C15715 c15715 = this.f13417;
        arrayList.add(c15715);
        arrayList.add(new C21358(c5079.f17719));
        C2921 c2921 = c5079.f17716;
        arrayList.add(new C12136(c2921 != null ? c2921.f10982 : null));
        arrayList.add(new C5130(c5079));
        arrayList.addAll(c5079.f17698);
        arrayList.add(new C18536());
        AbstractC0327 abstractC0327 = this.f13421;
        int i = c5079.f17715;
        int i2 = c5079.f17709;
        int i3 = c5079.f17712;
        C22719 c22719 = this.f13419;
        C18485 c18485M19370 = new C7247(arrayList, null, null, null, 0, c22719, this, abstractC0327, i, i2, i3).m19370(c22719);
        if (!c15715.m37424()) {
            return c18485M19370;
        }
        C0140.m1231(c18485M19370);
        throw new IOException("Canceled");
    }
}
