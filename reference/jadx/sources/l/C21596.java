package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21596 extends AbstractC23156 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 f70059;

    public C21596(AbstractC16579 abstractC16579, C21825 c21825) {
        super(abstractC16579);
        this.f70059 = c21825;
    }

    @Override // l.AbstractC23156
    /* JADX INFO: renamed from: ۙ */
    public final void mo4166(InterfaceC6927 interfaceC6927) {
        ((InterfaceC10308) interfaceC6927).mo26125(this);
    }

    @Override // l.InterfaceC11097
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append((CharSequence) this.f75167.f53222.mo20270());
        sb.append("/*proxy*/{");
        boolean z = true;
        C21825 c21825 = this.f70059;
        while (c21825.m48595()) {
            C2068 c2068 = (C2068) c21825.f70876;
            if (!z) {
                sb.append(",");
            }
            sb.append((CharSequence) c2068.f7664);
            sb.append("=");
            sb.append(c2068.f7665);
            c21825 = c21825.f70877;
            z = false;
        }
        sb.append(l.d);
        return sb.toString();
    }
}
