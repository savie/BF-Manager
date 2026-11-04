package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H89Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C18201 extends IOException {
    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "UnmarshalException: ".concat(localizedMessage) : "UnmarshalException";
    }
}
