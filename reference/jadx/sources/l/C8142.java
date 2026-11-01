package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A2RB */
/* JADX INFO: loaded from: classes3.dex */
public class C8142 extends IOException {
    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C8142(int i) {
        super(C16737.m39288(i));
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String name = IOException.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C1679.m5594(name, ": ", localizedMessage) : name;
    }
}
