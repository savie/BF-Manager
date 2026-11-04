package l;

import java.util.HashSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܶܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1V9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16161 implements InterfaceC5656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4787 f52466;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23621 f52467;

    public C16161(C23621 c23621, InterfaceC4787 interfaceC4787) {
        this.f52467 = c23621;
        this.f52466 = interfaceC4787;
    }

    @Override // l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public final void mo9647(C21383 c21383) {
        InterfaceC4787 interfaceC4787 = this.f52466;
        if (interfaceC4787 == null || interfaceC4787.test(c21383.m13516().replace('/', '.'))) {
            String strM23832 = C8923.m23832(c21383);
            if (strM23832 == null) {
                throw new IllegalStateException();
            }
            String strM52867 = C23621.m52867(strM23832);
            C23621 c23621 = this.f52467;
            if (((HashSet) c23621.f76663).contains(strM52867) || ((TreeSet) c23621.f76661).contains(strM52867)) {
                return;
            }
            if (c23621.f76662.m11447(strM52867)) {
                ((TreeSet) c23621.f76661).add(strM52867);
                return;
            }
            while (!strM52867.isEmpty() && !((HashSet) c23621.f76663).contains(strM52867)) {
                ((HashSet) c23621.f76663).add(strM52867);
                strM52867 = C23621.m52867(strM52867);
            }
        }
    }
}
