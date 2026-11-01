package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19752 extends AbstractC12103 implements InterfaceC18576 {
    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    @Override // l.AbstractC17974
    public final InterfaceC20693 a(InterfaceC20693 interfaceC20693, long j, long j2, long j3, long j4) {
        return new C19752((InterfaceC18576) interfaceC20693, j, j2, j3, j4);
    }

    @Override // l.AbstractC12103
    public final Object b() {
        return new C14220(1);
    }
}
