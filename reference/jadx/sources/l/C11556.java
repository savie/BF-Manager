package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ۧۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11556 extends C16777 implements InterfaceC6666 {
    public static final long serialVersionUID = 1;

    @Override // l.InterfaceC6666
    public final Object get(Object obj) {
        ConcurrentMapC5942 concurrentMapC5942 = this.f54149;
        return concurrentMapC5942.m17294(obj, concurrentMapC5942.f20354);
    }

    @Override // l.InterfaceC5417
    public final Object apply(Object obj) {
        try {
            return get(obj);
        } catch (ExecutionException e) {
            throw new C8025(e.getCause());
        }
    }

    @Override // l.C16777
    public Object writeReplace() {
        return new C13048(this.f54149);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }
}
