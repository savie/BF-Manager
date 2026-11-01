package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8V1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21428 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f69681 = new ArrayList(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12257 f69682;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f69683;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f69684;

    public AbstractC21428(boolean z) {
        this.f69684 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48019(C12257 c12257) {
        for (int i = 0; i < this.f69683; i++) {
            ((InterfaceC19706) this.f69681.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48018(C12257 c12257) {
        this.f69682 = c12257;
        for (int i = 0; i < this.f69683; i++) {
            ((InterfaceC19706) this.f69681.get(i)).mo34559(c12257, this.f69684);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m48017(int i) {
        C12257 c12257 = this.f69682;
        String str = C17983.f57504;
        for (int i2 = 0; i2 < this.f69683; i2++) {
            ((InterfaceC19706) this.f69681.get(i2)).mo34557(c12257, this.f69684, i);
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public Map mo9273() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m48020() {
        C12257 c12257 = this.f69682;
        String str = C17983.f57504;
        for (int i = 0; i < this.f69683; i++) {
            ((InterfaceC19706) this.f69681.get(i)).mo34556(c12257, this.f69684);
        }
        this.f69682 = null;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        interfaceC19706.getClass();
        ArrayList arrayList = this.f69681;
        if (arrayList.contains(interfaceC19706)) {
            return;
        }
        arrayList.add(interfaceC19706);
        this.f69683++;
    }
}
