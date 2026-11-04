package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public class C16777 implements InterfaceC2191, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC5942 f54149;

    public /* synthetic */ C16777(ConcurrentMapC5942 concurrentMapC5942, int i) {
        this(concurrentMapC5942);
    }

    public C16777(C23820 c23820) {
        this(new ConcurrentMapC5942(c23820, null));
    }

    public C16777(ConcurrentMapC5942 concurrentMapC5942) {
        this.f54149 = concurrentMapC5942;
    }

    @Override // l.InterfaceC2191
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7496(Integer num, CallableC18793 callableC18793) {
        return this.f54149.m17294(num, new C24983(callableC18793));
    }

    @Override // l.InterfaceC2191
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7498() {
        this.f54149.clear();
    }

    @Override // l.InterfaceC2191
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7497() {
        for (C3353 c3353 : this.f54149.f20356) {
            c3353.m11025(c3353.f10940.f20353.mo37347());
            c3353.m11022();
        }
    }

    public Object writeReplace() {
        return new C17523(this.f54149);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }
}
