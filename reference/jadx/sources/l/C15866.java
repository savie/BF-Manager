package l;

import java.net.URL;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8H6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15866 implements InterfaceC12687, InterfaceC12227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51596;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map m37836(URL url, AbstractMap abstractMap) {
        return ((C11543) this.f51596).m29050(url, abstractMap);
    }

    @Override // l.InterfaceC12227
    /* JADX INFO: renamed from: ۙ */
    public int mo2073(long j, byte[] bArr, int i, int i2) {
        C13961 c13961 = (C13961) this.f51596;
        c13961.seek(j);
        return c13961.read(bArr, i, i2);
    }
}
