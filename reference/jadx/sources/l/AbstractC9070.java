package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L62N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9070 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29483 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC9070 f29484;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f29485;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC9070 f29486;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f29487;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29488;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6249(AbstractC15037 abstractC15037);

    public AbstractC9070(int i) {
        this.f29488 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24207(AbstractC15037 abstractC15037) {
        List list = this.f29485;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C4025 c4025 = (C4025) this.f29485.get(i);
                c4025.m7998(abstractC15037.mo10784(c4025.f13732, c4025.f13733, c4025.f7610, true));
            }
        }
        List list2 = this.f29487;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C4025 c4026 = (C4025) this.f29487.get(i2);
                c4026.m7998(abstractC15037.mo10784(c4026.f13732, c4026.f13733, c4026.f7610, false));
            }
        }
    }
}
