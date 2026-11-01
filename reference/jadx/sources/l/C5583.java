package l;

import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۚ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5583 extends C23223 implements InterfaceC19570 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19570 f19175;

    @Override // l.InterfaceC19570
    public final Object get(Object obj) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f19175 = m51231().m48431(this.f75344);
    }

    @Override // l.InterfaceC11955
    public final Object apply(Object obj) {
        return ((C13345) this.f19175).apply(obj);
    }

    private Object readResolve() {
        return this.f19175;
    }
}
