package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: KAYQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18403 extends AbstractC7820 implements Serializable {
    private final Object writeReplace() {
        return C17697.f56193;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // l.AbstractC7820
    /* JADX INFO: renamed from: ۙ */
    public final int mo20623() {
        return AbstractC7820.f25742.mo20623();
    }

    @Override // l.AbstractC7820
    /* JADX INFO: renamed from: ܰ */
    public final int mo20624() {
        return AbstractC7820.f25742.mo20624();
    }
}
