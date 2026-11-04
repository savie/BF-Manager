package l;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.۟ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public class C7621 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f25154;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7312 f25155;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ServiceLoader f25156;

    public C7621(ServiceLoader serviceLoader, C7312 c7312) {
        this.f25155 = c7312;
        this.f25156 = serviceLoader;
        this.f25154 = serviceLoader.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C7312 c7312 = this.f25155;
        try {
            return mo20815();
        } catch (UnsupportedClassVersionError e) {
            String localizedMessage = e.getLocalizedMessage();
            C11040 c11040 = C22843.f74058;
            c7312.m34525(new C11040("compiler", "proc.cant.load.class", localizedMessage));
            throw new C20190(e);
        } catch (ClassFormatError e2) {
            String localizedMessage2 = e2.getLocalizedMessage();
            C11040 c11041 = C22843.f74058;
            c7312.m34525(new C11040("compiler", "proc.cant.load.class", localizedMessage2));
            throw new C20190(e2);
        } catch (ServiceConfigurationError e3) {
            c7312.m34525(C22843.m51558(e3.getLocalizedMessage()));
            throw new C20190(e3);
        } catch (Throwable th) {
            c7312.m34525(C22843.m51558(th.getLocalizedMessage()));
            throw new C20190(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo20815() {
        return this.f25154.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C7312 c7312 = this.f25155;
        try {
            return mo20816();
        } catch (ServiceConfigurationError e) {
            c7312.m34525(C22843.m51558(e.getLocalizedMessage()));
            throw new C20190(e);
        } catch (Throwable th) {
            c7312.m34525(C22843.m51558(th.getLocalizedMessage()));
            throw new C20190(th);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC8540 mo20816() {
        return (InterfaceC8540) this.f25154.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
