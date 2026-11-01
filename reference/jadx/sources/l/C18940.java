package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ᩴᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes5.dex */
public final class C18940 extends C9063 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC16036 f61268;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f61269;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Iterator f61270;

    public C18940(ServiceLoader serviceLoader, C20414 c20414, String str) {
        super(serviceLoader, c20414);
        this.f61269 = new HashMap();
        this.f61270 = null;
        this.f61268 = null;
        this.f61270 = Arrays.asList(str.split(",")).iterator();
    }

    @Override // l.C9063
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23397() {
        Iterator it = this.f30914;
        if (this.f61268 != null) {
            return true;
        }
        Iterator it2 = this.f61270;
        if (!it2.hasNext()) {
            this.f61269 = null;
            return false;
        }
        String str = (String) it2.next();
        InterfaceC16036 interfaceC16036 = (InterfaceC16036) this.f61269.get(str);
        if (interfaceC16036 != null) {
            this.f61269.remove(str);
            this.f61268 = interfaceC16036;
            return true;
        }
        while (it.hasNext()) {
            InterfaceC16036 interfaceC16037 = (InterfaceC16036) it.next();
            String name = interfaceC16037.getClass().getName();
            if (name.equals(str)) {
                this.f61268 = interfaceC16037;
                return true;
            }
            this.f61269.put(name, interfaceC16037);
        }
        C20414 c20414 = this.f30913;
        C5909 c5909 = C23879.f77204;
        c20414.m48197(new C5909("compiler", "proc.processor.not.found", str));
        return false;
    }

    @Override // l.C9063
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC16036 mo23398() {
        if (hasNext()) {
            InterfaceC16036 interfaceC16036 = this.f61268;
            this.f61268 = null;
            return interfaceC16036;
        }
        throw new NoSuchElementException();
    }
}
