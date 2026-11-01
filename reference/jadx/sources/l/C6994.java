package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۜ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public class C6994 implements InterfaceC1224, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC21937 f23536;

    public /* synthetic */ C6994(ConcurrentMapC21937 concurrentMapC21937, int i) {
        this(concurrentMapC21937);
    }

    public C6994(C21686 c21686) {
        this(new ConcurrentMapC21937(c21686, null));
    }

    public C6994(ConcurrentMapC21937 concurrentMapC21937) {
        this.f23536 = concurrentMapC21937;
    }

    @Override // l.InterfaceC1224
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4422(Integer num, CallableC10657 callableC10657) {
        return this.f23536.m48755(num, new C4171(callableC10657));
    }

    @Override // l.InterfaceC1224
    /* JADX INFO: renamed from: ۨ */
    public final void mo4423() {
        this.f23536.clear();
    }

    @Override // l.InterfaceC1224
    /* JADX INFO: renamed from: ܰ */
    public final void mo4424() {
        for (C18283 c18283 : this.f23536.f71147) {
            c18283.m42494(c18283.f58343.f71151.mo8123());
            c18283.m42489();
        }
    }

    public Object writeReplace() {
        return new C23223(this.f23536);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }
}
