package l;

import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.۫ۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13048 extends C17523 implements InterfaceC6666 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC6666 f41763;

    @Override // l.InterfaceC6666
    public final Object get(Object obj) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f41763 = m41141().m53147(this.f56963);
    }

    @Override // l.InterfaceC5417
    public final Object apply(Object obj) {
        return ((C11556) this.f41763).apply(obj);
    }

    private Object readResolve() {
        return this.f41763;
    }
}
