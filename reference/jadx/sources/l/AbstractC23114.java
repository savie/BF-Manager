package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩺ܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L62N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23114 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f75073;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75074 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC23114 f75075;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC23114 f75076;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f75077;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f75078;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2544(AbstractC20521 abstractC20521);

    public AbstractC23114(int i) {
        this.f75073 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51119(AbstractC20521 abstractC20521) {
        List list = this.f75078;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C13817 c13817 = (C13817) this.f75078.get(i);
                c13817.m36800(abstractC20521.mo33778(c13817.f45603, c13817.f45602, c13817.f50028, true));
            }
        }
        List list2 = this.f75077;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C13817 c13818 = (C13817) this.f75077.get(i2);
                c13818.m36800(abstractC20521.mo33778(c13818.f45603, c13818.f45602, c13818.f50028, false));
            }
        }
    }
}
