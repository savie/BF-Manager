package l;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ۡᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public class C9063 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20414 f30913;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f30914;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ServiceLoader f30915;

    public C9063(ServiceLoader serviceLoader, C20414 c20414) {
        this.f30913 = c20414;
        this.f30915 = serviceLoader;
        this.f30914 = serviceLoader.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C20414 c20414 = this.f30913;
        try {
            return mo23397();
        } catch (UnsupportedClassVersionError e) {
            String localizedMessage = e.getLocalizedMessage();
            C5909 c5909 = C23879.f77204;
            c20414.m48197(new C5909("compiler", "proc.cant.load.class", localizedMessage));
            throw new C13048(e);
        } catch (ClassFormatError e2) {
            String localizedMessage2 = e2.getLocalizedMessage();
            C5909 c59010 = C23879.f77204;
            c20414.m48197(new C5909("compiler", "proc.cant.load.class", localizedMessage2));
            throw new C13048(e2);
        } catch (ServiceConfigurationError e3) {
            c20414.m48197(C23879.m52626(e3.getLocalizedMessage()));
            throw new C13048(e3);
        } catch (Throwable th) {
            c20414.m48197(C23879.m52626(th.getLocalizedMessage()));
            throw new C13048(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo23397() {
        return this.f30914.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C20414 c20414 = this.f30913;
        try {
            return mo23398();
        } catch (ServiceConfigurationError e) {
            c20414.m48197(C23879.m52626(e.getLocalizedMessage()));
            throw new C13048(e);
        } catch (Throwable th) {
            c20414.m48197(C23879.m52626(th.getLocalizedMessage()));
            throw new C13048(th);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC16036 mo23398() {
        return (InterfaceC16036) this.f30914.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
