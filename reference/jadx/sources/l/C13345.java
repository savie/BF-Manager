package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.۬᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13345 extends C6994 implements InterfaceC19570 {
    public static final long serialVersionUID = 1;

    @Override // l.InterfaceC19570
    public final Object get(Object obj) {
        ConcurrentMapC21937 concurrentMapC21937 = this.f23536;
        return concurrentMapC21937.m48755(obj, concurrentMapC21937.f71163);
    }

    @Override // l.InterfaceC11955
    public final Object apply(Object obj) {
        try {
            return get(obj);
        } catch (ExecutionException e) {
            throw new C23618(e.getCause());
        }
    }

    @Override // l.C6994
    public Object writeReplace() {
        return new C5583(this.f23536);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }
}
