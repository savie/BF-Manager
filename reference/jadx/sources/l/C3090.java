package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A2RB */
/* JADX INFO: loaded from: classes2.dex */
public class C3090 extends IOException {
    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C3090(int i) {
        super(C21576.m49088(i));
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String name = IOException.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C20196.m46451(name, ": ", localizedMessage) : name;
    }
}
