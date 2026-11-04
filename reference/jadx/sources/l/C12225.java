package l;

import java.io.InputStream;
import net.sf.sevenzipjbinding.NativeXZInputStream;

/* JADX INFO: renamed from: l.ۨ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6I5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12225 implements InterfaceC19795, InterfaceC5417, InterfaceC19189, InterfaceC12718 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39280;

    public /* synthetic */ C12225(int i) {
        this.f39280 = i;
    }

    @Override // l.InterfaceC12718
    /* JADX INFO: renamed from: ۙ */
    public InputStream mo12237(InputStream inputStream) {
        return new NativeXZInputStream(inputStream);
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        switch (this.f39280) {
            case 3:
                return ((InterfaceC9147) obj).mo6411().m11055();
            default:
                long j = ((C16187) obj).f52544;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC19189
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo30502(byte[] bArr) {
        return bArr.length == 14 && "resources.arsc".equals(new String(bArr, C21015.f67180));
    }
}
