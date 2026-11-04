package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.᩶ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes5.dex */
public final class C21046 extends C7621 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashMap f67258;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC8540 f67259;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Iterator f67260;

    public C21046(ServiceLoader serviceLoader, C7312 c7312, String str) {
        super(serviceLoader, c7312);
        this.f67258 = new HashMap();
        this.f67260 = null;
        this.f67259 = null;
        this.f67260 = Arrays.asList(str.split(",")).iterator();
    }

    @Override // l.C7621
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20815() {
        Iterator it = this.f25154;
        if (this.f67259 != null) {
            return true;
        }
        Iterator it2 = this.f67260;
        if (!it2.hasNext()) {
            this.f67258 = null;
            return false;
        }
        String str = (String) it2.next();
        InterfaceC8540 interfaceC8540 = (InterfaceC8540) this.f67258.get(str);
        if (interfaceC8540 != null) {
            this.f67258.remove(str);
            this.f67259 = interfaceC8540;
            return true;
        }
        while (it.hasNext()) {
            InterfaceC8540 interfaceC8541 = (InterfaceC8540) it.next();
            String name = interfaceC8541.getClass().getName();
            if (name.equals(str)) {
                this.f67259 = interfaceC8541;
                return true;
            }
            this.f67258.put(name, interfaceC8541);
        }
        C7312 c7312 = this.f25155;
        C11040 c11040 = C22843.f74058;
        c7312.m34525(new C11040("compiler", "proc.processor.not.found", str));
        return false;
    }

    @Override // l.C7621
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC8540 mo20816() {
        if (hasNext()) {
            InterfaceC8540 interfaceC8540 = this.f67259;
            this.f67259 = null;
            return interfaceC8540;
        }
        throw new NoSuchElementException();
    }
}
