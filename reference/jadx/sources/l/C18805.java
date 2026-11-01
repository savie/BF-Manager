package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18805 extends AbstractRunnableC20602 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20217 f60948;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18805(C20217 c20217) {
        super("OkHttp %s ping", c20217.f65613);
        this.f60948 = c20217;
    }

    @Override // l.AbstractRunnableC20602
    /* JADX INFO: renamed from: ۙ */
    public final void mo4299() {
        boolean z;
        synchronized (this.f60948) {
            if (this.f60948.f65618 < this.f60948.f65625) {
                z = true;
            } else {
                C20217.m45681(this.f60948);
                z = false;
            }
        }
        if (z) {
            C20217 c20217 = this.f60948;
            try {
                EnumC9365 enumC9365 = EnumC9365.PROTOCOL_ERROR;
                c20217.m45701(enumC9365, enumC9365);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        this.f60948.m45693(1, 0, false);
    }
}
