package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17781 extends AbstractC16048 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3414 f58365;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17781(InterfaceC13810 interfaceC13810, C3414 c3414) {
        super(interfaceC13810);
        this.f58365 = c3414;
    }

    @Override // l.AbstractC16048, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f58365.close();
        super.close();
    }
}
